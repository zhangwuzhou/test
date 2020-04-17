package com.zhang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello");

        ArrayList list2 = new ArrayList();

        list2.add("1");
        list2.add(1,234);

        Date date = new Date();

        ArrayList list1 = new ArrayList();

        //快捷键：sout
        System.out.println(list2);
        //快捷键：soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //快捷键：soutm
        System.out.println("HelloWorld.main");
        //快捷键：soutv
        System.out.println("list1 = " + list1);
        //快捷键：xxx.sout
        System.out.println(list1);

        //遍历：fori
        String[] arr = {"zhangsan", "lisi", "wangwu"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：增强for循环（iter）
        for (String s : arr) {
            System.out.println(s);
        }
        //itor
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        //增加for循环 list.for
        for (Object o : list) {

        }
        //普通for循环 list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //普通for循环，list.forr，逆序的遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method(){
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
