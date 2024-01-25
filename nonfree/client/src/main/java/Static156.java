import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!gea", name = "Q", descriptor = "I")
	public static int anInt3411;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "Lclient!vc;")
	public static final Class301 aClass301_2 = new Class301();

	@OriginalMember(owner = "client!gea", name = "O", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!gea", name = "P", descriptor = "Lclient!h;")
	public static final Class125 aClass125_21 = new Class125(260);

	@OriginalMember(owner = "client!gea", name = "R", descriptor = "[I")
	public static final int[] anIntArray291 = new int[6];

	@OriginalMember(owner = "client!gea", name = "S", descriptor = "[S")
	public static final short[] aShortArray52 = new short[] { 46, 11, 6, 15, 20, 4, 17, 50 };

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)V")
	public static void method3071() {
		@Pc(9) int local9 = Static6.anInt95 * 128 + 64;
		@Pc(15) int local15 = Static180.anInt4075 * 128 + 64;
		@Pc(23) int local23 = Static443.method6717(local9, local15, Static56.anInt1418) - Static447.anInt8134;
		if (Static416.anInt9658 >= 100) {
			Static368.anInt6832 = Static6.anInt95 * 128 + 64;
			Static6.anInt93 = Static180.anInt4075 * 128 + 64;
			Static62.anInt1472 = Static443.method6717(Static368.anInt6832, Static6.anInt93, Static56.anInt1418) - Static447.anInt8134;
		} else {
			if (Static368.anInt6832 < local9) {
				Static368.anInt6832 += Static469.anInt8586 + (local9 - Static368.anInt6832) * Static416.anInt9658 / 1000;
				if (local9 < Static368.anInt6832) {
					Static368.anInt6832 = local9;
				}
			}
			if (Static62.anInt1472 < local23) {
				Static62.anInt1472 += Static416.anInt9658 * (local23 - Static62.anInt1472) / 1000 + Static469.anInt8586;
				if (Static62.anInt1472 > local23) {
					Static62.anInt1472 = local23;
				}
			}
			if (local9 < Static368.anInt6832) {
				Static368.anInt6832 -= Static469.anInt8586 + (Static368.anInt6832 - local9) * Static416.anInt9658 / 1000;
				if (Static368.anInt6832 < local9) {
					Static368.anInt6832 = local9;
				}
			}
			if (Static6.anInt93 < local15) {
				Static6.anInt93 += Static469.anInt8586 + Static416.anInt9658 * (local15 - Static6.anInt93) / 1000;
				if (Static6.anInt93 > local15) {
					Static6.anInt93 = local15;
				}
			}
			if (local23 < Static62.anInt1472) {
				Static62.anInt1472 -= Static416.anInt9658 * (Static62.anInt1472 - local23) / 1000 + Static469.anInt8586;
				if (Static62.anInt1472 < local23) {
					Static62.anInt1472 = local23;
				}
			}
			if (Static6.anInt93 > local15) {
				Static6.anInt93 -= (Static6.anInt93 - local15) * Static416.anInt9658 / 1000 + Static469.anInt8586;
				if (local15 > Static6.anInt93) {
					Static6.anInt93 = local15;
				}
			}
		}
		local15 = Static241.anInt9538 * 128 + 64;
		local9 = Static405.anInt7612 * 128 + 64;
		local23 = Static443.method6717(local9, local15, Static56.anInt1418) - Static540.anInt9594;
		@Pc(221) int local221 = local9 - Static368.anInt6832;
		@Pc(226) int local226 = local23 - Static62.anInt1472;
		@Pc(231) int local231 = local15 - Static6.anInt93;
		@Pc(242) int local242 = (int) Math.sqrt((double) (local231 * local231 + local221 * local221));
		@Pc(253) int local253 = (int) (Math.atan2((double) local226, (double) local242) * 2607.5945876176133D) & 0x3FFF;
		@Pc(264) int local264 = (int) (Math.atan2((double) local221, (double) local231) * -2607.5945876176133D) & 0x3FFF;
		if (local253 < 1024) {
			local253 = 1024;
		}
		if (local253 > 3072) {
			local253 = 3072;
		}
		if (Static519.anInt9341 < local253) {
			Static519.anInt9341 += Static84.anInt2025 * (local253 - Static519.anInt9341 >> 3) / 1000 + Static129.anInt9544 << 3;
			if (Static519.anInt9341 > local253) {
				Static519.anInt9341 = local253;
			}
		}
		if (local253 < Static519.anInt9341) {
			Static519.anInt9341 -= Static84.anInt2025 * (Static519.anInt9341 - local253 >> 3) / 1000 + Static129.anInt9544 << 3;
			if (Static519.anInt9341 < local253) {
				Static519.anInt9341 = local253;
			}
		}
		@Pc(345) int local345 = local264 - Static248.anInt5104;
		if (local345 > 8192) {
			local345 -= 16384;
		}
		if (local345 < -8192) {
			local345 += 16384;
		}
		local345 >>= 0x3;
		if (local345 > 0) {
			Static248.anInt5104 += local345 * Static84.anInt2025 / 1000 + Static129.anInt9544 << 3;
			Static248.anInt5104 &= 0x3FFF;
		}
		if (local345 < 0) {
			Static248.anInt5104 -= Static84.anInt2025 * -local345 / 1000 + Static129.anInt9544 << 3;
			Static248.anInt5104 &= 0x3FFF;
		}
		@Pc(406) int local406 = local264 - Static248.anInt5104;
		if (local406 > 8192) {
			local406 -= 16384;
		}
		if (local406 < -8192) {
			local406 += 16384;
		}
		if (local406 < 0 && local345 > 0 || local406 > 0 && local345 < 0) {
			Static248.anInt5104 = local264;
		}
		Static507.anInt9125 = 0;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method3073(@OriginalArg(0) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}
}
