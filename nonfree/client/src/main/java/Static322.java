import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Lclient!gw;")
	public static Class114 aClass114_2;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Lclient!paa;")
	public static final Class229 aClass229_17 = new Class229(12, 19);

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[16];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public static void method4997() {
		@Pc(14) int local14 = Static263.anInt5055 * 512 + 256;
		@Pc(20) int local20 = Static521.anInt8752 * 512 + 256;
		@Pc(29) int local29 = Static38.method884(Static501.anInt8491, local14, local20) - Static410.anInt7289;
		if (Static539.anInt9126 >= 100) {
			Static516.anInt8682 = Static521.anInt8752 * 512 + 256;
			Static522.anInt8770 = Static263.anInt5055 * 512 + 256;
			Static504.anInt8519 = Static38.method884(Static501.anInt8491, Static522.anInt8770, Static516.anInt8682) - Static410.anInt7289;
		} else {
			if (Static522.anInt8770 < local14) {
				Static522.anInt8770 += Static539.anInt9126 * (local14 - Static522.anInt8770) / 1000 + Static282.anInt7759;
				if (Static522.anInt8770 > local14) {
					Static522.anInt8770 = local14;
				}
			}
			if (local14 < Static522.anInt8770) {
				Static522.anInt8770 -= Static282.anInt7759 + Static539.anInt9126 * (Static522.anInt8770 - local14) / 1000;
				if (local14 > Static522.anInt8770) {
					Static522.anInt8770 = local14;
				}
			}
			if (Static504.anInt8519 < local29) {
				Static504.anInt8519 += Static539.anInt9126 * (local29 - Static504.anInt8519) / 1000 + Static282.anInt7759;
				if (Static504.anInt8519 > local29) {
					Static504.anInt8519 = local29;
				}
			}
			if (Static516.anInt8682 < local20) {
				Static516.anInt8682 += Static282.anInt7759 + (local20 - Static516.anInt8682) * Static539.anInt9126 / 1000;
				if (local20 < Static516.anInt8682) {
					Static516.anInt8682 = local20;
				}
			}
			if (local29 < Static504.anInt8519) {
				Static504.anInt8519 -= Static282.anInt7759 + Static539.anInt9126 * (Static504.anInt8519 - local29) / 1000;
				if (local29 > Static504.anInt8519) {
					Static504.anInt8519 = local29;
				}
			}
			if (local20 < Static516.anInt8682) {
				Static516.anInt8682 -= Static539.anInt9126 * (Static516.anInt8682 - local20) / 1000 + Static282.anInt7759;
				if (local20 > Static516.anInt8682) {
					Static516.anInt8682 = local20;
				}
			}
		}
		local14 = Static488.anInt8138 * 512 + 256;
		local20 = Static119.anInt2374 * 512 + 256;
		local29 = Static38.method884(Static501.anInt8491, local14, local20) - Static46.anInt933;
		@Pc(239) int local239 = local14 - Static522.anInt8770;
		@Pc(244) int local244 = local29 - Static504.anInt8519;
		@Pc(248) int local248 = local20 - Static516.anInt8682;
		@Pc(259) int local259 = (int) Math.sqrt((double) (local248 * local248 + local239 * local239));
		@Pc(270) int local270 = (int) (Math.atan2((double) local244, (double) local259) * 2607.5945876176133D) & 0x3FFF;
		if (local270 < 1024) {
			local270 = 1024;
		}
		@Pc(288) int local288 = (int) (Math.atan2((double) local239, (double) local248) * -2607.5945876176133D) & 0x3FFF;
		if (local270 > 3072) {
			local270 = 3072;
		}
		if (Static381.anInt6946 < local270) {
			Static381.anInt6946 += (local270 - Static381.anInt6946 >> 3) * Static127.anInt4399 / 1000 + Static385.anInt6976 << 3;
			if (Static381.anInt6946 > local270) {
				Static381.anInt6946 = local270;
			}
		}
		if (local270 < Static381.anInt6946) {
			Static381.anInt6946 -= Static127.anInt4399 * (Static381.anInt6946 - local270 >> 3) / 1000 + Static385.anInt6976 << 3;
			if (Static381.anInt6946 < local270) {
				Static381.anInt6946 = local270;
			}
		}
		@Pc(359) int local359 = local288 - Static305.anInt5631;
		if (local359 > 8192) {
			local359 -= 16384;
		}
		if (local359 < -8192) {
			local359 += 16384;
		}
		local359 >>= 0x3;
		if (local359 > 0) {
			Static305.anInt5631 += local359 * Static127.anInt4399 / 1000 + Static385.anInt6976 << 3;
			Static305.anInt5631 &= 0x3FFF;
		}
		if (local359 < 0) {
			Static305.anInt5631 -= Static385.anInt6976 + Static127.anInt4399 * -local359 / 1000 << 3;
			Static305.anInt5631 &= 0x3FFF;
		}
		@Pc(419) int local419 = local288 - Static305.anInt5631;
		if (local419 > 8192) {
			local419 -= 16384;
		}
		if (local419 < -8192) {
			local419 += 16384;
		}
		Static363.anInt6440 = 0;
		if (local419 < 0 && local359 > 0 || local419 > 0 && local359 < 0) {
			Static305.anInt5631 = local288;
		}
	}
}
