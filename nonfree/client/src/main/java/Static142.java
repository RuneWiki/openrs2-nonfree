import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	public static final int anInt2830 = 2301979;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1365 = Static187.method3089("Connection timed out)3");

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "[J")
	public static final long[] aLongArray8 = new long[500];

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1366 = aClass92_1365;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLclient!ba;)I")
	public static int method2098(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		if (arg1.anIntArrayArray5 == null || arg1.anIntArrayArray5.length <= arg0) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg1.anIntArrayArray5[arg0];
			@Pc(26) byte local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(36) int local36 = 0;
			while (true) {
				@Pc(38) int local38 = 0;
				@Pc(43) int local43 = local24[local36++];
				@Pc(45) byte local45 = 0;
				if (local43 == 0) {
					return local28;
				}
				if (local43 == 15) {
					local45 = 1;
				}
				if (local43 == 1) {
					local38 = Static38.anIntArray79[local24[local36++]];
				}
				if (local43 == 16) {
					local45 = 2;
				}
				if (local43 == 17) {
					local45 = 3;
				}
				if (local43 == 2) {
					local38 = Static21.anIntArray47[local24[local36++]];
				}
				if (local43 == 3) {
					local38 = Static96.anIntArray165[local24[local36++]];
				}
				@Pc(117) int local117;
				@Pc(128) Class11 local128;
				@Pc(133) int local133;
				@Pc(145) int local145;
				if (local43 == 4) {
					local117 = local24[local36++] << 16;
					@Pc(124) int local124 = local117 + local24[local36++];
					local128 = Static9.method2342(local124);
					local133 = local24[local36++];
					if (local133 != -1 && (!Static102.method1549(local133).aBoolean219 || Static181.aBoolean221)) {
						for (local145 = 0; local145 < local128.anIntArray29.length; local145++) {
							if (local128.anIntArray29[local145] == local133 + 1) {
								local38 += local128.anIntArray24[local145];
							}
						}
					}
				}
				if (local43 == 5) {
					local38 = Static84.anIntArray156[local24[local36++]];
				}
				if (local43 == 6) {
					local38 = Class1_Sub3_Sub8.anIntArray132[Static21.anIntArray47[local24[local36++]] - 1];
				}
				if (local43 == 7) {
					local38 = Static84.anIntArray156[local24[local36++]] * 100 / 46875;
				}
				if (local43 == 8) {
					local38 = Static15.aClass8_Sub3_Sub1_1.anInt975;
				}
				if (local43 == 9) {
					for (local117 = 0; local117 < 25; local117++) {
						if (Static94.aBooleanArray6[local117]) {
							local38 += Static21.anIntArray47[local117];
						}
					}
				}
				if (local43 == 10) {
					local117 = local24[local36++] << 16;
					local117 += local24[local36++];
					local128 = Static9.method2342(local117);
					local133 = local24[local36++];
					if (local133 != -1 && (!Static102.method1549(local133).aBoolean219 || Static181.aBoolean221)) {
						for (local145 = 0; local145 < local128.anIntArray29.length; local145++) {
							if (local128.anIntArray29[local145] == local133 + 1) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local43 == 11) {
					local38 = Static129.anInt2672;
				}
				if (local43 == 12) {
					local38 = Static42.anInt1096;
				}
				if (local43 == 13) {
					local117 = Static84.anIntArray156[local24[local36++]];
					@Pc(332) int local332 = local24[local36++];
					local38 = (0x1 << local332 & local117) == 0 ? 0 : 1;
				}
				if (local43 == 14) {
					local117 = local24[local36++];
					local38 = Static83.method1267(local117);
				}
				if (local43 == 18) {
					local38 = (Static15.aClass8_Sub3_Sub1_1.anInt3600 >> 7) + Static100.anInt2141;
				}
				if (local43 == 19) {
					local38 = (Static15.aClass8_Sub3_Sub1_1.anInt3606 >> 7) + Static138.anInt2800;
				}
				if (local43 == 20) {
					local38 = local24[local36++];
				}
				if (local45 == 0) {
					if (local26 == 0) {
						local28 += local38;
					}
					if (local26 == 1) {
						local28 -= local38;
					}
					if (local26 == 2 && local38 != 0) {
						local28 /= local38;
					}
					if (local26 == 3) {
						local28 *= local38;
					}
					local26 = 0;
				} else {
					local26 = local45;
				}
			}
		} catch (@Pc(425) Exception local425) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!vd;)V")
	public static void method2099(@OriginalArg(1) Class92 arg0) {
		if (Static169.aClass24_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) Class92 local13 = Static101.aClass92_971.method3203(Static169.aClass24_4.anApplet1);
			@Pc(19) Class92 local19 = Static19.aClass92_206.method3203(Static169.aClass24_4.anApplet1);
			@Pc(44) Class92 local44 = Static208.method787(new Class92[] { local13, Static107.aClass92_1030, arg0, Static23.aClass92_238, local19 });
			if (arg0.method3233() == 0) {
				local44 = Static208.method787(new Class92[] { local44, Static97.aClass92_918 });
			} else {
				local44 = Static208.method787(new Class92[] { local44, Static19.aClass92_214, Static199.method3293(Static124.method1828() + 94608000000L), Static49.aClass92_530, Static202.method3343(94608000L) });
			}
			Static208.method787(new Class92[] { Static88.aClass92_808, local44, Static47.aClass92_501 }).method3244(Static169.aClass24_4.anApplet1);
		} catch (@Pc(117) Throwable local117) {
		}
	}
}
