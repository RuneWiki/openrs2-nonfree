import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "Lclient!ok;")
	public static Class116 aClass116_14;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Lclient!qg;")
	public static Class131 aClass131_15 = new Class131();

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString158 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
	public static void method3942() {
		Static41.aClass155_9.method4362();
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I")
	public static int method3943(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(22) int local22 = local10 | local10 >>> 2;
		@Pc(28) int local28 = local22 | local22 >>> 4;
		@Pc(34) int local34 = local28 | local28 >>> 8;
		@Pc(40) int local40 = local34 | local34 >>> 16;
		return local40 + 1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIILclient!h;IJZ)Z")
	public static boolean method3944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class25 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static48.method1027(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ok;II)I")
	public static int method3945(@OriginalArg(0) Class116 arg0, @OriginalArg(2) int arg1) {
		if (!Static37.method866(arg0).method1105(arg1) && arg0.anObjectArray2 == null) {
			return -1;
		} else if (arg0.anIntArray390 == null || arg0.anIntArray390.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray390[arg1];
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!lk;IIIIIIIZ)V")
	public static void method3946(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static292.anInt6173;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static197.anInt4472;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static287.anIntArrayArrayArray18[arg1][arg6][arg7] - Static114.anInt2499;
		@Pc(49) int local49 = Static287.anIntArrayArrayArray18[arg1][arg6 + 1][arg7] - Static114.anInt2499;
		@Pc(63) int local63 = Static287.anIntArrayArrayArray18[arg1][arg6 + 1][arg7 + 1] - Static114.anInt2499;
		@Pc(75) int local75 = Static287.anIntArrayArrayArray18[arg1][arg6][arg7 + 1] - Static114.anInt2499;
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
		@Pc(275) int local275 = Static151.anInt3525 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static151.anInt3522 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static151.anInt3525 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static151.anInt3522 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static151.anInt3525 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static151.anInt3522 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static151.anInt3525 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static151.anInt3522 + (local85 << 9) / local261;
		Static151.anInt3526 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static292.aBoolean328 && Static52.method1060(Static78.anInt1888 + Static151.anInt3525, Static130.anInt2888 + Static151.anInt3522, local315, local331, local299, local307, local323, local291)) {
				Static62.anInt1579 = arg6;
				Static32.anInt822 = arg7;
			}
			if (!Static296.aBoolean335 && !arg8) {
				Static151.aBoolean181 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static151.anInt3523 || local323 > Static151.anInt3523 || local291 > Static151.anInt3523) {
					Static151.aBoolean181 = true;
				}
				if (arg0.anInt3561 == -1) {
					if (arg0.anInt3553 != 12345678) {
						Static151.method2847(local315, local331, local299, local307, local323, local291, arg0.anInt3553, arg0.anInt3559, arg0.anInt3558);
					}
				} else if (!Static50.aBoolean80) {
					local475 = Static151.anInterface2_1.method4416(arg0.anInt3561);
					Static151.method2847(local315, local331, local299, local307, local323, local291, Static142.method2527(local475, arg0.anInt3553), Static142.method2527(local475, arg0.anInt3559), Static142.method2527(local475, arg0.anInt3558));
				} else if (arg0.aBoolean184) {
					Static151.method2840(local315, local331, local299, local307, local323, local291, arg0.anInt3553, arg0.anInt3559, arg0.anInt3558, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3561);
				} else {
					Static151.method2840(local315, local331, local299, local307, local323, local291, arg0.anInt3553, arg0.anInt3559, arg0.anInt3558, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt3561);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static292.aBoolean328 && Static52.method1060(Static78.anInt1888 + Static151.anInt3525, Static130.anInt2888 + Static151.anInt3522, local283, local299, local331, local275, local291, local323)) {
			Static62.anInt1579 = arg6;
			Static32.anInt822 = arg7;
		}
		if (Static296.aBoolean335 || arg8) {
			return;
		}
		Static151.aBoolean181 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static151.anInt3523 || local291 > Static151.anInt3523 || local323 > Static151.anInt3523) {
			Static151.aBoolean181 = true;
		}
		if (arg0.anInt3561 == -1) {
			if (arg0.anInt3557 != 12345678) {
				Static151.method2847(local283, local299, local331, local275, local291, local323, arg0.anInt3557, arg0.anInt3558, arg0.anInt3559);
			}
		} else if (Static50.aBoolean80) {
			Static151.method2840(local283, local299, local331, local275, local291, local323, arg0.anInt3557, arg0.anInt3558, arg0.anInt3559, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3561);
		} else {
			local475 = Static151.anInterface2_1.method4416(arg0.anInt3561);
			Static151.method2847(local283, local299, local331, local275, local291, local323, Static142.method2527(local475, arg0.anInt3557), Static142.method2527(local475, arg0.anInt3558), Static142.method2527(local475, arg0.anInt3559));
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
	public static void method3947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int local10;
		if (arg0 > arg1) {
			for (local10 = arg1; local10 < arg0; local10++) {
				Static57.anIntArrayArray9[local10][arg3] = arg2;
			}
		} else {
			for (local10 = arg0; local10 < arg1; local10++) {
				Static57.anIntArrayArray9[local10][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method3949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(20) Class1_Sub9 local20 = null;
		for (@Pc(25) Class1_Sub9 local25 = (Class1_Sub9) Static236.aClass131_17.method3791(); local25 != null; local25 = (Class1_Sub9) Static236.aClass131_17.method3792()) {
			if (arg4 == local25.anInt1470 && arg1 == local25.anInt1476 && arg2 == local25.anInt1483 && local25.anInt1486 == arg8) {
				local20 = local25;
				break;
			}
		}
		if (local20 == null) {
			local20 = new Class1_Sub9();
			local20.anInt1483 = arg2;
			local20.anInt1476 = arg1;
			local20.anInt1470 = arg4;
			local20.anInt1486 = arg8;
			Static191.method3398(local20);
			Static236.aClass131_17.method3799(local20);
		}
		local20.anInt1477 = arg3;
		local20.anInt1485 = arg5;
		local20.anInt1481 = arg7;
		local20.anInt1471 = arg6;
		local20.anInt1473 = arg0;
	}
}
