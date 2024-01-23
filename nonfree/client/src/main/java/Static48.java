import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	public static int anInt956 = 0;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!vh;")
	public static Class187 aClass187_27 = new Class187(64);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lclient!ui;")
	public static Class1_Sub2_Sub22 method901(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub22 local10 = (Class1_Sub2_Sub22) Static306.aClass187_152.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static277.method4286(Static102.aClass121_50, Static194.aClass121_87, arg0);
		if (local10 != null) {
			Static306.aClass187_152.method4524((long) arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
	public static void method903() {
		Static179.aClass187_92.method4534(5);
		Static251.aClass187_128.method4534(5);
		Static219.aClass187_111.method4534(5);
		Static102.aClass187_60.method4534(5);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!hi;III)V")
	public static void method904(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt2139 == 1) {
			Static309.method4707(0, -1, "", arg0.aString126, (short) 19, 0L, arg0.anInt2157);
		}
		@Pc(36) String local36;
		if (arg0.anInt2139 == 2 && !Static133.aBoolean168) {
			local36 = Static31.method504(arg0);
			if (local36 != null) {
				Static309.method4707(-1, -1, "<col=00ff00>" + arg0.aString121, local36, (short) 11, 0L, arg0.anInt2157);
			}
		}
		if (arg0.anInt2139 == 3) {
			Static309.method4707(0, -1, "", Static162.aString180, (short) 43, 0L, arg0.anInt2157);
		}
		if (arg0.anInt2139 == 4) {
			Static309.method4707(0, -1, "", arg0.aString126, (short) 2, 0L, arg0.anInt2157);
		}
		if (arg0.anInt2139 == 5) {
			Static309.method4707(0, -1, "", arg0.aString126, (short) 37, 0L, arg0.anInt2157);
		}
		if (arg0.anInt2139 == 6 && Static310.aClass66_51 == null) {
			Static309.method4707(-1, -1, "", arg0.aString126, (short) 45, 0L, arg0.anInt2157);
		}
		@Pc(163) int local163;
		@Pc(161) int local161;
		if (arg0.anInt2176 == 2) {
			local161 = 0;
			for (local163 = 0; local163 < arg0.anInt2185; local163++) {
				for (@Pc(169) int local169 = 0; local169 < arg0.anInt2169; local169++) {
					@Pc(184) int local184 = (arg0.anInt2146 + 32) * local163;
					@Pc(191) int local191 = (arg0.anInt2155 + 32) * local169;
					if (local161 < 20) {
						local191 += arg0.anIntArray183[local161];
						local184 += arg0.anIntArray184[local161];
					}
					if (local191 <= arg1 && local184 <= arg2 && local191 + 32 > arg1 && arg2 < local184 + 32) {
						Static51.anInt1013 = local161;
						Static82.aClass66_18 = arg0;
						if (arg0.anIntArray192[local161] > 0) {
							@Pc(248) Class1_Sub22 local248 = Static37.method679(arg0);
							@Pc(257) Class102 local257 = Static49.method909(arg0.anIntArray192[local161] - 1);
							if (Static306.anInt5423 == 1 && local248.method3055()) {
								if (Static306.anInt5424 != arg0.anInt2157 || Static8.anInt134 != local161) {
									Static309.method4707(local161, -1, Static272.aString340 + " -> <col=ff9040>" + local257.aString181, Static35.aString222, (short) 7, (long) local257.anInt3174, arg0.anInt2157);
								}
							} else if (Static133.aBoolean168 && local248.method3055()) {
								@Pc(322) Class1_Sub2_Sub17 local322 = Static277.anInt4994 == -1 ? null : Static30.method498(Static277.anInt4994);
								if ((Static102.anInt2065 & 0x10) != 0 && (local322 == null || local257.method2783(local322.anInt4543, Static277.anInt4994) != local322.anInt4543)) {
									Static309.method4707(local161, Static196.anInt3698, Static88.aString106 + " -> <col=ff9040>" + local257.aString181, Static148.aString164, (short) 30, (long) local257.anInt3174, arg0.anInt2157);
								}
							} else {
								@Pc(375) String[] local375 = local257.aStringArray23;
								if (Static225.aBoolean286) {
									local375 = Static143.method2466(local375);
								}
								@Pc(388) int local388;
								@Pc(409) byte local409;
								if (local248.method3055()) {
									for (local388 = 4; local388 >= 3; local388--) {
										if (local375 != null && local375[local388] != null) {
											if (local388 == 3) {
												local409 = 51;
											} else {
												local409 = 16;
											}
											Static309.method4707(local161, -1, "<col=ff9040>" + local257.aString181, local375[local388], local409, (long) local257.anInt3174, arg0.anInt2157);
										}
									}
								}
								if (local248.method3056()) {
									Static309.method4707(local161, Static280.anInt5078, "<col=ff9040>" + local257.aString181, Static35.aString222, (short) 50, (long) local257.anInt3174, arg0.anInt2157);
								}
								if (local248.method3055() && local375 != null) {
									for (local388 = 2; local388 >= 0; local388--) {
										if (local375[local388] != null) {
											local409 = 0;
											if (local388 == 0) {
												local409 = 35;
											}
											if (local388 == 1) {
												local409 = 34;
											}
											if (local388 == 2) {
												local409 = 31;
											}
											Static309.method4707(local161, -1, "<col=ff9040>" + local257.aString181, local375[local388], local409, (long) local257.anInt3174, arg0.anInt2157);
										}
									}
								}
								local375 = arg0.aStringArray18;
								if (Static225.aBoolean286) {
									local375 = Static143.method2466(local375);
								}
								if (local375 != null) {
									for (local388 = 4; local388 >= 0; local388--) {
										if (local375[local388] != null) {
											local409 = 0;
											if (local388 == 0) {
												local409 = 26;
											}
											if (local388 == 1) {
												local409 = 12;
											}
											if (local388 == 2) {
												local409 = 38;
											}
											if (local388 == 3) {
												local409 = 23;
											}
											if (local388 == 4) {
												local409 = 47;
											}
											Static309.method4707(local161, -1, "<col=ff9040>" + local257.aString181, local375[local388], local409, (long) local257.anInt3174, arg0.anInt2157);
										}
									}
								}
								Static309.method4707(local161, Static40.anInt5334, "<col=ff9040>" + local257.aString181, Static296.aString320, (short) 1001, (long) local257.anInt3174, arg0.anInt2157);
							}
						}
					}
					local161++;
				}
			}
		}
		if (!arg0.aBoolean132) {
			return;
		}
		if (!Static133.aBoolean168) {
			for (local161 = 9; local161 >= 5; local161--) {
				@Pc(702) String local702 = Static212.method613(arg0, local161);
				if (local702 != null) {
					Static309.method4707(arg0.anInt2178, Static257.method4075(arg0, local161), arg0.aString123, local702, (short) 1006, (long) (local161 + 1), arg0.anInt2157);
				}
			}
			local36 = Static31.method504(arg0);
			if (local36 != null) {
				Static309.method4707(arg0.anInt2178, -1, arg0.aString123, local36, (short) 11, 0L, arg0.anInt2157);
			}
			for (local163 = 4; local163 >= 0; local163--) {
				@Pc(764) String local764 = Static212.method613(arg0, local163);
				if (local764 != null) {
					Static309.method4707(arg0.anInt2178, Static257.method4075(arg0, local163), arg0.aString123, local764, (short) 29, (long) (local163 + 1), arg0.anInt2157);
				}
			}
			if (Static37.method679(arg0).method3054()) {
				if (arg0.aString125 == null) {
					Static309.method4707(arg0.anInt2178, -1, "", Static311.aString339, (short) 45, 0L, arg0.anInt2157);
				} else {
					Static309.method4707(arg0.anInt2178, -1, "", arg0.aString125, (short) 45, 0L, arg0.anInt2157);
				}
			}
		} else if (Static37.method679(arg0).method3065() && (Static102.anInt2065 & 0x20) != 0) {
			Static309.method4707(arg0.anInt2178, Static196.anInt3698, Static88.aString106 + " -> " + arg0.aString123, Static148.aString164, (short) 32, 0L, arg0.anInt2157);
		}
	}
}
