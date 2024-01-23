import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!km;")
	public static Class91 aClass91_38;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[Lclient!dl;")
	public static Class14_Sub3[] aClass14_Sub3Array1 = new Class14_Sub3[4];

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString49 = "Continue";

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!in;)Z")
	public static boolean method763(@OriginalArg(0) Class71 arg0) {
		if (Static178.aBoolean303) {
			if (method769(arg0).anInt1759 != 0) {
				return false;
			}
			if (arg0.anInt2712 == 0) {
				return false;
			}
		}
		return arg0.aBoolean203;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!in;)Lclient!in;")
	public static Class71 method766(@OriginalArg(0) Class71 arg0) {
		@Pc(4) int local4 = method769(arg0).method1370();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static56.method1058(arg0.anInt2674);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!in;)Lclient!fl;")
	public static Class1_Sub15 method769(@OriginalArg(0) Class71 arg0) {
		@Pc(13) Class1_Sub15 local13 = (Class1_Sub15) Static263.aClass70_19.method2075(((long) arg0.anInt2655 << 32) + (long) arg0.anInt2689);
		return local13 == null ? arg0.aClass1_Sub15_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V")
	public static void method770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < Static227.anInt4509; local14++) {
			@Pc(21) Class10 local21 = Static163.method2826(local14);
			if (local21 != null) {
				@Pc(29) int local29 = local21.anInt264;
				if (local29 >= 0 && !Static110.anInterface2_1.method2275(local29)) {
					local29 = -1;
				}
				@Pc(56) int local56;
				@Pc(69) int local69;
				@Pc(75) int local75;
				@Pc(101) int local101;
				if (local21.anInt259 >= 0) {
					local69 = local21.anInt259;
					local75 = arg0 + (local69 & 0x7F);
					if (local75 < 0) {
						local75 = 0;
					} else if (local75 > 127) {
						local75 = 127;
					}
					local101 = local75 + (local69 & 0x380) + (arg1 + local69 & 0xFC00);
					local56 = Static110.anIntArray224[Static286.method4317(local101, 96)];
				} else if (local29 >= 0) {
					local56 = Static110.anIntArray224[Static286.method4317(Static110.anInterface2_1.method2266(local29), 96)];
				} else if (local21.anInt262 == -1) {
					local56 = -1;
				} else {
					local69 = local21.anInt262;
					local75 = (local69 & 0x7F) + arg0;
					if (local75 < 0) {
						local75 = 0;
					} else if (local75 > 127) {
						local75 = 127;
					}
					local101 = local75 + (local69 + arg1 & 0xFC00) + (local69 & 0x380);
					local56 = Static110.anIntArray224[Static286.method4317(local101, 96)];
				}
				Static21.anIntArray48[local14 + 1] = local56;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!in;IIIIIII)V")
	public static void method772(@OriginalArg(0) Class71[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class71 local9 = arg0[local1];
			if (local9 != null && local9.anInt2674 == arg1 && (!local9.aBoolean196 || local9.anInt2712 == 0 || local9.aBoolean197 || method769(local9).anInt1759 != 0 || local9 == Static100.aClass71_12 || local9.anInt2713 == 1338) && (!local9.aBoolean196 || !method763(local9))) {
				@Pc(50) int local50 = local9.anInt2641 + arg6;
				@Pc(55) int local55 = local9.anInt2711 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt2712 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt2722;
					@Pc(78) int local78 = local55 + local9.anInt2698;
					if (local9.anInt2712 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static84.aClass71_11) {
					Static68.aBoolean105 = true;
					Static265.anInt5181 = local50;
					Static62.anInt1330 = local55;
				}
				if (!local9.aBoolean196 || local61 < local65 && local63 < local67) {
					if (local9.anInt2712 == 0) {
						if (!local9.aBoolean196 && method763(local9) && Static247.aClass71_21 != local9) {
							continue;
						}
						if (local9.aBoolean193 && Static224.anInt4445 >= local61 && Static8.anInt226 >= local63 && Static224.anInt4445 < local65 && Static8.anInt226 < local67) {
							for (@Pc(164) Class1_Sub14 local164 = (Class1_Sub14) Static276.aClass61_16.method1835(); local164 != null; local164 = (Class1_Sub14) Static276.aClass61_16.method1836()) {
								if (local164.aBoolean88) {
									local164.method4441();
									local164.aClass71_8.aBoolean200 = false;
								}
							}
							if (Static254.anInt4980 == 0) {
								Static84.aClass71_11 = null;
								Static100.aClass71_12 = null;
							}
							Static220.anInt4370 = 0;
						}
					}
					if (local9.aBoolean196) {
						@Pc(207) boolean local207;
						if (Static224.anInt4445 >= local61 && Static8.anInt226 >= local63 && Static224.anInt4445 < local65 && Static8.anInt226 < local67) {
							local207 = true;
						} else {
							local207 = false;
						}
						@Pc(212) boolean local212 = false;
						if (Static66.anInt1384 == 1 && local207) {
							local212 = true;
						}
						@Pc(221) boolean local221 = false;
						if (Static123.anInt2804 == 1 && Static249.anInt4936 >= local61 && Static40.anInt1015 >= local63 && Static249.anInt4936 < local65 && Static40.anInt1015 < local67) {
							local221 = true;
						}
						@Pc(243) int local243;
						@Pc(339) int local339;
						if (local9.aByteArray40 != null) {
							for (local243 = 0; local243 < local9.aByteArray40.length; local243++) {
								if (Static175.aBooleanArray34[local9.aByteArray40[local243]]) {
									if (local9.anIntArray247 == null || Static237.anInt4710 >= local9.anIntArray247[local243]) {
										@Pc(279) byte local279 = local9.aByteArray39[local243];
										if (local279 == 0 || ((local279 & 0x8) == 0 || !Static175.aBooleanArray34[86] && !Static175.aBooleanArray34[82] && !Static175.aBooleanArray34[81]) && ((local279 & 0x2) == 0 || Static175.aBooleanArray34[86]) && ((local279 & 0x1) == 0 || Static175.aBooleanArray34[82]) && ((local279 & 0x4) == 0 || Static175.aBooleanArray34[81])) {
											Static142.method2350(-1, local9.anInt2655, "", local243 + 1);
											local339 = local9.anIntArray237[local243];
											if (local9.anIntArray247 == null) {
												local9.anIntArray247 = new int[local9.aByteArray40.length];
											}
											if (local339 == 0) {
												local9.anIntArray247[local243] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray247[local243] = Static237.anInt4710 + local339;
											}
										}
									}
								} else if (local9.anIntArray247 != null) {
									local9.anIntArray247[local243] = 0;
								}
							}
						}
						if (local221) {
							Static211.method3351(local9, Static40.anInt1015 - local55, Static249.anInt4936 - local50);
						}
						if (Static84.aClass71_11 != null && Static84.aClass71_11 != local9 && local207 && method769(local9).method1376()) {
							Static29.aClass71_2 = local9;
						}
						if (local9 == Static100.aClass71_12) {
							Static62.aBoolean94 = true;
							Static52.anInt1186 = local50;
							Static142.anInt3049 = local55;
						}
						if (local9.aBoolean197 || local9.anInt2713 != 0) {
							@Pc(416) Class1_Sub14 local416;
							if (local207 && Static160.anInt3450 != 0 && local9.anObjectArray14 != null) {
								local416 = new Class1_Sub14();
								local416.aBoolean88 = true;
								local416.aClass71_8 = local9;
								local416.anInt1263 = Static160.anInt3450;
								local416.anObjectArray1 = local9.anObjectArray14;
								Static276.aClass61_16.method1839(local416);
							}
							if (Static84.aClass71_11 != null || Static185.aClass71_16 != null || Static14.aBoolean23 || local9.anInt2713 != 1400 && Static220.anInt4370 > 0) {
								local221 = false;
								local212 = false;
								local207 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt2713 != 0) {
								if (local9.anInt2713 == 1337) {
									Static69.aClass71_9 = local9;
									continue;
								}
								if (local9.anInt2713 == 1338) {
									if (local221) {
										Static283.anInt5399 = Static249.anInt4936 - local50;
										Static122.anInt3995 = Static40.anInt1015 - local55;
									}
									continue;
								}
								if (local9.anInt2713 == 1400) {
									Static170.aClass71_15 = local9;
									if (local221) {
										if (Static175.aBooleanArray34[82] && Static31.anInt745 > 0) {
											local243 = (int) ((double) (Static249.anInt4936 - local50 - local9.anInt2722 / 2) * 2.0D / (double) Static13.aFloat3);
											local522 = (int) ((double) (Static40.anInt1015 - local55 - local9.anInt2698 / 2) * 2.0D / (double) Static13.aFloat3);
											local339 = Static88.anInt1962 + local243;
											@Pc(530) int local530 = Static207.anInt4867 + local522;
											@Pc(534) int local534 = local339 + Static264.anInt5177;
											@Pc(542) int local542 = Static95.anInt2218 + Static254.anInt4979 - local530 - 1;
											@Pc(545) Class1_Sub2_Sub21 local545 = Static101.method1894();
											@Pc(551) int[] local551 = local545.method4290(local534, local542);
											if (local551 != null) {
												Static259.method3977(local551[1], local551[2], local551[0]);
												Static261.method4008();
											}
											continue;
										}
										Static220.anInt4370 = 1;
										Static9.anInt238 = Static224.anInt4445;
										Static10.anInt245 = Static8.anInt226;
										continue;
									}
									if (local212 && Static220.anInt4370 > 0) {
										if (Static220.anInt4370 == 1 && (Static9.anInt238 != Static224.anInt4445 || Static10.anInt245 != Static8.anInt226)) {
											Static97.anInt2270 = Static88.anInt1962;
											Static200.anInt4066 = Static207.anInt4867;
											Static220.anInt4370 = 2;
										}
										if (Static220.anInt4370 == 2) {
											Static49.method937(Static97.anInt2270 + (int) ((double) (Static9.anInt238 - Static224.anInt4445) * 2.0D / (double) Static220.aFloat43));
											Static16.method303(Static200.anInt4066 + (int) ((double) (Static10.anInt245 - Static8.anInt226) * 2.0D / (double) Static220.aFloat43));
										}
										continue;
									}
									Static220.anInt4370 = 0;
									continue;
								}
								if (local9.anInt2713 == 1401) {
									if (local212) {
										Static35.method1451(Static8.anInt226 - local55, local9.anInt2722, Static224.anInt4445 - local50, local9.anInt2698);
									}
									continue;
								}
								if (local9.anInt2713 == 1402) {
									if (!Static277.aBoolean412) {
										Static160.method2779(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean195 && local221) {
								local9.aBoolean195 = true;
								if (local9.anObjectArray17 != null) {
									local416 = new Class1_Sub14();
									local416.aBoolean88 = true;
									local416.aClass71_8 = local9;
									local416.anInt1265 = Static249.anInt4936 - local50;
									local416.anInt1263 = Static40.anInt1015 - local55;
									local416.anObjectArray1 = local9.anObjectArray17;
									Static276.aClass61_16.method1839(local416);
								}
							}
							if (local9.aBoolean195 && local212 && local9.anObjectArray23 != null) {
								local416 = new Class1_Sub14();
								local416.aBoolean88 = true;
								local416.aClass71_8 = local9;
								local416.anInt1265 = Static224.anInt4445 - local50;
								local416.anInt1263 = Static8.anInt226 - local55;
								local416.anObjectArray1 = local9.anObjectArray23;
								Static276.aClass61_16.method1839(local416);
							}
							if (local9.aBoolean195 && !local212) {
								local9.aBoolean195 = false;
								if (local9.anObjectArray28 != null) {
									local416 = new Class1_Sub14();
									local416.aBoolean88 = true;
									local416.aClass71_8 = local9;
									local416.anInt1265 = Static224.anInt4445 - local50;
									local416.anInt1263 = Static8.anInt226 - local55;
									local416.anObjectArray1 = local9.anObjectArray28;
									Static108.aClass61_13.method1839(local416);
								}
							}
							if (local212 && local9.anObjectArray9 != null) {
								local416 = new Class1_Sub14();
								local416.aBoolean88 = true;
								local416.aClass71_8 = local9;
								local416.anInt1265 = Static224.anInt4445 - local50;
								local416.anInt1263 = Static8.anInt226 - local55;
								local416.anObjectArray1 = local9.anObjectArray9;
								Static276.aClass61_16.method1839(local416);
							}
							if (!local9.aBoolean200 && local207) {
								local9.aBoolean200 = true;
								if (local9.anObjectArray20 != null) {
									local416 = new Class1_Sub14();
									local416.aBoolean88 = true;
									local416.aClass71_8 = local9;
									local416.anInt1265 = Static224.anInt4445 - local50;
									local416.anInt1263 = Static8.anInt226 - local55;
									local416.anObjectArray1 = local9.anObjectArray20;
									Static276.aClass61_16.method1839(local416);
								}
							}
							if (local9.aBoolean200 && local207 && local9.anObjectArray29 != null) {
								local416 = new Class1_Sub14();
								local416.aBoolean88 = true;
								local416.aClass71_8 = local9;
								local416.anInt1265 = Static224.anInt4445 - local50;
								local416.anInt1263 = Static8.anInt226 - local55;
								local416.anObjectArray1 = local9.anObjectArray29;
								Static276.aClass61_16.method1839(local416);
							}
							if (local9.aBoolean200 && !local207) {
								local9.aBoolean200 = false;
								if (local9.anObjectArray4 != null) {
									local416 = new Class1_Sub14();
									local416.aBoolean88 = true;
									local416.aClass71_8 = local9;
									local416.anInt1265 = Static224.anInt4445 - local50;
									local416.anInt1263 = Static8.anInt226 - local55;
									local416.anObjectArray1 = local9.anObjectArray4;
									Static108.aClass61_13.method1839(local416);
								}
							}
							if (local9.anObjectArray11 != null) {
								local416 = new Class1_Sub14();
								local416.aClass71_8 = local9;
								local416.anObjectArray1 = local9.anObjectArray11;
								Static170.aClass61_19.method1839(local416);
							}
							@Pc(997) Class1_Sub14 local997;
							if (local9.anObjectArray13 != null && Static138.anInt4591 > local9.anInt2658) {
								if (local9.anIntArray235 == null || Static138.anInt4591 - local9.anInt2658 > 32) {
									local416 = new Class1_Sub14();
									local416.aClass71_8 = local9;
									local416.anObjectArray1 = local9.anObjectArray13;
									Static276.aClass61_16.method1839(local416);
								} else {
									label570: for (local243 = local9.anInt2658; local243 < Static138.anInt4591; local243++) {
										local522 = Static93.anIntArray186[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray235.length; local339++) {
											if (local9.anIntArray235[local339] == local522) {
												local997 = new Class1_Sub14();
												local997.aClass71_8 = local9;
												local997.anObjectArray1 = local9.anObjectArray13;
												Static276.aClass61_16.method1839(local997);
												break label570;
											}
										}
									}
								}
								local9.anInt2658 = Static138.anInt4591;
							}
							if (local9.anObjectArray25 != null && Static291.anInt5517 > local9.anInt2684) {
								if (local9.anIntArray240 == null || Static291.anInt5517 - local9.anInt2684 > 32) {
									local416 = new Class1_Sub14();
									local416.aClass71_8 = local9;
									local416.anObjectArray1 = local9.anObjectArray25;
									Static276.aClass61_16.method1839(local416);
								} else {
									label546: for (local243 = local9.anInt2684; local243 < Static291.anInt5517; local243++) {
										local522 = Static71.anIntArray145[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray240.length; local339++) {
											if (local9.anIntArray240[local339] == local522) {
												local997 = new Class1_Sub14();
												local997.aClass71_8 = local9;
												local997.anObjectArray1 = local9.anObjectArray25;
												Static276.aClass61_16.method1839(local997);
												break label546;
											}
										}
									}
								}
								local9.anInt2684 = Static291.anInt5517;
							}
							if (local9.anObjectArray10 != null && Static129.anInt2878 > local9.anInt2708) {
								if (local9.anIntArray241 == null || Static129.anInt2878 - local9.anInt2708 > 32) {
									local416 = new Class1_Sub14();
									local416.aClass71_8 = local9;
									local416.anObjectArray1 = local9.anObjectArray10;
									Static276.aClass61_16.method1839(local416);
								} else {
									label522: for (local243 = local9.anInt2708; local243 < Static129.anInt2878; local243++) {
										local522 = Static179.anIntArray337[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray241.length; local339++) {
											if (local9.anIntArray241[local339] == local522) {
												local997 = new Class1_Sub14();
												local997.aClass71_8 = local9;
												local997.anObjectArray1 = local9.anObjectArray10;
												Static276.aClass61_16.method1839(local997);
												break label522;
											}
										}
									}
								}
								local9.anInt2708 = Static129.anInt2878;
							}
							if (local9.anObjectArray8 != null && Static101.anInt2397 > local9.anInt2673) {
								if (local9.anIntArray245 == null || Static101.anInt2397 - local9.anInt2673 > 32) {
									local416 = new Class1_Sub14();
									local416.aClass71_8 = local9;
									local416.anObjectArray1 = local9.anObjectArray8;
									Static276.aClass61_16.method1839(local416);
								} else {
									label498: for (local243 = local9.anInt2673; local243 < Static101.anInt2397; local243++) {
										local522 = Static276.anIntArray268[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray245.length; local339++) {
											if (local9.anIntArray245[local339] == local522) {
												local997 = new Class1_Sub14();
												local997.aClass71_8 = local9;
												local997.anObjectArray1 = local9.anObjectArray8;
												Static276.aClass61_16.method1839(local997);
												break label498;
											}
										}
									}
								}
								local9.anInt2673 = Static101.anInt2397;
							}
							if (local9.anObjectArray5 != null && Static244.anInt4849 > local9.anInt2683) {
								if (local9.anIntArray232 == null || Static244.anInt4849 - local9.anInt2683 > 32) {
									local416 = new Class1_Sub14();
									local416.aClass71_8 = local9;
									local416.anObjectArray1 = local9.anObjectArray5;
									Static276.aClass61_16.method1839(local416);
								} else {
									label474: for (local243 = local9.anInt2683; local243 < Static244.anInt4849; local243++) {
										local522 = Static108.anIntArray220[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray232.length; local339++) {
											if (local9.anIntArray232[local339] == local522) {
												local997 = new Class1_Sub14();
												local997.aClass71_8 = local9;
												local997.anObjectArray1 = local9.anObjectArray5;
												Static276.aClass61_16.method1839(local997);
												break label474;
											}
										}
									}
								}
								local9.anInt2683 = Static244.anInt4849;
							}
							if (Static270.anInt5278 > local9.anInt2729 && local9.anObjectArray6 != null) {
								local416 = new Class1_Sub14();
								local416.aClass71_8 = local9;
								local416.anObjectArray1 = local9.anObjectArray6;
								Static276.aClass61_16.method1839(local416);
							}
							if (Static67.anInt1414 > local9.anInt2729 && local9.anObjectArray30 != null) {
								local416 = new Class1_Sub14();
								local416.aClass71_8 = local9;
								local416.anObjectArray1 = local9.anObjectArray30;
								Static276.aClass61_16.method1839(local416);
							}
							if (Static34.anInt802 > local9.anInt2729 && local9.anObjectArray2 != null) {
								local416 = new Class1_Sub14();
								local416.aClass71_8 = local9;
								local416.anObjectArray1 = local9.anObjectArray2;
								Static276.aClass61_16.method1839(local416);
							}
							if (Static14.anInt278 > local9.anInt2729 && local9.anObjectArray24 != null) {
								local416 = new Class1_Sub14();
								local416.aClass71_8 = local9;
								local416.anObjectArray1 = local9.anObjectArray24;
								Static276.aClass61_16.method1839(local416);
							}
							if (Static63.anInt1344 > local9.anInt2729 && local9.anObjectArray12 != null) {
								local416 = new Class1_Sub14();
								local416.aClass71_8 = local9;
								local416.anObjectArray1 = local9.anObjectArray12;
								Static276.aClass61_16.method1839(local416);
							}
							local9.anInt2729 = Static23.anInt471;
							if (local9.anObjectArray18 != null) {
								for (local243 = 0; local243 < Static53.anInt5284; local243++) {
									@Pc(1461) Class1_Sub14 local1461 = new Class1_Sub14();
									local1461.aClass71_8 = local9;
									local1461.anInt1259 = Static216.anIntArray383[local243];
									local1461.anInt1258 = Static265.anIntArray460[local243];
									local1461.anObjectArray1 = local9.anObjectArray18;
									Static276.aClass61_16.method1839(local1461);
								}
							}
							if (Static154.aBoolean241 && local9.anObjectArray21 != null) {
								local416 = new Class1_Sub14();
								local416.aClass71_8 = local9;
								local416.anObjectArray1 = local9.anObjectArray21;
								Static276.aClass61_16.method1839(local416);
							}
						}
					}
					if (!local9.aBoolean196 && Static84.aClass71_11 == null && Static185.aClass71_16 == null && !Static14.aBoolean23) {
						if ((local9.anInt2693 >= 0 || local9.anInt2694 != 0) && Static224.anInt4445 >= local61 && Static8.anInt226 >= local63 && Static224.anInt4445 < local65 && Static8.anInt226 < local67) {
							if (local9.anInt2693 >= 0) {
								Static247.aClass71_21 = arg0[local9.anInt2693];
							} else {
								Static247.aClass71_21 = local9;
							}
						}
						if (local9.anInt2712 == 8 && Static224.anInt4445 >= local61 && Static8.anInt226 >= local63 && Static224.anInt4445 < local65 && Static8.anInt226 < local67) {
							Static48.aClass71_6 = local9;
						}
						if (local9.anInt2650 > local9.anInt2698) {
							Static163.method2820(local50 + local9.anInt2722, local9, local9.anInt2698, Static224.anInt4445, local55, Static8.anInt226, local9.anInt2650);
						}
					}
					if (local9.anInt2712 == 0) {
						method772(arg0, local9.anInt2655, local61, local63, local65, local67, local50 - local9.anInt2652, local55 - local9.anInt2646);
						if (local9.aClass71Array1 != null) {
							method772(local9.aClass71Array1, local9.anInt2655, local61, local63, local65, local67, local50 - local9.anInt2652, local55 - local9.anInt2646);
						}
						@Pc(1626) Class1_Sub17 local1626 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local9.anInt2655);
						if (local1626 != null) {
							Static123.method2169(local67, local63, local1626.anInt2431, local55, local61, local65, local50);
						}
					}
				}
			}
		}
	}
}
