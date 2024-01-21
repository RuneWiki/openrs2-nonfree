import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!ff", name = "kb", descriptor = "Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "Lclient!lc;")
	public static Class54 aClass54_5 = new Class54(512);

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!bc;)V")
	public static void method758(@OriginalArg(1) Class1 arg0) {
		Static137.aClass1_23 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
	public static void method759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static138.anInt2981 == 1) {
			Static22.aClass3_Sub1_Sub4_Sub4Array5[Static143.anInt3080 / 100].method2595(Static17.anInt442 - 8, Static29.anInt730 + -8);
		}
		if (Static138.anInt2981 == 2) {
			Static22.aClass3_Sub1_Sub4_Sub4Array5[Static143.anInt3080 / 100 + 4].method2595(Static17.anInt442 - 8, Static29.anInt730 + -8);
		}
		Static27.method3152();
		if (!aBoolean49) {
			return;
		}
		@Pc(49) int local49 = arg0 + 20;
		@Pc(55) int local55 = arg2 + 512 - 5;
		Static134.aClass3_Sub1_Sub4_Sub3_Sub1_7.method2249(Static154.method2467(new Class80[] { Static83.aClass80_683, Static83.method1219(Static125.anInt2696) }), local55, local49, 16776960, -1);
		@Pc(77) int local77 = 16776960;
		@Pc(79) Runtime local79 = Runtime.getRuntime();
		@Pc(80) int local80 = local49 + 15;
		@Pc(90) int local90 = (int) ((local79.totalMemory() - local79.freeMemory()) / 1024L);
		if (local90 > 32768 && Static96.aBoolean83) {
			local77 = 16711680;
		}
		if (local90 > 65536 && !Static96.aBoolean83) {
			local77 = 16711680;
		}
		Static134.aClass3_Sub1_Sub4_Sub3_Sub1_7.method2249(Static154.method2467(new Class80[] { Static194.aClass80_1720, Static83.method1219(local90), Static138.aClass80_1156 }), local55, local80, local77, -1);
		local49 = local80 + 15;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!kf;Z)V")
	public static void method761(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) boolean arg1) {
		Static3.aClass70_1.method1958(arg0);
		while (true) {
			@Pc(8) Class3_Sub15 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class3_Sub15[][] local30;
			@Pc(47) Class3_Sub15 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class51 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class4 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class3_Sub15 var32;
										while (true) {
											do {
												local8 = (Class3_Sub15) Static3.aClass70_1.method1957();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean80);
											local17 = local8.anInt2004;
											local20 = local8.anInt2008;
											local23 = local8.anInt2003;
											local26 = local8.anInt2011;
											local30 = Static185.aClass3_Sub15ArrayArrayArray1[local23];
											if (!local8.aBoolean79) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static185.aClass3_Sub15ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean80) {
														continue;
													}
												}
												if (local17 <= Static58.anInt1291 && local17 > Static132.anInt2835) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean80 && (local47.aBoolean79 || (local8.anInt2000 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static58.anInt1291 && local17 < Static72.anInt4104 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean80 && (local47.aBoolean79 || (local8.anInt2000 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static30.anInt4486 && local20 > Static69.anInt1535) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean80 && (local47.aBoolean79 || (local8.anInt2000 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static30.anInt4486 && local20 < Static141.anInt3037 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean80 && (local47.aBoolean79 || (local8.anInt2000 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean79 = false;
											if (local8.aClass3_Sub15_1 != null) {
												local47 = local8.aClass3_Sub15_1;
												if (local47.aClass26_1 == null) {
													if (local47.aClass62_1 != null && !Static188.method3073(0, local17, local20)) {
														Static25.method404(local47.aClass62_1, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local17, local20);
													}
												} else if (!Static188.method3073(0, local17, local20)) {
													Static157.method2502(local47.aClass26_1, 0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local17, local20);
												}
												@Pc(219) Class51 local219 = local47.aClass51_1;
												if (local219 != null) {
													local219.aClass3_Sub1_Sub5_5.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local219.anInt2031 - Static87.anInt1818, local219.anInt2032 - Static95.anInt3659, local219.anInt2029 - Static143.anInt3081, local219.aLong69);
												}
												for (local245 = 0; local245 < local47.anInt2014; local245++) {
													var11 = local47.aClass4Array3[local245];
													if (var11 != null) {
														var11.aClass3_Sub1_Sub5_1.method3054(var11.anInt175, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, var11.anInt177 - Static87.anInt1818, var11.anInt189 - Static95.anInt3659, var11.anInt184 - Static143.anInt3081, var11.aLong4);
													}
												}
											}
											var21 = false;
											if (local8.aClass26_1 == null) {
												if (local8.aClass62_1 != null && !Static188.method3073(local26, local17, local20)) {
													var21 = true;
													Static25.method404(local8.aClass62_1, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local17, local20);
												}
											} else if (!Static188.method3073(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass26_1.anInt1070 != 12345678 || Static86.aBoolean69 && local23 <= Static20.anInt501) {
													Static157.method2502(local8.aClass26_1, local26, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class51 local340 = local8.aClass51_1;
											@Pc(343) Class92 local343 = local8.aClass92_1;
											if (local340 != null || local343 != null) {
												if (Static58.anInt1291 == local17) {
													var20++;
												} else if (Static58.anInt1291 < local17) {
													var20 += 2;
												}
												if (Static30.anInt4486 == local20) {
													var20 += 3;
												} else if (Static30.anInt4486 > local20) {
													var20 += 6;
												}
												local245 = Static93.anIntArray274[var20];
												local8.anInt2002 = Static96.anIntArray282[var20];
											}
											if (local340 != null) {
												if ((local340.anInt2028 & Static151.anIntArray430[var20]) == 0) {
													local8.anInt2005 = 0;
												} else if (local340.anInt2028 == 16) {
													local8.anInt2005 = 3;
													local8.anInt2010 = Static141.anIntArray391[var20];
													local8.anInt2001 = 3 - local8.anInt2010;
												} else if (local340.anInt2028 == 32) {
													local8.anInt2005 = 6;
													local8.anInt2010 = Static6.anIntArray30[var20];
													local8.anInt2001 = 6 - local8.anInt2010;
												} else if (local340.anInt2028 == 64) {
													local8.anInt2005 = 12;
													local8.anInt2010 = Static171.anIntArray464[var20];
													local8.anInt2001 = 12 - local8.anInt2010;
												} else {
													local8.anInt2005 = 9;
													local8.anInt2010 = Static103.anIntArray299[var20];
													local8.anInt2001 = 9 - local8.anInt2010;
												}
												if ((local340.anInt2028 & local245) != 0 && !Static6.method150(local26, local17, local20, local340.anInt2028)) {
													local340.aClass3_Sub1_Sub5_5.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local340.anInt2031 - Static87.anInt1818, local340.anInt2032 - Static95.anInt3659, local340.anInt2029 - Static143.anInt3081, local340.aLong69);
												}
												if ((local340.anInt2030 & local245) != 0 && !Static6.method150(local26, local17, local20, local340.anInt2030)) {
													local340.aClass3_Sub1_Sub5_4.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local340.anInt2031 - Static87.anInt1818, local340.anInt2032 - Static95.anInt3659, local340.anInt2029 - Static143.anInt3081, local340.aLong69);
												}
											}
											if (local343 != null && !Static43.method653(local26, local17, local20, local343.aClass3_Sub1_Sub5_10.aShort34)) {
												if ((local343.anInt4404 & local245) != 0) {
													local343.aClass3_Sub1_Sub5_10.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local343.anInt4396 + local343.anInt4400 - Static87.anInt1818, local343.anInt4399 - Static95.anInt3659, local343.anInt4398 + local343.anInt4394 - Static143.anInt3081, local343.aLong149);
												} else if (local343.anInt4404 == 256) {
													local579 = local343.anInt4396 - Static87.anInt1818;
													local584 = local343.anInt4399 - Static95.anInt3659;
													local589 = local343.anInt4398 - Static143.anInt3081;
													var16 = local343.anInt4402;
													if (var16 == 1 || var16 == 2) {
														var17 = -local579;
													} else {
														var17 = local579;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local589;
													} else {
														var18 = local589;
													}
													if (var18 < var17) {
														local343.aClass3_Sub1_Sub5_10.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local579 + local343.anInt4400, local584, local589 + local343.anInt4394, local343.aLong149);
													} else if (local343.aClass3_Sub1_Sub5_9 != null) {
														local343.aClass3_Sub1_Sub5_9.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local579, local584, local589, local343.aLong149);
													}
												}
											}
											if (var21) {
												@Pc(660) Class13 local660 = local8.aClass13_1;
												if (local660 != null) {
													local660.aClass3_Sub1_Sub5_2.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local660.anInt470 - Static87.anInt1818, local660.anInt466 - Static95.anInt3659, local660.anInt468 - Static143.anInt3081, local660.aLong16);
												}
												@Pc(687) Class71 local687 = local8.aClass71_1;
												if (local687 != null && local687.anInt2838 == 0) {
													if (local687.aClass3_Sub1_Sub5_8 != null) {
														local687.aClass3_Sub1_Sub5_8.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local687.anInt2832 - Static87.anInt1818, local687.anInt2834 - Static95.anInt3659, local687.anInt2836 - Static143.anInt3081, local687.aLong96);
													}
													if (local687.aClass3_Sub1_Sub5_7 != null) {
														local687.aClass3_Sub1_Sub5_7.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local687.anInt2832 - Static87.anInt1818, local687.anInt2834 - Static95.anInt3659, local687.anInt2836 - Static143.anInt3081, local687.aLong96);
													}
													if (local687.aClass3_Sub1_Sub5_6 != null) {
														local687.aClass3_Sub1_Sub5_6.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local687.anInt2832 - Static87.anInt1818, local687.anInt2834 - Static95.anInt3659, local687.anInt2836 - Static143.anInt3081, local687.aLong96);
													}
												}
											}
											local579 = local8.anInt2000;
											if (local579 != 0) {
												if (local17 < Static58.anInt1291 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean80) {
														Static3.aClass70_1.method1958(var32);
													}
												}
												if (local20 < Static30.anInt4486 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean80) {
														Static3.aClass70_1.method1958(var32);
													}
												}
												if (local17 > Static58.anInt1291 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean80) {
														Static3.aClass70_1.method1958(var32);
													}
												}
												if (local20 > Static30.anInt4486 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean80) {
														Static3.aClass70_1.method1958(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt2005 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt2014; var20++) {
												if (local8.aClass4Array3[var20].anInt176 != Static109.anInt2440 && (local8.anIntArray278[var20] & local8.anInt2005) == local8.anInt2010) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass51_1;
												if (!Static6.method150(local26, local17, local20, local906.anInt2028)) {
													local906.aClass3_Sub1_Sub5_5.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local906.anInt2031 - Static87.anInt1818, local906.anInt2032 - Static95.anInt3659, local906.anInt2029 - Static143.anInt3081, local906.aLong69);
												}
												local8.anInt2005 = 0;
											}
										}
										if (!local8.aBoolean81) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt2014;
											local8.aBoolean81 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass4Array3[local245];
												if (var11.anInt176 != Static109.anInt2440) {
													for (local964 = var11.anInt185; local964 <= var11.anInt178; local964++) {
														for (local579 = var11.anInt188; local579 <= var11.anInt172; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean79) {
																local8.aBoolean81 = true;
																continue label558;
															}
															if (var32.anInt2005 != 0) {
																local589 = 0;
																if (local964 > var11.anInt185) {
																	local589++;
																}
																if (local964 < var11.anInt178) {
																	local589 += 4;
																}
																if (local579 > var11.anInt188) {
																	local589 += 8;
																}
																if (local579 < var11.anInt172) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt2005) == local8.anInt2001) {
																	local8.aBoolean81 = true;
																	continue label558;
																}
															}
														}
													}
													Static161.aClass4Array4[var20++] = var11;
													local579 = Static58.anInt1291 - var11.anInt185;
													local584 = var11.anInt178 - Static58.anInt1291;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static30.anInt4486 - var11.anInt188;
													var16 = var11.anInt172 - Static30.anInt4486;
													if (var16 > local589) {
														var11.anInt174 = local579 + var16;
													} else {
														var11.anInt174 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class4 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static161.aClass4Array4[local579];
													if (local1088.anInt176 != Static109.anInt2440) {
														if (local1088.anInt174 > local1079) {
															local1079 = local1088.anInt174;
															local964 = local579;
														} else if (local1088.anInt174 == local1079) {
															local589 = local1088.anInt177 - Static87.anInt1818;
															var16 = local1088.anInt184 - Static143.anInt3081;
															var17 = Static161.aClass4Array4[local964].anInt177 - Static87.anInt1818;
															var18 = Static161.aClass4Array4[local964].anInt184 - Static143.anInt3081;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static161.aClass4Array4[local964];
												local1088.anInt176 = Static109.anInt2440;
												if (!Static33.method518(local26, local1088.anInt185, local1088.anInt178, local1088.anInt188, local1088.anInt172, local1088.aClass3_Sub1_Sub5_1.aShort34)) {
													local1088.aClass3_Sub1_Sub5_1.method3054(local1088.anInt175, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local1088.anInt177 - Static87.anInt1818, local1088.anInt189 - Static95.anInt3659, local1088.anInt184 - Static143.anInt3081, local1088.aLong4);
												}
												for (local589 = local1088.anInt185; local589 <= local1088.anInt178; local589++) {
													for (var16 = local1088.anInt188; var16 <= local1088.anInt172; var16++) {
														@Pc(1212) Class3_Sub15 local1212 = local30[local589][var16];
														if (local1212.anInt2005 != 0) {
															Static3.aClass70_1.method1958(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean80) {
															Static3.aClass70_1.method1958(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean81) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean81 = false;
											break;
										}
									}
								} while (!local8.aBoolean80);
							} while (local8.anInt2005 != 0);
							if (local17 > Static58.anInt1291 || local17 <= Static132.anInt2835) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean80);
						if (local17 < Static58.anInt1291 || local17 >= Static72.anInt4104 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean80);
					if (local20 > Static30.anInt4486 || local20 <= Static69.anInt1535) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean80);
				if (local20 < Static30.anInt4486 || local20 >= Static141.anInt3037 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean80);
			local8.aBoolean80 = false;
			Static74.anInt3650--;
			@Pc(1354) Class71 local1354 = local8.aClass71_1;
			if (local1354 != null && local1354.anInt2838 != 0) {
				if (local1354.aClass3_Sub1_Sub5_8 != null) {
					local1354.aClass3_Sub1_Sub5_8.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local1354.anInt2832 - Static87.anInt1818, local1354.anInt2834 - Static95.anInt3659 - local1354.anInt2838, local1354.anInt2836 - Static143.anInt3081, local1354.aLong96);
				}
				if (local1354.aClass3_Sub1_Sub5_7 != null) {
					local1354.aClass3_Sub1_Sub5_7.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local1354.anInt2832 - Static87.anInt1818, local1354.anInt2834 - Static95.anInt3659 - local1354.anInt2838, local1354.anInt2836 - Static143.anInt3081, local1354.aLong96);
				}
				if (local1354.aClass3_Sub1_Sub5_6 != null) {
					local1354.aClass3_Sub1_Sub5_6.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local1354.anInt2832 - Static87.anInt1818, local1354.anInt2834 - Static95.anInt3659 - local1354.anInt2838, local1354.anInt2836 - Static143.anInt3081, local1354.aLong96);
				}
			}
			if (local8.anInt2002 != 0) {
				@Pc(1449) Class92 local1449 = local8.aClass92_1;
				if (local1449 != null && !Static43.method653(local26, local17, local20, local1449.aClass3_Sub1_Sub5_10.aShort34)) {
					if ((local1449.anInt4404 & local8.anInt2002) != 0) {
						local1449.aClass3_Sub1_Sub5_10.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local1449.anInt4396 + local1449.anInt4400 - Static87.anInt1818, local1449.anInt4399 - Static95.anInt3659, local1449.anInt4398 + local1449.anInt4394 - Static143.anInt3081, local1449.aLong149);
					} else if (local1449.anInt4404 == 256) {
						local245 = local1449.anInt4396 - Static87.anInt1818;
						local1079 = local1449.anInt4399 - Static95.anInt3659;
						local964 = local1449.anInt4398 - Static143.anInt3081;
						local579 = local1449.anInt4402;
						if (local579 == 1 || local579 == 2) {
							local584 = -local245;
						} else {
							local584 = local245;
						}
						if (local579 == 2 || local579 == 3) {
							local589 = -local964;
						} else {
							local589 = local964;
						}
						if (local589 >= local584) {
							local1449.aClass3_Sub1_Sub5_10.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local245 + local1449.anInt4400, local1079, local964 + local1449.anInt4394, local1449.aLong149);
						} else if (local1449.aClass3_Sub1_Sub5_9 != null) {
							local1449.aClass3_Sub1_Sub5_9.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local245, local1079, local964, local1449.aLong149);
						}
					}
				}
				local906 = local8.aClass51_1;
				if (local906 != null) {
					if ((local906.anInt2030 & local8.anInt2002) != 0 && !Static6.method150(local26, local17, local20, local906.anInt2030)) {
						local906.aClass3_Sub1_Sub5_4.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local906.anInt2031 - Static87.anInt1818, local906.anInt2032 - Static95.anInt3659, local906.anInt2029 - Static143.anInt3081, local906.aLong69);
					}
					if ((local906.anInt2028 & local8.anInt2002) != 0 && !Static6.method150(local26, local17, local20, local906.anInt2028)) {
						local906.aClass3_Sub1_Sub5_5.method3054(0, Static14.anInt320, Static21.anInt512, Static112.anInt2518, Static112.anInt2527, local906.anInt2031 - Static87.anInt1818, local906.anInt2032 - Static95.anInt3659, local906.anInt2029 - Static143.anInt3081, local906.aLong69);
					}
				}
			}
			@Pc(1669) Class3_Sub15 local1669;
			if (local23 < Static97.anInt2061 - 1) {
				local1669 = Static185.aClass3_Sub15ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean80) {
					Static3.aClass70_1.method1958(local1669);
				}
			}
			if (local17 < Static58.anInt1291) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean80) {
					Static3.aClass70_1.method1958(local1669);
				}
			}
			if (local20 < Static30.anInt4486) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean80) {
					Static3.aClass70_1.method1958(local1669);
				}
			}
			if (local17 > Static58.anInt1291) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean80) {
					Static3.aClass70_1.method1958(local1669);
				}
			}
			if (local20 > Static30.anInt4486) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean80) {
					Static3.aClass70_1.method1958(local1669);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
	public static void method765() {
		for (@Pc(1) int local1 = 0; local1 < Static97.anInt2061; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static64.anInt1390; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static49.anInt1086; local7++) {
					@Pc(16) Class3_Sub15 local16 = Static185.aClass3_Sub15ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class51 local21 = local16.aClass51_1;
						if (local21 != null && local21.aClass3_Sub1_Sub5_5 instanceof Class3_Sub1_Sub5_Sub5) {
							@Pc(31) Class3_Sub1_Sub5_Sub5 local31 = (Class3_Sub1_Sub5_Sub5) local21.aClass3_Sub1_Sub5_5;
							Static22.method360(local31, local1, local4, local7, 1, 1);
							if (local21.aClass3_Sub1_Sub5_4 instanceof Class3_Sub1_Sub5_Sub5) {
								@Pc(46) Class3_Sub1_Sub5_Sub5 local46 = (Class3_Sub1_Sub5_Sub5) local21.aClass3_Sub1_Sub5_4;
								Static22.method360(local46, local1, local4, local7, 1, 1);
								Static127.method1888(local31, local46, 0, 0, 0, false);
								local21.aClass3_Sub1_Sub5_4 = local46.method1908(local46.aShort28, local46.aShort31, -50, -10, -50, false);
							}
							local21.aClass3_Sub1_Sub5_5 = local31.method1908(local31.aShort28, local31.aShort31, -50, -10, -50, false);
						}
						@Pc(104) Class3_Sub1_Sub5_Sub5 local104;
						for (@Pc(88) int local88 = 0; local88 < local16.anInt2014; local88++) {
							@Pc(94) Class4 local94 = local16.aClass4Array3[local88];
							if (local94 != null && local94.aClass3_Sub1_Sub5_1 instanceof Class3_Sub1_Sub5_Sub5) {
								local104 = (Class3_Sub1_Sub5_Sub5) local94.aClass3_Sub1_Sub5_1;
								Static22.method360(local104, local1, local4, local7, local94.anInt178 + 1 - local94.anInt185, local94.anInt172 - local94.anInt188 + 1);
								local94.aClass3_Sub1_Sub5_1 = local104.method1908(local104.aShort28, local104.aShort31, -50, -10, -50, false);
							}
						}
						@Pc(144) Class13 local144 = local16.aClass13_1;
						if (local144 != null && local144.aClass3_Sub1_Sub5_2 instanceof Class3_Sub1_Sub5_Sub5) {
							local104 = (Class3_Sub1_Sub5_Sub5) local144.aClass3_Sub1_Sub5_2;
							Static118.method1808(local104, local1, local4, local7);
							local144.aClass3_Sub1_Sub5_2 = local104.method1908(local104.aShort28, local104.aShort31, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}
}
