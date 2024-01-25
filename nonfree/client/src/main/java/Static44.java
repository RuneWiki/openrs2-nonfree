import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_16 = new Class349(73, 0);

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public static int anInt591 = 0;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
	public static final int[] anIntArray55 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_17 = new Class349(60, -1);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!et;I)Lclient!tf;")
	public static Class15 method588(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method8581(-17416);
		@Pc(11) Class118 local11 = Static172.method2597(local7);
		@Pc(13) Class15 local13 = null;
		if (local11 == Static624.aClass118_31) {
			local13 = new Class15_Sub21(arg0);
		} else if (Static51.aClass118_2 == local11) {
			local13 = new Class15_Sub17(arg0);
		} else if (local11 == Static330.aClass118_14) {
			local13 = new Class15_Sub6(arg0);
		} else if (local11 == Static177.aClass118_6) {
			local13 = new Class15_Sub9(arg0);
		} else if (local11 == Static543.aClass118_28) {
			local13 = new Class15_Sub1(arg0);
		} else if (Static712.aClass118_33 == local11) {
			local13 = new Class15_Sub15(arg0);
		} else if (Static76.aClass118_3 == local11) {
			local13 = new Class15_Sub23(arg0);
		} else if (local11 == Static373.aClass118_18) {
			local13 = new Class15_Sub3_Sub1(arg0);
		} else if (Static482.aClass118_24 == local11) {
			local13 = new Class15_Sub5(arg0);
		} else if (local11 == Static718.aClass118_34) {
			local13 = new Class15_Sub14(arg0);
		} else if (local11 == Static365.aClass118_17) {
			local13 = new Class15_Sub20(arg0);
		} else if (Static456.aClass118_22 == local11) {
			local13 = new Class15_Sub18(arg0);
		} else if (local11 == Static312.aClass118_13) {
			local13 = new Class15_Sub22(arg0);
		} else if (local11 == Static350.aClass118_16) {
			local13 = new Class15_Sub13(arg0);
		} else if (local11 == Static9.aClass118_1) {
			local13 = new Class15_Sub16(arg0);
		} else if (Static208.aClass118_15 == local11) {
			local13 = new Class15_Sub2(arg0);
		} else if (Static228.aClass118_21 == local11) {
			local13 = new Class15_Sub19(arg0);
		} else if (local11 == Static275.aClass118_11) {
			local13 = new Class15_Sub12(arg0);
		} else if (Static456.aClass118_23 == local11) {
			local13 = new Class15_Sub11(arg0);
		} else if (Static260.aClass118_10 == local11) {
			local13 = new Class15_Sub3_Sub2(arg0);
		} else if (Static136.aClass118_5 == local11) {
			local13 = new Class15_Sub7(arg0, 1, 1);
		} else if (local11 == Static526.aClass118_26) {
			local13 = new Class15_Sub7(arg0, 0, 1);
		} else if (Static127.aClass118_4 == local11) {
			local13 = new Class15_Sub7(arg0, 0, 0);
		} else if (Static441.aClass118_20 == local11) {
			local13 = new Class15_Sub7(arg0, 1, 0);
		} else if (Static538.aClass118_27 == local11) {
			local13 = new Class15_Sub4(arg0, false);
		} else if (local11 == Static565.aClass118_29) {
			local13 = new Class15_Sub4(arg0, true);
		} else if (local11 == Static293.aClass118_12) {
			local13 = new Class15_Sub8(arg0);
		} else if (Static405.aClass118_19 == local11) {
			local13 = new Class15_Sub10(arg0);
		}
		return local13;
	}
}
