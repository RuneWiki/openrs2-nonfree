import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_21 = new Class303(64, 3);

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_42 = new Class56(83, -2);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wp;)Z")
	public static boolean method1519(@OriginalArg(0) Class361 arg0) {
		if (Static425.aBoolean541) {
			if (method1520(arg0).anInt6063 != 0) {
				return false;
			}
			if (arg0.anInt9665 == 0) {
				return false;
			}
		}
		return arg0.aBoolean761;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!wp;)Lclient!nb;")
	public static Class3_Sub36 method1520(@OriginalArg(0) Class361 arg0) {
		@Pc(13) Class3_Sub36 local13 = (Class3_Sub36) Static134.aClass354_11.method7689(((long) arg0.anInt9594 << 32) + (long) arg0.anInt9608);
		return local13 == null ? arg0.aClass3_Sub36_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!wp;IIIIIIIII)V")
	public static void method1521(@OriginalArg(0) Class361[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class361 local6 = arg0[local1];
			if (local6 != null && local6.anInt9663 == arg1) {
				@Pc(17) int local17 = local6.anInt9606 + arg6;
				@Pc(22) int local22 = local6.anInt9659 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt9665 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt9668;
					@Pc(45) int local45 = local22 + local6.anInt9650;
					if (local6.anInt9665 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9665 == 0 || local6.aBoolean764 || method1520(local6).anInt6063 != 0 || local6 == Static504.aClass361_14 || local6.anInt9591 == Static581.anInt8142 || local6.anInt9591 == Static562.anInt9186) {
					if (!method1519(local6)) {
						if (local6 == Static283.aClass361_8 && Static17.method245(Static283.aClass361_8) != null) {
							Static382.aBoolean502 = true;
							Static52.anInt998 = local17;
							Static493.anInt9519 = local22;
						}
						if (local6.aBoolean748 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean757 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class3_Sub32 local156 = (Class3_Sub32) Static12.aClass112_54.method3088(); local156 != null; local156 = (Class3_Sub32) Static12.aClass112_54.method3084()) {
									if (local156.aBoolean346) {
										local156.method7825();
										local156.aClass361_6.aBoolean760 = false;
									}
								}
								if (Static308.anInt5179 == 0) {
									Static283.aClass361_8 = null;
									Static504.aClass361_14 = null;
								}
								Static442.anInt7419 = 0;
								Static251.aBoolean333 = false;
								Static34.aBoolean57 = false;
								if (!Static150.aBoolean254) {
									Static302.method4445();
								}
							}
							@Pc(212) boolean local212;
							if (Static465.aClass86_1.method7267() >= local28 && Static465.aClass86_1.method7265() >= local30 && Static465.aClass86_1.method7267() < local32 && Static465.aClass86_1.method7265() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static369.aBoolean463 && local212) {
								if (local6.anInt9610 >= 0) {
									Static69.anInt1582 = local6.anInt9610;
								} else if (local6.aBoolean757) {
									Static69.anInt1582 = -1;
								}
							}
							if (!Static150.aBoolean254 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static104.method1890(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(256) boolean local256 = false;
							if (Static465.aClass86_1.method7269() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class3_Sub1 local271 = (Class3_Sub1) Static68.aClass112_15.method3088();
							if (local271 != null && local271.method5714() == 0 && local271.method5713() >= local28 && local271.method5711() >= local30 && local271.method5713() < local32 && local271.method5711() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray104 != null && !Static169.method3030()) {
								for (local307 = 0; local307 < local6.aByteArray104.length; local307++) {
									if (Static140.aClass195_1.method4499(local6.aByteArray104[local307])) {
										if (local6.anIntArray631 == null || Static506.anInt8251 >= local6.anIntArray631[local307]) {
											@Pc(339) byte local339 = local6.aByteArray103[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static140.aClass195_1.method4499(86) && !Static140.aClass195_1.method4499(82) && !Static140.aClass195_1.method4499(81)) && ((local339 & 0x2) == 0 || Static140.aClass195_1.method4499(86)) && ((local339 & 0x1) == 0 || Static140.aClass195_1.method4499(82)) && ((local339 & 0x4) == 0 || Static140.aClass195_1.method4499(81))) {
												if (local307 < 10) {
													Static470.method6498(local6.anInt9594, local307 + 1, "", -1);
												} else if (local307 == 10) {
													Static296.method4392();
													@Pc(410) Class3_Sub36 local410 = method1520(local6);
													Static463.method6426(local6, local410.method5121(), local410.anInt6062);
													Static16.aString4 = Static10.method154(local6);
													if (Static16.aString4 == null) {
														Static16.aString4 = "Null";
													}
													Static585.aString93 = local6.aString99 + "<col=ffffff>";
												}
												local441 = local6.anIntArray640[local307];
												if (local6.anIntArray631 == null) {
													local6.anIntArray631 = new int[local6.aByteArray104.length];
												}
												if (local441 == 0) {
													local6.anIntArray631[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray631[local307] = Static506.anInt8251 + local441;
												}
											}
										}
									} else if (local6.anIntArray631 != null) {
										local6.anIntArray631[local307] = 0;
									}
								}
							}
							if (local266) {
								Static98.method1814(local271.method5711() - local22, local6, local271.method5713() - local17);
							}
							if (Static283.aClass361_8 != null && Static283.aClass361_8 != local6 && local212 && method1520(local6).method5120()) {
								Static475.aClass361_13 = local6;
							}
							if (local6 == Static504.aClass361_14) {
								Static82.aBoolean667 = true;
								Static328.anInt5531 = local17;
								Static436.anInt7281 = local22;
							}
							if (local6.aBoolean764 || local6.anInt9591 != 0) {
								@Pc(526) Class3_Sub32 local526;
								if (local212 && Static255.anInt4511 != 0 && local6.anObjectArray8 != null) {
									local526 = new Class3_Sub32();
									local526.aBoolean346 = true;
									local526.aClass361_6 = local6;
									local526.anInt4750 = Static255.anInt4511;
									local526.anObjectArray1 = local6.anObjectArray8;
									Static12.aClass112_54.method3079(local526);
								}
								if (Static283.aClass361_8 != null || Static150.aBoolean254 || local6.anInt9591 != Static7.anInt3429 && Static442.anInt7419 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt9591 != 0) {
									if (local6.anInt9591 == Static36.anInt656 || local6.anInt9591 == Static317.anInt5414) {
										Static159.aClass361_3 = local6;
										if (Static84.aClass350_1 != null) {
											Static84.aClass350_1.method7336(local6.anInt9650, Static505.aClass45_11);
										}
										if (local6.anInt9591 == Static36.anInt656) {
											if (!Static150.aBoolean254 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static417.method5939(arg8, arg9, Static505.aClass45_11);
												for (@Pc(609) Class41_Sub5 local609 = (Class41_Sub5) Static564.aClass178_23.method4168(); local609 != null; local609 = (Class41_Sub5) Static564.aClass178_23.method4165()) {
													if (arg8 >= local609.anInt7028 && arg8 < local609.anInt7024 && arg9 >= local609.anInt7030 && arg9 < local609.anInt7027) {
														Static302.method4445();
														Static43.method706(local609.aClass41_Sub2_Sub1_Sub4_1);
													}
												}
											}
											Static274.method4158(local17, local6, local22);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt9591 == Static581.anInt8142) {
										if (local6.method7897(Static505.aClass45_11) == null || Static503.anInt8177 != 0 && Static503.anInt8177 != 3 || Static150.aBoolean254 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray639[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray633[local681]) {
											continue;
										}
										local307 -= local6.anInt9668 / 2;
										local681 -= local6.anInt9650 / 2;
										if (Static379.anInt6482 == 4) {
											local720 = (int) Static43.aFloat20 & 0x3FFF;
										} else {
											local720 = (int) Static43.aFloat20 + Static244.anInt4328 & 0x3FFF;
										}
										@Pc(732) int local732 = Class356.anIntArray597[local720];
										@Pc(736) int local736 = Class356.anIntArray598[local720];
										if (Static379.anInt6482 != 4) {
											local732 = local732 * (Static41.anInt765 + 256) >> 8;
											local736 = local736 * (Static41.anInt765 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static379.anInt6482 == 4) {
											local786 = (Static28.anInt516 >> 9) + (local765 >> 2);
											local794 = (Static521.anInt8385 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7858() - 1) * 256;
											local786 = (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 - local803 >> 9) + (local765 >> 2);
											local794 = (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 - local803 >> 9) - (local775 >> 2);
										}
										if (Static369.aBoolean463 && (Static215.anInt3875 & 0x40) != 0) {
											@Pc(836) Class361 local836 = Static556.method7352(Static377.anInt6474, Static196.anInt9125);
											if (local836 == null) {
												Static296.method4392();
											} else {
												Static137.method2680(local6.anInt9645, local794, " ->", 1L, true, 11, Static16.aString4, false, Static288.anInt4931, local786);
											}
											continue;
										}
										if (Static121.aClass274_1 == Static473.aClass274_4) {
											Static137.method2680(-1, local794, "", 1L, true, 15, Static544.aClass343_31.method7222(Static256.anInt4535), false, -1, local786);
										}
										Static137.method2680(-1, local794, "", 1L, true, 19, Static355.aString44, false, Static299.anInt5096, local786);
										continue;
									}
									if (local6.anInt9591 == Static7.anInt3429) {
										Static493.aClass361_17 = local6;
										if (local212) {
											Static251.aBoolean333 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method5713() - local17 - local6.anInt9668 / 2) * 2.0D / (double) Static44.aFloat204);
											local681 = (int) -((double) (local271.method5711() - local22 - local6.anInt9650 / 2) * 2.0D / (double) Static44.aFloat204);
											local441 = Static56.anInt1176 + local307 + Static44.anInt9258;
											local720 = Static334.anInt5600 + local681 + Static44.anInt9263;
											@Pc(950) Class3_Sub7_Sub17 local950 = Static339.method5033();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method6708(local441, local955, local720);
											if (local955 != null) {
												if (Static140.aClass195_1.method4499(82) && Static500.anInt8114 > 0) {
													Static335.method4780(local955[1], local955[2], local955[0]);
													continue;
												}
												Static34.aBoolean57 = true;
												Static326.anInt5527 = local955[0];
												Static567.anInt9232 = local955[1];
												Static337.anInt5632 = local955[2];
											}
											Static442.anInt7419 = 1;
											Static122.aBoolean228 = false;
											Static495.anInt8057 = Static465.aClass86_1.method7267();
											Static380.anInt6521 = Static465.aClass86_1.method7265();
											continue;
										}
										if (local256 && Static442.anInt7419 > 0) {
											if (Static442.anInt7419 == 1 && (Static495.anInt8057 != Static465.aClass86_1.method7267() || Static380.anInt6521 != Static465.aClass86_1.method7265())) {
												Static582.anInt5170 = Static56.anInt1176;
												Static547.anInt8736 = Static334.anInt5600;
												Static442.anInt7419 = 2;
											}
											if (Static442.anInt7419 == 2) {
												Static122.aBoolean228 = true;
												Static402.method5824(Static582.anInt5170 + (int) ((double) (Static495.anInt8057 - Static465.aClass86_1.method7267()) * 2.0D / (double) Static44.aFloat203));
												Static544.method7223(Static547.anInt8736 - (int) ((double) (Static380.anInt6521 - Static465.aClass86_1.method7265()) * 2.0D / (double) Static44.aFloat203));
											}
											continue;
										}
										if (Static442.anInt7419 > 0 && !Static122.aBoolean228) {
											if ((Static521.anInt8378 == 1 || Static490.method6636()) && Static571.anInt9281 > 2) {
												Static280.method4132(Static380.anInt6521, Static495.anInt8057);
											} else if (Static130.method6017()) {
												Static280.method4132(Static380.anInt6521, Static495.anInt8057);
											}
										}
										Static442.anInt7419 = 0;
										continue;
									}
									if (local6.anInt9591 == Static278.anInt4854) {
										if (local256) {
											Static274.method4159(local6.anInt9668, Static465.aClass86_1.method7267() - local17, local6.anInt9650, Static465.aClass86_1.method7265() - local22);
										}
										continue;
									}
									if (local6.anInt9591 == Static562.anInt9186) {
										Static86.method5359(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean751 && local266) {
									local6.aBoolean751 = true;
									if (local6.anObjectArray26 != null) {
										local526 = new Class3_Sub32();
										local526.aBoolean346 = true;
										local526.aClass361_6 = local6;
										local526.anInt4748 = local271.method5713() - local17;
										local526.anInt4750 = local271.method5711() - local22;
										local526.anObjectArray1 = local6.anObjectArray26;
										Static12.aClass112_54.method3079(local526);
									}
								}
								if (local6.aBoolean751 && local256 && local6.anObjectArray27 != null) {
									local526 = new Class3_Sub32();
									local526.aBoolean346 = true;
									local526.aClass361_6 = local6;
									local526.anInt4748 = Static465.aClass86_1.method7267() - local17;
									local526.anInt4750 = Static465.aClass86_1.method7265() - local22;
									local526.anObjectArray1 = local6.anObjectArray27;
									Static12.aClass112_54.method3079(local526);
								}
								if (local6.aBoolean751 && !local256) {
									local6.aBoolean751 = false;
									if (local6.anObjectArray33 != null) {
										local526 = new Class3_Sub32();
										local526.aBoolean346 = true;
										local526.aClass361_6 = local6;
										local526.anInt4748 = Static465.aClass86_1.method7267() - local17;
										local526.anInt4750 = Static465.aClass86_1.method7265() - local22;
										local526.anObjectArray1 = local6.anObjectArray33;
										Static460.aClass112_49.method3079(local526);
									}
								}
								if (local256 && local6.anObjectArray28 != null) {
									local526 = new Class3_Sub32();
									local526.aBoolean346 = true;
									local526.aClass361_6 = local6;
									local526.anInt4748 = Static465.aClass86_1.method7267() - local17;
									local526.anInt4750 = Static465.aClass86_1.method7265() - local22;
									local526.anObjectArray1 = local6.anObjectArray28;
									Static12.aClass112_54.method3079(local526);
								}
								if (!local6.aBoolean760 && local212) {
									local6.aBoolean760 = true;
									if (local6.anObjectArray19 != null) {
										local526 = new Class3_Sub32();
										local526.aBoolean346 = true;
										local526.aClass361_6 = local6;
										local526.anInt4748 = Static465.aClass86_1.method7267() - local17;
										local526.anInt4750 = Static465.aClass86_1.method7265() - local22;
										local526.anObjectArray1 = local6.anObjectArray19;
										Static12.aClass112_54.method3079(local526);
									}
								}
								if (local6.aBoolean760 && local212 && local6.anObjectArray14 != null) {
									local526 = new Class3_Sub32();
									local526.aBoolean346 = true;
									local526.aClass361_6 = local6;
									local526.anInt4748 = Static465.aClass86_1.method7267() - local17;
									local526.anInt4750 = Static465.aClass86_1.method7265() - local22;
									local526.anObjectArray1 = local6.anObjectArray14;
									Static12.aClass112_54.method3079(local526);
								}
								if (local6.aBoolean760 && !local212) {
									local6.aBoolean760 = false;
									if (local6.anObjectArray9 != null) {
										local526 = new Class3_Sub32();
										local526.aBoolean346 = true;
										local526.aClass361_6 = local6;
										local526.anInt4748 = Static465.aClass86_1.method7267() - local17;
										local526.anInt4750 = Static465.aClass86_1.method7265() - local22;
										local526.anObjectArray1 = local6.anObjectArray9;
										Static460.aClass112_49.method3079(local526);
									}
								}
								if (local6.anObjectArray7 != null) {
									local526 = new Class3_Sub32();
									local526.aClass361_6 = local6;
									local526.anObjectArray1 = local6.anObjectArray7;
									Static457.aClass112_55.method3079(local526);
								}
								@Pc(1494) Class3_Sub32 local1494;
								if (local6.anObjectArray24 != null && Static566.anInt9217 > local6.anInt9657) {
									if (local6.anIntArray637 == null || Static566.anInt9217 - local6.anInt9657 > 32) {
										local526 = new Class3_Sub32();
										local526.aClass361_6 = local6;
										local526.anObjectArray1 = local6.anObjectArray24;
										Static12.aClass112_54.method3079(local526);
									} else {
										label683: for (local307 = local6.anInt9657; local307 < Static566.anInt9217; local307++) {
											local681 = Static339.anIntArray318[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray637.length; local441++) {
												if (local6.anIntArray637[local441] == local681) {
													local1494 = new Class3_Sub32();
													local1494.aClass361_6 = local6;
													local1494.anObjectArray1 = local6.anObjectArray24;
													Static12.aClass112_54.method3079(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt9657 = Static566.anInt9217;
								}
								if (local6.anObjectArray25 != null && Static592.anInt9687 > local6.anInt9652) {
									if (local6.anIntArray635 == null || Static592.anInt9687 - local6.anInt9652 > 32) {
										local526 = new Class3_Sub32();
										local526.aClass361_6 = local6;
										local526.anObjectArray1 = local6.anObjectArray25;
										Static12.aClass112_54.method3079(local526);
									} else {
										label659: for (local307 = local6.anInt9652; local307 < Static592.anInt9687; local307++) {
											local681 = Static9.anIntArray239[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray635.length; local441++) {
												if (local6.anIntArray635[local441] == local681) {
													local1494 = new Class3_Sub32();
													local1494.aClass361_6 = local6;
													local1494.anObjectArray1 = local6.anObjectArray25;
													Static12.aClass112_54.method3079(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt9652 = Static592.anInt9687;
								}
								if (local6.anObjectArray13 != null && Static321.anInt5440 > local6.anInt9638) {
									if (local6.anIntArray638 == null || Static321.anInt5440 - local6.anInt9638 > 32) {
										local526 = new Class3_Sub32();
										local526.aClass361_6 = local6;
										local526.anObjectArray1 = local6.anObjectArray13;
										Static12.aClass112_54.method3079(local526);
									} else {
										label635: for (local307 = local6.anInt9638; local307 < Static321.anInt5440; local307++) {
											local681 = Static310.anIntArray294[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray638.length; local441++) {
												if (local6.anIntArray638[local441] == local681) {
													local1494 = new Class3_Sub32();
													local1494.aClass361_6 = local6;
													local1494.anObjectArray1 = local6.anObjectArray13;
													Static12.aClass112_54.method3079(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt9638 = Static321.anInt5440;
								}
								if (local6.anObjectArray11 != null && Static487.anInt9193 > local6.anInt9603) {
									if (local6.anIntArray634 == null || Static487.anInt9193 - local6.anInt9603 > 32) {
										local526 = new Class3_Sub32();
										local526.aClass361_6 = local6;
										local526.anObjectArray1 = local6.anObjectArray11;
										Static12.aClass112_54.method3079(local526);
									} else {
										label611: for (local307 = local6.anInt9603; local307 < Static487.anInt9193; local307++) {
											local681 = Static115.anIntArray419[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray634.length; local441++) {
												if (local6.anIntArray634[local441] == local681) {
													local1494 = new Class3_Sub32();
													local1494.aClass361_6 = local6;
													local1494.anObjectArray1 = local6.anObjectArray11;
													Static12.aClass112_54.method3079(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt9603 = Static487.anInt9193;
								}
								if (local6.anObjectArray21 != null && Static319.anInt5433 > local6.anInt9601) {
									if (local6.anIntArray636 == null || Static319.anInt5433 - local6.anInt9601 > 32) {
										local526 = new Class3_Sub32();
										local526.aClass361_6 = local6;
										local526.anObjectArray1 = local6.anObjectArray21;
										Static12.aClass112_54.method3079(local526);
									} else {
										label587: for (local307 = local6.anInt9601; local307 < Static319.anInt5433; local307++) {
											local681 = Static572.anIntArray596[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray636.length; local441++) {
												if (local6.anIntArray636[local441] == local681) {
													local1494 = new Class3_Sub32();
													local1494.aClass361_6 = local6;
													local1494.anObjectArray1 = local6.anObjectArray21;
													Static12.aClass112_54.method3079(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt9601 = Static319.anInt5433;
								}
								if (Static360.anInt6250 > local6.anInt9643 && local6.anObjectArray29 != null) {
									local526 = new Class3_Sub32();
									local526.aClass361_6 = local6;
									local526.anObjectArray1 = local6.anObjectArray29;
									Static12.aClass112_54.method3079(local526);
								}
								if (Static49.anInt890 > local6.anInt9643 && local6.anObjectArray5 != null) {
									local526 = new Class3_Sub32();
									local526.aClass361_6 = local6;
									local526.anObjectArray1 = local6.anObjectArray5;
									Static12.aClass112_54.method3079(local526);
								}
								if (Static467.anInt7775 > local6.anInt9643 && local6.anObjectArray10 != null) {
									local526 = new Class3_Sub32();
									local526.aClass361_6 = local6;
									local526.anObjectArray1 = local6.anObjectArray10;
									Static12.aClass112_54.method3079(local526);
								}
								if (Static510.anInt8281 > local6.anInt9643 && local6.anObjectArray30 != null) {
									local526 = new Class3_Sub32();
									local526.aClass361_6 = local6;
									local526.anObjectArray1 = local6.anObjectArray30;
									Static12.aClass112_54.method3079(local526);
								}
								if (Static330.anInt5543 > local6.anInt9643 && local6.anObjectArray12 != null) {
									local526 = new Class3_Sub32();
									local526.aClass361_6 = local6;
									local526.anObjectArray1 = local6.anObjectArray12;
									Static12.aClass112_54.method3079(local526);
								}
								local6.anInt9643 = Static109.anInt2171;
								if (local6.anObjectArray3 != null) {
									for (local307 = 0; local307 < Static158.anInt3266; local307++) {
										@Pc(1962) Class3_Sub32 local1962 = new Class3_Sub32();
										local1962.aClass361_6 = local6;
										local1962.anInt4752 = Static11.anInterface7Array1[local307].method3368();
										local1962.anInt4749 = Static11.anInterface7Array1[local307].method3370();
										local1962.anObjectArray1 = local6.anObjectArray3;
										Static12.aClass112_54.method3079(local1962);
									}
								}
								if (Static353.aBoolean451 && local6.anObjectArray20 != null) {
									local526 = new Class3_Sub32();
									local526.aClass361_6 = local6;
									local526.anObjectArray1 = local6.anObjectArray20;
									Static12.aClass112_54.method3079(local526);
								}
							}
							if (local6.anInt9665 == 5 && local6.anInt9618 != -1) {
								local6.method7885(Static420.aClass356_1, Static508.aClass232_1).method7336(local6.anInt9650, Static505.aClass45_11);
							}
							Static30.method497(local6);
							if (local6.anInt9665 == 0) {
								method1521(arg0, local6.anInt9594, local28, local30, local32, local34, local17 - local6.anInt9633, local22 - local6.anInt9655, arg8, arg9);
								if (local6.aClass361Array2 != null) {
									method1521(local6.aClass361Array2, local6.anInt9594, local28, local30, local32, local34, local17 - local6.anInt9633, local22 - local6.anInt9655, arg8, arg9);
								}
								@Pc(2084) Class3_Sub49 local2084 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local6.anInt9594);
								if (local2084 != null) {
									if (Static121.aClass274_1 == Static176.aClass274_2 && local2084.anInt8837 == 0 && !Static150.aBoolean254 && local212 && !Static425.aBoolean541) {
										Static302.method4445();
									}
									Static462.method6422(local2084.anInt8836, arg8, local30, local32, arg9, local28, local17, local22, local34);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static30.method497(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1524(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static403.anInt6982;
		@Pc(3) int[] local3 = Static430.anIntArray447;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static88.anInt1884; local5++) {
			@Pc(15) Class41_Sub2_Sub1_Sub4 local15;
			if (local5 < local1) {
				local15 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) Static445.anIntArray470[local5 - local1])).aClass41_Sub2_Sub1_Sub4_Sub1_2;
			}
			if (local15.aByte117 == arg0 && local15.anInt9530 >= 0) {
				@Pc(39) int local39 = local15.method7858();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9444 & 0x1FF) != 0 || (local15.anInt9442 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9444 & 0x1FF) != 256 || (local15.anInt9442 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9444 >> 9;
					local80 = local15.anInt9442 >> 9;
					if (local15.anInt9530 > Static189.anIntArrayArray80[local75][local80]) {
						Static189.anIntArrayArray80[local75][local80] = local15.anInt9530;
						Static172.anIntArrayArray202[local75][local80] = 1;
					} else if (local15.anInt9530 == Static189.anIntArrayArray80[local75][local80]) {
						local116 = Static172.anIntArrayArray202[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9444 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9442 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9444 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9442 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt9530 > Static189.anIntArrayArray80[local158][local161]) {
								Static189.anIntArrayArray80[local158][local161] = local15.anInt9530;
								Static172.anIntArrayArray202[local158][local161] = 1;
							} else if (local15.anInt9530 == Static189.anIntArrayArray80[local158][local161]) {
								local116 = Static172.anIntArrayArray202[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1525() {
		for (@Pc(1) int local1 = 0; local1 < Static54.anInt1038; local1++) {
			@Pc(6) int[] local6 = Static189.anIntArrayArray80[local1];
			for (@Pc(8) int local8 = 0; local8 < Static140.anInt3026; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1528() {
		@Pc(1) int local1 = Static403.anInt6982;
		@Pc(3) int[] local3 = Static430.anIntArray447;
		@Pc(20) boolean local20 = Static405.aClass3_Sub3_Sub1_1.anInt7576 == 1 && local1 > 200 || Static405.aClass3_Sub3_Sub1_1.anInt7576 == 0 && local1 > 50;
		@Pc(82) int local82;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class41_Sub2_Sub1_Sub4_Sub2 local29 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local3[local22]];
			if (!local29.method7876()) {
				local29.anInt9530 = -1;
			} else if (local29.aBoolean746) {
				local29.anInt9530 = -1;
			} else {
				local29.method7854();
				if (local29.aShort147 >= 0 && local29.aShort144 >= 0 && local29.aShort146 < Static54.anInt1038 && local29.aShort145 < Static140.anInt3026) {
					local29.aBoolean745 = local29.aBoolean739 ? local20 : false;
					if (local29 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2) {
						local29.anInt9530 = Integer.MAX_VALUE;
					} else {
						local82 = 0;
						if (!local29.aBoolean740) {
							local82++;
						}
						if (local29.anInt9501 > Static506.anInt8251) {
							local82 += 2;
						}
						local82 += 5 - local29.method7858() << 2;
						if (local29.aBoolean743) {
							local82 += 512;
						} else {
							if (Static501.anInt8125 == 0) {
								local82 += 32;
							} else {
								local82 += 128;
							}
							local82 += 256;
						}
						local29.anInt9530 = local82 + 1;
					}
				} else {
					local29.anInt9530 = -1;
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < Static88.anInt1884; local123++) {
			@Pc(134) Class41_Sub2_Sub1_Sub4_Sub1 local134 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) Static445.anIntArray470[local123])).aClass41_Sub2_Sub1_Sub4_Sub1_2;
			if (local134.method5653() && local134.aClass264_1.method6001(Static491.aClass318_1)) {
				local134.method7854();
				if (local134.aShort147 >= 0 && local134.aShort144 >= 0 && local134.aShort146 < Static54.anInt1038 && local134.aShort145 < Static140.anInt3026) {
					@Pc(171) int local171 = 0;
					if (!local134.aBoolean740) {
						local171++;
					}
					if (local134.anInt9501 > Static506.anInt8251) {
						local171 += 2;
					}
					local171 += 5 - local134.method7858() << 2;
					if (Static501.anInt8125 == 0) {
						if (local134.aClass264_1.aBoolean537) {
							local171 += 64;
						} else {
							local171 += 128;
						}
					} else if (Static501.anInt8125 == 1) {
						if (local134.aClass264_1.aBoolean537) {
							local171 += 32;
						} else {
							local171 += 64;
						}
					}
					if (local134.aClass264_1.aBoolean538) {
						local171 += 1024;
					} else if (!local134.aClass264_1.aBoolean535) {
						local171 += 256;
					}
					local134.anInt9530 = local171 + 1;
				} else {
					local134.anInt9530 = -1;
				}
			} else {
				local134.anInt9530 = -1;
			}
		}
		for (local82 = 0; local82 < Static283.aClass205Array1.length; local82++) {
			@Pc(237) Class205 local237 = Static283.aClass205Array1[local82];
			if (local237 != null) {
				if (local237.anInt5477 == 1) {
					@Pc(251) Class3_Sub34 local251 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local237.anInt5482);
					if (local251 != null) {
						@Pc(256) Class41_Sub2_Sub1_Sub4_Sub1 local256 = local251.aClass41_Sub2_Sub1_Sub4_Sub1_2;
						if (local256.anInt9530 >= 0) {
							local256.anInt9530 += 2048;
						}
					}
				} else if (local237.anInt5477 == 10) {
					@Pc(275) Class41_Sub2_Sub1_Sub4_Sub2 local275 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local237.anInt5482];
					if (local275 != null && local275 != Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 && local275.anInt9530 >= 0) {
						local275.anInt9530 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1529() {
		Static521.anInt8386 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static88.anInt1884; local3++) {
			@Pc(14) Class41_Sub2_Sub1_Sub4_Sub1 local14 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) Static445.anIntArray470[local3])).aClass41_Sub2_Sub1_Sub4_Sub1_2;
			if (local14.aBoolean740 && local14.method7864() != -1) {
				@Pc(32) int local32 = (local14.method7858() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9444 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9442 - local32 >> 9;
				@Pc(53) Class41_Sub2_Sub1_Sub4 local53 = Static467.method6471(local39, local14.aByte117, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt9472;
					if (local53 instanceof Class41_Sub2_Sub1_Sub4_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt9457 == 0 && local53.method7864() != -1) {
						Static397.anIntArray423[Static521.anInt8386] = local58;
						Static497.anIntArray516[Static521.anInt8386] = local58;
						Static521.anInt8386++;
						local53.anInt9457++;
					}
					Static397.anIntArray423[Static521.anInt8386] = local58;
					Static497.anIntArray516[Static521.anInt8386] = local14.anInt9472 + 2048;
					Static521.anInt8386++;
					local53.anInt9457++;
				}
			}
		}
		Static309.method4510(0, Static497.anIntArray516, Static397.anIntArray423, Static521.anInt8386 - 1);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!wp;)Lclient!wp;")
	public static Class361 method1530(@OriginalArg(0) Class361 arg0) {
		@Pc(4) int local4 = method1520(arg0).method5126();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static265.method4040(arg0.anInt9663);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1531() {
		@Pc(1) int local1 = Static403.anInt6982;
		@Pc(3) int[] local3 = Static430.anIntArray447;
		@Pc(11) int local11 = Static103.aBoolean167 ? local1 : local1 + Static88.anInt1884;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class41_Sub2_Sub1_Sub4 local23;
			if (local13 < local1) {
				local23 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) Static445.anIntArray470[local13 - local1])).aClass41_Sub2_Sub1_Sub4_Sub1_2;
			}
			if (local23.anInt9530 >= 0) {
				@Pc(43) int local43 = local23.method7858();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9444 & 0x1FF) == 0 && (local23.anInt9442 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9444 & 0x1FF) == 256 && (local23.anInt9442 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt9443 = Static475.method6537(local23.anInt9442, local23.aByte117, local23.anInt9444);
				Static586.method1886(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1532(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static403.anInt6982;
		@Pc(3) int[] local3 = Static430.anIntArray447;
		@Pc(11) int local11 = Static103.aBoolean167 ? local1 : local1 + Static88.anInt1884;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class41_Sub2_Sub1_Sub4 local23;
			if (local13 < local1) {
				local23 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) Static445.anIntArray470[local13 - local1])).aClass41_Sub2_Sub1_Sub4_Sub1_2;
			}
			if (local23.aByte117 == arg0) {
				local23.anInt9457 = 0;
				if (local23.anInt9530 < 0) {
					local23.aBoolean740 = false;
				} else {
					@Pc(54) int local54 = local23.method7858();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9444 & 0x1FF) != 0 || (local23.anInt9442 & 0x1FF) != 0) {
							local23.aBoolean740 = false;
							continue;
						}
					} else if ((local23.anInt9444 & 0x1FF) != 256 || (local23.anInt9442 & 0x1FF) != 256) {
						local23.aBoolean740 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9444 >> 9;
						local101 = local23.anInt9442 >> 9;
						if (local23.anInt9530 != Static189.anIntArrayArray80[local96][local101]) {
							local23.aBoolean740 = true;
							continue;
						}
						if (Static172.anIntArrayArray202[local96][local101] > 1) {
							local126 = Static172.anIntArrayArray202[local96][local101]--;
							local23.aBoolean740 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9444 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9442 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9444 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9442 + local96 >> 9;
						if (!Static365.method5320(local169, local101, local155, local162, local23.anInt9530)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt9530 == Static189.anIntArrayArray80[local180][local183]) {
										local126 = Static172.anIntArrayArray202[local180][local183]--;
									}
								}
							}
							local23.aBoolean740 = true;
							continue;
						}
					}
					local23.aBoolean740 = false;
					local23.anInt9443 = Static475.method6537(local23.anInt9442, local23.aByte117, local23.anInt9444);
					Static586.method1886(local23, true);
				}
			}
		}
	}
}
