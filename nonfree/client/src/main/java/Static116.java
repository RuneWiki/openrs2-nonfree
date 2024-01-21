import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!n", name = "d", descriptor = "I")
	public static final int anInt3217 = 3353893;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_909 = Static158.method3034("skill)2");

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!ob;")
	public static Class60 aClass60_910 = aClass60_909;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "I")
	public static int anInt3222 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method2525() {
		@Pc(7) boolean local7 = true;
		Static10.method282(false);
		Static140.anInt3673 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static174.aByteArrayArray8.length; local14++) {
			if (Static76.anIntArray260[local14] != -1 && Static174.aByteArrayArray8[local14] == null) {
				Static174.aByteArrayArray8[local14] = Static113.aClass13_Sub1_15.method521(0, Static76.anIntArray260[local14]);
				if (Static174.aByteArrayArray8[local14] == null) {
					local7 = false;
					Static140.anInt3673++;
				}
			}
			if (Static150.anIntArray425[local14] != -1 && Static155.aByteArrayArray7[local14] == null) {
				Static155.aByteArrayArray7[local14] = Static113.aClass13_Sub1_15.method517(Static100.anIntArrayArray19[local14], 0, Static150.anIntArray425[local14]);
				if (Static155.aByteArrayArray7[local14] == null) {
					local7 = false;
					Static140.anInt3673++;
				}
			}
		}
		if (!local7) {
			Static24.anInt752 = 1;
			return;
		}
		Static72.anInt2167 = 0;
		local7 = true;
		@Pc(126) int local126;
		@Pc(116) int local116;
		for (@Pc(98) int local98 = 0; local98 < Static174.aByteArrayArray8.length; local98++) {
			@Pc(104) byte[] local104 = Static155.aByteArrayArray7[local98];
			if (local104 != null) {
				local116 = (Static18.anIntArray476[local98] & 0xFF) * 64 - Static76.anInt2317;
				local126 = (Static18.anIntArray476[local98] >> 8) * 64 - Static76.anInt2319;
				if (Static48.aBoolean54) {
					local126 = 10;
					local116 = 10;
				}
				local7 &= Static193.method3534(local104, local116, local126);
			}
		}
		if (!local7) {
			Static24.anInt752 = 2;
			return;
		}
		if (Static24.anInt752 != 0) {
			Static52.method1233(true, Static193.method3536(new Class60[] { Static165.aClass60_1119, Static196.aClass60_1318 }));
		}
		Static107.method2406();
		Static15.method395();
		Static107.method2406();
		Static149.method2962();
		Static107.method2406();
		System.gc();
		for (@Pc(183) int local183 = 0; local183 < 4; local183++) {
			Static48.aClass35Array1[local183].method1662();
		}
		@Pc(204) int local204;
		for (local126 = 0; local126 < 4; local126++) {
			for (local116 = 0; local116 < 104; local116++) {
				for (local204 = 0; local204 < 104; local204++) {
					Static147.aByteArrayArrayArray36[local126][local116][local204] = 0;
				}
			}
		}
		Static107.method2406();
		Static8.method255();
		local116 = Static174.aByteArrayArray8.length;
		Static24.method612();
		Static10.method282(true);
		@Pc(260) int local260;
		@Pc(271) int local271;
		@Pc(384) int local384;
		@Pc(314) int local314;
		@Pc(373) int local373;
		if (!Static48.aBoolean54) {
			@Pc(275) byte[] local275;
			for (local204 = 0; local204 < local116; local204++) {
				local260 = (Static18.anIntArray476[local204] >> 8) * 64 - Static76.anInt2319;
				local271 = (Static18.anIntArray476[local204] & 0xFF) * 64 - Static76.anInt2317;
				local275 = Static174.aByteArrayArray8[local204];
				if (local275 != null) {
					Static107.method2406();
					Static85.method1995(local260, Static30.anInt898 * 8 - 48, Static48.aClass35Array1, local275, local271, Static160.anInt1995 * 8 - 48);
				}
			}
			for (local260 = 0; local260 < local116; local260++) {
				local314 = (Static18.anIntArray476[local260] & 0xFF) * 64 - Static76.anInt2317;
				local271 = (Static18.anIntArray476[local260] >> 8) * 64 - Static76.anInt2319;
				@Pc(329) byte[] local329 = Static174.aByteArrayArray8[local260];
				if (local329 == null && Static160.anInt1995 < 800) {
					Static107.method2406();
					Static58.method1356(local271, 64, 64, local314);
				}
			}
			Static10.method282(true);
			for (local271 = 0; local271 < local116; local271++) {
				local275 = Static155.aByteArrayArray7[local271];
				if (local275 != null) {
					local373 = (Static18.anIntArray476[local271] >> 8) * 64 - Static76.anInt2319;
					local384 = (Static18.anIntArray476[local271] & 0xFF) * 64 - Static76.anInt2317;
					Static107.method2406();
					Static148.method2956(local275, local373, local384, Static48.aClass35Array1);
				}
			}
		}
		@Pc(438) int local438;
		@Pc(432) int local432;
		if (Static48.aBoolean54) {
			@Pc(450) int local450;
			@Pc(460) int local460;
			@Pc(462) int local462;
			for (local204 = 0; local204 < 4; local204++) {
				Static107.method2406();
				for (local260 = 0; local260 < 13; local260++) {
					for (local271 = 0; local271 < 13; local271++) {
						@Pc(414) boolean local414 = false;
						local373 = Static105.anIntArrayArrayArray7[local204][local260][local271];
						if (local373 != -1) {
							local432 = local373 >> 14 & 0x3FF;
							local438 = local373 >> 1 & 0x3;
							local384 = local373 >> 24 & 0x3;
							local450 = local373 >> 3 & 0x7FF;
							local460 = local450 / 8 + (local432 / 8 << 8);
							for (local462 = 0; local462 < Static18.anIntArray476.length; local462++) {
								if (Static18.anIntArray476[local462] == local460 && Static174.aByteArrayArray8[local462] != null) {
									Static96.method2445((local450 & 0x7) * 8, local438, Static174.aByteArrayArray8[local462], local260 * 8, local204, Static48.aClass35Array1, local384, local271 * 8, (local432 & 0x7) * 8);
									local414 = true;
									break;
								}
							}
						}
						if (!local414) {
							Static88.method2045(local204, local260 * 8, local271 * 8);
						}
					}
				}
			}
			for (local260 = 0; local260 < 13; local260++) {
				for (local271 = 0; local271 < 13; local271++) {
					local314 = Static105.anIntArrayArrayArray7[0][local260][local271];
					if (local314 == -1) {
						Static58.method1356(local260 * 8, 8, 8, local271 * 8);
					}
				}
			}
			Static10.method282(true);
			for (local271 = 0; local271 < 4; local271++) {
				Static107.method2406();
				for (local314 = 0; local314 < 13; local314++) {
					for (local373 = 0; local373 < 13; local373++) {
						local384 = Static105.anIntArrayArrayArray7[local271][local314][local373];
						if (local384 != -1) {
							local438 = local384 >> 24 & 0x3;
							local432 = local384 >> 1 & 0x3;
							local460 = local384 >> 3 & 0x7FF;
							local450 = local384 >> 14 & 0x3FF;
							local462 = (local450 / 8 << 8) + local460 / 8;
							for (@Pc(642) int local642 = 0; local642 < Static18.anIntArray476.length; local642++) {
								if (local462 == Static18.anIntArray476[local642] && Static155.aByteArrayArray7[local642] != null) {
									Static105.method2804(Static48.aClass35Array1, local373 * 8, (local450 & 0x7) * 8, local432, local314 * 8, local438, (local460 & 0x7) * 8, Static155.aByteArrayArray7[local642], local271);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static10.method282(true);
		Static15.method395();
		Static107.method2406();
		Static197.method3575(Static48.aClass35Array1);
		Static10.method282(true);
		local204 = Static93.anInt2725;
		if (Static62.anInt1923 < local204) {
			local204 = Static62.anInt1923;
		}
		if (Static62.anInt1923 - 1 > local204) {
		}
		if (Static8.aBoolean3) {
			Static32.method790(Static93.anInt2725);
		} else {
			Static32.method790(0);
		}
		for (local260 = 0; local260 < 104; local260++) {
			for (local271 = 0; local271 < 104; local271++) {
				Static171.method3180(local271, local260);
			}
		}
		Static107.method2406();
		Static19.method2423();
		Static15.method395();
		if (Static183.aFrame1 != null) {
			Static7.aClass2_Sub3_Sub1_43.method244(43);
			Static7.aClass2_Sub3_Sub1_43.method197(1057001181);
		}
		if (!Static48.aBoolean54) {
			local271 = (Static30.anInt898 - 6) / 8;
			local384 = (Static160.anInt1995 + 6) / 8;
			local314 = (Static30.anInt898 + 6) / 8;
			local373 = (Static160.anInt1995 - 6) / 8;
			for (local438 = local271 - 1; local438 <= local314 + 1; local438++) {
				for (local432 = local373 - 1; local432 <= local384 + 1; local432++) {
					if (local271 > local438 || local314 < local438 || local432 < local373 || local384 < local432) {
						Static113.aClass13_Sub1_15.method518(Static193.method3536(new Class60[] { Static106.aClass60_855, Static72.method1661(local438), Static136.aClass60_992, Static72.method1661(local432) }));
						Static113.aClass13_Sub1_15.method518(Static193.method3536(new Class60[] { Static8.aClass60_76, Static72.method1661(local438), Static136.aClass60_992, Static72.method1661(local432) }));
					}
				}
			}
		}
		Static139.method2831(30);
		Static107.method2406();
		Static35.method2410();
		Static7.aClass2_Sub3_Sub1_43.method244(166);
		Static143.method2891();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!ob;)V")
	public static void method2527(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1) {
		Static7.aClass2_Sub3_Sub1_43.method244(55);
		Static7.aClass2_Sub3_Sub1_43.method223(arg1.method2691());
		Static7.aClass2_Sub3_Sub1_43.method193(arg0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!og;I)Lclient!ac;")
	public static Class4_Sub1 method2529(@OriginalArg(0) Class2_Sub3 arg0) {
		return new Class4_Sub1(arg0.method219(), arg0.method219(), arg0.method219(), arg0.method219(), arg0.method239(), arg0.method239(), arg0.method218());
	}
}
