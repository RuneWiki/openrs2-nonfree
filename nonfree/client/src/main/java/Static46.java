import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	public static int anInt1033;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "J")
	public static long aLong56;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Ljava/lang/Object;")
	public static final Object anObject1 = new Object();

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_350 = Static161.method2452("(U0a )2 via: ");

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	public static int anInt1037 = 255;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIBILclient!ta;)V")
	public static void method844(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5_Sub2_Sub22 arg4) {
		if (Static198.anInt3860 >= 50 || (arg4.anIntArray376 == null || arg4.anIntArray376.length <= arg1)) {
			return;
		}
		@Pc(21) int local21 = arg4.anIntArray376[arg1];
		if (local21 == 0) {
			return;
		}
		@Pc(28) int local28 = local21 >> 8;
		@Pc(34) int local34 = local21 >> 4 & 0x7;
		@Pc(38) int local38 = local21 & 0xF;
		if (local38 == 0) {
			if (arg0) {
				Static49.method882(local34, 0, local28);
			}
		} else if (Static188.anInt3751 != 0) {
			Static110.anIntArray255[Static198.anInt3860] = local28;
			Static27.anIntArray34[Static198.anInt3860] = local34;
			@Pc(71) int local71 = (arg2 - 64) / 128;
			Static103.anIntArray232[Static198.anInt3860] = 0;
			Static184.aClass21Array1[Static198.anInt3860] = null;
			@Pc(90) int local90 = (arg3 - 64) / 128;
			Static173.anIntArray365[Static198.anInt3860] = local38 + (local71 << 16) + (local90 << 8);
			Static198.anInt3860++;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIB)V")
	public static void method845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static42.method812(arg1, arg0, arg1 + arg3, arg0 - -arg2);
		Static149.method2267();
		Static42.method824(arg1, arg0, arg3, arg2, 0);
		if (Static144.anInt2995 < 100) {
			return;
		}
		if (Static107.aClass5_Sub2_Sub10_5 == null) {
			@Pc(35) Class5_Sub2_Sub10_Sub1 local35 = new Class5_Sub2_Sub10_Sub1(arg3, arg2);
			Static42.method804(local35.anIntArray347, arg3, arg2);
			Static135.method2099(0, 0, arg3, 0, Static131.anInt2727, 0, Static165.anInt2257, arg2);
			Static107.aClass5_Sub2_Sub10_5 = local35;
			Static197.aClass24_1.method2292();
		}
		Static107.aClass5_Sub2_Sub10_5.method2414(arg1, arg0);
		@Pc(67) int local67 = arg1 + Static64.anInt1390 * arg3 / Static131.anInt2727;
		@Pc(79) int local79 = Static61.anInt1351 * arg2 / Static165.anInt2257 + arg0;
		@Pc(85) int local85 = Static121.anInt2576 * arg2 / Static165.anInt2257;
		@Pc(91) int local91 = arg3 * Static54.anInt1152 / Static131.anInt2727;
		Static42.method814(local67, local79, local91, local85, 16711680, 128);
		Static42.method817(local67, local79, local91, local85, 16711680);
		if (Static11.anInt258 <= 0 || Static11.anInt258 % 10 >= 5) {
			return;
		}
		for (@Pc(119) Class5_Sub12 local119 = (Class5_Sub12) Static11.aClass91_1.method2684(); local119 != null; local119 = (Class5_Sub12) Static11.aClass91_1.method2678()) {
			if (local119.anInt1157 == Static186.anInt3737) {
				@Pc(134) int local134 = arg3 * local119.anInt1161 / Static131.anInt2727 + arg1;
				@Pc(143) int local143 = arg0 + local119.anInt1160 * arg2 / Static165.anInt2257;
				Static42.method824(local134 - 2, local143 - 2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Z")
	public static boolean method847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static40.method691(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static37.anIntArrayArrayArray5[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static37.anInt1357) {
					if (!Static191.method2853(local10, local24, local14)) {
						return false;
					}
					if (!Static191.method2853(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static191.method2853(local10, local28, local14)) {
						return false;
					}
					if (!Static191.method2853(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static191.method2853(local10, local32, local14)) {
					return false;
				}
				if (!Static191.method2853(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static132.anInt3725) {
					if (!Static191.method2853(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static191.method2853(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static191.method2853(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static191.method2853(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static191.method2853(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static191.method2853(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static37.anInt1357) {
					if (!Static191.method2853(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static191.method2853(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static191.method2853(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static191.method2853(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static191.method2853(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static191.method2853(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static132.anInt3725) {
					if (!Static191.method2853(local10, local24, local14)) {
						return false;
					}
					if (!Static191.method2853(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static191.method2853(local10, local28, local14)) {
						return false;
					}
					if (!Static191.method2853(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static191.method2853(local10, local32, local14)) {
					return false;
				}
				if (!Static191.method2853(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static191.method2853(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static191.method2853(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static191.method2853(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static191.method2853(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static191.method2853(local10, local32, local14);
		} else {
			return true;
		}
	}
}
