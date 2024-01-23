import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "J")
	public static long aLong212 = 0L;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!nm;IIB)[Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1[] method4581(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1) {
		return Static114.method2083(arg1, arg0, 0) ? Static126.method1367() : null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg2 < 1 || arg0 > 102 || arg2 > 102) {
			return;
		}
		@Pc(46) int local46;
		if (!Static115.method2108() && (Static17.aByteArrayArrayArray1[0][arg0][arg2] & 0x2) == 0) {
			local46 = arg5;
			if ((Static17.aByteArrayArrayArray1[arg5][arg0][arg2] & 0x8) != 0) {
				local46 = 0;
			}
			if (local46 != Static247.anInt1590) {
				return;
			}
		}
		local46 = arg5;
		if (arg5 < 3 && (Static17.aByteArrayArrayArray1[1][arg0][arg2] & 0x2) == 2) {
			local46 = arg5 + 1;
		}
		Static87.method1721(local46, arg2, arg5, arg0, arg6, Static122.aClass60Array1[arg5]);
		if (arg4 >= 0) {
			@Pc(101) boolean local101 = Static41.aBoolean79;
			Static41.aBoolean79 = true;
			Static42.method778(false, arg1, arg4, local46, arg3, false, arg0, arg5, arg2, Static122.aClass60Array1[arg5]);
			Static41.aBoolean79 = local101;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ud;IIIIIIIZ)V")
	public static void method4583(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static156.anInt3124;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static292.anInt5278;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static280.anIntArrayArrayArray13[arg1][arg6][arg7] - Static215.anInt4033;
		@Pc(49) int local49 = Static280.anIntArrayArrayArray13[arg1][arg6 + 1][arg7] - Static215.anInt4033;
		@Pc(63) int local63 = Static280.anIntArrayArrayArray13[arg1][arg6 + 1][arg7 + 1] - Static215.anInt4033;
		@Pc(75) int local75 = Static280.anIntArrayArrayArray13[arg1][arg6][arg7 + 1] - Static215.anInt4033;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static119.anInt2423 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static119.anInt2427 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static119.anInt2423 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static119.anInt2427 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static119.anInt2423 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static119.anInt2427 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static119.anInt2423 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static119.anInt2427 + (local85 << 9) / local261;
		Static119.anInt2426 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static47.aBoolean102 && Static124.method567(Static255.anInt4767 + Static119.anInt2423, Static4.anInt170 + Static119.anInt2427, local315, local331, local299, local307, local323, local291)) {
				Static289.anInt5260 = arg6;
				Static289.anInt5251 = arg7;
			}
			if (!Static71.aBoolean165 && !arg8) {
				Static119.aBoolean209 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static119.anInt2425 || local323 > Static119.anInt2425 || local291 > Static119.anInt2425) {
					Static119.aBoolean209 = true;
				}
				if (arg0.anInt5124 == -1) {
					if (arg0.anInt5130 != 12345678) {
						Static119.method2161(local315, local331, local299, local307, local323, local291, arg0.anInt5130, arg0.anInt5127, arg0.anInt5128);
					}
				} else if (!Static142.aBoolean243) {
					local475 = Static119.anInterface5_1.method1486(arg0.anInt5124);
					Static119.method2161(local315, local331, local299, local307, local323, local291, Static17.method270(local475, arg0.anInt5130), Static17.method270(local475, arg0.anInt5127), Static17.method270(local475, arg0.anInt5128));
				} else if (arg0.aBoolean485) {
					Static119.method2149(local315, local331, local299, local307, local323, local291, arg0.anInt5130, arg0.anInt5127, arg0.anInt5128, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt5124);
				} else {
					Static119.method2149(local315, local331, local299, local307, local323, local291, arg0.anInt5130, arg0.anInt5127, arg0.anInt5128, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt5124);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static47.aBoolean102 && Static124.method567(Static255.anInt4767 + Static119.anInt2423, Static4.anInt170 + Static119.anInt2427, local283, local299, local331, local275, local291, local323)) {
			Static289.anInt5260 = arg6;
			Static289.anInt5251 = arg7;
		}
		if (Static71.aBoolean165 || arg8) {
			return;
		}
		Static119.aBoolean209 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static119.anInt2425 || local291 > Static119.anInt2425 || local323 > Static119.anInt2425) {
			Static119.aBoolean209 = true;
		}
		if (arg0.anInt5124 == -1) {
			if (arg0.anInt5129 != 12345678) {
				Static119.method2161(local283, local299, local331, local275, local291, local323, arg0.anInt5129, arg0.anInt5128, arg0.anInt5127);
			}
		} else if (Static142.aBoolean243) {
			Static119.method2149(local283, local299, local331, local275, local291, local323, arg0.anInt5129, arg0.anInt5128, arg0.anInt5127, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt5124);
		} else {
			local475 = Static119.anInterface5_1.method1486(arg0.anInt5124);
			Static119.method2161(local283, local299, local331, local275, local291, local323, Static17.method270(local475, arg0.anInt5129), Static17.method270(local475, arg0.anInt5128), Static17.method270(local475, arg0.anInt5127));
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBII)I")
	public static int method4584(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static17.aByteArrayArrayArray1[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static17.aByteArrayArrayArray1[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
