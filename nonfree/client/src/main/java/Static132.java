import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
	public static int anInt2835;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public static int anInt2830 = 0;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1122 = Static120.method1824("<)4col>");

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "Lclient!of;")
	public static final Class70 aClass70_19 = new Class70();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII[Lclient!qf;III)V")
	public static void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class77[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(15) int local15 = 0; local15 < arg4.length; local15++) {
			@Pc(21) Class77 local21 = arg4[local15];
			if (local21 != null && (!local21.aBoolean127 || local21.anInt3206 == 0 || local21.aBoolean129 || Static71.method1062(local21) != 0 || local21 == Static23.aClass77_1 || local21.anInt3256 == 1338) && local21.anInt3201 == arg2 && (!local21.aBoolean127 || !Static75.method1107(local21))) {
				@Pc(59) int local59 = arg7 + local21.anInt3229;
				@Pc(64) int local64 = arg5 + local21.anInt3259;
				if (local21 == Static64.aClass77_2) {
					Static109.anInt2438 = local59;
					Static79.aBoolean67 = true;
					Static124.anInt2674 = local64;
				}
				@Pc(83) int local83;
				@Pc(79) int local79;
				@Pc(85) int local85;
				@Pc(81) int local81;
				@Pc(148) int local148;
				if (local21.anInt3206 == 2) {
					local79 = arg0;
					local81 = arg3;
					local83 = arg6;
					local85 = arg1;
				} else {
					@Pc(107) int local107;
					@Pc(112) int local112;
					if (local21.anInt3206 == 9) {
						local107 = local59;
						local112 = local64;
						local148 = local21.anInt3221 + local64;
						@Pc(154) int local154 = local59 + local21.anInt3251;
						if (local59 > local154) {
							local107 = local154;
							local154 = local59;
						}
						local83 = local107 <= arg6 ? arg6 : local107;
						if (local64 > local148) {
							local112 = local148;
							local148 = local64;
						}
						local148++;
						local154++;
						local79 = local112 <= arg0 ? arg0 : local112;
						local81 = arg3 > local148 ? local148 : arg3;
						local85 = arg1 > local154 ? local154 : arg1;
					} else {
						local83 = local59 > arg6 ? local59 : arg6;
						local107 = local21.anInt3251 + local59;
						local112 = local64 + local21.anInt3221;
						local85 = arg1 <= local107 ? arg1 : local107;
						local79 = local64 <= arg0 ? arg0 : local64;
						local81 = local112 >= arg3 ? arg3 : local112;
					}
				}
				if (!local21.aBoolean127 || local85 > local83 && local79 < local81) {
					if (local21.anInt3256 == 1337) {
						Static186.method3014(local21);
					} else {
						if (local21.anInt3206 == 0) {
							if (!local21.aBoolean127 && Static75.method1107(local21) && local21 != Static85.aClass77_5) {
								continue;
							}
							method2017(local79, local85, local21.anInt3237, local81, arg4, local64 - local21.anInt3213, local83, local59 - local21.anInt3222);
							if (local21.aClass77Array1 != null) {
								method2017(local79, local85, local21.anInt3237, local81, local21.aClass77Array1, local64 - local21.anInt3213, local83, local59 - local21.anInt3222);
							}
							@Pc(312) Class3_Sub20 local312 = (Class3_Sub20) Static28.aClass54_4.method1496((long) local21.anInt3237);
							if (local312 != null) {
								Static142.method2214(local85, local79, local81, local312.anInt2996, local59, local64, local83);
							}
						}
						if (local21.aBoolean127) {
							@Pc(353) boolean local353;
							if (Static190.anInt4379 >= local83 && Static3.anInt153 >= local79 && Static190.anInt4379 < local85 && local81 > Static3.anInt153) {
								local353 = true;
							} else {
								local353 = false;
							}
							@Pc(359) boolean local359 = false;
							if (Static129.anInt2784 == 1 && local353) {
								local359 = true;
							}
							@Pc(370) boolean local370 = false;
							if (Static107.anInt2370 == 1 && local83 <= Static37.anInt855 && Static20.anInt497 >= local79 && local85 > Static37.anInt855 && Static20.anInt497 < local81) {
								local370 = true;
							}
							if (local21.anInt3256 == 1338) {
								if (local370) {
									Static104.method1558(Static37.anInt855 - local59, -local64 + Static20.anInt497, local21);
								}
								continue;
							}
							if (local370) {
								Static158.method2511(Static37.anInt855 - local59, Static20.anInt497 - local64, local21);
							}
							if (Static64.aClass77_2 != null && local21 != Static64.aClass77_2 && local353 && Static60.method893(Static71.method1062(local21))) {
								Static94.aClass77_8 = local21;
							}
							if (Static23.aClass77_1 == local21) {
								Static148.anInt3315 = local59;
								Static155.aBoolean142 = true;
								Static46.anInt1057 = local64;
							}
							if (local21.aBoolean129) {
								@Pc(469) Class3_Sub16 local469;
								if (local353 && Static147.anInt3297 != 0 && local21.anObjectArray21 != null) {
									local469 = new Class3_Sub16();
									local469.aClass77_10 = local21;
									local469.anInt2197 = Static147.anInt3297;
									local469.anObjectArray3 = local21.anObjectArray21;
									aClass70_19.method1958(local469);
								}
								if (Static64.aClass77_2 != null || Static158.aClass77_14 != null || Static148.aBoolean134) {
									local359 = false;
									local353 = false;
									local370 = false;
								}
								if (!local21.aBoolean132 && local370) {
									local21.aBoolean132 = true;
									if (local21.anObjectArray11 != null) {
										local469 = new Class3_Sub16();
										local469.aClass77_10 = local21;
										local469.anObjectArray3 = local21.anObjectArray11;
										local469.anInt2197 = Static20.anInt497 - local64;
										local469.anInt2193 = Static37.anInt855 - local59;
										aClass70_19.method1958(local469);
									}
								}
								if (local21.aBoolean132 && local359 && local21.anObjectArray8 != null) {
									local469 = new Class3_Sub16();
									local469.aClass77_10 = local21;
									local469.anObjectArray3 = local21.anObjectArray8;
									local469.anInt2197 = Static3.anInt153 - local64;
									local469.anInt2193 = Static190.anInt4379 - local59;
									aClass70_19.method1958(local469);
								}
								if (local21.aBoolean132 && !local359) {
									local21.aBoolean132 = false;
									if (local21.anObjectArray5 != null) {
										local469 = new Class3_Sub16();
										local469.aClass77_10 = local21;
										local469.anObjectArray3 = local21.anObjectArray5;
										local469.anInt2197 = Static3.anInt153 - local64;
										local469.anInt2193 = Static190.anInt4379 - local59;
										Static165.aClass70_23.method1958(local469);
									}
								}
								if (local359 && local21.anObjectArray17 != null) {
									local469 = new Class3_Sub16();
									local469.anInt2197 = Static3.anInt153 - local64;
									local469.anInt2193 = Static190.anInt4379 - local59;
									local469.anObjectArray3 = local21.anObjectArray17;
									local469.aClass77_10 = local21;
									aClass70_19.method1958(local469);
								}
								if (!local21.aBoolean133 && local353) {
									local21.aBoolean133 = true;
									if (local21.anObjectArray7 != null) {
										local469 = new Class3_Sub16();
										local469.anInt2193 = Static190.anInt4379 - local59;
										local469.anObjectArray3 = local21.anObjectArray7;
										local469.aClass77_10 = local21;
										local469.anInt2197 = Static3.anInt153 - local64;
										aClass70_19.method1958(local469);
									}
								}
								if (local21.aBoolean133 && local353 && local21.anObjectArray4 != null) {
									local469 = new Class3_Sub16();
									local469.aClass77_10 = local21;
									local469.anInt2197 = Static3.anInt153 - local64;
									local469.anObjectArray3 = local21.anObjectArray4;
									local469.anInt2193 = Static190.anInt4379 - local59;
									aClass70_19.method1958(local469);
								}
								if (local21.aBoolean133 && !local353) {
									local21.aBoolean133 = false;
									if (local21.anObjectArray12 != null) {
										local469 = new Class3_Sub16();
										local469.anInt2197 = Static3.anInt153 - local64;
										local469.anObjectArray3 = local21.anObjectArray12;
										local469.aClass77_10 = local21;
										local469.anInt2193 = Static190.anInt4379 - local59;
										Static165.aClass70_23.method1958(local469);
									}
								}
								if (local21.anObjectArray13 != null) {
									local469 = new Class3_Sub16();
									local469.aClass77_10 = local21;
									local469.anObjectArray3 = local21.anObjectArray13;
									Static78.aClass70_5.method1958(local469);
								}
								@Pc(793) int local793;
								@Pc(795) int local795;
								@Pc(811) Class3_Sub16 local811;
								if (local21.anObjectArray24 != null && Static109.anInt2441 > local21.anInt3247) {
									if (local21.anIntArray413 == null || Static109.anInt2441 - local21.anInt3247 > 32) {
										local469 = new Class3_Sub16();
										local469.aClass77_10 = local21;
										local469.anObjectArray3 = local21.anObjectArray24;
										aClass70_19.method1958(local469);
									} else {
										label387: for (local148 = local21.anInt3247; local148 < Static109.anInt2441; local148++) {
											local793 = Static187.anIntArray505[local148 & 0x1F];
											for (local795 = 0; local795 < local21.anIntArray413.length; local795++) {
												if (local21.anIntArray413[local795] == local793) {
													local811 = new Class3_Sub16();
													local811.aClass77_10 = local21;
													local811.anObjectArray3 = local21.anObjectArray24;
													aClass70_19.method1958(local811);
													break label387;
												}
											}
										}
									}
									local21.anInt3247 = Static109.anInt2441;
								}
								if (local21.anObjectArray28 != null && Static174.anInt3928 > local21.anInt3261) {
									if (local21.anIntArray421 == null || Static174.anInt3928 - local21.anInt3261 > 32) {
										local469 = new Class3_Sub16();
										local469.aClass77_10 = local21;
										local469.anObjectArray3 = local21.anObjectArray28;
										aClass70_19.method1958(local469);
									} else {
										label363: for (local148 = local21.anInt3261; local148 < Static174.anInt3928; local148++) {
											local793 = Static156.anIntArray435[local148 & 0x1F];
											for (local795 = 0; local795 < local21.anIntArray421.length; local795++) {
												if (local21.anIntArray421[local795] == local793) {
													local811 = new Class3_Sub16();
													local811.anObjectArray3 = local21.anObjectArray28;
													local811.aClass77_10 = local21;
													aClass70_19.method1958(local811);
													break label363;
												}
											}
										}
									}
									local21.anInt3261 = Static174.anInt3928;
								}
								if (local21.anObjectArray23 != null && local21.anInt3207 < Static32.anInt4270) {
									if (local21.anIntArray414 == null || Static32.anInt4270 - local21.anInt3207 > 32) {
										local469 = new Class3_Sub16();
										local469.aClass77_10 = local21;
										local469.anObjectArray3 = local21.anObjectArray23;
										aClass70_19.method1958(local469);
									} else {
										label339: for (local148 = local21.anInt3207; local148 < Static32.anInt4270; local148++) {
											local793 = Static39.anIntArray116[local148 & 0x1F];
											for (local795 = 0; local795 < local21.anIntArray414.length; local795++) {
												if (local793 == local21.anIntArray414[local795]) {
													local811 = new Class3_Sub16();
													local811.anObjectArray3 = local21.anObjectArray23;
													local811.aClass77_10 = local21;
													aClass70_19.method1958(local811);
													break label339;
												}
											}
										}
									}
									local21.anInt3207 = Static32.anInt4270;
								}
								if (local21.anInt3254 < Static175.anInt3953 && local21.anObjectArray29 != null) {
									local469 = new Class3_Sub16();
									local469.aClass77_10 = local21;
									local469.anObjectArray3 = local21.anObjectArray29;
									aClass70_19.method1958(local469);
								}
								if (local21.anInt3254 < Static168.anInt3770 && local21.anObjectArray9 != null) {
									local469 = new Class3_Sub16();
									local469.aClass77_10 = local21;
									local469.anObjectArray3 = local21.anObjectArray9;
									aClass70_19.method1958(local469);
								}
								if (local21.anInt3254 < Static116.anInt4478 && local21.anObjectArray26 != null) {
									local469 = new Class3_Sub16();
									local469.anObjectArray3 = local21.anObjectArray26;
									local469.aClass77_10 = local21;
									aClass70_19.method1958(local469);
								}
								if (Static120.anInt2634 > local21.anInt3254 && local21.anObjectArray19 != null) {
									local469 = new Class3_Sub16();
									local469.anObjectArray3 = local21.anObjectArray19;
									local469.aClass77_10 = local21;
									aClass70_19.method1958(local469);
								}
								if (Static104.anInt2186 > local21.anInt3254 && local21.anObjectArray25 != null) {
									local469 = new Class3_Sub16();
									local469.aClass77_10 = local21;
									local469.anObjectArray3 = local21.anObjectArray25;
									aClass70_19.method1958(local469);
								}
								local21.anInt3254 = Static31.anInt747;
								if (local21.anObjectArray16 != null) {
									for (local148 = 0; local148 < Static95.anInt3658; local148++) {
										@Pc(1168) Class3_Sub16 local1168 = new Class3_Sub16();
										local1168.aClass77_10 = local21;
										local1168.anInt2194 = Static3.anIntArray25[local148];
										local1168.anInt2188 = Static7.anIntArray31[local148];
										local1168.anObjectArray3 = local21.anObjectArray16;
										aClass70_19.method1958(local1168);
									}
								}
							}
						}
						if (!local21.aBoolean127) {
							if (Static64.aClass77_2 != null || Static158.aClass77_14 != null || Static148.aBoolean134) {
								return;
							}
							if ((local21.anInt3210 >= 0 || local21.anInt3199 != 0) && Static190.anInt4379 >= local83 && local79 <= Static3.anInt153 && local85 > Static190.anInt4379 && Static3.anInt153 < local81) {
								if (local21.anInt3210 < 0) {
									Static85.aClass77_5 = local21;
								} else {
									Static85.aClass77_5 = arg4[local21.anInt3210];
								}
							}
							if (local21.anInt3206 == 8 && Static190.anInt4379 >= local83 && local79 <= Static3.anInt153 && Static190.anInt4379 < local85 && Static3.anInt153 < local81) {
								Static93.aClass77_7 = local21;
							}
							if (local21.anInt3221 < local21.anInt3249) {
								Static85.method1248(local59 + local21.anInt3251, Static190.anInt4379, local21.anInt3249, local21.anInt3221, Static3.anInt153, local64, local21);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
	public static void method2019(@OriginalArg(0) int arg0) {
		if (arg0 == Static21.anInt516) {
			return;
		}
		if (Static21.anInt516 == 0) {
			Static88.method1289();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static48.anInt1078 = 0;
			Static38.anInt867 = 0;
			Static126.anInt2702 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static120.aClass78_4 != null) {
			Static120.aClass78_4.method2417();
			Static120.aClass78_4 = null;
		}
		if (Static21.anInt516 == 25) {
			Static193.anInt4408 = 0;
			Static79.anInt1735 = 1;
			Static46.anInt1063 = 1;
			Static175.anInt3942 = 0;
			Static106.anInt2202 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static56.method821(Static130.aClass1_Sub1_21, Static166.aClass1_Sub1_28, Static146.aCanvas1);
		} else {
			Static58.method869();
		}
		Static21.anInt516 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)Lclient!rd;")
	public static Class80 method2020(@OriginalArg(0) int arg0) {
		return Static154.method2467(new Class80[] { Static83.method1219(arg0 >> 24 & 0xFF), Static106.aClass80_896, Static83.method1219(arg0 >> 16 & 0xFF), Static106.aClass80_896, Static83.method1219(arg0 >> 8 & 0xFF), Static106.aClass80_896, Static83.method1219(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Lclient!ca;")
	public static Class13 method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass13_1 == null ? null : local7.aClass13_1;
	}
}
