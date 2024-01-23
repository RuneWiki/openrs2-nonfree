import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "Lclient!jd;")
	public static Class84 aClass84_52;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public static int anInt2629 = -1;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "Z")
	public static boolean aBoolean208 = true;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
	public static int anInt2633 = -1;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([Lclient!f;ZI[[[I)V")
	public static void method2247(@OriginalArg(0) Class52[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(5) byte local5;
		if (arg1) {
			local5 = 1;
		} else {
			local5 = 4;
		}
		@Pc(18) int local18;
		@Pc(23) int local23;
		if (!arg1) {
			for (local18 = 0; local18 < 4; local18++) {
				for (local23 = 0; local23 < 104; local23++) {
					for (@Pc(30) int local30 = 0; local30 < 104; local30++) {
						if ((Static134.aByteArrayArrayArray9[local18][local23][local30] & 0x1) == 1) {
							@Pc(51) int local51 = local18;
							if ((Static134.aByteArrayArrayArray9[1][local23][local30] & 0x2) == 2) {
								local51 = local18 - 1;
							}
							if (local51 >= 0) {
								arg0[local51].method1246(local30, local23);
							}
						}
					}
				}
			}
			Static171.anInt3656 += (int) (Math.random() * 5.0D) - 2;
			Static161.anInt3401 += (int) (Math.random() * 5.0D) - 2;
			if (Static171.anInt3656 < -16) {
				Static171.anInt3656 = -16;
			}
			if (Static171.anInt3656 > 16) {
				Static171.anInt3656 = 16;
			}
			if (Static161.anInt3401 < -8) {
				Static161.anInt3401 = -8;
			}
			if (Static161.anInt3401 > 8) {
				Static161.anInt3401 = 8;
			}
		}
		local23 = Static171.anInt3656 >> 1;
		@Pc(144) int[][] local144 = new int[104][104];
		@Pc(148) int[][] local148 = new int[104][104];
		local18 = Static161.anInt3401 >> 2 << 10;
		@Pc(156) int local156;
		@Pc(173) int local173;
		@Pc(179) int local179;
		@Pc(181) int local181;
		@Pc(186) int local186;
		@Pc(328) int local328;
		@Pc(211) int local211;
		@Pc(232) int local232;
		@Pc(247) int local247;
		@Pc(253) int local253;
		@Pc(312) int local312;
		@Pc(259) int local259;
		for (local156 = 0; local156 < local5; local156++) {
			@Pc(167) byte[][] local167 = Static170.aByteArrayArrayArray11[local156];
			@Pc(308) int local308;
			@Pc(464) int local464;
			@Pc(470) int local470;
			@Pc(535) int local535;
			if (!Static60.aBoolean106) {
				local173 = (int) Math.sqrt(5100.0D);
				local179 = local173 * 768 >> 8;
				for (local181 = 1; local181 < 103; local181++) {
					for (local186 = 1; local186 < 103; local186++) {
						local211 = Static141.anIntArrayArrayArray4[local156][local186 + 1][local181] - Static141.anIntArrayArrayArray4[local156][local186 - 1][local181];
						local232 = Static141.anIntArrayArrayArray4[local156][local186][local181 + 1] - Static141.anIntArrayArrayArray4[local156][local186][local181 - 1];
						local247 = (int) Math.sqrt((double) (local232 * local232 + local211 * local211 + 65536));
						local253 = (local211 << 8) / local247;
						local259 = (local232 << 8) / local247;
						local308 = (local167[local186][local181] >> 1) + ((local167[local186][local181 - 1] >> 2) + (local167[local186 + 1][local181] >> 3) + (local167[local186 + -1][local181] >> 2) + (local167[local186][local181 - -1] >> 3));
						local312 = -65536 / local247;
						local328 = (local312 * -10 + local253 * -50 + local259 * -50) / local179 + 74;
						local144[local186][local181] = local328 - local308;
					}
				}
			} else if (Static56.aBoolean96) {
				for (local173 = 1; local173 < 103; local173++) {
					for (local179 = 1; local179 < 103; local179++) {
						local186 = (local167[local179][local173 + 1] >> 3) + (local167[local179][local173 - 1] >> 2) + (local167[local179 - -1][local173] >> 3) + (local167[local179 - 1][local173] >> 2) + (local167[local179][local173] >> 1);
						local144[local179][local173] = 74 - local186;
					}
				}
			} else {
				local173 = (int) Static117.aFloatArray15[0];
				local179 = (int) Static117.aFloatArray15[1];
				local181 = (int) Static117.aFloatArray15[2];
				local186 = (int) Math.sqrt((double) (local173 * local173 + local179 * local179 + local181 * local181));
				local328 = local186 * 1024 >> 8;
				for (local211 = 1; local211 < 103; local211++) {
					for (local232 = 1; local232 < 103; local232++) {
						local253 = Static141.anIntArrayArrayArray4[local156][local232 + 1][local211] - Static141.anIntArrayArrayArray4[local156][local232 - 1][local211];
						local312 = Static141.anIntArrayArrayArray4[local156][local232][local211 + 1] - Static141.anIntArrayArrayArray4[local156][local232][local211 - 1];
						local259 = (int) Math.sqrt((double) (local253 * local253 + local312 * local312 + 65536));
						local308 = (local253 << 8) / local259;
						local464 = -65536 / local259;
						local470 = (local312 << 8) / local259;
						local247 = (local173 * local308 + local179 * local464 + local181 * local470) / local328 + 96;
						local535 = (local167[local232][local211] >> 1) + (local167[local232][local211 - 1] >> 2) + (local167[local232 - -1][local211] >> 3) + (local167[local232 - 1][local211] >> 2) + (local167[local232][local211 - -1] >> 3);
						local144[local232][local211] = local247 - (int) ((float) local535 * 1.7F);
					}
				}
			}
			for (local173 = 0; local173 < 104; local173++) {
				Static58.anIntArray100[local173] = 0;
				Static190.anIntArray355[local173] = 0;
				Static170.anIntArray293[local173] = 0;
				Static33.anIntArray49[local173] = 0;
				Static176.anIntArray303[local173] = 0;
			}
			for (local173 = -5; local173 < 104; local173++) {
				for (local179 = 0; local179 < 104; local179++) {
					local181 = local173 + 5;
					@Pc(736) int local736;
					if (local181 < 104) {
						local186 = Static57.aByteArrayArrayArray5[local156][local181][local179] & 0xFF;
						if (local186 > 0) {
							@Pc(700) Class87 local700 = Static110.method2045(local186 - 1);
							Static58.anIntArray100[local179] += local700.anInt2591;
							Static190.anIntArray355[local179] += local700.anInt2590;
							Static170.anIntArray293[local179] += local700.anInt2599;
							Static33.anIntArray49[local179] += local700.anInt2594;
							local736 = Static176.anIntArray303[local179]++;
						}
					}
					local186 = local173 - 5;
					if (local186 >= 0) {
						local328 = Static57.aByteArrayArrayArray5[local156][local186][local179] & 0xFF;
						if (local328 > 0) {
							@Pc(766) Class87 local766 = Static110.method2045(local328 - 1);
							Static58.anIntArray100[local179] -= local766.anInt2591;
							Static190.anIntArray355[local179] -= local766.anInt2590;
							Static170.anIntArray293[local179] -= local766.anInt2599;
							Static33.anIntArray49[local179] -= local766.anInt2594;
							local736 = Static176.anIntArray303[local179]--;
						}
					}
				}
				if (local173 >= 0) {
					local181 = 0;
					local179 = 0;
					local211 = 0;
					local328 = 0;
					local186 = 0;
					for (local232 = -5; local232 < 104; local232++) {
						local247 = local232 + 5;
						if (local247 < 104) {
							local211 += Static176.anIntArray303[local247];
							local179 += Static58.anIntArray100[local247];
							local181 += Static190.anIntArray355[local247];
							local186 += Static170.anIntArray293[local247];
							local328 += Static33.anIntArray49[local247];
						}
						local253 = local232 - 5;
						if (local253 >= 0) {
							local179 -= Static58.anIntArray100[local253];
							local211 -= Static176.anIntArray303[local253];
							local186 -= Static170.anIntArray293[local253];
							local328 -= Static33.anIntArray49[local253];
							local181 -= Static190.anIntArray355[local253];
						}
						if (local232 >= 0 && local211 > 0) {
							local148[local173][local232] = Static72.method1336(local179 * 256 / local328, local181 / local211, local186 / local211);
						}
					}
				}
			}
			for (local173 = 1; local173 < 103; local173++) {
				label760: for (local179 = 1; local179 < 103; local179++) {
					if (arg1 || Static67.method4885() || (Static134.aByteArrayArrayArray9[0][local173][local179] & 0x2) != 0 || (Static134.aByteArrayArrayArray9[local156][local173][local179] & 0x10) == 0 && Static54.method1070(local156, local179, local173) == Static8.anInt271) {
						if (Static295.anInt6152 > local156) {
							Static295.anInt6152 = local156;
						}
						local181 = Static57.aByteArrayArrayArray5[local156][local173][local179] & 0xFF;
						local186 = Static297.aByteArrayArrayArray17[local156][local173][local179] & 0xFF;
						if (local181 > 0 || local186 > 0) {
							local328 = Static141.anIntArrayArrayArray4[local156][local173][local179];
							local211 = Static141.anIntArrayArrayArray4[local156][local173 + 1][local179];
							local232 = Static141.anIntArrayArrayArray4[local156][local173 + 1][local179 + 1];
							local247 = Static141.anIntArrayArrayArray4[local156][local173][local179 + 1];
							if (local156 > 0) {
								@Pc(1074) boolean local1074 = true;
								if (local181 == 0 && Static108.aByteArrayArrayArray7[local156][local173][local179] != 0) {
									local1074 = false;
								}
								if (local186 > 0 && !Static131.method2290(local186 - 1).aBoolean133) {
									local1074 = false;
								}
								if (local1074 && local211 == local328 && local328 == local232 && local328 == local247) {
									Static188.anIntArrayArrayArray9[local156][local173][local179] |= 0x4;
								}
							}
							if (local181 <= 0) {
								local253 = -1;
								local312 = 0;
							} else {
								local253 = local148[local173][local179];
								local259 = local23 + (local253 & 0x7F);
								if (local259 < 0) {
									local259 = 0;
								} else if (local259 > 127) {
									local259 = 127;
								}
								local308 = local259 + (local18 + local253 & 0xFC00) + (local253 & 0x380);
								local312 = Static93.anIntArray152[Static291.method4823(96, local308)];
							}
							local464 = local144[local173 + 1][local179 + 1];
							local259 = local144[local173][local179];
							local470 = local144[local173][local179 + 1];
							local308 = local144[local173 + 1][local179];
							if (local186 == 0) {
								Static38.method729(local156, local173, local179, 0, 0, -1, local328, local211, local232, local247, Static291.method4823(local259, local253), Static291.method4823(local308, local253), Static291.method4823(local464, local253), Static291.method4823(local470, local253), 0, 0, 0, 0, local312, 0);
								if (Static60.aBoolean106 && local156 > 0 && local253 != -1 && Static110.method2045(local181 - 1).aBoolean199) {
									Static194.method3254(0, 0, true, false, local173, local179, local328 - Static141.anIntArrayArrayArray4[0][local173][local179], local211 - Static141.anIntArrayArrayArray4[0][local173 + 1][local179], local232 - Static141.anIntArrayArrayArray4[0][local173 + 1][local179 + 1], -Static141.anIntArrayArrayArray4[0][local173][local179 + 1] + local247);
								}
								if (Static60.aBoolean106 && !arg1 && Static157.anIntArrayArray27 != null && local156 == 0) {
									for (local535 = local173 - 1; local535 <= local173 + 1; local535++) {
										for (@Pc(1354) int local1354 = local179 - 1; local1354 <= local179 + 1; local1354++) {
											if ((local173 != local535 || local1354 != local179) && local535 >= 0 && local535 < 104 && local1354 >= 0 && local1354 < 104) {
												@Pc(1389) int local1389 = Static297.aByteArrayArrayArray17[local156][local535][local1354] & 0xFF;
												if (local1389 != 0) {
													@Pc(1400) Class57 local1400 = Static131.method2290(local1389 - 1);
													if (local1400.anInt1606 != -1 && Static133.method2323(Static93.anInterface5_1.method3516(local1400.anInt1606))) {
														Static157.anIntArrayArray27[local173][local179] = local1400.anInt1612 + (local1400.anInt1614 << 24);
														continue label760;
													}
												}
											}
										}
									}
								}
							} else {
								local535 = Static108.aByteArrayArrayArray7[local156][local173][local179] + 1;
								@Pc(1453) byte local1453 = Static25.aByteArrayArrayArray14[local156][local173][local179];
								@Pc(1459) Class57 local1459 = Static131.method2290(local186 - 1);
								@Pc(1502) int local1502;
								@Pc(1511) int local1511;
								@Pc(1557) int local1557;
								if (Static60.aBoolean106 && !arg1 && Static157.anIntArrayArray27 != null && local156 == 0) {
									if (local1459.anInt1606 != -1 && Static133.method2323(Static93.anInterface5_1.method3516(local1459.anInt1606))) {
										Static157.anIntArrayArray27[local173][local179] = local1459.anInt1612 + (local1459.anInt1614 << 24);
									} else {
										label741: for (local1502 = local173 - 1; local1502 <= local173 + 1; local1502++) {
											for (local1511 = local179 - 1; local1511 <= local179 + 1; local1511++) {
												if ((local1502 != local173 || local179 != local1511) && local1502 >= 0 && local1502 < 104 && local1511 >= 0 && local1511 < 104) {
													local1557 = Static297.aByteArrayArrayArray17[local156][local1502][local1511] & 0xFF;
													if (local1557 != 0) {
														@Pc(1568) Class57 local1568 = Static131.method2290(local1557 - 1);
														if (local1568.anInt1606 != -1 && Static133.method2323(Static93.anInterface5_1.method3516(local1568.anInt1606))) {
															Static157.anIntArrayArray27[local173][local179] = (local1568.anInt1614 << 24) + local1568.anInt1612;
															break label741;
														}
													}
												}
											}
										}
									}
								}
								local1502 = local1459.anInt1606;
								if (local1502 >= 0 && !Static93.anInterface5_1.method3524(local1502)) {
									local1502 = -1;
								}
								@Pc(1670) int local1670;
								@Pc(1646) int local1646;
								if (local1502 >= 0) {
									local1557 = Static93.anIntArray152[Static88.method3791(96, Static93.anInterface5_1.method3521(local1502))];
									local1511 = -1;
								} else if (local1459.anInt1619 == -1) {
									local1511 = -2;
									local1557 = 0;
								} else {
									local1511 = local1459.anInt1619;
									local1646 = local23 + (local1511 & 0x7F);
									if (local1646 < 0) {
										local1646 = 0;
									} else if (local1646 > 127) {
										local1646 = 127;
									}
									local1670 = (local1511 & 0x380) + (local18 + local1511 & 0xFC00) + local1646;
									local1557 = Static93.anIntArray152[Static88.method3791(96, local1670)];
								}
								if (local1459.anInt1608 >= 0) {
									local1646 = local1459.anInt1608;
									local1670 = (local1646 & 0x7F) + local23;
									if (local1670 < 0) {
										local1670 = 0;
									} else if (local1670 > 127) {
										local1670 = 127;
									}
									@Pc(1726) int local1726 = local1670 + (local1646 + local18 & 0xFC00) + (local1646 & 0x380);
									local1557 = Static93.anIntArray152[Static88.method3791(96, local1726)];
								}
								Static38.method729(local156, local173, local179, local535, local1453, local1502, local328, local211, local232, local247, Static291.method4823(local259, local253), Static291.method4823(local308, local253), Static291.method4823(local464, local253), Static291.method4823(local470, local253), Static88.method3791(local259, local1511), Static88.method3791(local308, local1511), Static88.method3791(local464, local1511), Static88.method3791(local470, local1511), local312, local1557);
								if (Static60.aBoolean106 && local156 > 0) {
									Static194.method3254(local535, local1453, local1511 == -2 || !local1459.aBoolean131, local253 == -1 || !Static110.method2045(local181 - 1).aBoolean199, local173, local179, local328 - Static141.anIntArrayArrayArray4[0][local173][local179], local211 + -Static141.anIntArrayArrayArray4[0][local173 + 1][local179], local232 - Static141.anIntArrayArrayArray4[0][local173 + 1][local179 + 1], local247 - Static141.anIntArrayArrayArray4[0][local173][local179 + 1]);
								}
							}
						}
					}
				}
			}
			if (Static60.aBoolean106) {
				@Pc(1870) float[][] local1870 = new float[105][105];
				@Pc(1874) float[][] local1874 = new float[105][105];
				@Pc(1878) float[][] local1878 = new float[105][105];
				@Pc(1882) int[][] local1882 = Static141.anIntArrayArrayArray4[local156];
				local328 = 1;
				while (true) {
					if (local328 > 103) {
						@Pc(2001) Class2_Sub12[] local2001;
						if (arg1) {
							local2001 = Static14.method313(Static134.aByteArrayArrayArray9, local1874, Static157.anIntArrayArray27, local1870, Static274.anIntArrayArrayArray14[0], Static297.aByteArrayArrayArray17[local156], Static108.aByteArrayArrayArray7[local156], local148, local156, local144, arg2, Static25.aByteArrayArrayArray14[local156], Static141.anIntArrayArrayArray4[local156], local1878, Static57.aByteArrayArrayArray5[local156]);
							Static116.method2139(local156, local2001);
							break;
						}
						local2001 = Static14.method313(Static134.aByteArrayArrayArray9, local1874, null, local1870, null, Static297.aByteArrayArrayArray17[local156], Static108.aByteArrayArrayArray7[local156], local148, local156, local144, arg2, Static25.aByteArrayArrayArray14[local156], Static141.anIntArrayArrayArray4[local156], local1878, Static57.aByteArrayArrayArray5[local156]);
						@Pc(2059) Class2_Sub12[] local2059 = Static158.method2714(Static297.aByteArrayArrayArray17[local156], Static25.aByteArrayArrayArray14[local156], local1870, Static141.anIntArrayArrayArray4[local156], Static108.aByteArrayArrayArray7[local156], local1878, local1874, local156, Static134.aByteArrayArrayArray9, local144, Static57.aByteArrayArrayArray5[local156]);
						@Pc(2067) Class2_Sub12[] local2067 = new Class2_Sub12[local2001.length + local2059.length];
						for (local247 = 0; local247 < local2001.length; local247++) {
							local2067[local247] = local2001[local247];
						}
						for (local247 = 0; local247 < local2059.length; local247++) {
							local2067[local247 + local2001.length] = local2059[local247];
						}
						Static116.method2139(local156, local2067);
						Static286.method4733(Static25.aByteArrayArrayArray14[local156], Static108.aByteArrayArrayArray7[local156], local156, local1878, Static57.aByteArrayArrayArray5[local156], local1874, Static141.anIntArrayArrayArray4[local156], Static128.anInt2667, Static128.aClass90Array1, local1870, Static297.aByteArrayArrayArray17[local156]);
						break;
					}
					for (local211 = 1; local211 <= 103; local211++) {
						local247 = local1882[local211][local328 + 1] - local1882[local211][local328 - 1];
						local232 = local1882[local211 + 1][local328] - local1882[local211 - 1][local328];
						@Pc(1937) float local1937 = (float) Math.sqrt((double) (local247 * local247 + local232 * local232 + 65536));
						local1874[local211][local328] = (float) local232 / local1937;
						local1870[local211][local328] = -256.0F / local1937;
						local1878[local211][local328] = (float) local247 / local1937;
					}
					local328++;
				}
			}
			Static57.aByteArrayArrayArray5[local156] = null;
			Static297.aByteArrayArrayArray17[local156] = null;
			Static108.aByteArrayArrayArray7[local156] = null;
			Static25.aByteArrayArrayArray14[local156] = null;
			Static170.aByteArrayArrayArray11[local156] = null;
		}
		Static2.method4758();
		if (arg1) {
			return;
		}
		@Pc(2174) int local2174;
		for (local156 = 0; local156 < 104; local156++) {
			for (local2174 = 0; local2174 < 104; local2174++) {
				if ((Static134.aByteArrayArrayArray9[1][local156][local2174] & 0x2) == 2) {
					Static212.method3613(local156, local2174);
				}
			}
		}
		for (local156 = 0; local156 < 4; local156++) {
			for (local2174 = 0; local2174 <= 104; local2174++) {
				for (local173 = 0; local173 <= 104; local173++) {
					if ((Static188.anIntArrayArrayArray9[local156][local173][local2174] & 0x1) != 0) {
						for (local181 = local2174; local181 < 104 && (Static188.anIntArrayArrayArray9[local156][local173][local181 + 1] & 0x1) != 0; local181++) {
						}
						local328 = local156;
						local186 = local156;
						for (local179 = local2174; local179 > 0 && (Static188.anIntArrayArrayArray9[local156][local173][local179 - 1] & 0x1) != 0; local179--) {
						}
						label443: while (local186 > 0) {
							for (local211 = local179; local211 <= local181; local211++) {
								if ((Static188.anIntArrayArrayArray9[local186 - 1][local173][local211] & 0x1) == 0) {
									break label443;
								}
							}
							local186--;
						}
						label432: while (local328 < 3) {
							for (local211 = local179; local211 <= local181; local211++) {
								if ((Static188.anIntArrayArrayArray9[local328 + 1][local173][local211] & 0x1) == 0) {
									break label432;
								}
							}
							local328++;
						}
						local211 = (local328 + 1 - local186) * (-local179 + 1 + local181);
						if (local211 >= 8) {
							local253 = Static141.anIntArrayArrayArray4[local186][local173][local179];
							local247 = Static141.anIntArrayArrayArray4[local328][local173][local179] - 240;
							Static79.method1515(1, local173 * 128, local173 * 128, local179 * 128, local181 * 128 + 128, local247, local253);
							for (local312 = local186; local312 <= local328; local312++) {
								for (local259 = local179; local259 <= local181; local259++) {
									Static188.anIntArrayArrayArray9[local312][local173][local259] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static188.anIntArrayArrayArray9[local156][local173][local2174] & 0x2) != 0) {
						local179 = local173;
						local181 = local173;
						while (local179 > 0 && (Static188.anIntArrayArrayArray9[local156][local179 - 1][local2174] & 0x2) != 0) {
							local179--;
						}
						while (local181 < 104 && (Static188.anIntArrayArrayArray9[local156][local181 + 1][local2174] & 0x2) != 0) {
							local181++;
						}
						local186 = local156;
						local328 = local156;
						label497: while (local186 > 0) {
							for (local211 = local179; local211 <= local181; local211++) {
								if ((Static188.anIntArrayArrayArray9[local186 - 1][local211][local2174] & 0x2) == 0) {
									break label497;
								}
							}
							local186--;
						}
						label486: while (local328 < 3) {
							for (local211 = local179; local211 <= local181; local211++) {
								if ((Static188.anIntArrayArrayArray9[local328 + 1][local211][local2174] & 0x2) == 0) {
									break label486;
								}
							}
							local328++;
						}
						local211 = (local181 + 1 - local179) * (-local186 + local328 + 1);
						if (local211 >= 8) {
							local247 = Static141.anIntArrayArrayArray4[local328][local179][local2174] - 240;
							local253 = Static141.anIntArrayArrayArray4[local186][local179][local2174];
							Static79.method1515(2, local179 * 128, local181 * 128 + 128, local2174 * 128, local2174 * 128, local247, local253);
							for (local312 = local186; local312 <= local328; local312++) {
								for (local259 = local179; local259 <= local181; local259++) {
									Static188.anIntArrayArrayArray9[local312][local259][local2174] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static188.anIntArrayArrayArray9[local156][local173][local2174] & 0x4) != 0) {
						local179 = local173;
						local181 = local173;
						for (local186 = local2174; local186 > 0 && (Static188.anIntArrayArrayArray9[local156][local173][local186 - 1] & 0x4) != 0; local186--) {
						}
						for (local328 = local2174; local328 < 104 && (Static188.anIntArrayArrayArray9[local156][local173][local328 + 1] & 0x4) != 0; local328++) {
						}
						label551: while (local179 > 0) {
							for (local211 = local186; local211 <= local328; local211++) {
								if ((Static188.anIntArrayArrayArray9[local156][local179 - 1][local211] & 0x4) == 0) {
									break label551;
								}
							}
							local179--;
						}
						label540: while (local181 < 104) {
							for (local211 = local186; local211 <= local328; local211++) {
								if ((Static188.anIntArrayArrayArray9[local156][local181 + 1][local211] & 0x4) == 0) {
									break label540;
								}
							}
							local181++;
						}
						if ((local181 + 1 - local179) * (local328 + 1 + -local186) >= 4) {
							local211 = Static141.anIntArrayArrayArray4[local156][local179][local186];
							Static79.method1515(4, local179 * 128, local181 * 128 + 128, local186 * 128, local328 * 128 + 128, local211, local211);
							for (local232 = local179; local232 <= local181; local232++) {
								for (local247 = local186; local247 <= local328; local247++) {
									Static188.anIntArrayArrayArray9[local156][local232][local247] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IC)Z")
	public static boolean method2248(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
