import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "Z")
	public static boolean aBoolean290;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	public static int anInt5427 = -1;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	public static int anInt5428 = 0;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	public static int anInt5430 = 1;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public static void method4255() {
		@Pc(9) int local9 = Static251.anInt5457 * 128 + 64;
		@Pc(15) int local15 = Static295.anInt3204 * 128 + 64;
		@Pc(27) int local27 = Static220.method3905(local9, local15, Static145.anInt3477) - Static20.anInt5569;
		if (Static243.anInt5324 < 100) {
			if (Static229.anInt5072 < local9) {
				Static229.anInt5072 += (local9 - Static229.anInt5072) * Static243.anInt5324 / 1000 + Static178.anInt4008;
				if (local9 < Static229.anInt5072) {
					Static229.anInt5072 = local9;
				}
			}
			if (local27 > Static48.anInt1350) {
				Static48.anInt1350 += Static178.anInt4008 + (local27 - Static48.anInt1350) * Static243.anInt5324 / 1000;
				if (local27 < Static48.anInt1350) {
					Static48.anInt1350 = local27;
				}
			}
			if (Static229.anInt5072 > local9) {
				Static229.anInt5072 -= (Static229.anInt5072 - local9) * Static243.anInt5324 / 1000 + Static178.anInt4008;
				if (Static229.anInt5072 < local9) {
					Static229.anInt5072 = local9;
				}
			}
			if (local15 > Static157.anInt3612) {
				Static157.anInt3612 += Static178.anInt4008 + (local15 - Static157.anInt3612) * Static243.anInt5324 / 1000;
				if (Static157.anInt3612 > local15) {
					Static157.anInt3612 = local15;
				}
			}
			if (Static157.anInt3612 > local15) {
				Static157.anInt3612 -= Static243.anInt5324 * (Static157.anInt3612 - local15) / 1000 + Static178.anInt4008;
				if (local15 > Static157.anInt3612) {
					Static157.anInt3612 = local15;
				}
			}
			if (Static48.anInt1350 > local27) {
				Static48.anInt1350 -= Static178.anInt4008 + (Static48.anInt1350 - local27) * Static243.anInt5324 / 1000;
				if (local27 > Static48.anInt1350) {
					Static48.anInt1350 = local27;
				}
			}
		} else {
			Static157.anInt3612 = Static295.anInt3204 * 128 + 64;
			Static229.anInt5072 = Static251.anInt5457 * 128 + 64;
			Static48.anInt1350 = Static220.method3905(Static229.anInt5072, Static157.anInt3612, Static145.anInt3477) - Static20.anInt5569;
		}
		local15 = Static158.anInt3653 * 128 + 64;
		local9 = Static180.anInt4076 * 128 + 64;
		local27 = Static220.method3905(local9, local15, Static145.anInt3477) - Static257.anInt5593;
		@Pc(221) int local221 = local9 - Static229.anInt5072;
		@Pc(226) int local226 = local27 - Static48.anInt1350;
		@Pc(231) int local231 = local15 - Static157.anInt3612;
		@Pc(242) int local242 = (int) Math.sqrt((double) (local231 * local231 + local221 * local221));
		@Pc(253) int local253 = (int) (Math.atan2((double) local226, (double) local242) * 325.949D) & 0x7FF;
		if (local253 < 128) {
			local253 = 128;
		}
		@Pc(270) int local270 = (int) (Math.atan2((double) local221, (double) local231) * -325.949D) & 0x7FF;
		@Pc(275) int local275 = local270 - Static97.anInt6055;
		if (local275 > 1024) {
			local275 -= 2048;
		}
		if (local253 > 383) {
			local253 = 383;
		}
		if (Static38.anInt1151 < local253) {
			Static38.anInt1151 += Static254.anInt5407 * (local253 - Static38.anInt1151) / 1000 + Static289.anInt6096;
			if (Static38.anInt1151 > local253) {
				Static38.anInt1151 = local253;
			}
		}
		if (local275 < -1024) {
			local275 += 2048;
		}
		if (local275 > 0) {
			Static97.anInt6055 += Static254.anInt5407 * local275 / 1000 + Static289.anInt6096;
			Static97.anInt6055 &= 0x7FF;
		}
		if (local275 < 0) {
			Static97.anInt6055 -= Static254.anInt5407 * -local275 / 1000 + Static289.anInt6096;
			Static97.anInt6055 &= 0x7FF;
		}
		@Pc(365) int local365 = local270 - Static97.anInt6055;
		if (local365 > 1024) {
			local365 -= 2048;
		}
		if (local365 < -1024) {
			local365 += 2048;
		}
		if (local365 < 0 && local275 > 0 || local365 > 0 && local275 < 0) {
			Static97.anInt6055 = local270;
		}
		if (Static38.anInt1151 > local253) {
			Static38.anInt1151 -= (Static38.anInt1151 - local253) * Static254.anInt5407 / 1000 + Static289.anInt6096;
			if (local253 > Static38.anInt1151) {
				Static38.anInt1151 = local253;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)Z")
	public static boolean method4256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static264.method4486(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static79.method1420(local10 + 1, Static287.anIntArrayArrayArray18[arg0][arg1][arg2] + arg3, local14 + 1) && Static79.method1420(local10 + 128 - 1, Static287.anIntArrayArrayArray18[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static79.method1420(local10 + 128 - 1, Static287.anIntArrayArrayArray18[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static79.method1420(local10 + 1, Static287.anIntArrayArrayArray18[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
