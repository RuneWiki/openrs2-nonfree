import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
	public static final boolean aBoolean93 = false;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_558 = Static181.method2795("Texturen geladen)3");

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_559 = Static181.method2795("");

	@OriginalMember(owner = "client!id", name = "m", descriptor = "B")
	public static byte aByte6 = 0;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public static int anInt1772 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)Z")
	public static boolean method1436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static101.method1745(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static27.anIntArrayArrayArray3[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static87.anInt1883) {
					if (!Static166.method2577(local10, local24, local14)) {
						return false;
					}
					if (!Static166.method2577(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static166.method2577(local10, local28, local14)) {
						return false;
					}
					if (!Static166.method2577(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static166.method2577(local10, local32, local14)) {
					return false;
				}
				if (!Static166.method2577(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static95.anInt2024) {
					if (!Static166.method2577(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static166.method2577(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static166.method2577(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static166.method2577(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static166.method2577(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static166.method2577(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static87.anInt1883) {
					if (!Static166.method2577(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static166.method2577(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static166.method2577(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static166.method2577(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static166.method2577(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static166.method2577(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static95.anInt2024) {
					if (!Static166.method2577(local10, local24, local14)) {
						return false;
					}
					if (!Static166.method2577(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static166.method2577(local10, local28, local14)) {
						return false;
					}
					if (!Static166.method2577(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static166.method2577(local10, local32, local14)) {
					return false;
				}
				if (!Static166.method2577(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static166.method2577(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static166.method2577(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static166.method2577(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static166.method2577(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static166.method2577(local10, local32, local14);
		} else {
			return true;
		}
	}
}
