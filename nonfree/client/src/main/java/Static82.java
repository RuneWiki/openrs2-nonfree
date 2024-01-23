import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_393 = Static199.method3560("blinken2:");

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!qe;")
	private static Class78 aClass78_395 = Static199.method3560("Started 3d library");

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!qe;")
	public static Class78 aClass78_394 = aClass78_395;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	public static int anInt1748 = 0;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_396 = Static199.method3560("runes");

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_397 = Static199.method3560("null");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
	public static void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class2_Sub14 local12 = (Class2_Sub14) Static10.aClass44_5.method1359(); local12 != null; local12 = (Class2_Sub14) Static10.aClass44_5.method1356()) {
			Static154.method2749(arg3, local12, arg1, arg2, arg0);
		}
		for (@Pc(36) Class2_Sub14 local36 = (Class2_Sub14) Static49.aClass44_11.method1359(); local36 != null; local36 = (Class2_Sub14) Static49.aClass44_11.method1356()) {
			@Pc(39) byte local39 = 1;
			if (local36.aClass5_Sub2_Sub1_1.anInt1879 == local36.aClass5_Sub2_Sub1_1.anInt1878) {
				local39 = 0;
			} else if (local36.aClass5_Sub2_Sub1_1.anInt1878 == local36.aClass5_Sub2_Sub1_1.anInt1824) {
				local39 = 2;
			}
			if (local39 != local36.anInt885) {
				@Pc(75) int local75 = Static62.method1004(local36.aClass5_Sub2_Sub1_1);
				if (local36.anInt893 != local75) {
					if (local36.aClass2_Sub21_Sub4_2 != null) {
						Static23.aClass2_Sub21_Sub3_1.method3390(local36.aClass2_Sub21_Sub4_2);
						local36.aClass2_Sub21_Sub4_2 = null;
					}
					local36.anInt893 = local75;
				}
				local36.anInt885 = local39;
			}
			local36.anInt891 = local36.aClass5_Sub2_Sub1_1.anInt1827;
			local36.anInt888 = local36.aClass5_Sub2_Sub1_1.anInt1832 * 64 + local36.aClass5_Sub2_Sub1_1.anInt1849;
			local36.anInt894 = local36.aClass5_Sub2_Sub1_1.anInt1849;
			local36.anInt902 = local36.aClass5_Sub2_Sub1_1.anInt1827 + local36.aClass5_Sub2_Sub1_1.anInt1832 * 64;
			Static154.method2749(arg3, local36, arg1, arg2, arg0);
		}
		for (@Pc(147) Class2_Sub14 local147 = (Class2_Sub14) Static113.aClass103_15.method3668(); local147 != null; local147 = (Class2_Sub14) Static113.aClass103_15.method3666()) {
			@Pc(150) byte local150 = 1;
			if (local147.aClass5_Sub2_Sub2_2.anInt1878 == local147.aClass5_Sub2_Sub2_2.anInt1879) {
				local150 = 0;
			} else if (local147.aClass5_Sub2_Sub2_2.anInt1878 == local147.aClass5_Sub2_Sub2_2.anInt1824) {
				local150 = 2;
			}
			if (local150 != local147.anInt885) {
				@Pc(186) int local186 = Static93.method1619(local147.aClass5_Sub2_Sub2_2);
				if (local147.anInt893 != local186) {
					if (local147.aClass2_Sub21_Sub4_2 != null) {
						Static23.aClass2_Sub21_Sub3_1.method3390(local147.aClass2_Sub21_Sub4_2);
						local147.aClass2_Sub21_Sub4_2 = null;
					}
					local147.anInt893 = local186;
				}
				local147.anInt885 = local150;
			}
			local147.anInt891 = local147.aClass5_Sub2_Sub2_2.anInt1827;
			local147.anInt902 = local147.aClass5_Sub2_Sub2_2.anInt1832 * 64 + local147.aClass5_Sub2_Sub2_2.anInt1827;
			local147.anInt888 = local147.aClass5_Sub2_Sub2_2.anInt1832 * 64 + local147.aClass5_Sub2_Sub2_2.anInt1849;
			local147.anInt894 = local147.aClass5_Sub2_Sub2_2.anInt1849;
			Static154.method2749(arg3, local147, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method1353() {
		Static102.method1746(false);
		@Pc(10) boolean local10 = true;
		Static175.anInt4043 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static7.aByteArrayArray2.length; local14++) {
			if (Static114.anIntArray434[local14] != -1 && Static7.aByteArrayArray2[local14] == null) {
				Static7.aByteArrayArray2[local14] = Static95.aClass72_Sub1_18.method3197(0, Static114.anIntArray434[local14]);
				if (Static7.aByteArrayArray2[local14] == null) {
					local10 = false;
					Static175.anInt4043++;
				}
			}
			if (Static220.anIntArray771[local14] != -1 && Static150.aByteArrayArray10[local14] == null) {
				Static150.aByteArrayArray10[local14] = Static95.aClass72_Sub1_18.method3173(0, Static13.anIntArrayArray6[local14], Static220.anIntArray771[local14]);
				if (Static150.aByteArrayArray10[local14] == null) {
					Static175.anInt4043++;
					local10 = false;
				}
			}
			if (Static69.anIntArray244 != null && Static143.aByteArrayArray9[local14] == null && Static69.anIntArray244[local14] != -1) {
				Static143.aByteArrayArray9[local14] = Static95.aClass72_Sub1_18.method3173(0, Static13.anIntArrayArray6[local14], Static69.anIntArray244[local14]);
				if (Static143.aByteArrayArray9[local14] == null) {
					Static175.anInt4043++;
					local10 = false;
				}
			}
		}
		if (!local10) {
			Static103.anInt2274 = 1;
			return;
		}
		local10 = true;
		Static144.anInt3273 = 0;
		@Pc(153) int local153;
		@Pc(164) int local164;
		for (@Pc(134) int local134 = 0; local134 < Static7.aByteArrayArray2.length; local134++) {
			@Pc(140) byte[] local140 = Static150.aByteArrayArray10[local134];
			if (local140 != null) {
				local153 = (Static171.anIntArray653[local134] >> 8) * 64 - Static28.anInt497;
				local164 = (Static171.anIntArray653[local134] & 0xFF) * 64 - Static57.anInt628;
				if (Static160.aBoolean160) {
					local164 = 10;
					local153 = 10;
				}
				local10 &= Static103.method1789(local164, local153, local140);
			}
		}
		if (!local10) {
			Static103.anInt2274 = 2;
			return;
		}
		if (Static103.anInt2274 != 0) {
			Static90.method1592(Static94.method1640(new Class78[] { Static62.aClass78_300, Static112.aClass78_526 }), true);
		}
		Static41.method565();
		Static149.method1485();
		Static199.method3558();
		for (@Pc(215) int local215 = 0; local215 < 4; local215++) {
			Static202.aClass90Array1[local215].method3523();
		}
		@Pc(240) int local240;
		for (local153 = 0; local153 < 4; local153++) {
			for (local164 = 0; local164 < 104; local164++) {
				for (local240 = 0; local240 < 104; local240++) {
					Static133.aByteArrayArrayArray10[local153][local164][local240] = 0;
				}
			}
		}
		Static68.method1109(false);
		Static41.method565();
		System.gc();
		Static41.method565();
		Static102.method1746(true);
		Static114.method1982();
		if (!Static160.aBoolean160) {
			Static84.method1460();
			Static102.method1746(true);
			Static147.method3170();
			if (Static143.aByteArrayArray9 != null) {
				Static81.method1349();
			}
		}
		if (Static160.aBoolean160) {
			Static143.method2556();
			Static102.method1746(true);
			Static116.method2147();
		}
		Static149.method1485();
		Static102.method1746(true);
		Static41.method565();
		Static153.method2743(Static202.aClass90Array1);
		Static102.method1746(true);
		Static41.method565();
		local164 = Static145.anInt3289;
		if (local164 > Static137.anInt3136) {
			local164 = Static137.anInt3136;
		}
		if (Static137.anInt3136 - 1 > local164) {
		}
		if (Static48.method633()) {
			Static21.method295(0);
		} else {
			Static21.method295(Static145.anInt3289);
		}
		Static60.method775();
		@Pc(357) int local357;
		for (local240 = 0; local240 < 104; local240++) {
			for (local357 = 0; local357 < 104; local357++) {
				Static209.method3070(local357, local240);
			}
		}
		Static41.method565();
		Static149.method1490();
		Static149.method1485();
		if (Static3.aFrame1 != null && Static202.aClass105_4 != null) {
			Static161.aClass2_Sub23_Sub1_5.method2155(105);
			Static161.aClass2_Sub23_Sub1_5.method2134(1057001181);
		}
		if (!Static160.aBoolean160) {
			local357 = (Static90.anInt2014 - 6) / 8;
			@Pc(409) int local409 = (Static90.anInt2014 + 6) / 8;
			@Pc(415) int local415 = (Static225.anInt4878 - 6) / 8;
			@Pc(421) int local421 = (Static225.anInt4878 + 6) / 8;
			for (@Pc(425) int local425 = local357 - 1; local425 <= local409 + 1; local425++) {
				for (@Pc(431) int local431 = local415 - 1; local431 <= local421 + 1; local431++) {
					if (local357 > local425 || local425 > local409 || local415 > local431 || local421 < local431) {
						Static95.aClass72_Sub1_18.method3196(Static94.method1640(new Class78[] { Static201.aClass78_797, Static19.method268(local425), Static6.aClass78_16, Static19.method268(local431) }));
						Static95.aClass72_Sub1_18.method3196(Static94.method1640(new Class78[] { Static4.aClass78_12, Static19.method268(local425), Static6.aClass78_16, Static19.method268(local431) }));
					}
				}
			}
		}
		if (Static226.anInt4903 == 28) {
			Static125.method1281(10);
		} else {
			Static125.method1281(30);
		}
		Static41.method565();
		if (Static202.aClass105_4 != null) {
			Static161.aClass2_Sub23_Sub1_5.method2155(229);
		}
		method1361();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!nh;)V")
	public static void method1357(@OriginalArg(1) Class2_Sub23 arg0) {
		if (arg0.aByteArray41.length - arg0.anInt2703 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method2122();
		if (local19 < 0 || local19 > 2) {
			return;
		}
		@Pc(30) byte local30;
		if (local19 == 2) {
			local30 = 22;
		} else if (local19 == 1) {
			local30 = 23;
		} else {
			local30 = 19;
		}
		if (arg0.aByteArray41.length - arg0.anInt2703 < local30) {
			return;
		}
		Static180.anInt4194 = arg0.method2122();
		if (Static180.anInt4194 < 1) {
			Static180.anInt4194 = 1;
		} else if (Static180.anInt4194 > 4) {
			Static180.anInt4194 = 4;
		}
		Static12.method225(arg0.method2122() == 1);
		Static101.aBoolean84 = arg0.method2122() == 1;
		Static112.aBoolean105 = arg0.method2122() == 1;
		Static14.aBoolean151 = arg0.method2122() == 1;
		Static214.aBoolean200 = arg0.method2122() == 1;
		Static102.aBoolean86 = arg0.method2122() == 1;
		Static175.aBoolean175 = arg0.method2122() == 1;
		Static64.aBoolean42 = arg0.method2122() == 1;
		Static139.anInt2666 = arg0.method2122();
		if (Static139.anInt2666 > 2) {
			Static139.anInt2666 = 2;
		}
		if (local19 >= 2) {
			Static116.aBoolean113 = arg0.method2122() == 1;
		} else {
			Static116.aBoolean113 = arg0.method2122() == 1;
			arg0.method2122();
		}
		Static41.aBoolean31 = arg0.method2122() == 1;
		Static185.aBoolean187 = arg0.method2122() == 1;
		Static99.anInt2151 = arg0.method2122();
		if (Static99.anInt2151 > 2) {
			Static99.anInt2151 = 2;
		}
		Static40.aBoolean27 = arg0.method2122() == 1;
		Static11.anInt311 = arg0.method2122();
		if (Static11.anInt311 > 127) {
			Static11.anInt311 = 127;
		}
		Static89.anInt1999 = arg0.method2122();
		Static110.anInt2433 = arg0.method2122();
		if (Static110.anInt2433 > 127) {
			Static110.anInt2433 = 127;
		}
		if (local19 >= 1) {
			Static166.anInt1137 = arg0.method2095();
			Static112.anInt2452 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public static void method1361() {
		Static173.aClass4_1.method1603();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static125.aLongArray5[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static10.aLongArray2[local24] = 0L;
		}
		Static132.anInt3001 = 0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(ILclient!nh;)Lclient!qe;")
	public static Class78 method1363(@OriginalArg(1) Class2_Sub23 arg0) {
		return Static3.method76(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZIIII)V")
	public static void method1367(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static25.anInt457++;
		if (!arg1) {
			Static56.method733(true);
			Static129.method2338(true);
			Static56.method733(false);
		}
		Static129.method2338(false);
		if (!arg1) {
			Static226.method3975();
		}
		Static182.method3337();
		@Pc(38) int local38;
		@Pc(45) int local45;
		if (Static145.anInt3290 == 1) {
			local38 = Static114.anInt2557;
			local45 = Static140.anInt3197 + Static178.anInt4142 & 0x7FF;
			if (Static119.anInt2804 / 256 > local38) {
				local38 = Static119.anInt2804 / 256;
			}
			if (Static87.aBooleanArray61[4] && local38 < Static103.anIntArray391[4] + 128) {
				local38 = Static103.anIntArray391[4] + 128;
			}
			Static214.method3700(Static124.anInt2829, Static208.method3667(Static31.aClass5_Sub2_Sub2_1.anInt1849, Static137.anInt3136, Static31.aClass5_Sub2_Sub2_1.anInt1827) - 50, arg2, local38 * 3 + 600, local45, Static86.anInt1939, local38);
		}
		local38 = Static39.anInt727;
		local45 = Static107.anInt2348;
		@Pc(102) int local102 = Static15.anInt335;
		@Pc(104) int local104 = Static71.anInt1394;
		@Pc(106) int local106 = Static138.anInt3181;
		@Pc(149) int local149;
		for (@Pc(108) int local108 = 0; local108 < 5; local108++) {
			if (Static87.aBooleanArray61[local108]) {
				local149 = (int) ((double) -Static34.anIntArray103[local108] + (double) (Static34.anIntArray103[local108] * 2 + 1) * Math.random() + Math.sin((double) Static160.anIntArray615[local108] * ((double) Static142.anIntArray534[local108] / 100.0D)) * (double) Static103.anIntArray391[local108]);
				if (local108 == 1) {
					Static107.anInt2348 += local149;
				}
				if (local108 == 4) {
					Static15.anInt335 += local149;
					if (Static15.anInt335 < 128) {
						Static15.anInt335 = 128;
					}
					if (Static15.anInt335 > 383) {
						Static15.anInt335 = 383;
					}
				}
				if (local108 == 3) {
					Static138.anInt3181 = local149 + Static138.anInt3181 & 0x7FF;
				}
				if (local108 == 2) {
					Static71.anInt1394 += local149;
				}
				if (local108 == 0) {
					Static39.anInt727 += local149;
				}
			}
		}
		local149 = 3;
		if (!Static101.aBoolean84 && !Static139.aBoolean112) {
			local149 = Static137.anInt3136;
		}
		@Pc(247) int local247;
		@Pc(249) int local249;
		@Pc(252) int local252;
		if (Static48.method633() && Static101.aBoolean84 && !Static139.aBoolean112) {
			if (Static205.aByteArrayArrayArray5 == null) {
				Static205.aByteArrayArrayArray5 = new byte[4][104][104];
			}
			@Pc(243) byte local243 = (byte) (Static25.anInt457 - 4 & 0xFF);
			local247 = Static25.anInt457 % 104;
			for (local249 = 0; local249 < 4; local249++) {
				for (local252 = 0; local252 < 104; local252++) {
					Static205.aByteArrayArrayArray5[local249][local247][local252] = local243;
				}
			}
		}
		@Pc(273) boolean local273 = false;
		@Pc(361) int local361;
		@Pc(366) int local366;
		@Pc(374) int local374;
		if (Static48.method633() && Static101.aBoolean84 && !Static139.aBoolean112 && Static137.anInt3136 != 3) {
			for (local247 = 0; local247 < 2; local247++) {
				Static169.anIntArray646[local247] = -1000000;
				Static122.anIntArray293[local247] = 1000000;
				Static145.anIntArray542[local247] = 0;
				Static12.anIntArray45[local247] = 1000000;
				Static69.anIntArray243[local247] = 0;
			}
			if (Static145.anInt3290 == 1) {
				if ((Static133.aByteArrayArrayArray10[Static137.anInt3136][Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7][Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7] & 0x4) != 0) {
					local273 = true;
					Static54.method687(Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7, Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7, 0, Static226.aClass2_Sub12ArrayArrayArray3);
				}
				if (Static15.anInt335 < 310) {
					local252 = Static71.anInt1394 >> 7;
					local249 = Static39.anInt727 >> 7;
					local361 = Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7;
					local366 = Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7;
					if (local361 > local249) {
						local374 = local361 - local249;
					} else {
						local374 = local249 - local361;
					}
					@Pc(391) int local391;
					if (local366 <= local252) {
						local391 = local252 - local366;
					} else {
						local391 = local366 - local252;
					}
					@Pc(406) int local406;
					@Pc(408) int local408;
					if (local391 >= local374) {
						local406 = local374 * 65536 / local391;
						local408 = 32768;
						while (local252 != local366) {
							if (local252 < local366) {
								local252++;
							} else if (local366 < local252) {
								local252--;
							}
							if ((Static133.aByteArrayArrayArray10[Static137.anInt3136][local249][local252] & 0x4) != 0) {
								local273 = true;
								Static54.method687(local252, local249, 1, Static226.aClass2_Sub12ArrayArrayArray3);
								break;
							}
							local408 += local406;
							if (local408 >= 65536) {
								if (local249 < local361) {
									local249++;
								} else if (local361 < local249) {
									local249--;
								}
								local408 -= 65536;
								if ((Static133.aByteArrayArrayArray10[Static137.anInt3136][local249][local252] & 0x4) != 0) {
									Static54.method687(local252, local249, 1, Static226.aClass2_Sub12ArrayArrayArray3);
									local273 = true;
									break;
								}
							}
						}
					} else {
						local406 = local391 * 65536 / local374;
						local408 = 32768;
						while (local361 != local249) {
							if (local361 > local249) {
								local249++;
							} else if (local361 < local249) {
								local249--;
							}
							if ((Static133.aByteArrayArrayArray10[Static137.anInt3136][local249][local252] & 0x4) != 0) {
								Static54.method687(local252, local249, 1, Static226.aClass2_Sub12ArrayArrayArray3);
								local273 = true;
								break;
							}
							local408 += local406;
							if (local408 >= 65536) {
								if (local252 < local366) {
									local252++;
								} else if (local366 < local252) {
									local252--;
								}
								local408 -= 65536;
								if ((Static133.aByteArrayArrayArray10[Static137.anInt3136][local249][local252] & 0x4) != 0) {
									Static54.method687(local252, local249, 1, Static226.aClass2_Sub12ArrayArrayArray3);
									local273 = true;
									break;
								}
							}
						}
					}
				}
			} else {
				local249 = Static208.method3667(Static39.anInt727, Static137.anInt3136, Static71.anInt1394);
				if (local249 - Static107.anInt2348 < 800 && (Static133.aByteArrayArrayArray10[Static137.anInt3136][Static39.anInt727 >> 7][Static71.anInt1394 >> 7] & 0x4) != 0) {
					local273 = true;
					Static54.method687(Static71.anInt1394 >> 7, Static39.anInt727 >> 7, 1, Static226.aClass2_Sub12ArrayArrayArray3);
				}
			}
		}
		Static217.method3759(arg0, arg3, arg0 + arg4, arg2 + arg3);
		Static163.method2944();
		local247 = Static44.anInt806;
		local249 = Static81.anInt1744;
		if (local247 >= arg0 && arg4 + arg0 > local247 && local249 >= arg3 && arg3 + arg2 > local249) {
			Static110.anInt2438 = 0;
			Static153.aBoolean155 = true;
			local252 = Static226.anInt4902;
			local366 = Static14.anInt3440;
			local361 = Static210.anInt4638;
			local374 = Static149.anInt1846;
			Static117.anInt2739 = local252 + (local361 - local252) * (Static44.anInt806 - arg0) / arg4;
			Static62.anInt1227 = local366 + (local374 - local366) * (Static81.anInt1744 - arg3) / arg2;
		} else {
			Static153.aBoolean155 = false;
			Static110.anInt2438 = 0;
		}
		Static41.method565();
		Static217.method3761(arg0, arg3, arg4, arg2, 0);
		if (local273) {
			Static114.method1984(Static39.anInt727, Static107.anInt2348, Static71.anInt1394, Static15.anInt335, Static138.anInt3181, local149, Static205.aByteArrayArrayArray5, Static169.anIntArray646, Static122.anIntArray293, Static145.anIntArray542, Static69.anIntArray243, Static12.anIntArray45, Static137.anInt3136 + 1, (byte) Static25.anInt457, Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7, Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7);
		} else {
			Static114.method1984(Static39.anInt727, Static107.anInt2348, Static71.anInt1394, Static15.anInt335, Static138.anInt3181, local149, null, null, null, null, null, null, 0, (byte) 0, Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7, Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7);
		}
		Static41.method565();
		Static158.method2851();
		Static204.method3620(arg2, arg3, arg0, arg4);
		Static1.method4(arg3, arg0, arg4, arg2);
		((Class35) Static163.anInterface4_1).method763(Static44.anInt797);
		Static199.method3562(arg3, arg4, arg0, arg2);
		Static107.anInt2348 = local45;
		Static71.anInt1394 = local104;
		Static15.anInt335 = local102;
		Static138.anInt3181 = local106;
		Static39.anInt727 = local38;
		if (Static183.aBoolean184 && Static45.method593() == 0) {
			Static183.aBoolean184 = false;
		}
		if (Static183.aBoolean184) {
			Static217.method3761(arg0, arg3, arg4, arg2, 0);
			Static90.method1592(Static62.aClass78_300, false);
		}
		if (!arg1 && !Static183.aBoolean184 && !Static202.aBoolean194 && arg0 <= local247 && local247 < arg4 + arg0 && arg3 <= local249 && local249 < arg2 + arg3) {
			Static187.method3455(local247, local249, arg2, arg3, arg0, arg4);
		}
	}
}
