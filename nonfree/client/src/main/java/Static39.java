import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "[[Lclient!oh;")
	public static Class273[][] aClass273ArrayArray1;

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_15 = new Class60();

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
	public static int anInt535 = 0;

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_13 = new Class349(41, -1);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
	public static int anInt536 = 100;

	@OriginalMember(owner = "client!bca", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	public static void method552() {
		@Pc(9) int local9 = Static594.anInt9285 * 512 + 256;
		@Pc(15) int local15 = Static14.anInt205 * 512 + 256;
		@Pc(24) int local24 = Static324.method4554(Static684.anInt10516, local9, local15) - Static78.anInt1359;
		if (Static534.anInt8461 >= 100) {
			Static430.anInt7002 = Static594.anInt9285 * 512 + 256;
			Static218.anInt3475 = Static14.anInt205 * 512 + 256;
			Static411.anInt6731 = Static324.method4554(Static684.anInt10516, Static430.anInt7002, Static218.anInt3475) - Static78.anInt1359;
		} else {
			if (local9 > Static430.anInt7002) {
				Static430.anInt7002 += (local9 - Static430.anInt7002) * Static534.anInt8461 / 1000 + Static520.anInt8274;
				if (local9 < Static430.anInt7002) {
					Static430.anInt7002 = local9;
				}
			}
			if (local9 < Static430.anInt7002) {
				Static430.anInt7002 -= (Static430.anInt7002 - local9) * Static534.anInt8461 / 1000 + Static520.anInt8274;
				if (Static430.anInt7002 < local9) {
					Static430.anInt7002 = local9;
				}
			}
			if (Static411.anInt6731 < local24) {
				Static411.anInt6731 += (local24 - Static411.anInt6731) * Static534.anInt8461 / 1000 + Static520.anInt8274;
				if (local24 < Static411.anInt6731) {
					Static411.anInt6731 = local24;
				}
			}
			if (Static218.anInt3475 < local15) {
				Static218.anInt3475 += Static534.anInt8461 * (local15 - Static218.anInt3475) / 1000 + Static520.anInt8274;
				if (local15 < Static218.anInt3475) {
					Static218.anInt3475 = local15;
				}
			}
			if (Static411.anInt6731 > local24) {
				Static411.anInt6731 -= Static534.anInt8461 * (Static411.anInt6731 - local24) / 1000 + Static520.anInt8274;
				if (local24 > Static411.anInt6731) {
					Static411.anInt6731 = local24;
				}
			}
			if (Static218.anInt3475 > local15) {
				Static218.anInt3475 -= Static520.anInt8274 + Static534.anInt8461 * (Static218.anInt3475 - local15) / 1000;
				if (local15 > Static218.anInt3475) {
					Static218.anInt3475 = local15;
				}
			}
		}
		local15 = Static147.anInt2479 * 512 + 256;
		local9 = Static567.anInt8900 * 512 + 256;
		local24 = Static324.method4554(Static684.anInt10516, local9, local15) - Static414.anInt9481;
		@Pc(261) int local261 = local9 - Static430.anInt7002;
		@Pc(266) int local266 = local24 - Static411.anInt6731;
		@Pc(271) int local271 = local15 - Static218.anInt3475;
		@Pc(282) int local282 = (int) Math.sqrt((double) (local271 * local271 + local261 * local261));
		@Pc(293) int local293 = (int) (Math.atan2((double) local266, (double) local282) * 2607.5945876176133D) & 0x3FFF;
		if (local293 < 1024) {
			local293 = 1024;
		}
		@Pc(317) int local317 = (int) (Math.atan2((double) local261, (double) local271) * -2607.5945876176133D) & 0x3FFF;
		if (local293 > 3072) {
			local293 = 3072;
		}
		if (Static583.anInt2354 < local293) {
			Static583.anInt2354 += Static48.anInt641 + (local293 - Static583.anInt2354 >> 3) * Static345.anInt5345 / 1000 << 3;
			if (local293 < Static583.anInt2354) {
				Static583.anInt2354 = local293;
			}
		}
		if (Static583.anInt2354 > local293) {
			Static583.anInt2354 -= Static48.anInt641 + (Static583.anInt2354 - local293 >> 3) * Static345.anInt5345 / 1000 << 3;
			if (local293 > Static583.anInt2354) {
				Static583.anInt2354 = local293;
			}
		}
		@Pc(398) int local398 = local317 - Static611.anInt9456;
		if (local398 > 8192) {
			local398 -= 16384;
		}
		if (local398 < -8192) {
			local398 += 16384;
		}
		local398 >>= 0x3;
		if (local398 > 0) {
			Static611.anInt9456 += Static48.anInt641 + local398 * Static345.anInt5345 / 1000 << 3;
			Static611.anInt9456 &= 0x3FFF;
		}
		if (local398 < 0) {
			Static611.anInt9456 -= Static48.anInt641 + -local398 * Static345.anInt5345 / 1000 << 3;
			Static611.anInt9456 &= 0x3FFF;
		}
		@Pc(465) int local465 = local317 - Static611.anInt9456;
		if (local465 > 8192) {
			local465 -= 16384;
		}
		if (local465 < -8192) {
			local465 += 16384;
		}
		if (local465 < 0 && local398 > 0 || local465 > 0 && local398 < 0) {
			Static611.anInt9456 = local317;
		}
		Static322.anInt4929 = 0;
	}
}
