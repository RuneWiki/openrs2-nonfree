import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "Lclient!kc;")
	public static Class92 aClass92_6;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
	public static int anInt3609 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ca;IIIIIIIZ)V")
	public static void method2815(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static228.anInt4644;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static64.anInt1382;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static195.anIntArrayArrayArray7[arg1][arg6][arg7] - Static256.anInt5058;
		@Pc(49) int local49 = Static195.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static256.anInt5058;
		@Pc(63) int local63 = Static195.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static256.anInt5058;
		@Pc(75) int local75 = Static195.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static256.anInt5058;
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
		@Pc(275) int local275 = Static96.anInt1997 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static96.anInt1995 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static96.anInt1997 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static96.anInt1995 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static96.anInt1997 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static96.anInt1995 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static96.anInt1997 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static96.anInt1995 + (local85 << 9) / local261;
		Static96.anInt1994 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static299.aBoolean481 && Static195.method2229(Static214.anInt4400 + Static96.anInt1997, Static89.anInt1906 + Static96.anInt1995, local315, local331, local299, local307, local323, local291)) {
				Static23.anInt621 = arg6;
				Static101.anInt2132 = arg7;
			}
			if (!Static116.aBoolean188 && !arg8) {
				Static96.aBoolean142 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static96.anInt1996 || local323 > Static96.anInt1996 || local291 > Static96.anInt1996) {
					Static96.aBoolean142 = true;
				}
				if (arg0.anInt750 == -1) {
					if (arg0.anInt745 != 12345678) {
						Static96.method1532(local315, local331, local299, local307, local323, local291, arg0.anInt745, arg0.anInt749, arg0.anInt742);
					}
				} else if (!Static198.aBoolean317) {
					local475 = Static96.anInterface4_1.method1259(arg0.anInt750);
					Static96.method1532(local315, local331, local299, local307, local323, local291, Static164.method2609(local475, arg0.anInt745), Static164.method2609(local475, arg0.anInt749), Static164.method2609(local475, arg0.anInt742));
				} else if (arg0.aBoolean48) {
					Static96.method1537(local315, local331, local299, local307, local323, local291, arg0.anInt745, arg0.anInt749, arg0.anInt742, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt750);
				} else {
					Static96.method1537(local315, local331, local299, local307, local323, local291, arg0.anInt745, arg0.anInt749, arg0.anInt742, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt750);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static299.aBoolean481 && Static195.method2229(Static214.anInt4400 + Static96.anInt1997, Static89.anInt1906 + Static96.anInt1995, local283, local299, local331, local275, local291, local323)) {
			Static23.anInt621 = arg6;
			Static101.anInt2132 = arg7;
		}
		if (Static116.aBoolean188 || arg8) {
			return;
		}
		Static96.aBoolean142 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static96.anInt1996 || local291 > Static96.anInt1996 || local323 > Static96.anInt1996) {
			Static96.aBoolean142 = true;
		}
		if (arg0.anInt750 == -1) {
			if (arg0.anInt739 != 12345678) {
				Static96.method1532(local283, local299, local331, local275, local291, local323, arg0.anInt739, arg0.anInt742, arg0.anInt749);
			}
		} else if (Static198.aBoolean317) {
			Static96.method1537(local283, local299, local331, local275, local291, local323, arg0.anInt739, arg0.anInt742, arg0.anInt749, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt750);
		} else {
			local475 = Static96.anInterface4_1.method1259(arg0.anInt750);
			Static96.method1532(local283, local299, local331, local275, local291, local323, Static164.method2609(local475, arg0.anInt739), Static164.method2609(local475, arg0.anInt742), Static164.method2609(local475, arg0.anInt749));
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V")
	public static void method2816(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static10.aBooleanArray1[arg0]) {
			return;
		}
		Static171.aClass132_60.method3176(arg0);
		if (Static210.aClass159ArrayArray6[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static210.aClass159ArrayArray6[arg0].length; local27++) {
			if (Static210.aClass159ArrayArray6[arg0][local27] != null) {
				if (Static210.aClass159ArrayArray6[arg0][local27].anInt5197 == 2) {
					local25 = false;
				} else {
					Static210.aClass159ArrayArray6[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static210.aClass159ArrayArray6[arg0] = null;
		}
		Static10.aBooleanArray1[arg0] = false;
	}
}
