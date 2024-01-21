import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!db", name = "I", descriptor = "Lclient!rf;")
	public static Class74 aClass74_2;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "I")
	public static int anInt886;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "I")
	public static int anInt888;

	@OriginalMember(owner = "client!db", name = "T", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_2;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "Lclient!ga;")
	public static Class30 aClass30_15;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "Lclient!ed;")
	public static Class23 aClass23_301 = Static169.method2903("Hidden)2");

	@OriginalMember(owner = "client!db", name = "M", descriptor = "[I")
	public static int[] anIntArray116 = new int[25];

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_302 = Static169.method2903(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!db", name = "W", descriptor = "Lclient!ed;")
	private static Class23 aClass23_304 = Static169.method2903("Unexpected server response)3");

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Lclient!ed;")
	public static Class23 aClass23_303 = aClass23_304;

	@OriginalMember(owner = "client!db", name = "db", descriptor = "Lclient!ed;")
	private static Class23 aClass23_306 = Static169.method2903("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_305 = aClass23_306;

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_307 = Static169.method2903("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public static void method528() {
		Static45.aClass56_3 = new Class56();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIBII[Lclient!ob;III)V")
	public static void method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class60[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(22) Class60 local22 = arg4[local7];
			if (local22 != null && (!local22.aBoolean155 || local22.anInt3032 == 0 || local22.aBoolean151 || Static170.method475(local22) != 0 || local22 == Static142.aClass60_13) && local22.anInt2971 == arg0 && (!local22.aBoolean155 || !Static146.method2528(local22))) {
				@Pc(63) int local63 = arg2 + local22.anInt2985;
				@Pc(68) int local68 = arg1 + local22.anInt2999;
				if (Static133.aClass60_12 == local22) {
					Static60.anInt4362 = local68;
					Static135.anInt3418 = local63;
					Static77.aBoolean106 = true;
				}
				@Pc(89) int local89;
				@Pc(87) int local87;
				@Pc(85) int local85;
				@Pc(83) int local83;
				@Pc(160) int local160;
				if (local22.anInt3032 == 2) {
					local83 = arg5;
					local85 = arg6;
					local87 = arg3;
					local89 = arg7;
				} else {
					@Pc(114) int local114;
					@Pc(130) int local130;
					if (local22.anInt3032 == 9) {
						@Pc(151) int local151 = local22.anInt3014 + local68;
						local130 = local63;
						local114 = local68;
						local160 = local63 + local22.anInt3017;
						if (local151 < local68) {
							local114 = local151;
							local151 = local68;
						}
						if (local160 < local63) {
							local130 = local160;
							local160 = local63;
						}
						local160++;
						local89 = local114 > arg7 ? local114 : arg7;
						local83 = local160 < arg5 ? local160 : arg5;
						local87 = local130 > arg3 ? local130 : arg3;
						local151++;
						local85 = arg6 <= local151 ? arg6 : local151;
					} else {
						local87 = arg3 < local63 ? local63 : arg3;
						local114 = local68 + local22.anInt3014;
						local85 = arg6 > local114 ? local114 : arg6;
						local130 = local63 + local22.anInt3017;
						local89 = arg7 < local68 ? local68 : arg7;
						local83 = local130 >= arg5 ? arg5 : local130;
					}
				}
				if (!local22.aBoolean155 || local89 < local85 && local87 < local83) {
					if (local22.anInt3007 == 1337) {
						Static39.method659(local22);
					} else if (local22.anInt3007 == 1338) {
						Static49.method909(local68, local63);
					} else {
						if (local22.anInt3032 == 0) {
							if (!local22.aBoolean155 && Static146.method2528(local22) && local22 != Static107.aClass60_8) {
								continue;
							}
							method529(local22.anInt3019, local68 - local22.anInt2968, -local22.anInt3029 + local63, local87, arg4, local83, local85, local89);
							if (local22.aClass60Array1 != null) {
								method529(local22.anInt3019, local68 - local22.anInt2968, local63 - local22.anInt3029, local87, local22.aClass60Array1, local83, local85, local89);
							}
							@Pc(320) Class1_Sub16 local320 = (Class1_Sub16) Static12.aClass10_1.method256((long) local22.anInt3019);
							if (local320 != null) {
								Static156.method2641(local85, local68, local83, local320.anInt3207, local89, local63, local87);
							}
						}
						if (local22.aBoolean155) {
							@Pc(337) boolean local337 = false;
							@Pc(339) boolean local339 = false;
							if (Static163.anInt4012 == 1 && local89 <= Static38.anInt1049 && local87 <= Static165.anInt4054 && local85 > Static38.anInt1049 && local83 > Static165.anInt4054) {
								local339 = true;
							}
							@Pc(388) boolean local388;
							if (Static163.anInt4014 >= local89 && local87 <= Static96.anInt2484 && local85 > Static163.anInt4014 && local83 > Static96.anInt2484) {
								local388 = true;
							} else {
								local388 = false;
							}
							if (Static18.anInt568 == 1 && local388) {
								local337 = true;
							}
							if (local339) {
								Static177.method3000(Static165.anInt4054 - local63, local22, Static38.anInt1049 - local68);
							}
							if (Static133.aClass60_12 != null && Static133.aClass60_12 != local22 && local388 && Static25.method432(Static170.method475(local22))) {
								Static91.aClass60_4 = local22;
							}
							if (Static142.aClass60_13 == local22) {
								Static50.aBoolean60 = true;
								Static38.anInt1036 = local63;
								Static178.anInt4247 = local68;
							}
							if (local22.aBoolean151) {
								@Pc(452) Class1_Sub13 local452;
								if (local388 && Static138.anInt3532 != 0 && local22.anObjectArray23 != null) {
									local452 = new Class1_Sub13();
									local452.anObjectArray3 = local22.anObjectArray23;
									local452.aClass60_6 = local22;
									local452.anInt2663 = Static138.anInt3532;
									Static153.aClass56_14.method1856(local452);
								}
								if (Static133.aClass60_12 != null || Static109.aClass60_10 != null || Static164.aBoolean201) {
									local388 = false;
									local337 = false;
									local339 = false;
								}
								if (!local22.aBoolean150 && local339) {
									local22.aBoolean150 = true;
									if (local22.anObjectArray24 != null) {
										local452 = new Class1_Sub13();
										local452.anInt2663 = Static165.anInt4054 - local63;
										local452.anInt2666 = Static38.anInt1049 - local68;
										local452.aClass60_6 = local22;
										local452.anObjectArray3 = local22.anObjectArray24;
										Static153.aClass56_14.method1856(local452);
									}
								}
								if (local22.aBoolean150 && local337 && local22.anObjectArray14 != null) {
									local452 = new Class1_Sub13();
									local452.aClass60_6 = local22;
									local452.anInt2663 = Static96.anInt2484 - local63;
									local452.anObjectArray3 = local22.anObjectArray14;
									local452.anInt2666 = Static163.anInt4014 - local68;
									Static153.aClass56_14.method1856(local452);
								}
								if (local22.aBoolean150 && !local337) {
									local22.aBoolean150 = false;
									if (local22.anObjectArray19 != null) {
										local452 = new Class1_Sub13();
										local452.anInt2663 = Static96.anInt2484 - local63;
										local452.anInt2666 = Static163.anInt4014 - local68;
										local452.anObjectArray3 = local22.anObjectArray19;
										local452.aClass60_6 = local22;
										Static100.aClass56_9.method1856(local452);
									}
								}
								if (local337 && local22.anObjectArray5 != null) {
									local452 = new Class1_Sub13();
									local452.aClass60_6 = local22;
									local452.anInt2666 = Static163.anInt4014 - local68;
									local452.anObjectArray3 = local22.anObjectArray5;
									local452.anInt2663 = Static96.anInt2484 - local63;
									Static153.aClass56_14.method1856(local452);
								}
								if (!local22.aBoolean152 && local388) {
									local22.aBoolean152 = true;
									if (local22.anObjectArray8 != null) {
										local452 = new Class1_Sub13();
										local452.anInt2666 = Static163.anInt4014 - local68;
										local452.anObjectArray3 = local22.anObjectArray8;
										local452.aClass60_6 = local22;
										local452.anInt2663 = Static96.anInt2484 - local63;
										Static153.aClass56_14.method1856(local452);
									}
								}
								if (local22.aBoolean152 && local388 && local22.anObjectArray26 != null) {
									local452 = new Class1_Sub13();
									local452.anInt2663 = Static96.anInt2484 - local63;
									local452.anInt2666 = Static163.anInt4014 - local68;
									local452.aClass60_6 = local22;
									local452.anObjectArray3 = local22.anObjectArray26;
									Static153.aClass56_14.method1856(local452);
								}
								if (local22.aBoolean152 && !local388) {
									local22.aBoolean152 = false;
									if (local22.anObjectArray11 != null) {
										local452 = new Class1_Sub13();
										local452.anObjectArray3 = local22.anObjectArray11;
										local452.aClass60_6 = local22;
										local452.anInt2666 = Static163.anInt4014 - local68;
										local452.anInt2663 = Static96.anInt2484 - local63;
										Static100.aClass56_9.method1856(local452);
									}
								}
								if (local22.anObjectArray29 != null) {
									local452 = new Class1_Sub13();
									local452.anObjectArray3 = local22.anObjectArray29;
									local452.aClass60_6 = local22;
									Static65.aClass56_12.method1856(local452);
								}
								@Pc(799) int local799;
								@Pc(801) int local801;
								@Pc(813) Class1_Sub13 local813;
								if (local22.anObjectArray4 != null && Static90.anInt2407 > local22.anInt2987) {
									if (local22.anIntArray395 == null || Static90.anInt2407 - local22.anInt2987 > 32) {
										local452 = new Class1_Sub13();
										local452.aClass60_6 = local22;
										local452.anObjectArray3 = local22.anObjectArray4;
										Static153.aClass56_14.method1856(local452);
									} else {
										label376: for (local160 = local22.anInt2987; local160 < Static90.anInt2407; local160++) {
											local799 = Static19.anIntArray83[local160 & 0x1F];
											for (local801 = 0; local801 < local22.anIntArray395.length; local801++) {
												if (local22.anIntArray395[local801] == local799) {
													local813 = new Class1_Sub13();
													local813.anObjectArray3 = local22.anObjectArray4;
													local813.aClass60_6 = local22;
													Static153.aClass56_14.method1856(local813);
													break label376;
												}
											}
										}
									}
									local22.anInt2987 = Static90.anInt2407;
								}
								if (local22.anObjectArray17 != null && Static8.anInt347 > local22.anInt2991) {
									if (local22.anIntArray401 == null || Static8.anInt347 - local22.anInt2991 > 32) {
										local452 = new Class1_Sub13();
										local452.aClass60_6 = local22;
										local452.anObjectArray3 = local22.anObjectArray17;
										Static153.aClass56_14.method1856(local452);
									} else {
										label356: for (local160 = local22.anInt2991; local160 < Static8.anInt347; local160++) {
											local799 = Static49.anIntArray160[local160 & 0x1F];
											for (local801 = 0; local801 < local22.anIntArray401.length; local801++) {
												if (local799 == local22.anIntArray401[local801]) {
													local813 = new Class1_Sub13();
													local813.aClass60_6 = local22;
													local813.anObjectArray3 = local22.anObjectArray17;
													Static153.aClass56_14.method1856(local813);
													break label356;
												}
											}
										}
									}
									local22.anInt2991 = Static8.anInt347;
								}
								if (local22.anObjectArray16 != null && local22.anInt2980 < Static139.anInt3551) {
									if (local22.anIntArray400 == null || Static139.anInt3551 - local22.anInt2980 > 32) {
										local452 = new Class1_Sub13();
										local452.aClass60_6 = local22;
										local452.anObjectArray3 = local22.anObjectArray16;
										Static153.aClass56_14.method1856(local452);
									} else {
										label336: for (local160 = local22.anInt2980; local160 < Static139.anInt3551; local160++) {
											local799 = Static41.anIntArray139[local160 & 0x1F];
											for (local801 = 0; local801 < local22.anIntArray400.length; local801++) {
												if (local22.anIntArray400[local801] == local799) {
													local813 = new Class1_Sub13();
													local813.anObjectArray3 = local22.anObjectArray16;
													local813.aClass60_6 = local22;
													Static153.aClass56_14.method1856(local813);
													break label336;
												}
											}
										}
									}
									local22.anInt2980 = Static139.anInt3551;
								}
								if (Static99.anInt2515 > local22.anInt2986 && local22.anObjectArray20 != null) {
									local452 = new Class1_Sub13();
									local452.anObjectArray3 = local22.anObjectArray20;
									local452.aClass60_6 = local22;
									Static153.aClass56_14.method1856(local452);
								}
								if (local22.anInt2986 < Static23.anInt698 && local22.anObjectArray6 != null) {
									local452 = new Class1_Sub13();
									local452.anObjectArray3 = local22.anObjectArray6;
									local452.aClass60_6 = local22;
									Static153.aClass56_14.method1856(local452);
								}
								if (Static130.anInt3403 > local22.anInt2986 && local22.anObjectArray18 != null) {
									local452 = new Class1_Sub13();
									local452.anObjectArray3 = local22.anObjectArray18;
									local452.aClass60_6 = local22;
									Static153.aClass56_14.method1856(local452);
								}
								if (Static51.anInt1467 > local22.anInt2986 && local22.anObjectArray28 != null) {
									local452 = new Class1_Sub13();
									local452.aClass60_6 = local22;
									local452.anObjectArray3 = local22.anObjectArray28;
									Static153.aClass56_14.method1856(local452);
								}
								if (local22.anInt2986 < Static33.anInt952 && local22.anObjectArray10 != null) {
									local452 = new Class1_Sub13();
									local452.aClass60_6 = local22;
									local452.anObjectArray3 = local22.anObjectArray10;
									Static153.aClass56_14.method1856(local452);
								}
								local22.anInt2986 = Static176.anInt4191;
								if (local22.anObjectArray25 != null) {
									for (local160 = 0; local160 < Static99.anInt2524; local160++) {
										@Pc(1161) Class1_Sub13 local1161 = new Class1_Sub13();
										local1161.aClass60_6 = local22;
										local1161.anInt2665 = Static4.anIntArray44[local160];
										local1161.anInt2659 = Static149.anIntArray491[local160];
										local1161.anObjectArray3 = local22.anObjectArray25;
										Static153.aClass56_14.method1856(local1161);
									}
								}
							}
						}
						if (!local22.aBoolean155) {
							if (Static133.aClass60_12 != null || Static109.aClass60_10 != null || Static164.aBoolean201) {
								return;
							}
							if ((local22.anInt3020 >= 0 || local22.anInt3012 != 0) && Static163.anInt4014 >= local89 && local87 <= Static96.anInt2484 && local85 > Static163.anInt4014 && Static96.anInt2484 < local83) {
								if (local22.anInt3020 >= 0) {
									Static107.aClass60_8 = arg4[local22.anInt3020];
								} else {
									Static107.aClass60_8 = local22;
								}
							}
							if (local22.anInt3032 == 8 && Static163.anInt4014 >= local89 && Static96.anInt2484 >= local87 && local85 > Static163.anInt4014 && local83 > Static96.anInt2484) {
								Static74.aClass60_3 = local22;
							}
							if (local22.anInt2977 > local22.anInt3017) {
								Static83.method1471(local22.anInt2977, local22, Static96.anInt2484, local68 + local22.anInt3014, local63, Static163.anInt4014, local22.anInt3017);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIB)I")
	public static int method530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 65536 - Class1_Sub1_Sub12_Sub2.anIntArray417[arg1 * 1024 / arg0] >> 1;
		return ((65536 - local16) * arg2 >> 16) + (arg3 * local16 >> 16);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZ)I")
	public static int method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static12.aByteArrayArrayArray11[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static12.aByteArrayArrayArray11[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method533() {
		aClass23_301 = null;
		aClass23_304 = null;
		aClass30_Sub1_2 = null;
		aClass23_302 = null;
		aClass23_305 = null;
		anIntArray116 = null;
		aClass23_303 = null;
		aClass23_307 = null;
		aClass30_15 = null;
		aClass23_306 = null;
		aClass74_2 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLclient!ga;)V")
	public static void method535(@OriginalArg(1) Class30 arg0) {
		Static14.aClass30_8 = arg0;
	}
}
