import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!pe;")
	public static Class13 aClass13_21;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray30;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "Lclient!pe;")
	public static Class13 aClass13_22;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_856 = Static158.method3034(")1p");

	@OriginalMember(owner = "client!li", name = "l", descriptor = "[I")
	public static final int[] anIntArray348 = new int[4000];

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
	public static int method2403(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public static void method2404() {
		if (Static50.anInt1552 > 0) {
			Static50.anInt1552--;
		}
		if (Static96.anInt3098 > 1) {
			Static96.anInt3098--;
		}
		if (Static62.aBoolean79) {
			Static62.aBoolean79 = false;
			Static4.method69();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < 100 && Static76.method1853(); local30++) {
		}
		if (Static144.anInt3778 != 30) {
			return;
		}
		Static65.method1487(Static7.aClass2_Sub3_Sub1_43);
		@Pc(54) Object local54 = Static38.aClass31_1.anObject3;
		@Pc(82) int local82;
		@Pc(84) int local84;
		@Pc(86) int local86;
		@Pc(100) int local100;
		@Pc(119) int local119;
		synchronized (Static38.aClass31_1.anObject3) {
			if (!Static167.aBoolean162) {
				Static38.aClass31_1.anInt1933 = 0;
			} else if (Static147.anInt3820 != 0 || Static38.aClass31_1.anInt1933 >= 40) {
				Static7.aClass2_Sub3_Sub1_43.method244(101);
				Static7.aClass2_Sub3_Sub1_43.method224(0);
				local82 = Static7.aClass2_Sub3_Sub1_43.anInt273;
				local84 = 0;
				for (local86 = 0; Static38.aClass31_1.anInt1933 > local86 && Static7.aClass2_Sub3_Sub1_43.anInt273 - local82 < 240; local86++) {
					local100 = Static38.aClass31_1.anIntArray179[local86];
					local84++;
					if (local100 < 0) {
						local100 = 0;
					} else if (local100 > 502) {
						local100 = 502;
					}
					local119 = Static38.aClass31_1.anIntArray180[local86];
					if (local119 < 0) {
						local119 = 0;
					} else if (local119 > 764) {
						local119 = 764;
					}
					@Pc(138) int local138 = local119 + local100 * 765;
					if (Static38.aClass31_1.anIntArray179[local86] == -1 && Static38.aClass31_1.anIntArray180[local86] == -1) {
						local138 = 524287;
						local119 = -1;
						local100 = -1;
					}
					if (local119 != Static108.anInt3084 || local100 != Static14.anInt479) {
						@Pc(185) int local185 = local119 - Static108.anInt3084;
						Static108.anInt3084 = local119;
						@Pc(192) int local192 = local100 - Static14.anInt479;
						Static14.anInt479 = local100;
						if (Static54.anInt1749 < 8 && local185 >= -32 && local185 <= 31 && local192 >= -32 && local192 <= 31) {
							local192 += 32;
							local185 += 32;
							Static7.aClass2_Sub3_Sub1_43.method199((Static54.anInt1749 << 12) + (local185 << 6) + local192);
							Static54.anInt1749 = 0;
						} else if (Static54.anInt1749 < 8) {
							Static7.aClass2_Sub3_Sub1_43.method238((Static54.anInt1749 << 19) + local138 + 8388608);
							Static54.anInt1749 = 0;
						} else {
							Static7.aClass2_Sub3_Sub1_43.method197(local138 + (Static54.anInt1749 << 19) - 1073741824);
							Static54.anInt1749 = 0;
						}
					} else if (Static54.anInt1749 < 2047) {
						Static54.anInt1749++;
					}
				}
				Static7.aClass2_Sub3_Sub1_43.method200(Static7.aClass2_Sub3_Sub1_43.anInt273 - local82);
				if (local84 < Static38.aClass31_1.anInt1933) {
					Static38.aClass31_1.anInt1933 -= local84;
					for (local100 = 0; local100 < Static38.aClass31_1.anInt1933; local100++) {
						Static38.aClass31_1.anIntArray180[local100] = Static38.aClass31_1.anIntArray180[local84 + local100];
						Static38.aClass31_1.anIntArray179[local100] = Static38.aClass31_1.anIntArray179[local84 + local100];
					}
				} else {
					Static38.aClass31_1.anInt1933 = 0;
				}
			}
		}
		if (Static147.anInt3820 != 0) {
			local82 = Static174.anInt4254;
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 502) {
				local82 = 502;
			}
			local84 = Static74.anInt2294;
			@Pc(368) long local368 = (Static39.aLong34 - Static54.aLong48) / 50L;
			if (local368 > 4095L) {
				local368 = 4095L;
			}
			@Pc(376) byte local376 = 0;
			local119 = (int) local368;
			Static54.aLong48 = Static39.aLong34;
			if (Static147.anInt3820 == 2) {
				local376 = 1;
			}
			Static7.aClass2_Sub3_Sub1_43.method244(91);
			if (local84 < 0) {
				local84 = 0;
			} else if (local84 > 764) {
				local84 = 764;
			}
			local86 = local84 + local82 * 765;
			Static7.aClass2_Sub3_Sub1_43.method213((local119 << 20) + ((local376 << 19) + local86));
		}
		if (Static57.aBooleanArray7[96] || Static57.aBooleanArray7[97] || Static57.aBooleanArray7[98] || Static57.aBooleanArray7[99]) {
			Static14.aBoolean14 = true;
		}
		if (Static160.anInt1994 > 0) {
			Static160.anInt1994--;
		}
		if (Static14.aBoolean14 && Static160.anInt1994 <= 0) {
			Static14.aBoolean14 = false;
			Static160.anInt1994 = 20;
			Static7.aClass2_Sub3_Sub1_43.method244(60);
			Static7.aClass2_Sub3_Sub1_43.method199(Static138.anInt686);
			Static7.aClass2_Sub3_Sub1_43.method221(Static188.anInt4484);
		}
		if (Static101.aBoolean113 && !Static145.aBoolean144) {
			Static145.aBoolean144 = true;
			Static7.aClass2_Sub3_Sub1_43.method244(153);
			Static7.aClass2_Sub3_Sub1_43.method224(1);
		}
		if (!Static101.aBoolean113 && Static145.aBoolean144) {
			Static145.aBoolean144 = false;
			Static7.aClass2_Sub3_Sub1_43.method244(153);
			Static7.aClass2_Sub3_Sub1_43.method224(0);
		}
		Static150.method2966();
		if (Static144.anInt3778 != 30) {
			return;
		}
		Static163.method3072();
		Static108.method2416();
		Static46.anInt1433++;
		if (Static46.anInt1433 > 750) {
			Static4.method69();
			return;
		}
		Static106.method2396();
		Static161.method3038();
		Static125.method2641();
		Static35.anInt3071++;
		if (Static84.anInt2513 != 0) {
			Static10.anInt346 += 20;
			if (Static10.anInt346 >= 400) {
				Static84.anInt2513 = 0;
			}
		}
		if (Static172.aClass72_12 != null) {
			Static82.anInt2433++;
			if (Static82.anInt2433 >= 15) {
				Static39.method900(Static172.aClass72_12);
				Static172.aClass72_12 = null;
			}
		}
		if (Static131.aClass72_2 != null) {
			Static39.method900(Static131.aClass72_2);
			Static15.anInt506++;
			if (Static131.anInt215 > Static47.anInt2935 + 5 || Static47.anInt2935 - 5 > Static131.anInt215 || Static77.anInt2336 + 5 < Static157.anInt3985 || Static157.anInt3985 < Static77.anInt2336 - 5) {
				Static191.aBoolean181 = true;
			}
			if (Static113.anInt3165 == 0) {
				if (Static191.aBoolean181 && Static15.anInt506 >= 5) {
					if (Static75.aClass72_6 == Static131.aClass72_2 && Static157.anInt3993 != Static191.anInt4559) {
						@Pc(635) Class72 local635 = Static131.aClass72_2;
						@Pc(637) byte local637 = 0;
						if (Static161.anInt4012 == 1 && local635.anInt3884 == 206) {
							local637 = 1;
						}
						if (local635.anIntArray436[Static191.anInt4559] <= 0) {
							local637 = 0;
						}
						if (Static166.method3110(Static26.method637(local635))) {
							local84 = Static191.anInt4559;
							local82 = Static157.anInt3993;
							local635.anIntArray436[local84] = local635.anIntArray436[local82];
							local635.anIntArray430[local84] = local635.anIntArray430[local82];
							local635.anIntArray436[local82] = -1;
							local635.anIntArray430[local82] = 0;
						} else if (local637 == 1) {
							local82 = Static157.anInt3993;
							local84 = Static191.anInt4559;
							while (local84 != local82) {
								if (local84 < local82) {
									local635.method2975(local82, local82 - 1);
									local82--;
								} else if (local82 < local84) {
									local635.method2975(local82, local82 + 1);
									local82++;
								}
							}
						} else {
							local635.method2975(Static157.anInt3993, Static191.anInt4559);
						}
						Static7.aClass2_Sub3_Sub1_43.method244(107);
						Static7.aClass2_Sub3_Sub1_43.method213(Static131.aClass72_2.anInt3935);
						Static7.aClass2_Sub3_Sub1_43.method193(local637);
						Static7.aClass2_Sub3_Sub1_43.method221(Static191.anInt4559);
						Static7.aClass2_Sub3_Sub1_43.method236(Static157.anInt3993);
					}
				} else if ((Static131.anInt249 == 1 || Static55.method1328(Static169.anInt4148 - 1)) && Static169.anInt4148 > 2) {
					Static17.method428();
				} else if (Static169.anInt4148 > 0) {
					Static70.method1641(Static169.anInt4148 - 1);
				}
				Static82.anInt2433 = 10;
				Static131.aClass72_2 = null;
				Static147.anInt3820 = 0;
			}
		}
		Static122.aBoolean124 = false;
		Static168.aClass72_11 = null;
		Static147.anInt3824 = 0;
		Static100.aBoolean111 = false;
		@Pc(820) Class72 local820 = Static150.aClass72_8;
		Static150.aClass72_8 = null;
		@Pc(824) Class72 local824 = Static16.aClass72_3;
		Static16.aClass72_3 = null;
		while (Static142.method2877() && Static147.anInt3824 < 128) {
			Static4.anIntArray5[Static147.anInt3824] = Static74.anInt2295;
			Static187.anIntArray505[Static147.anInt3824] = Static162.anInt4046;
			Static147.anInt3824++;
		}
		if (Static18.anInt4401 != -1) {
			Static88.method2050(0, 0, 0, 765, 0, 503, Static18.anInt4401);
		}
		Static157.anInt3990++;
		while (true) {
			@Pc(873) Class72 local873;
			@Pc(868) Class2_Sub25 local868;
			@Pc(881) Class72 local881;
			do {
				local868 = (Class2_Sub25) Static41.aClass67_2.method2842();
				if (local868 == null) {
					while (true) {
						do {
							local868 = (Class2_Sub25) Static179.aClass67_11.method2842();
							if (local868 == null) {
								while (true) {
									do {
										local868 = (Class2_Sub25) Static196.aClass67_15.method2842();
										if (local868 == null) {
											if (Static62.aClass72_5 != null) {
												Static60.method1396();
											}
											if (Static179.anInt4364 != -1) {
												local84 = Static179.anInt4364;
												local86 = Static27.anInt829;
												@Pc(1039) boolean local1039 = Static145.method2926(0, 0, local84, local86, true, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
												Static179.anInt4364 = -1;
												if (local1039) {
													Static89.anInt2602 = Static74.anInt2294;
													Static84.anInt2513 = 1;
													Static10.anInt346 = 0;
													Static7.anInt4637 = Static174.anInt4254;
												}
											}
											Static106.method2398();
											if (local820 != Static150.aClass72_8) {
												if (local820 != null) {
													Static39.method900(local820);
												}
												if (Static150.aClass72_8 != null) {
													Static39.method900(Static150.aClass72_8);
												}
											}
											if (local824 != Static16.aClass72_3 && Static79.anInt2366 == Static192.anInt4590) {
												if (local824 != null) {
													Static39.method900(local824);
												}
												if (Static16.aClass72_3 != null) {
													Static39.method900(Static16.aClass72_3);
												}
											}
											if (Static16.aClass72_3 == null) {
												if (Static79.anInt2366 > 0) {
													Static79.anInt2366--;
												}
											} else if (Static79.anInt2366 < Static192.anInt4590) {
												Static79.anInt2366++;
												if (Static192.anInt4590 == Static79.anInt2366) {
													Static39.method900(Static16.aClass72_3);
												}
											}
											Static103.method2358();
											if (Static31.aBoolean40) {
												Static31.method766();
											}
											for (local84 = 0; local84 < 5; local84++) {
												@Pc(1126) int local1126 = Static151.anIntArray292[local84]++;
											}
											local86 = Static3.method54();
											local100 = Static104.method2368();
											if (local86 > 4500 && local100 > 4500) {
												Static50.anInt1552 = 250;
												Static191.method3499(4000);
												Static7.aClass2_Sub3_Sub1_43.method244(38);
											}
											Static101.anInt2916++;
											Static56.anInt1778++;
											Static153.anInt3922++;
											if (Static153.anInt3922 > 500) {
												Static153.anInt3922 = 0;
												local119 = (int) (Math.random() * 8.0D);
												if ((local119 & 0x2) == 2) {
													Static1.anInt1 += Static142.anInt3729;
												}
												if ((local119 & 0x1) == 1) {
													Static149.anInt3852 += Static188.anInt4478;
												}
												if ((local119 & 0x4) == 4) {
													Static193.anInt4599 += Static74.anInt2288;
												}
											}
											if (Static101.anInt2916 > 500) {
												Static101.anInt2916 = 0;
												local119 = (int) (Math.random() * 8.0D);
												if ((local119 & 0x1) == 1) {
													Static88.anInt2591 += Static131.anInt220;
												}
												if ((local119 & 0x2) == 2) {
													Static105.anInt3614 += Static84.anInt2511;
												}
											}
											if (Static193.anInt4599 < -40) {
												Static74.anInt2288 = 1;
											}
											if (Static193.anInt4599 > 40) {
												Static74.anInt2288 = -1;
											}
											if (Static88.anInt2591 < -60) {
												Static131.anInt220 = 2;
											}
											if (Static149.anInt3852 < -50) {
												Static188.anInt4478 = 2;
											}
											if (Static105.anInt3614 < -20) {
												Static84.anInt2511 = 1;
											}
											if (Static149.anInt3852 > 50) {
												Static188.anInt4478 = -2;
											}
											if (Static105.anInt3614 > 10) {
												Static84.anInt2511 = -1;
											}
											if (Static1.anInt1 < -55) {
												Static142.anInt3729 = 2;
											}
											if (Static88.anInt2591 > 60) {
												Static131.anInt220 = -2;
											}
											if (Static1.anInt1 > 55) {
												Static142.anInt3729 = -2;
											}
											if (Static56.anInt1778 > 50) {
												Static7.aClass2_Sub3_Sub1_43.method244(33);
											}
											try {
												if (Static29.aClass66_10 != null && Static7.aClass2_Sub3_Sub1_43.anInt273 > 0) {
													Static29.aClass66_10.method2838(Static7.aClass2_Sub3_Sub1_43.aByteArray4, Static7.aClass2_Sub3_Sub1_43.anInt273);
													Static56.anInt1778 = 0;
													Static7.aClass2_Sub3_Sub1_43.anInt273 = 0;
													return;
												}
												return;
											} catch (@Pc(1338) IOException local1338) {
												Static4.method69();
												return;
											}
										}
										local873 = local868.aClass72_15;
										if (local873.anInt3911 < 0) {
											break;
										}
										local881 = Static173.method3201(local873.anInt3937);
									} while (local881 == null || local881.aClass72Array1 == null || local873.anInt3911 >= local881.aClass72Array1.length || local881.aClass72Array1[local873.anInt3911] != local873);
									Static197.method3578(local868);
								}
							}
							local873 = local868.aClass72_15;
							if (local873.anInt3911 < 0) {
								break;
							}
							local881 = Static173.method3201(local873.anInt3937);
						} while (local881 == null || local881.aClass72Array1 == null || local873.anInt3911 >= local881.aClass72Array1.length || local873 != local881.aClass72Array1[local873.anInt3911]);
						Static197.method3578(local868);
					}
				}
				local873 = local868.aClass72_15;
				if (local873.anInt3911 < 0) {
					break;
				}
				local881 = Static173.method3201(local873.anInt3937);
			} while (local881 == null || local881.aClass72Array1 == null || local881.aClass72Array1.length <= local873.anInt3911 || local873 != local881.aClass72Array1[local873.anInt3911]);
			Static197.method3578(local868);
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	public static void method2406() {
		if (Static113.aClass8_2 != null) {
			Static113.aClass8_2.method2801();
		}
		if (Static31.aClass8_1 != null) {
			Static31.aClass8_1.method2801();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
	public static int method2407() {
		@Pc(7) int local7 = 3;
		if (Static19.anInt3094 < 310) {
			@Pc(16) int local16 = Static166.anInt4103 >> 7;
			@Pc(21) int local21 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 >> 7;
			@Pc(25) int local25 = Static161.anInt4013 >> 7;
			if ((Static147.aByteArrayArrayArray36[Static62.anInt1923][local25][local16] & 0x4) != 0) {
				local7 = Static62.anInt1923;
			}
			@Pc(42) int local42 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 >> 7;
			@Pc(50) int local50;
			if (local25 >= local21) {
				local50 = local25 - local21;
			} else {
				local50 = local21 - local25;
			}
			@Pc(69) int local69;
			if (local42 > local16) {
				local69 = local42 - local16;
			} else {
				local69 = local16 - local42;
			}
			@Pc(88) int local88;
			@Pc(90) int local90;
			if (local50 > local69) {
				local88 = local69 * 65536 / local50;
				local90 = 32768;
				while (local25 != local21) {
					if (local25 < local21) {
						local25++;
					} else if (local25 > local21) {
						local25--;
					}
					if ((Static147.aByteArrayArrayArray36[Static62.anInt1923][local25][local16] & 0x4) != 0) {
						local7 = Static62.anInt1923;
					}
					local90 += local88;
					if (local90 >= 65536) {
						local90 -= 65536;
						if (local42 > local16) {
							local16++;
						} else if (local16 > local42) {
							local16--;
						}
						if ((Static147.aByteArrayArrayArray36[Static62.anInt1923][local25][local16] & 0x4) != 0) {
							local7 = Static62.anInt1923;
						}
					}
				}
			} else {
				local90 = 32768;
				local88 = local50 * 65536 / local69;
				while (local16 != local42) {
					if (local42 > local16) {
						local16++;
					} else if (local16 > local42) {
						local16--;
					}
					local90 += local88;
					if ((Static147.aByteArrayArrayArray36[Static62.anInt1923][local25][local16] & 0x4) != 0) {
						local7 = Static62.anInt1923;
					}
					if (local90 >= 65536) {
						if (local25 < local21) {
							local25++;
						} else if (local21 < local25) {
							local25--;
						}
						if ((Static147.aByteArrayArrayArray36[Static62.anInt1923][local25][local16] & 0x4) != 0) {
							local7 = Static62.anInt1923;
						}
						local90 -= 65536;
					}
				}
			}
		}
		if ((Static147.aByteArrayArrayArray36[Static62.anInt1923][Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 >> 7][Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 >> 7] & 0x4) != 0) {
			local7 = Static62.anInt1923;
		}
		return local7;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ra;Z)Z")
	public static boolean method2408(@OriginalArg(0) Class72 arg0) {
		@Pc(11) int local11 = arg0.anInt3884;
		if (local11 == 205) {
			Static50.anInt1552 = 250;
			return true;
		}
		@Pc(36) int local36;
		@Pc(40) int local40;
		if (local11 >= 300 && local11 <= 313) {
			local36 = (local11 - 300) / 2;
			local40 = local11 & 0x1;
			Static130.aClass32_2.method1574(local36, local40 == 1);
		}
		if (local11 >= 314 && local11 <= 323) {
			local40 = local11 & 0x1;
			local36 = (local11 - 314) / 2;
			Static130.aClass32_2.method1583(local36, local40 == 1);
		}
		if (local11 == 324) {
			Static130.aClass32_2.method1573(false);
		}
		if (local11 == 325) {
			Static130.aClass32_2.method1573(true);
		}
		if (local11 == 326) {
			Static7.aClass2_Sub3_Sub1_43.method244(205);
			Static130.aClass32_2.method1577(Static7.aClass2_Sub3_Sub1_43);
			return true;
		} else {
			return false;
		}
	}
}
