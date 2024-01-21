import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "T", descriptor = "Lclient!gf;")
	public static Class2_Sub4_Sub1_Sub1_Sub2 aClass2_Sub4_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public static int anInt2434;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] aClass2_Sub4_Sub3_Sub4Array7;

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "Lclient!ch;")
	public static Class14 aClass14_124 = new Class14(100);

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1412 = Static107.method1838("Please enter your password)3");

	@OriginalMember(owner = "client!ab", name = "Y", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1413 = Static107.method1838("mapedge");

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1414 = Static107.method1838("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
	public static int anInt2407 = 1;

	@OriginalMember(owner = "client!ab", name = "fb", descriptor = "[I")
	public static int[] anIntArray228 = new int[2048];

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1415 = aClass28_1412;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)Z")
	public static boolean method1661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static110.method1878(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static90.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static125.anInt2954) {
					if (!Static88.method1581(local10, local24, local14)) {
						return false;
					}
					if (!Static88.method1581(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static88.method1581(local10, local28, local14)) {
						return false;
					}
					if (!Static88.method1581(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static88.method1581(local10, local32, local14)) {
					return false;
				}
				if (!Static88.method1581(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static14.anInt612) {
					if (!Static88.method1581(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static88.method1581(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static88.method1581(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static88.method1581(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static88.method1581(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static88.method1581(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static125.anInt2954) {
					if (!Static88.method1581(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static88.method1581(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static88.method1581(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static88.method1581(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static88.method1581(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static88.method1581(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static14.anInt612) {
					if (!Static88.method1581(local10, local24, local14)) {
						return false;
					}
					if (!Static88.method1581(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static88.method1581(local10, local28, local14)) {
						return false;
					}
					if (!Static88.method1581(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static88.method1581(local10, local32, local14)) {
					return false;
				}
				if (!Static88.method1581(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static88.method1581(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static88.method1581(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static88.method1581(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static88.method1581(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static88.method1581(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "(I)V")
	public static void method1672() {
		aClass28_1415 = null;
		aClass2_Sub4_Sub3_Sub4Array7 = null;
		aClass28_1412 = null;
		aClass28_1413 = null;
		aClass2_Sub4_Sub1_Sub1_Sub2_2 = null;
		anIntArray228 = null;
		aClass14_124 = null;
		aClass28_1414 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public static void method1677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static126.aBoolean134 = true;
		Static130.anInt3044 = arg0;
		Static163.anInt3610 = arg1;
		Static31.anInt4010 = arg2;
		Static177.anInt3920 = -1;
		Static18.anInt3710 = -1;
	}

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "(I)V")
	public static void method1686() {
		Static146.aFontMetrics1 = null;
		Static172.aFont1 = null;
		Static66.anImage3 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg5 < 1 || arg0 > 102 || arg5 > 102) {
			return;
		}
		if (Static177.aBoolean170 && Static103.anInt2568 != arg1) {
			return;
		}
		@Pc(33) long local33 = 0L;
		if (arg3 == 0) {
			local33 = Static41.method740(arg1, arg0, arg5);
		}
		if (arg3 == 1) {
			local33 = Static141.method2249(arg1, arg0, arg5);
		}
		if (arg3 == 2) {
			local33 = Static107.method1837(arg1, arg0, arg5);
		}
		if (arg3 == 3) {
			local33 = Static21.method469(arg1, arg0, arg5);
		}
		if (local33 != 0L) {
			@Pc(87) int local87 = Integer.MAX_VALUE & (int) (local33 >>> 32);
			@Pc(94) int local94 = (int) local33 >> 20 & 0x3;
			@Pc(101) int local101 = (int) local33 >> 14 & 0x1F;
			@Pc(114) Class2_Sub4_Sub6 local114;
			if (arg3 == 0) {
				Static169.method2649(arg1, arg0, arg5);
				local114 = Static151.method2339(local87);
				if (local114.anInt1027 != 0) {
					Static141.aClass36Array1[arg1].method1368(local101, local114.aBoolean44, arg5, arg0, local94);
				}
			}
			if (arg3 == 1) {
				Static98.method1724(arg1, arg0, arg5);
			}
			if (arg3 == 2) {
				Static180.method2864(arg1, arg0, arg5);
				local114 = Static151.method2339(local87);
				if (arg0 + local114.anInt1050 > 103 || arg5 + local114.anInt1050 > 103 || arg0 + local114.anInt1037 > 103 || local114.anInt1037 + arg5 > 103) {
					return;
				}
				if (local114.anInt1027 != 0) {
					Static141.aClass36Array1[arg1].method1364(arg5, local114.anInt1037, local114.anInt1050, local114.aBoolean44, local94, arg0);
				}
			}
			if (arg3 == 3) {
				Static177.method2755(arg1, arg0, arg5);
				local114 = Static151.method2339(local87);
				if (local114.anInt1027 == 1) {
					Static141.aClass36Array1[arg1].method1369(arg0, arg5);
				}
			}
		}
		if (arg2 < 0) {
			return;
		}
		@Pc(233) int local233 = arg1;
		if (arg1 < 3 && (Static49.aByteArrayArrayArray4[1][arg0][arg5] & 0x2) == 2) {
			local233 = arg1 + 1;
		}
		Static84.method1488(arg1, local233, arg0, arg2, arg4, Static141.aClass36Array1[arg1], arg6, arg5);
		return;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIII)V")
	public static void method1693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				Static78.anIntArrayArrayArray6[arg2][local3 + arg1][local7 + arg0] = 0;
			}
		}
		@Pc(52) int local52;
		if (arg1 > 0) {
			for (local52 = 1; local52 < 8; local52++) {
				Static78.anIntArrayArrayArray6[arg2][arg1][local52 + arg0] = Static78.anIntArrayArrayArray6[arg2][arg1 - 1][local52 + arg0];
			}
		}
		if (arg0 > 0) {
			for (local52 = 1; local52 < 8; local52++) {
				Static78.anIntArrayArrayArray6[arg2][local52 + arg1][arg0] = Static78.anIntArrayArrayArray6[arg2][local52 + arg1][arg0 - 1];
			}
		}
		if (arg1 > 0 && Static78.anIntArrayArrayArray6[arg2][arg1 - 1][arg0] != 0) {
			Static78.anIntArrayArrayArray6[arg2][arg1][arg0] = Static78.anIntArrayArrayArray6[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && Static78.anIntArrayArrayArray6[arg2][arg1][arg0 - 1] != 0) {
			Static78.anIntArrayArrayArray6[arg2][arg1][arg0] = Static78.anIntArrayArrayArray6[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && Static78.anIntArrayArrayArray6[arg2][arg1 - 1][arg0 - 1] != 0) {
			Static78.anIntArrayArrayArray6[arg2][arg1][arg0] = Static78.anIntArrayArrayArray6[arg2][arg1 - 1][arg0 - 1];
		}
	}
}
