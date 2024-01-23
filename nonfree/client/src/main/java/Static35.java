import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	public static int anInt873;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!th;")
	public static Class168 aClass168_28;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Z")
	public static boolean aBoolean65 = true;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	public static void method736(@OriginalArg(1) int arg0) {
		Static11.anInt308 = 3;
		Static48.anInt1149 = 100;
		Static170.anInt3807 = -1;
		Static186.anInt4091 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wf;)Lclient!vj;")
	public static Class1_Sub30 method737(@OriginalArg(0) Class191 arg0) {
		@Pc(13) Class1_Sub30 local13 = (Class1_Sub30) Static204.aClass186_19.method4570(((long) arg0.anInt6134 << 32) + (long) arg0.anInt6165);
		return local13 == null ? arg0.aClass1_Sub30_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!th;I)V")
	public static void method738(@OriginalArg(0) Class168 arg0) {
		Static143.aClass168_109 = arg0;
		Static266.anInt5320 = Static143.aClass168_109.method4068(4);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	public static void method741() {
		if (Static31.anInt770 == 0) {
			return;
		}
		try {
			if (++Static225.anInt4810 > 1500) {
				if (Static5.aClass104_5 != null) {
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
				}
				if (Static58.anInt1271 >= 1) {
					Static31.anInt770 = 0;
					Static271.anInt5421 = -5;
					return;
				}
				Static31.anInt770 = 1;
				Static58.anInt1271++;
				Static225.anInt4810 = 0;
				if (Static313.anInt6274 == Static46.anInt1110) {
					Static313.anInt6274 = Static63.anInt1367;
				} else {
					Static313.anInt6274 = Static46.anInt1110;
				}
			}
			if (Static31.anInt770 == 1) {
				Static315.aClass47_8 = Static142.aClass112_2.method2889(Static130.aString178, Static313.anInt6274);
				Static31.anInt770 = 2;
			}
			@Pc(123) int local123;
			if (Static31.anInt770 == 2) {
				if (Static315.aClass47_8.anInt1417 == 2) {
					throw new IOException();
				}
				if (Static315.aClass47_8.anInt1417 != 1) {
					return;
				}
				Static5.aClass104_5 = new Class104((Socket) Static315.aClass47_8.anObject2, Static142.aClass112_2);
				Static315.aClass47_8 = null;
				Static5.aClass104_5.method2579(Static2.aClass1_Sub14_Sub1_1.aByteArray55, Static2.aClass1_Sub14_Sub1_1.anInt3000);
				if (Static114.aClass15_1 != null) {
					Static114.aClass15_1.method1249();
				}
				if (Static157.aClass15_2 != null) {
					Static157.aClass15_2.method1249();
				}
				local123 = Static5.aClass104_5.method2573();
				if (Static114.aClass15_1 != null) {
					Static114.aClass15_1.method1249();
				}
				if (Static157.aClass15_2 != null) {
					Static157.aClass15_2.method1249();
				}
				if (local123 != 101) {
					Static31.anInt770 = 0;
					Static271.anInt5421 = local123;
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
					return;
				}
				Static31.anInt770 = 3;
			}
			if (Static31.anInt770 == 3) {
				if (Static5.aClass104_5.method2581() >= 2) {
					local123 = Static5.aClass104_5.method2573() << 8 | Static5.aClass104_5.method2573();
					Static223.method3542(local123);
					if (Static96.anInt2210 == -1) {
						Static271.anInt5421 = 6;
						Static31.anInt770 = 0;
						Static5.aClass104_5.method2571();
						Static5.aClass104_5 = null;
						return;
					}
					Static31.anInt770 = 0;
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
					Static222.method3478();
					return;
				}
				return;
			}
		} catch (@Pc(203) IOException local203) {
			if (Static5.aClass104_5 != null) {
				Static5.aClass104_5.method2571();
				Static5.aClass104_5 = null;
			}
			if (Static58.anInt1271 < 1) {
				Static225.anInt4810 = 0;
				if (Static46.anInt1110 == Static313.anInt6274) {
					Static313.anInt6274 = Static63.anInt1367;
				} else {
					Static313.anInt6274 = Static46.anInt1110;
				}
				Static31.anInt770 = 1;
				Static58.anInt1271++;
			} else {
				Static31.anInt770 = 0;
				Static271.anInt5421 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!th;B)V")
	public static void method742(@OriginalArg(0) Class168 arg0) {
		Static124.aClass168_94 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!wf;IIIIIII)V")
	public static void method743(@OriginalArg(0) Class191[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class191 local9 = arg0[local1];
			if (local9 != null && local9.anInt6093 == arg1 && (!local9.aBoolean408 || local9.anInt6086 == 0 || local9.aBoolean394 || method737(local9).anInt5933 != 0 || local9 == Static120.aClass191_18 || local9.anInt6115 == 1338) && (!local9.aBoolean408 || !method759(local9))) {
				@Pc(50) int local50 = local9.anInt6123 + arg6;
				@Pc(55) int local55 = local9.anInt6157 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt6086 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt6088;
					@Pc(78) int local78 = local55 + local9.anInt6128;
					if (local9.anInt6086 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static238.aClass191_11) {
					Static81.aBoolean130 = true;
					Static37.anInt928 = local50;
					Static251.anInt5520 = local55;
				}
				if (!local9.aBoolean408 || local61 < local65 && local63 < local67) {
					if (local9.anInt6086 == 0) {
						if (!local9.aBoolean408 && method759(local9) && Static2.aClass191_2 != local9) {
							continue;
						}
						if (local9.aBoolean401 && Static89.anInt5974 >= local61 && Static289.anInt5816 >= local63 && Static89.anInt5974 < local65 && Static289.anInt5816 < local67) {
							for (@Pc(164) Class1_Sub27 local164 = (Class1_Sub27) Static262.aClass26_50.method666(); local164 != null; local164 = (Class1_Sub27) Static262.aClass26_50.method672()) {
								if (local164.aBoolean324) {
									local164.method4767();
									local164.aClass191_14.aBoolean406 = false;
								}
							}
							if (Static31.anInt773 == 0) {
								Static238.aClass191_11 = null;
								Static120.aClass191_18 = null;
							}
							Static47.anInt1141 = 0;
							Static25.aBoolean38 = false;
						}
					}
					if (local9.aBoolean408) {
						@Pc(209) boolean local209;
						if (Static89.anInt5974 >= local61 && Static289.anInt5816 >= local63 && Static89.anInt5974 < local65 && Static289.anInt5816 < local67) {
							local209 = true;
						} else {
							local209 = false;
						}
						@Pc(214) boolean local214 = false;
						if (Static202.anInt4403 == 1 && local209) {
							local214 = true;
						}
						@Pc(223) boolean local223 = false;
						if (Static17.anInt472 == 1 && Static89.anInt5976 >= local61 && Static94.anInt2165 >= local63 && Static89.anInt5976 < local65 && Static94.anInt2165 < local67) {
							local223 = true;
						}
						@Pc(245) int local245;
						@Pc(341) int local341;
						if (local9.aByteArray73 != null) {
							for (local245 = 0; local245 < local9.aByteArray73.length; local245++) {
								if (Static23.aBooleanArray3[local9.aByteArray73[local245]]) {
									if (local9.anIntArray556 == null || Static133.anInt3061 >= local9.anIntArray556[local245]) {
										@Pc(281) byte local281 = local9.aByteArray74[local245];
										if (local281 == 0 || ((local281 & 0x8) == 0 || !Static23.aBooleanArray3[86] && !Static23.aBooleanArray3[82] && !Static23.aBooleanArray3[81]) && ((local281 & 0x2) == 0 || Static23.aBooleanArray3[86]) && ((local281 & 0x1) == 0 || Static23.aBooleanArray3[82]) && ((local281 & 0x4) == 0 || Static23.aBooleanArray3[81])) {
											Static299.method4566(local245 + 1, "", local9.anInt6134, -1);
											local341 = local9.anIntArray552[local245];
											if (local9.anIntArray556 == null) {
												local9.anIntArray556 = new int[local9.aByteArray73.length];
											}
											if (local341 == 0) {
												local9.anIntArray556[local245] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray556[local245] = Static133.anInt3061 + local341;
											}
										}
									}
								} else if (local9.anIntArray556 != null) {
									local9.anIntArray556[local245] = 0;
								}
							}
						}
						if (local223) {
							Static308.method4673(local9, Static94.anInt2165 - local55, Static89.anInt5976 - local50);
						}
						if (Static238.aClass191_11 != null && Static238.aClass191_11 != local9 && local209 && method737(local9).method4555()) {
							Static77.aClass191_5 = local9;
						}
						if (local9 == Static120.aClass191_18) {
							Static129.aBoolean173 = true;
							Static289.anInt5817 = local50;
							Static118.anInt2546 = local55;
						}
						if (local9.aBoolean394 || local9.anInt6115 != 0) {
							@Pc(418) Class1_Sub27 local418;
							if (local209 && Static134.anInt3083 != 0 && local9.anObjectArray3 != null) {
								local418 = new Class1_Sub27();
								local418.aBoolean324 = true;
								local418.aClass191_14 = local9;
								local418.anInt5232 = Static134.anInt3083;
								local418.anObjectArray1 = local9.anObjectArray3;
								Static262.aClass26_50.method668(local418);
							}
							if (Static238.aClass191_11 != null || Static75.aClass191_4 != null || Static128.aBoolean171 || local9.anInt6115 != 1400 && Static47.anInt1141 > 0) {
								local223 = false;
								local214 = false;
								local209 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt6115 != 0) {
								if (local9.anInt6115 == 1337) {
									Static210.aClass191_10 = local9;
									continue;
								}
								if (local9.anInt6115 == 1338) {
									if (local223) {
										Static208.anInt4494 = Static89.anInt5976 - local50;
										Static107.anInt1669 = Static94.anInt2165 - local55;
									}
									continue;
								}
								if (local9.anInt6115 == 1400) {
									Static246.aClass191_12 = local9;
									if (local209) {
										Static25.aBoolean38 = true;
									}
									if (local223) {
										local245 = (int) ((double) (Static89.anInt5976 - local50 - local9.anInt6088 / 2) * 2.0D / (double) Static268.aFloat34);
										local522 = (int) ((double) (Static94.anInt2165 - local55 - local9.anInt6128 / 2) * 2.0D / (double) Static268.aFloat34);
										local341 = Static109.anInt2414 + local245;
										@Pc(530) int local530 = Static299.anInt5944 + local522;
										@Pc(534) int local534 = local341 + Static268.anInt2655;
										@Pc(542) int local542 = Static268.anInt2659 + Static268.anInt2656 - local530 - 1;
										@Pc(545) Class1_Sub3_Sub15 local545 = Static14.method364();
										if (local545 == null) {
											continue;
										}
										@Pc(550) int[] local550 = new int[3];
										local545.method2927(local550, local542, local534);
										if (local550 != null) {
											if (Static23.aBooleanArray3[82] && Static77.anInt1764 > 0) {
												Static50.method278(local550[0], local550[2], local550[1]);
												Static10.method301();
												continue;
											}
											Static2.aClass1_Sub14_Sub1_1.method2252(65);
											Static2.aClass1_Sub14_Sub1_1.method2236(local550[0] << 28 | local550[1] << 14 | local550[2]);
										}
										Static47.anInt1141 = 1;
										Static108.aBoolean150 = false;
										Static40.anInt989 = Static89.anInt5974;
										Static270.anInt5414 = Static289.anInt5816;
										continue;
									}
									if (local214 && Static47.anInt1141 > 0) {
										if (Static47.anInt1141 == 1 && (Static40.anInt989 != Static89.anInt5974 || Static270.anInt5414 != Static289.anInt5816)) {
											Static147.anInt3290 = Static109.anInt2414;
											Static199.anInt6294 = Static299.anInt5944;
											Static47.anInt1141 = 2;
										}
										if (Static47.anInt1141 == 2) {
											Static108.aBoolean150 = true;
											Static126.method2049(Static147.anInt3290 + (int) ((double) (Static40.anInt989 - Static89.anInt5974) * 2.0D / (double) Static268.aFloat35));
											Static240.method3776(Static199.anInt6294 + (int) ((double) (Static270.anInt5414 - Static289.anInt5816) * 2.0D / (double) Static268.aFloat35));
										}
										continue;
									}
									if (Static47.anInt1141 > 0 && !Static108.aBoolean150) {
										if ((Static102.anInt849 == 1 || Static300.method4578(Static181.anInt3973 - 1)) && Static181.anInt3973 > 2) {
											Static301.method3612();
										} else if (Static181.anInt3973 > 0) {
											Static103.method1723();
										}
									}
									Static47.anInt1141 = 0;
									continue;
								}
								if (local9.anInt6115 == 1401) {
									if (local214) {
										Static303.method4618(local9.anInt6088, Static89.anInt5974 - local50, Static289.anInt5816 - local55, local9.anInt6128);
									}
									continue;
								}
								if (local9.anInt6115 == 1402) {
									if (!Static294.aBoolean367) {
										Static40.method817(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean402 && local223) {
								local9.aBoolean402 = true;
								if (local9.anObjectArray30 != null) {
									local418 = new Class1_Sub27();
									local418.aBoolean324 = true;
									local418.aClass191_14 = local9;
									local418.anInt5234 = Static89.anInt5976 - local50;
									local418.anInt5232 = Static94.anInt2165 - local55;
									local418.anObjectArray1 = local9.anObjectArray30;
									Static262.aClass26_50.method668(local418);
								}
							}
							if (local9.aBoolean402 && local214 && local9.anObjectArray20 != null) {
								local418 = new Class1_Sub27();
								local418.aBoolean324 = true;
								local418.aClass191_14 = local9;
								local418.anInt5234 = Static89.anInt5974 - local50;
								local418.anInt5232 = Static289.anInt5816 - local55;
								local418.anObjectArray1 = local9.anObjectArray20;
								Static262.aClass26_50.method668(local418);
							}
							if (local9.aBoolean402 && !local214) {
								local9.aBoolean402 = false;
								if (local9.anObjectArray5 != null) {
									local418 = new Class1_Sub27();
									local418.aBoolean324 = true;
									local418.aClass191_14 = local9;
									local418.anInt5234 = Static89.anInt5974 - local50;
									local418.anInt5232 = Static289.anInt5816 - local55;
									local418.anObjectArray1 = local9.anObjectArray5;
									Static266.aClass26_51.method668(local418);
								}
							}
							if (local214 && local9.anObjectArray29 != null) {
								local418 = new Class1_Sub27();
								local418.aBoolean324 = true;
								local418.aClass191_14 = local9;
								local418.anInt5234 = Static89.anInt5974 - local50;
								local418.anInt5232 = Static289.anInt5816 - local55;
								local418.anObjectArray1 = local9.anObjectArray29;
								Static262.aClass26_50.method668(local418);
							}
							if (!local9.aBoolean406 && local209) {
								local9.aBoolean406 = true;
								if (local9.anObjectArray13 != null) {
									local418 = new Class1_Sub27();
									local418.aBoolean324 = true;
									local418.aClass191_14 = local9;
									local418.anInt5234 = Static89.anInt5974 - local50;
									local418.anInt5232 = Static289.anInt5816 - local55;
									local418.anObjectArray1 = local9.anObjectArray13;
									Static262.aClass26_50.method668(local418);
								}
							}
							if (local9.aBoolean406 && local209 && local9.anObjectArray14 != null) {
								local418 = new Class1_Sub27();
								local418.aBoolean324 = true;
								local418.aClass191_14 = local9;
								local418.anInt5234 = Static89.anInt5974 - local50;
								local418.anInt5232 = Static289.anInt5816 - local55;
								local418.anObjectArray1 = local9.anObjectArray14;
								Static262.aClass26_50.method668(local418);
							}
							if (local9.aBoolean406 && !local209) {
								local9.aBoolean406 = false;
								if (local9.anObjectArray25 != null) {
									local418 = new Class1_Sub27();
									local418.aBoolean324 = true;
									local418.aClass191_14 = local9;
									local418.anInt5234 = Static89.anInt5974 - local50;
									local418.anInt5232 = Static289.anInt5816 - local55;
									local418.anObjectArray1 = local9.anObjectArray25;
									Static266.aClass26_51.method668(local418);
								}
							}
							if (local9.anObjectArray10 != null) {
								local418 = new Class1_Sub27();
								local418.aClass191_14 = local9;
								local418.anObjectArray1 = local9.anObjectArray10;
								Static145.aClass26_58.method668(local418);
							}
							@Pc(1062) Class1_Sub27 local1062;
							if (local9.anObjectArray21 != null && Static148.anInt3328 > local9.anInt6095) {
								if (local9.anIntArray551 == null || Static148.anInt3328 - local9.anInt6095 > 32) {
									local418 = new Class1_Sub27();
									local418.aClass191_14 = local9;
									local418.anObjectArray1 = local9.anObjectArray21;
									Static262.aClass26_50.method668(local418);
								} else {
									label598: for (local245 = local9.anInt6095; local245 < Static148.anInt3328; local245++) {
										local522 = Static206.anIntArray397[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray551.length; local341++) {
											if (local9.anIntArray551[local341] == local522) {
												local1062 = new Class1_Sub27();
												local1062.aClass191_14 = local9;
												local1062.anObjectArray1 = local9.anObjectArray21;
												Static262.aClass26_50.method668(local1062);
												break label598;
											}
										}
									}
								}
								local9.anInt6095 = Static148.anInt3328;
							}
							if (local9.anObjectArray8 != null && Static140.anInt3192 > local9.anInt6166) {
								if (local9.anIntArray555 == null || Static140.anInt3192 - local9.anInt6166 > 32) {
									local418 = new Class1_Sub27();
									local418.aClass191_14 = local9;
									local418.anObjectArray1 = local9.anObjectArray8;
									Static262.aClass26_50.method668(local418);
								} else {
									label574: for (local245 = local9.anInt6166; local245 < Static140.anInt3192; local245++) {
										local522 = Static36.anIntArray118[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray555.length; local341++) {
											if (local9.anIntArray555[local341] == local522) {
												local1062 = new Class1_Sub27();
												local1062.aClass191_14 = local9;
												local1062.anObjectArray1 = local9.anObjectArray8;
												Static262.aClass26_50.method668(local1062);
												break label574;
											}
										}
									}
								}
								local9.anInt6166 = Static140.anInt3192;
							}
							if (local9.anObjectArray17 != null && Static259.anInt5238 > local9.anInt6089) {
								if (local9.anIntArray547 == null || Static259.anInt5238 - local9.anInt6089 > 32) {
									local418 = new Class1_Sub27();
									local418.aClass191_14 = local9;
									local418.anObjectArray1 = local9.anObjectArray17;
									Static262.aClass26_50.method668(local418);
								} else {
									label550: for (local245 = local9.anInt6089; local245 < Static259.anInt5238; local245++) {
										local522 = Static137.anIntArray228[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray547.length; local341++) {
											if (local9.anIntArray547[local341] == local522) {
												local1062 = new Class1_Sub27();
												local1062.aClass191_14 = local9;
												local1062.anObjectArray1 = local9.anObjectArray17;
												Static262.aClass26_50.method668(local1062);
												break label550;
											}
										}
									}
								}
								local9.anInt6089 = Static259.anInt5238;
							}
							if (local9.anObjectArray32 != null && Static232.anInt4880 > local9.anInt6119) {
								if (local9.anIntArray559 == null || Static232.anInt4880 - local9.anInt6119 > 32) {
									local418 = new Class1_Sub27();
									local418.aClass191_14 = local9;
									local418.anObjectArray1 = local9.anObjectArray32;
									Static262.aClass26_50.method668(local418);
								} else {
									label526: for (local245 = local9.anInt6119; local245 < Static232.anInt4880; local245++) {
										local522 = Static150.anIntArray312[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray559.length; local341++) {
											if (local9.anIntArray559[local341] == local522) {
												local1062 = new Class1_Sub27();
												local1062.aClass191_14 = local9;
												local1062.anObjectArray1 = local9.anObjectArray32;
												Static262.aClass26_50.method668(local1062);
												break label526;
											}
										}
									}
								}
								local9.anInt6119 = Static232.anInt4880;
							}
							if (local9.anObjectArray26 != null && Static205.anInt4447 > local9.anInt6126) {
								if (local9.anIntArray549 == null || Static205.anInt4447 - local9.anInt6126 > 32) {
									local418 = new Class1_Sub27();
									local418.aClass191_14 = local9;
									local418.anObjectArray1 = local9.anObjectArray26;
									Static262.aClass26_50.method668(local418);
								} else {
									label502: for (local245 = local9.anInt6126; local245 < Static205.anInt4447; local245++) {
										local522 = Static139.anIntArray294[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray549.length; local341++) {
											if (local9.anIntArray549[local341] == local522) {
												local1062 = new Class1_Sub27();
												local1062.aClass191_14 = local9;
												local1062.anObjectArray1 = local9.anObjectArray26;
												Static262.aClass26_50.method668(local1062);
												break label502;
											}
										}
									}
								}
								local9.anInt6126 = Static205.anInt4447;
							}
							if (Static44.anInt1072 > local9.anInt6129 && local9.anObjectArray24 != null) {
								local418 = new Class1_Sub27();
								local418.aClass191_14 = local9;
								local418.anObjectArray1 = local9.anObjectArray24;
								Static262.aClass26_50.method668(local418);
							}
							if (Static41.anInt1002 > local9.anInt6129 && local9.anObjectArray4 != null) {
								local418 = new Class1_Sub27();
								local418.aClass191_14 = local9;
								local418.anObjectArray1 = local9.anObjectArray4;
								Static262.aClass26_50.method668(local418);
							}
							if (Static316.anInt6313 > local9.anInt6129 && local9.anObjectArray15 != null) {
								local418 = new Class1_Sub27();
								local418.aClass191_14 = local9;
								local418.anObjectArray1 = local9.anObjectArray15;
								Static262.aClass26_50.method668(local418);
							}
							if (Static133.anInt3068 > local9.anInt6129 && local9.anObjectArray27 != null) {
								local418 = new Class1_Sub27();
								local418.aClass191_14 = local9;
								local418.anObjectArray1 = local9.anObjectArray27;
								Static262.aClass26_50.method668(local418);
							}
							if (Static190.anInt4200 > local9.anInt6129 && local9.anObjectArray9 != null) {
								local418 = new Class1_Sub27();
								local418.aClass191_14 = local9;
								local418.anObjectArray1 = local9.anObjectArray9;
								Static262.aClass26_50.method668(local418);
							}
							local9.anInt6129 = Static12.anInt4023;
							if (local9.anObjectArray16 != null) {
								for (local245 = 0; local245 < Static266.anInt5321; local245++) {
									@Pc(1526) Class1_Sub27 local1526 = new Class1_Sub27();
									local1526.aClass191_14 = local9;
									local1526.anInt5229 = Static301.anIntArray445[local245];
									local1526.anInt5228 = Static242.anIntArray465[local245];
									local1526.anObjectArray1 = local9.anObjectArray16;
									Static262.aClass26_50.method668(local1526);
								}
							}
							if (Static2.aBoolean2 && local9.anObjectArray28 != null) {
								local418 = new Class1_Sub27();
								local418.aClass191_14 = local9;
								local418.anObjectArray1 = local9.anObjectArray28;
								Static262.aClass26_50.method668(local418);
							}
						}
					}
					if (!local9.aBoolean408 && Static238.aClass191_11 == null && Static75.aClass191_4 == null && !Static128.aBoolean171) {
						if ((local9.anInt6105 >= 0 || local9.anInt6170 != 0) && Static89.anInt5974 >= local61 && Static289.anInt5816 >= local63 && Static89.anInt5974 < local65 && Static289.anInt5816 < local67) {
							if (local9.anInt6105 >= 0) {
								Static2.aClass191_2 = arg0[local9.anInt6105];
							} else {
								Static2.aClass191_2 = local9;
							}
						}
						if (local9.anInt6086 == 8 && Static89.anInt5974 >= local61 && Static289.anInt5816 >= local63 && Static89.anInt5974 < local65 && Static289.anInt5816 < local67) {
							Static129.aClass191_8 = local9;
						}
						if (local9.anInt6151 > local9.anInt6128) {
							Static308.method4677(Static289.anInt5816, local55, local9.anInt6151, local50 + local9.anInt6088, local9, Static89.anInt5974, local9.anInt6128);
						}
					}
					if (local9.anInt6086 == 0) {
						method743(arg0, local9.anInt6134, local61, local63, local65, local67, local50 - local9.anInt6163, local55 - local9.anInt6106);
						if (local9.aClass191Array2 != null) {
							method743(local9.aClass191Array2, local9.anInt6134, local61, local63, local65, local67, local50 - local9.anInt6163, local55 - local9.anInt6106);
						}
						@Pc(1691) Class1_Sub12 local1691 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local9.anInt6134);
						if (local1691 != null) {
							Static138.method2309(local61, local1691.anInt2208, local50, local55, local63, local65, local67);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	public static int method744(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg0 & 0x3;
		if (local13 == 0) {
			return arg1;
		} else if (local13 == 1) {
			return 7 - arg2;
		} else if (local13 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!wf;)Lclient!wf;")
	public static Class191 method745(@OriginalArg(0) Class191 arg0) {
		@Pc(4) int local4 = method737(arg0).method4561();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static171.method2789(arg0.anInt6093);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method746() {
		Static205.anInt4443 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static147.anInt3287; local3++) {
			@Pc(12) Class2_Sub4_Sub1 local12 = Static105.aClass2_Sub4_Sub1Array1[Static100.anIntArray224[local3]];
			if (local12.aBoolean180) {
				@Pc(27) int local27 = local12.anInt2846 - (local12.method2088() - 1) * 64;
				@Pc(38) int local38 = local12.anInt2794 - (local12.method2088() - 1) * 64;
				@Pc(47) Class7 local47 = Static46.method925(Static185.anInt4085, local27 >> 7, local38 >> 7);
				if (local47 != null) {
					@Pc(53) long local53 = local47.aLong7;
					@Pc(60) int local60 = (int) (local53 >>> 32) & Integer.MAX_VALUE;
					@Pc(72) Class2_Sub4 local72;
					if ((local53 >>> 29 & 0x3L) == 0L) {
						local72 = Static155.aClass2_Sub4_Sub2Array1[local60];
					} else {
						local72 = Static105.aClass2_Sub4_Sub1Array1[local60];
						local60 += 2048;
					}
					if (!local72.aBoolean175) {
						Static27.anIntArray393[Static205.anInt4443] = local60;
						Static260.anIntArray478[Static205.anInt4443++] = local60;
						local72.aBoolean175 = true;
					}
					Static27.anIntArray393[Static205.anInt4443] = local60;
					Static260.anIntArray478[Static205.anInt4443++] = Static100.anIntArray224[local3] + 2048;
				}
			}
		}
		Static154.method2508(0, Static205.anInt4443 - 1, Static27.anIntArray393, Static260.anIntArray478);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method747() {
		@Pc(11) boolean local11 = Static280.aBoolean353 && Static16.anInt461 > 200 || Static16.anInt461 > 50;
		@Pc(13) int local13;
		@Pc(62) int local62;
		for (local13 = 0; local13 < Static16.anInt461; local13++) {
			@Pc(22) Class2_Sub4_Sub2 local22 = Static155.aClass2_Sub4_Sub2Array1[Static304.anIntArray533[local13]];
			local22.aBoolean175 = false;
			local22.anInt2835 = 0;
			local22.aBoolean179 = false;
			if (local22.method2100()) {
				local22.aBoolean182 = local22.anInt2820 == local22.method2095().anInt3138 ? local11 : false;
				if (local22.aBoolean180) {
					local22.aBoolean180 = false;
					local62 = 0;
				} else {
					local62 = 1;
				}
				if (local22.anInt2769 > Static133.anInt3061) {
					local62 += 2;
				}
				local62 += 5 - local22.method2088() << 2;
				if (Static5.anInt3336 == 0) {
					local62 += 32;
				} else {
					local62 += 128;
				}
				local62 += 256;
				local22.anInt2793 = local62 + 1;
			} else {
				local22.aBoolean180 = false;
				local22.anInt2793 = -1;
			}
		}
		for (local13 = 0; local13 < Static147.anInt3287; local13++) {
			@Pc(104) Class2_Sub4_Sub1 local104 = Static105.aClass2_Sub4_Sub1Array1[Static100.anIntArray224[local13]];
			local104.aBoolean175 = false;
			local104.anInt2835 = 0;
			local104.aBoolean179 = false;
			if (local104.method2100() && local104.aClass145_1.method3716()) {
				if (local104.aBoolean180) {
					local104.aBoolean180 = false;
					local62 = 0;
				} else {
					local62 = 1;
				}
				if (local104.anInt2769 > Static133.anInt3061) {
					local62 += 2;
				}
				local62 += 5 - local104.method2088() << 2;
				if (Static5.anInt3336 == 0) {
					if (local104.aClass145_1.aBoolean301) {
						local62 += 64;
					} else {
						local62 += 128;
					}
				} else if (Static5.anInt3336 == 1) {
					if (local104.aClass145_1.aBoolean301) {
						local62 += 32;
					} else {
						local62 += 64;
					}
				}
				if (local104.aClass145_1.aBoolean299) {
					local62 += 512;
				} else {
					local62 += 256;
				}
				local104.anInt2793 = local62 + 1;
			} else {
				local104.aBoolean180 = false;
				local104.anInt2793 = -1;
			}
		}
		for (local13 = 0; local13 < Static170.aClass64Array1.length; local13++) {
			@Pc(201) Class64 local201 = Static170.aClass64Array1[local13];
			if (local201 != null) {
				if (local201.anInt2092 == 1) {
					@Pc(213) Class2_Sub4_Sub1 local213 = Static105.aClass2_Sub4_Sub1Array1[local201.anInt2090];
					if (local213 != null && local213.anInt2793 != -1) {
						local213.anInt2793 += 1024;
					}
				} else if (local201.anInt2092 == 10) {
					@Pc(235) Class2_Sub4_Sub2 local235 = Static155.aClass2_Sub4_Sub2Array1[local201.anInt2090];
					if (local235 != null && local235.anInt2793 != -1) {
						local235.anInt2793 += 1024;
					}
				}
			}
		}
		Static56.aClass2_Sub4_Sub2_1.aBoolean180 = false;
		Static56.aClass2_Sub4_Sub2_1.aBoolean175 = false;
		Static56.aClass2_Sub4_Sub2_1.anInt2835 = 0;
		Static56.aClass2_Sub4_Sub2_1.aBoolean179 = false;
		Static56.aClass2_Sub4_Sub2_1.anInt2793 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!th;)V")
	public static void method748(@OriginalArg(1) Class168 arg0) {
		Static117.aClass1_Sub3_Sub13Array11 = Static83.method1431(Static145.anInt6067, arg0);
		Static23.aClass1_Sub3_Sub13Array3 = Static83.method1431(Static55.anInt1220, arg0);
		Static198.aClass1_Sub3_Sub13Array10 = Static83.method1431(Static18.anInt493, arg0);
		Static302.aClass1_Sub3_Sub13Array12 = Static83.method1431(Static182.anInt4018, arg0);
		Static82.aClass1_Sub3_Sub13Array5 = Static83.method1431(Static31.anInt771, arg0);
		Static181.aClass1_Sub3_Sub13Array9 = Static83.method1431(Static117.anInt4597, arg0);
		Static172.aClass1_Sub3_Sub13Array8 = Static21.method450(arg0, Static146.anInt4440);
		Static40.aClass1_Sub3_Sub13Array4 = Static21.method450(arg0, Static260.anInt5267);
		Static10.aClass1_Sub3_Sub13Array1 = Static21.method450(arg0, Static190.anInt4208);
		Static104.aClass46Array2 = Static250.method3848(arg0, Static49.anInt1171);
		Static225.aClass46Array5 = Static250.method3848(arg0, Static169.anInt3796);
		Static160.aClass1_Sub3_Sub5_1.method3502(Static225.aClass46Array5, null);
		Static195.aClass1_Sub3_Sub5_3.method3502(Static225.aClass46Array5, null);
		Static176.aClass1_Sub3_Sub5_2.method3502(Static225.aClass46Array5, null);
		if (Static294.aBoolean367) {
			Static177.aClass46_Sub1Array2 = Static118.method1907(Static196.anInt4275, arg0);
			for (@Pc(94) int local94 = 0; local94 < Static177.aClass46_Sub1Array2.length; local94++) {
				Static177.aClass46_Sub1Array2[local94].method2476();
			}
		}
		@Pc(111) Class1_Sub3_Sub13_Sub2 local111 = Static190.method3080(arg0, Static208.anInt4499, 0);
		local111.method4221();
		if (Static294.aBoolean367) {
			Static122.aClass1_Sub3_Sub13_7 = new Class1_Sub3_Sub13_Sub1(local111);
		} else {
			Static122.aClass1_Sub3_Sub13_7 = local111;
		}
		@Pc(130) Class1_Sub3_Sub13_Sub2[] local130 = Static292.method4467(arg0, Static279.anInt5611);
		@Pc(132) int local132;
		for (local132 = 0; local132 < local130.length; local132++) {
			local130[local132].method4221();
		}
		if (Static294.aBoolean367) {
			Static23.aClass1_Sub3_Sub13Array2 = new Class1_Sub3_Sub13[local130.length];
			for (local132 = 0; local132 < local130.length; local132++) {
				Static23.aClass1_Sub3_Sub13Array2[local132] = new Class1_Sub3_Sub13_Sub1(local130[local132]);
			}
		} else {
			Static23.aClass1_Sub3_Sub13Array2 = local130;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	public static void method751() {
		Static226.aClass89_36.method2273(5);
		Static95.aClass89_12.method2273(5);
		Static22.aClass89_4.method2273(5);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method752() {
		for (@Pc(1) int local1 = 0; local1 < 104; local1++) {
			@Pc(8) int[] local8 = Static246.anIntArrayArray64[local1];
			for (@Pc(10) int local10 = 0; local10 < 104; local10++) {
				local8[local10] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method754() {
		for (@Pc(1) int local1 = -1; local1 < Static16.anInt461 + Static147.anInt3287; local1++) {
			@Pc(10) Class2_Sub4 local10;
			if (local1 < 0) {
				local10 = Static56.aClass2_Sub4_Sub2_1;
			} else if (local1 < Static16.anInt461) {
				local10 = Static155.aClass2_Sub4_Sub2Array1[Static304.anIntArray533[local1]];
			} else {
				local10 = Static105.aClass2_Sub4_Sub1Array1[Static100.anIntArray224[local1 - Static16.anInt461]];
			}
			if (local10.anInt2793 >= 0) {
				@Pc(37) int local37 = local10.method2088();
				if ((local37 & 0x1) == 0) {
					if ((local10.anInt2846 & 0x7F) != 0 || (local10.anInt2794 & 0x7F) != 0) {
						continue;
					}
				} else if ((local10.anInt2846 & 0x7F) != 64 || (local10.anInt2794 & 0x7F) != 64) {
					continue;
				}
				local10.aBoolean180 = true;
				@Pc(127) int local127;
				@Pc(76) int local76;
				@Pc(81) int local81;
				if (local37 == 1) {
					local76 = local10.anInt2846 >> 7;
					local81 = local10.anInt2794 >> 7;
					if (local76 >= 0 && local76 < 104 && local81 >= 0 && local81 < 104 && local10.anInt2793 >= Static246.anIntArrayArray64[local76][local81]) {
						if (local10.anInt2793 > Static246.anIntArrayArray64[local76][local81]) {
							Static246.anIntArrayArray64[local76][local81] = local10.anInt2793;
							Static118.anIntArrayArray32[local76][local81] = 1;
						} else {
							local127 = Static118.anIntArrayArray32[local76][local81]++;
						}
					}
				} else {
					local76 = local10.anInt2846 - local37 * 64 >> 7;
					local81 = local10.anInt2794 - local37 * 64 >> 7;
					@Pc(155) int local155 = local76 + local10.method2088();
					@Pc(161) int local161 = local81 + local10.method2088();
					if (local76 < 0) {
						local76 = 0;
					}
					if (local155 > 104) {
						local155 = 104;
					}
					if (local81 < 0) {
						local81 = 0;
					}
					if (local161 > 104) {
						local161 = 104;
					}
					for (@Pc(181) int local181 = local76; local181 < local155; local181++) {
						for (@Pc(186) int local186 = local81; local186 < local161; local186++) {
							if (local10.anInt2793 > Static246.anIntArrayArray64[local181][local186]) {
								Static246.anIntArrayArray64[local181][local186] = local10.anInt2793;
								Static118.anIntArrayArray32[local181][local186] = 1;
							} else if (local10.anInt2793 == Static246.anIntArrayArray64[local181][local186]) {
								local127 = Static118.anIntArrayArray32[local181][local186]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!th;IILclient!th;)Lclient!pd;")
	public static Class1_Sub3_Sub5_Sub1 method755(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class168 arg2) {
		return Static131.method2257(0, arg2, arg1) ? Static62.method1112(arg0.method4058(0, arg1)) : null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!hd;JLclient!hd;Lclient!hd;)V")
	public static void method757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class2 arg6, @OriginalArg(7) Class2 arg7) {
		@Pc(3) Class10 local3 = new Class10();
		local3.aClass2_2 = arg4;
		local3.anInt305 = arg1 * 128 + 64;
		local3.anInt303 = arg2 * 128 + 64;
		local3.anInt301 = arg3;
		local3.aLong9 = arg5;
		local3.aClass2_3 = arg6;
		local3.aClass2_4 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub2 local42 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt45; local46++) {
				@Pc(55) Class7 local55 = local42.aClass7Array1[local46];
				if ((local55.aLong7 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass2_1.method3948();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt302 = -local34;
		if (Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub2(arg0, arg1, arg2);
		}
		Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass10_1 = local3;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method758() {
		label139: for (@Pc(1) int local1 = -1; local1 < Static16.anInt461 + Static147.anInt3287; local1++) {
			@Pc(10) Class2_Sub4 local10;
			@Pc(12) long local12;
			@Pc(20) int local20;
			if (local1 < 0) {
				local10 = Static56.aClass2_Sub4_Sub2_1;
				local12 = 8791798054912L;
			} else if (local1 < Static16.anInt461) {
				local20 = Static304.anIntArray533[local1];
				local10 = Static155.aClass2_Sub4_Sub2Array1[local20];
				local12 = (long) local20 << 32;
			} else {
				local20 = Static100.anIntArray224[local1 - Static16.anInt461];
				@Pc(40) Class2_Sub4_Sub1 local40 = Static105.aClass2_Sub4_Sub1Array1[local20];
				local10 = local40;
				local12 = (long) local20 << 32 | 0x20000000L;
				if (!local40.aClass145_1.aBoolean300) {
					local12 |= Long.MIN_VALUE;
				}
			}
			if (local10.anInt2793 >= 0) {
				local20 = local10.method2088();
				if ((local20 & 0x1) == 0) {
					if ((local10.anInt2846 & 0x7F) != 0 || (local10.anInt2794 & 0x7F) != 0) {
						continue;
					}
				} else if ((local10.anInt2846 & 0x7F) != 64 || (local10.anInt2794 & 0x7F) != 64) {
					continue;
				}
				@Pc(106) int local106;
				@Pc(101) int local101;
				@Pc(139) int local139;
				if (local20 == 1) {
					local101 = local10.anInt2846 >> 7;
					local106 = local10.anInt2794 >> 7;
					if (local101 < 0 || local101 >= 104 || local106 < 0 || local106 >= 104 || local10.anInt2793 != Static246.anIntArrayArray64[local101][local106]) {
						continue;
					}
					if (Static118.anIntArrayArray32[local101][local106] > 1) {
						local139 = Static118.anIntArrayArray32[local101][local106]--;
						continue;
					}
				} else {
					local101 = local10.anInt2846 - local20 * 64 >> 7;
					local106 = local10.anInt2794 - local20 * 64 >> 7;
					@Pc(166) int local166 = local101 + local20;
					@Pc(170) int local170 = local106 + local20;
					if (local101 < 0) {
						local101 = 0;
					}
					if (local166 > 104) {
						local166 = 104;
					}
					if (local106 < 0) {
						local106 = 0;
					}
					if (local170 > 104) {
						local170 = 104;
					}
					@Pc(190) boolean local190 = true;
					@Pc(192) int local192;
					@Pc(197) int local197;
					label132: for (local192 = local101; local192 < local166; local192++) {
						for (local197 = local106; local197 < local170; local197++) {
							if (local10.anInt2793 == Static246.anIntArrayArray64[local192][local197] && Static118.anIntArrayArray32[local192][local197] <= 1) {
								local190 = false;
								break label132;
							}
						}
					}
					if (local190) {
						local192 = local101;
						while (true) {
							if (local192 >= local166) {
								continue label139;
							}
							for (local197 = local106; local197 < local170; local197++) {
								if (local10.anInt2793 == Static246.anIntArrayArray64[local192][local197]) {
									local139 = Static118.anIntArrayArray32[local192][local197]--;
								}
							}
							local192++;
						}
					}
				}
				if (local10 instanceof Class2_Sub4_Sub2 && local10.anObject5 != null && Static133.anInt3061 >= local10.anInt2773 && Static133.anInt3061 < local10.anInt2805) {
					((Class2_Sub4_Sub2) local10).aBoolean182 = false;
					local10.aBoolean180 = false;
					local10.aBoolean175 = false;
					local10.anInt2788 = Static93.method1576(local10.anInt2794, local10.anInt2846, Static185.anInt4085);
					Static9.method296(Static185.anInt4085, local10.anInt2846, local10.anInt2794, local10.anInt2788, local10, local10.anInt2766, local12, local10.anInt2843, local10.anInt2772, local10.anInt2789, local10.anInt2796);
				} else {
					local10.aBoolean180 = false;
					local10.aBoolean175 = false;
					local10.anInt2788 = Static93.method1576(local10.anInt2794, local10.anInt2846, Static185.anInt4085);
					Static114.method1842(Static185.anInt4085, local10.anInt2846, local10.anInt2794, local10.anInt2788, (local20 - 1) * 64 + 60, local10, local10.anInt2766, local12, local10.aBoolean178);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!wf;)Z")
	public static boolean method759(@OriginalArg(0) Class191 arg0) {
		if (Static303.aBoolean389) {
			if (method737(arg0).anInt5933 != 0) {
				return false;
			}
			if (arg0.anInt6086 == 0) {
				return false;
			}
		}
		return arg0.aBoolean399;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method760() {
		for (@Pc(1) int local1 = -1; local1 < Static16.anInt461 + Static147.anInt3287; local1++) {
			@Pc(10) Class2_Sub4 local10;
			@Pc(12) long local12;
			@Pc(20) int local20;
			if (local1 < 0) {
				local10 = Static56.aClass2_Sub4_Sub2_1;
				local12 = 8791798054912L;
			} else if (local1 < Static16.anInt461) {
				local20 = Static304.anIntArray533[local1];
				local10 = Static155.aClass2_Sub4_Sub2Array1[local20];
				local12 = (long) local20 << 32;
			} else {
				local20 = Static100.anIntArray224[local1 - Static16.anInt461];
				@Pc(40) Class2_Sub4_Sub1 local40 = Static105.aClass2_Sub4_Sub1Array1[local20];
				local10 = local40;
				local12 = (long) local20 << 32 | 0x20000000L;
				if (!local40.aClass145_1.aBoolean300) {
					local12 |= Long.MIN_VALUE;
				}
			}
			if (local10.anInt2793 >= 0) {
				local20 = local10.method2088();
				if ((local20 & 0x1) == 0) {
					if ((local10.anInt2846 & 0x7F) == 0 && (local10.anInt2794 & 0x7F) == 0) {
						continue;
					}
				} else if ((local10.anInt2846 & 0x7F) == 64 && (local10.anInt2794 & 0x7F) == 64) {
					continue;
				}
				if (local10 instanceof Class2_Sub4_Sub2 && local10.anObject5 != null && Static133.anInt3061 >= local10.anInt2773 && Static133.anInt3061 < local10.anInt2805) {
					((Class2_Sub4_Sub2) local10).aBoolean182 = false;
					local10.aBoolean180 = false;
					local10.aBoolean175 = false;
					local10.anInt2788 = Static93.method1576(local10.anInt2794, local10.anInt2846, Static185.anInt4085);
					Static9.method296(Static185.anInt4085, local10.anInt2846, local10.anInt2794, local10.anInt2788, local10, local10.anInt2766, local12, local10.anInt2843, local10.anInt2772, local10.anInt2789, local10.anInt2796);
				} else {
					local10.aBoolean180 = false;
					local10.aBoolean175 = false;
					local10.anInt2788 = Static93.method1576(local10.anInt2794, local10.anInt2846, Static185.anInt4085);
					Static114.method1842(Static185.anInt4085, local10.anInt2846, local10.anInt2794, local10.anInt2788, (local20 - 1) * 64 + 60, local10, local10.anInt2766, local12, local10.aBoolean178);
				}
			}
		}
	}
}
