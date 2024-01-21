import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!rb;")
	public static Class55 aClass55_27;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!oc;")
	public static Class34 aClass34_50;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "Lclient!je;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
	public static int anInt1835;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1014 = Static15.method178("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1008 = aClass23_1014;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1012 = Static15.method178("scroll:");

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1009 = aClass23_1012;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1010 = Static15.method178(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1011 = Static15.method178("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public static int anInt1829 = 0;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!rc;")
	public static Class1_Sub5 aClass1_Sub5_10 = new Class1_Sub5(new byte[5000]);

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1016 = Static15.method178("Welcome to RuneScape");

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1013 = aClass23_1016;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1015 = Static15.method178(" )2> ");

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "[I")
	public static int[] anIntArray211 = new int[2000];

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
	public static int anInt1836 = -1;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 method1137() {
		@Pc(7) Class1_Sub1_Sub6_Sub3 local7 = new Class1_Sub1_Sub6_Sub3();
		local7.anInt1880 = Static79.anInt2132;
		local7.anInt1882 = Static13.anInt236;
		local7.anInt1879 = Static102.anIntArray355[0];
		local7.anInt1881 = Static100.anIntArray348[0];
		local7.anInt1878 = Static113.anIntArray410[0];
		local7.anInt1883 = Static26.anIntArray119[0];
		local7.anIntArray218 = Static80.anIntArray268;
		local7.aByteArray11 = Static105.aByteArrayArray7[0];
		Static90.method1538();
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lclient!re;")
	public static Class1_Sub1_Sub12 method1139(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub12 local10 = (Class1_Sub1_Sub12) Static20.aClass5_19.method98((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static114.aClass55_Sub1_19.method1867(0, arg0);
		if (local20 == null) {
			return null;
		}
		local10 = new Class1_Sub1_Sub12();
		@Pc(30) int local30 = 0;
		@Pc(40) Class1_Sub5 local40 = new Class1_Sub5(local20);
		local40.anInt1266 = local40.aByteArray6.length - 12;
		@Pc(51) int local51 = local40.method692();
		local10.anInt2418 = local40.method715();
		local10.anInt2424 = local40.method715();
		local10.anInt2426 = local40.method715();
		local10.anInt2421 = local40.method715();
		local10.aClass23Array16 = new Class23[local51];
		local10.anIntArray326 = new int[local51];
		local40.anInt1266 = 0;
		local10.anIntArray324 = new int[local51];
		while (local40.aByteArray6.length - 12 > local40.anInt1266) {
			@Pc(91) int local91 = local40.method715();
			if (local91 == 3) {
				local10.aClass23Array16[local30] = local40.method683();
			} else if (local91 >= 100 || local91 == 21 || local91 == 38 || local91 == 39) {
				local10.anIntArray324[local30] = local40.method716();
			} else {
				local10.anIntArray324[local30] = local40.method692();
			}
			local10.anIntArray326[local30++] = local91;
		}
		Static20.aClass5_19.method97(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fa;II)V")
	public static void method1141(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static67.method1266(arg0.anInt2196, arg1, arg0.anInt2232);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method1142() {
		aClass23_1010 = null;
		aClass22_3 = null;
		aClass34_50 = null;
		aClass23_1015 = null;
		aClass23_1016 = null;
		aClass23_1011 = null;
		aClass23_1014 = null;
		anIntArray211 = null;
		aClass55_27 = null;
		aClass23_1009 = null;
		aClass23_1013 = null;
		aClass23_1008 = null;
		aClass23_1012 = null;
		aClass1_Sub5_10 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!rb;ILclient!gd;Lclient!gd;)Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 method1143(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(3) Class23 arg2) {
		@Pc(4) int local4 = arg0.method1885(arg2);
		@Pc(18) int local18 = arg0.method1876(local4, arg1);
		return Static63.method1225(local18, local4, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZB)V")
	public static void method1145(@OriginalArg(0) boolean arg0) {
		Static33.anInt1047++;
		if (Static33.anInt1047 < 50 && !arg0) {
			return;
		}
		Static33.anInt1047 = 0;
		if (Static55.aBoolean87 || Static94.aClass68_4 == null) {
			return;
		}
		Static76.aClass1_Sub5_Sub1_2.method731(215);
		try {
			Static94.aClass68_4.method1942(Static76.aClass1_Sub5_Sub1_2.aByteArray6, Static76.aClass1_Sub5_Sub1_2.anInt1266);
			Static76.aClass1_Sub5_Sub1_2.anInt1266 = 0;
		} catch (@Pc(46) IOException local46) {
			Static55.aBoolean87 = true;
		}
	}
}
