import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	public static int anInt1037;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] aClass3_Sub2_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "[Lclient!jg;")
	public static Class3_Sub12[] aClass3_Sub12Array1;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!wf;")
	public static Class87 aClass87_4 = new Class87(32);

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!eh;")
	private static Class28 aClass28_344 = Static170.method3101("Select a world");

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_343 = aClass28_344;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	public static int anInt1034 = -1;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "[Lclient!db;")
	public static Class3_Sub2_Sub1_Sub2_Sub1[] aClass3_Sub2_Sub1_Sub2_Sub1Array1 = new Class3_Sub2_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	public static int anInt1041 = 0;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "Lclient!eh;")
	private static Class28 aClass28_345 = Static170.method3101("Username: ");

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "Lclient!eh;")
	public static Class28 aClass28_346 = aClass28_345;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z")
	public static boolean method851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static99.anInt2644; local1++) {
			@Pc(6) Class65 local6 = Static129.aClass65Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3170 == 1) {
				local15 = local6.anInt3163 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3166 + (local6.anInt3177 * local15 >> 8);
					local37 = local6.anInt3175 + (local6.anInt3164 * local15 >> 8);
					local47 = local6.anInt3179 + (local6.anInt3181 * local15 >> 8);
					local57 = local6.anInt3180 + (local6.anInt3169 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3170 == 2) {
				local15 = arg0 - local6.anInt3163;
				if (local15 > 0) {
					local27 = local6.anInt3166 + (local6.anInt3177 * local15 >> 8);
					local37 = local6.anInt3175 + (local6.anInt3164 * local15 >> 8);
					local47 = local6.anInt3179 + (local6.anInt3181 * local15 >> 8);
					local57 = local6.anInt3180 + (local6.anInt3169 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3170 == 3) {
				local15 = local6.anInt3166 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3163 + (local6.anInt3165 * local15 >> 8);
					local37 = local6.anInt3168 + (local6.anInt3174 * local15 >> 8);
					local47 = local6.anInt3179 + (local6.anInt3181 * local15 >> 8);
					local57 = local6.anInt3180 + (local6.anInt3169 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3170 == 4) {
				local15 = arg2 - local6.anInt3166;
				if (local15 > 0) {
					local27 = local6.anInt3163 + (local6.anInt3165 * local15 >> 8);
					local37 = local6.anInt3168 + (local6.anInt3174 * local15 >> 8);
					local47 = local6.anInt3179 + (local6.anInt3181 * local15 >> 8);
					local57 = local6.anInt3180 + (local6.anInt3169 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3170 == 5) {
				local15 = arg1 - local6.anInt3179;
				if (local15 > 0) {
					local27 = local6.anInt3163 + (local6.anInt3165 * local15 >> 8);
					local37 = local6.anInt3168 + (local6.anInt3174 * local15 >> 8);
					local47 = local6.anInt3166 + (local6.anInt3177 * local15 >> 8);
					local57 = local6.anInt3175 + (local6.anInt3164 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	public static void method852() {
		aClass28_343 = null;
		aClass3_Sub2_Sub2_Sub3Array3 = null;
		anObject1 = null;
		aClass28_346 = null;
		aBooleanArrayArrayArrayArray1 = null;
		aClass87_4 = null;
		aClass28_344 = null;
		aClass28_345 = null;
		aClass3_Sub12Array1 = null;
		anIntArray189 = null;
		aClass3_Sub2_Sub1_Sub2_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method854() {
		Static164.aClass63_29.method2344();
		Static100.aClass63_17.method2344();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILclient!gf;II)V")
	public static void method856(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static16.anInt490 >= 3) {
			Static147.method1781(arg0, arg3, arg1.anIntArray263, arg1.anIntArray265);
		} else {
			Static156.aClass3_Sub2_Sub2_Sub4_7.method1004(arg0, arg3, arg1.anInt1457, arg1.anInt1515, Static156.aClass3_Sub2_Sub2_Sub4_7.anInt1175 / 2, Static156.aClass3_Sub2_Sub2_Sub4_7.anInt1171 / 2, Static139.anInt3673, arg1.anIntArray263, arg1.anIntArray265);
		}
		Static118.aBooleanArray13[arg2] = true;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)V")
	public static void method860() {
		Static141.method2765(false);
		Static136.anInt3477 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static45.aByteArrayArray33.length; local14++) {
			if (Static2.anIntArray16[local14] != -1 && Static45.aByteArrayArray33[local14] == null) {
				Static45.aByteArrayArray33[local14] = Static76.aClass7_Sub1_10.method1021(Static2.anIntArray16[local14], 0);
				if (Static45.aByteArrayArray33[local14] == null) {
					Static136.anInt3477++;
					local12 = false;
				}
			}
			if (Static101.anIntArray465[local14] != -1 && Static37.aByteArrayArray30[local14] == null) {
				Static37.aByteArrayArray30[local14] = Static76.aClass7_Sub1_10.method1033(Static151.anIntArrayArray28[local14], 0, Static101.anIntArray465[local14]);
				if (Static37.aByteArrayArray30[local14] == null) {
					local12 = false;
					Static136.anInt3477++;
				}
			}
		}
		if (!local12) {
			Static100.anInt2652 = 1;
			return;
		}
		Static114.anInt2921 = 0;
		local12 = true;
		@Pc(124) int local124;
		@Pc(113) int local113;
		for (@Pc(94) int local94 = 0; local94 < Static45.aByteArrayArray33.length; local94++) {
			@Pc(100) byte[] local100 = Static37.aByteArrayArray30[local94];
			if (local100 != null) {
				local113 = (Static173.anIntArray691[local94] & 0xFF) * 64 - Static29.anInt907;
				local124 = (Static173.anIntArray691[local94] >> 8) * 64 - Static111.anInt2843;
				if (Static29.aBoolean49) {
					local124 = 10;
					local113 = 10;
				}
				local12 &= Static105.method2159(local124, local100, local113);
			}
		}
		if (!local12) {
			Static100.anInt2652 = 2;
			return;
		}
		if (Static100.anInt2652 != 0) {
			Static128.method2519(true, Static4.method96(new Class28[] { Static171.aClass28_1433, Static127.aClass28_1069 }));
		}
		Static110.method2233();
		Static86.method1985();
		Static110.method2233();
		Static116.method2333();
		Static110.method2233();
		System.gc();
		for (@Pc(184) int local184 = 0; local184 < 4; local184++) {
			Static45.aClass21Array1[local184].method805();
		}
		@Pc(207) int local207;
		for (local124 = 0; local124 < 4; local124++) {
			for (local113 = 0; local113 < 104; local113++) {
				for (local207 = 0; local207 < 104; local207++) {
					Static157.aByteArrayArrayArray41[local124][local113][local207] = 0;
				}
			}
		}
		Static110.method2233();
		Static45.method1073();
		local113 = Static45.aByteArrayArray33.length;
		Static59.method1336();
		Static141.method2765(true);
		@Pc(260) int local260;
		@Pc(271) int local271;
		@Pc(375) int local375;
		@Pc(324) int local324;
		@Pc(386) int local386;
		if (!Static29.aBoolean49) {
			@Pc(275) byte[] local275;
			for (local207 = 0; local207 < local113; local207++) {
				local260 = (Static173.anIntArray691[local207] >> 8) * 64 - Static111.anInt2843;
				local271 = (Static173.anIntArray691[local207] & 0xFF) * 64 - Static29.anInt907;
				local275 = Static45.aByteArrayArray33[local207];
				if (local275 != null) {
					Static110.method2233();
					Static128.method2516(Static45.aClass21Array1, local260, (Static119.anInt3081 - 6) * 8, local271, (Static19.anInt551 - 6) * 8, local275);
				}
			}
			for (local260 = 0; local260 < local113; local260++) {
				local271 = (Static173.anIntArray691[local260] >> 8) * 64 - Static111.anInt2843;
				local324 = (Static173.anIntArray691[local260] & 0xFF) * 64 - Static29.anInt907;
				@Pc(328) byte[] local328 = Static45.aByteArrayArray33[local260];
				if (local328 == null && Static19.anInt551 < 800) {
					Static110.method2233();
					Static132.method2566(64, 64, local271, local324);
				}
			}
			Static141.method2765(true);
			for (local271 = 0; local271 < local113; local271++) {
				local275 = Static37.aByteArrayArray30[local271];
				if (local275 != null) {
					local375 = (Static173.anIntArray691[local271] & 0xFF) * 64 - Static29.anInt907;
					local386 = (Static173.anIntArray691[local271] >> 8) * 64 - Static111.anInt2843;
					Static110.method2233();
					Static109.method2208(local275, local386, Static45.aClass21Array1, local375);
				}
			}
		}
		@Pc(434) int local434;
		@Pc(440) int local440;
		if (Static29.aBoolean49) {
			@Pc(446) int local446;
			@Pc(456) int local456;
			@Pc(464) int local464;
			for (local207 = 0; local207 < 4; local207++) {
				Static110.method2233();
				for (local260 = 0; local260 < 13; local260++) {
					for (local271 = 0; local271 < 13; local271++) {
						@Pc(416) boolean local416 = false;
						local386 = Static19.anIntArrayArrayArray11[local207][local260][local271];
						if (local386 != -1) {
							local434 = local386 >> 1 & 0x3;
							local440 = local386 >> 14 & 0x3FF;
							local446 = local386 >> 3 & 0x7FF;
							local456 = (local440 / 8 << 8) + local446 / 8;
							local375 = local386 >> 24 & 0x3;
							for (local464 = 0; local464 < Static173.anIntArray691.length; local464++) {
								if (local456 == Static173.anIntArray691[local464] && Static45.aByteArrayArray33[local464] != null) {
									Static140.method2744(Static45.aClass21Array1, local434, local375, Static45.aByteArrayArray33[local464], local260 * 8, (local446 & 0x7) * 8, (local440 & 0x7) * 8, local207, local271 * 8);
									local416 = true;
									break;
								}
							}
						}
						if (!local416) {
							Static114.method2284(local207, local271 * 8, local260 * 8);
						}
					}
				}
			}
			for (local260 = 0; local260 < 13; local260++) {
				for (local271 = 0; local271 < 13; local271++) {
					local324 = Static19.anIntArrayArrayArray11[0][local260][local271];
					if (local324 == -1) {
						Static132.method2566(8, 8, local260 * 8, local271 * 8);
					}
				}
			}
			Static141.method2765(true);
			for (local271 = 0; local271 < 4; local271++) {
				Static110.method2233();
				for (local324 = 0; local324 < 13; local324++) {
					for (local386 = 0; local386 < 13; local386++) {
						local375 = Static19.anIntArrayArrayArray11[local271][local324][local386];
						if (local375 != -1) {
							local434 = local375 >> 24 & 0x3;
							local440 = local375 >> 1 & 0x3;
							local446 = local375 >> 14 & 0x3FF;
							local456 = local375 >> 3 & 0x7FF;
							local464 = local456 / 8 + (local446 / 8 << 8);
							for (@Pc(644) int local644 = 0; local644 < Static173.anIntArray691.length; local644++) {
								if (local464 == Static173.anIntArray691[local644] && Static37.aByteArrayArray30[local644] != null) {
									Static21.method592(Static37.aByteArrayArray30[local644], local440, Static45.aClass21Array1, (local456 & 0x7) * 8, local434, (local446 & 0x7) * 8, local386 * 8, local324 * 8, local271);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static141.method2765(true);
		Static86.method1985();
		Static110.method2233();
		Static135.method2647(Static45.aClass21Array1);
		Static141.method2765(true);
		local207 = Static170.anInt4097;
		if (local207 > Static171.anInt4109) {
			local207 = Static171.anInt4109;
		}
		if (Static171.anInt4109 - 1 > local207) {
		}
		if (Static179.aBoolean202) {
			Static148.method1433(Static170.anInt4097);
		} else {
			Static148.method1433(0);
		}
		for (local260 = 0; local260 < 104; local260++) {
			for (local271 = 0; local271 < 104; local271++) {
				Static138.method2711(local271, local260);
			}
		}
		Static110.method2233();
		Static112.method2252();
		Static86.method1985();
		if (Static29.aFrame1 != null) {
			Static51.aClass3_Sub8_Sub1_2.method1559(183);
			Static51.aClass3_Sub8_Sub1_2.method1547(1057001181);
		}
		if (!Static29.aBoolean49) {
			local375 = (Static19.anInt551 + 6) / 8;
			local324 = (Static119.anInt3081 + 6) / 8;
			local386 = (Static19.anInt551 - 6) / 8;
			local271 = (Static119.anInt3081 - 6) / 8;
			for (local434 = local271 - 1; local434 <= local324 + 1; local434++) {
				for (local440 = local386 - 1; local440 <= local375 + 1; local440++) {
					if (local271 > local434 || local324 < local434 || local386 > local440 || local375 < local440) {
						Static76.aClass7_Sub1_10.method1016(Static4.method96(new Class28[] { Static80.aClass28_1201, Static146.method2793(local434), Static103.aClass28_851, Static146.method2793(local440) }));
						Static76.aClass7_Sub1_10.method1016(Static4.method96(new Class28[] { Static31.aClass28_314, Static146.method2793(local434), Static103.aClass28_851, Static146.method2793(local440) }));
					}
				}
			}
		}
		Static173.method3141(30);
		Static110.method2233();
		Static94.method2072();
		Static51.aClass3_Sub8_Sub1_2.method1559(79);
		Static94.method2078();
	}
}
