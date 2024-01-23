import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Lclient!ph;")
	public static Class138 aClass138_92;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	public static int anInt5923;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	public static int anInt5920 = 0;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public static int anInt5926 = 127;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZILclient!nh;IBII)Lclient!in;")
	public static Class1_Sub1_Sub3 method4652(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = (arg1 << 19) + (arg4 << 17) + arg5 + (arg0 ? 65536 : 0);
		@Pc(37) long local37 = (long) arg3 * 3147483667L + (long) local22 * 3849834839L;
		@Pc(43) Class1_Sub1_Sub3 local43 = (Class1_Sub1_Sub3) Static47.aClass169_34.method4017(local37);
		if (local43 != null) {
			return local43;
		}
		Static18.aBoolean19 = false;
		local43 = Static114.method1827(arg4, arg3, false, arg5, arg1, false, arg2, arg0);
		if (local43 != null && !Static18.aBoolean19) {
			Static47.aClass169_34.method4016(local43, local37);
		}
		return local43;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public static void method4653() {
		Static278.anInterface2Array1 = null;
		Static153.method2507();
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public static void method4656() {
		@Pc(9) int local9 = Static123.anInt2494 * 128 + 64;
		@Pc(15) int local15 = Static23.anInt440 * 128 + 64;
		@Pc(23) int local23 = Static104.method1648(Static295.anInt5586, local9, local15) - Static238.anInt4828;
		if (Static290.anInt5495 >= 100) {
			Static105.anInt2016 = Static23.anInt440 * 128 + 64;
			Static243.anInt5653 = Static123.anInt2494 * 128 + 64;
			Static141.anInt2760 = Static104.method1648(Static295.anInt5586, Static243.anInt5653, Static105.anInt2016) - Static238.anInt4828;
		} else {
			if (local23 > Static141.anInt2760) {
				Static141.anInt2760 += Static290.anInt5495 * (local23 - Static141.anInt2760) / 1000 + Static223.anInt4332;
				if (local23 < Static141.anInt2760) {
					Static141.anInt2760 = local23;
				}
			}
			if (Static243.anInt5653 < local9) {
				Static243.anInt5653 += (local9 - Static243.anInt5653) * Static290.anInt5495 / 1000 + Static223.anInt4332;
				if (Static243.anInt5653 > local9) {
					Static243.anInt5653 = local9;
				}
			}
			if (Static243.anInt5653 > local9) {
				Static243.anInt5653 -= (Static243.anInt5653 - local9) * Static290.anInt5495 / 1000 + Static223.anInt4332;
				if (Static243.anInt5653 < local9) {
					Static243.anInt5653 = local9;
				}
			}
			if (Static105.anInt2016 < local15) {
				Static105.anInt2016 += Static223.anInt4332 + Static290.anInt5495 * (local15 - Static105.anInt2016) / 1000;
				if (Static105.anInt2016 > local15) {
					Static105.anInt2016 = local15;
				}
			}
			if (Static105.anInt2016 > local15) {
				Static105.anInt2016 -= Static223.anInt4332 + (Static105.anInt2016 - local15) * Static290.anInt5495 / 1000;
				if (Static105.anInt2016 < local15) {
					Static105.anInt2016 = local15;
				}
			}
			if (local23 < Static141.anInt2760) {
				Static141.anInt2760 -= Static290.anInt5495 * (Static141.anInt2760 - local23) / 1000 + Static223.anInt4332;
				if (Static141.anInt2760 < local23) {
					Static141.anInt2760 = local23;
				}
			}
		}
		local9 = Static106.anInt2119 * 128 + 64;
		local15 = Static206.anInt4065 * 128 + 64;
		local23 = Static104.method1648(Static295.anInt5586, local9, local15) - Static8.anInt140;
		@Pc(232) int local232 = local9 - Static243.anInt5653;
		@Pc(241) int local241 = local15 - Static105.anInt2016;
		@Pc(245) int local245 = local23 - Static141.anInt2760;
		@Pc(256) int local256 = (int) Math.sqrt((double) (local232 * local232 + local241 * local241));
		@Pc(267) int local267 = (int) (Math.atan2((double) local245, (double) local256) * 325.949D) & 0x7FF;
		if (local267 < 128) {
			local267 = 128;
		}
		if (local267 > 383) {
			local267 = 383;
		}
		@Pc(292) int local292 = (int) (-325.949D * Math.atan2((double) local232, (double) local241)) & 0x7FF;
		@Pc(297) int local297 = local292 - Static262.anInt2349;
		if (local297 > 1024) {
			local297 -= 2048;
		}
		if (local297 < -1024) {
			local297 += 2048;
		}
		if (local267 > Static140.anInt2757) {
			Static140.anInt2757 += Static69.anInt1366 * (local267 - Static140.anInt2757) / 1000 + Static281.anInt5364;
			if (local267 < Static140.anInt2757) {
				Static140.anInt2757 = local267;
			}
		}
		if (Static140.anInt2757 > local267) {
			Static140.anInt2757 -= (Static140.anInt2757 - local267) * Static69.anInt1366 / 1000 + Static281.anInt5364;
			if (local267 > Static140.anInt2757) {
				Static140.anInt2757 = local267;
			}
		}
		if (local297 > 0) {
			Static262.anInt2349 += Static69.anInt1366 * local297 / 1000 + Static281.anInt5364;
			Static262.anInt2349 &= 0x7FF;
		}
		if (local297 < 0) {
			Static262.anInt2349 -= Static281.anInt5364 + Static69.anInt1366 * -local297 / 1000;
			Static262.anInt2349 &= 0x7FF;
		}
		@Pc(410) int local410 = local292 - Static262.anInt2349;
		if (local410 > 1024) {
			local410 -= 2048;
		}
		if (local410 < -1024) {
			local410 += 2048;
		}
		if (local410 < 0 && local297 > 0 || local410 > 0 && local297 < 0) {
			Static262.anInt2349 = local292;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII)V")
	public static void method4657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg2; local3++) {
			Static109.method1795(arg4, Static51.anIntArrayArray1[local3], arg1, arg0);
		}
	}
}
