import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!vb;")
	public static Class252 aClass252_1;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!re;")
	public static Class210 aClass210_2;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	public static final int anInt1540 = 205;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	public static final int[] anIntArray66 = new int[500];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	public static void method1109(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub2 local12 = Static15.method236(arg0, 5);
		local12.method435();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1111() {
		@Pc(1) int local1 = Static348.anInt6137;
		@Pc(3) int[] local3 = Static348.anIntArray412;
		@Pc(20) boolean local20 = Static399.aClass167_Sub1_1.anInt5550 == 1 && local1 > 200 || Static399.aClass167_Sub1_1.anInt5550 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class4_Sub2_Sub2_Sub1 local29 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local3[local22]];
			if (local29.method4604()) {
				local29.method5564();
				if (local29.aShort88 >= 0 && local29.aShort89 >= 0 && local29.aShort87 < Static81.anInt1950 && local29.aShort86 < Static171.anInt3288) {
					local29.aBoolean509 = local29.aBoolean561 ? local20 : false;
					if (local29 == Static231.aClass4_Sub2_Sub2_Sub1_2) {
						local29.anInt6471 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean559) {
							local75++;
						}
						if (local29.anInt6451 > Static164.anInt3206) {
							local75 += 2;
						}
						local75 += 5 - local29.method5118() << 2;
						if (local29.aBoolean510) {
							local75 += 512;
						} else {
							if (Static338.anInt5982 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6471 = local75 + 1;
					}
				} else {
					local29.anInt6471 = -1;
				}
			} else {
				local29.anInt6471 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static391.anInt6867; local116++) {
			@Pc(123) Class4_Sub2_Sub2_Sub2 local123 = Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local116]];
			if (local123.method5133() && local123.aClass215_1.method4800(Static215.aClass225_1)) {
				local123.method5564();
				if (local123.aShort88 >= 0 && local123.aShort89 >= 0 && local123.aShort87 < Static81.anInt1950 && local123.aShort86 < Static171.anInt3288) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean559) {
						local160++;
					}
					if (local123.anInt6451 > Static164.anInt3206) {
						local160 += 2;
					}
					local160 += 5 - local123.method5118() << 2;
					if (Static338.anInt5982 == 0) {
						if (local123.aClass215_1.aBoolean531) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static338.anInt5982 == 1) {
						if (local123.aClass215_1.aBoolean531) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass215_1.aBoolean528) {
						local160 += 1024;
					} else if (!local123.aClass215_1.aBoolean533) {
						local160 += 256;
					}
					local123.anInt6471 = local160 + 1;
				} else {
					local123.anInt6471 = -1;
				}
			} else {
				local123.anInt6471 = -1;
			}
		}
		for (local75 = 0; local75 < Static2.aClass233Array1.length; local75++) {
			@Pc(226) Class233 local226 = Static2.aClass233Array1[local75];
			if (local226 != null) {
				if (local226.anInt6828 == 1) {
					@Pc(237) Class4_Sub2_Sub2_Sub2 local237 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local226.anInt6821];
					if (local237 != null && local237.anInt6471 >= 0) {
						local237.anInt6471 += 2048;
					}
				} else if (local226.anInt6828 == 10) {
					@Pc(258) Class4_Sub2_Sub2_Sub1 local258 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local226.anInt6821];
					if (local258 != null && local258 != Static231.aClass4_Sub2_Sub2_Sub1_2 && local258.anInt6471 >= 0) {
						local258.anInt6471 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!cr;)Lclient!ek;")
	public static Class2_Sub15 method1112(@OriginalArg(0) Class41 arg0) {
		@Pc(13) Class2_Sub15 local13 = (Class2_Sub15) Static350.aClass240_29.method5439(((long) arg0.anInt1613 << 32) + (long) arg0.anInt1683);
		return local13 == null ? arg0.aClass2_Sub15_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1113() {
		Static393.anInt6879 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static391.anInt6867; local3++) {
			@Pc(10) Class4_Sub2_Sub2_Sub2 local10 = Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local3]];
			if (local10.aBoolean559 && local10.method5125() != -1) {
				@Pc(28) int local28 = (local10.method5118() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt7117 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt7111 - local28 >> 7;
				@Pc(49) Class4_Sub2_Sub2 local49 = Static306.method4381(local10.aByte92, local35, local42);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6456;
					if (local49 instanceof Class4_Sub2_Sub2_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt6455 == 0 && local49.method5125() != -1) {
						anIntArray66[Static393.anInt6879] = local54;
						Static118.anIntArray134[Static393.anInt6879] = local54;
						Static393.anInt6879++;
						local49.anInt6455++;
					}
					anIntArray66[Static393.anInt6879] = local54;
					Static118.anIntArray134[Static393.anInt6879] = local10.anInt6456 + 2048;
					Static393.anInt6879++;
					local49.anInt6455++;
				}
			}
		}
		Static324.method4645(Static393.anInt6879 - 1, 0, Static118.anIntArray134, anIntArray66);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	public static void method1115() {
		Static391.aClass188_113 = null;
		Static415.anInt7247 = 1;
		Static358.anInt6316 = -1;
		Static229.anInt4373 = 0;
		Static158.anInt3122 = 2;
		Static434.anInt7559 = -1;
		Static206.aBoolean322 = false;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1117() {
		for (@Pc(1) int local1 = 0; local1 < Static81.anInt1950; local1++) {
			@Pc(6) int[] local6 = Static34.anIntArrayArray5[local1];
			for (@Pc(8) int local8 = 0; local8 < Static171.anInt3288; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	public static void method1118() {
		if (Static399.aClass167_Sub1_1.method4522(Static281.anInt5126) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static41.anInt1082 - 4 & 0xFF);
		@Pc(25) int local25 = Static41.anInt1082 % Static81.anInt1950;
		@Pc(35) int local35;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < Static171.anInt3288; local35++) {
				Static440.aByteArrayArrayArray17[local31][local25][local35] = local21;
			}
		}
		if (Static301.anInt5383 == 3) {
			return;
		}
		for (local35 = 0; local35 < 2; local35++) {
			Static255.anIntArray326[local35] = -1000000;
			Static43.anIntArray49[local35] = 1000000;
			Static277.anIntArray341[local35] = 0;
			Static209.anIntArray262[local35] = 1000000;
			Static328.anIntArray378[local35] = 0;
		}
		@Pc(138) int local138;
		if (Static65.anInt7824 != 1) {
			local138 = Static66.method1200(Static301.anInt5383, Static225.anInt4310, Static293.anInt5621);
			if (local138 - Static110.anInt2281 >= 800 || (Static367.aByteArrayArrayArray16[Static301.anInt5383][Static225.anInt4310 >> 7][Static293.anInt5621 >> 7] & 0x4) == 0) {
				return;
			}
			Static365.method5076(Static293.anInt5621 >> 7, Static176.aClass113ArrayArrayArray3, 1, Static225.anInt4310 >> 7, false);
			return;
		}
		if ((Static367.aByteArrayArrayArray16[Static301.anInt5383][Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >> 7][Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >> 7] & 0x4) != 0) {
			Static365.method5076(Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >> 7, Static176.aClass113ArrayArrayArray3, 0, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >> 7, false);
		}
		if (Static293.anInt5622 >= 2560) {
			return;
		}
		local138 = Static225.anInt4310 >> 7;
		@Pc(142) int local142 = Static293.anInt5621 >> 7;
		@Pc(147) int local147 = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >> 7;
		@Pc(152) int local152 = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >> 7;
		@Pc(164) int local164;
		if (local138 >= local147) {
			local164 = local138 - local147;
		} else {
			local164 = local147 - local138;
		}
		@Pc(179) int local179;
		if (local142 < local152) {
			local179 = local152 - local142;
		} else {
			local179 = local142 - local152;
		}
		if ((local164 != 0 || local179 != 0) && local164 > -Static81.anInt1950 && Static81.anInt1950 > local164 && -Static171.anInt3288 < local179 && local179 < Static171.anInt3288) {
			@Pc(251) int local251;
			@Pc(253) int local253;
			if (local164 > local179) {
				local251 = local179 * 65536 / local164;
				local253 = 32768;
				while (local147 != local138) {
					if (local138 < local147) {
						local138++;
					} else if (local147 < local138) {
						local138--;
					}
					if ((Static367.aByteArrayArrayArray16[Static301.anInt5383][local138][local142] & 0x4) != 0) {
						Static365.method5076(local142, Static176.aClass113ArrayArrayArray3, 1, local138, false);
						return;
					}
					local253 += local251;
					if (local253 >= 65536) {
						local253 -= 65536;
						if (local142 < local152) {
							local142++;
						} else if (local142 > local152) {
							local142--;
						}
						if ((Static367.aByteArrayArrayArray16[Static301.anInt5383][local138][local142] & 0x4) != 0) {
							Static365.method5076(local142, Static176.aClass113ArrayArrayArray3, 1, local138, false);
							return;
						}
					}
				}
				return;
			}
			local251 = local164 * 65536 / local179;
			local253 = 32768;
			while (local142 != local152) {
				if (local152 > local142) {
					local142++;
				} else if (local142 > local152) {
					local142--;
				}
				if ((Static367.aByteArrayArrayArray16[Static301.anInt5383][local138][local142] & 0x4) != 0) {
					Static365.method5076(local142, Static176.aClass113ArrayArrayArray3, 1, local138, false);
					return;
				}
				local253 += local251;
				if (local253 >= 65536) {
					if (local147 > local138) {
						local138++;
					} else if (local138 > local147) {
						local138--;
					}
					local253 -= 65536;
					if ((Static367.aByteArrayArrayArray16[Static301.anInt5383][local138][local142] & 0x4) != 0) {
						Static365.method5076(local142, Static176.aClass113ArrayArrayArray3, 1, local138, false);
						return;
					}
				}
			}
			return;
		}
		Static80.method1410(null, "RC: " + local138 + "," + local142 + " " + local147 + "," + local152 + " " + Static173.anInt3340 + "," + Static379.anInt6721);
		return;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!cr;IIIIIIIII)V")
	public static void method1119(@OriginalArg(0) Class41[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class41 local6 = arg0[local1];
			if (local6 != null && local6.anInt1663 == arg1) {
				@Pc(17) int local17 = local6.anInt1618 + arg6;
				@Pc(22) int local22 = local6.anInt1675 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt1642 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt1622;
					@Pc(45) int local45 = local22 + local6.anInt1599;
					if (local6.anInt1642 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt1642 == 0 || local6.aBoolean129 || method1112(local6).anInt2146 != 0 || local6 == Static309.aClass41_11 || local6.anInt1632 == Static345.anInt4167) {
					if (!method1129(local6)) {
						if (local6 == Static191.aClass41_7) {
							Static30.aBoolean590 = true;
							Static121.anInt2404 = local17;
							Static112.anInt2294 = local22;
						}
						if (local6.aBoolean130 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean138 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class2_Sub14 local148 = (Class2_Sub14) Static200.aClass265_55.method6005(); local148 != null; local148 = (Class2_Sub14) Static200.aClass265_55.method6001()) {
									if (local148.aBoolean167) {
										local148.method6072();
										local148.aClass41_5.aBoolean127 = false;
									}
								}
								if (Static190.anInt3757 == 0) {
									Static191.aClass41_7 = null;
									Static309.aClass41_11 = null;
								}
								Static93.anInt2136 = 0;
								Static434.aBoolean644 = false;
								Static112.aBoolean194 = false;
								if (!Static237.aBoolean384) {
									Static303.method4368();
								}
							}
							@Pc(204) boolean local204;
							if (Static304.aClass40_1.method1164() >= local28 && Static304.aClass40_1.method1159() >= local30 && Static304.aClass40_1.method1164() < local32 && Static304.aClass40_1.method1159() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static428.aBoolean637 && local204) {
								if (local6.anInt1647 >= 0) {
									Static217.anInt490 = local6.anInt1647;
								} else if (local6.aBoolean138) {
									Static217.anInt490 = -1;
								}
							}
							if (!Static237.aBoolean384 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static120.method1746(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(248) boolean local248 = false;
							if (Static304.aClass40_1.method1156() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class2_Sub6 local263 = (Class2_Sub6) Static36.aClass265_2.method6005();
							if (local263 != null && local263.method774() == 0 && local263.method772() >= local28 && local263.method771() >= local30 && local263.method772() < local32 && local263.method771() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray40 != null) {
								for (local296 = 0; local296 < local6.aByteArray40.length; local296++) {
									if (Static428.aClass52_1.method1347(local6.aByteArray40[local296])) {
										if (local6.anIntArray74 == null || Static164.anInt3206 >= local6.anIntArray74[local296]) {
											@Pc(328) byte local328 = local6.aByteArray39[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static428.aClass52_1.method1347(86) && !Static428.aClass52_1.method1347(82) && !Static428.aClass52_1.method1347(81)) && ((local328 & 0x2) == 0 || Static428.aClass52_1.method1347(86)) && ((local328 & 0x1) == 0 || Static428.aClass52_1.method1347(82)) && ((local328 & 0x4) == 0 || Static428.aClass52_1.method1347(81))) {
												if (local296 < 10) {
													Static92.method1556(local296 + 1, "", local6.anInt1613, -1);
												} else if (local296 == 10) {
													Static342.method4802();
													@Pc(399) Class2_Sub15 local399 = method1112(local6);
													Static330.method4704(local6, local399.method1590(), local399.anInt2149);
													Static174.aString23 = Static382.method5307(local6);
													if (Static174.aString23 == null) {
														Static174.aString23 = "Null";
													}
													Static179.aString56 = local6.aString13 + "<col=ffffff>";
												}
												local430 = local6.anIntArray75[local296];
												if (local6.anIntArray74 == null) {
													local6.anIntArray74 = new int[local6.aByteArray40.length];
												}
												if (local430 == 0) {
													local6.anIntArray74[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray74[local296] = Static164.anInt3206 + local430;
												}
											}
										}
									} else if (local6.anIntArray74 != null) {
										local6.anIntArray74[local296] = 0;
									}
								}
							}
							if (local258) {
								Static38.method721(local263.method771() - local22, local263.method772() - local17, local6);
							}
							if (Static191.aClass41_7 != null && Static191.aClass41_7 != local6 && local204 && method1112(local6).method1587()) {
								Static153.aClass41_6 = local6;
							}
							if (local6 == Static309.aClass41_11) {
								Static238.aBoolean374 = true;
								Static328.anInt5877 = local17;
								Static194.anInt3808 = local22;
							}
							if (local6.aBoolean129 || local6.anInt1632 != 0) {
								@Pc(515) Class2_Sub14 local515;
								if (local204 && Static89.anInt2016 != 0 && local6.anObjectArray5 != null) {
									local515 = new Class2_Sub14();
									local515.aBoolean167 = true;
									local515.aClass41_5 = local6;
									local515.anInt1852 = Static89.anInt2016;
									local515.anObjectArray32 = local6.anObjectArray5;
									Static200.aClass265_55.method5999(local515);
								}
								if (Static191.aClass41_7 != null || Static237.aBoolean384 || local6.anInt1632 != Static259.anInt4839 && Static93.anInt2136 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt1632 != 0) {
									if (local6.anInt1632 == Static225.anInt4312 || local6.anInt1632 == Static382.anInt6773) {
										Static402.aClass41_14 = local6;
										if (Static45.aClass243_4 != null) {
											Static45.aClass243_4.method5476(local6.anInt1599, Static387.aClass26_9);
										}
										if (local6.anInt1632 == Static225.anInt4312) {
											if (!Static237.aBoolean384 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static222.method3419(arg8, Static387.aClass26_9, arg9);
												for (@Pc(598) Class38_Sub7 local598 = (Class38_Sub7) Static334.aClass184_5.method4212(); local598 != null; local598 = (Class38_Sub7) Static334.aClass184_5.method4215()) {
													if (arg8 >= local598.anInt5069 && arg8 < local598.anInt5068 && arg9 >= local598.anInt5070 && arg9 < local598.anInt5071) {
														Static303.method4368();
														Static283.method4167(local598.aClass4_Sub2_Sub2_1);
													}
												}
											}
											Static112.method1693(local6, local22, local17);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt1632 == Static345.anInt4167) {
										if (local6.method1183(Static387.aClass26_9) == null || Static416.anInt7259 != 0 && Static416.anInt7259 != 3 || Static237.aBoolean384 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray77[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray76[local670]) {
											continue;
										}
										local296 -= local6.anInt1622 / 2;
										local670 -= local6.anInt1599 / 2;
										if (Static65.anInt7824 == 4) {
											local709 = (int) Static203.aFloat130 & 0x3FFF;
										} else {
											local709 = (int) Static203.aFloat130 + Static357.anInt3686 & 0x3FFF;
										}
										@Pc(721) int local721 = Class184.anIntArray349[local709];
										@Pc(725) int local725 = Class184.anIntArray350[local709];
										if (Static65.anInt7824 != 4) {
											local721 = local721 * (Static119.anInt2384 + 256) >> 8;
											local725 = local725 * (Static119.anInt2384 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static65.anInt7824 == 4) {
											local775 = (Static422.anInt7372 >> 7) + (local754 >> 2);
											local783 = (Static352.anInt7237 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static231.aClass4_Sub2_Sub2_Sub1_2.method5118() - 1) * 64;
											local775 = (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 - local792 >> 7) + (local754 >> 2);
											local783 = (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 - local792 >> 7) - (local764 >> 2);
										}
										if (Static428.aBoolean637 && (Static248.anInt4731 & 0x40) != 0) {
											@Pc(825) Class41 local825 = Static85.method2627(Static255.anInt4805, Static443.anInt7737);
											if (local825 == null) {
												Static342.method4802();
											} else {
												Static333.method4738(local6.anInt1671, " ->", true, local783, 30, Static174.aString23, Static445.anInt7767, 1L, local775, false);
											}
											continue;
										}
										if (Static107.aClass209_1 == Static389.aClass209_2) {
											Static333.method4738(-1, "", true, local783, 9, Static250.aClass256_71.method5720(Static272.anInt7537), -1, 1L, local775, false);
										}
										Static333.method4738(-1, "", true, local783, 6, Static52.aString69, Static22.anInt468, 1L, local775, false);
										continue;
									}
									if (local6.anInt1632 == Static259.anInt4839) {
										Static22.aClass41_1 = local6;
										if (local204) {
											Static434.aBoolean644 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method772() - local17 - local6.anInt1622 / 2) * 2.0D / (double) Static169.aFloat99);
											local670 = (int) -((double) (local263.method771() - local22 - local6.anInt1599 / 2) * 2.0D / (double) Static169.aFloat99);
											local430 = Static67.anInt1777 + local296 + Static169.anInt3161;
											local709 = Static393.anInt6878 + local670 + Static169.anInt3159;
											@Pc(939) Class2_Sub2_Sub11 local939 = Static351.method4911();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method3240(local430, local944, local709);
											if (local944 != null) {
												if (Static428.aClass52_1.method1347(82) && Static255.anInt4802 > 0) {
													Static39.method725(local944[2], local944[0], local944[1]);
													continue;
												}
												Static112.aBoolean194 = true;
												Static211.anInt4063 = local944[0];
												Static342.anInt6040 = local944[1];
												Static419.anInt7350 = local944[2];
											}
											Static93.anInt2136 = 1;
											Static418.aBoolean625 = false;
											Static77.anInt7116 = Static304.aClass40_1.method1164();
											Static396.anInt6928 = Static304.aClass40_1.method1159();
											continue;
										}
										if (local248 && Static93.anInt2136 > 0) {
											if (Static93.anInt2136 == 1 && (Static77.anInt7116 != Static304.aClass40_1.method1164() || Static396.anInt6928 != Static304.aClass40_1.method1159())) {
												Static344.anInt6088 = Static67.anInt1777;
												Static24.anInt526 = Static393.anInt6878;
												Static93.anInt2136 = 2;
											}
											if (Static93.anInt2136 == 2) {
												Static418.aBoolean625 = true;
												Static110.method1690(Static344.anInt6088 + (int) ((double) (Static77.anInt7116 - Static304.aClass40_1.method1164()) * 2.0D / (double) Static169.aFloat100));
												Static287.method4213(Static24.anInt526 - (int) ((double) (Static396.anInt6928 - Static304.aClass40_1.method1159()) * 2.0D / (double) Static169.aFloat100));
											}
											continue;
										}
										if (Static93.anInt2136 > 0 && !Static418.aBoolean625) {
											if ((Static296.anInt5336 == 1 || Static269.method4013()) && Static168.anInt3255 > 2) {
												Static389.method5366(Static77.anInt7116, Static396.anInt6928);
											} else if (Static253.method3873()) {
												Static389.method5366(Static77.anInt7116, Static396.anInt6928);
											}
										}
										Static93.anInt2136 = 0;
										continue;
									}
									if (local6.anInt1632 == Static397.anInt6953) {
										if (local248) {
											Static119.method1744(local6.anInt1599, Static304.aClass40_1.method1164() - local17, local6.anInt1622, Static304.aClass40_1.method1159() - local22);
										}
										continue;
									}
									if (local6.anInt1632 == Static283.anInt5163) {
										Static189.method2982(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean132 && local258) {
									local6.aBoolean132 = true;
									if (local6.anObjectArray27 != null) {
										local515 = new Class2_Sub14();
										local515.aBoolean167 = true;
										local515.aClass41_5 = local6;
										local515.anInt1856 = local263.method772() - local17;
										local515.anInt1852 = local263.method771() - local22;
										local515.anObjectArray32 = local6.anObjectArray27;
										Static200.aClass265_55.method5999(local515);
									}
								}
								if (local6.aBoolean132 && local248 && local6.anObjectArray12 != null) {
									local515 = new Class2_Sub14();
									local515.aBoolean167 = true;
									local515.aClass41_5 = local6;
									local515.anInt1856 = Static304.aClass40_1.method1164() - local17;
									local515.anInt1852 = Static304.aClass40_1.method1159() - local22;
									local515.anObjectArray32 = local6.anObjectArray12;
									Static200.aClass265_55.method5999(local515);
								}
								if (local6.aBoolean132 && !local248) {
									local6.aBoolean132 = false;
									if (local6.anObjectArray20 != null) {
										local515 = new Class2_Sub14();
										local515.aBoolean167 = true;
										local515.aClass41_5 = local6;
										local515.anInt1856 = Static304.aClass40_1.method1164() - local17;
										local515.anInt1852 = Static304.aClass40_1.method1159() - local22;
										local515.anObjectArray32 = local6.anObjectArray20;
										Static275.aClass265_52.method5999(local515);
									}
								}
								if (local248 && local6.anObjectArray18 != null) {
									local515 = new Class2_Sub14();
									local515.aBoolean167 = true;
									local515.aClass41_5 = local6;
									local515.anInt1856 = Static304.aClass40_1.method1164() - local17;
									local515.anInt1852 = Static304.aClass40_1.method1159() - local22;
									local515.anObjectArray32 = local6.anObjectArray18;
									Static200.aClass265_55.method5999(local515);
								}
								if (!local6.aBoolean127 && local204) {
									local6.aBoolean127 = true;
									if (local6.anObjectArray29 != null) {
										local515 = new Class2_Sub14();
										local515.aBoolean167 = true;
										local515.aClass41_5 = local6;
										local515.anInt1856 = Static304.aClass40_1.method1164() - local17;
										local515.anInt1852 = Static304.aClass40_1.method1159() - local22;
										local515.anObjectArray32 = local6.anObjectArray29;
										Static200.aClass265_55.method5999(local515);
									}
								}
								if (local6.aBoolean127 && local204 && local6.anObjectArray4 != null) {
									local515 = new Class2_Sub14();
									local515.aBoolean167 = true;
									local515.aClass41_5 = local6;
									local515.anInt1856 = Static304.aClass40_1.method1164() - local17;
									local515.anInt1852 = Static304.aClass40_1.method1159() - local22;
									local515.anObjectArray32 = local6.anObjectArray4;
									Static200.aClass265_55.method5999(local515);
								}
								if (local6.aBoolean127 && !local204) {
									local6.aBoolean127 = false;
									if (local6.anObjectArray9 != null) {
										local515 = new Class2_Sub14();
										local515.aBoolean167 = true;
										local515.aClass41_5 = local6;
										local515.anInt1856 = Static304.aClass40_1.method1164() - local17;
										local515.anInt1852 = Static304.aClass40_1.method1159() - local22;
										local515.anObjectArray32 = local6.anObjectArray9;
										Static275.aClass265_52.method5999(local515);
									}
								}
								if (local6.anObjectArray16 != null) {
									local515 = new Class2_Sub14();
									local515.aClass41_5 = local6;
									local515.anObjectArray32 = local6.anObjectArray16;
									Static237.aClass265_37.method5999(local515);
								}
								@Pc(1483) Class2_Sub14 local1483;
								if (local6.anObjectArray26 != null && Static96.anInt2174 > local6.anInt1658) {
									if (local6.anIntArray71 == null || Static96.anInt2174 - local6.anInt1658 > 32) {
										local515 = new Class2_Sub14();
										local515.aClass41_5 = local6;
										local515.anObjectArray32 = local6.anObjectArray26;
										Static200.aClass265_55.method5999(local515);
									} else {
										label678: for (local296 = local6.anInt1658; local296 < Static96.anInt2174; local296++) {
											local670 = Static385.anIntArray454[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray71.length; local430++) {
												if (local6.anIntArray71[local430] == local670) {
													local1483 = new Class2_Sub14();
													local1483.aClass41_5 = local6;
													local1483.anObjectArray32 = local6.anObjectArray26;
													Static200.aClass265_55.method5999(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt1658 = Static96.anInt2174;
								}
								if (local6.anObjectArray11 != null && Static64.anInt1758 > local6.anInt1652) {
									if (local6.anIntArray79 == null || Static64.anInt1758 - local6.anInt1652 > 32) {
										local515 = new Class2_Sub14();
										local515.aClass41_5 = local6;
										local515.anObjectArray32 = local6.anObjectArray11;
										Static200.aClass265_55.method5999(local515);
									} else {
										label654: for (local296 = local6.anInt1652; local296 < Static64.anInt1758; local296++) {
											local670 = Static203.anIntArray260[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray79.length; local430++) {
												if (local6.anIntArray79[local430] == local670) {
													local1483 = new Class2_Sub14();
													local1483.aClass41_5 = local6;
													local1483.anObjectArray32 = local6.anObjectArray11;
													Static200.aClass265_55.method5999(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt1652 = Static64.anInt1758;
								}
								if (local6.anObjectArray2 != null && Static358.anInt6319 > local6.anInt1625) {
									if (local6.anIntArray72 == null || Static358.anInt6319 - local6.anInt1625 > 32) {
										local515 = new Class2_Sub14();
										local515.aClass41_5 = local6;
										local515.anObjectArray32 = local6.anObjectArray2;
										Static200.aClass265_55.method5999(local515);
									} else {
										label630: for (local296 = local6.anInt1625; local296 < Static358.anInt6319; local296++) {
											local670 = Static441.anIntArray506[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray72.length; local430++) {
												if (local6.anIntArray72[local430] == local670) {
													local1483 = new Class2_Sub14();
													local1483.aClass41_5 = local6;
													local1483.anObjectArray32 = local6.anObjectArray2;
													Static200.aClass265_55.method5999(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt1625 = Static358.anInt6319;
								}
								if (local6.anObjectArray1 != null && Static422.anInt7370 > local6.anInt1656) {
									if (local6.anIntArray80 == null || Static422.anInt7370 - local6.anInt1656 > 32) {
										local515 = new Class2_Sub14();
										local515.aClass41_5 = local6;
										local515.anObjectArray32 = local6.anObjectArray1;
										Static200.aClass265_55.method5999(local515);
									} else {
										label606: for (local296 = local6.anInt1656; local296 < Static422.anInt7370; local296++) {
											local670 = Static52.anIntArray502[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray80.length; local430++) {
												if (local6.anIntArray80[local430] == local670) {
													local1483 = new Class2_Sub14();
													local1483.aClass41_5 = local6;
													local1483.anObjectArray32 = local6.anObjectArray1;
													Static200.aClass265_55.method5999(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt1656 = Static422.anInt7370;
								}
								if (local6.anObjectArray28 != null && Static65.anInt7829 > local6.anInt1602) {
									if (local6.anIntArray70 == null || Static65.anInt7829 - local6.anInt1602 > 32) {
										local515 = new Class2_Sub14();
										local515.aClass41_5 = local6;
										local515.anObjectArray32 = local6.anObjectArray28;
										Static200.aClass265_55.method5999(local515);
									} else {
										label582: for (local296 = local6.anInt1602; local296 < Static65.anInt7829; local296++) {
											local670 = Static196.anIntArray358[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray70.length; local430++) {
												if (local6.anIntArray70[local430] == local670) {
													local1483 = new Class2_Sub14();
													local1483.aClass41_5 = local6;
													local1483.anObjectArray32 = local6.anObjectArray28;
													Static200.aClass265_55.method5999(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt1602 = Static65.anInt7829;
								}
								if (Static406.anInt7045 > local6.anInt1643 && local6.anObjectArray31 != null) {
									local515 = new Class2_Sub14();
									local515.aClass41_5 = local6;
									local515.anObjectArray32 = local6.anObjectArray31;
									Static200.aClass265_55.method5999(local515);
								}
								if (Static337.anInt5964 > local6.anInt1643 && local6.anObjectArray19 != null) {
									local515 = new Class2_Sub14();
									local515.aClass41_5 = local6;
									local515.anObjectArray32 = local6.anObjectArray19;
									Static200.aClass265_55.method5999(local515);
								}
								if (Static117.anInt2361 > local6.anInt1643 && local6.anObjectArray22 != null) {
									local515 = new Class2_Sub14();
									local515.aClass41_5 = local6;
									local515.anObjectArray32 = local6.anObjectArray22;
									Static200.aClass265_55.method5999(local515);
								}
								if (Static266.anInt4928 > local6.anInt1643 && local6.anObjectArray6 != null) {
									local515 = new Class2_Sub14();
									local515.aClass41_5 = local6;
									local515.anObjectArray32 = local6.anObjectArray6;
									Static200.aClass265_55.method5999(local515);
								}
								if (Static432.anInt7520 > local6.anInt1643 && local6.anObjectArray15 != null) {
									local515 = new Class2_Sub14();
									local515.aClass41_5 = local6;
									local515.anObjectArray32 = local6.anObjectArray15;
									Static200.aClass265_55.method5999(local515);
								}
								local6.anInt1643 = Static331.anInt5891;
								if (local6.anObjectArray7 != null) {
									for (local296 = 0; local296 < Static357.anInt3690; local296++) {
										@Pc(1951) Class2_Sub14 local1951 = new Class2_Sub14();
										local1951.aClass41_5 = local6;
										local1951.anInt1854 = Static347.aClass42Array1[local296].method1202();
										local1951.anInt1853 = Static347.aClass42Array1[local296].method1201();
										local1951.anObjectArray32 = local6.anObjectArray7;
										Static200.aClass265_55.method5999(local1951);
									}
								}
								if (Static277.aBoolean430 && local6.anObjectArray3 != null) {
									local515 = new Class2_Sub14();
									local515.aClass41_5 = local6;
									local515.anObjectArray32 = local6.anObjectArray3;
									Static200.aClass265_55.method5999(local515);
								}
							}
							if (local6.anInt1642 == 5 && local6.anInt1664 != -1) {
								local6.method1181(Static148.aClass123_1, Static303.aClass35_1).method5476(local6.anInt1599, Static387.aClass26_9);
							}
							Static284.method4175(local6);
							if (local6.anInt1642 == 0) {
								method1119(arg0, local6.anInt1613, local28, local30, local32, local34, local17 - local6.anInt1665, local22 - local6.anInt1620, arg8, arg9);
								if (local6.aClass41Array1 != null) {
									method1119(local6.aClass41Array1, local6.anInt1613, local28, local30, local32, local34, local17 - local6.anInt1665, local22 - local6.anInt1620, arg8, arg9);
								}
								@Pc(2073) Class2_Sub25 local2073 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local6.anInt1613);
								if (local2073 != null) {
									if (Static107.aClass209_1 == Static407.aClass209_3 && local2073.anInt4162 == 0 && !Static237.aBoolean384 && local204 && !Static345.aBoolean339) {
										Static303.method4368();
									}
									Static272.method5847(local32, arg9, local17, local2073.anInt4163, local34, local30, local28, local22, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static284.method4175(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!cr;)Lclient!cr;")
	public static Class41 method1120(@OriginalArg(0) Class41 arg0) {
		@Pc(4) int local4 = method1112(arg0).method1592();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static160.method2564(arg0.anInt1663);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	public static void method1123(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static348.anInt6137;
		@Pc(3) int[] local3 = Static348.anIntArray412;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static391.anInt6867; local5++) {
			@Pc(15) Class4_Sub2_Sub2 local15;
			if (local5 < local1) {
				local15 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local3[local5]];
			} else {
				local15 = Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local5 - local1]];
			}
			if (local15.aByte92 == arg0 && local15.anInt6471 >= 0) {
				@Pc(35) int local35 = local15.method5118();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt7117 & 0x7F) != 0 || (local15.anInt7111 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7117 & 0x7F) != 64 || (local15.anInt7111 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt7117 >> 7;
					local76 = local15.anInt7111 >> 7;
					if (local15.anInt6471 > Static34.anIntArrayArray5[local71][local76]) {
						Static34.anIntArrayArray5[local71][local76] = local15.anInt6471;
						Static275.anIntArrayArray60[local71][local76] = 1;
					} else if (local15.anInt6471 == Static34.anIntArrayArray5[local71][local76]) {
						local112 = Static275.anIntArrayArray60[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt7117 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt7111 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt7117 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt7111 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6471 > Static34.anIntArrayArray5[local154][local157]) {
								Static34.anIntArrayArray5[local154][local157] = local15.anInt6471;
								Static275.anIntArrayArray60[local154][local157] = 1;
							} else if (local15.anInt6471 == Static34.anIntArrayArray5[local154][local157]) {
								local112 = Static275.anIntArrayArray60[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	public static void method1124() {
		Static277.aClass129_48.method3025();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1125(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static348.anInt6137;
		@Pc(3) int[] local3 = Static348.anIntArray412;
		@Pc(11) int local11 = Static65.aBoolean667 ? local1 : local1 + Static391.anInt6867;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class4_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local3[local13]];
			} else {
				local23 = Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local13 - local1]];
			}
			if (local23.aByte92 == arg0) {
				local23.anInt6455 = 0;
				if (local23.anInt6471 < 0) {
					local23.aBoolean559 = false;
				} else {
					@Pc(50) int local50 = local23.method5118();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt7117 & 0x7F) != 0 || (local23.anInt7111 & 0x7F) != 0) {
							local23.aBoolean559 = false;
							continue;
						}
					} else if ((local23.anInt7117 & 0x7F) != 64 || (local23.anInt7111 & 0x7F) != 64) {
						local23.aBoolean559 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt7117 >> 7;
						local97 = local23.anInt7111 >> 7;
						if (local23.anInt6471 != Static34.anIntArrayArray5[local92][local97]) {
							local23.aBoolean559 = true;
							continue;
						}
						if (Static275.anIntArrayArray60[local92][local97] > 1) {
							local122 = Static275.anIntArrayArray60[local92][local97]--;
							local23.aBoolean559 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt7117 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt7111 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt7117 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt7111 + local92 >> 7;
						if (!Static400.method5460(local158, local97, local23.anInt6471, local151, local165)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6471 == Static34.anIntArrayArray5[local176][local179]) {
										local122 = Static275.anIntArrayArray60[local176][local179]--;
									}
								}
							}
							local23.aBoolean559 = true;
							continue;
						}
					}
					if (local23 instanceof Class4_Sub2_Sub2_Sub1 && local23.aClass2_Sub24_3 != null && Static164.anInt3206 >= local23.aClass2_Sub24_3.anInt3890 && Static164.anInt3206 < local23.aClass2_Sub24_3.anInt3898) {
						((Class4_Sub2_Sub2_Sub1) local23).aBoolean509 = false;
					}
					local23.aBoolean559 = false;
					local23.anInt7109 = Static66.method1200(local23.aByte92, local23.anInt7117, local23.anInt7111);
					Static317.method4544(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1128() {
		@Pc(1) int local1 = Static348.anInt6137;
		@Pc(3) int[] local3 = Static348.anIntArray412;
		@Pc(11) int local11 = Static65.aBoolean667 ? local1 : local1 + Static391.anInt6867;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class4_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local3[local13]];
			} else {
				local23 = Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local13 - local1]];
			}
			if (local23.anInt6471 >= 0) {
				@Pc(39) int local39 = local23.method5118();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt7117 & 0x7F) == 0 && (local23.anInt7111 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7117 & 0x7F) == 64 && (local23.anInt7111 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class4_Sub2_Sub2_Sub1 && local23.aClass2_Sub24_3 != null && Static164.anInt3206 >= local23.aClass2_Sub24_3.anInt3890 && Static164.anInt3206 < local23.aClass2_Sub24_3.anInt3898) {
					((Class4_Sub2_Sub2_Sub1) local23).aBoolean509 = false;
				}
				local23.anInt7109 = Static66.method1200(local23.aByte92, local23.anInt7117, local23.anInt7111);
				Static317.method4544(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!cr;)Z")
	public static boolean method1129(@OriginalArg(0) Class41 arg0) {
		if (Static345.aBoolean339) {
			if (method1112(arg0).anInt2146 != 0) {
				return false;
			}
			if (arg0.anInt1642 == 0) {
				return false;
			}
		}
		return arg0.aBoolean139;
	}
}
