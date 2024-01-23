import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt720;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!sc;")
	public static Class107 aClass107_236 = Static231.method3737("m");

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
	public static int[] anIntArray78 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!o;IIIIIII)V")
	public static void method673(@OriginalArg(0) Class86[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class86 local6 = arg0[local1];
			if (local6 != null && local6.anInt3225 == arg1 && (!local6.aBoolean280 || local6.anInt3286 == 0 || local6.aBoolean277 || method676(local6) != 0 || local6 == Static83.aClass86_5 || local6.anInt3285 == 1338) && (!local6.aBoolean280 || !method677(local6))) {
				@Pc(42) int local42 = local6.anInt3215 + arg6;
				@Pc(47) int local47 = local6.anInt3268 + arg7;
				@Pc(53) int local53;
				@Pc(55) int local55;
				@Pc(57) int local57;
				@Pc(59) int local59;
				if (local6.anInt3286 == 2) {
					local53 = arg2;
					local55 = arg3;
					local57 = arg4;
					local59 = arg5;
				} else {
					@Pc(65) int local65 = local42 + local6.anInt3280;
					@Pc(70) int local70 = local47 + local6.anInt3270;
					if (local6.anInt3286 == 9) {
						local65++;
						local70++;
					}
					local53 = local42 > arg2 ? local42 : arg2;
					local55 = local47 > arg3 ? local47 : arg3;
					local57 = local65 < arg4 ? local65 : arg4;
					local59 = local70 < arg5 ? local70 : arg5;
				}
				if (local6 == Static54.aClass86_1) {
					Static151.aBoolean291 = true;
					Static171.anInt3710 = local42;
					Static177.anInt3840 = local47;
				}
				if (!local6.aBoolean280 || local53 < local57 && local55 < local59) {
					if (local6.anInt3286 == 0) {
						if (!local6.aBoolean280 && method677(local6) && Static215.aClass86_16 != local6) {
							continue;
						}
						if (local6.aBoolean286 && Static220.anInt4822 >= local53 && Static181.anInt4311 >= local55 && Static220.anInt4822 < local57 && Static181.anInt4311 < local59) {
							for (@Pc(155) Class1_Sub22 local155 = (Class1_Sub22) Static146.aClass120_17.method3564(); local155 != null; local155 = (Class1_Sub22) Static146.aClass120_17.method3561()) {
								if (local155.aBoolean304) {
									local155.method3735();
								}
							}
							if (Static191.anInt4238 == 0) {
								Static54.aClass86_1 = null;
								Static83.aClass86_5 = null;
							}
							Static141.aBoolean263 = false;
						}
					}
					if (local6.aBoolean280) {
						@Pc(194) boolean local194;
						if (Static220.anInt4822 >= local53 && Static181.anInt4311 >= local55 && Static220.anInt4822 < local57 && Static181.anInt4311 < local59) {
							local194 = true;
						} else {
							local194 = false;
						}
						@Pc(199) boolean local199 = false;
						if (Static198.anInt4319 == 1 && local194) {
							local199 = true;
						}
						@Pc(208) boolean local208 = false;
						if (Static95.anInt2075 == 1 && Static20.anInt2218 >= local53 && Static161.anInt3533 >= local55 && Static20.anInt2218 < local57 && Static161.anInt3533 < local59) {
							local208 = true;
						}
						@Pc(232) int local232;
						@Pc(235) int local235;
						@Pc(243) int local243;
						if (Static150.anInt3332 > 0 && local6.aByteArray46 != null) {
							for (local232 = 0; local232 < local6.aByteArray46.length; local232++) {
								for (local235 = 0; local235 < Static150.anInt3332; local235++) {
									local243 = local6.aByteArray46[local232] & 0xFF;
									if (local243 == Static81.anIntArray178[local235]) {
										Static104.method2406(local232 + 1, Static63.aClass107_427, -1, local6.anInt3239);
									}
								}
							}
						}
						if (local208) {
							Static118.method2043(Static161.anInt3533 - local47, local6, Static20.anInt2218 - local42);
						}
						if (Static54.aClass86_1 != null && Static54.aClass86_1 != local6 && local194 && Static95.method1615(method676(local6))) {
							Static96.aClass86_6 = local6;
						}
						if (local6 == Static83.aClass86_5) {
							Static185.aBoolean438 = true;
							Static61.anInt1488 = local42;
							Static204.anInt2499 = local47;
						}
						if (local6.aBoolean277 || local6.anInt3285 != 0) {
							@Pc(318) Class1_Sub22 local318;
							if (local194 && Static178.anInt3882 != 0 && local6.anObjectArray15 != null) {
								local318 = new Class1_Sub22();
								local318.aBoolean304 = true;
								local318.aClass86_10 = local6;
								local318.anInt3444 = Static178.anInt3882;
								local318.anObjectArray33 = local6.anObjectArray15;
								Static146.aClass120_17.method3567(local318);
							}
							if (Static54.aClass86_1 != null || Static67.aClass86_4 != null || Static40.aBoolean81 || local6.anInt3285 != 1400 && Static141.aBoolean263) {
								local208 = false;
								local199 = false;
								local194 = false;
							}
							if (local6.anInt3285 != 0) {
								if (local6.anInt3285 == 1337) {
									Static158.aClass86_11 = local6;
									Static16.method354(local6);
									continue;
								}
								if (local6.anInt3285 == 1338) {
									if (local208) {
										Static3.method2854(Static20.anInt2218 - local42, Static161.anInt3533 - local47, local6);
									}
									continue;
								}
								if (local6.anInt3285 == 1400) {
									Static66.aClass86_3 = local6;
									if (local208) {
										if (Static132.aBooleanArray19[82] && Static156.anInt3417 > 0) {
											local232 = (int) ((double) (Static20.anInt2218 - local42 - local6.anInt3280 / 2) * 2.0D / (double) Static4.aFloat10);
											local235 = (int) ((double) (Static161.anInt3533 - local47 - local6.anInt3270 / 2) * 2.0D / (double) Static4.aFloat10);
											local243 = Static10.anInt284 + local232;
											@Pc(436) int local436 = Static114.anInt2509 + local235;
											@Pc(440) int local440 = local243 + Static101.anInt2179;
											@Pc(448) int local448 = Static152.anInt3375 + Static64.anInt1525 - local436 - 1;
											Static132.method2195(local448, 0, local440);
											Static54.method1091();
											continue;
										}
										Static141.aBoolean263 = true;
										Static199.anInt4324 = Static220.anInt4822;
										Static163.anInt3550 = Static181.anInt4311;
										Static138.anInt3057 = Static10.anInt284;
										Static30.anInt585 = Static114.anInt2509;
										continue;
									}
									if (local199 && Static141.aBoolean263) {
										Static86.method1494(Static138.anInt3057 + (int) ((double) (Static199.anInt4324 - Static220.anInt4822) * 2.0D / (double) Static24.aFloat2));
										Static107.method1858(Static30.anInt585 + (int) ((double) (Static163.anInt3550 - Static181.anInt4311) * 2.0D / (double) Static24.aFloat2));
										continue;
									}
									Static141.aBoolean263 = false;
									continue;
								}
								if (local6.anInt3285 == 1401) {
									if (local199) {
										Static86.method1492(local6.anInt3280, Static220.anInt4822 - local42, local6.anInt3270, Static181.anInt4311 - local47);
									}
									continue;
								}
								if (local6.anInt3285 == 1402) {
									Static16.method354(local6);
									continue;
								}
								if (local6.anInt3285 == 1404) {
									Static16.method354(local6);
									continue;
								}
							}
							if (!local6.aBoolean282 && local208) {
								local6.aBoolean282 = true;
								if (local6.anObjectArray22 != null) {
									local318 = new Class1_Sub22();
									local318.aBoolean304 = true;
									local318.aClass86_10 = local6;
									local318.anInt3447 = Static20.anInt2218 - local42;
									local318.anInt3444 = Static161.anInt3533 - local47;
									local318.anObjectArray33 = local6.anObjectArray22;
									Static146.aClass120_17.method3567(local318);
								}
							}
							if (local6.aBoolean282 && local199 && local6.anObjectArray9 != null) {
								local318 = new Class1_Sub22();
								local318.aBoolean304 = true;
								local318.aClass86_10 = local6;
								local318.anInt3447 = Static220.anInt4822 - local42;
								local318.anInt3444 = Static181.anInt4311 - local47;
								local318.anObjectArray33 = local6.anObjectArray9;
								Static146.aClass120_17.method3567(local318);
							}
							if (local6.aBoolean282 && !local199) {
								local6.aBoolean282 = false;
								if (local6.anObjectArray16 != null) {
									local318 = new Class1_Sub22();
									local318.aBoolean304 = true;
									local318.aClass86_10 = local6;
									local318.anInt3447 = Static220.anInt4822 - local42;
									local318.anInt3444 = Static181.anInt4311 - local47;
									local318.anObjectArray33 = local6.anObjectArray16;
									Static70.aClass120_8.method3567(local318);
								}
							}
							if (local199 && local6.anObjectArray19 != null) {
								local318 = new Class1_Sub22();
								local318.aBoolean304 = true;
								local318.aClass86_10 = local6;
								local318.anInt3447 = Static220.anInt4822 - local42;
								local318.anInt3444 = Static181.anInt4311 - local47;
								local318.anObjectArray33 = local6.anObjectArray19;
								Static146.aClass120_17.method3567(local318);
							}
							if (!local6.aBoolean279 && local194) {
								local6.aBoolean279 = true;
								if (local6.anObjectArray7 != null) {
									local318 = new Class1_Sub22();
									local318.aBoolean304 = true;
									local318.aClass86_10 = local6;
									local318.anInt3447 = Static220.anInt4822 - local42;
									local318.anInt3444 = Static181.anInt4311 - local47;
									local318.anObjectArray33 = local6.anObjectArray7;
									Static146.aClass120_17.method3567(local318);
								}
							}
							if (local6.aBoolean279 && local194 && local6.anObjectArray11 != null) {
								local318 = new Class1_Sub22();
								local318.aBoolean304 = true;
								local318.aClass86_10 = local6;
								local318.anInt3447 = Static220.anInt4822 - local42;
								local318.anInt3444 = Static181.anInt4311 - local47;
								local318.anObjectArray33 = local6.anObjectArray11;
								Static146.aClass120_17.method3567(local318);
							}
							if (local6.aBoolean279 && !local194) {
								local6.aBoolean279 = false;
								if (local6.anObjectArray26 != null) {
									local318 = new Class1_Sub22();
									local318.aBoolean304 = true;
									local318.aClass86_10 = local6;
									local318.anInt3447 = Static220.anInt4822 - local42;
									local318.anInt3444 = Static181.anInt4311 - local47;
									local318.anObjectArray33 = local6.anObjectArray26;
									Static70.aClass120_8.method3567(local318);
								}
							}
							if (local6.anObjectArray14 != null) {
								local318 = new Class1_Sub22();
								local318.aClass86_10 = local6;
								local318.anObjectArray33 = local6.anObjectArray14;
								Static91.aClass120_11.method3567(local318);
							}
							@Pc(872) Class1_Sub22 local872;
							if (local6.anObjectArray8 != null && Static133.anInt2874 > local6.anInt3221) {
								if (local6.anIntArray282 == null || Static133.anInt2874 - local6.anInt3221 > 32) {
									local318 = new Class1_Sub22();
									local318.aClass86_10 = local6;
									local318.anObjectArray33 = local6.anObjectArray8;
									Static146.aClass120_17.method3567(local318);
								} else {
									label531: for (local232 = local6.anInt3221; local232 < Static133.anInt2874; local232++) {
										local235 = Static201.anIntArray353[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray282.length; local243++) {
											if (local6.anIntArray282[local243] == local235) {
												local872 = new Class1_Sub22();
												local872.aClass86_10 = local6;
												local872.anObjectArray33 = local6.anObjectArray8;
												Static146.aClass120_17.method3567(local872);
												break label531;
											}
										}
									}
								}
								local6.anInt3221 = Static133.anInt2874;
							}
							if (local6.anObjectArray25 != null && Static73.anInt1674 > local6.anInt3216) {
								if (local6.anIntArray286 == null || Static73.anInt1674 - local6.anInt3216 > 32) {
									local318 = new Class1_Sub22();
									local318.aClass86_10 = local6;
									local318.anObjectArray33 = local6.anObjectArray25;
									Static146.aClass120_17.method3567(local318);
								} else {
									label507: for (local232 = local6.anInt3216; local232 < Static73.anInt1674; local232++) {
										local235 = Static157.anIntArray301[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray286.length; local243++) {
											if (local6.anIntArray286[local243] == local235) {
												local872 = new Class1_Sub22();
												local872.aClass86_10 = local6;
												local872.anObjectArray33 = local6.anObjectArray25;
												Static146.aClass120_17.method3567(local872);
												break label507;
											}
										}
									}
								}
								local6.anInt3216 = Static73.anInt1674;
							}
							if (local6.anObjectArray32 != null && Static173.anInt3758 > local6.anInt3289) {
								if (local6.anIntArray281 == null || Static173.anInt3758 - local6.anInt3289 > 32) {
									local318 = new Class1_Sub22();
									local318.aClass86_10 = local6;
									local318.anObjectArray33 = local6.anObjectArray32;
									Static146.aClass120_17.method3567(local318);
								} else {
									label483: for (local232 = local6.anInt3289; local232 < Static173.anInt3758; local232++) {
										local235 = Static36.anIntArray80[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray281.length; local243++) {
											if (local6.anIntArray281[local243] == local235) {
												local872 = new Class1_Sub22();
												local872.aClass86_10 = local6;
												local872.anObjectArray33 = local6.anObjectArray32;
												Static146.aClass120_17.method3567(local872);
												break label483;
											}
										}
									}
								}
								local6.anInt3289 = Static173.anInt3758;
							}
							if (local6.anObjectArray31 != null && Static151.anInt3341 > local6.anInt3240) {
								if (local6.anIntArray277 == null || Static151.anInt3341 - local6.anInt3240 > 32) {
									local318 = new Class1_Sub22();
									local318.aClass86_10 = local6;
									local318.anObjectArray33 = local6.anObjectArray31;
									Static146.aClass120_17.method3567(local318);
								} else {
									label459: for (local232 = local6.anInt3240; local232 < Static151.anInt3341; local232++) {
										local235 = Static70.anIntArray149[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray277.length; local243++) {
											if (local6.anIntArray277[local243] == local235) {
												local872 = new Class1_Sub22();
												local872.aClass86_10 = local6;
												local872.anObjectArray33 = local6.anObjectArray31;
												Static146.aClass120_17.method3567(local872);
												break label459;
											}
										}
									}
								}
								local6.anInt3240 = Static151.anInt3341;
							}
							if (local6.anObjectArray24 != null && Static86.anInt1901 > local6.anInt3211) {
								if (local6.anIntArray276 == null || Static86.anInt1901 - local6.anInt3211 > 32) {
									local318 = new Class1_Sub22();
									local318.aClass86_10 = local6;
									local318.anObjectArray33 = local6.anObjectArray24;
									Static146.aClass120_17.method3567(local318);
								} else {
									label435: for (local232 = local6.anInt3211; local232 < Static86.anInt1901; local232++) {
										local235 = Static92.anIntArray205[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray276.length; local243++) {
											if (local6.anIntArray276[local243] == local235) {
												local872 = new Class1_Sub22();
												local872.aClass86_10 = local6;
												local872.anObjectArray33 = local6.anObjectArray24;
												Static146.aClass120_17.method3567(local872);
												break label435;
											}
										}
									}
								}
								local6.anInt3211 = Static86.anInt1901;
							}
							if (Static36.anInt765 > local6.anInt3227 && local6.anObjectArray10 != null) {
								local318 = new Class1_Sub22();
								local318.aClass86_10 = local6;
								local318.anObjectArray33 = local6.anObjectArray10;
								Static146.aClass120_17.method3567(local318);
							}
							if (Static82.anInt1779 > local6.anInt3227 && local6.anObjectArray5 != null) {
								local318 = new Class1_Sub22();
								local318.aClass86_10 = local6;
								local318.anObjectArray33 = local6.anObjectArray5;
								Static146.aClass120_17.method3567(local318);
							}
							if (Static229.anInt4959 > local6.anInt3227 && local6.anObjectArray28 != null) {
								local318 = new Class1_Sub22();
								local318.aClass86_10 = local6;
								local318.anObjectArray33 = local6.anObjectArray28;
								Static146.aClass120_17.method3567(local318);
							}
							if (Static100.anInt2170 > local6.anInt3227 && local6.anObjectArray20 != null) {
								local318 = new Class1_Sub22();
								local318.aClass86_10 = local6;
								local318.anObjectArray33 = local6.anObjectArray20;
								Static146.aClass120_17.method3567(local318);
							}
							if (Static90.anInt1963 > local6.anInt3227 && local6.anObjectArray30 != null) {
								local318 = new Class1_Sub22();
								local318.aClass86_10 = local6;
								local318.anObjectArray33 = local6.anObjectArray30;
								Static146.aClass120_17.method3567(local318);
							}
							local6.anInt3227 = Static218.anInt4760;
							if (local6.anObjectArray4 != null) {
								for (local232 = 0; local232 < Static150.anInt3332; local232++) {
									@Pc(1340) Class1_Sub22 local1340 = new Class1_Sub22();
									local1340.aClass86_10 = local6;
									local1340.anInt3445 = Static81.anIntArray178[local232];
									local1340.anInt3446 = Static219.anIntArray369[local232];
									local1340.anObjectArray33 = local6.anObjectArray4;
									Static146.aClass120_17.method3567(local1340);
								}
							}
							if (Static227.aBoolean439 && local6.anObjectArray23 != null) {
								local318 = new Class1_Sub22();
								local318.aClass86_10 = local6;
								local318.anObjectArray33 = local6.anObjectArray23;
								Static146.aClass120_17.method3567(local318);
							}
						}
					}
					if (!local6.aBoolean280 && Static54.aClass86_1 == null && Static67.aClass86_4 == null && !Static40.aBoolean81) {
						if ((local6.anInt3263 >= 0 || local6.anInt3271 != 0) && Static220.anInt4822 >= local53 && Static181.anInt4311 >= local55 && Static220.anInt4822 < local57 && Static181.anInt4311 < local59) {
							if (local6.anInt3263 >= 0) {
								Static215.aClass86_16 = arg0[local6.anInt3263];
							} else {
								Static215.aClass86_16 = local6;
							}
						}
						if (local6.anInt3286 == 8 && Static220.anInt4822 >= local53 && Static181.anInt4311 >= local55 && Static220.anInt4822 < local57 && Static181.anInt4311 < local59) {
							Static146.aClass86_7 = local6;
						}
						if (local6.anInt3266 > local6.anInt3270) {
							Static204.method1967(local47, local6, Static181.anInt4311, local6.anInt3266, local6.anInt3270, Static220.anInt4822, local42 + local6.anInt3280);
						}
					}
					if (local6.anInt3286 == 0) {
						method673(arg0, local6.anInt3239, local53, local55, local57, local59, local42 - local6.anInt3256, local47 - local6.anInt3222);
						if (local6.aClass86Array1 != null) {
							method673(local6.aClass86Array1, local6.anInt3239, local53, local55, local57, local59, local42 - local6.anInt3256, local47 - local6.anInt3222);
						}
						@Pc(1507) Class1_Sub11 local1507 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local6.anInt3239);
						if (local1507 != null) {
							Static105.method1797(local47, local42, local55, local57, local53, local1507.anInt1575, local59);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!o;)I")
	public static int method676(@OriginalArg(0) Class86 arg0) {
		@Pc(13) Class1_Sub5 local13 = (Class1_Sub5) Static155.aClass50_8.method1364(((long) arg0.anInt3239 << 32) + (long) arg0.anInt3219);
		return local13 == null ? arg0.anInt3295 : local13.anInt782;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!o;)Z")
	public static boolean method677(@OriginalArg(0) Class86 arg0) {
		if (Static219.aBoolean426) {
			if (method676(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3286 == 0) {
				return false;
			}
		}
		return arg0.aBoolean275;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!o;)Lclient!o;")
	public static Class86 method680(@OriginalArg(0) Class86 arg0) {
		@Pc(4) int local4 = Static146.method2396(method676(arg0));
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static13.method333(arg0.anInt3225);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
