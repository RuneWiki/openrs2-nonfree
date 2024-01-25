import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	public static int anInt4380;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Lclient!g;")
	public static final Class113 aClass113_3 = new Class113("RC", 1);

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	public static void method3798() {
		@Pc(9) int local9 = Static2.anInt54 * 512 + 256;
		@Pc(15) int local15 = Static639.anInt10305 * 512 + 256;
		@Pc(24) int local24 = Static504.method6917(local9, Static91.anInt1705, local15) - Static207.anInt3503;
		if (Static615.anInt9911 >= 100) {
			Static644.anInt10376 = Static639.anInt10305 * 512 + 256;
			Static250.anInt4000 = Static2.anInt54 * 512 + 256;
			Static220.anInt3605 = Static504.method6917(Static250.anInt4000, Static91.anInt1705, Static644.anInt10376) - Static207.anInt3503;
		} else {
			if (Static250.anInt4000 < local9) {
				Static250.anInt4000 += Static615.anInt9911 * (local9 - Static250.anInt4000) / 1000 + Static432.anInt7004;
				if (local9 < Static250.anInt4000) {
					Static250.anInt4000 = local9;
				}
			}
			if (Static220.anInt3605 < local24) {
				Static220.anInt3605 += Static615.anInt9911 * (local24 - Static220.anInt3605) / 1000 + Static432.anInt7004;
				if (local24 < Static220.anInt3605) {
					Static220.anInt3605 = local24;
				}
			}
			if (Static250.anInt4000 > local9) {
				Static250.anInt4000 -= Static615.anInt9911 * (Static250.anInt4000 - local9) / 1000 + Static432.anInt7004;
				if (local9 > Static250.anInt4000) {
					Static250.anInt4000 = local9;
				}
			}
			if (Static644.anInt10376 < local15) {
				Static644.anInt10376 += Static432.anInt7004 + (local15 - Static644.anInt10376) * Static615.anInt9911 / 1000;
				if (Static644.anInt10376 > local15) {
					Static644.anInt10376 = local15;
				}
			}
			if (Static220.anInt3605 > local24) {
				Static220.anInt3605 -= Static432.anInt7004 + (Static220.anInt3605 - local24) * Static615.anInt9911 / 1000;
				if (Static220.anInt3605 < local24) {
					Static220.anInt3605 = local24;
				}
			}
			if (local15 < Static644.anInt10376) {
				Static644.anInt10376 -= Static432.anInt7004 + (Static644.anInt10376 - local15) * Static615.anInt9911 / 1000;
				if (Static644.anInt10376 < local15) {
					Static644.anInt10376 = local15;
				}
			}
		}
		local9 = Static209.anInt4595 * 512 + 256;
		local15 = Static507.anInt8477 * 512 + 256;
		local24 = Static504.method6917(local9, Static91.anInt1705, local15) - Static532.anInt8751;
		@Pc(231) int local231 = local9 - Static250.anInt4000;
		@Pc(236) int local236 = local24 - Static220.anInt3605;
		@Pc(241) int local241 = local15 - Static644.anInt10376;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local241 * local241 + local231 * local231));
		@Pc(263) int local263 = (int) (Math.atan2((double) local236, (double) local252) * 2607.5945876176133D) & 0x3FFF;
		if (local263 < 1024) {
			local263 = 1024;
		}
		@Pc(279) int local279 = (int) (-2607.5945876176133D * Math.atan2((double) local231, (double) local241)) & 0x3FFF;
		if (local263 > 3072) {
			local263 = 3072;
		}
		if (local263 > Static440.anInt7072) {
			Static440.anInt7072 += Static308.anInt4982 * (local263 - Static440.anInt7072 >> 3) / 1000 + Static533.anInt8753 << 3;
			if (Static440.anInt7072 > local263) {
				Static440.anInt7072 = local263;
			}
		}
		if (local263 < Static440.anInt7072) {
			Static440.anInt7072 -= Static308.anInt4982 * (Static440.anInt7072 - local263 >> 3) / 1000 + Static533.anInt8753 << 3;
			if (Static440.anInt7072 < local263) {
				Static440.anInt7072 = local263;
			}
		}
		@Pc(348) int local348 = local279 - Static338.anInt5355;
		if (local348 > 8192) {
			local348 -= 16384;
		}
		if (local348 < -8192) {
			local348 += 16384;
		}
		local348 >>= 0x3;
		if (local348 > 0) {
			Static338.anInt5355 += local348 * Static308.anInt4982 / 1000 + Static533.anInt8753 << 3;
			Static338.anInt5355 &= 0x3FFF;
		}
		if (local348 < 0) {
			Static338.anInt5355 -= Static533.anInt8753 + -local348 * Static308.anInt4982 / 1000 << 3;
			Static338.anInt5355 &= 0x3FFF;
		}
		@Pc(407) int local407 = local279 - Static338.anInt5355;
		if (local407 > 8192) {
			local407 -= 16384;
		}
		if (local407 < -8192) {
			local407 += 16384;
		}
		Static161.anInt2901 = 0;
		if (local407 < 0 && local348 > 0 || local407 > 0 && local348 < 0) {
			Static338.anInt5355 = local279;
		}
	}
}
