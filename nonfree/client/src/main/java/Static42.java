import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
	public static int[] anIntArray63;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	public static int anInt957;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
	public static int[] anIntArray64 = new int[50];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	public static int anInt967 = 1;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	public static int anInt972 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!tk;)Z")
	public static boolean method663(@OriginalArg(0) Class159 arg0) {
		if (Static104.aBoolean169) {
			if (method668(arg0).anInt4411 != 0) {
				return false;
			}
			if (arg0.anInt5197 == 0) {
				return false;
			}
		}
		return arg0.aBoolean424;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!tk;)Lclient!tk;")
	public static Class159 method666(@OriginalArg(0) Class159 arg0) {
		@Pc(4) int local4 = method668(arg0).method3355();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static82.method1361(arg0.anInt5116);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!tk;IIIIIII)V")
	public static void method667(@OriginalArg(0) Class159[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class159 local9 = arg0[local1];
			if (local9 != null && local9.anInt5116 == arg1 && (!local9.aBoolean423 || local9.anInt5197 == 0 || local9.aBoolean419 || method668(local9).anInt4411 != 0 || local9 == Static153.aClass159_12 || local9.anInt5188 == 1338) && (!local9.aBoolean423 || !method663(local9))) {
				@Pc(50) int local50 = local9.anInt5208 + arg6;
				@Pc(55) int local55 = local9.anInt5198 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt5197 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt5123;
					@Pc(78) int local78 = local55 + local9.anInt5121;
					if (local9.anInt5197 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static201.aClass159_15) {
					Static15.aBoolean28 = true;
					Static282.anInt952 = local50;
					Static175.anInt3468 = local55;
				}
				if (!local9.aBoolean423 || local61 < local65 && local63 < local67) {
					if (local9.anInt5197 == 0) {
						if (!local9.aBoolean423 && method663(local9) && Static164.aClass159_13 != local9) {
							continue;
						}
						if (local9.aBoolean425 && Static182.anInt3572 >= local61 && Static106.anInt2198 >= local63 && Static182.anInt3572 < local65 && Static106.anInt2198 < local67) {
							for (@Pc(164) Class8_Sub14 local164 = (Class8_Sub14) Static180.aClass182_22.method4319(); local164 != null; local164 = (Class8_Sub14) Static180.aClass182_22.method4329()) {
								if (local164.aBoolean207) {
									local164.method4273();
									local164.aClass159_10.aBoolean418 = false;
								}
							}
							if (Static136.anInt2738 == 0) {
								Static201.aClass159_15 = null;
								Static153.aClass159_12 = null;
							}
							Static118.anInt2383 = 0;
						}
					}
					if (local9.aBoolean423) {
						@Pc(207) boolean local207;
						if (Static182.anInt3572 >= local61 && Static106.anInt2198 >= local63 && Static182.anInt3572 < local65 && Static106.anInt2198 < local67) {
							local207 = true;
						} else {
							local207 = false;
						}
						@Pc(212) boolean local212 = false;
						if (Static47.anInt1046 == 1 && local207) {
							local212 = true;
						}
						@Pc(221) boolean local221 = false;
						if (Static157.anInt5714 == 1 && Static59.anInt1292 >= local61 && Static89.anInt1907 >= local63 && Static59.anInt1292 < local65 && Static89.anInt1907 < local67) {
							local221 = true;
						}
						@Pc(243) int local243;
						@Pc(339) int local339;
						if (local9.aByteArray49 != null) {
							for (local243 = 0; local243 < local9.aByteArray49.length; local243++) {
								if (Static36.aBooleanArray2[local9.aByteArray49[local243]]) {
									if (local9.anIntArray408 == null || Static183.anInt3590 >= local9.anIntArray408[local243]) {
										@Pc(279) byte local279 = local9.aByteArray50[local243];
										if (local279 == 0 || ((local279 & 0x8) == 0 || !Static36.aBooleanArray2[86] && !Static36.aBooleanArray2[82] && !Static36.aBooleanArray2[81]) && ((local279 & 0x2) == 0 || Static36.aBooleanArray2[86]) && ((local279 & 0x1) == 0 || Static36.aBooleanArray2[82]) && ((local279 & 0x4) == 0 || Static36.aBooleanArray2[81])) {
											Static89.method1446(local243 + 1, "", -1, local9.anInt5199);
											local339 = local9.anIntArray402[local243];
											if (local9.anIntArray408 == null) {
												local9.anIntArray408 = new int[local9.aByteArray49.length];
											}
											if (local339 == 0) {
												local9.anIntArray408[local243] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray408[local243] = Static183.anInt3590 + local339;
											}
										}
									}
								} else if (local9.anIntArray408 != null) {
									local9.anIntArray408[local243] = 0;
								}
							}
						}
						if (local221) {
							Static269.method3755(Static59.anInt1292 - local50, local9, Static89.anInt1907 - local55);
						}
						if (Static201.aClass159_15 != null && Static201.aClass159_15 != local9 && local207 && method668(local9).method3361()) {
							Static68.aClass159_7 = local9;
						}
						if (local9 == Static153.aClass159_12) {
							Static20.aBoolean36 = true;
							Static199.anInt4028 = local50;
							Static13.anInt360 = local55;
						}
						if (local9.aBoolean419 || local9.anInt5188 != 0) {
							@Pc(416) Class8_Sub14 local416;
							if (local207 && Static183.anInt3587 != 0 && local9.anObjectArray31 != null) {
								local416 = new Class8_Sub14();
								local416.aBoolean207 = true;
								local416.aClass159_10 = local9;
								local416.anInt2439 = Static183.anInt3587;
								local416.anObjectArray1 = local9.anObjectArray31;
								Static180.aClass182_22.method4328(local416);
							}
							if (Static201.aClass159_15 != null || Static198.aClass159_14 != null || Static147.aBoolean246 || local9.anInt5188 != 1400 && Static118.anInt2383 > 0) {
								local221 = false;
								local212 = false;
								local207 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt5188 != 0) {
								if (local9.anInt5188 == 1337) {
									Static224.aClass159_16 = local9;
									continue;
								}
								if (local9.anInt5188 == 1338) {
									if (local221) {
										Static184.anInt3652 = Static59.anInt1292 - local50;
										Static147.anInt2994 = Static89.anInt1907 - local55;
									}
									continue;
								}
								if (local9.anInt5188 == 1400) {
									Static130.aClass159_11 = local9;
									if (local221) {
										if (Static36.aBooleanArray2[82] && Static94.anInt1962 > 0) {
											local243 = (int) ((double) (Static59.anInt1292 - local50 - local9.anInt5123 / 2) * 2.0D / (double) Static224.aFloat47);
											local522 = (int) ((double) (Static89.anInt1907 - local55 - local9.anInt5121 / 2) * 2.0D / (double) Static224.aFloat47);
											local339 = Static52.anInt1147 + local243;
											@Pc(530) int local530 = Static218.anInt4483 + local522;
											@Pc(534) int local534 = local339 + Static220.anInt4522;
											@Pc(542) int local542 = Static221.anInt4539 + Static140.anInt2782 - local530 - 1;
											@Pc(545) Class8_Sub1_Sub2 local545 = Static114.method1846();
											@Pc(551) int[] local551 = local545.method422(local542, local534);
											if (local551 != null) {
												Static105.method1701(local551[1], local551[0], local551[2]);
												Static201.method3118();
											}
											continue;
										}
										Static118.anInt2383 = 1;
										Static16.anInt3521 = Static182.anInt3572;
										Static204.anInt4224 = Static106.anInt2198;
										continue;
									}
									if (local212 && Static118.anInt2383 > 0) {
										if (Static118.anInt2383 == 1 && (Static16.anInt3521 != Static182.anInt3572 || Static204.anInt4224 != Static106.anInt2198)) {
											Static293.anInt5677 = Static52.anInt1147;
											Static191.anInt3849 = Static218.anInt4483;
											Static118.anInt2383 = 2;
										}
										if (Static118.anInt2383 == 2) {
											Static220.method3437(Static293.anInt5677 + (int) ((double) (Static16.anInt3521 - Static182.anInt3572) * 2.0D / (double) Static138.aFloat29));
											Static66.method3397(Static191.anInt3849 + (int) ((double) (Static204.anInt4224 - Static106.anInt2198) * 2.0D / (double) Static138.aFloat29));
										}
										continue;
									}
									Static118.anInt2383 = 0;
									continue;
								}
								if (local9.anInt5188 == 1401) {
									if (local212) {
										Static257.method3871(Static182.anInt3572 - local50, local9.anInt5121, local9.anInt5123, Static106.anInt2198 - local55);
									}
									continue;
								}
								if (local9.anInt5188 == 1402) {
									if (!Static116.aBoolean188) {
										Static128.method2075(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean426 && local221) {
								local9.aBoolean426 = true;
								if (local9.anObjectArray29 != null) {
									local416 = new Class8_Sub14();
									local416.aBoolean207 = true;
									local416.aClass159_10 = local9;
									local416.anInt2432 = Static59.anInt1292 - local50;
									local416.anInt2439 = Static89.anInt1907 - local55;
									local416.anObjectArray1 = local9.anObjectArray29;
									Static180.aClass182_22.method4328(local416);
								}
							}
							if (local9.aBoolean426 && local212 && local9.anObjectArray32 != null) {
								local416 = new Class8_Sub14();
								local416.aBoolean207 = true;
								local416.aClass159_10 = local9;
								local416.anInt2432 = Static182.anInt3572 - local50;
								local416.anInt2439 = Static106.anInt2198 - local55;
								local416.anObjectArray1 = local9.anObjectArray32;
								Static180.aClass182_22.method4328(local416);
							}
							if (local9.aBoolean426 && !local212) {
								local9.aBoolean426 = false;
								if (local9.anObjectArray25 != null) {
									local416 = new Class8_Sub14();
									local416.aBoolean207 = true;
									local416.aClass159_10 = local9;
									local416.anInt2432 = Static182.anInt3572 - local50;
									local416.anInt2439 = Static106.anInt2198 - local55;
									local416.anObjectArray1 = local9.anObjectArray25;
									Static190.aClass182_23.method4328(local416);
								}
							}
							if (local212 && local9.anObjectArray7 != null) {
								local416 = new Class8_Sub14();
								local416.aBoolean207 = true;
								local416.aClass159_10 = local9;
								local416.anInt2432 = Static182.anInt3572 - local50;
								local416.anInt2439 = Static106.anInt2198 - local55;
								local416.anObjectArray1 = local9.anObjectArray7;
								Static180.aClass182_22.method4328(local416);
							}
							if (!local9.aBoolean418 && local207) {
								local9.aBoolean418 = true;
								if (local9.anObjectArray14 != null) {
									local416 = new Class8_Sub14();
									local416.aBoolean207 = true;
									local416.aClass159_10 = local9;
									local416.anInt2432 = Static182.anInt3572 - local50;
									local416.anInt2439 = Static106.anInt2198 - local55;
									local416.anObjectArray1 = local9.anObjectArray14;
									Static180.aClass182_22.method4328(local416);
								}
							}
							if (local9.aBoolean418 && local207 && local9.anObjectArray18 != null) {
								local416 = new Class8_Sub14();
								local416.aBoolean207 = true;
								local416.aClass159_10 = local9;
								local416.anInt2432 = Static182.anInt3572 - local50;
								local416.anInt2439 = Static106.anInt2198 - local55;
								local416.anObjectArray1 = local9.anObjectArray18;
								Static180.aClass182_22.method4328(local416);
							}
							if (local9.aBoolean418 && !local207) {
								local9.aBoolean418 = false;
								if (local9.anObjectArray5 != null) {
									local416 = new Class8_Sub14();
									local416.aBoolean207 = true;
									local416.aClass159_10 = local9;
									local416.anInt2432 = Static182.anInt3572 - local50;
									local416.anInt2439 = Static106.anInt2198 - local55;
									local416.anObjectArray1 = local9.anObjectArray5;
									Static190.aClass182_23.method4328(local416);
								}
							}
							if (local9.anObjectArray6 != null) {
								local416 = new Class8_Sub14();
								local416.aClass159_10 = local9;
								local416.anObjectArray1 = local9.anObjectArray6;
								Static167.aClass182_20.method4328(local416);
							}
							@Pc(997) Class8_Sub14 local997;
							if (local9.anObjectArray30 != null && Static150.anInt4580 > local9.anInt5139) {
								if (local9.anIntArray397 == null || Static150.anInt4580 - local9.anInt5139 > 32) {
									local416 = new Class8_Sub14();
									local416.aClass159_10 = local9;
									local416.anObjectArray1 = local9.anObjectArray30;
									Static180.aClass182_22.method4328(local416);
								} else {
									label570: for (local243 = local9.anInt5139; local243 < Static150.anInt4580; local243++) {
										local522 = Static34.anIntArray54[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray397.length; local339++) {
											if (local9.anIntArray397[local339] == local522) {
												local997 = new Class8_Sub14();
												local997.aClass159_10 = local9;
												local997.anObjectArray1 = local9.anObjectArray30;
												Static180.aClass182_22.method4328(local997);
												break label570;
											}
										}
									}
								}
								local9.anInt5139 = Static150.anInt4580;
							}
							if (local9.anObjectArray8 != null && Static151.anInt4147 > local9.anInt5140) {
								if (local9.anIntArray403 == null || Static151.anInt4147 - local9.anInt5140 > 32) {
									local416 = new Class8_Sub14();
									local416.aClass159_10 = local9;
									local416.anObjectArray1 = local9.anObjectArray8;
									Static180.aClass182_22.method4328(local416);
								} else {
									label546: for (local243 = local9.anInt5140; local243 < Static151.anInt4147; local243++) {
										local522 = Static234.anIntArray354[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray403.length; local339++) {
											if (local9.anIntArray403[local339] == local522) {
												local997 = new Class8_Sub14();
												local997.aClass159_10 = local9;
												local997.anObjectArray1 = local9.anObjectArray8;
												Static180.aClass182_22.method4328(local997);
												break label546;
											}
										}
									}
								}
								local9.anInt5140 = Static151.anInt4147;
							}
							if (local9.anObjectArray3 != null && Static261.anInt5241 > local9.anInt5136) {
								if (local9.anIntArray407 == null || Static261.anInt5241 - local9.anInt5136 > 32) {
									local416 = new Class8_Sub14();
									local416.aClass159_10 = local9;
									local416.anObjectArray1 = local9.anObjectArray3;
									Static180.aClass182_22.method4328(local416);
								} else {
									label522: for (local243 = local9.anInt5136; local243 < Static261.anInt5241; local243++) {
										local522 = Static49.anIntArray76[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray407.length; local339++) {
											if (local9.anIntArray407[local339] == local522) {
												local997 = new Class8_Sub14();
												local997.aClass159_10 = local9;
												local997.anObjectArray1 = local9.anObjectArray3;
												Static180.aClass182_22.method4328(local997);
												break label522;
											}
										}
									}
								}
								local9.anInt5136 = Static261.anInt5241;
							}
							if (local9.anObjectArray15 != null && Static192.anInt3874 > local9.anInt5192) {
								if (local9.anIntArray405 == null || Static192.anInt3874 - local9.anInt5192 > 32) {
									local416 = new Class8_Sub14();
									local416.aClass159_10 = local9;
									local416.anObjectArray1 = local9.anObjectArray15;
									Static180.aClass182_22.method4328(local416);
								} else {
									label498: for (local243 = local9.anInt5192; local243 < Static192.anInt3874; local243++) {
										local522 = Static73.anIntArray110[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray405.length; local339++) {
											if (local9.anIntArray405[local339] == local522) {
												local997 = new Class8_Sub14();
												local997.aClass159_10 = local9;
												local997.anObjectArray1 = local9.anObjectArray15;
												Static180.aClass182_22.method4328(local997);
												break label498;
											}
										}
									}
								}
								local9.anInt5192 = Static192.anInt3874;
							}
							if (local9.anObjectArray12 != null && Static133.anInt2697 > local9.anInt5177) {
								if (local9.anIntArray401 == null || Static133.anInt2697 - local9.anInt5177 > 32) {
									local416 = new Class8_Sub14();
									local416.aClass159_10 = local9;
									local416.anObjectArray1 = local9.anObjectArray12;
									Static180.aClass182_22.method4328(local416);
								} else {
									label474: for (local243 = local9.anInt5177; local243 < Static133.anInt2697; local243++) {
										local522 = Static33.anIntArray53[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray401.length; local339++) {
											if (local9.anIntArray401[local339] == local522) {
												local997 = new Class8_Sub14();
												local997.aClass159_10 = local9;
												local997.anObjectArray1 = local9.anObjectArray12;
												Static180.aClass182_22.method4328(local997);
												break label474;
											}
										}
									}
								}
								local9.anInt5177 = Static133.anInt2697;
							}
							if (Static202.anInt4175 > local9.anInt5115 && local9.anObjectArray27 != null) {
								local416 = new Class8_Sub14();
								local416.aClass159_10 = local9;
								local416.anObjectArray1 = local9.anObjectArray27;
								Static180.aClass182_22.method4328(local416);
							}
							if (Static295.anInt3737 > local9.anInt5115 && local9.anObjectArray22 != null) {
								local416 = new Class8_Sub14();
								local416.aClass159_10 = local9;
								local416.anObjectArray1 = local9.anObjectArray22;
								Static180.aClass182_22.method4328(local416);
							}
							if (Static242.anInt4844 > local9.anInt5115 && local9.anObjectArray11 != null) {
								local416 = new Class8_Sub14();
								local416.aClass159_10 = local9;
								local416.anObjectArray1 = local9.anObjectArray11;
								Static180.aClass182_22.method4328(local416);
							}
							if (Static279.anInt5450 > local9.anInt5115 && local9.anObjectArray24 != null) {
								local416 = new Class8_Sub14();
								local416.aClass159_10 = local9;
								local416.anObjectArray1 = local9.anObjectArray24;
								Static180.aClass182_22.method4328(local416);
							}
							if (Static41.anInt879 > local9.anInt5115 && local9.anObjectArray13 != null) {
								local416 = new Class8_Sub14();
								local416.aClass159_10 = local9;
								local416.anObjectArray1 = local9.anObjectArray13;
								Static180.aClass182_22.method4328(local416);
							}
							local9.anInt5115 = Static157.anInt5706;
							if (local9.anObjectArray16 != null) {
								for (local243 = 0; local243 < Static97.anInt2003; local243++) {
									@Pc(1461) Class8_Sub14 local1461 = new Class8_Sub14();
									local1461.aClass159_10 = local9;
									local1461.anInt2428 = Static156.anIntArray251[local243];
									local1461.anInt2438 = Static13.anIntArray14[local243];
									local1461.anObjectArray1 = local9.anObjectArray16;
									Static180.aClass182_22.method4328(local1461);
								}
							}
							if (Static257.aBoolean412 && local9.anObjectArray10 != null) {
								local416 = new Class8_Sub14();
								local416.aClass159_10 = local9;
								local416.anObjectArray1 = local9.anObjectArray10;
								Static180.aClass182_22.method4328(local416);
							}
						}
					}
					if (!local9.aBoolean423 && Static201.aClass159_15 == null && Static198.aClass159_14 == null && !Static147.aBoolean246) {
						if ((local9.anInt5171 >= 0 || local9.anInt5111 != 0) && Static182.anInt3572 >= local61 && Static106.anInt2198 >= local63 && Static182.anInt3572 < local65 && Static106.anInt2198 < local67) {
							if (local9.anInt5171 >= 0) {
								Static164.aClass159_13 = arg0[local9.anInt5171];
							} else {
								Static164.aClass159_13 = local9;
							}
						}
						if (local9.anInt5197 == 8 && Static182.anInt3572 >= local61 && Static106.anInt2198 >= local63 && Static182.anInt3572 < local65 && Static106.anInt2198 < local67) {
							Static30.aClass159_2 = local9;
						}
						if (local9.anInt5207 > local9.anInt5121) {
							Static27.method463(local9, local9.anInt5207, Static106.anInt2198, local50 + local9.anInt5123, local55, local9.anInt5121, Static182.anInt3572);
						}
					}
					if (local9.anInt5197 == 0) {
						method667(arg0, local9.anInt5199, local61, local63, local65, local67, local50 - local9.anInt5128, local55 - local9.anInt5176);
						if (local9.aClass159Array1 != null) {
							method667(local9.aClass159Array1, local9.anInt5199, local61, local63, local65, local67, local50 - local9.anInt5128, local55 - local9.anInt5176);
						}
						@Pc(1626) Class8_Sub32 local1626 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local9.anInt5199);
						if (local1626 != null) {
							Static189.method2949(local65, local1626.anInt5295, local61, local50, local63, local55, local67);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!tk;)Lclient!qg;")
	public static Class8_Sub24 method668(@OriginalArg(0) Class159 arg0) {
		@Pc(13) Class8_Sub24 local13 = (Class8_Sub24) Static94.aClass129_8.method3043(((long) arg0.anInt5199 << 32) + (long) arg0.anInt5133);
		return local13 == null ? arg0.aClass8_Sub24_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[[FBIII[[F[[IIBIIIBLclient!td;[[F)V")
	public static void method669(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte arg12, @OriginalArg(14) Class8_Sub29 arg13, @OriginalArg(15) float[][] arg14) {
		@Pc(11) int local11 = (arg5 << 8) + 255;
		@Pc(17) int local17 = (arg10 << 8) + 255;
		@Pc(23) int local23 = (arg3 << 8) + 255;
		@Pc(29) int local29 = (arg4 << 8) + 255;
		@Pc(33) int[] local33 = Static136.anIntArrayArray13[arg2];
		@Pc(35) int[] local35 = null;
		@Pc(47) int[] local47 = new int[local33.length >> 1];
		@Pc(49) int local49;
		for (local49 = 0; local49 < local47.length; local49++) {
			local47[local49] = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, local33[local49 + local49 + 1], local33[local49 + local49], null, arg7, arg12, false, arg8, arg1, arg6, local23);
		}
		if (arg0) {
			@Pc(196) int local196;
			if (arg2 == 1) {
				local35 = new int[6];
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 128, 64, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local196 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 64, 128, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35[2] = local47[2];
				local35[5] = local47[2];
				local35[1] = local49;
				local35[3] = local49;
				local35[0] = local196;
				local35[4] = local47[0];
			} else if (arg2 == 2) {
				local35 = new int[6];
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 128, 128, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local196 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 0, 64, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35[1] = local196;
				local35[3] = local49;
				local35[2] = local49;
				local35[0] = local47[0];
				local35[5] = local47[0];
				local35[4] = local47[1];
			} else if (arg2 == 3) {
				local35 = new int[6];
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 128, 0, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local196 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 0, 64, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35[1] = local47[1];
				local35[3] = local49;
				local35[0] = local47[2];
				local35[4] = local196;
				local35[2] = local49;
				local35[5] = local47[2];
			} else if (arg2 == 4) {
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 128, 0, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35 = new int[] { local47[3], local49, local47[0] };
			} else if (arg2 == 5) {
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 128, 128, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35 = new int[] { local47[2], local49, local47[3] };
			} else if (arg2 == 6) {
				local35 = new int[6];
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 0, 128, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local196 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 128, 128, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35[1] = local49;
				local35[0] = local47[3];
				local35[4] = local47[0];
				local35[2] = local196;
				local35[3] = local196;
				local35[5] = local47[3];
			} else if (arg2 == 7) {
				local35 = new int[6];
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 128, 0, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local196 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 0, 128, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35[3] = local49;
				local35[2] = local49;
				local35[4] = local47[2];
				local35[0] = local47[1];
				local35[1] = local196;
				local35[5] = local47[1];
			} else if (arg2 == 8) {
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 0, 0, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35 = new int[] { local47[3], local49, local47[4] };
			} else if (arg2 == 9) {
				local35 = new int[15];
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 64, 128, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local196 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 32, 96, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				@Pc(720) int local720 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 0, 64, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35[1] = local49;
				local35[6] = local196;
				local35[13] = local47[1];
				local35[14] = local720;
				local35[0] = local196;
				local35[11] = local47[1];
				local35[2] = local47[4];
				local35[4] = local47[4];
				local35[12] = local196;
				local35[8] = local47[2];
				local35[3] = local196;
				local35[9] = local196;
				local35[5] = local47[3];
				local35[7] = local47[3];
				local35[10] = local47[2];
			} else if (arg2 == 10) {
				local35 = new int[9];
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 128, 0, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35[1] = local49;
				local35[4] = local49;
				local35[0] = local47[2];
				local35[7] = local49;
				local35[6] = local47[4];
				local35[8] = local47[0];
				local35[2] = local47[3];
				local35[3] = local47[3];
				local35[5] = local47[4];
			} else if (arg2 == 11) {
				local35 = new int[12];
				local49 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 64, 0, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local196 = Static22.method400(local17, local29, 0.0F, arg14, arg13, arg9, local11, 64, 128, null, arg7, arg12, true, arg8, arg1, arg6, local23);
				local35[7] = local196;
				local35[5] = local49;
				local35[0] = local47[3];
				local35[2] = local47[0];
				local35[1] = local49;
				local35[4] = local47[2];
				local35[10] = local47[1];
				local35[11] = local196;
				local35[8] = local49;
				local35[6] = local47[2];
				local35[3] = local47[3];
				local35[9] = local47[2];
			}
		}
		arg13.method3784(arg11, arg8, arg9, local47, local35, false);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	public static void method671(@OriginalArg(1) long arg0) {
		if (!Static109.aBoolean177) {
			Static201.aFloat36 += (float) arg0 * Static228.aFloat48 / 40.0F;
			Static82.aFloat20 += Static60.aFloat13 * (float) arg0 / 40.0F;
		}
		@Pc(35) int local35 = Static151.anInt4138 + Static21.aClass36_Sub3_Sub1_1.anInt4117;
		@Pc(44) int local44 = Static279.anInt5452 + Static21.aClass36_Sub3_Sub1_1.anInt4118;
		if (Static163.anInt4477 - local35 < -500 || Static163.anInt4477 - local35 > 500 || Static194.anInt3891 - local44 < -500 || Static194.anInt3891 - local44 > 500) {
			Static194.anInt3891 = local44;
			Static163.anInt4477 = local35;
		}
		@Pc(85) int local85;
		@Pc(93) int local93;
		if (local35 != Static163.anInt4477) {
			local85 = local35 - Static163.anInt4477;
			local93 = (int) ((long) local85 * arg0 / 320L);
			if (local85 > 0) {
				if (local93 == 0) {
					local93 = 1;
				} else if (local85 < local93) {
					local93 = local85;
				}
			} else if (local93 == 0) {
				local93 = -1;
			} else if (local93 < local85) {
				local93 = local85;
			}
			Static163.anInt4477 += local93;
		}
		if (Static194.anInt3891 != local44) {
			local85 = local44 - Static194.anInt3891;
			local93 = (int) (arg0 * (long) local85 / 320L);
			if (local85 <= 0) {
				if (local93 == 0) {
					local93 = -1;
				} else if (local93 < local85) {
					local93 = local85;
				}
			} else if (local93 == 0) {
				local93 = 1;
			} else if (local85 < local93) {
				local93 = local85;
			}
			Static194.anInt3891 += local93;
		}
		Static75.method1184();
	}
}
