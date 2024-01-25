import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
	public static int anInt971;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "Lclient!us;")
	public static final Class234 aClass234_21 = new Class234(95, 4);

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_7 = new Class138();

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
	public static final int[] anIntArray89 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Z")
	public static boolean aBoolean45 = true;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "[I")
	public static final int[] anIntArray90 = new int[32];

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_21 = new Class57(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method862(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static351.anInt3266; local11++) {
			if (arg0.equalsIgnoreCase(Static244.aStringArray28[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static226.aClass28_Sub1_Sub1_Sub2_2.aString51);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public static void method863() {
		@Pc(9) int local9 = Static37.anInt658 * 128 + 64;
		@Pc(15) int local15 = Static258.anInt4650 * 128 + 64;
		@Pc(24) int local24 = Static55.method1005(local15, Static363.anInt6170, local9) - anInt971;
		if (Static157.anInt2809 >= 100) {
			Static206.anInt3639 = Static37.anInt658 * 128 + 64;
			Static339.anInt5726 = Static258.anInt4650 * 128 + 64;
			Static243.anInt4289 = Static55.method1005(Static339.anInt5726, Static363.anInt6170, Static206.anInt3639) - anInt971;
		} else {
			if (local9 > Static206.anInt3639) {
				Static206.anInt3639 += Static216.anInt6071 + Static157.anInt2809 * (local9 - Static206.anInt3639) / 1000;
				if (local9 < Static206.anInt3639) {
					Static206.anInt3639 = local9;
				}
			}
			if (local24 > Static243.anInt4289) {
				Static243.anInt4289 += Static216.anInt6071 + (local24 - Static243.anInt4289) * Static157.anInt2809 / 1000;
				if (Static243.anInt4289 > local24) {
					Static243.anInt4289 = local24;
				}
			}
			if (local9 < Static206.anInt3639) {
				Static206.anInt3639 -= Static157.anInt2809 * (Static206.anInt3639 - local9) / 1000 + Static216.anInt6071;
				if (Static206.anInt3639 < local9) {
					Static206.anInt3639 = local9;
				}
			}
			if (Static339.anInt5726 < local15) {
				Static339.anInt5726 += (local15 - Static339.anInt5726) * Static157.anInt2809 / 1000 + Static216.anInt6071;
				if (local15 < Static339.anInt5726) {
					Static339.anInt5726 = local15;
				}
			}
			if (local24 < Static243.anInt4289) {
				Static243.anInt4289 -= Static216.anInt6071 + Static157.anInt2809 * (Static243.anInt4289 - local24) / 1000;
				if (Static243.anInt4289 < local24) {
					Static243.anInt4289 = local24;
				}
			}
			if (local15 < Static339.anInt5726) {
				Static339.anInt5726 -= (Static339.anInt5726 - local15) * Static157.anInt2809 / 1000 + Static216.anInt6071;
				if (Static339.anInt5726 < local15) {
					Static339.anInt5726 = local15;
				}
			}
		}
		local15 = Static241.anInt4238 * 128 + 64;
		local9 = Static210.anInt3709 * 128 + 64;
		local24 = Static55.method1005(local15, Static363.anInt6170, local9) - Static51.anInt1084;
		@Pc(224) int local224 = local9 - Static206.anInt3639;
		@Pc(229) int local229 = local24 - Static243.anInt4289;
		@Pc(234) int local234 = local15 - Static339.anInt5726;
		@Pc(250) int local250 = (int) Math.sqrt((double) (local234 * local234 + local224 * local224));
		@Pc(261) int local261 = (int) (Math.atan2((double) local229, (double) local250) * 2607.5945876176133D) & 0x3FFF;
		@Pc(272) int local272 = (int) (-2607.5945876176133D * Math.atan2((double) local224, (double) local234)) & 0x3FFF;
		if (local261 < 1024) {
			local261 = 1024;
		}
		if (local261 > 3072) {
			local261 = 3072;
		}
		if (Static327.anInt5556 < local261) {
			Static327.anInt5556 += Static81.anInt1661 + (local261 - Static327.anInt5556 >> 3) * Static200.anInt3586 / 1000 << 3;
			if (Static327.anInt5556 > local261) {
				Static327.anInt5556 = local261;
			}
		}
		if (Static327.anInt5556 > local261) {
			Static327.anInt5556 -= (Static327.anInt5556 - local261 >> 3) * Static200.anInt3586 / 1000 + Static81.anInt1661 << 3;
			if (local261 > Static327.anInt5556) {
				Static327.anInt5556 = local261;
			}
		}
		@Pc(350) int local350 = local272 - Static145.anInt2716;
		if (local350 > 8192) {
			local350 -= 16384;
		}
		if (local350 < -8192) {
			local350 += 16384;
		}
		local350 >>= 0x3;
		if (local350 > 0) {
			Static145.anInt2716 += Static200.anInt3586 * local350 / 1000 + Static81.anInt1661 << 3;
			Static145.anInt2716 &= 0x3FFF;
		}
		if (local350 < 0) {
			Static145.anInt2716 -= -local350 * Static200.anInt3586 / 1000 + Static81.anInt1661 << 3;
			Static145.anInt2716 &= 0x3FFF;
		}
		@Pc(412) int local412 = local272 - Static145.anInt2716;
		if (local412 > 8192) {
			local412 -= 16384;
		}
		if (local412 < -8192) {
			local412 += 16384;
		}
		Static331.anInt5600 = 0;
		if (local412 < 0 && local350 > 0 || local412 > 0 && local350 < 0) {
			Static145.anInt2716 = local272;
		}
	}
}
