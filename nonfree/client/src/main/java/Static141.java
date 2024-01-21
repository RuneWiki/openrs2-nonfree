import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	public static int anInt2978;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[S")
	public static short[] aShortArray29;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_873 = Static181.method2795("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_874 = Static181.method2795("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "[I")
	public static final int[] anIntArray294 = new int[128];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ph;IIIIIII)V")
	public static void method2276(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static87.anInt1883;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static95.anInt2024;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static27.anIntArrayArrayArray3[arg1][arg6][arg7] - Static57.anInt1428;
		@Pc(49) int local49 = Static27.anIntArrayArrayArray3[arg1][arg6 + 1][arg7] - Static57.anInt1428;
		@Pc(63) int local63 = Static27.anIntArrayArrayArray3[arg1][arg6 + 1][arg7 + 1] - Static57.anInt1428;
		@Pc(75) int local75 = Static27.anIntArrayArrayArray3[arg1][arg6][arg7 + 1] - Static57.anInt1428;
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
		@Pc(275) int local275 = Static24.anInt626 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static24.anInt628 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static24.anInt626 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static24.anInt628 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static24.anInt626 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static24.anInt628 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static24.anInt626 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static24.anInt628 + (local85 << 9) / local261;
		Static24.anInt627 = 0;
		@Pc(471) int local471;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static192.aBoolean178 && Static53.method1040(Static169.anInt3514 + Static24.anInt626, Static214.anInt4257 + Static24.anInt628, local315, local331, local299, local307, local323, local291)) {
				Static132.anInt2867 = arg6;
				Static201.anInt4001 = arg7;
			}
			Static24.aBoolean36 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static24.anInt625 || local323 > Static24.anInt625 || local291 > Static24.anInt625) {
				Static24.aBoolean36 = true;
			}
			if (arg0.anInt3057 == -1) {
				if (arg0.anInt3055 != 12345678) {
					Static24.method479(local315, local331, local299, local307, local323, local291, arg0.anInt3055, arg0.anInt3053, arg0.anInt3060);
				}
			} else if (Static171.aBoolean164) {
				local471 = Static24.anInterface3_1.method1292(arg0.anInt3057);
				Static24.method479(local315, local331, local299, local307, local323, local291, Static10.method286(local471, arg0.anInt3055), Static10.method286(local471, arg0.anInt3053), Static10.method286(local471, arg0.anInt3060));
			} else if (arg0.aBoolean145) {
				Static24.method461(local315, local331, local299, local307, local323, local291, arg0.anInt3055, arg0.anInt3053, arg0.anInt3060, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3057);
			} else {
				Static24.method461(local315, local331, local299, local307, local323, local291, arg0.anInt3055, arg0.anInt3053, arg0.anInt3060, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt3057);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static192.aBoolean178 && Static53.method1040(Static169.anInt3514 + Static24.anInt626, Static214.anInt4257 + Static24.anInt628, local283, local299, local331, local275, local291, local323)) {
			Static132.anInt2867 = arg6;
			Static201.anInt4001 = arg7;
		}
		Static24.aBoolean36 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static24.anInt625 || local291 > Static24.anInt625 || local323 > Static24.anInt625) {
			Static24.aBoolean36 = true;
		}
		if (arg0.anInt3057 != -1) {
			if (!Static171.aBoolean164) {
				Static24.method461(local283, local299, local331, local275, local291, local323, arg0.anInt3061, arg0.anInt3060, arg0.anInt3053, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3057);
				return;
			}
			local471 = Static24.anInterface3_1.method1292(arg0.anInt3057);
			Static24.method479(local283, local299, local331, local275, local291, local323, Static10.method286(local471, arg0.anInt3061), Static10.method286(local471, arg0.anInt3060), Static10.method286(local471, arg0.anInt3053));
		} else if (arg0.anInt3061 != 12345678) {
			Static24.method479(local283, local299, local331, local275, local291, local323, arg0.anInt3061, arg0.anInt3060, arg0.anInt3053);
			return;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!nh;")
	public static RuntimeException_Sub1 method2277(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString4 = local9.aString4 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
