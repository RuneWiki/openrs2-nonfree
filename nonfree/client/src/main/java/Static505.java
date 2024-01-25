import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public static int anInt9377 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V")
	public static void method7608(@OriginalArg(1) int arg0) {
		if (arg0 == Static320.anInt6616) {
			return;
		}
		Static460.anInt8640 = Static292.anInt7682 = Static20.anIntArray15[arg0];
		Static97.method2119();
		Static270.anIntArrayArrayArray7 = new int[4][Static460.anInt8640 >> 3][Static292.anInt7682 >> 3];
		Static534.anIntArrayArray79 = new int[Static460.anInt8640][Static292.anInt7682];
		Static206.anIntArrayArray70 = new int[Static460.anInt8640][Static292.anInt7682];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static403.aClass350Array1[local40] = Static494.method7023(Static292.anInt7682, Static460.anInt8640);
		}
		Static570.aByteArrayArrayArray20 = new byte[4][Static460.anInt8640][Static292.anInt7682];
		Static454.method7042(Static292.anInt7682, Static460.anInt8640);
		Static447.method7002(Static546.aClass15_16, Static460.anInt8640 >> 3, Static292.anInt7682 >> 3);
		Static320.anInt6616 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
	public static void method7609(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(5) int local5 = Static455.anInt8611;
		Static62.anInt1611 = 0;
		@Pc(9) int[] local9 = Static492.anIntArray589;
		@Pc(181) int local181;
		@Pc(210) int local210;
		@Pc(255) int local255;
		@Pc(331) int local331;
		@Pc(415) int local415;
		@Pc(846) int local846;
		@Pc(545) int local545;
		for (@Pc(22) int local22 = 0; local22 < Static268.anInt5680 + local5; local22++) {
			@Pc(25) Class169 local25 = null;
			@Pc(41) Class2_Sub2_Sub1 local41;
			if (local22 >= local5) {
				local41 = ((Class3_Sub46) Static331.aClass25_25.method946((long) Static304.anIntArray377[local22 - local5])).aClass2_Sub2_Sub1_Sub2_2;
				local25 = ((Class2_Sub2_Sub1_Sub2) local41).aClass169_1;
				if (local25.anIntArray306 != null) {
					local25 = local25.method4177(Static588.aClass322_1);
					if (local25 == null) {
						continue;
					}
				}
			} else {
				local41 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local9[local22]];
			}
			if (local41.anInt7606 >= 0 && (Static453.anInt8598 == local41.anInt7636 || Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 == local41.aByte103)) {
				Static359.method5948(local41, local41.method6303(), arg0 >> 1, arg3 >> 1);
				if (Static580.anIntArray664[0] >= 0) {
					if (local41.aString92 != null && (local5 <= local22 || Static14.anInt438 == 0 || Static14.anInt438 == 3 || Static14.anInt438 == 1 && Static382.method6136(((Class2_Sub2_Sub1_Sub1) local41).aString23)) && Static62.anInt1611 < Static276.anInt5848) {
						Static276.anIntArray359[Static62.anInt1611] = Static9.aClass297_1.method7314(local41.aString92) / 2;
						Static276.anIntArray354[Static62.anInt1611] = Static580.anIntArray664[0];
						Static276.anIntArray353[Static62.anInt1611] = Static580.anIntArray664[1];
						Static276.anIntArray357[Static62.anInt1611] = local41.anInt7610;
						Static276.anIntArray358[Static62.anInt1611] = local41.anInt7600;
						Static276.anIntArray356[Static62.anInt1611] = local41.anInt7632;
						Static276.aStringArray23[Static62.anInt1611] = local41.aString92;
						Static62.anInt1611++;
					}
					local181 = Static580.anIntArray664[1] + arg1;
					@Pc(240) Class37[] local240;
					@Pc(247) Class20[] local247;
					@Pc(302) Class37 local302;
					if (local41.aBoolean647 || local41.anInt7647 <= Static129.anInt10429) {
						local181 -= Math.max(Static9.aClass297_1.anInt8936, Static554.aClass37Array13[0].b());
					} else {
						@Pc(196) byte local196 = 1;
						if (local5 > local22) {
							@Pc(205) Class2_Sub2_Sub1_Sub1 local205 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local9[local22]];
							local210 = local41.method6316().anInt5099;
							if (local205.aBoolean171) {
								local196 = 2;
							}
						} else {
							local210 = local25.anInt4981;
							if (local210 == -1) {
								local210 = local41.method6316().anInt5099;
							}
						}
						@Pc(229) Class37[] local229 = Static554.aClass37Array13;
						if (local210 != -1) {
							local240 = (Class37[]) Static596.aClass211_66.method5534((long) local210);
							if (local240 == null) {
								local247 = Static599.method813(Static579.aClass254_137, local210);
								if (local247 != null) {
									local240 = new Class37[local247.length];
									for (local255 = 0; local255 < local247.length; local255++) {
										local240[local255] = Static546.aClass15_16.method5275(local247[local255], true);
									}
									Static596.aClass211_66.method5529((long) local210, local240);
								}
							}
							if (local240 != null && local240.length >= 2) {
								local229 = local240;
							}
						}
						if (local196 >= local229.length) {
							local196 = 1;
						}
						@Pc(298) Class37 local298 = local229[0];
						local302 = local229[local196];
						local181 -= Math.max(Static9.aClass297_1.anInt8936, local298.b());
						local255 = arg2 + Static580.anIntArray664[0] - (local298.QA() >> 1);
						local331 = local298.QA() * local41.anInt7630 / 255;
						if (local41.anInt7630 > 0 && local331 < 2) {
							local331 = 2;
						}
						local298.method7076(local255, local181);
						Static546.aClass15_16.Q(local255, local181, local255 + local331, local298.b() + local181);
						local302.method7076(local255, local181);
						Static546.aClass15_16.ca(arg2, arg1, arg2 + arg0, arg1 + arg3);
					}
					local181 -= 2;
					if (!local41.aBoolean647) {
						@Pc(398) Class37 local398;
						if (local41.anInt7643 > Static129.anInt10429) {
							local398 = Static61.aClass37Array1[local41.aBoolean646 ? 2 : 0];
							@Pc(407) Class37 local407 = Static61.aClass37Array1[local41.aBoolean646 ? 3 : 1];
							if (local41 instanceof Class2_Sub2_Sub1_Sub2) {
								local415 = local25.anInt4965;
								if (local415 == -1) {
									local415 = local41.method6316().anInt5090;
								}
							} else {
								local415 = local41.method6316().anInt5090;
							}
							if (local415 != -1) {
								local240 = (Class37[]) Static197.aClass211_24.method5534((long) local415);
								if (local240 == null) {
									local247 = Static599.method813(Static579.aClass254_137, local415);
									if (local247 != null) {
										local240 = new Class37[local247.length];
										for (local255 = 0; local255 < local247.length; local255++) {
											local240[local255] = Static546.aClass15_16.method5275(local247[local255], true);
										}
										Static197.aClass211_24.method5529((long) local415, local240);
									}
								}
								if (local240 != null && local240.length == 4) {
									local407 = local240[local41.aBoolean646 ? 3 : 1];
									local398 = local240[local41.aBoolean646 ? 2 : 0];
								}
							}
							@Pc(507) int local507 = local41.anInt7643 - Static129.anInt10429;
							if (local41.anInt7635 < local507) {
								local507 -= local41.anInt7635;
								local255 = local41.anInt7595 == 0 ? 0 : local41.anInt7595 * ((local41.anInt7637 - local507) / local41.anInt7595);
								local545 = local398.QA() * local255 / local41.anInt7637;
							} else {
								local545 = local398.QA();
							}
							local255 = local398.b();
							local181 -= local255;
							local331 = Static580.anIntArray664[0] + arg2 - (local398.QA() >> 1);
							local398.method7076(local331, local181);
							Static546.aClass15_16.Q(local331, local181, local331 + local545, local255 + local181);
							local407.method7076(local331, local181);
							local181 -= 2;
							Static546.aClass15_16.ca(arg2, arg1, arg2 + arg0, arg1 + arg3);
						}
						if (local5 > local22) {
							@Pc(638) Class2_Sub2_Sub1_Sub1 local638 = (Class2_Sub2_Sub1_Sub1) local41;
							if (local638.anInt2187 != -1) {
								local181 -= 25;
								Static561.aClass37Array14[local638.anInt2187].method7076(Static580.anIntArray664[0] + arg2 - 12, local181);
								local181 -= 2;
							}
							if (local638.anInt2189 != -1) {
								local181 -= 25;
								Static326.aClass37Array6[local638.anInt2189].method7076(arg2 + Static580.anIntArray664[0] - 12, local181);
								local181 -= 2;
							}
						} else if (local25.anInt4977 >= 0 && local25.anInt4977 < Static326.aClass37Array6.length) {
							local181 -= 25;
							local398 = Static326.aClass37Array6[local25.anInt4977];
							local398.method7076(Static580.anIntArray664[0] + arg2 - (local398.QA() >> 1), local181);
							local181 -= 2;
						}
					}
					@Pc(689) Class357[] local689;
					@Pc(696) Class357 local696;
					if (!(local41 instanceof Class2_Sub2_Sub1_Sub1)) {
						local210 = 0;
						local689 = Static516.aClass357Array3;
						for (local415 = 0; local415 < local689.length; local415++) {
							local696 = local689[local415];
							if (local696 != null && local696.anInt10299 == 1 && Static304.anIntArray377[local22 - local5] == local696.anInt10302) {
								local302 = Static78.aClass37Array3[local696.anInt10304];
								if (local302.b() > local210) {
									local210 = local302.b();
								}
								if (Static129.anInt10429 % 20 < 10) {
									local302.method7076(Static580.anIntArray664[0] + arg2 - 12, local181 + -local302.b());
								}
							}
						}
						if (local210 > 0) {
						}
					} else if (local22 >= 0) {
						local210 = 0;
						local689 = Static516.aClass357Array3;
						for (local415 = 0; local415 < local689.length; local415++) {
							local696 = local689[local415];
							if (local696 != null && local696.anInt10299 == 10 && local696.anInt10302 == local9[local22]) {
								local302 = Static78.aClass37Array3[local696.anInt10304];
								if (local210 < local302.b()) {
									local210 = local302.b();
								}
								local302.method7076(arg2 + Static580.anIntArray664[0] - 12, -local302.b() + local181);
							}
						}
						if (local210 > 0) {
						}
					}
					for (local210 = 0; local210 < 4; local210++) {
						if (local41.anIntArray483[local210] > Static129.anInt10429) {
							local846 = local41.method6303() / 2;
							Static359.method5948(local41, local846, arg0 >> 1, arg3 >> 1);
							if (Static580.anIntArray664[0] > -1) {
								local415 = Static582.aClass37Array16[local41.anIntArray485[local210]].QA();
								if (local210 == 1) {
									Static580.anIntArray664[1] -= 20;
								}
								if (local210 == 2) {
									Static580.anIntArray664[1] -= 10;
									Static580.anIntArray664[0] -= local415 - 9;
								}
								if (local210 == 3) {
									Static580.anIntArray664[1] -= 10;
									Static580.anIntArray664[0] += local415 - 9;
								}
								Static582.aClass37Array16[local41.anIntArray485[local210]].method7076(Static580.anIntArray664[0] + arg2 - (local415 >> 1), Static580.anIntArray664[1] + -12 + arg1);
								Static598.aClass111_14.method6681(-1, arg1 + Static580.anIntArray664[1] + 3, Integer.toString(local41.anIntArray486[local210]), arg2 + Static580.anIntArray664[0] - 1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(993) int local993;
		for (@Pc(988) int local988 = 0; local988 < Static471.anInt8842; local988++) {
			local993 = Static527.anIntArray508[local988];
			@Pc(1002) Class2_Sub2_Sub1 local1002;
			if (local993 < 2048) {
				local1002 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local993];
			} else {
				local1002 = ((Class3_Sub46) Static331.aClass25_25.method946((long) (local993 - 2048))).aClass2_Sub2_Sub1_Sub2_2;
			}
			local210 = Static55.anIntArray77[local988];
			@Pc(1034) Class2_Sub2_Sub1 local1034;
			if (local210 >= 2048) {
				local1034 = ((Class3_Sub46) Static331.aClass25_25.method946((long) (local210 - 2048))).aClass2_Sub2_Sub1_Sub2_2;
			} else {
				local1034 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local210];
			}
			Static172.method7111(arg3, arg2, --local1002.anInt7642, arg0, arg1, local1034, local1002);
		}
		local993 = Static9.aClass297_1.anInt8936 + Static9.aClass297_1.anInt8935 + 2;
		for (local181 = 0; local181 < Static62.anInt1611; local181++) {
			local210 = Static276.anIntArray354[local181];
			local846 = Static276.anIntArray353[local181];
			local415 = Static276.anIntArray359[local181];
			@Pc(1089) boolean local1089 = true;
			while (local1089) {
				local1089 = false;
				for (local545 = 0; local545 < local181; local545++) {
					if (local846 + 2 > Static276.anIntArray353[local545] + -local993 && Static276.anIntArray353[local545] + 2 > local846 - local993 && local210 - local415 < Static276.anIntArray354[local545] - -Static276.anIntArray359[local545] && local415 + local210 > Static276.anIntArray354[local545] + -Static276.anIntArray359[local545] && Static276.anIntArray353[local545] - local993 < local846) {
						local846 = Static276.anIntArray353[local545] - local993;
						local1089 = true;
					}
				}
			}
			Static276.anIntArray353[local181] = local846;
			@Pc(1182) String local1182 = Static276.aStringArray23[local181];
			if (Static133.anInt3191 == 0) {
				local255 = 16776960;
				if (Static276.anIntArray357[local181] < 6) {
					local255 = Static559.anIntArray648[Static276.anIntArray357[local181]];
				}
				if (Static276.anIntArray357[local181] == 6) {
					local255 = Static453.anInt8598 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static276.anIntArray357[local181] == 7) {
					local255 = Static453.anInt8598 % 20 >= 10 ? 65535 : 255;
				}
				if (Static276.anIntArray357[local181] == 8) {
					local255 = Static453.anInt8598 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static276.anIntArray357[local181] == 9) {
					local331 = 150 - Static276.anIntArray356[local181];
					if (local331 < 50) {
						local255 = local331 * 1280 + 16711680;
					} else if (local331 < 100) {
						local255 = 16776960 - (local331 - 50) * 327680;
					} else if (local331 < 150) {
						local255 = (local331 - 100) * 5 + 65280;
					}
				}
				if (Static276.anIntArray357[local181] == 10) {
					local331 = 150 - Static276.anIntArray356[local181];
					if (local331 < 50) {
						local255 = local331 * 5 + 16711680;
					} else if (local331 < 100) {
						local255 = 33095935 - local331 * 327680;
					} else if (local331 < 150) {
						local255 = local331 * 327680 + 755 - local331 * 5 - 32768000;
					}
				}
				if (Static276.anIntArray357[local181] == 11) {
					local331 = 150 - Static276.anIntArray356[local181];
					if (local331 < 50) {
						local255 = 16777215 - local331 * 327685;
					} else if (local331 < 100) {
						local255 = (local331 - 50) * 327685 + 65280;
					} else if (local331 < 150) {
						local255 = 16777215 - (local331 - 100) * 327680;
					}
				}
				local331 = local255 | 0xFF000000;
				if (Static276.anIntArray358[local181] == 0) {
					Static162.aClass111_6.method6681(local331, arg1 + local846, local1182, arg2 + local210, -16777216);
				}
				if (Static276.anIntArray358[local181] == 1) {
					Static162.aClass111_6.method6673(arg1 + local846, local1182, local331, Static453.anInt8598, arg2 + local210);
				}
				if (Static276.anIntArray358[local181] == 2) {
					Static162.aClass111_6.method6672(local1182, local331, Static453.anInt8598, arg1 + local846, arg2 - -local210);
				}
				if (Static276.anIntArray358[local181] == 3) {
					Static162.aClass111_6.method6685(local331, 150 - Static276.anIntArray356[local181], local210 + arg2, Static453.anInt8598, local846 + arg1, local1182);
				}
				@Pc(1532) int local1532;
				if (Static276.anIntArray358[local181] == 4) {
					local1532 = (150 - Static276.anIntArray356[local181]) * (Static9.aClass297_1.method7314(local1182) - -100) / 150;
					Static546.aClass15_16.Q(arg2 + local210 - 50, arg1, arg2 + local210 + 50, arg1 + arg3);
					Static162.aClass111_6.method6675(local1182, local210 + arg2 + 50 - local1532, arg1 - -local846, local331, -16777216);
					Static546.aClass15_16.ca(arg2, arg1, arg2 + arg0, arg1 + arg3);
				}
				if (Static276.anIntArray358[local181] == 5) {
					local1532 = 150 - Static276.anIntArray356[local181];
					@Pc(1592) int local1592 = 0;
					if (local1532 < 25) {
						local1592 = local1532 - 25;
					} else if (local1532 > 125) {
						local1592 = local1532 - 125;
					}
					@Pc(1614) int local1614 = Static9.aClass297_1.anInt8936 + Static9.aClass297_1.anInt8935;
					Static546.aClass15_16.Q(arg2, arg1 + local846 - local1614 - 1, arg0 + arg2, local846 + arg1 + 5);
					Static162.aClass111_6.method6681(local331, local1592 + local846 + arg1, local1182, arg2 + local210, -16777216);
					Static546.aClass15_16.ca(arg2, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Static162.aClass111_6.method6681(-256, arg1 + local846, local1182, arg2 + local210, -16777216);
			}
		}
	}
}
