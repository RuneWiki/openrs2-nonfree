import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "[I")
	public static int[] anIntArray231 = new int[100];

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "S")
	public static short aShort38 = 32767;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[5];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)Z")
	public static boolean method1722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static90.method1546(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static46.anIntArrayArrayArray1[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static215.anInt4665) {
					if (!Static240.method3778(local10, local24, local14)) {
						return false;
					}
					if (!Static240.method3778(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static240.method3778(local10, local28, local14)) {
						return false;
					}
					if (!Static240.method3778(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static240.method3778(local10, local32, local14)) {
					return false;
				}
				if (!Static240.method3778(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static2.anInt53) {
					if (!Static240.method3778(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static240.method3778(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static240.method3778(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static240.method3778(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static240.method3778(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static240.method3778(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static215.anInt4665) {
					if (!Static240.method3778(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static240.method3778(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static240.method3778(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static240.method3778(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static240.method3778(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static240.method3778(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static2.anInt53) {
					if (!Static240.method3778(local10, local24, local14)) {
						return false;
					}
					if (!Static240.method3778(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static240.method3778(local10, local28, local14)) {
						return false;
					}
					if (!Static240.method3778(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static240.method3778(local10, local32, local14)) {
					return false;
				}
				if (!Static240.method3778(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static240.method3778(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static240.method3778(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static240.method3778(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static240.method3778(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static240.method3778(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
	public static void method1723() {
		if (Static163.anInt3550 == 2) {
			if (Static114.anInt2473 == Static57.anInt6304 && Static63.anInt1366 == Static107.anInt1674) {
				Static163.anInt3550 = 0;
				if (Static77.aBoolean122 && Static23.aBooleanArray3[81] && Static181.anInt3973 > 2) {
					Static108.method1780(Static181.anInt3973 - 2);
				} else {
					Static108.method1780(Static181.anInt3973 - 1);
				}
			}
		} else if (Static89.anInt5976 == Static57.anInt6304 && Static94.anInt2165 == Static107.anInt1674) {
			Static163.anInt3550 = 0;
			if (Static77.aBoolean122 && Static23.aBooleanArray3[81] && Static181.anInt3973 > 2) {
				Static108.method1780(Static181.anInt3973 - 2);
			} else {
				Static108.method1780(Static181.anInt3973 - 1);
			}
		} else {
			Static63.anInt1366 = Static94.anInt2165;
			Static114.anInt2473 = Static89.anInt5976;
			Static163.anInt3550 = 2;
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(II)V")
	public static void method1724() {
		Static187.aClass89_27.method2273(5);
	}
}
