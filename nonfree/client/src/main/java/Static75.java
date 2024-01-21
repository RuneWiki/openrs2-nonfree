import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!oc;")
	public static Class34 aClass34_56;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "J")
	public static long aLong60;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "[Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3[] aClass1_Sub1_Sub6_Sub3Array8;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_20;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!md;")
	public static Class38 aClass38_2 = new Class38();

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1206 = Static15.method178("Accept trade");

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1207 = aClass23_1206;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1208 = Static15.method178("Unexpected server response");

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
	public static final int anInt2068 = 0;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1209 = Static15.method178("Ausw-=hlen");

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1210 = aClass23_1208;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I")
	private static int method1314() {
		return Static89.anInt2391++;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lclient!he;")
	public static Class1_Sub1_Sub6_Sub2 method1316() {
		@Pc(18) Class1_Sub1_Sub6_Sub2 local18 = new Class1_Sub1_Sub6_Sub2(Static100.anIntArray348, Static113.anIntArray410, Static26.anIntArray119, Static80.anIntArray268, Static105.aByteArrayArray7);
		Static90.method1538();
		return local18;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILclient!cb;II)V")
	public static void method1318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) Class1_Sub12 local3 = new Class1_Sub12();
		local3.anInt2337 = arg2.anInt296;
		local3.anInt2350 = arg0;
		@Pc(18) int local18 = arg2.anInt305;
		local3.anInt2346 = arg2.anInt323 * 128;
		local3.anInt2345 = arg2.anInt295;
		local3.anInt2339 = arg3 * 128;
		local3.anInt2335 = arg2.anInt302;
		local3.anInt2348 = arg4 * 128;
		@Pc(49) int local49 = arg2.anInt299;
		local3.anIntArray314 = arg2.anIntArray53;
		if (arg1 == 1 || arg1 == 3) {
			local18 = arg2.anInt299;
			local49 = arg2.anInt305;
		}
		local3.anInt2341 = (arg4 + local18) * 128;
		local3.anInt2349 = (arg3 + local49) * 128;
		if (arg2.anIntArray54 != null) {
			local3.aClass1_Sub1_Sub4_1 = arg2;
			local3.method1471();
		}
		Static114.aClass45_10.method1295(local3);
		if (local3.anIntArray314 != null) {
			local3.anInt2342 = (int) (Math.random() * (double) (local3.anInt2337 - local3.anInt2335)) + local3.anInt2335;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1319() {
		if (Static66.anInt1971 > 1) {
			Static66.anInt1971--;
		}
		if (Static60.anInt1806 > 0) {
			Static60.anInt1806--;
		}
		if (Static55.aBoolean87) {
			Static55.aBoolean87 = false;
			Static1.method42();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static106.method1797(); local32++) {
		}
		if (Static98.anInt2537 != 30 && Static98.anInt2537 != 35) {
			return;
		}
		if (Static67.aBoolean100 && Static98.anInt2537 == 30) {
			Static89.anInt2389 = 0;
			Static65.anInt1963 = 0;
			while (Static21.method344()) {
			}
			for (@Pc(71) int local71 = 0; local71 < Static90.aBooleanArray10.length; local71++) {
				Static90.aBooleanArray10[local71] = false;
			}
		}
		Static110.method1889(Static76.aClass1_Sub5_Sub1_2);
		@Pc(95) Object local95 = Static57.aClass40_1.anObject2;
		@Pc(124) int local124;
		@Pc(117) int local117;
		@Pc(126) int local126;
		@Pc(164) int local164;
		synchronized (Static57.aClass40_1.anObject2) {
			if (!Static33.aBoolean59) {
				Static57.aClass40_1.anInt1944 = 0;
			} else if (Static65.anInt1963 != 0 || Static57.aClass40_1.anInt1944 >= 40) {
				Static76.aClass1_Sub5_Sub1_2.method731(149);
				local117 = 0;
				Static76.aClass1_Sub5_Sub1_2.method674(0);
				local124 = Static76.aClass1_Sub5_Sub1_2.anInt1266;
				@Pc(143) int local143;
				for (local126 = 0; local126 < Static57.aClass40_1.anInt1944 && Static76.aClass1_Sub5_Sub1_2.anInt1266 - local124 < 240; local126++) {
					local117++;
					local143 = Static57.aClass40_1.anIntArray228[local126];
					if (local143 < 0) {
						local143 = 0;
					} else if (local143 > 502) {
						local143 = 502;
					}
					local164 = Static57.aClass40_1.anIntArray229[local126];
					if (local164 < 0) {
						local164 = 0;
					} else if (local164 > 764) {
						local164 = 764;
					}
					@Pc(183) int local183 = local164 + local143 * 765;
					if (Static57.aClass40_1.anIntArray228[local126] == -1 && Static57.aClass40_1.anIntArray229[local126] == -1) {
						local164 = -1;
						local143 = -1;
						local183 = 524287;
					}
					if (local164 != Static50.anInt1617 || local143 != Static111.anInt2895) {
						@Pc(227) int local227 = local164 - Static50.anInt1617;
						Static50.anInt1617 = local164;
						@Pc(234) int local234 = local143 - Static111.anInt2895;
						Static111.anInt2895 = local143;
						if (Static16.anInt336 < 8 && local227 >= -32 && local227 <= 31 && local234 >= -32 && local234 <= 31) {
							local227 += 32;
							local234 += 32;
							Static76.aClass1_Sub5_Sub1_2.method686(local234 + (local227 << 6) + (Static16.anInt336 << 12));
							Static16.anInt336 = 0;
						} else if (Static16.anInt336 < 8) {
							Static76.aClass1_Sub5_Sub1_2.method680((Static16.anInt336 << 19) + local183 + 8388608);
							Static16.anInt336 = 0;
						} else {
							Static76.aClass1_Sub5_Sub1_2.method679(local183 + (Static16.anInt336 << 19) - 1073741824);
							Static16.anInt336 = 0;
						}
					} else if (Static16.anInt336 < 2047) {
						Static16.anInt336++;
					}
				}
				Static76.aClass1_Sub5_Sub1_2.method684(Static76.aClass1_Sub5_Sub1_2.anInt1266 - local124);
				if (Static57.aClass40_1.anInt1944 <= local117) {
					Static57.aClass40_1.anInt1944 = 0;
				} else {
					Static57.aClass40_1.anInt1944 -= local117;
					for (local143 = 0; local143 < Static57.aClass40_1.anInt1944; local143++) {
						Static57.aClass40_1.anIntArray229[local143] = Static57.aClass40_1.anIntArray229[local117 + local143];
						Static57.aClass40_1.anIntArray228[local143] = Static57.aClass40_1.anIntArray228[local117 + local143];
					}
				}
			}
		}
		if (Static65.anInt1963 != 0) {
			@Pc(391) long local391 = (Static31.aLong24 - Static45.aLong39) / 50L;
			Static45.aLong39 = Static31.aLong24;
			local117 = Static111.anInt2890;
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 764) {
				local117 = 764;
			}
			local124 = Static74.anInt1803;
			if (local124 < 0) {
				local124 = 0;
			} else if (local124 > 502) {
				local124 = 502;
			}
			if (local391 > 4095L) {
				local391 = 4095L;
			}
			local126 = local117 + local124 * 765;
			local164 = (int) local391;
			@Pc(439) byte local439 = 0;
			if (Static65.anInt1963 == 2) {
				local439 = 1;
			}
			Static76.aClass1_Sub5_Sub1_2.method731(64);
			Static76.aClass1_Sub5_Sub1_2.method695((local164 << 20) - (-(local439 << 19) - local126));
		}
		if (Static95.anInt2496 > 0) {
			Static95.anInt2496--;
		}
		if (Static90.aBooleanArray10[96] || Static90.aBooleanArray10[97] || Static90.aBooleanArray10[98] || Static90.aBooleanArray10[99]) {
			Static77.aBoolean102 = true;
		}
		if (Static77.aBoolean102 && Static95.anInt2496 <= 0) {
			Static77.aBoolean102 = false;
			Static95.anInt2496 = 20;
			Static76.aClass1_Sub5_Sub1_2.method731(49);
			Static76.aClass1_Sub5_Sub1_2.method694(Static3.anInt133);
			Static76.aClass1_Sub5_Sub1_2.method686(Static13.anInt233);
		}
		if (Static72.aBoolean101 && !Static42.aBoolean70) {
			Static42.aBoolean70 = true;
			Static76.aClass1_Sub5_Sub1_2.method731(67);
			Static76.aClass1_Sub5_Sub1_2.method674(1);
		}
		if (!Static72.aBoolean101 && Static42.aBoolean70) {
			Static42.aBoolean70 = false;
			Static76.aClass1_Sub5_Sub1_2.method731(67);
			Static76.aClass1_Sub5_Sub1_2.method674(0);
		}
		Static60.method1125();
		if (Static98.anInt2537 != 30 && Static98.anInt2537 != 35) {
			return;
		}
		Static100.method1672();
		Static42.method905();
		Static26.anInt803++;
		if (Static26.anInt803 > 750) {
			Static1.method42();
			return;
		}
		Static77.method1341();
		Static41.method893();
		Static27.method441();
		if (Static80.anInt2260 != 0) {
			Static76.anInt2078 += 20;
			if (Static76.anInt2078 >= 400) {
				Static80.anInt2260 = 0;
			}
		}
		Static70.anInt1829++;
		if (Static29.anInt880 != 0) {
			Static71.anInt2008++;
			if (Static71.anInt2008 >= 15) {
				if (Static29.anInt880 == 2) {
					Static34.aBoolean60 = true;
				}
				if (Static29.anInt880 == 3) {
					Static102.aBoolean123 = true;
				}
				Static29.anInt880 = 0;
			}
		}
		if (Static36.anInt1284 != 0) {
			Static80.anInt2261++;
			if (Static32.anInt1007 > Static76.anInt2084 + 5 || Static32.anInt1007 < Static76.anInt2084 - 5 || Static97.anInt2529 + 5 < Static110.anInt2872 || Static97.anInt2529 - 5 > Static110.anInt2872) {
				Static45.aBoolean75 = true;
			}
			if (Static89.anInt2389 == 0) {
				if (Static36.anInt1284 == 2) {
					Static34.aBoolean60 = true;
				}
				if (Static36.anInt1284 == 3) {
					Static102.aBoolean123 = true;
				}
				Static36.anInt1284 = 0;
				if (Static45.aBoolean75 && Static80.anInt2261 >= 5) {
					Static40.anInt1396 = -1;
					Static95.method1624();
					if (Static51.anInt1624 == Static40.anInt1396 && Static55.anInt1717 != Static112.anInt2926) {
						@Pc(755) Class1_Sub1_Sub7 local755 = Static15.method174(Static51.anInt1624);
						@Pc(757) byte local757 = 0;
						if (Static47.anInt1596 == 1 && local755.anInt839 == 206) {
							local757 = 1;
						}
						if (local755.anIntArray118[Static112.anInt2926] <= 0) {
							local757 = 0;
						}
						if (local755.aBoolean51) {
							local117 = Static112.anInt2926;
							local124 = Static55.anInt1717;
							local755.anIntArray118[local117] = local755.anIntArray118[local124];
							local755.anIntArray117[local117] = local755.anIntArray117[local124];
							local755.anIntArray118[local124] = -1;
							local755.anIntArray117[local124] = 0;
						} else if (local757 == 1) {
							local124 = Static55.anInt1717;
							local117 = Static112.anInt2926;
							while (local117 != local124) {
								if (local124 > local117) {
									local755.method429(local124 - 1, local124);
									local124--;
								} else if (local124 < local117) {
									local755.method429(local124 + 1, local124);
									local124++;
								}
							}
						} else {
							local755.method429(Static112.anInt2926, Static55.anInt1717);
						}
						Static76.aClass1_Sub5_Sub1_2.method731(118);
						Static76.aClass1_Sub5_Sub1_2.method685(local757);
						Static76.aClass1_Sub5_Sub1_2.method686(Static112.anInt2926);
						Static76.aClass1_Sub5_Sub1_2.method679(Static51.anInt1624);
						Static76.aClass1_Sub5_Sub1_2.method689(Static55.anInt1717);
					}
				} else if ((Static104.anInt2687 == 1 || Static110.method1893(Static40.anInt1400 - 1)) && Static40.anInt1400 > 2) {
					Static106.method1794();
				} else if (Static40.anInt1400 > 0) {
					Static7.method94(Static40.anInt1400 - 1);
				}
				Static65.anInt1963 = 0;
				Static71.anInt2008 = 10;
			}
		}
		if (Static77.anInt2096 == -1) {
			if (Static109.anInt2824 != -1) {
				Static94.method1610(34, Static109.anInt2824, 516, 4, 338, 4);
			} else if (Static70.anInt1836 != -1) {
				Static94.method1610(34, Static70.anInt1836, 516, 4, 338, 4);
			}
			if (Static16.anInt335 != -1) {
				Static94.method1610(34, Static16.anInt335, 743, 553, 466, 205);
			} else if (Static90.anIntArray325[Static106.anInt2723] != -1) {
				Static94.method1610(34, Static90.anIntArray325[Static106.anInt2723], 743, 553, 466, 205);
			}
			if (Static92.anInt2913 != -1) {
				Static94.method1610(34, Static92.anInt2913, 496, 17, 453, 357);
			} else if (Static56.anInt1733 != -1) {
				Static94.method1610(34, Static56.anInt1733, 496, 17, 453, 357);
			}
		} else {
			Static94.method1610(34, Static77.anInt2096, 765, 0, 503, 0);
			if (Static87.anInt2866 != -1) {
				Static94.method1610(34, Static87.anInt2866, 765, 0, 503, 0);
			}
		}
		if (Static77.anInt2096 == -1) {
			if (Static109.anInt2824 != -1) {
				Static94.method1610(-35, Static109.anInt2824, 516, 4, 338, 4);
			} else if (Static70.anInt1836 != -1) {
				Static94.method1610(-35, Static70.anInt1836, 516, 4, 338, 4);
			}
			if (Static16.anInt335 != -1) {
				Static94.method1610(-35, Static16.anInt335, 743, 553, 466, 205);
			} else if (Static90.anIntArray325[Static106.anInt2723] != -1) {
				Static94.method1610(-35, Static90.anIntArray325[Static106.anInt2723], 743, 553, 466, 205);
			}
			if (Static92.anInt2913 != -1) {
				Static94.method1610(-35, Static92.anInt2913, 496, 17, 453, 357);
			} else if (Static56.anInt1733 != -1) {
				Static94.method1610(-35, Static56.anInt1733, 496, 17, 453, 357);
			}
		} else {
			Static94.method1610(-35, Static77.anInt2096, 765, 0, 503, 0);
			if (Static87.anInt2866 != -1) {
				Static94.method1610(-35, Static87.anInt2866, 765, 0, 503, 0);
			}
		}
		Static49.method897();
		@Pc(1117) int local1117;
		if (Static103.anInt2644 != -1) {
			local1117 = Static103.anInt2644;
			local124 = Static103.anInt2632;
			@Pc(1139) boolean local1139 = Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local1117, local124, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], true, 0, 0, 0, 0, 0);
			if (local1139) {
				Static26.anInt797 = Static111.anInt2890;
				Static29.anInt881 = Static74.anInt1803;
				Static76.anInt2078 = 0;
				Static80.anInt2260 = 1;
			}
			Static103.anInt2644 = -1;
		}
		if (Static65.anInt1963 == 1 && Static110.aClass23_1695 != null) {
			Static65.anInt1963 = 0;
			Static102.aBoolean123 = true;
			Static110.aClass23_1695 = null;
		}
		Static61.method1202();
		if (Static77.anInt2096 == -1) {
			Static110.method1900();
			Static88.method677();
			Static42.method907();
		}
		if (Static44.anInt1487 == -1 && Static2.anInt2279 == -1 && Static109.anInt2830 == -1) {
			if (Static94.anInt2480 > 0) {
				Static94.anInt2480--;
			}
		} else if (Static89.anInt2394 > Static94.anInt2480) {
			Static94.anInt2480++;
			if (Static94.anInt2480 == Static89.anInt2394) {
				if (Static44.anInt1487 != -1) {
					Static102.aBoolean123 = true;
				}
				if (Static2.anInt2279 != -1) {
					Static34.aBoolean60 = true;
				}
			}
		}
		if (Static89.anInt2389 == 1 || Static65.anInt1963 == 1) {
			Static41.anInt1432++;
		}
		Static112.method1916();
		if (Static9.aBoolean5) {
			Static113.method1924();
		}
		for (local1117 = 0; local1117 < 5; local1117++) {
			@Pc(1249) int local1249 = Static14.anIntArray49[local1117]++;
		}
		Static34.method583();
		local124 = Static35.method599();
		local117 = method1314();
		if (local124 > 4500 && local117 > 4500) {
			Static60.anInt1806 = 250;
			Static113.method1919(4000);
			Static76.aClass1_Sub5_Sub1_2.method731(87);
		}
		Static99.anInt2541++;
		Static31.anInt960++;
		Static33.anInt1047++;
		if (Static31.anInt960 > 500) {
			local126 = (int) (Math.random() * 8.0D);
			if ((local126 & 0x2) == 2) {
				Static27.anInt854 += Static3.anInt134;
			}
			if ((local126 & 0x4) == 4) {
				Static68.anInt386 += Static71.anInt2006;
			}
			Static31.anInt960 = 0;
			if ((local126 & 0x1) == 1) {
				Static60.anInt1813 += Static35.anInt1109;
			}
		}
		if (Static68.anInt386 < -40) {
			Static71.anInt2006 = 1;
		}
		if (Static27.anInt854 < -55) {
			Static3.anInt134 = 2;
		}
		if (Static60.anInt1813 < -50) {
			Static35.anInt1109 = 2;
		}
		if (Static60.anInt1813 > 50) {
			Static35.anInt1109 = -2;
		}
		if (Static68.anInt386 > 40) {
			Static71.anInt2006 = -1;
		}
		if (Static27.anInt854 > 55) {
			Static3.anInt134 = -2;
		}
		if (Static99.anInt2541 > 500) {
			Static99.anInt2541 = 0;
			local126 = (int) (Math.random() * 8.0D);
			if ((local126 & 0x2) == 2) {
				Static50.anInt1618 += Static92.anInt2914;
			}
			if ((local126 & 0x1) == 1) {
				Static35.anInt1096 += Static102.anInt2625;
			}
		}
		if (Static35.anInt1096 < -60) {
			Static102.anInt2625 = 2;
		}
		if (Static35.anInt1096 > 60) {
			Static102.anInt2625 = -2;
		}
		if (Static50.anInt1618 < -20) {
			Static92.anInt2914 = 1;
		}
		if (Static50.anInt1618 > 10) {
			Static92.anInt2914 = -1;
		}
		if (Static33.anInt1047 > 50) {
			Static76.aClass1_Sub5_Sub1_2.method731(215);
		}
		try {
			if (Static94.aClass68_4 != null && Static76.aClass1_Sub5_Sub1_2.anInt1266 > 0) {
				Static94.aClass68_4.method1942(Static76.aClass1_Sub5_Sub1_2.aByteArray6, Static76.aClass1_Sub5_Sub1_2.anInt1266);
				Static33.anInt1047 = 0;
				Static76.aClass1_Sub5_Sub1_2.anInt1266 = 0;
			}
		} catch (@Pc(1467) IOException local1467) {
			Static1.method42();
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public static void method1323() {
		if (Static94.anInt2487 == 1) {
			@Pc(10) Class1_Sub1_Sub7 local10 = Static15.method174(Static106.anInt2713);
			if (Static48.anInt1609 != -1) {
				if (local10 == null || local10.aClass1_Sub1_Sub7Array1 == null || local10.aClass1_Sub1_Sub7Array1.length <= Static48.anInt1609) {
					local10 = null;
				} else {
					local10 = local10.aClass1_Sub1_Sub7Array1[Static48.anInt1609];
				}
			}
			if (local10 != null && local10.anObjectArray2 != null) {
				Static34.method585(local10.anObjectArray2, 0, 0, local10, 0);
			}
		}
		Static94.anInt2487 = 0;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
	public static void method1326() {
		aClass38_2 = null;
		aByteArrayArray5 = null;
		aClass23_1207 = null;
		aClass23_1210 = null;
		aClass23_1209 = null;
		aClass23_1206 = null;
		aClass1_Sub1_Sub6_Sub3_20 = null;
		aClass34_56 = null;
		aClass23_1208 = null;
		aClass1_Sub1_Sub6_Sub3Array8 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBIIII[Lclient!ee;III)Z")
	public static boolean method1327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub1_Sub7[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) boolean local12 = true;
		Static24.method1580(arg4, arg7, arg1, arg6);
		for (@Pc(19) int local19 = 0; local19 < arg5.length; local19++) {
			@Pc(25) Class1_Sub1_Sub7 local25 = arg5[local19];
			if (local25 != null && local25.anInt833 == arg3) {
				if (local25.anInt839 > 0) {
					Static94.method1609(local25);
				}
				@Pc(42) int local42 = local25.anInt834;
				@Pc(49) int local49 = local25.anInt820 + arg7 - arg2;
				@Pc(56) int local56 = arg4 + local25.anInt816 - arg0;
				@Pc(81) int local81;
				@Pc(91) int local91;
				@Pc(154) int local154;
				@Pc(165) int local165;
				if (Static72.aClass1_Sub1_Sub7_5 == local25) {
					@Pc(63) Class1_Sub1_Sub7 local63 = Static80.method1396(local25);
					if (local63 == null) {
						Static72.aClass1_Sub1_Sub7_5 = null;
					} else {
						@Pc(73) int[] local73 = Static43.method913(local63);
						@Pc(77) int[] local77 = Static43.method913(local25);
						local81 = Static32.anInt1007 - Static92.anInt2922;
						if (!local25.aBoolean40) {
							local42 = 128;
						}
						local91 = Static110.anInt2872 - Static58.anInt2821;
						if (local25.anInt800 >= local81 && local81 >= -local25.anInt800 && local25.anInt800 >= local91 && local91 >= -local25.anInt800 && !Static61.aBoolean94) {
							local81 = 0;
							local91 = 0;
						} else if (Static63.anInt1928 > local25.anInt806 || Static61.aBoolean94) {
							Static61.aBoolean94 = true;
						} else {
							local81 = 0;
							local91 = 0;
						}
						local154 = local81 + local77[0] - local73[0];
						local165 = local77[1] + local91 - local73[1];
						if (local154 < 0) {
							local154 = 0;
						}
						if (local165 < 0) {
							local165 = 0;
						}
						if (local25.anInt817 + local165 > local63.anInt817) {
							local165 = local63.anInt817 - local25.anInt817;
						}
						if (local154 + local25.anInt823 > local63.anInt823) {
							local154 = local63.anInt823 - local25.anInt823;
						}
						local56 = local73[0] + local154;
						local49 = local73[1] + local165;
					}
				}
				if ((!local25.aBoolean39 || local56 <= Static24.anInt2464 && local49 <= Static24.anInt2467 && local56 + local25.anInt823 >= Static24.anInt2468 && local49 + local25.anInt817 >= Static24.anInt2466) && (!local25.aBoolean39 || !local25.aBoolean36)) {
					if (local25.anInt802 == 0) {
						if (local25.aBoolean36 && !Static12.method1548(local19, arg8)) {
							continue;
						}
						if (!local25.aBoolean39) {
							if (local25.anInt807 - local25.anInt817 < local25.anInt822) {
								local25.anInt822 = local25.anInt807 - local25.anInt817;
							}
							if (local25.anInt822 < 0) {
								local25.anInt822 = 0;
							}
						}
						local12 &= method1327(local25.anInt832, local25.anInt823 + local56, local25.anInt822, local25.anInt826, local56, arg5, local25.anInt817 + local49, local49, arg8);
						if (local25.aClass1_Sub1_Sub7Array1 != null) {
							local12 &= method1327(local25.anInt832, local25.anInt823 + local56, local25.anInt822, local25.anInt826, local56, local25.aClass1_Sub1_Sub7Array1, local25.anInt817 + local49, local49, arg8);
						}
						Static24.method1580(arg4, arg7, arg1, arg6);
						if (local25.anInt807 > local25.anInt817) {
							Static55.method1070(local49, local25.anInt822, local25.anInt807, local25.anInt817, local56 + local25.anInt823);
						}
					}
					if (local25.anInt802 != 1) {
						@Pc(430) int local430;
						@Pc(589) int local589;
						@Pc(370) int local370;
						@Pc(372) int local372;
						@Pc(376) int local376;
						if (local25.anInt802 == 2) {
							local370 = 0;
							for (local372 = 0; local372 < local25.anInt817; local372++) {
								for (local376 = 0; local376 < local25.anInt823; local376++) {
									local81 = (local25.anInt810 + 32) * local376 + local56;
									local91 = local49 + local372 * (local25.anInt787 + 32);
									if (local370 < 20) {
										local81 += local25.anIntArray115[local370];
										local91 += local25.anIntArray113[local370];
									}
									if (local25.anIntArray118[local370] > 0) {
										local430 = local25.anIntArray118[local370] - 1;
										if (Static24.anInt2468 - 32 < local81 && local81 < Static24.anInt2464 && local91 > Static24.anInt2466 - 32 && Static24.anInt2467 > local91 || Static36.anInt1284 != 0 && local370 == Static55.anInt1717) {
											@Pc(481) Class1_Sub1_Sub6_Sub1 local481;
											if (Static115.anInt2955 == 1 && local370 == Static2.anInt2293 && Static26.anInt845 == local25.anInt826) {
												local481 = Static98.method1649(false, local25.anIntArray117[local370], 0, local430, 2);
											} else {
												local481 = Static98.method1649(false, local25.anIntArray117[local370], 3153952, local430, 1);
											}
											if (local481 == null) {
												local12 = false;
											} else if (Static36.anInt1284 != 0 && Static55.anInt1717 == local370 && Static51.anInt1624 == local25.anInt826) {
												local154 = Static32.anInt1007 - Static76.anInt2084;
												if (local154 < 5 && local154 > -5) {
													local154 = 0;
												}
												local165 = Static110.anInt2872 - Static97.anInt2529;
												if (local165 < 5 && local165 > -5) {
													local165 = 0;
												}
												if (Static80.anInt2261 < 5) {
													local154 = 0;
													local165 = 0;
												}
												local481.method777(local81 + local154, local165 + local91, 128);
												if (arg3 != -1) {
													@Pc(569) Class1_Sub1_Sub7 local569 = arg5[arg3 & 0xFFFF];
													if (local91 + local165 < Static24.anInt2466 && local569.anInt822 > 0) {
														local589 = (Static24.anInt2466 - local165 - local91) * Static70.anInt1829 / 3;
														if (Static70.anInt1829 * 10 < local589) {
															local589 = Static70.anInt1829 * 10;
														}
														if (local589 > local569.anInt822) {
															local589 = local569.anInt822;
														}
														Static97.anInt2529 += local589;
														local569.anInt822 -= local589;
													}
													if (Static24.anInt2467 < local91 + local165 + 32 && local569.anInt822 < local569.anInt807 - local569.anInt817) {
														local589 = Static70.anInt1829 * (local165 + local91 + 32 - Static24.anInt2467) / 3;
														if (local589 > Static70.anInt1829 * 10) {
															local589 = Static70.anInt1829 * 10;
														}
														if (local589 > local569.anInt807 - local569.anInt822 - local569.anInt817) {
															local589 = local569.anInt807 - local569.anInt822 - local569.anInt817;
														}
														Static97.anInt2529 -= local589;
														local569.anInt822 += local589;
													}
												}
											} else if (Static29.anInt880 != 0 && Static8.anInt187 == local370 && local25.anInt826 == Static100.anInt2594) {
												local481.method777(local81, local91, 128);
											} else {
												local481.method798(local81, local91);
											}
										}
									} else if (local25.anIntArray116 != null && local370 < 20) {
										@Pc(746) Class1_Sub1_Sub6_Sub1 local746 = local25.method431(local370);
										if (local746 != null) {
											local746.method798(local81, local91);
										} else if (Static36.aBoolean66) {
											local12 = false;
										}
									}
									local370++;
								}
							}
						} else if (local25.anInt802 == 3) {
							if (Static98.method1650(local25)) {
								local370 = local25.anInt842;
								if (Static12.method1548(local19, arg8) && local25.anInt786 != 0) {
									local370 = local25.anInt786;
								}
							} else {
								local370 = local25.anInt798;
								if (Static12.method1548(local19, arg8) && local25.anInt835 != 0) {
									local370 = local25.anInt835;
								}
							}
							if (local42 == 0) {
								if (local25.aBoolean53) {
									Static24.method1578(local56, local49, local25.anInt823, local25.anInt817, local370);
								} else {
									Static24.method1582(local56, local49, local25.anInt823, local25.anInt817, local370);
								}
							} else if (local25.aBoolean53) {
								Static24.method1587(local56, local49, local25.anInt823, local25.anInt817, local370, 256 - (local42 & 0xFF));
							} else {
								Static24.method1581(local56, local49, local25.anInt823, local25.anInt817, local370, 256 - (local42 & 0xFF));
							}
						} else {
							@Pc(883) Class1_Sub1_Sub6_Sub2 local883;
							if (local25.anInt802 == 4) {
								local883 = local25.method434();
								if (local883 != null) {
									@Pc(894) Class23 local894 = local25.aClass23_461;
									if (Static98.method1650(local25)) {
										local372 = local25.anInt842;
										if (Static12.method1548(local19, arg8) && local25.anInt786 != 0) {
											local372 = local25.anInt786;
										}
										if (local25.aClass23_459.method525() > 0) {
											local894 = local25.aClass23_459;
										}
									} else {
										local372 = local25.anInt798;
										if (Static12.method1548(local19, arg8) && local25.anInt835 != 0) {
											local372 = local25.anInt835;
										}
									}
									if (local25.aBoolean39 && local25.anInt811 != -1) {
										@Pc(950) Class1_Sub1_Sub1 local950 = Static111.method1907(local25.anInt811);
										local894 = local950.aClass23_58;
										if (local894 == null) {
											local894 = Static52.aClass23_870;
										}
										if (local950.anInt62 == 1 || local25.anInt848 != 1) {
											local894 = Static17.method233(new Class23[] { local894, Static7.aClass23_146, Static1.method40(local25.anInt848) });
										}
									}
									if (local25.anInt799 == 6 && Static47.anInt1599 == local25.anInt826) {
										local894 = Static56.aClass23_935;
										local372 = local25.anInt798;
									}
									if (Static24.anInt2465 == 479) {
										if (local372 == 16776960) {
											local372 = 255;
										}
										if (local372 == 49152) {
											local372 = 16777215;
										}
									}
									local894 = Static9.method106(local894, local25);
									local883.method849(local894, local56, local49, local25.anInt823, local25.anInt817, local372, local25.aBoolean52, local25.anInt790, local25.anInt831, local25.anInt836);
								} else if (Static36.aBoolean66) {
									local12 = false;
								}
							} else {
								@Pc(1177) int local1177;
								@Pc(1167) int local1167;
								@Pc(1183) int local1183;
								if (local25.anInt802 == 5) {
									@Pc(1069) Class1_Sub1_Sub6_Sub1 local1069;
									if (local25.aBoolean39) {
										if (local25.anInt811 == -1) {
											local1069 = local25.method432(false);
										} else {
											local1069 = Static98.method1649(false, local25.anInt848, local25.anInt796, local25.anInt811, local25.anInt804);
										}
										if (local1069 != null) {
											local372 = local1069.anInt1331;
											local376 = local1069.anInt1333;
											if (local25.aBoolean49) {
												@Pc(1096) int[] local1096 = new int[4];
												Static24.method1575(local1096);
												local91 = local56;
												if (local1096[0] > local56) {
													local91 = local1096[0];
												}
												local154 = local49;
												local165 = local56 + local25.anInt823;
												local430 = local49 + local25.anInt817;
												if (local165 > local1096[2]) {
													local165 = local1096[2];
												}
												if (local1096[3] < local430) {
													local430 = local1096[3];
												}
												if (local49 < local1096[1]) {
													local154 = local1096[1];
												}
												Static24.method1580(local91, local154, local165, local430);
												local1167 = (local25.anInt817 + local376 - 1) / local376;
												local1177 = (local25.anInt823 + local372 - 1) / local372;
												for (local589 = 0; local589 < local1177; local589++) {
													for (local1183 = 0; local1183 < local1167; local1183++) {
														if (local25.anInt819 != 0) {
															local1069.method781(local372 / 2 + local589 * local372 + local56, local49 - -(local376 * local1183) + local376 / 2, local25.anInt819, 4096);
														} else if (local42 == 0) {
															local1069.method798(local56 + local589 * local372, local49 - -(local1183 * local376));
														} else {
															local1069.method777(local56 + local589 * local372, local1183 * local376 + local49, 256 - (local42 & 0xFF));
														}
													}
												}
												Static24.method1574(local1096);
											} else {
												local81 = local25.anInt823 * 4096 / local372;
												if (local25.anInt819 != 0) {
													local1069.method781(local56 + local25.anInt823 / 2, local25.anInt817 / 2 + local49, local25.anInt819, local81);
												} else if (local42 != 0) {
													local1069.method782(local56, local49, local25.anInt823, local25.anInt817, 256 - (local42 & 0xFF));
												} else if (local25.anInt823 == local372 && local376 == local25.anInt817) {
													local1069.method798(local56, local49);
												} else {
													local1069.method799(local56, local49, local25.anInt823, local25.anInt817);
												}
											}
										} else if (Static36.aBoolean66) {
											local12 = false;
										}
									} else {
										local1069 = local25.method432(Static98.method1650(local25));
										if (local1069 != null) {
											local1069.method798(local56, local49);
										} else if (Static36.aBoolean66) {
											local12 = false;
										}
									}
								} else if (local25.anInt802 == 6) {
									@Pc(1379) boolean local1379 = Static98.method1650(local25);
									if (local1379) {
										local372 = local25.anInt789;
									} else {
										local372 = local25.anInt846;
									}
									@Pc(1414) Class1_Sub1_Sub2_Sub6 local1414;
									if (local25.anInt793 == 5) {
										if (local25.anInt824 == 0) {
											local1414 = Static26.aClass58_1.method1612(-1, null, null, -1);
										} else {
											local1414 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1415();
										}
									} else if (local372 == -1) {
										local1414 = local25.method437(local1379, null, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass58_2, -1);
										if (local1414 == null && Static36.aBoolean66) {
											local12 = false;
										}
									} else {
										@Pc(1404) Class1_Sub1_Sub8 local1404 = Static18.method249(local372);
										local1414 = local25.method437(local1379, local1404, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass58_2, local25.anInt841);
										if (local1414 == null && Static36.aBoolean66) {
											local12 = false;
										}
									}
									local81 = local25.anInt801;
									local154 = local25.anInt843;
									local430 = local25.anInt838;
									local91 = local25.anInt792;
									local1177 = local25.anInt791;
									local165 = local25.anInt814;
									if (local25.anInt811 != -1) {
										@Pc(1484) Class1_Sub1_Sub1 local1484 = Static111.method1907(local25.anInt811);
										if (local1484 != null) {
											local1484 = local1484.method36(local25.anInt848);
											local1414 = local1484.method37(1, true);
											local81 = local1484.anInt90;
											local1177 = local1484.anInt85;
											local154 = local1484.anInt73;
											if (local25.anInt823 > 0) {
												local1177 = local1177 * 32 / local25.anInt823;
											}
											local165 = local1484.anInt75;
											local91 = local1484.anInt55;
											local430 = local1484.anInt59;
										}
									}
									Static93.method1598(local25.anInt823 / 2 + local56, local49 - -(local25.anInt817 / 2));
									local1167 = local1177 * Class1_Sub1_Sub6_Sub4.anIntArray338[local81] >> 16;
									local589 = Class1_Sub1_Sub6_Sub4.anIntArray337[local81] * local1177 >> 16;
									if (local1414 != null) {
										if (local25.aBoolean39) {
											local1414.method1443();
											if (local25.aBoolean42) {
												local1414.method1430(local91, local154, local81, local165, local1167 + local1414.anInt2285 / 2 + local430, local589 - -local430, local1177);
											} else {
												local1414.method1445(local91, local154, local81, local165, local430 + local1414.anInt2285 / 2 + local1167, local589 + local430);
											}
										} else {
											local1414.method1445(local91, 0, local81, 0, local1167, local589);
										}
									}
									Static93.method1594();
								} else {
									if (local25.anInt802 == 7) {
										local883 = local25.method434();
										if (local883 == null) {
											if (Static36.aBoolean66) {
												local12 = false;
											}
											continue;
										}
										local372 = 0;
										for (local376 = 0; local376 < local25.anInt817; local376++) {
											for (local81 = 0; local81 < local25.anInt823; local81++) {
												if (local25.anIntArray118[local372] > 0) {
													@Pc(1665) Class1_Sub1_Sub1 local1665 = Static111.method1907(local25.anIntArray118[local372] - 1);
													@Pc(1668) Class23 local1668 = local1665.aClass23_58;
													if (local1668 == null) {
														local1668 = Static52.aClass23_870;
													}
													if (local1665.anInt62 == 1 || local25.anIntArray117[local372] != 1) {
														local1668 = Static17.method233(new Class23[] { local1668, Static7.aClass23_146, Static1.method40(local25.anIntArray117[local372]) });
													}
													local165 = (local25.anInt810 + 115) * local81 + local56;
													local430 = local376 * (local25.anInt787 + 12) + local49;
													if (local25.anInt790 == 0) {
														local883.method841(local1668, local165, local430, local25.anInt798, local25.aBoolean52);
													} else if (local25.anInt790 == 1) {
														local883.method847(local1668, local25.anInt823 / 2 + local165, local430, local25.anInt798, local25.aBoolean52);
													} else {
														local883.method834(local1668, local25.anInt823 + local165 - 1, local430, local25.anInt798, local25.aBoolean52);
													}
												}
												local372++;
											}
										}
									}
									if (local25.anInt802 == 8 && Static57.method1094(local19, arg8) && Static94.anInt2480 == Static89.anInt2394) {
										local370 = 0;
										@Pc(1806) Class1_Sub1_Sub6_Sub2 local1806 = Static112.aClass1_Sub1_Sub6_Sub2_14;
										local372 = 0;
										@Pc(1811) Class23 local1811 = local25.aClass23_461;
										local1811 = Static9.method106(local1811, local25);
										@Pc(1832) Class23 local1832;
										while (local1811.method525() > 0) {
											local154 = local1811.method528(Static37.aClass23_641);
											if (local154 == -1) {
												local1832 = local1811;
												local1811 = Static104.aClass23_1523;
											} else {
												local1832 = local1811.method512(0, local154);
												local1811 = local1811.method510(local154 + 2);
											}
											local165 = local1806.method845(local1832);
											local372 += local1806.anInt1358 + 1;
											if (local370 < local165) {
												local370 = local165;
											}
										}
										local372 += 7;
										local165 = local25.anInt817 + local49 + 5;
										if (local165 + local372 > arg6) {
											local165 = arg6 - local372;
										}
										local370 += 6;
										local154 = local56 + local25.anInt823 - local370 - 5;
										if (local154 < local56 + 5) {
											local154 = local56 + 5;
										}
										if (arg1 < local154 + local370) {
											local154 = arg1 - local370;
										}
										Static24.method1578(local154, local165, local370, local372, 16777120);
										Static24.method1582(local154, local165, local370, local372, 0);
										local1811 = local25.aClass23_461;
										local430 = local1806.anInt1358 + local165 + 2;
										local1811 = Static9.method106(local1811, local25);
										while (local1811.method525() > 0) {
											local1177 = local1811.method528(Static37.aClass23_641);
											if (local1177 == -1) {
												local1832 = local1811;
												local1811 = Static104.aClass23_1523;
											} else {
												local1832 = local1811.method512(0, local1177);
												local1811 = local1811.method510(local1177 + 2);
											}
											local1806.method841(local1832, local154 + 3, local430, 0, false);
											local430 += local1806.anInt1358 + 1;
										}
									}
									if (local25.anInt802 == 9) {
										if (local25.anInt794 == 1) {
											Static24.method1572(local56, local49, local56 + local25.anInt823, local25.anInt817 + local49, local25.anInt798);
										} else {
											local370 = local25.anInt823 < 0 ? -local25.anInt823 : local25.anInt823;
											local372 = local25.anInt817 >= 0 ? local25.anInt817 : -local25.anInt817;
											local376 = local370;
											if (local370 < local372) {
												local376 = local372;
											}
											if (local376 != 0) {
												local91 = (local25.anInt817 << 16) / local376;
												local81 = (local25.anInt823 << 16) / local376;
												if (local91 > local81) {
													local91 = -local91;
												} else {
													local81 = -local81;
												}
												local154 = local25.anInt794 * local91 >> 17;
												local430 = local25.anInt794 * local81 >> 17;
												local165 = local25.anInt794 * local91 + 1 >> 17;
												local589 = local56 - local165;
												local1183 = local56 + local25.anInt823 - local165;
												local1167 = local154 + local56;
												@Pc(2136) int local2136 = local154 + local25.anInt823 + local56;
												@Pc(2141) int local2141 = local49 + local430;
												local1177 = local25.anInt794 * local81 + 1 >> 17;
												@Pc(2154) int local2154 = local49 - local1177;
												@Pc(2162) int local2162 = local49 + local25.anInt817 - local1177;
												@Pc(2170) int local2170 = local430 + local49 + local25.anInt817;
												Static93.method1592(local1167, local589, local1183);
												Static93.method1603(local2141, local2154, local2162, local1167, local589, local1183, local25.anInt798);
												Static93.method1592(local1167, local1183, local2136);
												Static93.method1603(local2141, local2162, local2170, local1167, local1183, local2136, local25.anInt798);
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
		return local12;
	}
}
