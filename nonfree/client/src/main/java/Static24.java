import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!e", name = "hc", descriptor = "I")
	public static int anInt684;

	@OriginalMember(owner = "client!e", name = "ic", descriptor = "Lclient!rd;")
	public static Class64 aClass64_19;

	@OriginalMember(owner = "client!e", name = "nc", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!e", name = "Tb", descriptor = "[I")
	public static int[] anIntArray40 = new int[32768];

	@OriginalMember(owner = "client!e", name = "Xb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_325 = Static75.method1216("Chat panel redrawn");

	@OriginalMember(owner = "client!e", name = "dc", descriptor = "J")
	public static long aLong18 = 0L;

	@OriginalMember(owner = "client!e", name = "ec", descriptor = "I")
	public static int anInt681 = 0;

	@OriginalMember(owner = "client!e", name = "kc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_326 = Static75.method1216("mapdots");

	@OriginalMember(owner = "client!e", name = "lc", descriptor = "Lclient!ad;")
	private static Class4 aClass4_327 = Static75.method1216("(X100(U(Y");

	@OriginalMember(owner = "client!e", name = "pc", descriptor = "I")
	public static final int anInt687 = 5063219;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!rd;BLclient!rd;Lclient!rd;)V")
	public static void method460(@OriginalArg(0) Class64 arg0, @OriginalArg(2) Class64 arg1, @OriginalArg(3) Class64 arg2) {
		Static11.aClass64_82 = arg1;
		Static6.aClass64_10 = arg0;
		Static66.aClass64_48 = arg2;
		Static104.aClass3_Sub1_Sub14ArrayArray1 = new Class3_Sub1_Sub14[Static6.aClass64_10.method1635()][];
		Static30.aBooleanArray6 = new boolean[Static6.aClass64_10.method1635()];
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!ab;I)V")
	public static void method465(@OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt2342 < 128 || arg0.anInt2348 < 128 || arg0.anInt2342 >= 13184 || arg0.anInt2348 >= 13184) {
			arg0.anInt2335 = -1;
			arg0.anInt2320 = -1;
			arg0.anInt2303 = 0;
			arg0.anInt2334 = 0;
			arg0.anInt2342 = arg0.anIntArray289[0] * 128 + arg0.anInt2319 * 64;
			arg0.anInt2348 = arg0.anIntArray286[0] * 128 + arg0.anInt2319 * 64;
			arg0.method1549();
		}
		if (arg0 == Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1 && (arg0.anInt2342 < 1536 || arg0.anInt2348 < 1536 || arg0.anInt2342 >= 11776 || arg0.anInt2348 >= 11776)) {
			arg0.anInt2303 = 0;
			arg0.anInt2320 = -1;
			arg0.anInt2334 = 0;
			arg0.anInt2335 = -1;
			arg0.anInt2342 = arg0.anInt2319 * 64 + arg0.anIntArray289[0] * 128;
			arg0.anInt2348 = arg0.anIntArray286[0] * 128 + arg0.anInt2319 * 64;
			arg0.method1549();
		}
		if (arg0.anInt2334 > Static60.anInt1489) {
			Static86.method1369(arg0);
		} else if (arg0.anInt2303 < Static60.anInt1489) {
			Static48.method839(arg0);
		} else {
			Static17.method241(arg0);
		}
		Static4.method116(arg0);
		Static73.method1181(arg0);
	}

	@OriginalMember(owner = "client!e", name = "l", descriptor = "(B)V")
	public static void method466() {
		try {
			@Pc(11) Graphics local11 = Static9.aCanvas1.getGraphics();
			Static73.aClass25_84.method1161(357, local11, 17);
		} catch (@Pc(19) Exception local19) {
			Static9.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!e", name = "s", descriptor = "(I)V")
	public static void method469() {
		anIntArray40 = null;
		aClass4_325 = null;
		aClass2_1 = null;
		aClass64_19 = null;
		aClass4_326 = null;
		aClass4_327 = null;
	}

	@OriginalMember(owner = "client!e", name = "m", descriptor = "(B)V")
	public static void method471() {
		@Pc(7) boolean local7 = true;
		Static75.method1217(false);
		Static71.anInt1711 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static32.aByteArrayArray4.length; local14++) {
			if (Static67.anIntArray231[local14] != -1 && Static32.aByteArrayArray4[local14] == null) {
				Static32.aByteArrayArray4[local14] = Static20.aClass64_Sub1_1.method1625(Static67.anIntArray231[local14], 0);
				if (Static32.aByteArrayArray4[local14] == null) {
					Static71.anInt1711++;
					local7 = false;
				}
			}
			if (Static47.anIntArray172[local14] != -1 && Static5.aByteArrayArray1[local14] == null) {
				Static5.aByteArrayArray1[local14] = Static20.aClass64_Sub1_1.method1618(0, Static12.anIntArrayArray1[local14], Static47.anIntArray172[local14]);
				if (Static5.aByteArrayArray1[local14] == null) {
					local7 = false;
					Static71.anInt1711++;
				}
			}
		}
		if (!local7) {
			Static16.anInt363 = 1;
			return;
		}
		Static76.anInt1811 = 0;
		local7 = true;
		@Pc(119) int local119;
		@Pc(130) int local130;
		for (@Pc(100) int local100 = 0; local100 < Static32.aByteArrayArray4.length; local100++) {
			@Pc(106) byte[] local106 = Static5.aByteArrayArray1[local100];
			if (local106 != null) {
				local119 = (Static70.anIntArray232[local100] >> 8) * 64 - Static43.anInt1144;
				local130 = (Static70.anIntArray232[local100] & 0xFF) * 64 - Static93.anInt2429;
				if (Static19.aBoolean31) {
					local130 = 10;
					local119 = 10;
				}
				local7 &= Static19.method287(local130, local106, local119);
			}
		}
		if (!local7) {
			Static16.anInt363 = 2;
			return;
		}
		if (Static16.anInt363 != 0) {
			Static63.method1086(true, Static60.aClass4_756, aClass4_327);
		}
		Static7.method170();
		Static38.aClass61_30.method1310();
		System.gc();
		for (@Pc(170) int local170 = 0; local170 < 4; local170++) {
			Static12.aClass40Array1[local170].method882();
		}
		@Pc(193) int local193;
		for (local119 = 0; local119 < 4; local119++) {
			for (local130 = 0; local130 < 104; local130++) {
				for (local193 = 0; local193 < 104; local193++) {
					Static11.aByteArrayArrayArray55[local119][local130][local193] = 0;
				}
			}
		}
		Static87.method989();
		local130 = Static32.aByteArrayArray4.length;
		Static36.method712();
		Static75.method1217(true);
		@Pc(247) int local247;
		@Pc(262) int local262;
		@Pc(361) int local361;
		@Pc(314) int local314;
		@Pc(372) int local372;
		if (!Static19.aBoolean31) {
			@Pc(251) byte[] local251;
			for (local193 = 0; local193 < local130; local193++) {
				local247 = (Static70.anIntArray232[local193] >> 8) * 64 - Static43.anInt1144;
				local251 = Static32.aByteArrayArray4[local193];
				local262 = (Static70.anIntArray232[local193] & 0xFF) * 64 - Static93.anInt2429;
				if (local251 != null) {
					Static18.method282(local247, (Static92.anInt2129 - 6) * 8, Static12.aClass40Array1, local251, local262, Static92.anInt2106 * 8 - 48);
				}
			}
			for (local247 = 0; local247 < local130; local247++) {
				local262 = (Static70.anIntArray232[local247] >> 8) * 64 - Static43.anInt1144;
				local314 = (Static70.anIntArray232[local247] & 0xFF) * 64 - Static93.anInt2429;
				@Pc(318) byte[] local318 = Static32.aByteArrayArray4[local247];
				if (local318 == null && Static92.anInt2129 < 800) {
					Static93.method1636(64, local314, local262, 64);
				}
			}
			Static75.method1217(true);
			for (local262 = 0; local262 < local130; local262++) {
				local251 = Static5.aByteArrayArray1[local262];
				if (local251 != null) {
					local361 = (Static70.anIntArray232[local262] & 0xFF) * 64 - Static93.anInt2429;
					local372 = (Static70.anIntArray232[local262] >> 8) * 64 - Static43.anInt1144;
					Static63.method1085(local251, local372, Static38.aClass61_30, Static12.aClass40Array1, local361);
				}
			}
		}
		@Pc(423) int local423;
		@Pc(429) int local429;
		if (Static19.aBoolean31) {
			@Pc(435) int local435;
			@Pc(445) int local445;
			@Pc(447) int local447;
			for (local193 = 0; local193 < 4; local193++) {
				for (local247 = 0; local247 < 13; local247++) {
					for (local262 = 0; local262 < 13; local262++) {
						@Pc(399) boolean local399 = false;
						local372 = Static86.anIntArrayArrayArray24[local193][local247][local262];
						if (local372 != -1) {
							local361 = local372 >> 24 & 0x3;
							local423 = local372 >> 1 & 0x3;
							local429 = local372 >> 14 & 0x3FF;
							local435 = local372 >> 3 & 0x7FF;
							local445 = (local429 / 8 << 8) + local435 / 8;
							for (local447 = 0; local447 < Static70.anIntArray232.length; local447++) {
								if (Static70.anIntArray232[local447] == local445 && Static32.aByteArrayArray4[local447] != null) {
									Static8.method190((local435 & 0x7) * 8, local361, local262 * 8, Static32.aByteArrayArray4[local447], local193, local423, local247 * 8, Static12.aClass40Array1, (local429 & 0x7) * 8);
									local399 = true;
									break;
								}
							}
						}
						if (!local399) {
							Static20.method290(local262 * 8, local247 * 8, local193);
						}
					}
				}
			}
			for (local247 = 0; local247 < 13; local247++) {
				for (local262 = 0; local262 < 13; local262++) {
					local314 = Static86.anIntArrayArrayArray24[0][local247][local262];
					if (local314 == -1) {
						Static93.method1636(8, local262 * 8, local247 * 8, 8);
					}
				}
			}
			Static75.method1217(true);
			for (local262 = 0; local262 < 4; local262++) {
				for (local314 = 0; local314 < 13; local314++) {
					for (local372 = 0; local372 < 13; local372++) {
						local361 = Static86.anIntArrayArrayArray24[local262][local314][local372];
						if (local361 != -1) {
							local423 = local361 >> 24 & 0x3;
							local429 = local361 >> 1 & 0x3;
							local435 = local361 >> 14 & 0x3FF;
							local445 = local361 >> 3 & 0x7FF;
							local447 = (local435 / 8 << 8) + (local445 / 8);
							for (@Pc(625) int local625 = 0; local625 < Static70.anIntArray232.length; local625++) {
								if (local447 == Static70.anIntArray232[local625] && Static5.aByteArrayArray1[local625] != null) {
									Static9.method194(local314 * 8, local429, (local445 & 0x7) * 8, local423, Static12.aClass40Array1, Static38.aClass61_30, (local435 & 0x7) * 8, local262, local372 * 8, Static5.aByteArrayArray1[local625]);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static75.method1217(true);
		Static7.method170();
		Static15.method227(Static12.aClass40Array1, Static38.aClass61_30);
		Static75.method1217(true);
		local193 = Static47.anInt1185;
		if (local193 > Static49.anInt1203) {
			local193 = Static49.anInt1203;
		}
		if (Static49.anInt1203 - 1 > local193) {
		}
		if (Static36.aBoolean70) {
			Static38.aClass61_30.method1332(Static47.anInt1185);
		} else {
			Static38.aClass61_30.method1332(0);
		}
		for (local247 = 0; local247 < 104; local247++) {
			for (local262 = 0; local262 < 104; local262++) {
				Static39.method728(local247, local262);
			}
		}
		Static75.method1214();
		Static101.aClass8_30.method198();
		if (Static69.aFrame3 != null) {
			Static5.aClass3_Sub4_Sub1_1.method464(11);
			Static5.aClass3_Sub4_Sub1_1.method424(1057001181);
		}
		if (!Static19.aBoolean31) {
			local262 = (Static92.anInt2106 - 6) / 8;
			local372 = (Static92.anInt2129 - 6) / 8;
			local314 = (Static92.anInt2106 + 6) / 8;
			local361 = (Static92.anInt2129 + 6) / 8;
			for (local423 = local262 - 1; local423 <= local314 + 1; local423++) {
				for (local429 = local372 - 1; local429 <= local361 + 1; local429++) {
					if (local262 > local423 || local423 > local314 || local429 < local372 || local361 < local429) {
						Static20.aClass64_Sub1_1.method1613(Static60.method1012(new Class4[] { Static78.aClass4_229, Static93.method1632(local423), Static19.aClass4_236, Static93.method1632(local429) }));
						Static20.aClass64_Sub1_1.method1613(Static60.method1012(new Class4[] { Static79.aClass4_1055, Static93.method1632(local423), Static19.aClass4_236, Static93.method1632(local429) }));
					}
				}
			}
		}
		if (Static60.anInt1484 == -1) {
			Static60.method1007(30);
		} else {
			Static60.method1007(35);
		}
		Static44.method806();
		Static5.aClass3_Sub4_Sub1_1.method464(194);
		Static16.method236();
	}
}
