import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
	public static int anInt8417;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
	public static int anInt8419;

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "Z")
	public static boolean aBoolean649 = false;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZLclient!es;)Ljava/lang/String;")
	public static String method7283(@OriginalArg(2) Class4_Sub11 arg0) {
		try {
			@Pc(7) int local7 = arg0.method8823();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt10466 += Static678.aClass165_1.method3672(arg0.anInt10466, 0, local7, arg0.aByteArray107, local19);
			return Static407.method2208(local19, 0, local7);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public static void method7284() {
		@Pc(9) int local9 = Static537.anInt8321 * 512 + 256;
		@Pc(15) int local15 = Static414.anInt5950 * 512 + 256;
		@Pc(24) int local24 = Static674.method8951(Static296.anInt4684, local15, local9) - Static460.anInt7364;
		if (Static169.anInt3014 < 100) {
			if (local9 > Static611.anInt9382) {
				Static611.anInt9382 += Static169.anInt3014 * (local9 - Static611.anInt9382) / 1000 + Static578.anInt8920;
				if (local9 < Static611.anInt9382) {
					Static611.anInt9382 = local9;
				}
			}
			if (Static611.anInt9382 > local9) {
				Static611.anInt9382 -= Static169.anInt3014 * (Static611.anInt9382 - local9) / 1000 + Static578.anInt8920;
				if (Static611.anInt9382 < local9) {
					Static611.anInt9382 = local9;
				}
			}
			if (Static618.anInt9710 < local24) {
				Static618.anInt9710 += Static578.anInt8920 + Static169.anInt3014 * (local24 - Static618.anInt9710) / 1000;
				if (local24 < Static618.anInt9710) {
					Static618.anInt9710 = local24;
				}
			}
			if (Static618.anInt9710 > local24) {
				Static618.anInt9710 -= Static578.anInt8920 + Static169.anInt3014 * (Static618.anInt9710 - local24) / 1000;
				if (Static618.anInt9710 < local24) {
					Static618.anInt9710 = local24;
				}
			}
			if (local15 > Static652.anInt10283) {
				Static652.anInt10283 += Static578.anInt8920 + (local15 - Static652.anInt10283) * Static169.anInt3014 / 1000;
				if (local15 < Static652.anInt10283) {
					Static652.anInt10283 = local15;
				}
			}
			if (Static652.anInt10283 > local15) {
				Static652.anInt10283 -= Static578.anInt8920 + (Static652.anInt10283 - local15) * Static169.anInt3014 / 1000;
				if (local15 > Static652.anInt10283) {
					Static652.anInt10283 = local15;
				}
			}
		} else {
			Static652.anInt10283 = Static414.anInt5950 * 512 + 256;
			Static611.anInt9382 = Static537.anInt8321 * 512 + 256;
			Static618.anInt9710 = Static674.method8951(Static296.anInt4684, Static652.anInt10283, Static611.anInt9382) - Static460.anInt7364;
		}
		local9 = Static260.anInt8169 * 512 + 256;
		local15 = Static402.anInt5849 * 512 + 256;
		local24 = Static674.method8951(Static296.anInt4684, local15, local9) - Static58.anInt1276;
		@Pc(229) int local229 = local9 - Static611.anInt9382;
		@Pc(238) int local238 = local24 - Static618.anInt9710;
		@Pc(243) int local243 = local15 - Static652.anInt10283;
		@Pc(254) int local254 = (int) Math.sqrt((double) (local243 * local243 + local229 * local229));
		@Pc(265) int local265 = (int) (Math.atan2((double) local238, (double) local254) * 2607.5945876176133D) & 0x3FFF;
		if (local265 < 1024) {
			local265 = 1024;
		}
		@Pc(281) int local281 = (int) (Math.atan2((double) local229, (double) local243) * -2607.5945876176133D) & 0x3FFF;
		if (local265 > 3072) {
			local265 = 3072;
		}
		if (local265 > Static383.anInt9871) {
			Static383.anInt9871 += Static55.anInt1260 + (local265 - Static383.anInt9871 >> 3) * Static608.anInt9348 / 1000 << 3;
			if (local265 < Static383.anInt9871) {
				Static383.anInt9871 = local265;
			}
		}
		if (Static383.anInt9871 > local265) {
			Static383.anInt9871 -= Static608.anInt9348 * (Static383.anInt9871 - local265 >> 3) / 1000 + Static55.anInt1260 << 3;
			if (local265 > Static383.anInt9871) {
				Static383.anInt9871 = local265;
			}
		}
		@Pc(341) int local341 = local281 - Static226.anInt3586;
		if (local341 > 8192) {
			local341 -= 16384;
		}
		if (local341 < -8192) {
			local341 += 16384;
		}
		local341 >>= 0x3;
		if (local341 > 0) {
			Static226.anInt3586 += Static55.anInt1260 + local341 * Static608.anInt9348 / 1000 << 3;
			Static226.anInt3586 &= 0x3FFF;
		}
		if (local341 < 0) {
			Static226.anInt3586 -= Static55.anInt1260 + Static608.anInt9348 * -local341 / 1000 << 3;
			Static226.anInt3586 &= 0x3FFF;
		}
		@Pc(404) int local404 = local281 - Static226.anInt3586;
		if (local404 > 8192) {
			local404 -= 16384;
		}
		if (local404 < -8192) {
			local404 += 16384;
		}
		Static571.anInt8879 = 0;
		if (local404 < 0 && local341 > 0 || local404 > 0 && local341 < 0) {
			Static226.anInt3586 = local281;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!oba;I)Z")
	public static boolean method7285(@OriginalArg(0) Class261 arg0) {
		return arg0 == null ? false : Static164.method2786(arg0.anInt6718 - arg0.anInt6705, -arg0.anInt6714 + arg0.anInt6707, arg0.anInt6716, arg0.anInt6708 - arg0.anInt6716, arg0.anInt6714, arg0.anInt6705);
	}
}
