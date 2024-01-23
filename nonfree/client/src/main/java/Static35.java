import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt849;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[[B")
	public static byte[][] aByteArrayArray19 = new byte[1000][];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[Lclient!vi;")
	public static Class174[] aClass174Array1 = new Class174[6];

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	public static void method698() {
		if (Static91.anInt2032 == 5) {
			Static91.anInt2032 = 6;
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method700() {
		Static152.method2622();
		Static42.method823();
		Static151.method2614();
		Static121.method2217();
		Static188.method3179();
		Static73.method1364();
		Static285.method4724();
		Static250.method4002();
		Static120.method2207();
		Static87.method1634();
		Static66.method1283();
		Static5.method123();
		Static279.method4654();
		Static227.method3803();
		Static187.method3177();
		Static92.method1720();
		Static248.method3971();
		Static188.method3178();
		Static177.method3088();
		Static289.method4811();
		Static75.aClass46_11.method1079();
		Static97.aClass46_12.method1079();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mn;)Z")
	public static boolean method701(@OriginalArg(0) Class115 arg0) {
		if (Static202.aBoolean348) {
			if (method708(arg0).anInt1534 != 0) {
				return false;
			}
			if (arg0.anInt3538 == 0) {
				return false;
			}
		}
		return arg0.aBoolean292;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Lclient!al;")
	public static Class2_Sub3_Sub2 method702(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub3_Sub2 local6 = (Class2_Sub3_Sub2) Static212.aClass53_9.method1254((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static87.aClass84_36.method2127(arg0, 26);
		local6 = new Class2_Sub3_Sub2();
		if (local26 != null) {
			local6.method273(new Class2_Sub26(local26));
		}
		Static212.aClass53_9.method1258((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!mn;IIIIIII)V")
	public static void method704(@OriginalArg(0) Class115[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class115 local9 = arg0[local1];
			if (local9 != null && local9.anInt3525 == arg1 && (!local9.aBoolean291 || local9.anInt3538 == 0 || local9.aBoolean296 || method708(local9).anInt1534 != 0 || local9 == Static11.aClass115_1 || local9.anInt3544 == 1338) && (!local9.aBoolean291 || !method701(local9))) {
				@Pc(50) int local50 = local9.anInt3556 + arg6;
				@Pc(55) int local55 = local9.anInt3536 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt3538 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt3555;
					@Pc(78) int local78 = local55 + local9.anInt3487;
					if (local9.anInt3538 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static23.aClass115_3) {
					Static29.aBoolean56 = true;
					Static47.anInt1115 = local50;
					Static145.anInt3123 = local55;
				}
				if (!local9.aBoolean291 || local61 < local65 && local63 < local67) {
					if (local9.anInt3538 == 0) {
						if (!local9.aBoolean291 && method701(local9) && Static109.aClass115_10 != local9) {
							continue;
						}
						if (local9.aBoolean295 && Static86.anInt1911 >= local61 && Static238.anInt4852 >= local63 && Static86.anInt1911 < local65 && Static238.anInt4852 < local67) {
							for (@Pc(164) Class2_Sub6 local164 = (Class2_Sub6) Static225.aClass1_20.method13(); local164 != null; local164 = (Class2_Sub6) Static225.aClass1_20.method9()) {
								if (local164.aBoolean43) {
									local164.method4926();
									local164.aClass115_4.aBoolean286 = false;
								}
							}
							if (Static187.anInt3939 == 0) {
								Static23.aClass115_3 = null;
								Static11.aClass115_1 = null;
							}
							Static296.anInt6182 = 0;
						}
					}
					if (local9.aBoolean291) {
						@Pc(207) boolean local207;
						if (Static86.anInt1911 >= local61 && Static238.anInt4852 >= local63 && Static86.anInt1911 < local65 && Static238.anInt4852 < local67) {
							local207 = true;
						} else {
							local207 = false;
						}
						@Pc(212) boolean local212 = false;
						if (Static279.anInt5824 == 1 && local207) {
							local212 = true;
						}
						@Pc(221) boolean local221 = false;
						if (Static246.anInt5126 == 1 && Static199.anInt4139 >= local61 && Static122.anInt2587 >= local63 && Static199.anInt4139 < local65 && Static122.anInt2587 < local67) {
							local221 = true;
						}
						@Pc(243) int local243;
						@Pc(339) int local339;
						if (local9.aByteArray29 != null) {
							for (local243 = 0; local243 < local9.aByteArray29.length; local243++) {
								if (Static79.aBooleanArray8[local9.aByteArray29[local243]]) {
									if (local9.anIntArray275 == null || Static148.anInt3168 >= local9.anIntArray275[local243]) {
										@Pc(279) byte local279 = local9.aByteArray30[local243];
										if (local279 == 0 || ((local279 & 0x8) == 0 || !Static79.aBooleanArray8[86] && !Static79.aBooleanArray8[82] && !Static79.aBooleanArray8[81]) && ((local279 & 0x2) == 0 || Static79.aBooleanArray8[86]) && ((local279 & 0x1) == 0 || Static79.aBooleanArray8[82]) && ((local279 & 0x4) == 0 || Static79.aBooleanArray8[81])) {
											Static297.method4948(-1, local9.anInt3552, "", local243 + 1);
											local339 = local9.anIntArray274[local243];
											if (local9.anIntArray275 == null) {
												local9.anIntArray275 = new int[local9.aByteArray29.length];
											}
											if (local339 == 0) {
												local9.anIntArray275[local243] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray275[local243] = Static148.anInt3168 + local339;
											}
										}
									}
								} else if (local9.anIntArray275 != null) {
									local9.anIntArray275[local243] = 0;
								}
							}
						}
						if (local221) {
							Static52.method1037(Static122.anInt2587 - local55, Static199.anInt4139 - local50, local9);
						}
						if (Static23.aClass115_3 != null && Static23.aClass115_3 != local9 && local207 && method708(local9).method1321()) {
							Static189.aClass115_12 = local9;
						}
						if (local9 == Static11.aClass115_1) {
							Static197.aBoolean343 = true;
							Static297.anInt6214 = local50;
							Static191.anInt706 = local55;
						}
						if (local9.aBoolean296 || local9.anInt3544 != 0) {
							@Pc(416) Class2_Sub6 local416;
							if (local207 && Static205.anInt4276 != 0 && local9.anObjectArray10 != null) {
								local416 = new Class2_Sub6();
								local416.aBoolean43 = true;
								local416.aClass115_4 = local9;
								local416.anInt534 = Static205.anInt4276;
								local416.anObjectArray1 = local9.anObjectArray10;
								Static225.aClass1_20.method11(local416);
							}
							if (Static23.aClass115_3 != null || Static292.aClass115_17 != null || Static299.aBoolean203 || local9.anInt3544 != 1400 && Static296.anInt6182 > 0) {
								local221 = false;
								local212 = false;
								local207 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt3544 != 0) {
								if (local9.anInt3544 == 1337) {
									Static74.aClass115_8 = local9;
									continue;
								}
								if (local9.anInt3544 == 1338) {
									if (local221) {
										Static284.anInt5879 = Static199.anInt4139 - local50;
										Static271.anInt5633 = Static122.anInt2587 - local55;
									}
									continue;
								}
								if (local9.anInt3544 == 1400) {
									Static269.aClass115_16 = local9;
									if (local221) {
										if (Static79.aBooleanArray8[82] && Static189.anInt3958 > 0) {
											local243 = (int) ((double) (Static199.anInt4139 - local50 - local9.anInt3555 / 2) * 2.0D / (double) Static280.aFloat55);
											local522 = (int) ((double) (Static122.anInt2587 - local55 - local9.anInt3487 / 2) * 2.0D / (double) Static280.aFloat55);
											local339 = Static219.anInt4587 + local243;
											@Pc(530) int local530 = Static61.anInt2999 + local522;
											@Pc(534) int local534 = local339 + Static115.anInt2461;
											@Pc(542) int local542 = Static52.anInt1205 + Static239.anInt4870 - local530 - 1;
											@Pc(545) Class2_Sub3_Sub18 local545 = Static95.method1828();
											@Pc(551) int[] local551 = local545.method2982(local542, local534);
											if (local551 != null) {
												Static131.method2288(local551[0], local551[2], local551[1]);
												Static87.method1628();
											}
											continue;
										}
										Static296.anInt6182 = 1;
										Static250.anInt4975 = Static86.anInt1911;
										Static90.anInt2002 = Static238.anInt4852;
										continue;
									}
									if (local212 && Static296.anInt6182 > 0) {
										if (Static296.anInt6182 == 1 && (Static250.anInt4975 != Static86.anInt1911 || Static90.anInt2002 != Static238.anInt4852)) {
											Static268.anInt5549 = Static219.anInt4587;
											Static57.anInt1999 = Static61.anInt2999;
											Static296.anInt6182 = 2;
										}
										if (Static296.anInt6182 == 2) {
											Static150.method2606(Static268.anInt5549 + (int) ((double) (Static250.anInt4975 - Static86.anInt1911) * 2.0D / (double) Static92.aFloat22));
											Static65.method1255(Static57.anInt1999 + (int) ((double) (Static90.anInt2002 - Static238.anInt4852) * 2.0D / (double) Static92.aFloat22));
										}
										continue;
									}
									Static296.anInt6182 = 0;
									continue;
								}
								if (local9.anInt3544 == 1401) {
									if (local212) {
										Static43.method835(local9.anInt3487, local9.anInt3555, Static86.anInt1911 - local50, Static238.anInt4852 - local55);
									}
									continue;
								}
								if (local9.anInt3544 == 1402) {
									if (!Static60.aBoolean106) {
										Static298.method4263(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean289 && local221) {
								local9.aBoolean289 = true;
								if (local9.anObjectArray17 != null) {
									local416 = new Class2_Sub6();
									local416.aBoolean43 = true;
									local416.aClass115_4 = local9;
									local416.anInt533 = Static199.anInt4139 - local50;
									local416.anInt534 = Static122.anInt2587 - local55;
									local416.anObjectArray1 = local9.anObjectArray17;
									Static225.aClass1_20.method11(local416);
								}
							}
							if (local9.aBoolean289 && local212 && local9.anObjectArray26 != null) {
								local416 = new Class2_Sub6();
								local416.aBoolean43 = true;
								local416.aClass115_4 = local9;
								local416.anInt533 = Static86.anInt1911 - local50;
								local416.anInt534 = Static238.anInt4852 - local55;
								local416.anObjectArray1 = local9.anObjectArray26;
								Static225.aClass1_20.method11(local416);
							}
							if (local9.aBoolean289 && !local212) {
								local9.aBoolean289 = false;
								if (local9.anObjectArray13 != null) {
									local416 = new Class2_Sub6();
									local416.aBoolean43 = true;
									local416.aClass115_4 = local9;
									local416.anInt533 = Static86.anInt1911 - local50;
									local416.anInt534 = Static238.anInt4852 - local55;
									local416.anObjectArray1 = local9.anObjectArray13;
									Static219.aClass1_17.method11(local416);
								}
							}
							if (local212 && local9.anObjectArray32 != null) {
								local416 = new Class2_Sub6();
								local416.aBoolean43 = true;
								local416.aClass115_4 = local9;
								local416.anInt533 = Static86.anInt1911 - local50;
								local416.anInt534 = Static238.anInt4852 - local55;
								local416.anObjectArray1 = local9.anObjectArray32;
								Static225.aClass1_20.method11(local416);
							}
							if (!local9.aBoolean286 && local207) {
								local9.aBoolean286 = true;
								if (local9.anObjectArray31 != null) {
									local416 = new Class2_Sub6();
									local416.aBoolean43 = true;
									local416.aClass115_4 = local9;
									local416.anInt533 = Static86.anInt1911 - local50;
									local416.anInt534 = Static238.anInt4852 - local55;
									local416.anObjectArray1 = local9.anObjectArray31;
									Static225.aClass1_20.method11(local416);
								}
							}
							if (local9.aBoolean286 && local207 && local9.anObjectArray16 != null) {
								local416 = new Class2_Sub6();
								local416.aBoolean43 = true;
								local416.aClass115_4 = local9;
								local416.anInt533 = Static86.anInt1911 - local50;
								local416.anInt534 = Static238.anInt4852 - local55;
								local416.anObjectArray1 = local9.anObjectArray16;
								Static225.aClass1_20.method11(local416);
							}
							if (local9.aBoolean286 && !local207) {
								local9.aBoolean286 = false;
								if (local9.anObjectArray14 != null) {
									local416 = new Class2_Sub6();
									local416.aBoolean43 = true;
									local416.aClass115_4 = local9;
									local416.anInt533 = Static86.anInt1911 - local50;
									local416.anInt534 = Static238.anInt4852 - local55;
									local416.anObjectArray1 = local9.anObjectArray14;
									Static219.aClass1_17.method11(local416);
								}
							}
							if (local9.anObjectArray8 != null) {
								local416 = new Class2_Sub6();
								local416.aClass115_4 = local9;
								local416.anObjectArray1 = local9.anObjectArray8;
								Static221.aClass1_19.method11(local416);
							}
							@Pc(997) Class2_Sub6 local997;
							if (local9.anObjectArray22 != null && Static19.anInt472 > local9.anInt3540) {
								if (local9.anIntArray282 == null || Static19.anInt472 - local9.anInt3540 > 32) {
									local416 = new Class2_Sub6();
									local416.aClass115_4 = local9;
									local416.anObjectArray1 = local9.anObjectArray22;
									Static225.aClass1_20.method11(local416);
								} else {
									label570: for (local243 = local9.anInt3540; local243 < Static19.anInt472; local243++) {
										local522 = Static163.anIntArray263[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray282.length; local339++) {
											if (local9.anIntArray282[local339] == local522) {
												local997 = new Class2_Sub6();
												local997.aClass115_4 = local9;
												local997.anObjectArray1 = local9.anObjectArray22;
												Static225.aClass1_20.method11(local997);
												break label570;
											}
										}
									}
								}
								local9.anInt3540 = Static19.anInt472;
							}
							if (local9.anObjectArray9 != null && Static287.anInt5948 > local9.anInt3515) {
								if (local9.anIntArray268 == null || Static287.anInt5948 - local9.anInt3515 > 32) {
									local416 = new Class2_Sub6();
									local416.aClass115_4 = local9;
									local416.anObjectArray1 = local9.anObjectArray9;
									Static225.aClass1_20.method11(local416);
								} else {
									label546: for (local243 = local9.anInt3515; local243 < Static287.anInt5948; local243++) {
										local522 = Static270.anIntArray494[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray268.length; local339++) {
											if (local9.anIntArray268[local339] == local522) {
												local997 = new Class2_Sub6();
												local997.aClass115_4 = local9;
												local997.anObjectArray1 = local9.anObjectArray9;
												Static225.aClass1_20.method11(local997);
												break label546;
											}
										}
									}
								}
								local9.anInt3515 = Static287.anInt5948;
							}
							if (local9.anObjectArray23 != null && Static261.anInt5432 > local9.anInt3505) {
								if (local9.anIntArray280 == null || Static261.anInt5432 - local9.anInt3505 > 32) {
									local416 = new Class2_Sub6();
									local416.aClass115_4 = local9;
									local416.anObjectArray1 = local9.anObjectArray23;
									Static225.aClass1_20.method11(local416);
								} else {
									label522: for (local243 = local9.anInt3505; local243 < Static261.anInt5432; local243++) {
										local522 = Static243.anIntArray302[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray280.length; local339++) {
											if (local9.anIntArray280[local339] == local522) {
												local997 = new Class2_Sub6();
												local997.aClass115_4 = local9;
												local997.anObjectArray1 = local9.anObjectArray23;
												Static225.aClass1_20.method11(local997);
												break label522;
											}
										}
									}
								}
								local9.anInt3505 = Static261.anInt5432;
							}
							if (local9.anObjectArray20 != null && Static56.anInt1272 > local9.anInt3522) {
								if (local9.anIntArray267 == null || Static56.anInt1272 - local9.anInt3522 > 32) {
									local416 = new Class2_Sub6();
									local416.aClass115_4 = local9;
									local416.anObjectArray1 = local9.anObjectArray20;
									Static225.aClass1_20.method11(local416);
								} else {
									label498: for (local243 = local9.anInt3522; local243 < Static56.anInt1272; local243++) {
										local522 = Static245.anIntArray480[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray267.length; local339++) {
											if (local9.anIntArray267[local339] == local522) {
												local997 = new Class2_Sub6();
												local997.aClass115_4 = local9;
												local997.anObjectArray1 = local9.anObjectArray20;
												Static225.aClass1_20.method11(local997);
												break label498;
											}
										}
									}
								}
								local9.anInt3522 = Static56.anInt1272;
							}
							if (local9.anObjectArray30 != null && Static134.anInt2732 > local9.anInt3559) {
								if (local9.anIntArray272 == null || Static134.anInt2732 - local9.anInt3559 > 32) {
									local416 = new Class2_Sub6();
									local416.aClass115_4 = local9;
									local416.anObjectArray1 = local9.anObjectArray30;
									Static225.aClass1_20.method11(local416);
								} else {
									label474: for (local243 = local9.anInt3559; local243 < Static134.anInt2732; local243++) {
										local522 = Static108.anIntArray162[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray272.length; local339++) {
											if (local9.anIntArray272[local339] == local522) {
												local997 = new Class2_Sub6();
												local997.aClass115_4 = local9;
												local997.anObjectArray1 = local9.anObjectArray30;
												Static225.aClass1_20.method11(local997);
												break label474;
											}
										}
									}
								}
								local9.anInt3559 = Static134.anInt2732;
							}
							if (Static231.anInt4771 > local9.anInt3545 && local9.anObjectArray21 != null) {
								local416 = new Class2_Sub6();
								local416.aClass115_4 = local9;
								local416.anObjectArray1 = local9.anObjectArray21;
								Static225.aClass1_20.method11(local416);
							}
							if (Static184.anInt3910 > local9.anInt3545 && local9.anObjectArray11 != null) {
								local416 = new Class2_Sub6();
								local416.aClass115_4 = local9;
								local416.anObjectArray1 = local9.anObjectArray11;
								Static225.aClass1_20.method11(local416);
							}
							if (Static67.anInt6127 > local9.anInt3545 && local9.anObjectArray12 != null) {
								local416 = new Class2_Sub6();
								local416.aClass115_4 = local9;
								local416.anObjectArray1 = local9.anObjectArray12;
								Static225.aClass1_20.method11(local416);
							}
							if (Static62.anInt1374 > local9.anInt3545 && local9.anObjectArray19 != null) {
								local416 = new Class2_Sub6();
								local416.aClass115_4 = local9;
								local416.anObjectArray1 = local9.anObjectArray19;
								Static225.aClass1_20.method11(local416);
							}
							if (Static250.anInt4981 > local9.anInt3545 && local9.anObjectArray28 != null) {
								local416 = new Class2_Sub6();
								local416.aClass115_4 = local9;
								local416.anObjectArray1 = local9.anObjectArray28;
								Static225.aClass1_20.method11(local416);
							}
							local9.anInt3545 = Static13.anInt334;
							if (local9.anObjectArray4 != null) {
								for (local243 = 0; local243 < Static263.anInt5394; local243++) {
									@Pc(1461) Class2_Sub6 local1461 = new Class2_Sub6();
									local1461.aClass115_4 = local9;
									local1461.anInt535 = Static196.anIntArray337[local243];
									local1461.anInt536 = Static290.anIntArray515[local243];
									local1461.anObjectArray1 = local9.anObjectArray4;
									Static225.aClass1_20.method11(local1461);
								}
							}
							if (Static199.aBoolean344 && local9.anObjectArray5 != null) {
								local416 = new Class2_Sub6();
								local416.aClass115_4 = local9;
								local416.anObjectArray1 = local9.anObjectArray5;
								Static225.aClass1_20.method11(local416);
							}
						}
					}
					if (!local9.aBoolean291 && Static23.aClass115_3 == null && Static292.aClass115_17 == null && !Static299.aBoolean203) {
						if ((local9.anInt3541 >= 0 || local9.anInt3520 != 0) && Static86.anInt1911 >= local61 && Static238.anInt4852 >= local63 && Static86.anInt1911 < local65 && Static238.anInt4852 < local67) {
							if (local9.anInt3541 >= 0) {
								Static109.aClass115_10 = arg0[local9.anInt3541];
							} else {
								Static109.aClass115_10 = local9;
							}
						}
						if (local9.anInt3538 == 8 && Static86.anInt1911 >= local61 && Static238.anInt4852 >= local63 && Static86.anInt1911 < local65 && Static238.anInt4852 < local67) {
							Static238.aClass115_15 = local9;
						}
						if (local9.anInt3464 > local9.anInt3487) {
							Static119.method2200(Static86.anInt1911, local9.anInt3487, local50 + local9.anInt3555, local55, local9, Static238.anInt4852, local9.anInt3464);
						}
					}
					if (local9.anInt3538 == 0) {
						method704(arg0, local9.anInt3552, local61, local63, local65, local67, local50 - local9.anInt3529, local55 - local9.anInt3514);
						if (local9.aClass115Array1 != null) {
							method704(local9.aClass115Array1, local9.anInt3552, local61, local63, local65, local67, local50 - local9.anInt3529, local55 - local9.anInt3514);
						}
						@Pc(1626) Class2_Sub15 local1626 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local9.anInt3552);
						if (local1626 != null) {
							Static243.method3056(local1626.anInt2424, local63, local61, local67, local50, local65, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Lclient!bd;")
	public static Class15 method706(@OriginalArg(0) int arg0) {
		@Pc(10) Class15 local10 = (Class15) Static259.aClass46_34.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static184.aClass84_77.method2127(Static97.method1885(arg0), Static217.method3667(arg0));
		local10 = new Class15();
		local10.anInt420 = arg0;
		if (local25 != null) {
			local10.method366(new Class2_Sub26(local25));
		}
		local10.method357();
		Static259.aClass46_34.method1071(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mn;)Lclient!mn;")
	public static Class115 method707(@OriginalArg(0) Class115 arg0) {
		@Pc(4) int local4 = method708(arg0).method1320();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static90.method1692(arg0.anInt3525);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mn;)Lclient!ff;")
	public static Class2_Sub11 method708(@OriginalArg(0) Class115 arg0) {
		@Pc(13) Class2_Sub11 local13 = (Class2_Sub11) Static293.aClass79_23.method2002(((long) arg0.anInt3552 << 32) + (long) arg0.anInt3499);
		return local13 == null ? arg0.aClass2_Sub11_1 : local13;
	}
}
