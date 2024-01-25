import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!kl;")
	public static Class165 aClass165_3;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	public static int anInt4111 = 0;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	public static int anInt4112 = 0;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	public static int anInt4113 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method3658() {
		for (@Pc(10) int local10 = 0; local10 < Static205.anInt4329; local10++) {
			@Pc(15) Class67 local15 = Static41.aClass67Array1[local10];
			@Pc(17) boolean local17 = false;
			@Pc(127) int local127;
			if (local15.aClass1_Sub12_Sub1_3 == null) {
				local15.anInt2380--;
				if ((local15.aByte11 == 2 ? -1500 : -10) <= local15.anInt2380) {
					if (local15.aByte11 == 1 && local15.aClass77_1 == null) {
						local15.aClass77_1 = Static551.method2366(Static51.aClass160_93, local15.anInt2372, 0);
						if (local15.aClass77_1 == null) {
							continue;
						}
						local15.anInt2380 += local15.aClass77_1.method2367();
					} else if (local15.aByte11 == 2 && (local15.aClass1_Sub26_1 == null || local15.aClass1_Sub32_Sub1_1 == null)) {
						if (local15.aClass1_Sub26_1 == null) {
							local15.aClass1_Sub26_1 = Static240.method4072(Static42.aClass160_8, local15.anInt2372);
						}
						if (local15.aClass1_Sub26_1 == null) {
							continue;
						}
						if (local15.aClass1_Sub32_Sub1_1 == null) {
							local15.aClass1_Sub32_Sub1_1 = local15.aClass1_Sub26_1.method4068(new int[] { 22050 });
							if (local15.aClass1_Sub32_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local15.anInt2380 < 0) {
						if (local15.anInt2376 == 0) {
							local127 = local15.anInt2374 * Static89.aClass1_Sub28_Sub1_1.anInt4894 >> 8;
						} else {
							@Pc(135) int local135 = local15.anInt2376 >> 24 & 0x3;
							if (local135 == Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94) {
								@Pc(153) int local153 = (local15.anInt2376 & 0xFF) << 7;
								@Pc(160) int local160 = local15.anInt2376 >> 16 & 0xFF;
								@Pc(169) int local169 = (local160 << 7) + 64 - Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189;
								if (local169 < 0) {
									local169 = -local169;
								}
								@Pc(181) int local181 = local15.anInt2376 >> 8 & 0xFF;
								@Pc(191) int local191 = (local181 << 7) + 64 - Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191;
								if (local191 < 0) {
									local191 = -local191;
								}
								@Pc(205) int local205 = local191 + local169 - 128;
								if (local153 < local205) {
									local15.anInt2380 = -99999;
									continue;
								}
								if (local205 < 0) {
									local205 = 0;
								}
								local127 = local15.anInt2374 * Static89.aClass1_Sub28_Sub1_1.anInt4913 * (local153 - local205) / local153 >> 8;
							} else {
								local127 = 0;
							}
						}
						if (local127 > 0) {
							@Pc(241) Class1_Sub32_Sub1 local241 = null;
							if (local15.aByte11 == 1) {
								local241 = local15.aClass77_1.method2365().method5929(Static224.aClass42_1);
							} else if (local15.aByte11 == 2) {
								local241 = local15.aClass1_Sub32_Sub1_1;
							}
							@Pc(269) Class1_Sub12_Sub1 local269 = local15.aClass1_Sub12_Sub1_3 = Static550.method2348(local241, local127);
							local269.method2351(local15.anInt2379 - 1);
							Static445.aClass1_Sub12_Sub3_2.method6369(local269);
						}
					}
				} else {
					local17 = true;
				}
			} else if (!local15.aClass1_Sub12_Sub1_3.method7979()) {
				local17 = true;
			}
			if (local17) {
				Static205.anInt4329--;
				for (local127 = local10; local127 < Static205.anInt4329; local127++) {
					Static41.aClass67Array1[local127] = Static41.aClass67Array1[local127 + 1];
				}
				local10--;
			}
		}
		if (Static289.aBoolean391 && !Static277.method4741()) {
			if (Static89.aClass1_Sub28_Sub1_1.anInt4899 != 0 && Static547.anInt9477 != -1) {
				Static81.method2027(Static547.anInt9477, Static89.aClass1_Sub28_Sub1_1.anInt4899, Static45.aClass160_10);
			}
			Static289.aBoolean391 = false;
		} else if (Static89.aClass1_Sub28_Sub1_1.anInt4899 != 0 && Static547.anInt9477 != -1 && !Static277.method4741()) {
			Static444.method6416(Static102.aClass186_31);
			Static192.aClass1_Sub13_Sub2_1.method3069(Static547.anInt9477);
			Static547.anInt9477 = -1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Z")
	public static boolean method3659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIB)I")
	public static int method3661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}
}
