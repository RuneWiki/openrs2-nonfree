import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_96 = new Class266(14, 0, 4, 1);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIB)I")
	public static int method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public static void method4109() {
		@Pc(9) int local9 = Static111.anInt2407 * 128 + 64;
		@Pc(15) int local15 = Static372.anInt6454 * 128 + 64;
		@Pc(24) int local24 = Static21.method356(local9, local15, Static59.anInt1472) - Static5.anInt65;
		if (Static335.anInt5944 < 100) {
			if (local9 > Static235.anInt4645) {
				Static235.anInt4645 += Static335.anInt5944 * (local9 - Static235.anInt4645) / 1000 + Static54.anInt1312;
				if (local9 < Static235.anInt4645) {
					Static235.anInt4645 = local9;
				}
			}
			if (local9 < Static235.anInt4645) {
				Static235.anInt4645 -= Static335.anInt5944 * (Static235.anInt4645 - local9) / 1000 + Static54.anInt1312;
				if (local9 > Static235.anInt4645) {
					Static235.anInt4645 = local9;
				}
			}
			if (local24 > Static405.anInt7103) {
				Static405.anInt7103 += (local24 - Static405.anInt7103) * Static335.anInt5944 / 1000 + Static54.anInt1312;
				if (local24 < Static405.anInt7103) {
					Static405.anInt7103 = local24;
				}
			}
			if (local15 > Static108.anInt2350) {
				Static108.anInt2350 += Static335.anInt5944 * (local15 - Static108.anInt2350) / 1000 + Static54.anInt1312;
				if (Static108.anInt2350 > local15) {
					Static108.anInt2350 = local15;
				}
			}
			if (Static405.anInt7103 > local24) {
				Static405.anInt7103 -= Static335.anInt5944 * (Static405.anInt7103 - local24) / 1000 + Static54.anInt1312;
				if (Static405.anInt7103 < local24) {
					Static405.anInt7103 = local24;
				}
			}
			if (local15 < Static108.anInt2350) {
				Static108.anInt2350 -= (Static108.anInt2350 - local15) * Static335.anInt5944 / 1000 + Static54.anInt1312;
				if (local15 > Static108.anInt2350) {
					Static108.anInt2350 = local15;
				}
			}
		} else {
			Static235.anInt4645 = Static111.anInt2407 * 128 + 64;
			Static108.anInt2350 = Static372.anInt6454 * 128 + 64;
			Static405.anInt7103 = Static21.method356(Static235.anInt4645, Static108.anInt2350, Static59.anInt1472) - Static5.anInt65;
		}
		local15 = Static285.anInt5311 * 128 + 64;
		local9 = Static242.anInt4727 * 128 + 64;
		local24 = Static21.method356(local9, local15, Static59.anInt1472) - Static136.anInt2817;
		@Pc(229) int local229 = local9 - Static235.anInt4645;
		@Pc(234) int local234 = local24 - Static405.anInt7103;
		@Pc(238) int local238 = local15 - Static108.anInt2350;
		@Pc(249) int local249 = (int) Math.sqrt((double) (local238 * local238 + local229 * local229));
		@Pc(260) int local260 = (int) (Math.atan2((double) local234, (double) local249) * 2607.5945876176133D) & 0x3FFF;
		if (local260 < 1024) {
			local260 = 1024;
		}
		@Pc(276) int local276 = (int) (Math.atan2((double) local229, (double) local238) * -2607.5945876176133D) & 0x3FFF;
		if (local260 > 3072) {
			local260 = 3072;
		}
		if (Static439.anInt7477 < local260) {
			Static439.anInt7477 += Static412.anInt7174 + Static67.anInt1637 * (local260 - Static439.anInt7477 >> 3) / 1000 << 3;
			if (local260 < Static439.anInt7477) {
				Static439.anInt7477 = local260;
			}
		}
		if (local260 < Static439.anInt7477) {
			Static439.anInt7477 -= Static67.anInt1637 * (Static439.anInt7477 - local260 >> 3) / 1000 + Static412.anInt7174 << 3;
			if (local260 > Static439.anInt7477) {
				Static439.anInt7477 = local260;
			}
		}
		@Pc(340) int local340 = local276 - Static200.anInt3936;
		if (local340 > 8192) {
			local340 -= 16384;
		}
		if (local340 < -8192) {
			local340 += 16384;
		}
		local340 >>= 0x3;
		if (local340 > 0) {
			Static200.anInt3936 += Static412.anInt7174 + local340 * Static67.anInt1637 / 1000 << 3;
			Static200.anInt3936 &= 0x3FFF;
		}
		if (local340 < 0) {
			Static200.anInt3936 -= Static67.anInt1637 * -local340 / 1000 + Static412.anInt7174 << 3;
			Static200.anInt3936 &= 0x3FFF;
		}
		@Pc(401) int local401 = local276 - Static200.anInt3936;
		if (local401 > 8192) {
			local401 -= 16384;
		}
		if (local401 < -8192) {
			local401 += 16384;
		}
		Static246.anInt4786 = 0;
		if (local401 < 0 && local340 > 0 || local401 > 0 && local340 < 0) {
			Static200.anInt3936 = local276;
		}
	}
}
