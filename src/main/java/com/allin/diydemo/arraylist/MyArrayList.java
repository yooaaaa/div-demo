package com.allin.diydemo.arraylist;

import java.util.ArrayList;

/**
 * arraylist的底层实现
 * @author yangxuelian
 * @Date ${date} ${time}
 */
public class MyArrayList {
    ArrayList  array=new ArrayList() ;
  // 非私有，以简化嵌套类的访问
    // transient  在已经实现序列化的类中，不允许某变量序列化
    transient Object[] elementData;
    // 默认容量
    private static final  int   DEFAULT_CAPACITY=10 ;
    /**
     * Shared empty array instance used for default sized empty instances. We
     * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
     * first element is added.
     */
    private  static  Object[]  DEFAULTCAPACITY_EMPTY_ELEMENTDATA={} ;
    // 实际ArrayList的集合大小
    private  int  size ;
    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};
    /**
     * 构造方法
     * @param initialCapacity
     */
    public  MyArrayList(int  initialCapacity) throws IllegalAccessException {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalAccessException("Illeal Capacity:" +
                    EMPTY_ELEMENTDATA);
        }
    }

    /**
     * 构造方法没得返回值，，void都不行
     * @throws IllegalAccessException
     */
 public      MyArrayList() throws  IllegalAccessException{
         this(DEFAULT_CAPACITY)  ;

 }
  public  void add(Object o){
     ensureExplicitCapacity(size+1) ;
     elementData[size++]=o;
  }

    /**
     * 扩容机制
     * @param i
     */
    private void ensureExplicitCapacity(int i) {
        if(size==elementData.length){
            int  oldCapacity=elementData.length ;
            //扩容1.5倍
            int  newCapacity=oldCapacity+(oldCapacity>>1) ;
            if(newCapacity-minCapati)
        }
    }
}
