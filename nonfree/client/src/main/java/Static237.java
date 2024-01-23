import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!sc", name = "Cc", descriptor = "I")
	public static int anInt4708;

	@OriginalMember(owner = "client!sc", name = "Dc", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!sc", name = "Hc", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!sc", name = "Fc", descriptor = "I")
	public static int anInt4710 = 0;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(II)V")
	public static void method3660(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Static69.anInt1504;
		@Pc(7) int local7 = Static297.anInt5618;
		@Pc(9) int local9 = Static239.anInt4738;
		@Pc(11) int local11 = Static134.anInt2950;
		@Pc(13) int local13 = Static91.anInt2040;
		@Pc(16) int local16 = (int) Static125.aFloat20;
		if (local16 < Static196.anInt2438 / 256) {
			local16 = Static196.anInt2438 / 256;
		}
		@Pc(32) int local32 = (int) Static298.aFloat58 + Static118.anInt2738 & 0x7FF;
		if (Static71.aBooleanArray16[4] && local16 < Static181.anIntArray339[4] + 128) {
			local16 = Static181.anIntArray339[4] + 128;
		}
		Static268.method4064(local32, local16, arg0, local16 * 3 + 600, Static92.anInt2083, Static20.method383(Static197.aClass14_Sub2_Sub1_2.anInt4630, Static140.anInt3034, Static197.aClass14_Sub2_Sub1_2.anInt4680) - 50, Static114.anInt2610);
		if (local5 == Static69.anInt1504 && Static297.anInt5618 == local7 && Static239.anInt4738 == local9 && Static134.anInt2950 == local11 && local13 == Static91.anInt2040) {
			Static220.anInt4376 = 1;
			return;
		}
		Static186.anInt3847 = 10;
		Static5.anInt179 = 10;
		@Pc(107) int local107 = Static91.anInt2040 - local13;
		if (local107 > 1024) {
			local107 -= 2048;
		}
		Static57.anInt1261 = 10;
		Static238.anInt3833 = 10;
		if (local7 < Static297.anInt5618) {
			local7 += (Static297.anInt5618 - local7) * Static238.anInt3833 / 1000 + Static5.anInt179;
			if (Static297.anInt5618 > local7) {
				Static297.anInt5618 = local7;
			}
		}
		if (Static297.anInt5618 < local7) {
			local7 -= Static5.anInt179 + (local7 - Static297.anInt5618) * Static238.anInt3833 / 1000;
			if (Static297.anInt5618 < local7) {
				Static297.anInt5618 = local7;
			}
		}
		if (local5 < Static69.anInt1504) {
			local5 += Static238.anInt3833 * (Static69.anInt1504 - local5) / 1000 + Static5.anInt179;
			if (Static69.anInt1504 > local5) {
				Static69.anInt1504 = local5;
			}
		}
		if (local107 < -1024) {
			local107 += 2048;
		}
		if (Static134.anInt2950 > local11) {
			local11 += Static186.anInt3847 + (Static134.anInt2950 - local11) * Static57.anInt1261 / 1000;
			if (Static134.anInt2950 > local11) {
				Static134.anInt2950 = local11;
			}
		}
		if (local107 > 0) {
			local13 += local107 * Static57.anInt1261 / 1000 + Static186.anInt3847;
			local13 &= 0x7FF;
		}
		if (local5 > Static69.anInt1504) {
			local5 -= (local5 - Static69.anInt1504) * Static238.anInt3833 / 1000 + Static5.anInt179;
			if (Static69.anInt1504 < local5) {
				Static69.anInt1504 = local5;
			}
		}
		if (Static134.anInt2950 < local11) {
			local11 -= Static186.anInt3847 + (local11 - Static134.anInt2950) * Static57.anInt1261 / 1000;
			if (local11 > Static134.anInt2950) {
				Static134.anInt2950 = local11;
			}
		}
		if (Static239.anInt4738 > local9) {
			local9 += (Static239.anInt4738 - local9) * Static238.anInt3833 / 1000 + Static5.anInt179;
			if (Static239.anInt4738 > local9) {
				Static239.anInt4738 = local9;
			}
		}
		if (local107 < 0) {
			local13 -= Static186.anInt3847 + Static57.anInt1261 * -local107 / 1000;
			local13 &= 0x7FF;
		}
		@Pc(362) int local362 = Static91.anInt2040 - local13;
		if (local362 > 1024) {
			local362 -= 2048;
		}
		if (local9 > Static239.anInt4738) {
			local9 -= (local9 - Static239.anInt4738) * Static238.anInt3833 / 1000 + Static5.anInt179;
			if (Static239.anInt4738 < local9) {
				Static239.anInt4738 = local9;
			}
		}
		if (local362 < -1024) {
			local362 += 2048;
		}
		if (local362 >= 0 || local107 <= 0 || local362 > 0 && local107 < 0) {
			Static91.anInt2040 = local13;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIZI)V")
	public static void method3662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg4 - arg3;
		@Pc(10) int local10 = arg0 - arg2;
		if (local6 == 0) {
			if (local10 != 0) {
				Static95.method1753(arg2, arg1, arg3, arg0);
			}
		} else if (local10 == 0) {
			Static211.method3349(arg3, arg1, arg2, arg4);
		} else {
			if (local6 < 0) {
				local6 = -local6;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(59) boolean local59 = local10 > local6;
			@Pc(63) int local63;
			@Pc(65) int local65;
			if (local59) {
				local63 = arg3;
				local65 = arg4;
				arg4 = arg0;
				arg0 = local65;
				arg3 = arg2;
				arg2 = local63;
			}
			if (arg3 > arg4) {
				local65 = arg2;
				arg2 = arg0;
				local63 = arg3;
				arg3 = arg4;
				arg4 = local63;
				arg0 = local65;
			}
			local65 = arg4 - arg3;
			local63 = arg2;
			@Pc(108) int local108 = arg0 - arg2;
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(125) int local125 = arg2 < arg0 ? 1 : -1;
			@Pc(130) int local130 = -(local65 >> 1);
			@Pc(134) int local134;
			if (local59) {
				for (local134 = arg3; local134 <= arg4; local134++) {
					Static22.anIntArrayArray3[local134][local63] = arg1;
					local130 += local108;
					if (local130 > 0) {
						local63 += local125;
						local130 -= local65;
					}
				}
			} else {
				for (local134 = arg3; local134 <= arg4; local134++) {
					local130 += local108;
					Static22.anIntArrayArray3[local63][local134] = arg1;
					if (local130 > 0) {
						local63 += local125;
						local130 -= local65;
					}
				}
			}
		}
	}
}
