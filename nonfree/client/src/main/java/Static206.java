import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!oc;")
	public static Class176 aClass176_1;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_5 = new Class240("", 12);

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)[Lclient!ea;")
	public static Class60[] method2748() {
		return new Class60[] { Static232.aClass60_2, Static303.aClass60_3, Static381.aClass60_4 };
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!mb;Lclient!wr;)V")
	public static void method2750(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class270 arg1) {
		if (!arg1.aBoolean529) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort106;
		@Pc(9) short local9 = arg1.aShort105;
		@Pc(12) byte local12 = arg1.aByte102;
		@Pc(15) byte local15 = arg1.aByte105;
		@Pc(21) int local21 = (local6 << Static460.anInt7074) + Static179.anInt3078;
		@Pc(27) int local27 = (local9 << Static460.anInt7074) + Static179.anInt3078;
		@Pc(31) Class270[][] local31 = Static309.aClass270ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static109.aClass162Array1 == Static345.aClass162Array3) {
			Static307.aClass163_7.a(Static314.aClass162Array2[0].ca(local21, local27), Static196.method2644(local6, local9), Static2.method8(local6, local9), Static270.method3647(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static307.aClass163_7.da(3000.0F, local53 * 1.5F);
		@Pc(86) Class270 local86;
		@Pc(616) Class21_Sub6 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class21_Sub6 local377;
		@Pc(408) int local408;
		@Pc(411) Class3_Sub2 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean528) {
			if (Static204.aBoolean208) {
				if (local12 > 0) {
					local86 = Static309.aClass270ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean529) {
						return;
					}
				}
				if (local6 <= Static352.anInt5986 && local6 > Static267.anInt4409) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean529 && (local86.aBoolean528 || (arg1.aByte100 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static352.anInt5986 && local6 < Static232.anInt3747 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean529 && (local86.aBoolean528 || (arg1.aByte100 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static411.anInt6740 && local9 > Static92.anInt1788) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean529 && (local86.aBoolean528 || (arg1.aByte100 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static411.anInt6740 && local9 < Static231.anInt3738 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean529 && (local86.aBoolean528 || (arg1.aByte100 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static204.aBoolean208 = true;
			}
			arg1.aBoolean528 = false;
			if (arg1.aClass270_1 != null) {
				local86 = arg1.aClass270_1;
				Static307.aClass163_7.da(3000.0F, (201.5F - (float) (local86.aByte105 + 1) * 50.0F) * 1.5F);
				if (!Static135.method1996(local86.aByte105, local6, local9)) {
					Static345.aClass162Array3[local86.aByte105].method3271(local6, local9);
				}
				@Pc(249) Class3_Sub2 local249 = local86.aClass3_Sub2_3;
				if (local249 != null) {
					if (Static348.aBoolean433) {
						if ((local249.anInt6427 & arg1.aShort107) == 0) {
							Static151.method2184(arg0, local12, local6, local9);
						} else {
							Static403.method5084(arg0, local249.anInt6427, local15, local6, local9);
						}
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					local249.method5280(Static307.aClass163_7);
				}
				for (@Pc(286) Class241 local286 = local86.aClass241_2; local286 != null; local286 = local286.aClass241_1) {
					@Pc(290) Class3_Sub4 local290 = local286.aClass3_Sub4_2;
					if (local290 != null) {
						if (Static348.aBoolean433) {
							Static151.method2184(arg0, local12, local6, local9);
							Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
						}
						local290.method5280(Static307.aClass163_7);
					}
				}
				Static307.aClass163_7.da(3000.0F, local53 * 1.5F);
			}
			local330 = !Static135.method1996(local15, local6, local9);
			if (local330) {
				Static345.aClass162Array3[local15].method3271(local6, local9);
				@Pc(341) Class3_Sub5 local341 = arg1.aClass3_Sub5_2;
				if (local341 != null && local341.aBoolean467) {
					if (local341.aBoolean466) {
						Static307.aClass163_7.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static348.aBoolean433) {
						Static151.method2184(arg0, local12, local6, local9);
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					local377 = local341.method5280(Static307.aClass163_7);
					if (local377 != null) {
						local377.aClass3_1 = local341;
						local377.anInt5552 = local12;
						local377.anInt5556 = local6;
						local377.anInt5558 = local9;
						Static212.aClass93_3.method2079(local377);
					}
					if (local341.aBoolean466) {
						Static307.aClass163_7.da(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass3_Sub2_3;
			@Pc(414) Class3_Sub3 local414 = arg1.aClass3_Sub3_2;
			if (local411 != null || local414 != null) {
				if (Static352.anInt5986 == local6) {
					local406++;
				} else if (Static352.anInt5986 < local6) {
					local406 += 2;
				}
				if (Static411.anInt6740 == local9) {
					local406 += 3;
				} else if (Static411.anInt6740 > local9) {
					local406 += 6;
				}
				local408 = Static183.anIntArray246[local406];
				arg1.aShort107 = Static424.aShortArray93[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6427 & Static60.anIntArray99[local406]) == 0) {
					arg1.aByte99 = 0;
				} else if (local411.anInt6427 == 16) {
					arg1.aByte99 = 3;
					arg1.aByte101 = Static117.aByteArray15[local406];
					arg1.aByte103 = (byte) (3 - arg1.aByte101);
				} else if (local411.anInt6427 == 32) {
					arg1.aByte99 = 6;
					arg1.aByte101 = Static71.aByteArray8[local406];
					arg1.aByte103 = (byte) (6 - arg1.aByte101);
				} else if (local411.anInt6427 == 64) {
					arg1.aByte99 = 12;
					arg1.aByte101 = Static104.aByteArray13[local406];
					arg1.aByte103 = (byte) (12 - arg1.aByte101);
				} else {
					arg1.aByte99 = 9;
					arg1.aByte101 = Static402.aByteArray81[local406];
					arg1.aByte103 = (byte) (9 - arg1.aByte101);
				}
				if ((local411.anInt6427 & local408) != 0 && !Static294.method788(local15, local6, local9, local411.anInt6427)) {
					if (Static348.aBoolean433) {
						Static151.method2184(arg0, local12, local6, local9);
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					@Pc(563) Class21_Sub6 local563 = local411.method5280(Static307.aClass163_7);
					if (local563 != null) {
						local563.aClass3_1 = local411;
						local563.anInt5552 = local12;
						local563.anInt5556 = local6;
						local563.anInt5558 = local9;
						Static212.aClass93_3.method2079(local563);
					}
				}
				@Pc(584) Class3_Sub2 local584 = arg1.aClass3_Sub2_2;
				if (local584 != null && (local584.anInt6427 & local408) != 0 && !Static294.method788(local15, local6, local9, local584.anInt6427)) {
					if (Static348.aBoolean433) {
						Static151.method2184(arg0, local12, local6, local9);
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					local616 = local584.method5280(Static307.aClass163_7);
					if (local616 != null) {
						local616.aClass3_1 = local584;
						local616.anInt5552 = local12;
						local616.anInt5556 = local6;
						local616.anInt5558 = local9;
						Static212.aClass93_3.method2079(local616);
					}
				}
			}
			if (local414 != null && !Static168.method2367(local15, local6, local9, local414.method5020())) {
				@Pc(647) Class3_Sub3 local647 = arg1.aClass3_Sub3_3;
				Static307.aClass163_7.da(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6457 & local408) != 0) {
					if (Static348.aBoolean433) {
						Static151.method2184(arg0, local12, local6, local9);
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					local616 = local414.method5280(Static307.aClass163_7);
					if (local616 != null) {
						local616.aClass3_1 = local414;
						local616.anInt5552 = local12;
						local616.anInt5556 = local6;
						local616.anInt5558 = local9;
						Static212.aClass93_3.method2079(local616);
					}
				} else if (local414.anInt6457 == 256) {
					local706 = local414.anInt6454 - Static375.anInt6251;
					local711 = local414.anInt6458 - Static422.anInt6875;
					local714 = local414.anInt6464;
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
					if (Static348.aBoolean433) {
						Static151.method2184(arg0, local12, local6, local9);
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					@Pc(759) Class21_Sub6 local759;
					if (local735 < local723) {
						local759 = local414.method5280(Static307.aClass163_7);
						if (local759 != null) {
							local759.aClass3_1 = local414;
							local759.anInt5552 = local12;
							local759.anInt5556 = local6;
							local759.anInt5558 = local9;
							Static212.aClass93_3.method2079(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5280(Static307.aClass163_7);
						if (local759 != null) {
							local759.aClass3_1 = local647;
							local759.anInt5552 = local12;
							local759.anInt5556 = local6;
							local759.anInt5558 = local9;
							Static212.aClass93_3.method2079(local759);
						}
					}
				}
				Static307.aClass163_7.da(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class3_Sub5 local814 = arg1.aClass3_Sub5_2;
				if (local814 != null && !local814.aBoolean467) {
					if (local814.aBoolean466) {
						Static307.aClass163_7.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static348.aBoolean433) {
						Static151.method2184(arg0, local12, local6, local9);
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					local616 = local814.method5280(Static307.aClass163_7);
					if (local616 != null) {
						local616.aClass3_1 = local814;
						local616.anInt5552 = local12;
						local616.anInt5556 = local6;
						local616.anInt5558 = local9;
						Static212.aClass93_3.method2079(local616);
					}
					if (local814.aBoolean466) {
						Static307.aClass163_7.da(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class3_Sub1 local880 = arg1.aClass3_Sub1_1;
				if (local880 != null && !local880.aBoolean8) {
					if (Static348.aBoolean433) {
						Static151.method2184(arg0, local12, local6, local9);
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					@Pc(903) Class21_Sub6 local903 = local880.method5280(Static307.aClass163_7);
					if (local903 != null) {
						local903.aClass3_1 = local880;
						local903.anInt5552 = local12;
						local903.anInt5556 = local6;
						local903.anInt5558 = local9;
						Static212.aClass93_3.method2079(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte100;
			if (local924 != 0) {
				@Pc(941) Class270 local941;
				if (local6 < Static352.anInt5986 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean529) {
						Static460.aClass45_4.method5053(local941);
					}
				}
				if (local9 < Static411.anInt6740 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean529) {
						Static460.aClass45_4.method5053(local941);
					}
				}
				if (local6 > Static352.anInt5986 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean529) {
						Static460.aClass45_4.method5053(local941);
					}
				}
				if (local9 > Static411.anInt6740 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean529) {
						Static460.aClass45_4.method5053(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class3_Sub2 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class241 local1030;
		if (arg1.aByte99 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass241_2; local1030 != null; local1030 = local1030.aClass241_1) {
				if (local1030.aClass3_Sub4_2.anInt6829 != Static201.anInt3382 && (local1030.anInt6554 & arg1.aByte99) == arg1.aByte101) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass3_Sub2_3;
				if (!Static294.method788(local15, local6, local9, local1057.anInt6427)) {
					if (Static348.aBoolean433) {
						label682: {
							if (local1057.anInt6427 >= 16) {
								local1074 = local6 - Static352.anInt5986;
								local1078 = local9 - Static411.anInt6740;
								if (local1057.anInt6427 == 16) {
									local1074 -= Static179.anInt3078;
									local1078 += Static179.anInt3078;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static316.anInt5459) {
										Static151.method2184(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6427 == 32) {
									local1074 += Static179.anInt3078;
									local1078 += Static179.anInt3078;
									if (local1078 < -local1074 && local6 < Static169.anInt2876 && local9 < Static316.anInt5459) {
										Static151.method2184(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6427 == 64) {
									local1074 += Static179.anInt3078;
									local1078 -= Static179.anInt3078;
									if (local1078 > local1074 && local6 < Static169.anInt2876 && local9 > 0) {
										Static151.method2184(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt6427 == 128) {
									local1074 -= Static179.anInt3078;
									local1078 -= Static179.anInt3078;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static151.method2184(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static151.method2184(arg0, local12, local6, local9);
						}
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					@Pc(1216) Class21_Sub6 local1216 = local1057.method5280(Static307.aClass163_7);
					if (local1216 != null) {
						local1216.aClass3_1 = local1057;
						local1216.anInt5552 = local12;
						local1216.anInt5556 = local6;
						local1216.anInt5558 = local9;
						Static212.aClass93_3.method2079(local1216);
					}
				}
				arg1.aByte99 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean527) {
			try {
				arg1.aBoolean527 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass241_2; local1030 != null; local1030 = local1030.aClass241_1) {
					@Pc(1252) Class3_Sub4 local1252 = local1030.aClass3_Sub4_2;
					if (local1252.anInt6829 != Static201.anInt3382) {
						for (local1074 = local1252.aShort92; local1074 <= local1252.aShort91; local1074++) {
							for (local1078 = local1252.aShort89; local1078 <= local1252.aShort90; local1078++) {
								@Pc(1270) Class270 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean528) {
									arg1.aBoolean527 = true;
									continue label625;
								}
								if (local1270.aByte99 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort92) {
										local706++;
									}
									if (local1074 < local1252.aShort91) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort89) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort90) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte99) == arg1.aByte103) {
										arg1.aBoolean527 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static352.anInt5986 - local1252.aShort92;
						local1333 = local1252.aShort91 - Static352.anInt5986;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static411.anInt6740 - local1252.aShort89;
						local711 = local1252.aShort90 - Static411.anInt6740;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass3_Sub4Array2[local1245] = local1252;
						arg0.anIntArray57[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class3_Sub4 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass3_Sub4Array2[local1078];
						if (local1384.anInt6829 != Static201.anInt3382) {
							local706 = arg0.anIntArray57[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6833 - Static375.anInt6251;
								local714 = local1384.anInt6835 - Static422.anInt6875;
								local723 = arg0.aClass3_Sub4Array2[local1074].anInt6833 - Static375.anInt6251;
								local735 = arg0.aClass3_Sub4Array2[local1074].anInt6835 - Static422.anInt6875;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass3_Sub4Array2[local1074];
					local1384.anInt6829 = Static201.anInt3382;
					if (!Static207.method2676(local15, local1384.aShort92, local1384.aShort91, local1384.aShort89, local1384.aShort90, local1384.method5286())) {
						if (Static348.aBoolean433) {
							if (local1384.aByte92 == 0) {
								Static243.method472(arg0, local12, local1384.aShort92, local1384.aShort89, local1384.aShort91, local1384.aShort90);
							} else {
								Static151.method2184(arg0, local12, local6, local9);
								local706 = local6 - Static352.anInt5986;
								local711 = local9 - Static411.anInt6740;
								if (local1384.aByte92 == 2) {
									if (local711 > -local706) {
										Static359.method4737(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static359.method4737(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static359.method4737(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static359.method4737(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
						}
						local616 = local1384.method5280(Static307.aClass163_7);
						if (local616 != null) {
							local616.aClass3_1 = local1384;
							local616.anInt5552 = local12;
							local616.anInt5556 = local1384.aShort92;
							local616.anInt5558 = local1384.aShort89;
							Static212.aClass93_3.method2079(local616);
						}
					}
					for (local706 = local1384.aShort92; local706 <= local1384.aShort91; local706++) {
						for (local711 = local1384.aShort89; local711 <= local1384.aShort90; local711++) {
							@Pc(1609) Class270 local1609 = local31[local706][local711];
							if (local1609.aByte99 != 0) {
								Static460.aClass45_4.method5053(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean529) {
								Static460.aClass45_4.method5053(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean527) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean527 = false;
			}
		}
		if (arg1.aClass256_2 != null && arg1.aByte104 == (byte) (Static132.anInt2386 & 0xFF)) {
			@Pc(1664) Class256 local1664 = arg1.aClass256_2;
			local406 = Static345.aClass162Array3[local12].ua(local6, local9);
			if (local12 < Static289.anInt4757 - 1) {
				local408 = Static345.aClass162Array3[local12].ua(local6, local9) - Static345.aClass162Array3[local12 + 1].ua(local6, local9);
			} else {
				local408 = 0x8 << Static460.anInt7074;
			}
			Static40.aClass31_1.method4798(local21, local406, local27, arg0.anIntArray56);
			local1074 = arg0.anIntArray56[2];
			Static40.aClass31_1.method4798(local21, local406 - local408, local27, arg0.anIntArray56);
			local1078 = arg0.anIntArray56[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static86.anInt6940;
			local706 += Static86.anInt6940;
			local1664.anInt6933 = local1333;
			local1664.anInt6936 = local706;
			local1664.aBoolean502 = true;
			Static307.aClass163_7.method5503(local1664);
		}
		if (!arg1.aBoolean529) {
			return;
		}
		if (arg1.aByte99 != 0) {
			return;
		}
		if (local6 <= Static352.anInt5986 && local6 > Static267.anInt4409) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean529) {
				return;
			}
		}
		if (local6 >= Static352.anInt5986 && local6 < Static232.anInt3747 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean529) {
				return;
			}
		}
		if (local9 <= Static411.anInt6740 && local9 > Static92.anInt1788) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean529) {
				return;
			}
		}
		if (local9 >= Static411.anInt6740 && local9 < Static231.anInt3738 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean529) {
				return;
			}
		}
		arg1.aBoolean529 = false;
		Static4.anInt64--;
		@Pc(1855) Class3_Sub1 local1855 = arg1.aClass3_Sub1_1;
		if (local1855 != null && local1855.aBoolean8) {
			if (Static348.aBoolean433) {
				Static151.method2184(arg0, local12, local6, local9);
				Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
			}
			@Pc(1878) Class21_Sub6 local1878 = local1855.method5280(Static307.aClass163_7);
			if (local1878 != null) {
				local1878.aClass3_1 = local1855;
				local1878.anInt5552 = local12;
				local1878.anInt5556 = local6;
				local1878.anInt5558 = local9;
				Static212.aClass93_3.method2079(local1878);
			}
		}
		if (arg1.aShort107 != 0) {
			@Pc(1902) Class3_Sub3 local1902 = arg1.aClass3_Sub3_2;
			if (local1902 != null && !Static168.method2367(local15, local6, local9, local1902.method5020())) {
				if ((local1902.anInt6457 & arg1.aShort107) != 0) {
					if (Static348.aBoolean433) {
						Static151.method2184(arg0, local12, local6, local9);
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					local377 = local1902.method5280(Static307.aClass163_7);
					if (local377 != null) {
						local377.aClass3_1 = local1902;
						local377.anInt5552 = local12;
						local377.anInt5556 = local6;
						local377.anInt5558 = local9;
						Static212.aClass93_3.method2079(local377);
					}
				} else if (local1902.anInt6457 == 256) {
					local408 = local1902.anInt6454 - Static375.anInt6251;
					local1074 = local1902.anInt6458 - Static422.anInt6875;
					local1078 = local1902.anInt6464;
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
					if (Static348.aBoolean433) {
						Static151.method2184(arg0, local12, local6, local9);
						Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
					}
					@Pc(2012) Class3_Sub3 local2012 = arg1.aClass3_Sub3_3;
					@Pc(2020) Class21_Sub6 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5280(Static307.aClass163_7);
						if (local2020 != null) {
							local2020.aClass3_1 = local1902;
							local2020.anInt5552 = local12;
							local2020.anInt5556 = local6;
							local2020.anInt5558 = local9;
							Static212.aClass93_3.method2079(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5280(Static307.aClass163_7);
						if (local2020 != null) {
							local2020.aClass3_1 = local2012;
							local2020.anInt5552 = local12;
							local2020.anInt5556 = local6;
							local2020.anInt5558 = local9;
							Static212.aClass93_3.method2079(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass3_Sub2_3;
			local411 = arg1.aClass3_Sub2_2;
			@Pc(2105) Class21_Sub6 local2105;
			if (local411 != null && (local411.anInt6427 & arg1.aShort107) != 0 && !Static294.method788(local15, local6, local9, local411.anInt6427)) {
				if (Static348.aBoolean433) {
					Static403.method5084(arg0, local411.anInt6427, local12, local6, local9);
					Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
				}
				local2105 = local411.method5280(Static307.aClass163_7);
				if (local2105 != null) {
					local2105.aClass3_1 = local411;
					local2105.anInt5552 = local12;
					local2105.anInt5556 = local6;
					local2105.anInt5558 = local9;
					Static212.aClass93_3.method2079(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt6427 & arg1.aShort107) != 0 && !Static294.method788(local15, local6, local9, local1057.anInt6427)) {
				if (Static348.aBoolean433) {
					Static403.method5084(arg0, local1057.anInt6427, local12, local6, local9);
					Static307.aClass163_7.method5536(arg0.anInt607, arg0.aClass2_Sub29Array2);
				}
				local2105 = local1057.method5280(Static307.aClass163_7);
				if (local2105 != null) {
					local2105.aClass3_1 = local1057;
					local2105.anInt5552 = local12;
					local2105.anInt5556 = local6;
					local2105.anInt5558 = local9;
					Static212.aClass93_3.method2079(local2105);
				}
			}
		}
		@Pc(2191) Class270 local2191;
		if (local12 < Static289.anInt4757 - 1) {
			local2191 = Static309.aClass270ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean529) {
				Static460.aClass45_4.method5058(local2191);
			}
		}
		if (local6 < Static352.anInt5986) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean529) {
				Static460.aClass45_4.method5053(local2191);
			}
		}
		if (local9 < Static411.anInt6740) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean529) {
				Static460.aClass45_4.method5053(local2191);
			}
		}
		if (local6 > Static352.anInt5986) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean529) {
				Static460.aClass45_4.method5053(local2191);
			}
		}
		if (local9 > Static411.anInt6740) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean529) {
				Static460.aClass45_4.method5053(local2191);
			}
		}
	}
}
