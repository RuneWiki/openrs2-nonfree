import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!waa", name = "z", descriptor = "Lclient!vg;")
	public static Class349 aClass349_162;

	@OriginalMember(owner = "client!waa", name = "B", descriptor = "I")
	public static int anInt9360;

	@OriginalMember(owner = "client!waa", name = "C", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray43;

	@OriginalMember(owner = "client!waa", name = "y", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_161 = new Class349(12, 1);

	@OriginalMember(owner = "client!waa", name = "A", descriptor = "Lclient!cq;")
	public static final Class63 aClass63_44 = new Class63(4, 1, 1, 1);

	@OriginalMember(owner = "client!waa", name = "D", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_163 = new Class349(66, 0);

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)V")
	public static void method7482() {
		@Pc(9) int local9 = Static388.anInt6396 * 512 + 256;
		@Pc(15) int local15 = Static259.anInt4284 * 512 + 256;
		@Pc(24) int local24 = Static24.method347(local15, local9, Static402.anInt6620) - Static334.anInt9531;
		if (Static452.anInt7231 < 100) {
			if (local9 > Static285.anInt2206) {
				Static285.anInt2206 += Static274.anInt4738 + Static452.anInt7231 * (local9 - Static285.anInt2206) / 1000;
				if (local9 < Static285.anInt2206) {
					Static285.anInt2206 = local9;
				}
			}
			if (Static285.anInt2206 > local9) {
				Static285.anInt2206 -= Static274.anInt4738 + Static452.anInt7231 * (Static285.anInt2206 - local9) / 1000;
				if (Static285.anInt2206 < local9) {
					Static285.anInt2206 = local9;
				}
			}
			if (local24 > Static151.anInt2436) {
				Static151.anInt2436 += Static274.anInt4738 + (local24 - Static151.anInt2436) * Static452.anInt7231 / 1000;
				if (Static151.anInt2436 > local24) {
					Static151.anInt2436 = local24;
				}
			}
			if (Static151.anInt2436 > local24) {
				Static151.anInt2436 -= Static274.anInt4738 + (Static151.anInt2436 - local24) * Static452.anInt7231 / 1000;
				if (Static151.anInt2436 < local24) {
					Static151.anInt2436 = local24;
				}
			}
			if (local15 > Static469.anInt7519) {
				Static469.anInt7519 += Static452.anInt7231 * (local15 - Static469.anInt7519) / 1000 + Static274.anInt4738;
				if (Static469.anInt7519 > local15) {
					Static469.anInt7519 = local15;
				}
			}
			if (local15 < Static469.anInt7519) {
				Static469.anInt7519 -= (Static469.anInt7519 - local15) * Static452.anInt7231 / 1000 + Static274.anInt4738;
				if (Static469.anInt7519 < local15) {
					Static469.anInt7519 = local15;
				}
			}
		} else {
			Static285.anInt2206 = Static388.anInt6396 * 512 + 256;
			Static469.anInt7519 = Static259.anInt4284 * 512 + 256;
			Static151.anInt2436 = Static24.method347(Static469.anInt7519, Static285.anInt2206, Static402.anInt6620) - Static334.anInt9531;
		}
		local9 = Static353.anInt6039 * 512 + 256;
		local15 = Static18.anInt4107 * 512 + 256;
		local24 = Static24.method347(local15, local9, Static402.anInt6620) - Static212.anInt3068;
		@Pc(229) int local229 = local9 - Static285.anInt2206;
		@Pc(233) int local233 = local24 - Static151.anInt2436;
		@Pc(238) int local238 = local15 - Static469.anInt7519;
		@Pc(254) int local254 = (int) Math.sqrt((double) (local229 * local229 + local238 * local238));
		@Pc(265) int local265 = (int) (Math.atan2((double) local233, (double) local254) * 2607.5945876176133D) & 0x3FFF;
		@Pc(276) int local276 = (int) (Math.atan2((double) local229, (double) local238) * -2607.5945876176133D) & 0x3FFF;
		if (local265 < 1024) {
			local265 = 1024;
		}
		if (local265 > 3072) {
			local265 = 3072;
		}
		if (local265 > Static396.anInt6527) {
			Static396.anInt6527 += Static181.anInt2686 * (local265 - Static396.anInt6527 >> 3) / 1000 + Static582.anInt9451 << 3;
			if (local265 < Static396.anInt6527) {
				Static396.anInt6527 = local265;
			}
		}
		if (Static396.anInt6527 > local265) {
			Static396.anInt6527 -= Static582.anInt9451 + (Static396.anInt6527 - local265 >> 3) * Static181.anInt2686 / 1000 << 3;
			if (Static396.anInt6527 < local265) {
				Static396.anInt6527 = local265;
			}
		}
		@Pc(356) int local356 = local276 - Static584.anInt9487;
		if (local356 > 8192) {
			local356 -= 16384;
		}
		if (local356 < -8192) {
			local356 += 16384;
		}
		local356 >>= 0x3;
		if (local356 > 0) {
			Static584.anInt9487 += Static181.anInt2686 * local356 / 1000 + Static582.anInt9451 << 3;
			Static584.anInt9487 &= 0x3FFF;
		}
		if (local356 < 0) {
			Static584.anInt9487 -= -local356 * Static181.anInt2686 / 1000 + Static582.anInt9451 << 3;
			Static584.anInt9487 &= 0x3FFF;
		}
		@Pc(414) int local414 = local276 - Static584.anInt9487;
		if (local414 > 8192) {
			local414 -= 16384;
		}
		if (local414 < -8192) {
			local414 += 16384;
		}
		Static140.anInt4804 = 0;
		if (local414 < 0 && local356 > 0 || local414 > 0 && local356 < 0) {
			Static584.anInt9487 = local276;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7484(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + Static83.method1256(arg0.charAt(local17)) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(ZI)Z")
	public static boolean method7485(@OriginalArg(1) int arg0) {
		if (arg0 == 47 || arg0 == 13 || arg0 == 58 || arg0 == 16 || arg0 == 48) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method7486(@OriginalArg(0) Class162 arg0) {
		if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 != Static180.anInt2677 && (Static469.aClass228ArrayArrayArray6 != null && Static484.method6235(arg0, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128))) {
			Static180.anInt2677 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128;
		}
	}
}
