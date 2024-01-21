import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
	public static int anInt971;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] aClass3_Sub2_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!eh;")
	private static Class28 aClass28_326 = Static170.method3101("K");

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_327 = aClass28_326;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_328 = aClass28_326;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	public static int anInt979 = 0;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "Lclient!eh;")
	public static Class28 aClass28_329 = Static170.method3101("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
	public static int anInt989 = 0;

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "Lclient!eh;")
	public static Class28 aClass28_330 = Static170.method3101("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "Lclient!pa;")
	public static Class63 aClass63_5 = new Class63(5);

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
	public static int anInt991 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public static void method795() {
		aClass28_326 = null;
		aClass3_Sub2_Sub2_Sub3Array2 = null;
		aClass63_5 = null;
		aClass28_328 = null;
		aClass28_329 = null;
		aBooleanArray5 = null;
		aClass28_330 = null;
		aClass28_327 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!wh;IIIIIII)V")
	public static void method796(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static34.anInt1037;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static76.anInt2272;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static35.anIntArrayArrayArray17[arg1][arg6][arg7] - Static125.anInt3217;
		@Pc(49) int local49 = Static35.anIntArrayArrayArray17[arg1][arg6 + 1][arg7] - Static125.anInt3217;
		@Pc(63) int local63 = Static35.anIntArrayArrayArray17[arg1][arg6 + 1][arg7 + 1] - Static125.anInt3217;
		@Pc(75) int local75 = Static35.anIntArrayArrayArray17[arg1][arg6][arg7 + 1] - Static125.anInt3217;
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
		@Pc(275) int local275 = Static13.anInt475 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static13.anInt468 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static13.anInt475 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static13.anInt468 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static13.anInt475 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static13.anInt468 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static13.anInt475 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static13.anInt468 + (local85 << 9) / local261;
		Static13.anInt472 = 0;
		@Pc(467) int local467;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static163.aBoolean187 && Static60.method1403(Static181.anInt4285, Static166.anInt4029, local315, local331, local299, local307, local323, local291)) {
				Static94.anInt2609 = arg6;
				Static17.anInt512 = arg7;
			}
			Static13.aBoolean29 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static13.anInt467 || local323 > Static13.anInt467 || local291 > Static13.anInt467) {
				Static13.aBoolean29 = true;
			}
			if (arg0.anInt4284 == -1) {
				if (arg0.anInt4283 != 12345678) {
					Static13.method521(local315, local331, local299, local307, local323, local291, arg0.anInt4283, arg0.anInt4288, arg0.anInt4290);
				}
			} else if (Static92.aBoolean194) {
				local467 = Static13.anInterface2_1.method1825(arg0.anInt4284);
				Static13.method521(local315, local331, local299, local307, local323, local291, Static7.method215(local467, arg0.anInt4283), Static7.method215(local467, arg0.anInt4288), Static7.method215(local467, arg0.anInt4290));
			} else if (arg0.aBoolean203) {
				Static13.method508(local315, local331, local299, local307, local323, local291, arg0.anInt4283, arg0.anInt4288, arg0.anInt4290, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4284);
			} else {
				Static13.method508(local315, local331, local299, local307, local323, local291, arg0.anInt4283, arg0.anInt4288, arg0.anInt4290, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4284);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static163.aBoolean187 && Static60.method1403(Static181.anInt4285, Static166.anInt4029, local283, local299, local331, local275, local291, local323)) {
			Static94.anInt2609 = arg6;
			Static17.anInt512 = arg7;
		}
		Static13.aBoolean29 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static13.anInt467 || local291 > Static13.anInt467 || local323 > Static13.anInt467) {
			Static13.aBoolean29 = true;
		}
		if (arg0.anInt4284 != -1) {
			if (!Static92.aBoolean194) {
				Static13.method508(local283, local299, local331, local275, local291, local323, arg0.anInt4287, arg0.anInt4290, arg0.anInt4288, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4284);
				return;
			}
			local467 = Static13.anInterface2_1.method1825(arg0.anInt4284);
			Static13.method521(local283, local299, local331, local275, local291, local323, Static7.method215(local467, arg0.anInt4287), Static7.method215(local467, arg0.anInt4290), Static7.method215(local467, arg0.anInt4288));
		} else if (arg0.anInt4287 != 12345678) {
			Static13.method521(local283, local299, local331, local275, local291, local323, arg0.anInt4287, arg0.anInt4290, arg0.anInt4288);
			return;
		}
	}
}
