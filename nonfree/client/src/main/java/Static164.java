import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!u;")
	public static Class76 aClass76_127;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_23 = new Class25(64);

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public static int anInt4264 = 0;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	public static int[] anIntArray407 = new int[25];

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	public static int anInt4265 = 0;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	public static int anInt4266 = 0;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
	public static int anInt4267 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method3270() {
		anIntArray407 = null;
		aClass25_23 = null;
		aClass76_127 = null;
		aBooleanArray19 = null;
		aShortArrayArray5 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!u;B)V")
	public static void method3271(@OriginalArg(0) Class76 arg0) {
		Static57.aClass76_49 = arg0;
		Static158.anInt4151 = Static57.aClass76_49.method3306(16);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)Z")
	public static boolean method3272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static144.method2837(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static92.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static142.anInt3764) {
					if (!Static2.method144(local10, local24, local14)) {
						return false;
					}
					if (!Static2.method144(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static2.method144(local10, local28, local14)) {
						return false;
					}
					if (!Static2.method144(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static2.method144(local10, local32, local14)) {
					return false;
				}
				if (!Static2.method144(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static108.anInt3059) {
					if (!Static2.method144(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static2.method144(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static2.method144(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static2.method144(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static2.method144(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static2.method144(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static142.anInt3764) {
					if (!Static2.method144(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static2.method144(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static2.method144(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static2.method144(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static2.method144(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static2.method144(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static108.anInt3059) {
					if (!Static2.method144(local10, local24, local14)) {
						return false;
					}
					if (!Static2.method144(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static2.method144(local10, local28, local14)) {
						return false;
					}
					if (!Static2.method144(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static2.method144(local10, local32, local14)) {
					return false;
				}
				if (!Static2.method144(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static2.method144(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static2.method144(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static2.method144(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static2.method144(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static2.method144(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
	public static boolean method3273(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Lclient!ah;")
	public static Class7 method3274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass7_1 == null ? null : local7.aClass7_1;
	}
}
