import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "[Lclient!d;")
	public static Class52[] aClass52Array3;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method7315(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(16) short[] local16 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = arg1 ? 32768 : 0;
		@Pc(34) int local34 = local24 + (arg1 ? Static494.aClass227_2.anInt6832 : Static494.aClass227_2.anInt6831);
		for (@Pc(36) int local36 = local24; local36 < local34; local36++) {
			@Pc(45) Class3_Sub10_Sub3 local45 = Static494.aClass227_2.method5726(local36);
			if (local45.aBoolean118 && local45.method1323().toLowerCase().indexOf(local8) != -1) {
				if (local18 >= 50) {
					Static363.aShortArray161 = null;
					Static70.anInt570 = -1;
					return;
				}
				if (local16.length <= local18) {
					@Pc(80) short[] local80 = new short[local16.length * 2];
					for (@Pc(82) int local82 = 0; local82 < local18; local82++) {
						local80[local82] = local16[local82];
					}
					local16 = local80;
				}
				local16[local18++] = (short) local36;
			}
		}
		Static363.aShortArray161 = local16;
		Static70.anInt570 = local18;
		Static527.anInt9214 = 0;
		@Pc(119) String[] local119 = new String[Static70.anInt570];
		for (@Pc(121) int local121 = 0; local121 < Static70.anInt570; local121++) {
			local119[local121] = Static494.aClass227_2.method5726(local16[local121]).method1323();
		}
		Static41.method951(local119, Static363.aShortArray161);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!pt;Lclient!uaa;)V")
	public static void method7316(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class290 arg1) {
		if (!arg1.aBoolean641) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort118;
		@Pc(9) short local9 = arg1.aShort117;
		@Pc(12) byte local12 = arg1.aByte94;
		@Pc(15) byte local15 = arg1.aByte95;
		@Pc(21) int local21 = (local6 << Static33.anInt880) + Static467.anInt8424;
		@Pc(27) int local27 = (local9 << Static33.anInt880) + Static467.anInt8424;
		@Pc(31) Class290[][] local31 = Static279.aClass290ArrayArrayArray7[local12];
		if (Static238.aClass52Array2 == aClass52Array3) {
			Static263.aClass5_9.LA(Static163.aClass52Array4[0].sa(local21, local27), Static103.method2046(local6, local9), Static154.method2643(local6, local9), Static507.method7641(local6, local9));
		}
		@Pc(68) Class290 local68;
		@Pc(556) Class4_Sub1 local556;
		@Pc(643) int local643;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(667) int local667;
		@Pc(346) int local346;
		@Pc(292) boolean local292;
		@Pc(326) Class4_Sub1 local326;
		@Pc(348) int local348;
		@Pc(351) Class6_Sub2 local351;
		@Pc(638) int local638;
		if (arg1.aBoolean640) {
			if (Static526.aBoolean673) {
				if (local12 > 0) {
					local68 = Static279.aClass290ArrayArrayArray7[local12 - 1][local6][local9];
					if (local68 != null && local68.aBoolean641) {
						return;
					}
				}
				if (local6 <= Static227.anInt4884 && local6 > Static165.anInt3845) {
					local68 = local31[local6 - 1][local9];
					if (local68 != null && local68.aBoolean641 && (local68.aBoolean640 || (arg1.aByte93 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static227.anInt4884 && local6 < Static44.anInt1046 - 1) {
					local68 = local31[local6 + 1][local9];
					if (local68 != null && local68.aBoolean641 && (local68.aBoolean640 || (arg1.aByte93 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static320.anInt6157 && local9 > Static407.anInt7474) {
					local68 = local31[local6][local9 - 1];
					if (local68 != null && local68.aBoolean641 && (local68.aBoolean640 || (arg1.aByte93 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static320.anInt6157 && local9 < Static33.anInt875 - 1) {
					local68 = local31[local6][local9 + 1];
					if (local68 != null && local68.aBoolean641 && (local68.aBoolean640 || (arg1.aByte93 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static526.aBoolean673 = true;
			}
			arg1.aBoolean640 = false;
			if (arg1.aClass290_1 != null) {
				local68 = arg1.aClass290_1;
				if (!Static363.method5711(local68.aByte95, local6, local9)) {
					aClass52Array3[local68.aByte95].method7830(local6, local9);
				}
				@Pc(217) Class6_Sub2 local217 = local68.aClass6_Sub2_2;
				if (local217 != null) {
					if (Static531.aBoolean676) {
						if ((local217.anInt9382 & arg1.aShort119) == 0) {
							Static372.method5856(arg0, local12, local6, local9);
						} else {
							Static370.method5842(arg0, local217.anInt9382, local15, local6, local9);
						}
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					local217.method7745(Static263.aClass5_9);
				}
				for (@Pc(254) Class98 local254 = local68.aClass98_3; local254 != null; local254 = local254.aClass98_1) {
					@Pc(258) Class6_Sub1 local258 = local254.aClass6_Sub1_1;
					if (local258 != null) {
						if (Static531.aBoolean676) {
							Static372.method5856(arg0, local12, local6, local9);
							Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
						}
						local258.method7745(Static263.aClass5_9);
					}
				}
			}
			local292 = !Static363.method5711(local15, local6, local9);
			if (local292) {
				aClass52Array3[local15].method7830(local6, local9);
				@Pc(303) Class6_Sub3 local303 = arg1.aClass6_Sub3_2;
				if (local303 != null && local303.aBoolean343) {
					if (Static531.aBoolean676) {
						Static372.method5856(arg0, local12, local6, local9);
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					local326 = local303.method7745(Static263.aClass5_9);
					if (local326 != null) {
						local326.aClass6_1 = local303;
						local326.anInt163 = local12;
						local326.anInt165 = local6;
						local326.anInt164 = local9;
						Static210.aClass90_9.method2322(local326);
					}
				}
			}
			local346 = 0;
			local348 = 0;
			local351 = arg1.aClass6_Sub2_2;
			@Pc(354) Class6_Sub4 local354 = arg1.aClass6_Sub4_3;
			if (local351 != null || local354 != null) {
				if (Static227.anInt4884 == local6) {
					local346++;
				} else if (Static227.anInt4884 < local6) {
					local346 += 2;
				}
				if (Static320.anInt6157 == local9) {
					local346 += 3;
				} else if (Static320.anInt6157 > local9) {
					local346 += 6;
				}
				local348 = Static70.anIntArray103[local346];
				arg1.aShort119 = Static204.aShortArray160[local346];
			}
			if (local351 != null) {
				if ((local351.anInt9382 & Static516.anIntArray757[local346]) == 0) {
					arg1.aByte98 = 0;
				} else if (local351.anInt9382 == 16) {
					arg1.aByte98 = 3;
					arg1.aByte99 = Static434.aByteArray95[local346];
					arg1.aByte97 = (byte) (3 - arg1.aByte99);
				} else if (local351.anInt9382 == 32) {
					arg1.aByte98 = 6;
					arg1.aByte99 = Static497.aByteArray103[local346];
					arg1.aByte97 = (byte) (6 - arg1.aByte99);
				} else if (local351.anInt9382 == 64) {
					arg1.aByte98 = 12;
					arg1.aByte99 = Static399.aByteArray86[local346];
					arg1.aByte97 = (byte) (12 - arg1.aByte99);
				} else {
					arg1.aByte98 = 9;
					arg1.aByte99 = Static522.aByteArray112[local346];
					arg1.aByte97 = (byte) (9 - arg1.aByte99);
				}
				if ((local351.anInt9382 & local348) != 0 && !Static176.method3401(local15, local6, local9, local351.anInt9382)) {
					if (Static531.aBoolean676) {
						Static372.method5856(arg0, local12, local6, local9);
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					@Pc(503) Class4_Sub1 local503 = local351.method7745(Static263.aClass5_9);
					if (local503 != null) {
						local503.aClass6_1 = local351;
						local503.anInt163 = local12;
						local503.anInt165 = local6;
						local503.anInt164 = local9;
						Static210.aClass90_9.method2322(local503);
					}
				}
				@Pc(524) Class6_Sub2 local524 = arg1.aClass6_Sub2_3;
				if (local524 != null && (local524.anInt9382 & local348) != 0 && !Static176.method3401(local15, local6, local9, local524.anInt9382)) {
					if (Static531.aBoolean676) {
						Static372.method5856(arg0, local12, local6, local9);
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					local556 = local524.method7745(Static263.aClass5_9);
					if (local556 != null) {
						local556.aClass6_1 = local524;
						local556.anInt163 = local12;
						local556.anInt165 = local6;
						local556.anInt164 = local9;
						Static210.aClass90_9.method2322(local556);
					}
				}
			}
			if (local354 != null && !Static367.method5756(local15, local6, local9, local354.method7720())) {
				@Pc(587) Class6_Sub4 local587 = arg1.aClass6_Sub4_2;
				if ((local354.anInt9345 & local348) != 0) {
					if (Static531.aBoolean676) {
						Static372.method5856(arg0, local12, local6, local9);
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					local556 = local354.method7745(Static263.aClass5_9);
					if (local556 != null) {
						local556.aClass6_1 = local354;
						local556.anInt163 = local12;
						local556.anInt165 = local6;
						local556.anInt164 = local9;
						Static210.aClass90_9.method2322(local556);
					}
				} else if (local354.anInt9345 == 256) {
					local638 = local354.anInt9336 - Static184.anInt4224;
					local643 = local354.anInt9342 - Static371.anInt6982;
					local646 = local354.anInt9344;
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
					if (Static531.aBoolean676) {
						Static372.method5856(arg0, local12, local6, local9);
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					@Pc(691) Class4_Sub1 local691;
					if (local667 < local655) {
						local691 = local354.method7745(Static263.aClass5_9);
						if (local691 != null) {
							local691.aClass6_1 = local354;
							local691.anInt163 = local12;
							local691.anInt165 = local6;
							local691.anInt164 = local9;
							Static210.aClass90_9.method2322(local691);
						}
					} else if (local587 != null) {
						local691 = local587.method7745(Static263.aClass5_9);
						if (local691 != null) {
							local691.aClass6_1 = local587;
							local691.anInt163 = local12;
							local691.anInt165 = local6;
							local691.anInt164 = local9;
							Static210.aClass90_9.method2322(local691);
						}
					}
				}
			}
			if (local292) {
				@Pc(740) Class6_Sub3 local740 = arg1.aClass6_Sub3_2;
				if (local740 != null && !local740.aBoolean343) {
					if (Static531.aBoolean676) {
						Static372.method5856(arg0, local12, local6, local9);
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					local556 = local740.method7745(Static263.aClass5_9);
					if (local556 != null) {
						local556.aClass6_1 = local740;
						local556.anInt163 = local12;
						local556.anInt165 = local6;
						local556.anInt164 = local9;
						Static210.aClass90_9.method2322(local556);
					}
				}
				@Pc(784) Class6_Sub5 local784 = arg1.aClass6_Sub5_1;
				if (local784 != null && !local784.aBoolean579) {
					if (Static531.aBoolean676) {
						Static372.method5856(arg0, local12, local6, local9);
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					@Pc(807) Class4_Sub1 local807 = local784.method7745(Static263.aClass5_9);
					if (local807 != null) {
						local807.aClass6_1 = local784;
						local807.anInt163 = local12;
						local807.anInt165 = local6;
						local807.anInt164 = local9;
						Static210.aClass90_9.method2322(local807);
					}
				}
			}
			@Pc(828) byte local828 = arg1.aByte93;
			if (local828 != 0) {
				@Pc(845) Class290 local845;
				if (local6 < Static227.anInt4884 && (local828 & 0x4) != 0) {
					local845 = local31[local6 + 1][local9];
					if (local845 != null && local845.aBoolean641) {
						Static442.aClass7_1.method1150(local845);
					}
				}
				if (local9 < Static320.anInt6157 && (local828 & 0x2) != 0) {
					local845 = local31[local6][local9 + 1];
					if (local845 != null && local845.aBoolean641) {
						Static442.aClass7_1.method1150(local845);
					}
				}
				if (local6 > Static227.anInt4884 && (local828 & 0x1) != 0) {
					local845 = local31[local6 - 1][local9];
					if (local845 != null && local845.aBoolean641) {
						Static442.aClass7_1.method1150(local845);
					}
				}
				if (local9 > Static320.anInt6157 && (local828 & 0x8) != 0) {
					local845 = local31[local6][local9 - 1];
					if (local845 != null && local845.aBoolean641) {
						Static442.aClass7_1.method1150(local845);
					}
				}
			}
		}
		@Pc(978) int local978;
		@Pc(961) Class6_Sub2 local961;
		@Pc(982) int local982;
		@Pc(934) Class98 local934;
		if (arg1.aByte98 != 0) {
			local292 = true;
			for (local934 = arg1.aClass98_3; local934 != null; local934 = local934.aClass98_1) {
				if (local934.aClass6_Sub1_1.anInt8812 != Static457.anInt8266 && (local934.anInt2952 & arg1.aByte98) == arg1.aByte99) {
					local292 = false;
					break;
				}
			}
			if (local292) {
				local961 = arg1.aClass6_Sub2_2;
				if (!Static176.method3401(local15, local6, local9, local961.anInt9382)) {
					if (Static531.aBoolean676) {
						label663: {
							if (local961.anInt9382 >= 16) {
								local978 = local6 - Static227.anInt4884;
								local982 = local9 - Static320.anInt6157;
								if (local961.anInt9382 == 16) {
									local978 -= Static467.anInt8424;
									local982 += Static467.anInt8424;
									if (local982 < local978 && local6 > 0 && local9 <= Static108.anInt2385) {
										Static372.method5856(arg0, local12, local6 - 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt9382 == 32) {
									local978 += Static467.anInt8424;
									local982 += Static467.anInt8424;
									if (local982 < -local978 && local6 < Static126.anInt2626 && local9 < Static108.anInt2385) {
										Static372.method5856(arg0, local12, local6 + 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt9382 == 64) {
									local978 += Static467.anInt8424;
									local982 -= Static467.anInt8424;
									if (local982 > local978 && local6 < Static126.anInt2626 && local9 > 0) {
										Static372.method5856(arg0, local12, local6 + 1, local9 - 1);
										break label663;
									}
								} else if (local961.anInt9382 == 128) {
									local978 -= Static467.anInt8424;
									local982 -= Static467.anInt8424;
									if (local982 > -local978 && local6 > 0 && local9 > 0) {
										Static372.method5856(arg0, local12, local6 - 1, local9 - 1);
										break label663;
									}
								}
							}
							Static372.method5856(arg0, local12, local6, local9);
						}
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					@Pc(1120) Class4_Sub1 local1120 = local961.method7745(Static263.aClass5_9);
					if (local1120 != null) {
						local1120.aClass6_1 = local961;
						local1120.anInt163 = local12;
						local1120.anInt165 = local6;
						local1120.anInt164 = local9;
						Static210.aClass90_9.method2322(local1120);
					}
				}
				arg1.aByte98 = 0;
			}
		}
		@Pc(1237) int local1237;
		if (arg1.aBoolean639) {
			try {
				arg1.aBoolean639 = false;
				@Pc(1149) int local1149 = 0;
				label606: for (local934 = arg1.aClass98_3; local934 != null; local934 = local934.aClass98_1) {
					@Pc(1156) Class6_Sub1 local1156 = local934.aClass6_Sub1_1;
					if (local1156.anInt8812 != Static457.anInt8266) {
						for (local978 = local1156.aShort123; local978 <= local1156.aShort122; local978++) {
							for (local982 = local1156.aShort120; local982 <= local1156.aShort121; local982++) {
								@Pc(1174) Class290 local1174 = local31[local978][local982];
								if (local1174.aBoolean640) {
									arg1.aBoolean639 = true;
									continue label606;
								}
								if (local1174.aByte98 != 0) {
									local638 = 0;
									if (local978 > local1156.aShort123) {
										local638++;
									}
									if (local978 < local1156.aShort122) {
										local638 += 4;
									}
									if (local982 > local1156.aShort120) {
										local638 += 8;
									}
									if (local982 < local1156.aShort121) {
										local638 += 2;
									}
									if ((local638 & local1174.aByte98) == arg1.aByte97) {
										arg1.aBoolean639 = true;
										continue label606;
									}
								}
							}
						}
						local982 = Static227.anInt4884 - local1156.aShort123;
						local1237 = local1156.aShort122 - Static227.anInt4884;
						if (local1237 > local982) {
							local982 = local1237;
						}
						local638 = Static320.anInt6157 - local1156.aShort120;
						local643 = local1156.aShort121 - Static320.anInt6157;
						if (local643 > local638) {
							local638 = local643;
						}
						arg0.aClass6_Sub1Array3[local1149] = local1156;
						arg0.anIntArray512[local1149++] = local982 + local638;
					}
				}
				while (local1149 > 0) {
					local348 = -50;
					local978 = -1;
					@Pc(1288) Class6_Sub1 local1288;
					for (local982 = 0; local982 < local1149; local982++) {
						local1288 = arg0.aClass6_Sub1Array3[local982];
						if (local1288.anInt8812 != Static457.anInt8266) {
							local638 = arg0.anIntArray512[local982];
							if (local638 > local348) {
								local348 = local638;
								local978 = local982;
							} else if (local638 == local348) {
								local643 = local1288.anInt8811 - Static184.anInt4224;
								local646 = local1288.anInt8813 - Static371.anInt6982;
								local655 = arg0.aClass6_Sub1Array3[local978].anInt8811 - Static184.anInt4224;
								local667 = arg0.aClass6_Sub1Array3[local978].anInt8813 - Static371.anInt6982;
								if (local643 * local643 + local646 * local646 > local655 * local655 + local667 * local667) {
									local978 = local982;
								}
							}
						}
					}
					if (local978 == -1) {
						break;
					}
					local1288 = arg0.aClass6_Sub1Array3[local978];
					local1288.anInt8812 = Static457.anInt8266;
					if (!Static373.method5875(local15, local1288.aShort123, local1288.aShort122, local1288.aShort120, local1288.aShort121, local1288.method7240())) {
						if (Static531.aBoolean676) {
							if (local1288.aByte101 == 0) {
								Static35.method858(arg0, local12, local1288.aShort123, local1288.aShort120, local1288.aShort122, local1288.aShort121);
							} else {
								Static372.method5856(arg0, local12, local6, local9);
								local638 = local6 - Static227.anInt4884;
								local643 = local9 - Static320.anInt6157;
								if (local1288.aByte101 == 2) {
									if (local643 > -local638) {
										Static533.method5632(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static533.method5632(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local643 > local638) {
									Static533.method5632(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static533.method5632(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
						}
						local556 = local1288.method7745(Static263.aClass5_9);
						if (local556 != null) {
							local556.aClass6_1 = local1288;
							local556.anInt163 = local12;
							local556.anInt165 = local1288.aShort123;
							local556.anInt164 = local1288.aShort120;
							Static210.aClass90_9.method2322(local556);
						}
					}
					for (local638 = local1288.aShort123; local638 <= local1288.aShort122; local638++) {
						for (local643 = local1288.aShort120; local643 <= local1288.aShort121; local643++) {
							@Pc(1513) Class290 local1513 = local31[local638][local643];
							if (local1513.aByte98 != 0) {
								Static442.aClass7_1.method1150(local1513);
							} else if ((local638 != local6 || local643 != local9) && local1513.aBoolean641) {
								Static442.aClass7_1.method1150(local1513);
							}
						}
					}
				}
				if (arg1.aBoolean639) {
					return;
				}
			} catch (@Pc(1551) Exception local1551) {
				arg1.aBoolean639 = false;
			}
		}
		if (arg1.aClass26_2 != null && arg1.aByte96 == (byte) (Static24.anInt753 & 0xFF)) {
			@Pc(1568) Class26 local1568 = arg1.aClass26_2;
			local346 = aClass52Array3[local12].JA(local6, local9);
			if (local12 < Static399.anInt7385 - 1) {
				local348 = aClass52Array3[local12].JA(local6, local9) - aClass52Array3[local12 + 1].JA(local6, local9);
			} else {
				local348 = 0x8 << Static33.anInt880;
			}
			Static531.aClass205_6.method7802(local21, local346, local27, arg0.anIntArray513);
			local978 = arg0.anIntArray513[2];
			Static531.aClass205_6.method7802(local21, local346 - local348, local27, arg0.anIntArray513);
			local982 = arg0.anIntArray513[2];
			local1237 = local978;
			local638 = local982;
			if (local978 > local982) {
				local1237 = local982;
				local638 = local978;
			}
			local1237 -= Static151.anInt3058;
			local638 += Static151.anInt3058;
			local1568.anInt806 = local1237;
			local1568.anInt804 = local638;
			local1568.aBoolean66 = true;
			Static263.aClass5_9.method7429(local1568);
		}
		if (!arg1.aBoolean641) {
			return;
		}
		if (arg1.aByte98 != 0) {
			return;
		}
		if (local6 <= Static227.anInt4884 && local6 > Static165.anInt3845) {
			local68 = local31[local6 - 1][local9];
			if (local68 != null && local68.aBoolean641) {
				return;
			}
		}
		if (local6 >= Static227.anInt4884 && local6 < Static44.anInt1046 - 1) {
			local68 = local31[local6 + 1][local9];
			if (local68 != null && local68.aBoolean641) {
				return;
			}
		}
		if (local9 <= Static320.anInt6157 && local9 > Static407.anInt7474) {
			local68 = local31[local6][local9 - 1];
			if (local68 != null && local68.aBoolean641) {
				return;
			}
		}
		if (local9 >= Static320.anInt6157 && local9 < Static33.anInt875 - 1) {
			local68 = local31[local6][local9 + 1];
			if (local68 != null && local68.aBoolean641) {
				return;
			}
		}
		arg1.aBoolean641 = false;
		Static265.anInt5515--;
		@Pc(1759) Class6_Sub5 local1759 = arg1.aClass6_Sub5_1;
		if (local1759 != null && local1759.aBoolean579) {
			if (Static531.aBoolean676) {
				Static372.method5856(arg0, local12, local6, local9);
				Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
			}
			@Pc(1782) Class4_Sub1 local1782 = local1759.method7745(Static263.aClass5_9);
			if (local1782 != null) {
				local1782.aClass6_1 = local1759;
				local1782.anInt163 = local12;
				local1782.anInt165 = local6;
				local1782.anInt164 = local9;
				Static210.aClass90_9.method2322(local1782);
			}
		}
		if (arg1.aShort119 != 0) {
			@Pc(1806) Class6_Sub4 local1806 = arg1.aClass6_Sub4_3;
			if (local1806 != null && !Static367.method5756(local15, local6, local9, local1806.method7720())) {
				if ((local1806.anInt9345 & arg1.aShort119) != 0) {
					if (Static531.aBoolean676) {
						Static372.method5856(arg0, local12, local6, local9);
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					local326 = local1806.method7745(Static263.aClass5_9);
					if (local326 != null) {
						local326.aClass6_1 = local1806;
						local326.anInt163 = local12;
						local326.anInt165 = local6;
						local326.anInt164 = local9;
						Static210.aClass90_9.method2322(local326);
					}
				} else if (local1806.anInt9345 == 256) {
					local348 = local1806.anInt9336 - Static184.anInt4224;
					local978 = local1806.anInt9342 - Static371.anInt6982;
					local982 = local1806.anInt9344;
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
					if (Static531.aBoolean676) {
						Static372.method5856(arg0, local12, local6, local9);
						Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
					}
					@Pc(1916) Class6_Sub4 local1916 = arg1.aClass6_Sub4_2;
					@Pc(1924) Class4_Sub1 local1924;
					if (local638 > local1237) {
						local1924 = local1806.method7745(Static263.aClass5_9);
						if (local1924 != null) {
							local1924.aClass6_1 = local1806;
							local1924.anInt163 = local12;
							local1924.anInt165 = local6;
							local1924.anInt164 = local9;
							Static210.aClass90_9.method2322(local1924);
						}
					} else if (local1916 != null) {
						local1924 = local1916.method7745(Static263.aClass5_9);
						if (local1924 != null) {
							local1924.aClass6_1 = local1916;
							local1924.anInt163 = local12;
							local1924.anInt165 = local6;
							local1924.anInt164 = local9;
							Static210.aClass90_9.method2322(local1924);
						}
					}
				}
			}
			local961 = arg1.aClass6_Sub2_2;
			local351 = arg1.aClass6_Sub2_3;
			@Pc(2009) Class4_Sub1 local2009;
			if (local351 != null && (local351.anInt9382 & arg1.aShort119) != 0 && !Static176.method3401(local15, local6, local9, local351.anInt9382)) {
				if (Static531.aBoolean676) {
					Static370.method5842(arg0, local351.anInt9382, local12, local6, local9);
					Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
				}
				local2009 = local351.method7745(Static263.aClass5_9);
				if (local2009 != null) {
					local2009.aClass6_1 = local351;
					local2009.anInt163 = local12;
					local2009.anInt165 = local6;
					local2009.anInt164 = local9;
					Static210.aClass90_9.method2322(local2009);
				}
			}
			if (local961 != null && (local961.anInt9382 & arg1.aShort119) != 0 && !Static176.method3401(local15, local6, local9, local961.anInt9382)) {
				if (Static531.aBoolean676) {
					Static370.method5842(arg0, local961.anInt9382, local12, local6, local9);
					Static263.aClass5_9.method7460(arg0.anInt5751, arg0.aClass3_Sub30Array5);
				}
				local2009 = local961.method7745(Static263.aClass5_9);
				if (local2009 != null) {
					local2009.aClass6_1 = local961;
					local2009.anInt163 = local12;
					local2009.anInt165 = local6;
					local2009.anInt164 = local9;
					Static210.aClass90_9.method2322(local2009);
				}
			}
		}
		@Pc(2095) Class290 local2095;
		if (local12 < Static399.anInt7385 - 1) {
			local2095 = Static279.aClass290ArrayArrayArray7[local12 + 1][local6][local9];
			if (local2095 != null && local2095.aBoolean641) {
				Static442.aClass7_1.method1151(local2095);
			}
		}
		if (local6 < Static227.anInt4884) {
			local2095 = local31[local6 + 1][local9];
			if (local2095 != null && local2095.aBoolean641) {
				Static442.aClass7_1.method1150(local2095);
			}
		}
		if (local9 < Static320.anInt6157) {
			local2095 = local31[local6][local9 + 1];
			if (local2095 != null && local2095.aBoolean641) {
				Static442.aClass7_1.method1150(local2095);
			}
		}
		if (local6 > Static227.anInt4884) {
			local2095 = local31[local6 - 1][local9];
			if (local2095 != null && local2095.aBoolean641) {
				Static442.aClass7_1.method1150(local2095);
			}
		}
		if (local9 > Static320.anInt6157) {
			local2095 = local31[local6][local9 - 1];
			if (local2095 != null && local2095.aBoolean641) {
				Static442.aClass7_1.method1150(local2095);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)V")
	public static void method7318() {
		@Pc(1) Class125 local1 = Static260.aClass125_36;
		synchronized (Static260.aClass125_36) {
			Static260.aClass125_36.method3522(5);
		}
	}
}
