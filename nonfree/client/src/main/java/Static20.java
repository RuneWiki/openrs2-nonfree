import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "Lclient!eb;")
	public static Class2_Sub6_Sub1 aClass2_Sub6_Sub1_11 = new Class2_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
	public static int anInt1971 = 0;

	@OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lclient!lc;")
	public static Class31 aClass31_703 = Static56.method1206("glow1:");

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_704 = Static56.method1206("From:  ");

	@OriginalMember(owner = "client!ea", name = "db", descriptor = "I")
	public static int anInt1975 = 0;

	@OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
	public static int anInt1976 = 0;

	@OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_705 = Static56.method1206("_");

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)V")
	public static void method1263() {
		aClass31_704 = null;
		aClass2_Sub6_Sub1_11 = null;
		aClass31_705 = null;
		aClass31_703 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!wd;[Lclient!vb;)V")
	public static void method1266(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class60[] arg1) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(37) int local37;
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			for (local16 = 0; local16 < 104; local16++) {
				for (local20 = 0; local20 < 104; local20++) {
					if ((Static34.aByteArrayArrayArray17[local12][local16][local20] & 0x1) == 1) {
						local37 = local12;
						if ((Static34.aByteArrayArrayArray17[1][local16][local20] & 0x2) == 2) {
							local37 = local12 - 1;
						}
						if (local37 >= 0) {
							arg1[local37].method1728(local16, local20);
						}
					}
				}
			}
		}
		Static19.anInt841 += (int) (Math.random() * 5.0D) - 2;
		Static57.anInt2679 += (int) (Math.random() * 5.0D) - 2;
		if (Static57.anInt2679 < -8) {
			Static57.anInt2679 = -8;
		}
		if (Static19.anInt841 < -16) {
			Static19.anInt841 = -16;
		}
		if (Static57.anInt2679 > 8) {
			Static57.anInt2679 = 8;
		}
		if (Static19.anInt841 > 16) {
			Static19.anInt841 = 16;
		}
		@Pc(132) int local132;
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(161) int local161;
		@Pc(182) int local182;
		@Pc(196) int local196;
		@Pc(208) int local208;
		@Pc(212) int local212;
		@Pc(202) int local202;
		@Pc(277) int local277;
		@Pc(261) int local261;
		@Pc(505) int local505;
		@Pc(547) int local547;
		@Pc(648) int local648;
		@Pc(658) int local658;
		@Pc(670) int local670;
		for (local16 = 0; local16 < 4; local16++) {
			@Pc(122) byte[][] local122 = Static77.aByteArrayArrayArray30[local16];
			local37 = (int) Math.sqrt(5100.0D);
			local132 = local37 * 768 >> 8;
			for (local134 = 1; local134 < 103; local134++) {
				for (local138 = 1; local138 < 103; local138++) {
					local161 = Static16.anIntArrayArrayArray1[local16][local138 + 1][local134] - Static16.anIntArrayArrayArray1[local16][local138 - 1][local134];
					local182 = Static16.anIntArrayArrayArray1[local16][local138][local134 + 1] - Static16.anIntArrayArrayArray1[local16][local138][local134 - 1];
					local196 = (int) Math.sqrt((double) (local161 * local161 + local182 * local182 + 65536));
					local202 = (local182 << 8) / local196;
					local208 = (local161 << 8) / local196;
					local212 = 65536 / local196;
					local261 = (local122[local138][local134 + 1] >> 3) + (local122[local138 + 1][local134] >> 3) + (local122[local138 + -1][local134] >> 2) + (local122[local138][local134 + -1] >> 2) + (local122[local138][local134] >> 1);
					local277 = (local212 * -10 + local208 * -50 + local202 * -50) / local132 + 96;
					Static39.anIntArrayArray49[local138][local134] = local277 - local261;
				}
			}
			for (local138 = 0; local138 < 104; local138++) {
				Static103.anIntArray389[local138] = 0;
				Static18.anIntArray97[local138] = 0;
				Static23.anIntArray113[local138] = 0;
				Static54.anIntArray266[local138] = 0;
				Static37.anIntArray223[local138] = 0;
			}
			for (local161 = -5; local161 < 109; local161++) {
				for (local182 = 0; local182 < 104; local182++) {
					local196 = local161 + 5;
					@Pc(403) int local403;
					if (local196 >= 0 && local196 < 104) {
						local208 = Static49.aByteArrayArrayArray37[local16][local196][local182] & 0xFF;
						if (local208 > 0) {
							@Pc(367) Class2_Sub1_Sub11 local367 = Static65.method1338(local208 - 1);
							Static103.anIntArray389[local182] += local367.anInt2157;
							Static18.anIntArray97[local182] += local367.anInt2156;
							Static23.anIntArray113[local182] += local367.anInt2165;
							Static54.anIntArray266[local182] += local367.anInt2164;
							local403 = Static37.anIntArray223[local182]++;
						}
					}
					local208 = local161 - 5;
					if (local208 >= 0 && local208 < 104) {
						local212 = Static49.aByteArrayArrayArray37[local16][local208][local182] & 0xFF;
						if (local212 > 0) {
							@Pc(436) Class2_Sub1_Sub11 local436 = Static65.method1338(local212 - 1);
							Static103.anIntArray389[local182] -= local436.anInt2157;
							Static18.anIntArray97[local182] -= local436.anInt2156;
							Static23.anIntArray113[local182] -= local436.anInt2165;
							Static54.anIntArray266[local182] -= local436.anInt2164;
							local403 = Static37.anIntArray223[local182]--;
						}
					}
				}
				if (local161 >= 1 && local161 < 103) {
					local208 = 0;
					local196 = 0;
					local212 = 0;
					local202 = 0;
					local277 = 0;
					for (local261 = -5; local261 < 109; local261++) {
						local505 = local261 + 5;
						if (local505 >= 0 && local505 < 104) {
							local196 += Static103.anIntArray389[local505];
							local212 += Static23.anIntArray113[local505];
							local277 += Static37.anIntArray223[local505];
							local208 += Static18.anIntArray97[local505];
							local202 += Static54.anIntArray266[local505];
						}
						local547 = local261 - 5;
						if (local547 >= 0 && local547 < 104) {
							local212 -= Static23.anIntArray113[local547];
							local208 -= Static18.anIntArray97[local547];
							local277 -= Static37.anIntArray223[local547];
							local196 -= Static103.anIntArray389[local547];
							local202 -= Static54.anIntArray266[local547];
						}
						if (local261 >= 1 && local261 < 103 && (!Static10.aBoolean28 || (Static34.aByteArrayArrayArray17[0][local161][local261] & 0x2) != 0 || (Static34.aByteArrayArrayArray17[local16][local161][local261] & 0x10) == 0 && Static89.method1496(local261, local16, local161) == Static87.anInt2341)) {
							if (Static76.anInt2263 > local16) {
								Static76.anInt2263 = local16;
							}
							local648 = Static49.aByteArrayArrayArray37[local16][local161][local261] & 0xFF;
							local658 = Static21.aByteArrayArrayArray12[local16][local161][local261] & 0xFF;
							if (local648 > 0 || local658 > 0) {
								local670 = Static16.anIntArrayArrayArray1[local16][local161][local261];
								@Pc(680) int local680 = Static16.anIntArrayArrayArray1[local16][local161 + 1][local261];
								@Pc(692) int local692 = Static16.anIntArrayArrayArray1[local16][local161 + 1][local261 + 1];
								@Pc(702) int local702 = Static16.anIntArrayArrayArray1[local16][local161][local261 + 1];
								@Pc(708) int local708 = Static39.anIntArrayArray49[local161][local261];
								@Pc(716) int local716 = Static39.anIntArrayArray49[local161 + 1][local261];
								@Pc(726) int local726 = Static39.anIntArrayArray49[local161 + 1][local261 + 1];
								@Pc(728) int local728 = -1;
								@Pc(730) int local730 = -1;
								@Pc(738) int local738 = Static39.anIntArrayArray49[local161][local261 + 1];
								@Pc(749) int local749;
								@Pc(753) int local753;
								if (local648 > 0) {
									local749 = local196 * 256 / local202;
									local753 = local208 / local277;
									@Pc(757) int local757 = local212 / local277;
									local728 = Static19.method560(local749, local757, local753);
									@Pc(769) int local769 = Static57.anInt2679 + local749 & 0xFF;
									local757 += Static19.anInt841;
									if (local757 < 0) {
										local757 = 0;
									} else if (local757 > 255) {
										local757 = 255;
									}
									local730 = Static19.method560(local769, local757, local753);
								}
								if (local16 > 0) {
									@Pc(802) boolean local802 = true;
									if (local648 == 0 && Static63.aByteArrayArrayArray28[local16][local161][local261] != 0) {
										local802 = false;
									}
									if (local658 > 0 && !Static40.method1274(local658 - 1).aBoolean71) {
										local802 = false;
									}
									if (local802 && local670 == local680 && local670 == local692 && local670 == local702) {
										Static76.anIntArrayArrayArray3[local16][local161][local261] |= 0x924;
									}
								}
								local749 = 0;
								if (local730 != -1) {
									local749 = Static97.anIntArray378[Static70.method1386(96, local730)];
								}
								if (local658 == 0) {
									arg0.method1775(local16, local161, local261, 0, 0, -1, local670, local680, local692, local702, Static70.method1386(local708, local728), Static70.method1386(local716, local728), Static70.method1386(local726, local728), Static70.method1386(local738, local728), 0, 0, 0, 0, local749, 0);
								} else {
									@Pc(889) byte local889 = Static95.aByteArrayArrayArray34[local16][local161][local261];
									local753 = Static63.aByteArrayArrayArray28[local16][local161][local261] + 1;
									@Pc(905) Class2_Sub1_Sub5 local905 = Static40.method1274(local658 - 1);
									@Pc(908) int local908 = local905.anInt1256;
									@Pc(916) int local916;
									@Pc(920) int local920;
									@Pc(938) int local938;
									@Pc(943) int local943;
									if (local908 >= 0) {
										local920 = Static97.anInterface1_1.method1419(local908);
										local916 = -1;
									} else if (local905.anInt1249 == 16711935) {
										local916 = -2;
										local908 = -1;
										local920 = -2;
									} else {
										local916 = Static19.method560(local905.anInt1255, local905.anInt1251, local905.anInt1254);
										local938 = local905.anInt1255 + Static57.anInt2679 & 0xFF;
										local943 = local905.anInt1251 + Static19.anInt841;
										if (local943 < 0) {
											local943 = 0;
										} else if (local943 > 255) {
											local943 = 255;
										}
										local920 = Static19.method560(local938, local943, local905.anInt1254);
									}
									local938 = 0;
									if (local920 != -2) {
										local938 = Static97.anIntArray378[Static34.method871(local920, 96)];
									}
									if (local905.anInt1241 != -1) {
										@Pc(994) int local994 = Static19.anInt841 + local905.anInt1248;
										local943 = Static57.anInt2679 + local905.anInt1253 & 0xFF;
										if (local994 < 0) {
											local994 = 0;
										} else if (local994 > 255) {
											local994 = 255;
										}
										local920 = Static19.method560(local943, local994, local905.anInt1250);
										local938 = Static97.anIntArray378[Static34.method871(local920, 96)];
									}
									arg0.method1775(local16, local161, local261, local753, local889, local908, local670, local680, local692, local702, Static70.method1386(local708, local728), Static70.method1386(local716, local728), Static70.method1386(local726, local728), Static70.method1386(local738, local728), Static34.method871(local916, local708), Static34.method871(local916, local716), Static34.method871(local916, local726), Static34.method871(local916, local738), local749, local938);
								}
							}
						}
					}
				}
			}
			for (local182 = 1; local182 < 103; local182++) {
				for (local196 = 1; local196 < 103; local196++) {
					arg0.method1796(local16, local196, local182, Static89.method1496(local182, local16, local196));
				}
			}
			Static49.aByteArrayArrayArray37[local16] = null;
			Static21.aByteArrayArrayArray12[local16] = null;
			Static63.aByteArrayArrayArray28[local16] = null;
			Static95.aByteArrayArrayArray34[local16] = null;
			Static77.aByteArrayArrayArray30[local16] = null;
		}
		arg0.method1790();
		for (local20 = 0; local20 < 104; local20++) {
			for (local37 = 0; local37 < 104; local37++) {
				if ((Static34.aByteArrayArrayArray17[1][local20][local37] & 0x2) == 2) {
					arg0.method1762(local20, local37);
				}
			}
		}
		local37 = 1;
		local132 = 2;
		local134 = 4;
		for (local138 = 0; local138 < 4; local138++) {
			if (local138 > 0) {
				local37 <<= 0x3;
				local132 <<= 0x3;
				local134 <<= 0x3;
			}
			for (local161 = 0; local161 <= local138; local161++) {
				for (local182 = 0; local182 <= 104; local182++) {
					for (local196 = 0; local196 <= 104; local196++) {
						if ((local37 & Static76.anIntArrayArrayArray3[local161][local196][local182]) != 0) {
							local212 = local182;
							for (local208 = local182; local208 > 0 && (Static76.anIntArrayArrayArray3[local161][local196][local208 - 1] & local37) != 0; local208--) {
							}
							while (local212 < 104 && (local37 & Static76.anIntArrayArrayArray3[local161][local196][local212 + 1]) != 0) {
								local212++;
							}
							local202 = local161;
							local277 = local161;
							label347: while (local202 > 0) {
								for (local261 = local208; local261 <= local212; local261++) {
									if ((local37 & Static76.anIntArrayArrayArray3[local202 - 1][local196][local261]) == 0) {
										break label347;
									}
								}
								local202--;
							}
							label336: while (local138 > local277) {
								for (local261 = local208; local261 <= local212; local261++) {
									if ((local37 & Static76.anIntArrayArrayArray3[local277 + 1][local196][local261]) == 0) {
										break label336;
									}
								}
								local277++;
							}
							local261 = (local277 + 1 - local202) * (local212 + (1 - local208));
							if (local261 >= 8) {
								local547 = Static16.anIntArrayArrayArray1[local277][local196][local208] - 240;
								local648 = Static16.anIntArrayArrayArray1[local202][local196][local208];
								Static107.method1763(local138, 1, local196 * 128, local196 * 128, local208 * 128, local212 * 128 + 128, local547, local648);
								for (local658 = local202; local658 <= local277; local658++) {
									for (local670 = local208; local670 <= local212; local670++) {
										Static76.anIntArrayArrayArray3[local658][local196][local670] &= ~local37;
									}
								}
							}
						}
						if ((Static76.anIntArrayArrayArray3[local161][local196][local182] & local132) != 0) {
							local208 = local196;
							local202 = local161;
							local212 = local196;
							local277 = local161;
							while (local212 < 104 && (Static76.anIntArrayArrayArray3[local161][local212 + 1][local182] & local132) != 0) {
								local212++;
							}
							while (local208 > 0 && (Static76.anIntArrayArrayArray3[local161][local208 - 1][local182] & local132) != 0) {
								local208--;
							}
							label401: while (local202 > 0) {
								for (local261 = local208; local261 <= local212; local261++) {
									if ((Static76.anIntArrayArrayArray3[local202 - 1][local261][local182] & local132) == 0) {
										break label401;
									}
								}
								local202--;
							}
							label390: while (local277 < local138) {
								for (local261 = local208; local261 <= local212; local261++) {
									if ((local132 & Static76.anIntArrayArrayArray3[local277 + 1][local261][local182]) == 0) {
										break label390;
									}
								}
								local277++;
							}
							local261 = (local277 + 1 - local202) * (local212 + 1 - local208);
							if (local261 >= 8) {
								local547 = Static16.anIntArrayArrayArray1[local277][local208][local182] - 240;
								local648 = Static16.anIntArrayArrayArray1[local202][local208][local182];
								Static107.method1763(local138, 2, local208 * 128, local212 * 128 + 128, local182 * 128, local182 * 128, local547, local648);
								for (local658 = local202; local658 <= local277; local658++) {
									for (local670 = local208; local670 <= local212; local670++) {
										Static76.anIntArrayArrayArray3[local658][local670][local182] &= ~local132;
									}
								}
							}
						}
						if ((local134 & Static76.anIntArrayArrayArray3[local161][local196][local182]) != 0) {
							local208 = local196;
							local202 = local182;
							local212 = local196;
							while (local202 > 0 && (Static76.anIntArrayArrayArray3[local161][local196][local202 - 1] & local134) != 0) {
								local202--;
							}
							for (local277 = local182; local277 < 104 && (local134 & Static76.anIntArrayArrayArray3[local161][local196][local277 + 1]) != 0; local277++) {
							}
							label454: while (local208 > 0) {
								for (local261 = local202; local261 <= local277; local261++) {
									if ((Static76.anIntArrayArrayArray3[local161][local208 - 1][local261] & local134) == 0) {
										break label454;
									}
								}
								local208--;
							}
							label443: while (local212 < 104) {
								for (local261 = local202; local261 <= local277; local261++) {
									if ((local134 & Static76.anIntArrayArrayArray3[local161][local212 + 1][local261]) == 0) {
										break label443;
									}
								}
								local212++;
							}
							if ((local277 + 1 - local202) * (-local208 + local212 + 1) >= 4) {
								local261 = Static16.anIntArrayArrayArray1[local161][local208][local202];
								Static107.method1763(local138, 4, local208 * 128, local212 * 128 + 128, local202 * 128, local277 * 128 + 128, local261, local261);
								for (local505 = local208; local505 <= local212; local505++) {
									for (local547 = local202; local547 <= local277; local547++) {
										Static76.anIntArrayArrayArray3[local161][local505][local547] &= ~local134;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
