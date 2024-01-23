import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!lg;")
	public static Class97 aClass97_18;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	public static int anInt3859 = 0;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString133 = "purple:";

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
	public static int method3143() {
		return Static108.anInt2152 == 0 ? 0 : Static133.anInterface2Array1[Static108.anInt2152].method4569();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!pf;IIIIIIIZ)V")
	public static void method3145(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static54.anInt1239;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static179.anInt3613;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static154.anIntArrayArrayArray5[arg1][arg6][arg7] - Static222.anInt4471;
		@Pc(49) int local49 = Static154.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static222.anInt4471;
		@Pc(63) int local63 = Static154.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static222.anInt4471;
		@Pc(75) int local75 = Static154.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static222.anInt4471;
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
		@Pc(275) int local275 = Static283.anInt5539 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static283.anInt5542 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static283.anInt5539 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static283.anInt5542 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static283.anInt5539 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static283.anInt5542 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static283.anInt5539 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static283.anInt5542 + (local85 << 9) / local261;
		Static283.anInt5541 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static201.aBoolean247 && Static33.method643(Static176.anInt5578 + Static283.anInt5539, Static191.anInt3883 + Static283.anInt5542, local315, local331, local299, local307, local323, local291)) {
				Static113.anInt2263 = arg6;
				Static108.anInt2153 = arg7;
			}
			if (!Static251.aBoolean330 && !arg8) {
				Static283.aBoolean376 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static283.anInt5540 || local323 > Static283.anInt5540 || local291 > Static283.anInt5540) {
					Static283.aBoolean376 = true;
				}
				if (arg0.anInt4077 == -1) {
					if (arg0.anInt4075 != 12345678) {
						Static283.method4427(local315, local331, local299, local307, local323, local291, arg0.anInt4075, arg0.anInt4073, arg0.anInt4071);
					}
				} else if (!Static208.aBoolean248) {
					local475 = Static283.anInterface1_1.method2431(arg0.anInt4077);
					Static283.method4427(local315, local331, local299, local307, local323, local291, Static199.method2418(local475, arg0.anInt4075), Static199.method2418(local475, arg0.anInt4073), Static199.method2418(local475, arg0.anInt4071));
				} else if (arg0.aBoolean249) {
					Static283.method4411(local315, local331, local299, local307, local323, local291, arg0.anInt4075, arg0.anInt4073, arg0.anInt4071, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4077);
				} else {
					Static283.method4411(local315, local331, local299, local307, local323, local291, arg0.anInt4075, arg0.anInt4073, arg0.anInt4071, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4077);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static201.aBoolean247 && Static33.method643(Static176.anInt5578 + Static283.anInt5539, Static191.anInt3883 + Static283.anInt5542, local283, local299, local331, local275, local291, local323)) {
			Static113.anInt2263 = arg6;
			Static108.anInt2153 = arg7;
		}
		if (Static251.aBoolean330 || arg8) {
			return;
		}
		Static283.aBoolean376 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static283.anInt5540 || local291 > Static283.anInt5540 || local323 > Static283.anInt5540) {
			Static283.aBoolean376 = true;
		}
		if (arg0.anInt4077 == -1) {
			if (arg0.anInt4076 != 12345678) {
				Static283.method4427(local283, local299, local331, local275, local291, local323, arg0.anInt4076, arg0.anInt4071, arg0.anInt4073);
			}
		} else if (Static208.aBoolean248) {
			Static283.method4411(local283, local299, local331, local275, local291, local323, arg0.anInt4076, arg0.anInt4071, arg0.anInt4073, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4077);
		} else {
			local475 = Static283.anInterface1_1.method2431(arg0.anInt4077);
			Static283.method4427(local283, local299, local331, local275, local291, local323, Static199.method2418(local475, arg0.anInt4076), Static199.method2418(local475, arg0.anInt4071), Static199.method2418(local475, arg0.anInt4073));
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)I")
	public static int method3146() {
		return ((Static279.anInt5471 == 0 ? 0 : 1) << 21) + ((Static265.anInt5214 == 0 ? 0 : 1) << 20) + ((Static304.aBoolean404 ? 1 : 0) << 15) + ((Static253.aBoolean335 ? 1 : 0) << 13) + ((Static208.aBoolean248 ? 1 : 0) << 9) + ((Static127.aBoolean163 ? 1 : 0) << 8) + ((Static85.aBoolean102 ? 1 : 0) << 7) + ((Static59.aBoolean75 ? 1 : 0) << 4) + ((Static132.aBoolean168 ? 1 : 0) << 3) + (Static248.anInt4872 & 0x7) + ((Static70.aBoolean83 ? 1 : 0) << 5) + ((Static226.aBoolean286 ? 1 : 0) << 6) + ((Static114.aBoolean143 ? 1 : 0) << 10) + ((Static154.anInt3207 & 0x3) << 11) + ((Static50.aBoolean66 ? 1 : 0) << 16) + (Static230.anInt4613 << 17) + ((Static159.aBoolean209 ? 1 : 0) << 19) + ((Static192.anInt815 == 0 ? 0 : 1) << 22) + (Static117.method1983() << 23);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public static void method3147(@OriginalArg(0) int arg0) {
		if (Static74.anIntArray143 == null || Static74.anIntArray143.length < arg0) {
			Static74.anIntArray143 = new int[arg0];
		}
	}
}
