import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_5;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public static int anInt601;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!pa;")
	public static Class86 aClass86_9;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
	public static int anInt603;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!hh;")
	private static Class50 aClass50_225 = Static186.method3527("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_226 = aClass50_225;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "Lclient!oa;")
	public static Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_227 = Static186.method3527("(R");

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!hh;")
	public static Class50 aClass50_228 = Static186.method3527("<col=40ff00>");

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "S")
	public static short aShort1 = 205;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Lclient!md;")
	public static Class1_Sub17_Sub1 aClass1_Sub17_Sub1_1 = new Class1_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "S")
	public static short aShort2 = 32767;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "Lclient!hh;")
	private static Class50 aClass50_230 = Static186.method3527("Continue");

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_229 = aClass50_230;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "J")
	public static volatile long aLong28 = 0L;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
	public static int anInt604 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "()V")
	public static void method462() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static179.anInt3725; local1++) {
			for (local4 = 0; local4 < Static12.anInt236; local4++) {
				for (local7 = 0; local7 < Static232.anInt4450; local7++) {
					Static56.aClass1_Sub11ArrayArrayArray3[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static212.anInt4196; local4++) {
			Static233.aClass95Array2[local4] = null;
		}
		Static212.anInt4196 = 0;
		for (local7 = 0; local7 < Static158.anInt3271; local7++) {
			Static183.aClass94Array4[local7] = null;
		}
		Static158.anInt3271 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static136.aClass94Array3.length; local56++) {
			Static136.aClass94Array3[local56] = null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!ed;IZ)V")
	public static void method463(@OriginalArg(0) Class26 arg0, @OriginalArg(2) boolean arg1) {
		if (Static9.aClass26_1 != null) {
			try {
				Static9.aClass26_1.method776();
			} catch (@Pc(12) Exception local12) {
			}
			Static9.aClass26_1 = null;
		}
		Static9.aClass26_1 = arg0;
		Static106.method1638(arg1);
		Static152.aClass1_Sub1_Sub14_1 = null;
		Static139.aClass1_Sub17_3 = null;
		Static49.anInt1027 = 0;
		Static100.aClass1_Sub17_2.anInt2656 = 0;
		while (true) {
			@Pc(33) Class1_Sub1_Sub14 local33 = (Class1_Sub1_Sub14) Static23.aClass90_5.method2823();
			if (local33 == null) {
				while (true) {
					local33 = (Class1_Sub1_Sub14) Static144.aClass90_15.method2823();
					if (local33 == null) {
						if (Static34.aByte1 != 0) {
							try {
								@Pc(85) Class1_Sub17 local85 = new Class1_Sub17(4);
								local85.method2175(4);
								local85.method2175(Static34.aByte1);
								local85.method2151(0);
								Static9.aClass26_1.method781(local85.aByteArray40, 4);
							} catch (@Pc(108) IOException local108) {
								try {
									Static9.aClass26_1.method776();
								} catch (@Pc(113) Exception local113) {
								}
								Static165.anInt2647++;
								Static9.aClass26_1 = null;
							}
						}
						Static28.anInt546 = 0;
						Static52.aLong131 = Static179.method2941();
						return;
					}
					Static212.aClass121_5.method3379(local33);
					Static40.aClass90_7.method2817(local33, local33.aLong173);
					Static152.anInt3164--;
					Static212.anInt4194++;
				}
			}
			Static112.aClass90_9.method2817(local33, local33.aLong173);
			Static118.anInt2316--;
			Static65.anInt4133++;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!pg;I)V")
	public static void method465(@OriginalArg(0) Class1_Sub17 arg0) {
		while (arg0.aByteArray40.length > arg0.anInt2656) {
			@Pc(13) int local13 = 0;
			@Pc(15) boolean local15 = false;
			@Pc(17) int local17 = 0;
			if (arg0.method2142() == 1) {
				local15 = true;
				local13 = arg0.method2142();
				local17 = arg0.method2142();
			}
			@Pc(38) int local38 = arg0.method2142();
			@Pc(42) int local42 = arg0.method2142();
			@Pc(54) int local54 = Static195.anInt3969 + Static12.anInt239 - local42 * 64 - 1;
			@Pc(61) int local61 = local38 * 64 - Static121.anInt2393;
			@Pc(93) byte local93;
			@Pc(87) int local87;
			if (local61 >= 0 && local54 - 63 >= 0 && Static164.anInt3383 > local61 + 63 && Static12.anInt239 > local54) {
				local87 = local61 >> 6;
				@Pc(122) int local122 = local54 >> 6;
				for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
					for (@Pc(128) int local128 = 0; local128 < 64; local128++) {
						if (!local15 || local13 * 8 <= local124 && local13 * 8 + 8 > local124 && local128 >= local17 * 8 && local17 * 8 + 8 > local128) {
							local93 = arg0.method2155();
							if (local93 != 0) {
								if (Static182.aByteArrayArrayArray10[local87][local122] == null) {
									Static182.aByteArrayArrayArray10[local87][local122] = new byte[4096];
								}
								Static182.aByteArrayArrayArray10[local87][local122][local124 + (63 - local128 << 6)] = local93;
								@Pc(200) byte local200 = arg0.method2155();
								if (Static26.aByteArrayArrayArray3[local87][local122] == null) {
									Static26.aByteArrayArrayArray3[local87][local122] = new byte[4096];
								}
								Static26.aByteArrayArrayArray3[local87][local122][(63 - local128 << 6) + local124] = local200;
							}
						}
					}
				}
			} else {
				for (local87 = 0; local87 < (local15 ? 64 : 4096); local87++) {
					local93 = arg0.method2155();
					if (local93 != 0) {
						arg0.anInt2656++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIBIIII)V")
	public static void method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(10) int local10 = arg3 - arg1;
		@Pc(15) int local15 = arg4 - arg2;
		if (arg3 < Static164.anInt3383) {
			local10++;
		}
		if (Static12.anInt239 > arg4) {
			local15++;
		}
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(80) int local80;
		@Pc(90) int local90;
		@Pc(144) int local144;
		@Pc(149) int local149;
		@Pc(195) int local195;
		@Pc(206) int local206;
		@Pc(217) int local217;
		@Pc(222) int local222;
		@Pc(230) int local230;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(39) int local39 = local29 * arg5 >> 16;
			local49 = arg5 * (local29 + 1) >> 16;
			local54 = local49 - local39;
			if (local54 > 0) {
				local62 = local29 + arg1 >> 6;
				if (local62 >= 0 && local62 <= Static172.anIntArrayArrayArray11.length - 1) {
					local49 += arg7;
					@Pc(169) int[][] local169 = Static172.anIntArrayArrayArray11[local62];
					local39 += arg7;
					@Pc(177) byte[][] local177 = Static182.aByteArrayArrayArray10[local62];
					@Pc(181) byte[][] local181 = Static26.aByteArrayArrayArray3[local62];
					@Pc(185) byte[][] local185 = Static60.aByteArrayArrayArray4[local62];
					@Pc(189) byte[][] local189 = Static128.aByteArrayArrayArray8[local62];
					@Pc(193) byte[][] local193 = Static183.aByteArrayArrayArray11[local62];
					for (local195 = 0; local195 < local15; local195++) {
						local206 = local195 * arg0 >> 16;
						local217 = arg0 * (local195 + 1) >> 16;
						local222 = local217 - local206;
						if (local222 > 0) {
							local230 = local195 + arg2 >> 6;
							local217 += arg6;
							local206 += arg6;
							@Pc(244) int local244 = arg2 + local195 & 0x3F;
							@Pc(251) int local251 = local29 + arg1 & 0x3F;
							@Pc(257) int local257 = (local244 << 6) + local251;
							@Pc(279) int local279;
							if (local230 < 0 || local169.length - 1 < local230 || local169[local230] == null) {
								if (Static132.aClass1_Sub1_Sub6_1.anInt1125 != -1) {
									local279 = Static132.aClass1_Sub1_Sub6_1.anInt1125;
								} else if ((arg1 + local29 & 0x4) == (arg2 + local195 & 0x4)) {
									local279 = Static114.anIntArray256[Static105.anInt2096 + 1];
								} else {
									local279 = 4936552;
								}
								if (local230 < 0 || local169.length - 1 < local230) {
									if (local279 == 0) {
										local279 = 1;
									}
									Static29.method423(local39, local206, local54, local222, local279);
									continue;
								}
							} else {
								local279 = local169[local230][local257];
							}
							if (local279 == 0) {
								local279 = 1;
							}
							@Pc(362) int local362 = local177[local230] == null ? 0 : Static114.anIntArray256[local177[local230][local257] & 0xFF];
							@Pc(378) int local378 = local185[local230] == null ? 0 : Static114.anIntArray256[local185[local230][local257] & 0xFF];
							@Pc(414) int local414;
							if (local362 == 0 && local378 == 0) {
								Static29.method423(local39, local206, local54, local222, local279);
							} else {
								@Pc(410) byte local410;
								if (local362 != 0) {
									if (local362 == -1) {
										local362 = 1;
									}
									local410 = local181[local230] == null ? 0 : local181[local230][local257];
									local414 = local410 & 0xFC;
									if (local414 == 0 || local54 <= 1 || local222 <= 1) {
										Static29.method423(local39, local206, local54, local222, local362);
									} else {
										Static17.method253(local222, local39, local410 & 0x3, Static29.anIntArray59, local362, local414 >> 2, local206, local54, true, local279);
									}
								}
								if (local378 != 0) {
									if (local378 == -1) {
										local378 = local279;
									}
									local410 = local189[local230][local257];
									local414 = local410 & 0xFC;
									if (local414 == 0 || local54 <= 1 || local222 <= 1) {
										Static29.method423(local39, local206, local54, local222, local378);
									}
									Static17.method253(local222, local39, local410 & 0x3, Static29.anIntArray59, local378, local414 >> 2, local206, local54, local362 == 0, 0);
								}
							}
							if (local193[local230] != null) {
								@Pc(520) int local520 = local193[local230][local257] & 0xFF;
								if (local520 != 0) {
									if (local54 == 1) {
										local414 = local39;
									} else {
										local414 = local49 - 1;
									}
									@Pc(544) int local544;
									if (local222 == 1) {
										local544 = local206;
									} else {
										local544 = local217 - 1;
									}
									@Pc(550) int local550 = 13421772;
									if (local520 >= 5 && local520 <= 8 || local520 >= 13 && local520 <= 16 || local520 >= 21 && local520 <= 24 || local520 == 27 || local520 == 28) {
										local550 = 13369344;
										local520 -= 4;
									}
									if (local520 == 1) {
										Static29.method414(local39, local206, local222, local550);
									} else if (local520 == 2) {
										Static29.method415(local39, local206, local54, local550);
									} else if (local520 == 3) {
										Static29.method414(local414, local206, local222, local550);
									} else if (local520 == 4) {
										Static29.method415(local39, local544, local54, local550);
									} else if (local520 == 9) {
										Static29.method414(local39, local206, local222, 16777215);
										Static29.method415(local39, local206, local54, local550);
									} else if (local520 == 10) {
										Static29.method414(local414, local206, local222, 16777215);
										Static29.method415(local39, local206, local54, local550);
									} else if (local520 == 11) {
										Static29.method414(local414, local206, local222, 16777215);
										Static29.method415(local39, local544, local54, local550);
									} else if (local520 == 12) {
										Static29.method414(local39, local206, local222, 16777215);
										Static29.method415(local39, local544, local54, local550);
									} else if (local520 == 17) {
										Static29.method415(local39, local206, 1, local550);
									} else if (local520 == 18) {
										Static29.method415(local414, local206, 1, local550);
									} else if (local520 == 19) {
										Static29.method415(local414, local544, 1, local550);
									} else if (local520 == 20) {
										Static29.method415(local39, local544, 1, local550);
									} else {
										@Pc(733) int local733;
										if (local520 == 25) {
											for (local733 = 0; local733 < local222; local733++) {
												Static29.method415(local39 + local733, -local733 + local544, 1, local550);
											}
										} else if (local520 == 26) {
											for (local733 = 0; local733 < local222; local733++) {
												Static29.method415(local39 + local733, local733 + local206, 1, local550);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local39 += arg7;
					for (local80 = 0; local80 < local15; local80++) {
						if (Static132.aClass1_Sub1_Sub6_1.anInt1125 != -1) {
							local90 = Static132.aClass1_Sub1_Sub6_1.anInt1125;
						} else if ((local29 + arg1 & 0x4) == (arg2 + local80 & 0x4)) {
							local90 = Static114.anIntArray256[Static105.anInt2096 + 1];
						} else {
							local90 = 4936552;
						}
						@Pc(127) int local127 = (arg0 * local80 >> 16) + arg6;
						if (local90 == 0) {
							local90 = 1;
						}
						local144 = ((local80 + 1) * arg0 >> 16) + arg6;
						local149 = local144 - local127;
						Static29.method423(local39, local127, local54, local149, local90);
					}
				}
			}
		}
		for (local49 = -2; local49 < local10 + 2; local49++) {
			local54 = arg5 * local49 >> 16;
			local62 = arg5 * (local49 + 1) >> 16;
			local80 = local62 - local54;
			if (local80 > 0) {
				local90 = arg1 + local49 >> 6;
				local54 += arg7;
				if (local90 >= 0 && Static173.aShortArrayArrayArray1.length - 1 >= local90) {
					@Pc(869) short[][] local869 = Static173.aShortArrayArrayArray1[local90];
					for (local144 = -2; local144 < local15 + 2; local144++) {
						local149 = arg0 * local144 >> 16;
						@Pc(891) int local891 = arg0 * (local144 + 1) >> 16;
						local195 = local891 - local149;
						if (local195 > 0) {
							local149 += arg6;
							local206 = local144 + arg2 >> 6;
							if (local206 >= 0 && local206 <= local869.length - 1) {
								local217 = (arg1 + local49 & 0x3F) + ((arg2 + local144 & 0x3F) << 6);
								if (local869[local206] != null) {
									local222 = local869[local206][local217] & 0x3FFF;
									local230 = local869[local206][local217] >> 14 & 0x3;
									if (local222 != 0) {
										if (local230 == 0) {
											Static144.aClass78_Sub1Array4[local222 - 1].method3022(local54, local149, local80 * 2, local195 * 2);
										} else if (local230 == 1) {
											Static183.aClass78_Sub1Array5[local222 - 1].method3022(local54, local149, local80 * 2, local195 * 2);
										} else if (local230 == 2) {
											Static217.aClass78_Sub1Array8[local222 - 1].method3022(local54, local149, local80 * 2, local195 * 2);
										} else if (local230 == 3) {
											Static30.aClass78_Sub1Array1[local222 - 1].method3022(local54, local149, local80 * 2, local195 * 2);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
