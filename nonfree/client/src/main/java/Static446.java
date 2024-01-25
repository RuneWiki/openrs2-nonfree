import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "Lclient!rm;")
	public static Class215 aClass215_10;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
	public static int anInt7387 = 0;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
	public static int anInt7388 = 0;

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "Lclient!wf;")
	public static final Class260 aClass260_10 = new Class260();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!jd;Lclient!fl;)V")
	public static void method5580(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class82 arg1) {
		if (!arg1.aBoolean149) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort18;
		@Pc(9) short local9 = arg1.aShort17;
		@Pc(12) byte local12 = arg1.aByte16;
		@Pc(15) byte local15 = arg1.aByte17;
		@Pc(21) int local21 = (local6 << Static384.anInt6381) + Static188.anInt3025;
		@Pc(27) int local27 = (local9 << Static384.anInt6381) + Static188.anInt3025;
		@Pc(31) Class82[][] local31 = Static159.aClass82ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static164.aClass163Array1 == Static202.aClass163Array2) {
			Static257.aClass128_36.ba(Static240.aClass163Array3[0].va(local21, local27), Static186.method3971(local6, local9), Static187.method2468(local6, local9), Static335.method4285(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static257.aClass128_36.o(3000.0F, local53 * 1.5F);
		@Pc(86) Class82 local86;
		@Pc(616) Class13_Sub4 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class13_Sub4 local377;
		@Pc(408) int local408;
		@Pc(411) Class20_Sub1 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean150) {
			if (Static69.aBoolean481) {
				if (local12 > 0) {
					local86 = Static159.aClass82ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean149) {
						return;
					}
				}
				if (local6 <= Static85.anInt4657 && local6 > Static330.anInt5396) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean149 && (local86.aBoolean150 || (arg1.aByte21 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static85.anInt4657 && local6 < Static275.anInt4346 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean149 && (local86.aBoolean150 || (arg1.aByte21 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static179.anInt2929 && local9 > Static402.anInt6522) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean149 && (local86.aBoolean150 || (arg1.aByte21 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static179.anInt2929 && local9 < Static401.anInt3622 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean149 && (local86.aBoolean150 || (arg1.aByte21 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static69.aBoolean481 = true;
			}
			arg1.aBoolean150 = false;
			if (arg1.aClass82_1 != null) {
				local86 = arg1.aClass82_1;
				Static257.aClass128_36.o(3000.0F, (201.5F - (float) (local86.aByte17 + 1) * 50.0F) * 1.5F);
				if (!Static290.method3791(local86.aByte17, local6, local9)) {
					Static202.aClass163Array2[local86.aByte17].method4517(local6, local9);
				}
				@Pc(249) Class20_Sub1 local249 = local86.aClass20_Sub1_2;
				if (local249 != null) {
					if (Static350.aBoolean478) {
						if ((local249.anInt5820 & arg1.aShort16) == 0) {
							Static402.method5017(arg0, local12, local6, local9);
						} else {
							Static287.method3737(arg0, local249.anInt5820, local15, local6, local9);
						}
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					local249.method5115(Static257.aClass128_36);
				}
				for (@Pc(286) Class146 local286 = local86.aClass146_1; local286 != null; local286 = local286.aClass146_3) {
					@Pc(290) Class20_Sub3 local290 = local286.aClass20_Sub3_1;
					if (local290 != null) {
						if (Static350.aBoolean478) {
							Static402.method5017(arg0, local12, local6, local9);
							Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
						}
						local290.method5115(Static257.aClass128_36);
					}
				}
				Static257.aClass128_36.o(3000.0F, local53 * 1.5F);
			}
			local330 = !Static290.method3791(local15, local6, local9);
			if (local330) {
				Static202.aClass163Array2[local15].method4517(local6, local9);
				@Pc(341) Class20_Sub2 local341 = arg1.aClass20_Sub2_1;
				if (local341 != null && local341.aBoolean405) {
					if (local341.aBoolean406) {
						Static257.aClass128_36.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static350.aBoolean478) {
						Static402.method5017(arg0, local12, local6, local9);
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					local377 = local341.method5115(Static257.aClass128_36);
					if (local377 != null) {
						local377.aClass20_1 = local341;
						local377.anInt4197 = local12;
						local377.anInt4202 = local6;
						local377.anInt4198 = local9;
						Static449.aClass227_8.method4832(local377);
					}
					if (local341.aBoolean406) {
						Static257.aClass128_36.o(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass20_Sub1_2;
			@Pc(414) Class20_Sub4 local414 = arg1.aClass20_Sub4_1;
			if (local411 != null || local414 != null) {
				if (Static85.anInt4657 == local6) {
					local406++;
				} else if (Static85.anInt4657 < local6) {
					local406 += 2;
				}
				if (Static179.anInt2929 == local9) {
					local406 += 3;
				} else if (Static179.anInt2929 > local9) {
					local406 += 6;
				}
				local408 = Static392.anIntArray398[local406];
				arg1.aShort16 = Static344.aShortArray67[local406];
			}
			if (local411 != null) {
				if ((local411.anInt5820 & Static331.anIntArray327[local406]) == 0) {
					arg1.aByte18 = 0;
				} else if (local411.anInt5820 == 16) {
					arg1.aByte18 = 3;
					arg1.aByte19 = Static49.aByteArray5[local406];
					arg1.aByte22 = (byte) (3 - arg1.aByte19);
				} else if (local411.anInt5820 == 32) {
					arg1.aByte18 = 6;
					arg1.aByte19 = Static278.aByteArray49[local406];
					arg1.aByte22 = (byte) (6 - arg1.aByte19);
				} else if (local411.anInt5820 == 64) {
					arg1.aByte18 = 12;
					arg1.aByte19 = Static285.aByteArray50[local406];
					arg1.aByte22 = (byte) (12 - arg1.aByte19);
				} else {
					arg1.aByte18 = 9;
					arg1.aByte19 = Static381.aByteArray75[local406];
					arg1.aByte22 = (byte) (9 - arg1.aByte19);
				}
				if ((local411.anInt5820 & local408) != 0 && !Static355.method4559(local15, local6, local9, local411.anInt5820)) {
					if (Static350.aBoolean478) {
						Static402.method5017(arg0, local12, local6, local9);
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					@Pc(563) Class13_Sub4 local563 = local411.method5115(Static257.aClass128_36);
					if (local563 != null) {
						local563.aClass20_1 = local411;
						local563.anInt4197 = local12;
						local563.anInt4202 = local6;
						local563.anInt4198 = local9;
						Static449.aClass227_8.method4832(local563);
					}
				}
				@Pc(584) Class20_Sub1 local584 = arg1.aClass20_Sub1_3;
				if (local584 != null && (local584.anInt5820 & local408) != 0 && !Static355.method4559(local15, local6, local9, local584.anInt5820)) {
					if (Static350.aBoolean478) {
						Static402.method5017(arg0, local12, local6, local9);
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					local616 = local584.method5115(Static257.aClass128_36);
					if (local616 != null) {
						local616.aClass20_1 = local584;
						local616.anInt4197 = local12;
						local616.anInt4202 = local6;
						local616.anInt4198 = local9;
						Static449.aClass227_8.method4832(local616);
					}
				}
			}
			if (local414 != null && !Static89.method1287(local15, local6, local9, local414.method5118())) {
				@Pc(647) Class20_Sub4 local647 = arg1.aClass20_Sub4_2;
				Static257.aClass128_36.o(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6656 & local408) != 0) {
					if (Static350.aBoolean478) {
						Static402.method5017(arg0, local12, local6, local9);
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					local616 = local414.method5115(Static257.aClass128_36);
					if (local616 != null) {
						local616.aClass20_1 = local414;
						local616.anInt4197 = local12;
						local616.anInt4202 = local6;
						local616.anInt4198 = local9;
						Static449.aClass227_8.method4832(local616);
					}
				} else if (local414.anInt6656 == 256) {
					local706 = local414.anInt6658 - Static332.anInt5443;
					local711 = local414.anInt6661 - Static410.anInt6678;
					local714 = local414.anInt6663;
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
					if (Static350.aBoolean478) {
						Static402.method5017(arg0, local12, local6, local9);
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					@Pc(759) Class13_Sub4 local759;
					if (local735 < local723) {
						local759 = local414.method5115(Static257.aClass128_36);
						if (local759 != null) {
							local759.aClass20_1 = local414;
							local759.anInt4197 = local12;
							local759.anInt4202 = local6;
							local759.anInt4198 = local9;
							Static449.aClass227_8.method4832(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5115(Static257.aClass128_36);
						if (local759 != null) {
							local759.aClass20_1 = local647;
							local759.anInt4197 = local12;
							local759.anInt4202 = local6;
							local759.anInt4198 = local9;
							Static449.aClass227_8.method4832(local759);
						}
					}
				}
				Static257.aClass128_36.o(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class20_Sub2 local814 = arg1.aClass20_Sub2_1;
				if (local814 != null && !local814.aBoolean405) {
					if (local814.aBoolean406) {
						Static257.aClass128_36.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static350.aBoolean478) {
						Static402.method5017(arg0, local12, local6, local9);
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					local616 = local814.method5115(Static257.aClass128_36);
					if (local616 != null) {
						local616.aClass20_1 = local814;
						local616.anInt4197 = local12;
						local616.anInt4202 = local6;
						local616.anInt4198 = local9;
						Static449.aClass227_8.method4832(local616);
					}
					if (local814.aBoolean406) {
						Static257.aClass128_36.o(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class20_Sub5 local880 = arg1.aClass20_Sub5_1;
				if (local880 != null && !local880.aBoolean286) {
					if (Static350.aBoolean478) {
						Static402.method5017(arg0, local12, local6, local9);
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					@Pc(903) Class13_Sub4 local903 = local880.method5115(Static257.aClass128_36);
					if (local903 != null) {
						local903.aClass20_1 = local880;
						local903.anInt4197 = local12;
						local903.anInt4202 = local6;
						local903.anInt4198 = local9;
						Static449.aClass227_8.method4832(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte21;
			if (local924 != 0) {
				@Pc(941) Class82 local941;
				if (local6 < Static85.anInt4657 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean149) {
						Static63.aClass2_1.method2560(local941);
					}
				}
				if (local9 < Static179.anInt2929 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean149) {
						Static63.aClass2_1.method2560(local941);
					}
				}
				if (local6 > Static85.anInt4657 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean149) {
						Static63.aClass2_1.method2560(local941);
					}
				}
				if (local9 > Static179.anInt2929 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean149) {
						Static63.aClass2_1.method2560(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class20_Sub1 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class146 local1030;
		if (arg1.aByte18 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass146_1; local1030 != null; local1030 = local1030.aClass146_3) {
				if (local1030.aClass20_Sub3_1.anInt6617 != Static214.anInt7431 && (local1030.anInt3663 & arg1.aByte18) == arg1.aByte19) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass20_Sub1_2;
				if (!Static355.method4559(local15, local6, local9, local1057.anInt5820)) {
					if (Static350.aBoolean478) {
						label682: {
							if (local1057.anInt5820 >= 16) {
								local1074 = local6 - Static85.anInt4657;
								local1078 = local9 - Static179.anInt2929;
								if (local1057.anInt5820 == 16) {
									local1074 -= Static188.anInt3025;
									local1078 += Static188.anInt3025;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static195.anInt3127) {
										Static402.method5017(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5820 == 32) {
									local1074 += Static188.anInt3025;
									local1078 += Static188.anInt3025;
									if (local1078 < -local1074 && local6 < Static362.anInt6113 && local9 < Static195.anInt3127) {
										Static402.method5017(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5820 == 64) {
									local1074 += Static188.anInt3025;
									local1078 -= Static188.anInt3025;
									if (local1078 > local1074 && local6 < Static362.anInt6113 && local9 > 0) {
										Static402.method5017(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt5820 == 128) {
									local1074 -= Static188.anInt3025;
									local1078 -= Static188.anInt3025;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static402.method5017(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static402.method5017(arg0, local12, local6, local9);
						}
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					@Pc(1216) Class13_Sub4 local1216 = local1057.method5115(Static257.aClass128_36);
					if (local1216 != null) {
						local1216.aClass20_1 = local1057;
						local1216.anInt4197 = local12;
						local1216.anInt4202 = local6;
						local1216.anInt4198 = local9;
						Static449.aClass227_8.method4832(local1216);
					}
				}
				arg1.aByte18 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean148) {
			try {
				arg1.aBoolean148 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass146_1; local1030 != null; local1030 = local1030.aClass146_3) {
					@Pc(1252) Class20_Sub3 local1252 = local1030.aClass20_Sub3_1;
					if (local1252.anInt6617 != Static214.anInt7431) {
						for (local1074 = local1252.aShort85; local1074 <= local1252.aShort87; local1074++) {
							for (local1078 = local1252.aShort88; local1078 <= local1252.aShort86; local1078++) {
								@Pc(1270) Class82 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean150) {
									arg1.aBoolean148 = true;
									continue label625;
								}
								if (local1270.aByte18 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort85) {
										local706++;
									}
									if (local1074 < local1252.aShort87) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort88) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort86) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte18) == arg1.aByte22) {
										arg1.aBoolean148 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static85.anInt4657 - local1252.aShort85;
						local1333 = local1252.aShort87 - Static85.anInt4657;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static179.anInt2929 - local1252.aShort88;
						local711 = local1252.aShort86 - Static179.anInt2929;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass20_Sub3Array4[local1245] = local1252;
						arg0.anIntArray296[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class20_Sub3 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass20_Sub3Array4[local1078];
						if (local1384.anInt6617 != Static214.anInt7431) {
							local706 = arg0.anIntArray296[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6613 - Static332.anInt5443;
								local714 = local1384.anInt6616 - Static410.anInt6678;
								local723 = arg0.aClass20_Sub3Array4[local1074].anInt6613 - Static332.anInt5443;
								local735 = arg0.aClass20_Sub3Array4[local1074].anInt6616 - Static410.anInt6678;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass20_Sub3Array4[local1074];
					local1384.anInt6617 = Static214.anInt7431;
					if (!Static425.method5303(local15, local1384.aShort85, local1384.aShort87, local1384.aShort88, local1384.aShort86, local1384.method5097())) {
						if (Static350.aBoolean478) {
							if (local1384.aByte88 == 0) {
								Static222.method2948(arg0, local12, local1384.aShort85, local1384.aShort88, local1384.aShort87, local1384.aShort86);
							} else {
								Static402.method5017(arg0, local12, local6, local9);
								local706 = local6 - Static85.anInt4657;
								local711 = local9 - Static179.anInt2929;
								if (local1384.aByte88 == 2) {
									if (local711 > -local706) {
										Static25.method479(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static25.method479(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static25.method479(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static25.method479(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
						}
						local616 = local1384.method5115(Static257.aClass128_36);
						if (local616 != null) {
							local616.aClass20_1 = local1384;
							local616.anInt4197 = local12;
							local616.anInt4202 = local1384.aShort85;
							local616.anInt4198 = local1384.aShort88;
							Static449.aClass227_8.method4832(local616);
						}
					}
					for (local706 = local1384.aShort85; local706 <= local1384.aShort87; local706++) {
						for (local711 = local1384.aShort88; local711 <= local1384.aShort86; local711++) {
							@Pc(1609) Class82 local1609 = local31[local706][local711];
							if (local1609.aByte18 != 0) {
								Static63.aClass2_1.method2560(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean149) {
								Static63.aClass2_1.method2560(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean148) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean148 = false;
			}
		}
		if (arg1.aClass194_2 != null && arg1.aByte20 == (byte) (Static418.anInt6791 & 0xFF)) {
			@Pc(1664) Class194 local1664 = arg1.aClass194_2;
			local406 = Static202.aClass163Array2[local12].I(local6, local9);
			if (local12 < Static97.anInt1709 - 1) {
				local408 = Static202.aClass163Array2[local12].I(local6, local9) - Static202.aClass163Array2[local12 + 1].I(local6, local9);
			} else {
				local408 = 0x8 << Static384.anInt6381;
			}
			Static144.aClass40_3.method4638(local21, local406, local27, arg0.anIntArray295);
			local1074 = arg0.anIntArray295[2];
			Static144.aClass40_3.method4638(local21, local406 - local408, local27, arg0.anIntArray295);
			local1078 = arg0.anIntArray295[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static163.anInt2691;
			local706 += Static163.anInt2691;
			local1664.anInt5211 = local1333;
			local1664.anInt5210 = local706;
			local1664.aBoolean420 = true;
			Static257.aClass128_36.method3587(local1664);
		}
		if (!arg1.aBoolean149) {
			return;
		}
		if (arg1.aByte18 != 0) {
			return;
		}
		if (local6 <= Static85.anInt4657 && local6 > Static330.anInt5396) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean149) {
				return;
			}
		}
		if (local6 >= Static85.anInt4657 && local6 < Static275.anInt4346 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean149) {
				return;
			}
		}
		if (local9 <= Static179.anInt2929 && local9 > Static402.anInt6522) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean149) {
				return;
			}
		}
		if (local9 >= Static179.anInt2929 && local9 < Static401.anInt3622 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean149) {
				return;
			}
		}
		arg1.aBoolean149 = false;
		Static309.anInt5156--;
		@Pc(1855) Class20_Sub5 local1855 = arg1.aClass20_Sub5_1;
		if (local1855 != null && local1855.aBoolean286) {
			if (Static350.aBoolean478) {
				Static402.method5017(arg0, local12, local6, local9);
				Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
			}
			@Pc(1878) Class13_Sub4 local1878 = local1855.method5115(Static257.aClass128_36);
			if (local1878 != null) {
				local1878.aClass20_1 = local1855;
				local1878.anInt4197 = local12;
				local1878.anInt4202 = local6;
				local1878.anInt4198 = local9;
				Static449.aClass227_8.method4832(local1878);
			}
		}
		if (arg1.aShort16 != 0) {
			@Pc(1902) Class20_Sub4 local1902 = arg1.aClass20_Sub4_1;
			if (local1902 != null && !Static89.method1287(local15, local6, local9, local1902.method5118())) {
				if ((local1902.anInt6656 & arg1.aShort16) != 0) {
					if (Static350.aBoolean478) {
						Static402.method5017(arg0, local12, local6, local9);
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					local377 = local1902.method5115(Static257.aClass128_36);
					if (local377 != null) {
						local377.aClass20_1 = local1902;
						local377.anInt4197 = local12;
						local377.anInt4202 = local6;
						local377.anInt4198 = local9;
						Static449.aClass227_8.method4832(local377);
					}
				} else if (local1902.anInt6656 == 256) {
					local408 = local1902.anInt6658 - Static332.anInt5443;
					local1074 = local1902.anInt6661 - Static410.anInt6678;
					local1078 = local1902.anInt6663;
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
					if (Static350.aBoolean478) {
						Static402.method5017(arg0, local12, local6, local9);
						Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
					}
					@Pc(2012) Class20_Sub4 local2012 = arg1.aClass20_Sub4_2;
					@Pc(2020) Class13_Sub4 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5115(Static257.aClass128_36);
						if (local2020 != null) {
							local2020.aClass20_1 = local1902;
							local2020.anInt4197 = local12;
							local2020.anInt4202 = local6;
							local2020.anInt4198 = local9;
							Static449.aClass227_8.method4832(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5115(Static257.aClass128_36);
						if (local2020 != null) {
							local2020.aClass20_1 = local2012;
							local2020.anInt4197 = local12;
							local2020.anInt4202 = local6;
							local2020.anInt4198 = local9;
							Static449.aClass227_8.method4832(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass20_Sub1_2;
			local411 = arg1.aClass20_Sub1_3;
			@Pc(2105) Class13_Sub4 local2105;
			if (local411 != null && (local411.anInt5820 & arg1.aShort16) != 0 && !Static355.method4559(local15, local6, local9, local411.anInt5820)) {
				if (Static350.aBoolean478) {
					Static287.method3737(arg0, local411.anInt5820, local12, local6, local9);
					Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
				}
				local2105 = local411.method5115(Static257.aClass128_36);
				if (local2105 != null) {
					local2105.aClass20_1 = local411;
					local2105.anInt4197 = local12;
					local2105.anInt4202 = local6;
					local2105.anInt4198 = local9;
					Static449.aClass227_8.method4832(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt5820 & arg1.aShort16) != 0 && !Static355.method4559(local15, local6, local9, local1057.anInt5820)) {
				if (Static350.aBoolean478) {
					Static287.method3737(arg0, local1057.anInt5820, local12, local6, local9);
					Static257.aClass128_36.method3565(arg0.anInt5076, arg0.aClass1_Sub24Array3);
				}
				local2105 = local1057.method5115(Static257.aClass128_36);
				if (local2105 != null) {
					local2105.aClass20_1 = local1057;
					local2105.anInt4197 = local12;
					local2105.anInt4202 = local6;
					local2105.anInt4198 = local9;
					Static449.aClass227_8.method4832(local2105);
				}
			}
		}
		@Pc(2191) Class82 local2191;
		if (local12 < Static97.anInt1709 - 1) {
			local2191 = Static159.aClass82ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean149) {
				Static63.aClass2_1.method2557(local2191);
			}
		}
		if (local6 < Static85.anInt4657) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean149) {
				Static63.aClass2_1.method2560(local2191);
			}
		}
		if (local9 < Static179.anInt2929) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean149) {
				Static63.aClass2_1.method2560(local2191);
			}
		}
		if (local6 > Static85.anInt4657) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean149) {
				Static63.aClass2_1.method2560(local2191);
			}
		}
		if (local9 > Static179.anInt2929) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean149) {
				Static63.aClass2_1.method2560(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	public static void method5581() {
		if (Static354.anInt5868 == 5) {
			Static354.anInt5868 = 6;
		}
	}
}
