import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	public static int anInt3723 = 0;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString219 = "Examine";

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString220 = "glow2:";

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	public static int anInt3730 = -1;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
	public static int anInt3731 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)Z")
	public static boolean method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static220.method3471(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static55.anIntArrayArrayArray3[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static215.anInt4270) {
					if (!Static255.method3903(local10, local24, local14)) {
						return false;
					}
					if (!Static255.method3903(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static255.method3903(local10, local28, local14)) {
						return false;
					}
					if (!Static255.method3903(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static255.method3903(local10, local32, local14)) {
					return false;
				}
				if (!Static255.method3903(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static273.anInt5322) {
					if (!Static255.method3903(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static255.method3903(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static255.method3903(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static255.method3903(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static255.method3903(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static255.method3903(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static215.anInt4270) {
					if (!Static255.method3903(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static255.method3903(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static255.method3903(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static255.method3903(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static255.method3903(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static255.method3903(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static273.anInt5322) {
					if (!Static255.method3903(local10, local24, local14)) {
						return false;
					}
					if (!Static255.method3903(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static255.method3903(local10, local28, local14)) {
						return false;
					}
					if (!Static255.method3903(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static255.method3903(local10, local32, local14)) {
					return false;
				}
				if (!Static255.method3903(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static255.method3903(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static255.method3903(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static255.method3903(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static255.method3903(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static255.method3903(local10, local32, local14);
		} else {
			return true;
		}
	}
}
