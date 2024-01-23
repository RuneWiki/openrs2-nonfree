import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	public static int anInt771;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	public static int anInt772;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt777 = 0;

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method685() {
		Static110.aClass4_Sub10_Sub1_1.method4687(218);
		Static110.aClass4_Sub10_Sub1_1.method4619(0L);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wf;)Lclient!on;")
	public static Class4_Sub21 method687(@OriginalArg(0) Class189 arg0) {
		@Pc(13) Class4_Sub21 local13 = (Class4_Sub21) Static65.aClass85_5.method1845(((long) arg0.anInt5918 << 32) + (long) arg0.anInt5972);
		return local13 == null ? arg0.aClass4_Sub21_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!wf;)Lclient!wf;")
	public static Class189 method691(@OriginalArg(0) Class189 arg0) {
		@Pc(4) int local4 = method687(arg0).method3284();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static114.method1814(arg0.anInt5941);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!wf;)Z")
	public static boolean method692(@OriginalArg(0) Class189 arg0) {
		if (Static27.aBoolean26) {
			if (method687(arg0).anInt3947 != 0) {
				return false;
			}
			if (arg0.anInt5915 == 0) {
				return false;
			}
		}
		return arg0.aBoolean418;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!wf;IIIIIII)V")
	public static void method693(@OriginalArg(0) Class189[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class189 local9 = arg0[local1];
			if (local9 != null && local9.anInt5941 == arg1 && (!local9.aBoolean417 || local9.anInt5915 == 0 || local9.aBoolean404 || method687(local9).anInt3947 != 0 || local9 == Static38.aClass189_2 || local9.anInt5908 == 1338) && (!local9.aBoolean417 || !method692(local9))) {
				@Pc(50) int local50 = local9.anInt5964 + arg6;
				@Pc(55) int local55 = local9.anInt5892 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt5915 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt5897;
					@Pc(78) int local78 = local55 + local9.anInt5953;
					if (local9.anInt5915 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static35.aClass189_1) {
					Static238.aBoolean311 = true;
					Static161.anInt3183 = local50;
					Static9.anInt134 = local55;
				}
				if (!local9.aBoolean417 || local61 < local65 && local63 < local67) {
					if (local9.anInt5915 == 0) {
						if (!local9.aBoolean417 && method692(local9) && Static208.aClass189_11 != local9) {
							continue;
						}
						if (local9.aBoolean408 && Static286.anInt5358 >= local61 && Static312.anInt6042 >= local63 && Static286.anInt5358 < local65 && Static312.anInt6042 < local67) {
							for (@Pc(164) Class4_Sub13 local164 = (Class4_Sub13) Static135.aClass114_14.method2623(); local164 != null; local164 = (Class4_Sub13) Static135.aClass114_14.method2629()) {
								if (local164.aBoolean172) {
									local164.method4854();
									local164.aClass189_7.aBoolean415 = false;
								}
							}
							if (Static105.anInt2165 == 0) {
								Static35.aClass189_1 = null;
								Static38.aClass189_2 = null;
							}
							Static39.anInt640 = 0;
							Static123.aBoolean166 = false;
						}
					}
					if (local9.aBoolean417) {
						@Pc(209) boolean local209;
						if (Static286.anInt5358 >= local61 && Static312.anInt6042 >= local63 && Static286.anInt5358 < local65 && Static312.anInt6042 < local67) {
							local209 = true;
						} else {
							local209 = false;
						}
						@Pc(214) boolean local214 = false;
						if (Static86.anInt1991 == 1 && local209) {
							local214 = true;
						}
						@Pc(223) boolean local223 = false;
						if (Static252.anInt4803 == 1 && Static79.anInt1797 >= local61 && Static278.anInt5313 >= local63 && Static79.anInt1797 < local65 && Static278.anInt5313 < local67) {
							local223 = true;
						}
						@Pc(245) int local245;
						@Pc(341) int local341;
						if (local9.aByteArray74 != null) {
							for (local245 = 0; local245 < local9.aByteArray74.length; local245++) {
								if (Static54.aBooleanArray4[local9.aByteArray74[local245]]) {
									if (local9.anIntArray659 == null || Static50.anInt954 >= local9.anIntArray659[local245]) {
										@Pc(281) byte local281 = local9.aByteArray73[local245];
										if (local281 == 0 || ((local281 & 0x8) == 0 || !Static54.aBooleanArray4[86] && !Static54.aBooleanArray4[82] && !Static54.aBooleanArray4[81]) && ((local281 & 0x2) == 0 || Static54.aBooleanArray4[86]) && ((local281 & 0x1) == 0 || Static54.aBooleanArray4[82]) && ((local281 & 0x4) == 0 || Static54.aBooleanArray4[81])) {
											Static309.method4789(local9.anInt5918, -1, local245 + 1, "");
											local341 = local9.anIntArray662[local245];
											if (local9.anIntArray659 == null) {
												local9.anIntArray659 = new int[local9.aByteArray74.length];
											}
											if (local341 == 0) {
												local9.anIntArray659[local245] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray659[local245] = Static50.anInt954 + local341;
											}
										}
									}
								} else if (local9.anIntArray659 != null) {
									local9.anIntArray659[local245] = 0;
								}
							}
						}
						if (local223) {
							Static80.method1401(local9, Static79.anInt1797 - local50, Static278.anInt5313 - local55);
						}
						if (Static35.aClass189_1 != null && Static35.aClass189_1 != local9 && local209 && method687(local9).method3278()) {
							Static298.aClass189_16 = local9;
						}
						if (local9 == Static38.aClass189_2) {
							Static171.aBoolean232 = true;
							Static73.anInt1633 = local50;
							Static268.anInt5183 = local55;
						}
						if (local9.aBoolean404 || local9.anInt5908 != 0) {
							@Pc(418) Class4_Sub13 local418;
							if (local209 && Static103.anInt2885 != 0 && local9.anObjectArray20 != null) {
								local418 = new Class4_Sub13();
								local418.aBoolean172 = true;
								local418.aClass189_7 = local9;
								local418.anInt2492 = Static103.anInt2885;
								local418.anObjectArray2 = local9.anObjectArray20;
								Static135.aClass114_14.method2625(local418);
							}
							if (Static35.aClass189_1 != null || Static195.aClass189_10 != null || Static18.aBoolean17 || local9.anInt5908 != 1400 && Static39.anInt640 > 0) {
								local223 = false;
								local214 = false;
								local209 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt5908 != 0) {
								if (local9.anInt5908 == 1337) {
									Static115.aClass189_5 = local9;
									continue;
								}
								if (local9.anInt5908 == 1338) {
									if (local223) {
										Static83.anInt1941 = Static79.anInt1797 - local50;
										Static304.anInt5802 = Static278.anInt5313 - local55;
									}
									continue;
								}
								if (local9.anInt5908 == 1400) {
									Static224.aClass189_12 = local9;
									if (local209) {
										Static123.aBoolean166 = true;
									}
									if (local223) {
										local245 = (int) ((double) (Static79.anInt1797 - local50 - local9.anInt5897 / 2) * 2.0D / (double) Static121.aFloat68);
										local522 = (int) ((double) (Static278.anInt5313 - local55 - local9.anInt5953 / 2) * 2.0D / (double) Static121.aFloat68);
										local341 = Static22.anInt331 + local245;
										@Pc(530) int local530 = Static275.anInt5232 + local522;
										@Pc(534) int local534 = local341 + Static121.anInt2962;
										@Pc(542) int local542 = Static121.anInt2960 + Static121.anInt2961 - local530 - 1;
										@Pc(545) Class4_Sub3_Sub22 local545 = Static22.method305();
										if (local545 == null) {
											continue;
										}
										@Pc(550) int[] local550 = new int[3];
										local545.method4795(local534, local542, local550);
										if (local550 != null) {
											if (Static54.aBooleanArray4[82] && Static133.anInt2576 > 0) {
												Static167.method2958(local550[1], local550[2], local550[0]);
												Static138.method2064();
												continue;
											}
											Static110.aClass4_Sub10_Sub1_1.method4687(251);
											Static110.aClass4_Sub10_Sub1_1.method4628(local550[0] << 28 | local550[1] << 14 | local550[2]);
										}
										Static39.anInt640 = 1;
										Static46.aBoolean49 = false;
										Static194.anInt5205 = Static286.anInt5358;
										anInt777 = Static312.anInt6042;
										continue;
									}
									if (local214 && Static39.anInt640 > 0) {
										if (Static39.anInt640 == 1 && (Static194.anInt5205 != Static286.anInt5358 || anInt777 != Static312.anInt6042)) {
											Static16.anInt927 = Static22.anInt331;
											Static39.anInt647 = Static275.anInt5232;
											Static39.anInt640 = 2;
										}
										if (Static39.anInt640 == 2) {
											Static46.aBoolean49 = true;
											Static42.method694(Static16.anInt927 + (int) ((double) (Static194.anInt5205 - Static286.anInt5358) * 2.0D / (double) Static121.aFloat69));
											Static292.method4441(Static39.anInt647 + (int) ((double) (anInt777 - Static312.anInt6042) * 2.0D / (double) Static121.aFloat69));
										}
										continue;
									}
									if (Static39.anInt640 > 0 && !Static46.aBoolean49) {
										if ((Static107.anInt5401 == 1 || Static60.method1005(Static300.anInt5638 - 1)) && Static300.anInt5638 > 2) {
											Static244.method3820();
										} else if (Static300.anInt5638 > 0) {
											Static312.method4821();
										}
									}
									Static39.anInt640 = 0;
									continue;
								}
								if (local9.anInt5908 == 1401) {
									if (local214) {
										Static206.method3332(Static312.anInt6042 - local55, local9.anInt5897, local9.anInt5953, Static286.anInt5358 - local50);
									}
									continue;
								}
								if (local9.anInt5908 == 1402) {
									if (!Static94.aBoolean138) {
										Static205.method3283(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean409 && local223) {
								local9.aBoolean409 = true;
								if (local9.anObjectArray29 != null) {
									local418 = new Class4_Sub13();
									local418.aBoolean172 = true;
									local418.aClass189_7 = local9;
									local418.anInt2495 = Static79.anInt1797 - local50;
									local418.anInt2492 = Static278.anInt5313 - local55;
									local418.anObjectArray2 = local9.anObjectArray29;
									Static135.aClass114_14.method2625(local418);
								}
							}
							if (local9.aBoolean409 && local214 && local9.anObjectArray15 != null) {
								local418 = new Class4_Sub13();
								local418.aBoolean172 = true;
								local418.aClass189_7 = local9;
								local418.anInt2495 = Static286.anInt5358 - local50;
								local418.anInt2492 = Static312.anInt6042 - local55;
								local418.anObjectArray2 = local9.anObjectArray15;
								Static135.aClass114_14.method2625(local418);
							}
							if (local9.aBoolean409 && !local214) {
								local9.aBoolean409 = false;
								if (local9.anObjectArray30 != null) {
									local418 = new Class4_Sub13();
									local418.aBoolean172 = true;
									local418.aClass189_7 = local9;
									local418.anInt2495 = Static286.anInt5358 - local50;
									local418.anInt2492 = Static312.anInt6042 - local55;
									local418.anObjectArray2 = local9.anObjectArray30;
									Static83.aClass114_10.method2625(local418);
								}
							}
							if (local214 && local9.anObjectArray8 != null) {
								local418 = new Class4_Sub13();
								local418.aBoolean172 = true;
								local418.aClass189_7 = local9;
								local418.anInt2495 = Static286.anInt5358 - local50;
								local418.anInt2492 = Static312.anInt6042 - local55;
								local418.anObjectArray2 = local9.anObjectArray8;
								Static135.aClass114_14.method2625(local418);
							}
							if (!local9.aBoolean415 && local209) {
								local9.aBoolean415 = true;
								if (local9.anObjectArray26 != null) {
									local418 = new Class4_Sub13();
									local418.aBoolean172 = true;
									local418.aClass189_7 = local9;
									local418.anInt2495 = Static286.anInt5358 - local50;
									local418.anInt2492 = Static312.anInt6042 - local55;
									local418.anObjectArray2 = local9.anObjectArray26;
									Static135.aClass114_14.method2625(local418);
								}
							}
							if (local9.aBoolean415 && local209 && local9.anObjectArray9 != null) {
								local418 = new Class4_Sub13();
								local418.aBoolean172 = true;
								local418.aClass189_7 = local9;
								local418.anInt2495 = Static286.anInt5358 - local50;
								local418.anInt2492 = Static312.anInt6042 - local55;
								local418.anObjectArray2 = local9.anObjectArray9;
								Static135.aClass114_14.method2625(local418);
							}
							if (local9.aBoolean415 && !local209) {
								local9.aBoolean415 = false;
								if (local9.anObjectArray28 != null) {
									local418 = new Class4_Sub13();
									local418.aBoolean172 = true;
									local418.aClass189_7 = local9;
									local418.anInt2495 = Static286.anInt5358 - local50;
									local418.anInt2492 = Static312.anInt6042 - local55;
									local418.anObjectArray2 = local9.anObjectArray28;
									Static83.aClass114_10.method2625(local418);
								}
							}
							if (local9.anObjectArray16 != null) {
								local418 = new Class4_Sub13();
								local418.aClass189_7 = local9;
								local418.anObjectArray2 = local9.anObjectArray16;
								Static57.aClass114_6.method2625(local418);
							}
							@Pc(1062) Class4_Sub13 local1062;
							if (local9.anObjectArray27 != null && Static213.anInt4197 > local9.anInt5944) {
								if (local9.anIntArray673 == null || Static213.anInt4197 - local9.anInt5944 > 32) {
									local418 = new Class4_Sub13();
									local418.aClass189_7 = local9;
									local418.anObjectArray2 = local9.anObjectArray27;
									Static135.aClass114_14.method2625(local418);
								} else {
									label598: for (local245 = local9.anInt5944; local245 < Static213.anInt4197; local245++) {
										local522 = Static126.anIntArray218[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray673.length; local341++) {
											if (local9.anIntArray673[local341] == local522) {
												local1062 = new Class4_Sub13();
												local1062.aClass189_7 = local9;
												local1062.anObjectArray2 = local9.anObjectArray27;
												Static135.aClass114_14.method2625(local1062);
												break label598;
											}
										}
									}
								}
								local9.anInt5944 = Static213.anInt4197;
							}
							if (local9.anObjectArray21 != null && Static172.anInt3327 > local9.anInt5956) {
								if (local9.anIntArray665 == null || Static172.anInt3327 - local9.anInt5956 > 32) {
									local418 = new Class4_Sub13();
									local418.aClass189_7 = local9;
									local418.anObjectArray2 = local9.anObjectArray21;
									Static135.aClass114_14.method2625(local418);
								} else {
									label574: for (local245 = local9.anInt5956; local245 < Static172.anInt3327; local245++) {
										local522 = Static126.anIntArray219[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray665.length; local341++) {
											if (local9.anIntArray665[local341] == local522) {
												local1062 = new Class4_Sub13();
												local1062.aClass189_7 = local9;
												local1062.anObjectArray2 = local9.anObjectArray21;
												Static135.aClass114_14.method2625(local1062);
												break label574;
											}
										}
									}
								}
								local9.anInt5956 = Static172.anInt3327;
							}
							if (local9.anObjectArray24 != null && Static42.anInt788 > local9.anInt5940) {
								if (local9.anIntArray669 == null || Static42.anInt788 - local9.anInt5940 > 32) {
									local418 = new Class4_Sub13();
									local418.aClass189_7 = local9;
									local418.anObjectArray2 = local9.anObjectArray24;
									Static135.aClass114_14.method2625(local418);
								} else {
									label550: for (local245 = local9.anInt5940; local245 < Static42.anInt788; local245++) {
										local522 = Static135.anIntArray225[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray669.length; local341++) {
											if (local9.anIntArray669[local341] == local522) {
												local1062 = new Class4_Sub13();
												local1062.aClass189_7 = local9;
												local1062.anObjectArray2 = local9.anObjectArray24;
												Static135.aClass114_14.method2625(local1062);
												break label550;
											}
										}
									}
								}
								local9.anInt5940 = Static42.anInt788;
							}
							if (local9.anObjectArray3 != null && Static51.anInt959 > local9.anInt5945) {
								if (local9.anIntArray670 == null || Static51.anInt959 - local9.anInt5945 > 32) {
									local418 = new Class4_Sub13();
									local418.aClass189_7 = local9;
									local418.anObjectArray2 = local9.anObjectArray3;
									Static135.aClass114_14.method2625(local418);
								} else {
									label526: for (local245 = local9.anInt5945; local245 < Static51.anInt959; local245++) {
										local522 = Static306.anIntArray656[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray670.length; local341++) {
											if (local9.anIntArray670[local341] == local522) {
												local1062 = new Class4_Sub13();
												local1062.aClass189_7 = local9;
												local1062.anObjectArray2 = local9.anObjectArray3;
												Static135.aClass114_14.method2625(local1062);
												break label526;
											}
										}
									}
								}
								local9.anInt5945 = Static51.anInt959;
							}
							if (local9.anObjectArray25 != null && Static214.anInt4210 > local9.anInt5946) {
								if (local9.anIntArray667 == null || Static214.anInt4210 - local9.anInt5946 > 32) {
									local418 = new Class4_Sub13();
									local418.aClass189_7 = local9;
									local418.anObjectArray2 = local9.anObjectArray25;
									Static135.aClass114_14.method2625(local418);
								} else {
									label502: for (local245 = local9.anInt5946; local245 < Static214.anInt4210; local245++) {
										local522 = Static179.anIntArray336[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray667.length; local341++) {
											if (local9.anIntArray667[local341] == local522) {
												local1062 = new Class4_Sub13();
												local1062.aClass189_7 = local9;
												local1062.anObjectArray2 = local9.anObjectArray25;
												Static135.aClass114_14.method2625(local1062);
												break label502;
											}
										}
									}
								}
								local9.anInt5946 = Static214.anInt4210;
							}
							if (Static271.anInt5190 > local9.anInt5949 && local9.anObjectArray6 != null) {
								local418 = new Class4_Sub13();
								local418.aClass189_7 = local9;
								local418.anObjectArray2 = local9.anObjectArray6;
								Static135.aClass114_14.method2625(local418);
							}
							if (Static98.anInt2102 > local9.anInt5949 && local9.anObjectArray12 != null) {
								local418 = new Class4_Sub13();
								local418.aClass189_7 = local9;
								local418.anObjectArray2 = local9.anObjectArray12;
								Static135.aClass114_14.method2625(local418);
							}
							if (Static137.anInt2616 > local9.anInt5949 && local9.anObjectArray23 != null) {
								local418 = new Class4_Sub13();
								local418.aClass189_7 = local9;
								local418.anObjectArray2 = local9.anObjectArray23;
								Static135.aClass114_14.method2625(local418);
							}
							if (Static262.anInt4997 > local9.anInt5949 && local9.anObjectArray14 != null) {
								local418 = new Class4_Sub13();
								local418.aClass189_7 = local9;
								local418.anObjectArray2 = local9.anObjectArray14;
								Static135.aClass114_14.method2625(local418);
							}
							if (Static16.anInt925 > local9.anInt5949 && local9.anObjectArray31 != null) {
								local418 = new Class4_Sub13();
								local418.aClass189_7 = local9;
								local418.anObjectArray2 = local9.anObjectArray31;
								Static135.aClass114_14.method2625(local418);
							}
							local9.anInt5949 = Static261.anInt4980;
							if (local9.anObjectArray10 != null) {
								for (local245 = 0; local245 < Static265.anInt5089; local245++) {
									@Pc(1526) Class4_Sub13 local1526 = new Class4_Sub13();
									local1526.aClass189_7 = local9;
									local1526.anInt2488 = Static212.anIntArray441[local245];
									local1526.anInt2490 = Static203.anIntArray419[local245];
									local1526.anObjectArray2 = local9.anObjectArray10;
									Static135.aClass114_14.method2625(local1526);
								}
							}
							if (Static36.aBoolean35 && local9.anObjectArray5 != null) {
								local418 = new Class4_Sub13();
								local418.aClass189_7 = local9;
								local418.anObjectArray2 = local9.anObjectArray5;
								Static135.aClass114_14.method2625(local418);
							}
						}
					}
					if (!local9.aBoolean417 && Static35.aClass189_1 == null && Static195.aClass189_10 == null && !Static18.aBoolean17) {
						if ((local9.anInt5927 >= 0 || local9.anInt5970 != 0) && Static286.anInt5358 >= local61 && Static312.anInt6042 >= local63 && Static286.anInt5358 < local65 && Static312.anInt6042 < local67) {
							if (local9.anInt5927 >= 0) {
								Static208.aClass189_11 = arg0[local9.anInt5927];
							} else {
								Static208.aClass189_11 = local9;
							}
						}
						if (local9.anInt5915 == 8 && Static286.anInt5358 >= local61 && Static312.anInt6042 >= local63 && Static286.anInt5358 < local65 && Static312.anInt6042 < local67) {
							Static77.aClass189_4 = local9;
						}
						if (local9.anInt5891 > local9.anInt5953) {
							Static108.method1743(local9, Static312.anInt6042, local50 + local9.anInt5897, Static286.anInt5358, local9.anInt5891, local55, local9.anInt5953);
						}
					}
					if (local9.anInt5915 == 0) {
						method693(arg0, local9.anInt5918, local61, local63, local65, local67, local50 - local9.anInt5936, local55 - local9.anInt5935);
						if (local9.aClass189Array4 != null) {
							method693(local9.aClass189Array4, local9.anInt5918, local61, local63, local65, local67, local50 - local9.anInt5936, local55 - local9.anInt5935);
						}
						@Pc(1691) Class4_Sub27 local1691 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local9.anInt5918);
						if (local1691 != null) {
							Static66.method1060(local1691.anInt4621, local65, local50, local63, local55, local61, local67);
						}
					}
				}
			}
		}
	}
}
