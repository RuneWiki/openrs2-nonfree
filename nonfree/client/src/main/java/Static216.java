import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!bm;")
	public static Class28 aClass28_14;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Lclient!mn;")
	public static final Class163 aClass163_38 = new Class163(16);

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_22 = new Class214(5, 7);

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public static int anInt6006 = 20;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_139 = new Class209(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!ma;ILclient!l;IILclient!em;)V")
	public static void method4816(@OriginalArg(0) int arg0, @OriginalArg(2) Class73 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class17 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class68 arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static159.anInt3195 == 4) {
			local16 = (int) Static202.aFloat62 & 0x3FFF;
		} else {
			local16 = (int) Static202.aFloat62 + Static166.anInt3321 & 0x3FFF;
		}
		@Pc(38) int local38 = Math.max(arg6.anInt2188 / 2, arg6.anInt2252 / 2) + 10;
		@Pc(47) int local47 = arg0 * arg0 + arg4 * arg4;
		if (local38 * local38 < local47) {
			return;
		}
		@Pc(61) int local61 = Class162.anIntArray388[local16];
		@Pc(70) int local70 = Class162.anIntArray387[local16];
		if (Static159.anInt3195 != 4) {
			local70 = local70 * 256 / (Static261.anInt4889 + 256);
			local61 = local61 * 256 / (Static261.anInt4889 + 256);
		}
		@Pc(99) int local99 = local61 * arg4 + arg0 * local70 >> 15;
		@Pc(110) int local110 = local70 * arg4 - local61 * arg0 >> 15;
		arg3.method5773(arg2 + arg6.anInt2188 / 2 + local99 - arg3.j() / 2, -local110 + arg6.anInt2252 / 2 + arg5 + -(arg3.T() / 2), arg1, arg2, arg5);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!eo;Lclient!hg;)V")
	public static void method4818(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class106 arg1) {
		if (!arg1.aBoolean236) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort34;
		@Pc(9) short local9 = arg1.aShort36;
		@Pc(12) byte local12 = arg1.aByte45;
		@Pc(15) byte local15 = arg1.aByte43;
		@Pc(21) int local21 = (local6 << Static307.anInt5425) + Static414.anInt6898;
		@Pc(27) int local27 = (local9 << Static307.anInt5425) + Static414.anInt6898;
		@Pc(31) Class106[][] local31 = Static440.aClass106ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static440.aClass64Array3 == Static58.aClass64Array1) {
			Static332.aClass49_10.GA(Static263.aClass64Array2[0].a(local21, local27), Static322.method4519(local6, local9), Static423.method5846(local6, local9), Static370.method5036(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static332.aClass49_10.g(3000.0F, local53 * 1.5F);
		@Pc(86) Class106 local86;
		@Pc(616) Class8_Sub5 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class8_Sub5 local377;
		@Pc(408) int local408;
		@Pc(411) Class3_Sub5 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean237) {
			if (Static91.aBoolean161) {
				if (local12 > 0) {
					local86 = Static440.aClass106ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean236) {
						return;
					}
				}
				if (local6 <= Static312.anInt5514 && local6 > Static154.anInt3163) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean236 && (local86.aBoolean237 || (arg1.aByte42 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static312.anInt5514 && local6 < Static234.anInt4528 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean236 && (local86.aBoolean237 || (arg1.aByte42 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static402.anInt6690 && local9 > Static316.anInt5472) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean236 && (local86.aBoolean237 || (arg1.aByte42 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static402.anInt6690 && local9 < Static248.anInt4698 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean236 && (local86.aBoolean237 || (arg1.aByte42 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static91.aBoolean161 = true;
			}
			arg1.aBoolean237 = false;
			if (arg1.aClass106_1 != null) {
				local86 = arg1.aClass106_1;
				Static332.aClass49_10.g(3000.0F, (201.5F - (float) (local86.aByte43 + 1) * 50.0F) * 1.5F);
				if (!Static387.method5127(local86.aByte43, local6, local9)) {
					Static58.aClass64Array1[local86.aByte43].method2354(local6, local9);
				}
				@Pc(249) Class3_Sub5 local249 = local86.aClass3_Sub5_1;
				if (local249 != null) {
					if (Static58.aBoolean79) {
						if ((local249.anInt6517 & arg1.aShort35) == 0) {
							Static132.method2251(arg0, local12, local6, local9);
						} else {
							Static151.method2525(arg0, local249.anInt6517, local15, local6, local9);
						}
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					local249.method5141(Static332.aClass49_10);
				}
				for (@Pc(286) Class4 local286 = local86.aClass4_3; local286 != null; local286 = local286.aClass4_1) {
					@Pc(290) Class3_Sub2 local290 = local286.aClass3_Sub2_1;
					if (local290 != null) {
						if (Static58.aBoolean79) {
							Static132.method2251(arg0, local12, local6, local9);
							Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
						}
						local290.method5141(Static332.aClass49_10);
					}
				}
				Static332.aClass49_10.g(3000.0F, local53 * 1.5F);
			}
			local330 = !Static387.method5127(local15, local6, local9);
			if (local330) {
				Static58.aClass64Array1[local15].method2354(local6, local9);
				@Pc(341) Class3_Sub1 local341 = arg1.aClass3_Sub1_2;
				if (local341 != null && local341.aBoolean319) {
					if (local341.aBoolean318) {
						Static332.aClass49_10.g(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static58.aBoolean79) {
						Static132.method2251(arg0, local12, local6, local9);
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					local377 = local341.method5141(Static332.aClass49_10);
					if (local377 != null) {
						local377.aClass3_1 = local341;
						local377.anInt4583 = local12;
						local377.anInt4585 = local6;
						local377.anInt4587 = local9;
						Static222.aClass112_8.method2546(local377);
					}
					if (local341.aBoolean318) {
						Static332.aClass49_10.g(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass3_Sub5_1;
			@Pc(414) Class3_Sub3 local414 = arg1.aClass3_Sub3_1;
			if (local411 != null || local414 != null) {
				if (Static312.anInt5514 == local6) {
					local406++;
				} else if (Static312.anInt5514 < local6) {
					local406 += 2;
				}
				if (Static402.anInt6690 == local9) {
					local406 += 3;
				} else if (Static402.anInt6690 > local9) {
					local406 += 6;
				}
				local408 = Static246.anIntArray389[local406];
				arg1.aShort35 = Static388.aShortArray111[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6517 & Static22.anIntArray47[local406]) == 0) {
					arg1.aByte47 = 0;
				} else if (local411.anInt6517 == 16) {
					arg1.aByte47 = 3;
					arg1.aByte46 = Static208.aByteArray78[local406];
					arg1.aByte44 = (byte) (3 - arg1.aByte46);
				} else if (local411.anInt6517 == 32) {
					arg1.aByte47 = 6;
					arg1.aByte46 = Static1.aByteArray21[local406];
					arg1.aByte44 = (byte) (6 - arg1.aByte46);
				} else if (local411.anInt6517 == 64) {
					arg1.aByte47 = 12;
					arg1.aByte46 = Static253.aByteArray97[local406];
					arg1.aByte44 = (byte) (12 - arg1.aByte46);
				} else {
					arg1.aByte47 = 9;
					arg1.aByte46 = Static48.aByteArray24[local406];
					arg1.aByte44 = (byte) (9 - arg1.aByte46);
				}
				if ((local411.anInt6517 & local408) != 0 && !Static304.method4330(local15, local6, local9, local411.anInt6517)) {
					if (Static58.aBoolean79) {
						Static132.method2251(arg0, local12, local6, local9);
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					@Pc(563) Class8_Sub5 local563 = local411.method5141(Static332.aClass49_10);
					if (local563 != null) {
						local563.aClass3_1 = local411;
						local563.anInt4583 = local12;
						local563.anInt4585 = local6;
						local563.anInt4587 = local9;
						Static222.aClass112_8.method2546(local563);
					}
				}
				@Pc(584) Class3_Sub5 local584 = arg1.aClass3_Sub5_2;
				if (local584 != null && (local584.anInt6517 & local408) != 0 && !Static304.method4330(local15, local6, local9, local584.anInt6517)) {
					if (Static58.aBoolean79) {
						Static132.method2251(arg0, local12, local6, local9);
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					local616 = local584.method5141(Static332.aClass49_10);
					if (local616 != null) {
						local616.aClass3_1 = local584;
						local616.anInt4583 = local12;
						local616.anInt4585 = local6;
						local616.anInt4587 = local9;
						Static222.aClass112_8.method2546(local616);
					}
				}
			}
			if (local414 != null && !Static322.method4528(local15, local6, local9, local414.method3426())) {
				@Pc(647) Class3_Sub3 local647 = arg1.aClass3_Sub3_2;
				Static332.aClass49_10.g(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt4214 & local408) != 0) {
					if (Static58.aBoolean79) {
						Static132.method2251(arg0, local12, local6, local9);
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					local616 = local414.method5141(Static332.aClass49_10);
					if (local616 != null) {
						local616.aClass3_1 = local414;
						local616.anInt4583 = local12;
						local616.anInt4585 = local6;
						local616.anInt4587 = local9;
						Static222.aClass112_8.method2546(local616);
					}
				} else if (local414.anInt4214 == 256) {
					local706 = local414.anInt4202 - Static123.anInt2736;
					local711 = local414.anInt4204 - Static201.anInt3541;
					local714 = local414.anInt4213;
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
					if (Static58.aBoolean79) {
						Static132.method2251(arg0, local12, local6, local9);
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					@Pc(759) Class8_Sub5 local759;
					if (local735 < local723) {
						local759 = local414.method5141(Static332.aClass49_10);
						if (local759 != null) {
							local759.aClass3_1 = local414;
							local759.anInt4583 = local12;
							local759.anInt4585 = local6;
							local759.anInt4587 = local9;
							Static222.aClass112_8.method2546(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5141(Static332.aClass49_10);
						if (local759 != null) {
							local759.aClass3_1 = local647;
							local759.anInt4583 = local12;
							local759.anInt4585 = local6;
							local759.anInt4587 = local9;
							Static222.aClass112_8.method2546(local759);
						}
					}
				}
				Static332.aClass49_10.g(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class3_Sub1 local814 = arg1.aClass3_Sub1_2;
				if (local814 != null && !local814.aBoolean319) {
					if (local814.aBoolean318) {
						Static332.aClass49_10.g(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static58.aBoolean79) {
						Static132.method2251(arg0, local12, local6, local9);
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					local616 = local814.method5141(Static332.aClass49_10);
					if (local616 != null) {
						local616.aClass3_1 = local814;
						local616.anInt4583 = local12;
						local616.anInt4585 = local6;
						local616.anInt4587 = local9;
						Static222.aClass112_8.method2546(local616);
					}
					if (local814.aBoolean318) {
						Static332.aClass49_10.g(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class3_Sub4 local880 = arg1.aClass3_Sub4_1;
				if (local880 != null && !local880.aBoolean313) {
					if (Static58.aBoolean79) {
						Static132.method2251(arg0, local12, local6, local9);
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					@Pc(903) Class8_Sub5 local903 = local880.method5141(Static332.aClass49_10);
					if (local903 != null) {
						local903.aClass3_1 = local880;
						local903.anInt4583 = local12;
						local903.anInt4585 = local6;
						local903.anInt4587 = local9;
						Static222.aClass112_8.method2546(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte42;
			if (local924 != 0) {
				@Pc(941) Class106 local941;
				if (local6 < Static312.anInt5514 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean236) {
						Static260.aClass37_1.method5281(local941);
					}
				}
				if (local9 < Static402.anInt6690 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean236) {
						Static260.aClass37_1.method5281(local941);
					}
				}
				if (local6 > Static312.anInt5514 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean236) {
						Static260.aClass37_1.method5281(local941);
					}
				}
				if (local9 > Static402.anInt6690 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean236) {
						Static260.aClass37_1.method5281(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class3_Sub5 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class4 local1030;
		if (arg1.aByte47 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass4_3; local1030 != null; local1030 = local1030.aClass4_1) {
				if (local1030.aClass3_Sub2_1.anInt6123 != Static318.anInt6744 && (local1030.anInt123 & arg1.aByte47) == arg1.aByte46) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass3_Sub5_1;
				if (!Static304.method4330(local15, local6, local9, local1057.anInt6517)) {
					if (Static58.aBoolean79) {
						label682: {
							if (local1057.anInt6517 >= 16) {
								local1074 = local6 - Static312.anInt5514;
								local1078 = local9 - Static402.anInt6690;
								if (local1057.anInt6517 == 16) {
									local1074 -= Static414.anInt6898;
									local1078 += Static414.anInt6898;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static386.anInt6463) {
										Static132.method2251(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6517 == 32) {
									local1074 += Static414.anInt6898;
									local1078 += Static414.anInt6898;
									if (local1078 < -local1074 && local6 < Static42.anInt4340 && local9 < Static386.anInt6463) {
										Static132.method2251(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6517 == 64) {
									local1074 += Static414.anInt6898;
									local1078 -= Static414.anInt6898;
									if (local1078 > local1074 && local6 < Static42.anInt4340 && local9 > 0) {
										Static132.method2251(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt6517 == 128) {
									local1074 -= Static414.anInt6898;
									local1078 -= Static414.anInt6898;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static132.method2251(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static132.method2251(arg0, local12, local6, local9);
						}
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					@Pc(1216) Class8_Sub5 local1216 = local1057.method5141(Static332.aClass49_10);
					if (local1216 != null) {
						local1216.aClass3_1 = local1057;
						local1216.anInt4583 = local12;
						local1216.anInt4585 = local6;
						local1216.anInt4587 = local9;
						Static222.aClass112_8.method2546(local1216);
					}
				}
				arg1.aByte47 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean235) {
			try {
				arg1.aBoolean235 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass4_3; local1030 != null; local1030 = local1030.aClass4_1) {
					@Pc(1252) Class3_Sub2 local1252 = local1030.aClass3_Sub2_1;
					if (local1252.anInt6123 != Static318.anInt6744) {
						for (local1074 = local1252.aShort85; local1074 <= local1252.aShort87; local1074++) {
							for (local1078 = local1252.aShort86; local1078 <= local1252.aShort88; local1078++) {
								@Pc(1270) Class106 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean237) {
									arg1.aBoolean235 = true;
									continue label625;
								}
								if (local1270.aByte47 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort85) {
										local706++;
									}
									if (local1074 < local1252.aShort87) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort86) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort88) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte47) == arg1.aByte44) {
										arg1.aBoolean235 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static312.anInt5514 - local1252.aShort85;
						local1333 = local1252.aShort87 - Static312.anInt5514;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static402.anInt6690 - local1252.aShort86;
						local711 = local1252.aShort88 - Static402.anInt6690;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass3_Sub2Array3[local1245] = local1252;
						arg0.anIntArray274[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class3_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass3_Sub2Array3[local1078];
						if (local1384.anInt6123 != Static318.anInt6744) {
							local706 = arg0.anIntArray274[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6119 - Static123.anInt2736;
								local714 = local1384.anInt6121 - Static201.anInt3541;
								local723 = arg0.aClass3_Sub2Array3[local1074].anInt6119 - Static123.anInt2736;
								local735 = arg0.aClass3_Sub2Array3[local1074].anInt6121 - Static201.anInt3541;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass3_Sub2Array3[local1074];
					local1384.anInt6123 = Static318.anInt6744;
					if (!Static300.method4294(local15, local1384.aShort85, local1384.aShort87, local1384.aShort86, local1384.aShort88, local1384.method4916())) {
						if (Static58.aBoolean79) {
							if (local1384.aByte88 == 0) {
								Static126.method2187(arg0, local12, local1384.aShort85, local1384.aShort86, local1384.aShort87, local1384.aShort88);
							} else {
								Static132.method2251(arg0, local12, local6, local9);
								local706 = local6 - Static312.anInt5514;
								local711 = local9 - Static402.anInt6690;
								if (local1384.aByte88 == 2) {
									if (local711 > -local706) {
										Static36.method596(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static36.method596(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static36.method596(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static36.method596(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
						}
						local616 = local1384.method5141(Static332.aClass49_10);
						if (local616 != null) {
							local616.aClass3_1 = local1384;
							local616.anInt4583 = local12;
							local616.anInt4585 = local1384.aShort85;
							local616.anInt4587 = local1384.aShort86;
							Static222.aClass112_8.method2546(local616);
						}
					}
					for (local706 = local1384.aShort85; local706 <= local1384.aShort87; local706++) {
						for (local711 = local1384.aShort86; local711 <= local1384.aShort88; local711++) {
							@Pc(1609) Class106 local1609 = local31[local706][local711];
							if (local1609.aByte47 != 0) {
								Static260.aClass37_1.method5281(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean236) {
								Static260.aClass37_1.method5281(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean235) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean235 = false;
			}
		}
		if (arg1.aClass194_2 != null && arg1.aByte48 == (byte) (Static354.anInt6012 & 0xFF)) {
			@Pc(1664) Class194 local1664 = arg1.aClass194_2;
			local406 = Static58.aClass64Array1[local12].l(local6, local9);
			if (local12 < Static254.anInt4782 - 1) {
				local408 = Static58.aClass64Array1[local12].l(local6, local9) - Static58.aClass64Array1[local12 + 1].l(local6, local9);
			} else {
				local408 = 0x8 << Static307.anInt5425;
			}
			Static284.aClass35_5.method5047(local21, local406, local27, arg0.anIntArray275);
			local1074 = arg0.anIntArray275[2];
			Static284.aClass35_5.method5047(local21, local406 - local408, local27, arg0.anIntArray275);
			local1078 = arg0.anIntArray275[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static164.anInt3278;
			local706 += Static164.anInt3278;
			local1664.anInt5429 = local1333;
			local1664.anInt5428 = local706;
			local1664.aBoolean391 = true;
			Static332.aClass49_10.method4471(local1664);
		}
		if (!arg1.aBoolean236) {
			return;
		}
		if (arg1.aByte47 != 0) {
			return;
		}
		if (local6 <= Static312.anInt5514 && local6 > Static154.anInt3163) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean236) {
				return;
			}
		}
		if (local6 >= Static312.anInt5514 && local6 < Static234.anInt4528 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean236) {
				return;
			}
		}
		if (local9 <= Static402.anInt6690 && local9 > Static316.anInt5472) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean236) {
				return;
			}
		}
		if (local9 >= Static402.anInt6690 && local9 < Static248.anInt4698 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean236) {
				return;
			}
		}
		arg1.aBoolean236 = false;
		Static441.anInt301--;
		@Pc(1855) Class3_Sub4 local1855 = arg1.aClass3_Sub4_1;
		if (local1855 != null && local1855.aBoolean313) {
			if (Static58.aBoolean79) {
				Static132.method2251(arg0, local12, local6, local9);
				Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
			}
			@Pc(1878) Class8_Sub5 local1878 = local1855.method5141(Static332.aClass49_10);
			if (local1878 != null) {
				local1878.aClass3_1 = local1855;
				local1878.anInt4583 = local12;
				local1878.anInt4585 = local6;
				local1878.anInt4587 = local9;
				Static222.aClass112_8.method2546(local1878);
			}
		}
		if (arg1.aShort35 != 0) {
			@Pc(1902) Class3_Sub3 local1902 = arg1.aClass3_Sub3_1;
			if (local1902 != null && !Static322.method4528(local15, local6, local9, local1902.method3426())) {
				if ((local1902.anInt4214 & arg1.aShort35) != 0) {
					if (Static58.aBoolean79) {
						Static132.method2251(arg0, local12, local6, local9);
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					local377 = local1902.method5141(Static332.aClass49_10);
					if (local377 != null) {
						local377.aClass3_1 = local1902;
						local377.anInt4583 = local12;
						local377.anInt4585 = local6;
						local377.anInt4587 = local9;
						Static222.aClass112_8.method2546(local377);
					}
				} else if (local1902.anInt4214 == 256) {
					local408 = local1902.anInt4202 - Static123.anInt2736;
					local1074 = local1902.anInt4204 - Static201.anInt3541;
					local1078 = local1902.anInt4213;
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
					if (Static58.aBoolean79) {
						Static132.method2251(arg0, local12, local6, local9);
						Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
					}
					@Pc(2012) Class3_Sub3 local2012 = arg1.aClass3_Sub3_2;
					@Pc(2020) Class8_Sub5 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5141(Static332.aClass49_10);
						if (local2020 != null) {
							local2020.aClass3_1 = local1902;
							local2020.anInt4583 = local12;
							local2020.anInt4585 = local6;
							local2020.anInt4587 = local9;
							Static222.aClass112_8.method2546(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5141(Static332.aClass49_10);
						if (local2020 != null) {
							local2020.aClass3_1 = local2012;
							local2020.anInt4583 = local12;
							local2020.anInt4585 = local6;
							local2020.anInt4587 = local9;
							Static222.aClass112_8.method2546(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass3_Sub5_1;
			local411 = arg1.aClass3_Sub5_2;
			@Pc(2105) Class8_Sub5 local2105;
			if (local411 != null && (local411.anInt6517 & arg1.aShort35) != 0 && !Static304.method4330(local15, local6, local9, local411.anInt6517)) {
				if (Static58.aBoolean79) {
					Static151.method2525(arg0, local411.anInt6517, local12, local6, local9);
					Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
				}
				local2105 = local411.method5141(Static332.aClass49_10);
				if (local2105 != null) {
					local2105.aClass3_1 = local411;
					local2105.anInt4583 = local12;
					local2105.anInt4585 = local6;
					local2105.anInt4587 = local9;
					Static222.aClass112_8.method2546(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt6517 & arg1.aShort35) != 0 && !Static304.method4330(local15, local6, local9, local1057.anInt6517)) {
				if (Static58.aBoolean79) {
					Static151.method2525(arg0, local1057.anInt6517, local12, local6, local9);
					Static332.aClass49_10.method4428(arg0.anInt3075, arg0.aClass2_Sub20Array3);
				}
				local2105 = local1057.method5141(Static332.aClass49_10);
				if (local2105 != null) {
					local2105.aClass3_1 = local1057;
					local2105.anInt4583 = local12;
					local2105.anInt4585 = local6;
					local2105.anInt4587 = local9;
					Static222.aClass112_8.method2546(local2105);
				}
			}
		}
		@Pc(2191) Class106 local2191;
		if (local12 < Static254.anInt4782 - 1) {
			local2191 = Static440.aClass106ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean236) {
				Static260.aClass37_1.method5284(local2191);
			}
		}
		if (local6 < Static312.anInt5514) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean236) {
				Static260.aClass37_1.method5281(local2191);
			}
		}
		if (local9 < Static402.anInt6690) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean236) {
				Static260.aClass37_1.method5281(local2191);
			}
		}
		if (local6 > Static312.anInt5514) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean236) {
				Static260.aClass37_1.method5281(local2191);
			}
		}
		if (local9 > Static402.anInt6690) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean236) {
				Static260.aClass37_1.method5281(local2191);
			}
		}
	}
}
