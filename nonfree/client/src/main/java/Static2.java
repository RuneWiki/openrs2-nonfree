import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!ab", name = "fb", descriptor = "I")
	public static int anInt83;

	@OriginalMember(owner = "client!ab", name = "nb", descriptor = "Lclient!uc;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!ab", name = "ob", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
	public static int anInt80 = 0;

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "Lclient!eh;")
	private static Class28 aClass28_22 = Static170.method3101("slide:");

	@OriginalMember(owner = "client!ab", name = "gb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_24 = Static170.method3101("skill)2");

	@OriginalMember(owner = "client!ab", name = "ab", descriptor = "Lclient!eh;")
	public static Class28 aClass28_23 = aClass28_24;

	@OriginalMember(owner = "client!ab", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_25 = Static170.method3101("logo");

	@OriginalMember(owner = "client!ab", name = "ib", descriptor = "I")
	public static int anInt84 = 0;

	@OriginalMember(owner = "client!ab", name = "jb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_26 = aClass28_22;

	@OriginalMember(owner = "client!ab", name = "kb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_27 = aClass28_22;

	@OriginalMember(owner = "client!ab", name = "pb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_28 = Static170.method3101("mod_icons");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)Z")
	public static boolean method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static94.method2076(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static35.anIntArrayArrayArray17[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static34.anInt1037) {
					if (!Static34.method851(local10, local24, local14)) {
						return false;
					}
					if (!Static34.method851(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static34.method851(local10, local28, local14)) {
						return false;
					}
					if (!Static34.method851(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static34.method851(local10, local32, local14)) {
					return false;
				}
				if (!Static34.method851(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static76.anInt2272) {
					if (!Static34.method851(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static34.method851(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static34.method851(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static34.method851(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static34.method851(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static34.method851(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static34.anInt1037) {
					if (!Static34.method851(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static34.method851(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static34.method851(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static34.method851(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static34.method851(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static34.method851(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static76.anInt2272) {
					if (!Static34.method851(local10, local24, local14)) {
						return false;
					}
					if (!Static34.method851(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static34.method851(local10, local28, local14)) {
						return false;
					}
					if (!Static34.method851(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static34.method851(local10, local32, local14)) {
					return false;
				}
				if (!Static34.method851(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static34.method851(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static34.method851(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static34.method851(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static34.method851(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static34.method851(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V")
	public static void method66() {
		aClass28_22 = null;
		anIntArray17 = null;
		aClass28_24 = null;
		aClass17_1 = null;
		aClass28_25 = null;
		aClass7_Sub1_1 = null;
		aClass28_27 = null;
		aClass28_26 = null;
		aClass28_28 = null;
		anIntArray16 = null;
		aClass28_23 = null;
	}
}
