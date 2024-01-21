import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!ef;")
	public static Class16 aClass16_139;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static int anInt3050;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "Lclient!he;")
	private static Class26 aClass26_1629 = Static6.method100("Please wait)3)3)3");

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!he;")
	public static Class26 aClass26_1627 = aClass26_1629;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_1628 = Static6.method100("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public static int anInt3045 = 0;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public static volatile int anInt3047 = 0;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public static int anInt3048 = 0;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	public static int anInt3051 = 127;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!nc;)V")
	public static void method2081(@OriginalArg(1) Class3_Sub14 arg0) {
		@Pc(6) int local6 = arg0.anInt2186;
		if (local6 == 324) {
			if (Static74.anInt2082 == -1) {
				Static74.anInt2082 = arg0.anInt2141;
				Static101.anInt2762 = arg0.anInt2187;
			}
			if (Static119.aClass35_2.aBoolean91) {
				arg0.anInt2141 = Static74.anInt2082;
			} else {
				arg0.anInt2141 = Static101.anInt2762;
			}
		} else if (local6 == 325) {
			if (Static74.anInt2082 == -1) {
				Static101.anInt2762 = arg0.anInt2187;
				Static74.anInt2082 = arg0.anInt2141;
			}
			if (Static119.aClass35_2.aBoolean91) {
				arg0.anInt2141 = Static101.anInt2762;
			} else {
				arg0.anInt2141 = Static74.anInt2082;
			}
		} else if (local6 == 327) {
			arg0.anInt2179 = 150;
			arg0.anInt2192 = (int) (Math.sin((double) Static4.anInt136 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2134 = 5;
			arg0.anInt2201 = 0;
		} else if (local6 == 328) {
			arg0.anInt2179 = 150;
			arg0.anInt2192 = (int) (Math.sin((double) Static4.anInt136 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2134 = 5;
			arg0.anInt2201 = 1;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!nc;II)V")
	public static void method2082(@OriginalArg(1) Class3_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt2153 == 1) {
			Static24.method514(Static22.aClass26_415, arg0.anInt2154, 0, 24, 0, arg0.aClass26_1117);
		}
		if (arg0.anInt2153 == 2 && !Static117.aBoolean169) {
			@Pc(35) Class26 local35 = Static120.method2151(arg0);
			if (local35 != null) {
				Static24.method514(Static119.method2136(new Class26[] { Static80.aClass26_1120, arg0.aClass26_1115 }), arg0.anInt2154, -1, 5, 0, local35);
			}
		}
		if (arg0.anInt2153 == 3) {
			Static24.method514(Static22.aClass26_415, arg0.anInt2154, 0, 51, 0, Static21.aClass26_392);
		}
		if (arg0.anInt2153 == 4) {
			Static24.method514(Static22.aClass26_415, arg0.anInt2154, 0, 8, 0, arg0.aClass26_1117);
		}
		if (arg0.anInt2153 == 5) {
			Static24.method514(Static22.aClass26_415, arg0.anInt2154, 0, 33, 0, arg0.aClass26_1117);
		}
		if (arg0.anInt2153 == 6 && Static79.aClass3_Sub14_8 == null) {
			Static24.method514(Static22.aClass26_415, arg0.anInt2154, -1, 19, 0, arg0.aClass26_1117);
		}
		@Pc(149) int local149;
		@Pc(155) int local155;
		if (arg0.anInt2204 == 2) {
			local149 = 0;
			for (@Pc(151) int local151 = 0; local151 < arg0.anInt2161; local151++) {
				for (local155 = 0; local155 < arg0.anInt2146; local155++) {
					@Pc(165) int local165 = local155 * (arg0.anInt2163 + 32);
					@Pc(173) int local173 = local151 * (arg0.anInt2190 + 32);
					if (local149 < 20) {
						local173 += arg0.anIntArray219[local149];
						local165 += arg0.anIntArray216[local149];
					}
					if (arg2 >= local165 && arg1 >= local173 && arg2 < local165 + 32 && local173 + 32 > arg1) {
						Static55.anInt1650 = local149;
						Static66.aClass3_Sub14_12 = arg0;
						if (arg0.anIntArray214[local149] > 0) {
							@Pc(238) Class3_Sub1_Sub9 local238 = Static117.method2099(arg0.anIntArray214[local149] - 1);
							if (Static3.anInt89 == 1 && Static130.method2256(Static89.method1641(arg0))) {
								if (arg0.anInt2154 != Static93.anInt2530 || local149 != Static67.anInt2802) {
									Static24.method514(Static119.method2136(new Class26[] { Static102.aClass26_1505, Static66.aClass26_1280, local238.aClass26_857 }), arg0.anInt2154, local149, 23, local238.anInt1674, Static93.aClass26_1343);
								}
							} else if (!Static117.aBoolean169 || !Static130.method2256(Static89.method1641(arg0))) {
								@Pc(307) Class26[] local307 = local238.aClass26Array14;
								if (Static95.aBoolean145) {
									local307 = Static16.method271(local307);
								}
								@Pc(321) int local321;
								@Pc(369) byte local369;
								if (Static130.method2256(Static89.method1641(arg0))) {
									for (local321 = 4; local321 >= 3; local321--) {
										if (local307 != null && local307[local321] != null) {
											if (local321 == 3) {
												local369 = 41;
											} else {
												local369 = 45;
											}
											Static24.method514(Static119.method2136(new Class26[] { Static102.aClass26_1501, local238.aClass26_857 }), arg0.anInt2154, local149, local369, local238.anInt1674, local307[local321]);
										} else if (local321 == 4) {
											Static24.method514(Static119.method2136(new Class26[] { Static102.aClass26_1501, local238.aClass26_857 }), arg0.anInt2154, local149, 45, local238.anInt1674, Static39.aClass26_642);
										}
									}
								}
								if (Static8.method117(Static89.method1641(arg0))) {
									Static24.method514(Static119.method2136(new Class26[] { Static102.aClass26_1501, local238.aClass26_857 }), arg0.anInt2154, local149, 50, local238.anInt1674, Static93.aClass26_1343);
								}
								if (Static130.method2256(Static89.method1641(arg0)) && local307 != null) {
									for (local321 = 2; local321 >= 0; local321--) {
										if (local307[local321] != null) {
											local369 = 0;
											if (local321 == 0) {
												local369 = 37;
											}
											if (local321 == 1) {
												local369 = 28;
											}
											if (local321 == 2) {
												local369 = 4;
											}
											Static24.method514(Static119.method2136(new Class26[] { Static102.aClass26_1501, local238.aClass26_857 }), arg0.anInt2154, local149, local369, local238.anInt1674, local307[local321]);
										}
									}
								}
								local307 = arg0.aClass26Array18;
								if (Static95.aBoolean145) {
									local307 = Static16.method271(local307);
								}
								if (local307 != null) {
									for (local321 = 4; local321 >= 0; local321--) {
										if (local307[local321] != null) {
											local369 = 0;
											if (local321 == 0) {
												local369 = 29;
											}
											if (local321 == 1) {
												local369 = 39;
											}
											if (local321 == 2) {
												local369 = 20;
											}
											if (local321 == 3) {
												local369 = 21;
											}
											if (local321 == 4) {
												local369 = 31;
											}
											Static24.method514(Static119.method2136(new Class26[] { Static102.aClass26_1501, local238.aClass26_857 }), arg0.anInt2154, local149, local369, local238.anInt1674, local307[local321]);
										}
									}
								}
								Static24.method514(Static119.method2136(new Class26[] { Static102.aClass26_1501, local238.aClass26_857 }), arg0.anInt2154, local149, 1002, local238.anInt1674, Static52.aClass26_810);
							} else if ((Static57.anInt1731 & 0x10) == 16) {
								Static24.method514(Static119.method2136(new Class26[] { Static8.aClass26_114, Static66.aClass26_1280, local238.aClass26_857 }), arg0.anInt2154, local149, 40, local238.anInt1674, Static132.aClass26_1815);
							}
						}
					}
					local149++;
				}
			}
		}
		if (!arg0.aBoolean113) {
			return;
		}
		if (Static117.aBoolean169) {
			if (Static124.method2190(Static89.method1641(arg0)) && (Static57.anInt1731 & 0x20) == 32) {
				Static24.method514(Static119.method2136(new Class26[] { Static8.aClass26_114, Static7.aClass26_109, arg0.aClass26_1114 }), arg0.anInt2154, arg0.anInt2150, 49, 0, Static132.aClass26_1815);
				return;
			}
			return;
		}
		@Pc(720) Class26 local720;
		for (local149 = 9; local149 >= 5; local149--) {
			local720 = Static61.method1201(arg0, local149);
			if (local720 != null) {
				Static24.method514(arg0.aClass26_1114, arg0.anInt2154, arg0.anInt2150, 1006, local149 + 1, local720);
			}
		}
		local720 = Static120.method2151(arg0);
		if (local720 != null) {
			Static24.method514(arg0.aClass26_1114, arg0.anInt2154, arg0.anInt2150, 5, 0, local720);
		}
		for (local155 = 4; local155 >= 0; local155--) {
			@Pc(775) Class26 local775 = Static61.method1201(arg0, local155);
			if (local775 != null) {
				Static24.method514(arg0.aClass26_1114, arg0.anInt2154, arg0.anInt2150, 10, local155 + 1, local775);
			}
		}
		if (Static10.method165(Static89.method1641(arg0))) {
			Static24.method514(Static22.aClass26_415, arg0.anInt2154, arg0.anInt2150, 19, 0, Static56.aClass26_853);
			return;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!ba;")
	public static Class3_Sub1_Sub3 method2083(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub3 local10 = (Class3_Sub1_Sub3) Static94.aClass66_22.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static48.aClass16_69.method566(9, arg0);
		local10 = new Class3_Sub1_Sub3();
		local10.anInt245 = arg0;
		if (local20 != null) {
			local10.method135(new Class3_Sub11(local20));
		}
		local10.method134();
		Static94.aClass66_22.method1969((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(ILclient!nc;)Lclient!nc;")
	public static Class3_Sub14 method2084(@OriginalArg(1) Class3_Sub14 arg0) {
		@Pc(7) Class3_Sub14 local7 = Static6.method96(arg0);
		if (local7 == null) {
			local7 = arg0.aClass3_Sub14_9;
		}
		return local7;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method2085() {
		Static98.aBoolean151 = false;
		Static112.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	public static void method2086() {
		aClass16_139 = null;
		aClass26_1629 = null;
		aClass26_1627 = null;
		aClass26_1628 = null;
	}
}
