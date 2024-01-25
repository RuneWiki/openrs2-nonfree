import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public static int anInt7192 = 0;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "J")
	public static long aLong187 = 0L;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "[I")
	public static final int[] anIntArray576 = new int[8];

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	public static void method5971() {
		@Pc(9) int local9 = Static159.anInt2791 * 512 + 256;
		@Pc(15) int local15 = Static190.anInt4029 * 512 + 256;
		@Pc(23) int local23 = Static490.method6768(local9, Static282.anInt4677, local15) - Static168.anInt3051;
		if (Static65.anInt1116 < 100) {
			if (Static388.anInt6921 < local9) {
				Static388.anInt6921 += Static430.anInt5650 + (local9 - Static388.anInt6921) * Static65.anInt1116 / 1000;
				if (Static388.anInt6921 > local9) {
					Static388.anInt6921 = local9;
				}
			}
			if (local23 > Static33.anInt568) {
				Static33.anInt568 += (local23 - Static33.anInt568) * Static65.anInt1116 / 1000 + Static430.anInt5650;
				if (Static33.anInt568 > local23) {
					Static33.anInt568 = local23;
				}
			}
			if (local9 < Static388.anInt6921) {
				Static388.anInt6921 -= Static430.anInt5650 + (Static388.anInt6921 - local9) * Static65.anInt1116 / 1000;
				if (local9 > Static388.anInt6921) {
					Static388.anInt6921 = local9;
				}
			}
			if (Static220.anInt3753 < local15) {
				Static220.anInt3753 += (local15 - Static220.anInt3753) * Static65.anInt1116 / 1000 + Static430.anInt5650;
				if (Static220.anInt3753 > local15) {
					Static220.anInt3753 = local15;
				}
			}
			if (Static33.anInt568 > local23) {
				Static33.anInt568 -= (Static33.anInt568 - local23) * Static65.anInt1116 / 1000 + Static430.anInt5650;
				if (local23 > Static33.anInt568) {
					Static33.anInt568 = local23;
				}
			}
			if (local15 < Static220.anInt3753) {
				Static220.anInt3753 -= Static430.anInt5650 + Static65.anInt1116 * (Static220.anInt3753 - local15) / 1000;
				if (local15 > Static220.anInt3753) {
					Static220.anInt3753 = local15;
				}
			}
		} else {
			Static388.anInt6921 = Static159.anInt2791 * 512 + 256;
			Static220.anInt3753 = Static190.anInt4029 * 512 + 256;
			Static33.anInt568 = Static490.method6768(Static388.anInt6921, Static282.anInt4677, Static220.anInt3753) - Static168.anInt3051;
		}
		local9 = Static71.anInt1189 * 512 + 256;
		local15 = Static152.anInt2703 * 512 + 256;
		local23 = Static490.method6768(local9, Static282.anInt4677, local15) - Static277.anInt4615;
		@Pc(226) int local226 = local9 - Static388.anInt6921;
		@Pc(231) int local231 = local23 - Static33.anInt568;
		@Pc(236) int local236 = local15 - Static220.anInt3753;
		@Pc(247) int local247 = (int) Math.sqrt((double) (local236 * local236 + local226 * local226));
		@Pc(258) int local258 = (int) (Math.atan2((double) local231, (double) local247) * 2607.5945876176133D) & 0x3FFF;
		if (local258 < 1024) {
			local258 = 1024;
		}
		@Pc(274) int local274 = (int) (Math.atan2((double) local226, (double) local236) * -2607.5945876176133D) & 0x3FFF;
		if (local258 > 3072) {
			local258 = 3072;
		}
		if (local258 > Static162.anInt2840) {
			Static162.anInt2840 += (local258 - Static162.anInt2840 >> 3) * Static205.anInt3498 / 1000 + Static309.anInt5560 << 3;
			if (Static162.anInt2840 > local258) {
				Static162.anInt2840 = local258;
			}
		}
		if (Static162.anInt2840 > local258) {
			Static162.anInt2840 -= (Static162.anInt2840 - local258 >> 3) * Static205.anInt3498 / 1000 + Static309.anInt5560 << 3;
			if (local258 > Static162.anInt2840) {
				Static162.anInt2840 = local258;
			}
		}
		@Pc(342) int local342 = local274 - Static261.anInt4257;
		if (local342 > 8192) {
			local342 -= 16384;
		}
		if (local342 < -8192) {
			local342 += 16384;
		}
		local342 >>= 0x3;
		if (local342 > 0) {
			Static261.anInt4257 += local342 * Static205.anInt3498 / 1000 + Static309.anInt5560 << 3;
			Static261.anInt4257 &= 0x3FFF;
		}
		if (local342 < 0) {
			Static261.anInt4257 -= Static309.anInt5560 + -local342 * Static205.anInt3498 / 1000 << 3;
			Static261.anInt4257 &= 0x3FFF;
		}
		@Pc(397) int local397 = local274 - Static261.anInt4257;
		if (local397 > 8192) {
			local397 -= 16384;
		}
		if (local397 < -8192) {
			local397 += 16384;
		}
		Static218.anInt3720 = 0;
		if (local397 < 0 && local342 > 0 || local397 > 0 && local342 < 0) {
			Static261.anInt4257 = local274;
		}
	}
}
