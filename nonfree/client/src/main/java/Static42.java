import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString45 = "scroll:";

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	public static int[] anIntArray92 = new int[14];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	public static int anInt1107 = 0;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Ljava/lang/String;")
	public static String aString46 = "Loading title screen - ";

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static int anInt1111 = -2;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method799() {
		for (@Pc(1) int local1 = -1; local1 < Static191.anInt4008 + Static57.anInt1448; local1++) {
			@Pc(10) Class15_Sub2 local10;
			@Pc(12) long local12;
			@Pc(20) int local20;
			if (local1 < 0) {
				local10 = Static22.aClass15_Sub2_Sub2_1;
				local12 = 8791798054912L;
			} else if (local1 < Static191.anInt4008) {
				local20 = Static246.anIntArray479[local1];
				local10 = Static188.aClass15_Sub2_Sub2Array41[local20];
				local12 = (long) local20 << 32;
			} else {
				local20 = Static89.anIntArray194[local1 - Static191.anInt4008];
				@Pc(40) Class15_Sub2_Sub1 local40 = Static35.aClass15_Sub2_Sub1Array2[local20];
				local10 = local40;
				local12 = (long) local20 << 32 | 0x20000000L;
				if (!local40.aClass188_1.aBoolean392) {
					local12 |= Long.MIN_VALUE;
				}
			}
			if (local10.anInt5297 < 0) {
				local10.aBoolean357 = false;
			} else {
				local10.anInt5379 = -1;
				local20 = local10.method4286();
				if ((local20 & 0x1) == 0) {
					if ((local10.anInt5358 & 0x7F) != 0 || (local10.anInt5371 & 0x7F) != 0) {
						local10.aBoolean357 = false;
						continue;
					}
				} else if ((local10.anInt5358 & 0x7F) != 64 || (local10.anInt5371 & 0x7F) != 64) {
					local10.aBoolean357 = false;
					continue;
				}
				@Pc(157) int local157;
				@Pc(118) int local118;
				@Pc(113) int local113;
				if (local20 == 1) {
					local113 = local10.anInt5358 >> 7;
					local118 = local10.anInt5371 >> 7;
					if (local113 < 0 || local113 >= 104 || local118 < 0 || local118 >= 104) {
						local10.aBoolean357 = true;
						continue;
					}
					if (local10.anInt5297 != Static130.anIntArrayArray16[local113][local118]) {
						local10.aBoolean357 = true;
						continue;
					}
					if (Static182.anIntArrayArray46[local113][local118] > 1) {
						local157 = Static182.anIntArrayArray46[local113][local118]--;
						local10.aBoolean357 = true;
						continue;
					}
				} else {
					local113 = local10.anInt5358 - local20 * 64 >> 7;
					local118 = local10.anInt5371 - local20 * 64 >> 7;
					@Pc(187) int local187 = local113 + local20;
					@Pc(191) int local191 = local118 + local20;
					if (local113 < 0) {
						local113 = 0;
					}
					if (local187 > 104) {
						local187 = 104;
					}
					if (local118 < 0) {
						local118 = 0;
					}
					if (local191 > 104) {
						local191 = 104;
					}
					if (!Static9.method2431(local187, local191, local113, local118, local10.anInt5297)) {
						for (@Pc(220) int local220 = local113; local220 < local187; local220++) {
							for (@Pc(225) int local225 = local118; local225 < local191; local225++) {
								if (local10.anInt5297 == Static130.anIntArrayArray16[local220][local225]) {
									local157 = Static182.anIntArrayArray46[local220][local225]--;
								}
							}
						}
						local10.aBoolean357 = true;
						continue;
					}
				}
				if (local10 instanceof Class15_Sub2_Sub2 && local10.anObject7 != null && Static268.anInt5236 >= local10.anInt5312 && Static268.anInt5236 < local10.anInt5359) {
					((Class15_Sub2_Sub2) local10).aBoolean359 = false;
					local10.aBoolean357 = false;
					local10.anInt5308 = Static234.method3798(local10.anInt5371, local10.anInt5358, Static32.anInt876);
					Static131.method2427(Static32.anInt876, local10.anInt5358, local10.anInt5371, local10.anInt5308, local10, local10.anInt5373, local12, local10.anInt5302, local10.anInt5292, local10.anInt5380, local10.anInt5339);
				} else {
					local10.aBoolean357 = false;
					local10.anInt5308 = Static234.method3798(local10.anInt5371, local10.anInt5358, Static32.anInt876);
					Static152.method2794(Static32.anInt876, local10.anInt5358, local10.anInt5371, local10.anInt5308, (local20 - 1) * 64 + 60, local10, local10.anInt5373, local12, local10.aBoolean356);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!g;)Z")
	public static boolean method801(@OriginalArg(0) Class56 arg0) {
		if (Static199.aBoolean295) {
			if (method804(arg0).anInt419 != 0) {
				return false;
			}
			if (arg0.anInt2092 == 0) {
				return false;
			}
		}
		return arg0.aBoolean139;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method802() {
		for (@Pc(1) int local1 = 0; local1 < 104; local1++) {
			@Pc(8) int[] local8 = Static130.anIntArrayArray16[local1];
			for (@Pc(10) int local10 = 0; local10 < 104; local10++) {
				local8[local10] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method803() {
		@Pc(11) boolean local11 = Static226.aBoolean403 && Static191.anInt4008 > 200 || Static191.anInt4008 > 50;
		@Pc(13) int local13;
		@Pc(47) int local47;
		for (local13 = 0; local13 < Static191.anInt4008; local13++) {
			@Pc(22) Class15_Sub2_Sub2 local22 = Static188.aClass15_Sub2_Sub2Array41[Static246.anIntArray479[local13]];
			local22.aBoolean354 = false;
			if (local22.method4282()) {
				local22.aBoolean359 = local22.anInt5365 == local22.method4297().anInt4136 ? local11 : false;
				local47 = 0;
				if (!local22.aBoolean357) {
					local47++;
				}
				if (local22.anInt5309 > Static268.anInt5236) {
					local47 += 2;
				}
				local47 += 5 - local22.method4286() << 2;
				if (Static211.anInt4324 == 0) {
					local47 += 32;
				} else {
					local47 += 128;
				}
				local47 += 256;
				local22.anInt5297 = local47 + 1;
			} else {
				local22.anInt5297 = -1;
			}
		}
		for (local13 = 0; local13 < Static57.anInt1448; local13++) {
			@Pc(90) Class15_Sub2_Sub1 local90 = Static35.aClass15_Sub2_Sub1Array2[Static89.anIntArray194[local13]];
			local90.aBoolean354 = false;
			if (local90.method4282() && local90.aClass188_1.method4615()) {
				local47 = 0;
				if (!local90.aBoolean357) {
					local47++;
				}
				if (local90.anInt5309 > Static268.anInt5236) {
					local47 += 2;
				}
				local47 += 5 - local90.method4286() << 2;
				if (Static211.anInt4324 == 0) {
					if (local90.aClass188_1.aBoolean391) {
						local47 += 64;
					} else {
						local47 += 128;
					}
				} else if (Static211.anInt4324 == 1) {
					if (local90.aClass188_1.aBoolean391) {
						local47 += 32;
					} else {
						local47 += 64;
					}
				}
				if (local90.aClass188_1.aBoolean388) {
					local47 += 512;
				} else if (!local90.aClass188_1.aBoolean387) {
					local47 += 256;
				}
				local90.anInt5297 = local47 + 1;
			} else {
				local90.anInt5297 = -1;
			}
		}
		for (local13 = 0; local13 < Static308.aClass47Array1.length; local13++) {
			@Pc(175) Class47 local175 = Static308.aClass47Array1[local13];
			if (local175 != null) {
				if (local175.anInt1830 == 1) {
					@Pc(187) Class15_Sub2_Sub1 local187 = Static35.aClass15_Sub2_Sub1Array2[local175.anInt1838];
					if (local187 != null && local187.anInt5297 != -1) {
						local187.anInt5297 += 1024;
					}
				} else if (local175.anInt1830 == 10) {
					@Pc(209) Class15_Sub2_Sub2 local209 = Static188.aClass15_Sub2_Sub2Array41[local175.anInt1838];
					if (local209 != null && local209.anInt5297 != -1) {
						local209.anInt5297 += 1024;
					}
				}
			}
		}
		Static22.aClass15_Sub2_Sub2_1.anInt5297 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!g;)Lclient!bd;")
	public static Class2_Sub7 method804(@OriginalArg(0) Class56 arg0) {
		@Pc(13) Class2_Sub7 local13 = (Class2_Sub7) Static80.aClass101_4.method2867(((long) arg0.anInt2096 << 32) + (long) arg0.anInt2056);
		return local13 == null ? arg0.aClass2_Sub7_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!g;IIIIIII)V")
	public static void method805(@OriginalArg(0) Class56[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class56 local9 = arg0[local1];
			if (local9 != null && local9.anInt2030 == arg1 && (!local9.aBoolean132 || local9.anInt2092 == 0 || local9.aBoolean134 || method804(local9).anInt419 != 0 || local9 == Static192.aClass56_18 || local9.anInt2074 == 1338) && (!local9.aBoolean132 || !method801(local9))) {
				@Pc(50) int local50 = local9.anInt2105 + arg6;
				@Pc(55) int local55 = local9.anInt2048 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt2092 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt2057;
					@Pc(78) int local78 = local55 + local9.anInt2031;
					if (local9.anInt2092 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static199.aClass56_19) {
					Static71.aBoolean115 = true;
					Static13.anInt259 = local50;
					Static185.anInt5545 = local55;
				}
				if (!local9.aBoolean132 || local61 < local65 && local63 < local67) {
					if (local9.anInt2092 == 0) {
						if (!local9.aBoolean132 && method801(local9) && Static141.aClass56_14 != local9) {
							continue;
						}
						if (local9.aBoolean125 && Static131.anInt3016 >= local61 && Static281.anInt5551 >= local63 && Static131.anInt3016 < local65 && Static281.anInt5551 < local67) {
							for (@Pc(164) Class2_Sub12 local164 = (Class2_Sub12) Static145.aClass44_18.method1352(); local164 != null; local164 = (Class2_Sub12) Static145.aClass44_18.method1360()) {
								if (local164.aBoolean99) {
									local164.method4743();
									local164.aClass56_6.aBoolean128 = false;
								}
							}
							if (Static44.anInt1146 == 0) {
								Static199.aClass56_19 = null;
								Static192.aClass56_18 = null;
							}
							Static28.anInt626 = 0;
							Static113.aBoolean168 = false;
						}
					}
					if (local9.aBoolean132) {
						@Pc(209) boolean local209;
						if (Static131.anInt3016 >= local61 && Static281.anInt5551 >= local63 && Static131.anInt3016 < local65 && Static281.anInt5551 < local67) {
							local209 = true;
						} else {
							local209 = false;
						}
						@Pc(214) boolean local214 = false;
						if (Static307.anInt5933 == 1 && local209) {
							local214 = true;
						}
						@Pc(223) boolean local223 = false;
						if (Static98.anInt2337 == 1 && Static86.anInt2010 >= local61 && Static252.anInt4933 >= local63 && Static86.anInt2010 < local65 && Static252.anInt4933 < local67) {
							local223 = true;
						}
						@Pc(245) int local245;
						@Pc(341) int local341;
						if (local9.aByteArray13 != null) {
							for (local245 = 0; local245 < local9.aByteArray13.length; local245++) {
								if (Static145.aBooleanArray13[local9.aByteArray13[local245]]) {
									if (local9.anIntArray188 == null || Static268.anInt5236 >= local9.anIntArray188[local245]) {
										@Pc(281) byte local281 = local9.aByteArray12[local245];
										if (local281 == 0 || ((local281 & 0x8) == 0 || !Static145.aBooleanArray13[86] && !Static145.aBooleanArray13[82] && !Static145.aBooleanArray13[81]) && ((local281 & 0x2) == 0 || Static145.aBooleanArray13[86]) && ((local281 & 0x1) == 0 || Static145.aBooleanArray13[82]) && ((local281 & 0x4) == 0 || Static145.aBooleanArray13[81])) {
											Static47.method879(local9.anInt2096, "", local245 + 1, -1);
											local341 = local9.anIntArray183[local245];
											if (local9.anIntArray188 == null) {
												local9.anIntArray188 = new int[local9.aByteArray13.length];
											}
											if (local341 == 0) {
												local9.anIntArray188[local245] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray188[local245] = Static268.anInt5236 + local341;
											}
										}
									}
								} else if (local9.anIntArray188 != null) {
									local9.anIntArray188[local245] = 0;
								}
							}
						}
						if (local223) {
							Static81.method1479(local9, Static86.anInt2010 - local50, Static252.anInt4933 - local55);
						}
						if (Static199.aClass56_19 != null && Static199.aClass56_19 != local9 && local209 && method804(local9).method332()) {
							Static10.aClass56_1 = local9;
						}
						if (local9 == Static192.aClass56_18) {
							Static189.aBoolean274 = true;
							Static71.anInt1808 = local50;
							Static209.anInt4314 = local55;
						}
						if (local9.aBoolean134 || local9.anInt2074 != 0) {
							@Pc(418) Class2_Sub12 local418;
							if (local209 && Static55.anInt1397 != 0 && local9.anObjectArray31 != null) {
								local418 = new Class2_Sub12();
								local418.aBoolean99 = true;
								local418.aClass56_6 = local9;
								local418.anInt1524 = Static55.anInt1397;
								local418.anObjectArray1 = local9.anObjectArray31;
								Static145.aClass44_18.method1358(local418);
							}
							if (Static199.aClass56_19 != null || Static79.aClass56_8 != null || Static196.aBoolean281 || local9.anInt2074 != 1400 && Static28.anInt626 > 0) {
								local223 = false;
								local214 = false;
								local209 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt2074 != 0) {
								if (local9.anInt2074 == 1337) {
									Static29.aClass56_4 = local9;
									continue;
								}
								if (local9.anInt2074 == 1338) {
									if (local223) {
										Static87.anInt2019 = Static86.anInt2010 - local50;
										Static71.anInt1813 = Static252.anInt4933 - local55;
									}
									continue;
								}
								if (local9.anInt2074 == 1400) {
									Static78.aClass56_3 = local9;
									if (local209) {
										Static113.aBoolean168 = true;
									}
									if (local223) {
										local245 = (int) ((double) (Static86.anInt2010 - local50 - local9.anInt2057 / 2) * 2.0D / (double) Static250.aFloat32);
										local522 = (int) ((double) (Static252.anInt4933 - local55 - local9.anInt2031 / 2) * 2.0D / (double) Static250.aFloat32);
										local341 = Static237.anInt4776 + local245;
										@Pc(530) int local530 = Static67.anInt1659 + local522;
										@Pc(534) int local534 = local341 + Static250.anInt3122;
										@Pc(542) int local542 = Static250.anInt3119 + Static250.anInt3118 - local530 - 1;
										@Pc(545) Class2_Sub8_Sub16 local545 = Static84.method1513();
										if (local545 == null) {
											continue;
										}
										@Pc(550) int[] local550 = new int[3];
										local545.method3593(local534, local550, local542);
										if (local550 != null) {
											if (Static145.aBooleanArray13[82] && Static175.anInt3864 > 0) {
												Static100.method1726(local550[0], local550[1], local550[2]);
												Static296.method4528();
												continue;
											}
											Static211.aClass2_Sub16_Sub1_2.method2198(201);
											Static211.aClass2_Sub16_Sub1_2.method2167(local550[0] << 28 | local550[1] << 14 | local550[2]);
										}
										Static28.anInt626 = 1;
										Static107.aBoolean161 = false;
										Static229.anInt4618 = Static131.anInt3016;
										Static215.anInt4386 = Static281.anInt5551;
										continue;
									}
									if (local214 && Static28.anInt626 > 0) {
										if (Static28.anInt626 == 1 && (Static229.anInt4618 != Static131.anInt3016 || Static215.anInt4386 != Static281.anInt5551)) {
											Static183.anInt3936 = Static237.anInt4776;
											Static178.anInt5286 = Static67.anInt1659;
											Static28.anInt626 = 2;
										}
										if (Static28.anInt626 == 2) {
											Static107.aBoolean161 = true;
											Static39.method733(Static183.anInt3936 + (int) ((double) (Static229.anInt4618 - Static131.anInt3016) * 2.0D / (double) Static250.aFloat31));
											Static137.method2470(Static178.anInt5286 + (int) ((double) (Static215.anInt4386 - Static281.anInt5551) * 2.0D / (double) Static250.aFloat31));
										}
										continue;
									}
									if (Static28.anInt626 > 0 && !Static107.aBoolean161) {
										if ((Static238.anInt5978 == 1 || Static183.method3239(Static68.anInt1741 - 1)) && Static68.anInt1741 > 2) {
											Static13.method239();
										} else if (Static68.anInt1741 > 0) {
											Static121.method2022();
										}
									}
									Static28.anInt626 = 0;
									continue;
								}
								if (local9.anInt2074 == 1401) {
									if (local214) {
										Static50.method942(Static131.anInt3016 - local50, Static281.anInt5551 - local55, local9.anInt2031, local9.anInt2057);
									}
									continue;
								}
								if (local9.anInt2074 == 1402) {
									if (!Static116.aBoolean184) {
										Static287.method4466(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean141 && local223) {
								local9.aBoolean141 = true;
								if (local9.anObjectArray11 != null) {
									local418 = new Class2_Sub12();
									local418.aBoolean99 = true;
									local418.aClass56_6 = local9;
									local418.anInt1527 = Static86.anInt2010 - local50;
									local418.anInt1524 = Static252.anInt4933 - local55;
									local418.anObjectArray1 = local9.anObjectArray11;
									Static145.aClass44_18.method1358(local418);
								}
							}
							if (local9.aBoolean141 && local214 && local9.anObjectArray32 != null) {
								local418 = new Class2_Sub12();
								local418.aBoolean99 = true;
								local418.aClass56_6 = local9;
								local418.anInt1527 = Static131.anInt3016 - local50;
								local418.anInt1524 = Static281.anInt5551 - local55;
								local418.anObjectArray1 = local9.anObjectArray32;
								Static145.aClass44_18.method1358(local418);
							}
							if (local9.aBoolean141 && !local214) {
								local9.aBoolean141 = false;
								if (local9.anObjectArray19 != null) {
									local418 = new Class2_Sub12();
									local418.aBoolean99 = true;
									local418.aClass56_6 = local9;
									local418.anInt1527 = Static131.anInt3016 - local50;
									local418.anInt1524 = Static281.anInt5551 - local55;
									local418.anObjectArray1 = local9.anObjectArray19;
									Static149.aClass44_19.method1358(local418);
								}
							}
							if (local214 && local9.anObjectArray4 != null) {
								local418 = new Class2_Sub12();
								local418.aBoolean99 = true;
								local418.aClass56_6 = local9;
								local418.anInt1527 = Static131.anInt3016 - local50;
								local418.anInt1524 = Static281.anInt5551 - local55;
								local418.anObjectArray1 = local9.anObjectArray4;
								Static145.aClass44_18.method1358(local418);
							}
							if (!local9.aBoolean128 && local209) {
								local9.aBoolean128 = true;
								if (local9.anObjectArray21 != null) {
									local418 = new Class2_Sub12();
									local418.aBoolean99 = true;
									local418.aClass56_6 = local9;
									local418.anInt1527 = Static131.anInt3016 - local50;
									local418.anInt1524 = Static281.anInt5551 - local55;
									local418.anObjectArray1 = local9.anObjectArray21;
									Static145.aClass44_18.method1358(local418);
								}
							}
							if (local9.aBoolean128 && local209 && local9.anObjectArray30 != null) {
								local418 = new Class2_Sub12();
								local418.aBoolean99 = true;
								local418.aClass56_6 = local9;
								local418.anInt1527 = Static131.anInt3016 - local50;
								local418.anInt1524 = Static281.anInt5551 - local55;
								local418.anObjectArray1 = local9.anObjectArray30;
								Static145.aClass44_18.method1358(local418);
							}
							if (local9.aBoolean128 && !local209) {
								local9.aBoolean128 = false;
								if (local9.anObjectArray25 != null) {
									local418 = new Class2_Sub12();
									local418.aBoolean99 = true;
									local418.aClass56_6 = local9;
									local418.anInt1527 = Static131.anInt3016 - local50;
									local418.anInt1524 = Static281.anInt5551 - local55;
									local418.anObjectArray1 = local9.anObjectArray25;
									Static149.aClass44_19.method1358(local418);
								}
							}
							if (local9.anObjectArray26 != null) {
								local418 = new Class2_Sub12();
								local418.aClass56_6 = local9;
								local418.anObjectArray1 = local9.anObjectArray26;
								Static100.aClass44_11.method1358(local418);
							}
							@Pc(1062) Class2_Sub12 local1062;
							if (local9.anObjectArray18 != null && Static165.anInt3652 > local9.anInt2083) {
								if (local9.anIntArray179 == null || Static165.anInt3652 - local9.anInt2083 > 32) {
									local418 = new Class2_Sub12();
									local418.aClass56_6 = local9;
									local418.anObjectArray1 = local9.anObjectArray18;
									Static145.aClass44_18.method1358(local418);
								} else {
									label598: for (local245 = local9.anInt2083; local245 < Static165.anInt3652; local245++) {
										local522 = Static132.anIntArray302[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray179.length; local341++) {
											if (local9.anIntArray179[local341] == local522) {
												local1062 = new Class2_Sub12();
												local1062.aClass56_6 = local9;
												local1062.anObjectArray1 = local9.anObjectArray18;
												Static145.aClass44_18.method1358(local1062);
												break label598;
											}
										}
									}
								}
								local9.anInt2083 = Static165.anInt3652;
							}
							if (local9.anObjectArray5 != null && Static74.anInt1842 > local9.anInt2091) {
								if (local9.anIntArray191 == null || Static74.anInt1842 - local9.anInt2091 > 32) {
									local418 = new Class2_Sub12();
									local418.aClass56_6 = local9;
									local418.anObjectArray1 = local9.anObjectArray5;
									Static145.aClass44_18.method1358(local418);
								} else {
									label574: for (local245 = local9.anInt2091; local245 < Static74.anInt1842; local245++) {
										local522 = Static222.anIntArray450[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray191.length; local341++) {
											if (local9.anIntArray191[local341] == local522) {
												local1062 = new Class2_Sub12();
												local1062.aClass56_6 = local9;
												local1062.anObjectArray1 = local9.anObjectArray5;
												Static145.aClass44_18.method1358(local1062);
												break label574;
											}
										}
									}
								}
								local9.anInt2091 = Static74.anInt1842;
							}
							if (local9.anObjectArray24 != null && Static274.anInt5434 > local9.anInt2117) {
								if (local9.anIntArray187 == null || Static274.anInt5434 - local9.anInt2117 > 32) {
									local418 = new Class2_Sub12();
									local418.aClass56_6 = local9;
									local418.anObjectArray1 = local9.anObjectArray24;
									Static145.aClass44_18.method1358(local418);
								} else {
									label550: for (local245 = local9.anInt2117; local245 < Static274.anInt5434; local245++) {
										local522 = Static74.anIntArray156[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray187.length; local341++) {
											if (local9.anIntArray187[local341] == local522) {
												local1062 = new Class2_Sub12();
												local1062.aClass56_6 = local9;
												local1062.anObjectArray1 = local9.anObjectArray24;
												Static145.aClass44_18.method1358(local1062);
												break label550;
											}
										}
									}
								}
								local9.anInt2117 = Static274.anInt5434;
							}
							if (local9.anObjectArray12 != null && Static155.anInt3472 > local9.anInt2104) {
								if (local9.anIntArray177 == null || Static155.anInt3472 - local9.anInt2104 > 32) {
									local418 = new Class2_Sub12();
									local418.aClass56_6 = local9;
									local418.anObjectArray1 = local9.anObjectArray12;
									Static145.aClass44_18.method1358(local418);
								} else {
									label526: for (local245 = local9.anInt2104; local245 < Static155.anInt3472; local245++) {
										local522 = Static188.anIntArray568[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray177.length; local341++) {
											if (local9.anIntArray177[local341] == local522) {
												local1062 = new Class2_Sub12();
												local1062.aClass56_6 = local9;
												local1062.anObjectArray1 = local9.anObjectArray12;
												Static145.aClass44_18.method1358(local1062);
												break label526;
											}
										}
									}
								}
								local9.anInt2104 = Static155.anInt3472;
							}
							if (local9.anObjectArray29 != null && Static128.anInt2953 > local9.anInt2038) {
								if (local9.anIntArray186 == null || Static128.anInt2953 - local9.anInt2038 > 32) {
									local418 = new Class2_Sub12();
									local418.aClass56_6 = local9;
									local418.anObjectArray1 = local9.anObjectArray29;
									Static145.aClass44_18.method1358(local418);
								} else {
									label502: for (local245 = local9.anInt2038; local245 < Static128.anInt2953; local245++) {
										local522 = Static245.anIntArray477[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray186.length; local341++) {
											if (local9.anIntArray186[local341] == local522) {
												local1062 = new Class2_Sub12();
												local1062.aClass56_6 = local9;
												local1062.anObjectArray1 = local9.anObjectArray29;
												Static145.aClass44_18.method1358(local1062);
												break label502;
											}
										}
									}
								}
								local9.anInt2038 = Static128.anInt2953;
							}
							if (Static95.anInt2292 > local9.anInt2046 && local9.anObjectArray7 != null) {
								local418 = new Class2_Sub12();
								local418.aClass56_6 = local9;
								local418.anObjectArray1 = local9.anObjectArray7;
								Static145.aClass44_18.method1358(local418);
							}
							if (Static233.anInt6039 > local9.anInt2046 && local9.anObjectArray15 != null) {
								local418 = new Class2_Sub12();
								local418.aClass56_6 = local9;
								local418.anObjectArray1 = local9.anObjectArray15;
								Static145.aClass44_18.method1358(local418);
							}
							if (Static79.anInt1900 > local9.anInt2046 && local9.anObjectArray10 != null) {
								local418 = new Class2_Sub12();
								local418.aClass56_6 = local9;
								local418.anObjectArray1 = local9.anObjectArray10;
								Static145.aClass44_18.method1358(local418);
							}
							if (Static52.anInt1307 > local9.anInt2046 && local9.anObjectArray14 != null) {
								local418 = new Class2_Sub12();
								local418.aClass56_6 = local9;
								local418.anObjectArray1 = local9.anObjectArray14;
								Static145.aClass44_18.method1358(local418);
							}
							if (Static44.anInt1147 > local9.anInt2046 && local9.anObjectArray6 != null) {
								local418 = new Class2_Sub12();
								local418.aClass56_6 = local9;
								local418.anObjectArray1 = local9.anObjectArray6;
								Static145.aClass44_18.method1358(local418);
							}
							local9.anInt2046 = Static291.anInt5632;
							if (local9.anObjectArray28 != null) {
								for (local245 = 0; local245 < Static49.anInt1230; local245++) {
									@Pc(1526) Class2_Sub12 local1526 = new Class2_Sub12();
									local1526.aClass56_6 = local9;
									local1526.anInt1522 = Static190.anIntArray398[local245];
									local1526.anInt1528 = Static126.anIntArray392[local245];
									local1526.anObjectArray1 = local9.anObjectArray28;
									Static145.aClass44_18.method1358(local1526);
								}
							}
							if (Static247.aBoolean110 && local9.anObjectArray22 != null) {
								local418 = new Class2_Sub12();
								local418.aClass56_6 = local9;
								local418.anObjectArray1 = local9.anObjectArray22;
								Static145.aClass44_18.method1358(local418);
							}
						}
					}
					if (!local9.aBoolean132 && Static199.aClass56_19 == null && Static79.aClass56_8 == null && !Static196.aBoolean281) {
						if ((local9.anInt2106 >= 0 || local9.anInt2061 != 0) && Static131.anInt3016 >= local61 && Static281.anInt5551 >= local63 && Static131.anInt3016 < local65 && Static281.anInt5551 < local67) {
							if (local9.anInt2106 >= 0) {
								Static141.aClass56_14 = arg0[local9.anInt2106];
							} else {
								Static141.aClass56_14 = local9;
							}
						}
						if (local9.anInt2092 == 8 && Static131.anInt3016 >= local61 && Static281.anInt5551 >= local63 && Static131.anInt3016 < local65 && Static281.anInt5551 < local67) {
							Static128.aClass56_12 = local9;
						}
						if (local9.anInt2087 > local9.anInt2031) {
							Static99.method1715(local55, local9, Static281.anInt5551, local9.anInt2031, Static131.anInt3016, local50 + local9.anInt2057, local9.anInt2087);
						}
					}
					if (local9.anInt2092 == 0) {
						method805(arg0, local9.anInt2096, local61, local63, local65, local67, local50 - local9.anInt2063, local55 - local9.anInt2039);
						if (local9.aClass56Array1 != null) {
							method805(local9.aClass56Array1, local9.anInt2096, local61, local63, local65, local67, local50 - local9.anInt2063, local55 - local9.anInt2039);
						}
						@Pc(1691) Class2_Sub4 local1691 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local9.anInt2096);
						if (local1691 != null) {
							Static180.method3216(local50, local67, local1691.anInt274, local65, local61, local63, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method807() {
		for (@Pc(1) int local1 = -1; local1 < Static191.anInt4008 + Static57.anInt1448; local1++) {
			@Pc(10) Class15_Sub2 local10;
			@Pc(12) long local12;
			@Pc(20) int local20;
			if (local1 < 0) {
				local10 = Static22.aClass15_Sub2_Sub2_1;
				local12 = 8791798054912L;
			} else if (local1 < Static191.anInt4008) {
				local20 = Static246.anIntArray479[local1];
				local10 = Static188.aClass15_Sub2_Sub2Array41[local20];
				local12 = (long) local20 << 32;
			} else {
				local20 = Static89.anIntArray194[local1 - Static191.anInt4008];
				@Pc(40) Class15_Sub2_Sub1 local40 = Static35.aClass15_Sub2_Sub1Array2[local20];
				local10 = local40;
				local12 = (long) local20 << 32 | 0x20000000L;
				if (!local40.aClass188_1.aBoolean392) {
					local12 |= Long.MIN_VALUE;
				}
			}
			if (local10.anInt5297 >= 0) {
				local20 = local10.method4286();
				if ((local20 & 0x1) == 0) {
					if ((local10.anInt5358 & 0x7F) == 0 && (local10.anInt5371 & 0x7F) == 0) {
						continue;
					}
				} else if ((local10.anInt5358 & 0x7F) == 64 && (local10.anInt5371 & 0x7F) == 64) {
					continue;
				}
				if (local10 instanceof Class15_Sub2_Sub2 && local10.anObject7 != null && Static268.anInt5236 >= local10.anInt5312 && Static268.anInt5236 < local10.anInt5359) {
					((Class15_Sub2_Sub2) local10).aBoolean359 = false;
					local10.anInt5308 = Static234.method3798(local10.anInt5371, local10.anInt5358, Static32.anInt876);
					Static131.method2427(Static32.anInt876, local10.anInt5358, local10.anInt5371, local10.anInt5308, local10, local10.anInt5373, local12, local10.anInt5302, local10.anInt5292, local10.anInt5380, local10.anInt5339);
				} else {
					local10.anInt5308 = Static234.method3798(local10.anInt5371, local10.anInt5358, Static32.anInt876);
					Static152.method2794(Static32.anInt876, local10.anInt5358, local10.anInt5371, local10.anInt5308, (local20 - 1) * 64 + 60, local10, local10.anInt5373, local12, local10.aBoolean356);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!g;)Lclient!g;")
	public static Class56 method809(@OriginalArg(0) Class56 arg0) {
		@Pc(4) int local4 = method804(arg0).method341();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static38.method715(arg0.anInt2030);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method811() {
		for (@Pc(1) int local1 = -1; local1 < Static191.anInt4008 + Static57.anInt1448; local1++) {
			@Pc(10) Class15_Sub2 local10;
			if (local1 < 0) {
				local10 = Static22.aClass15_Sub2_Sub2_1;
			} else if (local1 < Static191.anInt4008) {
				local10 = Static188.aClass15_Sub2_Sub2Array41[Static246.anIntArray479[local1]];
			} else {
				local10 = Static35.aClass15_Sub2_Sub1Array2[Static89.anIntArray194[local1 - Static191.anInt4008]];
			}
			if (local10.anInt5297 >= 0) {
				@Pc(37) int local37 = local10.method4286();
				if ((local37 & 0x1) == 0) {
					if ((local10.anInt5358 & 0x7F) != 0 || (local10.anInt5371 & 0x7F) != 0) {
						continue;
					}
				} else if ((local10.anInt5358 & 0x7F) != 64 || (local10.anInt5371 & 0x7F) != 64) {
					continue;
				}
				@Pc(124) int local124;
				@Pc(73) int local73;
				@Pc(78) int local78;
				if (local37 == 1) {
					local73 = local10.anInt5358 >> 7;
					local78 = local10.anInt5371 >> 7;
					if (local73 >= 0 && local73 < 104 && local78 >= 0 && local78 < 104 && local10.anInt5297 >= Static130.anIntArrayArray16[local73][local78]) {
						if (local10.anInt5297 > Static130.anIntArrayArray16[local73][local78]) {
							Static130.anIntArrayArray16[local73][local78] = local10.anInt5297;
							Static182.anIntArrayArray46[local73][local78] = 1;
						} else {
							local124 = Static182.anIntArrayArray46[local73][local78]++;
						}
					}
				} else {
					local73 = local10.anInt5358 - local37 * 64 >> 7;
					local78 = local10.anInt5371 - local37 * 64 >> 7;
					@Pc(152) int local152 = local73 + local10.method4286();
					@Pc(158) int local158 = local78 + local10.method4286();
					if (local73 < 0) {
						local73 = 0;
					}
					if (local152 > 104) {
						local152 = 104;
					}
					if (local78 < 0) {
						local78 = 0;
					}
					if (local158 > 104) {
						local158 = 104;
					}
					for (@Pc(178) int local178 = local73; local178 < local152; local178++) {
						for (@Pc(183) int local183 = local78; local183 < local158; local183++) {
							if (local10.anInt5297 > Static130.anIntArrayArray16[local178][local183]) {
								Static130.anIntArrayArray16[local178][local183] = local10.anInt5297;
								Static182.anIntArrayArray46[local178][local183] = 1;
							} else if (local10.anInt5297 == Static130.anIntArrayArray16[local178][local183]) {
								local124 = Static182.anIntArrayArray46[local178][local183]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method814() {
		Static102.anInt2404 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static57.anInt1448; local3++) {
			@Pc(12) Class15_Sub2_Sub1 local12 = Static35.aClass15_Sub2_Sub1Array2[Static89.anIntArray194[local3]];
			if (local12.aBoolean357 && local12.method4293() != -1) {
				@Pc(33) int local33 = local12.anInt5358 - (local12.method4286() - 1) * 64;
				@Pc(44) int local44 = local12.anInt5371 - (local12.method4286() - 1) * 64;
				@Pc(53) Class170 local53 = Static223.method3678(Static32.anInt876, local33 >> 7, local44 >> 7);
				if (local53 != null) {
					@Pc(59) long local59 = local53.aLong195;
					@Pc(66) int local66 = (int) (local59 >>> 32) & Integer.MAX_VALUE;
					@Pc(78) Class15_Sub2 local78;
					if ((local59 >>> 29 & 0x3L) == 0L) {
						local78 = Static188.aClass15_Sub2_Sub2Array41[local66];
					} else {
						local78 = Static35.aClass15_Sub2_Sub1Array2[local66];
						local66 += 2048;
					}
					if (local78.anInt5379 == -1) {
						Static162.anIntArray358[Static102.anInt2404] = local66;
						Static21.anIntArray56[Static102.anInt2404++] = local66;
						local78.anInt5379 = 0;
					}
					Static162.anIntArray358[Static102.anInt2404] = local66;
					Static21.anIntArray56[Static102.anInt2404++] = Static89.anIntArray194[local3] + 2048;
				}
			}
		}
		Static15.method274(Static21.anIntArray56, Static162.anIntArray358, Static102.anInt2404 - 1, 0);
	}
}
