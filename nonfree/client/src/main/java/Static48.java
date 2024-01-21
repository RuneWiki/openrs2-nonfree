import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] aClass4_Sub1_Sub7_Sub3Array6;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public static int anInt1228 = -1;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "[[S")
	public static final short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_472 = Static177.method3050("sch-Utteln:");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)Z")
	public static boolean method927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static13.method263(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static142.anIntArrayArrayArray33[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static116.anInt2858) {
					if (!Static72.method1496(local10, local24, local14)) {
						return false;
					}
					if (!Static72.method1496(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static72.method1496(local10, local28, local14)) {
						return false;
					}
					if (!Static72.method1496(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static72.method1496(local10, local32, local14)) {
					return false;
				}
				if (!Static72.method1496(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static83.anInt2133) {
					if (!Static72.method1496(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static72.method1496(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static72.method1496(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static72.method1496(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static72.method1496(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static72.method1496(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static116.anInt2858) {
					if (!Static72.method1496(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static72.method1496(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static72.method1496(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static72.method1496(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static72.method1496(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static72.method1496(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static83.anInt2133) {
					if (!Static72.method1496(local10, local24, local14)) {
						return false;
					}
					if (!Static72.method1496(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static72.method1496(local10, local28, local14)) {
						return false;
					}
					if (!Static72.method1496(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static72.method1496(local10, local32, local14)) {
					return false;
				}
				if (!Static72.method1496(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static72.method1496(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static72.method1496(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static72.method1496(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static72.method1496(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static72.method1496(local10, local32, local14);
		} else {
			return true;
		}
	}
}
