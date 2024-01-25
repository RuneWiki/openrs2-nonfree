import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!up", name = "u", descriptor = "I")
	public static int anInt9801;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III)Z")
	public static boolean method8336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Z")
	public static boolean method8337(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class2_Sub7_Sub21 local18 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local18 != null; local18 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
			if (Static303.method4765(local18.anInt10014) && local18.aLong262 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	public static void method8341() {
		@Pc(9) int local9 = Static12.anInt193 * 512 + 256;
		@Pc(15) int local15 = Static195.anInt3891 * 512 + 256;
		@Pc(23) int local23 = Static392.method5799(Static531.anInt8550, local9, local15) - Static358.anInt6209;
		if (Static594.anInt9868 < 100) {
			if (local9 > Static576.anInt9403) {
				Static576.anInt9403 += (local9 - Static576.anInt9403) * Static594.anInt9868 / 1000 + Static527.anInt8506;
				if (local9 < Static576.anInt9403) {
					Static576.anInt9403 = local9;
				}
			}
			if (Static576.anInt9403 > local9) {
				Static576.anInt9403 -= Static527.anInt8506 + (Static576.anInt9403 - local9) * Static594.anInt9868 / 1000;
				if (Static576.anInt9403 < local9) {
					Static576.anInt9403 = local9;
				}
			}
			if (Static479.anInt7769 < local23) {
				Static479.anInt7769 += (local23 - Static479.anInt7769) * Static594.anInt9868 / 1000 + Static527.anInt8506;
				if (local23 < Static479.anInt7769) {
					Static479.anInt7769 = local23;
				}
			}
			if (local23 < Static479.anInt7769) {
				Static479.anInt7769 -= Static527.anInt8506 + (Static479.anInt7769 - local23) * Static594.anInt9868 / 1000;
				if (local23 > Static479.anInt7769) {
					Static479.anInt7769 = local23;
				}
			}
			if (local15 > Static63.anInt1715) {
				Static63.anInt1715 += Static527.anInt8506 + Static594.anInt9868 * (local15 - Static63.anInt1715) / 1000;
				if (local15 < Static63.anInt1715) {
					Static63.anInt1715 = local15;
				}
			}
			if (local15 < Static63.anInt1715) {
				Static63.anInt1715 -= Static594.anInt9868 * (Static63.anInt1715 - local15) / 1000 + Static527.anInt8506;
				if (local15 > Static63.anInt1715) {
					Static63.anInt1715 = local15;
				}
			}
		} else {
			Static576.anInt9403 = Static12.anInt193 * 512 + 256;
			Static63.anInt1715 = Static195.anInt3891 * 512 + 256;
			Static479.anInt7769 = Static392.method5799(Static531.anInt8550, Static576.anInt9403, Static63.anInt1715) - Static358.anInt6209;
		}
		local9 = Static510.anInt8225 * 512 + 256;
		local15 = Static379.anInt6616 * 512 + 256;
		local23 = Static392.method5799(Static531.anInt8550, local9, local15) - Static439.anInt7210;
		@Pc(234) int local234 = local9 - Static576.anInt9403;
		@Pc(239) int local239 = local23 - Static479.anInt7769;
		@Pc(243) int local243 = local15 - Static63.anInt1715;
		@Pc(254) int local254 = (int) Math.sqrt((double) (local243 * local243 + local234 * local234));
		@Pc(265) int local265 = (int) (Math.atan2((double) local239, (double) local254) * 2607.5945876176133D) & 0x3FFF;
		@Pc(276) int local276 = (int) (-2607.5945876176133D * Math.atan2((double) local234, (double) local243)) & 0x3FFF;
		if (local265 < 1024) {
			local265 = 1024;
		}
		if (local265 > 3072) {
			local265 = 3072;
		}
		if (local265 > Static502.anInt9930) {
			Static502.anInt9930 += Static591.anInt9828 + Static79.anInt2092 * (local265 - Static502.anInt9930 >> 3) / 1000 << 3;
			if (Static502.anInt9930 > local265) {
				Static502.anInt9930 = local265;
			}
		}
		if (local265 < Static502.anInt9930) {
			Static502.anInt9930 -= (Static502.anInt9930 - local265 >> 3) * Static79.anInt2092 / 1000 + Static591.anInt9828 << 3;
			if (local265 > Static502.anInt9930) {
				Static502.anInt9930 = local265;
			}
		}
		@Pc(352) int local352 = local276 - Static400.anInt7896;
		if (local352 > 8192) {
			local352 -= 16384;
		}
		if (local352 < -8192) {
			local352 += 16384;
		}
		local352 >>= 0x3;
		if (local352 > 0) {
			Static400.anInt7896 += Static79.anInt2092 * local352 / 1000 + Static591.anInt9828 << 3;
			Static400.anInt7896 &= 0x3FFF;
		}
		if (local352 < 0) {
			Static400.anInt7896 -= Static591.anInt9828 + Static79.anInt2092 * -local352 / 1000 << 3;
			Static400.anInt7896 &= 0x3FFF;
		}
		@Pc(413) int local413 = local276 - Static400.anInt7896;
		if (local413 > 8192) {
			local413 -= 16384;
		}
		if (local413 < -8192) {
			local413 += 16384;
		}
		if (local413 < 0 && local352 > 0 || local413 > 0 && local352 < 0) {
			Static400.anInt7896 = local276;
		}
		Static47.anInt1279 = 0;
	}
}
