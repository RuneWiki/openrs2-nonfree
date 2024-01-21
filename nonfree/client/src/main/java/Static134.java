import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public static int anInt2973;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] aClass1_Sub2_Sub8_Sub3Array15;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public static int anInt2982;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	public static int anInt2974 = -1;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_899 = Static81.method1507("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!dj;")
	public static Class24 aClass24_900 = aClass24_899;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_901 = Static81.method1507("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method2285(@OriginalArg(1) int arg0) {
		if (Static91.anInt2111 == 0) {
			Static107.aClass1_Sub3_Sub4_1.method2872(arg0);
		} else {
			Static16.anInt377 = arg0;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I")
	public static int method2286(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBII)V")
	public static void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static135.anInt2989 < 100) {
			Static208.method3519();
		}
		Static90.method3501(arg1, arg2, arg0 + arg1, arg3 + arg2);
		Static182.method3156();
		Static90.method3482(arg1, arg2, arg0, arg3, 0);
		@Pc(35) int local35;
		@Pc(49) int local49;
		if (Static135.anInt2989 < 100) {
			local35 = arg0 / 2 + arg1;
			local49 = arg2 + arg3 / 2 - 18 - 20;
			Static90.method3490(local35 - 152, local49, 304, 34, 9179409);
			Static90.method3490(local35 - 151, local49 + 1, 302, 32, 0);
			Static90.method3482(local35 - 150, local49 + 2, Static135.anInt2989 * 3, 30, 9179409);
			Static90.method3482(local35 + Static135.anInt2989 * 3 - 150, local49 - -2, 300 - Static135.anInt2989 * 3, 30, 0);
			Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1246(Static131.aClass24_881, local35, local49 + 20, 16777215, -1);
			return;
		}
		Static210.anInt4653 = (int) ((double) (arg0 * 2) / Static178.aDouble11);
		Static40.anInt1062 = Static3.anInt118 - (int) ((double) arg3 / Static178.aDouble11);
		Static132.anInt2942 = Static2.anInt111 - (int) ((double) arg0 / Static178.aDouble11);
		@Pc(143) int local143 = Static2.anInt111 - (int) ((double) arg0 / Static178.aDouble11);
		Static175.anInt3909 = (int) ((double) (arg3 * 2) / Static178.aDouble11);
		local35 = Static3.anInt118 - (int) ((double) arg3 / Static178.aDouble11);
		local49 = (int) ((double) arg0 / Static178.aDouble11) + Static2.anInt111;
		@Pc(181) int local181 = (int) ((double) arg3 / Static178.aDouble11) + Static3.anInt118;
		Static49.method904(arg2, arg1 + arg0, local35, local49, local181, local143, arg3 + arg2, arg1);
		Static150.method2582(local143, local49, arg1 + arg0, arg3 + arg2, arg2, arg1, local35, local181);
		if (Static70.anInt3206 > 0) {
			Static70.anInt3206--;
		}
		if (!Static43.aBoolean61) {
			return;
		}
		@Pc(227) int local227 = arg1 + arg0 - 5;
		@Pc(233) int local233 = arg3 + arg2 - 8;
		Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2.method1271(Static63.method1281(new Class24[] { Static108.aClass24_727, Static175.method3020(Static194.anInt4323) }), local227, local233, 16776960, -1);
		@Pc(256) int local256 = local233 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 32768 && Static30.aBoolean35) {
			local270 = 16711680;
		}
		if (local268 > 65536 && !Static30.aBoolean35) {
			local270 = 16711680;
		}
		Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2.method1271(Static63.method1281(new Class24[] { Static59.aClass24_392, Static175.method3020(local268), Static73.aClass24_541 }), local227, local256, local270, -1);
		local233 = local256 - 15;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
	public static void method2289() {
		@Pc(3) int local3 = Static19.anIntArray40[Static77.anInt1820];
		@Pc(7) Class61[] local7 = Static19.aClass61ArrayArray1[Static77.anInt1820];
		Static166.anInt3693 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class61 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt2605 == 1) {
				local27 = local16.anInt2601 + Static54.anInt3872 - Static137.anInt3098;
				if (local27 >= 0 && local27 <= Static54.anInt3872 + Static54.anInt3872) {
					local42 = local16.anInt2588 + Static54.anInt3872 - Static89.anInt2074;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2598 + Static54.anInt3872 - Static89.anInt2074;
					if (local53 > Static54.anInt3872 + Static54.anInt3872) {
						local53 = Static54.anInt3872 + Static54.anInt3872;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static142.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static167.anInt3703 - local16.anInt2597;
						if (local85 > 32) {
							local16.anInt2587 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2587 = 2;
							local85 = -local85;
						}
						local16.anInt2594 = (local16.anInt2590 - Static176.anInt4669 << 8) / local85;
						local16.anInt2591 = (local16.anInt2602 - Static176.anInt4669 << 8) / local85;
						local16.anInt2593 = (local16.anInt2603 - anInt2982 << 8) / local85;
						local16.anInt2600 = (local16.anInt2592 - anInt2982 << 8) / local85;
						Static54.aClass61Array6[Static166.anInt3693++] = local16;
					}
				}
			} else if (local16.anInt2605 == 2) {
				local27 = local16.anInt2588 + Static54.anInt3872 - Static89.anInt2074;
				if (local27 >= 0 && local27 <= Static54.anInt3872 + Static54.anInt3872) {
					local42 = local16.anInt2601 + Static54.anInt3872 - Static137.anInt3098;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2595 + Static54.anInt3872 - Static137.anInt3098;
					if (local53 > Static54.anInt3872 + Static54.anInt3872) {
						local53 = Static54.anInt3872 + Static54.anInt3872;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static142.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static176.anInt4669 - local16.anInt2590;
						if (local85 > 32) {
							local16.anInt2587 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2587 = 4;
							local85 = -local85;
						}
						local16.anInt2604 = (local16.anInt2597 - Static167.anInt3703 << 8) / local85;
						local16.anInt2599 = (local16.anInt2606 - Static167.anInt3703 << 8) / local85;
						local16.anInt2593 = (local16.anInt2603 - anInt2982 << 8) / local85;
						local16.anInt2600 = (local16.anInt2592 - anInt2982 << 8) / local85;
						Static54.aClass61Array6[Static166.anInt3693++] = local16;
					}
				}
			} else if (local16.anInt2605 == 4) {
				local27 = local16.anInt2603 - anInt2982;
				if (local27 > 128) {
					local42 = local16.anInt2588 + Static54.anInt3872 - Static89.anInt2074;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2598 + Static54.anInt3872 - Static89.anInt2074;
					if (local53 > Static54.anInt3872 + Static54.anInt3872) {
						local53 = Static54.anInt3872 + Static54.anInt3872;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt2601 + Static54.anInt3872 - Static137.anInt3098;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt2595 + Static54.anInt3872 - Static137.anInt3098;
						if (local85 > Static54.anInt3872 + Static54.anInt3872) {
							local85 = Static54.anInt3872 + Static54.anInt3872;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static142.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt2587 = 5;
							local16.anInt2604 = (local16.anInt2597 - Static167.anInt3703 << 8) / local27;
							local16.anInt2599 = (local16.anInt2606 - Static167.anInt3703 << 8) / local27;
							local16.anInt2594 = (local16.anInt2590 - Static176.anInt4669 << 8) / local27;
							local16.anInt2591 = (local16.anInt2602 - Static176.anInt4669 << 8) / local27;
							Static54.aClass61Array6[Static166.anInt3693++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Lclient!v;")
	public static Class96 method2290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass96_1 == null ? null : local7.aClass96_1;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z")
	public static boolean method2291() {
		return Static91.anInt2111 == 0 ? Static107.aClass1_Sub3_Sub4_1.method2875() : true;
	}
}
