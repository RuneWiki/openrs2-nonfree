import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "[Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3[] aClass1_Sub1_Sub5_Sub3Array2;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_4;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!jd;")
	public static Class37 aClass37_9;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "Lclient!jd;")
	public static Class37 aClass37_10;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "J")
	public static volatile long aLong20 = 0L;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	public static int anInt629 = 1;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "Lclient!rd;")
	private static Class64 aClass64_379 = Static69.method1153("Close");

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_377 = aClass64_379;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!rd;")
	public static Class64 aClass64_378 = Static69.method1153(" )2> @lre@");

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[Lclient!bb;")
	public static Class8[] aClass8Array1 = new Class8[14];

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
	public static final int anInt636 = 20;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method398() {
		aClass1_Sub1_Sub5_Sub3_4 = null;
		aClass37_9 = null;
		aClass1_Sub1_Sub5_Sub3Array2 = null;
		aClass64_378 = null;
		aClass8Array1 = null;
		aClass37_10 = null;
		aBooleanArray3 = null;
		aClass64_377 = null;
		aClass64_379 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method399(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method400() {
		Static102.aClass19_89.method416();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ)I")
	public static int method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(46) int local46 = Static34.method561(arg1 - 1, arg0 + -1) + Static34.method561(arg1 - 1, arg0 + 1) + Static34.method561(arg1 + 1, arg0 + -1) + Static34.method561(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static34.method561(arg1, arg0 - 1) + Static34.method561(arg1, arg0 + 1) + Static34.method561(arg1 + -1, arg0) + Static34.method561(arg1 - -1, arg0);
		@Pc(81) int local81 = Static34.method561(arg1, arg0);
		return local76 / 8 + local46 / 16 + local81 / 4;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public static void method403() {
		Static96.method2006();
		if (Static85.anInt2752 == 1) {
			Static92.aClass1_Sub1_Sub5_Sub2Array9[Static6.anInt318 / 100].method778(Static57.anInt1293 - 4 - 8, Static51.anInt1210 + -12);
		}
		if (Static85.anInt2752 == 2) {
			Static92.aClass1_Sub1_Sub5_Sub2Array9[Static6.anInt318 / 100 + 4].method778(Static57.anInt1293 - 4 - 8, Static51.anInt1210 + -12);
		}
		if (Static60.anInt1349 != -1) {
			Static17.method351(Static60.anInt1349);
			Static120.method2100(334, 512, 4, Static60.anInt1349);
		}
		if (Static95.anInt2177 != -1) {
			Static17.method351(Static95.anInt2177);
			Static120.method2100(334, 512, 0, Static95.anInt2177);
		}
		Static50.method916();
		if (!Static94.aBoolean132) {
			Static55.method2072();
			Static95.method1560();
		} else if (Static12.anInt1938 == 0) {
			Static19.method391();
		}
		if (Static109.anInt2628 == 1) {
			Static93.aClass1_Sub1_Sub5_Sub2_8.method778(472, 296);
		}
		@Pc(126) int local126;
		if (Static100.aBoolean135) {
			@Pc(106) byte local106 = 20;
			Static3.aClass1_Sub1_Sub5_Sub1_1.method645(Static82.method1383(new Class64[] { Static82.aClass64_1176, Static12.method1395(Static119.anInt2847) }), 20, 16776960);
			local126 = local106 + 15;
			@Pc(128) Runtime local128 = Runtime.getRuntime();
			@Pc(138) int local138 = (int) ((local128.totalMemory() - local128.freeMemory()) / 1024L);
			@Pc(140) int local140 = 16776960;
			if (local138 > 32768 && Static52.aBoolean169) {
				local140 = 16711680;
			}
			if (local138 > 65536 && !Static52.aBoolean169) {
				local140 = 16711680;
			}
			Static3.aClass1_Sub1_Sub5_Sub1_1.method645(Static82.method1383(new Class64[] { Static94.aClass64_1355, Static12.method1395(local138), Static34.aClass64_500 }), 35, local140);
			local126 += 15;
			if (Static34.aBoolean52) {
				Static3.aClass1_Sub1_Sub5_Sub1_1.method645(Static41.aClass64_1696, 50, 16711680);
				local126 += 15;
				Static34.aBoolean52 = false;
			}
			if (Static63.aBoolean83) {
				Static3.aClass1_Sub1_Sub5_Sub1_1.method645(Static1.aClass64_54, local126, 16711680);
				Static63.aBoolean83 = false;
				local126 += 15;
			}
			if (Static49.aBoolean67) {
				Static3.aClass1_Sub1_Sub5_Sub1_1.method645(Static70.aClass64_992, local126, 16711680);
				local126 += 15;
				Static49.aBoolean67 = false;
			}
		}
		if (Static66.anInt1526 == 0) {
			return;
		}
		@Pc(222) int local222 = Static66.anInt1526 / 50;
		local126 = local222 / 60;
		@Pc(230) int local230 = local222 % 60;
		if (local230 >= 10) {
			Static3.aClass1_Sub1_Sub5_Sub1_1.method661(Static82.method1383(new Class64[] { Static67.aClass64_955, Static12.method1395(local126), Static82.aClass64_1178, Static12.method1395(local230) }), 4, 329, 16776960);
		} else {
			Static3.aClass1_Sub1_Sub5_Sub1_1.method661(Static82.method1383(new Class64[] { Static67.aClass64_955, Static12.method1395(local126), Static18.aClass64_348, Static12.method1395(local230) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!pb;I)V")
	public static void method404(@OriginalArg(0) Class41 arg0) {
		Static119.aClass41_78 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method406() {
		for (@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static91.aClass50_10.method1151(); local14 != null; local14 = (Class1_Sub7) Static91.aClass50_10.method1141()) {
			if (local14.aClass1_Sub1_Sub3_1 != null) {
				local14.method930();
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIII)I")
	public static int method408(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = arg1; local5 < arg2; local5++) {
			local3 = local3 >>> 8 ^ Class2_Sub2.anIntArray140[(local3 ^ arg0[local5]) & 0xFF];
		}
		return ~local3;
	}
}
