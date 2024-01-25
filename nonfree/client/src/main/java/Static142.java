import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Lclient!fd;")
	public static Class72 aClass72_13;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	public static int anInt3180 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lclient!gs;")
	public static Class4_Sub1_Sub8 method2790() {
		@Pc(13) Class4_Sub1_Sub8 local13 = (Class4_Sub1_Sub8) Static285.aClass178_9.method4773();
		if (local13 != null) {
			local13.method5667();
			local13.method5555();
			return local13;
		}
		do {
			local13 = (Class4_Sub1_Sub8) Static65.aClass178_2.method4773();
			if (local13 == null) {
				return null;
			}
			if (local13.method2032() > Static274.method4763()) {
				return null;
			}
			local13.method5667();
			local13.method5555();
		} while ((local13.aLong254 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	public static void method2792() {
		@Pc(9) int local9 = Static321.anInt6342 * 128 + 64;
		@Pc(15) int local15 = Static154.anInt3448 * 128 + 64;
		@Pc(24) int local24 = Static119.method2125(local9, local15, Static279.anInt5645) - Static182.anInt4011;
		if (Static203.anInt4295 >= 100) {
			Static133.anInt3056 = Static154.anInt3448 * 128 + 64;
			Static230.anInt4796 = Static321.anInt6342 * 128 + 64;
			Static105.anInt6098 = Static119.method2125(Static230.anInt4796, Static133.anInt3056, Static279.anInt5645) - Static182.anInt4011;
		} else {
			if (Static230.anInt4796 < local9) {
				Static230.anInt4796 += Static335.anInt6655 + Static203.anInt4295 * (local9 - Static230.anInt4796) / 1000;
				if (local9 < Static230.anInt4796) {
					Static230.anInt4796 = local9;
				}
			}
			if (Static230.anInt4796 > local9) {
				Static230.anInt4796 -= Static203.anInt4295 * (Static230.anInt4796 - local9) / 1000 + Static335.anInt6655;
				if (local9 > Static230.anInt4796) {
					Static230.anInt4796 = local9;
				}
			}
			if (Static105.anInt6098 < local24) {
				Static105.anInt6098 += Static335.anInt6655 + (local24 - Static105.anInt6098) * Static203.anInt4295 / 1000;
				if (Static105.anInt6098 > local24) {
					Static105.anInt6098 = local24;
				}
			}
			if (Static105.anInt6098 > local24) {
				Static105.anInt6098 -= Static335.anInt6655 + Static203.anInt4295 * (Static105.anInt6098 - local24) / 1000;
				if (Static105.anInt6098 < local24) {
					Static105.anInt6098 = local24;
				}
			}
			if (Static133.anInt3056 < local15) {
				Static133.anInt3056 += Static335.anInt6655 + (local15 - Static133.anInt3056) * Static203.anInt4295 / 1000;
				if (local15 < Static133.anInt3056) {
					Static133.anInt3056 = local15;
				}
			}
			if (Static133.anInt3056 > local15) {
				Static133.anInt3056 -= Static335.anInt6655 + (Static133.anInt3056 - local15) * Static203.anInt4295 / 1000;
				if (Static133.anInt3056 < local15) {
					Static133.anInt3056 = local15;
				}
			}
		}
		local15 = Static80.anInt1721 * 128 + 64;
		local9 = Static9.anInt6459 * 128 + 64;
		local24 = Static119.method2125(local9, local15, Static279.anInt5645) - Static155.anInt3462;
		@Pc(224) int local224 = local9 - Static230.anInt4796;
		@Pc(229) int local229 = local24 - Static105.anInt6098;
		@Pc(234) int local234 = local15 - Static133.anInt3056;
		@Pc(245) int local245 = (int) Math.sqrt((double) (local234 * local234 + local224 * local224));
		@Pc(256) int local256 = (int) (Math.atan2((double) local229, (double) local245) * 2607.5945876176133D) & 0x3FFF;
		@Pc(267) int local267 = (int) (Math.atan2((double) local224, (double) local234) * -2607.5945876176133D) & 0x3FFF;
		if (local256 < 1024) {
			local256 = 1024;
		}
		if (local256 > 3072) {
			local256 = 3072;
		}
		if (Static288.anInt5845 < local256) {
			Static288.anInt5845 += Static11.anInt263 + Static293.anInt5930 * (local256 - Static288.anInt5845 >> 3) / 1000 << 3;
			if (Static288.anInt5845 > local256) {
				Static288.anInt5845 = local256;
			}
		}
		if (local256 < Static288.anInt5845) {
			Static288.anInt5845 -= Static11.anInt263 + (Static288.anInt5845 - local256 >> 3) * Static293.anInt5930 / 1000 << 3;
			if (local256 > Static288.anInt5845) {
				Static288.anInt5845 = local256;
			}
		}
		@Pc(348) int local348 = local267 - Static332.anInt6592;
		if (local348 > 8192) {
			local348 -= 16384;
		}
		if (local348 < -8192) {
			local348 += 16384;
		}
		local348 >>= 0x3;
		if (local348 > 0) {
			Static332.anInt6592 += Static293.anInt5930 * local348 / 1000 + Static11.anInt263 << 3;
			Static332.anInt6592 &= 0x3FFF;
		}
		if (local348 < 0) {
			Static332.anInt6592 -= Static11.anInt263 + -local348 * Static293.anInt5930 / 1000 << 3;
			Static332.anInt6592 &= 0x3FFF;
		}
		@Pc(405) int local405 = local267 - Static332.anInt6592;
		if (local405 > 8192) {
			local405 -= 16384;
		}
		if (local405 < -8192) {
			local405 += 16384;
		}
		if (local405 < 0 && local348 > 0 || local405 > 0 && local348 < 0) {
			Static332.anInt6592 = local267;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIB)V")
	public static void method2793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Static174.aFloat39 = local7;
		if (Static303.anInt3065 == 2) {
			Static332.anInt6592 = local11;
			Static221.anInt4596 = 0;
			Static288.anInt5845 = local7;
		}
		Static138.aFloat35 = local11;
		Static251.method4339();
		Static275.aBoolean495 = true;
	}
}
