import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!pba", name = "F", descriptor = "Lclient!em;")
	public static final Class83 aClass83_145 = new Class83(43, -2);

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BII)Z")
	public static boolean method5620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static82.method1352(arg0, arg1)) {
			return Static146.method2463(arg1, arg0) | (arg1 & 0x9000) != 0 | Static433.method3811(arg1, arg0) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | Static185.method3006(arg1, arg0) | Static149.method2491(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "(I)V")
	public static void method5621() {
		@Pc(9) int local9 = Static375.anInt6733 * 512 + 256;
		@Pc(15) int local15 = Static123.anInt2518 * 512 + 256;
		@Pc(23) int local23 = Static538.method6114(Static240.anInt4414, local15, local9) - Static345.anInt9512;
		if (Static76.anInt6367 < 100) {
			if (local9 > Static393.anInt6978) {
				Static393.anInt6978 += Static269.anInt4922 + Static76.anInt6367 * (local9 - Static393.anInt6978) / 1000;
				if (local9 < Static393.anInt6978) {
					Static393.anInt6978 = local9;
				}
			}
			if (local23 > Static20.anInt542) {
				Static20.anInt542 += Static269.anInt4922 + (local23 - Static20.anInt542) * Static76.anInt6367 / 1000;
				if (Static20.anInt542 > local23) {
					Static20.anInt542 = local23;
				}
			}
			if (local9 < Static393.anInt6978) {
				Static393.anInt6978 -= Static269.anInt4922 + Static76.anInt6367 * (Static393.anInt6978 - local9) / 1000;
				if (local9 > Static393.anInt6978) {
					Static393.anInt6978 = local9;
				}
			}
			if (Static78.anInt1534 < local15) {
				Static78.anInt1534 += Static76.anInt6367 * (local15 - Static78.anInt1534) / 1000 + Static269.anInt4922;
				if (Static78.anInt1534 > local15) {
					Static78.anInt1534 = local15;
				}
			}
			if (Static20.anInt542 > local23) {
				Static20.anInt542 -= Static269.anInt4922 + Static76.anInt6367 * (Static20.anInt542 - local23) / 1000;
				if (local23 > Static20.anInt542) {
					Static20.anInt542 = local23;
				}
			}
			if (local15 < Static78.anInt1534) {
				Static78.anInt1534 -= Static76.anInt6367 * (Static78.anInt1534 - local15) / 1000 + Static269.anInt4922;
				if (local15 > Static78.anInt1534) {
					Static78.anInt1534 = local15;
				}
			}
		} else {
			Static393.anInt6978 = Static375.anInt6733 * 512 + 256;
			Static78.anInt1534 = Static123.anInt2518 * 512 + 256;
			Static20.anInt542 = Static538.method6114(Static240.anInt4414, Static78.anInt1534, Static393.anInt6978) - Static345.anInt9512;
		}
		local9 = Static506.anInt8778 * 512 + 256;
		local15 = Static57.anInt1083 * 512 + 256;
		local23 = Static538.method6114(Static240.anInt4414, local15, local9) - Static157.anInt2976;
		@Pc(227) int local227 = local9 - Static393.anInt6978;
		@Pc(232) int local232 = local23 - Static20.anInt542;
		@Pc(237) int local237 = local15 - Static78.anInt1534;
		@Pc(248) int local248 = (int) Math.sqrt((double) (local227 * local227 + local237 * local237));
		@Pc(259) int local259 = (int) (Math.atan2((double) local232, (double) local248) * 2607.5945876176133D) & 0x3FFF;
		@Pc(270) int local270 = (int) (Math.atan2((double) local227, (double) local237) * -2607.5945876176133D) & 0x3FFF;
		if (local259 < 1024) {
			local259 = 1024;
		}
		if (local259 > 3072) {
			local259 = 3072;
		}
		if (Static428.anInt7673 < local259) {
			Static428.anInt7673 += (local259 - Static428.anInt7673 >> 3) * Static321.anInt5862 / 1000 + Static86.anInt1584 << 3;
			if (Static428.anInt7673 > local259) {
				Static428.anInt7673 = local259;
			}
		}
		if (Static428.anInt7673 > local259) {
			Static428.anInt7673 -= Static321.anInt5862 * (Static428.anInt7673 - local259 >> 3) / 1000 + Static86.anInt1584 << 3;
			if (local259 > Static428.anInt7673) {
				Static428.anInt7673 = local259;
			}
		}
		@Pc(344) int local344 = local270 - Static175.anInt3256;
		if (local344 > 8192) {
			local344 -= 16384;
		}
		if (local344 < -8192) {
			local344 += 16384;
		}
		local344 >>= 0x3;
		if (local344 > 0) {
			Static175.anInt3256 += Static86.anInt1584 + Static321.anInt5862 * local344 / 1000 << 3;
			Static175.anInt3256 &= 0x3FFF;
		}
		if (local344 < 0) {
			Static175.anInt3256 -= Static321.anInt5862 * -local344 / 1000 + Static86.anInt1584 << 3;
			Static175.anInt3256 &= 0x3FFF;
		}
		@Pc(405) int local405 = local270 - Static175.anInt3256;
		if (local405 > 8192) {
			local405 -= 16384;
		}
		if (local405 < -8192) {
			local405 += 16384;
		}
		Static76.anInt6369 = 0;
		if (local405 < 0 && local344 > 0 || local405 > 0 && local344 < 0) {
			Static175.anInt3256 = local270;
		}
	}
}
