import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public static int anInt2792;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1117 = Static121.method2047("<col=ffffff>");

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1118 = Static121.method2047("null");

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1119 = Static121.method2047("Unexpected server response");

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	public static int anInt2794 = 0;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	public static int anInt2796 = -1;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1120 = aClass60_1119;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIZ)I")
	public static int method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return (arg1 / 32 << 7) + ((arg2 / 4 << 10) + (arg0 / 2));
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qc;II)V")
	public static void method1955(@OriginalArg(0) Class60 arg0, @OriginalArg(2) int arg1) {
		Static56.aClass4_Sub13_Sub1_1.method1265(79);
		Static56.aClass4_Sub13_Sub1_1.method1209(arg1);
		Static56.aClass4_Sub13_Sub1_1.method1216(arg0.method1665());
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!lc;Lclient!lc;ILclient!lc;)V")
	public static void method1956(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		Static120.aClass40_58 = arg0;
		Static14.aClass40_90 = arg2;
		Static76.aClass40_56 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method1957() {
		aClass60_1118 = null;
		aClass60_1117 = null;
		aClass60_1119 = null;
		aClass60_1120 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[BIZ)Lclient!qc;")
	public static Class60 method1958(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class60 local9 = new Class60();
		local9.aByteArray89 = new byte[arg2];
		local9.anInt2310 = 0;
		for (@Pc(18) int local18 = arg0; local18 < arg2 + arg0; local18++) {
			if (arg1[local18] != 0) {
				local9.aByteArray89[local9.anInt2310++] = arg1[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method1959() {
		Static61.method1133(false);
		@Pc(10) boolean local10 = true;
		Static99.anInt2414 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static11.aByteArrayArray2.length; local14++) {
			if (Static71.anIntArray186[local14] != -1 && Static11.aByteArrayArray2[local14] == null) {
				Static11.aByteArrayArray2[local14] = Static119.aClass40_Sub1_20.method1110(0, Static71.anIntArray186[local14]);
				if (Static11.aByteArrayArray2[local14] == null) {
					local10 = false;
					Static99.anInt2414++;
				}
			}
			if (Static72.anIntArray187[local14] != -1 && Static112.aByteArrayArray9[local14] == null) {
				Static112.aByteArrayArray9[local14] = Static119.aClass40_Sub1_20.method1115(Static72.anIntArray187[local14], Static120.anIntArrayArray17[local14], 0);
				if (Static112.aByteArrayArray9[local14] == null) {
					local10 = false;
					Static99.anInt2414++;
				}
			}
		}
		if (!local10) {
			Static54.anInt1376 = 1;
			return;
		}
		local10 = true;
		Static77.anInt1904 = 0;
		@Pc(116) int local116;
		for (@Pc(97) int local97 = 0; local97 < Static11.aByteArrayArray2.length; local97++) {
			@Pc(103) byte[] local103 = Static112.aByteArrayArray9[local97];
			if (local103 != null) {
				local116 = (Static6.anIntArray8[local97] & 0xFF) * 64 - Static99.anInt2424;
				@Pc(127) int local127 = (Static6.anIntArray8[local97] >> 8) * 64 - Static106.anInt2518;
				if (Static126.aBoolean124) {
					local116 = 10;
					local127 = 10;
				}
				local10 &= Static47.method854(local116, local103, local127);
			}
		}
		if (!local10) {
			Static54.anInt1376 = 2;
			return;
		}
		if (Static54.anInt1376 != 0) {
			Static71.method1377(Static125.method2072(new Class60[] { Static84.aClass60_833, Static98.aClass60_980 }), true);
		}
		Static9.method138();
		Static26.method512();
		Static9.method138();
		Static7.aClass28_3.method782();
		Static9.method138();
		System.gc();
		for (@Pc(184) int local184 = 0; local184 < 4; local184++) {
			Static119.aClass45Array1[local184].method1330();
		}
		@Pc(209) int local209;
		@Pc(213) int local213;
		for (local116 = 0; local116 < 4; local116++) {
			for (local209 = 0; local209 < 104; local209++) {
				for (local213 = 0; local213 < 104; local213++) {
					Static95.aByteArrayArrayArray5[local116][local209][local213] = 0;
				}
			}
		}
		Static9.method138();
		Static34.method625();
		local209 = Static11.aByteArrayArray2.length;
		Static72.method1383();
		Static61.method1133(true);
		@Pc(280) int local280;
		@Pc(266) int local266;
		@Pc(382) int local382;
		@Pc(333) int local333;
		@Pc(393) int local393;
		if (!Static126.aBoolean124) {
			@Pc(270) byte[] local270;
			for (local213 = 0; local213 < local209; local213++) {
				local266 = (Static6.anIntArray8[local213] & 0xFF) * 64 - Static99.anInt2424;
				local270 = Static11.aByteArrayArray2[local213];
				local280 = (Static6.anIntArray8[local213] >> 8) * 64 - Static106.anInt2518;
				if (local270 != null) {
					Static9.method138();
					Static16.method284(Static119.aClass45Array1, local280, Static127.anInt2975 * 8 - 48, local270, local266, (Static58.anInt1441 - 6) * 8);
				}
			}
			for (local280 = 0; local280 < local209; local280++) {
				local266 = (Static6.anIntArray8[local280] >> 8) * 64 - Static106.anInt2518;
				local333 = (Static6.anIntArray8[local280] & 0xFF) * 64 - Static99.anInt2424;
				@Pc(337) byte[] local337 = Static11.aByteArrayArray2[local280];
				if (local337 == null && Static58.anInt1441 < 800) {
					Static9.method138();
					Static3.method14(local333, 64, local266, 64);
				}
			}
			Static61.method1133(true);
			for (local266 = 0; local266 < local209; local266++) {
				local270 = Static112.aByteArrayArray9[local266];
				if (local270 != null) {
					local382 = (Static6.anIntArray8[local266] & 0xFF) * 64 - Static99.anInt2424;
					local393 = (Static6.anIntArray8[local266] >> 8) * 64 - Static106.anInt2518;
					Static9.method138();
					Static103.method1202(Static119.aClass45Array1, local270, Static7.aClass28_3, local393, local382);
				}
			}
		}
		@Pc(458) int local458;
		@Pc(452) int local452;
		if (Static126.aBoolean124) {
			@Pc(464) int local464;
			@Pc(474) int local474;
			@Pc(476) int local476;
			for (local213 = 0; local213 < 4; local213++) {
				Static9.method138();
				for (local280 = 0; local280 < 13; local280++) {
					for (local266 = 0; local266 < 13; local266++) {
						@Pc(428) boolean local428 = false;
						local393 = Static61.anIntArrayArrayArray6[local213][local280][local266];
						if (local393 != -1) {
							local382 = local393 >> 24 & 0x3;
							local452 = local393 >> 14 & 0x3FF;
							local458 = local393 >> 1 & 0x3;
							local464 = local393 >> 3 & 0x7FF;
							local474 = local464 / 8 + (local452 / 8 << 8);
							for (local476 = 0; local476 < Static6.anIntArray8.length; local476++) {
								if (local474 == Static6.anIntArray8[local476] && Static11.aByteArrayArray2[local476] != null) {
									local428 = true;
									Static71.method1376(local280 * 8, (local452 & 0x7) * 8, local382, local458, Static11.aByteArrayArray2[local476], (local464 & 0x7) * 8, Static119.aClass45Array1, local266 * 8, local213);
									break;
								}
							}
						}
						if (!local428) {
							Static129.method2120(local266 * 8, local213, local280 * 8);
						}
					}
				}
			}
			for (local280 = 0; local280 < 13; local280++) {
				for (local266 = 0; local266 < 13; local266++) {
					local333 = Static61.anIntArrayArrayArray6[0][local280][local266];
					if (local333 == -1) {
						Static3.method14(local266 * 8, 8, local280 * 8, 8);
					}
				}
			}
			Static61.method1133(true);
			for (local266 = 0; local266 < 4; local266++) {
				Static9.method138();
				for (local333 = 0; local333 < 13; local333++) {
					for (local393 = 0; local393 < 13; local393++) {
						local382 = Static61.anIntArrayArrayArray6[local266][local333][local393];
						if (local382 != -1) {
							local452 = local382 >> 1 & 0x3;
							local464 = local382 >> 14 & 0x3FF;
							local458 = local382 >> 24 & 0x3;
							local474 = local382 >> 3 & 0x7FF;
							local476 = local474 / 8 + (local464 / 8 << 8);
							for (@Pc(650) int local650 = 0; local650 < Static6.anIntArray8.length; local650++) {
								if (local476 == Static6.anIntArray8[local650] && Static112.aByteArrayArray9[local650] != null) {
									Static95.method1673(local266, (local474 & 0x7) * 8, local393 * 8, local333 * 8, (local464 & 0x7) * 8, local452, Static119.aClass45Array1, local458, Static7.aClass28_3, Static112.aByteArrayArray9[local650]);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static61.method1133(true);
		Static26.method512();
		Static9.method138();
		Static98.method1756(Static7.aClass28_3, Static119.aClass45Array1);
		Static61.method1133(true);
		local213 = Static128.anInt2644;
		if (Static129.anInt3003 < local213) {
			local213 = Static129.anInt3003;
		}
		if (local213 < Static129.anInt3003 - 1) {
		}
		if (Static61.aBoolean57) {
			Static7.aClass28_3.method794(Static128.anInt2644);
		} else {
			Static7.aClass28_3.method794(0);
		}
		for (local280 = 0; local280 < 104; local280++) {
			for (local266 = 0; local266 < 104; local266++) {
				Static45.method813(local280, local266);
			}
		}
		Static9.method138();
		Static54.method996();
		Static73.aClass48_43.method1393();
		if (Static107.aFrame1 != null) {
			Static56.aClass4_Sub13_Sub1_1.method1265(206);
			Static56.aClass4_Sub13_Sub1_1.method1221(1057001181);
		}
		if (!Static126.aBoolean124) {
			local266 = (Static127.anInt2975 - 6) / 8;
			local333 = (Static127.anInt2975 + 6) / 8;
			local393 = (Static58.anInt1441 - 6) / 8;
			local382 = (Static58.anInt1441 + 6) / 8;
			for (local458 = local266 - 1; local458 <= local333 + 1; local458++) {
				for (local452 = local393 - 1; local452 <= local382 + 1; local452++) {
					if (local458 < local266 || local333 < local458 || local452 < local393 || local452 > local382) {
						Static119.aClass40_Sub1_20.method1108(Static125.method2072(new Class60[] { Static27.aClass60_310, Static120.method1450(local458), Static128.aClass60_1064, Static120.method1450(local452) }));
						Static119.aClass40_Sub1_20.method1108(Static125.method2072(new Class60[] { Static35.aClass60_382, Static120.method1450(local458), Static128.aClass60_1064, Static120.method1450(local452) }));
					}
				}
			}
		}
		Static4.method32(30);
		Static9.method138();
		Static130.method2134();
		Static56.aClass4_Sub13_Sub1_1.method1265(161);
		Static48.method940();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!lc;IZ)Lclient!ee;")
	public static Class4_Sub9 method1960(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1103(arg1);
		return local13 == null ? null : new Class4_Sub9(local13);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lclient!qc;")
	public static Class60 method1961(@OriginalArg(1) int arg0) {
		return Static125.method2072(new Class60[] { Static120.method1450(arg0 >> 24 & 0xFF), Static83.aClass60_812, Static120.method1450(arg0 >> 16 & 0xFF), Static83.aClass60_812, Static120.method1450(arg0 >> 8 & 0xFF), Static83.aClass60_812, Static120.method1450(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public static void method1962() {
		@Pc(9) int local9 = Static65.anInt1731 * 128 + 64;
		@Pc(15) int local15 = Static115.anInt2776 * 128 + 64;
		@Pc(23) int local23 = Static54.method1001(local15, local9, Static129.anInt3003) - Static7.anInt2984;
		if (local23 > Static23.anInt663) {
			Static23.anInt663 += (local23 - Static23.anInt663) * Static112.anInt2725 / 1000 + Static62.anInt1691;
			if (Static23.anInt663 > local23) {
				Static23.anInt663 = local23;
			}
		}
		if (Static74.anInt1856 < local9) {
			Static74.anInt1856 += Static112.anInt2725 * (local9 - Static74.anInt1856) / 1000 + Static62.anInt1691;
			if (Static74.anInt1856 > local9) {
				Static74.anInt1856 = local9;
			}
		}
		if (Static88.anInt2065 < local15) {
			Static88.anInt2065 += Static62.anInt1691 + Static112.anInt2725 * (local15 - Static88.anInt2065) / 1000;
			if (Static88.anInt2065 > local15) {
				Static88.anInt2065 = local15;
			}
		}
		if (local15 < Static88.anInt2065) {
			Static88.anInt2065 -= (Static88.anInt2065 - local15) * Static112.anInt2725 / 1000 + Static62.anInt1691;
			if (Static88.anInt2065 < local15) {
				Static88.anInt2065 = local15;
			}
		}
		if (Static74.anInt1856 > local9) {
			Static74.anInt1856 -= Static112.anInt2725 * (Static74.anInt1856 - local9) / 1000 + Static62.anInt1691;
			if (Static74.anInt1856 < local9) {
				Static74.anInt1856 = local9;
			}
		}
		local9 = Static121.anInt2883 * 128 + 64;
		if (local23 < Static23.anInt663) {
			Static23.anInt663 -= Static112.anInt2725 * (Static23.anInt663 - local23) / 1000 + Static62.anInt1691;
			if (local23 > Static23.anInt663) {
				Static23.anInt663 = local23;
			}
		}
		local15 = Static77.anInt1903 * 128 + 64;
		local23 = Static54.method1001(local15, local9, Static129.anInt3003) - Static76.anInt1896;
		@Pc(181) int local181 = local23 - Static23.anInt663;
		@Pc(186) int local186 = local15 - Static88.anInt2065;
		@Pc(190) int local190 = local9 - Static74.anInt1856;
		@Pc(202) int local202 = (int) Math.sqrt((double) (local186 * local186 + local190 * local190));
		@Pc(213) int local213 = (int) (Math.atan2((double) local181, (double) local202) * 325.949D) & 0x7FF;
		@Pc(224) int local224 = (int) (-325.949D * Math.atan2((double) local186, (double) local190)) & 0x7FF;
		@Pc(229) int local229 = local224 - Static75.anInt1872;
		if (local213 < 128) {
			local213 = 128;
		}
		if (local213 > 383) {
			local213 = 383;
		}
		if (local229 > 1024) {
			local229 -= 2048;
		}
		if (local229 < -1024) {
			local229 += 2048;
		}
		if (local213 > Static120.anInt1940) {
			Static120.anInt1940 += Static104.anInt2500 + Static15.anInt2963 * (local213 - Static120.anInt1940) / 1000;
			if (Static120.anInt1940 > local213) {
				Static120.anInt1940 = local213;
			}
		}
		if (local229 > 0) {
			Static75.anInt1872 += Static104.anInt2500 + Static15.anInt2963 * local229 / 1000;
			Static75.anInt1872 &= 0x7FF;
		}
		if (local229 < 0) {
			Static75.anInt1872 -= -local229 * Static15.anInt2963 / 1000 + Static104.anInt2500;
			Static75.anInt1872 &= 0x7FF;
		}
		@Pc(321) int local321 = local224 - Static75.anInt1872;
		if (Static120.anInt1940 > local213) {
			Static120.anInt1940 -= Static104.anInt2500 + Static15.anInt2963 * (Static120.anInt1940 - local213) / 1000;
			if (local213 > Static120.anInt1940) {
				Static120.anInt1940 = local213;
			}
		}
		if (local321 > 1024) {
			local321 -= 2048;
		}
		if (local321 < -1024) {
			local321 += 2048;
		}
		if (local321 < 0 && local229 > 0 || local321 > 0 && local229 < 0) {
			Static75.anInt1872 = local224;
		}
	}
}
