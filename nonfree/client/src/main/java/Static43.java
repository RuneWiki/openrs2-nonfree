import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!gb;")
	public static Class34 aClass34_4;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "Lclient!ub;")
	public static Class5_Sub11_Sub4 aClass5_Sub11_Sub4_1;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1 aClass5_Sub2_Sub10_Sub1_1;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_330 = Static161.method2452("<col=ffff00>");

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!vf;")
	public static final Class5_Sub6_Sub1 aClass5_Sub6_Sub1_2 = new Class5_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_331 = Static161.method2452("<img=1>");

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	public static int anInt990 = 0;

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_332 = Static161.method2452("<)4col>");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!w;IIIIIIIZ)V")
	public static void method830(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static37.anInt1357;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static132.anInt3725;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static37.anIntArrayArrayArray5[arg1][arg6][arg7] - Static117.anInt2448;
		@Pc(49) int local49 = Static37.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static117.anInt2448;
		@Pc(63) int local63 = Static37.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static117.anInt2448;
		@Pc(75) int local75 = Static37.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static117.anInt2448;
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
		@Pc(275) int local275 = Static149.anInt3059 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static149.anInt3063 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static149.anInt3059 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static149.anInt3063 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static149.anInt3059 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static149.anInt3063 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static149.anInt3059 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static149.anInt3063 + (local85 << 9) / local261;
		Static149.anInt3062 = 0;
		@Pc(473) int local473;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static85.aBoolean86 && Static10.method213(Static66.anInt1447 + Static149.anInt3059, Static63.anInt1386 + Static149.anInt3063, local315, local331, local299, local307, local323, local291)) {
				Static97.anInt2043 = arg6;
				Static98.anInt2089 = arg7;
			}
			if (!arg8) {
				Static149.aBoolean135 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static149.anInt3060 || local323 > Static149.anInt3060 || local291 > Static149.anInt3060) {
					Static149.aBoolean135 = true;
				}
				if (arg0.anInt4096 == -1) {
					if (arg0.anInt4090 != 12345678) {
						Static149.method2282(local315, local331, local299, local307, local323, local291, arg0.anInt4090, arg0.anInt4098, arg0.anInt4091);
					}
				} else if (Static157.aBoolean140) {
					local473 = Static149.anInterface1_10.method2489(arg0.anInt4096);
					Static149.method2282(local315, local331, local299, local307, local323, local291, Static147.method2261(local473, arg0.anInt4090), Static147.method2261(local473, arg0.anInt4098), Static147.method2261(local473, arg0.anInt4091));
				} else if (arg0.aBoolean184) {
					Static149.method2276(local315, local331, local299, local307, local323, local291, arg0.anInt4090, arg0.anInt4098, arg0.anInt4091, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4096);
				} else {
					Static149.method2276(local315, local331, local299, local307, local323, local291, arg0.anInt4090, arg0.anInt4098, arg0.anInt4091, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4096);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static85.aBoolean86 && Static10.method213(Static66.anInt1447 + Static149.anInt3059, Static63.anInt1386 + Static149.anInt3063, local283, local299, local331, local275, local291, local323)) {
			Static97.anInt2043 = arg6;
			Static98.anInt2089 = arg7;
		}
		if (arg8) {
			return;
		}
		Static149.aBoolean135 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static149.anInt3060 || local291 > Static149.anInt3060 || local323 > Static149.anInt3060) {
			Static149.aBoolean135 = true;
		}
		if (arg0.anInt4096 != -1) {
			if (!Static157.aBoolean140) {
				Static149.method2276(local283, local299, local331, local275, local291, local323, arg0.anInt4097, arg0.anInt4091, arg0.anInt4098, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4096);
				return;
			}
			local473 = Static149.anInterface1_10.method2489(arg0.anInt4096);
			Static149.method2282(local283, local299, local331, local275, local291, local323, Static147.method2261(local473, arg0.anInt4097), Static147.method2261(local473, arg0.anInt4091), Static147.method2261(local473, arg0.anInt4098));
		} else if (arg0.anInt4097 != 12345678) {
			Static149.method2282(local283, local299, local331, local275, local291, local323, arg0.anInt4097, arg0.anInt4091, arg0.anInt4098);
			return;
		}
	}
}
