import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!fj", name = "rb", descriptor = "[I")
	public static final int[] anIntArray117 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

	@OriginalMember(owner = "client!fj", name = "Ib", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_591 = Static187.method3089("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!fj", name = "Ob", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Lclient!ad;")
	public static Class5 method967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass5_1 == null ? null : local7.aClass5_1;
	}

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V")
	public static void method968() {
		@Pc(7) boolean local7 = true;
		Static152.method2317(false);
		Static29.anInt717 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static176.aByteArrayArray9.length; local14++) {
			if (Static27.anIntArray54[local14] != -1 && Static176.aByteArrayArray9[local14] == null) {
				Static176.aByteArrayArray9[local14] = Static99.aClass3_Sub1_24.method3265(Static27.anIntArray54[local14], 0);
				if (Static176.aByteArrayArray9[local14] == null) {
					local7 = false;
					Static29.anInt717++;
				}
			}
			if (Static126.anIntArray202[local14] != -1 && Static118.aByteArrayArray2[local14] == null) {
				Static118.aByteArrayArray2[local14] = Static99.aClass3_Sub1_24.method3248(Static111.anIntArrayArray14[local14], 0, Static126.anIntArray202[local14]);
				if (Static118.aByteArrayArray2[local14] == null) {
					local7 = false;
					Static29.anInt717++;
				}
			}
		}
		if (!local7) {
			Static132.anInt2747 = 1;
			return;
		}
		local7 = true;
		Static28.anInt645 = 0;
		@Pc(126) int local126;
		@Pc(116) int local116;
		for (@Pc(98) int local98 = 0; local98 < Static176.aByteArrayArray9.length; local98++) {
			@Pc(104) byte[] local104 = Static118.aByteArrayArray2[local98];
			if (local104 != null) {
				local116 = (Static155.anIntArray258[local98] & 0xFF) * 64 - Static138.anInt2800;
				local126 = (Static155.anIntArray258[local98] >> 8) * 64 - Static100.anInt2141;
				if (Static83.aBoolean112) {
					local116 = 10;
					local126 = 10;
				}
				local7 &= Static181.method2941(local116, local126, local104);
			}
		}
		if (!local7) {
			Static132.anInt2747 = 2;
			return;
		}
		if (Static132.anInt2747 != 0) {
			Static80.method1240(Static208.method787(new Class92[] { Static26.aClass92_265, Static167.aClass92_1680 }), true);
		}
		Static140.method2075();
		Static143.method2101();
		Static140.method2075();
		Static138.method2070();
		Static140.method2075();
		System.gc();
		for (@Pc(187) int local187 = 0; local187 < 4; local187++) {
			Static98.aClass7Array1[local187].method129();
		}
		@Pc(210) int local210;
		for (local126 = 0; local126 < 4; local126++) {
			for (local116 = 0; local116 < 104; local116++) {
				for (local210 = 0; local210 < 104; local210++) {
					Static146.aByteArrayArrayArray33[local126][local116][local210] = 0;
				}
			}
		}
		Static140.method2075();
		Static171.method2684();
		local116 = Static176.aByteArrayArray9.length;
		Static74.method1121();
		Static152.method2317(true);
		@Pc(264) int local264;
		@Pc(275) int local275;
		@Pc(389) int local389;
		@Pc(330) int local330;
		@Pc(379) int local379;
		if (!Static83.aBoolean112) {
			@Pc(279) byte[] local279;
			for (local210 = 0; local210 < local116; local210++) {
				local264 = (Static155.anIntArray258[local210] >> 8) * 64 - Static100.anInt2141;
				local275 = (Static155.anIntArray258[local210] & 0xFF) * 64 - Static138.anInt2800;
				local279 = Static176.aByteArrayArray9[local210];
				if (local279 != null) {
					Static140.method2075();
					Static91.method1356(Static98.aClass7Array1, local264, local279, (Static145.anInt2925 - 6) * 8, local275, Static183.anInt3928 * 8 - 48);
				}
			}
			for (local264 = 0; local264 < local116; local264++) {
				local275 = (Static155.anIntArray258[local264] >> 8) * 64 - Static100.anInt2141;
				local330 = (Static155.anIntArray258[local264] & 0xFF) * 64 - Static138.anInt2800;
				@Pc(334) byte[] local334 = Static176.aByteArrayArray9[local264];
				if (local334 == null && Static145.anInt2925 < 800) {
					Static140.method2075();
					Static114.method1707(local330, local275, 64, 64);
				}
			}
			Static152.method2317(true);
			for (local275 = 0; local275 < local116; local275++) {
				local279 = Static118.aByteArrayArray2[local275];
				if (local279 != null) {
					local379 = (Static155.anIntArray258[local275] >> 8) * 64 - Static100.anInt2141;
					local389 = (Static155.anIntArray258[local275] & 0xFF) * 64 - Static138.anInt2800;
					Static140.method2075();
					Static92.method1363(local279, Static98.aClass7Array1, local379, local389);
				}
			}
		}
		@Pc(442) int local442;
		@Pc(448) int local448;
		if (Static83.aBoolean112) {
			@Pc(454) int local454;
			@Pc(464) int local464;
			@Pc(466) int local466;
			for (local210 = 0; local210 < 4; local210++) {
				Static140.method2075();
				for (local264 = 0; local264 < 13; local264++) {
					for (local275 = 0; local275 < 13; local275++) {
						@Pc(419) boolean local419 = false;
						local379 = Static181.anIntArrayArrayArray8[local210][local264][local275];
						if (local379 != -1) {
							local389 = local379 >> 24 & 0x3;
							local442 = local379 >> 1 & 0x3;
							local448 = local379 >> 14 & 0x3FF;
							local454 = local379 >> 3 & 0x7FF;
							local464 = local454 / 8 + (local448 / 8 << 8);
							for (local466 = 0; local466 < Static155.anIntArray258.length; local466++) {
								if (local464 == Static155.anIntArray258[local466] && Static176.aByteArrayArray9[local466] != null) {
									local419 = true;
									Static128.method1871((local448 & 0x7) * 8, local275 * 8, local264 * 8, local389, local442, Static176.aByteArrayArray9[local466], Static98.aClass7Array1, local210, (local454 & 0x7) * 8);
									break;
								}
							}
						}
						if (!local419) {
							Static83.method1269(local275 * 8, local264 * 8, local210);
						}
					}
				}
			}
			for (local264 = 0; local264 < 13; local264++) {
				for (local275 = 0; local275 < 13; local275++) {
					local330 = Static181.anIntArrayArrayArray8[0][local264][local275];
					if (local330 == -1) {
						Static114.method1707(local275 * 8, local264 * 8, 8, 8);
					}
				}
			}
			Static152.method2317(true);
			for (local275 = 0; local275 < 4; local275++) {
				Static140.method2075();
				for (local330 = 0; local330 < 13; local330++) {
					for (local379 = 0; local379 < 13; local379++) {
						local389 = Static181.anIntArrayArrayArray8[local275][local330][local379];
						if (local389 != -1) {
							local442 = local389 >> 24 & 0x3;
							local448 = local389 >> 1 & 0x3;
							local464 = local389 >> 3 & 0x7FF;
							local454 = local389 >> 14 & 0x3FF;
							local466 = local464 / 8 + (local454 / 8 << 8);
							for (@Pc(645) int local645 = 0; local645 < Static155.anIntArray258.length; local645++) {
								if (Static155.anIntArray258[local645] == local466 && Static118.aByteArrayArray2[local645] != null) {
									Static3.method3259((local464 & 0x7) * 8, local448, Static98.aClass7Array1, local379 * 8, local330 * 8, Static118.aByteArrayArray2[local645], local275, local442, (local454 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static152.method2317(true);
		Static143.method2101();
		Static140.method2075();
		Static117.method1726(Static98.aClass7Array1);
		Static152.method2317(true);
		local210 = Static31.anInt733;
		if (Static192.anInt4180 < local210) {
			local210 = Static192.anInt4180;
		}
		if (Static192.anInt4180 - 1 > local210) {
		}
		if (Static111.aBoolean141) {
			Static53.method908(Static31.anInt733);
		} else {
			Static53.method908(0);
		}
		for (local264 = 0; local264 < 104; local264++) {
			for (local275 = 0; local275 < 104; local275++) {
				Static162.method2557(local275, local264);
			}
		}
		Static140.method2075();
		Static178.method2906();
		Static143.method2101();
		if (Static11.aFrame1 != null) {
			Static38.aClass1_Sub14_Sub1_3.method3067(48);
			Static38.aClass1_Sub14_Sub1_3.method3032(1057001181);
		}
		if (!Static83.aBoolean112) {
			local330 = (Static183.anInt3928 + 6) / 8;
			local379 = (Static145.anInt2925 - 6) / 8;
			local389 = (Static145.anInt2925 + 6) / 8;
			local275 = (Static183.anInt3928 - 6) / 8;
			for (local442 = local275 - 1; local442 <= local330 + 1; local442++) {
				for (local448 = local379 - 1; local448 <= local389 + 1; local448++) {
					if (local442 < local275 || local330 < local442 || local448 < local379 || local448 > local389) {
						Static99.aClass3_Sub1_24.method3264(Static208.method787(new Class92[] { Static202.aClass92_2017, Static49.method872(local442), Static209.aClass92_2057, Static49.method872(local448) }));
						Static99.aClass3_Sub1_24.method3264(Static208.method787(new Class92[] { Static50.aClass92_1485, Static49.method872(local442), Static209.aClass92_2057, Static49.method872(local448) }));
					}
				}
			}
		}
		Static48.method862(30);
		Static140.method2075();
		Static42.method737();
		Static38.aClass1_Sub14_Sub1_3.method3067(212);
		Static88.method1302();
	}

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)Lclient!eg;")
	public static Class29 method970() {
		try {
			return (Class29) Class.forName("Class29_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
