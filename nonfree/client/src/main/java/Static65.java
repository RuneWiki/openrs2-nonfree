import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "Lclient!nh;")
	public static Class62 aClass62_15;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] aClass4_Sub1_Sub7_Sub3Array9;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
	public static int anInt1715 = -1;

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
	public static int anInt1716 = 0;

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
	public static int anInt1717 = 0;

	@OriginalMember(owner = "client!hc", name = "bb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_670 = Static177.method3050("null");

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_28 = new Class66(64);

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
	public static void method1385() {
		if (Static27.anInt743 > 1) {
			Static27.anInt743--;
		}
		if (Static126.anInt3007 > 0) {
			Static126.anInt3007--;
		}
		if (Static10.aBoolean21) {
			Static10.aBoolean21 = false;
			Static183.method1441();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static8.method162(); local27++) {
		}
		if (Static143.anInt3333 != 30) {
			return;
		}
		Static31.method527(Static90.aClass4_Sub11_Sub1_1);
		@Pc(49) Object local49 = Static114.aClass5_1.anObject1;
		@Pc(77) int local77;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(98) int local98;
		@Pc(114) int local114;
		synchronized (Static114.aClass5_1.anObject1) {
			if (!Static69.aBoolean83) {
				Static114.aClass5_1.anInt224 = 0;
			} else if (Static66.anInt1811 != 0 || Static114.aClass5_1.anInt224 >= 40) {
				Static90.aClass4_Sub11_Sub1_1.method1285(64);
				Static90.aClass4_Sub11_Sub1_1.method1238(0);
				local77 = Static90.aClass4_Sub11_Sub1_1.anInt1597;
				local79 = 0;
				for (local81 = 0; local81 < Static114.aClass5_1.anInt224 && Static90.aClass4_Sub11_Sub1_1.anInt1597 - local77 < 240; local81++) {
					local79++;
					local98 = Static114.aClass5_1.anIntArray22[local81];
					if (local98 < 0) {
						local98 = 0;
					} else if (local98 > 502) {
						local98 = 502;
					}
					local114 = Static114.aClass5_1.anIntArray23[local81];
					if (local114 < 0) {
						local114 = 0;
					} else if (local114 > 764) {
						local114 = 764;
					}
					@Pc(133) int local133 = local114 + local98 * 765;
					if (Static114.aClass5_1.anIntArray22[local81] == -1 && Static114.aClass5_1.anIntArray23[local81] == -1) {
						local133 = 524287;
						local98 = -1;
						local114 = -1;
					}
					if (local114 != Static179.anInt4006 || local98 != Static132.anInt3171) {
						@Pc(177) int local177 = local98 - Static132.anInt3171;
						Static132.anInt3171 = local98;
						@Pc(184) int local184 = local114 - Static179.anInt4006;
						Static179.anInt4006 = local114;
						if (Static8.anInt302 < 8 && local184 >= -32 && local184 <= 31 && local177 >= -32 && local177 <= 31) {
							local177 += 32;
							local184 += 32;
							Static90.aClass4_Sub11_Sub1_1.method1268(local177 + (local184 << 6) + (Static8.anInt302 << 12));
							Static8.anInt302 = 0;
						} else if (Static8.anInt302 < 8) {
							Static90.aClass4_Sub11_Sub1_1.method1249((Static8.anInt302 << 19) + local133 + 8388608);
							Static8.anInt302 = 0;
						} else {
							Static90.aClass4_Sub11_Sub1_1.method1256((Static8.anInt302 << 19) + local133 - 1073741824);
							Static8.anInt302 = 0;
						}
					} else if (Static8.anInt302 < 2047) {
						Static8.anInt302++;
					}
				}
				Static90.aClass4_Sub11_Sub1_1.method1231(Static90.aClass4_Sub11_Sub1_1.anInt1597 - local77);
				if (local79 >= Static114.aClass5_1.anInt224) {
					Static114.aClass5_1.anInt224 = 0;
				} else {
					Static114.aClass5_1.anInt224 -= local79;
					for (local98 = 0; local98 < Static114.aClass5_1.anInt224; local98++) {
						Static114.aClass5_1.anIntArray23[local98] = Static114.aClass5_1.anIntArray23[local98 + local79];
						Static114.aClass5_1.anIntArray22[local98] = Static114.aClass5_1.anIntArray22[local79 + local98];
					}
				}
			}
		}
		if (Static66.anInt1811 != 0) {
			local77 = Static73.anInt1877;
			local79 = Static28.anInt747;
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 764) {
				local79 = 764;
			}
			if (local77 < 0) {
				local77 = 0;
			} else if (local77 > 502) {
				local77 = 502;
			}
			@Pc(367) long local367 = (Static79.aLong71 - Static111.aLong102) / 50L;
			Static111.aLong102 = Static79.aLong71;
			if (local367 > 4095L) {
				local367 = 4095L;
			}
			local114 = (int) local367;
			@Pc(382) byte local382 = 0;
			if (Static66.anInt1811 == 2) {
				local382 = 1;
			}
			local81 = local77 * 765 + local79;
			Static90.aClass4_Sub11_Sub1_1.method1285(21);
			Static90.aClass4_Sub11_Sub1_1.method1256((local114 << 20) - (-(local382 << 19) - local81));
		}
		if (Static14.aBooleanArray2[96] || Static14.aBooleanArray2[97] || Static14.aBooleanArray2[98] || Static14.aBooleanArray2[99]) {
			Static102.aBoolean111 = true;
		}
		if (Static116.anInt2856 > 0) {
			Static116.anInt2856--;
		}
		if (Static102.aBoolean111 && Static116.anInt2856 <= 0) {
			Static102.aBoolean111 = false;
			Static116.anInt2856 = 20;
			Static90.aClass4_Sub11_Sub1_1.method1285(245);
			Static90.aClass4_Sub11_Sub1_1.method1260(Static116.anInt2859);
			Static90.aClass4_Sub11_Sub1_1.method1274(Static8.anInt297);
		}
		if (Static181.aBoolean167 && !Static80.aBoolean89) {
			Static80.aBoolean89 = true;
			Static90.aClass4_Sub11_Sub1_1.method1285(112);
			Static90.aClass4_Sub11_Sub1_1.method1238(1);
		}
		if (!Static181.aBoolean167 && Static80.aBoolean89) {
			Static80.aBoolean89 = false;
			Static90.aClass4_Sub11_Sub1_1.method1285(112);
			Static90.aClass4_Sub11_Sub1_1.method1238(0);
		}
		Static146.method2482();
		if (Static143.anInt3333 != 30) {
			return;
		}
		Static8.method166();
		Static39.method689();
		Static107.anInt2652++;
		if (Static107.anInt2652 > 750) {
			Static183.method1441();
			return;
		}
		Static69.method1481();
		Static184.method3171();
		Static15.method277();
		Static68.anInt1847++;
		if (anInt1716 != 0) {
			Static179.anInt3998 += 20;
			if (Static179.anInt3998 >= 400) {
				anInt1716 = 0;
			}
		}
		if (Static45.aClass1_15 != null) {
			Static58.anInt1413++;
			if (Static58.anInt1413 >= 15) {
				Static3.method21(Static45.aClass1_15);
				Static45.aClass1_15 = null;
			}
		}
		@Pc(664) Class1 local664;
		if (Static103.aClass1_32 != null) {
			Static3.method21(Static103.aClass1_32);
			if (Static101.anInt2575 + 5 < Static25.anInt620 || Static25.anInt620 < Static101.anInt2575 - 5 || Static169.anInt3778 > Static154.anInt4090 + 5 || Static169.anInt3778 < Static154.anInt4090 - 5) {
				Static146.aBoolean137 = true;
			}
			Static61.anInt1638++;
			if (Static177.anInt3974 == 0) {
				if (Static146.aBoolean137 && Static61.anInt1638 >= 5) {
					if (Static143.aClass1_43 == Static103.aClass1_32 && Static156.anInt3535 != Static158.anInt3537) {
						@Pc(662) byte local662 = 0;
						local664 = Static103.aClass1_32;
						if (Static122.anInt2954 == 1 && local664.anInt62 == 206) {
							local662 = 1;
						}
						if (local664.anIntArray11[Static158.anInt3537] <= 0) {
							local662 = 0;
						}
						if (Static66.method1449(Static102.method1954(local664))) {
							local77 = Static156.anInt3535;
							local79 = Static158.anInt3537;
							local664.anIntArray11[local79] = local664.anIntArray11[local77];
							local664.anIntArray2[local79] = local664.anIntArray2[local77];
							local664.anIntArray11[local77] = -1;
							local664.anIntArray2[local77] = 0;
						} else if (local662 == 1) {
							local77 = Static156.anInt3535;
							local79 = Static158.anInt3537;
							while (local79 != local77) {
								if (local77 > local79) {
									local664.method15(local77, local77 - 1);
									local77--;
								} else if (local79 > local77) {
									local664.method15(local77, local77 + 1);
									local77++;
								}
							}
						} else {
							local664.method15(Static156.anInt3535, Static158.anInt3537);
						}
						Static90.aClass4_Sub11_Sub1_1.method1285(0);
						Static90.aClass4_Sub11_Sub1_1.method1251(Static156.anInt3535);
						Static90.aClass4_Sub11_Sub1_1.method1265(local662);
						Static90.aClass4_Sub11_Sub1_1.method1260(Static158.anInt3537);
						Static90.aClass4_Sub11_Sub1_1.method1236(Static103.aClass1_32.anInt53);
					}
				} else if ((Static89.anInt2296 == 1 || Static156.method2678(Static3.anInt86 - 1)) && Static3.anInt86 > 2) {
					Static41.method711();
				} else if (Static3.anInt86 > 0) {
					Static118.method2140(Static3.anInt86 - 1);
				}
				Static103.aClass1_32 = null;
				Static66.anInt1811 = 0;
				Static58.anInt1413 = 10;
			}
		}
		Static13.aBoolean24 = false;
		Static166.aBoolean143 = false;
		Static179.aClass1_51 = null;
		Static98.anInt2508 = 0;
		@Pc(817) Class1 local817 = Static162.aClass1_47;
		local664 = Static102.aClass1_31;
		Static102.aClass1_31 = null;
		Static162.aClass1_47 = null;
		while (Static92.method1806() && Static98.anInt2508 < 128) {
			Static136.anIntArray309[Static98.anInt2508] = Static31.anInt796;
			Static17.anIntArray47[Static98.anInt2508] = Static108.anInt2665;
			Static98.anInt2508++;
		}
		if (Static174.anInt3902 != -1) {
			Static186.method3137(765, 0, 0, 0, 0, Static174.anInt3902, 503);
		}
		Static163.anInt3721++;
		while (true) {
			@Pc(865) Class4_Sub21 local865;
			@Pc(878) Class1 local878;
			@Pc(870) Class1 local870;
			do {
				local865 = (Class4_Sub21) Static122.aClass11_13.method276();
				if (local865 == null) {
					while (true) {
						do {
							local865 = (Class4_Sub21) Static59.aClass11_6.method276();
							if (local865 == null) {
								while (true) {
									do {
										local865 = (Class4_Sub21) Static3.aClass11_1.method276();
										if (local865 == null) {
											if (Static6.aClass1_2 != null) {
												Static95.method2233();
											}
											if (Static104.anInt2621 != -1) {
												local77 = Static104.anInt2621;
												local79 = Static188.anInt4186;
												@Pc(1031) boolean local1031 = Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local77, 0, true, 0, 0, 0, local79, 0);
												if (local1031) {
													Static162.anInt3596 = Static28.anInt747;
													Static179.anInt3998 = 0;
													anInt1716 = 1;
													Static143.anInt3331 = Static73.anInt1877;
												}
												Static104.anInt2621 = -1;
											}
											Static109.method2032();
											if (Static102.aClass1_31 != local664) {
												if (local664 != null) {
													Static3.method21(local664);
												}
												if (Static102.aClass1_31 != null) {
													Static3.method21(Static102.aClass1_31);
												}
											}
											if (local817 != Static162.aClass1_47 && Static152.anInt3458 == Static3.anInt82) {
												if (local817 != null) {
													Static3.method21(local817);
												}
												if (Static162.aClass1_47 != null) {
													Static3.method21(Static162.aClass1_47);
												}
											}
											if (Static162.aClass1_47 == null) {
												if (Static152.anInt3458 > 0) {
													Static152.anInt3458--;
												}
											} else if (Static3.anInt82 > Static152.anInt3458) {
												Static152.anInt3458++;
												if (Static3.anInt82 == Static152.anInt3458) {
													Static3.method21(Static162.aClass1_47);
												}
											}
											Static88.method1749();
											if (Static35.aBoolean47) {
												Static176.method3047();
											}
											for (local77 = 0; local77 < 5; local77++) {
												@Pc(1119) int local1119 = Static84.anIntArray439[local77]++;
											}
											local79 = Static110.method2046();
											local81 = Static99.method1900();
											if (local79 > 4500 && local81 > 4500) {
												Static126.anInt3007 = 250;
												Static105.method1983(4000);
												Static90.aClass4_Sub11_Sub1_1.method1285(239);
											}
											Static186.anInt4102++;
											if (Static186.anInt4102 > 500) {
												local98 = (int) (Math.random() * 8.0D);
												if ((local98 & 0x4) == 4) {
													Static84.anInt4113 += Static41.anInt1058;
												}
												if ((local98 & 0x2) == 2) {
													Static83.anInt2159 += Static30.anInt766;
												}
												Static186.anInt4102 = 0;
												if ((local98 & 0x1) == 1) {
													Static146.anInt3371 += Static173.anInt3884;
												}
											}
											anInt1717++;
											if (Static83.anInt2159 < -55) {
												Static30.anInt766 = 2;
											}
											if (Static146.anInt3371 < -50) {
												Static173.anInt3884 = 2;
											}
											if (Static83.anInt2159 > 55) {
												Static30.anInt766 = -2;
											}
											if (Static146.anInt3371 > 50) {
												Static173.anInt3884 = -2;
											}
											if (Static84.anInt4113 < -40) {
												Static41.anInt1058 = 1;
											}
											Static35.anInt923++;
											if (Static84.anInt4113 > 40) {
												Static41.anInt1058 = -1;
											}
											if (Static35.anInt923 > 500) {
												Static35.anInt923 = 0;
												local98 = (int) (Math.random() * 8.0D);
												if ((local98 & 0x2) == 2) {
													Static114.anInt2767 += Static1.anInt74;
												}
												if ((local98 & 0x1) == 1) {
													Static152.anInt3459 += Static5.anInt210;
												}
											}
											if (Static152.anInt3459 < -60) {
												Static5.anInt210 = 2;
											}
											if (Static114.anInt2767 < -20) {
												Static1.anInt74 = 1;
											}
											if (Static152.anInt3459 > 60) {
												Static5.anInt210 = -2;
											}
											if (Static114.anInt2767 > 10) {
												Static1.anInt74 = -1;
											}
											if (anInt1717 > 50) {
												Static90.aClass4_Sub11_Sub1_1.method1285(41);
											}
											try {
												if (Static59.aClass27_2 != null && Static90.aClass4_Sub11_Sub1_1.anInt1597 > 0) {
													Static59.aClass27_2.method957(Static90.aClass4_Sub11_Sub1_1.aByteArray19, Static90.aClass4_Sub11_Sub1_1.anInt1597);
													anInt1717 = 0;
													Static90.aClass4_Sub11_Sub1_1.anInt1597 = 0;
													return;
												}
												return;
											} catch (@Pc(1329) IOException local1329) {
												Static183.method1441();
												return;
											}
										}
										local870 = local865.aClass1_40;
										if (local870.anInt48 < 0) {
											break;
										}
										local878 = Static154.method3136(local870.anInt24);
									} while (local878 == null || local878.aClass1Array1 == null || local870.anInt48 >= local878.aClass1Array1.length || local878.aClass1Array1[local870.anInt48] != local870);
									Static2.method18(local865);
								}
							}
							local870 = local865.aClass1_40;
							if (local870.anInt48 < 0) {
								break;
							}
							local878 = Static154.method3136(local870.anInt24);
						} while (local878 == null || local878.aClass1Array1 == null || local870.anInt48 >= local878.aClass1Array1.length || local878.aClass1Array1[local870.anInt48] != local870);
						Static2.method18(local865);
					}
				}
				local870 = local865.aClass1_40;
				if (local870.anInt48 < 0) {
					break;
				}
				local878 = Static154.method3136(local870.anInt24);
			} while (local878 == null || local878.aClass1Array1 == null || local878.aClass1Array1.length <= local870.anInt48 || local870 != local878.aClass1Array1[local870.anInt48]);
			Static2.method18(local865);
		}
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
	public static void method1386() {
		Static32.aClass66_17.method2218();
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(BII)V")
	public static void method1388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		local4[0] = arg0;
		@Pc(14) int local14 = 1;
		@Pc(17) int[] local17 = new int[4];
		local17[0] = arg1;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg0 != Static176.anIntArray426[local23]) {
				local4[local14] = Static176.anIntArray426[local23];
				local17[local14] = Static148.anIntArray320[local23];
				local14++;
			}
		}
		Static148.anIntArray320 = local17;
		Static176.anIntArray426 = local4;
		Static87.method1726(0, Static132.aClass19Array1, Static176.anIntArray426, Static132.aClass19Array1.length - 1, Static148.anIntArray320);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!nh;IZLclient!nh;)Lclient!ef;")
	public static Class4_Sub1_Sub6 method1389(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(4) Class62 arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) int[] local17 = arg2.method2856(arg0);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(31) byte[] local31 = arg2.method2853(local17[local19], arg0);
			if (local31 == null) {
				local12 = false;
			} else {
				@Pc(51) int local51 = (local31[0] & 0xFF) << 8 | local31[1] & 0xFF;
				@Pc(67) byte[] local67 = arg1.method2853(0, local51);
				if (local67 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class4_Sub1_Sub6(arg2, arg1, arg0, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}
}
