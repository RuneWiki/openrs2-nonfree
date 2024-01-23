import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public static int anInt159;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Z")
	public static boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!ia;")
	public static Class51 aClass51_49 = Static64.method1101(":");

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!ia;")
	public static Class51 aClass51_50 = Static64.method1101("mod_icons");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method97() {
		if (!Static112.method1883() && Static158.anInt3438 != Static197.anInt2422) {
			Static16.method296(Static57.anInt1354, Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], Static39.anInt965, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], Static197.anInt2422);
		} else if (Static15.anInt354 != Static197.anInt2422) {
			Static15.anInt354 = Static197.anInt2422;
			Static127.method2201(Static197.anInt2422);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ[Lclient!q;)V")
	public static void method98(@OriginalArg(2) Class90[] arg0) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		for (local17 = 0; local17 < 4; local17++) {
			for (local21 = 0; local21 < 104; local21++) {
				for (@Pc(25) int local25 = 0; local25 < 104; local25++) {
					if ((Static150.aByteArrayArrayArray9[local17][local21][local25] & 0x1) == 1) {
						@Pc(42) int local42 = local17;
						if ((Static150.aByteArrayArrayArray9[1][local21][local25] & 0x2) == 2) {
							local42 = local17 - 1;
						}
						if (local42 >= 0) {
							arg0[local42].method2714(local25, local21);
						}
					}
				}
			}
		}
		Static150.anInt3259 += (int) (Math.random() * 5.0D) - 2;
		if (Static150.anInt3259 < -16) {
			Static150.anInt3259 = -16;
		}
		if (Static150.anInt3259 > 16) {
			Static150.anInt3259 = 16;
		}
		Static104.anInt2296 += (int) (Math.random() * 5.0D) - 2;
		if (Static104.anInt2296 < -8) {
			Static104.anInt2296 = -8;
		}
		if (Static104.anInt2296 > 8) {
			Static104.anInt2296 = 8;
		}
		local21 = Static150.anInt3259 >> 1;
		@Pc(131) int[][] local131 = new int[104][104];
		@Pc(135) int[][] local135 = new int[104][104];
		local17 = Static104.anInt2296 >> 2 << 10;
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(165) int local165;
		@Pc(169) int local169;
		@Pc(310) int local310;
		@Pc(194) int local194;
		@Pc(215) int local215;
		@Pc(228) int local228;
		@Pc(293) int local293;
		@Pc(287) int local287;
		@Pc(234) int local234;
		@Pc(283) int local283;
		@Pc(521) int local521;
		@Pc(560) int local560;
		@Pc(852) int local852;
		@Pc(821) int local821;
		@Pc(845) int local845;
		for (@Pc(147) int local147 = 0; local147 < 4; local147++) {
			@Pc(153) byte[][] local153 = Static18.aByteArrayArrayArray4[local147];
			local157 = (int) Math.sqrt(5100.0D);
			local163 = local157 * 768 >> 8;
			for (local165 = 1; local165 < 103; local165++) {
				for (local169 = 1; local169 < 103; local169++) {
					local194 = Static20.anIntArrayArrayArray2[local147][local169 + 1][local165] - Static20.anIntArrayArrayArray2[local147][local169 - 1][local165];
					local215 = Static20.anIntArrayArrayArray2[local147][local169][local165 + 1] - Static20.anIntArrayArrayArray2[local147][local169][local165 - 1];
					local228 = (int) Math.sqrt((double) (local215 * local215 + local194 * local194 + 65536));
					local234 = (local215 << 8) / local228;
					local283 = (local153[local169][local165] >> 1) + (local153[local169][local165 + 1] >> 3) + (local153[local169 + 1][local165] >> 3) + (local153[local169 + -1][local165] >> 2) + (local153[local169][local165 + -1] >> 2);
					local287 = -65536 / local228;
					local293 = (local194 << 8) / local228;
					local310 = (local234 * -50 + local293 * -50 + local287 * -10) / local163 + 74;
					local135[local169][local165] = local310 - local283;
				}
			}
			for (local169 = 0; local169 < 104; local169++) {
				Static230.anIntArray380[local169] = 0;
				Static166.anIntArray243[local169] = 0;
				Static186.anIntArray303[local169] = 0;
				Static220.anIntArray360[local169] = 0;
				Static71.anIntArray104[local169] = 0;
			}
			for (local310 = -5; local310 < 104; local310++) {
				for (local194 = 0; local194 < 104; local194++) {
					local215 = local310 + 5;
					@Pc(426) int local426;
					if (local215 < 104) {
						local228 = Static15.aByteArrayArrayArray3[local147][local215][local194] & 0xFF;
						if (local228 > 0) {
							@Pc(390) Class60 local390 = Static79.method1376(local228 - 1);
							Static230.anIntArray380[local194] += local390.anInt2137;
							Static166.anIntArray243[local194] += local390.anInt2145;
							Static186.anIntArray303[local194] += local390.anInt2151;
							Static220.anIntArray360[local194] += local390.anInt2147;
							local426 = Static71.anIntArray104[local194]++;
						}
					}
					local228 = local310 - 5;
					if (local228 >= 0) {
						local293 = Static15.aByteArrayArrayArray3[local147][local228][local194] & 0xFF;
						if (local293 > 0) {
							@Pc(456) Class60 local456 = Static79.method1376(local293 - 1);
							Static230.anIntArray380[local194] -= local456.anInt2137;
							Static166.anIntArray243[local194] -= local456.anInt2145;
							Static186.anIntArray303[local194] -= local456.anInt2151;
							Static220.anIntArray360[local194] -= local456.anInt2147;
							local426 = Static71.anIntArray104[local194]--;
						}
					}
				}
				if (local310 >= 0) {
					local215 = 0;
					local228 = 0;
					local287 = 0;
					local234 = 0;
					local293 = 0;
					for (local283 = -5; local283 < 104; local283++) {
						local521 = local283 + 5;
						if (local521 < 104) {
							local293 += Static186.anIntArray303[local521];
							local228 += Static166.anIntArray243[local521];
							local215 += Static230.anIntArray380[local521];
							local287 += Static220.anIntArray360[local521];
							local234 += Static71.anIntArray104[local521];
						}
						local560 = local283 - 5;
						if (local560 >= 0) {
							local228 -= Static166.anIntArray243[local560];
							local293 -= Static186.anIntArray303[local560];
							local215 -= Static230.anIntArray380[local560];
							local234 -= Static71.anIntArray104[local560];
							local287 -= Static220.anIntArray360[local560];
						}
						if (local283 >= 0 && local234 > 0) {
							local131[local310][local283] = Static139.method2458(local228 / local234, local215 * 256 / local287, local293 / local234);
						}
					}
				}
			}
			for (local194 = 1; local194 < 103; local194++) {
				for (local215 = 1; local215 < 103; local215++) {
					if (Static112.method1883() || (Static150.aByteArrayArrayArray9[0][local194][local215] & 0x2) != 0 || (Static150.aByteArrayArrayArray9[local147][local194][local215] & 0x10) == 0 && Static200.method3304(local147, local215, local194) == Static158.anInt3438) {
						if (Static185.anInt4013 > local147) {
							Static185.anInt4013 = local147;
						}
						local228 = Static15.aByteArrayArrayArray3[local147][local194][local215] & 0xFF;
						local293 = Static229.aByteArrayArrayArray15[local147][local194][local215] & 0xFF;
						if (local228 > 0 || local293 > 0) {
							local287 = Static20.anIntArrayArrayArray2[local147][local194][local215];
							local234 = Static20.anIntArrayArrayArray2[local147][local194 + 1][local215];
							local283 = Static20.anIntArrayArrayArray2[local147][local194 + 1][local215 + 1];
							local521 = Static20.anIntArrayArrayArray2[local147][local194][local215 + 1];
							if (local147 > 0) {
								@Pc(748) boolean local748 = true;
								if (local228 == 0 && Static11.aByteArrayArrayArray2[local147][local194][local215] != 0) {
									local748 = false;
								}
								if (local293 > 0 && !Static78.method1354(local293 - 1).aBoolean26) {
									local748 = false;
								}
								if (local748 && local287 == local234 && local283 == local287 && local521 == local287) {
									Static140.anIntArrayArrayArray6[local147][local194][local215] |= 0x924;
								}
							}
							if (local228 > 0) {
								local560 = local131[local194][local215];
								local821 = local21 + (local560 & 0x7F);
								if (local821 < 0) {
									local821 = 0;
								} else if (local821 > 127) {
									local821 = 127;
								}
								local845 = (local560 & 0x380) + (local560 + local17 & 0xFC00) + local821;
								local852 = Static171.anIntArray279[Static75.method887(local845, 96)];
							} else {
								local852 = 0;
								local560 = -1;
							}
							local821 = local135[local194][local215];
							local845 = local135[local194 + 1][local215];
							@Pc(882) int local882 = local135[local194 + 1][local215 + 1];
							@Pc(890) int local890 = local135[local194][local215 + 1];
							if (local293 == 0) {
								Static20.method444(local147, local194, local215, 0, 0, -1, local287, local234, local283, local521, Static75.method887(local560, local821), Static75.method887(local560, local845), Static75.method887(local560, local882), Static75.method887(local560, local890), 0, 0, 0, 0, local852, 0);
							} else {
								@Pc(940) int local940 = Static11.aByteArrayArrayArray2[local147][local194][local215] + 1;
								@Pc(948) byte local948 = Static113.aByteArrayArrayArray8[local147][local194][local215];
								@Pc(954) Class25 local954 = Static78.method1354(local293 - 1);
								@Pc(957) int local957 = local954.anInt698;
								if (local957 >= 0 && !Static171.anInterface3_2.method123(local957)) {
									local957 = -1;
								}
								@Pc(983) int local983;
								@Pc(981) int local981;
								@Pc(1000) int local1000;
								@Pc(1027) int local1027;
								if (local957 >= 0) {
									local981 = Static171.anIntArray279[Static30.method1681(Static171.anInterface3_2.method128(local957), 96)];
									local983 = -1;
								} else if (local954.anInt701 == -1) {
									local981 = 0;
									local983 = -2;
								} else {
									local983 = local954.anInt701;
									local1000 = (local983 & 0x7F) + local21;
									if (local1000 < 0) {
										local1000 = 0;
									} else if (local1000 > 127) {
										local1000 = 127;
									}
									local1027 = local1000 + (local983 & 0x380) + (local983 - -local17 & 0xFC00);
									local981 = Static171.anIntArray279[Static30.method1681(local1027, 96)];
								}
								if (local954.anInt695 >= 0) {
									local1000 = local954.anInt695;
									local1027 = (local1000 & 0x7F) + local21;
									if (local1027 < 0) {
										local1027 = 0;
									} else if (local1027 > 127) {
										local1027 = 127;
									}
									@Pc(1078) int local1078 = local1027 + (local1000 & 0x380) + (local17 + local1000 & 0xFC00);
									local981 = Static171.anIntArray279[Static30.method1681(local1078, 96)];
								}
								Static20.method444(local147, local194, local215, local940, local948, local957, local287, local234, local283, local521, Static75.method887(local560, local821), Static75.method887(local560, local845), Static75.method887(local560, local882), Static75.method887(local560, local890), Static30.method1681(local983, local821), Static30.method1681(local983, local845), Static30.method1681(local983, local882), Static30.method1681(local983, local890), local852, local981);
							}
						}
					}
				}
			}
			for (local215 = 1; local215 < 103; local215++) {
				for (local228 = 1; local228 < 103; local228++) {
					if ((Static150.aByteArrayArrayArray9[0][local228][local215] & 0x2) == 0) {
						Static160.method2697(local147, local228, local215, Static200.method3304(local147, local215, local228));
					} else {
						Static160.method2697(local147, local228, local215, 0);
					}
				}
			}
			Static15.aByteArrayArrayArray3[local147] = null;
			Static229.aByteArrayArrayArray15[local147] = null;
			Static11.aByteArrayArrayArray2[local147] = null;
			Static113.aByteArrayArrayArray8[local147] = null;
			Static18.aByteArrayArrayArray4[local147] = null;
		}
		Static135.method2414();
		for (@Pc(1220) int local1220 = 0; local1220 < 104; local1220++) {
			for (local157 = 0; local157 < 104; local157++) {
				if ((Static150.aByteArrayArrayArray9[1][local1220][local157] & 0x2) == 2) {
					Static227.method3742(local1220, local157);
				}
			}
		}
		local163 = 2;
		local165 = 4;
		local157 = 1;
		for (local169 = 0; local169 < 4; local169++) {
			if (local169 > 0) {
				local165 <<= 0x3;
				local157 <<= 0x3;
				local163 <<= 0x3;
			}
			for (local310 = 0; local310 <= local169; local310++) {
				for (local194 = 0; local194 <= 104; local194++) {
					for (local215 = 0; local215 <= 104; local215++) {
						if ((Static140.anIntArrayArrayArray6[local310][local215][local194] & local157) != 0) {
							local293 = local194;
							local228 = local194;
							while (local293 < 104 && (local157 & Static140.anIntArrayArrayArray6[local310][local215][local293 + 1]) != 0) {
								local293++;
							}
							while (local228 > 0 && (local157 & Static140.anIntArrayArrayArray6[local310][local215][local228 - 1]) != 0) {
								local228--;
							}
							local287 = local310;
							local234 = local310;
							label355: while (local287 > 0) {
								for (local283 = local228; local283 <= local293; local283++) {
									if ((Static140.anIntArrayArrayArray6[local287 - 1][local215][local283] & local157) == 0) {
										break label355;
									}
								}
								local287--;
							}
							label344: while (local169 > local234) {
								for (local283 = local228; local283 <= local293; local283++) {
									if ((Static140.anIntArrayArrayArray6[local234 + 1][local215][local283] & local157) == 0) {
										break label344;
									}
								}
								local234++;
							}
							local283 = (local293 + 1 - local228) * ((local234 + 1) - local287);
							if (local283 >= 8) {
								local560 = Static20.anIntArrayArrayArray2[local234][local215][local228] - 240;
								local852 = Static20.anIntArrayArrayArray2[local287][local215][local228];
								Static39.method702(local169, 1, local215 * 128, local215 * 128, local228 * 128, local293 * 128 + 128, local560, local852);
								for (local821 = local287; local821 <= local234; local821++) {
									for (local845 = local228; local845 <= local293; local845++) {
										Static140.anIntArrayArrayArray6[local821][local215][local845] &= ~local157;
									}
								}
							}
						}
						if ((Static140.anIntArrayArrayArray6[local310][local215][local194] & local163) != 0) {
							for (local293 = local215; local293 < 104 && (Static140.anIntArrayArrayArray6[local310][local293 + 1][local194] & local163) != 0; local293++) {
							}
							local287 = local310;
							for (local228 = local215; local228 > 0 && (local163 & Static140.anIntArrayArrayArray6[local310][local228 - 1][local194]) != 0; local228--) {
							}
							local234 = local310;
							label409: while (local287 > 0) {
								for (local283 = local228; local283 <= local293; local283++) {
									if ((local163 & Static140.anIntArrayArrayArray6[local287 - 1][local283][local194]) == 0) {
										break label409;
									}
								}
								local287--;
							}
							label398: while (local234 < local169) {
								for (local283 = local228; local283 <= local293; local283++) {
									if ((local163 & Static140.anIntArrayArrayArray6[local234 + 1][local283][local194]) == 0) {
										break label398;
									}
								}
								local234++;
							}
							local283 = (local293 + 1 - local228) * (local234 + 1 - local287);
							if (local283 >= 8) {
								local560 = Static20.anIntArrayArrayArray2[local234][local228][local194] - 240;
								local852 = Static20.anIntArrayArrayArray2[local287][local228][local194];
								Static39.method702(local169, 2, local228 * 128, local293 * 128 + 128, local194 * 128, local194 * 128, local560, local852);
								for (local821 = local287; local821 <= local234; local821++) {
									for (local845 = local228; local845 <= local293; local845++) {
										Static140.anIntArrayArrayArray6[local821][local845][local194] &= ~local163;
									}
								}
							}
						}
						if ((Static140.anIntArrayArrayArray6[local310][local215][local194] & local165) != 0) {
							local293 = local215;
							local228 = local215;
							local287 = local194;
							local234 = local194;
							while (local287 > 0 && (local165 & Static140.anIntArrayArrayArray6[local310][local215][local287 - 1]) != 0) {
								local287--;
							}
							while (local234 < 104 && (Static140.anIntArrayArrayArray6[local310][local215][local234 + 1] & local165) != 0) {
								local234++;
							}
							label464: while (local228 > 0) {
								for (local283 = local287; local283 <= local234; local283++) {
									if ((local165 & Static140.anIntArrayArrayArray6[local310][local228 - 1][local283]) == 0) {
										break label464;
									}
								}
								local228--;
							}
							label453: while (local293 < 104) {
								for (local283 = local287; local283 <= local234; local283++) {
									if ((local165 & Static140.anIntArrayArrayArray6[local310][local293 + 1][local283]) == 0) {
										break label453;
									}
								}
								local293++;
							}
							if ((local234 + 1 - local287) * (local293 + 1 - local228) >= 4) {
								local283 = Static20.anIntArrayArrayArray2[local310][local228][local287];
								Static39.method702(local169, 4, local228 * 128, local293 * 128 + 128, local287 * 128, local234 * 128 + 128, local283, local283);
								for (local521 = local228; local521 <= local293; local521++) {
									for (local560 = local287; local560 <= local234; local560++) {
										Static140.anIntArrayArrayArray6[local310][local521][local560] &= ~local165;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method99(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static56.aBoolean165) {
			try {
				@Pc(20) Class109 local20 = (Class109) Class.forName("Class109_Sub1").getDeclaredConstructor().newInstance();
				local20.method3262(arg0);
				return local20;
			} catch (@Pc(29) Throwable local29) {
				Static56.aBoolean165 = true;
			}
		}
		return arg0;
	}
}
