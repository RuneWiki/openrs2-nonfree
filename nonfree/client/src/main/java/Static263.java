import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[BI)I")
	public static int method4406(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = Class267.anIntArray530[(local7 ^ arg1[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!pv;Lclient!qs;)V")
	public static void method4409(@OriginalArg(0) Class260 arg0, @OriginalArg(1) Class276 arg1) {
		if (!arg1.aBoolean526) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort99;
		@Pc(9) short local9 = arg1.aShort98;
		@Pc(12) byte local12 = arg1.aByte89;
		@Pc(15) byte local15 = arg1.aByte85;
		@Pc(21) int local21 = (local6 << Static339.anInt6128) + Static108.anInt2068;
		@Pc(27) int local27 = (local9 << Static339.anInt6128) + Static108.anInt2068;
		@Pc(31) Class276[][] local31 = Static270.aClass276ArrayArrayArray2[local12];
		if (Static49.aClass59Array2 == Static133.aClass59Array3) {
			Static394.aClass14_11.LA(Static273.aClass59Array4[0].sa(local21, local27), Static523.method7185(local6, local9), Static302.method4794(local6, local9), Static4.method159(local6, local9));
		}
		@Pc(68) Class276 local68;
		@Pc(556) Class98_Sub8 local556;
		@Pc(643) int local643;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(667) int local667;
		@Pc(346) int local346;
		@Pc(292) boolean local292;
		@Pc(326) Class98_Sub8 local326;
		@Pc(348) int local348;
		@Pc(351) Class4_Sub5 local351;
		@Pc(638) int local638;
		if (arg1.aBoolean525) {
			if (Static300.aBoolean390) {
				if (local12 > 0) {
					local68 = Static270.aClass276ArrayArrayArray2[local12 - 1][local6][local9];
					if (local68 != null && local68.aBoolean526) {
						return;
					}
				}
				if (local6 <= Static213.anInt8691 && local6 > Static257.anInt5018) {
					local68 = local31[local6 - 1][local9];
					if (local68 != null && local68.aBoolean526 && (local68.aBoolean525 || (arg1.aByte86 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static213.anInt8691 && local6 < Static68.anInt8339 - 1) {
					local68 = local31[local6 + 1][local9];
					if (local68 != null && local68.aBoolean526 && (local68.aBoolean525 || (arg1.aByte86 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static117.anInt2704 && local9 > Static571.anInt9347) {
					local68 = local31[local6][local9 - 1];
					if (local68 != null && local68.aBoolean526 && (local68.aBoolean525 || (arg1.aByte86 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static117.anInt2704 && local9 < Static319.anInt5798 - 1) {
					local68 = local31[local6][local9 + 1];
					if (local68 != null && local68.aBoolean526 && (local68.aBoolean525 || (arg1.aByte86 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static300.aBoolean390 = true;
			}
			arg1.aBoolean525 = false;
			if (arg1.aClass276_1 != null) {
				local68 = arg1.aClass276_1;
				if (!Static219.method3784(local68.aByte85, local6, local9)) {
					Static133.aClass59Array3[local68.aByte85].method7862(local6, local9);
				}
				@Pc(217) Class4_Sub5 local217 = local68.aClass4_Sub5_2;
				if (local217 != null) {
					if (Static129.aBoolean209) {
						if ((local217.anInt7598 & arg1.aShort97) == 0) {
							Static395.method5807(arg0, local12, local6, local9);
						} else {
							Static515.method7133(arg0, local217.anInt7598, local15, local6, local9);
						}
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					local217.method7788(Static394.aClass14_11);
				}
				for (@Pc(254) Class267 local254 = local68.aClass267_3; local254 != null; local254 = local254.aClass267_2) {
					@Pc(258) Class4_Sub1 local258 = local254.aClass4_Sub1_2;
					if (local258 != null) {
						if (Static129.aBoolean209) {
							Static395.method5807(arg0, local12, local6, local9);
							Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
						}
						local258.method7788(Static394.aClass14_11);
					}
				}
			}
			local292 = !Static219.method3784(local15, local6, local9);
			if (local292) {
				Static133.aClass59Array3[local15].method7862(local6, local9);
				@Pc(303) Class4_Sub3 local303 = arg1.aClass4_Sub3_2;
				if (local303 != null && local303.aBoolean428) {
					if (Static129.aBoolean209) {
						Static395.method5807(arg0, local12, local6, local9);
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					local326 = local303.method7788(Static394.aClass14_11);
					if (local326 != null) {
						local326.aClass4_1 = local303;
						local326.anInt9635 = local12;
						local326.anInt9634 = local6;
						local326.anInt9631 = local9;
						Static98.aClass40_2.method1131(local326);
					}
				}
			}
			local346 = 0;
			local348 = 0;
			local351 = arg1.aClass4_Sub5_2;
			@Pc(354) Class4_Sub2 local354 = arg1.aClass4_Sub2_3;
			if (local351 != null || local354 != null) {
				if (Static213.anInt8691 == local6) {
					local346++;
				} else if (Static213.anInt8691 < local6) {
					local346 += 2;
				}
				if (Static117.anInt2704 == local9) {
					local346 += 3;
				} else if (Static117.anInt2704 > local9) {
					local346 += 6;
				}
				local348 = Static201.anIntArray260[local346];
				arg1.aShort97 = Static293.aShortArray56[local346];
			}
			if (local351 != null) {
				if ((local351.anInt7598 & Static180.anIntArray219[local346]) == 0) {
					arg1.aByte84 = 0;
				} else if (local351.anInt7598 == 16) {
					arg1.aByte84 = 3;
					arg1.aByte83 = Static241.aByteArray53[local346];
					arg1.aByte87 = (byte) (3 - arg1.aByte83);
				} else if (local351.anInt7598 == 32) {
					arg1.aByte84 = 6;
					arg1.aByte83 = Static520.aByteArray101[local346];
					arg1.aByte87 = (byte) (6 - arg1.aByte83);
				} else if (local351.anInt7598 == 64) {
					arg1.aByte84 = 12;
					arg1.aByte83 = Static15.aByteArray5[local346];
					arg1.aByte87 = (byte) (12 - arg1.aByte83);
				} else {
					arg1.aByte84 = 9;
					arg1.aByte83 = Static344.aByteArray77[local346];
					arg1.aByte87 = (byte) (9 - arg1.aByte83);
				}
				if ((local351.anInt7598 & local348) != 0 && !Static202.method3650(local15, local6, local9, local351.anInt7598)) {
					if (Static129.aBoolean209) {
						Static395.method5807(arg0, local12, local6, local9);
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					@Pc(503) Class98_Sub8 local503 = local351.method7788(Static394.aClass14_11);
					if (local503 != null) {
						local503.aClass4_1 = local351;
						local503.anInt9635 = local12;
						local503.anInt9634 = local6;
						local503.anInt9631 = local9;
						Static98.aClass40_2.method1131(local503);
					}
				}
				@Pc(524) Class4_Sub5 local524 = arg1.aClass4_Sub5_3;
				if (local524 != null && (local524.anInt7598 & local348) != 0 && !Static202.method3650(local15, local6, local9, local524.anInt7598)) {
					if (Static129.aBoolean209) {
						Static395.method5807(arg0, local12, local6, local9);
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					local556 = local524.method7788(Static394.aClass14_11);
					if (local556 != null) {
						local556.aClass4_1 = local524;
						local556.anInt9635 = local12;
						local556.anInt9634 = local6;
						local556.anInt9631 = local9;
						Static98.aClass40_2.method1131(local556);
					}
				}
			}
			if (local354 != null && !Static7.method200(local15, local6, local9, local354.method5640())) {
				@Pc(587) Class4_Sub2 local587 = arg1.aClass4_Sub2_2;
				if ((local354.anInt6707 & local348) != 0) {
					if (Static129.aBoolean209) {
						Static395.method5807(arg0, local12, local6, local9);
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					local556 = local354.method7788(Static394.aClass14_11);
					if (local556 != null) {
						local556.aClass4_1 = local354;
						local556.anInt9635 = local12;
						local556.anInt9634 = local6;
						local556.anInt9631 = local9;
						Static98.aClass40_2.method1131(local556);
					}
				} else if (local354.anInt6707 == 256) {
					local638 = local354.anInt6695 - Static170.anInt3628;
					local643 = local354.anInt6706 - Static478.anInt8129;
					local646 = local354.anInt6698;
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
					if (Static129.aBoolean209) {
						Static395.method5807(arg0, local12, local6, local9);
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					@Pc(691) Class98_Sub8 local691;
					if (local667 < local655) {
						local691 = local354.method7788(Static394.aClass14_11);
						if (local691 != null) {
							local691.aClass4_1 = local354;
							local691.anInt9635 = local12;
							local691.anInt9634 = local6;
							local691.anInt9631 = local9;
							Static98.aClass40_2.method1131(local691);
						}
					} else if (local587 != null) {
						local691 = local587.method7788(Static394.aClass14_11);
						if (local691 != null) {
							local691.aClass4_1 = local587;
							local691.anInt9635 = local12;
							local691.anInt9634 = local6;
							local691.anInt9631 = local9;
							Static98.aClass40_2.method1131(local691);
						}
					}
				}
			}
			if (local292) {
				@Pc(740) Class4_Sub3 local740 = arg1.aClass4_Sub3_2;
				if (local740 != null && !local740.aBoolean428) {
					if (Static129.aBoolean209) {
						Static395.method5807(arg0, local12, local6, local9);
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					local556 = local740.method7788(Static394.aClass14_11);
					if (local556 != null) {
						local556.aClass4_1 = local740;
						local556.anInt9635 = local12;
						local556.anInt9634 = local6;
						local556.anInt9631 = local9;
						Static98.aClass40_2.method1131(local556);
					}
				}
				@Pc(784) Class4_Sub4 local784 = arg1.aClass4_Sub4_1;
				if (local784 != null && !local784.aBoolean131) {
					if (Static129.aBoolean209) {
						Static395.method5807(arg0, local12, local6, local9);
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					@Pc(807) Class98_Sub8 local807 = local784.method7788(Static394.aClass14_11);
					if (local807 != null) {
						local807.aClass4_1 = local784;
						local807.anInt9635 = local12;
						local807.anInt9634 = local6;
						local807.anInt9631 = local9;
						Static98.aClass40_2.method1131(local807);
					}
				}
			}
			@Pc(828) byte local828 = arg1.aByte86;
			if (local828 != 0) {
				@Pc(845) Class276 local845;
				if (local6 < Static213.anInt8691 && (local828 & 0x4) != 0) {
					local845 = local31[local6 + 1][local9];
					if (local845 != null && local845.aBoolean526) {
						Static476.aClass1_1.method7676(local845);
					}
				}
				if (local9 < Static117.anInt2704 && (local828 & 0x2) != 0) {
					local845 = local31[local6][local9 + 1];
					if (local845 != null && local845.aBoolean526) {
						Static476.aClass1_1.method7676(local845);
					}
				}
				if (local6 > Static213.anInt8691 && (local828 & 0x1) != 0) {
					local845 = local31[local6 - 1][local9];
					if (local845 != null && local845.aBoolean526) {
						Static476.aClass1_1.method7676(local845);
					}
				}
				if (local9 > Static117.anInt2704 && (local828 & 0x8) != 0) {
					local845 = local31[local6][local9 - 1];
					if (local845 != null && local845.aBoolean526) {
						Static476.aClass1_1.method7676(local845);
					}
				}
			}
		}
		@Pc(978) int local978;
		@Pc(961) Class4_Sub5 local961;
		@Pc(982) int local982;
		@Pc(934) Class267 local934;
		if (arg1.aByte84 != 0) {
			local292 = true;
			for (local934 = arg1.aClass267_3; local934 != null; local934 = local934.aClass267_2) {
				if (local934.aClass4_Sub1_2.anInt9539 != Static31.anInt4658 && (local934.anInt7270 & arg1.aByte84) == arg1.aByte83) {
					local292 = false;
					break;
				}
			}
			if (local292) {
				local961 = arg1.aClass4_Sub5_2;
				if (!Static202.method3650(local15, local6, local9, local961.anInt7598)) {
					if (Static129.aBoolean209) {
						label663: {
							if (local961.anInt7598 >= 16) {
								local978 = local6 - Static213.anInt8691;
								local982 = local9 - Static117.anInt2704;
								if (local961.anInt7598 == 16) {
									local978 -= Static108.anInt2068;
									local982 += Static108.anInt2068;
									if (local982 < local978 && local6 > 0 && local9 <= Static555.anInt9182) {
										Static395.method5807(arg0, local12, local6 - 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt7598 == 32) {
									local978 += Static108.anInt2068;
									local982 += Static108.anInt2068;
									if (local982 < -local978 && local6 < Static401.anInt7022 && local9 < Static555.anInt9182) {
										Static395.method5807(arg0, local12, local6 + 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt7598 == 64) {
									local978 += Static108.anInt2068;
									local982 -= Static108.anInt2068;
									if (local982 > local978 && local6 < Static401.anInt7022 && local9 > 0) {
										Static395.method5807(arg0, local12, local6 + 1, local9 - 1);
										break label663;
									}
								} else if (local961.anInt7598 == 128) {
									local978 -= Static108.anInt2068;
									local982 -= Static108.anInt2068;
									if (local982 > -local978 && local6 > 0 && local9 > 0) {
										Static395.method5807(arg0, local12, local6 - 1, local9 - 1);
										break label663;
									}
								}
							}
							Static395.method5807(arg0, local12, local6, local9);
						}
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					@Pc(1120) Class98_Sub8 local1120 = local961.method7788(Static394.aClass14_11);
					if (local1120 != null) {
						local1120.aClass4_1 = local961;
						local1120.anInt9635 = local12;
						local1120.anInt9634 = local6;
						local1120.anInt9631 = local9;
						Static98.aClass40_2.method1131(local1120);
					}
				}
				arg1.aByte84 = 0;
			}
		}
		@Pc(1237) int local1237;
		if (arg1.aBoolean524) {
			try {
				arg1.aBoolean524 = false;
				@Pc(1149) int local1149 = 0;
				label606: for (local934 = arg1.aClass267_3; local934 != null; local934 = local934.aClass267_2) {
					@Pc(1156) Class4_Sub1 local1156 = local934.aClass4_Sub1_2;
					if (local1156.anInt9539 != Static31.anInt4658) {
						for (local978 = local1156.aShort126; local978 <= local1156.aShort123; local978++) {
							for (local982 = local1156.aShort125; local982 <= local1156.aShort124; local982++) {
								@Pc(1174) Class276 local1174 = local31[local978][local982];
								if (local1174.aBoolean525) {
									arg1.aBoolean524 = true;
									continue label606;
								}
								if (local1174.aByte84 != 0) {
									local638 = 0;
									if (local978 > local1156.aShort126) {
										local638++;
									}
									if (local978 < local1156.aShort123) {
										local638 += 4;
									}
									if (local982 > local1156.aShort125) {
										local638 += 8;
									}
									if (local982 < local1156.aShort124) {
										local638 += 2;
									}
									if ((local638 & local1174.aByte84) == arg1.aByte87) {
										arg1.aBoolean524 = true;
										continue label606;
									}
								}
							}
						}
						local982 = Static213.anInt8691 - local1156.aShort126;
						local1237 = local1156.aShort123 - Static213.anInt8691;
						if (local1237 > local982) {
							local982 = local1237;
						}
						local638 = Static117.anInt2704 - local1156.aShort125;
						local643 = local1156.aShort124 - Static117.anInt2704;
						if (local643 > local638) {
							local638 = local643;
						}
						arg0.aClass4_Sub1Array3[local1149] = local1156;
						arg0.anIntArray704[local1149++] = local982 + local638;
					}
				}
				while (local1149 > 0) {
					local348 = -50;
					local978 = -1;
					@Pc(1288) Class4_Sub1 local1288;
					for (local982 = 0; local982 < local1149; local982++) {
						local1288 = arg0.aClass4_Sub1Array3[local982];
						if (local1288.anInt9539 != Static31.anInt4658) {
							local638 = arg0.anIntArray704[local982];
							if (local638 > local348) {
								local348 = local638;
								local978 = local982;
							} else if (local638 == local348) {
								local643 = local1288.anInt9542 - Static170.anInt3628;
								local646 = local1288.anInt9540 - Static478.anInt8129;
								local655 = arg0.aClass4_Sub1Array3[local978].anInt9542 - Static170.anInt3628;
								local667 = arg0.aClass4_Sub1Array3[local978].anInt9540 - Static478.anInt8129;
								if (local643 * local643 + local646 * local646 > local655 * local655 + local667 * local667) {
									local978 = local982;
								}
							}
						}
					}
					if (local978 == -1) {
						break;
					}
					local1288 = arg0.aClass4_Sub1Array3[local978];
					local1288.anInt9539 = Static31.anInt4658;
					if (!Static411.method7691(local15, local1288.aShort126, local1288.aShort123, local1288.aShort125, local1288.aShort124, local1288.method7790())) {
						if (Static129.aBoolean209) {
							if (local1288.aByte107 == 0) {
								Static236.method4099(arg0, local12, local1288.aShort126, local1288.aShort125, local1288.aShort123, local1288.aShort124);
							} else {
								Static395.method5807(arg0, local12, local6, local9);
								local638 = local6 - Static213.anInt8691;
								local643 = local9 - Static117.anInt2704;
								if (local1288.aByte107 == 2) {
									if (local643 > -local638) {
										Static512.method7108(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static512.method7108(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local643 > local638) {
									Static512.method7108(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static512.method7108(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
						}
						local556 = local1288.method7788(Static394.aClass14_11);
						if (local556 != null) {
							local556.aClass4_1 = local1288;
							local556.anInt9635 = local12;
							local556.anInt9634 = local1288.aShort126;
							local556.anInt9631 = local1288.aShort125;
							Static98.aClass40_2.method1131(local556);
						}
					}
					for (local638 = local1288.aShort126; local638 <= local1288.aShort123; local638++) {
						for (local643 = local1288.aShort125; local643 <= local1288.aShort124; local643++) {
							@Pc(1513) Class276 local1513 = local31[local638][local643];
							if (local1513.aByte84 != 0) {
								Static476.aClass1_1.method7676(local1513);
							} else if ((local638 != local6 || local643 != local9) && local1513.aBoolean526) {
								Static476.aClass1_1.method7676(local1513);
							}
						}
					}
				}
				if (arg1.aBoolean524) {
					return;
				}
			} catch (@Pc(1551) Exception local1551) {
				arg1.aBoolean524 = false;
			}
		}
		if (arg1.aClass144_2 != null && arg1.aByte88 == (byte) (Static233.anInt4741 & 0xFF)) {
			@Pc(1568) Class144 local1568 = arg1.aClass144_2;
			local346 = Static133.aClass59Array3[local12].JA(local6, local9);
			if (local12 < Static107.anInt2060 - 1) {
				local348 = Static133.aClass59Array3[local12].JA(local6, local9) - Static133.aClass59Array3[local12 + 1].JA(local6, local9);
			} else {
				local348 = 0x8 << Static339.anInt6128;
			}
			Static81.aClass54_4.method7695(local21, local346, local27, arg0.anIntArray705);
			local978 = arg0.anIntArray705[2];
			Static81.aClass54_4.method7695(local21, local346 - local348, local27, arg0.anIntArray705);
			local982 = arg0.anIntArray705[2];
			local1237 = local978;
			local638 = local982;
			if (local978 > local982) {
				local1237 = local982;
				local638 = local978;
			}
			local1237 -= Static138.anInt3089;
			local638 += Static138.anInt3089;
			local1568.anInt4176 = local1237;
			local1568.anInt4175 = local638;
			local1568.aBoolean288 = true;
			Static394.aClass14_11.method6888(local1568);
		}
		if (!arg1.aBoolean526) {
			return;
		}
		if (arg1.aByte84 != 0) {
			return;
		}
		if (local6 <= Static213.anInt8691 && local6 > Static257.anInt5018) {
			local68 = local31[local6 - 1][local9];
			if (local68 != null && local68.aBoolean526) {
				return;
			}
		}
		if (local6 >= Static213.anInt8691 && local6 < Static68.anInt8339 - 1) {
			local68 = local31[local6 + 1][local9];
			if (local68 != null && local68.aBoolean526) {
				return;
			}
		}
		if (local9 <= Static117.anInt2704 && local9 > Static571.anInt9347) {
			local68 = local31[local6][local9 - 1];
			if (local68 != null && local68.aBoolean526) {
				return;
			}
		}
		if (local9 >= Static117.anInt2704 && local9 < Static319.anInt5798 - 1) {
			local68 = local31[local6][local9 + 1];
			if (local68 != null && local68.aBoolean526) {
				return;
			}
		}
		arg1.aBoolean526 = false;
		Static371.anInt6583--;
		@Pc(1759) Class4_Sub4 local1759 = arg1.aClass4_Sub4_1;
		if (local1759 != null && local1759.aBoolean131) {
			if (Static129.aBoolean209) {
				Static395.method5807(arg0, local12, local6, local9);
				Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
			}
			@Pc(1782) Class98_Sub8 local1782 = local1759.method7788(Static394.aClass14_11);
			if (local1782 != null) {
				local1782.aClass4_1 = local1759;
				local1782.anInt9635 = local12;
				local1782.anInt9634 = local6;
				local1782.anInt9631 = local9;
				Static98.aClass40_2.method1131(local1782);
			}
		}
		if (arg1.aShort97 != 0) {
			@Pc(1806) Class4_Sub2 local1806 = arg1.aClass4_Sub2_3;
			if (local1806 != null && !Static7.method200(local15, local6, local9, local1806.method5640())) {
				if ((local1806.anInt6707 & arg1.aShort97) != 0) {
					if (Static129.aBoolean209) {
						Static395.method5807(arg0, local12, local6, local9);
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					local326 = local1806.method7788(Static394.aClass14_11);
					if (local326 != null) {
						local326.aClass4_1 = local1806;
						local326.anInt9635 = local12;
						local326.anInt9634 = local6;
						local326.anInt9631 = local9;
						Static98.aClass40_2.method1131(local326);
					}
				} else if (local1806.anInt6707 == 256) {
					local348 = local1806.anInt6695 - Static170.anInt3628;
					local978 = local1806.anInt6706 - Static478.anInt8129;
					local982 = local1806.anInt6698;
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
					if (Static129.aBoolean209) {
						Static395.method5807(arg0, local12, local6, local9);
						Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
					}
					@Pc(1916) Class4_Sub2 local1916 = arg1.aClass4_Sub2_2;
					@Pc(1924) Class98_Sub8 local1924;
					if (local638 > local1237) {
						local1924 = local1806.method7788(Static394.aClass14_11);
						if (local1924 != null) {
							local1924.aClass4_1 = local1806;
							local1924.anInt9635 = local12;
							local1924.anInt9634 = local6;
							local1924.anInt9631 = local9;
							Static98.aClass40_2.method1131(local1924);
						}
					} else if (local1916 != null) {
						local1924 = local1916.method7788(Static394.aClass14_11);
						if (local1924 != null) {
							local1924.aClass4_1 = local1916;
							local1924.anInt9635 = local12;
							local1924.anInt9634 = local6;
							local1924.anInt9631 = local9;
							Static98.aClass40_2.method1131(local1924);
						}
					}
				}
			}
			local961 = arg1.aClass4_Sub5_2;
			local351 = arg1.aClass4_Sub5_3;
			@Pc(2009) Class98_Sub8 local2009;
			if (local351 != null && (local351.anInt7598 & arg1.aShort97) != 0 && !Static202.method3650(local15, local6, local9, local351.anInt7598)) {
				if (Static129.aBoolean209) {
					Static515.method7133(arg0, local351.anInt7598, local12, local6, local9);
					Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
				}
				local2009 = local351.method7788(Static394.aClass14_11);
				if (local2009 != null) {
					local2009.aClass4_1 = local351;
					local2009.anInt9635 = local12;
					local2009.anInt9634 = local6;
					local2009.anInt9631 = local9;
					Static98.aClass40_2.method1131(local2009);
				}
			}
			if (local961 != null && (local961.anInt7598 & arg1.aShort97) != 0 && !Static202.method3650(local15, local6, local9, local961.anInt7598)) {
				if (Static129.aBoolean209) {
					Static515.method7133(arg0, local961.anInt7598, local12, local6, local9);
					Static394.aClass14_11.method6869(arg0.anInt9438, arg0.aClass6_Sub7Array6);
				}
				local2009 = local961.method7788(Static394.aClass14_11);
				if (local2009 != null) {
					local2009.aClass4_1 = local961;
					local2009.anInt9635 = local12;
					local2009.anInt9634 = local6;
					local2009.anInt9631 = local9;
					Static98.aClass40_2.method1131(local2009);
				}
			}
		}
		@Pc(2095) Class276 local2095;
		if (local12 < Static107.anInt2060 - 1) {
			local2095 = Static270.aClass276ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2095 != null && local2095.aBoolean526) {
				Static476.aClass1_1.method7680(local2095);
			}
		}
		if (local6 < Static213.anInt8691) {
			local2095 = local31[local6 + 1][local9];
			if (local2095 != null && local2095.aBoolean526) {
				Static476.aClass1_1.method7676(local2095);
			}
		}
		if (local9 < Static117.anInt2704) {
			local2095 = local31[local6][local9 + 1];
			if (local2095 != null && local2095.aBoolean526) {
				Static476.aClass1_1.method7676(local2095);
			}
		}
		if (local6 > Static213.anInt8691) {
			local2095 = local31[local6 - 1][local9];
			if (local2095 != null && local2095.aBoolean526) {
				Static476.aClass1_1.method7676(local2095);
			}
		}
		if (local9 > Static117.anInt2704) {
			local2095 = local31[local6][local9 - 1];
			if (local2095 != null && local2095.aBoolean526) {
				Static476.aClass1_1.method7676(local2095);
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)Z")
	public static boolean method4410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
