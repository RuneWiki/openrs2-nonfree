import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!nf;")
	public static Class164 aClass164_1;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	public static int anInt2371;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_99 = new Class103(78, -1);

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_19 = new Class227();

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
	public static final int anInt2370 = 205;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "J")
	public static long aLong70 = -1L;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Z")
	public static boolean aBoolean265 = true;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
	public static int anInt2372 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)[Lclient!hk;")
	public static Class99[] method2036() {
		return new Class99[] { Static180.aClass99_1, Static180.aClass99_2, Static180.aClass99_3, Static180.aClass99_4, Static180.aClass99_5, Static180.aClass99_6, Static180.aClass99_7, Static180.aClass99_8, Static180.aClass99_9, Static180.aClass99_10, Static180.aClass99_11, Static180.aClass99_12 };
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	public static void method2037() {
		@Pc(9) int local9 = Static312.anInt5418 * 128 + 64;
		@Pc(15) int local15 = Static207.anInt6028 * 128 + 64;
		@Pc(24) int local24 = Static335.method4499(Static265.anInt4807, local9, local15) - Static143.anInt2346;
		if (Static262.anInt4691 < 100) {
			if (local9 > Static213.anInt258) {
				Static213.anInt258 += (local9 - Static213.anInt258) * Static262.anInt4691 / 1000 + Static53.anInt962;
				if (Static213.anInt258 > local9) {
					Static213.anInt258 = local9;
				}
			}
			if (Static213.anInt258 > local9) {
				Static213.anInt258 -= Static262.anInt4691 * (Static213.anInt258 - local9) / 1000 + Static53.anInt962;
				if (Static213.anInt258 < local9) {
					Static213.anInt258 = local9;
				}
			}
			if (Static391.anInt6529 < local24) {
				Static391.anInt6529 += Static53.anInt962 + Static262.anInt4691 * (local24 - Static391.anInt6529) / 1000;
				if (local24 < Static391.anInt6529) {
					Static391.anInt6529 = local24;
				}
			}
			if (Static360.anInt6145 < local15) {
				Static360.anInt6145 += Static262.anInt4691 * (local15 - Static360.anInt6145) / 1000 + Static53.anInt962;
				if (local15 < Static360.anInt6145) {
					Static360.anInt6145 = local15;
				}
			}
			if (Static391.anInt6529 > local24) {
				Static391.anInt6529 -= Static53.anInt962 + (Static391.anInt6529 - local24) * Static262.anInt4691 / 1000;
				if (Static391.anInt6529 < local24) {
					Static391.anInt6529 = local24;
				}
			}
			if (local15 < Static360.anInt6145) {
				Static360.anInt6145 -= Static53.anInt962 + Static262.anInt4691 * (Static360.anInt6145 - local15) / 1000;
				if (Static360.anInt6145 < local15) {
					Static360.anInt6145 = local15;
				}
			}
		} else {
			Static360.anInt6145 = Static207.anInt6028 * 128 + 64;
			Static213.anInt258 = Static312.anInt5418 * 128 + 64;
			Static391.anInt6529 = Static335.method4499(Static265.anInt4807, Static213.anInt258, Static360.anInt6145) - Static143.anInt2346;
		}
		local9 = Static145.anInt1966 * 128 + 64;
		local15 = Static260.anInt2259 * 128 + 64;
		local24 = Static335.method4499(Static265.anInt4807, local9, local15) - Static309.anInt5374;
		@Pc(230) int local230 = local9 - Static213.anInt258;
		@Pc(234) int local234 = local24 - Static391.anInt6529;
		@Pc(239) int local239 = local15 - Static360.anInt6145;
		@Pc(251) int local251 = (int) Math.sqrt((double) (local230 * local230 + local239 * local239));
		@Pc(262) int local262 = (int) (Math.atan2((double) local234, (double) local251) * 2607.5945876176133D) & 0x3FFF;
		@Pc(273) int local273 = (int) (-2607.5945876176133D * Math.atan2((double) local230, (double) local239)) & 0x3FFF;
		if (local262 < 1024) {
			local262 = 1024;
		}
		if (local262 > 3072) {
			local262 = 3072;
		}
		if (Static340.anInt5790 < local262) {
			Static340.anInt5790 += Static223.anInt5857 + Static383.anInt6391 * (local262 - Static340.anInt5790 >> 3) / 1000 << 3;
			if (local262 < Static340.anInt5790) {
				Static340.anInt5790 = local262;
			}
		}
		if (Static340.anInt5790 > local262) {
			Static340.anInt5790 -= Static223.anInt5857 + (Static340.anInt5790 - local262 >> 3) * Static383.anInt6391 / 1000 << 3;
			if (local262 > Static340.anInt5790) {
				Static340.anInt5790 = local262;
			}
		}
		@Pc(351) int local351 = local273 - Static106.anInt2033;
		if (local351 > 8192) {
			local351 -= 16384;
		}
		if (local351 < -8192) {
			local351 += 16384;
		}
		local351 >>= 0x3;
		if (local351 > 0) {
			Static106.anInt2033 += Static223.anInt5857 + local351 * Static383.anInt6391 / 1000 << 3;
			Static106.anInt2033 &= 0x3FFF;
		}
		if (local351 < 0) {
			Static106.anInt2033 -= Static223.anInt5857 + Static383.anInt6391 * -local351 / 1000 << 3;
			Static106.anInt2033 &= 0x3FFF;
		}
		@Pc(412) int local412 = local273 - Static106.anInt2033;
		if (local412 > 8192) {
			local412 -= 16384;
		}
		if (local412 < -8192) {
			local412 += 16384;
		}
		if (local412 < 0 && local351 > 0 || local412 > 0 && local351 < 0) {
			Static106.anInt2033 = local273;
		}
		Static73.anInt1361 = 0;
	}
}
