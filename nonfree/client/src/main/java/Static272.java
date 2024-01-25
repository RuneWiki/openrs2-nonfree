import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!pm", name = "I", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_120 = new Class211(40, 12);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILclient!tq;B)V")
	public static void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class164 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static162.anInt2950 == 0 || Static333.anInt849 == 0) {
			return;
		}
		arg2.method5329(Static78.anInt1492, Static49.anInt3745, Static162.anInt2950, Static333.anInt849);
		arg2.method5313(Static114.anInt2044, Static220.anInt3773, Static162.anInt2950, Static333.anInt849);
		@Pc(35) Class127 local35 = arg2.method5393();
		local35.method5272(Static120.anInt2161, Static97.anInt1741, Static44.anInt871, Static357.anInt6084, Static324.anInt2364, Static151.anInt2784);
		arg2.method5357(local35);
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(109) int[] local109;
		@Pc(141) int local141;
		@Pc(149) int local149;
		if (Static239.aClass42Array4 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(55) int local55 = arg2.method5347();
			local64 = (arg1 - Static78.anInt1492) * local55 / Static162.anInt2950;
			local73 = (arg0 - Static49.anInt3745) * local55 / Static333.anInt849;
			local76 = arg2.method5348();
			local85 = (arg1 - Static78.anInt1492) * local76 / Static162.anInt2950;
			local94 = local76 * (arg0 - Static49.anInt3745) / Static333.anInt849;
			local109 = new int[] { local64, local73, local55 };
			local35.method5263(local109);
			@Pc(127) int[] local127 = new int[] { local85, local94, local76 };
			local35.method5263(local127);
			@Pc(132) float local132 = 0.0F;
			local141 = local127[0] - local109[0];
			local149 = local127[1] - local109[1];
			@Pc(158) int local158 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				@Pc(171) int local171 = (int) (local132 * (float) local141 + (float) local109[0]);
				@Pc(175) int local175 = local171 >> 7;
				@Pc(186) int local186 = (int) ((float) local109[2] + local132 * (float) local158);
				@Pc(190) int local190 = local186 >> 7;
				if (local175 > 0 && local190 > 0 && local175 < Static92.anInt1675 && local190 < Static262.anInt6340) {
					@Pc(213) int local213 = Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70;
					if (local213 < 3 && (Static373.aByteArrayArrayArray16[1][local175][local190] & 0x2) != 0) {
						local213++;
					}
					if ((float) Static239.aClass42Array4[local213].method3043(local171, local186) < (float) local149 * local132 + (float) local109[1]) {
						local50 = Static321.aClass25_Sub1_Sub1_Sub1_2.method1877() * 64 + local171 - 64 >> 7;
						local52 = local186 + Static321.aClass25_Sub1_Sub1_Sub1_2.method1877() * 64 - 64 >> 7;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static90.aBoolean144 && (Static176.anInt3186 & 0x40) != 0) {
					@Pc(304) Class117 local304 = Static84.method1246(Static119.anInt2128, Static137.anInt2555);
					if (local304 == null) {
						Static361.method5016();
					} else {
						Static337.method4814(0L, 4, true, Static215.anInt3687, " ->", Static114.aString18, local50, -1, false, local52);
					}
				} else {
					if (Static360.aClass94_7 == Static313.aClass94_8) {
						Static337.method4814(0L, 19, true, -1, "", Static267.aClass169_249.method3680(Static48.anInt952), local50, -1, false, local52);
					}
					Static337.method4814(0L, 51, true, -1, "", Static133.aString24, local50, -1, false, local52);
				}
			}
		}
		@Pc(364) Class208 local364 = Static118.aClass208_6;
		for (@Pc(373) Class41_Sub1 local373 = (Class41_Sub1) local364.method4661(); local373 != null; local373 = (Class41_Sub1) local364.method4663()) {
			if (Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 == local373.anInt925 && local373.method723(arg1, arg2, arg0)) {
				@Pc(502) int local502;
				if (local373.aClass25_1 instanceof Class25_Sub1_Sub1_Sub1) {
					@Pc(399) Class25_Sub1_Sub1_Sub1 local399 = (Class25_Sub1_Sub1_Sub1) local373.aClass25_1;
					local64 = local399.method1877();
					if ((local64 & 0x1) == 0 && (local399.anInt6080 & 0x7F) == 0 && (local399.anInt6077 & 0x7F) == 0 || (local64 & 0x1) == 1 && (local399.anInt6080 & 0x7F) == 64 && (local399.anInt6077 & 0x7F) == 64) {
						local73 = local399.anInt6080 + 64 - local399.method1877() * 64;
						local76 = local399.anInt6077 - (local399.method1877() - 1) * 64;
						@Pc(514) int local514;
						for (local85 = 0; local85 < Static309.anInt5243; local85++) {
							@Pc(475) Class25_Sub1_Sub1_Sub2 local475 = Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local85]];
							if (local475 != null && local475.anInt2371 != Static366.anInt5883 && local475.aBoolean190) {
								local502 = local475.anInt6080 - (local475.aClass59_1.anInt1420 - 1) * 64;
								local514 = local475.anInt6077 - (local475.aClass59_1.anInt1420 - 1) * 64;
								if (local502 >= local73 && local475.aClass59_1.anInt1420 <= local399.method1877() - (local502 - local73 >> 7) && local76 <= local514 && local475.aClass59_1.anInt1420 <= local399.method1877() - (local514 - local76 >> 7)) {
									Static123.method4614(local475, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 != local373.anInt925);
									local475.anInt2371 = Static366.anInt5883;
								}
							}
						}
						local94 = Static331.anInt5548;
						local109 = Static345.anIntArray681;
						for (local514 = 0; local514 < local94; local514++) {
							@Pc(594) Class25_Sub1_Sub1_Sub1 local594 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local109[local514]];
							if (local594 != null && Static366.anInt5883 != local594.anInt2371 && local594 != local399 && local594.aBoolean190) {
								local141 = local594.anInt6080 - (local594.method1877() - 1) * 64;
								local149 = local594.anInt6077 + 64 - local594.method1877() * 64;
								if (local141 >= local73 && local594.method1877() <= local399.method1877() - (local141 - local73 >> 7) && local76 <= local149 && local594.method1877() <= local399.method1877() - (local149 - local76 >> 7)) {
									Static359.method5476(local594, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 != local373.anInt925);
									local594.anInt2371 = Static366.anInt5883;
								}
							}
						}
					}
					if (Static366.anInt5883 == local399.anInt2371) {
						continue;
					}
					Static359.method5476(local399, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 != local373.anInt925);
					local399.anInt2371 = Static366.anInt5883;
				}
				if (local373.aClass25_1 instanceof Class25_Sub1_Sub1_Sub2) {
					@Pc(721) Class25_Sub1_Sub1_Sub2 local721 = (Class25_Sub1_Sub1_Sub2) local373.aClass25_1;
					if (local721.aClass59_1 != null) {
						if ((local721.aClass59_1.anInt1420 & 0x1) == 0 && (local721.anInt6080 & 0x7F) == 0 && (local721.anInt6077 & 0x7F) == 0 || (local721.aClass59_1.anInt1420 & 0x1) == 1 && (local721.anInt6080 & 0x7F) == 64 && (local721.anInt6077 & 0x7F) == 64) {
							local64 = local721.anInt6080 + 64 - local721.aClass59_1.anInt1420 * 64;
							local73 = local721.anInt6077 - (local721.aClass59_1.anInt1420 - 1) * 64;
							for (local76 = 0; local76 < Static309.anInt5243; local76++) {
								@Pc(798) Class25_Sub1_Sub1_Sub2 local798 = Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local76]];
								if (local798 != null && local798.anInt2371 != Static366.anInt5883 && local798 != local721 && local798.aBoolean190) {
									local94 = local798.anInt6080 - (local798.aClass59_1.anInt1420 - 1) * 64;
									local502 = local798.anInt6077 + 64 - local798.aClass59_1.anInt1420 * 64;
									if (local94 >= local64 && local721.aClass59_1.anInt1420 - (local94 - local64 >> 7) >= local798.aClass59_1.anInt1420 && local73 <= local502 && local798.aClass59_1.anInt1420 <= local721.aClass59_1.anInt1420 - (local502 - local73 >> 7)) {
										Static123.method4614(local798, local373.anInt925 != Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70);
										local798.anInt2371 = Static366.anInt5883;
									}
								}
							}
							local85 = Static331.anInt5548;
							@Pc(904) int[] local904 = Static345.anIntArray681;
							for (local502 = 0; local502 < local85; local502++) {
								@Pc(914) Class25_Sub1_Sub1_Sub1 local914 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local904[local502]];
								if (local914 != null && local914.anInt2371 != Static366.anInt5883 && local914.aBoolean190) {
									@Pc(936) int local936 = local914.anInt6080 - (local914.method1877() - 1) * 64;
									local141 = local914.anInt6077 - (local914.method1877() - 1) * 64;
									if (local936 >= local64 && local914.method1877() <= local721.aClass59_1.anInt1420 - (local936 - local64 >> 7) && local141 >= local73 && local914.method1877() <= local721.aClass59_1.anInt1420 - (local141 - local73 >> 7)) {
										Static359.method5476(local914, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 != local373.anInt925);
										local914.anInt2371 = Static366.anInt5883;
									}
								}
							}
						}
						if (local721.anInt2371 == Static366.anInt5883) {
							continue;
						}
						Static123.method4614(local721, local373.anInt925 != Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70);
						local721.anInt2371 = Static366.anInt5883;
					}
				}
				if (local373.aClass25_1 instanceof Class25_Sub2_Sub1) {
					@Pc(1059) Class1_Sub12 local1059 = (Class1_Sub12) Static338.aClass77_34.method1368((long) (local373.anInt924 | local373.anInt925 << 28 | local373.anInt927 << 14));
					if (local1059 != null) {
						for (@Pc(1067) Class1_Sub11 local1067 = (Class1_Sub11) local1059.aClass17_12.method200(); local1067 != null; local1067 = (Class1_Sub11) local1059.aClass17_12.method197()) {
							@Pc(1075) Class88 local1075 = Static263.aClass102_2.method2172(local1067.anInt1462);
							if (!Static90.aBoolean144) {
								if (local373.anInt925 == Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70) {
									@Pc(1158) String[] local1158 = local1075.aStringArray29;
									for (local85 = 4; local85 >= 0; local85--) {
										if (local1158 != null && local1158[local85] != null) {
											@Pc(1170) byte local1170 = 0;
											if (local85 == 0) {
												local1170 = 60;
											}
											local502 = Static260.anInt4514;
											if (local85 == 1) {
												local1170 = 11;
											}
											if (local85 == 2) {
												local1170 = 48;
											}
											if (local85 == 3) {
												local1170 = 20;
											}
											if (local1075.anInt2042 == local85) {
												local502 = local1075.anInt1990;
											}
											if (local85 == 4) {
												local1170 = 47;
											}
											if (local1075.anInt2000 == local85) {
												local502 = local1075.anInt2023;
											}
											Static337.method4814((long) local1067.anInt1462, local1170, true, local502, "<col=ff9040>" + local1075.aString17, local1158[local85], local373.anInt924, -1, false, local373.anInt927);
										}
									}
								}
								Static337.method4814((long) local1067.anInt1462, 1009, true, Static274.anInt4782, "<col=ff9040>" + local1075.aString17, Static344.aClass169_302.method3680(Static48.anInt952), local373.anInt924, -1, local373.anInt925 != Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70, local373.anInt927);
							} else if (local373.anInt925 == Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70) {
								@Pc(1099) Class24 local1099 = Static236.anInt3954 == -1 ? null : Static232.aClass47_2.method888(Static236.anInt3954);
								if ((Static176.anInt3186 & 0x1) != 0 && (local1099 == null || local1075.method1662(local1099.anInt392, Static236.anInt3954) != local1099.anInt392)) {
									Static337.method4814((long) local1067.anInt1462, 22, true, Static215.anInt3687, Static28.aString7 + " -> <col=ff9040>" + local1075.aString17, Static114.aString18, local373.anInt924, -1, false, local373.anInt927);
								}
							}
						}
					}
				}
				if (local373.aClass25_1 instanceof Interface6) {
					@Pc(1313) Interface6 local1313 = (Interface6) local373.aClass25_1;
					@Pc(1320) Class236 local1320 = Static54.aClass153_1.method3081(local1313.method5250());
					if (local1320.anIntArray706 != null) {
						local1320 = local1320.method5074(Static230.aClass72_3);
					}
					if (local1320 != null) {
						if (!Static90.aBoolean144) {
							if (local373.anInt925 == Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70) {
								@Pc(1420) String[] local1420 = local1320.aStringArray81;
								if (local1420 != null) {
									for (local76 = 4; local76 >= 0; local76--) {
										if (local1420[local76] != null) {
											@Pc(1432) short local1432 = 0;
											if (local76 == 0) {
												local1432 = 2;
											}
											local94 = Static260.anInt4514;
											if (local76 == 1) {
												local1432 = 12;
											}
											if (local76 == 2) {
												local1432 = 17;
											}
											if (local76 == 3) {
												local1432 = 9;
											}
											if (local76 == 4) {
												local1432 = 1002;
											}
											if (local76 == local1320.anInt5913) {
												local94 = local1320.anInt5921;
											}
											if (local76 == local1320.anInt5930) {
												local94 = local1320.anInt5924;
											}
											Static337.method4814(Static338.method4821(local373.anInt924, local373.anInt927, local1313), local1432, true, local94, "<col=00ffff>" + local1320.aString67, local1420[local76], local373.anInt924, -1, false, local373.anInt927);
										}
									}
								}
							}
							Static337.method4814((long) local1320.anInt5911, 1008, true, Static274.anInt4782, "<col=00ffff>" + local1320.aString67, Static344.aClass169_302.method3680(Static48.anInt952), local373.anInt924, -1, local373.anInt925 != Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70, local373.anInt927);
						} else if (local373.anInt925 == Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70) {
							@Pc(1353) Class24 local1353 = Static236.anInt3954 == -1 ? null : Static232.aClass47_2.method888(Static236.anInt3954);
							if ((Static176.anInt3186 & 0x4) != 0 && (local1353 == null || local1320.method5080(local1353.anInt392, Static236.anInt3954) != local1353.anInt392)) {
								Static337.method4814(Static338.method4821(local373.anInt924, local373.anInt927, local1313), 59, true, Static215.anInt3687, Static28.aString7 + " -> <col=00ffff>" + local1320.aString67, Static114.aString18, local373.anInt924, -1, false, local373.anInt927);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!fc;IILclient!lk;Lclient!tq;IBLclient!gu;)V")
	public static void method4176(@OriginalArg(0) Class79 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub24 arg3, @OriginalArg(4) Class164 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class97 arg6) {
		@Pc(15) int local15 = arg3.anInt3617 - arg2 / 2 - 5;
		@Pc(19) int local19 = arg5 + 2;
		if (arg6.anInt2278 != 0) {
			arg4.method5343(arg5 + arg0.method1375() * arg1 + 1 - local19, arg6.anInt2278, local19, local15, arg2 + 10);
		}
		if (arg6.anInt2275 != 0) {
			arg4.method5397(arg2 + 10, -local19 + arg0.method1375() * arg1 + (arg5 - -1), local15, arg6.anInt2275, local19);
		}
		@Pc(71) int local71 = arg6.anInt2299;
		if (arg3.aBoolean351 && arg6.anInt2267 != -1) {
			local71 = arg6.anInt2267;
		}
		for (@Pc(89) int local89 = 0; local89 < arg1; local89++) {
			@Pc(95) String local95 = Static83.aStringArray20[local89];
			if (local89 < arg1 - 1) {
				local95 = local95.substring(0, local95.length() - 4);
			}
			arg0.method1379(arg4, local95, arg3.anInt3617, arg5, local71);
			arg5 += arg0.method1375();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBLclient!nd;)V")
	public static void method4178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class161 arg2) {
		Static364.aClass161ArrayArray3[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!tf;IIIIIIIII)Z")
	public static boolean method4180(@OriginalArg(0) int arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg7 - 64;
		Static364.anIntArrayArray61[64][64] = 99;
		@Pc(33) int local33 = arg2 - 64;
		Static324.anIntArrayArray32[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static296.anIntArray604[0] = arg7;
		@Pc(50) int local50 = local41 + 1;
		Static225.anIntArray493[0] = arg2;
		@Pc(55) int[][] local55 = arg1.anIntArrayArray59;
		while (local43 != local50) {
			local9 = Static225.anIntArray493[local43];
			local7 = Static296.anIntArray604[local43];
			local43 = local43 + 1 & 0xFFF;
			@Pc(76) int local76 = local7 - local18;
			@Pc(81) int local81 = local9 - arg1.anInt5625;
			@Pc(85) int local85 = local9 - local33;
			@Pc(91) int local91 = local7 - arg1.anInt5619;
			if (arg8 == -4) {
				if (arg6 == local7 && local9 == arg5) {
					Static92.anInt1673 = local9;
					Static143.anInt2675 = local7;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static318.method4692(arg9, 1, arg6, 1, local7, local9, arg5, arg3)) {
					Static143.anInt2675 = local7;
					Static92.anInt1673 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg1.method4837(arg3, 1, local7, 1, local9, arg5, arg4, arg9, arg6)) {
					Static92.anInt1673 = local9;
					Static143.anInt2675 = local7;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg1.method4835(arg3, arg4, arg9, arg6, local7, arg5, local9, 1)) {
					Static143.anInt2675 = local7;
					Static92.anInt1673 = local9;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg1.method4827(arg6, arg5, arg8, arg0, local9, local7, 1)) {
					Static92.anInt1673 = local9;
					Static143.anInt2675 = local7;
					return true;
				}
			} else if (arg1.method4822(arg6, 1, arg8, local9, arg5, local7, arg0)) {
				Static92.anInt1673 = local9;
				Static143.anInt2675 = local7;
				return true;
			}
			@Pc(239) int local239 = Static324.anIntArrayArray32[local76][local85] + 1;
			if (local76 > 0 && Static364.anIntArrayArray61[local76 - 1][local85] == 0 && (local55[local91 - 1][local81] & 0x42240000) == 0) {
				Static296.anIntArray604[local50] = local7 - 1;
				Static225.anIntArray493[local50] = local9;
				Static364.anIntArrayArray61[local76 - 1][local85] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static324.anIntArrayArray32[local76 - 1][local85] = local239;
			}
			if (local76 < 127 && Static364.anIntArrayArray61[local76 + 1][local85] == 0 && (local55[local91 + 1][local81] & 0x60240000) == 0) {
				Static296.anIntArray604[local50] = local7 + 1;
				Static225.anIntArray493[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static364.anIntArrayArray61[local76 + 1][local85] = 8;
				Static324.anIntArrayArray32[local76 + 1][local85] = local239;
			}
			if (local85 > 0 && Static364.anIntArrayArray61[local76][local85 - 1] == 0 && (local55[local91][local81 - 1] & 0x40A40000) == 0) {
				Static296.anIntArray604[local50] = local7;
				Static225.anIntArray493[local50] = local9 - 1;
				Static364.anIntArrayArray61[local76][local85 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static324.anIntArrayArray32[local76][local85 - 1] = local239;
			}
			if (local85 < 127 && Static364.anIntArrayArray61[local76][local85 + 1] == 0 && (local55[local91][local81 + 1] & 0x48240000) == 0) {
				Static296.anIntArray604[local50] = local7;
				Static225.anIntArray493[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static364.anIntArrayArray61[local76][local85 + 1] = 4;
				Static324.anIntArrayArray32[local76][local85 + 1] = local239;
			}
			if (local76 > 0 && local85 > 0 && Static364.anIntArrayArray61[local76 - 1][local85 - 1] == 0 && (local55[local91 - 1][local81 - 1] & 0x43A40000) == 0 && (local55[local91 - 1][local81] & 0x42240000) == 0 && (local55[local91][local81 - 1] & 0x40A40000) == 0) {
				Static296.anIntArray604[local50] = local7 - 1;
				Static225.anIntArray493[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static364.anIntArrayArray61[local76 - 1][local85 - 1] = 3;
				Static324.anIntArrayArray32[local76 - 1][local85 - 1] = local239;
			}
			if (local76 < 127 && local85 > 0 && Static364.anIntArrayArray61[local76 + 1][local85 - 1] == 0 && (local55[local91 + 1][local81 - 1] & 0x60E40000) == 0 && (local55[local91 + 1][local81] & 0x60240000) == 0 && (local55[local91][local81 - 1] & 0x40A40000) == 0) {
				Static296.anIntArray604[local50] = local7 + 1;
				Static225.anIntArray493[local50] = local9 - 1;
				Static364.anIntArrayArray61[local76 + 1][local85 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static324.anIntArrayArray32[local76 + 1][local85 - 1] = local239;
			}
			if (local76 > 0 && local85 < 127 && Static364.anIntArrayArray61[local76 - 1][local85 + 1] == 0 && (local55[local91 - 1][local81 + 1] & 0x4E240000) == 0 && (local55[local91 - 1][local81] & 0x42240000) == 0 && (local55[local91][local81 + 1] & 0x48240000) == 0) {
				Static296.anIntArray604[local50] = local7 - 1;
				Static225.anIntArray493[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static364.anIntArrayArray61[local76 - 1][local85 + 1] = 6;
				Static324.anIntArrayArray32[local76 - 1][local85 + 1] = local239;
			}
			if (local76 < 127 && local85 < 127 && Static364.anIntArrayArray61[local76 + 1][local85 + 1] == 0 && (local55[local91 + 1][local81 + 1] & 0x78240000) == 0 && (local55[local91 + 1][local81] & 0x60240000) == 0 && (local55[local91][local81 + 1] & 0x48240000) == 0) {
				Static296.anIntArray604[local50] = local7 + 1;
				Static225.anIntArray493[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static364.anIntArrayArray61[local76 + 1][local85 + 1] = 12;
				Static324.anIntArrayArray32[local76 + 1][local85 + 1] = local239;
			}
		}
		Static92.anInt1673 = local9;
		Static143.anInt2675 = local7;
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZ)V")
	public static void method4182(@OriginalArg(0) byte arg0) {
		if (Static383.aByteArrayArrayArray17 == null) {
			Static383.aByteArrayArrayArray17 = new byte[4][Static92.anInt1675][Static262.anInt6340];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static92.anInt1675; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static262.anInt6340; local27++) {
					Static383.aByteArrayArrayArray17[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)I")
	public static int method4186(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local13 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local13;
		} else {
			return local13;
		}
	}
}
