import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!vf", name = "db", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!vf", name = "ib", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1451 = Static146.method2172("purple:");

	@OriginalMember(owner = "client!vf", name = "bb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1448 = aClass77_1451;

	@OriginalMember(owner = "client!vf", name = "pb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1453 = Static146.method2172("Select a world");

	@OriginalMember(owner = "client!vf", name = "eb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1449 = aClass77_1453;

	@OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1450 = aClass77_1451;

	@OriginalMember(owner = "client!vf", name = "lb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1452 = Static146.method2172("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!vf", name = "qb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1454 = Static146.method2172(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!vf", name = "tb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1455 = Static146.method2172("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!vf", name = "vb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1456 = aClass77_1452;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)I")
	public static int method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class2_Sub13 local10 = (Class2_Sub13) Static3.aClass74_1.method2433((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && local10.anIntArray336.length > arg1) {
			return local10.anIntArray336[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI[Lclient!vb;[BII)V")
	public static void method2867(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class86[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg4 > 0 && local7 + arg4 < 103 && local11 + arg1 > 0 && arg1 + local11 < 103) {
						arg2[local3].anIntArrayArray36[arg4 + local7][arg1 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(81) Class2_Sub18 local81 = new Class2_Sub18(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
				for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
					Static31.method612(local92 + arg4, local11, local96 + arg1, local81, 0, arg0, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)Lclient!u;")
	public static Class2_Sub2_Sub17 method2868(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub17 local6 = (Class2_Sub2_Sub17) Static24.aClass82_14.method2699((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static58.aClass43_16.method2205(arg0, 3);
		local6 = new Class2_Sub2_Sub17();
		if (local25 != null) {
			local6.method2691(new Class2_Sub18(local25));
		}
		Static24.aClass82_14.method2701((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)Z")
	public static boolean method2869() {
		if (Static2.aClass29_2 == null) {
			return false;
		}
		@Pc(130) int local130;
		try {
			@Pc(13) int local13 = Static2.aClass29_2.method966();
			if (local13 == 0) {
				return false;
			}
			if (Static75.anInt1978 == -1) {
				local13--;
				Static2.aClass29_2.method965(0, Static74.aClass2_Sub18_Sub1_1.aByteArray39, 1);
				Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
				Static75.anInt1978 = Static74.aClass2_Sub18_Sub1_1.method2406();
				Static25.anInt731 = Static138.anIntArray500[Static75.anInt1978];
			}
			if (Static25.anInt731 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static2.aClass29_2.method965(0, Static74.aClass2_Sub18_Sub1_1.aByteArray39, 1);
				Static25.anInt731 = Static74.aClass2_Sub18_Sub1_1.aByteArray39[0] & 0xFF;
			}
			if (Static25.anInt731 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static2.aClass29_2.method965(0, Static74.aClass2_Sub18_Sub1_1.aByteArray39, 2);
				local13 -= 2;
				Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
				Static25.anInt731 = Static74.aClass2_Sub18_Sub1_1.method2353();
			}
			if (local13 < Static25.anInt731) {
				return false;
			}
			Static74.aClass2_Sub18_Sub1_1.anInt3423 = 0;
			Static2.aClass29_2.method965(0, Static74.aClass2_Sub18_Sub1_1.aByteArray39, Static25.anInt731);
			Static68.anInt1871 = Static54.anInt1469;
			Static42.anInt1177 = 0;
			Static54.anInt1469 = Static79.anInt2063;
			Static79.anInt2063 = Static75.anInt1978;
			@Pc(138) Class66 local138;
			@Pc(134) Class77 local134;
			if (Static75.anInt1978 == 76) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2359();
				local134 = Static74.aClass2_Sub18_Sub1_1.method2361();
				local138 = Static55.method1034(local130);
				if (!local134.method2519(local138.aClass77_1159)) {
					local138.aClass77_1159 = local134;
					Static57.method2994(local138);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			@Pc(166) int local166;
			@Pc(170) int local170;
			@Pc(187) int local187;
			@Pc(209) int local209;
			@Pc(213) int local213;
			@Pc(297) int local297;
			@Pc(307) long local307;
			@Pc(251) Class2_Sub10 local251;
			@Pc(291) int local291;
			@Pc(295) int local295;
			if (Static75.anInt1978 == 32) {
				local130 = Static25.anInt731 + Static74.aClass2_Sub18_Sub1_1.anInt3423;
				local166 = Static74.aClass2_Sub18_Sub1_1.method2353();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2353();
				if (local166 != Static93.anInt2394) {
					Static93.anInt2394 = local166;
					Static170.method2835(Static93.anInt2394);
					Static163.method2751(Static93.anInt2394);
					for (local187 = 0; local187 < 100; local187++) {
						Static103.aBooleanArray9[local187] = true;
					}
				}
				while (local170-- > 0) {
					local187 = Static74.aClass2_Sub18_Sub1_1.method2382();
					local209 = Static74.aClass2_Sub18_Sub1_1.method2353();
					local213 = Static74.aClass2_Sub18_Sub1_1.method2387();
					@Pc(220) Class2_Sub10 local220 = (Class2_Sub10) Static177.aClass74_12.method2433((long) local187);
					if (local220 != null && local209 != local220.anInt1896) {
						Static14.method325(true, local220);
						local220 = null;
					}
					if (local220 == null) {
						local220 = Static58.method1068(local213, local209, local187);
					}
					local220.aBoolean84 = true;
				}
				for (local251 = (Class2_Sub10) Static177.aClass74_12.method2430(); local251 != null; local251 = (Class2_Sub10) Static177.aClass74_12.method2435()) {
					if (local251.aBoolean84) {
						local251.aBoolean84 = false;
					} else {
						Static14.method325(true, local251);
					}
				}
				Static179.aClass74_13 = new Class74(512);
				while (local130 > Static74.aClass2_Sub18_Sub1_1.anInt3423) {
					local209 = Static74.aClass2_Sub18_Sub1_1.method2382();
					local213 = Static74.aClass2_Sub18_Sub1_1.method2353();
					local291 = Static74.aClass2_Sub18_Sub1_1.method2353();
					local295 = Static74.aClass2_Sub18_Sub1_1.method2382();
					for (local297 = local213; local297 <= local291; local297++) {
						local307 = (long) local297 + ((long) local209 << 32);
						Static179.aClass74_13.method2432(local307, new Class2_Sub3(local295));
					}
				}
				Static75.anInt1978 = -1;
				return true;
			}
			@Pc(560) int local560;
			@Pc(338) long local338;
			@Pc(506) int local506;
			if (Static75.anInt1978 == 150) {
				local338 = Static74.aClass2_Sub18_Sub1_1.method2346();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2353();
				local187 = Static74.aClass2_Sub18_Sub1_1.method2387();
				@Pc(352) Class77 local352 = Static107.method1884(local338).method2525();
				for (local213 = 0; local213 < Static51.anInt1395; local213++) {
					if (Static125.aLongArray6[local213] == local338) {
						if (Static11.anIntArray41[local213] != local170) {
							Static11.anIntArray41[local213] = local170;
							if (local170 > 0) {
								Static174.method2943(Static41.aClass77_468, Static146.method2168(new Class77[] { local352, Static134.aClass77_1185 }), 5);
							}
							if (local170 == 0) {
								Static174.method2943(Static41.aClass77_468, Static146.method2168(new Class77[] { local352, Static101.aClass77_972 }), 5);
							}
						}
						local352 = null;
						Static169.anIntArray599[local213] = local187;
						break;
					}
				}
				if (local352 != null && Static51.anInt1395 < 200) {
					Static125.aLongArray6[Static51.anInt1395] = local338;
					Static120.aClass77Array7[Static51.anInt1395] = local352;
					Static11.anIntArray41[Static51.anInt1395] = local170;
					Static169.anIntArray599[Static51.anInt1395] = local187;
					Static51.anInt1395++;
				}
				Static8.anInt229 = Static52.anInt1417;
				local295 = Static51.anInt1395;
				while (local295 > 0) {
					@Pc(459) boolean local459 = true;
					local295--;
					for (local297 = 0; local297 < local295; local297++) {
						if (Static70.anInt1900 != Static11.anIntArray41[local297] && Static11.anIntArray41[local297 + 1] == Static70.anInt1900 || Static11.anIntArray41[local297] == 0 && Static11.anIntArray41[local297 + 1] != 0) {
							local459 = false;
							local506 = Static11.anIntArray41[local297];
							Static11.anIntArray41[local297] = Static11.anIntArray41[local297 + 1];
							Static11.anIntArray41[local297 + 1] = local506;
							@Pc(524) Class77 local524 = Static120.aClass77Array7[local297];
							Static120.aClass77Array7[local297] = Static120.aClass77Array7[local297 + 1];
							Static120.aClass77Array7[local297 + 1] = local524;
							@Pc(542) long local542 = Static125.aLongArray6[local297];
							Static125.aLongArray6[local297] = Static125.aLongArray6[local297 + 1];
							Static125.aLongArray6[local297 + 1] = local542;
							local560 = Static169.anIntArray599[local297];
							Static169.anIntArray599[local297] = Static169.anIntArray599[local297 + 1];
							Static169.anIntArray599[local297 + 1] = local560;
						}
					}
					if (local459) {
						break;
					}
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 249) {
				Static16.anInt525 = Static74.aClass2_Sub18_Sub1_1.method2352();
				Static83.anInt2156 = Static74.aClass2_Sub18_Sub1_1.method2377();
				while (Static25.anInt731 > Static74.aClass2_Sub18_Sub1_1.anInt3423) {
					Static75.anInt1978 = Static74.aClass2_Sub18_Sub1_1.method2387();
					Static24.method517();
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 186) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2353();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2363();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2395();
				local187 = Static74.aClass2_Sub18_Sub1_1.method2373();
				@Pc(651) Class66 local651 = Static55.method1034(local187);
				if (local651.anInt3235 != local170 || local166 != local651.anInt3220 || local651.anInt3243 != local130) {
					local651.anInt3235 = local170;
					local651.anInt3243 = local130;
					local651.anInt3220 = local166;
					Static57.method2994(local651);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 63) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2348();
				Static5.aClass78_1 = Static144.aClass50_4.method1752(local130);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 146) {
				Static92.anInt2387 = Static74.aClass2_Sub18_Sub1_1.method2353() * 30;
				Static62.anInt1664 = Static52.anInt1417;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 224) {
				Static105.method1833(false);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 206) {
				Static42.method811();
				Static75.anInt1978 = -1;
				return true;
			}
			@Pc(756) boolean local756;
			if (Static75.anInt1978 == 59) {
				local338 = Static74.aClass2_Sub18_Sub1_1.method2346();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2353();
				@Pc(754) byte local754 = Static74.aClass2_Sub18_Sub1_1.method2392();
				local756 = false;
				if ((Long.MIN_VALUE & local338) != 0L) {
					local756 = true;
				}
				if (local756) {
					if (Static19.anInt621 == 0) {
						Static75.anInt1978 = -1;
						return true;
					}
					local338 &= Long.MAX_VALUE;
					for (local213 = 0; local213 < Static19.anInt621 && (local338 != Static33.aClass2_Sub8Array1[local213].aLong134 || local170 != Static33.aClass2_Sub8Array1[local213].anInt1679); local213++) {
					}
					if (local213 < Static19.anInt621) {
						while (Static19.anInt621 - 1 > local213) {
							Static33.aClass2_Sub8Array1[local213] = Static33.aClass2_Sub8Array1[local213 + 1];
							local213++;
						}
						Static19.anInt621--;
						Static33.aClass2_Sub8Array1[Static19.anInt621] = null;
					}
				} else {
					@Pc(772) Class2_Sub8 local772 = new Class2_Sub8();
					local772.aLong134 = local338;
					local772.aClass77_640 = Static107.method1884(local772.aLong134);
					local772.aByte4 = local754;
					local772.anInt1679 = local170;
					for (local291 = Static19.anInt621 - 1; local291 >= 0; local291--) {
						local295 = Static33.aClass2_Sub8Array1[local291].aClass77_640.method2510(local772.aClass77_640);
						if (local295 == 0) {
							Static33.aClass2_Sub8Array1[local291].anInt1679 = local170;
							Static33.aClass2_Sub8Array1[local291].aByte4 = local754;
							Static75.anInt1978 = -1;
							Static11.anInt308 = Static52.anInt1417;
							if (local338 == Static40.aLong39) {
								Static177.aByte9 = local754;
							}
							return true;
						}
						if (local295 < 0) {
							break;
						}
					}
					if (Static19.anInt621 >= Static33.aClass2_Sub8Array1.length) {
						Static75.anInt1978 = -1;
						return true;
					}
					for (local295 = Static19.anInt621 - 1; local295 > local291; local295--) {
						Static33.aClass2_Sub8Array1[local295 + 1] = Static33.aClass2_Sub8Array1[local295];
					}
					if (Static19.anInt621 == 0) {
						Static33.aClass2_Sub8Array1 = new Class2_Sub8[100];
					}
					Static33.aClass2_Sub8Array1[local291 + 1] = local772;
					if (local338 == Static40.aLong39) {
						Static177.aByte9 = local754;
					}
					Static19.anInt621++;
				}
				Static11.anInt308 = Static52.anInt1417;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 73) {
				Static84.anInt3146 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 252) {
				Static105.method1833(true);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 29) {
				Static16.aBoolean29 = false;
				for (local130 = 0; local130 < 5; local130++) {
					Static31.aBooleanArray4[local130] = false;
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 160) {
				Static38.anInt1109 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static27.anInt816 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static66.anInt1833 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 31 || Static75.anInt1978 == 148 || Static75.anInt1978 == 39 || Static75.anInt1978 == 67 || Static75.anInt1978 == 108 || Static75.anInt1978 == 151 || Static75.anInt1978 == 15 || Static75.anInt1978 == 248 || Static75.anInt1978 == 124 || Static75.anInt1978 == 225 || Static75.anInt1978 == 43) {
				Static24.method517();
				Static75.anInt1978 = -1;
				return true;
			}
			@Pc(1218) int local1218;
			@Pc(1118) long local1118;
			if (Static75.anInt1978 == 50) {
				Static11.anInt308 = Static52.anInt1417;
				local338 = Static74.aClass2_Sub18_Sub1_1.method2346();
				if (local338 == 0L) {
					Static33.aClass2_Sub8Array1 = null;
					Static19.anInt621 = 0;
					Static75.anInt1978 = -1;
					Static98.aClass77_956 = null;
					Static96.aClass77_932 = null;
					return true;
				}
				local1118 = Static74.aClass2_Sub18_Sub1_1.method2346();
				Static96.aClass77_932 = Static107.method1884(local1118);
				Static98.aClass77_956 = Static107.method1884(local338);
				Static105.aByte7 = Static74.aClass2_Sub18_Sub1_1.method2392();
				local209 = Static74.aClass2_Sub18_Sub1_1.method2387();
				if (local209 == 255) {
					Static75.anInt1978 = -1;
					return true;
				}
				Static19.anInt621 = local209;
				@Pc(1146) Class2_Sub8[] local1146 = new Class2_Sub8[100];
				for (local291 = 0; local291 < Static19.anInt621; local291++) {
					local1146[local291] = new Class2_Sub8();
					local1146[local291].aLong134 = Static74.aClass2_Sub18_Sub1_1.method2346();
					local1146[local291].aClass77_640 = Static107.method1884(local1146[local291].aLong134);
					local1146[local291].anInt1679 = Static74.aClass2_Sub18_Sub1_1.method2353();
					local1146[local291].aByte4 = Static74.aClass2_Sub18_Sub1_1.method2392();
					if (Static40.aLong39 == local1146[local291].aLong134) {
						Static177.aByte9 = local1146[local291].aByte4;
					}
				}
				local506 = Static19.anInt621;
				while (local506 > 0) {
					local506--;
					@Pc(1216) boolean local1216 = true;
					for (local1218 = 0; local1218 < local506; local1218++) {
						if (local1146[local1218].aClass77_640.method2510(local1146[local1218 + 1].aClass77_640) > 0) {
							local1216 = false;
							@Pc(1239) Class2_Sub8 local1239 = local1146[local1218];
							local1146[local1218] = local1146[local1218 + 1];
							local1146[local1218 + 1] = local1239;
						}
					}
					if (local1216) {
						break;
					}
				}
				Static75.anInt1978 = -1;
				Static33.aClass2_Sub8Array1 = local1146;
				return true;
			}
			if (Static75.anInt1978 == 207) {
				Static16.aBoolean29 = true;
				Static145.anInt3534 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static121.anInt2970 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static126.anInt2296 = Static74.aClass2_Sub18_Sub1_1.method2353();
				Static167.anInt4136 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static106.anInt2609 = Static74.aClass2_Sub18_Sub1_1.method2387();
				if (Static106.anInt2609 >= 100) {
					Static7.anInt215 = Static145.anInt3534 * 128 + 64;
					Static121.anInt2979 = Static121.anInt2970 * 128 + 64;
					Static160.anInt4578 = Static161.method2725(Static7.anInt215, Static54.anInt1472, Static121.anInt2979) - Static126.anInt2296;
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 79) {
				Static157.method2674();
				Static162.anInt1247 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static75.anInt1978 = -1;
				Static62.anInt1664 = Static52.anInt1417;
				return true;
			}
			@Pc(1354) Class77 local1354;
			if (Static75.anInt1978 == 122) {
				local1354 = Static74.aClass2_Sub18_Sub1_1.method2361();
				if (local1354.method2511(Static117.aClass77_1086)) {
					local134 = local1354.method2530(0, local1354.method2514(Static13.aClass77_189));
					local1118 = local134.method2531();
					local756 = false;
					for (local213 = 0; local213 < Static181.anInt4605; local213++) {
						if (local1118 == Static72.aLongArray4[local213]) {
							local756 = true;
							break;
						}
					}
					if (!local756 && Static21.anInt678 == 0) {
						Static174.method2943(local134, Static129.aClass77_1153, 4);
					}
				} else if (local1354.method2511(Static63.aClass77_645)) {
					local134 = local1354.method2530(0, local1354.method2514(Static13.aClass77_189));
					local756 = false;
					local1118 = local134.method2531();
					for (local213 = 0; local213 < Static181.anInt4605; local213++) {
						if (local1118 == Static72.aLongArray4[local213]) {
							local756 = true;
							break;
						}
					}
					if (!local756 && Static21.anInt678 == 0) {
						Static174.method2943(local134, Static108.aClass77_1039, 8);
					}
				} else if (local1354.method2511(Static37.aClass77_422)) {
					local134 = local1354.method2530(0, local1354.method2514(Static13.aClass77_189));
					local1118 = local134.method2531();
					local756 = false;
					for (local213 = 0; local213 < Static181.anInt4605; local213++) {
						if (local1118 == Static72.aLongArray4[local213]) {
							local756 = true;
							break;
						}
					}
					if (!local756 && Static21.anInt678 == 0) {
						@Pc(1473) Class77 local1473 = local1354.method2530(local1354.method2514(Static13.aClass77_189) + 1, local1354.method2532() + -9);
						Static174.method2943(local134, local1473, 8);
					}
				} else if (local1354.method2511(Static140.aClass77_1212)) {
					local134 = local1354.method2530(0, local1354.method2514(Static13.aClass77_189));
					local1118 = local134.method2531();
					local756 = false;
					for (local213 = 0; local213 < Static181.anInt4605; local213++) {
						if (local1118 == Static72.aLongArray4[local213]) {
							local756 = true;
							break;
						}
					}
					if (!local756 && Static21.anInt678 == 0) {
						Static174.method2943(local134, Static41.aClass77_468, 10);
					}
				} else if (local1354.method2511(Static13.aClass77_190)) {
					local134 = local1354.method2530(0, local1354.method2514(Static13.aClass77_190));
					Static174.method2943(Static41.aClass77_468, local134, 11);
				} else if (local1354.method2511(Static145.aClass77_1252)) {
					local134 = local1354.method2530(0, local1354.method2514(Static145.aClass77_1252));
					if (Static21.anInt678 == 0) {
						Static174.method2943(Static41.aClass77_468, local134, 12);
					}
				} else if (local1354.method2511(Static134.aClass77_1183)) {
					local134 = local1354.method2530(0, local1354.method2514(Static134.aClass77_1183));
					if (Static21.anInt678 == 0) {
						Static174.method2943(Static41.aClass77_468, local134, 13);
					}
				} else {
					Static174.method2943(Static41.aClass77_468, local1354, 0);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			@Pc(1682) Class66 local1682;
			if (Static75.anInt1978 == 234) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2364();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2382();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2385();
				local1682 = Static55.method1034(local166);
				local213 = local1682.anInt3222 + local130;
				local209 = local170 + local1682.anInt3178;
				if (local1682.anInt3184 != local209 || local1682.anInt3242 != local213) {
					local1682.anInt3242 = local213;
					local1682.anInt3184 = local209;
					Static57.method2994(local1682);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 162) {
				@Pc(1724) byte local1724 = Static74.aClass2_Sub18_Sub1_1.method2350();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2353();
				Static86.anIntArray373[local166] = local1724;
				if (local1724 != Static6.anIntArray24[local166]) {
					Static6.anIntArray24[local166] = local1724;
					Static56.method1059(local166);
				}
				Static61.anIntArray256[Static103.anInt2518++ & 0x1F] = local166;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 117) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local187 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local209 = Static74.aClass2_Sub18_Sub1_1.method2353();
				Static31.aBooleanArray4[local130] = true;
				Static126.anIntArray377[local130] = local166;
				Static84.anIntArray464[local130] = local170;
				Static144.anIntArray514[local130] = local187;
				Static119.anIntArray449[local130] = local209;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 173) {
				Static103.method1801(Static74.aClass2_Sub18_Sub1_1);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 228) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2353();
				if (local130 == 65535) {
					local130 = -1;
				}
				local166 = Static74.aClass2_Sub18_Sub1_1.method2373();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2373();
				local1682 = Static55.method1034(local166);
				@Pc(1854) Class2_Sub2_Sub9 local1854;
				if (local1682.aBoolean131) {
					local1682.anInt3239 = local170;
					local1682.anInt3240 = local130;
					local1854 = Static158.method2689(local130);
					local1682.anInt3243 = local1854.anInt1800;
					if (local1682.anInt3227 > 0) {
						local1682.anInt3243 = local1682.anInt3243 * 32 / local1682.anInt3227;
					}
					local1682.anInt3205 = local1854.anInt1809;
					local1682.anInt3220 = local1854.anInt1785;
					local1682.anInt3179 = local1854.anInt1776;
					local1682.anInt3196 = local1854.anInt1782;
					local1682.anInt3235 = local1854.anInt1790;
					Static57.method2994(local1682);
				} else if (local130 == -1) {
					Static75.anInt1978 = -1;
					local1682.anInt3187 = 0;
					return true;
				} else {
					local1854 = Static158.method2689(local130);
					local1682.anInt3220 = local1854.anInt1785;
					local1682.anInt3243 = local1854.anInt1800 * 100 / local170;
					local1682.anInt3187 = 4;
					local1682.anInt3183 = local130;
					local1682.anInt3235 = local1854.anInt1790;
					Static57.method2994(local1682);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 202) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2382();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2353();
				if (local130 < -70000) {
					local166 += 32768;
				}
				if (local130 < 0) {
					local138 = null;
				} else {
					local138 = Static55.method1034(local130);
				}
				while (Static25.anInt731 > Static74.aClass2_Sub18_Sub1_1.anInt3423) {
					local187 = Static74.aClass2_Sub18_Sub1_1.method2380();
					local213 = 0;
					local209 = Static74.aClass2_Sub18_Sub1_1.method2353();
					if (local209 != 0) {
						local213 = Static74.aClass2_Sub18_Sub1_1.method2387();
						if (local213 == 255) {
							local213 = Static74.aClass2_Sub18_Sub1_1.method2382();
						}
					}
					if (local138 != null && local187 >= 0 && local187 < local138.anIntArray468.length) {
						local138.anIntArray468[local187] = local209;
						local138.anIntArray474[local187] = local213;
					}
					Static140.method2335(local166, local187, local209 - 1, local213);
				}
				if (local138 != null) {
					Static57.method2994(local138);
				}
				Static157.method2674();
				Static120.anIntArray160[Static166.anInt4383++ & 0x1F] = local166 & 0x7FFF;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 87) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2382();
				@Pc(2068) Class2_Sub10 local2068 = (Class2_Sub10) Static177.aClass74_12.method2433((long) local130);
				if (local2068 != null) {
					Static14.method325(true, local2068);
				}
				if (Static49.aClass66_6 != null) {
					Static57.method2994(Static49.aClass66_6);
					Static49.aClass66_6 = null;
				}
				Static75.anInt1978 = -1;
				return true;
			}
			@Pc(2098) Class66 local2098;
			if (Static75.anInt1978 == 210) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2359();
				local2098 = Static55.method1034(local130);
				for (local170 = 0; local170 < local2098.anIntArray468.length; local170++) {
					local2098.anIntArray468[local170] = -1;
					local2098.anIntArray468[local170] = 0;
				}
				Static57.method2994(local2098);
				Static75.anInt1978 = -1;
				return true;
			}
			@Pc(2145) Class77 local2145;
			if (Static75.anInt1978 == 129) {
				local338 = Static74.aClass2_Sub18_Sub1_1.method2346();
				local2145 = Static102.method1279(Static71.method1387(Static74.aClass2_Sub18_Sub1_1).method2507());
				Static174.method2943(Static107.method1884(local338).method2525(), local2145, 6);
				Static75.anInt1978 = -1;
				return true;
			}
			@Pc(2179) long local2179;
			if (Static75.anInt1978 == 28) {
				local338 = Static74.aClass2_Sub18_Sub1_1.method2346();
				local1118 = Static74.aClass2_Sub18_Sub1_1.method2353();
				@Pc(2174) boolean local2174 = false;
				local2179 = Static74.aClass2_Sub18_Sub1_1.method2341();
				@Pc(2185) long local2185 = local2179 + (local1118 << 32);
				local291 = Static74.aClass2_Sub18_Sub1_1.method2387();
				for (local1218 = 0; local1218 < 100; local1218++) {
					if (local2185 == Static24.aLongArray2[local1218]) {
						local2174 = true;
						break;
					}
				}
				if (local291 <= 1) {
					for (@Pc(2218) int local2218 = 0; local2218 < Static181.anInt4605; local2218++) {
						if (Static72.aLongArray4[local2218] == local338) {
							local2174 = true;
							break;
						}
					}
				}
				if (!local2174 && Static21.anInt678 == 0) {
					Static24.aLongArray2[Static100.anInt812] = local2185;
					Static100.anInt812 = (Static100.anInt812 + 1) % 100;
					@Pc(2262) Class77 local2262 = Static102.method1279(Static71.method1387(Static74.aClass2_Sub18_Sub1_1).method2507());
					if (local291 == 2 || local291 == 3) {
						Static174.method2943(Static146.method2168(new Class77[] { Static139.aClass77_1207, Static107.method1884(local338).method2525() }), local2262, 7);
					} else if (local291 == 1) {
						Static174.method2943(Static146.method2168(new Class77[] { Static174.aClass77_1517, Static107.method1884(local338).method2525() }), local2262, 7);
					} else {
						Static174.method2943(Static107.method1884(local338).method2525(), local2262, 3);
					}
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 70) {
				for (local130 = 0; local130 < Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1.length; local130++) {
					if (Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local130] != null) {
						Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local130].anInt4399 = -1;
					}
				}
				for (local166 = 0; local166 < Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1.length; local166++) {
					if (Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local166] != null) {
						Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local166].anInt4399 = -1;
					}
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 254) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2363();
				Static134.method2282(local130);
				Static120.anIntArray160[Static166.anInt4383++ & 0x1F] = local130 & 0x7FFF;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 161) {
				Static16.anInt525 = Static74.aClass2_Sub18_Sub1_1.method2352();
				Static83.anInt2156 = Static74.aClass2_Sub18_Sub1_1.method2377();
				for (local130 = Static16.anInt525; local130 < Static16.anInt525 + 8; local130++) {
					for (local166 = Static83.anInt2156; local166 < Static83.anInt2156 + 8; local166++) {
						if (Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local130][local166] != null) {
							Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local130][local166] = null;
							Static181.method3022(local130, local166);
						}
					}
				}
				for (@Pc(2463) Class2_Sub16 local2463 = (Class2_Sub16) Static51.aClass10_37.method444(); local2463 != null; local2463 = (Class2_Sub16) Static51.aClass10_37.method451()) {
					if (local2463.anInt2376 >= Static16.anInt525 && local2463.anInt2376 < Static16.anInt525 + 8 && Static83.anInt2156 <= local2463.anInt2386 && local2463.anInt2386 < Static83.anInt2156 + 8 && local2463.anInt2392 == Static54.anInt1472) {
						local2463.anInt2381 = 0;
					}
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 246) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2395();
				Static93.anInt2394 = local130;
				Static170.method2835(local130);
				Static163.method2751(Static93.anInt2394);
				for (local166 = 0; local166 < 100; local166++) {
					Static103.aBooleanArray9[local166] = true;
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 157) {
				Static19.method442();
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 60) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2379();
				if (local130 == 65535) {
					local130 = -1;
				}
				Static132.method2244(local130);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 33) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2395();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2358();
				if (local130 == 65535) {
					local130 = -1;
				}
				Static15.method329(local166, local130);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 169) {
				Static83.anInt2156 = Static74.aClass2_Sub18_Sub1_1.method2377();
				Static16.anInt525 = Static74.aClass2_Sub18_Sub1_1.method2377();
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 103) {
				for (local130 = 0; local130 < Static100.anInt797; local130++) {
					@Pc(2634) Class2_Sub2_Sub13 local2634 = Static89.method1645(local130);
					if (local2634 != null && local2634.anInt2145 == 0) {
						Static86.anIntArray373[local130] = 0;
						Static6.anIntArray24[local130] = 0;
					}
				}
				Static157.method2674();
				Static103.anInt2518 += 32;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 211) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2359();
				local2098 = Static55.method1034(local130);
				local2098.anInt3187 = 3;
				local2098.anInt3183 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass1_2.method2();
				Static57.method2994(local2098);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 54) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2379();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2395();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2373();
				local1682 = Static55.method1034(local170);
				Static75.anInt1978 = -1;
				local1682.anInt3175 = local166 + (local130 << 16);
				return true;
			}
			if (Static75.anInt1978 == 81) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2382();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2353();
				if (local130 >= 0) {
					local138 = Static55.method1034(local130);
				} else {
					local138 = null;
				}
				if (local138 != null) {
					for (local187 = 0; local187 < local138.anIntArray468.length; local187++) {
						local138.anIntArray468[local187] = 0;
						local138.anIntArray474[local187] = 0;
					}
				}
				if (local130 < -70000) {
					local166 += 32768;
				}
				Static179.method2996(local166);
				local187 = Static74.aClass2_Sub18_Sub1_1.method2353();
				for (local209 = 0; local209 < local187; local209++) {
					local213 = Static74.aClass2_Sub18_Sub1_1.method2387();
					if (local213 == 255) {
						local213 = Static74.aClass2_Sub18_Sub1_1.method2382();
					}
					local291 = Static74.aClass2_Sub18_Sub1_1.method2353();
					if (local138 != null && local138.anIntArray468.length > local209) {
						local138.anIntArray468[local209] = local291;
						local138.anIntArray474[local209] = local213;
					}
					Static140.method2335(local166, local209, local291 - 1, local213);
				}
				if (local138 != null) {
					Static57.method2994(local138);
				}
				Static157.method2674();
				Static120.anIntArray160[Static166.anInt4383++ & 0x1F] = local166 & 0x7FFF;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 219) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2359();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2395();
				Static86.anIntArray373[local166] = local130;
				if (local130 != Static6.anIntArray24[local166]) {
					Static6.anIntArray24[local166] = local130;
					Static56.method1059(local166);
				}
				Static61.anIntArray256[Static103.anInt2518++ & 0x1F] = local166;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 89) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2373();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2379();
				local138 = Static55.method1034(local130);
				if (local138.anInt3187 != 1 || local138.anInt3183 != local166) {
					local138.anInt3183 = local166;
					local138.anInt3187 = 1;
					Static57.method2994(local138);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 80) {
				Static40.anInt1155 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static75.anInt1978 = -1;
				Static8.anInt229 = Static52.anInt1417;
				return true;
			}
			if (Static75.anInt1978 == 147) {
				local338 = Static74.aClass2_Sub18_Sub1_1.method2346();
				Static74.aClass2_Sub18_Sub1_1.method2392();
				local1118 = Static74.aClass2_Sub18_Sub1_1.method2346();
				local2179 = Static74.aClass2_Sub18_Sub1_1.method2353();
				@Pc(2984) long local2984 = (long) Static74.aClass2_Sub18_Sub1_1.method2341();
				local297 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local307 = local2984 + (local2179 << 32);
				@Pc(2996) boolean local2996 = false;
				for (@Pc(2998) int local2998 = 0; local2998 < 100; local2998++) {
					if (local307 == Static24.aLongArray2[local2998]) {
						local2996 = true;
						break;
					}
				}
				if (local297 <= 1) {
					for (local560 = 0; local560 < Static181.anInt4605; local560++) {
						if (local338 == Static72.aLongArray4[local560]) {
							local2996 = true;
							break;
						}
					}
				}
				if (!local2996 && Static21.anInt678 == 0) {
					Static24.aLongArray2[Static100.anInt812] = local307;
					Static100.anInt812 = (Static100.anInt812 + 1) % 100;
					@Pc(3065) Class77 local3065 = Static102.method1279(Static71.method1387(Static74.aClass2_Sub18_Sub1_1).method2507());
					if (local297 == 2 || local297 == 3) {
						Static98.method1783(Static146.method2168(new Class77[] { Static139.aClass77_1207, Static107.method1884(local338).method2525() }), 9, Static107.method1884(local1118).method2525(), local3065);
					} else if (local297 == 1) {
						Static98.method1783(Static146.method2168(new Class77[] { Static174.aClass77_1517, Static107.method1884(local338).method2525() }), 9, Static107.method1884(local1118).method2525(), local3065);
					} else {
						Static98.method1783(Static107.method1884(local338).method2525(), 9, Static107.method1884(local1118).method2525(), local3065);
					}
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 123) {
				Static119.anInt2968 = Static74.aClass2_Sub18_Sub1_1.method2387();
				if (Static119.anInt2968 == 1) {
					Static148.anInt3613 = Static74.aClass2_Sub18_Sub1_1.method2353();
				}
				if (Static119.anInt2968 >= 2 && Static119.anInt2968 <= 6) {
					if (Static119.anInt2968 == 2) {
						Static134.anInt3285 = 64;
						Static60.anInt1617 = 64;
					}
					if (Static119.anInt2968 == 3) {
						Static134.anInt3285 = 64;
						Static60.anInt1617 = 0;
					}
					if (Static119.anInt2968 == 4) {
						Static60.anInt1617 = 128;
						Static134.anInt3285 = 64;
					}
					if (Static119.anInt2968 == 5) {
						Static60.anInt1617 = 64;
						Static134.anInt3285 = 0;
					}
					if (Static119.anInt2968 == 6) {
						Static60.anInt1617 = 64;
						Static134.anInt3285 = 128;
					}
					Static119.anInt2968 = 2;
					Static101.anInt2501 = Static74.aClass2_Sub18_Sub1_1.method2353();
					Static152.anInt3739 = Static74.aClass2_Sub18_Sub1_1.method2353();
					Static134.anInt3284 = Static74.aClass2_Sub18_Sub1_1.method2387();
				}
				if (Static119.anInt2968 == 10) {
					Static140.anInt3376 = Static74.aClass2_Sub18_Sub1_1.method2353();
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 139) {
				Static133.method2258();
				Static75.anInt1978 = -1;
				return false;
			}
			if (Static75.anInt1978 == 6) {
				Static157.method2674();
				local130 = Static74.aClass2_Sub18_Sub1_1.method2373();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2374();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static111.anIntArray428[local170] = local130;
				Static147.anIntArray521[local170] = local166;
				Static78.anIntArray343[local170] = 1;
				for (local187 = 0; local187 < 98; local187++) {
					if (Class2_Sub1_Sub20.anIntArray395[local187] <= local130) {
						Static78.anIntArray343[local170] = local187 + 2;
					}
				}
				Static2.anIntArray14[Static59.anInt1574++ & 0x1F] = local170;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 244) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2386();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2373();
				local138 = Static55.method1034(local166);
				if (local130 != local138.anInt3206 || local130 == -1) {
					local138.anInt3209 = 0;
					local138.anInt3206 = local130;
					local138.anInt3226 = 0;
					Static57.method2994(local138);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 120) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2377();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2374();
				local2145 = Static74.aClass2_Sub18_Sub1_1.method2361();
				if (local130 >= 1 && local130 <= 8) {
					if (local2145.method2508(Static56.aClass77_601)) {
						local2145 = null;
					}
					Static38.aClass77Array8[local130 - 1] = local2145;
					Static26.aBooleanArray1[local130 - 1] = local166 == 0;
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 136) {
				Static157.method2674();
				Static82.anInt2150 = Static74.aClass2_Sub18_Sub1_1.method2386();
				Static75.anInt1978 = -1;
				Static62.anInt1664 = Static52.anInt1417;
				return true;
			}
			if (Static75.anInt1978 == 204) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2382();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2395();
				local138 = Static55.method1034(local130);
				if (local138 != null && local138.anInt3230 == 0) {
					if (local138.anInt3207 - local138.anInt3168 < local166) {
						local166 = local138.anInt3207 - local138.anInt3168;
					}
					if (local166 < 0) {
						local166 = 0;
					}
					if (local166 != local138.anInt3189) {
						local138.anInt3189 = local166;
						Static57.method2994(local138);
					}
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 38) {
				Static181.anInt4605 = Static25.anInt731 / 8;
				for (local130 = 0; local130 < Static181.anInt4605; local130++) {
					Static72.aLongArray4[local130] = Static74.aClass2_Sub18_Sub1_1.method2346();
					Static173.aClass77Array26[local130] = Static107.method1884(Static72.aLongArray4[local130]);
				}
				Static75.anInt1978 = -1;
				Static8.anInt229 = Static52.anInt1417;
				return true;
			}
			if (Static75.anInt1978 == 201) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2377();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2377();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2377();
				Static54.anInt1472 = local130 >> 1;
				Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.method2913(local166, (local130 & 0x1) == 1, local170);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 141) {
				if (Static93.anInt2394 != -1) {
					Static175.method2950(Static93.anInt2394, 0);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 243) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2353();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2353();
				Static164.method2753(local170, local166, local130);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 96) {
				for (local130 = 0; local130 < Static6.anIntArray24.length; local130++) {
					if (Static86.anIntArray373[local130] != Static6.anIntArray24[local130]) {
						Static6.anIntArray24[local130] = Static86.anIntArray373[local130];
						Static56.method1059(local130);
						Static61.anIntArray256[Static103.anInt2518++ & 0x1F] = local130;
					}
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 164) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2387();
				if (Static74.aClass2_Sub18_Sub1_1.method2387() == 0) {
					Static80.aClass49Array1[local130] = new Class49();
				} else {
					Static74.aClass2_Sub18_Sub1_1.anInt3423--;
					Static80.aClass49Array1[local130] = new Class49(Static74.aClass2_Sub18_Sub1_1);
				}
				Static75.anInt1978 = -1;
				Static126.anInt2297 = Static52.anInt1417;
				return true;
			}
			if (Static75.anInt1978 == 215) {
				Static136.anInt3295 = 0;
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 66) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2348();
				@Pc(3720) boolean local3720 = Static74.aClass2_Sub18_Sub1_1.method2374() == 1;
				local138 = Static55.method1034(local130);
				if (local138.aBoolean135 != local3720) {
					local138.aBoolean135 = local3720;
					Static57.method2994(local138);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 176) {
				local1354 = Static74.aClass2_Sub18_Sub1_1.method2361();
				@Pc(3762) Object[] local3762 = new Object[local1354.method2532() + 1];
				for (local170 = local1354.method2532() - 1; local170 >= 0; local170--) {
					if (local1354.method2526(local170) == 115) {
						local3762[local170 + 1] = Static74.aClass2_Sub18_Sub1_1.method2361();
					} else {
						local3762[local170 + 1] = Integer.valueOf(Static74.aClass2_Sub18_Sub1_1.method2382());
					}
				}
				local3762[0] = Integer.valueOf(Static74.aClass2_Sub18_Sub1_1.method2382());
				@Pc(3813) Class2_Sub21 local3813 = new Class2_Sub21();
				local3813.anObjectArray29 = local3762;
				Static150.method2565(local3813);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 1) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2348();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2363();
				if (local166 == 65535) {
					local166 = -1;
				}
				local170 = Static74.aClass2_Sub18_Sub1_1.method2348();
				local187 = Static74.aClass2_Sub18_Sub1_1.method2353();
				if (local187 == 65535) {
					local187 = -1;
				}
				for (local209 = local187; local209 <= local166; local209++) {
					@Pc(3866) long local3866 = (long) local209 + ((long) local170 << 32);
					@Pc(3871) Class2 local3871 = Static179.aClass74_13.method2433(local3866);
					if (local3871 != null) {
						local3871.method3004();
					}
					Static179.aClass74_13.method2432(local3866, new Class2_Sub3(local130));
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 165) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2382();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2363();
				local138 = Static55.method1034(local130);
				if (local138.anInt3187 != 2 || local166 != local138.anInt3183) {
					local138.anInt3187 = 2;
					local138.anInt3183 = local166;
					Static57.method2994(local138);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 200) {
				Static6.method106(Static144.aClass50_4, Static74.aClass2_Sub18_Sub1_1, Static25.anInt731);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 214) {
				Static16.aBoolean29 = true;
				Static46.anInt1219 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static172.anInt4335 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static153.anInt3782 = Static74.aClass2_Sub18_Sub1_1.method2353();
				Static137.anInt3304 = Static74.aClass2_Sub18_Sub1_1.method2387();
				Static98.anInt2480 = Static74.aClass2_Sub18_Sub1_1.method2387();
				if (Static98.anInt2480 >= 100) {
					local130 = Static46.anInt1219 * 128 + 64;
					local166 = Static172.anInt4335 * 128 + 64;
					local170 = Static161.method2725(local130, Static54.anInt1472, local166) - Static153.anInt3782;
					local209 = local170 - Static160.anInt4578;
					local213 = local166 - Static121.anInt2979;
					local187 = local130 - Static7.anInt215;
					local291 = (int) Math.sqrt((double) (local187 * local187 + local213 * local213));
					Static130.anInt3165 = (int) (Math.atan2((double) local209, (double) local291) * 325.949D) & 0x7FF;
					Static155.anInt3844 = (int) (-325.949D * Math.atan2((double) local187, (double) local213)) & 0x7FF;
					if (Static130.anInt3165 < 128) {
						Static130.anInt3165 = 128;
					}
					if (Static130.anInt3165 > 383) {
						Static130.anInt3165 = 383;
					}
				}
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 46) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2359();
				local170 = Static74.aClass2_Sub18_Sub1_1.method2363();
				local251 = (Class2_Sub10) Static177.aClass74_12.method2433((long) local166);
				if (local251 != null) {
					Static14.method325(local251.anInt1896 != local170, local251);
				}
				Static58.method1068(local130, local170, local166);
				Static75.anInt1978 = -1;
				return true;
			}
			if (Static75.anInt1978 == 227) {
				local130 = Static74.aClass2_Sub18_Sub1_1.method2353();
				local166 = Static74.aClass2_Sub18_Sub1_1.method2373();
				local170 = local130 >> 10 & 0x1F;
				local209 = local130 & 0x1F;
				local187 = local130 >> 5 & 0x1F;
				@Pc(4137) Class66 local4137 = Static55.method1034(local166);
				local213 = (local187 << 11) + ((local170 << 19) + (local209 << 3));
				if (local4137.anInt3210 != local213) {
					local4137.anInt3210 = local213;
					Static57.method2994(local4137);
				}
				Static75.anInt1978 = -1;
				return true;
			}
			Static19.method441("T1 - " + Static75.anInt1978 + "," + Static54.anInt1469 + "," + Static68.anInt1871 + " - " + Static25.anInt731, null);
			Static133.method2258();
		} catch (@Pc(4190) IOException local4190) {
			Static115.method2044();
		} catch (@Pc(4194) Exception local4194) {
			@Pc(4235) String local4235 = "T2 - " + Static75.anInt1978 + "," + Static54.anInt1469 + "," + Static68.anInt1871 + " - " + Static25.anInt731 + "," + (Static157.anInt3889 + Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0]) + "," + (Static168.anInt4143 + Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0]) + " - ";
			for (local130 = 0; local130 < Static25.anInt731 && local130 < 50; local130++) {
				local4235 = local4235 + Static74.aClass2_Sub18_Sub1_1.aByteArray39[local130] + ",";
			}
			Static19.method441(local4235, local4194);
			Static133.method2258();
		}
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
	public static void method2870() {
		aClass77_1448 = null;
		aClass77_1455 = null;
		aClass77_1450 = null;
		aClass77_1451 = null;
		aClass77_1452 = null;
		aClass77_1456 = null;
		aClass77_1453 = null;
		aClass77_1454 = null;
		aClass77_1449 = null;
		anIntArray604 = null;
	}
}
