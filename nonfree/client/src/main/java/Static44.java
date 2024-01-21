import java.io.IOException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!n;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!id;")
	private static Class34 aClass34_598 = Static9.method266("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_599 = aClass34_598;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_600 = Static9.method266("hel");

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!id;")
	public static Class34 aClass34_601 = Static9.method266(": ");

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public static int anInt1247 = 0;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "Z")
	public static volatile boolean aBoolean72 = true;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
	public static int anInt1248 = 0;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!id;")
	public static Class34 aClass34_602 = Static9.method266("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "[I")
	public static int[] anIntArray127 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_603 = Static9.method266("scrollen:");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Z")
	public static boolean method744() {
		@Pc(8) long local8 = Static35.method634();
		@Pc(14) int local14 = (int) (local8 - Static127.aLong111);
		if (local14 > 200) {
			local14 = 200;
		}
		Static127.aLong111 = local8;
		Static15.anInt600 += local14;
		if (Static109.anInt3092 == 0 && Static31.anInt926 == 0 && Static132.anInt3152 == 0 && Static11.anInt487 == 0) {
			return true;
		} else if (aClass51_2 == null) {
			return false;
		} else {
			try {
				if (Static15.anInt600 > 30000) {
					throw new IOException();
				}
				@Pc(61) Class1_Sub1_Sub9 local61;
				@Pc(66) Class1_Sub19 local66;
				while (Static31.anInt926 < 20 && Static11.anInt487 > 0) {
					local61 = (Class1_Sub1_Sub9) Static37.aClass48_6.method1337();
					local66 = new Class1_Sub19(4);
					local66.method2061(1);
					local66.method2082((int) local61.aLong162);
					aClass51_2.method1362(local66.aByteArray42, 4);
					Static34.aClass48_4.method1336(local61.aLong162, local61);
					Static11.anInt487--;
					Static31.anInt926++;
				}
				while (Static109.anInt3092 < 20 && Static132.anInt3152 > 0) {
					local61 = (Class1_Sub1_Sub9) Static91.aClass80_1.method1989();
					local66 = new Class1_Sub19(4);
					local66.method2061(0);
					local66.method2082((int) local61.aLong162);
					aClass51_2.method1362(local66.aByteArray42, 4);
					local61.method2004();
					Static96.aClass48_12.method1336(local61.aLong162, local61);
					Static109.anInt3092++;
					Static132.anInt3152--;
				}
				for (@Pc(160) int local160 = 0; local160 < 100; local160++) {
					@Pc(166) int local166 = aClass51_2.method1367();
					if (local166 < 0) {
						throw new IOException();
					}
					if (local166 == 0) {
						break;
					}
					Static15.anInt600 = 0;
					@Pc(181) byte local181 = 0;
					if (Static23.aClass1_Sub1_Sub9_1 == null) {
						local181 = 8;
					} else if (Static92.anInt2392 == 0) {
						local181 = 1;
					}
					@Pc(199) int local199;
					@Pc(216) int local216;
					@Pc(262) int local262;
					@Pc(277) int local277;
					if (local181 > 0) {
						local199 = local181 - Static43.aClass1_Sub19_2.anInt3111;
						if (local199 > local166) {
							local199 = local166;
						}
						aClass51_2.method1366(Static43.aClass1_Sub19_2.aByteArray42, local199, Static43.aClass1_Sub19_2.anInt3111);
						if (Static130.aByte5 != 0) {
							for (local216 = 0; local216 < local199; local216++) {
								Static43.aClass1_Sub19_2.aByteArray42[local216 + Static43.aClass1_Sub19_2.anInt3111] ^= Static130.aByte5;
							}
						}
						Static43.aClass1_Sub19_2.anInt3111 += local199;
						if (Static43.aClass1_Sub19_2.anInt3111 < local181) {
							break;
						}
						if (Static23.aClass1_Sub1_Sub9_1 == null) {
							Static43.aClass1_Sub19_2.anInt3111 = 0;
							local216 = Static43.aClass1_Sub19_2.method2072();
							local262 = Static43.aClass1_Sub19_2.method2051();
							@Pc(266) int local266 = Static43.aClass1_Sub19_2.method2072();
							@Pc(273) long local273 = (long) ((local216 << 16) + local262);
							local277 = Static43.aClass1_Sub19_2.method2046();
							@Pc(283) Class1_Sub1_Sub9 local283 = (Class1_Sub1_Sub9) Static34.aClass48_4.method1340(local273);
							Static128.aBoolean176 = true;
							if (local283 == null) {
								local283 = (Class1_Sub1_Sub9) Static96.aClass48_12.method1340(local273);
								Static128.aBoolean176 = false;
							}
							if (local283 == null) {
								throw new IOException();
							}
							@Pc(307) int local307 = local266 == 0 ? 5 : 9;
							Static23.aClass1_Sub1_Sub9_1 = local283;
							Static89.aClass1_Sub19_4 = new Class1_Sub19(Static23.aClass1_Sub1_Sub9_1.aByte8 + local307 + local277);
							Static89.aClass1_Sub19_4.method2061(local266);
							Static89.aClass1_Sub19_4.method2062(local277);
							Static92.anInt2392 = 8;
							Static43.aClass1_Sub19_2.anInt3111 = 0;
						} else if (Static92.anInt2392 == 0) {
							if (Static43.aClass1_Sub19_2.aByteArray42[0] == -1) {
								Static43.aClass1_Sub19_2.anInt3111 = 0;
								Static92.anInt2392 = 1;
							} else {
								Static23.aClass1_Sub1_Sub9_1 = null;
							}
						}
					} else {
						local199 = Static89.aClass1_Sub19_4.aByteArray42.length - Static23.aClass1_Sub1_Sub9_1.aByte8;
						local216 = 512 - Static92.anInt2392;
						if (local216 > local199 - Static89.aClass1_Sub19_4.anInt3111) {
							local216 = local199 - Static89.aClass1_Sub19_4.anInt3111;
						}
						if (local216 > local166) {
							local216 = local166;
						}
						aClass51_2.method1366(Static89.aClass1_Sub19_4.aByteArray42, local216, Static89.aClass1_Sub19_4.anInt3111);
						if (Static130.aByte5 != 0) {
							for (local262 = 0; local262 < local216; local262++) {
								Static89.aClass1_Sub19_4.aByteArray42[local262 + Static89.aClass1_Sub19_4.anInt3111] ^= Static130.aByte5;
							}
						}
						Static92.anInt2392 += local216;
						Static89.aClass1_Sub19_4.anInt3111 += local216;
						if (local199 == Static89.aClass1_Sub19_4.anInt3111) {
							if (Static23.aClass1_Sub1_Sub9_1.aLong162 == 16711935L) {
								Static128.aClass1_Sub19_6 = Static89.aClass1_Sub19_4;
								for (local262 = 0; local262 < 256; local262++) {
									@Pc(534) Class35_Sub1 local534 = Static126.aClass35_Sub1Array1[local262];
									if (local534 != null) {
										Static128.aClass1_Sub19_6.anInt3111 = local262 * 8 + 5;
										local277 = Static128.aClass1_Sub19_6.method2046();
										@Pc(551) int local551 = Static128.aClass1_Sub19_6.method2046();
										local534.method1585(local277, local551);
									}
								}
							} else {
								Static105.aCRC32_4.reset();
								Static105.aCRC32_4.update(Static89.aClass1_Sub19_4.aByteArray42, 0, local199);
								local262 = (int) Static105.aCRC32_4.getValue();
								if (local262 != Static23.aClass1_Sub1_Sub9_1.anInt2130) {
									try {
										aClass51_2.method1361();
									} catch (@Pc(480) Exception local480) {
									}
									aClass51_2 = null;
									Static74.anInt2021++;
									Static130.aByte5 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static74.anInt2021 = 0;
								Static102.anInt2570 = 0;
								Static23.aClass1_Sub1_Sub9_1.aClass35_Sub1_18.method1588((Static23.aClass1_Sub1_Sub9_1.aLong162 & 0xFF0000L) == 16711680L, (int) (Static23.aClass1_Sub1_Sub9_1.aLong162 & 0xFFFFL), Static128.aBoolean176, Static89.aClass1_Sub19_4.aByteArray42);
							}
							Static23.aClass1_Sub1_Sub9_1.method2039();
							Static89.aClass1_Sub19_4 = null;
							if (Static128.aBoolean176) {
								Static31.anInt926--;
							} else {
								Static109.anInt3092--;
							}
							Static92.anInt2392 = 0;
							Static23.aClass1_Sub1_Sub9_1 = null;
						} else {
							if (Static92.anInt2392 != 512) {
								break;
							}
							Static92.anInt2392 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(599) IOException local599) {
				try {
					aClass51_2.method1361();
				} catch (@Pc(604) Exception local604) {
				}
				Static102.anInt2570++;
				aClass51_2 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method745() {
		aClass34_599 = null;
		aClass34_603 = null;
		aClass34_602 = null;
		aLongArray4 = null;
		aClass34_601 = null;
		aClass34_598 = null;
		aCalendar1 = null;
		anIntArray126 = null;
		aClass34_600 = null;
		aClass51_2 = null;
		anIntArray127 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIII)V")
	public static void method746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static130.anInt1509 == 0 && !Static1.aBoolean14) {
			Static73.method1286(0, 21, Static81.aClass34_1058, arg0 - arg1, arg3 + -arg2, Static26.aClass34_420);
		}
		@Pc(29) int local29 = -1;
		for (@Pc(36) int local36 = 0; local36 < Static63.anInt1717; local36++) {
			@Pc(42) int local42 = Static63.anIntArray209[local36];
			@Pc(46) int local46 = local42 & 0x7F;
			@Pc(52) int local52 = local42 >> 29 & 0x3;
			@Pc(58) int local58 = local42 >> 7 & 0x7F;
			@Pc(64) int local64 = local42 >> 14 & 0x7FFF;
			if (local29 != local42) {
				local29 = local42;
				@Pc(120) int local120;
				if (local52 == 2 && Static39.aClass44_1.method1138(Static42.anInt1208, local46, local58, local42) >= 0) {
					@Pc(87) Class1_Sub1_Sub16 local87 = Static28.method2008(local64);
					if (local87.anIntArray366 != null) {
						local87 = local87.method1958();
					}
					if (local87 == null) {
						continue;
					}
					if (Static130.anInt1509 == 1) {
						Static73.method1286(local42, 6, Static91.method1554(new Class34[] { Static74.aClass34_1001, Static54.aClass34_737, local87.aClass34_1529 }), local46, local58, Static72.aClass34_922);
					} else if (!Static1.aBoolean14) {
						@Pc(106) Class34[] local106 = local87.aClass34Array23;
						if (Static11.aBoolean25) {
							local106 = Static17.method385(local106);
						}
						if (local106 != null) {
							for (local120 = 4; local120 >= 0; local120--) {
								if (local106[local120] != null) {
									@Pc(132) short local132 = 0;
									if (local120 == 0) {
										local132 = 18;
									}
									if (local120 == 1) {
										local132 = 44;
									}
									if (local120 == 2) {
										local132 = 24;
									}
									if (local120 == 3) {
										local132 = 19;
									}
									if (local120 == 4) {
										local132 = 1005;
									}
									Static73.method1286(local42, local132, Static91.method1554(new Class34[] { Static90.aClass34_1582, local87.aClass34_1529 }), local46, local58, local106[local120]);
								}
							}
						}
						Static73.method1286(local87.anInt2969 << 14, 1007, Static91.method1554(new Class34[] { Static90.aClass34_1582, local87.aClass34_1529 }), local46, local58, Static128.aClass34_1545);
					} else if ((Static5.anInt362 & 0x4) == 4) {
						Static73.method1286(local42, 11, Static91.method1554(new Class34[] { Static51.aClass34_719, Static54.aClass34_737, local87.aClass34_1529 }), local46, local58, Static32.aClass34_700);
					}
				}
				@Pc(307) int local307;
				@Pc(315) Class1_Sub1_Sub1_Sub1_Sub2 local315;
				@Pc(362) Class1_Sub1_Sub1_Sub1_Sub1 local362;
				if (local52 == 1) {
					@Pc(286) Class1_Sub1_Sub1_Sub1_Sub2 local286 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local64];
					if (local286.aClass1_Sub1_Sub17_1.anInt3042 == 1 && (local286.anInt1428 & 0x7F) == 64 && (local286.anInt1405 & 0x7F) == 64) {
						for (local307 = 0; local307 < Static64.anInt1731; local307++) {
							local315 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray19[local307]];
							if (local315 != null && local286 != local315 && local315.aClass1_Sub1_Sub17_1.anInt3042 == 1 && local315.anInt1428 == local286.anInt1428 && local315.anInt1405 == local286.anInt1405) {
								Static41.method699(local58, local46, local315.aClass1_Sub1_Sub17_1, Static1.anIntArray19[local307]);
							}
						}
						for (local120 = 0; local120 < Static40.anInt1154; local120++) {
							local362 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static102.anIntArray321[local120]];
							if (local362 != null && local362.anInt1428 == local286.anInt1428 && local362.anInt1405 == local286.anInt1405) {
								Static14.method349(Static102.anIntArray321[local120], local362, local58, local46);
							}
						}
					}
					Static41.method699(local58, local46, local286.aClass1_Sub1_Sub17_1, local64);
				}
				if (local52 == 0) {
					@Pc(403) Class1_Sub1_Sub1_Sub1_Sub1 local403 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local64];
					if ((local403.anInt1428 & 0x7F) == 64 && (local403.anInt1405 & 0x7F) == 64) {
						for (local307 = 0; local307 < Static64.anInt1731; local307++) {
							local315 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray19[local307]];
							if (local315 != null && local315.aClass1_Sub1_Sub17_1.anInt3042 == 1 && local315.anInt1428 == local403.anInt1428 && local403.anInt1405 == local315.anInt1405) {
								Static41.method699(local58, local46, local315.aClass1_Sub1_Sub17_1, Static1.anIntArray19[local307]);
							}
						}
						for (local120 = 0; local120 < Static40.anInt1154; local120++) {
							local362 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static102.anIntArray321[local120]];
							if (local362 != null && local362 != local403 && local362.anInt1428 == local403.anInt1428 && local403.anInt1405 == local362.anInt1405) {
								Static14.method349(Static102.anIntArray321[local120], local362, local58, local46);
							}
						}
					}
					Static14.method349(local64, local403, local58, local46);
				}
				if (local52 == 3) {
					@Pc(525) Class38 local525 = Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local46][local58];
					if (local525 != null) {
						for (@Pc(532) Class1_Sub1_Sub1_Sub5 local532 = (Class1_Sub1_Sub1_Sub5) local525.method1048(); local532 != null; local532 = (Class1_Sub1_Sub1_Sub5) local525.method1033()) {
							@Pc(539) Class1_Sub1_Sub8 local539 = Static74.method1334(local532.anInt2208);
							if (Static130.anInt1509 == 1) {
								Static73.method1286(local532.anInt2208, 1, Static91.method1554(new Class34[] { Static74.aClass34_1001, Static123.aClass34_1503, local539.aClass34_1002 }), local46, local58, Static72.aClass34_922);
							} else if (!Static1.aBoolean14) {
								@Pc(583) Class34[] local583 = local539.aClass34Array18;
								if (Static11.aBoolean25) {
									local583 = Static17.method385(local583);
								}
								for (@Pc(595) int local595 = 4; local595 >= 0; local595--) {
									if (local583 != null && local583[local595] != null) {
										@Pc(637) byte local637 = 0;
										if (local595 == 0) {
											local637 = 42;
										}
										if (local595 == 1) {
											local637 = 58;
										}
										if (local595 == 2) {
											local637 = 4;
										}
										if (local595 == 3) {
											local637 = 45;
										}
										if (local595 == 4) {
											local637 = 12;
										}
										Static73.method1286(local532.anInt2208, local637, Static91.method1554(new Class34[] { Static112.aClass34_1353, local539.aClass34_1002 }), local46, local58, local583[local595]);
									} else if (local595 == 2) {
										Static73.method1286(local532.anInt2208, 4, Static91.method1554(new Class34[] { Static112.aClass34_1353, local539.aClass34_1002 }), local46, local58, Static11.aClass34_249);
									}
								}
								Static73.method1286(local532.anInt2208, 1003, Static91.method1554(new Class34[] { Static112.aClass34_1353, local539.aClass34_1002 }), local46, local58, Static128.aClass34_1545);
							} else if ((Static5.anInt362 & 0x1) == 1) {
								Static73.method1286(local532.anInt2208, 36, Static91.method1554(new Class34[] { Static51.aClass34_719, Static123.aClass34_1503, local539.aClass34_1002 }), local46, local58, Static32.aClass34_700);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILclient!id;)V")
	public static void method747(@OriginalArg(1) int arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(19) Class34 local19 = arg1.method966().method969();
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < Static40.anInt1154; local23++) {
			@Pc(31) Class1_Sub1_Sub1_Sub1_Sub1 local31 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static102.anIntArray321[local23]];
			if (local31 != null && local31.aClass34_97 != null && local31.aClass34_97.method961(local19)) {
				local21 = true;
				Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, local31.anIntArray149[0], false, 0, local31.anIntArray147[0], 0, 1);
				if (arg0 == 1) {
					Static21.aClass1_Sub19_Sub1_1.method2105(140);
					Static21.aClass1_Sub19_Sub1_1.method2088(Static102.anIntArray321[local23]);
				} else if (arg0 == 4) {
					Static21.aClass1_Sub19_Sub1_1.method2105(245);
					Static21.aClass1_Sub19_Sub1_1.method2043(Static102.anIntArray321[local23]);
				} else if (arg0 == 6) {
					Static21.aClass1_Sub19_Sub1_1.method2105(229);
					Static21.aClass1_Sub19_Sub1_1.method2067(Static102.anIntArray321[local23]);
				} else if (arg0 == 7) {
					Static21.aClass1_Sub19_Sub1_1.method2105(7);
					Static21.aClass1_Sub19_Sub1_1.method2088(Static102.anIntArray321[local23]);
				}
				break;
			}
		}
		if (!local21) {
			Static39.method685(Static81.aClass34_1058, 0, Static91.method1554(new Class34[] { Static37.aClass34_509, local19 }));
		}
	}
}
