import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
	public static int anInt9313;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_187 = new Class239(89, -2);

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "S")
	public static short aShort164 = 320;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
	public static void method7739() {
		@Pc(9) int local9 = Static212.anInt3814 * 128 + 64;
		@Pc(15) int local15 = Static329.anInt3845 * 128 + 64;
		@Pc(24) int local24 = Static200.method3233(Static208.anInt3742, local9, local15) - Static441.anInt8031;
		if (Static494.anInt8674 >= 100) {
			Static353.anInt5258 = Static329.anInt3845 * 128 + 64;
			Static187.anInt3432 = Static212.anInt3814 * 128 + 64;
			Static329.anInt3848 = Static200.method3233(Static208.anInt3742, Static187.anInt3432, Static353.anInt5258) - Static441.anInt8031;
		} else {
			if (Static187.anInt3432 < local9) {
				Static187.anInt3432 += Static494.anInt8674 * (local9 - Static187.anInt3432) / 1000 + Static278.anInt5109;
				if (local9 < Static187.anInt3432) {
					Static187.anInt3432 = local9;
				}
			}
			if (Static329.anInt3848 < local24) {
				Static329.anInt3848 += Static494.anInt8674 * (local24 - Static329.anInt3848) / 1000 + Static278.anInt5109;
				if (local24 < Static329.anInt3848) {
					Static329.anInt3848 = local24;
				}
			}
			if (Static187.anInt3432 > local9) {
				Static187.anInt3432 -= Static278.anInt5109 + Static494.anInt8674 * (Static187.anInt3432 - local9) / 1000;
				if (Static187.anInt3432 < local9) {
					Static187.anInt3432 = local9;
				}
			}
			if (Static353.anInt5258 < local15) {
				Static353.anInt5258 += Static278.anInt5109 + Static494.anInt8674 * (local15 - Static353.anInt5258) / 1000;
				if (local15 < Static353.anInt5258) {
					Static353.anInt5258 = local15;
				}
			}
			if (local24 < Static329.anInt3848) {
				Static329.anInt3848 -= Static278.anInt5109 + Static494.anInt8674 * (Static329.anInt3848 - local24) / 1000;
				if (Static329.anInt3848 < local24) {
					Static329.anInt3848 = local24;
				}
			}
			if (Static353.anInt5258 > local15) {
				Static353.anInt5258 -= Static278.anInt5109 + (Static353.anInt5258 - local15) * Static494.anInt8674 / 1000;
				if (local15 > Static353.anInt5258) {
					Static353.anInt5258 = local15;
				}
			}
		}
		local9 = Static274.anInt4992 * 128 + 64;
		local15 = Static68.anInt1456 * 128 + 64;
		local24 = Static200.method3233(Static208.anInt3742, local9, local15) - Static269.anInt4939;
		@Pc(227) int local227 = local9 - Static187.anInt3432;
		@Pc(232) int local232 = local24 - Static329.anInt3848;
		@Pc(237) int local237 = local15 - Static353.anInt5258;
		@Pc(248) int local248 = (int) Math.sqrt((double) (local227 * local227 + local237 * local237));
		@Pc(259) int local259 = (int) (Math.atan2((double) local232, (double) local248) * 2607.5945876176133D) & 0x3FFF;
		@Pc(270) int local270 = (int) (-2607.5945876176133D * Math.atan2((double) local227, (double) local237)) & 0x3FFF;
		if (local259 < 1024) {
			local259 = 1024;
		}
		if (local259 > 3072) {
			local259 = 3072;
		}
		if (local259 > Static209.anInt3769) {
			Static209.anInt3769 += Static537.anInt9322 * (local259 - Static209.anInt3769 >> 3) / 1000 + Static284.anInt9395 << 3;
			if (local259 < Static209.anInt3769) {
				Static209.anInt3769 = local259;
			}
		}
		if (local259 < Static209.anInt3769) {
			Static209.anInt3769 -= (Static209.anInt3769 - local259 >> 3) * Static537.anInt9322 / 1000 + Static284.anInt9395 << 3;
			if (local259 > Static209.anInt3769) {
				Static209.anInt3769 = local259;
			}
		}
		@Pc(347) int local347 = local270 - Static429.anInt7997;
		if (local347 > 8192) {
			local347 -= 16384;
		}
		if (local347 < -8192) {
			local347 += 16384;
		}
		local347 >>= 0x3;
		if (local347 > 0) {
			Static429.anInt7997 += Static284.anInt9395 + Static537.anInt9322 * local347 / 1000 << 3;
			Static429.anInt7997 &= 0x3FFF;
		}
		if (local347 < 0) {
			Static429.anInt7997 -= Static284.anInt9395 + -local347 * Static537.anInt9322 / 1000 << 3;
			Static429.anInt7997 &= 0x3FFF;
		}
		@Pc(408) int local408 = local270 - Static429.anInt7997;
		if (local408 > 8192) {
			local408 -= 16384;
		}
		if (local408 < -8192) {
			local408 += 16384;
		}
		Static344.anInt6362 = 0;
		if (local408 < 0 && local347 > 0 || local408 > 0 && local347 < 0) {
			Static429.anInt7997 = local270;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILclient!wca;)V")
	public static void method7740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class310 arg2) {
		@Pc(12) Class209 local12 = arg2.method7649(Static103.aClass39_3);
		if (local12 == null) {
			return;
		}
		Static103.aClass39_3.N(arg0, arg1, arg0 + arg2.anInt9163, arg1 + arg2.anInt9198);
		if (Static68.anInt1451 < 3) {
			Static311.aClass35_26.method7342((float) arg0 + (float) arg2.anInt9163 / 2.0F, (float) arg2.anInt9198 / 2.0F + (float) arg1, ((int) -Static161.aFloat56 & 0x3FFF) << 2, local12, arg0, arg1);
		} else {
			Static103.aClass39_3.G(-16777216, local12, arg0, arg1);
		}
	}
}
