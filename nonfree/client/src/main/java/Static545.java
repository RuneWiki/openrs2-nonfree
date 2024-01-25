import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_150 = new Class98(62, 5);

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_117 = new Class316(20, 2);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!mh;Lclient!hl;)V")
	public static void method7379(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class133 arg1) {
		if (!arg1.aBoolean304) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort59;
		@Pc(9) short local9 = arg1.aShort58;
		@Pc(12) byte local12 = arg1.aByte50;
		@Pc(15) byte local15 = arg1.aByte49;
		@Pc(21) int local21 = (local6 << Static23.anInt420) + Static259.anInt4703;
		@Pc(27) int local27 = (local9 << Static23.anInt420) + Static259.anInt4703;
		@Pc(31) Class133[][] local31 = Static113.aClass133ArrayArrayArray1[local12];
		if (Static480.aClass46Array2 == Static205.aClass46Array1) {
			Static276.aClass90_9.LA(Static496.aClass46Array4[0].sa(local21, local27), Static393.method5720(local6, local9), Static334.method5142(local6, local9), Static4.method72(local6, local9));
		}
		@Pc(68) Class133 local68;
		@Pc(556) Class60_Sub8 local556;
		@Pc(643) int local643;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(667) int local667;
		@Pc(346) int local346;
		@Pc(292) boolean local292;
		@Pc(326) Class60_Sub8 local326;
		@Pc(348) int local348;
		@Pc(351) Class15_Sub1 local351;
		@Pc(638) int local638;
		if (arg1.aBoolean302) {
			if (Static486.aBoolean560) {
				if (local12 > 0) {
					local68 = Static113.aClass133ArrayArrayArray1[local12 - 1][local6][local9];
					if (local68 != null && local68.aBoolean304) {
						return;
					}
				}
				if (local6 <= Static207.anInt3926 && local6 > Static538.anInt9252) {
					local68 = local31[local6 - 1][local9];
					if (local68 != null && local68.aBoolean304 && (local68.aBoolean302 || (arg1.aByte46 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static207.anInt3926 && local6 < Static70.anInt1182 - 1) {
					local68 = local31[local6 + 1][local9];
					if (local68 != null && local68.aBoolean304 && (local68.aBoolean302 || (arg1.aByte46 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static3.anInt7083 && local9 > Static203.anInt3852) {
					local68 = local31[local6][local9 - 1];
					if (local68 != null && local68.aBoolean304 && (local68.aBoolean302 || (arg1.aByte46 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static3.anInt7083 && local9 < Static210.anInt3998 - 1) {
					local68 = local31[local6][local9 + 1];
					if (local68 != null && local68.aBoolean304 && (local68.aBoolean302 || (arg1.aByte46 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static486.aBoolean560 = true;
			}
			arg1.aBoolean302 = false;
			if (arg1.aClass133_1 != null) {
				local68 = arg1.aClass133_1;
				if (!Static245.method3831(local68.aByte49, local6, local9)) {
					Static205.aClass46Array1[local68.aByte49].method7970(local6, local9);
				}
				@Pc(217) Class15_Sub1 local217 = local68.aClass15_Sub1_2;
				if (local217 != null) {
					if (Static301.aBoolean384) {
						if ((local217.anInt5701 & arg1.aShort60) == 0) {
							Static535.method7283(arg0, local12, local6, local9);
						} else {
							Static24.method350(arg0, local217.anInt5701, local15, local6, local9);
						}
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					local217.method7155(Static276.aClass90_9);
				}
				for (@Pc(254) Class315 local254 = local68.aClass315_1; local254 != null; local254 = local254.aClass315_3) {
					@Pc(258) Class15_Sub2 local258 = local254.aClass15_Sub2_2;
					if (local258 != null) {
						if (Static301.aBoolean384) {
							Static535.method7283(arg0, local12, local6, local9);
							Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
						}
						local258.method7155(Static276.aClass90_9);
					}
				}
			}
			local292 = !Static245.method3831(local15, local6, local9);
			if (local292) {
				Static205.aClass46Array1[local15].method7970(local6, local9);
				@Pc(303) Class15_Sub3 local303 = arg1.aClass15_Sub3_2;
				if (local303 != null && local303.aBoolean514) {
					if (Static301.aBoolean384) {
						Static535.method7283(arg0, local12, local6, local9);
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					local326 = local303.method7155(Static276.aClass90_9);
					if (local326 != null) {
						local326.aClass15_1 = local303;
						local326.anInt9790 = local12;
						local326.anInt9791 = local6;
						local326.anInt9794 = local9;
						Static260.aClass349_8.method7893(local326);
					}
				}
			}
			local346 = 0;
			local348 = 0;
			local351 = arg1.aClass15_Sub1_2;
			@Pc(354) Class15_Sub4 local354 = arg1.aClass15_Sub4_2;
			if (local351 != null || local354 != null) {
				if (Static207.anInt3926 == local6) {
					local346++;
				} else if (Static207.anInt3926 < local6) {
					local346 += 2;
				}
				if (Static3.anInt7083 == local9) {
					local346 += 3;
				} else if (Static3.anInt7083 > local9) {
					local346 += 6;
				}
				local348 = Static420.anIntArray569[local346];
				arg1.aShort60 = Static418.aShortArray132[local346];
			}
			if (local351 != null) {
				if ((local351.anInt5701 & Static574.anIntArray400[local346]) == 0) {
					arg1.aByte48 = 0;
				} else if (local351.anInt5701 == 16) {
					arg1.aByte48 = 3;
					arg1.aByte47 = Static105.aByteArray15[local346];
					arg1.aByte45 = (byte) (3 - arg1.aByte47);
				} else if (local351.anInt5701 == 32) {
					arg1.aByte48 = 6;
					arg1.aByte47 = Static72.aByteArray7[local346];
					arg1.aByte45 = (byte) (6 - arg1.aByte47);
				} else if (local351.anInt5701 == 64) {
					arg1.aByte48 = 12;
					arg1.aByte47 = Static198.aByteArray44[local346];
					arg1.aByte45 = (byte) (12 - arg1.aByte47);
				} else {
					arg1.aByte48 = 9;
					arg1.aByte47 = Static35.aByteArray1[local346];
					arg1.aByte45 = (byte) (9 - arg1.aByte47);
				}
				if ((local351.anInt5701 & local348) != 0 && !Static393.method5725(local15, local6, local9, local351.anInt5701)) {
					if (Static301.aBoolean384) {
						Static535.method7283(arg0, local12, local6, local9);
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					@Pc(503) Class60_Sub8 local503 = local351.method7155(Static276.aClass90_9);
					if (local503 != null) {
						local503.aClass15_1 = local351;
						local503.anInt9790 = local12;
						local503.anInt9791 = local6;
						local503.anInt9794 = local9;
						Static260.aClass349_8.method7893(local503);
					}
				}
				@Pc(524) Class15_Sub1 local524 = arg1.aClass15_Sub1_1;
				if (local524 != null && (local524.anInt5701 & local348) != 0 && !Static393.method5725(local15, local6, local9, local524.anInt5701)) {
					if (Static301.aBoolean384) {
						Static535.method7283(arg0, local12, local6, local9);
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					local556 = local524.method7155(Static276.aClass90_9);
					if (local556 != null) {
						local556.aClass15_1 = local524;
						local556.anInt9790 = local12;
						local556.anInt9791 = local6;
						local556.anInt9794 = local9;
						Static260.aClass349_8.method7893(local556);
					}
				}
			}
			if (local354 != null && !Static240.method3740(local15, local6, local9, local354.method7166())) {
				@Pc(587) Class15_Sub4 local587 = arg1.aClass15_Sub4_1;
				if ((local354.anInt9051 & local348) != 0) {
					if (Static301.aBoolean384) {
						Static535.method7283(arg0, local12, local6, local9);
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					local556 = local354.method7155(Static276.aClass90_9);
					if (local556 != null) {
						local556.aClass15_1 = local354;
						local556.anInt9790 = local12;
						local556.anInt9791 = local6;
						local556.anInt9794 = local9;
						Static260.aClass349_8.method7893(local556);
					}
				} else if (local354.anInt9051 == 256) {
					local638 = local354.anInt9048 - Static226.anInt4160;
					local643 = local354.anInt9052 - Static567.anInt9819;
					local646 = local354.anInt9043;
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
					if (Static301.aBoolean384) {
						Static535.method7283(arg0, local12, local6, local9);
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					@Pc(691) Class60_Sub8 local691;
					if (local667 < local655) {
						local691 = local354.method7155(Static276.aClass90_9);
						if (local691 != null) {
							local691.aClass15_1 = local354;
							local691.anInt9790 = local12;
							local691.anInt9791 = local6;
							local691.anInt9794 = local9;
							Static260.aClass349_8.method7893(local691);
						}
					} else if (local587 != null) {
						local691 = local587.method7155(Static276.aClass90_9);
						if (local691 != null) {
							local691.aClass15_1 = local587;
							local691.anInt9790 = local12;
							local691.anInt9791 = local6;
							local691.anInt9794 = local9;
							Static260.aClass349_8.method7893(local691);
						}
					}
				}
			}
			if (local292) {
				@Pc(740) Class15_Sub3 local740 = arg1.aClass15_Sub3_2;
				if (local740 != null && !local740.aBoolean514) {
					if (Static301.aBoolean384) {
						Static535.method7283(arg0, local12, local6, local9);
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					local556 = local740.method7155(Static276.aClass90_9);
					if (local556 != null) {
						local556.aClass15_1 = local740;
						local556.anInt9790 = local12;
						local556.anInt9791 = local6;
						local556.anInt9794 = local9;
						Static260.aClass349_8.method7893(local556);
					}
				}
				@Pc(784) Class15_Sub5 local784 = arg1.aClass15_Sub5_1;
				if (local784 != null && !local784.aBoolean450) {
					if (Static301.aBoolean384) {
						Static535.method7283(arg0, local12, local6, local9);
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					@Pc(807) Class60_Sub8 local807 = local784.method7155(Static276.aClass90_9);
					if (local807 != null) {
						local807.aClass15_1 = local784;
						local807.anInt9790 = local12;
						local807.anInt9791 = local6;
						local807.anInt9794 = local9;
						Static260.aClass349_8.method7893(local807);
					}
				}
			}
			@Pc(828) byte local828 = arg1.aByte46;
			if (local828 != 0) {
				@Pc(845) Class133 local845;
				if (local6 < Static207.anInt3926 && (local828 & 0x4) != 0) {
					local845 = local31[local6 + 1][local9];
					if (local845 != null && local845.aBoolean304) {
						Static221.aClass175_1.method4153(local845);
					}
				}
				if (local9 < Static3.anInt7083 && (local828 & 0x2) != 0) {
					local845 = local31[local6][local9 + 1];
					if (local845 != null && local845.aBoolean304) {
						Static221.aClass175_1.method4153(local845);
					}
				}
				if (local6 > Static207.anInt3926 && (local828 & 0x1) != 0) {
					local845 = local31[local6 - 1][local9];
					if (local845 != null && local845.aBoolean304) {
						Static221.aClass175_1.method4153(local845);
					}
				}
				if (local9 > Static3.anInt7083 && (local828 & 0x8) != 0) {
					local845 = local31[local6][local9 - 1];
					if (local845 != null && local845.aBoolean304) {
						Static221.aClass175_1.method4153(local845);
					}
				}
			}
		}
		@Pc(978) int local978;
		@Pc(961) Class15_Sub1 local961;
		@Pc(982) int local982;
		@Pc(934) Class315 local934;
		if (arg1.aByte48 != 0) {
			local292 = true;
			for (local934 = arg1.aClass315_1; local934 != null; local934 = local934.aClass315_3) {
				if (local934.aClass15_Sub2_2.anInt8914 != Static171.anInt9038 && (local934.anInt8858 & arg1.aByte48) == arg1.aByte47) {
					local292 = false;
					break;
				}
			}
			if (local292) {
				local961 = arg1.aClass15_Sub1_2;
				if (!Static393.method5725(local15, local6, local9, local961.anInt5701)) {
					if (Static301.aBoolean384) {
						label663: {
							if (local961.anInt5701 >= 16) {
								local978 = local6 - Static207.anInt3926;
								local982 = local9 - Static3.anInt7083;
								if (local961.anInt5701 == 16) {
									local978 -= Static259.anInt4703;
									local982 += Static259.anInt4703;
									if (local982 < local978 && local6 > 0 && local9 <= Static20.anInt358) {
										Static535.method7283(arg0, local12, local6 - 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt5701 == 32) {
									local978 += Static259.anInt4703;
									local982 += Static259.anInt4703;
									if (local982 < -local978 && local6 < Static547.anInt9363 && local9 < Static20.anInt358) {
										Static535.method7283(arg0, local12, local6 + 1, local9 + 1);
										break label663;
									}
								} else if (local961.anInt5701 == 64) {
									local978 += Static259.anInt4703;
									local982 -= Static259.anInt4703;
									if (local982 > local978 && local6 < Static547.anInt9363 && local9 > 0) {
										Static535.method7283(arg0, local12, local6 + 1, local9 - 1);
										break label663;
									}
								} else if (local961.anInt5701 == 128) {
									local978 -= Static259.anInt4703;
									local982 -= Static259.anInt4703;
									if (local982 > -local978 && local6 > 0 && local9 > 0) {
										Static535.method7283(arg0, local12, local6 - 1, local9 - 1);
										break label663;
									}
								}
							}
							Static535.method7283(arg0, local12, local6, local9);
						}
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					@Pc(1120) Class60_Sub8 local1120 = local961.method7155(Static276.aClass90_9);
					if (local1120 != null) {
						local1120.aClass15_1 = local961;
						local1120.anInt9790 = local12;
						local1120.anInt9791 = local6;
						local1120.anInt9794 = local9;
						Static260.aClass349_8.method7893(local1120);
					}
				}
				arg1.aByte48 = 0;
			}
		}
		@Pc(1237) int local1237;
		if (arg1.aBoolean303) {
			try {
				arg1.aBoolean303 = false;
				@Pc(1149) int local1149 = 0;
				label606: for (local934 = arg1.aClass315_1; local934 != null; local934 = local934.aClass315_3) {
					@Pc(1156) Class15_Sub2 local1156 = local934.aClass15_Sub2_2;
					if (local1156.anInt8914 != Static171.anInt9038) {
						for (local978 = local1156.aShort116; local978 <= local1156.aShort115; local978++) {
							for (local982 = local1156.aShort114; local982 <= local1156.aShort117; local982++) {
								@Pc(1174) Class133 local1174 = local31[local978][local982];
								if (local1174.aBoolean302) {
									arg1.aBoolean303 = true;
									continue label606;
								}
								if (local1174.aByte48 != 0) {
									local638 = 0;
									if (local978 > local1156.aShort116) {
										local638++;
									}
									if (local978 < local1156.aShort115) {
										local638 += 4;
									}
									if (local982 > local1156.aShort114) {
										local638 += 8;
									}
									if (local982 < local1156.aShort117) {
										local638 += 2;
									}
									if ((local638 & local1174.aByte48) == arg1.aByte45) {
										arg1.aBoolean303 = true;
										continue label606;
									}
								}
							}
						}
						local982 = Static207.anInt3926 - local1156.aShort116;
						local1237 = local1156.aShort115 - Static207.anInt3926;
						if (local1237 > local982) {
							local982 = local1237;
						}
						local638 = Static3.anInt7083 - local1156.aShort114;
						local643 = local1156.aShort117 - Static3.anInt7083;
						if (local643 > local638) {
							local638 = local643;
						}
						arg0.aClass15_Sub2Array3[local1149] = local1156;
						arg0.anIntArray318[local1149++] = local982 + local638;
					}
				}
				while (local1149 > 0) {
					local348 = -50;
					local978 = -1;
					@Pc(1288) Class15_Sub2 local1288;
					for (local982 = 0; local982 < local1149; local982++) {
						local1288 = arg0.aClass15_Sub2Array3[local982];
						if (local1288.anInt8914 != Static171.anInt9038) {
							local638 = arg0.anIntArray318[local982];
							if (local638 > local348) {
								local348 = local638;
								local978 = local982;
							} else if (local638 == local348) {
								local643 = local1288.anInt8911 - Static226.anInt4160;
								local646 = local1288.anInt8913 - Static567.anInt9819;
								local655 = arg0.aClass15_Sub2Array3[local978].anInt8911 - Static226.anInt4160;
								local667 = arg0.aClass15_Sub2Array3[local978].anInt8913 - Static567.anInt9819;
								if (local643 * local643 + local646 * local646 > local655 * local655 + local667 * local667) {
									local978 = local982;
								}
							}
						}
					}
					if (local978 == -1) {
						break;
					}
					local1288 = arg0.aClass15_Sub2Array3[local978];
					local1288.anInt8914 = Static171.anInt9038;
					if (!Static479.method6639(local15, local1288.aShort116, local1288.aShort115, local1288.aShort114, local1288.aShort117, local1288.method7123())) {
						if (Static301.aBoolean384) {
							if (local1288.aByte97 == 0) {
								Static484.method6805(arg0, local12, local1288.aShort116, local1288.aShort114, local1288.aShort115, local1288.aShort117);
							} else {
								Static535.method7283(arg0, local12, local6, local9);
								local638 = local6 - Static207.anInt3926;
								local643 = local9 - Static3.anInt7083;
								if (local1288.aByte97 == 2) {
									if (local643 > -local638) {
										Static276.method4134(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static276.method4134(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local643 > local638) {
									Static276.method4134(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static276.method4134(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
						}
						local556 = local1288.method7155(Static276.aClass90_9);
						if (local556 != null) {
							local556.aClass15_1 = local1288;
							local556.anInt9790 = local12;
							local556.anInt9791 = local1288.aShort116;
							local556.anInt9794 = local1288.aShort114;
							Static260.aClass349_8.method7893(local556);
						}
					}
					for (local638 = local1288.aShort116; local638 <= local1288.aShort115; local638++) {
						for (local643 = local1288.aShort114; local643 <= local1288.aShort117; local643++) {
							@Pc(1513) Class133 local1513 = local31[local638][local643];
							if (local1513.aByte48 != 0) {
								Static221.aClass175_1.method4153(local1513);
							} else if ((local638 != local6 || local643 != local9) && local1513.aBoolean304) {
								Static221.aClass175_1.method4153(local1513);
							}
						}
					}
				}
				if (arg1.aBoolean303) {
					return;
				}
			} catch (@Pc(1551) Exception local1551) {
				arg1.aBoolean303 = false;
			}
		}
		if (arg1.aClass127_1 != null && arg1.aByte44 == (byte) (Static264.anInt4720 & 0xFF)) {
			@Pc(1568) Class127 local1568 = arg1.aClass127_1;
			local346 = Static205.aClass46Array1[local12].JA(local6, local9);
			if (local12 < Static431.anInt7712 - 1) {
				local348 = Static205.aClass46Array1[local12].JA(local6, local9) - Static205.aClass46Array1[local12 + 1].JA(local6, local9);
			} else {
				local348 = 0x8 << Static23.anInt420;
			}
			Static126.aClass93_6.method7796(local21, local346, local27, arg0.anIntArray319);
			local978 = arg0.anIntArray319[2];
			Static126.aClass93_6.method7796(local21, local346 - local348, local27, arg0.anIntArray319);
			local982 = arg0.anIntArray319[2];
			local1237 = local978;
			local638 = local982;
			if (local978 > local982) {
				local1237 = local982;
				local638 = local978;
			}
			local1237 -= Static200.anInt3841;
			local638 += Static200.anInt3841;
			local1568.anInt3801 = local1237;
			local1568.anInt3800 = local638;
			local1568.aBoolean299 = true;
			Static276.aClass90_9.method7511(local1568);
		}
		if (!arg1.aBoolean304) {
			return;
		}
		if (arg1.aByte48 != 0) {
			return;
		}
		if (local6 <= Static207.anInt3926 && local6 > Static538.anInt9252) {
			local68 = local31[local6 - 1][local9];
			if (local68 != null && local68.aBoolean304) {
				return;
			}
		}
		if (local6 >= Static207.anInt3926 && local6 < Static70.anInt1182 - 1) {
			local68 = local31[local6 + 1][local9];
			if (local68 != null && local68.aBoolean304) {
				return;
			}
		}
		if (local9 <= Static3.anInt7083 && local9 > Static203.anInt3852) {
			local68 = local31[local6][local9 - 1];
			if (local68 != null && local68.aBoolean304) {
				return;
			}
		}
		if (local9 >= Static3.anInt7083 && local9 < Static210.anInt3998 - 1) {
			local68 = local31[local6][local9 + 1];
			if (local68 != null && local68.aBoolean304) {
				return;
			}
		}
		arg1.aBoolean304 = false;
		Static324.anInt6153--;
		@Pc(1759) Class15_Sub5 local1759 = arg1.aClass15_Sub5_1;
		if (local1759 != null && local1759.aBoolean450) {
			if (Static301.aBoolean384) {
				Static535.method7283(arg0, local12, local6, local9);
				Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
			}
			@Pc(1782) Class60_Sub8 local1782 = local1759.method7155(Static276.aClass90_9);
			if (local1782 != null) {
				local1782.aClass15_1 = local1759;
				local1782.anInt9790 = local12;
				local1782.anInt9791 = local6;
				local1782.anInt9794 = local9;
				Static260.aClass349_8.method7893(local1782);
			}
		}
		if (arg1.aShort60 != 0) {
			@Pc(1806) Class15_Sub4 local1806 = arg1.aClass15_Sub4_2;
			if (local1806 != null && !Static240.method3740(local15, local6, local9, local1806.method7166())) {
				if ((local1806.anInt9051 & arg1.aShort60) != 0) {
					if (Static301.aBoolean384) {
						Static535.method7283(arg0, local12, local6, local9);
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					local326 = local1806.method7155(Static276.aClass90_9);
					if (local326 != null) {
						local326.aClass15_1 = local1806;
						local326.anInt9790 = local12;
						local326.anInt9791 = local6;
						local326.anInt9794 = local9;
						Static260.aClass349_8.method7893(local326);
					}
				} else if (local1806.anInt9051 == 256) {
					local348 = local1806.anInt9048 - Static226.anInt4160;
					local978 = local1806.anInt9052 - Static567.anInt9819;
					local982 = local1806.anInt9043;
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
					if (Static301.aBoolean384) {
						Static535.method7283(arg0, local12, local6, local9);
						Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
					}
					@Pc(1916) Class15_Sub4 local1916 = arg1.aClass15_Sub4_1;
					@Pc(1924) Class60_Sub8 local1924;
					if (local638 > local1237) {
						local1924 = local1806.method7155(Static276.aClass90_9);
						if (local1924 != null) {
							local1924.aClass15_1 = local1806;
							local1924.anInt9790 = local12;
							local1924.anInt9791 = local6;
							local1924.anInt9794 = local9;
							Static260.aClass349_8.method7893(local1924);
						}
					} else if (local1916 != null) {
						local1924 = local1916.method7155(Static276.aClass90_9);
						if (local1924 != null) {
							local1924.aClass15_1 = local1916;
							local1924.anInt9790 = local12;
							local1924.anInt9791 = local6;
							local1924.anInt9794 = local9;
							Static260.aClass349_8.method7893(local1924);
						}
					}
				}
			}
			local961 = arg1.aClass15_Sub1_2;
			local351 = arg1.aClass15_Sub1_1;
			@Pc(2009) Class60_Sub8 local2009;
			if (local351 != null && (local351.anInt5701 & arg1.aShort60) != 0 && !Static393.method5725(local15, local6, local9, local351.anInt5701)) {
				if (Static301.aBoolean384) {
					Static24.method350(arg0, local351.anInt5701, local12, local6, local9);
					Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
				}
				local2009 = local351.method7155(Static276.aClass90_9);
				if (local2009 != null) {
					local2009.aClass15_1 = local351;
					local2009.anInt9790 = local12;
					local2009.anInt9791 = local6;
					local2009.anInt9794 = local9;
					Static260.aClass349_8.method7893(local2009);
				}
			}
			if (local961 != null && (local961.anInt5701 & arg1.aShort60) != 0 && !Static393.method5725(local15, local6, local9, local961.anInt5701)) {
				if (Static301.aBoolean384) {
					Static24.method350(arg0, local961.anInt5701, local12, local6, local9);
					Static276.aClass90_9.method7448(arg0.anInt3807, arg0.aClass6_Sub25Array4);
				}
				local2009 = local961.method7155(Static276.aClass90_9);
				if (local2009 != null) {
					local2009.aClass15_1 = local961;
					local2009.anInt9790 = local12;
					local2009.anInt9791 = local6;
					local2009.anInt9794 = local9;
					Static260.aClass349_8.method7893(local2009);
				}
			}
		}
		@Pc(2095) Class133 local2095;
		if (local12 < Static431.anInt7712 - 1) {
			local2095 = Static113.aClass133ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2095 != null && local2095.aBoolean304) {
				Static221.aClass175_1.method4162(local2095);
			}
		}
		if (local6 < Static207.anInt3926) {
			local2095 = local31[local6 + 1][local9];
			if (local2095 != null && local2095.aBoolean304) {
				Static221.aClass175_1.method4153(local2095);
			}
		}
		if (local9 < Static3.anInt7083) {
			local2095 = local31[local6][local9 + 1];
			if (local2095 != null && local2095.aBoolean304) {
				Static221.aClass175_1.method4153(local2095);
			}
		}
		if (local6 > Static207.anInt3926) {
			local2095 = local31[local6 - 1][local9];
			if (local2095 != null && local2095.aBoolean304) {
				Static221.aClass175_1.method4153(local2095);
			}
		}
		if (local9 > Static3.anInt7083) {
			local2095 = local31[local6][local9 - 1];
			if (local2095 != null && local2095.aBoolean304) {
				Static221.aClass175_1.method4153(local2095);
			}
		}
	}
}
