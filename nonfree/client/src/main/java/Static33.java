import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	public static int anInt786;

	@OriginalMember(owner = "client!client", name = "H", descriptor = "[I")
	public static int[] anIntArray48 = new int[100];

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!ia;")
	private static Class51 aClass51_222 = Static64.method1101("flash2:");

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!ia;")
	public static Class51 aClass51_221 = aClass51_222;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	public static int anInt785 = -1;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_223 = aClass51_222;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array6 = new Class51[200];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!me;)Lclient!me;")
	public static Class71 method579(@OriginalArg(0) Class71 arg0) {
		@Pc(4) int local4 = Static111.method1881(method587(arg0));
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static7.method102(arg0.anInt2785);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!me;IIIIIII)V")
	public static void method580(@OriginalArg(0) Class71[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class71 local6 = arg0[local1];
			if (local6 != null && local6.anInt2785 == arg1 && (!local6.aBoolean122 || local6.anInt2777 == 0 || local6.aBoolean113 || method587(local6) != 0 || local6 == Static218.aClass71_20 || local6.anInt2815 == 1338) && (!local6.aBoolean122 || !method583(local6))) {
				@Pc(42) int local42 = local6.anInt2858 + arg6;
				@Pc(47) int local47 = local6.anInt2804 + arg7;
				@Pc(53) int local53;
				@Pc(55) int local55;
				@Pc(57) int local57;
				@Pc(59) int local59;
				if (local6.anInt2777 == 2) {
					local53 = arg2;
					local55 = arg3;
					local57 = arg4;
					local59 = arg5;
				} else {
					@Pc(65) int local65 = local42 + local6.anInt2802;
					@Pc(70) int local70 = local47 + local6.anInt2835;
					if (local6.anInt2777 == 9) {
						local65++;
						local70++;
					}
					local53 = local42 > arg2 ? local42 : arg2;
					local55 = local47 > arg3 ? local47 : arg3;
					local57 = local65 < arg4 ? local65 : arg4;
					local59 = local70 < arg5 ? local70 : arg5;
				}
				if (local6 == Static111.aClass71_22) {
					Static100.aBoolean91 = true;
					Static77.anInt1720 = local42;
					Static193.anInt4183 = local47;
				}
				if (!local6.aBoolean122 || local53 < local57 && local55 < local59) {
					if (local6.anInt2777 == 0) {
						if (!local6.aBoolean122 && method583(local6) && Static86.aClass71_18 != local6) {
							continue;
						}
						if (local6.aBoolean118 && Static205.anInt4361 >= local53 && Static15.anInt373 >= local55 && Static205.anInt4361 < local57 && Static15.anInt373 < local59) {
							for (@Pc(155) Class1_Sub21 local155 = (Class1_Sub21) Static152.aClass105_17.method3120(); local155 != null; local155 = (Class1_Sub21) Static152.aClass105_17.method3109()) {
								if (local155.aBoolean139) {
									local155.method3758();
								}
							}
							if (Static144.anInt3149 == 0) {
								Static111.aClass71_22 = null;
								Static218.aClass71_20 = null;
							}
							Static115.aBoolean102 = false;
						}
					}
					if (local6.aBoolean122) {
						@Pc(194) boolean local194;
						if (Static205.anInt4361 >= local53 && Static15.anInt373 >= local55 && Static205.anInt4361 < local57 && Static15.anInt373 < local59) {
							local194 = true;
						} else {
							local194 = false;
						}
						@Pc(199) boolean local199 = false;
						if (Static71.anInt1636 == 1 && local194) {
							local199 = true;
						}
						@Pc(208) boolean local208 = false;
						if (Static15.anInt371 == 1 && Static148.anInt3214 >= local53 && Static106.anInt2346 >= local55 && Static148.anInt3214 < local57 && Static106.anInt2346 < local59) {
							local208 = true;
						}
						@Pc(232) int local232;
						@Pc(235) int local235;
						@Pc(243) int local243;
						if (Static125.anInt3560 > 0 && local6.aByteArray25 != null) {
							for (local232 = 0; local232 < local6.aByteArray25.length; local232++) {
								for (local235 = 0; local235 < Static125.anInt3560; local235++) {
									local243 = local6.aByteArray25[local232] & 0xFF;
									if (local243 == Static187.anIntArray306[local235]) {
										Static203.method3259(local6.anInt2807, -1, Static81.aClass51_607, local232 + 1);
									}
								}
							}
						}
						if (local208) {
							Static71.method1259(Static106.anInt2346 - local47, Static148.anInt3214 - local42, local6);
						}
						if (Static111.aClass71_22 != null && Static111.aClass71_22 != local6 && local194 && Static199.method3288(method587(local6))) {
							Static75.aClass71_11 = local6;
						}
						if (local6 == Static218.aClass71_20) {
							Static32.aBoolean27 = true;
							Static118.anInt2543 = local42;
							Static168.anInt3765 = local47;
						}
						if (local6.aBoolean113 || local6.anInt2815 != 0) {
							@Pc(318) Class1_Sub21 local318;
							if (local194 && Static105.anInt2335 != 0 && local6.anObjectArray24 != null) {
								local318 = new Class1_Sub21();
								local318.aBoolean139 = true;
								local318.aClass71_25 = local6;
								local318.anInt3105 = Static105.anInt2335;
								local318.anObjectArray32 = local6.anObjectArray24;
								Static152.aClass105_17.method3119(local318);
							}
							if (Static111.aClass71_22 != null || Static229.aClass71_31 != null || Static156.aBoolean164 || local6.anInt2815 != 1400 && Static115.aBoolean102) {
								local208 = false;
								local199 = false;
								local194 = false;
							}
							if (local6.anInt2815 != 0) {
								if (local6.anInt2815 == 1337) {
									Static20.aClass71_6 = local6;
									Static82.method1438(local6);
									continue;
								}
								if (local6.anInt2815 == 1338) {
									if (local208) {
										Static163.method2752(local6, Static148.anInt3214 - local42, Static106.anInt2346 - local47);
									}
									continue;
								}
								if (local6.anInt2815 == 1400) {
									Static218.aClass71_21 = local6;
									if (local208) {
										if (Static208.aBooleanArray25[82] && Static24.anInt604 > 0) {
											local232 = Static200.anInt4248 + (int) ((double) (Static148.anInt3214 - local42 - local6.anInt2802 / 2) * 2.0D / Static10.aDouble1) + Static87.anInt2015;
											local235 = Static108.anInt2405 + Static87.anInt2017 - (int) ((double) (Static106.anInt2346 - local47 - local6.anInt2835 / 2) * 2.0D / Static10.aDouble1) - Static150.anInt3286;
											@Pc(489) Class51 local489 = Static150.method2574(new Class51[] { Static74.aClass51_569, Static27.method511(local232 >> 6), Static107.aClass51_789, Static27.method511(local235 >> 6), Static107.aClass51_789, Static27.method511(local232 & 0x3F), Static107.aClass51_789, Static27.method511(local235 & 0x3F) });
											local489.method1439();
											Static149.method2566(local489);
											Static197.method1855();
											continue;
										}
										Static115.aBoolean102 = true;
										Static222.anInt4666 = Static205.anInt4361;
										Static167.anInt3761 = Static15.anInt373;
										Static61.anInt1429 = Static87.anInt2015;
										Static92.anInt2049 = Static150.anInt3286;
										continue;
									}
									if (local199 && Static115.aBoolean102) {
										Static49.method835(Static61.anInt1429 + (int) ((double) (Static222.anInt4666 - Static205.anInt4361) * 2.0D / Static227.aDouble11));
										Static48.method832(Static92.anInt2049 + (int) ((double) (Static167.anInt3761 - Static15.anInt373) * 2.0D / Static227.aDouble11));
										continue;
									}
									Static115.aBoolean102 = false;
									continue;
								}
								if (local6.anInt2815 == 1401) {
									if (local199) {
										Static42.method3757(local6.anInt2802, Static15.anInt373 - local47, Static205.anInt4361 - local42, local6.anInt2835);
									}
									continue;
								}
								if (local6.anInt2815 == 1402) {
									Static82.method1438(local6);
									continue;
								}
								if (local6.anInt2815 == 1404) {
									Static82.method1438(local6);
									continue;
								}
							}
							if (!local6.aBoolean127 && local208) {
								local6.aBoolean127 = true;
								if (local6.anObjectArray13 != null) {
									local318 = new Class1_Sub21();
									local318.aBoolean139 = true;
									local318.aClass71_25 = local6;
									local318.anInt3104 = Static148.anInt3214 - local42;
									local318.anInt3105 = Static106.anInt2346 - local47;
									local318.anObjectArray32 = local6.anObjectArray13;
									Static152.aClass105_17.method3119(local318);
								}
							}
							if (local6.aBoolean127 && local199 && local6.anObjectArray8 != null) {
								local318 = new Class1_Sub21();
								local318.aBoolean139 = true;
								local318.aClass71_25 = local6;
								local318.anInt3104 = Static205.anInt4361 - local42;
								local318.anInt3105 = Static15.anInt373 - local47;
								local318.anObjectArray32 = local6.anObjectArray8;
								Static152.aClass105_17.method3119(local318);
							}
							if (local6.aBoolean127 && !local199) {
								local6.aBoolean127 = false;
								if (local6.anObjectArray11 != null) {
									local318 = new Class1_Sub21();
									local318.aBoolean139 = true;
									local318.aClass71_25 = local6;
									local318.anInt3104 = Static205.anInt4361 - local42;
									local318.anInt3105 = Static15.anInt373 - local47;
									local318.anObjectArray32 = local6.anObjectArray11;
									Static68.aClass105_8.method3119(local318);
								}
							}
							if (local199 && local6.anObjectArray2 != null) {
								local318 = new Class1_Sub21();
								local318.aBoolean139 = true;
								local318.aClass71_25 = local6;
								local318.anInt3104 = Static205.anInt4361 - local42;
								local318.anInt3105 = Static15.anInt373 - local47;
								local318.anObjectArray32 = local6.anObjectArray2;
								Static152.aClass105_17.method3119(local318);
							}
							if (!local6.aBoolean120 && local194) {
								local6.aBoolean120 = true;
								if (local6.anObjectArray18 != null) {
									local318 = new Class1_Sub21();
									local318.aBoolean139 = true;
									local318.aClass71_25 = local6;
									local318.anInt3104 = Static205.anInt4361 - local42;
									local318.anInt3105 = Static15.anInt373 - local47;
									local318.anObjectArray32 = local6.anObjectArray18;
									Static152.aClass105_17.method3119(local318);
								}
							}
							if (local6.aBoolean120 && local194 && local6.anObjectArray25 != null) {
								local318 = new Class1_Sub21();
								local318.aBoolean139 = true;
								local318.aClass71_25 = local6;
								local318.anInt3104 = Static205.anInt4361 - local42;
								local318.anInt3105 = Static15.anInt373 - local47;
								local318.anObjectArray32 = local6.anObjectArray25;
								Static152.aClass105_17.method3119(local318);
							}
							if (local6.aBoolean120 && !local194) {
								local6.aBoolean120 = false;
								if (local6.anObjectArray31 != null) {
									local318 = new Class1_Sub21();
									local318.aBoolean139 = true;
									local318.aClass71_25 = local6;
									local318.anInt3104 = Static205.anInt4361 - local42;
									local318.anInt3105 = Static15.anInt373 - local47;
									local318.anObjectArray32 = local6.anObjectArray31;
									Static68.aClass105_8.method3119(local318);
								}
							}
							if (local6.anObjectArray17 != null) {
								local318 = new Class1_Sub21();
								local318.aClass71_25 = local6;
								local318.anObjectArray32 = local6.anObjectArray17;
								Static39.aClass105_5.method3119(local318);
							}
							@Pc(912) Class1_Sub21 local912;
							if (local6.anObjectArray16 != null && Static221.anInt4648 > local6.anInt2853) {
								if (local6.anIntArray179 == null || Static221.anInt4648 - local6.anInt2853 > 32) {
									local318 = new Class1_Sub21();
									local318.aClass71_25 = local6;
									local318.anObjectArray32 = local6.anObjectArray16;
									Static152.aClass105_17.method3119(local318);
								} else {
									label531: for (local232 = local6.anInt2853; local232 < Static221.anInt4648; local232++) {
										local235 = Static88.anIntArray126[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray179.length; local243++) {
											if (local6.anIntArray179[local243] == local235) {
												local912 = new Class1_Sub21();
												local912.aClass71_25 = local6;
												local912.anObjectArray32 = local6.anObjectArray16;
												Static152.aClass105_17.method3119(local912);
												break label531;
											}
										}
									}
								}
								local6.anInt2853 = Static221.anInt4648;
							}
							if (local6.anObjectArray5 != null && Static176.anInt3865 > local6.anInt2830) {
								if (local6.anIntArray176 == null || Static176.anInt3865 - local6.anInt2830 > 32) {
									local318 = new Class1_Sub21();
									local318.aClass71_25 = local6;
									local318.anObjectArray32 = local6.anObjectArray5;
									Static152.aClass105_17.method3119(local318);
								} else {
									label507: for (local232 = local6.anInt2830; local232 < Static176.anInt3865; local232++) {
										local235 = Static56.anIntArray229[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray176.length; local243++) {
											if (local6.anIntArray176[local243] == local235) {
												local912 = new Class1_Sub21();
												local912.aClass71_25 = local6;
												local912.anObjectArray32 = local6.anObjectArray5;
												Static152.aClass105_17.method3119(local912);
												break label507;
											}
										}
									}
								}
								local6.anInt2830 = Static176.anInt3865;
							}
							if (local6.anObjectArray9 != null && Static119.anInt4278 > local6.anInt2847) {
								if (local6.anIntArray185 == null || Static119.anInt4278 - local6.anInt2847 > 32) {
									local318 = new Class1_Sub21();
									local318.aClass71_25 = local6;
									local318.anObjectArray32 = local6.anObjectArray9;
									Static152.aClass105_17.method3119(local318);
								} else {
									label483: for (local232 = local6.anInt2847; local232 < Static119.anInt4278; local232++) {
										local235 = Static123.anIntArray163[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray185.length; local243++) {
											if (local6.anIntArray185[local243] == local235) {
												local912 = new Class1_Sub21();
												local912.aClass71_25 = local6;
												local912.anObjectArray32 = local6.anObjectArray9;
												Static152.aClass105_17.method3119(local912);
												break label483;
											}
										}
									}
								}
								local6.anInt2847 = Static119.anInt4278;
							}
							if (local6.anObjectArray29 != null && Static185.anInt4011 > local6.anInt2796) {
								if (local6.anIntArray178 == null || Static185.anInt4011 - local6.anInt2796 > 32) {
									local318 = new Class1_Sub21();
									local318.aClass71_25 = local6;
									local318.anObjectArray32 = local6.anObjectArray29;
									Static152.aClass105_17.method3119(local318);
								} else {
									label459: for (local232 = local6.anInt2796; local232 < Static185.anInt4011; local232++) {
										local235 = Static59.anIntArray87[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray178.length; local243++) {
											if (local6.anIntArray178[local243] == local235) {
												local912 = new Class1_Sub21();
												local912.aClass71_25 = local6;
												local912.anObjectArray32 = local6.anObjectArray29;
												Static152.aClass105_17.method3119(local912);
												break label459;
											}
										}
									}
								}
								local6.anInt2796 = Static185.anInt4011;
							}
							if (local6.anObjectArray3 != null && Static127.anInt2811 > local6.anInt2783) {
								if (local6.anIntArray183 == null || Static127.anInt2811 - local6.anInt2783 > 32) {
									local318 = new Class1_Sub21();
									local318.aClass71_25 = local6;
									local318.anObjectArray32 = local6.anObjectArray3;
									Static152.aClass105_17.method3119(local318);
								} else {
									label435: for (local232 = local6.anInt2783; local232 < Static127.anInt2811; local232++) {
										local235 = Static58.anIntArray86[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray183.length; local243++) {
											if (local6.anIntArray183[local243] == local235) {
												local912 = new Class1_Sub21();
												local912.aClass71_25 = local6;
												local912.anObjectArray32 = local6.anObjectArray3;
												Static152.aClass105_17.method3119(local912);
												break label435;
											}
										}
									}
								}
								local6.anInt2783 = Static127.anInt2811;
							}
							if (Static73.anInt1666 > local6.anInt2849 && local6.anObjectArray4 != null) {
								local318 = new Class1_Sub21();
								local318.aClass71_25 = local6;
								local318.anObjectArray32 = local6.anObjectArray4;
								Static152.aClass105_17.method3119(local318);
							}
							if (Static99.anInt2154 > local6.anInt2849 && local6.anObjectArray26 != null) {
								local318 = new Class1_Sub21();
								local318.aClass71_25 = local6;
								local318.anObjectArray32 = local6.anObjectArray26;
								Static152.aClass105_17.method3119(local318);
							}
							if (Static90.anInt4703 > local6.anInt2849 && local6.anObjectArray21 != null) {
								local318 = new Class1_Sub21();
								local318.aClass71_25 = local6;
								local318.anObjectArray32 = local6.anObjectArray21;
								Static152.aClass105_17.method3119(local318);
							}
							if (Static192.anInt4164 > local6.anInt2849 && local6.anObjectArray22 != null) {
								local318 = new Class1_Sub21();
								local318.aClass71_25 = local6;
								local318.anObjectArray32 = local6.anObjectArray22;
								Static152.aClass105_17.method3119(local318);
							}
							if (Static149.anInt3253 > local6.anInt2849 && local6.anObjectArray7 != null) {
								local318 = new Class1_Sub21();
								local318.aClass71_25 = local6;
								local318.anObjectArray32 = local6.anObjectArray7;
								Static152.aClass105_17.method3119(local318);
							}
							local6.anInt2849 = Static27.anInt651;
							if (local6.anObjectArray10 != null) {
								for (local232 = 0; local232 < Static125.anInt3560; local232++) {
									@Pc(1380) Class1_Sub21 local1380 = new Class1_Sub21();
									local1380.aClass71_25 = local6;
									local1380.anInt3106 = Static187.anIntArray306[local232];
									local1380.anInt3102 = Static13.anIntArray15[local232];
									local1380.anObjectArray32 = local6.anObjectArray10;
									Static152.aClass105_17.method3119(local1380);
								}
							}
							if (Static165.aBoolean169 && local6.anObjectArray19 != null) {
								local318 = new Class1_Sub21();
								local318.aClass71_25 = local6;
								local318.anObjectArray32 = local6.anObjectArray19;
								Static152.aClass105_17.method3119(local318);
							}
						}
					}
					if (!local6.aBoolean122 && Static111.aClass71_22 == null && Static229.aClass71_31 == null && !Static156.aBoolean164) {
						if ((local6.anInt2846 >= 0 || local6.anInt2829 != 0) && Static205.anInt4361 >= local53 && Static15.anInt373 >= local55 && Static205.anInt4361 < local57 && Static15.anInt373 < local59) {
							if (local6.anInt2846 >= 0) {
								Static86.aClass71_18 = arg0[local6.anInt2846];
							} else {
								Static86.aClass71_18 = local6;
							}
						}
						if (local6.anInt2777 == 8 && Static205.anInt4361 >= local53 && Static15.anInt373 >= local55 && Static205.anInt4361 < local57 && Static15.anInt373 < local59) {
							Static93.aClass71_19 = local6;
						}
						if (local6.anInt2813 > local6.anInt2835) {
							Static47.method829(local47, local6, Static205.anInt4361, local6.anInt2813, Static15.anInt373, local6.anInt2835, local42 + local6.anInt2802);
						}
					}
					if (local6.anInt2777 == 0) {
						method580(arg0, local6.anInt2807, local53, local55, local57, local59, local42 - local6.anInt2842, local47 - local6.anInt2779);
						if (local6.aClass71Array2 != null) {
							method580(local6.aClass71Array2, local6.anInt2807, local53, local55, local57, local59, local42 - local6.anInt2842, local47 - local6.anInt2779);
						}
						@Pc(1547) Class1_Sub13 local1547 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local6.anInt2807);
						if (local1547 != null) {
							Static147.method2525(local53, local1547.anInt1677, local57, local42, local47, local59, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	public static void method582() {
		Static71.anIntArray104 = new int[104];
		Static166.anIntArray243 = new int[104];
		Static185.anInt4013 = 99;
		Static186.anIntArray303 = new int[104];
		Static229.aByteArrayArrayArray15 = new byte[4][104][104];
		Static220.anIntArray360 = new int[104];
		Static11.aByteArrayArrayArray2 = new byte[4][104][104];
		Static140.anIntArrayArrayArray6 = new int[4][105][105];
		Static113.aByteArrayArrayArray8 = new byte[4][104][104];
		Static15.aByteArrayArrayArray3 = new byte[4][104][104];
		Static230.anIntArray380 = new int[104];
		Static18.aByteArrayArrayArray4 = new byte[4][105][105];
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!me;)Z")
	public static boolean method583(@OriginalArg(0) Class71 arg0) {
		if (Static135.aBoolean135) {
			if (method587(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2777 == 0) {
				return false;
			}
		}
		return arg0.aBoolean121;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method584(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub10 local4 = Static110.method1051(1, arg0);
		local4.method1524();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!me;)I")
	public static int method587(@OriginalArg(0) Class71 arg0) {
		@Pc(13) Class1_Sub15 local13 = (Class1_Sub15) Static73.aClass102_9.method3093(((long) arg0.anInt2807 << 32) + (long) arg0.anInt2788);
		return local13 == null ? arg0.anInt2787 : local13.anInt2107;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)I")
	public static int method588(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
