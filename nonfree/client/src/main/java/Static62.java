import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
	public static int anInt1287;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
	public static int anInt1290;

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
	public static int anInt1291;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public static void method1133() {
		@Pc(9) int local9 = Static178.anInt3269 * 512 + 256;
		@Pc(15) int local15 = Static362.anInt6197 * 512 + 256;
		@Pc(23) int local23 = Static662.method8831(local15, local9, Static570.anInt9192) - Static34.anInt818;
		if (Static333.anInt5530 < 100) {
			if (local9 > Static370.anInt6266) {
				Static370.anInt6266 += (local9 - Static370.anInt6266) * Static333.anInt5530 / 1000 + Static217.anInt10310;
				if (Static370.anInt6266 > local9) {
					Static370.anInt6266 = local9;
				}
			}
			if (local23 > Static166.anInt3034) {
				Static166.anInt3034 += Static333.anInt5530 * (local23 - Static166.anInt3034) / 1000 + Static217.anInt10310;
				if (Static166.anInt3034 > local23) {
					Static166.anInt3034 = local23;
				}
			}
			if (local9 < Static370.anInt6266) {
				Static370.anInt6266 -= Static333.anInt5530 * (Static370.anInt6266 - local9) / 1000 + Static217.anInt10310;
				if (local9 > Static370.anInt6266) {
					Static370.anInt6266 = local9;
				}
			}
			if (local15 > Static564.anInt9117) {
				Static564.anInt9117 += Static217.anInt10310 + (local15 - Static564.anInt9117) * Static333.anInt5530 / 1000;
				if (Static564.anInt9117 > local15) {
					Static564.anInt9117 = local15;
				}
			}
			if (local23 < Static166.anInt3034) {
				Static166.anInt3034 -= Static217.anInt10310 + Static333.anInt5530 * (Static166.anInt3034 - local23) / 1000;
				if (Static166.anInt3034 < local23) {
					Static166.anInt3034 = local23;
				}
			}
			if (local15 < Static564.anInt9117) {
				Static564.anInt9117 -= Static217.anInt10310 + (Static564.anInt9117 - local15) * Static333.anInt5530 / 1000;
				if (Static564.anInt9117 < local15) {
					Static564.anInt9117 = local15;
				}
			}
		} else {
			Static564.anInt9117 = Static362.anInt6197 * 512 + 256;
			Static370.anInt6266 = Static178.anInt3269 * 512 + 256;
			Static166.anInt3034 = Static662.method8831(Static564.anInt9117, Static370.anInt6266, Static570.anInt9192) - Static34.anInt818;
		}
		local9 = Static93.anInt1931 * 512 + 256;
		local15 = Static76.anInt1481 * 512 + 256;
		local23 = Static662.method8831(local15, local9, Static570.anInt9192) - Static424.anInt6910;
		@Pc(215) int local215 = local9 - Static370.anInt6266;
		@Pc(220) int local220 = local23 - Static166.anInt3034;
		@Pc(224) int local224 = local15 - Static564.anInt9117;
		@Pc(235) int local235 = (int) Math.sqrt((double) (local224 * local224 + local215 * local215));
		@Pc(251) int local251 = (int) (Math.atan2((double) local220, (double) local235) * 2607.5945876176133D) & 0x3FFF;
		if (local251 < 1024) {
			local251 = 1024;
		}
		@Pc(267) int local267 = (int) (Math.atan2((double) local215, (double) local224) * -2607.5945876176133D) & 0x3FFF;
		if (local251 > 3072) {
			local251 = 3072;
		}
		if (local251 > Static655.anInt10676) {
			Static655.anInt10676 += Static528.anInt8313 + (local251 - Static655.anInt10676 >> 3) * Static131.anInt2538 / 1000 << 3;
			if (local251 < Static655.anInt10676) {
				Static655.anInt10676 = local251;
			}
		}
		if (local251 < Static655.anInt10676) {
			Static655.anInt10676 -= Static528.anInt8313 + (Static655.anInt10676 - local251 >> 3) * Static131.anInt2538 / 1000 << 3;
			if (local251 > Static655.anInt10676) {
				Static655.anInt10676 = local251;
			}
		}
		@Pc(332) int local332 = local267 - Static40.anInt856;
		if (local332 > 8192) {
			local332 -= 16384;
		}
		if (local332 < -8192) {
			local332 += 16384;
		}
		local332 >>= 0x3;
		if (local332 > 0) {
			Static40.anInt856 += Static131.anInt2538 * local332 / 1000 + Static528.anInt8313 << 3;
			Static40.anInt856 &= 0x3FFF;
		}
		if (local332 < 0) {
			Static40.anInt856 -= -local332 * Static131.anInt2538 / 1000 + Static528.anInt8313 << 3;
			Static40.anInt856 &= 0x3FFF;
		}
		@Pc(391) int local391 = local267 - Static40.anInt856;
		if (local391 > 8192) {
			local391 -= 16384;
		}
		if (local391 < -8192) {
			local391 += 16384;
		}
		if (local391 < 0 && local332 > 0 || local391 > 0 && local332 < 0) {
			Static40.anInt856 = local267;
		}
		Static325.anInt5414 = 0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIB)V")
	public static void method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class3_Sub5_Sub20 local11 = Static447.method6065((long) arg1, 14);
		local11.method8832();
		local11.anInt10754 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public static void method1135() {
		Static471.anInt7481 = -1;
		Static457.aClass17_6 = null;
		Static276.anInt4714 = -1;
		Static212.anInt3677 = -1;
		Static70.aClass17_1 = null;
		Static111.anInt2049 = -1;
		Static565.aClass17_8 = null;
		Static565.aClass95_13 = null;
		Static42.anIntArray52 = null;
		Static354.anInterface10Array1 = null;
		Static491.anInterface10_1 = null;
		Static185.aClass255_1.method5616();
	}
}
