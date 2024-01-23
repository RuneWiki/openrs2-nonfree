import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	public static int anInt3976;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString115 = "Take";

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "[Lclient!ij;")
	public static Class1_Sub2_Sub12[] aClass1_Sub2_Sub12Array1 = new Class1_Sub2_Sub12[14];

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	public static int anInt3975 = 0;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public static void method3216() {
		Static11.aClass155_26.method4354();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	public static void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static292.aBoolean328 = true;
		Static148.anInt3506 = arg0;
		Static78.anInt1888 = arg1;
		Static130.anInt2888 = arg2;
		Static62.anInt1579 = -1;
		Static32.anInt822 = -1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)Z")
	public static boolean method3218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static264.method4486(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static287.anIntArrayArrayArray18[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static292.anInt6173) {
					if (!Static79.method1420(local10, local24, local14)) {
						return false;
					}
					if (!Static79.method1420(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static79.method1420(local10, local28, local14)) {
						return false;
					}
					if (!Static79.method1420(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static79.method1420(local10, local32, local14)) {
					return false;
				}
				if (!Static79.method1420(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static197.anInt4472) {
					if (!Static79.method1420(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static79.method1420(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static79.method1420(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static79.method1420(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static79.method1420(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static79.method1420(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static292.anInt6173) {
					if (!Static79.method1420(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static79.method1420(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static79.method1420(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static79.method1420(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static79.method1420(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static79.method1420(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static197.anInt4472) {
					if (!Static79.method1420(local10, local24, local14)) {
						return false;
					}
					if (!Static79.method1420(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static79.method1420(local10, local28, local14)) {
						return false;
					}
					if (!Static79.method1420(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static79.method1420(local10, local32, local14)) {
					return false;
				}
				if (!Static79.method1420(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static79.method1420(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static79.method1420(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static79.method1420(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static79.method1420(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static79.method1420(local10, local32, local14);
		} else {
			return true;
		}
	}
}
