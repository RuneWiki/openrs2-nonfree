import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "F")
	public static float aFloat137;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
	public static int anInt6032;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public static int anInt6025 = 0;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public static int anInt6027 = 0;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString226 = "Loaded defaults";

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "[I")
	public static final int[] anIntArray537 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public static void method5387() {
		while (true) {
			@Pc(6) Class14_Sub16 local6 = (Class14_Sub16) Static316.aClass18_17.method454();
			if (local6 == null) {
				return;
			}
			if (Static98.aClass213ArrayArrayArray2 != null) {
				@Pc(22) Class10_Sub3_Sub3 local22;
				@Pc(18) int local18;
				if (local6.anInt2331 >= 0) {
					local18 = local6.anInt2331 - 1;
					local22 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local18];
				} else {
					local18 = -local6.anInt2331 - 1;
					if (Static266.anInt5054 == local18) {
						local22 = Static173.aClass10_Sub3_Sub3_Sub2_1;
					} else {
						local22 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local18];
					}
				}
				if (local22 != null) {
					@Pc(48) Class59 local48 = Static232.method2200(local6.anInt2335);
					@Pc(64) int local64;
					@Pc(61) int local61;
					if (local6.anInt2345 == 1 || local6.anInt2345 == 3) {
						local61 = local48.anInt1950;
						local64 = local48.anInt1912;
					} else {
						local61 = local48.anInt1912;
						local64 = local48.anInt1950;
					}
					@Pc(80) int local80 = local6.anInt2333 + (local64 >> 1);
					@Pc(89) int local89 = (local64 + 1 >> 1) + local6.anInt2333;
					@Pc(96) int local96 = (local61 >> 1) + local6.anInt2341;
					@Pc(105) int local105 = (local61 + 1 >> 1) + local6.anInt2341;
					@Pc(110) Class114 local110 = Static158.aClass114Array2[local22.aByte64];
					@Pc(133) int local133 = local110.method3610(local80, local96) + local110.method3610(local89, local96) + local110.method3610(local80, local105) + local110.method3610(local89, local105) >> 2;
					@Pc(135) Interface7 local135 = null;
					@Pc(140) int local140 = Static125.anIntArray237[local6.anInt2342];
					if (local140 == 0) {
						local135 = (Interface7) Static242.method4277(local22.aByte64, local6.anInt2333, local6.anInt2341);
					} else if (local140 == 1) {
						local135 = (Interface7) Static216.method3896(local22.aByte64, local6.anInt2333, local6.anInt2341);
					} else if (local140 == 2) {
						local135 = (Interface7) Static263.method4514(local22.aByte64, local6.anInt2333, local6.anInt2341, up.class);
					} else if (local140 == 3) {
						local135 = (Interface7) Static274.method4660(local22.aByte64, local6.anInt2333, local6.anInt2341);
					}
					if (local135 != null) {
						Static27.method689(-1, local6.anInt2340, local22.aByte64, local6.anInt2333, local140, local6.anInt2336 + 1, 0, 0, local6.anInt2341);
						local22.anInt5982 = local64 * 64 + local6.anInt2333 * 128;
						local22.anInterface7_3 = local135;
						local22.anInt5980 = Static153.anInt3257 + local6.anInt2340;
						local22.anInt5987 = local6.anInt2341 * 128 + local61 * 64;
						local22.anInt5981 = local133;
						local22.anInt5985 = Static153.anInt3257 + local6.anInt2336;
						@Pc(268) int local268 = local6.anInt2343;
						@Pc(271) int local271 = local6.anInt2337;
						@Pc(274) int local274 = local6.anInt2330;
						@Pc(277) int local277 = local6.anInt2332;
						@Pc(282) int local282;
						if (local268 > local271) {
							local282 = local268;
							local268 = local271;
							local271 = local282;
						}
						local22.anInt5984 = local268 + local6.anInt2333;
						if (local277 < local274) {
							local282 = local274;
							local274 = local277;
							local277 = local282;
						}
						local22.anInt5989 = local271 + local6.anInt2333;
						local22.anInt5979 = local277 + local6.anInt2341;
						local22.anInt5990 = local274 + local6.anInt2341;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
	public static void method5388() {
		for (@Pc(7) int local7 = 0; local7 < Static315.anInt6456; local7++) {
			@Pc(13) int local13 = Static98.anIntArray205[local7];
			@Pc(17) Class10_Sub3_Sub3_Sub1 local17 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local13];
			if (local17 != null) {
				Static130.method2678(local17.aClass192_1.anInt5798, local17);
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)V")
	public static void method5389(@OriginalArg(0) int arg0) {
		Static61.anInt1460 = arg0;
		@Pc(7) Class11 local7 = Static206.aClass11_144;
		synchronized (Static206.aClass11_144) {
			Static206.aClass11_144.method213();
		}
		local7 = Static95.aClass11_52;
		synchronized (Static95.aClass11_52) {
			Static95.aClass11_52.method213();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method5391(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local73 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(116) int local116;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local116 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(163) int local163;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local116 <= local163) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(212) int local212;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local212 = 0; local212 < arg0; local212++) {
				if (local163 >> 1 >= local212) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(254) int local254;
		for (local212 = 0; local212 < arg0; local212++) {
			for (local254 = 0; local254 < arg0; local254++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local254 >= local212 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(308) int local308;
		for (local254 = 0; local254 < arg0; local254++) {
			for (local308 = arg0 - 1; local308 >= 0; local308--) {
				if (local308 <= local254 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(357) int local357;
		for (local308 = arg0 - 1; local308 >= 0; local308--) {
			for (local357 = arg0 - 1; local357 >= 0; local357--) {
				if (local308 << 1 <= local357) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(401) int local401;
		for (local357 = arg0 - 1; local357 >= 0; local357--) {
			for (local401 = arg0 - 1; local401 >= 0; local401--) {
				if (local401 <= local357 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(440) int local440;
		for (local401 = arg0 - 1; local401 >= 0; local401--) {
			for (local440 = 0; local440 < arg0; local440++) {
				if (local440 >= local401 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(482) int local482;
		for (local440 = 0; local440 < arg0; local440++) {
			for (local482 = 0; local482 < arg0; local482++) {
				if (local440 >> 1 >= local482) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(527) int local527;
		for (local482 = 0; local482 < arg0; local482++) {
			for (local527 = arg0 - 1; local527 >= 0; local527--) {
				if (local527 >= local482 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(575) int local575;
		for (local527 = arg0 - 1; local527 >= 0; local527--) {
			for (local575 = 0; local575 < arg0; local575++) {
				if (local527 >> 1 <= local575) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(621) int local621;
		for (local575 = 0; local575 < arg0; local575++) {
			for (local621 = 0; local621 < arg0; local621++) {
				if (local575 << 1 >= local621) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(662) int local662;
		for (local621 = 0; local621 < arg0; local621++) {
			for (local662 = arg0 - 1; local662 >= 0; local662--) {
				if (local621 >> 1 <= local662) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(715) int local715;
		for (local662 = arg0 - 1; local662 >= 0; local662--) {
			for (local715 = arg0 - 1; local715 >= 0; local715--) {
				if (local662 << 1 >= local715) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(763) int local763;
		for (local715 = arg0 - 1; local715 >= 0; local715--) {
			for (local763 = arg0 - 1; local763 >= 0; local763--) {
				if (local763 >= local715 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(812) int local812;
		for (local763 = arg0 - 1; local763 >= 0; local763--) {
			for (local812 = 0; local812 < arg0; local812++) {
				if (local812 <= local763 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(857) int local857;
		for (local812 = 0; local812 < arg0; local812++) {
			for (local857 = 0; local857 < arg0; local857++) {
				if (local812 >> 1 <= local857) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(902) int local902;
		for (local857 = 0; local857 < arg0; local857++) {
			for (local902 = arg0 - 1; local902 >= 0; local902--) {
				if (local857 << 1 >= local902) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(948) int local948;
		for (local902 = 0; local902 < arg0; local902++) {
			for (local948 = 0; local948 < arg0; local948++) {
				if (local948 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(995) int local995;
		for (local948 = 0; local948 < arg0; local948++) {
			for (local995 = 0; local995 < arg0; local995++) {
				if (local948 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1038) int local1038;
		for (local995 = 0; local995 < arg0; local995++) {
			for (local1038 = 0; local1038 < arg0; local1038++) {
				if (arg0 / 2 <= local1038) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1081) int local1081;
		for (local1038 = 0; local1038 < arg0; local1038++) {
			for (local1081 = 0; local1081 < arg0; local1081++) {
				if (arg0 / 2 <= local1038) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1124) int local1124;
		for (local1081 = 0; local1081 < arg0; local1081++) {
			for (local1124 = 0; local1124 < arg0; local1124++) {
				if (local1081 - arg0 / 2 >= local1124) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1172) int local1172;
		for (local1124 = arg0 - 1; local1124 >= 0; local1124--) {
			for (local1172 = 0; local1172 < arg0; local1172++) {
				if (local1172 <= local1124 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1227) int local1227;
		for (local1172 = arg0 - 1; local1172 >= 0; local1172--) {
			for (local1227 = arg0 - 1; local1227 >= 0; local1227--) {
				if (local1172 - arg0 / 2 >= local1227) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1273) int local1273;
		for (local1227 = 0; local1227 < arg0; local1227++) {
			for (local1273 = arg0 - 1; local1273 >= 0; local1273--) {
				if (local1227 - arg0 / 2 >= local1273) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1318) int local1318;
		for (local1273 = 0; local1273 < arg0; local1273++) {
			for (local1318 = 0; local1318 < arg0; local1318++) {
				if (local1318 >= local1273 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1370) int local1370;
		for (local1318 = arg0 - 1; local1318 >= 0; local1318--) {
			for (local1370 = 0; local1370 < arg0; local1370++) {
				if (local1318 - arg0 / 2 <= local1370) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1423) int local1423;
		for (local1370 = arg0 - 1; local1370 >= 0; local1370--) {
			for (local1423 = arg0 - 1; local1423 >= 0; local1423--) {
				if (local1423 >= local1370 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1423 = 0; local1423 < arg0; local1423++) {
			for (@Pc(1468) int local1468 = arg0 - 1; local1468 >= 0; local1468--) {
				if (local1468 >= local1423 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
	public static void method5392() {
		Static262.aClass46_7.method5121(((float) Static85.anInt2078 * 0.1F + 0.7F) * 1.1523438F);
		Static262.aClass46_7.method5180(Static259.anInt4951, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static262.aClass46_7.method5163(Static49.anInt1233, -1);
		Static262.aClass46_7.method5170(Static2.aClass67_1);
	}
}
