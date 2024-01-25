import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!or", name = "L", descriptor = "[I")
	public static int[] anIntArray478;

	@OriginalMember(owner = "client!or", name = "U", descriptor = "I")
	public static int anInt7409;

	@OriginalMember(owner = "client!or", name = "C", descriptor = "Z")
	public static boolean aBoolean632 = false;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!cp;Lclient!gn;)V")
	public static void method6189(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class125 arg1) {
		if (!arg1.aBoolean271) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort44;
		@Pc(9) short local9 = arg1.aShort46;
		@Pc(12) byte local12 = arg1.aByte34;
		@Pc(15) byte local15 = arg1.aByte36;
		@Pc(21) int local21 = (local6 << Static309.anInt6172) + Static377.anInt7321;
		@Pc(27) int local27 = (local9 << Static309.anInt6172) + Static377.anInt7321;
		@Pc(31) Class125[][] local31 = Static580.aClass125ArrayArrayArray3[local12];
		if (Static495.aClass4Array4 == Static224.aClass4Array3) {
			Static338.aClass15_11.LA(Static381.aClass4Array2[0].sa(local21, local27), Static69.method1732(local6, local9), Static24.method891(local6, local9), Static340.method5816(local6, local9));
		}
		@Pc(68) Class125 local68;
		@Pc(556) Class55_Sub6 local556;
		@Pc(643) int local643;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(667) int local667;
		@Pc(346) int local346;
		@Pc(292) boolean local292;
		@Pc(326) Class55_Sub6 local326;
		@Pc(348) int local348;
		@Pc(351) Class2_Sub4 local351;
		@Pc(638) int local638;
		if (arg1.aBoolean273) {
			if (Static141.aBoolean254) {
				if (local12 > 0) {
					local68 = Static580.aClass125ArrayArrayArray3[local12 - 1][local6][local9];
					if (local68 != null && local68.aBoolean271) {
						return;
					}
				}
				if (local6 <= Static342.anInt6991 && local6 > Static10.anInt363) {
					local68 = local31[local6 - 1][local9];
					if (local68 != null && local68.aBoolean271 && (local68.aBoolean273 || (arg1.aByte33 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static342.anInt6991 && local6 < Static251.anInt5429 - 1) {
					local68 = local31[local6 + 1][local9];
					if (local68 != null && local68.aBoolean271 && (local68.aBoolean273 || (arg1.aByte33 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static484.anInt9030 && local9 > Static123.anInt2876) {
					local68 = local31[local6][local9 - 1];
					if (local68 != null && local68.aBoolean271 && (local68.aBoolean273 || (arg1.aByte33 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static484.anInt9030 && local9 < Static341.anInt6986 - 1) {
					local68 = local31[local6][local9 + 1];
					if (local68 != null && local68.aBoolean271 && (local68.aBoolean273 || (arg1.aByte33 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static141.aBoolean254 = true;
			}
			arg1.aBoolean273 = false;
			if (arg1.aClass125_1 != null) {
				local68 = arg1.aClass125_1;
				if (!Static232.method3980(local68.aByte36, local6, local9)) {
					Static224.aClass4Array3[local68.aByte36].method8442(local6, local9);
				}
				@Pc(217) Class2_Sub4 local217 = local68.aClass2_Sub4_1;
				if (local217 != null) {
					if (Static392.aBoolean641) {
						if ((local217.anInt7254 & arg1.aShort45) == 0) {
							Static242.method4280(arg0, local12, local6, local9);
						} else {
							Static525.method7767(arg0, local217.anInt7254, local15, local6, local9);
						}
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					local217.method8382(Static338.aClass15_11);
				}
				for (@Pc(254) Class302 local254 = local68.aClass302_1; local254 != null; local254 = local254.aClass302_2) {
					@Pc(258) Class2_Sub2 local258 = local254.aClass2_Sub2_1;
					if (local258 != null) {
						if (Static392.aBoolean641) {
							Static242.method4280(arg0, local12, local6, local9);
							Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
						}
						local258.method8382(Static338.aClass15_11);
					}
				}
			}
			local292 = !Static232.method3980(local15, local6, local9);
			if (local292) {
				Static224.aClass4Array3[local15].method8442(local6, local9);
				@Pc(303) Class2_Sub1 local303 = arg1.aClass2_Sub1_1;
				if (local303 != null && local303.aBoolean852) {
					if (Static392.aBoolean641) {
						Static242.method4280(arg0, local12, local6, local9);
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					local326 = local303.method8382(Static338.aClass15_11);
					if (local326 != null) {
						local326.aClass2_1 = local303;
						local326.anInt8011 = local12;
						local326.anInt8009 = local6;
						local326.anInt8007 = local9;
						Static166.aClass134_4.method3236(local326);
					}
				}
			}
			local346 = 0;
			local348 = 0;
			local351 = arg1.aClass2_Sub4_1;
			@Pc(354) Class2_Sub3 local354 = arg1.aClass2_Sub3_2;
			if (local351 != null || local354 != null) {
				if (Static342.anInt6991 == local6) {
					local346++;
				} else if (Static342.anInt6991 < local6) {
					local346 += 2;
				}
				if (Static484.anInt9030 == local9) {
					local346 += 3;
				} else if (Static484.anInt9030 > local9) {
					local346 += 6;
				}
				local348 = Static150.anIntArray218[local346];
				arg1.aShort45 = Static260.aShortArray75[local346];
			}
			if (local351 != null) {
				if ((local351.anInt7254 & Static60.anIntArray78[local346]) == 0) {
					arg1.aByte32 = 0;
				} else if (local351.anInt7254 == 16) {
					arg1.aByte32 = 3;
					arg1.aByte35 = Static259.aByteArray64[local346];
					arg1.aByte31 = (byte) (3 - arg1.aByte35);
				} else if (local351.anInt7254 == 32) {
					arg1.aByte32 = 6;
					arg1.aByte35 = Static262.aByteArray66[local346];
					arg1.aByte31 = (byte) (6 - arg1.aByte35);
				} else if (local351.anInt7254 == 64) {
					arg1.aByte32 = 12;
					arg1.aByte35 = Static590.aByteArray119[local346];
					arg1.aByte31 = (byte) (12 - arg1.aByte35);
				} else {
					arg1.aByte32 = 9;
					arg1.aByte35 = Static572.aByteArray111[local346];
					arg1.aByte31 = (byte) (9 - arg1.aByte35);
				}
				if ((local351.anInt7254 & local348) != 0 && !Static54.method1305(local15, local6, local9, local351.anInt7254)) {
					if (Static392.aBoolean641) {
						Static242.method4280(arg0, local12, local6, local9);
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					@Pc(503) Class55_Sub6 local503 = local351.method8382(Static338.aClass15_11);
					if (local503 != null) {
						local503.aClass2_1 = local351;
						local503.anInt8011 = local12;
						local503.anInt8009 = local6;
						local503.anInt8007 = local9;
						Static166.aClass134_4.method3236(local503);
					}
				}
				@Pc(524) Class2_Sub4 local524 = arg1.aClass2_Sub4_2;
				if (local524 != null && (local524.anInt7254 & local348) != 0 && !Static54.method1305(local15, local6, local9, local524.anInt7254)) {
					if (Static392.aBoolean641) {
						Static242.method4280(arg0, local12, local6, local9);
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					local556 = local524.method8382(Static338.aClass15_11);
					if (local556 != null) {
						local556.aClass2_1 = local524;
						local556.anInt8011 = local12;
						local556.anInt8009 = local6;
						local556.anInt8007 = local9;
						Static166.aClass134_4.method3236(local556);
					}
				}
			}
			if (local354 != null && !Static595.method8409(local15, local6, local9, local354.method7700())) {
				@Pc(587) Class2_Sub3 local587 = arg1.aClass2_Sub3_1;
				if ((local354.anInt9491 & local348) != 0) {
					if (Static392.aBoolean641) {
						Static242.method4280(arg0, local12, local6, local9);
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					local556 = local354.method8382(Static338.aClass15_11);
					if (local556 != null) {
						local556.aClass2_1 = local354;
						local556.anInt8011 = local12;
						local556.anInt8009 = local6;
						local556.anInt8007 = local9;
						Static166.aClass134_4.method3236(local556);
					}
				} else if (local354.anInt9491 == 256) {
					local638 = local354.anInt9494 - Static238.anInt9925;
					local643 = local354.anInt9486 - Static327.anInt6816;
					local646 = local354.anInt9498;
					if (local646 == 1 || local646 == 2) {
						local655 = -local638;
					} else {
						local655 = local638;
					}
					if (local646 == 2 || local646 == 3) {
						local667 = -local643;
					} else {
						local667 = local643;
					}
					if (Static392.aBoolean641) {
						Static242.method4280(arg0, local12, local6, local9);
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					@Pc(691) Class55_Sub6 local691;
					if (local667 < local655) {
						local691 = local354.method8382(Static338.aClass15_11);
						if (local691 != null) {
							local691.aClass2_1 = local354;
							local691.anInt8011 = local12;
							local691.anInt8009 = local6;
							local691.anInt8007 = local9;
							Static166.aClass134_4.method3236(local691);
						}
					} else if (local587 != null) {
						local691 = local587.method8382(Static338.aClass15_11);
						if (local691 != null) {
							local691.aClass2_1 = local587;
							local691.anInt8011 = local12;
							local691.anInt8009 = local6;
							local691.anInt8007 = local9;
							Static166.aClass134_4.method3236(local691);
						}
					}
				}
			}
			if (local292) {
				@Pc(740) Class2_Sub1 local740 = arg1.aClass2_Sub1_1;
				if (local740 != null && !local740.aBoolean852) {
					if (Static392.aBoolean641) {
						Static242.method4280(arg0, local12, local6, local9);
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					local556 = local740.method8382(Static338.aClass15_11);
					if (local556 != null) {
						local556.aClass2_1 = local740;
						local556.anInt8011 = local12;
						local556.anInt8009 = local6;
						local556.anInt8007 = local9;
						Static166.aClass134_4.method3236(local556);
					}
				}
				@Pc(784) Class2_Sub5 local784 = arg1.aClass2_Sub5_1;
				if (local784 != null && !local784.aBoolean822) {
					if (Static392.aBoolean641) {
						Static242.method4280(arg0, local12, local6, local9);
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					@Pc(807) Class55_Sub6 local807 = local784.method8382(Static338.aClass15_11);
					if (local807 != null) {
						local807.aClass2_1 = local784;
						local807.anInt8011 = local12;
						local807.anInt8009 = local6;
						local807.anInt8007 = local9;
						Static166.aClass134_4.method3236(local807);
					}
				}
			}
			@Pc(828) byte local828 = arg1.aByte33;
			if (local828 != 0) {
				@Pc(845) Class125 local845;
				if (local6 < Static342.anInt6991 && (local828 & 0x4) != 0) {
					local845 = local31[local6 + 1][local9];
					if (local845 != null && local845.aBoolean271) {
						Static415.aClass89_1.method3870(local845);
					}
				}
				if (local9 < Static484.anInt9030 && (local828 & 0x2) != 0) {
					local845 = local31[local6][local9 + 1];
					if (local845 != null && local845.aBoolean271) {
						Static415.aClass89_1.method3870(local845);
					}
				}
				if (local6 > Static342.anInt6991 && (local828 & 0x1) != 0) {
					local845 = local31[local6 - 1][local9];
					if (local845 != null && local845.aBoolean271) {
						Static415.aClass89_1.method3870(local845);
					}
				}
				if (local9 > Static484.anInt9030 && (local828 & 0x8) != 0) {
					local845 = local31[local6][local9 - 1];
					if (local845 != null && local845.aBoolean271) {
						Static415.aClass89_1.method3870(local845);
					}
				}
			}
		}
		@Pc(978) int local978;
		@Pc(961) Class2_Sub4 local961;
		@Pc(982) int local982;
		@Pc(934) Class302 local934;
		if (arg1.aByte32 != 0) {
			local292 = true;
			for (local934 = arg1.aClass302_1; local934 != null; local934 = local934.aClass302_2) {
				if (local934.aClass2_Sub2_1.anInt9397 != Static360.anInt1763 && (local934.anInt9079 & arg1.aByte32) == arg1.aByte35) {
					local292 = false;
					break;
				}
			}
			if (local292) {
				local961 = arg1.aClass2_Sub4_1;
				if (!Static54.method1305(local15, local6, local9, local961.anInt7254)) {
					if (Static392.aBoolean641) {
						label663: {
							if (local961.anInt7254 >= 16) {
								local978 = local6 - Static342.anInt6991;
								local982 = local9 - Static484.anInt9030;
								if (local961.anInt7254 == 16) {
									local978 -= Static377.anInt7321;
									local982 += Static377.anInt7321;
									if (local982 < local978 && local6 > 0 && local9 <= Static416.anInt10065) {
										Static242.method4280(arg0, local12, local6 - 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt7254 == 32) {
									local978 += Static377.anInt7321;
									local982 += Static377.anInt7321;
									if (local982 < -local978 && local6 < Static223.anInt4520 && local9 < Static416.anInt10065) {
										Static242.method4280(arg0, local12, local6 + 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt7254 == 64) {
									local978 += Static377.anInt7321;
									local982 -= Static377.anInt7321;
									if (local982 > local978 && local6 < Static223.anInt4520 && local9 > 0) {
										Static242.method4280(arg0, local12, local6 + 1, local9 - 1);
										break label663;
									}
								} else if (local961.anInt7254 == 128) {
									local978 -= Static377.anInt7321;
									local982 -= Static377.anInt7321;
									if (local982 > -local978 && local6 > 0 && local9 > 0) {
										Static242.method4280(arg0, local12, local6 - 1, local9 - 1);
										break label663;
									}
								}
							}
							Static242.method4280(arg0, local12, local6, local9);
						}
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					@Pc(1120) Class55_Sub6 local1120 = local961.method8382(Static338.aClass15_11);
					if (local1120 != null) {
						local1120.aClass2_1 = local961;
						local1120.anInt8011 = local12;
						local1120.anInt8009 = local6;
						local1120.anInt8007 = local9;
						Static166.aClass134_4.method3236(local1120);
					}
				}
				arg1.aByte32 = 0;
			}
		}
		@Pc(1237) int local1237;
		if (arg1.aBoolean272) {
			try {
				arg1.aBoolean272 = false;
				@Pc(1149) int local1149 = 0;
				label606: for (local934 = arg1.aClass302_1; local934 != null; local934 = local934.aClass302_2) {
					@Pc(1156) Class2_Sub2 local1156 = local934.aClass2_Sub2_1;
					if (local1156.anInt9397 != Static360.anInt1763) {
						for (local978 = local1156.aShort120; local978 <= local1156.aShort121; local978++) {
							for (local982 = local1156.aShort122; local982 <= local1156.aShort123; local982++) {
								@Pc(1174) Class125 local1174 = local31[local978][local982];
								if (local1174.aBoolean273) {
									arg1.aBoolean272 = true;
									continue label606;
								}
								if (local1174.aByte32 != 0) {
									local638 = 0;
									if (local978 > local1156.aShort120) {
										local638++;
									}
									if (local978 < local1156.aShort121) {
										local638 += 4;
									}
									if (local982 > local1156.aShort122) {
										local638 += 8;
									}
									if (local982 < local1156.aShort123) {
										local638 += 2;
									}
									if ((local638 & local1174.aByte32) == arg1.aByte31) {
										arg1.aBoolean272 = true;
										continue label606;
									}
								}
							}
						}
						local982 = Static342.anInt6991 - local1156.aShort120;
						local1237 = local1156.aShort121 - Static342.anInt6991;
						if (local1237 > local982) {
							local982 = local1237;
						}
						local638 = Static484.anInt9030 - local1156.aShort122;
						local643 = local1156.aShort123 - Static484.anInt9030;
						if (local643 > local638) {
							local638 = local643;
						}
						arg0.aClass2_Sub2Array3[local1149] = local1156;
						arg0.anIntArray496[local1149++] = local982 + local638;
					}
				}
				while (local1149 > 0) {
					local348 = -50;
					local978 = -1;
					@Pc(1288) Class2_Sub2 local1288;
					for (local982 = 0; local982 < local1149; local982++) {
						local1288 = arg0.aClass2_Sub2Array3[local982];
						if (local1288.anInt9397 != Static360.anInt1763) {
							local638 = arg0.anIntArray496[local982];
							if (local638 > local348) {
								local348 = local638;
								local978 = local982;
							} else if (local638 == local348) {
								local643 = local1288.anInt9398 - Static238.anInt9925;
								local646 = local1288.anInt9396 - Static327.anInt6816;
								local655 = arg0.aClass2_Sub2Array3[local978].anInt9398 - Static238.anInt9925;
								local667 = arg0.aClass2_Sub2Array3[local978].anInt9396 - Static327.anInt6816;
								if (local643 * local643 + local646 * local646 > local655 * local655 + local667 * local667) {
									local978 = local982;
								}
							}
						}
					}
					if (local978 == -1) {
						break;
					}
					local1288 = arg0.aClass2_Sub2Array3[local978];
					local1288.anInt9397 = Static360.anInt1763;
					if (!Static313.method5256(local15, local1288.aShort120, local1288.aShort121, local1288.aShort122, local1288.aShort123, local1288.method7629())) {
						if (Static392.aBoolean641) {
							if (local1288.aByte104 == 0) {
								Static25.method900(arg0, local12, local1288.aShort120, local1288.aShort122, local1288.aShort121, local1288.aShort123);
							} else {
								Static242.method4280(arg0, local12, local6, local9);
								local638 = local6 - Static342.anInt6991;
								local643 = local9 - Static484.anInt9030;
								if (local1288.aByte104 == 2) {
									if (local643 > -local638) {
										Static430.method6816(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static430.method6816(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local643 > local638) {
									Static430.method6816(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static430.method6816(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
						}
						local556 = local1288.method8382(Static338.aClass15_11);
						if (local556 != null) {
							local556.aClass2_1 = local1288;
							local556.anInt8011 = local12;
							local556.anInt8009 = local1288.aShort120;
							local556.anInt8007 = local1288.aShort122;
							Static166.aClass134_4.method3236(local556);
						}
					}
					for (local638 = local1288.aShort120; local638 <= local1288.aShort121; local638++) {
						for (local643 = local1288.aShort122; local643 <= local1288.aShort123; local643++) {
							@Pc(1513) Class125 local1513 = local31[local638][local643];
							if (local1513.aByte32 != 0) {
								Static415.aClass89_1.method3870(local1513);
							} else if ((local638 != local6 || local643 != local9) && local1513.aBoolean271) {
								Static415.aClass89_1.method3870(local1513);
							}
						}
					}
				}
				if (arg1.aBoolean272) {
					return;
				}
			} catch (@Pc(1551) Exception local1551) {
				arg1.aBoolean272 = false;
			}
		}
		if (arg1.aClass274_1 != null && arg1.aByte37 == (byte) (Static236.anInt4895 & 0xFF)) {
			@Pc(1568) Class274 local1568 = arg1.aClass274_1;
			local346 = Static224.aClass4Array3[local12].JA(local6, local9);
			if (local12 < Static264.anInt8587 - 1) {
				local348 = Static224.aClass4Array3[local12].JA(local6, local9) - Static224.aClass4Array3[local12 + 1].JA(local6, local9);
			} else {
				local348 = 0x8 << Static309.anInt6172;
			}
			Static67.aClass255_10.method8168(local21, local346, local27, arg0.anIntArray497);
			local978 = arg0.anIntArray497[2];
			Static67.aClass255_10.method8168(local21, local346 - local348, local27, arg0.anIntArray497);
			local982 = arg0.anIntArray497[2];
			local1237 = local978;
			local638 = local982;
			if (local978 > local982) {
				local1237 = local982;
				local638 = local978;
			}
			local1237 -= Static238.anInt9921;
			local638 += Static238.anInt9921;
			local1568.anInt8396 = local1237;
			local1568.anInt8395 = local638;
			local1568.aBoolean690 = true;
			Static338.aClass15_11.method5277(local1568);
		}
		if (!arg1.aBoolean271) {
			return;
		}
		if (arg1.aByte32 != 0) {
			return;
		}
		if (local6 <= Static342.anInt6991 && local6 > Static10.anInt363) {
			local68 = local31[local6 - 1][local9];
			if (local68 != null && local68.aBoolean271) {
				return;
			}
		}
		if (local6 >= Static342.anInt6991 && local6 < Static251.anInt5429 - 1) {
			local68 = local31[local6 + 1][local9];
			if (local68 != null && local68.aBoolean271) {
				return;
			}
		}
		if (local9 <= Static484.anInt9030 && local9 > Static123.anInt2876) {
			local68 = local31[local6][local9 - 1];
			if (local68 != null && local68.aBoolean271) {
				return;
			}
		}
		if (local9 >= Static484.anInt9030 && local9 < Static341.anInt6986 - 1) {
			local68 = local31[local6][local9 + 1];
			if (local68 != null && local68.aBoolean271) {
				return;
			}
		}
		arg1.aBoolean271 = false;
		Static257.anInt5517--;
		@Pc(1759) Class2_Sub5 local1759 = arg1.aClass2_Sub5_1;
		if (local1759 != null && local1759.aBoolean822) {
			if (Static392.aBoolean641) {
				Static242.method4280(arg0, local12, local6, local9);
				Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
			}
			@Pc(1782) Class55_Sub6 local1782 = local1759.method8382(Static338.aClass15_11);
			if (local1782 != null) {
				local1782.aClass2_1 = local1759;
				local1782.anInt8011 = local12;
				local1782.anInt8009 = local6;
				local1782.anInt8007 = local9;
				Static166.aClass134_4.method3236(local1782);
			}
		}
		if (arg1.aShort45 != 0) {
			@Pc(1806) Class2_Sub3 local1806 = arg1.aClass2_Sub3_2;
			if (local1806 != null && !Static595.method8409(local15, local6, local9, local1806.method7700())) {
				if ((local1806.anInt9491 & arg1.aShort45) != 0) {
					if (Static392.aBoolean641) {
						Static242.method4280(arg0, local12, local6, local9);
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					local326 = local1806.method8382(Static338.aClass15_11);
					if (local326 != null) {
						local326.aClass2_1 = local1806;
						local326.anInt8011 = local12;
						local326.anInt8009 = local6;
						local326.anInt8007 = local9;
						Static166.aClass134_4.method3236(local326);
					}
				} else if (local1806.anInt9491 == 256) {
					local348 = local1806.anInt9494 - Static238.anInt9925;
					local978 = local1806.anInt9486 - Static327.anInt6816;
					local982 = local1806.anInt9498;
					if (local982 == 1 || local982 == 2) {
						local1237 = -local348;
					} else {
						local1237 = local348;
					}
					if (local982 == 2 || local982 == 3) {
						local638 = -local978;
					} else {
						local638 = local978;
					}
					if (Static392.aBoolean641) {
						Static242.method4280(arg0, local12, local6, local9);
						Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
					}
					@Pc(1916) Class2_Sub3 local1916 = arg1.aClass2_Sub3_1;
					@Pc(1924) Class55_Sub6 local1924;
					if (local638 > local1237) {
						local1924 = local1806.method8382(Static338.aClass15_11);
						if (local1924 != null) {
							local1924.aClass2_1 = local1806;
							local1924.anInt8011 = local12;
							local1924.anInt8009 = local6;
							local1924.anInt8007 = local9;
							Static166.aClass134_4.method3236(local1924);
						}
					} else if (local1916 != null) {
						local1924 = local1916.method8382(Static338.aClass15_11);
						if (local1924 != null) {
							local1924.aClass2_1 = local1916;
							local1924.anInt8011 = local12;
							local1924.anInt8009 = local6;
							local1924.anInt8007 = local9;
							Static166.aClass134_4.method3236(local1924);
						}
					}
				}
			}
			local961 = arg1.aClass2_Sub4_1;
			local351 = arg1.aClass2_Sub4_2;
			@Pc(2009) Class55_Sub6 local2009;
			if (local351 != null && (local351.anInt7254 & arg1.aShort45) != 0 && !Static54.method1305(local15, local6, local9, local351.anInt7254)) {
				if (Static392.aBoolean641) {
					Static525.method7767(arg0, local351.anInt7254, local12, local6, local9);
					Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
				}
				local2009 = local351.method8382(Static338.aClass15_11);
				if (local2009 != null) {
					local2009.aClass2_1 = local351;
					local2009.anInt8011 = local12;
					local2009.anInt8009 = local6;
					local2009.anInt8007 = local9;
					Static166.aClass134_4.method3236(local2009);
				}
			}
			if (local961 != null && (local961.anInt7254 & arg1.aShort45) != 0 && !Static54.method1305(local15, local6, local9, local961.anInt7254)) {
				if (Static392.aBoolean641) {
					Static525.method7767(arg0, local961.anInt7254, local12, local6, local9);
					Static338.aClass15_11.method5353(arg0.anInt8057, arg0.aClass3_Sub28Array6);
				}
				local2009 = local961.method8382(Static338.aClass15_11);
				if (local2009 != null) {
					local2009.aClass2_1 = local961;
					local2009.anInt8011 = local12;
					local2009.anInt8009 = local6;
					local2009.anInt8007 = local9;
					Static166.aClass134_4.method3236(local2009);
				}
			}
		}
		@Pc(2095) Class125 local2095;
		if (local12 < Static264.anInt8587 - 1) {
			local2095 = Static580.aClass125ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2095 != null && local2095.aBoolean271) {
				Static415.aClass89_1.method3865(local2095);
			}
		}
		if (local6 < Static342.anInt6991) {
			local2095 = local31[local6 + 1][local9];
			if (local2095 != null && local2095.aBoolean271) {
				Static415.aClass89_1.method3870(local2095);
			}
		}
		if (local9 < Static484.anInt9030) {
			local2095 = local31[local6][local9 + 1];
			if (local2095 != null && local2095.aBoolean271) {
				Static415.aClass89_1.method3870(local2095);
			}
		}
		if (local6 > Static342.anInt6991) {
			local2095 = local31[local6 - 1][local9];
			if (local2095 != null && local2095.aBoolean271) {
				Static415.aClass89_1.method3870(local2095);
			}
		}
		if (local9 > Static484.anInt9030) {
			local2095 = local31[local6][local9 - 1];
			if (local2095 != null && local2095.aBoolean271) {
				Static415.aClass89_1.method3870(local2095);
			}
		}
	}
}
