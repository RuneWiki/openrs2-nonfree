import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!cl", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString8 = null;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
	public static void method997() {
		Static418.method5737();
		Static44.method856();
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
	public static void method998() {
		@Pc(15) int local15 = Static39.aClass79_Sub1_1.method1949(Static402.anInt6656);
		if (local15 == 0) {
			Static6.aByteArrayArrayArray1 = null;
			Static180.method2864(0);
		} else if (local15 == 1) {
			Static51.method965((byte) 0);
			Static180.method2864(512);
			if (Static360.aByteArrayArrayArray16 != null) {
				Static307.method4641();
			}
		} else {
			Static51.method965((byte) (Static463.anInt7797 - 4 & 0xFF));
			Static180.method2864(2);
		}
		Static258.anInt4313 = Static276.anInt4606;
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V")
	public static void method1000() {
		Static31.anInt592 = -1;
		Static439.anInt7311 = 0;
		Static392.anInt6568 = -1;
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(B)V")
	public static void method1004() {
		@Pc(9) int local9 = Static87.anInt1583 * 128 + 64;
		@Pc(15) int local15 = Static359.anInt6118 * 128 + 64;
		@Pc(23) int local23 = Static181.method4212(Static276.anInt4606, local15, local9) - Static443.anInt7442;
		if (Static317.anInt5360 >= 100) {
			Static266.anInt4433 = Static87.anInt1583 * 128 + 64;
			Static152.anInt7561 = Static359.anInt6118 * 128 + 64;
			Static410.anInt6946 = Static181.method4212(Static276.anInt4606, Static152.anInt7561, Static266.anInt4433) - Static443.anInt7442;
		} else {
			if (Static266.anInt4433 < local9) {
				Static266.anInt4433 += Static83.anInt1536 + (local9 - Static266.anInt4433) * Static317.anInt5360 / 1000;
				if (local9 < Static266.anInt4433) {
					Static266.anInt4433 = local9;
				}
			}
			if (local9 < Static266.anInt4433) {
				Static266.anInt4433 -= Static83.anInt1536 + (Static266.anInt4433 - local9) * Static317.anInt5360 / 1000;
				if (local9 > Static266.anInt4433) {
					Static266.anInt4433 = local9;
				}
			}
			if (local23 > Static410.anInt6946) {
				Static410.anInt6946 += Static317.anInt5360 * (local23 - Static410.anInt6946) / 1000 + Static83.anInt1536;
				if (local23 < Static410.anInt6946) {
					Static410.anInt6946 = local23;
				}
			}
			if (local23 < Static410.anInt6946) {
				Static410.anInt6946 -= Static317.anInt5360 * (Static410.anInt6946 - local23) / 1000 + Static83.anInt1536;
				if (Static410.anInt6946 < local23) {
					Static410.anInt6946 = local23;
				}
			}
			if (local15 > Static152.anInt7561) {
				Static152.anInt7561 += Static83.anInt1536 + (local15 - Static152.anInt7561) * Static317.anInt5360 / 1000;
				if (local15 < Static152.anInt7561) {
					Static152.anInt7561 = local15;
				}
			}
			if (Static152.anInt7561 > local15) {
				Static152.anInt7561 -= Static317.anInt5360 * (Static152.anInt7561 - local15) / 1000 + Static83.anInt1536;
				if (local15 > Static152.anInt7561) {
					Static152.anInt7561 = local15;
				}
			}
		}
		local15 = Static136.anInt2402 * 128 + 64;
		local9 = Static199.anInt3573 * 128 + 64;
		local23 = Static181.method4212(Static276.anInt4606, local15, local9) - Static218.anInt7513;
		@Pc(227) int local227 = local9 - Static266.anInt4433;
		@Pc(231) int local231 = local23 - Static410.anInt6946;
		@Pc(236) int local236 = local15 - Static152.anInt7561;
		@Pc(247) int local247 = (int) Math.sqrt((double) (local236 * local236 + local227 * local227));
		@Pc(258) int local258 = (int) (Math.atan2((double) local231, (double) local247) * 2607.5945876176133D) & 0x3FFF;
		@Pc(269) int local269 = (int) (-2607.5945876176133D * Math.atan2((double) local227, (double) local236)) & 0x3FFF;
		if (local258 < 1024) {
			local258 = 1024;
		}
		if (local258 > 3072) {
			local258 = 3072;
		}
		if (Static419.anInt7092 < local258) {
			Static419.anInt7092 += Static416.anInt6989 * (local258 - Static419.anInt7092 >> 3) / 1000 + Static330.anInt5523 << 3;
			if (Static419.anInt7092 > local258) {
				Static419.anInt7092 = local258;
			}
		}
		if (local258 < Static419.anInt7092) {
			Static419.anInt7092 -= Static330.anInt5523 + Static416.anInt6989 * (Static419.anInt7092 - local258 >> 3) / 1000 << 3;
			if (local258 > Static419.anInt7092) {
				Static419.anInt7092 = local258;
			}
		}
		@Pc(338) int local338 = local269 - Static372.anInt6317;
		if (local338 > 8192) {
			local338 -= 16384;
		}
		if (local338 < -8192) {
			local338 += 16384;
		}
		local338 >>= 0x3;
		if (local338 > 0) {
			Static372.anInt6317 += Static330.anInt5523 + local338 * Static416.anInt6989 / 1000 << 3;
			Static372.anInt6317 &= 0x3FFF;
		}
		if (local338 < 0) {
			Static372.anInt6317 -= Static330.anInt5523 + -local338 * Static416.anInt6989 / 1000 << 3;
			Static372.anInt6317 &= 0x3FFF;
		}
		@Pc(404) int local404 = local269 - Static372.anInt6317;
		if (local404 > 8192) {
			local404 -= 16384;
		}
		if (local404 < -8192) {
			local404 += 16384;
		}
		Static205.anInt5939 = 0;
		if (local404 < 0 && local338 > 0 || local404 > 0 && local338 < 0) {
			Static372.anInt6317 = local269;
		}
	}
}
