import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!hc;")
	public static Class51 aClass51_47;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	public static int anInt3491;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "Lclient!lc;")
	public static Class79 aClass79_19 = new Class79(64);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V")
	public static void method2610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12;
		@Pc(28) int local28;
		if (Static183.anInt5174 == 0) {
			@Pc(8) int local8 = Static174.anInt4002;
			@Pc(10) int local10 = Static180.anInt4132;
			local12 = Static48.anInt1415;
			@Pc(14) int local14 = Static132.anInt3289;
			local28 = local12 + (arg5 - arg2) * (local14 - local12) / arg0;
			@Pc(42) int local42 = local8 + (local10 - local8) * (arg4 - arg3) / arg1;
			if (Static88.aBoolean138 && (Static8.anInt152 & 0x40) != 0) {
				@Pc(84) Class122 local84 = Static106.method2192(Static161.anInt3798, Static167.anInt3917);
				if (local84 == null) {
					Static263.method4206();
				} else {
					Static199.method3319(Static167.anInt3914, 0L, local42, Static106.aString183, " ->", (short) 43, local28);
				}
			} else {
				if (Static68.anInt1404 == 1) {
					Static199.method3319(-1, 0L, local42, Static253.aString244, "", (short) 49, local28);
				}
				Static199.method3319(-1, 0L, local42, Static208.aString315, "", (short) 9, local28);
			}
		}
		@Pc(112) long local112 = -1L;
		for (local12 = 0; local12 < Static109.anInt2895; local12++) {
			@Pc(120) long local120 = Static166.aLongArray24[local12];
			@Pc(127) int local127 = (int) local120 >> 7 & 0x7F;
			@Pc(134) int local134 = (int) local120 >> 29 & 0x3;
			local28 = (int) local120 & 0x7F;
			@Pc(146) int local146 = Integer.MAX_VALUE & (int) (local120 >>> 32);
			if (local120 != local112) {
				local112 = local120;
				@Pc(200) int local200;
				@Pc(231) int local231;
				if (local134 == 2 && Static239.method3942(Static137.anInt3321, local28, local127, local120)) {
					@Pc(167) Class31 local167 = Static77.method1518(local146);
					if (local167.anIntArray100 != null) {
						local167 = local167.method935();
					}
					if (local167 == null) {
						continue;
					}
					if (Static183.anInt5174 == 1) {
						Static199.method3319(Static255.anInt5424, local120, local28, Static197.aString146, Static199.aString296 + " -> <col=00ffff>" + local167.aString73, (short) 15, local127);
					} else if (Static88.aBoolean138) {
						@Pc(307) Class1_Sub2_Sub10 local307 = Static215.anInt4738 == -1 ? null : Static16.method3757(Static215.anInt4738);
						if ((Static8.anInt152 & 0x4) != 0 && (local307 == null || local167.method924(Static215.anInt4738, local307.anInt3511) != local307.anInt3511)) {
							Static199.method3319(Static167.anInt3914, local120, local28, Static106.aString183, Static120.aString194 + " -> <col=00ffff>" + local167.aString73, (short) 59, local127);
						}
					} else {
						@Pc(188) String[] local188 = local167.aStringArray6;
						if (Static75.aBoolean125) {
							local188 = Static251.method4073(local188);
						}
						if (local188 != null) {
							for (local200 = 4; local200 >= 0; local200--) {
								if (local188[local200] != null) {
									@Pc(212) short local212 = 0;
									if (local200 == 0) {
										local212 = 32;
									}
									if (local200 == 1) {
										local212 = 2;
									}
									if (local200 == 2) {
										local212 = 34;
									}
									local231 = -1;
									if (local200 == local167.anInt1300) {
										local231 = local167.anInt1316;
									}
									if (local200 == local167.anInt1339) {
										local231 = local167.anInt1315;
									}
									if (local200 == 3) {
										local212 = 10;
									}
									if (local200 == 4) {
										local212 = 1002;
									}
									Static199.method3319(local231, local120, local28, local188[local200], "<col=00ffff>" + local167.aString73, local212, local127);
								}
							}
						}
						Static199.method3319(Static202.anInt4460, (long) local167.anInt1319, local28, Static208.aString319, "<col=00ffff>" + local167.aString73, (short) 1001, local127);
					}
				}
				@Pc(476) int local476;
				@Pc(488) int local488;
				@Pc(586) int local586;
				@Pc(430) int local430;
				@Pc(444) int local444;
				@Pc(452) Class9_Sub1_Sub2 local452;
				@Pc(553) Class9_Sub1_Sub1 local553;
				if (local134 == 1) {
					@Pc(381) Class9_Sub1_Sub2 local381 = Static36.aClass9_Sub1_Sub2Array2[local146];
					if ((local381.aClass45_1.anInt2021 & 0x1) == 0 && (local381.anInt427 & 0x7F) == 0 && (local381.anInt479 & 0x7F) == 0 || (local381.aClass45_1.anInt2021 & 0x1) == 1 && (local381.anInt427 & 0x7F) == 64 && (local381.anInt479 & 0x7F) == 64) {
						local430 = local381.anInt427 - (local381.aClass45_1.anInt2021 - 1) * 64;
						local200 = local381.anInt479 - (local381.aClass45_1.anInt2021 - 1) * 64;
						for (local444 = 0; local444 < Static16.anInt4955; local444++) {
							local452 = Static36.aClass9_Sub1_Sub2Array2[Static142.anIntArray260[local444]];
							if (local452 != null && !local452.aBoolean27 && local452 != local381 && local452.aBoolean28) {
								local476 = local452.anInt427 - (local452.aClass45_1.anInt2021 - 1) * 64;
								local488 = local452.anInt479 + 64 - local452.aClass45_1.anInt2021 * 64;
								if (local430 <= local476 && local452.aClass45_1.anInt2021 <= local381.aClass45_1.anInt2021 - (local476 - local430 >> 7) && local200 <= local488 && local381.aClass45_1.anInt2021 - (local488 - local200 >> 7) >= local452.aClass45_1.anInt2021) {
									Static210.method3481(local28, Static142.anIntArray260[local444], local127, local452.aClass45_1);
									local452.aBoolean27 = true;
								}
							}
						}
						for (local231 = 0; local231 < Static238.anInt5146; local231++) {
							local553 = Static147.aClass9_Sub1_Sub1Array1[Static237.anIntArray447[local231]];
							if (local553 != null && !local553.aBoolean27 && local553.aBoolean28) {
								local488 = local553.anInt427 - (local553.method208() - 1) * 64;
								local586 = local553.anInt479 - (local553.method208() - 1) * 64;
								if (local430 <= local488 && local553.method208() <= local381.aClass45_1.anInt2021 - (local488 - local430 >> 7) && local200 <= local586 && local553.method208() <= local381.aClass45_1.anInt2021 - (local586 - local200 >> 7)) {
									Static259.method4154(local28, Static237.anIntArray447[local231], local553, local127);
									local553.aBoolean27 = true;
								}
							}
						}
					}
					if (local381.aBoolean27) {
						continue;
					}
					Static210.method3481(local28, local146, local127, local381.aClass45_1);
					local381.aBoolean27 = true;
				}
				if (local134 == 0) {
					@Pc(677) Class9_Sub1_Sub1 local677 = Static147.aClass9_Sub1_Sub1Array1[local146];
					if ((local677.anInt427 & 0x7F) == 64 && (local677.anInt479 & 0x7F) == 64) {
						local430 = local677.anInt427 - (local677.method208() - 1) * 64;
						local200 = local677.anInt479 - (local677.method208() - 1) * 64;
						for (local444 = 0; local444 < Static16.anInt4955; local444++) {
							local452 = Static36.aClass9_Sub1_Sub2Array2[Static142.anIntArray260[local444]];
							if (local452 != null && !local452.aBoolean27 && local452.aBoolean28) {
								local476 = local452.anInt427 + 64 - local452.aClass45_1.anInt2021 * 64;
								local488 = local452.anInt479 - (local452.aClass45_1.anInt2021 - 1) * 64;
								if (local476 >= local430 && local452.aClass45_1.anInt2021 <= local677.method208() - (local476 - local430 >> 7) && local200 <= local488 && local452.aClass45_1.anInt2021 <= local677.method208() - (local488 - local200 >> 7)) {
									Static210.method3481(local28, Static142.anIntArray260[local444], local127, local452.aClass45_1);
									local452.aBoolean27 = true;
								}
							}
						}
						for (local231 = 0; local231 < Static238.anInt5146; local231++) {
							local553 = Static147.aClass9_Sub1_Sub1Array1[Static237.anIntArray447[local231]];
							if (local553 != null && !local553.aBoolean27 && local677 != local553 && local553.aBoolean28) {
								local488 = local553.anInt427 + 64 - local553.method208() * 64;
								local586 = local553.anInt479 - (local553.method208() - 1) * 64;
								if (local488 >= local430 && local553.method208() <= local677.method208() - (local488 - local430 >> 7) && local200 <= local586 && local553.method208() <= local677.method208() - (local586 - local200 >> 7)) {
									Static259.method4154(local28, Static237.anIntArray447[local231], local553, local127);
									local553.aBoolean27 = true;
								}
							}
						}
					}
					if (local677.aBoolean27) {
						continue;
					}
					Static259.method4154(local28, local146, local677, local127);
					local677.aBoolean27 = true;
				}
				if (local134 == 3) {
					@Pc(966) Class3 local966 = Static138.aClass3ArrayArrayArray1[Static137.anInt3321][local28][local127];
					if (local966 != null) {
						for (@Pc(973) Class1_Sub2_Sub14 local973 = (Class1_Sub2_Sub14) local966.method32(); local973 != null; local973 = (Class1_Sub2_Sub14) local966.method34()) {
							local200 = local973.aClass9_Sub2_1.anInt529;
							@Pc(983) Class89 local983 = Static93.method2006(local200);
							if (Static183.anInt5174 == 1) {
								Static199.method3319(Static255.anInt5424, (long) local200, local28, Static197.aString146, Static199.aString296 + " -> <col=ff9040>" + local983.aString235, (short) 60, local127);
							} else if (Static88.aBoolean138) {
								@Pc(1026) Class1_Sub2_Sub10 local1026 = Static215.anInt4738 == -1 ? null : Static16.method3757(Static215.anInt4738);
								if ((Static8.anInt152 & 0x1) != 0 && (local1026 == null || local983.method2736(Static215.anInt4738, local1026.anInt3511) != local1026.anInt3511)) {
									Static199.method3319(Static167.anInt3914, (long) local200, local28, Static106.aString183, Static120.aString194 + " -> <col=ff9040>" + local983.aString235, (short) 19, local127);
								}
							} else {
								@Pc(1079) String[] local1079 = local983.aStringArray28;
								if (Static75.aBoolean125) {
									local1079 = Static251.method4073(local1079);
								}
								for (local476 = 4; local476 >= 0; local476--) {
									if (local1079 != null && local1079[local476] != null) {
										@Pc(1101) byte local1101 = 0;
										if (local476 == 0) {
											local1101 = 20;
										}
										if (local476 == 1) {
											local1101 = 24;
										}
										local586 = -1;
										if (local983.anInt3677 == local476) {
											local586 = local983.anInt3637;
										}
										if (local476 == local983.anInt3662) {
											local586 = local983.anInt3655;
										}
										if (local476 == 2) {
											local1101 = 11;
										}
										if (local476 == 3) {
											local1101 = 28;
										}
										if (local476 == 4) {
											local1101 = 13;
										}
										Static199.method3319(local586, (long) local200, local28, local1079[local476], "<col=ff9040>" + local983.aString235, local1101, local127);
									}
								}
								Static199.method3319(Static202.anInt4460, (long) local200, local28, Static208.aString319, "<col=ff9040>" + local983.aString235, (short) 1004, local127);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
	public static void method2611(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class1 local5 = Static54.aClass140_3.method4012(); local5 != null; local5 = Static54.aClass140_3.method4013()) {
			if ((long) arg0 == (local5.aLong184 >> 48 & 0xFFFFL)) {
				local5.method4186();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2612(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BJ)V")
	public static void method2614(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}
}
