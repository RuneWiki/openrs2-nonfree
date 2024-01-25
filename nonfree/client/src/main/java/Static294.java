import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "F")
	public static float aFloat122;

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
	public static int anInt5604;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "Lclient!bd;")
	public static final Class27 aClass27_3 = new Class27();

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
	public static int anInt5606 = 0;

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "S")
	public static short aShort49 = 256;

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
	public static int anInt5607 = 0;

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
	public static int anInt5608 = 999999;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V")
	public static void method4817() {
		@Pc(9) int local9 = Static252.anInt5118 * 512 + 256;
		@Pc(15) int local15 = Static503.anInt8950 * 512 + 256;
		@Pc(24) int local24 = Static482.method7333(Static493.anInt8836, local15, local9) - Static378.anInt7106;
		if (Static353.anInt6809 >= 100) {
			Static390.anInt7318 = Static503.anInt8950 * 512 + 256;
			Static86.anInt2132 = Static252.anInt5118 * 512 + 256;
			Static5.anInt142 = Static482.method7333(Static493.anInt8836, Static390.anInt7318, Static86.anInt2132) - Static378.anInt7106;
		} else {
			if (local9 > Static86.anInt2132) {
				Static86.anInt2132 += Static169.anInt3872 + (local9 - Static86.anInt2132) * Static353.anInt6809 / 1000;
				if (local9 < Static86.anInt2132) {
					Static86.anInt2132 = local9;
				}
			}
			if (Static86.anInt2132 > local9) {
				Static86.anInt2132 -= Static353.anInt6809 * (Static86.anInt2132 - local9) / 1000 + Static169.anInt3872;
				if (Static86.anInt2132 < local9) {
					Static86.anInt2132 = local9;
				}
			}
			if (local24 > Static5.anInt142) {
				Static5.anInt142 += Static169.anInt3872 + (local24 - Static5.anInt142) * Static353.anInt6809 / 1000;
				if (local24 < Static5.anInt142) {
					Static5.anInt142 = local24;
				}
			}
			if (Static5.anInt142 > local24) {
				Static5.anInt142 -= (Static5.anInt142 - local24) * Static353.anInt6809 / 1000 + Static169.anInt3872;
				if (local24 > Static5.anInt142) {
					Static5.anInt142 = local24;
				}
			}
			if (Static390.anInt7318 < local15) {
				Static390.anInt7318 += Static169.anInt3872 + (local15 - Static390.anInt7318) * Static353.anInt6809 / 1000;
				if (Static390.anInt7318 > local15) {
					Static390.anInt7318 = local15;
				}
			}
			if (Static390.anInt7318 > local15) {
				Static390.anInt7318 -= Static353.anInt6809 * (Static390.anInt7318 - local15) / 1000 + Static169.anInt3872;
				if (Static390.anInt7318 < local15) {
					Static390.anInt7318 = local15;
				}
			}
		}
		local15 = Static367.anInt6943 * 512 + 256;
		local9 = Static228.anInt4743 * 512 + 256;
		local24 = Static482.method7333(Static493.anInt8836, local15, local9) - Static416.anInt7784;
		@Pc(232) int local232 = local9 - Static86.anInt2132;
		@Pc(236) int local236 = local24 - Static5.anInt142;
		@Pc(241) int local241 = local15 - Static390.anInt7318;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local232 * local232 + local241 * local241));
		@Pc(263) int local263 = (int) (Math.atan2((double) local236, (double) local252) * 2607.5945876176133D) & 0x3FFF;
		@Pc(274) int local274 = (int) (-2607.5945876176133D * Math.atan2((double) local232, (double) local241)) & 0x3FFF;
		if (local263 < 1024) {
			local263 = 1024;
		}
		if (local263 > 3072) {
			local263 = 3072;
		}
		if (local263 > Static348.anInt6726) {
			Static348.anInt6726 += (local263 - Static348.anInt6726 >> 3) * Static110.anInt2515 / 1000 + Static49.anInt1348 << 3;
			if (local263 < Static348.anInt6726) {
				Static348.anInt6726 = local263;
			}
		}
		if (local263 < Static348.anInt6726) {
			Static348.anInt6726 -= Static110.anInt2515 * (Static348.anInt6726 - local263 >> 3) / 1000 + Static49.anInt1348 << 3;
			if (local263 > Static348.anInt6726) {
				Static348.anInt6726 = local263;
			}
		}
		@Pc(347) int local347 = local274 - Static393.anInt7341;
		if (local347 > 8192) {
			local347 -= 16384;
		}
		if (local347 < -8192) {
			local347 += 16384;
		}
		local347 >>= 0x3;
		if (local347 > 0) {
			Static393.anInt7341 += Static49.anInt1348 + local347 * Static110.anInt2515 / 1000 << 3;
			Static393.anInt7341 &= 0x3FFF;
		}
		if (local347 < 0) {
			Static393.anInt7341 -= -local347 * Static110.anInt2515 / 1000 + Static49.anInt1348 << 3;
			Static393.anInt7341 &= 0x3FFF;
		}
		@Pc(408) int local408 = local274 - Static393.anInt7341;
		if (local408 > 8192) {
			local408 -= 16384;
		}
		if (local408 < -8192) {
			local408 += 16384;
		}
		if (local408 < 0 && local347 > 0 || local408 > 0 && local347 < 0) {
			Static393.anInt7341 = local274;
		}
		Static268.anInt9015 = 0;
	}
}
