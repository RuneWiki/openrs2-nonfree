import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "[[[Lclient!eg;")
	private static Class2_Sub7[][][] aClass2_Sub7ArrayArrayArray3;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "Lclient!nb;")
	public static Class15 aClass15_17;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "[[Lclient!q;")
	public static Class80[][] aClass80ArrayArray1;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "Lclient!ea;")
	public static Class2_Sub3 aClass2_Sub3_3 = new Class2_Sub3(8);

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "Lclient!i;")
	public static Class41 aClass41_560 = Static184.method2923("");

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!i;")
	public static Class41 aClass41_561 = null;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "[I")
	public static int[] anIntArray170 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_562 = Static184.method2923("::gc");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Lclient!fh;")
	public static Class35 method1241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass35_1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZ[Lclient!ia;)V")
	public static void method1242(@OriginalArg(2) Class42[] arg0) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		for (local9 = 0; local9 < 4; local9++) {
			for (local13 = 0; local13 < 104; local13++) {
				for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
					if ((Static102.aByteArrayArrayArray7[local9][local13][local17] & 0x1) == 1) {
						@Pc(32) int local32 = local9;
						if ((Static102.aByteArrayArrayArray7[1][local13][local17] & 0x2) == 2) {
							local32 = local9 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method1441(local17, local13);
						}
					}
				}
			}
		}
		Static62.anInt1674 += (int) (Math.random() * 5.0D) - 2;
		Static193.anInt3917 += (int) (Math.random() * 5.0D) - 2;
		if (Static193.anInt3917 < -8) {
			Static193.anInt3917 = -8;
		}
		if (Static193.anInt3917 > 8) {
			Static193.anInt3917 = 8;
		}
		if (Static62.anInt1674 < -16) {
			Static62.anInt1674 = -16;
		}
		if (Static62.anInt1674 > 16) {
			Static62.anInt1674 = 16;
		}
		local13 = Static62.anInt1674 >> 1;
		local9 = Static193.anInt3917 >> 2 << 10;
		@Pc(134) int[][] local134 = new int[104][104];
		@Pc(138) int[][] local138 = new int[104][104];
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(162) int local162;
		@Pc(166) int local166;
		@Pc(257) int local257;
		@Pc(191) int local191;
		@Pc(211) int local211;
		@Pc(225) int local225;
		@Pc(231) int local231;
		@Pc(235) int local235;
		@Pc(241) int local241;
		@Pc(305) int local305;
		@Pc(521) int local521;
		@Pc(525) int local525;
		@Pc(861) int local861;
		for (@Pc(140) int local140 = 0; local140 < 4; local140++) {
			@Pc(146) byte[][] local146 = Static97.aByteArrayArrayArray6[local140];
			local154 = (int) Math.sqrt(5100.0D);
			local160 = local154 * 768 >> 8;
			for (local162 = 1; local162 < 103; local162++) {
				for (local166 = 1; local166 < 103; local166++) {
					local191 = Static56.anIntArrayArrayArray7[local140][local166 + 1][local162] - Static56.anIntArrayArrayArray7[local140][local166 - 1][local162];
					local211 = Static56.anIntArrayArrayArray7[local140][local166][local162 + 1] - Static56.anIntArrayArrayArray7[local140][local166][local162 - 1];
					local225 = (int) Math.sqrt((double) (local191 * local191 + local211 * local211 + 65536));
					local231 = (local191 << 8) / local225;
					local235 = -65536 / local225;
					local241 = (local211 << 8) / local225;
					local257 = (local231 * -50 + local235 * -10 + local241 * -50) / local160 + 74;
					local305 = (local146[local166][local162] >> 1) + (local146[local166][local162 + 1] >> 3) + (local146[local166][local162 + -1] >> 2) + (local146[local166 + 1][local162] >> 3) + (local146[local166 + -1][local162] >> 2);
					local138[local166][local162] = local257 - local305;
				}
			}
			for (local166 = 0; local166 < 104; local166++) {
				Static74.anIntArray194[local166] = 0;
				Static196.anIntArray462[local166] = 0;
				Static141.anIntArray337[local166] = 0;
				Static196.anIntArray463[local166] = 0;
				Static136.anIntArray332[local166] = 0;
			}
			for (local257 = -5; local257 < 104; local257++) {
				for (local191 = 0; local191 < 104; local191++) {
					local211 = local257 + 5;
					@Pc(423) int local423;
					if (local211 < 104) {
						local225 = Static147.aByteArrayArrayArray9[local140][local211][local191] & 0xFF;
						if (local225 > 0) {
							@Pc(387) Class2_Sub2_Sub26 local387 = Static27.method1636(local225 - 1);
							Static74.anIntArray194[local191] += local387.anInt4695;
							Static196.anIntArray462[local191] += local387.anInt4688;
							Static141.anIntArray337[local191] += local387.anInt4690;
							Static196.anIntArray463[local191] += local387.anInt4686;
							local423 = Static136.anIntArray332[local191]++;
						}
					}
					local225 = local257 - 5;
					if (local225 >= 0) {
						local231 = Static147.aByteArrayArrayArray9[local140][local225][local191] & 0xFF;
						if (local231 > 0) {
							@Pc(456) Class2_Sub2_Sub26 local456 = Static27.method1636(local231 - 1);
							Static74.anIntArray194[local191] -= local456.anInt4695;
							Static196.anIntArray462[local191] -= local456.anInt4688;
							Static141.anIntArray337[local191] -= local456.anInt4690;
							Static196.anIntArray463[local191] -= local456.anInt4686;
							local423 = Static136.anIntArray332[local191]--;
						}
					}
				}
				if (local257 >= 0) {
					local211 = 0;
					local225 = 0;
					local235 = 0;
					local231 = 0;
					local241 = 0;
					for (local305 = -5; local305 < 104; local305++) {
						local521 = local305 + 5;
						local525 = local305 - 5;
						if (local521 < 104) {
							local241 += Static136.anIntArray332[local521];
							local225 += Static196.anIntArray462[local521];
							local231 += Static141.anIntArray337[local521];
							local235 += Static196.anIntArray463[local521];
							local211 += Static74.anIntArray194[local521];
						}
						if (local525 >= 0) {
							local235 -= Static196.anIntArray463[local525];
							local225 -= Static196.anIntArray462[local525];
							local241 -= Static136.anIntArray332[local525];
							local211 -= Static74.anIntArray194[local525];
							local231 -= Static141.anIntArray337[local525];
						}
						if (local305 >= 0 && local241 > 0) {
							local134[local257][local305] = Static143.method2232(local211 * 256 / local235, local231 / local241, local225 / local241);
						}
					}
				}
			}
			for (local191 = 1; local191 < 103; local191++) {
				for (local211 = 1; local211 < 103; local211++) {
					if (!Static217.aBoolean290 || (Static102.aByteArrayArrayArray7[0][local191][local211] & 0x2) != 0 || (Static102.aByteArrayArrayArray7[local140][local191][local211] & 0x10) == 0 && Static208.method3216(local211, local191, local140) == Static142.anInt3258) {
						if (local140 < Static26.anInt660) {
							Static26.anInt660 = local140;
						}
						local225 = Static147.aByteArrayArrayArray9[local140][local191][local211] & 0xFF;
						local231 = Static95.aByteArrayArrayArray5[local140][local191][local211] & 0xFF;
						if (local225 > 0 || local231 > 0) {
							local241 = Static56.anIntArrayArrayArray7[local140][local191 + 1][local211];
							local235 = Static56.anIntArrayArrayArray7[local140][local191][local211];
							local305 = Static56.anIntArrayArrayArray7[local140][local191 + 1][local211 + 1];
							local521 = Static56.anIntArrayArrayArray7[local140][local191][local211 + 1];
							if (local140 > 0) {
								@Pc(755) boolean local755 = true;
								if (local225 == 0 && Static7.aByteArrayArrayArray2[local140][local191][local211] != 0) {
									local755 = false;
								}
								if (local231 > 0 && !Static88.method1559(local231 - 1).aBoolean14) {
									local755 = false;
								}
								if (local755 && local241 == local235 && local305 == local235 && local521 == local235) {
									Static120.anIntArrayArrayArray15[local140][local191][local211] |= 0x924;
								}
							}
							@Pc(829) int local829;
							@Pc(854) int local854;
							if (local225 > 0) {
								local525 = local134[local191][local211];
								local829 = local13 + (local525 & 0x7F);
								if (local829 < 0) {
									local829 = 0;
								} else if (local829 > 127) {
									local829 = 127;
								}
								local854 = local829 + (local525 + local9 & 0xFC00) + (local525 & 0x380);
								local861 = Static155.anIntArray373[Static12.method291(96, local854)];
							} else {
								local525 = -1;
								local861 = 0;
							}
							local829 = local138[local191][local211];
							local854 = local138[local191 + 1][local211];
							@Pc(889) int local889 = local138[local191][local211 + 1];
							@Pc(899) int local899 = local138[local191 + 1][local211 + 1];
							if (local231 == 0) {
								Static11.method282(local140, local191, local211, 0, 0, -1, local235, local241, local305, local521, Static12.method291(local829, local525), Static12.method291(local854, local525), Static12.method291(local899, local525), Static12.method291(local889, local525), 0, 0, 0, 0, local861, 0);
							} else {
								@Pc(914) int local914 = Static7.aByteArrayArrayArray2[local140][local191][local211] + 1;
								@Pc(922) byte local922 = Static208.aByteArrayArrayArray13[local140][local191][local211];
								@Pc(928) Class2_Sub2_Sub2 local928 = Static88.method1559(local231 - 1);
								if (Static217.anIntArrayArray40 != null && local140 == 0) {
									Static217.anIntArrayArray40[local191][local211] = local928.anInt311 + (local928.anInt317 << 24);
								}
								@Pc(949) int local949 = local928.anInt308;
								if (local949 >= 0 && !Static155.anInterface1_1.method1133(local949)) {
									local949 = -1;
								}
								@Pc(962) int local962;
								@Pc(972) int local972;
								@Pc(994) int local994;
								@Pc(1021) int local1021;
								if (local949 >= 0) {
									local962 = -1;
									local972 = Static155.anIntArray373[Static28.method540(96, Static155.anInterface1_1.method1135(local949))];
								} else if (local928.anInt316 == -1) {
									local972 = 0;
									local962 = -2;
								} else {
									local962 = local928.anInt316;
									local994 = (local962 & 0x7F) + local13;
									if (local994 < 0) {
										local994 = 0;
									} else if (local994 > 127) {
										local994 = 127;
									}
									local1021 = local994 + (local962 + local9 & 0xFC00) + (local962 & 0x380);
									local972 = Static155.anIntArray373[Static28.method540(96, local1021)];
								}
								if (local928.anInt312 >= 0) {
									local994 = local928.anInt312;
									local1021 = (local994 & 0x7F) + local13;
									if (local1021 < 0) {
										local1021 = 0;
									} else if (local1021 > 127) {
										local1021 = 127;
									}
									@Pc(1069) int local1069 = local1021 + (local9 + local994 & 0xFC00) + (local994 & 0x380);
									local972 = Static155.anIntArray373[Static28.method540(96, local1069)];
								}
								Static11.method282(local140, local191, local211, local914, local922, local949, local235, local241, local305, local521, Static12.method291(local829, local525), Static12.method291(local854, local525), Static12.method291(local899, local525), Static12.method291(local889, local525), Static28.method540(local829, local962), Static28.method540(local854, local962), Static28.method540(local899, local962), Static28.method540(local889, local962), local861, local972);
							}
						}
					}
				}
			}
			for (local211 = 1; local211 < 103; local211++) {
				for (local225 = 1; local225 < 103; local225++) {
					Static210.method3247(local140, local225, local211, Static208.method3216(local211, local225, local140));
				}
			}
			Static147.aByteArrayArrayArray9[local140] = null;
			Static95.aByteArrayArrayArray5[local140] = null;
			Static7.aByteArrayArrayArray2[local140] = null;
			Static208.aByteArrayArrayArray13[local140] = null;
			Static97.aByteArrayArrayArray6[local140] = null;
		}
		Static153.method2493();
		@Pc(1241) int local1241;
		for (@Pc(1237) int local1237 = 0; local1237 < 104; local1237++) {
			for (local1241 = 0; local1241 < 104; local1241++) {
				if ((Static102.aByteArrayArrayArray7[1][local1237][local1241] & 0x2) == 2) {
					Static142.method2229(local1237, local1241);
				}
			}
		}
		@Pc(1269) int local1269 = 2;
		local1241 = 1;
		local154 = 4;
		for (local160 = 0; local160 < 4; local160++) {
			if (local160 > 0) {
				local1269 <<= 0x3;
				local154 <<= 0x3;
				local1241 <<= 0x3;
			}
			for (local162 = 0; local162 <= local160; local162++) {
				for (local166 = 0; local166 <= 104; local166++) {
					for (local257 = 0; local257 <= 104; local257++) {
						if ((local1241 & Static120.anIntArrayArrayArray15[local162][local257][local166]) != 0) {
							local191 = local166;
							local225 = local162;
							local231 = local162;
							local211 = local166;
							while (local191 > 0 && (Static120.anIntArrayArrayArray15[local162][local257][local191 - 1] & local1241) != 0) {
								local191--;
							}
							while (local211 < 104 && (Static120.anIntArrayArrayArray15[local162][local257][local211 + 1] & local1241) != 0) {
								local211++;
							}
							label356: while (local225 > 0) {
								for (local235 = local191; local235 <= local211; local235++) {
									if ((Static120.anIntArrayArrayArray15[local225 - 1][local257][local235] & local1241) == 0) {
										break label356;
									}
								}
								local225--;
							}
							label345: while (local231 < local160) {
								for (local235 = local191; local235 <= local211; local235++) {
									if ((Static120.anIntArrayArrayArray15[local231 + 1][local257][local235] & local1241) == 0) {
										break label345;
									}
								}
								local231++;
							}
							local235 = (local211 + 1 - local191) * (local231 + 1 - local225);
							if (local235 >= 8) {
								local521 = Static56.anIntArrayArrayArray7[local225][local257][local191];
								local305 = Static56.anIntArrayArrayArray7[local231][local257][local191] - 240;
								Static136.method2168(local160, 1, local257 * 128, local257 * 128, local191 * 128, local211 * 128 + 128, local305, local521);
								for (local525 = local225; local525 <= local231; local525++) {
									for (local861 = local191; local861 <= local211; local861++) {
										Static120.anIntArrayArrayArray15[local525][local257][local861] &= ~local1241;
									}
								}
							}
						}
						if ((local1269 & Static120.anIntArrayArrayArray15[local162][local257][local166]) != 0) {
							local211 = local257;
							for (local191 = local257; local191 > 0 && (local1269 & Static120.anIntArrayArrayArray15[local162][local191 - 1][local166]) != 0; local191--) {
							}
							local225 = local162;
							while (local211 < 104 && (local1269 & Static120.anIntArrayArrayArray15[local162][local211 + 1][local166]) != 0) {
								local211++;
							}
							label410: while (local225 > 0) {
								for (local235 = local191; local235 <= local211; local235++) {
									if ((Static120.anIntArrayArrayArray15[local225 - 1][local235][local166] & local1269) == 0) {
										break label410;
									}
								}
								local225--;
							}
							label398: for (local231 = local162; local231 < local160; local231++) {
								for (local235 = local191; local235 <= local211; local235++) {
									if ((local1269 & Static120.anIntArrayArrayArray15[local231 + 1][local235][local166]) == 0) {
										break label398;
									}
								}
							}
							local235 = (local211 + 1 - local191) * (local231 + 1 - local225);
							if (local235 >= 8) {
								local521 = Static56.anIntArrayArrayArray7[local225][local191][local166];
								local305 = Static56.anIntArrayArrayArray7[local231][local191][local166] - 240;
								Static136.method2168(local160, 2, local191 * 128, local211 * 128 + 128, local166 * 128, local166 * 128, local305, local521);
								for (local525 = local225; local525 <= local231; local525++) {
									for (local861 = local191; local861 <= local211; local861++) {
										Static120.anIntArrayArrayArray15[local525][local861][local166] &= ~local1269;
									}
								}
							}
						}
						if ((local154 & Static120.anIntArrayArrayArray15[local162][local257][local166]) != 0) {
							local211 = local257;
							local191 = local257;
							for (local225 = local166; local225 > 0 && (local154 & Static120.anIntArrayArrayArray15[local162][local257][local225 - 1]) != 0; local225--) {
							}
							for (local231 = local166; local231 < 104 && (local154 & Static120.anIntArrayArrayArray15[local162][local257][local231 + 1]) != 0; local231++) {
							}
							label464: while (local191 > 0) {
								for (local235 = local225; local235 <= local231; local235++) {
									if ((Static120.anIntArrayArrayArray15[local162][local191 - 1][local235] & local154) == 0) {
										break label464;
									}
								}
								local191--;
							}
							label453: while (local211 < 104) {
								for (local235 = local225; local235 <= local231; local235++) {
									if ((local154 & Static120.anIntArrayArrayArray15[local162][local211 + 1][local235]) == 0) {
										break label453;
									}
								}
								local211++;
							}
							if ((local211 + 1 - local191) * (-local225 + 1 + local231) >= 4) {
								local235 = Static56.anIntArrayArrayArray7[local162][local191][local225];
								Static136.method2168(local160, 4, local191 * 128, local211 * 128 + 128, local225 * 128, local231 * 128 + 128, local235, local235);
								for (local241 = local191; local241 <= local211; local241++) {
									for (local305 = local225; local305 <= local231; local305++) {
										Static120.anIntArrayArrayArray15[local162][local241][local305] &= ~local154;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLclient!ea;I)Lclient!i;")
	public static Class41 method1243(@OriginalArg(1) Class2_Sub3 arg0) {
		try {
			@Pc(12) Class41 local12 = new Class41();
			local12.anInt2012 = arg0.method212();
			if (local12.anInt2012 > 32767) {
				local12.anInt2012 = 32767;
			}
			local12.aByteArray26 = new byte[local12.anInt2012];
			arg0.anInt239 += Static98.aClass92_1.method3010(0, local12.aByteArray26, arg0.aByteArray4, local12.anInt2012, arg0.anInt239);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static135.aClass41_862;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)Lclient!i;")
	public static Class41 method1244(@OriginalArg(0) int arg0) {
		return Static177.aClass41Array63[arg0].method1393() <= 0 ? Static59.aClass41Array24[arg0] : Static149.method2324(new Class41[] { Static59.aClass41Array24[arg0], Static209.aClass41_1245, Static177.aClass41Array63[arg0] });
	}
}
