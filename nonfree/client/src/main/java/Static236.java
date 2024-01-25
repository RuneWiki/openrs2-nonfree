import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!jv;")
	public static final Class182 aClass182_5 = new Class182("", 16);

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public static int anInt4754 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method4045() {
		@Pc(9) int local9 = Static209.anInt9659 * 512 + 256;
		@Pc(15) int local15 = Static12.anInt226 * 512 + 256;
		@Pc(26) int local26 = Static160.method3164(local9, Static320.anInt5748, local15) - Static319.anInt5734;
		if (Static580.anInt2680 >= 100) {
			Static473.anInt7978 = Static209.anInt9659 * 512 + 256;
			Static563.anInt9436 = Static12.anInt226 * 512 + 256;
			Static569.anInt4616 = Static160.method3164(Static473.anInt7978, Static320.anInt5748, Static563.anInt9436) - Static319.anInt5734;
		} else {
			if (Static473.anInt7978 < local9) {
				Static473.anInt7978 += Static425.anInt7335 + (local9 - Static473.anInt7978) * Static580.anInt2680 / 1000;
				if (local9 < Static473.anInt7978) {
					Static473.anInt7978 = local9;
				}
			}
			if (Static473.anInt7978 > local9) {
				Static473.anInt7978 -= Static580.anInt2680 * (Static473.anInt7978 - local9) / 1000 + Static425.anInt7335;
				if (Static473.anInt7978 < local9) {
					Static473.anInt7978 = local9;
				}
			}
			if (Static569.anInt4616 < local26) {
				Static569.anInt4616 += Static425.anInt7335 + (local26 - Static569.anInt4616) * Static580.anInt2680 / 1000;
				if (Static569.anInt4616 > local26) {
					Static569.anInt4616 = local26;
				}
			}
			if (local26 < Static569.anInt4616) {
				Static569.anInt4616 -= (Static569.anInt4616 - local26) * Static580.anInt2680 / 1000 + Static425.anInt7335;
				if (Static569.anInt4616 < local26) {
					Static569.anInt4616 = local26;
				}
			}
			if (Static563.anInt9436 < local15) {
				Static563.anInt9436 += Static425.anInt7335 + Static580.anInt2680 * (local15 - Static563.anInt9436) / 1000;
				if (local15 < Static563.anInt9436) {
					Static563.anInt9436 = local15;
				}
			}
			if (Static563.anInt9436 > local15) {
				Static563.anInt9436 -= Static425.anInt7335 + (Static563.anInt9436 - local15) * Static580.anInt2680 / 1000;
				if (local15 > Static563.anInt9436) {
					Static563.anInt9436 = local15;
				}
			}
		}
		local15 = Static353.anInt6160 * 512 + 256;
		local9 = Static548.anInt9202 * 512 + 256;
		local26 = Static160.method3164(local9, Static320.anInt5748, local15) - Static23.anInt454;
		@Pc(229) int local229 = local9 - Static473.anInt7978;
		@Pc(234) int local234 = local26 - Static569.anInt4616;
		@Pc(239) int local239 = local15 - Static563.anInt9436;
		@Pc(250) int local250 = (int) Math.sqrt((double) (local229 * local229 + local239 * local239));
		@Pc(261) int local261 = (int) (Math.atan2((double) local234, (double) local250) * 2607.5945876176133D) & 0x3FFF;
		@Pc(272) int local272 = (int) (Math.atan2((double) local229, (double) local239) * -2607.5945876176133D) & 0x3FFF;
		if (local261 < 1024) {
			local261 = 1024;
		}
		if (local261 > 3072) {
			local261 = 3072;
		}
		if (Static348.anInt6087 < local261) {
			Static348.anInt6087 += (local261 - Static348.anInt6087 >> 3) * Static466.anInt7862 / 1000 + Static354.anInt6168 << 3;
			if (local261 < Static348.anInt6087) {
				Static348.anInt6087 = local261;
			}
		}
		if (local261 < Static348.anInt6087) {
			Static348.anInt6087 -= Static466.anInt7862 * (Static348.anInt6087 - local261 >> 3) / 1000 + Static354.anInt6168 << 3;
			if (Static348.anInt6087 < local261) {
				Static348.anInt6087 = local261;
			}
		}
		@Pc(350) int local350 = local272 - Static37.anInt738;
		if (local350 > 8192) {
			local350 -= 16384;
		}
		if (local350 < -8192) {
			local350 += 16384;
		}
		local350 >>= 0x3;
		if (local350 > 0) {
			Static37.anInt738 += Static354.anInt6168 + local350 * Static466.anInt7862 / 1000 << 3;
			Static37.anInt738 &= 0x3FFF;
		}
		if (local350 < 0) {
			Static37.anInt738 -= -local350 * Static466.anInt7862 / 1000 + Static354.anInt6168 << 3;
			Static37.anInt738 &= 0x3FFF;
		}
		@Pc(412) int local412 = local272 - Static37.anInt738;
		if (local412 > 8192) {
			local412 -= 16384;
		}
		if (local412 < -8192) {
			local412 += 16384;
		}
		if (local412 < 0 && local350 > 0 || local412 > 0 && local350 < 0) {
			Static37.anInt738 = local272;
		}
		Static235.anInt4750 = 0;
	}
}
