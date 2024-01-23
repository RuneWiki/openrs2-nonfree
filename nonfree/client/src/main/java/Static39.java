import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	public static int anInt1086;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!hc;")
	public static Class51 aClass51_14;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	public static int anInt1098;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	public static volatile int anInt1090 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!se;)Lclient!t;")
	public static Class1_Sub27 method702(@OriginalArg(0) Class122 arg0) {
		@Pc(13) Class1_Sub27 local13 = (Class1_Sub27) Static54.aClass140_3.method4014(((long) arg0.anInt4686 << 32) + (long) arg0.anInt4662);
		return local13 == null ? arg0.aClass1_Sub27_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!se;IIIIIII)V")
	public static void method706(@OriginalArg(0) Class122[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class122 local6 = arg0[local1];
			if (local6 != null && local6.anInt4703 == arg1 && (!local6.aBoolean228 || local6.anInt4656 == 0 || local6.aBoolean240 || method702(local6).anInt4836 != 0 || local6 == Static37.aClass122_2 || local6.anInt4672 == 1338) && (!local6.aBoolean228 || !method707(local6))) {
				@Pc(43) int local43 = local6.anInt4711 + arg6;
				@Pc(48) int local48 = local6.anInt4691 + arg7;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(58) int local58;
				@Pc(60) int local60;
				if (local6.anInt4656 == 2) {
					local54 = arg2;
					local56 = arg3;
					local58 = arg4;
					local60 = arg5;
				} else {
					@Pc(66) int local66 = local43 + local6.anInt4695;
					@Pc(71) int local71 = local48 + local6.anInt4726;
					if (local6.anInt4656 == 9) {
						local66++;
						local71++;
					}
					local54 = local43 > arg2 ? local43 : arg2;
					local56 = local48 > arg3 ? local48 : arg3;
					local58 = local66 < arg4 ? local66 : arg4;
					local60 = local71 < arg5 ? local71 : arg5;
				}
				if (local6 == Static63.aClass122_7) {
					Static51.aBoolean85 = true;
					Static15.anInt535 = local43;
					Static2.anInt32 = local48;
				}
				if (!local6.aBoolean228 || local54 < local58 && local56 < local60) {
					if (local6.anInt4656 == 0) {
						if (!local6.aBoolean228 && method707(local6) && Static155.aClass122_11 != local6) {
							continue;
						}
						if (local6.aBoolean243 && Static71.anInt1930 >= local54 && Static240.anInt5167 >= local56 && Static71.anInt1930 < local58 && Static240.anInt5167 < local60) {
							for (@Pc(156) Class1_Sub30 local156 = (Class1_Sub30) Static29.aClass3_4.method30(); local156 != null; local156 = (Class1_Sub30) Static29.aClass3_4.method33()) {
								if (local156.aBoolean278) {
									local156.method4186();
									local156.aClass122_18.aBoolean230 = false;
								}
							}
							if (Static21.anInt739 == 0) {
								Static63.aClass122_7 = null;
								Static37.aClass122_2 = null;
							}
							Static48.anInt1409 = 0;
						}
					}
					if (local6.aBoolean228) {
						@Pc(199) boolean local199;
						if (Static71.anInt1930 >= local54 && Static240.anInt5167 >= local56 && Static71.anInt1930 < local58 && Static240.anInt5167 < local60) {
							local199 = true;
						} else {
							local199 = false;
						}
						@Pc(204) boolean local204 = false;
						if (Static248.anInt5322 == 1 && local199) {
							local204 = true;
						}
						@Pc(213) boolean local213 = false;
						if (Static143.anInt3469 == 1 && Static256.anInt5442 >= local54 && Static133.anInt3300 >= local56 && Static256.anInt5442 < local58 && Static133.anInt3300 < local60) {
							local213 = true;
						}
						@Pc(235) int local235;
						@Pc(324) int local324;
						if (local6.aByteArray52 != null) {
							for (local235 = 0; local235 < local6.aByteArray52.length; local235++) {
								if (Static124.aBooleanArray7[local6.aByteArray52[local235]]) {
									if (local6.anIntArray371 == null || Static156.anInt3722 >= local6.anIntArray371[local235]) {
										@Pc(266) byte local266 = local6.aByteArray51[local235];
										if (local266 == 0 || ((local266 & 0x8) == 0 || !Static124.aBooleanArray7[86] && !Static124.aBooleanArray7[82] && !Static124.aBooleanArray7[81]) && ((local266 & 0x2) == 0 || Static124.aBooleanArray7[86]) && ((local266 & 0x1) == 0 || Static124.aBooleanArray7[82]) && ((local266 & 0x4) == 0 || Static124.aBooleanArray7[81])) {
											Static60.method1146(local235 + 1, local6.anInt4686, -1, "");
											local324 = local6.anIntArray368[local235];
											if (local6.anIntArray371 == null) {
												local6.anIntArray371 = new int[local6.aByteArray52.length];
											}
											if (local324 == 0) {
												local6.anIntArray371[local235] = Integer.MAX_VALUE;
											} else {
												local6.anIntArray371[local235] = Static156.anInt3722 + local324;
											}
										}
									}
								} else if (local6.anIntArray371 != null) {
									local6.anIntArray371[local235] = 0;
								}
							}
						}
						if (local213) {
							Static82.method1655(Static133.anInt3300 - local48, Static256.anInt5442 - local43, local6);
						}
						if (Static63.aClass122_7 != null && Static63.aClass122_7 != local6 && local199 && method702(local6).method3661()) {
							Static150.aClass122_13 = local6;
						}
						if (local6 == Static37.aClass122_2) {
							Static66.aBoolean102 = true;
							Static143.anInt3477 = local43;
							Static138.anInt3358 = local48;
						}
						if (local6.aBoolean240 || local6.anInt4672 != 0) {
							@Pc(405) Class1_Sub30 local405;
							if (local199 && Static175.anInt4030 != 0 && local6.anObjectArray15 != null) {
								local405 = new Class1_Sub30();
								local405.aBoolean278 = true;
								local405.aClass122_18 = local6;
								local405.anInt5445 = Static175.anInt4030;
								local405.anObjectArray32 = local6.anObjectArray15;
								Static29.aClass3_4.method28(local405);
							}
							if (Static63.aClass122_7 != null || Static156.aClass122_12 != null || Static259.aBoolean280 || local6.anInt4672 != 1400 && Static48.anInt1409 > 0) {
								local213 = false;
								local204 = false;
								local199 = false;
							}
							@Pc(511) int local511;
							if (local6.anInt4672 != 0) {
								if (local6.anInt4672 == 1337) {
									Static205.aClass122_15 = local6;
									continue;
								}
								if (local6.anInt4672 == 1338) {
									if (local213) {
										Static240.anInt5171 = Static256.anInt5442 - local43;
										Static71.anInt1927 = Static133.anInt3300 - local48;
									}
									continue;
								}
								if (local6.anInt4672 == 1400) {
									Static68.aClass122_5 = local6;
									if (local213) {
										if (Static124.aBooleanArray7[82] && Static203.anInt4493 > 0) {
											local235 = (int) ((double) (Static256.anInt5442 - local43 - local6.anInt4695 / 2) * 2.0D / (double) Static57.aFloat12);
											local511 = (int) ((double) (Static133.anInt3300 - local48 - local6.anInt4726 / 2) * 2.0D / (double) Static57.aFloat12);
											local324 = anInt1086 + local235;
											@Pc(519) int local519 = Static239.anInt5151 + local511;
											@Pc(523) int local523 = local324 + Static209.anInt4574;
											@Pc(531) int local531 = Static174.anInt3997 + Static46.anInt1376 - local519 - 1;
											@Pc(534) Class1_Sub2_Sub11 local534 = Static21.method414();
											@Pc(540) int[] local540 = local534.method2856(local531, local523);
											if (local540 != null) {
												Static202.method3369(local540[2], local540[1], local540[0]);
												Static138.method2532();
											}
											continue;
										}
										Static48.anInt1409 = 1;
										Static198.anInt4594 = Static71.anInt1930;
										Static181.anInt4153 = Static240.anInt5167;
										continue;
									}
									if (local204 && Static48.anInt1409 > 0) {
										if (Static48.anInt1409 == 1 && (Static198.anInt4594 != Static71.anInt1930 || Static181.anInt4153 != Static240.anInt5167)) {
											Static77.anInt2100 = anInt1086;
											Static126.anInt3176 = Static239.anInt5151;
											Static48.anInt1409 = 2;
										}
										if (Static48.anInt1409 == 2) {
											Static246.method4018(Static77.anInt2100 + (int) ((double) (Static198.anInt4594 - Static71.anInt1930) * 2.0D / (double) Static17.aFloat3));
											Static1.method22(Static126.anInt3176 + (int) ((double) (Static181.anInt4153 - Static240.anInt5167) * 2.0D / (double) Static17.aFloat3));
										}
										continue;
									}
									Static48.anInt1409 = 0;
									continue;
								}
								if (local6.anInt4672 == 1401) {
									if (local204) {
										Static123.method891(local6.anInt4695, Static71.anInt1930 - local43, Static240.anInt5167 - local48, local6.anInt4726);
									}
									continue;
								}
								if (local6.anInt4672 == 1402) {
									Static257.method4146(local6);
									continue;
								}
							}
							if (!local6.aBoolean233 && local213) {
								local6.aBoolean233 = true;
								if (local6.anObjectArray30 != null) {
									local405 = new Class1_Sub30();
									local405.aBoolean278 = true;
									local405.aClass122_18 = local6;
									local405.anInt5439 = Static256.anInt5442 - local43;
									local405.anInt5445 = Static133.anInt3300 - local48;
									local405.anObjectArray32 = local6.anObjectArray30;
									Static29.aClass3_4.method28(local405);
								}
							}
							if (local6.aBoolean233 && local204 && local6.anObjectArray19 != null) {
								local405 = new Class1_Sub30();
								local405.aBoolean278 = true;
								local405.aClass122_18 = local6;
								local405.anInt5439 = Static71.anInt1930 - local43;
								local405.anInt5445 = Static240.anInt5167 - local48;
								local405.anObjectArray32 = local6.anObjectArray19;
								Static29.aClass3_4.method28(local405);
							}
							if (local6.aBoolean233 && !local204) {
								local6.aBoolean233 = false;
								if (local6.anObjectArray4 != null) {
									local405 = new Class1_Sub30();
									local405.aBoolean278 = true;
									local405.aClass122_18 = local6;
									local405.anInt5439 = Static71.anInt1930 - local43;
									local405.anInt5445 = Static240.anInt5167 - local48;
									local405.anObjectArray32 = local6.anObjectArray4;
									Static251.aClass3_24.method28(local405);
								}
							}
							if (local204 && local6.anObjectArray2 != null) {
								local405 = new Class1_Sub30();
								local405.aBoolean278 = true;
								local405.aClass122_18 = local6;
								local405.anInt5439 = Static71.anInt1930 - local43;
								local405.anInt5445 = Static240.anInt5167 - local48;
								local405.anObjectArray32 = local6.anObjectArray2;
								Static29.aClass3_4.method28(local405);
							}
							if (!local6.aBoolean230 && local199) {
								local6.aBoolean230 = true;
								if (local6.anObjectArray6 != null) {
									local405 = new Class1_Sub30();
									local405.aBoolean278 = true;
									local405.aClass122_18 = local6;
									local405.anInt5439 = Static71.anInt1930 - local43;
									local405.anInt5445 = Static240.anInt5167 - local48;
									local405.anObjectArray32 = local6.anObjectArray6;
									Static29.aClass3_4.method28(local405);
								}
							}
							if (local6.aBoolean230 && local199 && local6.anObjectArray11 != null) {
								local405 = new Class1_Sub30();
								local405.aBoolean278 = true;
								local405.aClass122_18 = local6;
								local405.anInt5439 = Static71.anInt1930 - local43;
								local405.anInt5445 = Static240.anInt5167 - local48;
								local405.anObjectArray32 = local6.anObjectArray11;
								Static29.aClass3_4.method28(local405);
							}
							if (local6.aBoolean230 && !local199) {
								local6.aBoolean230 = false;
								if (local6.anObjectArray14 != null) {
									local405 = new Class1_Sub30();
									local405.aBoolean278 = true;
									local405.aClass122_18 = local6;
									local405.anInt5439 = Static71.anInt1930 - local43;
									local405.anInt5445 = Static240.anInt5167 - local48;
									local405.anObjectArray32 = local6.anObjectArray14;
									Static251.aClass3_24.method28(local405);
								}
							}
							if (local6.anObjectArray3 != null) {
								local405 = new Class1_Sub30();
								local405.aClass122_18 = local6;
								local405.anObjectArray32 = local6.anObjectArray3;
								Static168.aClass3_16.method28(local405);
							}
							@Pc(978) Class1_Sub30 local978;
							if (local6.anObjectArray10 != null && Static54.anInt1510 > local6.anInt4659) {
								if (local6.anIntArray373 == null || Static54.anInt1510 - local6.anInt4659 > 32) {
									local405 = new Class1_Sub30();
									local405.aClass122_18 = local6;
									local405.anObjectArray32 = local6.anObjectArray10;
									Static29.aClass3_4.method28(local405);
								} else {
									label560: for (local235 = local6.anInt4659; local235 < Static54.anInt1510; local235++) {
										local511 = Static74.anIntArray153[local235 & 0x1F];
										for (local324 = 0; local324 < local6.anIntArray373.length; local324++) {
											if (local6.anIntArray373[local324] == local511) {
												local978 = new Class1_Sub30();
												local978.aClass122_18 = local6;
												local978.anObjectArray32 = local6.anObjectArray10;
												Static29.aClass3_4.method28(local978);
												break label560;
											}
										}
									}
								}
								local6.anInt4659 = Static54.anInt1510;
							}
							if (local6.anObjectArray16 != null && Static30.anInt926 > local6.anInt4704) {
								if (local6.anIntArray363 == null || Static30.anInt926 - local6.anInt4704 > 32) {
									local405 = new Class1_Sub30();
									local405.aClass122_18 = local6;
									local405.anObjectArray32 = local6.anObjectArray16;
									Static29.aClass3_4.method28(local405);
								} else {
									label536: for (local235 = local6.anInt4704; local235 < Static30.anInt926; local235++) {
										local511 = Static30.anIntArray77[local235 & 0x1F];
										for (local324 = 0; local324 < local6.anIntArray363.length; local324++) {
											if (local6.anIntArray363[local324] == local511) {
												local978 = new Class1_Sub30();
												local978.aClass122_18 = local6;
												local978.anObjectArray32 = local6.anObjectArray16;
												Static29.aClass3_4.method28(local978);
												break label536;
											}
										}
									}
								}
								local6.anInt4704 = Static30.anInt926;
							}
							if (local6.anObjectArray28 != null && Static17.anInt621 > local6.anInt4685) {
								if (local6.anIntArray370 == null || Static17.anInt621 - local6.anInt4685 > 32) {
									local405 = new Class1_Sub30();
									local405.aClass122_18 = local6;
									local405.anObjectArray32 = local6.anObjectArray28;
									Static29.aClass3_4.method28(local405);
								} else {
									label512: for (local235 = local6.anInt4685; local235 < Static17.anInt621; local235++) {
										local511 = Static214.anIntArray367[local235 & 0x1F];
										for (local324 = 0; local324 < local6.anIntArray370.length; local324++) {
											if (local6.anIntArray370[local324] == local511) {
												local978 = new Class1_Sub30();
												local978.aClass122_18 = local6;
												local978.anObjectArray32 = local6.anObjectArray28;
												Static29.aClass3_4.method28(local978);
												break label512;
											}
										}
									}
								}
								local6.anInt4685 = Static17.anInt621;
							}
							if (local6.anObjectArray7 != null && Static252.anInt5358 > local6.anInt4721) {
								if (local6.anIntArray369 == null || Static252.anInt5358 - local6.anInt4721 > 32) {
									local405 = new Class1_Sub30();
									local405.aClass122_18 = local6;
									local405.anObjectArray32 = local6.anObjectArray7;
									Static29.aClass3_4.method28(local405);
								} else {
									label488: for (local235 = local6.anInt4721; local235 < Static252.anInt5358; local235++) {
										local511 = Static232.anIntArray437[local235 & 0x1F];
										for (local324 = 0; local324 < local6.anIntArray369.length; local324++) {
											if (local6.anIntArray369[local324] == local511) {
												local978 = new Class1_Sub30();
												local978.aClass122_18 = local6;
												local978.anObjectArray32 = local6.anObjectArray7;
												Static29.aClass3_4.method28(local978);
												break label488;
											}
										}
									}
								}
								local6.anInt4721 = Static252.anInt5358;
							}
							if (local6.anObjectArray5 != null && Static21.anInt732 > local6.anInt4699) {
								if (local6.anIntArray364 == null || Static21.anInt732 - local6.anInt4699 > 32) {
									local405 = new Class1_Sub30();
									local405.aClass122_18 = local6;
									local405.anObjectArray32 = local6.anObjectArray5;
									Static29.aClass3_4.method28(local405);
								} else {
									label464: for (local235 = local6.anInt4699; local235 < Static21.anInt732; local235++) {
										local511 = Static213.anIntArray356[local235 & 0x1F];
										for (local324 = 0; local324 < local6.anIntArray364.length; local324++) {
											if (local6.anIntArray364[local324] == local511) {
												local978 = new Class1_Sub30();
												local978.aClass122_18 = local6;
												local978.anObjectArray32 = local6.anObjectArray5;
												Static29.aClass3_4.method28(local978);
												break label464;
											}
										}
									}
								}
								local6.anInt4699 = Static21.anInt732;
							}
							if (Static249.anInt5327 > local6.anInt4658 && local6.anObjectArray8 != null) {
								local405 = new Class1_Sub30();
								local405.aClass122_18 = local6;
								local405.anObjectArray32 = local6.anObjectArray8;
								Static29.aClass3_4.method28(local405);
							}
							if (Static52.anInt1461 > local6.anInt4658 && local6.anObjectArray27 != null) {
								local405 = new Class1_Sub30();
								local405.aClass122_18 = local6;
								local405.anObjectArray32 = local6.anObjectArray27;
								Static29.aClass3_4.method28(local405);
							}
							if (Static147.anInt3560 > local6.anInt4658 && local6.anObjectArray31 != null) {
								local405 = new Class1_Sub30();
								local405.aClass122_18 = local6;
								local405.anObjectArray32 = local6.anObjectArray31;
								Static29.aClass3_4.method28(local405);
							}
							if (Static48.anInt1414 > local6.anInt4658 && local6.anObjectArray25 != null) {
								local405 = new Class1_Sub30();
								local405.aClass122_18 = local6;
								local405.anObjectArray32 = local6.anObjectArray25;
								Static29.aClass3_4.method28(local405);
							}
							if (Static22.anInt2835 > local6.anInt4658 && local6.anObjectArray26 != null) {
								local405 = new Class1_Sub30();
								local405.aClass122_18 = local6;
								local405.anObjectArray32 = local6.anObjectArray26;
								Static29.aClass3_4.method28(local405);
							}
							local6.anInt4658 = Static243.anInt5249;
							if (local6.anObjectArray17 != null) {
								for (local235 = 0; local235 < Static128.anInt3218; local235++) {
									@Pc(1446) Class1_Sub30 local1446 = new Class1_Sub30();
									local1446.aClass122_18 = local6;
									local1446.anInt5441 = Static107.anIntArray211[local235];
									local1446.anInt5448 = Static90.anIntArray182[local235];
									local1446.anObjectArray32 = local6.anObjectArray17;
									Static29.aClass3_4.method28(local1446);
								}
							}
							if (Static137.aBoolean177 && local6.anObjectArray21 != null) {
								local405 = new Class1_Sub30();
								local405.aClass122_18 = local6;
								local405.anObjectArray32 = local6.anObjectArray21;
								Static29.aClass3_4.method28(local405);
							}
						}
					}
					if (!local6.aBoolean228 && Static63.aClass122_7 == null && Static156.aClass122_12 == null && !Static259.aBoolean280) {
						if ((local6.anInt4730 >= 0 || local6.anInt4712 != 0) && Static71.anInt1930 >= local54 && Static240.anInt5167 >= local56 && Static71.anInt1930 < local58 && Static240.anInt5167 < local60) {
							if (local6.anInt4730 >= 0) {
								Static155.aClass122_11 = arg0[local6.anInt4730];
							} else {
								Static155.aClass122_11 = local6;
							}
						}
						if (local6.anInt4656 == 8 && Static71.anInt1930 >= local54 && Static240.anInt5167 >= local56 && Static71.anInt1930 < local58 && Static240.anInt5167 < local60) {
							Static20.aClass122_1 = local6;
						}
						if (local6.anInt4715 > local6.anInt4726) {
							Static117.method2317(local6.anInt4715, Static71.anInt1930, local6, local48, local6.anInt4726, Static240.anInt5167, local43 + local6.anInt4695);
						}
					}
					if (local6.anInt4656 == 0) {
						method706(arg0, local6.anInt4686, local54, local56, local58, local60, local43 - local6.anInt4673, local48 - local6.anInt4653);
						if (local6.aClass122Array2 != null) {
							method706(local6.aClass122Array2, local6.anInt4686, local54, local56, local58, local60, local43 - local6.anInt4673, local48 - local6.anInt4653);
						}
						@Pc(1613) Class1_Sub5 local1613 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local6.anInt4686);
						if (local1613 != null) {
							Static79.method1582(local48, local56, local58, local54, local60, local43, local1613.anInt1358);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!se;)Z")
	public static boolean method707(@OriginalArg(0) Class122 arg0) {
		if (Static70.aBoolean113) {
			if (method702(arg0).anInt4836 != 0) {
				return false;
			}
			if (arg0.anInt4656 == 0) {
				return false;
			}
		}
		return arg0.aBoolean238;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	public static void method711(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub2_Sub18 local13 = Static13.method232(arg0, 6);
		local13.method3805();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!se;)Lclient!se;")
	public static Class122 method712(@OriginalArg(0) Class122 arg0) {
		@Pc(4) int local4 = method702(arg0).method3651();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static206.method3444(arg0.anInt4703);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
