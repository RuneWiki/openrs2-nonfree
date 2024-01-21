import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array5;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_123 = Static109.method1737("Angreifen");

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_124 = Static109.method1737("redstone2");

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
	public static int[] anIntArray31 = new int[2000];

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_125 = Static109.method1737("Welt");

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	public static int anInt333 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)I")
	public static int method207() {
		@Pc(3) int local3 = 3;
		if (Static48.anInt1302 < 310) {
			@Pc(21) int local21 = Static39.anInt1177 >> 7;
			@Pc(25) int local25 = Static115.anInt2618 >> 7;
			@Pc(30) int local30 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 >> 7;
			if ((Static37.aByteArrayArrayArray17[Static72.anInt1813][local21][local25] & 0x4) != 0) {
				local3 = Static72.anInt1813;
			}
			@Pc(50) int local50 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 >> 7;
			@Pc(58) int local58;
			if (local21 < local30) {
				local58 = local30 - local21;
			} else {
				local58 = local21 - local30;
			}
			@Pc(73) int local73;
			if (local25 < local50) {
				local73 = local50 - local25;
			} else {
				local73 = local25 - local50;
			}
			@Pc(92) int local92;
			@Pc(94) int local94;
			if (local73 >= local58) {
				local92 = local58 * 65536 / local73;
				local94 = 32768;
				while (local25 != local50) {
					if (local50 > local25) {
						local25++;
					} else if (local25 > local50) {
						local25--;
					}
					if ((Static37.aByteArrayArrayArray17[Static72.anInt1813][local21][local25] & 0x4) != 0) {
						local3 = Static72.anInt1813;
					}
					local94 += local92;
					if (local94 >= 65536) {
						if (local30 > local21) {
							local21++;
						} else if (local30 < local21) {
							local21--;
						}
						if ((Static37.aByteArrayArrayArray17[Static72.anInt1813][local21][local25] & 0x4) != 0) {
							local3 = Static72.anInt1813;
						}
						local94 -= 65536;
					}
				}
			} else {
				local92 = local73 * 65536 / local58;
				local94 = 32768;
				while (local21 != local30) {
					if (local21 < local30) {
						local21++;
					} else if (local30 < local21) {
						local21--;
					}
					local94 += local92;
					if ((Static37.aByteArrayArrayArray17[Static72.anInt1813][local21][local25] & 0x4) != 0) {
						local3 = Static72.anInt1813;
					}
					if (local94 >= 65536) {
						if (local25 < local50) {
							local25++;
						} else if (local25 > local50) {
							local25--;
						}
						if ((Static37.aByteArrayArrayArray17[Static72.anInt1813][local21][local25] & 0x4) != 0) {
							local3 = Static72.anInt1813;
						}
						local94 -= 65536;
					}
				}
			}
		}
		if ((Static37.aByteArrayArrayArray17[Static72.anInt1813][Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 >> 7][Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 >> 7] & 0x4) != 0) {
			local3 = Static72.anInt1813;
		}
		return local3;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public static void method208() {
		@Pc(12) int local12 = Static43.aClass3_Sub1_Sub5_Sub2_1.method745(Static15.aClass53_130);
		@Pc(22) int local22;
		for (@Pc(14) int local14 = 0; local14 < Static36.anInt1122; local14++) {
			local22 = Static43.aClass3_Sub1_Sub5_Sub2_1.method751(Static99.aClass53Array17[local14]);
			if (local22 > local12) {
				local12 = local22;
			}
		}
		local12 += 8;
		local22 = Static36.anInt1122 * 15 + 21;
		@Pc(59) int local59;
		@Pc(75) int local75;
		if (Static123.anInt2858 != -1) {
			Static35.anInt1112 = 0;
			Static87.anInt2096 = Static36.anInt1122 * 15 + 22;
			Static19.anInt2422 = local12;
			local59 = Static56.anInt1504 - local12 / 2;
			Static94.aBoolean93 = true;
			if (local59 + local12 > 765) {
				local59 = 765 - local12;
			}
			local75 = Static54.anInt2854;
			if (local59 < 0) {
				local59 = 0;
			}
			if (local22 + local75 > 503) {
				local75 = 503 - local22;
			}
			if (local75 < 0) {
				local75 = 0;
			}
			Static37.anInt2216 = local59;
			Static116.anInt2638 = local75;
		} else if (Static56.anInt1504 > 4 && Static54.anInt2854 > 4 && Static56.anInt1504 < 516 && Static54.anInt2854 < 338) {
			Static35.anInt1112 = 0;
			Static94.aBoolean93 = true;
			Static19.anInt2422 = local12;
			Static87.anInt2096 = Static36.anInt1122 * 15 + 22;
			local75 = Static54.anInt2854 - 4;
			local59 = Static56.anInt1504 - local12 / 2 - 4;
			if (local75 + local22 > 334) {
				local75 = 334 - local22;
			}
			if (local75 < 0) {
				local75 = 0;
			}
			Static116.anInt2638 = local75;
			if (local12 + local59 > 512) {
				local59 = 512 - local12;
			}
			if (local59 < 0) {
				local59 = 0;
			}
			Static37.anInt2216 = local59;
		} else if (Static56.anInt1504 > 553 && Static54.anInt2854 > 205 && Static56.anInt1504 < 743 && Static54.anInt2854 < 466) {
			Static35.anInt1112 = 1;
			Static87.anInt2096 = Static36.anInt1122 * 15 + 22;
			Static19.anInt2422 = local12;
			Static94.aBoolean93 = true;
			local59 = Static56.anInt1504 - local12 / 2 - 553;
			if (local59 < 0) {
				local59 = 0;
			} else if (local12 + local59 > 190) {
				local59 = 190 - local12;
			}
			Static37.anInt2216 = local59;
			local75 = Static54.anInt2854 - 205;
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 + local22 > 261) {
				local75 = 261 - local22;
			}
			Static116.anInt2638 = local75;
		} else if (Static56.anInt1504 > 17 && Static54.anInt2854 > 357 && Static56.anInt1504 < 496 && Static54.anInt2854 < 453) {
			Static19.anInt2422 = local12;
			Static94.aBoolean93 = true;
			Static35.anInt1112 = 2;
			Static87.anInt2096 = Static36.anInt1122 * 15 + 22;
			local59 = Static56.anInt1504 - local12 / 2 - 17;
			local75 = Static54.anInt2854 - 357;
			if (local59 < 0) {
				local59 = 0;
			} else if (local12 + local59 > 479) {
				local59 = 479 - local12;
			}
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 + local22 > 96) {
				local75 = 96 - local22;
			}
			Static116.anInt2638 = local75;
			Static37.anInt2216 = local59;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method209() {
		Static118.aClass27_44.method1540();
		Static106.aClass3_Sub1_Sub5_Sub3_24.method813(0, 0);
		Static71.anIntArray229 = Static24.method475(Static71.anIntArray229);
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	public static void method210() {
		aClass53_123 = null;
		aClass53_124 = null;
		aClass3_Sub1_Sub5_Sub4Array5 = null;
		aClass53_125 = null;
		anIntArray31 = null;
	}
}
