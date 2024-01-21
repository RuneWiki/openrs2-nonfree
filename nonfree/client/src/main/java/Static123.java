import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 aClass6_Sub3_Sub3_Sub2_6;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!ga;")
	public static Class29 aClass29_24;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	public static int anInt3314;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!ga;")
	public static Class29 aClass29_25;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt3306 = 0;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!ec;")
	public static Class21 aClass21_2 = new Class21();

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1776 = Static80.method1463("chatback");

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public static int anInt3313 = 0;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1778 = Static80.method1463("You have only just left another world)3");

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1777 = aClass63_1778;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILclient!cd;)V")
	public static void method2164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub3_Sub3_Sub1 arg3) {
		aClass29_25.method1431();
		Static11.aClass6_Sub3_Sub3_Sub3_14.method1768(0, 0);
		arg3.method460(Static93.aClass63_1379, 55, 28, 16777215, true);
		if (arg2 == 0) {
			arg3.method460(Static86.aClass63_1240, 55, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg3.method460(Static82.aClass63_1198, 55, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg3.method460(Static100.aClass63_1513, 55, 41, 16711680, true);
		}
		if (arg2 == 3) {
			arg3.method460(Static43.aClass63_76, 55, 41, 65535, true);
		}
		arg3.method460(Static34.aClass63_616, 184, 28, 16777215, true);
		if (arg1 == 0) {
			arg3.method460(Static86.aClass63_1240, 184, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg3.method460(Static82.aClass63_1198, 184, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg3.method460(Static100.aClass63_1513, 184, 41, 16711680, true);
		}
		arg3.method460(Static35.aClass63_626, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg3.method460(Static86.aClass63_1240, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg3.method460(Static82.aClass63_1198, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg3.method460(Static100.aClass63_1513, 324, 41, 16711680, true);
		}
		arg3.method445(Static41.aClass63_702, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(152) Graphics local152 = Static38.aCanvas1.getGraphics();
			aClass29_25.method1428(453, 0, local152);
		} catch (@Pc(160) Exception local160) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method2165() {
		Static61.aBoolean98 = false;
		Static28.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public static void method2166() {
		try {
			@Pc(2) Graphics local2 = Static38.aCanvas1.getGraphics();
			Static75.aClass29_12.method1428(357, 17, local2);
		} catch (@Pc(14) Exception local14) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public static void method2167(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static64.aBoolean100) {
			Static118.method2115();
		} else if (arg0 != -1 && arg0 != Static56.anInt1714 && Static13.anInt433 != 0 && !Static64.aBoolean100) {
			Static60.method1174(0, arg0, Static64.aClass7_Sub1_10, Static13.anInt433);
		}
		Static56.anInt1714 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
	public static int method2168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) ((arg0 << 16) + arg1);
		return Static76.aClass6_Sub3_Sub16_1 != null && local6 == Static76.aClass6_Sub3_Sub16_1.aLong91 ? Static51.aClass6_Sub4_2.anInt1949 * 99 / (Static51.aClass6_Sub4_2.aByteArray27.length - Static76.aClass6_Sub3_Sub16_1.aByte5) + 1 : 0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
	public static void method2169() {
		Static84.method1571(Static14.anInt480);
		if (Static85.anInt2839 != -1) {
			Static84.method1571(Static85.anInt2839);
		}
		Static68.anInt1973 = 0;
		Static86.aClass29_15.method1431();
		Static30.anIntArray123 = Static107.method1987(Static30.anIntArray123);
		Static121.method1970();
		Static72.method1385(0, 765, 503, Static14.anInt480);
		if (Static85.anInt2839 != -1) {
			Static72.method1385(0, 765, 503, Static85.anInt2839);
		}
		if (Static12.aBoolean23) {
			Static49.method1037();
		} else {
			Static112.method2068();
			Static51.method1064();
		}
		try {
			@Pc(63) Graphics local63 = Static38.aCanvas1.getGraphics();
			Static86.aClass29_15.method1428(0, 0, local63);
		} catch (@Pc(71) Exception local71) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!dc;I)V")
	public static void method2170(@OriginalArg(1) Class6_Sub3_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static89.method1604(arg1, arg0.anInt2347, arg0.anInt2319);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method2171() {
		aClass29_25 = null;
		aClass63_1778 = null;
		aClass63_1776 = null;
		aClass29_24 = null;
		aClass63_1777 = null;
		aClass6_Sub3_Sub3_Sub2_6 = null;
		aClass21_2 = null;
		anIntArray371 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lclient!j;")
	public static Class6_Sub3_Sub10 method2172(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub3_Sub10 local10 = (Class6_Sub3_Sub10) Static57.aClass49_17.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static37.aClass7_21.method110(6, arg0);
		local10 = new Class6_Sub3_Sub10();
		local10.anInt1674 = arg0;
		if (local20 != null) {
			local10.method1118(new Class6_Sub4(local20));
		}
		local10.method1119();
		if (local10.aBoolean90) {
			local10.aBoolean83 = false;
			local10.aBoolean88 = false;
		}
		Static57.aClass49_17.method1396((long) arg0, local10);
		return local10;
	}
}
