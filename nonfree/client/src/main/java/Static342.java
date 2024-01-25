import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!qp;")
	public static Class250 aClass250_2;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "Lclient!kr;")
	public static Class171 aClass171_98;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!kg;Lclient!rg;)V")
	public static void method5171(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class255 arg1) {
		if (!arg1.aBoolean524) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort124;
		@Pc(9) short local9 = arg1.aShort123;
		@Pc(12) byte local12 = arg1.aByte107;
		@Pc(15) byte local15 = arg1.aByte101;
		@Pc(21) int local21 = (local6 << Static451.anInt7905) + Static122.anInt2483;
		@Pc(27) int local27 = (local9 << Static451.anInt7905) + Static122.anInt2483;
		@Pc(31) Class255[][] local31 = Static242.aClass255ArrayArrayArray2[local12];
		if (Static209.aClass205Array2 == Static544.aClass205Array3) {
			Static416.aClass122_7.JA(Static16.aClass205Array1[0].aa(local21, local27), method5173(local6, local9), Static83.method1448(local6, local9), Static219.method6543(local6, local9));
		}
		@Pc(68) Class255 local68;
		@Pc(556) Class72_Sub7 local556;
		@Pc(643) int local643;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(667) int local667;
		@Pc(346) int local346;
		@Pc(292) boolean local292;
		@Pc(326) Class72_Sub7 local326;
		@Pc(348) int local348;
		@Pc(351) Class49_Sub1 local351;
		@Pc(638) int local638;
		if (arg1.aBoolean523) {
			if (Static153.aBoolean182) {
				if (local12 > 0) {
					local68 = Static242.aClass255ArrayArrayArray2[local12 - 1][local6][local9];
					if (local68 != null && local68.aBoolean524) {
						return;
					}
				}
				if (local6 <= Static393.anInt7097 && local6 > Static454.anInt7748) {
					local68 = local31[local6 - 1][local9];
					if (local68 != null && local68.aBoolean524 && (local68.aBoolean523 || (arg1.aByte104 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static393.anInt7097 && local6 < Static299.anInt5552 - 1) {
					local68 = local31[local6 + 1][local9];
					if (local68 != null && local68.aBoolean524 && (local68.aBoolean523 || (arg1.aByte104 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static211.anInt4100 && local9 > Static281.anInt5279) {
					local68 = local31[local6][local9 - 1];
					if (local68 != null && local68.aBoolean524 && (local68.aBoolean523 || (arg1.aByte104 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static211.anInt4100 && local9 < Static237.anInt4785 - 1) {
					local68 = local31[local6][local9 + 1];
					if (local68 != null && local68.aBoolean524 && (local68.aBoolean523 || (arg1.aByte104 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static153.aBoolean182 = true;
			}
			arg1.aBoolean523 = false;
			if (arg1.aClass255_1 != null) {
				local68 = arg1.aClass255_1;
				if (!Static184.method6133(local68.aByte101, local6, local9)) {
					Static544.aClass205Array3[local68.aByte101].method6748(local6, local9);
				}
				@Pc(217) Class49_Sub1 local217 = local68.aClass49_Sub1_3;
				if (local217 != null) {
					if (Static169.aBoolean207) {
						if ((local217.anInt8034 & arg1.aShort125) == 0) {
							Static338.method5137(arg0, local12, local6, local9);
						} else {
							Static428.method6270(arg0, local217.anInt8034, local15, local6, local9);
						}
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					local217.method7453(Static416.aClass122_7);
				}
				for (@Pc(254) Class63 local254 = local68.aClass63_3; local254 != null; local254 = local254.aClass63_1) {
					@Pc(258) Class49_Sub2 local258 = local254.aClass49_Sub2_1;
					if (local258 != null) {
						if (Static169.aBoolean207) {
							Static338.method5137(arg0, local12, local6, local9);
							Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
						}
						local258.method7453(Static416.aClass122_7);
					}
				}
			}
			local292 = !Static184.method6133(local15, local6, local9);
			if (local292) {
				Static544.aClass205Array3[local15].method6748(local6, local9);
				@Pc(303) Class49_Sub5 local303 = arg1.aClass49_Sub5_2;
				if (local303 != null && local303.aBoolean536) {
					if (Static169.aBoolean207) {
						Static338.method5137(arg0, local12, local6, local9);
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					local326 = local303.method7453(Static416.aClass122_7);
					if (local326 != null) {
						local326.aClass49_1 = local303;
						local326.anInt6969 = local12;
						local326.anInt6970 = local6;
						local326.anInt6968 = local9;
						Static153.aClass299_3.method7027(local326);
					}
				}
			}
			local346 = 0;
			local348 = 0;
			local351 = arg1.aClass49_Sub1_3;
			@Pc(354) Class49_Sub3 local354 = arg1.aClass49_Sub3_1;
			if (local351 != null || local354 != null) {
				if (Static393.anInt7097 == local6) {
					local346++;
				} else if (Static393.anInt7097 < local6) {
					local346 += 2;
				}
				if (Static211.anInt4100 == local9) {
					local346 += 3;
				} else if (Static211.anInt4100 > local9) {
					local346 += 6;
				}
				local348 = Static461.anIntArray737[local346];
				arg1.aShort125 = Static447.aShortArray125[local346];
			}
			if (local351 != null) {
				if ((local351.anInt8034 & Static3.anIntArray17[local346]) == 0) {
					arg1.aByte103 = 0;
				} else if (local351.anInt8034 == 16) {
					arg1.aByte103 = 3;
					arg1.aByte102 = Static306.aByteArray91[local346];
					arg1.aByte105 = (byte) (3 - arg1.aByte102);
				} else if (local351.anInt8034 == 32) {
					arg1.aByte103 = 6;
					arg1.aByte102 = Static379.aByteArray123[local346];
					arg1.aByte105 = (byte) (6 - arg1.aByte102);
				} else if (local351.anInt8034 == 64) {
					arg1.aByte103 = 12;
					arg1.aByte102 = Static74.aByteArray25[local346];
					arg1.aByte105 = (byte) (12 - arg1.aByte102);
				} else {
					arg1.aByte103 = 9;
					arg1.aByte102 = Static397.aByteArray101[local346];
					arg1.aByte105 = (byte) (9 - arg1.aByte102);
				}
				if ((local351.anInt8034 & local348) != 0 && !Static216.method3734(local15, local6, local9, local351.anInt8034)) {
					if (Static169.aBoolean207) {
						Static338.method5137(arg0, local12, local6, local9);
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					@Pc(503) Class72_Sub7 local503 = local351.method7453(Static416.aClass122_7);
					if (local503 != null) {
						local503.aClass49_1 = local351;
						local503.anInt6969 = local12;
						local503.anInt6970 = local6;
						local503.anInt6968 = local9;
						Static153.aClass299_3.method7027(local503);
					}
				}
				@Pc(524) Class49_Sub1 local524 = arg1.aClass49_Sub1_2;
				if (local524 != null && (local524.anInt8034 & local348) != 0 && !Static216.method3734(local15, local6, local9, local524.anInt8034)) {
					if (Static169.aBoolean207) {
						Static338.method5137(arg0, local12, local6, local9);
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					local556 = local524.method7453(Static416.aClass122_7);
					if (local556 != null) {
						local556.aClass49_1 = local524;
						local556.anInt6969 = local12;
						local556.anInt6970 = local6;
						local556.anInt6968 = local9;
						Static153.aClass299_3.method7027(local556);
					}
				}
			}
			if (local354 != null && !Static391.method5897(local15, local6, local9, local354.method7462())) {
				@Pc(587) Class49_Sub3 local587 = arg1.aClass49_Sub3_2;
				if ((local354.anInt9069 & local348) != 0) {
					if (Static169.aBoolean207) {
						Static338.method5137(arg0, local12, local6, local9);
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					local556 = local354.method7453(Static416.aClass122_7);
					if (local556 != null) {
						local556.aClass49_1 = local354;
						local556.anInt6969 = local12;
						local556.anInt6970 = local6;
						local556.anInt6968 = local9;
						Static153.aClass299_3.method7027(local556);
					}
				} else if (local354.anInt9069 == 256) {
					local638 = local354.anInt9077 - Static311.anInt1617;
					local643 = local354.anInt9071 - Static2.anInt5668;
					local646 = local354.anInt9072;
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
					if (Static169.aBoolean207) {
						Static338.method5137(arg0, local12, local6, local9);
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					@Pc(691) Class72_Sub7 local691;
					if (local667 < local655) {
						local691 = local354.method7453(Static416.aClass122_7);
						if (local691 != null) {
							local691.aClass49_1 = local354;
							local691.anInt6969 = local12;
							local691.anInt6970 = local6;
							local691.anInt6968 = local9;
							Static153.aClass299_3.method7027(local691);
						}
					} else if (local587 != null) {
						local691 = local587.method7453(Static416.aClass122_7);
						if (local691 != null) {
							local691.aClass49_1 = local587;
							local691.anInt6969 = local12;
							local691.anInt6970 = local6;
							local691.anInt6968 = local9;
							Static153.aClass299_3.method7027(local691);
						}
					}
				}
			}
			if (local292) {
				@Pc(740) Class49_Sub5 local740 = arg1.aClass49_Sub5_2;
				if (local740 != null && !local740.aBoolean536) {
					if (Static169.aBoolean207) {
						Static338.method5137(arg0, local12, local6, local9);
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					local556 = local740.method7453(Static416.aClass122_7);
					if (local556 != null) {
						local556.aClass49_1 = local740;
						local556.anInt6969 = local12;
						local556.anInt6970 = local6;
						local556.anInt6968 = local9;
						Static153.aClass299_3.method7027(local556);
					}
				}
				@Pc(784) Class49_Sub4 local784 = arg1.aClass49_Sub4_1;
				if (local784 != null && !local784.aBoolean423) {
					if (Static169.aBoolean207) {
						Static338.method5137(arg0, local12, local6, local9);
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					@Pc(807) Class72_Sub7 local807 = local784.method7453(Static416.aClass122_7);
					if (local807 != null) {
						local807.aClass49_1 = local784;
						local807.anInt6969 = local12;
						local807.anInt6970 = local6;
						local807.anInt6968 = local9;
						Static153.aClass299_3.method7027(local807);
					}
				}
			}
			@Pc(828) byte local828 = arg1.aByte104;
			if (local828 != 0) {
				@Pc(845) Class255 local845;
				if (local6 < Static393.anInt7097 && (local828 & 0x4) != 0) {
					local845 = local31[local6 + 1][local9];
					if (local845 != null && local845.aBoolean524) {
						Static497.aClass75_1.method3837(local845);
					}
				}
				if (local9 < Static211.anInt4100 && (local828 & 0x2) != 0) {
					local845 = local31[local6][local9 + 1];
					if (local845 != null && local845.aBoolean524) {
						Static497.aClass75_1.method3837(local845);
					}
				}
				if (local6 > Static393.anInt7097 && (local828 & 0x1) != 0) {
					local845 = local31[local6 - 1][local9];
					if (local845 != null && local845.aBoolean524) {
						Static497.aClass75_1.method3837(local845);
					}
				}
				if (local9 > Static211.anInt4100 && (local828 & 0x8) != 0) {
					local845 = local31[local6][local9 - 1];
					if (local845 != null && local845.aBoolean524) {
						Static497.aClass75_1.method3837(local845);
					}
				}
			}
		}
		@Pc(978) int local978;
		@Pc(961) Class49_Sub1 local961;
		@Pc(982) int local982;
		@Pc(934) Class63 local934;
		if (arg1.aByte103 != 0) {
			local292 = true;
			for (local934 = arg1.aClass63_3; local934 != null; local934 = local934.aClass63_1) {
				if (local934.aClass49_Sub2_1.anInt7139 != Static463.anInt7846 && (local934.anInt1607 & arg1.aByte103) == arg1.aByte102) {
					local292 = false;
					break;
				}
			}
			if (local292) {
				local961 = arg1.aClass49_Sub1_3;
				if (!Static216.method3734(local15, local6, local9, local961.anInt8034)) {
					if (Static169.aBoolean207) {
						label663: {
							if (local961.anInt8034 >= 16) {
								local978 = local6 - Static393.anInt7097;
								local982 = local9 - Static211.anInt4100;
								if (local961.anInt8034 == 16) {
									local978 -= Static122.anInt2483;
									local982 += Static122.anInt2483;
									if (local982 < local978 && local6 > 0 && local9 <= Static382.anInt6965) {
										Static338.method5137(arg0, local12, local6 - 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt8034 == 32) {
									local978 += Static122.anInt2483;
									local982 += Static122.anInt2483;
									if (local982 < -local978 && local6 < Static93.anInt1898 && local9 < Static382.anInt6965) {
										Static338.method5137(arg0, local12, local6 + 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt8034 == 64) {
									local978 += Static122.anInt2483;
									local982 -= Static122.anInt2483;
									if (local982 > local978 && local6 < Static93.anInt1898 && local9 > 0) {
										Static338.method5137(arg0, local12, local6 + 1, local9 - 1);
										break label663;
									}
								} else if (local961.anInt8034 == 128) {
									local978 -= Static122.anInt2483;
									local982 -= Static122.anInt2483;
									if (local982 > -local978 && local6 > 0 && local9 > 0) {
										Static338.method5137(arg0, local12, local6 - 1, local9 - 1);
										break label663;
									}
								}
							}
							Static338.method5137(arg0, local12, local6, local9);
						}
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					@Pc(1120) Class72_Sub7 local1120 = local961.method7453(Static416.aClass122_7);
					if (local1120 != null) {
						local1120.aClass49_1 = local961;
						local1120.anInt6969 = local12;
						local1120.anInt6970 = local6;
						local1120.anInt6968 = local9;
						Static153.aClass299_3.method7027(local1120);
					}
				}
				arg1.aByte103 = 0;
			}
		}
		@Pc(1237) int local1237;
		if (arg1.aBoolean525) {
			try {
				arg1.aBoolean525 = false;
				@Pc(1149) int local1149 = 0;
				label606: for (local934 = arg1.aClass63_3; local934 != null; local934 = local934.aClass63_1) {
					@Pc(1156) Class49_Sub2 local1156 = local934.aClass49_Sub2_1;
					if (local1156.anInt7139 != Static463.anInt7846) {
						for (local978 = local1156.aShort117; local978 <= local1156.aShort115; local978++) {
							for (local982 = local1156.aShort116; local982 <= local1156.aShort118; local982++) {
								@Pc(1174) Class255 local1174 = local31[local978][local982];
								if (local1174.aBoolean523) {
									arg1.aBoolean525 = true;
									continue label606;
								}
								if (local1174.aByte103 != 0) {
									local638 = 0;
									if (local978 > local1156.aShort117) {
										local638++;
									}
									if (local978 < local1156.aShort115) {
										local638 += 4;
									}
									if (local982 > local1156.aShort116) {
										local638 += 8;
									}
									if (local982 < local1156.aShort118) {
										local638 += 2;
									}
									if ((local638 & local1174.aByte103) == arg1.aByte105) {
										arg1.aBoolean525 = true;
										continue label606;
									}
								}
							}
						}
						local982 = Static393.anInt7097 - local1156.aShort117;
						local1237 = local1156.aShort115 - Static393.anInt7097;
						if (local1237 > local982) {
							local982 = local1237;
						}
						local638 = Static211.anInt4100 - local1156.aShort116;
						local643 = local1156.aShort118 - Static211.anInt4100;
						if (local643 > local638) {
							local638 = local643;
						}
						arg0.aClass49_Sub2Array2[local1149] = local1156;
						arg0.anIntArray234[local1149++] = local982 + local638;
					}
				}
				while (local1149 > 0) {
					local348 = -50;
					local978 = -1;
					@Pc(1288) Class49_Sub2 local1288;
					for (local982 = 0; local982 < local1149; local982++) {
						local1288 = arg0.aClass49_Sub2Array2[local982];
						if (local1288.anInt7139 != Static463.anInt7846) {
							local638 = arg0.anIntArray234[local982];
							if (local638 > local348) {
								local348 = local638;
								local978 = local982;
							} else if (local638 == local348) {
								local643 = local1288.anInt7137 - Static311.anInt1617;
								local646 = local1288.anInt7141 - Static2.anInt5668;
								local655 = arg0.aClass49_Sub2Array2[local978].anInt7137 - Static311.anInt1617;
								local667 = arg0.aClass49_Sub2Array2[local978].anInt7141 - Static2.anInt5668;
								if (local643 * local643 + local646 * local646 > local655 * local655 + local667 * local667) {
									local978 = local982;
								}
							}
						}
					}
					if (local978 == -1) {
						break;
					}
					local1288 = arg0.aClass49_Sub2Array2[local978];
					local1288.anInt7139 = Static463.anInt7846;
					if (!Static294.method4704(local15, local1288.aShort117, local1288.aShort115, local1288.aShort116, local1288.aShort118, local1288.method5994())) {
						if (Static169.aBoolean207) {
							if (local1288.aByte97 == 0) {
								Static108.method1862(arg0, local12, local1288.aShort117, local1288.aShort116, local1288.aShort115, local1288.aShort118);
							} else {
								Static338.method5137(arg0, local12, local6, local9);
								local638 = local6 - Static393.anInt7097;
								local643 = local9 - Static211.anInt4100;
								if (local1288.aByte97 == 2) {
									if (local643 > -local638) {
										Static399.method6030(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static399.method6030(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local643 > local638) {
									Static399.method6030(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static399.method6030(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
						}
						local556 = local1288.method7453(Static416.aClass122_7);
						if (local556 != null) {
							local556.aClass49_1 = local1288;
							local556.anInt6969 = local12;
							local556.anInt6970 = local1288.aShort117;
							local556.anInt6968 = local1288.aShort116;
							Static153.aClass299_3.method7027(local556);
						}
					}
					for (local638 = local1288.aShort117; local638 <= local1288.aShort115; local638++) {
						for (local643 = local1288.aShort116; local643 <= local1288.aShort118; local643++) {
							@Pc(1513) Class255 local1513 = local31[local638][local643];
							if (local1513.aByte103 != 0) {
								Static497.aClass75_1.method3837(local1513);
							} else if ((local638 != local6 || local643 != local9) && local1513.aBoolean524) {
								Static497.aClass75_1.method3837(local1513);
							}
						}
					}
				}
				if (arg1.aBoolean525) {
					return;
				}
			} catch (@Pc(1551) Exception local1551) {
				arg1.aBoolean525 = false;
			}
		}
		if (arg1.aClass175_2 != null && arg1.aByte106 == (byte) (Static23.anInt8695 & 0xFF)) {
			@Pc(1568) Class175 local1568 = arg1.aClass175_2;
			local346 = Static544.aClass205Array3[local12].ba(local6, local9);
			if (local12 < Static388.anInt7032 - 1) {
				local348 = Static544.aClass205Array3[local12].ba(local6, local9) - Static544.aClass205Array3[local12 + 1].ba(local6, local9);
			} else {
				local348 = 0x8 << Static451.anInt7905;
			}
			Static142.aClass118_5.method6965(local21, local346, local27, arg0.anIntArray235);
			local978 = arg0.anIntArray235[2];
			Static142.aClass118_5.method6965(local21, local346 - local348, local27, arg0.anIntArray235);
			local982 = arg0.anIntArray235[2];
			local1237 = local978;
			local638 = local982;
			if (local978 > local982) {
				local1237 = local982;
				local638 = local978;
			}
			local1237 -= Static417.anInt7344;
			local638 += Static417.anInt7344;
			local1568.anInt5060 = local1237;
			local1568.anInt5059 = local638;
			local1568.aBoolean357 = true;
			Static416.aClass122_7.method7251(local1568);
		}
		if (!arg1.aBoolean524) {
			return;
		}
		if (arg1.aByte103 != 0) {
			return;
		}
		if (local6 <= Static393.anInt7097 && local6 > Static454.anInt7748) {
			local68 = local31[local6 - 1][local9];
			if (local68 != null && local68.aBoolean524) {
				return;
			}
		}
		if (local6 >= Static393.anInt7097 && local6 < Static299.anInt5552 - 1) {
			local68 = local31[local6 + 1][local9];
			if (local68 != null && local68.aBoolean524) {
				return;
			}
		}
		if (local9 <= Static211.anInt4100 && local9 > Static281.anInt5279) {
			local68 = local31[local6][local9 - 1];
			if (local68 != null && local68.aBoolean524) {
				return;
			}
		}
		if (local9 >= Static211.anInt4100 && local9 < Static237.anInt4785 - 1) {
			local68 = local31[local6][local9 + 1];
			if (local68 != null && local68.aBoolean524) {
				return;
			}
		}
		arg1.aBoolean524 = false;
		Static530.anInt8918--;
		@Pc(1759) Class49_Sub4 local1759 = arg1.aClass49_Sub4_1;
		if (local1759 != null && local1759.aBoolean423) {
			if (Static169.aBoolean207) {
				Static338.method5137(arg0, local12, local6, local9);
				Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
			}
			@Pc(1782) Class72_Sub7 local1782 = local1759.method7453(Static416.aClass122_7);
			if (local1782 != null) {
				local1782.aClass49_1 = local1759;
				local1782.anInt6969 = local12;
				local1782.anInt6970 = local6;
				local1782.anInt6968 = local9;
				Static153.aClass299_3.method7027(local1782);
			}
		}
		if (arg1.aShort125 != 0) {
			@Pc(1806) Class49_Sub3 local1806 = arg1.aClass49_Sub3_1;
			if (local1806 != null && !Static391.method5897(local15, local6, local9, local1806.method7462())) {
				if ((local1806.anInt9069 & arg1.aShort125) != 0) {
					if (Static169.aBoolean207) {
						Static338.method5137(arg0, local12, local6, local9);
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					local326 = local1806.method7453(Static416.aClass122_7);
					if (local326 != null) {
						local326.aClass49_1 = local1806;
						local326.anInt6969 = local12;
						local326.anInt6970 = local6;
						local326.anInt6968 = local9;
						Static153.aClass299_3.method7027(local326);
					}
				} else if (local1806.anInt9069 == 256) {
					local348 = local1806.anInt9077 - Static311.anInt1617;
					local978 = local1806.anInt9071 - Static2.anInt5668;
					local982 = local1806.anInt9072;
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
					if (Static169.aBoolean207) {
						Static338.method5137(arg0, local12, local6, local9);
						Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
					}
					@Pc(1916) Class49_Sub3 local1916 = arg1.aClass49_Sub3_2;
					@Pc(1924) Class72_Sub7 local1924;
					if (local638 > local1237) {
						local1924 = local1806.method7453(Static416.aClass122_7);
						if (local1924 != null) {
							local1924.aClass49_1 = local1806;
							local1924.anInt6969 = local12;
							local1924.anInt6970 = local6;
							local1924.anInt6968 = local9;
							Static153.aClass299_3.method7027(local1924);
						}
					} else if (local1916 != null) {
						local1924 = local1916.method7453(Static416.aClass122_7);
						if (local1924 != null) {
							local1924.aClass49_1 = local1916;
							local1924.anInt6969 = local12;
							local1924.anInt6970 = local6;
							local1924.anInt6968 = local9;
							Static153.aClass299_3.method7027(local1924);
						}
					}
				}
			}
			local961 = arg1.aClass49_Sub1_3;
			local351 = arg1.aClass49_Sub1_2;
			@Pc(2009) Class72_Sub7 local2009;
			if (local351 != null && (local351.anInt8034 & arg1.aShort125) != 0 && !Static216.method3734(local15, local6, local9, local351.anInt8034)) {
				if (Static169.aBoolean207) {
					Static428.method6270(arg0, local351.anInt8034, local12, local6, local9);
					Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
				}
				local2009 = local351.method7453(Static416.aClass122_7);
				if (local2009 != null) {
					local2009.aClass49_1 = local351;
					local2009.anInt6969 = local12;
					local2009.anInt6970 = local6;
					local2009.anInt6968 = local9;
					Static153.aClass299_3.method7027(local2009);
				}
			}
			if (local961 != null && (local961.anInt8034 & arg1.aShort125) != 0 && !Static216.method3734(local15, local6, local9, local961.anInt8034)) {
				if (Static169.aBoolean207) {
					Static428.method6270(arg0, local961.anInt8034, local12, local6, local9);
					Static416.aClass122_7.method7264(arg0.anInt2369, arg0.aClass1_Sub2Array2);
				}
				local2009 = local961.method7453(Static416.aClass122_7);
				if (local2009 != null) {
					local2009.aClass49_1 = local961;
					local2009.anInt6969 = local12;
					local2009.anInt6970 = local6;
					local2009.anInt6968 = local9;
					Static153.aClass299_3.method7027(local2009);
				}
			}
		}
		@Pc(2095) Class255 local2095;
		if (local12 < Static388.anInt7032 - 1) {
			local2095 = Static242.aClass255ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2095 != null && local2095.aBoolean524) {
				Static497.aClass75_1.method3842(local2095);
			}
		}
		if (local6 < Static393.anInt7097) {
			local2095 = local31[local6 + 1][local9];
			if (local2095 != null && local2095.aBoolean524) {
				Static497.aClass75_1.method3837(local2095);
			}
		}
		if (local9 < Static211.anInt4100) {
			local2095 = local31[local6][local9 + 1];
			if (local2095 != null && local2095.aBoolean524) {
				Static497.aClass75_1.method3837(local2095);
			}
		}
		if (local6 > Static393.anInt7097) {
			local2095 = local31[local6 - 1][local9];
			if (local2095 != null && local2095.aBoolean524) {
				Static497.aClass75_1.method3837(local2095);
			}
		}
		if (local9 > Static211.anInt4100) {
			local2095 = local31[local6][local9 - 1];
			if (local2095 != null && local2095.aBoolean524) {
				Static497.aClass75_1.method3837(local2095);
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)I")
	public static int method5173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static193.anIntArrayArray95 == null ? 0 : Static193.anIntArrayArray95[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZC)Z")
	public static boolean method5175(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static535.method7413(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static85.aCharArray12;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static337.aCharArray35;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (local55 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void method5176() {
		for (@Pc(12) int local12 = 0; local12 < Static482.anInt7992; local12++) {
			@Pc(18) Class35 local18 = Static527.aClass35Array1[local12];
			if (local18.aByte1 == 2) {
				if (local18.aClass1_Sub16_Sub2_1 == null) {
					local18.anInt937 = Integer.MIN_VALUE;
				} else {
					Static411.aClass1_Sub16_Sub1_2.method2231(local18.aClass1_Sub16_Sub2_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([III[II)V")
	public static void method5180(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg1) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) int local21 = arg2[local15];
		arg2[local15] = arg2[arg1];
		arg2[arg1] = local21;
		@Pc(35) int local35 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local35;
		@Pc(52) int local52 = local21 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg3; local54 < arg1; local54++) {
			if (arg2[local54] < (local54 & local52) + local21) {
				@Pc(69) int local69 = arg2[local54];
				arg2[local54] = arg2[local17];
				arg2[local17] = local69;
				@Pc(83) int local83 = arg0[local54];
				arg0[local54] = arg0[local17];
				arg0[local17++] = local83;
			}
		}
		arg2[arg1] = arg2[local17];
		arg2[local17] = local21;
		arg0[arg1] = arg0[local17];
		arg0[local17] = local35;
		method5180(arg0, local17 - 1, arg2, arg3);
		method5180(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILclient!bu;I)V")
	public static void method5181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class36 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class1_Sub10 local14 = (Class1_Sub10) Static237.aClass37_49.method977(); local14 != null; local14 = (Class1_Sub10) Static237.aClass37_49.method971()) {
			if (arg1 == local14.anInt1205 && arg3 << 9 == local14.anInt1203 && local14.anInt1210 == arg0 << 9 && arg2.anInt952 == local14.aClass36_1.anInt952) {
				if (local14.aClass1_Sub16_Sub2_2 != null) {
					Static411.aClass1_Sub16_Sub1_2.method2231(local14.aClass1_Sub16_Sub2_2);
					local14.aClass1_Sub16_Sub2_2 = null;
				}
				if (local14.aClass1_Sub16_Sub2_3 != null) {
					Static411.aClass1_Sub16_Sub1_2.method2231(local14.aClass1_Sub16_Sub2_3);
					local14.aClass1_Sub16_Sub2_3 = null;
				}
				local14.method7525();
				return;
			}
		}
	}
}
