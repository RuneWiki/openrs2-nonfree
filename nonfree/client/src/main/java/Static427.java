import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "Lclient!pp;")
	public static final Class201 aClass201_5 = new Class201("LIVE", 0);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public static void method2167() {
		@Pc(9) int local9 = Static64.anInt1159 * 128 + 64;
		@Pc(15) int local15 = Static131.anInt2368 * 128 + 64;
		@Pc(23) int local23 = Static94.method4425(local15, Static68.anInt1387, local9) - Static133.anInt2434;
		if (Static199.anInt3572 < 100) {
			if (local9 > Static235.anInt4004) {
				Static235.anInt4004 += Static199.anInt3572 * (local9 - Static235.anInt4004) / 1000 + Static3.anInt49;
				if (Static235.anInt4004 > local9) {
					Static235.anInt4004 = local9;
				}
			}
			if (Static235.anInt4004 > local9) {
				Static235.anInt4004 -= Static199.anInt3572 * (Static235.anInt4004 - local9) / 1000 + Static3.anInt49;
				if (Static235.anInt4004 < local9) {
					Static235.anInt4004 = local9;
				}
			}
			if (Static222.anInt3814 < local23) {
				Static222.anInt3814 += Static199.anInt3572 * (local23 - Static222.anInt3814) / 1000 + Static3.anInt49;
				if (local23 < Static222.anInt3814) {
					Static222.anInt3814 = local23;
				}
			}
			if (local23 < Static222.anInt3814) {
				Static222.anInt3814 -= Static3.anInt49 + Static199.anInt3572 * (Static222.anInt3814 - local23) / 1000;
				if (Static222.anInt3814 < local23) {
					Static222.anInt3814 = local23;
				}
			}
			if (Static393.anInt7135 < local15) {
				Static393.anInt7135 += Static3.anInt49 + Static199.anInt3572 * (local15 - Static393.anInt7135) / 1000;
				if (Static393.anInt7135 > local15) {
					Static393.anInt7135 = local15;
				}
			}
			if (Static393.anInt7135 > local15) {
				Static393.anInt7135 -= Static199.anInt3572 * (Static393.anInt7135 - local15) / 1000 + Static3.anInt49;
				if (Static393.anInt7135 < local15) {
					Static393.anInt7135 = local15;
				}
			}
		} else {
			Static393.anInt7135 = Static131.anInt2368 * 128 + 64;
			Static235.anInt4004 = Static64.anInt1159 * 128 + 64;
			Static222.anInt3814 = Static94.method4425(Static393.anInt7135, Static68.anInt1387, Static235.anInt4004) - Static133.anInt2434;
		}
		local9 = Static392.anInt6418 * 128 + 64;
		local15 = Static288.anInt4738 * 128 + 64;
		local23 = Static94.method4425(local15, Static68.anInt1387, local9) - Static142.anInt2538;
		@Pc(211) int local211 = local9 - Static235.anInt4004;
		@Pc(221) int local221 = local23 - Static222.anInt3814;
		@Pc(225) int local225 = local15 - Static393.anInt7135;
		@Pc(237) int local237 = (int) Math.sqrt((double) (local211 * local211 + local225 * local225));
		@Pc(248) int local248 = (int) (Math.atan2((double) local221, (double) local237) * 2607.5945876176133D) & 0x3FFF;
		@Pc(259) int local259 = (int) (Math.atan2((double) local211, (double) local225) * -2607.5945876176133D) & 0x3FFF;
		if (local248 < 1024) {
			local248 = 1024;
		}
		if (local248 > 3072) {
			local248 = 3072;
		}
		if (Static133.anInt2435 < local248) {
			Static133.anInt2435 += Static366.anInt6051 * (local248 - Static133.anInt2435 >> 3) / 1000 + Static432.anInt7151 << 3;
			if (local248 < Static133.anInt2435) {
				Static133.anInt2435 = local248;
			}
		}
		if (Static133.anInt2435 > local248) {
			Static133.anInt2435 -= Static432.anInt7151 + Static366.anInt6051 * (Static133.anInt2435 - local248 >> 3) / 1000 << 3;
			if (Static133.anInt2435 < local248) {
				Static133.anInt2435 = local248;
			}
		}
		@Pc(339) int local339 = local259 - Static411.anInt6947;
		if (local339 > 8192) {
			local339 -= 16384;
		}
		if (local339 < -8192) {
			local339 += 16384;
		}
		local339 >>= 0x3;
		if (local339 > 0) {
			Static411.anInt6947 += Static432.anInt7151 + Static366.anInt6051 * local339 / 1000 << 3;
			Static411.anInt6947 &= 0x3FFF;
		}
		if (local339 < 0) {
			Static411.anInt6947 -= -local339 * Static366.anInt6051 / 1000 + Static432.anInt7151 << 3;
			Static411.anInt6947 &= 0x3FFF;
		}
		@Pc(403) int local403 = local259 - Static411.anInt6947;
		if (local403 > 8192) {
			local403 -= 16384;
		}
		if (local403 < -8192) {
			local403 += 16384;
		}
		if (local403 < 0 && local339 > 0 || local403 > 0 && local339 < 0) {
			Static411.anInt6947 = local259;
		}
		Static226.anInt3896 = 0;
	}
}
