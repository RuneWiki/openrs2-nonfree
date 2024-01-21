import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!pe;")
	public static Class13 aClass13_13;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
	public static int anInt1930;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] aClass2_Sub1_Sub7_Sub4Array5;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_457 = Static158.method3034("Dec");

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_458 = Static158.method3034("Aug");

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_459 = Static158.method3034("Nov");

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_460 = Static158.method3034("Apr");

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_461 = Static158.method3034("Sep");

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_462 = Static158.method3034("Jan");

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_464 = Static158.method3034("Feb");

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_465 = Static158.method3034("Mar");

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_467 = Static158.method3034("May");

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_466 = Static158.method3034("Jun");

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_463 = Static158.method3034("Jul");

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_468 = Static158.method3034("Oct");

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array11 = new Class60[] { aClass60_462, aClass60_464, aClass60_465, aClass60_460, aClass60_467, aClass60_466, aClass60_463, aClass60_458, aClass60_461, aClass60_468, aClass60_459, aClass60_457 };

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Lclient!na;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array12 = new Class60[8];

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
	public static int anInt1932 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!hf;IIIIIII)V")
	public static void method1445(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static18.anInt4397;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static36.anInt1081;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static100.anIntArrayArrayArray5[arg1][arg6][arg7] - Static145.anInt3794;
		@Pc(49) int local49 = Static100.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static145.anInt3794;
		@Pc(63) int local63 = Static100.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static145.anInt3794;
		@Pc(75) int local75 = Static100.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static145.anInt3794;
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
		@Pc(275) int local275 = Static45.anInt1423 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static45.anInt1421 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static45.anInt1423 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static45.anInt1421 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static45.anInt1423 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static45.anInt1421 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static45.anInt1423 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static45.anInt1421 + (local85 << 9) / local261;
		Static45.anInt1422 = 0;
		@Pc(467) int local467;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static27.aBoolean30 && Static162.method3068(Static33.anInt1074, Static31.anInt988, local315, local331, local299, local307, local323, local291)) {
				Static179.anInt4364 = arg6;
				Static27.anInt829 = arg7;
			}
			Static45.aBoolean49 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static45.anInt1424 || local323 > Static45.anInt1424 || local291 > Static45.anInt1424) {
				Static45.aBoolean49 = true;
			}
			if (arg0.anInt2139 == -1) {
				if (arg0.anInt2143 != 12345678) {
					Static45.method1052(local315, local331, local299, local307, local323, local291, arg0.anInt2143, arg0.anInt2141, arg0.anInt2140);
				}
			} else if (Static29.aBoolean35) {
				local467 = Static45.anInterface1_2.method2884(arg0.anInt2139);
				Static45.method1052(local315, local331, local299, local307, local323, local291, Static26.method639(local467, arg0.anInt2143), Static26.method639(local467, arg0.anInt2141), Static26.method639(local467, arg0.anInt2140));
			} else if (arg0.aBoolean91) {
				Static45.method1047(local315, local331, local299, local307, local323, local291, arg0.anInt2143, arg0.anInt2141, arg0.anInt2140, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2139);
			} else {
				Static45.method1047(local315, local331, local299, local307, local323, local291, arg0.anInt2143, arg0.anInt2141, arg0.anInt2140, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt2139);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static27.aBoolean30 && Static162.method3068(Static33.anInt1074, Static31.anInt988, local283, local299, local331, local275, local291, local323)) {
			Static179.anInt4364 = arg6;
			Static27.anInt829 = arg7;
		}
		Static45.aBoolean49 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static45.anInt1424 || local291 > Static45.anInt1424 || local323 > Static45.anInt1424) {
			Static45.aBoolean49 = true;
		}
		if (arg0.anInt2139 != -1) {
			if (!Static29.aBoolean35) {
				Static45.method1047(local283, local299, local331, local275, local291, local323, arg0.anInt2135, arg0.anInt2140, arg0.anInt2141, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2139);
				return;
			}
			local467 = Static45.anInterface1_2.method2884(arg0.anInt2139);
			Static45.method1052(local283, local299, local331, local275, local291, local323, Static26.method639(local467, arg0.anInt2135), Static26.method639(local467, arg0.anInt2140), Static26.method639(local467, arg0.anInt2141));
		} else if (arg0.anInt2135 != 12345678) {
			Static45.method1052(local283, local299, local331, local275, local291, local323, arg0.anInt2135, arg0.anInt2140, arg0.anInt2141);
			return;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZZ)V")
	public static void method1446(@OriginalArg(0) boolean arg0) {
		if (Static197.anInt4656 == Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 >> 7 && Static194.anInt4620 == Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 >> 7) {
			Static197.anInt4656 = 0;
		}
		@Pc(27) int local27 = Static166.anInt4101;
		if (arg0) {
			local27 = 1;
		}
		for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
			@Pc(45) Class2_Sub1_Sub1_Sub3_Sub1 local45;
			@Pc(43) long local43;
			if (arg0) {
				local43 = 8791798054912L;
				local45 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1;
			} else {
				local45 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[Static169.anIntArray458[local37]];
				local43 = (long) Static169.anIntArray458[local37] << 32;
			}
			if (local45 != null && local45.method2554()) {
				@Pc(71) int local71 = local45.anInt3302 >> 7;
				local45.aBoolean45 = false;
				if ((Static8.aBoolean3 && Static166.anInt4101 > 50 || Static166.anInt4101 > 200) && !arg0 && local45.anInt3289 == local45.anInt3250) {
					local45.aBoolean45 = true;
				}
				@Pc(99) int local99 = local45.anInt3273 >> 7;
				if (local71 >= 0 && local71 < 104 && local99 >= 0 && local99 < 104) {
					if (local45.aClass2_Sub1_Sub1_Sub4_1 == null || local45.anInt1275 > Static20.anInt580 || local45.anInt1269 <= Static20.anInt580) {
						if ((local45.anInt3302 & 0x7F) == 64 && (local45.anInt3273 & 0x7F) == 64) {
							if (Static46.anInt1431 == Static191.anIntArrayArray33[local71][local99]) {
								continue;
							}
							Static191.anIntArrayArray33[local71][local99] = Static46.anInt1431;
						}
						local45.anInt3283 = Static182.method3393(Static62.anInt1923, local45.anInt3302, local45.anInt3273);
						Static98.method2268(Static62.anInt1923, local45.anInt3302, local45.anInt3273, local45.anInt3283, 60, local45, local45.anInt3265, local43, local45.aBoolean121);
					} else {
						local45.aBoolean45 = false;
						local45.anInt3283 = Static182.method3393(Static62.anInt1923, local45.anInt3302, local45.anInt3273);
						Static21.method475(Static62.anInt1923, local45.anInt3302, local45.anInt3273, local45.anInt3283, local45, local45.anInt3265, local43, local45.anInt1288, local45.anInt1286, local45.anInt1277, local45.anInt1280);
					}
				}
			}
		}
	}
}
