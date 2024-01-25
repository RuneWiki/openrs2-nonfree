import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V")
	public static void method2702() {
		Static87.method2102();
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)V")
	public static void method2703() {
		Static153.method3021(Static218.aClass46_5, (long) Static153.anInt3257);
		if (Static324.anInt6226 != -1) {
			Static164.method3269(Static324.anInt6226);
		}
		for (@Pc(19) int local19 = 0; local19 < Static304.anInt5859; local19++) {
			if (Static338.aBooleanArray29[local19]) {
				Static194.aBooleanArray17[local19] = true;
			}
			Static127.aBooleanArray14[local19] = Static338.aBooleanArray29[local19];
			Static338.aBooleanArray29[local19] = false;
		}
		Static331.anInt6394 = Static153.anInt3257;
		if (Static218.aClass46_5.method5160()) {
			Static1.aBoolean433 = true;
		}
		Static294.aClass146_54 = null;
		if (Static324.anInt6226 != -1) {
			Static304.anInt5859 = 0;
			Static343.method5860();
		}
		Static218.aClass46_5.method5139();
		Static160.method3100(Static29.anInt4694);
		Static71.anInt5636 = 0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "()V")
	public static void method2704() {
		for (@Pc(1) int local1 = 0; local1 < Static165.anInt5082; local1++) {
			@Pc(6) Class10_Sub3 local6 = Static352.aClass10_Sub3Array3[local1];
			Static155.method3046(local6);
			Static352.aClass10_Sub3Array3[local1] = null;
		}
		Static165.anInt5082 = 0;
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(B)V")
	public static void method2705() {
		if (Static129.anInt2792 > 1) {
			Static129.anInt2792--;
			Static149.anInt3221 = Static348.anInt5338;
		}
		if (Static336.anInt6486 > 0) {
			Static336.anInt6486--;
		}
		if (Static140.aBoolean195) {
			Static140.aBoolean195 = false;
			Static48.method1176();
			return;
		}
		if (!Static302.aBoolean409) {
			Static188.method3593();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static305.method5318(); local38++) {
		}
		if (Static302.anInt5842 != 30) {
			return;
		}
		Static253.method1018(Static164.aClass14_Sub4_Sub2_3);
		@Pc(62) Object local62 = Static16.aClass197_1.anObject6;
		@Pc(92) int local92;
		@Pc(94) int local94;
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(134) int local134;
		@Pc(200) int local200;
		synchronized (Static16.aClass197_1.anObject6) {
			if (!Static254.aBoolean326) {
				Static16.aClass197_1.anInt6047 = 0;
			} else if (Static68.anInt1636 != 0 || Static16.aClass197_1.anInt6047 >= 40) {
				Static164.aClass14_Sub4_Sub2_3.method2557(38);
				Static164.aClass14_Sub4_Sub2_3.method2538(0);
				local92 = Static164.aClass14_Sub4_Sub2_3.anInt2637;
				local94 = 0;
				for (local96 = 0; local96 < Static16.aClass197_1.anInt6047 && Static164.aClass14_Sub4_Sub2_3.anInt2637 - local92 < 240; local96++) {
					local94++;
					local113 = Static16.aClass197_1.anIntArray539[local96];
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 65534) {
						local113 = 65534;
					}
					local134 = Static16.aClass197_1.anIntArray540[local96];
					if (local134 < 0) {
						local134 = 0;
					} else if (local134 > 65534) {
						local134 = 65534;
					}
					@Pc(152) boolean local152 = false;
					if (Static16.aClass197_1.anIntArray539[local96] == -1 && Static16.aClass197_1.anIntArray540[local96] == -1) {
						local113 = -1;
						local134 = -1;
						local152 = true;
					}
					if (Static197.anInt3997 != local134 || Static78.anInt1885 != local113) {
						local200 = local134 - Static197.anInt3997;
						Static197.anInt3997 = local134;
						@Pc(207) int local207 = local113 - Static78.anInt1885;
						Static78.anInt1885 = local113;
						if (Static160.anInt3351 < 8 && local200 >= -32 && local200 <= 31 && local207 >= -32 && local207 <= 31) {
							local200 += 32;
							local207 += 32;
							Static164.aClass14_Sub4_Sub2_3.method2509(local207 + (local200 << 6) + (Static160.anInt3351 << 12));
							Static160.anInt3351 = 0;
						} else if (Static160.anInt3351 < 32 && local200 >= -128 && local200 <= 127 && local207 >= -128 && local207 <= 127) {
							local200 += 128;
							local207 += 128;
							Static164.aClass14_Sub4_Sub2_3.method2538(Static160.anInt3351 + 128);
							Static164.aClass14_Sub4_Sub2_3.method2509((local200 << 8) + local207);
							Static160.anInt3351 = 0;
						} else if (Static160.anInt3351 < 32) {
							Static164.aClass14_Sub4_Sub2_3.method2538(Static160.anInt3351 + 192);
							if (local152) {
								Static164.aClass14_Sub4_Sub2_3.method2541(Integer.MIN_VALUE);
							} else {
								Static164.aClass14_Sub4_Sub2_3.method2541(local113 << 16 | local134);
							}
							Static160.anInt3351 = 0;
						} else {
							Static164.aClass14_Sub4_Sub2_3.method2509(Static160.anInt3351 + 57344);
							if (local152) {
								Static164.aClass14_Sub4_Sub2_3.method2541(Integer.MIN_VALUE);
							} else {
								Static164.aClass14_Sub4_Sub2_3.method2541(local134 | local113 << 16);
							}
							Static160.anInt3351 = 0;
						}
					} else if (Static160.anInt3351 < 2047) {
						Static160.anInt3351++;
					}
				}
				Static164.aClass14_Sub4_Sub2_3.method2523(Static164.aClass14_Sub4_Sub2_3.anInt2637 - local92);
				if (local94 >= Static16.aClass197_1.anInt6047) {
					Static16.aClass197_1.anInt6047 = 0;
				} else {
					Static16.aClass197_1.anInt6047 -= local94;
					for (local113 = 0; local113 < Static16.aClass197_1.anInt6047; local113++) {
						Static16.aClass197_1.anIntArray540[local113] = Static16.aClass197_1.anIntArray540[local113 + local94];
						Static16.aClass197_1.anIntArray539[local113] = Static16.aClass197_1.anIntArray539[local113 + local94];
					}
				}
			}
		}
		if (Static68.anInt1636 != 0) {
			@Pc(429) long local429 = (Static203.aLong197 - Static213.aLong124) / 50L;
			if (local429 > 32767L) {
				local429 = 32767L;
			}
			Static213.aLong124 = Static203.aLong197;
			local92 = Static321.anInt6195;
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 65535) {
				local92 = 65535;
			}
			local94 = Static272.anInt5167;
			if (local94 < 0) {
				local94 = 0;
			} else if (local94 > 65535) {
				local94 = 65535;
			}
			@Pc(477) byte local477 = 0;
			if (Static68.anInt1636 == 2) {
				local477 = 1;
			}
			Static164.aClass14_Sub4_Sub2_3.method2557(210);
			local113 = (int) local429;
			Static164.aClass14_Sub4_Sub2_3.method2524(local477 << 15 | local113);
			Static164.aClass14_Sub4_Sub2_3.method2541(local94 | local92 << 16);
		}
		if (Static182.anInt3778 > 0) {
			Static182.anInt3778--;
		}
		if (Static72.aBoolean114 && Static182.anInt3778 <= 0) {
			Static72.aBoolean114 = false;
			Static182.anInt3778 = 20;
			Static164.aClass14_Sub4_Sub2_3.method2557(177);
			Static164.aClass14_Sub4_Sub2_3.method2509((int) Static274.aFloat100 >> 3);
			Static164.aClass14_Sub4_Sub2_3.method2524((int) Static94.aFloat42 >> 3);
		}
		if (Static131.aBoolean115 && !Static99.aBoolean156) {
			Static99.aBoolean156 = true;
			Static164.aClass14_Sub4_Sub2_3.method2557(111);
			Static164.aClass14_Sub4_Sub2_3.method2538(1);
		}
		if (!Static131.aBoolean115 && Static99.aBoolean156) {
			Static99.aBoolean156 = false;
			Static164.aClass14_Sub4_Sub2_3.method2557(111);
			Static164.aClass14_Sub4_Sub2_3.method2538(0);
		}
		if (!Static251.aBoolean207) {
			Static164.aClass14_Sub4_Sub2_3.method2557(110);
			Static164.aClass14_Sub4_Sub2_3.method2537(Static164.method3265());
			Static251.aBoolean207 = true;
		}
		if (Static98.aClass213ArrayArrayArray2 != null) {
			if (Static205.anInt4115 == 2) {
				Static317.method5476();
			} else if (Static205.anInt4115 == 3) {
				Static171.method3336();
			}
		}
		if (Static289.aBoolean368) {
			Static289.aBoolean368 = false;
		} else {
			Static232.aFloat44 /= 2.0F;
		}
		if (Static210.aBoolean276) {
			Static210.aBoolean276 = false;
		} else {
			Static214.aFloat83 /= 2.0F;
		}
		Static1.method5708();
		if (Static302.anInt5842 != 30) {
			return;
		}
		Static93.method2170();
		Static312.method5387();
		Static181.method3506();
		Static81.anInt1990++;
		if (Static81.anInt1990 > 750) {
			Static48.method1176();
			return;
		}
		Static147.method2547();
		Static312.method5388();
		Static105.method2290();
		for (@Pc(687) int local687 = Static199.method3714(true); local687 != -1; local687 = Static199.method3714(false)) {
			Static245.method3550(local687);
			Static300.anIntArray610[Static319.anInt6144++ & 0x1F] = local687;
		}
		@Pc(758) Class146 local758;
		@Pc(789) int local789;
		for (@Pc(712) Class14_Sub2_Sub13 local712 = Static216.method3894(); local712 != null; local712 = Static216.method3894()) {
			local92 = local712.method3534();
			local94 = local712.method3538();
			if (local92 == 1) {
				Static30.anIntArray45[local94] = local712.anInt3805;
				Static8.aBoolean8 |= Static120.aBooleanArray12[local94];
				Static90.anIntArray195[Static165.anInt5089++ & 0x1F] = local94;
			} else if (local92 == 2) {
				Static147.aStringArray35[local94] = local712.aString132;
				Static340.anIntArray624[Static252.anInt4851++ & 0x1F] = local94;
			} else if (local92 == 3) {
				local758 = Static273.method4632(local94);
				if (!local712.aString132.equals(local758.aString149)) {
					local758.aString149 = local712.aString132;
					Static166.method3295(local758);
				}
			} else if (local92 == 4) {
				local758 = Static273.method4632(local94);
				local113 = local712.anInt3805;
				local134 = local712.anInt3808;
				local789 = local712.anInt3802;
				if (local113 != local758.anInt4169 || local134 != local758.anInt4179 || local758.anInt4204 != local789) {
					local758.anInt4179 = local134;
					local758.anInt4204 = local789;
					local758.anInt4169 = local113;
					Static166.method3295(local758);
				}
			} else if (local92 == 5) {
				local758 = Static273.method4632(local94);
				if (local712.anInt3805 != local758.anInt4202 || local712.anInt3805 == -1) {
					local758.anInt4201 = 0;
					local758.anInt4155 = 0;
					local758.anInt4147 = 1;
					local758.anInt4202 = local712.anInt3805;
					Static166.method3295(local758);
				}
			} else if (local92 == 6) {
				local96 = local712.anInt3805;
				local113 = local96 >> 10 & 0x1F;
				local134 = local96 >> 5 & 0x1F;
				local789 = local96 & 0x1F;
				local200 = (local113 << 19) + (local134 << 11) + (local789 << 3);
				@Pc(862) Class146 local862 = Static273.method4632(local94);
				if (local862.anInt4166 != local200) {
					local862.anInt4166 = local200;
					Static166.method3295(local862);
				}
			} else if (local92 == 7) {
				local758 = Static273.method4632(local94);
				@Pc(1186) boolean local1186 = local712.anInt3805 == 1;
				if (local1186 != local758.aBoolean268) {
					local758.aBoolean268 = local1186;
					Static166.method3295(local758);
				}
			} else if (local92 == 8) {
				local758 = Static273.method4632(local94);
				if (local712.anInt3805 != local758.anInt4165 || local758.anInt4190 != local712.anInt3808 || local712.anInt3802 != local758.anInt4211) {
					local758.anInt4211 = local712.anInt3802;
					local758.anInt4190 = local712.anInt3808;
					local758.anInt4165 = local712.anInt3805;
					if (local758.anInt4124 != -1) {
						if (local758.anInt4173 > 0) {
							local758.anInt4211 = local758.anInt4211 * 32 / local758.anInt4173;
						} else if (local758.anInt4125 > 0) {
							local758.anInt4211 = local758.anInt4211 * 32 / local758.anInt4125;
						}
					}
					Static166.method3295(local758);
				}
			} else if (local92 == 9) {
				local758 = Static273.method4632(local94);
				if (local758.anInt4124 != local712.anInt3805 || local758.anInt4206 != local712.anInt3808) {
					local758.anInt4206 = local712.anInt3808;
					local758.anInt4124 = local712.anInt3805;
					Static166.method3295(local758);
				}
			} else if (local92 == 10) {
				local758 = Static273.method4632(local94);
				if (local758.anInt4177 != local712.anInt3805 || local712.anInt3808 != local758.anInt4175 || local758.anInt4139 != local712.anInt3802) {
					local758.anInt4139 = local712.anInt3802;
					local758.anInt4177 = local712.anInt3805;
					local758.anInt4175 = local712.anInt3808;
					Static166.method3295(local758);
				}
			} else if (local92 == 11) {
				local758 = Static273.method4632(local94);
				local758.aByte42 = 0;
				local758.anInt4161 = local758.anInt4148 = local712.anInt3805;
				local758.anInt4140 = local758.anInt4196 = local712.anInt3808;
				local758.aByte41 = 0;
				Static166.method3295(local758);
			} else if (local92 == 12) {
				local758 = Static273.method4632(local94);
				local113 = local712.anInt3805;
				if (local758 != null && local758.anInt4135 == 0) {
					if (local758.anInt4197 - local758.anInt4199 < local113) {
						local113 = local758.anInt4197 - local758.anInt4199;
					}
					if (local113 < 0) {
						local113 = 0;
					}
					if (local758.anInt4128 != local113) {
						local758.anInt4128 = local113;
						Static166.method3295(local758);
					}
				}
			} else if (local92 == 13) {
				local758 = Static273.method4632(local94);
				local758.anInt4143 = local712.anInt3805;
			} else if (local92 == 14) {
				local758 = Static273.method4632(local94);
				local758.anInt4174 = local712.anInt3805;
			} else if (local92 == 15) {
				Static140.anInt2984 = local712.anInt3805;
				Static213.anInt4250 = local712.anInt3808;
				Static276.aBoolean348 = true;
			}
		}
		Static71.anInt5636++;
		if (Static327.anInt6304 != 0) {
			Static27.anInt614 += 20;
			if (Static27.anInt614 >= 400) {
				Static327.anInt6304 = 0;
			}
		}
		if (Static72.aClass146_17 != null) {
			Static38.anInt911++;
			if (Static38.anInt911 >= 15) {
				Static166.method3295(Static72.aClass146_17);
				Static72.aClass146_17 = null;
			}
		}
		@Pc(1291) Class146 local1291 = Static86.aClass146_19;
		Static86.aClass146_19 = null;
		@Pc(1295) Class146 local1295 = Static2.aClass146_1;
		Static281.aClass146_52 = null;
		Static111.aBoolean173 = false;
		Static2.aClass146_1 = null;
		Static38.anInt907 = 0;
		Static61.aBoolean93 = false;
		while (Static64.method1507() && Static38.anInt907 < 128) {
			if (!Static183.method3533() || Static81.aChar2 != '`' && Static81.aChar2 != '§') {
				Static347.anIntArray640[Static38.anInt907] = Static251.anInt3169;
				Static331.anIntArray609[Static38.anInt907] = Static81.aChar2;
				Static38.anInt907++;
			} else if (Static151.method3009()) {
				Static45.method1109();
			} else {
				Static331.method5694();
			}
		}
		if (Static151.method3009()) {
			Static297.method5070();
		}
		Static206.aClass146_60 = null;
		Static14.method336(-1, -1, null);
		Static138.method2792(null, -1, -1);
		Static155.method3045();
		Static348.anInt5338++;
		if (Static278.aBoolean349) {
			Static164.aClass14_Sub4_Sub2_3.method2557(230);
			Static164.aClass14_Sub4_Sub2_3.method2541(Static330.anInt6365 | Static315.anInt6453 << 28 | Static165.anInt5077 << 14);
			Static278.aBoolean349 = false;
		}
		while (true) {
			@Pc(1421) Class146 local1421;
			@Pc(1405) Class14_Sub15 local1405;
			@Pc(1410) Class146 local1410;
			do {
				local1405 = (Class14_Sub15) Static142.aClass18_14.method454();
				if (local1405 == null) {
					while (true) {
						do {
							local1405 = (Class14_Sub15) Static336.aClass18_46.method454();
							if (local1405 == null) {
								while (true) {
									do {
										local1405 = (Class14_Sub15) Static307.aClass18_11.method454();
										if (local1405 == null) {
											if (Static206.aClass146_60 == null) {
												Static86.anInt2091 = 0;
											}
											if (Static94.aClass146_21 != null) {
												Static123.method5338();
											}
											if (Static40.anInt979 > 0 && Static345.aBooleanArray30[82] && Static345.aBooleanArray30[81] && Static5.anInt4507 != 0) {
												local96 = Static219.anInt4400 - Static5.anInt4507;
												if (local96 < 0) {
													local96 = 0;
												} else if (local96 > 3) {
													local96 = 3;
												}
												Static319.method5485(local96, Static151.anInt3234 + Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] + Static251.anInt3170);
											}
											Static292.method4999();
											if (Static176.aClass146_40 != null) {
												Static166.method3295(Static176.aClass146_40);
												Static193.anInt3955++;
												if (Static302.anInt5839 + 5 < Static63.anInt1529 || Static302.anInt5839 - 5 > Static63.anInt1529 || Static44.anInt1107 + 5 < Static328.anInt6333 || Static44.anInt1107 - 5 > Static328.anInt6333) {
													Static266.aBoolean338 = true;
												}
												if (Static199.anInt4021 == 0) {
													if (Static266.aBoolean338 && Static193.anInt3955 >= 5) {
														if (Static294.aClass146_54 == Static176.aClass146_40 && Static67.anInt1610 != Static354.anInt6717) {
															local758 = Static176.aClass146_40;
															@Pc(1677) byte local1677 = 0;
															if (Static124.anInt2718 == 1 && local758.anInt4198 == 206) {
																local1677 = 1;
															}
															if (local758.anIntArray374[Static67.anInt1610] <= 0) {
																local1677 = 0;
															}
															if (local1677 == 1) {
																local134 = Static354.anInt6717;
																local789 = Static67.anInt1610;
																while (local134 != local789) {
																	if (local789 < local134) {
																		local758.method3797(local134 - 1, local134);
																		local134--;
																	} else if (local789 > local134) {
																		local758.method3797(local134 + 1, local134);
																		local134++;
																	}
																}
															} else {
																local758.method3797(Static67.anInt1610, Static354.anInt6717);
															}
															Static164.aClass14_Sub4_Sub2_3.method2557(77);
															Static164.aClass14_Sub4_Sub2_3.method2541(Static176.aClass146_40.anInt4214);
															Static164.aClass14_Sub4_Sub2_3.method2524(Static67.anInt1610);
															Static164.aClass14_Sub4_Sub2_3.method2524(Static354.anInt6717);
															Static164.aClass14_Sub4_Sub2_3.method2543(local1677);
														}
													} else if ((Static327.anInt6303 == 1 || Static66.method1649()) && Static41.anInt980 > 2) {
														Static28.method721(Static328.anInt6333, Static63.anInt1529);
													} else if (Static291.method4988()) {
														Static258.method4427();
													}
													Static68.anInt1636 = 0;
													Static176.aClass146_40 = null;
													Static38.anInt911 = 10;
												}
											}
											if (Static86.aClass146_19 != local1291) {
												if (local1291 != null) {
													Static166.method3295(local1291);
												}
												if (Static86.aClass146_19 != null) {
													Static166.method3295(Static86.aClass146_19);
												}
											}
											if (local1295 != Static2.aClass146_1 && Static53.anInt1331 == Static175.anInt3622) {
												if (local1295 != null) {
													Static166.method3295(local1295);
												}
												if (Static2.aClass146_1 != null) {
													Static166.method3295(Static2.aClass146_1);
												}
											}
											if (Static2.aClass146_1 == null) {
												if (Static53.anInt1331 > 0) {
													Static53.anInt1331--;
												}
											} else if (Static53.anInt1331 < Static175.anInt3622) {
												Static53.anInt1331++;
												if (Static53.anInt1331 == Static175.anInt3622) {
													Static166.method3295(Static2.aClass146_1);
												}
											}
											for (local96 = 0; local96 < 5; local96++) {
												@Pc(1857) int local1857 = Static102.anIntArray210[local96]++;
											}
											local113 = Static7.method205();
											local134 = Static128.method3775();
											if (local113 > 15000 && local134 > 15000) {
												Static336.anInt6486 = 250;
												Static81.method2016(14500);
												Static164.aClass14_Sub4_Sub2_3.method2557(46);
											}
											if (Static8.aBoolean8 && Static26.aLong17 < Static168.method3300() - 60000L) {
												Static189.method5490();
											}
											Static154.anInt3266++;
											if (Static154.anInt3266 > 500) {
												Static154.anInt3266 = 0;
												local789 = (int) (Math.random() * 8.0D);
												if ((local789 & 0x1) == 1) {
													Static253.anInt1051 += Static24.anInt602;
												}
												if ((local789 & 0x2) == 2) {
													Static240.anInt6477 += Static104.anInt2318;
												}
												if ((local789 & 0x4) == 4) {
													Static70.anInt1688 += Static39.anInt976;
												}
											}
											if (Static253.anInt1051 < -50) {
												Static24.anInt602 = 2;
											}
											if (Static240.anInt6477 < -55) {
												Static104.anInt2318 = 2;
											}
											if (Static253.anInt1051 > 50) {
												Static24.anInt602 = -2;
											}
											if (Static70.anInt1688 < -40) {
												Static39.anInt976 = 1;
											}
											if (Static240.anInt6477 > 55) {
												Static104.anInt2318 = -2;
											}
											Static265.anInt5049++;
											if (Static70.anInt1688 > 40) {
												Static39.anInt976 = -1;
											}
											if (Static265.anInt5049 > 500) {
												Static265.anInt5049 = 0;
												local789 = (int) (Math.random() * 8.0D);
												if ((local789 & 0x2) == 2) {
													Static309.anInt5886 += Static3.anInt108;
												}
												if ((local789 & 0x1) == 1) {
													Static8.anInt205 += Static182.anInt3775;
												}
											}
											if (Static8.anInt205 < -60) {
												Static182.anInt3775 = 2;
											}
											if (Static8.anInt205 > 60) {
												Static182.anInt3775 = -2;
											}
											if (Static309.anInt5886 < -20) {
												Static3.anInt108 = 1;
											}
											if (Static309.anInt5886 > 10) {
												Static3.anInt108 = -1;
											}
											Static102.anInt2290++;
											if (Static102.anInt2290 > 50) {
												Static164.aClass14_Sub4_Sub2_3.method2557(248);
											}
											if (Static49.aBoolean82) {
												Static190.method3627();
												Static49.aBoolean82 = false;
											}
											try {
												if (Static138.aClass159_3 != null && Static164.aClass14_Sub4_Sub2_3.anInt2637 > 0) {
													Static138.aClass159_3.method4082(Static164.aClass14_Sub4_Sub2_3.aByteArray74, Static164.aClass14_Sub4_Sub2_3.anInt2637);
													Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
													Static102.anInt2290 = 0;
													return;
												}
												return;
											} catch (@Pc(2089) IOException local2089) {
												Static48.method1176();
												return;
											}
										}
										local1410 = local1405.aClass146_22;
										if (local1410.anInt4126 < 0) {
											break;
										}
										local1421 = Static273.method4632(local1410.anInt4146);
									} while (local1421 == null || local1421.aClass146Array2 == null || local1421.aClass146Array2.length <= local1410.anInt4126 || local1421.aClass146Array2[local1410.anInt4126] != local1410);
									Static10.method223(local1405);
								}
							}
							local1410 = local1405.aClass146_22;
							if (local1410.anInt4126 < 0) {
								break;
							}
							local1421 = Static273.method4632(local1410.anInt4146);
						} while (local1421 == null || local1421.aClass146Array2 == null || local1421.aClass146Array2.length <= local1410.anInt4126 || local1410 != local1421.aClass146Array2[local1410.anInt4126]);
						Static10.method223(local1405);
					}
				}
				local1410 = local1405.aClass146_22;
				if (local1410.anInt4126 < 0) {
					break;
				}
				local1421 = Static273.method4632(local1410.anInt4146);
			} while (local1421 == null || local1421.aClass146Array2 == null || local1410.anInt4126 >= local1421.aClass146Array2.length || local1421.aClass146Array2[local1410.anInt4126] != local1410);
			Static10.method223(local1405);
		}
	}
}
