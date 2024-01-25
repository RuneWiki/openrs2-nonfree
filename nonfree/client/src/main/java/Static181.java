import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
	public static int anInt3761;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "[I")
	public static int[] anIntArray443;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean317 = true;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "[I")
	public static final int[] anIntArray441 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public static void method3545() {
		Static204.aStringArray29 = new String[500];
		Static259.anInt5031 = Static273.aClass38_8.anInt1347 + Static273.aClass38_8.anInt1355 + 2;
		Static9.anInt219 = Static180.aClass38_5.anInt1355 + Static180.aClass38_5.anInt1347 + 2;
		for (@Pc(31) int local31 = 0; local31 < Static204.aStringArray29.length; local31++) {
			Static204.aStringArray29[local31] = "";
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!qj;ZIIIIB)V")
	public static void method3546(@OriginalArg(0) Class165 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		Static259.anInt5035 = arg2;
		Static3.anInt77 = 1;
		Static158.aBoolean276 = false;
		Static160.anInt3183 = arg1;
		Static292.anInt5680 = 2;
		Static68.anInt1415 = 0;
		Static77.aClass165_25 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method3548(@OriginalArg(0) Class165 arg0) {
		Static273.aClass165_81 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public static void method3549() {
		@Pc(9) int local9 = Static93.anInt1786 * 128 + 64;
		@Pc(15) int local15 = Static231.anInt4532 * 128 + 64;
		@Pc(23) int local23 = Static16.method362(local9, local15, Static285.anInt5511) - Static273.anInt5338;
		if (Static164.anInt3419 >= 100) {
			Static221.anInt4363 = Static93.anInt1786 * 128 + 64;
			Static164.anInt3425 = Static231.anInt4532 * 128 + 64;
			Static194.anInt3958 = Static16.method362(Static221.anInt4363, Static164.anInt3425, Static285.anInt5511) - Static273.anInt5338;
		} else {
			if (Static221.anInt4363 < local9) {
				Static221.anInt4363 += (local9 - Static221.anInt4363) * Static164.anInt3419 / 1000 + Static337.anInt6414;
				if (Static221.anInt4363 > local9) {
					Static221.anInt4363 = local9;
				}
			}
			if (Static221.anInt4363 > local9) {
				Static221.anInt4363 -= Static337.anInt6414 + Static164.anInt3419 * (Static221.anInt4363 - local9) / 1000;
				if (local9 > Static221.anInt4363) {
					Static221.anInt4363 = local9;
				}
			}
			if (local23 > Static194.anInt3958) {
				Static194.anInt3958 += Static164.anInt3419 * (local23 - Static194.anInt3958) / 1000 + Static337.anInt6414;
				if (Static194.anInt3958 > local23) {
					Static194.anInt3958 = local23;
				}
			}
			if (local23 < Static194.anInt3958) {
				Static194.anInt3958 -= (Static194.anInt3958 - local23) * Static164.anInt3419 / 1000 + Static337.anInt6414;
				if (local23 > Static194.anInt3958) {
					Static194.anInt3958 = local23;
				}
			}
			if (local15 > Static164.anInt3425) {
				Static164.anInt3425 += Static337.anInt6414 + Static164.anInt3419 * (local15 - Static164.anInt3425) / 1000;
				if (local15 < Static164.anInt3425) {
					Static164.anInt3425 = local15;
				}
			}
			if (Static164.anInt3425 > local15) {
				Static164.anInt3425 -= Static337.anInt6414 + (Static164.anInt3425 - local15) * Static164.anInt3419 / 1000;
				if (local15 > Static164.anInt3425) {
					Static164.anInt3425 = local15;
				}
			}
		}
		local9 = Static105.anInt2155 * 128 + 64;
		local15 = Static132.anInt2569 * 128 + 64;
		local23 = Static16.method362(local9, local15, Static285.anInt5511) - Static8.anInt208;
		@Pc(221) int local221 = local9 - Static221.anInt4363;
		@Pc(226) int local226 = local23 - Static194.anInt3958;
		@Pc(230) int local230 = local15 - Static164.anInt3425;
		@Pc(242) int local242 = (int) Math.sqrt((double) (local221 * local221 + local230 * local230));
		@Pc(253) int local253 = (int) (Math.atan2((double) local226, (double) local242) * 2607.5945876176133D) & 0x3FFF;
		@Pc(264) int local264 = (int) (-2607.5945876176133D * Math.atan2((double) local221, (double) local230)) & 0x3FFF;
		if (local253 < 1024) {
			local253 = 1024;
		}
		if (local253 > 3072) {
			local253 = 3072;
		}
		if (local253 > Static107.anInt2183) {
			Static107.anInt2183 += Static17.anInt380 * (local253 - Static107.anInt2183 >> 3) / 1000 + Static147.anInt2898 << 3;
			if (local253 < Static107.anInt2183) {
				Static107.anInt2183 = local253;
			}
		}
		if (local253 < Static107.anInt2183) {
			Static107.anInt2183 -= Static147.anInt2898 + Static17.anInt380 * (Static107.anInt2183 - local253 >> 3) / 1000 << 3;
			if (local253 > Static107.anInt2183) {
				Static107.anInt2183 = local253;
			}
		}
		@Pc(338) int local338 = local264 - Static5.anInt99;
		if (local338 > 8192) {
			local338 -= 16384;
		}
		if (local338 < -8192) {
			local338 += 16384;
		}
		local338 >>= 0x3;
		if (local338 > 0) {
			Static5.anInt99 += Static147.anInt2898 + Static17.anInt380 * local338 / 1000 << 3;
			Static5.anInt99 &= 0x3FFF;
		}
		if (local338 < 0) {
			Static5.anInt99 -= -local338 * Static17.anInt380 / 1000 + Static147.anInt2898 << 3;
			Static5.anInt99 &= 0x3FFF;
		}
		@Pc(392) int local392 = local264 - Static5.anInt99;
		if (local392 > 8192) {
			local392 -= 16384;
		}
		if (local392 < -8192) {
			local392 += 16384;
		}
		if (local392 < 0 && local338 > 0 || local392 > 0 && local338 < 0) {
			Static5.anInt99 = local264;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3550(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
