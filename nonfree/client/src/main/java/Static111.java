import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
	public static int anInt2920;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(DI)V")
	public static void method2525(@OriginalArg(0) double arg0) {
		Static332.aClass54_5.method5137(Static114.aClass54_2);
		Static332.aClass54_5.method5142(0, 0, (int) arg0);
		Static580.aClass16_10.method6066(Static332.aClass54_5);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!lha;ILclient!lha;)V")
	public static void method2526(@OriginalArg(0) Class8_Sub5 arg0, @OriginalArg(2) Class8_Sub5 arg1) {
		if (arg0.aClass8_Sub5_67 != null) {
			arg0.method8381();
		}
		arg0.aClass8_Sub5_67 = arg1;
		arg0.aClass8_Sub5_66 = arg1.aClass8_Sub5_66;
		arg0.aClass8_Sub5_67.aClass8_Sub5_66 = arg0;
		arg0.aClass8_Sub5_66.aClass8_Sub5_67 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V")
	public static void method2527() {
		for (@Pc(3) int local3 = 0; local3 < Static55.anInt1863; local3++) {
			@Pc(9) Class230 local9 = Static63.aClass230Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(151) int local151;
			if (local9.aClass8_Sub16_Sub3_3 == null) {
				local9.anInt7109--;
				if (local9.anInt7109 < (local9.method5854() ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte70 == 1 && local9.aClass354_1 == null) {
						local9.aClass354_1 = Static653.method8222(Static131.aClass237_38, local9.anInt7117, 0);
						if (local9.aClass354_1 == null) {
							continue;
						}
						local9.anInt7109 += local9.aClass354_1.method8223();
					} else if (local9.method5854() && (local9.aClass8_Sub13_3 == null || local9.aClass8_Sub9_Sub1_3 == null)) {
						if (local9.aClass8_Sub13_3 == null) {
							local9.aClass8_Sub13_3 = Static79.method2064(Static398.aClass237_105, local9.anInt7117);
						}
						if (local9.aClass8_Sub13_3 == null) {
							continue;
						}
						if (local9.aClass8_Sub9_Sub1_3 == null) {
							local9.aClass8_Sub9_Sub1_3 = local9.aClass8_Sub13_3.method2074(new int[] { 22050 });
							if (local9.aClass8_Sub9_Sub1_3 == null) {
								continue;
							}
						}
					}
					if (local9.anInt7109 < 0) {
						@Pc(126) int local126 = 8192;
						if (local9.anInt7118 == 0) {
							local151 = local9.anInt7111 * (local9.aByte70 == 3 ? Static155.aClass8_Sub25_6.aClass36_Sub6_4.method3331() : Static155.aClass8_Sub25_6.aClass36_Sub6_1.method3331()) >> 2;
						} else {
							@Pc(160) int local160 = local9.anInt7118 >> 24 & 0x3;
							if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 == local160) {
								@Pc(179) int local179 = (local9.anInt7118 & 0xFF) << 9;
								@Pc(185) int local185 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692() << 8;
								@Pc(192) int local192 = local9.anInt7118 >> 16 & 0xFF;
								@Pc(204) int local204 = local185 + (local192 << 9) + 256 - Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301;
								@Pc(211) int local211 = local9.anInt7118 >> 8 & 0xFF;
								@Pc(223) int local223 = local185 + (local211 << 9) + 256 - Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298;
								@Pc(232) int local232 = Math.abs(local204) + Math.abs(local223) - 512;
								if (local179 < local232) {
									local9.anInt7109 = -99999;
									continue;
								}
								if (local232 < 0) {
									local232 = 0;
								}
								local151 = (local179 - local232) * Static155.aClass8_Sub25_6.aClass36_Sub6_5.method3331() * local9.anInt7111 / local179 >> 2;
								if (local9.aClass15_Sub1_15 != null && local9.aClass15_Sub1_15 instanceof Class15_Sub1_Sub2) {
									@Pc(274) Class15_Sub1_Sub2 local274 = (Class15_Sub1_Sub2) local9.aClass15_Sub1_15;
									@Pc(277) short local277 = local274.aShort103;
									@Pc(280) short local280 = local274.aShort105;
								}
								if (local204 != 0 || local223 != 0) {
									@Pc(304) int local304 = -Static25.anInt1035 - (int) (Math.atan2((double) local204, (double) local223) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local304 > 8192) {
										local304 = 16384 - local304;
									}
									@Pc(321) int local321;
									if (local232 <= 0) {
										local321 = 8192;
									} else if (local232 >= 4096) {
										local321 = 16384;
									} else {
										local321 = (8192 - local232) / 4096 + 8192;
									}
									local126 = local304 * local321 / 8192 + (16384 - local321 >> 1);
								}
							} else {
								local151 = 0;
							}
						}
						if (local151 > 0) {
							@Pc(353) Class8_Sub9_Sub1 local353 = null;
							if (local9.aByte70 == 1) {
								local353 = local9.aClass354_1.method8221().method1674(Static405.aClass116_2);
							} else if (local9.method5854()) {
								local353 = local9.aClass8_Sub9_Sub1_3;
							}
							@Pc(383) Class8_Sub16_Sub3 local383 = local9.aClass8_Sub16_Sub3_3 = Static651.method6782(local353, local9.anInt7116, local151, local126);
							local383.method6773(local9.anInt7113 - 1);
							Static15.aClass8_Sub16_Sub5_1.method7442(local383);
						}
					}
				}
			} else if (!local9.aClass8_Sub16_Sub3_3.method8639()) {
				local11 = true;
			}
			if (local11) {
				Static55.anInt1863--;
				for (local151 = local3; local151 < Static55.anInt1863; local151++) {
					Static63.aClass230Array1[local151] = Static63.aClass230Array1[local151 + 1];
				}
				local3--;
			}
		}
		if (Static424.aBoolean575 && !Static495.method1941()) {
			if (Static155.aClass8_Sub25_6.aClass36_Sub6_2.method3331() != 0 && Static505.anInt8909 != -1) {
				if (Static454.aClass8_Sub16_Sub1_2 == null) {
					Static540.method7649(Static155.aClass8_Sub25_6.aClass36_Sub6_2.method3331(), Static628.aClass237_148, Static505.anInt8909);
				} else {
					Static369.method5758(Static155.aClass8_Sub25_6.aClass36_Sub6_2.method3331(), Static454.aClass8_Sub16_Sub1_2, Static628.aClass237_148, Static505.anInt8909);
				}
			}
			Static424.aBoolean575 = false;
			Static454.aClass8_Sub16_Sub1_2 = null;
		} else if (Static155.aClass8_Sub25_6.aClass36_Sub6_2.method3331() != 0 && Static505.anInt8909 != -1 && !Static495.method1941()) {
			@Pc(498) Class8_Sub31 local498 = Static51.method1418(Static204.aClass257_42, Static608.aClass336_1);
			local498.aClass8_Sub8_Sub2_1.method8523(Static505.anInt8909);
			Static262.method4604(local498);
			Static505.anInt8909 = -1;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZIB)V")
	public static void method2528(@OriginalArg(1) boolean arg0) {
		Static31.anInt1230 = 2;
		Static345.anInt6689 = 22050;
		Static343.aBoolean463 = arg0;
	}
}
