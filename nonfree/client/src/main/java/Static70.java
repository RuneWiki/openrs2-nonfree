import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
	public static int[] anIntArray252 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!la", name = "e", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array12 = new Class61[100];

	@OriginalMember(owner = "client!la", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[50][];

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!r;")
	private static Class61 aClass61_517 = Static129.method2060(" more options");

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_516 = aClass61_517;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "[J")
	public static long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIILclient!wa;III[Lclient!sc;[B)V")
	public static void method1155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class81 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class66[] arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(6) Class5_Sub14 local6 = new Class5_Sub14(arg9);
		@Pc(8) int local8 = -1;
		while (true) {
			@Pc(17) int local17 = local6.method1455();
			if (local17 == 0) {
				return;
			}
			local8 += local17;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local6.method1455();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local6.method1471();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (arg5 == local54 && local50 >= arg2 && local50 < arg2 + 8 && arg3 <= local44 && local44 < arg3 + 8) {
					@Pc(97) Class5_Sub2_Sub16 local97 = Static43.method767(local8);
					@Pc(114) int local114 = Static22.method485(local97.anInt3126, local66, local97.anInt3120, local44 & 0x7, arg1, local50 & 0x7) + arg0;
					@Pc(131) int local131 = Static93.method1601(local50 & 0x7, local97.anInt3126, local66, local97.anInt3120, arg1, local44 & 0x7) + arg6;
					if (local114 > 0 && local131 > 0 && local114 < 103 && local131 < 103) {
						@Pc(150) int local150 = arg7;
						if ((Static30.aByteArrayArrayArray2[1][local114][local131] & 0x2) == 2) {
							local150 = arg7 - 1;
						}
						@Pc(166) Class66 local166 = null;
						if (local150 >= 0) {
							local166 = arg8[local150];
						}
						Static24.method500(local131, arg4, arg7, local166, arg1 + local66 & 0x3, local8, local114, local62);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method1156() {
		aByteArrayArray8 = null;
		aClass61Array12 = null;
		aLongArray4 = null;
		aClass61_517 = null;
		aClass61_516 = null;
		anIntArray252 = null;
		anIntArray253 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V")
	public static void method1157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static2.anInt23 != 0 && Static2.anInt23 != 3 || Static75.anInt1772 != 1) {
			return;
		}
		@Pc(26) int local26 = Static26.anInt613 - arg0 - 25;
		@Pc(32) int local32 = Static12.anInt308 - arg1 - 5;
		if (local26 < 0 || local32 < 0 || local26 >= 146 || local32 >= 151) {
			return;
		}
		local26 -= 73;
		local32 -= 75;
		@Pc(54) int local54 = Static129.anInt3240 + Static91.anInt2422 & 0x7FF;
		@Pc(58) int local58 = Class5_Sub2_Sub1_Sub2.anIntArray197[local54];
		@Pc(62) int local62 = Class5_Sub2_Sub1_Sub2.anIntArray198[local54];
		@Pc(70) int local70 = local62 * (Static129.anInt3235 + 256) >> 8;
		@Pc(78) int local78 = local58 * (Static129.anInt3235 + 256) >> 8;
		@Pc(89) int local89 = local78 * local32 - local70 * local26 >> 11;
		@Pc(99) int local99 = local70 * local32 + local26 * local78 >> 11;
		@Pc(107) int local107 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 - local89 >> 7;
		@Pc(115) int local115 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 + local99 >> 7;
		@Pc(135) boolean local135 = Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local115, local107, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 1, true, 0, 0, 0, 0);
		if (!local135) {
			return;
		}
		Static1.aClass5_Sub14_Sub1_1.method1440(local26);
		Static1.aClass5_Sub14_Sub1_1.method1440(local32);
		Static1.aClass5_Sub14_Sub1_1.method1468(Static91.anInt2422);
		Static1.aClass5_Sub14_Sub1_1.method1440(57);
		Static1.aClass5_Sub14_Sub1_1.method1440(Static129.anInt3240);
		Static1.aClass5_Sub14_Sub1_1.method1440(Static129.anInt3235);
		Static1.aClass5_Sub14_Sub1_1.method1440(89);
		Static1.aClass5_Sub14_Sub1_1.method1468(Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912);
		Static1.aClass5_Sub14_Sub1_1.method1468(Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875);
		Static1.aClass5_Sub14_Sub1_1.method1440(Static90.anInt2402);
		Static1.aClass5_Sub14_Sub1_1.method1440(63);
		return;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1158() {
		Static60.aClass29_15.method765();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1160() {
		if (Static50.anInt1261 > 0) {
			Static50.anInt1261--;
		}
		if (Static88.anInt3387 > 1) {
			Static88.anInt3387--;
		}
		if (Static83.aBoolean78) {
			Static83.aBoolean78 = false;
			Static1.method7();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static17.method396(); local32++) {
		}
		if (Static24.anInt723 != 30) {
			return;
		}
		Static125.method1963(Static1.aClass5_Sub14_Sub1_1);
		@Pc(56) Object local56 = Static47.aClass15_1.anObject3;
		@Pc(93) int local93;
		@Pc(90) int local90;
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(128) int local128;
		synchronized (Static47.aClass15_1.anObject3) {
			if (!Static120.aBoolean108) {
				Static47.aClass15_1.anInt643 = 0;
			} else if (Static75.anInt1772 != 0 || Static47.aClass15_1.anInt643 >= 40) {
				Static1.aClass5_Sub14_Sub1_1.method1489(155);
				Static1.aClass5_Sub14_Sub1_1.method1440(0);
				local90 = 0;
				local93 = Static1.aClass5_Sub14_Sub1_1.anInt2199;
				for (local95 = 0; local95 < Static47.aClass15_1.anInt643 && Static1.aClass5_Sub14_Sub1_1.anInt2199 - local93 < 240; local95++) {
					local90++;
					local110 = Static47.aClass15_1.anIntArray118[local95];
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > 502) {
						local110 = 502;
					}
					local128 = Static47.aClass15_1.anIntArray119[local95];
					if (local128 < 0) {
						local128 = 0;
					} else if (local128 > 764) {
						local128 = 764;
					}
					@Pc(147) int local147 = local128 + local110 * 765;
					if (Static47.aClass15_1.anIntArray118[local95] == -1 && Static47.aClass15_1.anIntArray119[local95] == -1) {
						local110 = -1;
						local128 = -1;
						local147 = 524287;
					}
					if (Static132.anInt3370 != local128 || Static66.anInt1589 != local110) {
						@Pc(195) int local195 = local128 - Static132.anInt3370;
						@Pc(199) int local199 = local110 - Static66.anInt1589;
						Static66.anInt1589 = local110;
						Static132.anInt3370 = local128;
						if (Static76.anInt1867 < 8 && local195 >= -32 && local195 <= 31 && local199 >= -32 && local199 <= 31) {
							local195 += 32;
							local199 += 32;
							Static1.aClass5_Sub14_Sub1_1.method1468((local195 << 6) + (Static76.anInt1867 << 12) + local199);
							Static76.anInt1867 = 0;
						} else if (Static76.anInt1867 < 8) {
							Static1.aClass5_Sub14_Sub1_1.method1438(local147 + (Static76.anInt1867 << 19) + 8388608);
							Static76.anInt1867 = 0;
						} else {
							Static1.aClass5_Sub14_Sub1_1.method1451(local147 + (Static76.anInt1867 << 19) - 1073741824);
							Static76.anInt1867 = 0;
						}
					} else if (Static76.anInt1867 < 2047) {
						Static76.anInt1867++;
					}
				}
				Static1.aClass5_Sub14_Sub1_1.method1485(Static1.aClass5_Sub14_Sub1_1.anInt2199 - local93);
				if (local90 < Static47.aClass15_1.anInt643) {
					Static47.aClass15_1.anInt643 -= local90;
					for (local110 = 0; local110 < Static47.aClass15_1.anInt643; local110++) {
						Static47.aClass15_1.anIntArray119[local110] = Static47.aClass15_1.anIntArray119[local110 + local90];
						Static47.aClass15_1.anIntArray118[local110] = Static47.aClass15_1.anIntArray118[local110 + local90];
					}
				} else {
					Static47.aClass15_1.anInt643 = 0;
				}
			}
		}
		if (Static75.anInt1772 != 0) {
			@Pc(354) long local354 = (Static34.aLong40 - Static78.aLong64) / 50L;
			if (local354 > 4095L) {
				local354 = 4095L;
			}
			Static78.aLong64 = Static34.aLong40;
			@Pc(364) byte local364 = 0;
			if (Static75.anInt1772 == 2) {
				local364 = 1;
			}
			local93 = Static12.anInt308;
			local128 = (int) local354;
			local90 = Static26.anInt613;
			Static1.aClass5_Sub14_Sub1_1.method1489(142);
			if (local93 < 0) {
				local93 = 0;
			} else if (local93 > 502) {
				local93 = 502;
			}
			if (local90 < 0) {
				local90 = 0;
			} else if (local90 > 764) {
				local90 = 764;
			}
			local95 = local90 + local93 * 765;
			Static1.aClass5_Sub14_Sub1_1.method1457(local95 + (local128 << 20) + (local364 << 19));
		}
		if (Static110.aBooleanArray14[96] || Static110.aBooleanArray14[97] || Static110.aBooleanArray14[98] || Static110.aBooleanArray14[99]) {
			Static52.aBoolean45 = true;
		}
		if (Static88.anInt3386 > 0) {
			Static88.anInt3386--;
		}
		if (Static52.aBoolean45 && Static88.anInt3386 <= 0) {
			Static52.aBoolean45 = false;
			Static88.anInt3386 = 20;
			Static1.aClass5_Sub14_Sub1_1.method1489(219);
			Static1.aClass5_Sub14_Sub1_1.method1448(Static91.anInt2422);
			Static1.aClass5_Sub14_Sub1_1.method1481(Static57.anInt1420);
		}
		if (Static60.aBoolean51 && !Static95.aBoolean87) {
			Static95.aBoolean87 = true;
			Static1.aClass5_Sub14_Sub1_1.method1489(151);
			Static1.aClass5_Sub14_Sub1_1.method1440(1);
		}
		if (!Static60.aBoolean51 && Static95.aBoolean87) {
			Static95.aBoolean87 = false;
			Static1.aClass5_Sub14_Sub1_1.method1489(151);
			Static1.aClass5_Sub14_Sub1_1.method1440(0);
		}
		Static71.method1182();
		if (Static24.anInt723 != 30) {
			return;
		}
		Static44.method776();
		Static118.method1895();
		Static10.anInt232++;
		if (Static10.anInt232 > 750) {
			Static1.method7();
			return;
		}
		Static77.method1255();
		Static29.method628();
		Static57.method1007();
		if (Static105.anInt3346 != 0) {
			Static8.anInt188 += 20;
			if (Static8.anInt188 >= 400) {
				Static105.anInt3346 = 0;
			}
		}
		Static8.anInt198++;
		if (Static29.aClass5_Sub11_3 != null) {
			Static21.anInt645++;
			if (Static21.anInt645 >= 15) {
				Static24.method505(Static29.aClass5_Sub11_3);
				Static29.aClass5_Sub11_3 = null;
			}
		}
		@Pc(670) Class5_Sub11 local670;
		if (Static115.aClass5_Sub11_13 != null) {
			Static24.method505(Static115.aClass5_Sub11_13);
			Static28.anInt894++;
			if (Static30.anInt917 > Static73.anInt1745 + 5 || Static30.anInt917 < Static73.anInt1745 - 5 || Static12.anInt323 + 5 < Static40.anInt1073 || Static12.anInt323 - 5 > Static40.anInt1073) {
				Static83.aBoolean79 = true;
			}
			if (Static8.anInt190 == 0) {
				if (Static83.aBoolean79 && Static28.anInt894 >= 5) {
					if (Static115.aClass5_Sub11_13 == Static21.aClass5_Sub11_2 && Static60.anInt1457 != Static80.anInt2052) {
						@Pc(668) byte local668 = 0;
						local670 = Static115.aClass5_Sub11_13;
						if (Static116.anInt3008 == 1 && local670.anInt1627 == 206) {
							local668 = 1;
						}
						if (local670.anIntArray246[Static60.anInt1457] <= 0) {
							local668 = 0;
						}
						if (Static119.method1896(Static42.method755(local670))) {
							local93 = Static80.anInt2052;
							local90 = Static60.anInt1457;
							local670.anIntArray246[local90] = local670.anIntArray246[local93];
							local670.anIntArray241[local90] = local670.anIntArray241[local93];
							local670.anIntArray246[local93] = -1;
							local670.anIntArray241[local93] = 0;
						} else if (local668 == 1) {
							local93 = Static80.anInt2052;
							local90 = Static60.anInt1457;
							while (local90 != local93) {
								if (local90 < local93) {
									local670.method1121(local93 - 1, local93);
									local93--;
								} else if (local93 < local90) {
									local670.method1121(local93 + 1, local93);
									local93++;
								}
							}
						} else {
							local670.method1121(Static60.anInt1457, Static80.anInt2052);
						}
						Static1.aClass5_Sub14_Sub1_1.method1489(180);
						Static1.aClass5_Sub14_Sub1_1.method1482(Static80.anInt2052);
						Static1.aClass5_Sub14_Sub1_1.method1479(local668);
						Static1.aClass5_Sub14_Sub1_1.method1457(Static115.aClass5_Sub11_13.anInt1614);
						Static1.aClass5_Sub14_Sub1_1.method1448(Static60.anInt1457);
					}
				} else if ((Static125.anInt3132 == 1 || Static83.method1501(Static36.anInt1015 - 1)) && Static36.anInt1015 > 2) {
					Static10.method191();
				} else if (Static36.anInt1015 > 0) {
					Static20.method458(Static36.anInt1015 - 1);
				}
				Static115.aClass5_Sub11_13 = null;
				Static75.anInt1772 = 0;
				Static21.anInt645 = 10;
			}
		}
		Static4.aClass5_Sub11_10 = null;
		Static99.aBoolean95 = false;
		local670 = Static127.aClass5_Sub11_14;
		Static78.anInt1987 = 0;
		Static127.aClass5_Sub11_14 = null;
		Static114.aBoolean104 = false;
		@Pc(823) Class5_Sub11 local823 = Static132.aClass5_Sub11_15;
		Static132.aClass5_Sub11_15 = null;
		while (Static100.method1681() && Static78.anInt1987 < 128) {
			Static60.anIntArray217[Static78.anInt1987] = Static104.anInt2711;
			Static126.anIntArray381[Static78.anInt1987] = Static88.anInt3385;
			Static78.anInt1987++;
		}
		Static17.method404(Static44.anInt1133, 0, 0, 765, 503, 0, 0);
		Static66.anInt1592++;
		while (true) {
			@Pc(865) Class5_Sub22 local865;
			@Pc(881) Class5_Sub11 local881;
			@Pc(870) Class5_Sub11 local870;
			do {
				local865 = (Class5_Sub22) Static80.aClass58_43.method1670();
				if (local865 == null) {
					while (true) {
						do {
							local865 = (Class5_Sub22) Static101.aClass58_60.method1670();
							if (local865 == null) {
								while (true) {
									do {
										local865 = (Class5_Sub22) Static1.aClass58_1.method1670();
										if (local865 == null) {
											if (Static86.aClass5_Sub11_8 != null) {
												Static13.method272();
											}
											if (Static130.anInt3256 != -1) {
												local93 = Static130.anInt3256;
												local90 = Static130.anInt3276;
												@Pc(1034) boolean local1034 = Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local93, local90, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 0, true, 0, 0, 0, 0);
												Static130.anInt3256 = -1;
												if (local1034) {
													Static63.anInt1553 = Static26.anInt613;
													Static32.anInt963 = Static12.anInt308;
													Static105.anInt3346 = 1;
													Static8.anInt188 = 0;
												}
											}
											Static23.method497();
											if (Static127.aClass5_Sub11_14 != local670) {
												if (local670 != null) {
													Static24.method505(local670);
												}
												if (Static127.aClass5_Sub11_14 != null) {
													Static24.method505(Static127.aClass5_Sub11_14);
												}
											}
											if (local823 != Static132.aClass5_Sub11_15 && Static85.anInt2311 == Static95.anInt2446) {
												if (local823 != null) {
													Static24.method505(local823);
												}
												if (Static132.aClass5_Sub11_15 != null) {
													Static24.method505(Static132.aClass5_Sub11_15);
												}
											}
											if (Static132.aClass5_Sub11_15 == null) {
												if (Static85.anInt2311 > 0) {
													Static85.anInt2311--;
												}
											} else if (Static85.anInt2311 < Static95.anInt2446) {
												Static85.anInt2311++;
												if (Static85.anInt2311 == Static95.anInt2446) {
													Static24.method505(Static132.aClass5_Sub11_15);
												}
											}
											Static123.method1928();
											if (Static22.aBoolean22) {
												Static65.method1101();
											}
											for (local90 = 0; local90 < 5; local90++) {
												@Pc(1122) int local1122 = Static32.anIntArray152[local90]++;
											}
											local95 = Static133.method2196();
											local110 = Static93.method1602();
											if (local95 > 4500 && local110 > 4500) {
												Static50.anInt1261 = 250;
												Static8.method169(4000);
												Static1.aClass5_Sub14_Sub1_1.method1489(6);
											}
											Static78.anInt1982++;
											Static60.anInt1458++;
											if (Static60.anInt1458 > 500) {
												local128 = (int) (Math.random() * 8.0D);
												if ((local128 & 0x2) == 2) {
													Static120.anInt3033 += Static111.anInt2840;
												}
												if ((local128 & 0x4) == 4) {
													Static85.anInt2314 += Static33.anInt1002;
												}
												if ((local128 & 0x1) == 1) {
													Static9.anInt213 += Static119.anInt3024;
												}
												Static60.anInt1458 = 0;
											}
											if (Static85.anInt2314 < -40) {
												Static33.anInt1002 = 1;
											}
											if (Static120.anInt3033 < -55) {
												Static111.anInt2840 = 2;
											}
											if (Static9.anInt213 < -50) {
												Static119.anInt3024 = 2;
											}
											if (Static85.anInt2314 > 40) {
												Static33.anInt1002 = -1;
											}
											if (Static120.anInt3033 > 55) {
												Static111.anInt2840 = -2;
											}
											if (Static9.anInt213 > 50) {
												Static119.anInt3024 = -2;
											}
											Static68.anInt1695++;
											if (Static68.anInt1695 > 500) {
												local128 = (int) (Math.random() * 8.0D);
												Static68.anInt1695 = 0;
												if ((local128 & 0x2) == 2) {
													Static129.anInt3235 += Static120.anInt3035;
												}
												if ((local128 & 0x1) == 1) {
													Static129.anInt3240 += Static83.anInt2282;
												}
											}
											if (Static129.anInt3240 < -60) {
												Static83.anInt2282 = 2;
											}
											if (Static129.anInt3235 < -20) {
												Static120.anInt3035 = 1;
											}
											if (Static129.anInt3240 > 60) {
												Static83.anInt2282 = -2;
											}
											if (Static129.anInt3235 > 10) {
												Static120.anInt3035 = -1;
											}
											if (Static78.anInt1982 > 50) {
												Static1.aClass5_Sub14_Sub1_1.method1489(176);
											}
											try {
												if (Static108.aClass30_2 != null && Static1.aClass5_Sub14_Sub1_1.anInt2199 > 0) {
													Static108.aClass30_2.method780(Static1.aClass5_Sub14_Sub1_1.aByteArray33, Static1.aClass5_Sub14_Sub1_1.anInt2199);
													Static1.aClass5_Sub14_Sub1_1.anInt2199 = 0;
													Static78.anInt1982 = 0;
													return;
												}
												return;
											} catch (@Pc(1332) IOException local1332) {
												Static1.method7();
												return;
											}
										}
										local870 = local865.aClass5_Sub11_12;
										if (local870.anInt1645 < 0) {
											break;
										}
										local881 = Static88.method2191(local870.anInt1681);
									} while (local881 == null || local881.aClass5_Sub11Array1 == null || local881.aClass5_Sub11Array1.length <= local870.anInt1645 || local881.aClass5_Sub11Array1[local870.anInt1645] != local870);
									Static76.method1228(local865);
								}
							}
							local870 = local865.aClass5_Sub11_12;
							if (local870.anInt1645 < 0) {
								break;
							}
							local881 = Static88.method2191(local870.anInt1681);
						} while (local881 == null || local881.aClass5_Sub11Array1 == null || local870.anInt1645 >= local881.aClass5_Sub11Array1.length || local881.aClass5_Sub11Array1[local870.anInt1645] != local870);
						Static76.method1228(local865);
					}
				}
				local870 = local865.aClass5_Sub11_12;
				if (local870.anInt1645 < 0) {
					break;
				}
				local881 = Static88.method2191(local870.anInt1681);
			} while (local881 == null || local881.aClass5_Sub11Array1 == null || local881.aClass5_Sub11Array1.length <= local870.anInt1645 || local881.aClass5_Sub11Array1[local870.anInt1645] != local870);
			Static76.method1228(local865);
		}
	}
}
