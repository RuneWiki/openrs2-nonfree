import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!un", name = "z", descriptor = "[I")
	public static int[] anIntArray606;

	@OriginalMember(owner = "client!un", name = "s", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_25 = new Class91(1, 3);

	@OriginalMember(owner = "client!un", name = "x", descriptor = "J")
	public static long aLong191 = -1L;

	@OriginalMember(owner = "client!un", name = "A", descriptor = "I")
	public static int anInt7936 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IBJI)V")
	public static void method6644(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg1 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg1 >> 20 & 0x3;
		@Pc(26) int local26 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local12 != 10 && local12 != 11 && local12 != 22) {
			Static318.method5088(true, local12, 0, 0, 0, arg2, arg0, local19);
			return;
		}
		@Pc(53) Class129 local53 = Static505.aClass206_4.method5326(local26);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (local19 == 0 || local19 == 2) {
			local61 = local53.anInt3650;
			local64 = local53.anInt3653;
		} else {
			local61 = local53.anInt3653;
			local64 = local53.anInt3650;
		}
		@Pc(75) int local75 = local53.lb;
		if (local19 != 0) {
			local75 = (local75 << local19 & 0xF) + (local75 >> 4 - local19);
		}
		Static318.method5088(true, 0, local64, local61, local75, arg2, arg0, 0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!haa;Lclient!sk;)V")
	public static void method6645(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class262 arg1) {
		if (!arg1.aBoolean592) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort130;
		@Pc(9) short local9 = arg1.aShort131;
		@Pc(12) byte local12 = arg1.aByte98;
		@Pc(15) byte local15 = arg1.aByte96;
		@Pc(21) int local21 = (local6 << Static175.anInt3259) + Static392.anInt7455;
		@Pc(27) int local27 = (local9 << Static175.anInt3259) + Static392.anInt7455;
		@Pc(31) Class262[][] local31 = Static399.aClass262ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static427.aClass75Array2 == Static532.aClass75Array3) {
			Static452.aClass39_10.JA(Static164.aClass75Array1[0].aa(local21, local27), Static80.method1578(local6, local9), Static255.method4000(local6, local9), Static414.method7248(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static452.aClass39_10.la(3000.0F, local53 * 1.5F);
		@Pc(86) Class262 local86;
		@Pc(616) Class6_Sub5 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class6_Sub5 local377;
		@Pc(408) int local408;
		@Pc(411) Class1_Sub2 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean590) {
			if (Static20.aBoolean30) {
				if (local12 > 0) {
					local86 = Static399.aClass262ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean592) {
						return;
					}
				}
				if (local6 <= Static364.anInt6864 && local6 > Static75.anInt1567) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean592 && (local86.aBoolean590 || (arg1.aByte99 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static364.anInt6864 && local6 < Static466.anInt8396 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean592 && (local86.aBoolean590 || (arg1.aByte99 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static113.anInt2306 && local9 > Static469.anInt8451) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean592 && (local86.aBoolean590 || (arg1.aByte99 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static113.anInt2306 && local9 < Static392.anInt7448 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean592 && (local86.aBoolean590 || (arg1.aByte99 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static20.aBoolean30 = true;
			}
			arg1.aBoolean590 = false;
			if (arg1.aClass262_1 != null) {
				local86 = arg1.aClass262_1;
				Static452.aClass39_10.la(3000.0F, (201.5F - (float) (local86.aByte96 + 1) * 50.0F) * 1.5F);
				if (!Static266.method4294(local86.aByte96, local6, local9)) {
					Static532.aClass75Array3[local86.aByte96].method6699(local6, local9);
				}
				@Pc(249) Class1_Sub2 local249 = local86.aClass1_Sub2_3;
				if (local249 != null) {
					if (Static101.aBoolean612) {
						if ((local249.anInt6984 & arg1.aShort132) == 0) {
							Static477.method7124(arg0, local12, local6, local9);
						} else {
							Static91.method1703(arg0, local249.anInt6984, local15, local6, local9);
						}
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					local249.method7680(Static452.aClass39_10);
				}
				for (@Pc(286) Class187 local286 = local86.aClass187_3; local286 != null; local286 = local286.aClass187_1) {
					@Pc(290) Class1_Sub1 local290 = local286.aClass1_Sub1_1;
					if (local290 != null) {
						if (Static101.aBoolean612) {
							Static477.method7124(arg0, local12, local6, local9);
							Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
						}
						local290.method7680(Static452.aClass39_10);
					}
				}
				Static452.aClass39_10.la(3000.0F, local53 * 1.5F);
			}
			local330 = !Static266.method4294(local15, local6, local9);
			if (local330) {
				Static532.aClass75Array3[local15].method6699(local6, local9);
				@Pc(341) Class1_Sub4 local341 = arg1.aClass1_Sub4_1;
				if (local341 != null && local341.aBoolean667) {
					if (local341.aBoolean668) {
						Static452.aClass39_10.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static101.aBoolean612) {
						Static477.method7124(arg0, local12, local6, local9);
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					local377 = local341.method7680(Static452.aClass39_10);
					if (local377 != null) {
						local377.aClass1_1 = local341;
						local377.anInt4918 = local12;
						local377.anInt4921 = local6;
						local377.anInt4920 = local9;
						Static64.aClass107_1.method2830(local377);
					}
					if (local341.aBoolean668) {
						Static452.aClass39_10.la(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass1_Sub2_3;
			@Pc(414) Class1_Sub3 local414 = arg1.aClass1_Sub3_2;
			if (local411 != null || local414 != null) {
				if (Static364.anInt6864 == local6) {
					local406++;
				} else if (Static364.anInt6864 < local6) {
					local406 += 2;
				}
				if (Static113.anInt2306 == local9) {
					local406 += 3;
				} else if (Static113.anInt2306 > local9) {
					local406 += 6;
				}
				local408 = Static441.anIntArray612[local406];
				arg1.aShort132 = Static215.aShortArray106[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6984 & Static342.anIntArray505[local406]) == 0) {
					arg1.aByte95 = 0;
				} else if (local411.anInt6984 == 16) {
					arg1.aByte95 = 3;
					arg1.aByte93 = Static185.aByteArray70[local406];
					arg1.aByte94 = (byte) (3 - arg1.aByte93);
				} else if (local411.anInt6984 == 32) {
					arg1.aByte95 = 6;
					arg1.aByte93 = Static461.aByteArray108[local406];
					arg1.aByte94 = (byte) (6 - arg1.aByte93);
				} else if (local411.anInt6984 == 64) {
					arg1.aByte95 = 12;
					arg1.aByte93 = Static492.aByteArray112[local406];
					arg1.aByte94 = (byte) (12 - arg1.aByte93);
				} else {
					arg1.aByte95 = 9;
					arg1.aByte93 = Static266.aByteArray86[local406];
					arg1.aByte94 = (byte) (9 - arg1.aByte93);
				}
				if ((local411.anInt6984 & local408) != 0 && !Static455.method6958(local15, local6, local9, local411.anInt6984)) {
					if (Static101.aBoolean612) {
						Static477.method7124(arg0, local12, local6, local9);
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					@Pc(563) Class6_Sub5 local563 = local411.method7680(Static452.aClass39_10);
					if (local563 != null) {
						local563.aClass1_1 = local411;
						local563.anInt4918 = local12;
						local563.anInt4921 = local6;
						local563.anInt4920 = local9;
						Static64.aClass107_1.method2830(local563);
					}
				}
				@Pc(584) Class1_Sub2 local584 = arg1.aClass1_Sub2_2;
				if (local584 != null && (local584.anInt6984 & local408) != 0 && !Static455.method6958(local15, local6, local9, local584.anInt6984)) {
					if (Static101.aBoolean612) {
						Static477.method7124(arg0, local12, local6, local9);
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					local616 = local584.method7680(Static452.aClass39_10);
					if (local616 != null) {
						local616.aClass1_1 = local584;
						local616.anInt4918 = local12;
						local616.anInt4921 = local6;
						local616.anInt4920 = local9;
						Static64.aClass107_1.method2830(local616);
					}
				}
			}
			if (local414 != null && !Static255.method4003(local15, local6, local9, local414.method2595())) {
				@Pc(647) Class1_Sub3 local647 = arg1.aClass1_Sub3_3;
				Static452.aClass39_10.la(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt2740 & local408) != 0) {
					if (Static101.aBoolean612) {
						Static477.method7124(arg0, local12, local6, local9);
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					local616 = local414.method7680(Static452.aClass39_10);
					if (local616 != null) {
						local616.aClass1_1 = local414;
						local616.anInt4918 = local12;
						local616.anInt4921 = local6;
						local616.anInt4920 = local9;
						Static64.aClass107_1.method2830(local616);
					}
				} else if (local414.anInt2740 == 256) {
					local706 = local414.anInt2743 - Static2.anInt66;
					local711 = local414.anInt2737 - Static412.anInt7685;
					local714 = local414.anInt2741;
					if (local714 == 1 || local714 == 2) {
						local723 = -local706;
					} else {
						local723 = local706;
					}
					if (local714 == 2 || local714 == 3) {
						local735 = -local711;
					} else {
						local735 = local711;
					}
					if (Static101.aBoolean612) {
						Static477.method7124(arg0, local12, local6, local9);
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					@Pc(759) Class6_Sub5 local759;
					if (local735 < local723) {
						local759 = local414.method7680(Static452.aClass39_10);
						if (local759 != null) {
							local759.aClass1_1 = local414;
							local759.anInt4918 = local12;
							local759.anInt4921 = local6;
							local759.anInt4920 = local9;
							Static64.aClass107_1.method2830(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method7680(Static452.aClass39_10);
						if (local759 != null) {
							local759.aClass1_1 = local647;
							local759.anInt4918 = local12;
							local759.anInt4921 = local6;
							local759.anInt4920 = local9;
							Static64.aClass107_1.method2830(local759);
						}
					}
				}
				Static452.aClass39_10.la(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class1_Sub4 local814 = arg1.aClass1_Sub4_1;
				if (local814 != null && !local814.aBoolean667) {
					if (local814.aBoolean668) {
						Static452.aClass39_10.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static101.aBoolean612) {
						Static477.method7124(arg0, local12, local6, local9);
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					local616 = local814.method7680(Static452.aClass39_10);
					if (local616 != null) {
						local616.aClass1_1 = local814;
						local616.anInt4918 = local12;
						local616.anInt4921 = local6;
						local616.anInt4920 = local9;
						Static64.aClass107_1.method2830(local616);
					}
					if (local814.aBoolean668) {
						Static452.aClass39_10.la(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class1_Sub5 local880 = arg1.aClass1_Sub5_1;
				if (local880 != null && !local880.aBoolean586) {
					if (Static101.aBoolean612) {
						Static477.method7124(arg0, local12, local6, local9);
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					@Pc(903) Class6_Sub5 local903 = local880.method7680(Static452.aClass39_10);
					if (local903 != null) {
						local903.aClass1_1 = local880;
						local903.anInt4918 = local12;
						local903.anInt4921 = local6;
						local903.anInt4920 = local9;
						Static64.aClass107_1.method2830(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte99;
			if (local924 != 0) {
				@Pc(941) Class262 local941;
				if (local6 < Static364.anInt6864 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean592) {
						Static41.aClass137_1.method6551(local941);
					}
				}
				if (local9 < Static113.anInt2306 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean592) {
						Static41.aClass137_1.method6551(local941);
					}
				}
				if (local6 > Static364.anInt6864 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean592) {
						Static41.aClass137_1.method6551(local941);
					}
				}
				if (local9 > Static113.anInt2306 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean592) {
						Static41.aClass137_1.method6551(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class1_Sub2 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class187 local1030;
		if (arg1.aByte95 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass187_3; local1030 != null; local1030 = local1030.aClass187_1) {
				if (local1030.aClass1_Sub1_1.anInt7661 != Static230.anInt4157 && (local1030.anInt5462 & arg1.aByte95) == arg1.aByte93) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass1_Sub2_3;
				if (!Static455.method6958(local15, local6, local9, local1057.anInt6984)) {
					if (Static101.aBoolean612) {
						label682: {
							if (local1057.anInt6984 >= 16) {
								local1074 = local6 - Static364.anInt6864;
								local1078 = local9 - Static113.anInt2306;
								if (local1057.anInt6984 == 16) {
									local1074 -= Static392.anInt7455;
									local1078 += Static392.anInt7455;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static315.anInt5693) {
										Static477.method7124(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6984 == 32) {
									local1074 += Static392.anInt7455;
									local1078 += Static392.anInt7455;
									if (local1078 < -local1074 && local6 < Static515.anInt3809 && local9 < Static315.anInt5693) {
										Static477.method7124(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6984 == 64) {
									local1074 += Static392.anInt7455;
									local1078 -= Static392.anInt7455;
									if (local1078 > local1074 && local6 < Static515.anInt3809 && local9 > 0) {
										Static477.method7124(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt6984 == 128) {
									local1074 -= Static392.anInt7455;
									local1078 -= Static392.anInt7455;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static477.method7124(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static477.method7124(arg0, local12, local6, local9);
						}
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					@Pc(1216) Class6_Sub5 local1216 = local1057.method7680(Static452.aClass39_10);
					if (local1216 != null) {
						local1216.aClass1_1 = local1057;
						local1216.anInt4918 = local12;
						local1216.anInt4921 = local6;
						local1216.anInt4920 = local9;
						Static64.aClass107_1.method2830(local1216);
					}
				}
				arg1.aByte95 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean591) {
			try {
				arg1.aBoolean591 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass187_3; local1030 != null; local1030 = local1030.aClass187_1) {
					@Pc(1252) Class1_Sub1 local1252 = local1030.aClass1_Sub1_1;
					if (local1252.anInt7661 != Static230.anInt4157) {
						for (local1074 = local1252.aShort127; local1074 <= local1252.aShort125; local1074++) {
							for (local1078 = local1252.aShort128; local1078 <= local1252.aShort126; local1078++) {
								@Pc(1270) Class262 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean590) {
									arg1.aBoolean591 = true;
									continue label625;
								}
								if (local1270.aByte95 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort127) {
										local706++;
									}
									if (local1074 < local1252.aShort125) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort128) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort126) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte95) == arg1.aByte94) {
										arg1.aBoolean591 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static364.anInt6864 - local1252.aShort127;
						local1333 = local1252.aShort125 - Static364.anInt6864;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static113.anInt2306 - local1252.aShort128;
						local711 = local1252.aShort126 - Static113.anInt2306;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass1_Sub1Array4[local1245] = local1252;
						arg0.anIntArray507[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class1_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass1_Sub1Array4[local1078];
						if (local1384.anInt7661 != Static230.anInt4157) {
							local706 = arg0.anIntArray507[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7660 - Static2.anInt66;
								local714 = local1384.anInt7659 - Static412.anInt7685;
								local723 = arg0.aClass1_Sub1Array4[local1074].anInt7660 - Static2.anInt66;
								local735 = arg0.aClass1_Sub1Array4[local1074].anInt7659 - Static412.anInt7685;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass1_Sub1Array4[local1074];
					local1384.anInt7661 = Static230.anInt4157;
					if (!Static130.method7765(local15, local1384.aShort127, local1384.aShort125, local1384.aShort128, local1384.aShort126, local1384.method6432())) {
						if (Static101.aBoolean612) {
							if (local1384.aByte91 == 0) {
								Static484.method7206(arg0, local12, local1384.aShort127, local1384.aShort128, local1384.aShort125, local1384.aShort126);
							} else {
								Static477.method7124(arg0, local12, local6, local9);
								local706 = local6 - Static364.anInt6864;
								local711 = local9 - Static113.anInt2306;
								if (local1384.aByte91 == 2) {
									if (local711 > -local706) {
										Static172.method5412(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static172.method5412(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static172.method5412(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static172.method5412(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
						}
						local616 = local1384.method7680(Static452.aClass39_10);
						if (local616 != null) {
							local616.aClass1_1 = local1384;
							local616.anInt4918 = local12;
							local616.anInt4921 = local1384.aShort127;
							local616.anInt4920 = local1384.aShort128;
							Static64.aClass107_1.method2830(local616);
						}
					}
					for (local706 = local1384.aShort127; local706 <= local1384.aShort125; local706++) {
						for (local711 = local1384.aShort128; local711 <= local1384.aShort126; local711++) {
							@Pc(1609) Class262 local1609 = local31[local706][local711];
							if (local1609.aByte95 != 0) {
								Static41.aClass137_1.method6551(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean592) {
								Static41.aClass137_1.method6551(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean591) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean591 = false;
			}
		}
		if (arg1.aClass208_2 != null && arg1.aByte97 == (byte) (Static169.anInt3088 & 0xFF)) {
			@Pc(1664) Class208 local1664 = arg1.aClass208_2;
			local406 = Static532.aClass75Array3[local12].ba(local6, local9);
			if (local12 < Static323.anInt6015 - 1) {
				local408 = Static532.aClass75Array3[local12].ba(local6, local9) - Static532.aClass75Array3[local12 + 1].ba(local6, local9);
			} else {
				local408 = 0x8 << Static175.anInt3259;
			}
			Static88.aClass181_7.method5997(local21, local406, local27, arg0.anIntArray508);
			local1074 = arg0.anIntArray508[2];
			Static88.aClass181_7.method5997(local21, local406 - local408, local27, arg0.anIntArray508);
			local1078 = arg0.anIntArray508[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static297.anInt5466;
			local706 += Static297.anInt5466;
			local1664.anInt6256 = local1333;
			local1664.anInt6255 = local706;
			local1664.aBoolean470 = true;
			Static452.aClass39_10.method6019(local1664);
		}
		if (!arg1.aBoolean592) {
			return;
		}
		if (arg1.aByte95 != 0) {
			return;
		}
		if (local6 <= Static364.anInt6864 && local6 > Static75.anInt1567) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean592) {
				return;
			}
		}
		if (local6 >= Static364.anInt6864 && local6 < Static466.anInt8396 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean592) {
				return;
			}
		}
		if (local9 <= Static113.anInt2306 && local9 > Static469.anInt8451) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean592) {
				return;
			}
		}
		if (local9 >= Static113.anInt2306 && local9 < Static392.anInt7448 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean592) {
				return;
			}
		}
		arg1.aBoolean592 = false;
		Static248.anInt4540--;
		@Pc(1855) Class1_Sub5 local1855 = arg1.aClass1_Sub5_1;
		if (local1855 != null && local1855.aBoolean586) {
			if (Static101.aBoolean612) {
				Static477.method7124(arg0, local12, local6, local9);
				Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
			}
			@Pc(1878) Class6_Sub5 local1878 = local1855.method7680(Static452.aClass39_10);
			if (local1878 != null) {
				local1878.aClass1_1 = local1855;
				local1878.anInt4918 = local12;
				local1878.anInt4921 = local6;
				local1878.anInt4920 = local9;
				Static64.aClass107_1.method2830(local1878);
			}
		}
		if (arg1.aShort132 != 0) {
			@Pc(1902) Class1_Sub3 local1902 = arg1.aClass1_Sub3_2;
			if (local1902 != null && !Static255.method4003(local15, local6, local9, local1902.method2595())) {
				if ((local1902.anInt2740 & arg1.aShort132) != 0) {
					if (Static101.aBoolean612) {
						Static477.method7124(arg0, local12, local6, local9);
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					local377 = local1902.method7680(Static452.aClass39_10);
					if (local377 != null) {
						local377.aClass1_1 = local1902;
						local377.anInt4918 = local12;
						local377.anInt4921 = local6;
						local377.anInt4920 = local9;
						Static64.aClass107_1.method2830(local377);
					}
				} else if (local1902.anInt2740 == 256) {
					local408 = local1902.anInt2743 - Static2.anInt66;
					local1074 = local1902.anInt2737 - Static412.anInt7685;
					local1078 = local1902.anInt2741;
					if (local1078 == 1 || local1078 == 2) {
						local1333 = -local408;
					} else {
						local1333 = local408;
					}
					if (local1078 == 2 || local1078 == 3) {
						local706 = -local1074;
					} else {
						local706 = local1074;
					}
					if (Static101.aBoolean612) {
						Static477.method7124(arg0, local12, local6, local9);
						Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
					}
					@Pc(2012) Class1_Sub3 local2012 = arg1.aClass1_Sub3_3;
					@Pc(2020) Class6_Sub5 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method7680(Static452.aClass39_10);
						if (local2020 != null) {
							local2020.aClass1_1 = local1902;
							local2020.anInt4918 = local12;
							local2020.anInt4921 = local6;
							local2020.anInt4920 = local9;
							Static64.aClass107_1.method2830(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method7680(Static452.aClass39_10);
						if (local2020 != null) {
							local2020.aClass1_1 = local2012;
							local2020.anInt4918 = local12;
							local2020.anInt4921 = local6;
							local2020.anInt4920 = local9;
							Static64.aClass107_1.method2830(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass1_Sub2_3;
			local411 = arg1.aClass1_Sub2_2;
			@Pc(2105) Class6_Sub5 local2105;
			if (local411 != null && (local411.anInt6984 & arg1.aShort132) != 0 && !Static455.method6958(local15, local6, local9, local411.anInt6984)) {
				if (Static101.aBoolean612) {
					Static91.method1703(arg0, local411.anInt6984, local12, local6, local9);
					Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
				}
				local2105 = local411.method7680(Static452.aClass39_10);
				if (local2105 != null) {
					local2105.aClass1_1 = local411;
					local2105.anInt4918 = local12;
					local2105.anInt4921 = local6;
					local2105.anInt4920 = local9;
					Static64.aClass107_1.method2830(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt6984 & arg1.aShort132) != 0 && !Static455.method6958(local15, local6, local9, local1057.anInt6984)) {
				if (Static101.aBoolean612) {
					Static91.method1703(arg0, local1057.anInt6984, local12, local6, local9);
					Static452.aClass39_10.method6063(arg0.anInt6354, arg0.aClass2_Sub5Array4);
				}
				local2105 = local1057.method7680(Static452.aClass39_10);
				if (local2105 != null) {
					local2105.aClass1_1 = local1057;
					local2105.anInt4918 = local12;
					local2105.anInt4921 = local6;
					local2105.anInt4920 = local9;
					Static64.aClass107_1.method2830(local2105);
				}
			}
		}
		@Pc(2191) Class262 local2191;
		if (local12 < Static323.anInt6015 - 1) {
			local2191 = Static399.aClass262ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean592) {
				Static41.aClass137_1.method6546(local2191);
			}
		}
		if (local6 < Static364.anInt6864) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean592) {
				Static41.aClass137_1.method6551(local2191);
			}
		}
		if (local9 < Static113.anInt2306) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean592) {
				Static41.aClass137_1.method6551(local2191);
			}
		}
		if (local6 > Static364.anInt6864) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean592) {
				Static41.aClass137_1.method6551(local2191);
			}
		}
		if (local9 > Static113.anInt2306) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean592) {
				Static41.aClass137_1.method6551(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6646(@OriginalArg(1) String arg0) {
		if (!Static21.aBoolean31) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(20) int local20 = Static16.anInt362;
		@Pc(22) int[] local22 = Static325.anIntArray473;
		for (@Pc(24) int local24 = 0; local24 < local20; local24++) {
			@Pc(32) Class1_Sub1_Sub2_Sub1 local32 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local22[local24]];
			if (local32 != null && Static266.aClass1_Sub1_Sub2_Sub1_1 != local32 && local32.aString83 != null && local32.aString83.equalsIgnoreCase(arg0)) {
				Static93.method1721(Static395.aClass243_75);
				Static381.aClass2_Sub29_Sub2_2.method5217(Static357.anInt6796);
				Static381.aClass2_Sub29_Sub2_2.method5204(Static116.anInt2332);
				Static381.aClass2_Sub29_Sub2_2.method5186(Static55.anInt970);
				Static381.aClass2_Sub29_Sub2_2.method5172(0);
				Static381.aClass2_Sub29_Sub2_2.method5188(local22[local24]);
				local10 = true;
				Static318.method5088(true, -2, local32.method4394(), local32.method4394(), 0, local32.anIntArray449[0], local32.anIntArray450[0], 0);
				break;
			}
		}
		if (!local10) {
			Static215.method6797(Static104.aClass202_63.method5139(Static172.anInt6352) + arg0);
		}
		if (Static21.aBoolean31) {
			Static465.method7011();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method6648(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static93.method1721(Static180.aClass243_42);
		Static381.aClass2_Sub29_Sub2_2.method5172(Static332.method5299(arg0) + 1);
		Static381.aClass2_Sub29_Sub2_2.method5191(arg1);
		Static381.aClass2_Sub29_Sub2_2.method5189(arg0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
	public static boolean method6649(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}
}
