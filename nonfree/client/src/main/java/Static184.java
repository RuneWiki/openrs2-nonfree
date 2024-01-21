import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_23;

	@OriginalMember(owner = "client!te", name = "gb", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!te", name = "ob", descriptor = "Lclient!ef;")
	public static Class29 aClass29_8;

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
	public static int anInt3760 = 0;

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "[I")
	public static final int[] anIntArray321 = new int[] { 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 24, 2, 5, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, 0, 0, -2, 0, 3, 6, 4, 0, 0, 2, 6, 0, 0, 3, 7, 0, 4, 0, 0, 3, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 6, 0, 5, 0, 0, 0, -1, 12, -1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, -2, -2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 6, 0, 0, 0, 0, 0, -1, 6, 0, 0, 0, -1, 0, 0, 0, 20, 0, 0, 0, 0, -1, 6, 0, 0, 0, 1, 0, 0, -1, 0, 2, -1, 0, 0, 0, 4, 0, 0, -1, 0, 0, 0, 0, -2, 0, 6, 0, 0, 6, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, -2, 0, 0, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 10, -2, 15, 0, 0, 0, 0, 0, 0, -1, 0, 6, 0, 0, 0, 0, 8, 2, 2, 0, 14, -2, 0, 0, 7, 8, 0, 5, 0, -1, 0, 0, 0, 0, 4, 0, 7, 6, 0, 0, 0, 0, 4, 8, 0, 0, 0, 0, 0, 0, 0, 4, -2, 0, 0, 4, 0, 0, 0, 6, 0, 0, 0, -2, 0, -2, 0, 0, 6 };

	@OriginalMember(owner = "client!te", name = "ib", descriptor = "[I")
	public static final int[] anIntArray323 = new int[256];

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1807 = Static193.method3027("(U5");

	@OriginalMember(owner = "client!te", name = "mb", descriptor = "[I")
	public static final int[] anIntArray324 = new int[32];

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
	public static int method2896(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!m;III)V")
	public static void method2897(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class3_Sub6 local12;
		if (arg2 < Static89.anInt659) {
			local12 = Static118.aClass3_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass64_1 != null && local12.aClass64_1.aClass26_6.method2994()) {
				arg0.method2996(local12.aClass64_1.aClass26_6, 128, 0, 0, true);
			}
		}
		if (arg3 < Static89.anInt659) {
			local12 = Static118.aClass3_Sub6ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass64_1 != null && local12.aClass64_1.aClass26_6.method2994()) {
				arg0.method2996(local12.aClass64_1.aClass26_6, 0, 0, 128, true);
			}
		}
		if (arg2 < Static89.anInt659 && arg3 < Static126.anInt2489) {
			local12 = Static118.aClass3_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass64_1 != null && local12.aClass64_1.aClass26_6.method2994()) {
				arg0.method2996(local12.aClass64_1.aClass26_6, 128, 0, 128, true);
			}
		}
		if (arg2 < Static89.anInt659 && arg3 > 0) {
			local12 = Static118.aClass3_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass64_1 != null && local12.aClass64_1.aClass26_6.method2994()) {
				arg0.method2996(local12.aClass64_1.aClass26_6, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ie;IIIIIII)V")
	public static void method2898(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static116.anInt3348;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static146.anInt3006;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static210.anIntArrayArrayArray12[arg1][arg6][arg7] - Static198.anInt4037;
		@Pc(49) int local49 = Static210.anIntArrayArrayArray12[arg1][arg6 + 1][arg7] - Static198.anInt4037;
		@Pc(63) int local63 = Static210.anIntArrayArrayArray12[arg1][arg6 + 1][arg7 + 1] - Static198.anInt4037;
		@Pc(75) int local75 = Static210.anIntArrayArrayArray12[arg1][arg6][arg7 + 1] - Static198.anInt4037;
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
		@Pc(275) int local275 = Static177.anInt3609 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static177.anInt3610 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static177.anInt3609 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static177.anInt3610 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static177.anInt3609 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static177.anInt3610 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static177.anInt3609 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static177.anInt3610 + (local85 << 9) / local261;
		Static177.anInt3611 = 0;
		@Pc(471) int local471;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static1.aBoolean96 && Static30.method547(Static81.anInt1614 + Static177.anInt3609, Static58.anInt1272 + Static177.anInt3610, local315, local331, local299, local307, local323, local291)) {
				Static193.anInt3928 = arg6;
				Static182.anInt3733 = arg7;
			}
			Static177.aBoolean160 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static177.anInt3612 || local323 > Static177.anInt3612 || local291 > Static177.anInt3612) {
				Static177.aBoolean160 = true;
			}
			if (arg0.anInt1709 == -1) {
				if (arg0.anInt1711 != 12345678) {
					Static177.method2785(local315, local331, local299, local307, local323, local291, arg0.anInt1711, arg0.anInt1713, arg0.anInt1708);
				}
			} else if (Static91.aBoolean97) {
				local471 = Static177.anInterface1_7.method561(arg0.anInt1709);
				Static177.method2785(local315, local331, local299, local307, local323, local291, Static62.method945(local471, arg0.anInt1711), Static62.method945(local471, arg0.anInt1713), Static62.method945(local471, arg0.anInt1708));
			} else if (arg0.aBoolean95) {
				Static177.method2779(local315, local331, local299, local307, local323, local291, arg0.anInt1711, arg0.anInt1713, arg0.anInt1708, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1709);
			} else {
				Static177.method2779(local315, local331, local299, local307, local323, local291, arg0.anInt1711, arg0.anInt1713, arg0.anInt1708, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt1709);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static1.aBoolean96 && Static30.method547(Static81.anInt1614 + Static177.anInt3609, Static58.anInt1272 + Static177.anInt3610, local283, local299, local331, local275, local291, local323)) {
			Static193.anInt3928 = arg6;
			Static182.anInt3733 = arg7;
		}
		Static177.aBoolean160 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static177.anInt3612 || local291 > Static177.anInt3612 || local323 > Static177.anInt3612) {
			Static177.aBoolean160 = true;
		}
		if (arg0.anInt1709 != -1) {
			if (!Static91.aBoolean97) {
				Static177.method2779(local283, local299, local331, local275, local291, local323, arg0.anInt1706, arg0.anInt1708, arg0.anInt1713, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1709);
				return;
			}
			local471 = Static177.anInterface1_7.method561(arg0.anInt1709);
			Static177.method2785(local283, local299, local331, local275, local291, local323, Static62.method945(local471, arg0.anInt1706), Static62.method945(local471, arg0.anInt1708), Static62.method945(local471, arg0.anInt1713));
		} else if (arg0.anInt1706 != 12345678) {
			Static177.method2785(local283, local299, local331, local275, local291, local323, arg0.anInt1706, arg0.anInt1708, arg0.anInt1713);
			return;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
	public static void method2899(@OriginalArg(1) int arg0) {
		@Pc(1) Class9 local1 = Static35.aClass9_1;
		synchronized (Static35.aClass9_1) {
			Static116.anInt3353 = arg0;
		}
	}
}
