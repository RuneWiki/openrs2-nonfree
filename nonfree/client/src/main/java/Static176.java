import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!is", name = "W", descriptor = "Lclient!hh;")
	public static Class109 aClass109_45;

	@OriginalMember(owner = "client!is", name = "V", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_47 = new Class96("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V")
	public static void method2834() {
		Static119.anInt2296 = 0;
		Static251.aClass142_26.method3206();
		Static251.aClass142_26.method3212(Static101.aClass1_Sub3_1);
		Static119.anInt2296++;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIII)V")
	public static void method2835(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class262[] local7 = Static416.aClass262Array1;
		for (@Pc(14) int local14 = 0; local14 < local7.length; local14++) {
			@Pc(20) Class262 local20 = local7[local14];
			if (local20 != null && local20.anInt7695 == 2) {
				Static45.method610(local20.anInt7697, arg1 >> 1, arg2 >> 1, local20.anInt7696, local20.anInt7693 * 2, local20.anInt7694);
				if (Static116.anIntArray114[0] > -1 && Static123.anInt2333 % 20 < 10) {
					Static343.aClass78Array10[local20.anInt7701].method6003(arg0 + Static116.anIntArray114[0] - 12, arg3 + -28 + Static116.anIntArray114[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIBII)V")
	public static void method2836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static346.anInt6355; local7++) {
			@Pc(13) Rectangle local13 = Class1_Sub31.aRectangleArray2[local7];
			if (arg1 < local13.x + local13.width && arg1 + arg2 > local13.x && local13.y + local13.height > arg0 && local13.y < arg3 + arg0) {
				Static204.aBooleanArray15[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2837(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static342.anInt6234; local11++) {
			if (arg0.equalsIgnoreCase(Static396.aStringArray40[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static255.aClass47_Sub1_Sub5_Sub2_2.aString66);
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(IIIIIII)V")
	public static void method2839(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static97.anInt1902;
		Static390.anInt7009 = 0;
		@Pc(11) int[] local11 = Static105.anIntArray107;
		@Pc(171) int local171;
		@Pc(216) int local216;
		@Pc(262) int local262;
		@Pc(345) int local345;
		@Pc(425) int local425;
		@Pc(860) int local860;
		@Pc(527) int local527;
		for (@Pc(13) int local13 = 0; local13 < Static47.anInt760 + local7; local13++) {
			@Pc(17) Class196 local17 = null;
			@Pc(32) Class47_Sub1_Sub5 local32;
			if (local13 >= local7) {
				local32 = Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local13 - local7]];
				local17 = ((Class47_Sub1_Sub5_Sub1) local32).aClass196_1;
				if (local17.anIntArray419 != null) {
					local17 = local17.method4412(Static237.aClass80_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local32 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local11[local13]];
			}
			if (local32.anInt5361 >= 0 && (local32.anInt5376 == Static177.anInt3327 || Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 == local32.aByte97)) {
				Static323.method4482(local32, local32.method4323(), arg0 >> 1, arg2 >> 1);
				if (Static116.anIntArray114[0] >= 0) {
					if (local32.aString64 != null && (local13 >= local7 || Static52.anInt922 == 0 || Static52.anInt922 == 3 || Static52.anInt922 == 1 && method2837(((Class47_Sub1_Sub5_Sub2) local32).aString66)) && Static390.anInt7009 < Static427.anInt7222) {
						Static427.anIntArray539[Static390.anInt7009] = Static126.aClass62_6.method1157(local32.aString64) / 2;
						Static427.anIntArray541[Static390.anInt7009] = Static116.anIntArray114[0];
						Static427.anIntArray538[Static390.anInt7009] = Static116.anIntArray114[1];
						Static427.anIntArray540[Static390.anInt7009] = local32.anInt5384;
						Static427.anIntArray543[Static390.anInt7009] = local32.anInt5353;
						Static427.anIntArray542[Static390.anInt7009] = local32.anInt5369;
						Static427.aStringArray42[Static390.anInt7009] = local32.aString64;
						Static390.anInt7009++;
					}
					local171 = arg3 + Static116.anIntArray114[1];
					@Pc(247) Class78[] local247;
					@Pc(254) Class63[] local254;
					@Pc(316) Class78 local316;
					if (local32.aBoolean430 || local32.anInt5363 <= Static123.anInt2333) {
						local171 -= Math.max(Static126.aClass62_6.anInt1455, Static272.aClass78Array6[0].qa());
					} else {
						@Pc(198) byte local198 = 1;
						if (local7 > local13) {
							@Pc(211) Class47_Sub1_Sub5_Sub2 local211 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local11[local13]];
							local216 = local32.method4327().anInt6991;
							if (local211.aBoolean438) {
								local198 = 2;
							}
						} else {
							local216 = local17.anInt5555;
							if (local216 == -1) {
								local216 = local32.method4327().anInt6991;
							}
						}
						@Pc(236) Class78[] local236 = Static272.aClass78Array6;
						if (local216 != -1) {
							local247 = (Class78[]) Static291.aClass151_187.method3288((long) local216);
							if (local247 == null) {
								local254 = Static457.method1166(Static353.aClass109_79, local216);
								if (local254 != null) {
									local247 = new Class78[local254.length];
									for (local262 = 0; local262 < local254.length; local262++) {
										local247[local262] = Static447.aClass121_11.method4589(local254[local262]);
									}
									Static291.aClass151_187.method3291((long) local216, local247);
								}
							}
							if (local247 != null && local247.length >= 2) {
								local236 = local247;
							}
						}
						if (local198 >= local236.length) {
							local198 = 1;
						}
						@Pc(312) Class78 local312 = local236[0];
						local316 = local236[local198];
						local171 -= Math.max(Static126.aClass62_6.anInt1455, local312.qa());
						local262 = arg1 + Static116.anIntArray114[0] - (local312.UA() >> 1);
						local345 = local312.UA() * local32.anInt5377 / 255;
						if (local32.anInt5377 > 0 && local345 < 2) {
							local345 = 2;
						}
						local312.method6003(local262, local171);
						Static447.aClass121_11.Z(local262, local171, local345 + local262, local171 - -local312.qa());
						local316.method6003(local262, local171);
						Static447.aClass121_11.pa(arg1, arg3, arg1 + arg0, arg3 - -arg2);
					}
					local171 -= 2;
					if (!local32.aBoolean430) {
						@Pc(406) Class78 local406;
						if (local32.anInt5352 > Static123.anInt2333) {
							local406 = Static397.aClass78Array12[local32.aBoolean431 ? 2 : 0];
							@Pc(415) Class78 local415 = Static397.aClass78Array12[local32.aBoolean431 ? 3 : 1];
							if (local32 instanceof Class47_Sub1_Sub5_Sub1) {
								local425 = local17.anInt5561;
								if (local425 == -1) {
									local425 = local32.method4327().anInt6985;
								}
							} else {
								local425 = local32.method4327().anInt6985;
							}
							if (local425 != -1) {
								local247 = (Class78[]) Static111.aClass151_55.method3288((long) local425);
								if (local247 == null) {
									local254 = Static457.method1166(Static353.aClass109_79, local425);
									if (local254 != null) {
										local247 = new Class78[local254.length];
										for (local262 = 0; local262 < local254.length; local262++) {
											local247[local262] = Static447.aClass121_11.method4589(local254[local262]);
										}
										Static111.aClass151_55.method3291((long) local425, local247);
									}
								}
								if (local247 != null && local247.length == 4) {
									local415 = local247[local32.aBoolean431 ? 3 : 1];
									local406 = local247[local32.aBoolean431 ? 2 : 0];
								}
							}
							@Pc(520) int local520 = local32.anInt5352 - Static123.anInt2333;
							if (local32.anInt5417 >= local520) {
								local527 = local406.UA();
							} else {
								local520 -= local32.anInt5417;
								local262 = local32.anInt5402 == 0 ? 0 : (local32.anInt5367 - local520) / local32.anInt5402 * local32.anInt5402;
								local527 = local262 * local406.UA() / local32.anInt5367;
							}
							local262 = local406.qa();
							local171 -= local262;
							local345 = arg1 + Static116.anIntArray114[0] - (local406.UA() >> 1);
							local406.method6003(local345, local171);
							Static447.aClass121_11.Z(local345, local171, local345 + local527, local171 + local262);
							local415.method6003(local345, local171);
							Static447.aClass121_11.pa(arg1, arg3, arg0 + arg1, arg3 + arg2);
							local171 -= 2;
						}
						if (local13 < local7) {
							@Pc(645) Class47_Sub1_Sub5_Sub2 local645 = (Class47_Sub1_Sub5_Sub2) local32;
							if (local645.anInt5424 != -1) {
								local171 -= 25;
								Static228.aClass78Array5[local645.anInt5424].method6003(arg1 + Static116.anIntArray114[0] - 12, local171);
								local171 -= 2;
							}
							if (local645.anInt5448 != -1) {
								local171 -= 25;
								Static298.aClass78Array8[local645.anInt5448].method6003(arg1 + Static116.anIntArray114[0] - 12, local171);
								local171 -= 2;
							}
						} else if (local17.anInt5565 >= 0 && Static298.aClass78Array8.length > local17.anInt5565) {
							local406 = Static298.aClass78Array8[local17.anInt5565];
							local171 -= 25;
							local406.method6003(arg1 + Static116.anIntArray114[0] - (local406.UA() >> 1), local171);
							local171 -= 2;
						}
					}
					@Pc(693) Class262[] local693;
					@Pc(701) Class262 local701;
					if (!(local32 instanceof Class47_Sub1_Sub5_Sub2)) {
						local216 = 0;
						local693 = Static416.aClass262Array1;
						for (local425 = 0; local425 < local693.length; local425++) {
							local701 = local693[local425];
							if (local701 != null && local701.anInt7695 == 1 && local701.anInt7698 == Static151.anIntArray211[local13 - local7]) {
								local316 = Static343.aClass78Array10[local701.anInt7701];
								if (local216 < local316.qa()) {
									local216 = local316.qa();
								}
								if (Static123.anInt2333 % 20 < 10) {
									local316.method6003(Static116.anIntArray114[0] + arg1 - 12, -local316.qa() + local171);
								}
							}
						}
						if (local216 > 0) {
						}
					} else if (local13 >= 0) {
						local216 = 0;
						local693 = Static416.aClass262Array1;
						for (local425 = 0; local425 < local693.length; local425++) {
							local701 = local693[local425];
							if (local701 != null && local701.anInt7695 == 10 && local11[local13] == local701.anInt7698) {
								local316 = Static343.aClass78Array10[local701.anInt7701];
								if (local216 < local316.qa()) {
									local216 = local316.qa();
								}
								local316.method6003(arg1 + Static116.anIntArray114[0] - 12, local171 + -local316.qa());
							}
						}
						if (local216 > 0) {
						}
					}
					for (local216 = 0; local216 < 4; local216++) {
						if (Static123.anInt2333 < local32.anIntArray405[local216]) {
							local860 = local32.method4323() / 2;
							Static323.method4482(local32, local860, arg0 >> 1, arg2 >> 1);
							if (Static116.anIntArray114[0] > -1) {
								if (local216 == 1) {
									Static116.anIntArray114[1] -= 20;
								}
								if (local216 == 2) {
									Static116.anIntArray114[0] -= 15;
									Static116.anIntArray114[1] -= 10;
								}
								if (local216 == 3) {
									Static116.anIntArray114[0] += 15;
									Static116.anIntArray114[1] -= 10;
								}
								Static45.aClass78Array3[local32.anIntArray406[local216]].method6003(arg1 + Static116.anIntArray114[0] - 12, Static116.anIntArray114[1] + (arg3 - 12));
								Static209.aClass4_6.method5840(-1, arg3 + Static116.anIntArray114[1] + 3, 0, arg1 + Static116.anIntArray114[0] - 1, Integer.toString(local32.anIntArray404[local216]));
							}
						}
					}
				}
			}
		}
		@Pc(990) int local990;
		for (@Pc(984) int local984 = 0; local984 < Static340.anInt6179; local984++) {
			local990 = Static333.anIntArray447[local984];
			@Pc(999) Class47_Sub1_Sub5 local999;
			if (local990 < 2048) {
				local999 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local990];
			} else {
				local999 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local990 - 2048];
			}
			local216 = Static265.anIntArray354[local984];
			@Pc(1020) Class47_Sub1_Sub5 local1020;
			if (local216 < 2048) {
				local1020 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local216];
			} else {
				local1020 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local216 - 2048];
			}
			Static183.method2947(arg2, arg0, arg3, local999, local1020, arg1, --local999.anInt5346);
		}
		local990 = Static126.aClass62_6.anInt1455 + Static126.aClass62_6.anInt1460 + 2;
		for (local171 = 0; local171 < Static390.anInt7009; local171++) {
			local216 = Static427.anIntArray541[local171];
			local860 = Static427.anIntArray538[local171];
			local425 = Static427.anIntArray539[local171];
			@Pc(1076) boolean local1076 = true;
			while (local1076) {
				local1076 = false;
				for (local527 = 0; local527 < local171; local527++) {
					if (local860 + 2 > -local990 + Static427.anIntArray538[local527] && local860 - local990 < Static427.anIntArray538[local527] + 2 && Static427.anIntArray539[local527] + Static427.anIntArray541[local527] > local216 + -local425 && Static427.anIntArray541[local527] - Static427.anIntArray539[local527] < local216 + local425 && local860 > Static427.anIntArray538[local527] - local990) {
						local860 = Static427.anIntArray538[local527] - local990;
						local1076 = true;
					}
				}
			}
			Static427.anIntArray538[local171] = local860;
			@Pc(1167) String local1167 = Static427.aStringArray42[local171];
			if (Static147.anInt3260 == 0) {
				local262 = 16776960;
				if (Static427.anIntArray540[local171] < 6) {
					local262 = Static90.anIntArray84[Static427.anIntArray540[local171]];
				}
				if (Static427.anIntArray540[local171] == 6) {
					local262 = Static177.anInt3327 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static427.anIntArray540[local171] == 7) {
					local262 = Static177.anInt3327 % 20 >= 10 ? 65535 : 255;
				}
				if (Static427.anIntArray540[local171] == 8) {
					local262 = Static177.anInt3327 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static427.anIntArray540[local171] == 9) {
					local345 = 150 - Static427.anIntArray542[local171];
					if (local345 < 50) {
						local262 = local345 * 1280 + 16711680;
					} else if (local345 < 100) {
						local262 = 16776960 - (local345 - 50) * 327680;
					} else if (local345 < 150) {
						local262 = local345 * 5 + 65280 - 500;
					}
				}
				if (Static427.anIntArray540[local171] == 10) {
					local345 = 150 - Static427.anIntArray542[local171];
					if (local345 < 50) {
						local262 = local345 * 5 + 16711680;
					} else if (local345 < 100) {
						local262 = 16384000 + 16711935 - local345 * 327680;
					} else if (local345 < 150) {
						local262 = local345 * 327680 + 255 - (local345 - 100) * 5 - 32768000;
					}
				}
				if (Static427.anIntArray540[local171] == 11) {
					local345 = 150 - Static427.anIntArray542[local171];
					if (local345 < 50) {
						local262 = 16777215 - local345 * 327685;
					} else if (local345 < 100) {
						local262 = (local345 - 50) * 327685 + 65280;
					} else if (local345 < 150) {
						local262 = 16777215 + 32768000 - local345 * 327680;
					}
				}
				local345 = local262 | 0xFF000000;
				if (Static427.anIntArray543[local171] == 0) {
					Static237.aClass4_5.method5840(local345, arg3 + local860, -16777216, arg1 + local216, local1167);
				}
				if (Static427.anIntArray543[local171] == 1) {
					Static237.aClass4_5.method5837(local1167, local345, arg1 + local216, arg3 + local860, Static177.anInt3327);
				}
				if (Static427.anIntArray543[local171] == 2) {
					Static237.aClass4_5.method5844(arg3 + local860, Static177.anInt3327, local1167, arg1 + local216, local345);
				}
				if (Static427.anIntArray543[local171] == 3) {
					Static237.aClass4_5.method5849(local345, 150 - Static427.anIntArray542[local171], local1167, arg1 + local216, arg3 - -local860, Static177.anInt3327);
				}
				@Pc(1522) int local1522;
				if (Static427.anIntArray543[local171] == 4) {
					local1522 = (150 - Static427.anIntArray542[local171]) * (Static126.aClass62_6.method1157(local1167) + 100) / 150;
					Static447.aClass121_11.Z(arg1 + local216 - 50, arg3, arg1 + local216 + 50, arg2 + arg3);
					Static237.aClass4_5.method5839(-16777216, local860 + arg3, local345, local216 + arg1 + 50 - local1522, local1167);
					Static447.aClass121_11.pa(arg1, arg3, arg1 + arg0, arg2 + arg3);
				}
				if (Static427.anIntArray543[local171] == 5) {
					local1522 = 150 - Static427.anIntArray542[local171];
					@Pc(1581) int local1581 = 0;
					if (local1522 < 25) {
						local1581 = local1522 - 25;
					} else if (local1522 > 125) {
						local1581 = local1522 - 125;
					}
					@Pc(1605) int local1605 = Static126.aClass62_6.anInt1460 + Static126.aClass62_6.anInt1455;
					Static447.aClass121_11.Z(arg1, arg3 + local860 - local1605 - 1, arg1 - -arg0, arg3 + local860 + 5);
					Static237.aClass4_5.method5840(local345, local1581 + local860 + arg3, -16777216, local216 + arg1, local1167);
					Static447.aClass121_11.pa(arg1, arg3, arg1 + arg0, arg2 + arg3);
				}
			} else {
				Static237.aClass4_5.method5840(-256, arg3 + local860, -16777216, local216 + arg1, local1167);
			}
		}
	}
}
