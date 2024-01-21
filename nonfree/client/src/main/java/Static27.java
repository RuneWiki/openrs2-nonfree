import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ch", name = "bb", descriptor = "Lclient!ke;")
	public static Class52 aClass52_7;

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_262 = Static193.method3027("Wed");

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_263 = Static193.method3027("Tue");

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_273 = Static193.method3027("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "Lclient!oc;")
	public static Class70 aClass70_264 = aClass70_273;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_265 = Static193.method3027("Sun");

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_266 = Static193.method3027("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_267 = Static193.method3027("Fri");

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_268 = Static193.method3027(")1 ");

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_269 = Static193.method3027("Thu");

	@OriginalMember(owner = "client!ch", name = "db", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_276 = Static193.method3027("Mon");

	@OriginalMember(owner = "client!ch", name = "Z", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_274 = Static193.method3027("Sat");

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array11 = new Class70[] { aClass70_265, aClass70_276, aClass70_263, aClass70_262, aClass70_269, aClass70_267, aClass70_274 };

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	public static int anInt570 = 0;

	@OriginalMember(owner = "client!ch", name = "V", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_271 = Static193.method3027("Your account has been disabled)3");

	@OriginalMember(owner = "client!ch", name = "S", descriptor = "Lclient!oc;")
	public static Class70 aClass70_270 = aClass70_271;

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
	public static int anInt571 = 0;

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_272 = Static193.method3027("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
	public static int anInt572 = 0;

	@OriginalMember(owner = "client!ch", name = "cb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_275 = aClass70_272;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBIIIII)V")
	public static void method485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(31) int local31;
		if (Static210.anInt4244 == 0 && !Static5.aBoolean7) {
			@Pc(11) int local11 = Static163.anInt3325;
			@Pc(13) int local13 = Static192.anInt3907;
			@Pc(15) int local15 = Static205.anInt4176;
			@Pc(29) int local29 = local11 + (local15 - local11) * (arg2 - arg1) / arg0;
			local31 = Static8.anInt190;
			@Pc(45) int local45 = local13 + (arg3 - arg4) * (local31 - local13) / arg5;
			Static50.method784((short) 22, local29, Static45.aClass70_472, Static61.aClass70_596, 0L, local45);
		}
		@Pc(67) long local67 = -1L;
		for (local31 = 0; local31 < Static126.anInt2490; local31++) {
			@Pc(75) long local75 = Static111.aLongArray4[local31];
			@Pc(82) int local82 = (int) local75 >> 7 & 0x7F;
			@Pc(87) int local87 = (int) local75 & 0x7F;
			@Pc(94) int local94 = Integer.MAX_VALUE & (int) (local75 >>> 32);
			@Pc(101) int local101 = (int) local75 >> 29 & 0x3;
			if (local75 != local67) {
				local67 = local75;
				@Pc(185) int local185;
				if (local101 == 2 && Static169.method2556(Static137.anInt2795, local87, local82, local75)) {
					@Pc(122) Class3_Sub3_Sub9 local122 = Static161.method2421(local94);
					if (local122.anIntArray52 != null) {
						local122 = local122.method769();
					}
					if (local122 == null) {
						continue;
					}
					if (Static210.anInt4244 == 1) {
						Static50.method784((short) 25, local87, Static41.aClass70_428, Static207.method3296(new Class70[] { Static2.aClass70_2, Static11.aClass70_130, local122.aClass70_488 }), local75, local82);
					} else if (!Static5.aBoolean7) {
						@Pc(175) Class70[] local175 = local122.aClass70Array20;
						if (Static179.aBoolean80) {
							local175 = Static22.method372(local175);
						}
						if (local175 != null) {
							for (local185 = 4; local185 >= 0; local185--) {
								if (local175[local185] != null) {
									@Pc(197) short local197 = 0;
									if (local185 == 0) {
										local197 = 40;
									}
									if (local185 == 1) {
										local197 = 14;
									}
									if (local185 == 2) {
										local197 = 37;
									}
									if (local185 == 3) {
										local197 = 26;
									}
									if (local185 == 4) {
										local197 = 1002;
									}
									Static50.method784(local197, local87, local175[local185], Static207.method3296(new Class70[] { Static15.aClass70_154, local122.aClass70_488 }), local75, local82);
								}
							}
						}
						Static50.method784((short) 1006, local87, Static210.aClass70_2094, Static207.method3296(new Class70[] { Static15.aClass70_154, local122.aClass70_488 }), (long) local122.anInt992, local82);
					} else if ((Static117.anInt2370 & 0x4) == 4) {
						Static50.method784((short) 57, local87, Static136.aClass70_1289, Static207.method3296(new Class70[] { Static110.aClass70_1097, Static11.aClass70_130, local122.aClass70_488 }), local75, local82);
					}
				}
				@Pc(341) int local341;
				@Pc(349) Class26_Sub2_Sub2 local349;
				@Pc(400) Class26_Sub2_Sub1 local400;
				if (local101 == 1) {
					@Pc(322) Class26_Sub2_Sub2 local322 = Static8.aClass26_Sub2_Sub2Array1[local94];
					if (local322.aClass3_Sub3_Sub24_1.anInt3954 == 1 && (local322.anInt2593 & 0x7F) == 64 && (local322.anInt2611 & 0x7F) == 64) {
						for (local341 = 0; local341 < Static201.anInt4110; local341++) {
							local349 = Static8.aClass26_Sub2_Sub2Array1[Static80.anIntArray85[local341]];
							if (local349 != null && local322 != local349 && local349.aClass3_Sub3_Sub24_1.anInt3954 == 1 && local322.anInt2593 == local349.anInt2593 && local322.anInt2611 == local349.anInt2611) {
								Static120.method1724(local87, local349.aClass3_Sub3_Sub24_1, local82, Static80.anIntArray85[local341]);
							}
						}
						for (local185 = 0; local185 < Static80.anInt1607; local185++) {
							local400 = Static146.aClass26_Sub2_Sub1Array1[Static76.anIntArray81[local185]];
							if (local400 != null && local400.anInt2593 == local322.anInt2593 && local400.anInt2611 == local322.anInt2611) {
								Static78.method1143(local87, local400, local82, Static76.anIntArray81[local185]);
							}
						}
					}
					Static120.method1724(local87, local322.aClass3_Sub3_Sub24_1, local82, local94);
				}
				if (local101 == 0) {
					@Pc(449) Class26_Sub2_Sub1 local449 = Static146.aClass26_Sub2_Sub1Array1[local94];
					if ((local449.anInt2593 & 0x7F) == 64 && (local449.anInt2611 & 0x7F) == 64) {
						for (local341 = 0; local341 < Static201.anInt4110; local341++) {
							local349 = Static8.aClass26_Sub2_Sub2Array1[Static80.anIntArray85[local341]];
							if (local349 != null && local349.aClass3_Sub3_Sub24_1.anInt3954 == 1 && local449.anInt2593 == local349.anInt2593 && local349.anInt2611 == local449.anInt2611) {
								Static120.method1724(local87, local349.aClass3_Sub3_Sub24_1, local82, Static80.anIntArray85[local341]);
							}
						}
						for (local185 = 0; local185 < Static80.anInt1607; local185++) {
							local400 = Static146.aClass26_Sub2_Sub1Array1[Static76.anIntArray81[local185]];
							if (local400 != null && local400 != local449 && local449.anInt2593 == local400.anInt2593 && local400.anInt2611 == local449.anInt2611) {
								Static78.method1143(local87, local400, local82, Static76.anIntArray81[local185]);
							}
						}
					}
					Static78.method1143(local87, local449, local82, local94);
				}
				if (local101 == 3) {
					@Pc(565) Class10 local565 = Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local87][local82];
					if (local565 != null) {
						for (@Pc(572) Class3_Sub3_Sub10 local572 = (Class3_Sub3_Sub10) local565.method257(); local572 != null; local572 = (Class3_Sub3_Sub10) local565.method269()) {
							local185 = local572.aClass26_Sub7_1.anInt3887;
							@Pc(582) Class3_Sub3_Sub11 local582 = Static14.method275(local185);
							if (Static210.anInt4244 == 1) {
								Static50.method784((short) 3, local87, Static41.aClass70_428, Static207.method3296(new Class70[] { Static2.aClass70_2, Static174.aClass70_1701, local582.aClass70_579 }), (long) local185, local82);
							} else if (!Static5.aBoolean7) {
								@Pc(630) Class70[] local630 = local582.aClass70Array26;
								if (Static179.aBoolean80) {
									local630 = Static22.method372(local630);
								}
								for (@Pc(638) int local638 = 4; local638 >= 0; local638--) {
									if (local630 != null && local630[local638] != null) {
										@Pc(652) byte local652 = 0;
										if (local638 == 0) {
											local652 = 43;
										}
										if (local638 == 1) {
											local652 = 6;
										}
										if (local638 == 2) {
											local652 = 38;
										}
										if (local638 == 3) {
											local652 = 4;
										}
										if (local638 == 4) {
											local652 = 23;
										}
										Static50.method784(local652, local87, local630[local638], Static207.method3296(new Class70[] { Static149.aClass70_1432, local582.aClass70_579 }), (long) local185, local82);
									} else if (local638 == 2) {
										Static50.method784((short) 38, local87, Static90.aClass70_918, Static207.method3296(new Class70[] { Static149.aClass70_1432, local582.aClass70_579 }), (long) local185, local82);
									}
								}
								Static50.method784((short) 1003, local87, Static210.aClass70_2094, Static207.method3296(new Class70[] { Static149.aClass70_1432, local582.aClass70_579 }), (long) local185, local82);
							} else if ((Static117.anInt2370 & 0x1) == 1) {
								Static50.method784((short) 58, local87, Static136.aClass70_1289, Static207.method3296(new Class70[] { Static110.aClass70_1097, Static174.aClass70_1701, local582.aClass70_579 }), (long) local185, local82);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Z")
	public static boolean method487() {
		try {
			if (Static79.anInt1588 == 2) {
				if (Static135.aClass3_Sub18_1 == null) {
					Static135.aClass3_Sub18_1 = Static216.method1484(Static78.aClass52_18, Static6.anInt123, Static185.anInt3774);
					if (Static135.aClass3_Sub18_1 == null) {
						return false;
					}
				}
				if (Static202.aClass61_1 == null) {
					Static202.aClass61_1 = new Class61(Static65.aClass52_15, Static46.aClass52_10);
				}
				if (Static175.aClass3_Sub19_Sub2_2.method2868(Static135.aClass3_Sub18_1, Static202.aClass61_1, Static93.aClass52_20)) {
					Static175.aClass3_Sub19_Sub2_2.method2852();
					Static175.aClass3_Sub19_Sub2_2.method2849(Static210.anInt4241);
					Static175.aClass3_Sub19_Sub2_2.method2871(Static81.aBoolean92, Static135.aClass3_Sub18_1);
					Static202.aClass61_1 = null;
					Static79.anInt1588 = 0;
					Static78.aClass52_18 = null;
					Static135.aClass3_Sub18_1 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static175.aClass3_Sub19_Sub2_2.method2872();
			Static135.aClass3_Sub18_1 = null;
			Static79.anInt1588 = 0;
			Static78.aClass52_18 = null;
			Static202.aClass61_1 = null;
		}
		return false;
	}
}
