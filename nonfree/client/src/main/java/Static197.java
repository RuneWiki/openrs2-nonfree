import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
	public static int anInt4652;

	@OriginalMember(owner = "client!wg", name = "ab", descriptor = "[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] aClass2_Sub1_Sub7_Sub2Array10;

	@OriginalMember(owner = "client!wg", name = "cb", descriptor = "[[Lclient!ra;")
	public static Class72[][] aClass72ArrayArray1;

	@OriginalMember(owner = "client!wg", name = "fb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1332 = Static158.method3034("Connection timed out)3");

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1329 = aClass60_1332;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1330 = Static158.method3034("Loading textures )2 ");

	@OriginalMember(owner = "client!wg", name = "bb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1331 = aClass60_1330;

	@OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
	public static int anInt4656 = 0;

	@OriginalMember(owner = "client!wg", name = "jb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1333 = Static158.method3034("null");

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Lclient!hi;)V")
	public static void method3575(@OriginalArg(1) Class35[] arg0) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static147.aByteArrayArrayArray36[local3][local7][local11] & 0x1) == 1) {
						@Pc(28) int local28 = local3;
						if ((Static147.aByteArrayArrayArray36[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg0[local28].method1676(local11, local7);
						}
					}
				}
			}
		}
		Static80.anInt2383 += (int) (Math.random() * 5.0D) - 2;
		Static2.anInt4180 += (int) (Math.random() * 5.0D) - 2;
		if (Static2.anInt4180 < -16) {
			Static2.anInt4180 = -16;
		}
		if (Static2.anInt4180 > 16) {
			Static2.anInt4180 = 16;
		}
		local11 = Static2.anInt4180 >> 1;
		@Pc(115) int[][] local115 = new int[104][104];
		if (Static80.anInt2383 < -8) {
			Static80.anInt2383 = -8;
		}
		if (Static80.anInt2383 > 8) {
			Static80.anInt2383 = 8;
		}
		@Pc(133) int[][] local133 = new int[104][104];
		local7 = Static80.anInt2383 >> 2 << 10;
		@Pc(151) int local151;
		@Pc(161) int local161;
		@Pc(163) int local163;
		@Pc(167) int local167;
		@Pc(256) int local256;
		@Pc(191) int local191;
		@Pc(211) int local211;
		@Pc(224) int local224;
		@Pc(234) int local234;
		@Pc(228) int local228;
		@Pc(240) int local240;
		@Pc(305) int local305;
		@Pc(518) int local518;
		@Pc(522) int local522;
		@Pc(858) int local858;
		for (@Pc(141) int local141 = 0; local141 < 4; local141++) {
			@Pc(147) byte[][] local147 = Static54.aByteArrayArrayArray19[local141];
			local151 = (int) Math.sqrt(5100.0D);
			local161 = local151 * 768 >> 8;
			for (local163 = 1; local163 < 103; local163++) {
				for (local167 = 1; local167 < 103; local167++) {
					local191 = Static32.anIntArrayArrayArray4[local141][local167 + 1][local163] - Static32.anIntArrayArrayArray4[local141][local167 - 1][local163];
					local211 = Static32.anIntArrayArrayArray4[local141][local167][local163 + 1] - Static32.anIntArrayArrayArray4[local141][local167][local163 - 1];
					local224 = (int) Math.sqrt((double) (local191 * local191 + local211 * local211 + 65536));
					local228 = -65536 / local224;
					local234 = (local191 << 8) / local224;
					local240 = (local211 << 8) / local224;
					local256 = (local240 * -50 + local228 * -10 + local234 * -50) / local161 + 74;
					local305 = (local147[local167][local163 - 1] >> 2) + (local147[local167 + 1][local163] >> 3) + (local147[local167 - 1][local163] >> 2) - (-(local147[local167][local163 + 1] >> 3) - (local147[local167][local163] >> 1));
					local115[local167][local163] = local256 - local305;
				}
			}
			for (local167 = 0; local167 < 104; local167++) {
				Static57.anIntArray170[local167] = 0;
				Static5.anIntArray10[local167] = 0;
				Static126.anIntArray397[local167] = 0;
				Static183.anIntArray479[local167] = 0;
				Static148.anIntArray423[local167] = 0;
			}
			for (local256 = -5; local256 < 104; local256++) {
				for (local191 = 0; local191 < 104; local191++) {
					local211 = local256 + 5;
					@Pc(423) int local423;
					if (local211 < 104) {
						local224 = Static107.aByteArrayArrayArray30[local141][local211][local191] & 0xFF;
						if (local224 > 0) {
							@Pc(387) Class2_Sub1_Sub3 local387 = Static25.method617(local224 - 1);
							Static57.anIntArray170[local191] += local387.anInt509;
							Static5.anIntArray10[local191] += local387.anInt514;
							Static126.anIntArray397[local191] += local387.anInt515;
							Static183.anIntArray479[local191] += local387.anInt510;
							local423 = Static148.anIntArray423[local191]++;
						}
					}
					local224 = local256 - 5;
					if (local224 >= 0) {
						local234 = Static107.aByteArrayArrayArray30[local141][local224][local191] & 0xFF;
						if (local234 > 0) {
							@Pc(450) Class2_Sub1_Sub3 local450 = Static25.method617(local234 - 1);
							Static57.anIntArray170[local191] -= local450.anInt509;
							Static5.anIntArray10[local191] -= local450.anInt514;
							Static126.anIntArray397[local191] -= local450.anInt515;
							Static183.anIntArray479[local191] -= local450.anInt510;
							local423 = Static148.anIntArray423[local191]--;
						}
					}
				}
				if (local256 >= 0) {
					local224 = 0;
					local211 = 0;
					local234 = 0;
					local228 = 0;
					local240 = 0;
					for (local305 = -5; local305 < 104; local305++) {
						local518 = local305 + 5;
						local522 = local305 - 5;
						if (local518 < 104) {
							local211 += Static57.anIntArray170[local518];
							local224 += Static5.anIntArray10[local518];
							local240 += Static148.anIntArray423[local518];
							local228 += Static183.anIntArray479[local518];
							local234 += Static126.anIntArray397[local518];
						}
						if (local522 >= 0) {
							local234 -= Static126.anIntArray397[local522];
							local224 -= Static5.anIntArray10[local522];
							local240 -= Static148.anIntArray423[local522];
							local228 -= Static183.anIntArray479[local522];
							local211 -= Static57.anIntArray170[local522];
						}
						if (local305 >= 0 && local240 > 0) {
							local133[local256][local305] = Static159.method3416(local234 / local240, local224 / local240, local211 * 256 / local228);
						}
					}
				}
			}
			for (local191 = 1; local191 < 103; local191++) {
				for (local211 = 1; local211 < 103; local211++) {
					if (!Static8.aBoolean3 || (Static147.aByteArrayArrayArray36[0][local191][local211] & 0x2) != 0 || (Static147.aByteArrayArrayArray36[local141][local191][local211] & 0x10) == 0 && Static6.method249(local191, local141, local211) == Static53.anInt1670) {
						if (local141 < Static93.anInt2725) {
							Static93.anInt2725 = local141;
						}
						local224 = Static107.aByteArrayArrayArray30[local141][local191][local211] & 0xFF;
						local234 = Static172.aByteArrayArrayArray39[local141][local191][local211] & 0xFF;
						if (local224 > 0 || local234 > 0) {
							local228 = Static32.anIntArrayArrayArray4[local141][local191][local211];
							local240 = Static32.anIntArrayArrayArray4[local141][local191 + 1][local211];
							local305 = Static32.anIntArrayArrayArray4[local141][local191 + 1][local211 + 1];
							local518 = Static32.anIntArrayArrayArray4[local141][local191][local211 + 1];
							if (local141 > 0) {
								@Pc(746) boolean local746 = true;
								if (local224 == 0 && Static159.aByteArrayArrayArray41[local141][local191][local211] != 0) {
									local746 = false;
								}
								if (local234 > 0 && !Static135.method2777(local234 - 1).aBoolean167) {
									local746 = false;
								}
								if (local746 && local240 == local228 && local305 == local228 && local228 == local518) {
									Static9.anIntArrayArrayArray1[local141][local191][local211] |= 0x924;
								}
							}
							@Pc(825) int local825;
							@Pc(851) int local851;
							if (local224 > 0) {
								local522 = local133[local191][local211];
								local825 = local11 + (local522 & 0x7F);
								if (local825 < 0) {
									local825 = 0;
								} else if (local825 > 127) {
									local825 = 127;
								}
								local851 = local825 + (local7 + local522 & 0xFC00) + (local522 & 0x380);
								local858 = Static45.anIntArray131[Static72.method1658(local851, 96)];
							} else {
								local858 = 0;
								local522 = -1;
							}
							local851 = local115[local191 + 1][local211];
							local825 = local115[local191][local211];
							@Pc(886) int local886 = local115[local191][local211 + 1];
							@Pc(896) int local896 = local115[local191 + 1][local211 + 1];
							if (local234 == 0) {
								Static148.method2958(local141, local191, local211, 0, 0, -1, local228, local240, local305, local518, Static72.method1658(local522, local825), Static72.method1658(local522, local851), Static72.method1658(local522, local896), Static72.method1658(local522, local886), 0, 0, 0, 0, local858, 0);
							} else {
								@Pc(946) byte local946 = Static119.aByteArrayArrayArray32[local141][local191][local211];
								@Pc(956) int local956 = Static159.aByteArrayArrayArray41[local141][local191][local211] + 1;
								@Pc(962) Class2_Sub1_Sub19 local962 = Static135.method2777(local234 - 1);
								@Pc(965) int local965 = local962.anInt4215;
								if (local965 >= 0 && !Static45.anInterface1_2.method2882(local965)) {
									local965 = -1;
								}
								@Pc(991) int local991;
								@Pc(989) int local989;
								@Pc(1012) int local1012;
								@Pc(1037) int local1037;
								if (local965 >= 0) {
									local989 = Static45.anIntArray131[Static61.method1425(Static45.anInterface1_2.method2884(local965), 96)];
									local991 = -1;
								} else if (local962.anInt4214 == -1) {
									local991 = -2;
									local989 = 0;
								} else {
									local991 = local962.anInt4214;
									local1012 = local11 + (local991 & 0x7F);
									if (local1012 < 0) {
										local1012 = 0;
									} else if (local1012 > 127) {
										local1012 = 127;
									}
									local1037 = local1012 + (local991 & 0x380) + (local7 + local991 & 0xFC00);
									local989 = Static45.anIntArray131[Static61.method1425(local1037, 96)];
								}
								if (local962.anInt4213 >= 0) {
									local1012 = local962.anInt4213;
									local1037 = (local1012 & 0x7F) + local11;
									if (local1037 < 0) {
										local1037 = 0;
									} else if (local1037 > 127) {
										local1037 = 127;
									}
									@Pc(1087) int local1087 = local1037 + (local1012 + local7 & 0xFC00) + (local1012 & 0x380);
									local989 = Static45.anIntArray131[Static61.method1425(local1087, 96)];
								}
								Static148.method2958(local141, local191, local211, local956, local946, local965, local228, local240, local305, local518, Static72.method1658(local522, local825), Static72.method1658(local522, local851), Static72.method1658(local522, local896), Static72.method1658(local522, local886), Static61.method1425(local991, local825), Static61.method1425(local991, local851), Static61.method1425(local991, local896), Static61.method1425(local991, local886), local858, local989);
							}
						}
					}
				}
			}
			for (local211 = 1; local211 < 103; local211++) {
				for (local224 = 1; local224 < 103; local224++) {
					Static105.method2805(local141, local224, local211, Static6.method249(local224, local141, local211));
				}
			}
			Static107.aByteArrayArrayArray30[local141] = null;
			Static172.aByteArrayArrayArray39[local141] = null;
			Static159.aByteArrayArrayArray41[local141] = null;
			Static119.aByteArrayArrayArray32[local141] = null;
			Static54.aByteArrayArrayArray19[local141] = null;
		}
		Static74.method1831();
		@Pc(1214) int local1214;
		for (@Pc(1210) int local1210 = 0; local1210 < 104; local1210++) {
			for (local1214 = 0; local1214 < 104; local1214++) {
				if ((Static147.aByteArrayArrayArray36[1][local1210][local1214] & 0x2) == 2) {
					Static144.method2912(local1210, local1214);
				}
			}
		}
		local1214 = 1;
		local151 = 4;
		@Pc(1246) int local1246 = 2;
		for (local161 = 0; local161 < 4; local161++) {
			if (local161 > 0) {
				local151 <<= 0x3;
				local1246 <<= 0x3;
				local1214 <<= 0x3;
			}
			for (local163 = 0; local163 <= local161; local163++) {
				for (local167 = 0; local167 <= 104; local167++) {
					for (local256 = 0; local256 <= 104; local256++) {
						if ((local1214 & Static9.anIntArrayArrayArray1[local163][local256][local167]) != 0) {
							local191 = local167;
							local224 = local163;
							while (local191 > 0 && (local1214 & Static9.anIntArrayArrayArray1[local163][local256][local191 - 1]) != 0) {
								local191--;
							}
							local211 = local167;
							local234 = local163;
							while (local211 < 104 && (Static9.anIntArrayArrayArray1[local163][local256][local211 + 1] & local1214) != 0) {
								local211++;
							}
							label350: while (local224 > 0) {
								for (local228 = local191; local228 <= local211; local228++) {
									if ((local1214 & Static9.anIntArrayArrayArray1[local224 - 1][local256][local228]) == 0) {
										break label350;
									}
								}
								local224--;
							}
							label339: while (local234 < local161) {
								for (local228 = local191; local228 <= local211; local228++) {
									if ((Static9.anIntArrayArrayArray1[local234 + 1][local256][local228] & local1214) == 0) {
										break label339;
									}
								}
								local234++;
							}
							local228 = (local211 + 1 - local191) * (local234 + 1 - local224);
							if (local228 >= 8) {
								local305 = Static32.anIntArrayArrayArray4[local234][local256][local191] - 240;
								local518 = Static32.anIntArrayArrayArray4[local224][local256][local191];
								Static64.method1473(local161, 1, local256 * 128, local256 * 128, local191 * 128, local211 * 128 + 128, local305, local518);
								for (local522 = local224; local522 <= local234; local522++) {
									for (local858 = local191; local858 <= local211; local858++) {
										Static9.anIntArrayArrayArray1[local522][local256][local858] &= ~local1214;
									}
								}
							}
						}
						if ((Static9.anIntArrayArrayArray1[local163][local256][local167] & local1246) != 0) {
							local211 = local256;
							local191 = local256;
							while (local211 < 104 && (local1246 & Static9.anIntArrayArrayArray1[local163][local211 + 1][local167]) != 0) {
								local211++;
							}
							while (local191 > 0 && (Static9.anIntArrayArrayArray1[local163][local191 - 1][local167] & local1246) != 0) {
								local191--;
							}
							local224 = local163;
							local234 = local163;
							label404: while (local224 > 0) {
								for (local228 = local191; local228 <= local211; local228++) {
									if ((Static9.anIntArrayArrayArray1[local224 - 1][local228][local167] & local1246) == 0) {
										break label404;
									}
								}
								local224--;
							}
							label393: while (local234 < local161) {
								for (local228 = local191; local228 <= local211; local228++) {
									if ((Static9.anIntArrayArrayArray1[local234 + 1][local228][local167] & local1246) == 0) {
										break label393;
									}
								}
								local234++;
							}
							local228 = (local234 + 1 - local224) * (local211 + 1 - local191);
							if (local228 >= 8) {
								local305 = Static32.anIntArrayArrayArray4[local234][local191][local167] - 240;
								local518 = Static32.anIntArrayArrayArray4[local224][local191][local167];
								Static64.method1473(local161, 2, local191 * 128, local211 * 128 + 128, local167 * 128, local167 * 128, local305, local518);
								for (local522 = local224; local522 <= local234; local522++) {
									for (local858 = local191; local858 <= local211; local858++) {
										Static9.anIntArrayArrayArray1[local522][local858][local167] &= ~local1246;
									}
								}
							}
						}
						if ((Static9.anIntArrayArrayArray1[local163][local256][local167] & local151) != 0) {
							local224 = local167;
							local191 = local256;
							while (local224 > 0 && (Static9.anIntArrayArrayArray1[local163][local256][local224 - 1] & local151) != 0) {
								local224--;
							}
							local211 = local256;
							for (local234 = local167; local234 < 104 && (Static9.anIntArrayArrayArray1[local163][local256][local234 + 1] & local151) != 0; local234++) {
							}
							label458: while (local191 > 0) {
								for (local228 = local224; local228 <= local234; local228++) {
									if ((Static9.anIntArrayArrayArray1[local163][local191 - 1][local228] & local151) == 0) {
										break label458;
									}
								}
								local191--;
							}
							label447: while (local211 < 104) {
								for (local228 = local224; local228 <= local234; local228++) {
									if ((Static9.anIntArrayArrayArray1[local163][local211 + 1][local228] & local151) == 0) {
										break label447;
									}
								}
								local211++;
							}
							if ((local211 + 1 - local191) * (-local224 + 1 + local234) >= 4) {
								local228 = Static32.anIntArrayArrayArray4[local163][local191][local224];
								Static64.method1473(local161, 4, local191 * 128, local211 * 128 + 128, local224 * 128, local234 * 128 + 128, local228, local228);
								for (local240 = local191; local240 <= local211; local240++) {
									for (local305 = local224; local305 <= local234; local305++) {
										Static9.anIntArrayArrayArray1[local163][local240][local305] &= ~local151;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V")
	public static void method3576() {
		Static143.aClass89_54.method3439();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Lclient!ra;I)V")
	public static void method3577(@OriginalArg(0) int arg0, @OriginalArg(1) Class72[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class72 local17 = arg1[local11];
			if (local17 != null) {
				if (local17.anInt3932 == 0) {
					if (local17.aClass72Array1 != null) {
						method3577(arg0, local17.aClass72Array1);
					}
					@Pc(41) Class2_Sub20 local41 = (Class2_Sub20) Static156.aClass51_11.method2458((long) local17.anInt3935);
					if (local41 != null) {
						Static190.method3488(arg0, local41.anInt3986);
					}
				}
				@Pc(57) Class2_Sub25 local57;
				if (arg0 == 0 && local17.anObjectArray12 != null) {
					local57 = new Class2_Sub25();
					local57.aClass72_15 = local17;
					local57.anObjectArray29 = local17.anObjectArray12;
					method3578(local57);
				}
				if (arg0 == 1 && local17.anObjectArray25 != null) {
					if (local17.anInt3911 >= 0) {
						@Pc(84) Class72 local84 = Static173.method3201(local17.anInt3935);
						if (local84 == null || local84.aClass72Array1 == null || local17.anInt3911 >= local84.aClass72Array1.length || local17 != local84.aClass72Array1[local17.anInt3911]) {
							continue;
						}
					}
					local57 = new Class2_Sub25();
					local57.anObjectArray29 = local17.anObjectArray25;
					local57.aClass72_15 = local17;
					method3578(local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!wc;)V")
	public static void method3578(@OriginalArg(1) Class2_Sub25 arg0) {
		Static188.method3444(arg0, 200000);
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(III)J")
	public static long method3579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass74_1 == null ? 0L : local7.aClass74_1.aLong127;
	}
}
