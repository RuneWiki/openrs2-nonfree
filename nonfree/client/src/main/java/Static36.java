import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bea", name = "v", descriptor = "I")
	public static int anInt850 = 13156520;

	@OriginalMember(owner = "client!bea", name = "w", descriptor = "Lclient!cb;")
	public static final Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!bea", name = "A", descriptor = "I")
	public static int anInt854 = 0;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	public static void method634() {
		if (Static208.anInt4195 > 1) {
			Static247.anInt4548 = Static251.anInt4580;
			Static208.anInt4195--;
		}
		if (Static447.aBoolean581) {
			Static447.aBoolean581 = false;
			Static492.method5129();
			return;
		}
		if (!Static255.aBoolean352) {
			Static380.method5622();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static241.method4006(); local27++) {
		}
		if (Static246.anInt4542 != 10) {
			return;
		}
		@Pc(47) Class3_Sub34 local47;
		@Pc(56) int local56;
		while (Static590.method7774()) {
			local47 = Static374.method5522(Static521.aClass298_164, Static220.aClass287_2);
			local47.aClass3_Sub11_Sub1_2.method3079(0);
			local56 = local47.aClass3_Sub11_Sub1_2.anInt3520;
			Static588.method2587(local47.aClass3_Sub11_Sub1_2);
			local47.aClass3_Sub11_Sub1_2.method3127(local47.aClass3_Sub11_Sub1_2.anInt3520 - local56);
			Static131.method2572(local47);
		}
		if (Static549.aClass3_Sub5_2 == null) {
			if (Static73.aLong48 <= Static587.method7753()) {
				Static549.aClass3_Sub5_2 = Static490.aClass102_3.method2797(Static583.aClass65_5.aString31);
			}
		} else if (Static549.aClass3_Sub5_2.anInt124 != -1) {
			local47 = Static374.method5522(Static528.aClass298_166, Static220.aClass287_2);
			local47.aClass3_Sub11_Sub1_2.method3131(Static549.aClass3_Sub5_2.anInt124);
			Static131.method2572(local47);
			Static549.aClass3_Sub5_2 = null;
			Static73.aLong48 = Static587.method7753() + 30000L;
		}
		@Pc(125) Class3_Sub24 local125 = (Class3_Sub24) Static205.aClass130_20.method3543();
		@Pc(142) int local142;
		@Pc(165) int local165;
		@Pc(183) int local183;
		@Pc(232) int local232;
		@Pc(239) int local239;
		@Pc(251) int local251;
		@Pc(140) Class3_Sub34 local140;
		if (local125 != null || Static537.aLong125 < Static587.method7753() - 2000L) {
			local140 = null;
			local142 = 0;
			for (@Pc(147) Class3_Sub24 local147 = (Class3_Sub24) Static473.aClass130_46.method3543(); local147 != null && (local140 == null || local140.aClass3_Sub11_Sub1_2.anInt3520 - local142 < 240); local147 = (Class3_Sub24) Static473.aClass130_46.method3551()) {
				local147.method7812();
				local165 = local147.method7751();
				if (local165 < -1) {
					local165 = -1;
				} else if (local165 > 65534) {
					local165 = 65534;
				}
				local183 = local147.method7748();
				if (local183 < -1) {
					local183 = -1;
				} else if (local183 > 65534) {
					local183 = 65534;
				}
				if (Static421.anInt7062 != local183 || local165 != Static263.anInt4950) {
					if (local140 == null) {
						local140 = Static374.method5522(Static190.aClass298_73, Static220.aClass287_2);
						local140.aClass3_Sub11_Sub1_2.method3079(0);
						local142 = local140.aClass3_Sub11_Sub1_2.anInt3520;
					}
					local232 = local183 - Static421.anInt7062;
					Static421.anInt7062 = local183;
					local239 = local165 - Static263.anInt4950;
					Static263.anInt4950 = local165;
					local251 = (int) ((local147.method7752() - Static537.aLong125) / 20L);
					if (local251 < 8 && local232 >= -32 && local232 <= 31 && local239 >= -32 && local239 <= 31) {
						local232 += 32;
						local239 += 32;
						local140.aClass3_Sub11_Sub1_2.method3131((local251 << 12) + (local232 << 6) + local239);
					} else if (local251 < 32 && local232 >= -128 && local232 <= 127 && local239 >= -128 && local239 <= 127) {
						local232 += 128;
						local239 += 128;
						local140.aClass3_Sub11_Sub1_2.method3079(local251 + 128);
						local140.aClass3_Sub11_Sub1_2.method3131((local232 << 8) + local239);
					} else if (local251 >= 32) {
						local140.aClass3_Sub11_Sub1_2.method3131(local251 + 57344);
						if (local183 == 1 || local165 == -1) {
							local140.aClass3_Sub11_Sub1_2.method3101(Integer.MIN_VALUE);
						} else {
							local140.aClass3_Sub11_Sub1_2.method3101(local165 << 16 | local183);
						}
					} else {
						local140.aClass3_Sub11_Sub1_2.method3079(local251 + 192);
						if (local183 == 1 || local165 == -1) {
							local140.aClass3_Sub11_Sub1_2.method3101(Integer.MIN_VALUE);
						} else {
							local140.aClass3_Sub11_Sub1_2.method3101(local165 << 16 | local183);
						}
					}
					Static537.aLong125 = local147.method7752();
				}
			}
			if (local140 != null) {
				local140.aClass3_Sub11_Sub1_2.method3127(local140.aClass3_Sub11_Sub1_2.anInt3520 - local142);
				Static131.method2572(local140);
			}
		}
		if (local125 != null) {
			@Pc(429) long local429 = (local125.method7752() - Static66.aLong46) / 50L;
			if (local429 > 32767L) {
				local429 = 32767L;
			}
			Static66.aLong46 = local125.method7752();
			@Pc(443) int local443 = local125.method7751();
			if (local443 < 0) {
				local443 = 0;
			} else if (local443 > 65535) {
				local443 = 65535;
			}
			local165 = local125.method7748();
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 65535) {
				local165 = 65535;
			}
			@Pc(476) byte local476 = 0;
			if (local125.method7746() == 2) {
				local476 = 1;
			}
			local232 = (int) local429;
			@Pc(497) Class3_Sub34 local497 = Static374.method5522(Static67.aClass298_32, Static220.aClass287_2);
			local497.aClass3_Sub11_Sub1_2.method3111(local443 << 16 | local165);
			local497.aClass3_Sub11_Sub1_2.method3132(local476 << 15 | local232);
			Static131.method2572(local497);
		}
		if (Static235.anInt4454 > 0) {
			local140 = Static374.method5522(Static23.aClass298_15, Static220.aClass287_2);
			local140.aClass3_Sub11_Sub1_2.method3079(Static235.anInt4454 * 3);
			for (local142 = 0; local142 < Static235.anInt4454; local142++) {
				@Pc(544) Interface16 local544 = Static122.anInterface16Array1[local142];
				@Pc(552) long local552 = (local544.method5161() - Static488.aLong225) / 50L;
				if (local552 > 65535L) {
					local552 = 65535L;
				}
				Static488.aLong225 = local544.method5161();
				local140.aClass3_Sub11_Sub1_2.method3079(local544.method5163());
				local140.aClass3_Sub11_Sub1_2.method3131((int) local552);
			}
			Static131.method2572(local140);
		}
		if (Static294.anInt5334 > 0) {
			Static294.anInt5334--;
		}
		if (Static350.aBoolean631 && Static294.anInt5334 <= 0) {
			Static350.aBoolean631 = false;
			Static294.anInt5334 = 20;
			local140 = Static374.method5522(Static493.aClass298_141, Static220.aClass287_2);
			local140.aClass3_Sub11_Sub1_2.method3095((int) Static439.aFloat151 >> 3);
			local140.aClass3_Sub11_Sub1_2.method3131((int) Static527.aFloat183 >> 3);
			Static131.method2572(local140);
		}
		if (Static398.aBoolean548 != Static538.aBoolean658) {
			Static398.aBoolean548 = Static538.aBoolean658;
			local140 = Static374.method5522(Static375.aClass298_134, Static220.aClass287_2);
			local140.aClass3_Sub11_Sub1_2.method3079(Static538.aBoolean658 ? 1 : 0);
			Static131.method2572(local140);
		}
		if (!Static529.aBoolean647) {
			local140 = Static374.method5522(Static575.aClass298_174, Static220.aClass287_2);
			local140.aClass3_Sub11_Sub1_2.method3079(0);
			local142 = local140.aClass3_Sub11_Sub1_2.anInt3520;
			@Pc(680) Class3_Sub11 local680 = new Class3_Sub11(Static551.method7383());
			Static278.aClass3_Sub13_Sub1_1.method4462(local680);
			local140.aClass3_Sub11_Sub1_2.method3084(local680.anInt3520, local680.aByteArray36);
			local140.aClass3_Sub11_Sub1_2.method3127(local140.aClass3_Sub11_Sub1_2.anInt3520 - local142);
			Static131.method2572(local140);
			Static529.aBoolean647 = true;
		}
		if (Static554.aClass63ArrayArrayArray4 != null) {
			if (Static446.anInt7363 == 2) {
				Static532.method7028();
			} else if (Static446.anInt7363 == 3) {
				Static546.method7319();
			}
		}
		if (Static493.aBoolean547) {
			Static493.aBoolean547 = false;
		} else {
			Static4.aFloat1 /= 2.0F;
		}
		if (Static543.aBoolean661) {
			Static543.aBoolean661 = false;
		} else {
			Static443.aFloat152 /= 2.0F;
		}
		Static50.method825();
		if (Static246.anInt4542 != 10) {
			return;
		}
		Static62.method4288();
		Static211.method3736();
		Static129.method2556();
		Static20.anInt529++;
		if (Static20.anInt529 > 750) {
			Static492.method5129();
			return;
		}
		Static409.method5563();
		Static490.method6752();
		Static591.method7781();
		for (local56 = Static427.aClass56_1.method1735(true); local56 != -1; local56 = Static427.aClass56_1.method1735(false)) {
			Static285.method4535(local56);
			Static2.anIntArray2[Static47.anInt1015++ & 0x1F] = local56;
		}
		@Pc(857) Class203 local857;
		for (@Pc(810) Class3_Sub3_Sub7 local810 = Static201.method3629(); local810 != null; local810 = Static201.method3629()) {
			local165 = local810.method842();
			local183 = local810.method846();
			if (local165 == 1) {
				Static99.anIntArray166[local183] = local810.anInt1088;
				Static590.aBoolean729 |= Static376.aBooleanArray27[local183];
				Static375.anIntArray510[Static280.anInt5115++ & 0x1F] = local183;
			} else if (local165 == 2) {
				Static230.aStringArray30[local183] = local810.aString24;
				Static162.anIntArray274[Static178.anInt8247++ & 0x1F] = local183;
			} else if (local165 == 3) {
				local857 = Static414.method5954(local183);
				if (!local810.aString24.equals(local857.aString75)) {
					local857.aString75 = local810.aString24;
					Static138.method2656(local857);
				}
			} else {
				@Pc(866) int local866;
				if (local165 == 4) {
					local857 = Static414.method5954(local183);
					local239 = local810.anInt1088;
					local251 = local810.anInt1091;
					local866 = local810.anInt1086;
					if (local857.anInt5448 != local239 || local251 != local857.anInt5523 || local857.anInt5491 != local866) {
						local857.anInt5523 = local251;
						local857.anInt5491 = local866;
						local857.anInt5448 = local239;
						Static138.method2656(local857);
					}
				} else if (local165 == 5) {
					local857 = Static414.method5954(local183);
					if (local810.anInt1088 != local857.anInt5505 || local810.anInt1088 == -1) {
						local857.anInt5511 = 0;
						local857.anInt5458 = 0;
						local857.anInt5481 = 1;
						local857.anInt5505 = local810.anInt1088;
						@Pc(942) Class17 local942 = local857.anInt5505 == -1 ? null : Static330.aClass279_2.method6216(local857.anInt5505);
						if (local942 != null) {
							Static435.method6109(local857.anInt5458, local942);
						}
						Static138.method2656(local857);
					}
				} else if (local165 == 6) {
					local232 = local810.anInt1088;
					local239 = local232 >> 10 & 0x1F;
					local251 = local232 >> 5 & 0x1F;
					local866 = local232 & 0x1F;
					@Pc(1303) int local1303 = (local866 << 3) + ((local239 << 19) + (local251 << 11));
					@Pc(1307) Class203 local1307 = Static414.method5954(local183);
					if (local1307.anInt5450 != local1303) {
						local1307.anInt5450 = local1303;
						Static138.method2656(local1307);
					}
				} else if (local165 == 7) {
					local857 = Static414.method5954(local183);
					@Pc(976) boolean local976 = local810.anInt1088 == 1;
					if (local976 != local857.aBoolean447) {
						local857.aBoolean447 = local976;
						Static138.method2656(local857);
					}
				} else if (local165 == 8) {
					local857 = Static414.method5954(local183);
					if (local810.anInt1088 != local857.anInt5521 || local857.anInt5465 != local810.anInt1091 || local857.anInt5498 != local810.anInt1086) {
						local857.anInt5498 = local810.anInt1086;
						local857.anInt5465 = local810.anInt1091;
						local857.anInt5521 = local810.anInt1088;
						if (local857.anInt5507 != -1) {
							if (local857.anInt5524 > 0) {
								local857.anInt5498 = local857.anInt5498 * 32 / local857.anInt5524;
							} else if (local857.anInt5480 > 0) {
								local857.anInt5498 = local857.anInt5498 * 32 / local857.anInt5480;
							}
						}
						Static138.method2656(local857);
					}
				} else if (local165 == 9) {
					local857 = Static414.method5954(local183);
					if (local857.anInt5507 != local810.anInt1088 || local810.anInt1091 != local857.anInt5497) {
						local857.anInt5497 = local810.anInt1091;
						local857.anInt5507 = local810.anInt1088;
						Static138.method2656(local857);
					}
				} else if (local165 == 10) {
					local857 = Static414.method5954(local183);
					if (local810.anInt1088 != local857.anInt5443 || local810.anInt1091 != local857.anInt5530 || local810.anInt1086 != local857.anInt5532) {
						local857.anInt5530 = local810.anInt1091;
						local857.anInt5532 = local810.anInt1086;
						local857.anInt5443 = local810.anInt1088;
						Static138.method2656(local857);
					}
				} else if (local165 == 11) {
					local857 = Static414.method5954(local183);
					local857.anInt5527 = local857.anInt5509 = local810.anInt1088;
					local857.anInt5440 = local857.anInt5517 = local810.anInt1091;
					local857.aByte66 = 0;
					local857.aByte63 = 0;
					Static138.method2656(local857);
				} else if (local165 == 12) {
					local857 = Static414.method5954(local183);
					local239 = local810.anInt1088;
					if (local857 != null && local857.anInt5473 == 0) {
						if (local239 > local857.anInt5506 - local857.anInt5476) {
							local239 = local857.anInt5506 - local857.anInt5476;
						}
						if (local239 < 0) {
							local239 = 0;
						}
						if (local857.anInt5512 != local239) {
							local857.anInt5512 = local239;
							Static138.method2656(local857);
						}
					}
				} else if (local165 == 14) {
					local857 = Static414.method5954(local183);
					local857.anInt5496 = local810.anInt1088;
				} else if (local165 == 15) {
					Static341.anInt6021 = local810.anInt1088;
					Static77.aBoolean168 = true;
					Static329.anInt5894 = local810.anInt1091;
				} else if (local165 == 16) {
					local857 = Static414.method5954(local183);
					local857.anInt5486 = local810.anInt1088;
				}
			}
		}
		Static14.anInt217++;
		if (Static558.anInt8945 != 0) {
			Static556.anInt8908 += 20;
			if (Static556.anInt8908 >= 400) {
				Static558.anInt8945 = 0;
			}
		}
		if (Static229.aClass203_76 != null) {
			Static466.anInt8973++;
			if (Static466.anInt8973 >= 15) {
				Static138.method2656(Static229.aClass203_76);
				Static229.aClass203_76 = null;
			}
		}
		Static555.aClass203_139 = null;
		Static297.aBoolean432 = false;
		Static184.aClass203_63 = null;
		Static178.aBoolean637 = false;
		Static576.method7636(-1, -1, null);
		Static553.method7388(null, -1, -1);
		if (!Static380.aBoolean537) {
			Static212.anInt4226 = -1;
		}
		Static350.method6839();
		Static251.anInt4580++;
		if (Static469.aBoolean606) {
			@Pc(1437) Class3_Sub34 local1437 = Static374.method5522(Static54.aClass298_27, Static220.aClass287_2);
			local1437.aClass3_Sub11_Sub1_2.method3101(Static345.anInt6059 << 28 | Static545.anInt8725 << 14 | Static570.anInt9148);
			Static131.method2572(local1437);
			Static469.aBoolean606 = false;
		}
		while (true) {
			@Pc(1465) Class203 local1465;
			@Pc(1460) Class3_Sub45 local1460;
			do {
				local1460 = (Class3_Sub45) Static122.aClass130_9.method3545();
				if (local1460 == null) {
					while (true) {
						do {
							local1460 = (Class3_Sub45) Static509.aClass130_50.method3545();
							if (local1460 == null) {
								while (true) {
									do {
										local1460 = (Class3_Sub45) Static146.aClass130_12.method3545();
										if (local1460 == null) {
											if (Static555.aClass203_139 == null) {
												Static366.anInt6302 = 0;
											}
											if (Static265.aClass203_82 != null) {
												Static372.method5514();
											}
											if (Static274.anInt5067 > 0 && Static478.aClass127_1.method3276(82) && Static478.aClass127_1.method3276(81) && Static400.anInt6813 != 0) {
												local165 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 - Static400.anInt6813;
												if (local165 < 0) {
													local165 = 0;
												} else if (local165 > 3) {
													local165 = 3;
												}
												Static31.method563(local165, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] + Static529.anInt8344, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0] + Static463.anInt7588);
											}
											Static491.method6670();
											for (local165 = 0; local165 < 5; local165++) {
												@Pc(1655) int local1655 = Static461.anIntArray585[local165]++;
											}
											if (Static590.aBoolean729 && Static410.aLong195 < Static587.method7753() - 60000L) {
												Static537.method3881();
											}
											for (@Pc(1682) Class9_Sub8_Sub1 local1682 = (Class9_Sub8_Sub1) Static124.aClass309_8.method6590(); local1682 != null; local1682 = (Class9_Sub8_Sub1) Static124.aClass309_8.method6594()) {
												if (Static587.method7753() / 1000L - 5L > (long) local1682.anInt4531) {
													if (local1682.aShort57 > 0) {
														Static483.method6585("", "", "", 5, 0, local1682.aString60 + Static48.aClass33_21.method797(Static131.anInt2839));
													}
													if (local1682.aShort57 == 0) {
														Static483.method6585("", "", "", 5, 0, local1682.aString60 + Static48.aClass33_22.method797(Static131.anInt2839));
													}
													local1682.method7465();
												}
											}
											Static60.anInt1457++;
											if (Static60.anInt1457 > 500) {
												Static60.anInt1457 = 0;
												local232 = (int) (Math.random() * 8.0D);
												if ((local232 & 0x4) == 4) {
													Static91.anInt2282 += Static188.anInt3658;
												}
												if ((local232 & 0x2) == 2) {
													Static581.anInt9295 += Static137.anInt2939;
												}
												if ((local232 & 0x1) == 1) {
													Static527.anInt8331 += Static559.anInt8946;
												}
											}
											if (Static527.anInt8331 < -50) {
												Static559.anInt8946 = 2;
											}
											if (Static581.anInt9295 < -55) {
												Static137.anInt2939 = 2;
											}
											if (Static527.anInt8331 > 50) {
												Static559.anInt8946 = -2;
											}
											if (Static91.anInt2282 < -40) {
												Static188.anInt3658 = 1;
											}
											if (Static581.anInt9295 > 55) {
												Static137.anInt2939 = -2;
											}
											Static71.anInt1937++;
											if (Static91.anInt2282 > 40) {
												Static188.anInt3658 = -1;
											}
											if (Static71.anInt1937 > 500) {
												Static71.anInt1937 = 0;
												local232 = (int) (Math.random() * 8.0D);
												if ((local232 & 0x1) == 1) {
													Static278.anInt5101 += Static120.anInt2731;
												}
												if ((local232 & 0x2) == 2) {
													Static435.anInt7196 += Static235.anInt4459;
												}
											}
											if (Static278.anInt5101 < -60) {
												Static120.anInt2731 = 2;
											}
											if (Static278.anInt5101 > 60) {
												Static120.anInt2731 = -2;
											}
											if (Static435.anInt7196 < -20) {
												Static235.anInt4459 = 1;
											}
											if (Static435.anInt7196 > 10) {
												Static235.anInt4459 = -1;
											}
											Static218.anInt4297++;
											if (Static218.anInt4297 > 50) {
												@Pc(1907) Class3_Sub34 local1907 = Static374.method5522(Static192.aClass298_74, Static220.aClass287_2);
												Static131.method2572(local1907);
											}
											if (Static489.aBoolean615) {
												Static307.method4823();
												Static489.aBoolean615 = false;
											}
											try {
												Static556.method7408();
												return;
											} catch (@Pc(1920) IOException local1920) {
												Static492.method5129();
												return;
											}
										}
										local1465 = local1460.aClass203_136;
										if (local1465.anInt5504 < 0) {
											break;
										}
										local857 = Static414.method5954(local1465.anInt5518);
									} while (local857 == null || local857.aClass203Array2 == null || local1465.anInt5504 >= local857.aClass203Array2.length || local857.aClass203Array2[local1465.anInt5504] != local1465);
									Static149.method2778(local1460);
								}
							}
							local1465 = local1460.aClass203_136;
							if (local1465.anInt5504 < 0) {
								break;
							}
							local857 = Static414.method5954(local1465.anInt5518);
						} while (local857 == null || local857.aClass203Array2 == null || local857.aClass203Array2.length <= local1465.anInt5504 || local857.aClass203Array2[local1465.anInt5504] != local1465);
						Static149.method2778(local1460);
					}
				}
				local1465 = local1460.aClass203_136;
				if (local1465.anInt5504 < 0) {
					break;
				}
				local857 = Static414.method5954(local1465.anInt5518);
			} while (local857 == null || local857.aClass203Array2 == null || local857.aClass203Array2.length <= local1465.anInt5504 || local857.aClass203Array2[local1465.anInt5504] != local1465);
			Static149.method2778(local1460);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB)V")
	public static void method636(@OriginalArg(1) byte arg0) {
		if (Static55.aByteArrayArrayArray2 == null) {
			Static55.aByteArrayArrayArray2 = new byte[4][Static400.anInt6818][Static271.anInt5050];
		}
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			for (@Pc(26) int local26 = 0; local26 < Static400.anInt6818; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static271.anInt5050; local30++) {
					Static55.aByteArrayArrayArray2[local22][local26][local30] = arg0;
				}
			}
		}
	}
}
