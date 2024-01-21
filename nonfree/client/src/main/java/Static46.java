import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt2738;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1537 = Static75.method1216("flash2:");

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1535 = aClass4_1537;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1538 = Static75.method1216("Walk here");

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1536 = aClass4_1538;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	public static int anInt2739 = 0;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1539 = Static75.method1216("@whi@");

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1540 = Static75.method1216(" (X");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!rc;[Ljava/lang/Object;II)V")
	public static void method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub14 arg2, @OriginalArg(3) Object[] arg3) {
		@Pc(7) int local7 = 0;
		@Pc(16) Class3_Sub1_Sub3 local16 = Static67.method1112((Integer) arg3[0], 76);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = -1;
		@Pc(25) int[] local25 = local16.anIntArray98;
		@Pc(28) int[] local28 = local16.anIntArray97;
		try {
			Static54.aClass4Array10 = new Class4[local16.anInt1031];
			Static96.anIntArray234 = new int[local16.anInt1036];
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(59) int local59;
			for (@Pc(46) int local46 = 1; local46 < arg3.length; local46++) {
				if (arg3[local46] instanceof Integer) {
					local59 = (Integer) arg3[local46];
					if (local59 == -2147483647) {
						local59 = arg1;
					}
					if (local59 == -2147483646) {
						local59 = arg0;
					}
					if (local59 == -2147483645) {
						local59 = arg2.anInt2092;
					}
					if (local59 == -2147483644) {
						local59 = 0;
					}
					Static96.anIntArray234[local40++] = local59;
				} else if (arg3[local46] instanceof Class4) {
					Static54.aClass4Array10[local38++] = (Class4) arg3[local46];
				}
			}
			while (true) {
				@Pc(116) int var10;
				@Pc(527) Class4[] var17;
				@Pc(533) int var18;
				@Pc(554) int var19;
				@Pc(486) Class4 var22;
				while (true) {
					local20++;
					var10 = local28[local20];
					if (var10 >= 100) {
						break;
					}
					if (var10 == 0) {
						Static45.anIntArray162[local7++] = local25[local20];
					} else if (var10 == 1) {
						local59 = local25[local20];
						Static45.anIntArray162[local7++] = Static106.anIntArray329[local59];
					} else if (var10 == 2) {
						local59 = local25[local20];
						local7--;
						Static106.anIntArray329[local59] = Static45.anIntArray162[local7];
					} else if (var10 == 3) {
						Static67.aClass4Array14[local18++] = local16.aClass4Array8[local20];
					} else if (var10 == 6) {
						local20 += local25[local20];
					} else if (var10 == 7) {
						local7 -= 2;
						if (Static45.anIntArray162[local7] != Static45.anIntArray162[local7 + 1]) {
							local20 += local25[local20];
						}
					} else if (var10 == 8) {
						local7 -= 2;
						if (Static45.anIntArray162[local7 + 1] == Static45.anIntArray162[local7]) {
							local20 += local25[local20];
						}
					} else if (var10 == 9) {
						local7 -= 2;
						if (Static45.anIntArray162[local7] < Static45.anIntArray162[local7 + 1]) {
							local20 += local25[local20];
						}
					} else if (var10 == 10) {
						local7 -= 2;
						if (Static45.anIntArray162[local7] > Static45.anIntArray162[local7 + 1]) {
							local20 += local25[local20];
						}
					} else if (var10 == 21) {
						if (Static101.anInt2505 == 0) {
							return;
						}
						@Pc(309) Class50 local309 = Static5.aClass50Array1[--Static101.anInt2505];
						Static54.aClass4Array10 = local309.aClass4Array13;
						local16 = local309.aClass3_Sub1_Sub3_1;
						local28 = local16.anIntArray97;
						local20 = local309.anInt1632;
						Static96.anIntArray234 = local309.anIntArray230;
						local25 = local16.anIntArray98;
					} else if (var10 == 25) {
						local59 = local25[local20];
						Static45.anIntArray162[local7++] = Static1.method3(local59);
					} else if (var10 == 27) {
						local59 = local25[local20];
						local7--;
						Static63.method1084(local59, Static45.anIntArray162[local7]);
					} else if (var10 == 31) {
						local7 -= 2;
						if (Static45.anIntArray162[local7] <= Static45.anIntArray162[local7 + 1]) {
							local20 += local25[local20];
						}
					} else if (var10 == 32) {
						local7 -= 2;
						if (Static45.anIntArray162[local7 + 1] <= Static45.anIntArray162[local7]) {
							local20 += local25[local20];
						}
					} else if (var10 == 33) {
						Static45.anIntArray162[local7++] = Static96.anIntArray234[local25[local20]];
					} else {
						@Pc(432) int local432;
						if (var10 == 34) {
							local432 = local25[local20];
							local7--;
							Static96.anIntArray234[local432] = Static45.anIntArray162[local7];
						} else if (var10 == 35) {
							Static67.aClass4Array14[local18++] = Static54.aClass4Array10[local25[local20]];
						} else if (var10 == 36) {
							local432 = local25[local20];
							local18--;
							Static54.aClass4Array10[local432] = Static67.aClass4Array14[local18];
						} else if (var10 == 37) {
							local59 = local25[local20];
							local18 -= local59;
							var22 = Static79.method1263(local18, Static67.aClass4Array14, local59);
							Static67.aClass4Array14[local18++] = var22;
						} else if (var10 == 38) {
							local7--;
						} else if (var10 == 39) {
							local18--;
						} else if (var10 == 40) {
							local59 = local25[local20];
							@Pc(523) Class3_Sub1_Sub3 local523 = Static67.method1112(local59, 73);
							var17 = new Class4[local523.anInt1031];
							@Pc(531) int[] local531 = new int[local523.anInt1036];
							for (var18 = 0; var18 < local523.anInt1034; var18++) {
								local531[var18] = Static45.anIntArray162[var18 + local7 - local523.anInt1034];
							}
							for (var19 = 0; var19 < local523.anInt1037; var19++) {
								var17[var19] = Static67.aClass4Array14[local18 + var19 - local523.anInt1037];
							}
							local18 -= local523.anInt1037;
							local7 -= local523.anInt1034;
							@Pc(590) Class50 local590 = new Class50();
							local590.aClass4Array13 = Static54.aClass4Array10;
							local590.anIntArray230 = Static96.anIntArray234;
							local590.aClass3_Sub1_Sub3_1 = local16;
							local590.anInt1632 = local20;
							Static5.aClass50Array1[Static101.anInt2505++] = local590;
							Static54.aClass4Array10 = var17;
							local16 = local523;
							local20 = -1;
							Static96.anIntArray234 = local531;
							local28 = local523.anIntArray97;
							local25 = local523.anIntArray98;
						} else if (var10 == 42) {
							Static45.anIntArray162[local7++] = Static5.anIntArray10[local25[local20]];
						} else {
							if (var10 != 43) {
								break;
							}
							local432 = local25[local20];
							local7--;
							Static5.anIntArray10[local432] = Static45.anIntArray162[local7];
						}
					}
				}
				@Pc(665) boolean local665;
				if (local25[local20] == 1) {
					local665 = true;
				} else {
					local665 = false;
				}
				@Pc(685) Class3_Sub1_Sub14 local685;
				@Pc(1401) int local1401;
				@Pc(868) Class3_Sub1_Sub14 local868;
				@Pc(791) int local791;
				@Pc(787) int local787;
				if (var10 >= 1000) {
					if (var10 < 1100) {
						local685 = local665 ? Static94.aClass3_Sub1_Sub14_4 : Static83.aClass3_Sub1_Sub14_2;
						if (var10 == 1000) {
							local7 -= 2;
							local685.anInt2132 = Static45.anIntArray162[local7];
							local685.anInt2077 = Static45.anIntArray162[local7 + 1];
						} else if (var10 == 1001) {
							local7 -= 2;
							local685.anInt2130 = Static45.anIntArray162[local7];
							local685.anInt2117 = Static45.anIntArray162[local7 + 1];
						} else if (var10 == 1003) {
							local7--;
							local685.aBoolean163 = Static45.anIntArray162[local7] == 1;
						} else {
							if (var10 != 1004) {
								break;
							}
							local7--;
							local685.aBoolean167 = Static45.anIntArray162[local7] == 1;
						}
					} else if (var10 < 1200) {
						local685 = local665 ? Static94.aClass3_Sub1_Sub14_4 : Static83.aClass3_Sub1_Sub14_2;
						if (var10 == 1100) {
							local7 -= 2;
							local685.anInt2113 = Static45.anIntArray162[local7];
							local685.anInt2082 = Static45.anIntArray162[local7 + 1];
						} else if (var10 == 1101) {
							local7--;
							local791 = Static45.anIntArray162[local7];
							local787 = local791 >> 10 & 0x1F;
							var18 = local791 >> 5 & 0x1F;
							var19 = local791 & 0x1F;
							local685.anInt2131 = (var19 << 3) + (var18 << 11) + (local787 << 19);
						} else if (var10 == 1102) {
							local7--;
							local685.aBoolean173 = Static45.anIntArray162[local7] == 1;
						} else if (var10 == 1103) {
							local7--;
							local685.anInt2104 = Static45.anIntArray162[local7];
						} else if (var10 == 1104) {
							local7--;
						} else if (var10 == 1105) {
							local7--;
							local685.anInt2080 = Static45.anIntArray162[local7];
						} else if (var10 == 1106) {
							local7--;
						} else if (var10 == 1107) {
							local7--;
						} else if (var10 == 1108) {
							local685.anInt2102 = 1;
							local7--;
							local685.anInt2110 = Static45.anIntArray162[local7];
						} else if (var10 == 1109) {
							local7 -= 5;
							local685.anInt2123 = Static45.anIntArray162[local7 + 2];
							local685.anInt2124 = Static45.anIntArray162[local7 + 3];
							local685.anInt2108 = Static45.anIntArray162[local7 + 4];
						} else if (var10 == 1110) {
							local7--;
							local685.anInt2126 = Static45.anIntArray162[local7];
						} else if (var10 == 1111) {
							local7--;
						} else if (var10 == 1112) {
							local18--;
							local685.aClass4_1186 = Static67.aClass4Array14[local18];
						} else if (var10 == 1113) {
							local7--;
							local685.anInt2081 = Static45.anIntArray162[local7];
						} else if (var10 == 1114) {
							local7 -= 3;
							local685.anInt2094 = Static45.anIntArray162[local7];
							local685.anInt2109 = Static45.anIntArray162[local7 + 1];
							local685.anInt2101 = Static45.anIntArray162[local7 + 2];
						} else {
							if (var10 != 1115) {
								break;
							}
							local7--;
							local685.aBoolean171 = Static45.anIntArray162[local7] == 1;
						}
					} else if (var10 < 1300) {
						local685 = local665 ? Static94.aClass3_Sub1_Sub14_4 : Static83.aClass3_Sub1_Sub14_2;
						if (var10 == 1200) {
							local7 -= 2;
							local787 = Static45.anIntArray162[local7 + 1];
							local791 = Static45.anIntArray162[local7];
							if (local791 == -1) {
								local685.anInt2102 = 0;
							} else {
								@Pc(798) Class3_Sub1_Sub2 local798 = Static3.method1550(local791);
								local685.anInt2124 = local798.anInt734;
								local685.anInt2123 = local798.anInt739;
								local685.anInt2102 = 4;
								local685.anInt2110 = local791;
								local685.anInt2108 = local798.anInt737 * 100 / local787;
							}
						} else if (var10 == 1201) {
							local685.anInt2102 = 2;
							local7--;
							local685.anInt2110 = Static45.anIntArray162[local7];
						} else if (var10 == 1202) {
							local685.anInt2102 = 3;
							local685.anInt2110 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass41_2.method903();
						} else {
							if (var10 != 1203) {
								break;
							}
							local868 = local665 ? Static83.aClass3_Sub1_Sub14_2 : Static94.aClass3_Sub1_Sub14_4;
							local685.anInt2099 = local868.anInt2092;
						}
					} else if (var10 < 1400) {
						local685 = local665 ? Static94.aClass3_Sub1_Sub14_4 : Static83.aClass3_Sub1_Sub14_2;
						if (var10 >= 1300 && var10 <= 1309 || !(var10 < 1314 || var10 > 1317)) {
							local18--;
							@Pc(906) Class4 local906 = Static67.aClass4Array14[local18];
							@Pc(913) Object[] local913 = new Object[local906.method118() + 1];
							for (var18 = local913.length - 1; var18 >= 1; var18--) {
								if (local906.method140(var18 - 1) == 115) {
									local18--;
									local913[var18] = Static67.aClass4Array14[local18];
								} else {
									local7--;
									local913[var18] = Integer.valueOf(Static45.anIntArray162[local7]);
								}
							}
							local7--;
							local913[0] = Integer.valueOf(Static45.anIntArray162[local7]);
							if (var10 == 1302) {
								local685.anObjectArray3 = local913;
							}
							if (var10 == 1309) {
								local685.anObjectArray4 = local913;
							}
							if (var10 == 1304) {
								local685.anObjectArray12 = local913;
							}
							if (var10 == 1315) {
								local685.anObjectArray5 = local913;
							}
							if (var10 == 1317) {
								local685.anObjectArray2 = local913;
							}
							if (var10 == 1301) {
								local685.anObjectArray11 = local913;
							}
							if (var10 == 1300) {
								local685.anObjectArray6 = local913;
							}
							if (var10 == 1308) {
								local685.anObjectArray8 = local913;
							}
							if (var10 == 1303) {
								local685.anObjectArray7 = local913;
							}
							if (var10 == 1306) {
								local685.anObjectArray1 = local913;
							}
							if (var10 == 1316) {
								local685.anObjectArray9 = local913;
							}
							if (var10 == 1305) {
								local685.anObjectArray10 = local913;
							}
						} else if (var10 == 1310) {
							local7--;
							local791 = Static45.anIntArray162[local7];
							if (local791 < 0 || local791 > 9) {
								local791 = 0;
							}
							if (local685.aClass4Array16 == null || local791 >= local685.aClass4Array16.length) {
								var17 = new Class4[local791 + 1];
								if (local685.aClass4Array16 != null) {
									for (var18 = 0; var18 < local685.aClass4Array16.length; var18++) {
										var17[var18] = local685.aClass4Array16[var18];
									}
								}
								local685.aClass4Array16 = var17;
							}
							local18--;
							local685.aClass4Array16[local791] = Static67.aClass4Array14[local18];
						} else if (var10 == 1311) {
							local7--;
							local685.anInt2099 = Static45.anIntArray162[local7];
						} else if (var10 == 1312) {
							local7--;
							local685.aBoolean174 = Static45.anIntArray162[local7] == 1;
						} else {
							if (var10 != 1313) {
								break;
							}
							local7--;
						}
					} else if (var10 < 1500) {
						if (var10 != 1400) {
							break;
						}
						local7 -= 2;
						local1401 = Static45.anIntArray162[local7];
						local791 = Static45.anIntArray162[local7 + 1];
						@Pc(2141) Class3_Sub1_Sub14 local2141 = Static47.method828(local1401);
						if (local2141.aClass3_Sub1_Sub14Array1 == null || local791 >= local2141.aClass3_Sub1_Sub14Array1.length || local2141.aClass3_Sub1_Sub14Array1[local791] == null) {
							Static45.anIntArray162[local7++] = 0;
						} else {
							Static45.anIntArray162[local7++] = 1;
							if (local665) {
								Static94.aClass3_Sub1_Sub14_4 = local2141.aClass3_Sub1_Sub14Array1[local791];
							} else {
								Static83.aClass3_Sub1_Sub14_2 = local2141.aClass3_Sub1_Sub14Array1[local791];
							}
						}
					} else if (var10 >= 1600) {
						if (var10 < 1700) {
							break;
						}
						if (var10 >= 2100) {
							if (var10 >= 2200) {
								if (var10 < 2300 || var10 < 2400 || var10 < 2500) {
									break;
								}
								if (var10 >= 2600) {
									if (var10 >= 2700) {
										if (var10 < 2800 || var10 < 3100) {
											break;
										}
										if (var10 >= 3200) {
											if (var10 < 3300) {
												break;
											}
											if (var10 < 3400) {
												if (var10 != 3300) {
													break;
												}
												Static45.anIntArray162[local7++] = Static60.anInt1489;
											} else if (var10 >= 4100) {
												if (var10 >= 4200 || var10 != 4106) {
													break;
												}
												local7--;
												local1401 = Static45.anIntArray162[local7];
												Static67.aClass4Array14[local18++] = Static93.method1632(local1401);
											} else if (var10 == 4000) {
												local7 -= 2;
												local1401 = Static45.anIntArray162[local7];
												local791 = Static45.anIntArray162[local7 + 1];
												Static45.anIntArray162[local7++] = local1401 + local791;
											} else if (var10 == 4001) {
												local7 -= 2;
												local1401 = Static45.anIntArray162[local7];
												local791 = Static45.anIntArray162[local7 + 1];
												Static45.anIntArray162[local7++] = local1401 - local791;
											} else if (var10 == 4002) {
												local7 -= 2;
												local1401 = Static45.anIntArray162[local7];
												local791 = Static45.anIntArray162[local7 + 1];
												Static45.anIntArray162[local7++] = local1401 * local791;
											} else if (var10 == 4003) {
												local7 -= 2;
												local1401 = Static45.anIntArray162[local7];
												local791 = Static45.anIntArray162[local7 + 1];
												Static45.anIntArray162[local7++] = local1401 / local791;
											} else if (var10 == 4004) {
												local7--;
												local1401 = Static45.anIntArray162[local7];
												Static45.anIntArray162[local7++] = (int) (Math.random() * (double) local1401);
											} else if (var10 == 4005) {
												local7--;
												local1401 = Static45.anIntArray162[local7];
												Static45.anIntArray162[local7++] = (int) (Math.random() * (double) (local1401 + 1));
											} else if (var10 == 4006) {
												local7 -= 5;
												local791 = Static45.anIntArray162[local7 + 1];
												local787 = Static45.anIntArray162[local7 + 2];
												var18 = Static45.anIntArray162[local7 + 3];
												local1401 = Static45.anIntArray162[local7];
												var19 = Static45.anIntArray162[local7 + 4];
												Static45.anIntArray162[local7++] = local1401 + (var19 - local787) * (local791 - local1401) / (var18 - local787);
											} else if (var10 == 4007) {
												local7 -= 2;
												local791 = Static45.anIntArray162[local7 + 1];
												local1401 = Static45.anIntArray162[local7];
												Static45.anIntArray162[local7++] = local1401 * local791 / 100 + local1401;
											} else if (var10 == 4008) {
												local7 -= 2;
												local1401 = Static45.anIntArray162[local7];
												local791 = Static45.anIntArray162[local7 + 1];
												Static45.anIntArray162[local7++] = local1401 | 0x1 << local791;
											} else if (var10 == 4009) {
												local7 -= 2;
												local1401 = Static45.anIntArray162[local7];
												local791 = Static45.anIntArray162[local7 + 1];
												Static45.anIntArray162[local7++] = -(0x1 << local791) - 1 & local1401;
											} else if (var10 == 4010) {
												local7 -= 2;
												local1401 = Static45.anIntArray162[local7];
												local791 = Static45.anIntArray162[local7 + 1];
												Static45.anIntArray162[local7++] = (0x1 << local791 & local1401) == 0 ? 0 : 1;
											} else if (var10 == 4011) {
												local7 -= 2;
												local1401 = Static45.anIntArray162[local7];
												local791 = Static45.anIntArray162[local7 + 1];
												Static45.anIntArray162[local7++] = local1401 % local791;
											} else if (var10 == 4012) {
												local7 -= 2;
												local791 = Static45.anIntArray162[local7 + 1];
												local1401 = Static45.anIntArray162[local7];
												if (local1401 == 0) {
													Static45.anIntArray162[local7++] = 0;
												} else {
													Static45.anIntArray162[local7++] = (int) Math.pow((double) local1401, (double) local791);
												}
											} else {
												if (var10 != 4013) {
													break;
												}
												local7 -= 2;
												local791 = Static45.anIntArray162[local7 + 1];
												local1401 = Static45.anIntArray162[local7];
												if (local1401 == 0) {
													Static45.anIntArray162[local7++] = 0;
												} else if (local791 == 0) {
													Static45.anIntArray162[local7++] = Integer.MAX_VALUE;
												} else {
													Static45.anIntArray162[local7++] = (int) Math.pow((double) local1401, 1.0D / (double) local791);
												}
											}
										} else {
											if (var10 != 3100) {
												break;
											}
											local18--;
											var22 = Static67.aClass4Array14[local18];
											Static21.method296(var22, Static91.aClass4_1160, 0);
										}
									} else if (var10 == 2600) {
										local7--;
										local685 = Static47.method828(Static45.anIntArray162[local7]);
										Static45.anIntArray162[local7++] = local685.anInt2113;
									} else {
										if (var10 != 2601) {
											break;
										}
										local7--;
										local685 = Static47.method828(Static45.anIntArray162[local7]);
										Static45.anIntArray162[local7++] = local685.anInt2082;
									}
								} else if (var10 == 2500) {
									local7--;
									local685 = Static47.method828(Static45.anIntArray162[local7]);
									Static45.anIntArray162[local7++] = local685.anInt2132;
								} else if (var10 == 2501) {
									local7--;
									local685 = Static47.method828(Static45.anIntArray162[local7]);
									Static45.anIntArray162[local7++] = local685.anInt2077;
								} else if (var10 == 2502) {
									local7--;
									local685 = Static47.method828(Static45.anIntArray162[local7]);
									Static45.anIntArray162[local7++] = local685.anInt2130;
								} else if (var10 == 2503) {
									local7--;
									local685 = Static47.method828(Static45.anIntArray162[local7]);
									Static45.anIntArray162[local7++] = local685.anInt2117;
								} else {
									if (var10 != 2504) {
										break;
									}
									local7--;
									local685 = Static47.method828(Static45.anIntArray162[local7]);
									Static45.anIntArray162[local7++] = local685.aBoolean163 ? 1 : 0;
								}
							} else if (var10 == 2100) {
								local7 -= 3;
								local685 = Static47.method828(Static45.anIntArray162[local7]);
								local685.anInt2113 = Static45.anIntArray162[local7 + 1];
								local685.anInt2082 = Static45.anIntArray162[local7 + 2];
							} else if (var10 == 2101) {
								local7 -= 2;
								local685 = Static47.method828(Static45.anIntArray162[local7]);
								local791 = Static45.anIntArray162[local7 + 1];
								var18 = local791 >> 5 & 0x1F;
								local787 = local791 >> 10 & 0x1F;
								var19 = local791 & 0x1F;
								local685.anInt2131 = (var18 << 11) + (local787 << 19) + (var19 << 3);
							} else if (var10 == 2102) {
								local7 -= 2;
								local685 = Static47.method828(Static45.anIntArray162[local7]);
								local685.aBoolean173 = Static45.anIntArray162[local7 + 1] == 1;
							} else {
								if (var10 != 2103) {
									break;
								}
								local7 -= 2;
								local685 = Static47.method828(Static45.anIntArray162[local7]);
								local685.anInt2104 = Static45.anIntArray162[local7 + 1];
							}
						} else if (var10 == 2000) {
							local7 -= 3;
							local685 = Static47.method828(Static45.anIntArray162[local7]);
							local685.anInt2132 = Static45.anIntArray162[local7 + 1];
							local685.anInt2077 = Static45.anIntArray162[local7 + 2];
						} else if (var10 == 2001) {
							local7 -= 3;
							local685 = Static47.method828(Static45.anIntArray162[local7]);
							local685.anInt2130 = Static45.anIntArray162[local7 + 1];
							local685.anInt2117 = Static45.anIntArray162[local7 + 2];
						} else if (var10 == 2003) {
							local7 -= 2;
							local685 = Static47.method828(Static45.anIntArray162[local7]);
							local685.aBoolean163 = Static45.anIntArray162[local7 + 1] == 1;
						} else {
							if (var10 != 2004) {
								break;
							}
							local7 -= 2;
							local685 = Static47.method828(Static45.anIntArray162[local7]);
							local685.aBoolean167 = Static45.anIntArray162[local7 + 1] == 1;
						}
					} else {
						local685 = local665 ? Static94.aClass3_Sub1_Sub14_4 : Static83.aClass3_Sub1_Sub14_2;
						if (var10 == 1500) {
							Static45.anIntArray162[local7++] = local685.anInt2132;
						} else if (var10 == 1501) {
							Static45.anIntArray162[local7++] = local685.anInt2077;
						} else if (var10 == 1502) {
							Static45.anIntArray162[local7++] = local685.anInt2130;
						} else {
							if (var10 != 1503) {
								break;
							}
							Static45.anIntArray162[local7++] = local685.anInt2117;
						}
					}
				} else if (var10 == 100) {
					local7 -= 3;
					local1401 = Static45.anIntArray162[local7];
					local791 = Static45.anIntArray162[local7 + 1];
					local787 = Static45.anIntArray162[local7 + 2];
					@Pc(2462) Class3_Sub1_Sub14 local2462 = Static47.method828(local1401);
					if (local2462.aClass3_Sub1_Sub14Array1 == null) {
						local2462.aClass3_Sub1_Sub14Array1 = new Class3_Sub1_Sub14[local787 + 1];
					}
					if (local787 >= local2462.aClass3_Sub1_Sub14Array1.length) {
						@Pc(2481) Class3_Sub1_Sub14[] local2481 = new Class3_Sub1_Sub14[local787 + 1];
						for (@Pc(2483) int local2483 = 0; local2483 < local2462.aClass3_Sub1_Sub14Array1.length; local2483++) {
							local2481[local2483] = local2462.aClass3_Sub1_Sub14Array1[local2483];
						}
						local2462.aClass3_Sub1_Sub14Array1 = local2481;
					}
					@Pc(2505) Class3_Sub1_Sub14 local2505 = new Class3_Sub1_Sub14();
					local2505.anInt2128 = local791;
					local2505.anInt2097 = local2462.anInt2092;
					local2505.anInt2092 = ((local2462.anInt2092 & 0xFFFF) << 15) + Integer.MIN_VALUE + local787;
					local2462.aClass3_Sub1_Sub14Array1[local787] = local2505;
					if (local665) {
						Static94.aClass3_Sub1_Sub14_4 = local2505;
					} else {
						Static83.aClass3_Sub1_Sub14_2 = local2505;
					}
				} else if (var10 == 101) {
					local685 = local665 ? Static94.aClass3_Sub1_Sub14_4 : Static83.aClass3_Sub1_Sub14_2;
					local868 = Static47.method828(local685.anInt2097);
					local868.aClass3_Sub1_Sub14Array1[local868.anInt2092 & 0x7FFF] = null;
				} else {
					if (var10 != 102) {
						break;
					}
					local7--;
					local685 = Static47.method828(Static45.anIntArray162[local7]);
					local685.aClass3_Sub1_Sub14Array1 = null;
				}
			}
		} catch (@Pc(2583) Exception local2583) {
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!rd;ZLjava/awt/Component;Lclient!rd;)V")
	public static void method1876(@OriginalArg(0) Class64 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class64 arg2) {
		if (Static81.aBoolean147) {
			return;
		}
		Static11.aClass25_155 = Static11.method1928(arg1, 128, 265);
		Static50.method1842();
		Static43.aClass25_54 = Static11.method1928(arg1, 128, 265);
		Static50.method1842();
		Static13.aClass25_22 = Static11.method1928(arg1, 509, 171);
		Static50.method1842();
		Static34.aClass25_47 = Static11.method1928(arg1, 360, 132);
		Static50.method1842();
		Static95.aClass25_118 = Static11.method1928(arg1, 360, 200);
		Static50.method1842();
		Static89.aClass25_105 = Static11.method1928(arg1, 202, 238);
		Static50.method1842();
		Static21.aClass25_26 = Static11.method1928(arg1, 203, 238);
		Static50.method1842();
		Static18.aClass25_25 = Static11.method1928(arg1, 74, 94);
		Static50.method1842();
		Static8.aClass25_19 = Static11.method1928(arg1, 75, 94);
		Static50.method1842();
		@Pc(77) byte[] local77 = arg2.method1622(Static23.aClass4_259, Static95.aClass4_1258);
		@Pc(83) Class3_Sub1_Sub4_Sub2 local83 = new Class3_Sub1_Sub4_Sub2(local77, arg1);
		Static11.aClass25_155.method1157();
		local83.method1740(0, 0);
		Static43.aClass25_54.method1157();
		local83.method1740(-637, 0);
		Static13.aClass25_22.method1157();
		local83.method1740(-128, 0);
		Static34.aClass25_47.method1157();
		local83.method1740(-202, -371);
		Static95.aClass25_118.method1157();
		local83.method1740(-202, -171);
		Static89.aClass25_105.method1157();
		local83.method1740(0, -265);
		Static21.aClass25_26.method1157();
		local83.method1740(-562, -265);
		Static18.aClass25_25.method1157();
		local83.method1740(-128, -171);
		Static8.aClass25_19.method1157();
		local83.method1740(-562, -171);
		@Pc(150) int[] local150 = new int[local83.anInt2573];
		@Pc(156) int local156;
		@Pc(182) int local182;
		for (@Pc(152) int local152 = 0; local152 < local83.anInt2578; local152++) {
			for (local156 = 0; local156 < local83.anInt2573; local156++) {
				local150[local156] = local83.anIntArray325[local83.anInt2573 * local152 + local83.anInt2573 - local156 - 1];
			}
			for (local182 = 0; local182 < local83.anInt2573; local182++) {
				local83.anIntArray325[local182 + local152 * local83.anInt2573] = local150[local182];
			}
		}
		Static11.aClass25_155.method1157();
		local83.method1740(382, 0);
		Static43.aClass25_54.method1157();
		local83.method1740(-255, 0);
		Static13.aClass25_22.method1157();
		local83.method1740(254, 0);
		Static34.aClass25_47.method1157();
		local83.method1740(180, -371);
		Static95.aClass25_118.method1157();
		local83.method1740(180, -171);
		Static89.aClass25_105.method1157();
		local83.method1740(382, -265);
		Static21.aClass25_26.method1157();
		local83.method1740(-180, -265);
		Static18.aClass25_25.method1157();
		local83.method1740(254, -171);
		Static8.aClass25_19.method1157();
		local83.method1740(-180, -171);
		local83 = Static69.method1517(Static107.aClass4_1497, Static95.aClass4_1258, arg0);
		Static13.aClass25_22.method1157();
		local83.method1733(382 - local83.anInt2573 / 2 - 128, 18);
		Static112.aClass3_Sub1_Sub4_Sub3_47 = Static18.method284(Static95.aClass4_1258, Static86.aClass4_1130, arg0);
		Static49.aClass3_Sub1_Sub4_Sub3_16 = Static18.method284(Static95.aClass4_1258, Static56.aClass4_720, arg0);
		Static27.aClass3_Sub1_Sub4_Sub3Array2 = Static69.method1518(Static48.aClass4_629, Static95.aClass4_1258, arg0);
		Static86.aClass3_Sub1_Sub4_Sub2_33 = new Class3_Sub1_Sub4_Sub2(128, 265);
		Static82.aClass3_Sub1_Sub4_Sub2_31 = new Class3_Sub1_Sub4_Sub2(128, 265);
		for (local156 = 0; local156 < 33920; local156++) {
			Static86.aClass3_Sub1_Sub4_Sub2_33.anIntArray325[local156] = Static11.aClass25_155.anIntArray233[local156];
		}
		for (local182 = 0; local182 < 33920; local182++) {
			Static82.aClass3_Sub1_Sub4_Sub2_31.anIntArray325[local182] = Static43.aClass25_54.anIntArray233[local182];
		}
		Static100.anIntArray304 = new int[256];
		for (@Pc(376) int local376 = 0; local376 < 64; local376++) {
			Static100.anIntArray304[local376] = local376 * 262144;
		}
		for (@Pc(392) int local392 = 0; local392 < 64; local392++) {
			Static100.anIntArray304[local392 + 64] = local392 * 1024 + 16711680;
		}
		for (@Pc(410) int local410 = 0; local410 < 64; local410++) {
			Static100.anIntArray304[local410 + 128] = local410 * 4 + 16776960;
		}
		for (@Pc(430) int local430 = 0; local430 < 64; local430++) {
			Static100.anIntArray304[local430 + 192] = 16777215;
		}
		Static16.anIntArray34 = new int[256];
		for (@Pc(449) int local449 = 0; local449 < 64; local449++) {
			Static16.anIntArray34[local449] = local449 * 1024;
		}
		for (@Pc(465) int local465 = 0; local465 < 64; local465++) {
			Static16.anIntArray34[local465 + 64] = local465 * 4 + 65280;
		}
		for (@Pc(483) int local483 = 0; local483 < 64; local483++) {
			Static16.anIntArray34[local483 + 128] = local483 * 262144 + 65535;
		}
		for (@Pc(504) int local504 = 0; local504 < 64; local504++) {
			Static16.anIntArray34[local504 + 192] = 16777215;
		}
		Static28.anIntArray82 = new int[256];
		for (@Pc(523) int local523 = 0; local523 < 64; local523++) {
			Static28.anIntArray82[local523] = local523 * 4;
		}
		for (@Pc(539) int local539 = 0; local539 < 64; local539++) {
			Static28.anIntArray82[local539 + 64] = local539 * 262144 + 255;
		}
		for (@Pc(557) int local557 = 0; local557 < 64; local557++) {
			Static28.anIntArray82[local557 + 128] = local557 * 1024 + 16711935;
		}
		for (@Pc(577) int local577 = 0; local577 < 64; local577++) {
			Static28.anIntArray82[local577 + 192] = 16777215;
		}
		Static85.anIntArray260 = new int[32768];
		Static86.anIntArray262 = new int[256];
		Static101.anIntArray311 = new int[32768];
		Static93.method1617(null);
		Static21.anIntArray36 = new int[32768];
		Static73.anInt1759 = 0;
		Static51.anIntArray174 = new int[32768];
		Static95.aClass4_1256 = Static95.aClass4_1258;
		Static95.aClass4_1260 = Static95.aClass4_1258;
		if (Static90.anInt2816 == 0 || Static36.aBoolean70) {
			Static67.method1111();
		} else {
			Static67.method1103(Static1.aClass4_1, Static94.aClass64_Sub1_18, Static95.aClass4_1258, Static90.anInt2816);
		}
		Static70.method1137(false);
		Static81.aBoolean147 = true;
		Static103.aBoolean216 = true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method1877() {
		aClass4_1535 = null;
		aClass4_1540 = null;
		aClass4_1536 = null;
		aClass4_1539 = null;
		aClass4_1537 = null;
		aClass4_1538 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!r;IILclient!tb;)V")
	public static void method1879(@OriginalArg(0) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class64_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class20 local9 = Static88.aClass20_10;
		synchronized (Static88.aClass20_10) {
			for (@Pc(16) Class3_Sub6 local16 = (Class3_Sub6) Static88.aClass20_10.method308(); local16 != null; local16 = (Class3_Sub6) Static88.aClass20_10.method309()) {
				if ((long) arg1 == local16.aLong88 && arg0 == local16.aClass62_1 && local16.anInt1199 == 0) {
					local7 = local16.aByteArray15;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(74) byte[] local74 = arg0.method1400(arg1);
			arg2.method1648(arg1, true, arg0, local74);
		} else {
			arg2.method1648(arg1, true, arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method1880() {
		if (Static112.anInt2829 == 0) {
			return;
		}
		@Pc(17) int local17 = 0;
		if (Static11.anInt2850 != 0) {
			local17 = 1;
		}
		for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
			if (Static83.aClass4Array15[local23] != null) {
				@Pc(33) int local33 = Static42.anIntArray157[local23];
				@Pc(37) Class4 local37 = Static100.aClass4Array18[local23];
				if (local37 != null && local37.method132(Static93.aClass4_1336)) {
					local37 = local37.method137(5);
				}
				if (local37 != null && local37.method132(Static75.aClass4_996)) {
					local37 = local37.method137(5);
				}
				if ((local33 == 3 || local33 == 7) && (local33 == 7 || Static55.anInt1391 == 0 || Static55.anInt1391 == 1 && Static111.method1898(local37))) {
					@Pc(92) int local92 = 329 - local17 * 13;
					local17++;
					if (Static22.anInt496 > 4 && Static78.anInt420 - 4 > local92 - 10 && local92 + 3 >= Static78.anInt420 + -4) {
						@Pc(139) int local139 = Static71.aClass3_Sub1_Sub4_Sub4_2.method1859(Static60.method1012(new Class4[] { Static45.aClass4_586, Static13.aClass4_188, local37, Static83.aClass4Array15[local23] })) + 25;
						if (local139 > 450) {
							local139 = 450;
						}
						if (Static22.anInt496 < local139 + 4) {
							if (Static67.anInt1652 >= 1) {
								Static62.method1082(Static60.method1012(new Class4[] { aClass4_1539, local37 }), 2011, Static92.aClass4_1182, 0, 0, 0);
							}
							Static62.method1082(Static60.method1012(new Class4[] { aClass4_1539, local37 }), 2001, Static35.aClass4_322, 0, 0, 0);
							Static62.method1082(Static60.method1012(new Class4[] { aClass4_1539, local37 }), 2059, Static83.aClass4_1093, 0, 0, 0);
						}
					}
					if (local17 >= 5) {
						return;
					}
				}
				if ((local33 == 5 || local33 == 6) && Static55.anInt1391 < 2) {
					local17++;
					if (local17 >= 5) {
						return;
					}
				}
			}
		}
	}
}
