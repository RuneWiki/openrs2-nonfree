import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_17 = new Class237(27, -1);

	@OriginalMember(owner = "client!qv", name = "J", descriptor = "[I")
	public static int[] anIntArray80 = new int[2];

	@OriginalMember(owner = "client!qv", name = "N", descriptor = "Z")
	public static volatile boolean aBoolean59 = true;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Z")
	public static boolean method1048(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static201.anInt3737; local1 < Static107.anInt1964; local1++) {
			@Pc(6) Class211[][] local6 = Static268.aClass211ArrayArrayArray4[local1];
			for (@Pc(9) int local9 = -Static11.anInt315; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static384.anInt6665 + local9;
				@Pc(18) int local18 = Static384.anInt6665 - local9;
				if (local14 >= Static1.anInt149 || local18 < Static160.anInt2750) {
					for (@Pc(27) int local27 = -Static11.anInt315; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static379.anInt6498 + local27;
						@Pc(36) int local36 = Static379.anInt6498 - local27;
						@Pc(48) Class211 local48;
						if (local14 >= Static1.anInt149) {
							if (local32 >= Static179.anInt3236) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean397) {
									Static124.aBoolean122 = arg0;
									Static66.aClass54_1.method4348(local48);
									Static66.aClass54_1.method4337();
								}
							}
							if (local36 < Static333.anInt5793) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean397) {
									Static124.aBoolean122 = arg0;
									Static66.aClass54_1.method4348(local48);
									Static66.aClass54_1.method4337();
								}
							}
						}
						if (local18 < Static160.anInt2750) {
							if (local32 >= Static179.anInt3236) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean397) {
									Static124.aBoolean122 = arg0;
									Static66.aClass54_1.method4348(local48);
									Static66.aClass54_1.method4337();
								}
							}
							if (local36 < Static333.anInt5793) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean397) {
									Static124.aBoolean122 = arg0;
									Static66.aClass54_1.method4348(local48);
									Static66.aClass54_1.method4337();
								}
							}
						}
						if (Static331.anInt5788 == 0) {
							if (Static306.aBoolean360) {
								Static66.aClass54_1.method4339(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!lh;)Lclient!dr;")
	public static Class57_Sub1 method1049(@OriginalArg(1) Class1_Sub1 arg0) {
		return new Class57_Sub1(arg0.method4100(), arg0.method4100(), arg0.method4100(), arg0.method4100(), arg0.method4142(), arg0.method4142(), arg0.method4130());
	}

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)V")
	public static void method1053() {
		for (@Pc(7) int local7 = 0; local7 < Static442.anInt5016; local7++) {
			@Pc(13) Class12 local13 = Static254.aClass12Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(141) int local141;
			if (local13.aClass1_Sub7_Sub4_1 == null) {
				local13.anInt337--;
				if (local13.anInt337 < (local13.aByte1 == 2 ? -1500 : -10)) {
					local15 = true;
				} else {
					if (local13.aByte1 == 1 && local13.aClass241_1 == null) {
						local13.aClass241_1 = Static462.method5504(Static235.aClass250_53, local13.anInt345, 0);
						if (local13.aClass241_1 == null) {
							continue;
						}
						local13.anInt337 += local13.aClass241_1.method5506();
					} else if (local13.aByte1 == 2 && (local13.aClass1_Sub15_1 == null || local13.aClass1_Sub32_Sub1_1 == null)) {
						if (local13.aClass1_Sub15_1 == null) {
							local13.aClass1_Sub15_1 = Static137.method1948(Static334.aClass250_66, local13.anInt345);
						}
						if (local13.aClass1_Sub15_1 == null) {
							continue;
						}
						if (local13.aClass1_Sub32_Sub1_1 == null) {
							local13.aClass1_Sub32_Sub1_1 = local13.aClass1_Sub15_1.method1938(new int[] { 22050 });
							if (local13.aClass1_Sub32_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local13.anInt337 < 0) {
						if (local13.anInt342 == 0) {
							local141 = Static389.aClass128_Sub1_1.anInt3565 * local13.anInt336 >> 8;
						} else {
							@Pc(135) int local135 = local13.anInt342 >> 24 & 0x3;
							if (Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 == local135) {
								@Pc(150) int local150 = (local13.anInt342 & 0xFF) << 7;
								@Pc(157) int local157 = local13.anInt342 >> 16 & 0xFF;
								@Pc(167) int local167 = (local157 << 7) - (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 - 64);
								if (local167 < 0) {
									local167 = -local167;
								}
								@Pc(182) int local182 = local13.anInt342 >> 8 & 0xFF;
								@Pc(192) int local192 = (local182 << 7) + 64 - Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065;
								if (local192 < 0) {
									local192 = -local192;
								}
								@Pc(203) int local203 = local192 + local167 - 128;
								if (local203 > local150) {
									local13.anInt337 = -99999;
									continue;
								}
								if (local203 < 0) {
									local203 = 0;
								}
								local141 = local13.anInt336 * (local150 - local203) * Static389.aClass128_Sub1_1.anInt3573 / local150 >> 8;
							} else {
								local141 = 0;
							}
						}
						if (local141 > 0) {
							@Pc(254) Class1_Sub32_Sub1 local254 = null;
							if (local13.aByte1 == 1) {
								local254 = local13.aClass241_1.method5507().method4014(Static205.aClass229_1);
							} else if (local13.aByte1 == 2) {
								local254 = local13.aClass1_Sub32_Sub1_1;
							}
							@Pc(284) Class1_Sub7_Sub4 local284 = local13.aClass1_Sub7_Sub4_1 = Static463.method5945(local254, local141);
							local284.method5933(local13.anInt334 - 1);
							Static38.aClass1_Sub7_Sub1_1.method3976(local284);
						}
					}
				}
			} else if (!local13.aClass1_Sub7_Sub4_1.method6069()) {
				local15 = true;
			}
			if (local15) {
				Static442.anInt5016--;
				for (local141 = local7; local141 < Static442.anInt5016; local141++) {
					Static254.aClass12Array1[local141] = Static254.aClass12Array1[local141 + 1];
				}
				local7--;
			}
		}
		if (Static94.aBoolean98 && !Static167.method2671()) {
			if (Static389.aClass128_Sub1_1.anInt3559 != 0 && Static369.anInt6297 != -1) {
				Static82.method1407(Static260.aClass250_56, Static369.anInt6297, Static389.aClass128_Sub1_1.anInt3559);
			}
			Static94.aBoolean98 = false;
		} else if (Static389.aClass128_Sub1_1.anInt3559 != 0 && Static369.anInt6297 != -1 && !Static167.method2671()) {
			Static55.method989(Static154.aClass131_81);
			Static232.aClass1_Sub1_Sub1_2.method4105(Static369.anInt6297);
			Static369.anInt6297 = -1;
		}
	}

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "(B)V")
	public static void method1057() {
		Static3.anInt169 = -1;
		Static270.anInt4850 = -1;
		Static322.anInt5636 = -1;
		Static288.anInt5036 = 0;
	}
}
