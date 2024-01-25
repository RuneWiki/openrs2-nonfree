import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	public static int anInt6055;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method4863() {
		@Pc(9) int local9 = Static409.anInt6536 * 128 + 64;
		@Pc(15) int local15 = Static164.anInt6557 * 128 + 64;
		@Pc(23) int local23 = Static135.method1732(local9, local15, Static390.anInt6272) - Static109.anInt1672;
		if (Static151.anInt2353 >= 100) {
			Static80.anInt1106 = Static164.anInt6557 * 128 + 64;
			Static386.anInt7155 = Static409.anInt6536 * 128 + 64;
			anInt6055 = Static135.method1732(Static386.anInt7155, Static80.anInt1106, Static390.anInt6272) - Static109.anInt1672;
		} else {
			if (Static386.anInt7155 < local9) {
				Static386.anInt7155 += Static189.anInt3460 + (local9 - Static386.anInt7155) * Static151.anInt2353 / 1000;
				if (Static386.anInt7155 > local9) {
					Static386.anInt7155 = local9;
				}
			}
			if (local23 > anInt6055) {
				anInt6055 += (local23 - anInt6055) * Static151.anInt2353 / 1000 + Static189.anInt3460;
				if (local23 < anInt6055) {
					anInt6055 = local23;
				}
			}
			if (Static386.anInt7155 > local9) {
				Static386.anInt7155 -= (Static386.anInt7155 - local9) * Static151.anInt2353 / 1000 + Static189.anInt3460;
				if (local9 > Static386.anInt7155) {
					Static386.anInt7155 = local9;
				}
			}
			if (local15 > Static80.anInt1106) {
				Static80.anInt1106 += Static151.anInt2353 * (local15 - Static80.anInt1106) / 1000 + Static189.anInt3460;
				if (Static80.anInt1106 > local15) {
					Static80.anInt1106 = local15;
				}
			}
			if (local23 < anInt6055) {
				anInt6055 -= Static151.anInt2353 * (anInt6055 - local23) / 1000 + Static189.anInt3460;
				if (anInt6055 < local23) {
					anInt6055 = local23;
				}
			}
			if (local15 < Static80.anInt1106) {
				Static80.anInt1106 -= Static151.anInt2353 * (Static80.anInt1106 - local15) / 1000 + Static189.anInt3460;
				if (Static80.anInt1106 < local15) {
					Static80.anInt1106 = local15;
				}
			}
		}
		local9 = Static205.anInt3787 * 128 + 64;
		local15 = Static150.anInt4704 * 128 + 64;
		local23 = Static135.method1732(local9, local15, Static390.anInt6272) - Static86.anInt7437;
		@Pc(214) int local214 = local9 - Static386.anInt7155;
		@Pc(219) int local219 = local23 - anInt6055;
		@Pc(224) int local224 = local15 - Static80.anInt1106;
		@Pc(236) int local236 = (int) Math.sqrt((double) (local214 * local214 + local224 * local224));
		@Pc(251) int local251 = (int) (Math.atan2((double) local219, (double) local236) * 2607.5945876176133D) & 0x3FFF;
		if (local251 < 1024) {
			local251 = 1024;
		}
		@Pc(267) int local267 = (int) (-2607.5945876176133D * Math.atan2((double) local214, (double) local224)) & 0x3FFF;
		if (local251 > 3072) {
			local251 = 3072;
		}
		if (local251 > Static129.anInt1972) {
			Static129.anInt1972 += Static57.anInt915 * (local251 - Static129.anInt1972 >> 3) / 1000 + Static319.anInt5270 << 3;
			if (local251 < Static129.anInt1972) {
				Static129.anInt1972 = local251;
			}
		}
		if (local251 < Static129.anInt1972) {
			Static129.anInt1972 -= Static319.anInt5270 + (Static129.anInt1972 - local251 >> 3) * Static57.anInt915 / 1000 << 3;
			if (local251 > Static129.anInt1972) {
				Static129.anInt1972 = local251;
			}
		}
		@Pc(335) int local335 = local267 - Static398.anInt6386;
		if (local335 > 8192) {
			local335 -= 16384;
		}
		if (local335 < -8192) {
			local335 += 16384;
		}
		local335 >>= 0x3;
		if (local335 > 0) {
			Static398.anInt6386 += local335 * Static57.anInt915 / 1000 + Static319.anInt5270 << 3;
			Static398.anInt6386 &= 0x3FFF;
		}
		if (local335 < 0) {
			Static398.anInt6386 -= Static57.anInt915 * -local335 / 1000 + Static319.anInt5270 << 3;
			Static398.anInt6386 &= 0x3FFF;
		}
		@Pc(396) int local396 = local267 - Static398.anInt6386;
		if (local396 > 8192) {
			local396 -= 16384;
		}
		if (local396 < -8192) {
			local396 += 16384;
		}
		if (local396 < 0 && local335 > 0 || local396 > 0 && local335 < 0) {
			Static398.anInt6386 = local267;
		}
		Static39.anInt573 = 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
	public static boolean method4864(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
