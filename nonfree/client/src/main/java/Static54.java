import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
	public static int anInt7604;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
	public static int anInt7605;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
	public static int anInt7603 = 0;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIIIII)V")
	public static void method5866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(15) int local15 = arg0 + arg1;
		for (@Pc(17) int local17 = arg0; local17 < local15; local17++) {
			Static335.method4533(arg4, arg3, arg5, Static162.anIntArrayArray58[local17]);
		}
		@Pc(39) int local39 = arg4 - arg1;
		@Pc(43) int local43 = arg1 + arg5;
		for (@Pc(45) int local45 = arg2; local45 > local10; local45--) {
			Static335.method4533(arg4, arg3, arg5, Static162.anIntArrayArray58[local45]);
		}
		for (@Pc(69) int local69 = local15; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static162.anIntArrayArray58[local69];
			Static335.method4533(local43, arg3, arg5, local75);
			Static335.method4533(arg4, arg3, local39, local75);
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(Z)[Lclient!ob;")
	public static Class170[] method5867() {
		return new Class170[] { Static446.aClass170_4, Static282.aClass170_3, Static11.aClass170_1 };
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)I")
	public static int method5868(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!co;Lclient!dr;)V")
	public static void method5869(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class53 arg1) {
		if (!arg1.aBoolean128) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort39;
		@Pc(9) short local9 = arg1.aShort38;
		@Pc(12) byte local12 = arg1.aByte36;
		@Pc(15) byte local15 = arg1.aByte37;
		@Pc(21) int local21 = (local6 << Static372.anInt7558) + Static40.anInt1024;
		@Pc(27) int local27 = (local9 << Static372.anInt7558) + Static40.anInt1024;
		@Pc(31) Class53[][] local31 = Static40.aClass53ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static117.aClass146Array1 == Static346.aClass146Array2) {
			Static42.aClass30_3.ba(Static422.aClass146Array3[0].va(local21, local27), Static50.method1034(local6, local9), Static134.method1949(local6, local9), Static285.method3975(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static42.aClass30_3.o(3000.0F, local53 * 1.5F);
		@Pc(86) Class53 local86;
		@Pc(616) Class41_Sub6 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class41_Sub6 local377;
		@Pc(408) int local408;
		@Pc(411) Class6_Sub1 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean129) {
			if (Static386.aBoolean447) {
				if (local12 > 0) {
					local86 = Static40.aClass53ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean128) {
						return;
					}
				}
				if (local6 <= Static50.anInt1363 && local6 > Static127.anInt2572) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean128 && (local86.aBoolean129 || (arg1.aByte34 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static50.anInt1363 && local6 < Static59.anInt1569 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean128 && (local86.aBoolean129 || (arg1.aByte34 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static354.anInt6362 && local9 > Static180.anInt3345) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean128 && (local86.aBoolean129 || (arg1.aByte34 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static354.anInt6362 && local9 < Static65.anInt1629 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean128 && (local86.aBoolean129 || (arg1.aByte34 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static386.aBoolean447 = true;
			}
			arg1.aBoolean129 = false;
			if (arg1.aClass53_1 != null) {
				local86 = arg1.aClass53_1;
				Static42.aClass30_3.o(3000.0F, (201.5F - (float) (local86.aByte37 + 1) * 50.0F) * 1.5F);
				if (!Static169.method2493(local86.aByte37, local6, local9)) {
					Static346.aClass146Array2[local86.aByte37].method3603(local6, local9);
				}
				@Pc(249) Class6_Sub1 local249 = local86.aClass6_Sub1_1;
				if (local249 != null) {
					if (Static412.aBoolean474) {
						if ((local249.anInt5379 & arg1.aShort40) == 0) {
							Static386.method5226(arg0, local12, local6, local9);
						} else {
							Static67.method1270(arg0, local249.anInt5379, local15, local6, local9);
						}
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					local249.method5630(Static42.aClass30_3);
				}
				for (@Pc(286) Class165 local286 = local86.aClass165_1; local286 != null; local286 = local286.aClass165_2) {
					@Pc(290) Class6_Sub2 local290 = local286.aClass6_Sub2_2;
					if (local290 != null) {
						if (Static412.aBoolean474) {
							Static386.method5226(arg0, local12, local6, local9);
							Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
						}
						local290.method5630(Static42.aClass30_3);
					}
				}
				Static42.aClass30_3.o(3000.0F, local53 * 1.5F);
			}
			local330 = !Static169.method2493(local15, local6, local9);
			if (local330) {
				Static346.aClass146Array2[local15].method3603(local6, local9);
				@Pc(341) Class6_Sub4 local341 = arg1.aClass6_Sub4_1;
				if (local341 != null && local341.aBoolean301) {
					if (local341.aBoolean302) {
						Static42.aClass30_3.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static412.aBoolean474) {
						Static386.method5226(arg0, local12, local6, local9);
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					local377 = local341.method5630(Static42.aClass30_3);
					if (local377 != null) {
						local377.aClass6_1 = local341;
						local377.anInt5456 = local12;
						local377.anInt5455 = local6;
						local377.anInt5459 = local9;
						Static43.aClass27_2.method725(local377);
					}
					if (local341.aBoolean302) {
						Static42.aClass30_3.o(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass6_Sub1_1;
			@Pc(414) Class6_Sub3 local414 = arg1.aClass6_Sub3_1;
			if (local411 != null || local414 != null) {
				if (Static50.anInt1363 == local6) {
					local406++;
				} else if (Static50.anInt1363 < local6) {
					local406 += 2;
				}
				if (Static354.anInt6362 == local9) {
					local406 += 3;
				} else if (Static354.anInt6362 > local9) {
					local406 += 6;
				}
				local408 = Static350.anIntArray556[local406];
				arg1.aShort40 = Static47.aShortArray12[local406];
			}
			if (local411 != null) {
				if ((local411.anInt5379 & Static5.anIntArray16[local406]) == 0) {
					arg1.aByte40 = 0;
				} else if (local411.anInt5379 == 16) {
					arg1.aByte40 = 3;
					arg1.aByte35 = Static267.aByteArray48[local406];
					arg1.aByte38 = (byte) (3 - arg1.aByte35);
				} else if (local411.anInt5379 == 32) {
					arg1.aByte40 = 6;
					arg1.aByte35 = Static441.aByteArray52[local406];
					arg1.aByte38 = (byte) (6 - arg1.aByte35);
				} else if (local411.anInt5379 == 64) {
					arg1.aByte40 = 12;
					arg1.aByte35 = Static133.aByteArray20[local406];
					arg1.aByte38 = (byte) (12 - arg1.aByte35);
				} else {
					arg1.aByte40 = 9;
					arg1.aByte35 = Static391.aByteArray89[local406];
					arg1.aByte38 = (byte) (9 - arg1.aByte35);
				}
				if ((local411.anInt5379 & local408) != 0 && !Static162.method4948(local15, local6, local9, local411.anInt5379)) {
					if (Static412.aBoolean474) {
						Static386.method5226(arg0, local12, local6, local9);
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					@Pc(563) Class41_Sub6 local563 = local411.method5630(Static42.aClass30_3);
					if (local563 != null) {
						local563.aClass6_1 = local411;
						local563.anInt5456 = local12;
						local563.anInt5455 = local6;
						local563.anInt5459 = local9;
						Static43.aClass27_2.method725(local563);
					}
				}
				@Pc(584) Class6_Sub1 local584 = arg1.aClass6_Sub1_2;
				if (local584 != null && (local584.anInt5379 & local408) != 0 && !Static162.method4948(local15, local6, local9, local584.anInt5379)) {
					if (Static412.aBoolean474) {
						Static386.method5226(arg0, local12, local6, local9);
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					local616 = local584.method5630(Static42.aClass30_3);
					if (local616 != null) {
						local616.aClass6_1 = local584;
						local616.anInt5456 = local12;
						local616.anInt5455 = local6;
						local616.anInt5459 = local9;
						Static43.aClass27_2.method725(local616);
					}
				}
			}
			if (local414 != null && !Static107.method1679(local15, local6, local9, local414.method5641())) {
				@Pc(647) Class6_Sub3 local647 = arg1.aClass6_Sub3_2;
				Static42.aClass30_3.o(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt7303 & local408) != 0) {
					if (Static412.aBoolean474) {
						Static386.method5226(arg0, local12, local6, local9);
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					local616 = local414.method5630(Static42.aClass30_3);
					if (local616 != null) {
						local616.aClass6_1 = local414;
						local616.anInt5456 = local12;
						local616.anInt5455 = local6;
						local616.anInt5459 = local9;
						Static43.aClass27_2.method725(local616);
					}
				} else if (local414.anInt7303 == 256) {
					local706 = local414.anInt7310 - Static284.anInt5181;
					local711 = local414.anInt7309 - Static113.anInt2415;
					local714 = local414.anInt7312;
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
					if (Static412.aBoolean474) {
						Static386.method5226(arg0, local12, local6, local9);
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					@Pc(759) Class41_Sub6 local759;
					if (local735 < local723) {
						local759 = local414.method5630(Static42.aClass30_3);
						if (local759 != null) {
							local759.aClass6_1 = local414;
							local759.anInt5456 = local12;
							local759.anInt5455 = local6;
							local759.anInt5459 = local9;
							Static43.aClass27_2.method725(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5630(Static42.aClass30_3);
						if (local759 != null) {
							local759.aClass6_1 = local647;
							local759.anInt5456 = local12;
							local759.anInt5455 = local6;
							local759.anInt5459 = local9;
							Static43.aClass27_2.method725(local759);
						}
					}
				}
				Static42.aClass30_3.o(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class6_Sub4 local814 = arg1.aClass6_Sub4_1;
				if (local814 != null && !local814.aBoolean301) {
					if (local814.aBoolean302) {
						Static42.aClass30_3.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static412.aBoolean474) {
						Static386.method5226(arg0, local12, local6, local9);
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					local616 = local814.method5630(Static42.aClass30_3);
					if (local616 != null) {
						local616.aClass6_1 = local814;
						local616.anInt5456 = local12;
						local616.anInt5455 = local6;
						local616.anInt5459 = local9;
						Static43.aClass27_2.method725(local616);
					}
					if (local814.aBoolean302) {
						Static42.aClass30_3.o(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class6_Sub5 local880 = arg1.aClass6_Sub5_1;
				if (local880 != null && !local880.aBoolean480) {
					if (Static412.aBoolean474) {
						Static386.method5226(arg0, local12, local6, local9);
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					@Pc(903) Class41_Sub6 local903 = local880.method5630(Static42.aClass30_3);
					if (local903 != null) {
						local903.aClass6_1 = local880;
						local903.anInt5456 = local12;
						local903.anInt5455 = local6;
						local903.anInt5459 = local9;
						Static43.aClass27_2.method725(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte34;
			if (local924 != 0) {
				@Pc(941) Class53 local941;
				if (local6 < Static50.anInt1363 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean128) {
						Static275.aClass16_1.method5251(local941);
					}
				}
				if (local9 < Static354.anInt6362 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean128) {
						Static275.aClass16_1.method5251(local941);
					}
				}
				if (local6 > Static50.anInt1363 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean128) {
						Static275.aClass16_1.method5251(local941);
					}
				}
				if (local9 > Static354.anInt6362 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean128) {
						Static275.aClass16_1.method5251(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class6_Sub1 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class165 local1030;
		if (arg1.aByte40 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass165_1; local1030 != null; local1030 = local1030.aClass165_2) {
				if (local1030.aClass6_Sub2_2.anInt6065 != Static244.anInt4451 && (local1030.anInt4788 & arg1.aByte40) == arg1.aByte35) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass6_Sub1_1;
				if (!Static162.method4948(local15, local6, local9, local1057.anInt5379)) {
					if (Static412.aBoolean474) {
						label682: {
							if (local1057.anInt5379 >= 16) {
								local1074 = local6 - Static50.anInt1363;
								local1078 = local9 - Static354.anInt6362;
								if (local1057.anInt5379 == 16) {
									local1074 -= Static40.anInt1024;
									local1078 += Static40.anInt1024;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static241.anInt4414) {
										Static386.method5226(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5379 == 32) {
									local1074 += Static40.anInt1024;
									local1078 += Static40.anInt1024;
									if (local1078 < -local1074 && local6 < Static301.anInt5434 && local9 < Static241.anInt4414) {
										Static386.method5226(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5379 == 64) {
									local1074 += Static40.anInt1024;
									local1078 -= Static40.anInt1024;
									if (local1078 > local1074 && local6 < Static301.anInt5434 && local9 > 0) {
										Static386.method5226(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt5379 == 128) {
									local1074 -= Static40.anInt1024;
									local1078 -= Static40.anInt1024;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static386.method5226(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static386.method5226(arg0, local12, local6, local9);
						}
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					@Pc(1216) Class41_Sub6 local1216 = local1057.method5630(Static42.aClass30_3);
					if (local1216 != null) {
						local1216.aClass6_1 = local1057;
						local1216.anInt5456 = local12;
						local1216.anInt5455 = local6;
						local1216.anInt5459 = local9;
						Static43.aClass27_2.method725(local1216);
					}
				}
				arg1.aByte40 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean127) {
			try {
				arg1.aBoolean127 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass165_1; local1030 != null; local1030 = local1030.aClass165_2) {
					@Pc(1252) Class6_Sub2 local1252 = local1030.aClass6_Sub2_2;
					if (local1252.anInt6065 != Static244.anInt4451) {
						for (local1074 = local1252.aShort82; local1074 <= local1252.aShort84; local1074++) {
							for (local1078 = local1252.aShort85; local1078 <= local1252.aShort83; local1078++) {
								@Pc(1270) Class53 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean129) {
									arg1.aBoolean127 = true;
									continue label625;
								}
								if (local1270.aByte40 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort82) {
										local706++;
									}
									if (local1074 < local1252.aShort84) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort85) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort83) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte40) == arg1.aByte38) {
										arg1.aBoolean127 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static50.anInt1363 - local1252.aShort82;
						local1333 = local1252.aShort84 - Static50.anInt1363;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static354.anInt6362 - local1252.aShort85;
						local711 = local1252.aShort83 - Static354.anInt6362;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass6_Sub2Array3[local1245] = local1252;
						arg0.anIntArray347[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class6_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass6_Sub2Array3[local1078];
						if (local1384.anInt6065 != Static244.anInt4451) {
							local706 = arg0.anIntArray347[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6062 - Static284.anInt5181;
								local714 = local1384.anInt6061 - Static113.anInt2415;
								local723 = arg0.aClass6_Sub2Array3[local1074].anInt6062 - Static284.anInt5181;
								local735 = arg0.aClass6_Sub2Array3[local1074].anInt6061 - Static113.anInt2415;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass6_Sub2Array3[local1074];
					local1384.anInt6065 = Static244.anInt4451;
					if (!Static36.method659(local15, local1384.aShort82, local1384.aShort84, local1384.aShort85, local1384.aShort83, local1384.method4752())) {
						if (Static412.aBoolean474) {
							if (local1384.aByte85 == 0) {
								Static15.method343(arg0, local12, local1384.aShort82, local1384.aShort85, local1384.aShort84, local1384.aShort83);
							} else {
								Static386.method5226(arg0, local12, local6, local9);
								local706 = local6 - Static50.anInt1363;
								local711 = local9 - Static354.anInt6362;
								if (local1384.aByte85 == 2) {
									if (local711 > -local706) {
										Static60.method1177(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static60.method1177(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static60.method1177(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static60.method1177(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
						}
						local616 = local1384.method5630(Static42.aClass30_3);
						if (local616 != null) {
							local616.aClass6_1 = local1384;
							local616.anInt5456 = local12;
							local616.anInt5455 = local1384.aShort82;
							local616.anInt5459 = local1384.aShort85;
							Static43.aClass27_2.method725(local616);
						}
					}
					for (local706 = local1384.aShort82; local706 <= local1384.aShort84; local706++) {
						for (local711 = local1384.aShort85; local711 <= local1384.aShort83; local711++) {
							@Pc(1609) Class53 local1609 = local31[local706][local711];
							if (local1609.aByte40 != 0) {
								Static275.aClass16_1.method5251(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean128) {
								Static275.aClass16_1.method5251(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean127) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean127 = false;
			}
		}
		if (arg1.aClass256_1 != null && arg1.aByte39 == (byte) (Static17.anInt523 & 0xFF)) {
			@Pc(1664) Class256 local1664 = arg1.aClass256_1;
			local406 = Static346.aClass146Array2[local12].I(local6, local9);
			if (local12 < Static338.anInt5952 - 1) {
				local408 = Static346.aClass146Array2[local12].I(local6, local9) - Static346.aClass146Array2[local12 + 1].I(local6, local9);
			} else {
				local408 = 0x8 << Static372.anInt7558;
			}
			Static398.aClass116_5.method4949(local21, local406, local27, arg0.anIntArray348);
			local1074 = arg0.anIntArray348[2];
			Static398.aClass116_5.method4949(local21, local406 - local408, local27, arg0.anIntArray348);
			local1078 = arg0.anIntArray348[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static295.anInt5323;
			local706 += Static295.anInt5323;
			local1664.anInt7138 = local1333;
			local1664.anInt7137 = local706;
			local1664.aBoolean479 = true;
			Static42.aClass30_3.method4653(local1664);
		}
		if (!arg1.aBoolean128) {
			return;
		}
		if (arg1.aByte40 != 0) {
			return;
		}
		if (local6 <= Static50.anInt1363 && local6 > Static127.anInt2572) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean128) {
				return;
			}
		}
		if (local6 >= Static50.anInt1363 && local6 < Static59.anInt1569 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean128) {
				return;
			}
		}
		if (local9 <= Static354.anInt6362 && local9 > Static180.anInt3345) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean128) {
				return;
			}
		}
		if (local9 >= Static354.anInt6362 && local9 < Static65.anInt1629 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean128) {
				return;
			}
		}
		arg1.aBoolean128 = false;
		Static68.anInt4582--;
		@Pc(1855) Class6_Sub5 local1855 = arg1.aClass6_Sub5_1;
		if (local1855 != null && local1855.aBoolean480) {
			if (Static412.aBoolean474) {
				Static386.method5226(arg0, local12, local6, local9);
				Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
			}
			@Pc(1878) Class41_Sub6 local1878 = local1855.method5630(Static42.aClass30_3);
			if (local1878 != null) {
				local1878.aClass6_1 = local1855;
				local1878.anInt5456 = local12;
				local1878.anInt5455 = local6;
				local1878.anInt5459 = local9;
				Static43.aClass27_2.method725(local1878);
			}
		}
		if (arg1.aShort40 != 0) {
			@Pc(1902) Class6_Sub3 local1902 = arg1.aClass6_Sub3_1;
			if (local1902 != null && !Static107.method1679(local15, local6, local9, local1902.method5641())) {
				if ((local1902.anInt7303 & arg1.aShort40) != 0) {
					if (Static412.aBoolean474) {
						Static386.method5226(arg0, local12, local6, local9);
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					local377 = local1902.method5630(Static42.aClass30_3);
					if (local377 != null) {
						local377.aClass6_1 = local1902;
						local377.anInt5456 = local12;
						local377.anInt5455 = local6;
						local377.anInt5459 = local9;
						Static43.aClass27_2.method725(local377);
					}
				} else if (local1902.anInt7303 == 256) {
					local408 = local1902.anInt7310 - Static284.anInt5181;
					local1074 = local1902.anInt7309 - Static113.anInt2415;
					local1078 = local1902.anInt7312;
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
					if (Static412.aBoolean474) {
						Static386.method5226(arg0, local12, local6, local9);
						Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
					}
					@Pc(2012) Class6_Sub3 local2012 = arg1.aClass6_Sub3_2;
					@Pc(2020) Class41_Sub6 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5630(Static42.aClass30_3);
						if (local2020 != null) {
							local2020.aClass6_1 = local1902;
							local2020.anInt5456 = local12;
							local2020.anInt5455 = local6;
							local2020.anInt5459 = local9;
							Static43.aClass27_2.method725(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5630(Static42.aClass30_3);
						if (local2020 != null) {
							local2020.aClass6_1 = local2012;
							local2020.anInt5456 = local12;
							local2020.anInt5455 = local6;
							local2020.anInt5459 = local9;
							Static43.aClass27_2.method725(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass6_Sub1_1;
			local411 = arg1.aClass6_Sub1_2;
			@Pc(2105) Class41_Sub6 local2105;
			if (local411 != null && (local411.anInt5379 & arg1.aShort40) != 0 && !Static162.method4948(local15, local6, local9, local411.anInt5379)) {
				if (Static412.aBoolean474) {
					Static67.method1270(arg0, local411.anInt5379, local12, local6, local9);
					Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
				}
				local2105 = local411.method5630(Static42.aClass30_3);
				if (local2105 != null) {
					local2105.aClass6_1 = local411;
					local2105.anInt5456 = local12;
					local2105.anInt5455 = local6;
					local2105.anInt5459 = local9;
					Static43.aClass27_2.method725(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt5379 & arg1.aShort40) != 0 && !Static162.method4948(local15, local6, local9, local1057.anInt5379)) {
				if (Static412.aBoolean474) {
					Static67.method1270(arg0, local1057.anInt5379, local12, local6, local9);
					Static42.aClass30_3.method4706(arg0.anInt4351, arg0.aClass4_Sub8Array3);
				}
				local2105 = local1057.method5630(Static42.aClass30_3);
				if (local2105 != null) {
					local2105.aClass6_1 = local1057;
					local2105.anInt5456 = local12;
					local2105.anInt5455 = local6;
					local2105.anInt5459 = local9;
					Static43.aClass27_2.method725(local2105);
				}
			}
		}
		@Pc(2191) Class53 local2191;
		if (local12 < Static338.anInt5952 - 1) {
			local2191 = Static40.aClass53ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean128) {
				Static275.aClass16_1.method5253(local2191);
			}
		}
		if (local6 < Static50.anInt1363) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean128) {
				Static275.aClass16_1.method5251(local2191);
			}
		}
		if (local9 < Static354.anInt6362) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean128) {
				Static275.aClass16_1.method5251(local2191);
			}
		}
		if (local6 > Static50.anInt1363) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean128) {
				Static275.aClass16_1.method5251(local2191);
			}
		}
		if (local9 > Static354.anInt6362) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean128) {
				Static275.aClass16_1.method5251(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method5870(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static387.anInt6720;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class199 local22 = Static85.aClass157_1.method3422(arg0[local13]);
			if (local22.anInt5819 != -1) {
				@Pc(34) Class3 local34 = (Class3) Static103.aClass69_22.method1591((long) local22.anInt5819);
				if (local34 == null) {
					@Pc(42) Class205 local42 = Static464.method4782(Static149.aClass166_105, local22.anInt5819, 0);
					if (local42 != null) {
						local34 = Static16.aClass30_11.method4656(local42);
						Static103.aClass69_22.method1590((long) local22.anInt5819, local34);
					}
				}
				if (local34 != null) {
					Static208.aClass3Array9[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
