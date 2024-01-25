import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
	public static int anInt4489;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_125 = new Class208(63, 6);

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_157 = new Class62("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "Z")
	public static boolean aBoolean324 = true;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V")
	public static void method3962() {
		@Pc(5) Class41 local5 = Static281.aClass41_61;
		synchronized (Static281.aClass41_61) {
			Static281.aClass41_61.method829();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
	public static int method3963(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(40) int local40 = (arg0 & 0x7F) * 96 >> 7;
			if (local40 < 2) {
				local40 = 2;
			} else if (local40 > 126) {
				local40 = 126;
			}
			return (arg0 & 0xFF80) + local40;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method3965() {
		@Pc(9) int local9 = Static141.anInt3014 * 128 + 64;
		@Pc(15) int local15 = Static178.anInt3759 * 128 + 64;
		@Pc(24) int local24 = Static36.method2335(local15, Static241.anInt2711, local9) - Static311.anInt3023;
		if (Static177.anInt3750 < 100) {
			if (local9 > Static145.anInt5345) {
				Static145.anInt5345 += Static78.anInt1721 + Static177.anInt3750 * (local9 - Static145.anInt5345) / 1000;
				if (local9 < Static145.anInt5345) {
					Static145.anInt5345 = local9;
				}
			}
			if (Static145.anInt5345 > local9) {
				Static145.anInt5345 -= Static78.anInt1721 + Static177.anInt3750 * (Static145.anInt5345 - local9) / 1000;
				if (local9 > Static145.anInt5345) {
					Static145.anInt5345 = local9;
				}
			}
			if (local24 > Static266.anInt5034) {
				Static266.anInt5034 += Static78.anInt1721 + (local24 - Static266.anInt5034) * Static177.anInt3750 / 1000;
				if (local24 < Static266.anInt5034) {
					Static266.anInt5034 = local24;
				}
			}
			if (local24 < Static266.anInt5034) {
				Static266.anInt5034 -= Static177.anInt3750 * (Static266.anInt5034 - local24) / 1000 + Static78.anInt1721;
				if (local24 > Static266.anInt5034) {
					Static266.anInt5034 = local24;
				}
			}
			if (Static27.anInt2842 < local15) {
				Static27.anInt2842 += Static177.anInt3750 * (local15 - Static27.anInt2842) / 1000 + Static78.anInt1721;
				if (local15 < Static27.anInt2842) {
					Static27.anInt2842 = local15;
				}
			}
			if (local15 < Static27.anInt2842) {
				Static27.anInt2842 -= Static78.anInt1721 + Static177.anInt3750 * (Static27.anInt2842 - local15) / 1000;
				if (local15 > Static27.anInt2842) {
					Static27.anInt2842 = local15;
				}
			}
		} else {
			Static145.anInt5345 = Static141.anInt3014 * 128 + 64;
			Static27.anInt2842 = Static178.anInt3759 * 128 + 64;
			Static266.anInt5034 = Static36.method2335(Static27.anInt2842, Static241.anInt2711, Static145.anInt5345) - Static311.anInt3023;
		}
		local9 = Static182.anInt3889 * 128 + 64;
		local15 = Static226.anInt4563 * 128 + 64;
		local24 = Static36.method2335(local15, Static241.anInt2711, local9) - Static181.anInt3812;
		@Pc(222) int local222 = local9 - Static145.anInt5345;
		@Pc(227) int local227 = local24 - Static266.anInt5034;
		@Pc(232) int local232 = local15 - Static27.anInt2842;
		@Pc(244) int local244 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
		@Pc(255) int local255 = (int) (Math.atan2((double) local227, (double) local244) * 2607.5945876176133D) & 0x3FFF;
		if (local255 < 1024) {
			local255 = 1024;
		}
		@Pc(278) int local278 = (int) (Math.atan2((double) local222, (double) local232) * -2607.5945876176133D) & 0x3FFF;
		if (local255 > 3072) {
			local255 = 3072;
		}
		if (Static237.anInt4684 < local255) {
			Static237.anInt4684 += Static115.anInt2550 * (local255 - Static237.anInt4684 >> 3) / 1000 + Static120.anInt2645 << 3;
			if (local255 < Static237.anInt4684) {
				Static237.anInt4684 = local255;
			}
		}
		if (local255 < Static237.anInt4684) {
			Static237.anInt4684 -= (Static237.anInt4684 - local255 >> 3) * Static115.anInt2550 / 1000 + Static120.anInt2645 << 3;
			if (Static237.anInt4684 < local255) {
				Static237.anInt4684 = local255;
			}
		}
		@Pc(350) int local350 = local278 - Static29.anInt444;
		if (local350 > 8192) {
			local350 -= 16384;
		}
		if (local350 < -8192) {
			local350 += 16384;
		}
		local350 >>= 0x3;
		if (local350 > 0) {
			Static29.anInt444 += local350 * Static115.anInt2550 / 1000 + Static120.anInt2645 << 3;
			Static29.anInt444 &= 0x3FFF;
		}
		if (local350 < 0) {
			Static29.anInt444 -= -local350 * Static115.anInt2550 / 1000 + Static120.anInt2645 << 3;
			Static29.anInt444 &= 0x3FFF;
		}
		@Pc(411) int local411 = local278 - Static29.anInt444;
		if (local411 > 8192) {
			local411 -= 16384;
		}
		if (local411 < -8192) {
			local411 += 16384;
		}
		if (local411 < 0 && local350 > 0 || local411 > 0 && local350 < 0) {
			Static29.anInt444 = local278;
		}
		Static11.anInt209 = 0;
	}
}
