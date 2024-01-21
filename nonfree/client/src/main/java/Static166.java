import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!v;")
	public static Class3_Sub3_Sub2_Sub4_Sub1 aClass3_Sub3_Sub2_Sub4_Sub1_7;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1601 = Static193.method3027("mapfunction");

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1602 = Static193.method3027(" ");

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z[Lclient!pd;)V")
	public static void method2463(@OriginalArg(1) Class77[] arg0) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static17.aByteArrayArrayArray2[local7][local11][local15] & 0x1) == 1) {
						@Pc(32) int local32 = local7;
						if ((Static17.aByteArrayArrayArray2[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method2162(local15, local11);
						}
					}
				}
			}
		}
		Static132.anInt2576 += (int) (Math.random() * 5.0D) - 2;
		Static183.anInt2960 += (int) (Math.random() * 5.0D) - 2;
		if (Static183.anInt2960 < -16) {
			Static183.anInt2960 = -16;
		}
		if (Static183.anInt2960 > 16) {
			Static183.anInt2960 = 16;
		}
		if (Static132.anInt2576 < -8) {
			Static132.anInt2576 = -8;
		}
		local15 = Static183.anInt2960 >> 1;
		if (Static132.anInt2576 > 8) {
			Static132.anInt2576 = 8;
		}
		local11 = Static132.anInt2576 >> 2 << 10;
		@Pc(122) int[][] local122 = new int[104][104];
		@Pc(126) int[][] local126 = new int[104][104];
		@Pc(142) int local142;
		@Pc(148) int local148;
		@Pc(150) int local150;
		@Pc(154) int local154;
		@Pc(245) int local245;
		@Pc(200) int local200;
		@Pc(179) int local179;
		@Pc(213) int local213;
		@Pc(223) int local223;
		@Pc(217) int local217;
		@Pc(229) int local229;
		@Pc(294) int local294;
		@Pc(511) int local511;
		@Pc(515) int local515;
		@Pc(843) int local843;
		for (@Pc(128) int local128 = 0; local128 < 4; local128++) {
			@Pc(138) byte[][] local138 = Static119.aByteArrayArrayArray12[local128];
			local142 = (int) Math.sqrt(5100.0D);
			local148 = local142 * 768 >> 8;
			for (local150 = 1; local150 < 103; local150++) {
				for (local154 = 1; local154 < 103; local154++) {
					local179 = Static23.anIntArrayArrayArray4[local128][local154][local150 + 1] - Static23.anIntArrayArrayArray4[local128][local154][local150 - 1];
					local200 = Static23.anIntArrayArrayArray4[local128][local154 + 1][local150] - Static23.anIntArrayArrayArray4[local128][local154 - 1][local150];
					local213 = (int) Math.sqrt((double) (local179 * local179 + local200 * local200 + 65536));
					local217 = -65536 / local213;
					local223 = (local200 << 8) / local213;
					local229 = (local179 << 8) / local213;
					local245 = (local223 * -50 + local217 * -10 + local229 * -50) / local148 + 74;
					local294 = (local138[local154][local150] >> 1) + (local138[local154][local150 + 1] >> 3) + (local138[local154 + 1][local150] >> 3) + (local138[local154 - 1][local150] >> 2) + (local138[local154][local150 + -1] >> 2);
					local126[local154][local150] = local245 - local294;
				}
			}
			for (local154 = 0; local154 < 104; local154++) {
				Static9.anIntArray17[local154] = 0;
				Static138.anIntArray202[local154] = 0;
				Static207.anIntArray374[local154] = 0;
				Static184.anIntArray322[local154] = 0;
				Static183.anIntArray206[local154] = 0;
			}
			for (local245 = -5; local245 < 104; local245++) {
				for (local200 = 0; local200 < 104; local200++) {
					local179 = local245 + 5;
					@Pc(415) int local415;
					if (local179 < 104) {
						local213 = Static35.aByteArrayArrayArray3[local128][local179][local200] & 0xFF;
						if (local213 > 0) {
							@Pc(379) Class3_Sub3_Sub23 local379 = Static15.method295(local213 - 1);
							Static9.anIntArray17[local200] += local379.anInt3905;
							Static138.anIntArray202[local200] += local379.anInt3917;
							Static207.anIntArray374[local200] += local379.anInt3906;
							Static184.anIntArray322[local200] += local379.anInt3913;
							local415 = Static183.anIntArray206[local200]++;
						}
					}
					local213 = local245 - 5;
					if (local213 >= 0) {
						local223 = Static35.aByteArrayArrayArray3[local128][local213][local200] & 0xFF;
						if (local223 > 0) {
							@Pc(448) Class3_Sub3_Sub23 local448 = Static15.method295(local223 - 1);
							Static9.anIntArray17[local200] -= local448.anInt3905;
							Static138.anIntArray202[local200] -= local448.anInt3917;
							Static207.anIntArray374[local200] -= local448.anInt3906;
							Static184.anIntArray322[local200] -= local448.anInt3913;
							local415 = Static183.anIntArray206[local200]--;
						}
					}
				}
				if (local245 >= 0) {
					local179 = 0;
					local223 = 0;
					local213 = 0;
					local217 = 0;
					local229 = 0;
					for (local294 = -5; local294 < 104; local294++) {
						local511 = local294 + 5;
						local515 = local294 - 5;
						if (local511 < 104) {
							local179 += Static9.anIntArray17[local511];
							local213 += Static138.anIntArray202[local511];
							local223 += Static207.anIntArray374[local511];
							local217 += Static184.anIntArray322[local511];
							local229 += Static183.anIntArray206[local511];
						}
						if (local515 >= 0) {
							local179 -= Static9.anIntArray17[local515];
							local223 -= Static207.anIntArray374[local515];
							local229 -= Static183.anIntArray206[local515];
							local213 -= Static138.anIntArray202[local515];
							local217 -= Static184.anIntArray322[local515];
						}
						if (local294 >= 0 && local229 > 0) {
							local122[local245][local294] = Static113.method1644(local179 * 256 / local217, local213 / local229, local223 / local229);
						}
					}
				}
			}
			for (local200 = 1; local200 < 103; local200++) {
				for (local179 = 1; local179 < 103; local179++) {
					if (!Static50.aBoolean66 || (Static17.aByteArrayArrayArray2[0][local200][local179] & 0x2) != 0 || (Static17.aByteArrayArrayArray2[local128][local200][local179] & 0x10) == 0 && Static83.method1195(local179, local200, local128) == Static182.anInt3727) {
						if (Static160.anInt3303 > local128) {
							Static160.anInt3303 = local128;
						}
						local223 = Static103.aByteArrayArrayArray9[local128][local200][local179] & 0xFF;
						local213 = Static35.aByteArrayArrayArray3[local128][local200][local179] & 0xFF;
						if (local213 > 0 || local223 > 0) {
							local217 = Static23.anIntArrayArrayArray4[local128][local200][local179];
							local229 = Static23.anIntArrayArrayArray4[local128][local200 + 1][local179];
							local294 = Static23.anIntArrayArrayArray4[local128][local200 + 1][local179 + 1];
							local511 = Static23.anIntArrayArrayArray4[local128][local200][local179 + 1];
							if (local128 > 0) {
								@Pc(744) boolean local744 = true;
								if (local213 == 0 && Static60.aByteArrayArrayArray15[local128][local200][local179] != 0) {
									local744 = false;
								}
								if (local223 > 0 && !Static102.method1456(local223 - 1).aBoolean143) {
									local744 = false;
								}
								if (local744 && local217 == local229 && local217 == local294 && local511 == local217) {
									Static41.anIntArrayArrayArray5[local128][local200][local179] |= 0x924;
								}
							}
							@Pc(812) int local812;
							@Pc(836) int local836;
							if (local213 > 0) {
								local515 = local122[local200][local179];
								local812 = local15 + (local515 & 0x7F);
								if (local812 < 0) {
									local812 = 0;
								} else if (local812 > 127) {
									local812 = 127;
								}
								local836 = (local515 & 0x380) + (local11 + local515 & 0xFC00) + local812;
								local843 = Static177.anIntArray299[Static159.method2396(96, local836)];
							} else {
								local515 = -1;
								local843 = 0;
							}
							local812 = local126[local200][local179];
							local836 = local126[local200 + 1][local179];
							@Pc(873) int local873 = local126[local200 + 1][local179 + 1];
							@Pc(881) int local881 = local126[local200][local179 + 1];
							if (local223 == 0) {
								Static61.method942(local128, local200, local179, 0, 0, -1, local217, local229, local294, local511, Static159.method2396(local812, local515), Static159.method2396(local836, local515), Static159.method2396(local873, local515), Static159.method2396(local881, local515), 0, 0, 0, 0, local843, 0);
							} else {
								@Pc(893) int local893 = Static60.aByteArrayArrayArray15[local128][local200][local179] + 1;
								@Pc(901) byte local901 = Static153.aByteArrayArrayArray14[local128][local200][local179];
								@Pc(907) Class3_Sub3_Sub19 local907 = Static102.method1456(local223 - 1);
								@Pc(910) int local910 = local907.anInt3081;
								if (local910 >= 0 && !Static177.anInterface1_7.method564(local910)) {
									local910 = -1;
								}
								@Pc(926) int local926;
								@Pc(936) int local936;
								@Pc(958) int local958;
								@Pc(984) int local984;
								if (local910 >= 0) {
									local926 = -1;
									local936 = Static177.anIntArray299[Static114.method1646(Static177.anInterface1_7.method561(local910), 96)];
								} else if (local907.anInt3084 == -1) {
									local926 = -2;
									local936 = 0;
								} else {
									local926 = local907.anInt3084;
									local958 = local15 + (local926 & 0x7F);
									if (local958 < 0) {
										local958 = 0;
									} else if (local958 > 127) {
										local958 = 127;
									}
									local984 = (local11 + local926 & 0xFC00) + (local926 & 0x380) + local958;
									local936 = Static177.anIntArray299[Static114.method1646(local984, 96)];
								}
								if (local907.anInt3080 >= 0) {
									local958 = local907.anInt3080;
									local984 = local15 + (local958 & 0x7F);
									if (local984 < 0) {
										local984 = 0;
									} else if (local984 > 127) {
										local984 = 127;
									}
									@Pc(1036) int local1036 = (local11 + local958 & 0xFC00) - (-(local958 & 0x380) - local984);
									local936 = Static177.anIntArray299[Static114.method1646(local1036, 96)];
								}
								Static61.method942(local128, local200, local179, local893, local901, local910, local217, local229, local294, local511, Static159.method2396(local812, local515), Static159.method2396(local836, local515), Static159.method2396(local873, local515), Static159.method2396(local881, local515), Static114.method1646(local926, local812), Static114.method1646(local926, local836), Static114.method1646(local926, local873), Static114.method1646(local926, local881), local843, local936);
							}
						}
					}
				}
			}
			for (local179 = 1; local179 < 103; local179++) {
				for (local213 = 1; local213 < 103; local213++) {
					Static176.method2729(local128, local213, local179, Static83.method1195(local179, local213, local128));
				}
			}
			Static35.aByteArrayArrayArray3[local128] = null;
			Static103.aByteArrayArrayArray9[local128] = null;
			Static60.aByteArrayArrayArray15[local128] = null;
			Static153.aByteArrayArrayArray14[local128] = null;
			Static119.aByteArrayArrayArray12[local128] = null;
		}
		Static112.method1611();
		@Pc(1196) int local1196;
		for (@Pc(1192) int local1192 = 0; local1192 < 104; local1192++) {
			for (local1196 = 0; local1196 < 104; local1196++) {
				if ((Static17.aByteArrayArrayArray2[1][local1192][local1196] & 0x2) == 2) {
					Static105.method1477(local1192, local1196);
				}
			}
		}
		@Pc(1231) int local1231 = 2;
		local1196 = 1;
		local142 = 4;
		for (local148 = 0; local148 < 4; local148++) {
			if (local148 > 0) {
				local1231 <<= 0x3;
				local1196 <<= 0x3;
				local142 <<= 0x3;
			}
			for (local150 = 0; local150 <= local148; local150++) {
				for (local154 = 0; local154 <= 104; local154++) {
					for (local245 = 0; local245 <= 104; local245++) {
						if ((Static41.anIntArrayArrayArray5[local150][local245][local154] & local1196) != 0) {
							local200 = local154;
							local213 = local150;
							for (local179 = local154; local179 < 104 && (Static41.anIntArrayArrayArray5[local150][local245][local179 + 1] & local1196) != 0; local179++) {
							}
							local223 = local150;
							while (local200 > 0 && (Static41.anIntArrayArrayArray5[local150][local245][local200 - 1] & local1196) != 0) {
								local200--;
							}
							label350: while (local213 > 0) {
								for (local217 = local200; local217 <= local179; local217++) {
									if ((local1196 & Static41.anIntArrayArrayArray5[local213 - 1][local245][local217]) == 0) {
										break label350;
									}
								}
								local213--;
							}
							label339: while (local148 > local223) {
								for (local217 = local200; local217 <= local179; local217++) {
									if ((local1196 & Static41.anIntArrayArrayArray5[local223 + 1][local245][local217]) == 0) {
										break label339;
									}
								}
								local223++;
							}
							local217 = (local179 + 1 - local200) * (local223 + (1 - local213));
							if (local217 >= 8) {
								local294 = Static23.anIntArrayArrayArray4[local223][local245][local200] - 240;
								local511 = Static23.anIntArrayArrayArray4[local213][local245][local200];
								Static111.method1605(local148, 1, local245 * 128, local245 * 128, local200 * 128, local179 * 128 + 128, local294, local511);
								for (local515 = local213; local515 <= local223; local515++) {
									for (local843 = local200; local843 <= local179; local843++) {
										Static41.anIntArrayArrayArray5[local515][local245][local843] &= ~local1196;
									}
								}
							}
						}
						if ((local1231 & Static41.anIntArrayArrayArray5[local150][local245][local154]) != 0) {
							local200 = local245;
							local213 = local150;
							while (local200 > 0 && (Static41.anIntArrayArrayArray5[local150][local200 - 1][local154] & local1231) != 0) {
								local200--;
							}
							local223 = local150;
							for (local179 = local245; local179 < 104 && (Static41.anIntArrayArrayArray5[local150][local179 + 1][local154] & local1231) != 0; local179++) {
							}
							label404: while (local213 > 0) {
								for (local217 = local200; local217 <= local179; local217++) {
									if ((Static41.anIntArrayArrayArray5[local213 - 1][local217][local154] & local1231) == 0) {
										break label404;
									}
								}
								local213--;
							}
							label393: while (local148 > local223) {
								for (local217 = local200; local217 <= local179; local217++) {
									if ((Static41.anIntArrayArrayArray5[local223 + 1][local217][local154] & local1231) == 0) {
										break label393;
									}
								}
								local223++;
							}
							local217 = (local223 + 1 - local213) * (local179 + 1 - local200);
							if (local217 >= 8) {
								local511 = Static23.anIntArrayArrayArray4[local213][local200][local154];
								local294 = Static23.anIntArrayArrayArray4[local223][local200][local154] - 240;
								Static111.method1605(local148, 2, local200 * 128, local179 * 128 + 128, local154 * 128, local154 * 128, local294, local511);
								for (local515 = local213; local515 <= local223; local515++) {
									for (local843 = local200; local843 <= local179; local843++) {
										Static41.anIntArrayArrayArray5[local515][local843][local154] &= ~local1231;
									}
								}
							}
						}
						if ((local142 & Static41.anIntArrayArrayArray5[local150][local245][local154]) != 0) {
							local179 = local245;
							local200 = local245;
							for (local213 = local154; local213 > 0 && (Static41.anIntArrayArrayArray5[local150][local245][local213 - 1] & local142) != 0; local213--) {
							}
							for (local223 = local154; local223 < 104 && (Static41.anIntArrayArrayArray5[local150][local245][local223 + 1] & local142) != 0; local223++) {
							}
							label458: while (local200 > 0) {
								for (local217 = local213; local217 <= local223; local217++) {
									if ((local142 & Static41.anIntArrayArrayArray5[local150][local200 - 1][local217]) == 0) {
										break label458;
									}
								}
								local200--;
							}
							label447: while (local179 < 104) {
								for (local217 = local213; local217 <= local223; local217++) {
									if ((local142 & Static41.anIntArrayArrayArray5[local150][local179 + 1][local217]) == 0) {
										break label447;
									}
								}
								local179++;
							}
							if ((local223 + 1 - local213) * ((local179 + 1) - local200) >= 4) {
								local217 = Static23.anIntArrayArrayArray4[local150][local200][local213];
								Static111.method1605(local148, 4, local200 * 128, local179 * 128 + 128, local213 * 128, local223 * 128 + 128, local217, local217);
								for (local229 = local200; local229 <= local179; local229++) {
									for (local294 = local213; local294 <= local223; local294++) {
										Static41.anIntArrayArrayArray5[local150][local229][local294] &= ~local142;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public static void method2464(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static126.method1762(arg0)) {
			return;
		}
		@Pc(18) Class6[] local18 = Static49.aClass6ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
			@Pc(34) Class6 local34 = local18[local28];
			if (local34.anObjectArray26 != null) {
				@Pc(41) Class3_Sub26 local41 = new Class3_Sub26();
				local41.aClass6_116 = local34;
				local41.anObjectArray29 = local34.anObjectArray26;
				Static19.method318(local41, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!b;I)V")
	public static void method2466(@OriginalArg(0) Class6 arg0) {
		@Pc(6) int local6 = arg0.anInt274;
		if (local6 == 324) {
			if (Static68.anInt1389 == -1) {
				Static56.anInt1198 = arg0.anInt199;
				Static68.anInt1389 = arg0.anInt252;
			}
			if (Static109.aClass101_2.aBoolean189) {
				arg0.anInt252 = Static68.anInt1389;
			} else {
				arg0.anInt252 = Static56.anInt1198;
			}
		} else if (local6 == 325) {
			if (Static68.anInt1389 == -1) {
				Static68.anInt1389 = arg0.anInt252;
				Static56.anInt1198 = arg0.anInt199;
			}
			if (Static109.aClass101_2.aBoolean189) {
				arg0.anInt252 = Static56.anInt1198;
			} else {
				arg0.anInt252 = Static68.anInt1389;
			}
		} else if (local6 == 327) {
			arg0.anInt263 = 150;
			arg0.anInt200 = (int) (Math.sin((double) Static184.anInt3760 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt201 = -1;
			arg0.anInt224 = 5;
		} else if (local6 == 328) {
			if (Static144.aClass26_Sub2_Sub1_1.aClass70_952 == null) {
				arg0.anInt201 = 0;
			} else {
				arg0.anInt263 = 150;
				arg0.anInt200 = (int) (Math.sin((double) Static184.anInt3760 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt224 = 5;
				arg0.anInt201 = ((int) Static144.aClass26_Sub2_Sub1_1.aClass70_952.method2018() << 11) + 2047;
				arg0.anInt248 = Static144.aClass26_Sub2_Sub1_1.anInt2596;
				arg0.anInt265 = Static144.aClass26_Sub2_Sub1_1.anInt2623;
			}
		}
	}
}
