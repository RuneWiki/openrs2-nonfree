import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public static int anInt3963;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
	public static int anInt3983;

	@OriginalMember(owner = "client!qc", name = "xb", descriptor = "[[I")
	public static int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!qc", name = "kc", descriptor = "I")
	public static int anInt4045;

	@OriginalMember(owner = "client!qc", name = "zb", descriptor = "Ljava/lang/String;")
	public static String aString235 = "scroll:";

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method3315() {
		Static258.aClass26_52.method515();
		Static66.aClass26_11.method515();
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIII)Z")
	public static boolean method3326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static31.method508(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static243.anIntArrayArrayArray13[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static277.anInt5282) {
					if (!Static264.method4156(local10, local24, local14)) {
						return false;
					}
					if (!Static264.method4156(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static264.method4156(local10, local28, local14)) {
						return false;
					}
					if (!Static264.method4156(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static264.method4156(local10, local32, local14)) {
					return false;
				}
				if (!Static264.method4156(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static230.anInt4401) {
					if (!Static264.method4156(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static264.method4156(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static264.method4156(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static264.method4156(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static264.method4156(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static264.method4156(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static277.anInt5282) {
					if (!Static264.method4156(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static264.method4156(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static264.method4156(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static264.method4156(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static264.method4156(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static264.method4156(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static230.anInt4401) {
					if (!Static264.method4156(local10, local24, local14)) {
						return false;
					}
					if (!Static264.method4156(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static264.method4156(local10, local28, local14)) {
						return false;
					}
					if (!Static264.method4156(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static264.method4156(local10, local32, local14)) {
					return false;
				}
				if (!Static264.method4156(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static264.method4156(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static264.method4156(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static264.method4156(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static264.method4156(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static264.method4156(local10, local32, local14);
		} else {
			return true;
		}
	}
}
