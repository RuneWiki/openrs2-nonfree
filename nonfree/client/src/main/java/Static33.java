import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "[I")
	public static int[] anIntArray76;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "Lclient!sc;")
	private static Class107 aClass107_219 = Static231.method3737("Aug");

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "Lclient!sc;")
	private static Class107 aClass107_220 = Static231.method3737("Nov");

	@OriginalMember(owner = "client!ck", name = "X", descriptor = "Lclient!sc;")
	public static Class107 aClass107_221 = Static231.method3737("Konfig geladen)3");

	@OriginalMember(owner = "client!ck", name = "Y", descriptor = "Lclient!sc;")
	private static Class107 aClass107_222 = Static231.method3737("Sep");

	@OriginalMember(owner = "client!ck", name = "Z", descriptor = "[Lclient!mj;")
	public static Class5_Sub5_Sub2[] aClass5_Sub5_Sub2Array1 = new Class5_Sub5_Sub2[32768];

	@OriginalMember(owner = "client!ck", name = "eb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_224 = Static231.method3737("Jan");

	@OriginalMember(owner = "client!ck", name = "rb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_230 = Static231.method3737("Feb");

	@OriginalMember(owner = "client!ck", name = "sb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_231 = Static231.method3737("Mar");

	@OriginalMember(owner = "client!ck", name = "kb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_226 = Static231.method3737("Apr");

	@OriginalMember(owner = "client!ck", name = "fb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_225 = Static231.method3737("May");

	@OriginalMember(owner = "client!ck", name = "db", descriptor = "Lclient!sc;")
	private static Class107 aClass107_223 = Static231.method3737("Jun");

	@OriginalMember(owner = "client!ck", name = "qb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_229 = Static231.method3737("Jul");

	@OriginalMember(owner = "client!ck", name = "ob", descriptor = "Lclient!sc;")
	private static Class107 aClass107_227 = Static231.method3737("Oct");

	@OriginalMember(owner = "client!ck", name = "pb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_228 = Static231.method3737("Dec");

	@OriginalMember(owner = "client!ck", name = "cb", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array4 = new Class107[] { aClass107_224, aClass107_230, aClass107_231, aClass107_226, aClass107_225, aClass107_223, aClass107_229, aClass107_219, aClass107_222, aClass107_227, aClass107_220, aClass107_228 };

	@OriginalMember(owner = "client!ck", name = "gb", descriptor = "I")
	public static int anInt640 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!u;IIIIIIIZ)V")
	public static void method630(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static95.anInt2063;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static15.anInt343;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static166.anIntArrayArrayArray11[arg1][arg6][arg7] - Static156.anInt3421;
		@Pc(49) int local49 = Static166.anIntArrayArrayArray11[arg1][arg6 + 1][arg7] - Static156.anInt3421;
		@Pc(63) int local63 = Static166.anIntArrayArrayArray11[arg1][arg6 + 1][arg7 + 1] - Static156.anInt3421;
		@Pc(75) int local75 = Static166.anIntArrayArrayArray11[arg1][arg6][arg7 + 1] - Static156.anInt3421;
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
		@Pc(275) int local275 = Static74.anInt1682 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static74.anInt1680 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static74.anInt1682 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static74.anInt1680 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static74.anInt1682 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static74.anInt1680 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static74.anInt1682 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static74.anInt1680 + (local85 << 9) / local261;
		Static74.anInt1681 = 0;
		@Pc(473) int local473;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static231.aBoolean446 && Static216.method3529(Static3.anInt3933 + Static74.anInt1682, Static191.anInt4240 + Static74.anInt1680, local315, local331, local299, local307, local323, local291)) {
				Static192.anInt4246 = arg6;
				Static59.anInt1434 = arg7;
			}
			if (!arg8) {
				Static74.aBoolean154 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static74.anInt1684 || local323 > Static74.anInt1684 || local291 > Static74.anInt1684) {
					Static74.aBoolean154 = true;
				}
				if (arg0.anInt4434 == -1) {
					if (arg0.anInt4433 != 12345678) {
						Static74.method1323(local315, local331, local299, local307, local323, local291, arg0.anInt4433, arg0.anInt4432, arg0.anInt4425);
					}
				} else if (!Static153.aBoolean296) {
					local473 = Static74.anInterface4_1.method1632(arg0.anInt4434);
					Static74.method1323(local315, local331, local299, local307, local323, local291, Static196.method3174(local473, arg0.anInt4433), Static196.method3174(local473, arg0.anInt4432), Static196.method3174(local473, arg0.anInt4425));
				} else if (arg0.aBoolean392) {
					Static74.method1315(local315, local331, local299, local307, local323, local291, arg0.anInt4433, arg0.anInt4432, arg0.anInt4425, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4434);
				} else {
					Static74.method1315(local315, local331, local299, local307, local323, local291, arg0.anInt4433, arg0.anInt4432, arg0.anInt4425, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4434);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static231.aBoolean446 && Static216.method3529(Static3.anInt3933 + Static74.anInt1682, Static191.anInt4240 + Static74.anInt1680, local283, local299, local331, local275, local291, local323)) {
			Static192.anInt4246 = arg6;
			Static59.anInt1434 = arg7;
		}
		if (arg8) {
			return;
		}
		Static74.aBoolean154 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static74.anInt1684 || local291 > Static74.anInt1684 || local323 > Static74.anInt1684) {
			Static74.aBoolean154 = true;
		}
		if (arg0.anInt4434 != -1) {
			if (Static153.aBoolean296) {
				Static74.method1315(local283, local299, local331, local275, local291, local323, arg0.anInt4430, arg0.anInt4425, arg0.anInt4432, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4434);
				return;
			}
			local473 = Static74.anInterface4_1.method1632(arg0.anInt4434);
			Static74.method1323(local283, local299, local331, local275, local291, local323, Static196.method3174(local473, arg0.anInt4430), Static196.method3174(local473, arg0.anInt4425), Static196.method3174(local473, arg0.anInt4432));
		} else if (arg0.anInt4430 != 12345678) {
			Static74.method1323(local283, local299, local331, local275, local291, local323, arg0.anInt4430, arg0.anInt4425, arg0.anInt4432);
			return;
		}
	}
}
