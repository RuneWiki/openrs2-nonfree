import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
	public static int[] anIntArray1 = new int[32];

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[[[Lclient!he;")
	public static Class44[][][] aClass44ArrayArrayArray1 = new Class44[4][104][104];

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Lclient!qe;")
	private static Class78 aClass78_4 = Static199.method3560("cyan:");

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!qe;")
	public static Class78 aClass78_1 = aClass78_4;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!qe;")
	public static Class78 aClass78_2 = aClass78_4;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Lclient!qe;")
	public static Class78 aClass78_3 = Static199.method3560("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZZ)V")
	public static void method2(@OriginalArg(2) boolean arg0) {
		Static40.aBoolean26 = arg0;
		Static161.anInt3727 = 22050;
		Static47.anInt858 = 2;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)Z")
	public static boolean method3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static209.method3067(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static144.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static181.anInt4199) {
					if (!Static201.method3570(local10, local24, local14)) {
						return false;
					}
					if (!Static201.method3570(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static201.method3570(local10, local28, local14)) {
						return false;
					}
					if (!Static201.method3570(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static201.method3570(local10, local32, local14)) {
					return false;
				}
				if (!Static201.method3570(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static59.anInt1039) {
					if (!Static201.method3570(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static201.method3570(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static201.method3570(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static201.method3570(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static201.method3570(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static201.method3570(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static181.anInt4199) {
					if (!Static201.method3570(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static201.method3570(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static201.method3570(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static201.method3570(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static201.method3570(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static201.method3570(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static59.anInt1039) {
					if (!Static201.method3570(local10, local24, local14)) {
						return false;
					}
					if (!Static201.method3570(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static201.method3570(local10, local28, local14)) {
						return false;
					}
					if (!Static201.method3570(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static201.method3570(local10, local32, local14)) {
					return false;
				}
				if (!Static201.method3570(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static201.method3570(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static201.method3570(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static201.method3570(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static201.method3570(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static201.method3570(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
	public static void method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(5) Class19[] local5 = Static216.aClass19Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(12) Class19 local12 = local5[local7];
			if (local12 != null && local12.anInt504 == 2) {
				Static138.method2506(arg3 >> 1, (local12.anInt500 - Static28.anInt497 << 7) + local12.anInt493, local12.anInt506 + (-Static57.anInt628 + local12.anInt498 << 7), local12.anInt505 * 2, arg2 >> 1);
				if (Static7.anInt214 > -1 && Static123.anInt2808 % 20 < 10) {
					Static161.aClass2_Sub3_Sub8Array8[local12.anInt495].method2262(Static7.anInt214 + arg1 - 12, arg0 + Static111.anInt2448 + -28);
				}
			}
		}
	}
}
