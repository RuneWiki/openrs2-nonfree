import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!q", name = "U", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_20;

	@OriginalMember(owner = "client!q", name = "Y", descriptor = "Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2 aClass2_Sub1_Sub7_Sub2_2;

	@OriginalMember(owner = "client!q", name = "V", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1015 = Static158.method3034("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
	public static int anInt3729 = 2;

	@OriginalMember(owner = "client!q", name = "jb", descriptor = "[I")
	public static final int[] anIntArray415 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!q", name = "i", descriptor = "(I)Z")
	public static boolean method2875() {
		try {
			if (Static179.anInt4363 == 2) {
				if (Static40.aClass2_Sub22_1 == null) {
					Static40.aClass2_Sub22_1 = Static206.method3404(Static108.aClass13_24, Static163.anInt4052, Static52.anInt1623);
					if (Static40.aClass2_Sub22_1 == null) {
						return false;
					}
				}
				if (Static155.aClass62_1 == null) {
					Static155.aClass62_1 = new Class62(Static141.aClass13_28, Static35.aClass13_23);
				}
				if (Static78.aClass2_Sub7_Sub1_1.method1545(Static40.aClass2_Sub22_1, Static155.aClass62_1, Static6.aClass13_3)) {
					Static78.aClass2_Sub7_Sub1_1.method1535();
					Static78.aClass2_Sub7_Sub1_1.method1550(Static53.anInt1661);
					Static78.aClass2_Sub7_Sub1_1.method1549(Static40.aClass2_Sub22_1, Static165.aBoolean161);
					Static179.anInt4363 = 0;
					Static155.aClass62_1 = null;
					Static40.aClass2_Sub22_1 = null;
					Static108.aClass13_24 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static78.aClass2_Sub7_Sub1_1.method1533();
			Static40.aClass2_Sub22_1 = null;
			Static108.aClass13_24 = null;
			Static155.aClass62_1 = null;
			Static179.anInt4363 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "j", descriptor = "(I)Z")
	public static boolean method2877() {
		@Pc(5) Class82 local5 = Static134.aClass82_1;
		synchronized (Static134.aClass82_1) {
			if (Static119.anInt3313 == Static76.anInt2320) {
				return false;
			} else {
				Static74.anInt2295 = Static47.anIntArray336[Static119.anInt3313];
				Static162.anInt4046 = Static17.anIntArray48[Static119.anInt3313];
				Static119.anInt3313 = Static119.anInt3313 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	public static void method2879() {
		@Pc(3) int local3 = Static143.anIntArray416[Static52.anInt1626];
		@Pc(7) Class38[] local7 = Static143.aClass38ArrayArray1[Static52.anInt1626];
		Static198.anInt4664 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class38 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt2378 == 1) {
				local27 = local16.anInt2373 + Static12.anInt385 - Static187.anInt4630;
				if (local27 >= 0 && local27 <= Static12.anInt385 + Static12.anInt385) {
					local42 = local16.anInt2376 + Static12.anInt385 - Static71.anInt4244;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2377 + Static12.anInt385 - Static71.anInt4244;
					if (local53 > Static12.anInt385 + Static12.anInt385) {
						local53 = Static12.anInt385 + Static12.anInt385;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static35.aBooleanArrayArray5[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static18.anInt4397 - local16.anInt2369;
						if (local85 > 32) {
							local16.anInt2385 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2385 = 2;
							local85 = -local85;
						}
						local16.anInt2386 = (local16.anInt2368 - Static36.anInt1081 << 8) / local85;
						local16.anInt2375 = (local16.anInt2382 - Static36.anInt1081 << 8) / local85;
						local16.anInt2380 = (local16.anInt2367 - Static145.anInt3794 << 8) / local85;
						local16.anInt2388 = (local16.anInt2390 - Static145.anInt3794 << 8) / local85;
						Static9.aClass38Array1[Static198.anInt4664++] = local16;
					}
				}
			} else if (local16.anInt2378 == 2) {
				local27 = local16.anInt2376 + Static12.anInt385 - Static71.anInt4244;
				if (local27 >= 0 && local27 <= Static12.anInt385 + Static12.anInt385) {
					local42 = local16.anInt2373 + Static12.anInt385 - Static187.anInt4630;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2370 + Static12.anInt385 - Static187.anInt4630;
					if (local53 > Static12.anInt385 + Static12.anInt385) {
						local53 = Static12.anInt385 + Static12.anInt385;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static35.aBooleanArrayArray5[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static36.anInt1081 - local16.anInt2368;
						if (local85 > 32) {
							local16.anInt2385 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2385 = 4;
							local85 = -local85;
						}
						local16.anInt2372 = (local16.anInt2369 - Static18.anInt4397 << 8) / local85;
						local16.anInt2384 = (local16.anInt2374 - Static18.anInt4397 << 8) / local85;
						local16.anInt2380 = (local16.anInt2367 - Static145.anInt3794 << 8) / local85;
						local16.anInt2388 = (local16.anInt2390 - Static145.anInt3794 << 8) / local85;
						Static9.aClass38Array1[Static198.anInt4664++] = local16;
					}
				}
			} else if (local16.anInt2378 == 4) {
				local27 = local16.anInt2367 - Static145.anInt3794;
				if (local27 > 128) {
					local42 = local16.anInt2376 + Static12.anInt385 - Static71.anInt4244;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2377 + Static12.anInt385 - Static71.anInt4244;
					if (local53 > Static12.anInt385 + Static12.anInt385) {
						local53 = Static12.anInt385 + Static12.anInt385;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt2373 + Static12.anInt385 - Static187.anInt4630;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt2370 + Static12.anInt385 - Static187.anInt4630;
						if (local85 > Static12.anInt385 + Static12.anInt385) {
							local85 = Static12.anInt385 + Static12.anInt385;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static35.aBooleanArrayArray5[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt2385 = 5;
							local16.anInt2372 = (local16.anInt2369 - Static18.anInt4397 << 8) / local27;
							local16.anInt2384 = (local16.anInt2374 - Static18.anInt4397 << 8) / local27;
							local16.anInt2386 = (local16.anInt2368 - Static36.anInt1081 << 8) / local27;
							local16.anInt2375 = (local16.anInt2382 - Static36.anInt1081 << 8) / local27;
							Static9.aClass38Array1[Static198.anInt4664++] = local16;
						}
					}
				}
			}
		}
	}
}
