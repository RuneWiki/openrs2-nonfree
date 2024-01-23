import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public static int anInt2037;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!hc;")
	public static Class51 aClass51_24;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public static int anInt2041;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	public static int anInt2040 = 2301979;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "[Lclient!rb;")
	public static Class116[] aClass116Array1 = new Class116[8];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public static void method1471(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Static174.anInt4003;
		@Pc(7) int local7 = Static110.anInt2935;
		@Pc(9) int local9 = Static200.anInt4412;
		@Pc(11) int local11 = Static109.anInt2904;
		@Pc(13) int local13 = Static127.anInt3198;
		@Pc(20) int local20 = Static198.anInt4590 + (int) Static230.aFloat51 & 0x7FF;
		@Pc(23) int local23 = (int) Static158.aFloat32;
		if (Static257.anInt5461 / 256 > local23) {
			local23 = Static257.anInt5461 / 256;
		}
		if (Static125.aBooleanArray8[4] && Static47.anIntArray104[4] + 128 > local23) {
			local23 = Static47.anIntArray104[4] + 128;
		}
		Static240.method3947(Static57.anInt1583, Static200.method3326(Static137.anInt3321, Static83.aClass9_Sub1_Sub1_1.anInt479, Static83.aClass9_Sub1_Sub1_1.anInt427) - 50, local20, Static81.anInt2193, local23 * 3 + 600, local23, arg0);
		if (Static174.anInt4003 == local5 && local11 == Static109.anInt2904 && local7 == Static110.anInt2935 && local9 == Static200.anInt4412 && local13 == Static127.anInt3198) {
			Static61.anInt1682 = 1;
			return;
		}
		Static259.anInt5472 = 10;
		Static57.anInt1588 = 10;
		if (local11 < Static109.anInt2904) {
			local11 += (Static109.anInt2904 - local11) * Static57.anInt1588 / 1000 + Static259.anInt5472;
			if (local11 < Static109.anInt2904) {
				Static109.anInt2904 = local11;
			}
		}
		if (local11 > Static109.anInt2904) {
			local11 -= Static259.anInt5472 + Static57.anInt1588 * (local11 - Static109.anInt2904) / 1000;
			if (Static109.anInt2904 < local11) {
				Static109.anInt2904 = local11;
			}
		}
		if (local5 < Static174.anInt4003) {
			local5 += (Static174.anInt4003 - local5) * Static57.anInt1588 / 1000 + Static259.anInt5472;
			if (Static174.anInt4003 > local5) {
				Static174.anInt4003 = local5;
			}
		}
		Static10.anInt384 = 10;
		if (Static110.anInt2935 > local7) {
			local7 += Static259.anInt5472 + Static57.anInt1588 * (Static110.anInt2935 - local7) / 1000;
			if (Static110.anInt2935 > local7) {
				Static110.anInt2935 = local7;
			}
		}
		if (local5 > Static174.anInt4003) {
			local5 -= (local5 - Static174.anInt4003) * Static57.anInt1588 / 1000 + Static259.anInt5472;
			if (local5 > Static174.anInt4003) {
				Static174.anInt4003 = local5;
			}
		}
		if (local7 > Static110.anInt2935) {
			local7 -= Static57.anInt1588 * (local7 - Static110.anInt2935) / 1000 + Static259.anInt5472;
			if (Static110.anInt2935 < local7) {
				Static110.anInt2935 = local7;
			}
		}
		Static38.anInt1012 = 10;
		@Pc(254) int local254 = Static127.anInt3198 - local13;
		if (local254 > 1024) {
			local254 -= 2048;
		}
		if (Static200.anInt4412 > local9) {
			local9 += Static10.anInt384 + (Static200.anInt4412 - local9) * Static38.anInt1012 / 1000;
			if (local9 < Static200.anInt4412) {
				Static200.anInt4412 = local9;
			}
		}
		if (local9 > Static200.anInt4412) {
			local9 -= (local9 - Static200.anInt4412) * Static38.anInt1012 / 1000 + Static10.anInt384;
			if (local9 > Static200.anInt4412) {
				Static200.anInt4412 = local9;
			}
		}
		if (local254 < -1024) {
			local254 += 2048;
		}
		if (local254 > 0) {
			local13 += local254 * Static38.anInt1012 / 1000 + Static10.anInt384;
			local13 &= 0x7FF;
		}
		if (local254 < 0) {
			local13 -= -local254 * Static38.anInt1012 / 1000 + Static10.anInt384;
			local13 &= 0x7FF;
		}
		@Pc(355) int local355 = Static127.anInt3198 - local13;
		if (local355 > 1024) {
			local355 -= 2048;
		}
		if (local355 < -1024) {
			local355 += 2048;
		}
		if (local355 >= 0 || local254 <= 0 || local355 > 0 && local254 < 0) {
			Static127.anInt3198 = local13;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!se;)Z")
	public static boolean method1472(@OriginalArg(1) Class122 arg0) {
		if (arg0.anIntArray365 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray365.length; local12++) {
			@Pc(26) int local26 = Static233.method3880(arg0, local12);
			@Pc(31) int local31 = arg0.anIntArray374[local12];
			if (arg0.anIntArray365[local12] == 2) {
				if (local31 <= local26) {
					return false;
				}
			} else if (arg0.anIntArray365[local12] == 3) {
				if (local26 <= local31) {
					return false;
				}
			} else if (arg0.anIntArray365[local12] == 4) {
				if (local26 == local31) {
					return false;
				}
			} else if (local26 != local31) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)I")
	public static int method1474(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
