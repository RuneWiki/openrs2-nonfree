import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	public static int anInt2030;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	public static int anInt2031;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!qe;")
	public static Class78 aClass78_449 = null;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!ui;")
	public static Class103 aClass103_11 = new Class103(16);

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "[Lclient!hh;")
	public static Class5_Sub2_Sub2[] aClass5_Sub2_Sub2Array3 = new Class5_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	public static int anInt2032 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
	public static void method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg3) {
			Static81.method1348(arg1, arg2, arg0, arg4);
		} else if (arg0 - arg1 >= Static6.anInt187 && arg0 + arg1 <= Static101.anInt2213 && Static73.anInt1576 <= arg2 - arg3 && arg2 + arg3 <= Static137.anInt3137) {
			Static133.method2415(arg1, arg3, arg0, arg2, arg4);
		} else {
			Static40.method552(arg1, arg0, arg2, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!tb;IIII)V")
	public static void method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) long local3 = 0L;
		if (arg4 == 0) {
			local3 = Static105.method1814(arg1, arg3, arg0);
		} else if (arg4 == 1) {
			local3 = Static161.method2902(arg1, arg3, arg0);
		} else if (arg4 == 2) {
			local3 = Static188.method3485(arg1, arg3, arg0);
		} else if (arg4 == 3) {
			local3 = Static144.method2568(arg1, arg3, arg0);
		}
		@Pc(56) int local56 = (int) (local3 >>> 32) & Integer.MAX_VALUE;
		@Pc(66) Class2_Sub3_Sub17 local66 = Static121.method3984(local56);
		if (local66.method1878()) {
			Static26.method345(arg0, arg3, arg1, local66);
		}
		@Pc(91) int local91 = (int) local3 >> 14 & 0x1F;
		@Pc(100) int local100 = (int) local3 >> 20 & 0x3;
		if (local3 == 0L) {
			return;
		}
		if (arg4 == 0) {
			Static148.method2654(arg1, arg3, arg0);
			if (local66.anInt2373 != 0) {
				arg2.method3509(local100, local66.aBoolean94, arg3, local91, arg0);
				return;
			}
		} else if (arg4 == 1) {
			Static106.method1820(arg1, arg3, arg0);
		} else if (arg4 == 2) {
			Static2.method25(arg1, arg3, arg0);
			if (local66.anInt2373 != 0 && local66.anInt2394 + arg3 < 104 && local66.anInt2394 + arg0 < 104 && arg3 + local66.anInt2387 < 104 && arg0 + local66.anInt2387 < 104) {
				arg2.method3511(local66.anInt2387, local66.aBoolean94, local100, arg3, arg0, local66.anInt2394);
				return;
			}
			return;
		} else if (arg4 == 3) {
			Static123.method2220(arg1, arg3, arg0);
			if (local66.anInt2373 == 1) {
				arg2.method3515(arg3, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIILclient!mj;)V")
	public static void method1604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class64 arg2) {
		if (Static152.anInt3520 != 0 && Static152.anInt3520 != 3 || !arg2.method2406()) {
			return;
		}
		@Pc(19) int local19 = arg2.anIntArray491[arg0];
		if (local19 > arg1 || arg2.anIntArray494[arg0] + local19 < arg1) {
			return;
		}
		@Pc(42) int local42 = arg1 - arg2.anInt3021 / 2;
		@Pc(48) int local48 = Static90.anInt2013 + Static140.anInt3197 & 0x7FF;
		@Pc(52) int local52 = Class77.anIntArray631[local48];
		@Pc(56) int local56 = Class77.anIntArray632[local48];
		@Pc(64) int local64 = local52 * (Static62.anInt1225 + 256) >> 8;
		@Pc(82) int local82 = local56 * (Static62.anInt1225 + 256) >> 8;
		@Pc(89) int local89 = arg0 - arg2.anInt3040 / 2;
		@Pc(99) int local99 = local82 * local42 + local64 * local89 >> 11;
		@Pc(110) int local110 = local89 * local82 - local42 * local64 >> 11;
		@Pc(117) int local117 = Static31.aClass5_Sub2_Sub2_1.anInt1849 + local99 >> 7;
		@Pc(125) int local125 = Static31.aClass5_Sub2_Sub2_1.anInt1827 - local110 >> 7;
		@Pc(145) boolean local145 = Static107.method1849(1, 0, local117, 0, 0, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], true, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local125, 0);
		if (!local145) {
			return;
		}
		Static161.aClass2_Sub23_Sub1_5.method2132(local42);
		Static161.aClass2_Sub23_Sub1_5.method2132(local89);
		Static161.aClass2_Sub23_Sub1_5.method2117(Static140.anInt3197);
		Static161.aClass2_Sub23_Sub1_5.method2132(57);
		Static161.aClass2_Sub23_Sub1_5.method2132(Static90.anInt2013);
		Static161.aClass2_Sub23_Sub1_5.method2132(Static62.anInt1225);
		Static161.aClass2_Sub23_Sub1_5.method2132(89);
		Static161.aClass2_Sub23_Sub1_5.method2117(Static31.aClass5_Sub2_Sub2_1.anInt1849);
		Static161.aClass2_Sub23_Sub1_5.method2117(Static31.aClass5_Sub2_Sub2_1.anInt1827);
		Static161.aClass2_Sub23_Sub1_5.method2132(Static194.anInt4453);
		Static161.aClass2_Sub23_Sub1_5.method2132(63);
	}
}
