import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array8;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public static int anInt4561;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_133 = new Class107(103, -2);

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_104 = new Class7("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public static void method3760() {
		@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static447.aClass181_64.method4112();
		@Pc(22) boolean local22 = Static455.aClass251_14 != null || Static34.anInt714 > 0;
		if (local22) {
			Static452.anInt7262 = 1;
		}
		if (Static137.aBoolean164 && Static306.aClass155_1.method3516(81) && Static217.anInt4004 > 2) {
			if (local22) {
				Static144.aClass1_Sub3_4 = (Class1_Sub3) Static55.aClass181_63.aClass1_179.aClass1_262.aClass1_262;
			} else {
				Static98.method1762(local14.method3633(), local14.method3632(), (Class1_Sub3) Static55.aClass181_63.aClass1_179.aClass1_262.aClass1_262);
			}
		} else if (local22) {
			Static144.aClass1_Sub3_4 = (Class1_Sub3) Static55.aClass181_63.aClass1_179.aClass1_262;
		} else {
			Static98.method1762(local14.method3633(), local14.method3632(), (Class1_Sub3) Static55.aClass181_63.aClass1_179.aClass1_262);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public static void method3761(@OriginalArg(1) int arg0) {
		Static218.anInt4008 = arg0;
		@Pc(12) Class134 local12 = Static223.aClass134_33;
		synchronized (Static223.aClass134_33) {
			Static223.aClass134_33.method3272();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I")
	public static int method3762() {
		return 6;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!cg;Lclient!fq;)V")
	public static void method3764(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class80 arg1) {
		if (!arg1.aBoolean141) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort41;
		@Pc(9) short local9 = arg1.aShort40;
		@Pc(12) byte local12 = arg1.aByte47;
		@Pc(15) byte local15 = arg1.aByte52;
		@Pc(21) int local21 = (local6 << Static31.anInt665) + Static69.anInt1593;
		@Pc(27) int local27 = (local9 << Static31.anInt665) + Static69.anInt1593;
		@Pc(31) Class80[][] local31 = client.lb[local12];
		@Pc(53) float local53;
		if (Static277.aClass149Array3 == Static105.aClass149Array1) {
			Static242.aClass39_7.GA(Static269.aClass149Array2[0].a(local21, local27), Static447.method5872(local6, local9), Static90.method1647(local6, local9), Static347.method4849(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static242.aClass39_7.g(3000.0F, local53 * 1.5F);
		@Pc(86) Class80 local86;
		@Pc(616) Class4_Sub1 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class4_Sub1 local377;
		@Pc(408) int local408;
		@Pc(411) Class31_Sub3 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean143) {
			if (Static185.aBoolean200) {
				if (local12 > 0) {
					local86 = client.lb[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean141) {
						return;
					}
				}
				if (local6 <= Static398.anInt6395 && local6 > Static397.anInt6377) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean141 && (local86.aBoolean143 || (arg1.aByte50 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static398.anInt6395 && local6 < Static190.anInt3419 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean141 && (local86.aBoolean143 || (arg1.aByte50 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static350.anInt5829 && local9 > Static312.anInt5398) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean141 && (local86.aBoolean143 || (arg1.aByte50 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static350.anInt5829 && local9 < Static27.anInt608 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean141 && (local86.aBoolean143 || (arg1.aByte50 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static185.aBoolean200 = true;
			}
			arg1.aBoolean143 = false;
			if (arg1.aClass80_1 != null) {
				local86 = arg1.aClass80_1;
				Static242.aClass39_7.g(3000.0F, (201.5F - (float) (local86.aByte52 + 1) * 50.0F) * 1.5F);
				if (!Static255.method3829(local86.aByte52, local6, local9)) {
					Static105.aClass149Array1[local86.aByte52].method3572(local6, local9);
				}
				@Pc(249) Class31_Sub3 local249 = local86.aClass31_Sub3_3;
				if (local249 != null) {
					if (Static293.aBoolean372) {
						if ((local249.anInt2831 & arg1.aShort39) == 0) {
							Static238.method3601(arg0, local12, local6, local9);
						} else {
							Static353.method5924(arg0, local249.anInt2831, local15, local6, local9);
						}
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					local249.method5973(Static242.aClass39_7);
				}
				for (@Pc(286) Class22 local286 = local86.aClass22_2; local286 != null; local286 = local286.aClass22_1) {
					@Pc(290) Class31_Sub2 local290 = local286.aClass31_Sub2_1;
					if (local290 != null) {
						if (Static293.aBoolean372) {
							Static238.method3601(arg0, local12, local6, local9);
							Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
						}
						local290.method5973(Static242.aClass39_7);
					}
				}
				Static242.aClass39_7.g(3000.0F, local53 * 1.5F);
			}
			local330 = !Static255.method3829(local15, local6, local9);
			if (local330) {
				Static105.aClass149Array1[local15].method3572(local6, local9);
				@Pc(341) Class31_Sub1 local341 = arg1.aClass31_Sub1_2;
				if (local341 != null && local341.aBoolean205) {
					if (local341.aBoolean204) {
						Static242.aClass39_7.g(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static293.aBoolean372) {
						Static238.method3601(arg0, local12, local6, local9);
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					local377 = local341.method5973(Static242.aClass39_7);
					if (local377 != null) {
						local377.aClass31_1 = local341;
						local377.anInt197 = local12;
						local377.anInt195 = local6;
						local377.anInt194 = local9;
						Static36.aClass141_2.method3356(local377);
					}
					if (local341.aBoolean204) {
						Static242.aClass39_7.g(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass31_Sub3_3;
			@Pc(414) Class31_Sub4 local414 = arg1.aClass31_Sub4_2;
			if (local411 != null || local414 != null) {
				if (Static398.anInt6395 == local6) {
					local406++;
				} else if (Static398.anInt6395 < local6) {
					local406 += 2;
				}
				if (Static350.anInt5829 == local9) {
					local406 += 3;
				} else if (Static350.anInt5829 > local9) {
					local406 += 6;
				}
				local408 = Static89.anIntArray156[local406];
				arg1.aShort39 = Static178.aShortArray50[local406];
			}
			if (local411 != null) {
				if ((local411.anInt2831 & Static70.anIntArray114[local406]) == 0) {
					arg1.aByte48 = 0;
				} else if (local411.anInt2831 == 16) {
					arg1.aByte48 = 3;
					arg1.aByte53 = Static55.aByteArray94[local406];
					arg1.aByte49 = (byte) (3 - arg1.aByte53);
				} else if (local411.anInt2831 == 32) {
					arg1.aByte48 = 6;
					arg1.aByte53 = Static129.aByteArray61[local406];
					arg1.aByte49 = (byte) (6 - arg1.aByte53);
				} else if (local411.anInt2831 == 64) {
					arg1.aByte48 = 12;
					arg1.aByte53 = Static420.aByteArray92[local406];
					arg1.aByte49 = (byte) (12 - arg1.aByte53);
				} else {
					arg1.aByte48 = 9;
					arg1.aByte53 = Static445.aByteArray95[local406];
					arg1.aByte49 = (byte) (9 - arg1.aByte53);
				}
				if ((local411.anInt2831 & local408) != 0 && !Static211.method3343(local15, local6, local9, local411.anInt2831)) {
					if (Static293.aBoolean372) {
						Static238.method3601(arg0, local12, local6, local9);
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					@Pc(563) Class4_Sub1 local563 = local411.method5973(Static242.aClass39_7);
					if (local563 != null) {
						local563.aClass31_1 = local411;
						local563.anInt197 = local12;
						local563.anInt195 = local6;
						local563.anInt194 = local9;
						Static36.aClass141_2.method3356(local563);
					}
				}
				@Pc(584) Class31_Sub3 local584 = arg1.aClass31_Sub3_2;
				if (local584 != null && (local584.anInt2831 & local408) != 0 && !Static211.method3343(local15, local6, local9, local584.anInt2831)) {
					if (Static293.aBoolean372) {
						Static238.method3601(arg0, local12, local6, local9);
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					local616 = local584.method5973(Static242.aClass39_7);
					if (local616 != null) {
						local616.aClass31_1 = local584;
						local616.anInt197 = local12;
						local616.anInt195 = local6;
						local616.anInt194 = local9;
						Static36.aClass141_2.method3356(local616);
					}
				}
			}
			if (local414 != null && !Static313.method4462(local15, local6, local9, local414.method5164())) {
				@Pc(647) Class31_Sub4 local647 = arg1.aClass31_Sub4_1;
				Static242.aClass39_7.g(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6191 & local408) != 0) {
					if (Static293.aBoolean372) {
						Static238.method3601(arg0, local12, local6, local9);
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					local616 = local414.method5973(Static242.aClass39_7);
					if (local616 != null) {
						local616.aClass31_1 = local414;
						local616.anInt197 = local12;
						local616.anInt195 = local6;
						local616.anInt194 = local9;
						Static36.aClass141_2.method3356(local616);
					}
				} else if (local414.anInt6191 == 256) {
					local706 = local414.anInt6193 - Static396.anInt6364;
					local711 = local414.anInt6195 - Static263.anInt4683;
					local714 = local414.anInt6197;
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
					if (Static293.aBoolean372) {
						Static238.method3601(arg0, local12, local6, local9);
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					@Pc(759) Class4_Sub1 local759;
					if (local735 < local723) {
						local759 = local414.method5973(Static242.aClass39_7);
						if (local759 != null) {
							local759.aClass31_1 = local414;
							local759.anInt197 = local12;
							local759.anInt195 = local6;
							local759.anInt194 = local9;
							Static36.aClass141_2.method3356(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5973(Static242.aClass39_7);
						if (local759 != null) {
							local759.aClass31_1 = local647;
							local759.anInt197 = local12;
							local759.anInt195 = local6;
							local759.anInt194 = local9;
							Static36.aClass141_2.method3356(local759);
						}
					}
				}
				Static242.aClass39_7.g(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class31_Sub1 local814 = arg1.aClass31_Sub1_2;
				if (local814 != null && !local814.aBoolean205) {
					if (local814.aBoolean204) {
						Static242.aClass39_7.g(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static293.aBoolean372) {
						Static238.method3601(arg0, local12, local6, local9);
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					local616 = local814.method5973(Static242.aClass39_7);
					if (local616 != null) {
						local616.aClass31_1 = local814;
						local616.anInt197 = local12;
						local616.anInt195 = local6;
						local616.anInt194 = local9;
						Static36.aClass141_2.method3356(local616);
					}
					if (local814.aBoolean204) {
						Static242.aClass39_7.g(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class31_Sub5 local880 = arg1.aClass31_Sub5_1;
				if (local880 != null && !local880.aBoolean499) {
					if (Static293.aBoolean372) {
						Static238.method3601(arg0, local12, local6, local9);
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					@Pc(903) Class4_Sub1 local903 = local880.method5973(Static242.aClass39_7);
					if (local903 != null) {
						local903.aClass31_1 = local880;
						local903.anInt197 = local12;
						local903.anInt195 = local6;
						local903.anInt194 = local9;
						Static36.aClass141_2.method3356(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte50;
			if (local924 != 0) {
				@Pc(941) Class80 local941;
				if (local6 < Static398.anInt6395 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean141) {
						Static135.aClass6_1.method5195(local941);
					}
				}
				if (local9 < Static350.anInt5829 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean141) {
						Static135.aClass6_1.method5195(local941);
					}
				}
				if (local6 > Static398.anInt6395 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean141) {
						Static135.aClass6_1.method5195(local941);
					}
				}
				if (local9 > Static350.anInt5829 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean141) {
						Static135.aClass6_1.method5195(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class31_Sub3 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class22 local1030;
		if (arg1.aByte48 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass22_2; local1030 != null; local1030 = local1030.aClass22_1) {
				if (local1030.aClass31_Sub2_1.anInt7295 != Static22.anInt541 && (local1030.anInt640 & arg1.aByte48) == arg1.aByte53) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass31_Sub3_3;
				if (!Static211.method3343(local15, local6, local9, local1057.anInt2831)) {
					if (Static293.aBoolean372) {
						label682: {
							if (local1057.anInt2831 >= 16) {
								local1074 = local6 - Static398.anInt6395;
								local1078 = local9 - Static350.anInt5829;
								if (local1057.anInt2831 == 16) {
									local1074 -= Static69.anInt1593;
									local1078 += Static69.anInt1593;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static87.anInt1875) {
										Static238.method3601(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt2831 == 32) {
									local1074 += Static69.anInt1593;
									local1078 += Static69.anInt1593;
									if (local1078 < -local1074 && local6 < Static132.anInt2639 && local9 < Static87.anInt1875) {
										Static238.method3601(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt2831 == 64) {
									local1074 += Static69.anInt1593;
									local1078 -= Static69.anInt1593;
									if (local1078 > local1074 && local6 < Static132.anInt2639 && local9 > 0) {
										Static238.method3601(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt2831 == 128) {
									local1074 -= Static69.anInt1593;
									local1078 -= Static69.anInt1593;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static238.method3601(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static238.method3601(arg0, local12, local6, local9);
						}
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					@Pc(1216) Class4_Sub1 local1216 = local1057.method5973(Static242.aClass39_7);
					if (local1216 != null) {
						local1216.aClass31_1 = local1057;
						local1216.anInt197 = local12;
						local1216.anInt195 = local6;
						local1216.anInt194 = local9;
						Static36.aClass141_2.method3356(local1216);
					}
				}
				arg1.aByte48 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean142) {
			try {
				arg1.aBoolean142 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass22_2; local1030 != null; local1030 = local1030.aClass22_1) {
					@Pc(1252) Class31_Sub2 local1252 = local1030.aClass31_Sub2_1;
					if (local1252.anInt7295 != Static22.anInt541) {
						for (local1074 = local1252.aShort103; local1074 <= local1252.aShort100; local1074++) {
							for (local1078 = local1252.aShort102; local1078 <= local1252.aShort101; local1078++) {
								@Pc(1270) Class80 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean143) {
									arg1.aBoolean142 = true;
									continue label625;
								}
								if (local1270.aByte48 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort103) {
										local706++;
									}
									if (local1074 < local1252.aShort100) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort102) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort101) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte48) == arg1.aByte49) {
										arg1.aBoolean142 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static398.anInt6395 - local1252.aShort103;
						local1333 = local1252.aShort100 - Static398.anInt6395;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static350.anInt5829 - local1252.aShort102;
						local711 = local1252.aShort101 - Static350.anInt5829;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass31_Sub2Array2[local1245] = local1252;
						arg0.anIntArray456[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class31_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass31_Sub2Array2[local1078];
						if (local1384.anInt7295 != Static22.anInt541) {
							local706 = arg0.anIntArray456[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7300 - Static396.anInt6364;
								local714 = local1384.anInt7298 - Static263.anInt4683;
								local723 = arg0.aClass31_Sub2Array2[local1074].anInt7300 - Static396.anInt6364;
								local735 = arg0.aClass31_Sub2Array2[local1074].anInt7298 - Static263.anInt4683;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass31_Sub2Array2[local1074];
					local1384.anInt7295 = Static22.anInt541;
					if (!Static238.method3602(local15, local1384.aShort103, local1384.aShort100, local1384.aShort102, local1384.aShort101, local1384.method5976())) {
						if (Static293.aBoolean372) {
							if (local1384.aByte101 == 0) {
								Static39.method716(arg0, local12, local1384.aShort103, local1384.aShort102, local1384.aShort100, local1384.aShort101);
							} else {
								Static238.method3601(arg0, local12, local6, local9);
								local706 = local6 - Static398.anInt6395;
								local711 = local9 - Static350.anInt5829;
								if (local1384.aByte101 == 2) {
									if (local711 > -local706) {
										Static399.method5939(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static399.method5939(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static399.method5939(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static399.method5939(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
						}
						local616 = local1384.method5973(Static242.aClass39_7);
						if (local616 != null) {
							local616.aClass31_1 = local1384;
							local616.anInt197 = local12;
							local616.anInt195 = local1384.aShort103;
							local616.anInt194 = local1384.aShort102;
							Static36.aClass141_2.method3356(local616);
						}
					}
					for (local706 = local1384.aShort103; local706 <= local1384.aShort100; local706++) {
						for (local711 = local1384.aShort102; local711 <= local1384.aShort101; local711++) {
							@Pc(1609) Class80 local1609 = local31[local706][local711];
							if (local1609.aByte48 != 0) {
								Static135.aClass6_1.method5195(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean141) {
								Static135.aClass6_1.method5195(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean142) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean142 = false;
			}
		}
		if (arg1.aClass140_1 != null && arg1.aByte51 == (byte) (Static38.anInt764 & 0xFF)) {
			@Pc(1664) Class140 local1664 = arg1.aClass140_1;
			local406 = Static105.aClass149Array1[local12].l(local6, local9);
			if (local12 < Static68.anInt1553 - 1) {
				local408 = Static105.aClass149Array1[local12].l(local6, local9) - Static105.aClass149Array1[local12 + 1].l(local6, local9);
			} else {
				local408 = 0x8 << Static31.anInt665;
			}
			Static227.aClass33_3.method4613(local21, local406, local27, arg0.anIntArray457);
			local1074 = arg0.anIntArray457[2];
			Static227.aClass33_3.method4613(local21, local406 - local408, local27, arg0.anIntArray457);
			local1078 = arg0.anIntArray457[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static224.anInt4084;
			local706 += Static224.anInt4084;
			local1664.anInt3933 = local1333;
			local1664.anInt3934 = local706;
			local1664.aBoolean280 = true;
			Static242.aClass39_7.method4566(local1664);
		}
		if (!arg1.aBoolean141) {
			return;
		}
		if (arg1.aByte48 != 0) {
			return;
		}
		if (local6 <= Static398.anInt6395 && local6 > Static397.anInt6377) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean141) {
				return;
			}
		}
		if (local6 >= Static398.anInt6395 && local6 < Static190.anInt3419 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean141) {
				return;
			}
		}
		if (local9 <= Static350.anInt5829 && local9 > Static312.anInt5398) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean141) {
				return;
			}
		}
		if (local9 >= Static350.anInt5829 && local9 < Static27.anInt608 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean141) {
				return;
			}
		}
		arg1.aBoolean141 = false;
		Static187.anInt3381--;
		@Pc(1855) Class31_Sub5 local1855 = arg1.aClass31_Sub5_1;
		if (local1855 != null && local1855.aBoolean499) {
			if (Static293.aBoolean372) {
				Static238.method3601(arg0, local12, local6, local9);
				Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
			}
			@Pc(1878) Class4_Sub1 local1878 = local1855.method5973(Static242.aClass39_7);
			if (local1878 != null) {
				local1878.aClass31_1 = local1855;
				local1878.anInt197 = local12;
				local1878.anInt195 = local6;
				local1878.anInt194 = local9;
				Static36.aClass141_2.method3356(local1878);
			}
		}
		if (arg1.aShort39 != 0) {
			@Pc(1902) Class31_Sub4 local1902 = arg1.aClass31_Sub4_2;
			if (local1902 != null && !Static313.method4462(local15, local6, local9, local1902.method5164())) {
				if ((local1902.anInt6191 & arg1.aShort39) != 0) {
					if (Static293.aBoolean372) {
						Static238.method3601(arg0, local12, local6, local9);
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					local377 = local1902.method5973(Static242.aClass39_7);
					if (local377 != null) {
						local377.aClass31_1 = local1902;
						local377.anInt197 = local12;
						local377.anInt195 = local6;
						local377.anInt194 = local9;
						Static36.aClass141_2.method3356(local377);
					}
				} else if (local1902.anInt6191 == 256) {
					local408 = local1902.anInt6193 - Static396.anInt6364;
					local1074 = local1902.anInt6195 - Static263.anInt4683;
					local1078 = local1902.anInt6197;
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
					if (Static293.aBoolean372) {
						Static238.method3601(arg0, local12, local6, local9);
						Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
					}
					@Pc(2012) Class31_Sub4 local2012 = arg1.aClass31_Sub4_1;
					@Pc(2020) Class4_Sub1 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5973(Static242.aClass39_7);
						if (local2020 != null) {
							local2020.aClass31_1 = local1902;
							local2020.anInt197 = local12;
							local2020.anInt195 = local6;
							local2020.anInt194 = local9;
							Static36.aClass141_2.method3356(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5973(Static242.aClass39_7);
						if (local2020 != null) {
							local2020.aClass31_1 = local2012;
							local2020.anInt197 = local12;
							local2020.anInt195 = local6;
							local2020.anInt194 = local9;
							Static36.aClass141_2.method3356(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass31_Sub3_3;
			local411 = arg1.aClass31_Sub3_2;
			@Pc(2105) Class4_Sub1 local2105;
			if (local411 != null && (local411.anInt2831 & arg1.aShort39) != 0 && !Static211.method3343(local15, local6, local9, local411.anInt2831)) {
				if (Static293.aBoolean372) {
					Static353.method5924(arg0, local411.anInt2831, local12, local6, local9);
					Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
				}
				local2105 = local411.method5973(Static242.aClass39_7);
				if (local2105 != null) {
					local2105.aClass31_1 = local411;
					local2105.anInt197 = local12;
					local2105.anInt195 = local6;
					local2105.anInt194 = local9;
					Static36.aClass141_2.method3356(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt2831 & arg1.aShort39) != 0 && !Static211.method3343(local15, local6, local9, local1057.anInt2831)) {
				if (Static293.aBoolean372) {
					Static353.method5924(arg0, local1057.anInt2831, local12, local6, local9);
					Static242.aClass39_7.method4560(arg0.anInt5265, arg0.aClass1_Sub31Array3);
				}
				local2105 = local1057.method5973(Static242.aClass39_7);
				if (local2105 != null) {
					local2105.aClass31_1 = local1057;
					local2105.anInt197 = local12;
					local2105.anInt195 = local6;
					local2105.anInt194 = local9;
					Static36.aClass141_2.method3356(local2105);
				}
			}
		}
		@Pc(2191) Class80 local2191;
		if (local12 < Static68.anInt1553 - 1) {
			local2191 = client.lb[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean141) {
				Static135.aClass6_1.method5194(local2191);
			}
		}
		if (local6 < Static398.anInt6395) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean141) {
				Static135.aClass6_1.method5195(local2191);
			}
		}
		if (local9 < Static350.anInt5829) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean141) {
				Static135.aClass6_1.method5195(local2191);
			}
		}
		if (local6 > Static398.anInt6395) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean141) {
				Static135.aClass6_1.method5195(local2191);
			}
		}
		if (local9 > Static350.anInt5829) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean141) {
				Static135.aClass6_1.method5195(local2191);
			}
		}
	}
}
