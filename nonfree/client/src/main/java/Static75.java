import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!cga;Lclient!af;)V")
	public static void method7891(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class9 arg1) {
		if (!arg1.aBoolean8) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort2;
		@Pc(9) short local9 = arg1.aShort3;
		@Pc(12) byte local12 = arg1.aByte2;
		@Pc(15) byte local15 = arg1.aByte8;
		@Pc(21) int local21 = (local6 << Static188.anInt3275) + Static431.anInt7547;
		@Pc(27) int local27 = (local9 << Static188.anInt3275) + Static431.anInt7547;
		@Pc(31) Class9[][] local31 = Static208.aClass9ArrayArrayArray3[local12];
		if (Static127.aClass60Array7 == Static285.aClass60Array8) {
			Static432.aClass121_14.LA(Static34.aClass60Array10[0].sa(local21, local27), Static112.method1758(local6, local9), Static446.method6407(local6, local9), Static123.method1862(local6, local9));
		}
		@Pc(68) Class9 local68;
		@Pc(556) Class102_Sub2 local556;
		@Pc(643) int local643;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(667) int local667;
		@Pc(346) int local346;
		@Pc(292) boolean local292;
		@Pc(326) Class102_Sub2 local326;
		@Pc(348) int local348;
		@Pc(351) Class29_Sub5 local351;
		@Pc(638) int local638;
		if (arg1.aBoolean9) {
			if (Static358.aBoolean429) {
				if (local12 > 0) {
					local68 = Static208.aClass9ArrayArrayArray3[local12 - 1][local6][local9];
					if (local68 != null && local68.aBoolean8) {
						return;
					}
				}
				if (local6 <= Static325.anInt5850 && local6 > Static264.anInt4353) {
					local68 = local31[local6 - 1][local9];
					if (local68 != null && local68.aBoolean8 && (local68.aBoolean9 || (arg1.aByte7 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static325.anInt5850 && local6 < Static312.anInt8640 - 1) {
					local68 = local31[local6 + 1][local9];
					if (local68 != null && local68.aBoolean8 && (local68.aBoolean9 || (arg1.aByte7 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static486.anInt8128 && local9 > Static69.anInt1154) {
					local68 = local31[local6][local9 - 1];
					if (local68 != null && local68.aBoolean8 && (local68.aBoolean9 || (arg1.aByte7 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static486.anInt8128 && local9 < Static317.anInt5746 - 1) {
					local68 = local31[local6][local9 + 1];
					if (local68 != null && local68.aBoolean8 && (local68.aBoolean9 || (arg1.aByte7 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static358.aBoolean429 = true;
			}
			arg1.aBoolean9 = false;
			if (arg1.aClass9_1 != null) {
				local68 = arg1.aClass9_1;
				if (!Static98.method1512(local68.aByte8, local6, local9)) {
					Static285.aClass60Array8[local68.aByte8].method7892(local6, local9);
				}
				@Pc(217) Class29_Sub5 local217 = local68.aClass29_Sub5_1;
				if (local217 != null) {
					if (Static164.aBoolean192) {
						if ((local217.anInt7425 & arg1.aShort1) == 0) {
							Static114.method1781(arg0, local12, local6, local9);
						} else {
							Static311.method4821(arg0, local217.anInt7425, local15, local6, local9);
						}
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					local217.method7545(Static432.aClass121_14);
				}
				for (@Pc(254) Class66 local254 = local68.aClass66_1; local254 != null; local254 = local254.aClass66_2) {
					@Pc(258) Class29_Sub2 local258 = local254.aClass29_Sub2_1;
					if (local258 != null) {
						if (Static164.aBoolean192) {
							Static114.method1781(arg0, local12, local6, local9);
							Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
						}
						local258.method7545(Static432.aClass121_14);
					}
				}
			}
			local292 = !Static98.method1512(local15, local6, local9);
			if (local292) {
				Static285.aClass60Array8[local15].method7892(local6, local9);
				@Pc(303) Class29_Sub3 local303 = arg1.aClass29_Sub3_1;
				if (local303 != null && local303.aBoolean222) {
					if (Static164.aBoolean192) {
						Static114.method1781(arg0, local12, local6, local9);
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					local326 = local303.method7545(Static432.aClass121_14);
					if (local326 != null) {
						local326.aClass29_1 = local303;
						local326.anInt4823 = local12;
						local326.anInt4821 = local6;
						local326.anInt4822 = local9;
						Static78.aClass249_1.method5809(local326);
					}
				}
			}
			local346 = 0;
			local348 = 0;
			local351 = arg1.aClass29_Sub5_1;
			@Pc(354) Class29_Sub1 local354 = arg1.aClass29_Sub1_2;
			if (local351 != null || local354 != null) {
				if (Static325.anInt5850 == local6) {
					local346++;
				} else if (Static325.anInt5850 < local6) {
					local346 += 2;
				}
				if (Static486.anInt8128 == local9) {
					local346 += 3;
				} else if (Static486.anInt8128 > local9) {
					local346 += 6;
				}
				local348 = Static48.anIntArray56[local346];
				arg1.aShort1 = Static58.aShortArray13[local346];
			}
			if (local351 != null) {
				if ((local351.anInt7425 & Static8.anIntArray602[local346]) == 0) {
					arg1.aByte4 = 0;
				} else if (local351.anInt7425 == 16) {
					arg1.aByte4 = 3;
					arg1.aByte3 = Static401.aByteArray86[local346];
					arg1.aByte5 = (byte) (3 - arg1.aByte3);
				} else if (local351.anInt7425 == 32) {
					arg1.aByte4 = 6;
					arg1.aByte3 = Static378.aByteArray81[local346];
					arg1.aByte5 = (byte) (6 - arg1.aByte3);
				} else if (local351.anInt7425 == 64) {
					arg1.aByte4 = 12;
					arg1.aByte3 = Static269.aByteArray55[local346];
					arg1.aByte5 = (byte) (12 - arg1.aByte3);
				} else {
					arg1.aByte4 = 9;
					arg1.aByte3 = Static124.aByteArray35[local346];
					arg1.aByte5 = (byte) (9 - arg1.aByte3);
				}
				if ((local351.anInt7425 & local348) != 0 && !Static305.method4687(local15, local6, local9, local351.anInt7425)) {
					if (Static164.aBoolean192) {
						Static114.method1781(arg0, local12, local6, local9);
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					@Pc(503) Class102_Sub2 local503 = local351.method7545(Static432.aClass121_14);
					if (local503 != null) {
						local503.aClass29_1 = local351;
						local503.anInt4823 = local12;
						local503.anInt4821 = local6;
						local503.anInt4822 = local9;
						Static78.aClass249_1.method5809(local503);
					}
				}
				@Pc(524) Class29_Sub5 local524 = arg1.aClass29_Sub5_2;
				if (local524 != null && (local524.anInt7425 & local348) != 0 && !Static305.method4687(local15, local6, local9, local524.anInt7425)) {
					if (Static164.aBoolean192) {
						Static114.method1781(arg0, local12, local6, local9);
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					local556 = local524.method7545(Static432.aClass121_14);
					if (local556 != null) {
						local556.aClass29_1 = local524;
						local556.anInt4823 = local12;
						local556.anInt4821 = local6;
						local556.anInt4822 = local9;
						Static78.aClass249_1.method5809(local556);
					}
				}
			}
			if (local354 != null && !Static407.method5945(local15, local6, local9, local354.method6070())) {
				@Pc(587) Class29_Sub1 local587 = arg1.aClass29_Sub1_1;
				if ((local354.anInt7310 & local348) != 0) {
					if (Static164.aBoolean192) {
						Static114.method1781(arg0, local12, local6, local9);
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					local556 = local354.method7545(Static432.aClass121_14);
					if (local556 != null) {
						local556.aClass29_1 = local354;
						local556.anInt4823 = local12;
						local556.anInt4821 = local6;
						local556.anInt4822 = local9;
						Static78.aClass249_1.method5809(local556);
					}
				} else if (local354.anInt7310 == 256) {
					local638 = local354.anInt7302 - Static135.anInt2375;
					local643 = local354.anInt7307 - Static163.anInt2862;
					local646 = local354.anInt7305;
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
					if (Static164.aBoolean192) {
						Static114.method1781(arg0, local12, local6, local9);
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					@Pc(691) Class102_Sub2 local691;
					if (local667 < local655) {
						local691 = local354.method7545(Static432.aClass121_14);
						if (local691 != null) {
							local691.aClass29_1 = local354;
							local691.anInt4823 = local12;
							local691.anInt4821 = local6;
							local691.anInt4822 = local9;
							Static78.aClass249_1.method5809(local691);
						}
					} else if (local587 != null) {
						local691 = local587.method7545(Static432.aClass121_14);
						if (local691 != null) {
							local691.aClass29_1 = local587;
							local691.anInt4823 = local12;
							local691.anInt4821 = local6;
							local691.anInt4822 = local9;
							Static78.aClass249_1.method5809(local691);
						}
					}
				}
			}
			if (local292) {
				@Pc(740) Class29_Sub3 local740 = arg1.aClass29_Sub3_1;
				if (local740 != null && !local740.aBoolean222) {
					if (Static164.aBoolean192) {
						Static114.method1781(arg0, local12, local6, local9);
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					local556 = local740.method7545(Static432.aClass121_14);
					if (local556 != null) {
						local556.aClass29_1 = local740;
						local556.anInt4823 = local12;
						local556.anInt4821 = local6;
						local556.anInt4822 = local9;
						Static78.aClass249_1.method5809(local556);
					}
				}
				@Pc(784) Class29_Sub4 local784 = arg1.aClass29_Sub4_1;
				if (local784 != null && !local784.aBoolean421) {
					if (Static164.aBoolean192) {
						Static114.method1781(arg0, local12, local6, local9);
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					@Pc(807) Class102_Sub2 local807 = local784.method7545(Static432.aClass121_14);
					if (local807 != null) {
						local807.aClass29_1 = local784;
						local807.anInt4823 = local12;
						local807.anInt4821 = local6;
						local807.anInt4822 = local9;
						Static78.aClass249_1.method5809(local807);
					}
				}
			}
			@Pc(828) byte local828 = arg1.aByte7;
			if (local828 != 0) {
				@Pc(845) Class9 local845;
				if (local6 < Static325.anInt5850 && (local828 & 0x4) != 0) {
					local845 = local31[local6 + 1][local9];
					if (local845 != null && local845.aBoolean8) {
						Static325.aClass158_1.method5353(local845);
					}
				}
				if (local9 < Static486.anInt8128 && (local828 & 0x2) != 0) {
					local845 = local31[local6][local9 + 1];
					if (local845 != null && local845.aBoolean8) {
						Static325.aClass158_1.method5353(local845);
					}
				}
				if (local6 > Static325.anInt5850 && (local828 & 0x1) != 0) {
					local845 = local31[local6 - 1][local9];
					if (local845 != null && local845.aBoolean8) {
						Static325.aClass158_1.method5353(local845);
					}
				}
				if (local9 > Static486.anInt8128 && (local828 & 0x8) != 0) {
					local845 = local31[local6][local9 - 1];
					if (local845 != null && local845.aBoolean8) {
						Static325.aClass158_1.method5353(local845);
					}
				}
			}
		}
		@Pc(978) int local978;
		@Pc(961) Class29_Sub5 local961;
		@Pc(982) int local982;
		@Pc(934) Class66 local934;
		if (arg1.aByte4 != 0) {
			local292 = true;
			for (local934 = arg1.aClass66_1; local934 != null; local934 = local934.aClass66_2) {
				if (local934.aClass29_Sub2_1.anInt9220 != Static216.anInt3692 && (local934.anInt1518 & arg1.aByte4) == arg1.aByte3) {
					local292 = false;
					break;
				}
			}
			if (local292) {
				local961 = arg1.aClass29_Sub5_1;
				if (!Static305.method4687(local15, local6, local9, local961.anInt7425)) {
					if (Static164.aBoolean192) {
						label663: {
							if (local961.anInt7425 >= 16) {
								local978 = local6 - Static325.anInt5850;
								local982 = local9 - Static486.anInt8128;
								if (local961.anInt7425 == 16) {
									local978 -= Static431.anInt7547;
									local982 += Static431.anInt7547;
									if (local982 < local978 && local6 > 0 && local9 <= Static164.anInt2881) {
										Static114.method1781(arg0, local12, local6 - 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt7425 == 32) {
									local978 += Static431.anInt7547;
									local982 += Static431.anInt7547;
									if (local982 < -local978 && local6 < Static80.anInt1391 && local9 < Static164.anInt2881) {
										Static114.method1781(arg0, local12, local6 + 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt7425 == 64) {
									local978 += Static431.anInt7547;
									local982 -= Static431.anInt7547;
									if (local982 > local978 && local6 < Static80.anInt1391 && local9 > 0) {
										Static114.method1781(arg0, local12, local6 + 1, local9 - 1);
										break label663;
									}
								} else if (local961.anInt7425 == 128) {
									local978 -= Static431.anInt7547;
									local982 -= Static431.anInt7547;
									if (local982 > -local978 && local6 > 0 && local9 > 0) {
										Static114.method1781(arg0, local12, local6 - 1, local9 - 1);
										break label663;
									}
								}
							}
							Static114.method1781(arg0, local12, local6, local9);
						}
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					@Pc(1120) Class102_Sub2 local1120 = local961.method7545(Static432.aClass121_14);
					if (local1120 != null) {
						local1120.aClass29_1 = local961;
						local1120.anInt4823 = local12;
						local1120.anInt4821 = local6;
						local1120.anInt4822 = local9;
						Static78.aClass249_1.method5809(local1120);
					}
				}
				arg1.aByte4 = 0;
			}
		}
		@Pc(1237) int local1237;
		if (arg1.aBoolean7) {
			try {
				arg1.aBoolean7 = false;
				@Pc(1149) int local1149 = 0;
				label606: for (local934 = arg1.aClass66_1; local934 != null; local934 = local934.aClass66_2) {
					@Pc(1156) Class29_Sub2 local1156 = local934.aClass29_Sub2_1;
					if (local1156.anInt9220 != Static216.anInt3692) {
						for (local978 = local1156.aShort122; local978 <= local1156.aShort124; local978++) {
							for (local982 = local1156.aShort121; local982 <= local1156.aShort123; local982++) {
								@Pc(1174) Class9 local1174 = local31[local978][local982];
								if (local1174.aBoolean9) {
									arg1.aBoolean7 = true;
									continue label606;
								}
								if (local1174.aByte4 != 0) {
									local638 = 0;
									if (local978 > local1156.aShort122) {
										local638++;
									}
									if (local978 < local1156.aShort124) {
										local638 += 4;
									}
									if (local982 > local1156.aShort121) {
										local638 += 8;
									}
									if (local982 < local1156.aShort123) {
										local638 += 2;
									}
									if ((local638 & local1174.aByte4) == arg1.aByte5) {
										arg1.aBoolean7 = true;
										continue label606;
									}
								}
							}
						}
						local982 = Static325.anInt5850 - local1156.aShort122;
						local1237 = local1156.aShort124 - Static325.anInt5850;
						if (local1237 > local982) {
							local982 = local1237;
						}
						local638 = Static486.anInt8128 - local1156.aShort121;
						local643 = local1156.aShort123 - Static486.anInt8128;
						if (local643 > local638) {
							local638 = local643;
						}
						arg0.aClass29_Sub2Array2[local1149] = local1156;
						arg0.anIntArray3[local1149++] = local982 + local638;
					}
				}
				while (local1149 > 0) {
					local348 = -50;
					local978 = -1;
					@Pc(1288) Class29_Sub2 local1288;
					for (local982 = 0; local982 < local1149; local982++) {
						local1288 = arg0.aClass29_Sub2Array2[local982];
						if (local1288.anInt9220 != Static216.anInt3692) {
							local638 = arg0.anIntArray3[local982];
							if (local638 > local348) {
								local348 = local638;
								local978 = local982;
							} else if (local638 == local348) {
								local643 = local1288.anInt9222 - Static135.anInt2375;
								local646 = local1288.anInt9218 - Static163.anInt2862;
								local655 = arg0.aClass29_Sub2Array2[local978].anInt9222 - Static135.anInt2375;
								local667 = arg0.aClass29_Sub2Array2[local978].anInt9218 - Static163.anInt2862;
								if (local643 * local643 + local646 * local646 > local655 * local655 + local667 * local667) {
									local978 = local982;
								}
							}
						}
					}
					if (local978 == -1) {
						break;
					}
					local1288 = arg0.aClass29_Sub2Array2[local978];
					local1288.anInt9220 = Static216.anInt3692;
					if (!Static510.method6882(local15, local1288.aShort122, local1288.aShort124, local1288.aShort121, local1288.aShort123, local1288.method7546())) {
						if (Static164.aBoolean192) {
							if (local1288.aByte104 == 0) {
								Static483.method6708(arg0, local12, local1288.aShort122, local1288.aShort121, local1288.aShort124, local1288.aShort123);
							} else {
								Static114.method1781(arg0, local12, local6, local9);
								local638 = local6 - Static325.anInt5850;
								local643 = local9 - Static486.anInt8128;
								if (local1288.aByte104 == 2) {
									if (local643 > -local638) {
										Static168.method2629(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static168.method2629(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local643 > local638) {
									Static168.method2629(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static168.method2629(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
						}
						local556 = local1288.method7545(Static432.aClass121_14);
						if (local556 != null) {
							local556.aClass29_1 = local1288;
							local556.anInt4823 = local12;
							local556.anInt4821 = local1288.aShort122;
							local556.anInt4822 = local1288.aShort121;
							Static78.aClass249_1.method5809(local556);
						}
					}
					for (local638 = local1288.aShort122; local638 <= local1288.aShort124; local638++) {
						for (local643 = local1288.aShort121; local643 <= local1288.aShort123; local643++) {
							@Pc(1513) Class9 local1513 = local31[local638][local643];
							if (local1513.aByte4 != 0) {
								Static325.aClass158_1.method5353(local1513);
							} else if ((local638 != local6 || local643 != local9) && local1513.aBoolean8) {
								Static325.aClass158_1.method5353(local1513);
							}
						}
					}
				}
				if (arg1.aBoolean7) {
					return;
				}
			} catch (@Pc(1551) Exception local1551) {
				arg1.aBoolean7 = false;
			}
		}
		if (arg1.aClass222_1 != null && arg1.aByte6 == (byte) (Static512.anInt8659 & 0xFF)) {
			@Pc(1568) Class222 local1568 = arg1.aClass222_1;
			local346 = Static285.aClass60Array8[local12].JA(local6, local9);
			if (local12 < Static41.anInt687 - 1) {
				local348 = Static285.aClass60Array8[local12].JA(local6, local9) - Static285.aClass60Array8[local12 + 1].JA(local6, local9);
			} else {
				local348 = 0x8 << Static188.anInt3275;
			}
			Static565.aClass34_11.method7614(local21, local346, local27, arg0.anIntArray4);
			local978 = arg0.anIntArray4[2];
			Static565.aClass34_11.method7614(local21, local346 - local348, local27, arg0.anIntArray4);
			local982 = arg0.anIntArray4[2];
			local1237 = local978;
			local638 = local982;
			if (local978 > local982) {
				local1237 = local982;
				local638 = local978;
			}
			local1237 -= Static337.anInt5989;
			local638 += Static337.anInt5989;
			local1568.anInt6171 = local1237;
			local1568.anInt6172 = local638;
			local1568.aBoolean423 = true;
			Static432.aClass121_14.method7087(local1568);
		}
		if (!arg1.aBoolean8) {
			return;
		}
		if (arg1.aByte4 != 0) {
			return;
		}
		if (local6 <= Static325.anInt5850 && local6 > Static264.anInt4353) {
			local68 = local31[local6 - 1][local9];
			if (local68 != null && local68.aBoolean8) {
				return;
			}
		}
		if (local6 >= Static325.anInt5850 && local6 < Static312.anInt8640 - 1) {
			local68 = local31[local6 + 1][local9];
			if (local68 != null && local68.aBoolean8) {
				return;
			}
		}
		if (local9 <= Static486.anInt8128 && local9 > Static69.anInt1154) {
			local68 = local31[local6][local9 - 1];
			if (local68 != null && local68.aBoolean8) {
				return;
			}
		}
		if (local9 >= Static486.anInt8128 && local9 < Static317.anInt5746 - 1) {
			local68 = local31[local6][local9 + 1];
			if (local68 != null && local68.aBoolean8) {
				return;
			}
		}
		arg1.aBoolean8 = false;
		Static15.anInt8428--;
		@Pc(1759) Class29_Sub4 local1759 = arg1.aClass29_Sub4_1;
		if (local1759 != null && local1759.aBoolean421) {
			if (Static164.aBoolean192) {
				Static114.method1781(arg0, local12, local6, local9);
				Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
			}
			@Pc(1782) Class102_Sub2 local1782 = local1759.method7545(Static432.aClass121_14);
			if (local1782 != null) {
				local1782.aClass29_1 = local1759;
				local1782.anInt4823 = local12;
				local1782.anInt4821 = local6;
				local1782.anInt4822 = local9;
				Static78.aClass249_1.method5809(local1782);
			}
		}
		if (arg1.aShort1 != 0) {
			@Pc(1806) Class29_Sub1 local1806 = arg1.aClass29_Sub1_2;
			if (local1806 != null && !Static407.method5945(local15, local6, local9, local1806.method6070())) {
				if ((local1806.anInt7310 & arg1.aShort1) != 0) {
					if (Static164.aBoolean192) {
						Static114.method1781(arg0, local12, local6, local9);
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					local326 = local1806.method7545(Static432.aClass121_14);
					if (local326 != null) {
						local326.aClass29_1 = local1806;
						local326.anInt4823 = local12;
						local326.anInt4821 = local6;
						local326.anInt4822 = local9;
						Static78.aClass249_1.method5809(local326);
					}
				} else if (local1806.anInt7310 == 256) {
					local348 = local1806.anInt7302 - Static135.anInt2375;
					local978 = local1806.anInt7307 - Static163.anInt2862;
					local982 = local1806.anInt7305;
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
					if (Static164.aBoolean192) {
						Static114.method1781(arg0, local12, local6, local9);
						Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
					}
					@Pc(1916) Class29_Sub1 local1916 = arg1.aClass29_Sub1_1;
					@Pc(1924) Class102_Sub2 local1924;
					if (local638 > local1237) {
						local1924 = local1806.method7545(Static432.aClass121_14);
						if (local1924 != null) {
							local1924.aClass29_1 = local1806;
							local1924.anInt4823 = local12;
							local1924.anInt4821 = local6;
							local1924.anInt4822 = local9;
							Static78.aClass249_1.method5809(local1924);
						}
					} else if (local1916 != null) {
						local1924 = local1916.method7545(Static432.aClass121_14);
						if (local1924 != null) {
							local1924.aClass29_1 = local1916;
							local1924.anInt4823 = local12;
							local1924.anInt4821 = local6;
							local1924.anInt4822 = local9;
							Static78.aClass249_1.method5809(local1924);
						}
					}
				}
			}
			local961 = arg1.aClass29_Sub5_1;
			local351 = arg1.aClass29_Sub5_2;
			@Pc(2009) Class102_Sub2 local2009;
			if (local351 != null && (local351.anInt7425 & arg1.aShort1) != 0 && !Static305.method4687(local15, local6, local9, local351.anInt7425)) {
				if (Static164.aBoolean192) {
					Static311.method4821(arg0, local351.anInt7425, local12, local6, local9);
					Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
				}
				local2009 = local351.method7545(Static432.aClass121_14);
				if (local2009 != null) {
					local2009.aClass29_1 = local351;
					local2009.anInt4823 = local12;
					local2009.anInt4821 = local6;
					local2009.anInt4822 = local9;
					Static78.aClass249_1.method5809(local2009);
				}
			}
			if (local961 != null && (local961.anInt7425 & arg1.aShort1) != 0 && !Static305.method4687(local15, local6, local9, local961.anInt7425)) {
				if (Static164.aBoolean192) {
					Static311.method4821(arg0, local961.anInt7425, local12, local6, local9);
					Static432.aClass121_14.method7158(arg0.anInt29, arg0.aClass6_Sub7Array2);
				}
				local2009 = local961.method7545(Static432.aClass121_14);
				if (local2009 != null) {
					local2009.aClass29_1 = local961;
					local2009.anInt4823 = local12;
					local2009.anInt4821 = local6;
					local2009.anInt4822 = local9;
					Static78.aClass249_1.method5809(local2009);
				}
			}
		}
		@Pc(2095) Class9 local2095;
		if (local12 < Static41.anInt687 - 1) {
			local2095 = Static208.aClass9ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2095 != null && local2095.aBoolean8) {
				Static325.aClass158_1.method5355(local2095);
			}
		}
		if (local6 < Static325.anInt5850) {
			local2095 = local31[local6 + 1][local9];
			if (local2095 != null && local2095.aBoolean8) {
				Static325.aClass158_1.method5353(local2095);
			}
		}
		if (local9 < Static486.anInt8128) {
			local2095 = local31[local6][local9 + 1];
			if (local2095 != null && local2095.aBoolean8) {
				Static325.aClass158_1.method5353(local2095);
			}
		}
		if (local6 > Static325.anInt5850) {
			local2095 = local31[local6 - 1][local9];
			if (local2095 != null && local2095.aBoolean8) {
				Static325.aClass158_1.method5353(local2095);
			}
		}
		if (local9 > Static486.anInt8128) {
			local2095 = local31[local6][local9 - 1];
			if (local2095 != null && local2095.aBoolean8) {
				Static325.aClass158_1.method5353(local2095);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[F)[F")
	public static float[] method7895(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static585.method3076(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
