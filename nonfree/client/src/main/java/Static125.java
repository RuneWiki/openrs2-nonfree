import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!wb;")
	public static Class4_Sub2_Sub4 aClass4_Sub2_Sub4_6;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	public static int anInt2512 = 0;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	public static void method2041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static73.anInt1472 = Static41.aClass54ArrayArray1[arg0][arg1].anInt1714;
		Static3.anInt17 = Static41.aClass54ArrayArray1[arg0][arg1].anInt1710;
		Static248.anInt4864 = Static41.aClass54ArrayArray1[arg0][arg1].anInt1715;
		Static290.method4526((float) Static73.anInt1472, (float) Static3.anInt17, (float) Static248.anInt4864);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public static void method2042() {
		Static46.aClass172_8.method4350();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!lg;III)V")
	public static void method2043(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt3128 == 1) {
			Static140.method2241((short) 49, "", arg0.aString108, -1, 0L, arg0.anInt3162, 0);
		}
		if (arg0.anInt3128 == 2 && !Static145.aBoolean386) {
			@Pc(32) String local32 = Static99.method1629(arg0);
			if (local32 != null) {
				Static140.method2241((short) 14, "<col=00ff00>" + arg0.aString103, local32, -1, 0L, arg0.anInt3162, -1);
			}
		}
		if (arg0.anInt3128 == 3) {
			Static140.method2241((short) 47, "", Static243.aString161, -1, 0L, arg0.anInt3162, 0);
		}
		if (arg0.anInt3128 == 4) {
			Static140.method2241((short) 21, "", arg0.aString108, -1, 0L, arg0.anInt3162, 0);
		}
		if (arg0.anInt3128 == 5) {
			Static140.method2241((short) 48, "", arg0.aString108, -1, 0L, arg0.anInt3162, 0);
		}
		if (arg0.anInt3128 == 6 && Static44.aClass97_6 == null) {
			Static140.method2241((short) 42, "", arg0.aString108, -1, 0L, arg0.anInt3162, -1);
		}
		@Pc(159) int local159;
		@Pc(161) int local161;
		if (arg0.anInt3177 == 2) {
			local159 = 0;
			for (local161 = 0; local161 < arg0.anInt3151; local161++) {
				for (@Pc(167) int local167 = 0; local167 < arg0.anInt3147; local167++) {
					@Pc(178) int local178 = (arg0.anInt3206 + 32) * local161;
					@Pc(185) int local185 = (arg0.anInt3112 + 32) * local167;
					if (local159 < 20) {
						local185 += arg0.anIntArray263[local159];
						local178 += arg0.anIntArray262[local159];
					}
					if (arg1 >= local185 && local178 <= arg2 && arg1 < local185 + 32 && arg2 < local178 + 32) {
						Static52.aClass97_8 = arg0;
						Static299.anInt5730 = local159;
						if (arg0.anIntArray249[local159] > 0) {
							@Pc(242) Class4_Sub22 local242 = Static41.method791(arg0);
							@Pc(251) Class29 local251 = Static187.method3128(arg0.anIntArray249[local159] - 1);
							if (Static116.anInt5523 == 1 && local242.method2575()) {
								if (Static2.anInt10 != arg0.anInt3162 || Static174.anInt3532 != local159) {
									Static140.method2241((short) 5, Static137.aString92 + " -> <col=ff9040>" + local251.aString35, Static118.aString86, -1, (long) local251.anInt996, arg0.anInt3162, local159);
								}
							} else if (Static145.aBoolean386 && local242.method2575()) {
								@Pc(549) Class4_Sub2_Sub7 local549 = Static221.anInt4243 == -1 ? null : Static58.method2508(Static221.anInt4243);
								if ((Static282.anInt5536 & 0x10) != 0 && (local549 == null || local251.method925(Static221.anInt4243, local549.anInt1697) != local549.anInt1697)) {
									Static140.method2241((short) 50, Static160.aString115 + " -> <col=ff9040>" + local251.aString35, Static201.aString139, Static43.anInt871, (long) local251.anInt996, arg0.anInt3162, local159);
								}
							} else {
								@Pc(271) String[] local271 = local251.aStringArray3;
								if (Static36.aBoolean51) {
									local271 = Static167.method2666(local271);
								}
								@Pc(284) int local284;
								@Pc(306) byte local306;
								if (local242.method2575()) {
									for (local284 = 4; local284 >= 3; local284--) {
										if (local271 != null && local271[local284] != null) {
											if (local284 == 3) {
												local306 = 36;
											} else {
												local306 = 7;
											}
											Static140.method2241(local306, "<col=ff9040>" + local251.aString35, local271[local284], -1, (long) local251.anInt996, arg0.anInt3162, local159);
										}
									}
								}
								if (local242.method2567()) {
									Static140.method2241((short) 12, "<col=ff9040>" + local251.aString35, Static118.aString86, Static303.anInt5779, (long) local251.anInt996, arg0.anInt3162, local159);
								}
								if (local242.method2575() && local271 != null) {
									for (local284 = 2; local284 >= 0; local284--) {
										if (local271[local284] != null) {
											local306 = 0;
											if (local284 == 0) {
												local306 = 25;
											}
											if (local284 == 1) {
												local306 = 59;
											}
											if (local284 == 2) {
												local306 = 35;
											}
											Static140.method2241(local306, "<col=ff9040>" + local251.aString35, local271[local284], -1, (long) local251.anInt996, arg0.anInt3162, local159);
										}
									}
								}
								local271 = arg0.aStringArray20;
								if (Static36.aBoolean51) {
									local271 = Static167.method2666(local271);
								}
								if (local271 != null) {
									for (local284 = 4; local284 >= 0; local284--) {
										if (local271[local284] != null) {
											local306 = 0;
											if (local284 == 0) {
												local306 = 44;
											}
											if (local284 == 1) {
												local306 = 2;
											}
											if (local284 == 2) {
												local306 = 29;
											}
											if (local284 == 3) {
												local306 = 10;
											}
											if (local284 == 4) {
												local306 = 23;
											}
											Static140.method2241(local306, "<col=ff9040>" + local251.aString35, local271[local284], -1, (long) local251.anInt996, arg0.anInt3162, local159);
										}
									}
								}
								Static140.method2241((short) 1007, "<col=ff9040>" + local251.aString35, Static250.aString164, Static55.anInt1250, (long) local251.anInt996, arg0.anInt3162, local159);
							}
						}
					}
					local159++;
				}
			}
		}
		if (!arg0.aBoolean192) {
			return;
		}
		if (!Static145.aBoolean386) {
			for (local159 = 9; local159 >= 5; local159--) {
				@Pc(653) String local653 = Static207.method1816(local159, arg0);
				if (local653 != null) {
					Static140.method2241((short) 1002, arg0.aString109, local653, Static265.method4185(local159, arg0), (long) (local159 + 1), arg0.anInt3162, arg0.anInt3146);
				}
			}
			@Pc(684) String local684 = Static99.method1629(arg0);
			if (local684 != null) {
				Static140.method2241((short) 14, arg0.aString109, local684, -1, 0L, arg0.anInt3162, arg0.anInt3146);
			}
			for (local161 = 4; local161 >= 0; local161--) {
				@Pc(712) String local712 = Static207.method1816(local161, arg0);
				if (local712 != null) {
					Static140.method2241((short) 38, arg0.aString109, local712, Static265.method4185(local161, arg0), (long) (local161 + 1), arg0.anInt3162, arg0.anInt3146);
				}
			}
			if (Static41.method791(arg0).method2566()) {
				if (arg0.aString106 == null) {
					Static140.method2241((short) 42, "", Static74.aString60, -1, 0L, arg0.anInt3162, arg0.anInt3146);
				} else {
					Static140.method2241((short) 42, "", arg0.aString106, -1, 0L, arg0.anInt3162, arg0.anInt3146);
				}
			}
		} else if (Static41.method791(arg0).method2564() && (Static282.anInt5536 & 0x20) != 0) {
			Static140.method2241((short) 11, Static160.aString115 + " -> " + arg0.aString109, Static201.aString139, Static43.anInt871, 0L, arg0.anInt3162, arg0.anInt3146);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ld;Lclient!cg;Lclient!cg;B)V")
	public static void method2045(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class22 arg2) {
		Static243.aClass22_81 = arg2;
		Static38.aClass22_16 = arg1;
		Static113.anInterface3_1 = arg0;
		if (Static243.aClass22_81 != null) {
			Static277.anInt5456 = Static243.aClass22_81.method679(1);
		}
		if (Static38.aClass22_16 != null) {
			Static115.anInt2353 = Static38.aClass22_16.method679(1);
		}
	}
}
