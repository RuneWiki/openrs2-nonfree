import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
	public static int[] anIntArray521;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!he;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public static int anInt5414 = 0;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)Z")
	public static boolean method4306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static87.method1552(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static9.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static10.anInt148) {
					if (!Static294.method4514(local10, local24, local14)) {
						return false;
					}
					if (!Static294.method4514(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static294.method4514(local10, local28, local14)) {
						return false;
					}
					if (!Static294.method4514(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static294.method4514(local10, local32, local14)) {
					return false;
				}
				if (!Static294.method4514(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static18.anInt389) {
					if (!Static294.method4514(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static294.method4514(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static294.method4514(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static294.method4514(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static294.method4514(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static294.method4514(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static10.anInt148) {
					if (!Static294.method4514(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static294.method4514(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static294.method4514(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static294.method4514(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static294.method4514(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static294.method4514(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static18.anInt389) {
					if (!Static294.method4514(local10, local24, local14)) {
						return false;
					}
					if (!Static294.method4514(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static294.method4514(local10, local28, local14)) {
						return false;
					}
					if (!Static294.method4514(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static294.method4514(local10, local32, local14)) {
					return false;
				}
				if (!Static294.method4514(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static294.method4514(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static294.method4514(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static294.method4514(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static294.method4514(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static294.method4514(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(IIII)V")
	public static void method4307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			Static211.aClass2_Sub16_Sub1_2.method2198(38);
		}
		if (arg1 == 1) {
			Static211.aClass2_Sub16_Sub1_2.method2198(253);
		}
		Static211.aClass2_Sub16_Sub1_2.method2183(arg0 + Static160.anInt5159);
		Static211.aClass2_Sub16_Sub1_2.method2182(Static145.aBooleanArray13[82] ? 1 : 0);
		Static211.aClass2_Sub16_Sub1_2.method2143(Static234.anInt4705 + arg2);
		Static211.aClass2_Sub16_Sub1_2.method2189(++Static160.aByte21);
	}
}
