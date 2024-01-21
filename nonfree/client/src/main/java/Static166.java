import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1350 = Static161.method2971("p11_full");

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Lclient!ld;")
	public static Class47 aClass47_28 = new Class47(500);

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Lclient!ld;")
	public static Class47 aClass47_29 = new Class47(64);

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1351 = Static161.method2971("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Lclient!ld;")
	public static Class47 aClass47_30 = new Class47(30);

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1354 = Static161.method2971("Login");

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1352 = aClass13_1354;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1353 = Static161.method2971("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ce;I)V")
	public static void method2844(@OriginalArg(0) Class1_Sub8 arg0) {
		if (Static50.aClass88_2 != null) {
			try {
				Static50.aClass88_2.method2928(0L);
				Static50.aClass88_2.method2927(arg0.anInt2195, 24, arg0.aByteArray27);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt2195 += 24;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
	public static void method2845() {
		aClass13_1351 = null;
		aClass13_1354 = null;
		aClass47_29 = null;
		aClass13_1352 = null;
		aClass13_1353 = null;
		aClass13_1350 = null;
		aClass47_28 = null;
		aClass47_30 = null;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIII)Z")
	public static boolean method2846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static1.method49(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static114.anIntArrayArrayArray4[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static4.anInt122) {
					if (!Static108.method2114(local10, local24, local14)) {
						return false;
					}
					if (!Static108.method2114(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static108.method2114(local10, local28, local14)) {
						return false;
					}
					if (!Static108.method2114(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static108.method2114(local10, local32, local14)) {
					return false;
				}
				if (!Static108.method2114(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static24.anInt869) {
					if (!Static108.method2114(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static108.method2114(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static108.method2114(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static108.method2114(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static108.method2114(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static108.method2114(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static4.anInt122) {
					if (!Static108.method2114(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static108.method2114(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static108.method2114(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static108.method2114(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static108.method2114(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static108.method2114(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static24.anInt869) {
					if (!Static108.method2114(local10, local24, local14)) {
						return false;
					}
					if (!Static108.method2114(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static108.method2114(local10, local28, local14)) {
						return false;
					}
					if (!Static108.method2114(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static108.method2114(local10, local32, local14)) {
					return false;
				}
				if (!Static108.method2114(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static108.method2114(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static108.method2114(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static108.method2114(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static108.method2114(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static108.method2114(local10, local32, local14);
		} else {
			return true;
		}
	}
}
