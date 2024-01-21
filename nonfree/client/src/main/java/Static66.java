import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!kb;")
	public static Class41 aClass41_31;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Lclient!n;")
	public static Class51 aClass51_9;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "Lclient!j;")
	public static Class1_Sub8 aClass1_Sub8_3;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public static int anInt3170;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_23;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Lclient!af;")
	private static Class5 aClass5_1398 = Static45.method1937("Use");

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_1396 = aClass5_1398;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Lclient!af;")
	public static Class5 aClass5_1397 = Static45.method1937(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!nd;")
	public static Class53 aClass53_17 = new Class53();

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Lclient!bd;")
	public static Class7 aClass7_14 = new Class7(8);

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
	public static int anInt3169 = 0;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "Lclient!af;")
	public static Class5 aClass5_1399 = Static45.method1937("runes");

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "[I")
	public static int[] anIntArray453 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)Z")
	public static boolean method2193(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V")
	public static void method2195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static33.method1981(arg2, arg0, arg3 + arg2, arg0 - -arg1);
		Static114.method1995();
		Static122.anInt3127++;
		Static74.method1274(true);
		Static42.method787(true);
		Static74.method1274(false);
		Static42.method787(false);
		Static93.method1593();
		Static1.method54();
		@Pc(40) int local40;
		@Pc(60) int local60;
		if (!Static104.aBoolean102) {
			local40 = Static8.anInt263;
			if (local40 < Static11.anInt323 / 256) {
				local40 = Static11.anInt323 / 256;
			}
			local60 = Static3.anInt58 + Static22.anInt716 & 0x7FF;
			if (Static19.aBooleanArray9[4] && local40 < Static21.anIntArray86[4] + 128) {
				local40 = Static21.anIntArray86[4] + 128;
			}
			Static5.method176(Static57.anInt1364, Static102.method1746(Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079, Static7.anInt213, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089) - 50, local40, local40 * 3 + 600, Static125.anInt3203, local60);
		}
		if (Static104.aBoolean102) {
			local40 = Static126.method2238();
		} else {
			local40 = Static39.method777();
		}
		local60 = anInt3170;
		@Pc(120) int local120 = Static91.anInt2286;
		@Pc(122) int local122 = Static121.anInt3115;
		@Pc(124) int local124 = Static109.anInt2693;
		@Pc(126) int local126 = Static76.anInt1794;
		@Pc(169) int local169;
		for (@Pc(128) int local128 = 0; local128 < 5; local128++) {
			if (Static19.aBooleanArray9[local128]) {
				local169 = (int) ((double) (Static26.anIntArray94[local128] * 2 + 1) * Math.random() - (double) Static26.anIntArray94[local128] + Math.sin((double) Static56.anIntArray221[local128] / 100.0D * (double) Static48.anIntArray195[local128]) * (double) Static21.anIntArray86[local128]);
				if (local128 == 4) {
					Static109.anInt2693 += local169;
					if (Static109.anInt2693 < 128) {
						Static109.anInt2693 = 128;
					}
					if (Static109.anInt2693 > 383) {
						Static109.anInt2693 = 383;
					}
				}
				if (local128 == 2) {
					Static121.anInt3115 += local169;
				}
				if (local128 == 0) {
					anInt3170 += local169;
				}
				if (local128 == 1) {
					Static91.anInt2286 += local169;
				}
				if (local128 == 3) {
					Static76.anInt1794 = Static76.anInt1794 + local169 & 0x7FF;
				}
			}
		}
		@Pc(226) int local226 = Static97.anInt2395;
		local169 = Static98.anInt2407;
		if (arg2 <= local169 && local169 < arg3 + arg2 && local226 >= arg0 && local226 < arg0 + arg1) {
			Static31.anInt916 = Static98.anInt2407 - arg2;
			Static31.aBoolean29 = true;
			Static31.anInt918 = 0;
			Static31.anInt919 = Static97.anInt2395 - arg0;
		} else {
			Static31.anInt918 = 0;
			Static31.aBoolean29 = false;
		}
		Static101.method1733();
		Static33.method1984(arg2, arg0, arg3, arg1, 0);
		Static101.method1733();
		Static44.aClass68_1.method1867(anInt3170, Static91.anInt2286, Static121.anInt3115, Static109.anInt2693, Static76.anInt1794, local40);
		Static101.method1733();
		Static44.aClass68_1.method1860();
		Static89.method2147(arg1, arg2, arg3, arg0);
		Static120.method1347(arg0, arg2);
		((Class39) Static114.anInterface3_1).method1044(Static95.anInt2359);
		Static62.method1707(arg1, arg2, arg0, arg3);
		Static121.anInt3115 = local122;
		Static109.anInt2693 = local124;
		Static76.anInt1794 = local126;
		Static91.anInt2286 = local120;
		anInt3170 = local60;
		if (Static81.aBoolean69 && Static75.method1287() == 0) {
			Static81.aBoolean69 = false;
		}
		if (Static81.aBoolean69) {
			Static33.method1984(arg2, arg0, arg3, arg1, 0);
			Static40.method783(Static12.aClass5_1454, false);
		}
		if (!Static81.aBoolean69 && !Static69.aBoolean48 && local169 >= arg2 && local169 < arg2 + arg3 && local226 >= arg0 && local226 < arg0 + arg1) {
			Static43.method793(arg2, local226, arg0, local169);
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public static void method2196() {
		aClass41_Sub1_23 = null;
		aClass53_17 = null;
		aClass5_1398 = null;
		aClass7_14 = null;
		aClass51_9 = null;
		aClass5_1397 = null;
		aClass5_1396 = null;
		aClass41_31 = null;
		anIntArray453 = null;
		aClass5_1399 = null;
		aClass1_Sub8_3 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILclient!ne;)V")
	public static void method2197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub3_Sub12 arg3) {
		if (Static18.anInt3043 >= 400) {
			return;
		}
		if (arg3.anIntArray324 != null) {
			arg3 = arg3.method1475();
		}
		if (arg3 == null || !arg3.aBoolean73) {
			return;
		}
		@Pc(35) Class5 local35 = arg3.aClass5_1028;
		if (arg3.anInt2114 != 0) {
			local35 = Static100.method1696(new Class5[] { local35, Static10.method279(arg3.anInt2114, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt2001), Static91.aClass5_1095, Static36.aClass5_441, Static48.method838(arg3.anInt2114), Static76.aClass5_890 });
		}
		if (Static120.anInt1840 == 1) {
			Static18.method2149(arg2, arg1, Static100.method1696(new Class5[] { Static74.aClass5_851, Static30.aClass5_406, local35 }), aClass5_1396, 44, arg0);
		} else if (!Static47.aBoolean35) {
			@Pc(120) Class5[] local120 = arg3.aClass5Array16;
			if (Static48.aBoolean36) {
				local120 = Static39.method770(local120);
			}
			@Pc(130) int local130;
			if (local120 != null) {
				for (local130 = 4; local130 >= 0; local130--) {
					if (local120[local130] != null && !local120[local130].method207(Static46.aClass5_574)) {
						@Pc(149) byte local149 = 0;
						if (local130 == 0) {
							local149 = 32;
						}
						if (local130 == 1) {
							local149 = 35;
						}
						if (local130 == 2) {
							local149 = 24;
						}
						if (local130 == 3) {
							local149 = 23;
						}
						if (local130 == 4) {
							local149 = 26;
						}
						Static18.method2149(arg2, arg1, Static100.method1696(new Class5[] { Static48.aClass5_583, local35 }), local120[local130], local149, arg0);
					}
				}
			}
			if (local120 != null) {
				for (local130 = 4; local130 >= 0; local130--) {
					if (local120[local130] != null && local120[local130].method207(Static46.aClass5_574)) {
						@Pc(223) short local223 = 0;
						if (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt2001 < arg3.anInt2114) {
							local223 = 2000;
						}
						@Pc(240) int local240 = 0;
						if (local130 == 0) {
							local240 = local223 + 32;
						}
						if (local130 == 1) {
							local240 = local223 + 35;
						}
						if (local130 == 2) {
							local240 = local223 + 24;
						}
						if (local130 == 3) {
							local240 = local223 + 23;
						}
						if (local130 == 4) {
							local240 = local223 + 26;
						}
						Static18.method2149(arg2, arg1, Static100.method1696(new Class5[] { Static48.aClass5_583, local35 }), local120[local130], local240, arg0);
					}
				}
			}
			Static18.method2149(arg2, arg1, Static100.method1696(new Class5[] { Static48.aClass5_583, local35 }), Static28.aClass5_403, 1005, arg0);
		} else if ((Static8.anInt265 & 0x2) == 2) {
			Static18.method2149(arg2, arg1, Static100.method1696(new Class5[] { Static108.aClass5_1252, Static30.aClass5_406, local35 }), Static80.aClass5_989, 46, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
	public static void method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static18.anInt3043 < 2 && Static120.anInt1840 == 0 && !Static47.aBoolean35) {
			return;
		}
		@Pc(58) Class5 local58;
		if (Static120.anInt1840 == 1 && Static18.anInt3043 < 2) {
			local58 = Static100.method1696(new Class5[] { aClass5_1396, Static121.aClass5_1384, Static74.aClass5_851, Static5.aClass5_105 });
		} else if (Static47.aBoolean35 && Static18.anInt3043 < 2) {
			local58 = Static100.method1696(new Class5[] { Static80.aClass5_989, Static121.aClass5_1384, Static108.aClass5_1252, Static5.aClass5_105 });
		} else {
			local58 = Static72.method1233(Static18.anInt3043 - 1);
		}
		if (Static18.anInt3043 > 2) {
			local58 = Static100.method1696(new Class5[] { local58, Static126.aClass5_1440, Static48.method838(Static18.anInt3043 - 2), Static65.aClass5_792 });
		}
		Static25.aClass1_Sub3_Sub1_Sub1_1.method156(local58, arg0 + 4, arg1 + 15, Static131.anInt3270 / 1000);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)V")
	public static void method2201(@OriginalArg(1) boolean arg0) {
		Static101.method1733();
		Static7.anInt210++;
		if (Static7.anInt210 < 50 && !arg0) {
			return;
		}
		Static7.anInt210 = 0;
		if (Static43.aBoolean34 || Static11.aClass78_2 == null) {
			return;
		}
		Static44.aClass1_Sub20_Sub1_1.method2108(118);
		try {
			Static11.aClass78_2.method2182(Static44.aClass1_Sub20_Sub1_1.anInt2951, Static44.aClass1_Sub20_Sub1_1.aByteArray36);
			Static44.aClass1_Sub20_Sub1_1.anInt2951 = 0;
		} catch (@Pc(47) IOException local47) {
			Static43.aBoolean34 = true;
		}
	}
}
