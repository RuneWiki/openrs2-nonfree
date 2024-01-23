import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!n", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString234 = " has logged in.";

	@OriginalMember(owner = "client!n", name = "W", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
	public static int anInt3623 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBIILclient!se;)V")
	public static void method2716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class122 arg3) {
		Static98.method2086();
		Static189.method3190(arg2, arg0, arg2 + arg3.anInt4695, arg0 + arg3.anInt4726);
		if (Static121.anInt3108 == 2 || Static121.anInt3108 == 5 || Static125.aClass1_Sub2_Sub4_4 == null) {
			Static189.method3200(arg2, arg0, arg3.anIntArray378, arg3.anIntArray372);
		} else {
			@Pc(39) int local39 = Static83.aClass9_Sub1_Sub1_1.anInt427 / 32 + 48;
			@Pc(47) int local47 = 464 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
			@Pc(54) int local54 = (int) Static230.aFloat51 + Static83.anInt2232 & 0x7FF;
			((Class1_Sub2_Sub4_Sub1) Static125.aClass1_Sub2_Sub4_4).method909(arg2, arg0, arg3.anInt4695, arg3.anInt4726, local39, local47, local54, Static44.anInt1333 + 256, arg3.anIntArray378, arg3.anIntArray372);
			@Pc(106) int local106;
			@Pc(126) int local126;
			@Pc(130) int local130;
			@Pc(142) int local142;
			@Pc(173) int local173;
			@Pc(163) int local163;
			@Pc(197) int local197;
			@Pc(229) int local229;
			if (Static176.aClass151_1 != null) {
				for (@Pc(77) int local77 = 0; local77 < Static176.aClass151_1.anInt5555; local77++) {
					if (Static176.aClass151_1.method4220(local77)) {
						local106 = ((Static176.aClass151_1.anIntArray470[local77] >> 14 & 0x3FFF) - Static64.anInt1786) * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
						local126 = ((Static176.aClass151_1.anIntArray470[local77] & 0x3FFF) + -Static29.anInt907) * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
						local130 = Class132.anIntArray440[local54];
						@Pc(138) int local138 = local130 * 256 / (Static44.anInt1333 + 256);
						local142 = Class132.anIntArray439[local54];
						@Pc(150) int local150 = local142 * 256 / (Static44.anInt1333 + 256);
						@Pc(152) Class1_Sub2_Sub7 local152 = Static244.aClass1_Sub2_Sub7_3;
						local163 = local126 * local150 - local138 * local106 >> 16;
						local173 = local138 * local126 + local150 * local106 >> 16;
						if (Static176.aClass151_1.method4218(local77) == 1) {
							local152 = Static63.aClass1_Sub2_Sub7_1;
						}
						if (Static176.aClass151_1.method4218(local77) == 2) {
							local152 = Static120.aClass1_Sub2_Sub7_2;
						}
						local197 = local152.method1918(Static176.aClass151_1.aStringArray39[local77], 100);
						local173 -= local197 / 2;
						if (local173 >= -arg3.anInt4695 && local173 <= arg3.anInt4695 && -arg3.anInt4726 <= local163 && local163 <= arg3.anInt4726) {
							local229 = 16777215;
							if (Static176.aClass151_1.anIntArray471[local77] != -1) {
								local229 = Static176.aClass151_1.anIntArray471[local77];
							}
							Static189.method3197(arg3.anIntArray378, arg3.anIntArray372);
							local152.method1929(Static176.aClass151_1.aStringArray39[local77], arg3.anInt4695 / 2 + arg2 + local173, -local163 + (arg0 - -(arg3.anInt4726 / 2)), local197, 50, local229, 0, 1, 0, 0);
							Static189.method3194();
						}
					}
				}
			}
			for (local106 = 0; local106 < Static180.anInt4139; local106++) {
				local126 = Static89.anIntArray181[local106] * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
				local130 = Static209.anIntArray354[local106] * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
				@Pc(325) Class31 local325 = Static77.method1518(Static76.anIntArray157[local106]);
				if (local325.anIntArray100 != null) {
					local325 = local325.method935();
					if (local325 == null || local325.anInt1338 == -1) {
						continue;
					}
				}
				Static55.method1070(local126, arg2, local130, Static202.aClass1_Sub2_Sub4Array11[local325.anInt1338], arg0, arg3);
			}
			for (local126 = 0; local126 < 104; local126++) {
				for (local130 = 0; local130 < 104; local130++) {
					@Pc(371) Class3 local371 = Static138.aClass3ArrayArrayArray1[Static137.anInt3321][local126][local130];
					if (local371 != null) {
						local163 = local130 * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
						local173 = local126 * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
						Static55.method1070(local173, arg2, local163, Static25.aClass1_Sub2_Sub4Array4[0], arg0, arg3);
					}
				}
			}
			@Pc(463) int local463;
			for (local130 = 0; local130 < Static16.anInt4955; local130++) {
				@Pc(426) Class9_Sub1_Sub2 local426 = Static36.aClass9_Sub1_Sub2Array2[Static142.anIntArray260[local130]];
				if (local426 != null && local426.method219()) {
					@Pc(435) Class45 local435 = local426.aClass45_1;
					if (local435 != null && local435.anIntArray154 != null) {
						local435 = local435.method1460();
					}
					if (local435 != null && local435.aBoolean124 && local435.aBoolean123) {
						local463 = local426.anInt479 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
						local163 = local426.anInt427 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
						if (local435.anInt2002 == -1) {
							Static55.method1070(local163, arg2, local463, Static25.aClass1_Sub2_Sub4Array4[1], arg0, arg3);
						} else {
							Static55.method1070(local163, arg2, local463, Static202.aClass1_Sub2_Sub4Array11[local435.anInt2002], arg0, arg3);
						}
					}
				}
			}
			for (local142 = 0; local142 < Static238.anInt5146; local142++) {
				@Pc(515) Class9_Sub1_Sub1 local515 = Static147.aClass9_Sub1_Sub1Array1[Static237.anIntArray447[local142]];
				if (local515 != null && local515.method219()) {
					local163 = local515.anInt427 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
					local463 = local515.anInt479 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
					@Pc(545) boolean local545 = false;
					@Pc(550) long local550 = Static93.method2008(local515.aString12);
					for (@Pc(552) int local552 = 0; local552 < Static265.anInt5544; local552++) {
						if (local550 == Static139.aLongArray38[local552] && Static206.anIntArray349[local552] != 0) {
							local545 = true;
							break;
						}
					}
					@Pc(574) boolean local574 = false;
					for (@Pc(576) int local576 = 0; local576 < Static131.anInt1067; local576++) {
						if (local550 == Static138.aClass1_Sub20Array1[local576].aLong184) {
							local574 = true;
							break;
						}
					}
					@Pc(599) boolean local599 = false;
					if (Static83.aClass9_Sub1_Sub1_1.anInt362 != 0 && local515.anInt362 != 0 && local515.anInt362 == Static83.aClass9_Sub1_Sub1_1.anInt362) {
						local599 = true;
					}
					if (local545) {
						Static55.method1070(local163, arg2, local463, Static25.aClass1_Sub2_Sub4Array4[3], arg0, arg3);
					} else if (local574) {
						Static55.method1070(local163, arg2, local463, Static25.aClass1_Sub2_Sub4Array4[5], arg0, arg3);
					} else if (local599) {
						Static55.method1070(local163, arg2, local463, Static25.aClass1_Sub2_Sub4Array4[4], arg0, arg3);
					} else {
						Static55.method1070(local163, arg2, local463, Static25.aClass1_Sub2_Sub4Array4[2], arg0, arg3);
					}
				}
			}
			@Pc(677) Class116[] local677 = Static75.aClass116Array1;
			for (local163 = 0; local163 < local677.length; local163++) {
				@Pc(685) Class116 local685 = local677[local163];
				if (local685 != null && local685.anInt4410 != 0 && Static156.anInt3722 % 20 < 10) {
					@Pc(745) int local745;
					if (local685.anInt4410 == 1 && local685.anInt4406 >= 0 && Static36.aClass9_Sub1_Sub2Array2.length > local685.anInt4406) {
						@Pc(721) Class9_Sub1_Sub2 local721 = Static36.aClass9_Sub1_Sub2Array2[local685.anInt4406];
						if (local721 != null) {
							local229 = local721.anInt427 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
							local745 = local721.anInt479 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
							Static179.method3058(arg2, 360000, local745, arg3, arg0, local685.anInt4404, local229);
						}
					}
					if (local685.anInt4410 == 2) {
						local197 = (local685.anInt4402 - Static64.anInt1786) * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
						local229 = (local685.anInt4405 - Static29.anInt907) * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
						local745 = local685.anInt4401 * 4;
						local745 *= local745;
						Static179.method3058(arg2, local745, local229, arg3, arg0, local685.anInt4404, local197);
					}
					if (local685.anInt4410 == 10 && local685.anInt4406 >= 0 && local685.anInt4406 < Static147.aClass9_Sub1_Sub1Array1.length) {
						@Pc(829) Class9_Sub1_Sub1 local829 = Static147.aClass9_Sub1_Sub1Array1[local685.anInt4406];
						if (local829 != null) {
							local745 = local829.anInt479 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
							local229 = local829.anInt427 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
							Static179.method3058(arg2, 360000, local745, arg3, arg0, local685.anInt4404, local229);
						}
					}
				}
			}
			if (Static239.anInt5157 != 0) {
				local463 = Static239.anInt5157 * 4 + (Static83.aClass9_Sub1_Sub1_1.method208() + -1) * 2 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
				local197 = Static262.anInt5501 * 4 + Static83.aClass9_Sub1_Sub1_1.method208() * 2 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32 - 2;
				Static55.method1070(local463, arg2, local197, Static200.aClass1_Sub2_Sub4_6, arg0, arg3);
			}
			Static189.method3193(arg2 + arg3.anInt4695 / 2 - 1, arg3.anInt4726 / 2 + (arg0 - 1), 3, 3, 16777215);
		}
		Static186.aBooleanArray17[arg1] = true;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIII)V")
	public static void method2717(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static10.anInt389 = 0;
		@Pc(309) int local309;
		@Pc(591) int local591;
		@Pc(224) int local224;
		@Pc(95) int local95;
		@Pc(135) int local135;
		@Pc(599) int local599;
		for (@Pc(5) int local5 = -1; local5 < Static16.anInt4955 + Static238.anInt5146; local5++) {
			@Pc(13) Class9_Sub1 local13;
			if (local5 == -1) {
				local13 = Static83.aClass9_Sub1_Sub1_1;
			} else if (Static238.anInt5146 <= local5) {
				local13 = Static36.aClass9_Sub1_Sub2Array2[Static142.anIntArray260[local5 - Static238.anInt5146]];
			} else {
				local13 = Static147.aClass9_Sub1_Sub1Array1[Static237.anIntArray447[local5]];
			}
			if (local13 != null && local13.method219()) {
				@Pc(49) Class45 local49;
				if (local13 instanceof Class9_Sub1_Sub2) {
					local49 = ((Class9_Sub1_Sub2) local13).aClass45_1;
					if (local49.anIntArray154 != null) {
						local49 = local49.method1460();
					}
					if (local49 == null) {
						continue;
					}
				}
				@Pc(176) int local176;
				if (local5 >= Static238.anInt5146) {
					local49 = ((Class9_Sub1_Sub2) local13).aClass45_1;
					if (local49.anIntArray154 != null) {
						local49 = local49.method1460();
					}
					if (local49.anInt2011 >= 0 && Static148.aClass1_Sub2_Sub4Array3.length > local49.anInt2011) {
						if (local49.anInt2006 == -1) {
							local95 = local13.method215() + 15;
						} else {
							local95 = local49.anInt2006 + 15;
						}
						Static188.method3172(arg3 >> 1, arg0 >> 1, local13, local95);
						if (Static257.anInt5460 > -1) {
							Static148.aClass1_Sub2_Sub4Array3[local49.anInt2011].method892(Static257.anInt5460 + arg2 - 12, arg1 + -30 + Static100.anInt2721);
						}
					}
					local135 = 0;
					@Pc(137) Class116[] local137 = Static75.aClass116Array1;
					while (local135 < local137.length) {
						@Pc(143) Class116 local143 = local137[local135];
						if (local143 != null && local143.anInt4410 == 1 && local143.anInt4406 == Static142.anIntArray260[local5 - Static238.anInt5146] && Static156.anInt3722 % 20 < 10) {
							if (local49.anInt2006 == -1) {
								local176 = local13.method215() + 15;
							} else {
								local176 = local49.anInt2006 + 15;
							}
							Static188.method3172(arg3 >> 1, arg0 >> 1, local13, local176);
							if (Static257.anInt5460 > -1) {
								Static112.aClass1_Sub2_Sub4Array10[local143.anInt4404].method892(arg2 + Static257.anInt5460 - 12, arg1 - (-Static100.anInt2721 - -28));
							}
						}
						local135++;
					}
				} else {
					local224 = 30;
					@Pc(227) Class9_Sub1_Sub1 local227 = (Class9_Sub1_Sub1) local13;
					if (local227.anInt372 != -1 || local227.anInt358 != -1) {
						Static188.method3172(arg3 >> 1, arg0 >> 1, local13, local13.method215() + 15);
						if (Static257.anInt5460 > -1) {
							if (local227.anInt372 != -1) {
								Static44.aClass1_Sub2_Sub4Array5[local227.anInt372].method892(Static257.anInt5460 + arg2 - 12, arg1 + -30 - -Static100.anInt2721);
								local224 += 25;
							}
							if (local227.anInt358 != -1) {
								Static148.aClass1_Sub2_Sub4Array3[local227.anInt358].method892(arg2 + Static257.anInt5460 - 12, arg1 + Static100.anInt2721 + -local224);
								local224 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(307) Class116[] local307 = Static75.aClass116Array1;
						for (local309 = 0; local309 < local307.length; local309++) {
							@Pc(315) Class116 local315 = local307[local309];
							if (local315 != null && local315.anInt4410 == 10 && Static237.anIntArray447[local5] == local315.anInt4406) {
								Static188.method3172(arg3 >> 1, arg0 >> 1, local13, local13.method215() + 15);
								if (Static257.anInt5460 > -1) {
									Static112.aClass1_Sub2_Sub4Array10[local315.anInt4404].method892(arg2 + Static257.anInt5460 - 12, -local224 + Static100.anInt2721 + arg1);
								}
							}
						}
					}
				}
				if (local13.aString13 != null && (Static238.anInt5146 <= local5 || Static13.anInt509 == 0 || Static13.anInt509 == 3 || Static13.anInt509 == 1 && Static88.method1881(((Class9_Sub1_Sub1) local13).aString12))) {
					Static188.method3172(arg3 >> 1, arg0 >> 1, local13, local13.method215());
					if (Static257.anInt5460 > -1 && Static150.anInt3861 > Static10.anInt389) {
						Static150.anIntArray290[Static10.anInt389] = Static120.aClass1_Sub2_Sub7_2.method1922(local13.aString13) / 2;
						Static150.anIntArray285[Static10.anInt389] = Static120.aClass1_Sub2_Sub7_2.anInt2509;
						Static150.anIntArray284[Static10.anInt389] = Static257.anInt5460;
						Static150.anIntArray286[Static10.anInt389] = Static100.anInt2721;
						Static150.anIntArray289[Static10.anInt389] = local13.anInt457;
						Static150.anIntArray287[Static10.anInt389] = local13.anInt467;
						Static150.anIntArray288[Static10.anInt389] = local13.anInt402;
						Static150.aStringArray31[Static10.anInt389] = local13.aString13;
						Static10.anInt389++;
					}
				}
				if (Static156.anInt3722 < local13.anInt480) {
					@Pc(471) Class1_Sub2_Sub4 local471 = Static261.aClass1_Sub2_Sub4Array12[0];
					@Pc(475) Class1_Sub2_Sub4 local475 = Static261.aClass1_Sub2_Sub4Array12[1];
					if (local13 instanceof Class9_Sub1_Sub2) {
						@Pc(481) Class9_Sub1_Sub2 local481 = (Class9_Sub1_Sub2) local13;
						@Pc(490) Class1_Sub2_Sub4[] local490 = (Class1_Sub2_Sub4[]) Static127.aClass79_18.method2483((long) local481.aClass45_1.anInt2030);
						if (local490 == null) {
							local490 = Static183.method3949(local481.aClass45_1.anInt2030, Static24.aClass51_10);
							if (local490 != null) {
								Static127.aClass79_18.method2486(local490, (long) local481.aClass45_1.anInt2030);
							}
						}
						if (local490 != null && local490.length == 2) {
							local471 = local490[0];
							local475 = local490[1];
						}
						@Pc(527) Class45 local527 = local481.aClass45_1;
						if (local527.anInt2006 == -1) {
							local135 = local13.method215();
						} else {
							local135 = local527.anInt2006;
						}
					} else {
						local135 = local13.method215();
					}
					Static188.method3172(arg3 >> 1, arg0 >> 1, local13, local135 + local471.anInt1291 + 10);
					if (Static257.anInt5460 > -1) {
						local309 = arg2 + Static257.anInt5460 - (local471.anInt1292 >> 1);
						local176 = Static100.anInt2721 + arg1 - 3;
						local471.method892(local309, local176);
						local591 = local471.anInt1291;
						local599 = local13.anInt438 * local471.anInt1292 / 255;
						Static189.method3182(local309, local176, local309 + local599, local176 - -local591);
						local475.method892(local309, local176);
						Static189.method3190(arg2, arg1, arg2 + arg3, arg1 + arg0);
					}
				}
				for (local224 = 0; local224 < 4; local224++) {
					if (Static156.anInt3722 < local13.anIntArray40[local224]) {
						if (local13 instanceof Class9_Sub1_Sub2) {
							@Pc(646) Class9_Sub1_Sub2 local646 = (Class9_Sub1_Sub2) local13;
							@Pc(649) Class45 local649 = local646.aClass45_1;
							if (local649.anInt2006 == -1) {
								local95 = local13.method215() / 2;
							} else {
								local95 = local649.anInt2006 / 2;
							}
						} else {
							local95 = local13.method215() / 2;
						}
						Static188.method3172(arg3 >> 1, arg0 >> 1, local13, local95);
						if (Static257.anInt5460 > -1) {
							if (local224 == 1) {
								Static100.anInt2721 -= 20;
							}
							if (local224 == 2) {
								Static100.anInt2721 -= 10;
								Static257.anInt5460 -= 15;
							}
							if (local224 == 3) {
								Static257.anInt5460 += 15;
								Static100.anInt2721 -= 10;
							}
							Static73.aClass1_Sub2_Sub4Array7[local13.anIntArray42[local224]].method892(Static257.anInt5460 + arg2 - 12, Static100.anInt2721 + (arg1 - 12));
							Static244.aClass1_Sub2_Sub7_3.method1923(Integer.toString(local13.anIntArray39[local224]), arg2 + Static257.anInt5460 - 1, Static100.anInt2721 + arg1 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(773) int local773 = 0; local773 < Static10.anInt389; local773++) {
			local95 = Static150.anIntArray286[local773];
			local224 = Static150.anIntArray284[local773];
			local135 = Static150.anIntArray290[local773];
			local309 = Static150.anIntArray285[local773];
			@Pc(793) boolean local793 = true;
			while (local793) {
				local793 = false;
				for (local599 = 0; local599 < local773; local599++) {
					if (Static150.anIntArray286[local599] - Static150.anIntArray285[local599] < local95 + 2 && Static150.anIntArray286[local599] + 2 > local95 + -local309 && Static150.anIntArray290[local599] + Static150.anIntArray284[local599] > -local135 + local224 && Static150.anIntArray284[local599] - Static150.anIntArray290[local599] < local224 - -local135 && local95 > Static150.anIntArray286[local599] - Static150.anIntArray285[local599]) {
						local793 = true;
						local95 = Static150.anIntArray286[local599] - Static150.anIntArray285[local599];
					}
				}
			}
			Static257.anInt5460 = Static150.anIntArray284[local773];
			Static100.anInt2721 = Static150.anIntArray286[local773] = local95;
			@Pc(904) String local904 = Static150.aStringArray31[local773];
			if (Static136.anInt3380 == 0) {
				local591 = 16776960;
				if (Static150.anIntArray289[local773] < 6) {
					local591 = Static158.anIntArray277[Static150.anIntArray289[local773]];
				}
				if (Static150.anIntArray289[local773] == 6) {
					local591 = Static82.anInt2220 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static150.anIntArray289[local773] == 7) {
					local591 = Static82.anInt2220 % 20 < 10 ? 255 : 65535;
				}
				if (Static150.anIntArray289[local773] == 8) {
					local591 = Static82.anInt2220 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(981) int local981;
				if (Static150.anIntArray289[local773] == 9) {
					local981 = 150 - Static150.anIntArray288[local773];
					if (local981 < 50) {
						local591 = local981 * 1280 + 16711680;
					} else if (local981 < 100) {
						local591 = 16776960 - (local981 - 50) * 327680;
					} else if (local981 < 150) {
						local591 = local981 * 5 + 64780;
					}
				}
				if (Static150.anIntArray289[local773] == 10) {
					local981 = 150 - Static150.anIntArray288[local773];
					if (local981 < 50) {
						local591 = local981 * 5 + 16711680;
					} else if (local981 < 100) {
						local591 = 16711935 + 16384000 - local981 * 327680;
					} else if (local981 < 150) {
						local591 = local981 * 327680 + 255 - (local981 - 100) * 5 - 32768000;
					}
				}
				if (Static150.anIntArray289[local773] == 11) {
					local981 = 150 - Static150.anIntArray288[local773];
					if (local981 < 50) {
						local591 = 16777215 - local981 * 327685;
					} else if (local981 < 100) {
						local591 = (local981 - 50) * 327685 + 65280;
					} else if (local981 < 150) {
						local591 = 16777215 - (local981 - 100) * 327680;
					}
				}
				if (Static150.anIntArray287[local773] == 0) {
					Static120.aClass1_Sub2_Sub7_2.method1923(local904, arg2 + Static257.anInt5460, arg1 + Static100.anInt2721, local591, 0);
				}
				if (Static150.anIntArray287[local773] == 1) {
					Static120.aClass1_Sub2_Sub7_2.method1932(local904, arg2 + Static257.anInt5460, Static100.anInt2721 + arg1, local591, Static82.anInt2220);
				}
				if (Static150.anIntArray287[local773] == 2) {
					Static120.aClass1_Sub2_Sub7_2.method1931(local904, arg2 + Static257.anInt5460, Static100.anInt2721 + arg1, local591, Static82.anInt2220);
				}
				if (Static150.anIntArray287[local773] == 3) {
					Static120.aClass1_Sub2_Sub7_2.method1934(local904, arg2 + Static257.anInt5460, arg1 - -Static100.anInt2721, local591, Static82.anInt2220, 150 - Static150.anIntArray288[local773]);
				}
				if (Static150.anIntArray287[local773] == 4) {
					local981 = (150 - Static150.anIntArray288[local773]) * (Static120.aClass1_Sub2_Sub7_2.method1922(local904) + 100) / 150;
					Static189.method3182(Static257.anInt5460 + arg2 - 50, arg1, Static257.anInt5460 + arg2 + 50, arg1 - -arg0);
					Static120.aClass1_Sub2_Sub7_2.method1940(local904, arg2 + Static257.anInt5460 + 50 - local981, arg1 + Static100.anInt2721, local591, 0);
					Static189.method3190(arg2, arg1, arg3 + arg2, arg0 + arg1);
				}
				if (Static150.anIntArray287[local773] == 5) {
					local981 = 150 - Static150.anIntArray288[local773];
					Static189.method3182(arg2, Static100.anInt2721 + arg1 - Static120.aClass1_Sub2_Sub7_2.anInt2509 - 1, arg2 + arg3, Static100.anInt2721 + arg1 + 5);
					@Pc(1306) int local1306 = 0;
					if (local981 < 25) {
						local1306 = local981 - 25;
					} else if (local981 > 125) {
						local1306 = local981 - 125;
					}
					Static120.aClass1_Sub2_Sub7_2.method1923(local904, arg2 + Static257.anInt5460, arg1 + Static100.anInt2721 + local1306, local591, 0);
					Static189.method3190(arg2, arg1, arg2 + arg3, arg0 + arg1);
				}
			} else {
				Static120.aClass1_Sub2_Sub7_2.method1923(local904, Static257.anInt5460 + arg2, arg1 - -Static100.anInt2721, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)V")
	public static void method2718(@OriginalArg(1) int arg0) {
		Static242.anInt5230 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method2719(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			try {
				Static55.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static55.anApplet_Sub1_1.getCodeBase(), arg0), "_blank");
			} catch (@Pc(43) Exception local43) {
			}
			return;
		}
		try {
			Static267.method82("loggedout", Static38.aClass28_1.anApplet1);
		} catch (@Pc(18) Throwable local18) {
		}
		try {
			Static55.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static55.anApplet_Sub1_1.getCodeBase(), arg0), "_top");
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2720(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static265.anInt5544; local11++) {
			if (arg0.equalsIgnoreCase(Static48.aStringArray7[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(CZLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2721(@OriginalArg(2) String arg0) {
		@Pc(10) int local10 = Static80.method1627(arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local19; arg0.charAt(local30) != '<'; local30++) {
			}
			local15[local17++] = arg0.substring(local19, local30);
			local19 = local30 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static100.anInt2721 = -1;
			Static257.anInt5460 = -1;
			return;
		}
		@Pc(33) int local33 = Static200.method3326(Static137.anInt3321, arg2, arg0) - arg4;
		@Pc(37) int local37 = Class132.anIntArray439[Static200.anInt4412];
		@Pc(41) int local41 = local33 - Static109.anInt2904;
		@Pc(45) int local45 = Class132.anIntArray439[Static127.anInt3198];
		@Pc(49) int local49 = arg2 - Static110.anInt2935;
		@Pc(53) int local53 = Class132.anIntArray440[Static200.anInt4412];
		@Pc(57) int local57 = arg0 - Static174.anInt4003;
		@Pc(61) int local61 = Class132.anIntArray440[Static127.anInt3198];
		@Pc(72) int local72 = local49 * local61 + local45 * local57 >> 16;
		@Pc(83) int local83 = local45 * local49 - local57 * local61 >> 16;
		@Pc(85) int local85 = local72;
		@Pc(96) int local96 = local37 * local41 - local83 * local53 >> 16;
		@Pc(112) int local112 = local41 * local53 + local83 * local37 >> 16;
		if (local112 >= 50) {
			Static100.anInt2721 = (local96 << 9) / local112 + arg3;
			Static257.anInt5460 = arg1 + (local85 << 9) / local112;
		} else {
			Static100.anInt2721 = -1;
			Static257.anInt5460 = -1;
		}
	}
}
