import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_94 = new Class40("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	public static int anInt6205 = 0;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "Lclient!pj;")
	public static Class5_Sub38 aClass5_Sub38_1 = null;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	public static void method5171() {
		@Pc(9) int local9 = Static65.anInt1250 * 128 + 64;
		@Pc(15) int local15 = Static394.anInt7079 * 128 + 64;
		@Pc(24) int local24 = Static191.method5464(local9, local15, Static367.anInt6860) - Static382.anInt6976;
		if (Static6.anInt135 >= 100) {
			Static364.anInt6817 = Static394.anInt7079 * 128 + 64;
			Static367.anInt6861 = Static65.anInt1250 * 128 + 64;
			Static182.anInt3520 = Static191.method5464(Static367.anInt6861, Static364.anInt6817, Static367.anInt6860) - Static382.anInt6976;
		} else {
			if (Static367.anInt6861 < local9) {
				Static367.anInt6861 += (local9 - Static367.anInt6861) * Static6.anInt135 / 1000 + Static408.anInt7278;
				if (local9 < Static367.anInt6861) {
					Static367.anInt6861 = local9;
				}
			}
			if (local9 < Static367.anInt6861) {
				Static367.anInt6861 -= Static408.anInt7278 + Static6.anInt135 * (Static367.anInt6861 - local9) / 1000;
				if (Static367.anInt6861 < local9) {
					Static367.anInt6861 = local9;
				}
			}
			if (local24 > Static182.anInt3520) {
				Static182.anInt3520 += (local24 - Static182.anInt3520) * Static6.anInt135 / 1000 + Static408.anInt7278;
				if (local24 < Static182.anInt3520) {
					Static182.anInt3520 = local24;
				}
			}
			if (Static364.anInt6817 < local15) {
				Static364.anInt6817 += (local15 - Static364.anInt6817) * Static6.anInt135 / 1000 + Static408.anInt7278;
				if (Static364.anInt6817 > local15) {
					Static364.anInt6817 = local15;
				}
			}
			if (Static182.anInt3520 > local24) {
				Static182.anInt3520 -= Static408.anInt7278 + Static6.anInt135 * (Static182.anInt3520 - local24) / 1000;
				if (local24 > Static182.anInt3520) {
					Static182.anInt3520 = local24;
				}
			}
			if (Static364.anInt6817 > local15) {
				Static364.anInt6817 -= Static6.anInt135 * (Static364.anInt6817 - local15) / 1000 + Static408.anInt7278;
				if (local15 > Static364.anInt6817) {
					Static364.anInt6817 = local15;
				}
			}
		}
		local15 = Static484.anInt8947 * 128 + 64;
		local9 = Static164.anInt3309 * 128 + 64;
		local24 = Static191.method5464(local9, local15, Static367.anInt6860) - Static159.anInt3262;
		@Pc(231) int local231 = local9 - Static367.anInt6861;
		@Pc(236) int local236 = local24 - Static182.anInt3520;
		@Pc(241) int local241 = local15 - Static364.anInt6817;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local231 * local231 + local241 * local241));
		@Pc(263) int local263 = (int) (Math.atan2((double) local236, (double) local252) * 2607.5945876176133D) & 0x3FFF;
		if (local263 < 1024) {
			local263 = 1024;
		}
		@Pc(279) int local279 = (int) (Math.atan2((double) local231, (double) local241) * -2607.5945876176133D) & 0x3FFF;
		if (local263 > 3072) {
			local263 = 3072;
		}
		if (local263 > Static180.anInt3500) {
			Static180.anInt3500 += Static107.anInt2340 + (local263 - Static180.anInt3500 >> 3) * Static73.anInt1454 / 1000 << 3;
			if (local263 < Static180.anInt3500) {
				Static180.anInt3500 = local263;
			}
		}
		if (Static180.anInt3500 > local263) {
			Static180.anInt3500 -= Static73.anInt1454 * (Static180.anInt3500 - local263 >> 3) / 1000 + Static107.anInt2340 << 3;
			if (Static180.anInt3500 < local263) {
				Static180.anInt3500 = local263;
			}
		}
		@Pc(353) int local353 = local279 - Static141.anInt2910;
		if (local353 > 8192) {
			local353 -= 16384;
		}
		if (local353 < -8192) {
			local353 += 16384;
		}
		local353 >>= 0x3;
		if (local353 > 0) {
			Static141.anInt2910 += local353 * Static73.anInt1454 / 1000 + Static107.anInt2340 << 3;
			Static141.anInt2910 &= 0x3FFF;
		}
		if (local353 < 0) {
			Static141.anInt2910 -= Static73.anInt1454 * -local353 / 1000 + Static107.anInt2340 << 3;
			Static141.anInt2910 &= 0x3FFF;
		}
		@Pc(412) int local412 = local279 - Static141.anInt2910;
		if (local412 > 8192) {
			local412 -= 16384;
		}
		if (local412 < -8192) {
			local412 += 16384;
		}
		if (local412 < 0 && local353 > 0 || local412 > 0 && local353 < 0) {
			Static141.anInt2910 = local279;
		}
		Static530.anInt8939 = 0;
	}
}
