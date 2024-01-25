import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!ik;")
	public static Class182 aClass182_7;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
	public static void method1144() {
		@Pc(9) int local9 = Static114.anInt2375 * 512 + 256;
		@Pc(15) int local15 = Static528.anInt8244 * 512 + 256;
		@Pc(23) int local23 = Static77.method1633(local15, local9, Static723.anInt11225) - Static332.anInt5343;
		if (Static287.anInt4415 < 100) {
			if (local9 > Static305.anInt4908) {
				Static305.anInt4908 += Static287.anInt4415 * (local9 - Static305.anInt4908) / 1000 + Static25.anInt766;
				if (Static305.anInt4908 > local9) {
					Static305.anInt4908 = local9;
				}
			}
			if (local23 > Static490.anInt7687) {
				Static490.anInt7687 += Static25.anInt766 + Static287.anInt4415 * (local23 - Static490.anInt7687) / 1000;
				if (local23 < Static490.anInt7687) {
					Static490.anInt7687 = local23;
				}
			}
			if (local9 < Static305.anInt4908) {
				Static305.anInt4908 -= Static25.anInt766 + Static287.anInt4415 * (Static305.anInt4908 - local9) / 1000;
				if (local9 > Static305.anInt4908) {
					Static305.anInt4908 = local9;
				}
			}
			if (local23 < Static490.anInt7687) {
				Static490.anInt7687 -= Static25.anInt766 + Static287.anInt4415 * (Static490.anInt7687 - local23) / 1000;
				if (Static490.anInt7687 < local23) {
					Static490.anInt7687 = local23;
				}
			}
			if (local15 > Static263.anInt4101) {
				Static263.anInt4101 += Static25.anInt766 + (local15 - Static263.anInt4101) * Static287.anInt4415 / 1000;
				if (local15 < Static263.anInt4101) {
					Static263.anInt4101 = local15;
				}
			}
			if (local15 < Static263.anInt4101) {
				Static263.anInt4101 -= Static287.anInt4415 * (Static263.anInt4101 - local15) / 1000 + Static25.anInt766;
				if (Static263.anInt4101 < local15) {
					Static263.anInt4101 = local15;
				}
			}
		} else {
			Static305.anInt4908 = Static114.anInt2375 * 512 + 256;
			Static263.anInt4101 = Static528.anInt8244 * 512 + 256;
			Static490.anInt7687 = Static77.method1633(Static263.anInt4101, Static305.anInt4908, Static723.anInt11225) - Static332.anInt5343;
		}
		local15 = Static183.anInt3174 * 512 + 256;
		local9 = Static453.anInt6956 * 512 + 256;
		local23 = Static77.method1633(local15, local9, Static723.anInt11225) - Static512.anInt10668;
		@Pc(245) int local245 = local9 - Static305.anInt4908;
		@Pc(250) int local250 = local23 - Static490.anInt7687;
		@Pc(254) int local254 = local15 - Static263.anInt4101;
		@Pc(265) int local265 = (int) Math.sqrt((double) (local254 * local254 + local245 * local245));
		@Pc(276) int local276 = (int) (Math.atan2((double) local250, (double) local265) * 2607.5945876176133D) & 0x3FFF;
		if (local276 < 1024) {
			local276 = 1024;
		}
		@Pc(302) int local302 = (int) (-2607.5945876176133D * Math.atan2((double) local245, (double) local254)) & 0x3FFF;
		if (local276 > 3072) {
			local276 = 3072;
		}
		if (Static171.anInt8707 < local276) {
			Static171.anInt8707 += (local276 - Static171.anInt8707 >> 3) * Static45.anInt1294 / 1000 + Static631.anInt9738 << 3;
			if (Static171.anInt8707 > local276) {
				Static171.anInt8707 = local276;
			}
		}
		if (Static171.anInt8707 > local276) {
			Static171.anInt8707 -= Static631.anInt9738 + Static45.anInt1294 * (Static171.anInt8707 - local276 >> 3) / 1000 << 3;
			if (Static171.anInt8707 < local276) {
				Static171.anInt8707 = local276;
			}
		}
		@Pc(378) int local378 = local302 - Static46.anInt1301;
		if (local378 > 8192) {
			local378 -= 16384;
		}
		if (local378 < -8192) {
			local378 += 16384;
		}
		local378 >>= 0x3;
		if (local378 > 0) {
			Static46.anInt1301 += local378 * Static45.anInt1294 / 1000 + Static631.anInt9738 << 3;
			Static46.anInt1301 &= 0x3FFF;
		}
		if (local378 < 0) {
			Static46.anInt1301 -= Static45.anInt1294 * -local378 / 1000 + Static631.anInt9738 << 3;
			Static46.anInt1301 &= 0x3FFF;
		}
		@Pc(442) int local442 = local302 - Static46.anInt1301;
		if (local442 > 8192) {
			local442 -= 16384;
		}
		if (local442 < -8192) {
			local442 += 16384;
		}
		if (local442 < 0 && local378 > 0 || local442 > 0 && local378 < 0) {
			Static46.anInt1301 = local302;
		}
		Static32.anInt1120 = 0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)Z")
	public static boolean method1145() {
		return Static599.anInt9088 == 0 ? Static708.aClass3_Sub33_Sub3_4.method7913() : true;
	}
}
