import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!rc;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!ph;")
	public static Class138 aClass138_37;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	public static int anInt2179 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
	public static void method1790(@OriginalArg(1) int arg0) {
		Static316.anInt5941--;
		if (Static316.anInt5941 == arg0) {
			return;
		}
		Static319.method511(Static213.aStringArray35, arg0 + 1, Static213.aStringArray35, arg0, Static316.anInt5941 - arg0);
		Static319.method511(Static54.aStringArray7, arg0 + 1, Static54.aStringArray7, arg0, Static316.anInt5941 - arg0);
		Static319.method513(Static244.anIntArray441, arg0 + 1, Static244.anIntArray441, arg0, Static316.anInt5941 - arg0);
		Static319.method510(Static241.aShortArray76, arg0 + 1, Static241.aShortArray76, arg0, Static316.anInt5941 - arg0);
		Static319.method512(Static168.aLongArray123, arg0 + 1, Static168.aLongArray123, arg0, Static316.anInt5941 - arg0);
		Static319.method513(Static159.anIntArray270, arg0 + 1, Static159.anIntArray270, arg0, Static316.anInt5941 - arg0);
		Static319.method513(Static44.anIntArray74, arg0 + 1, Static44.anIntArray74, arg0, Static316.anInt5941 - arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!ph;)Z")
	public static boolean method1792(@OriginalArg(1) int arg0, @OriginalArg(2) Class138 arg1) {
		@Pc(18) byte[] local18 = arg1.method3339(arg0);
		if (local18 == null) {
			return false;
		} else {
			Static79.method1216(local18);
			return true;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!df;IIIIIIIZ)V")
	public static void method1793(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static16.anInt247;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static245.anInt2378;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static208.anIntArrayArrayArray11[arg1][arg6][arg7] - Static273.anInt5205;
		@Pc(49) int local49 = Static208.anIntArrayArrayArray11[arg1][arg6 + 1][arg7] - Static273.anInt5205;
		@Pc(63) int local63 = Static208.anIntArrayArrayArray11[arg1][arg6 + 1][arg7 + 1] - Static273.anInt5205;
		@Pc(75) int local75 = Static208.anIntArrayArrayArray11[arg1][arg6][arg7 + 1] - Static273.anInt5205;
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
		@Pc(275) int local275 = Static18.anInt303 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static18.anInt302 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static18.anInt303 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static18.anInt302 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static18.anInt303 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static18.anInt302 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static18.anInt303 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static18.anInt302 + (local85 << 9) / local261;
		Static18.anInt301 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static303.aBoolean421 && Static106.method1770(Static306.anInt5528 + Static18.anInt303, Static272.anInt5176 + Static18.anInt302, local315, local331, local299, local307, local323, local291)) {
				Static211.anInt4150 = arg6;
				Static127.anInt2547 = arg7;
			}
			if (!Static291.aBoolean404 && !arg8) {
				Static18.aBoolean18 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static18.anInt305 || local323 > Static18.anInt305 || local291 > Static18.anInt305) {
					Static18.aBoolean18 = true;
				}
				if (arg0.anInt851 == -1) {
					if (arg0.anInt852 != 12345678) {
						Static18.method308(local315, local331, local299, local307, local323, local291, arg0.anInt852, arg0.anInt846, arg0.anInt844);
					}
				} else if (!Static215.aBoolean288) {
					local475 = Static18.anInterface1_1.method1625(arg0.anInt851);
					Static18.method308(local315, local331, local299, local307, local323, local291, Static223.method3509(local475, arg0.anInt852), Static223.method3509(local475, arg0.anInt846), Static223.method3509(local475, arg0.anInt844));
				} else if (arg0.aBoolean69) {
					Static18.method307(local315, local331, local299, local307, local323, local291, arg0.anInt852, arg0.anInt846, arg0.anInt844, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt851);
				} else {
					Static18.method307(local315, local331, local299, local307, local323, local291, arg0.anInt852, arg0.anInt846, arg0.anInt844, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt851);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static303.aBoolean421 && Static106.method1770(Static306.anInt5528 + Static18.anInt303, Static272.anInt5176 + Static18.anInt302, local283, local299, local331, local275, local291, local323)) {
			Static211.anInt4150 = arg6;
			Static127.anInt2547 = arg7;
		}
		if (Static291.aBoolean404 || arg8) {
			return;
		}
		Static18.aBoolean18 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static18.anInt305 || local291 > Static18.anInt305 || local323 > Static18.anInt305) {
			Static18.aBoolean18 = true;
		}
		if (arg0.anInt851 == -1) {
			if (arg0.anInt849 != 12345678) {
				Static18.method308(local283, local299, local331, local275, local291, local323, arg0.anInt849, arg0.anInt844, arg0.anInt846);
			}
		} else if (Static215.aBoolean288) {
			Static18.method307(local283, local299, local331, local275, local291, local323, arg0.anInt849, arg0.anInt844, arg0.anInt846, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt851);
		} else {
			local475 = Static18.anInterface1_1.method1625(arg0.anInt851);
			Static18.method308(local283, local299, local331, local275, local291, local323, Static223.method3509(local475, arg0.anInt849), Static223.method3509(local475, arg0.anInt844), Static223.method3509(local475, arg0.anInt846));
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IBII)V")
	public static void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(15) int local15 = arg2 - 1;
		@Pc(19) int local19 = local15 - 7;
		while (local19 > arg0) {
			@Pc(24) int local24 = arg0 + 1;
			arg1[local24] = arg3;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg3;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg3;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg3;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg3;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg3;
			@Pc(54) int local54 = local49 + 1;
			arg1[local54] = arg3;
			arg0 = local54 + 1;
			arg1[arg0] = arg3;
		}
		while (local15 > arg0) {
			arg0++;
			arg1[arg0] = arg3;
		}
	}
}
