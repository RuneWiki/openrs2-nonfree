import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "Lclient!bd;")
	public static Class8 aClass8_27;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!a;")
	private static Class1 aClass1_2807 = Static94.method1596("Your account has been disabled)3");

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_2808 = Static94.method1596("Wordpack geladen)3");

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!a;")
	public static Class1 aClass1_2809 = Static94.method1596("Handel akzeptieren");

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public static int anInt2669 = -1;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_2810 = Static94.method1596("redstone3");

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Lclient!a;")
	public static Class1 aClass1_2811 = Static94.method1596("");

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_2812 = Static94.method1596("Menge eingeben:");

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "Lclient!a;")
	public static Class1 aClass1_2813 = aClass1_2807;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
	public static int anInt2678 = 99;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public static void method1760() {
		aClass1_2809 = null;
		aClass1_2813 = null;
		aClass1_2811 = null;
		aClass1_2808 = null;
		aClass8_27 = null;
		aClass1_2812 = null;
		aClass1_2807 = null;
		aClass1_2810 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
	public static void method1761(@OriginalArg(0) int arg0) {
		if (!Static113.method1524(arg0)) {
			return;
		}
		@Pc(14) Class2_Sub1_Sub14[] local14 = Static98.aClass2_Sub1_Sub14ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class2_Sub1_Sub14 local27 = local14[local21];
			if (local27.anObjectArray6 != null) {
				Static72.method1368(local27.anObjectArray6, 0, local27, 0);
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
	public static void method1762() {
		@Pc(7) int local7 = -1;
		if (Static12.anInt2645 == 0 && Static17.anInt783 == 0) {
			Static29.method758(0, Static104.aClass1_1584, Static84.anInt2248, Static22.anInt930, 7, Static111.aClass1_2898);
		}
		for (@Pc(33) int local33 = 0; local33 < Static75.anInt2045; local33++) {
			@Pc(39) int local39 = Static75.anIntArray251[local33];
			@Pc(43) int local43 = local39 & 0x7F;
			@Pc(49) int local49 = local39 >> 7 & 0x7F;
			@Pc(55) int local55 = local39 >> 29 & 0x3;
			@Pc(61) int local61 = local39 >> 14 & 0x7FFF;
			if (local7 != local39) {
				local7 = local39;
				@Pc(144) int local144;
				if (local55 == 2 && Static109.aClass3_1.method173(Static2.anInt287, local43, local49, local39) >= 0) {
					@Pc(80) Class2_Sub1_Sub10 local80 = Static28.method739(local61);
					if (local80.anIntArray154 != null) {
						local80 = local80.method1018();
					}
					if (local80 == null) {
						continue;
					}
					if (Static12.anInt2645 == 1) {
						Static29.method758(local39, Static17.aClass1_675, local49, local43, 5, Static97.method1655(new Class1[] { Static109.aClass1_2872, Static14.aClass1_651, local80.aClass1_1486 }));
					} else if (Static17.anInt783 != 1) {
						@Pc(130) Class1[] local130 = local80.aClass1Array13;
						if (Static99.aBoolean147) {
							local130 = Static91.method1580(local130);
						}
						if (local130 != null) {
							for (local144 = 4; local144 >= 0; local144--) {
								if (local130[local144] != null) {
									@Pc(152) short local152 = 0;
									if (local144 == 0) {
										local152 = 16;
									}
									if (local144 == 1) {
										local152 = 29;
									}
									if (local144 == 2) {
										local152 = 17;
									}
									if (local144 == 3) {
										local152 = 27;
									}
									if (local144 == 4) {
										local152 = 1002;
									}
									Static29.method758(local39, local130[local144], local49, local43, local152, Static97.method1655(new Class1[] { Static107.aClass1_2859, local80.aClass1_1486 }));
								}
							}
						}
						Static29.method758(local80.anInt1502 << 14, Static95.aClass1_2519, local49, local43, 1004, Static97.method1655(new Class1[] { Static107.aClass1_2859, local80.aClass1_1486 }));
					} else if ((Static96.anInt2434 & 0x4) == 4) {
						Static29.method758(local39, Static52.aClass1_1774, local49, local43, 32, Static97.method1655(new Class1[] { Static46.aClass1_1507, Static14.aClass1_651, local80.aClass1_1486 }));
					}
				}
				@Pc(298) int local298;
				@Pc(306) Class2_Sub1_Sub1_Sub1_Sub2 local306;
				@Pc(359) Class2_Sub1_Sub1_Sub1_Sub1 local359;
				if (local55 == 1) {
					@Pc(277) Class2_Sub1_Sub1_Sub1_Sub2 local277 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local61];
					if (local277.aClass2_Sub1_Sub7_1.anInt1335 == 1 && (local277.anInt2724 & 0x7F) == 64 && (local277.anInt2717 & 0x7F) == 64) {
						for (local298 = 0; local298 < Static44.anInt1516; local298++) {
							local306 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[Static20.anIntArray89[local298]];
							if (local306 != null && local306 != local277 && local306.aClass2_Sub1_Sub7_1.anInt1335 == 1 && local277.anInt2724 == local306.anInt2724 && local306.anInt2717 == local277.anInt2717) {
								Static111.method1802(local43, local49, Static20.anIntArray89[local298], local306.aClass2_Sub1_Sub7_1);
							}
						}
						for (local144 = 0; local144 < Static99.anInt2521; local144++) {
							local359 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[Static93.anIntArray292[local144]];
							if (local359 != null && local277.anInt2724 == local359.anInt2724 && local277.anInt2717 == local359.anInt2717) {
								Static14.method450(local49, local43, local359, Static93.anIntArray292[local144]);
							}
						}
					}
					Static111.method1802(local43, local49, local61, local277.aClass2_Sub1_Sub7_1);
				}
				if (local55 == 0) {
					@Pc(400) Class2_Sub1_Sub1_Sub1_Sub1 local400 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local61];
					if ((local400.anInt2724 & 0x7F) == 64 && (local400.anInt2717 & 0x7F) == 64) {
						for (local298 = 0; local298 < Static44.anInt1516; local298++) {
							local306 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[Static20.anIntArray89[local298]];
							if (local306 != null && local306.aClass2_Sub1_Sub7_1.anInt1335 == 1 && local400.anInt2724 == local306.anInt2724 && local306.anInt2717 == local400.anInt2717) {
								Static111.method1802(local43, local49, Static20.anIntArray89[local298], local306.aClass2_Sub1_Sub7_1);
							}
						}
						for (local144 = 0; local144 < Static99.anInt2521; local144++) {
							local359 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[Static93.anIntArray292[local144]];
							if (local359 != null && local359 != local400 && local359.anInt2724 == local400.anInt2724 && local359.anInt2717 == local400.anInt2717) {
								Static14.method450(local49, local43, local359, Static93.anIntArray292[local144]);
							}
						}
					}
					Static14.method450(local49, local43, local400, local61);
				}
				if (local55 == 3) {
					@Pc(532) Class46 local532 = Static15.aClass46ArrayArrayArray1[Static2.anInt287][local43][local49];
					if (local532 != null) {
						for (@Pc(539) Class2_Sub1_Sub1_Sub4 local539 = (Class2_Sub1_Sub1_Sub4) local532.method1434(); local539 != null; local539 = (Class2_Sub1_Sub1_Sub4) local532.method1445()) {
							@Pc(546) Class2_Sub1_Sub17 local546 = Static73.method1374(local539.anInt1708);
							if (Static12.anInt2645 == 1) {
								Static29.method758(local539.anInt1708, Static17.aClass1_675, local49, local43, 47, Static97.method1655(new Class1[] { Static109.aClass1_2872, Static8.aClass1_426, local546.aClass1_2571 }));
							} else if (Static17.anInt783 != 1) {
								@Pc(588) Class1[] local588 = local546.aClass1Array23;
								if (Static99.aBoolean147) {
									local588 = Static91.method1580(local588);
								}
								for (@Pc(600) int local600 = 4; local600 >= 0; local600--) {
									if (local588 != null && local588[local600] != null) {
										@Pc(644) byte local644 = 0;
										if (local600 == 0) {
											local644 = 2;
										}
										if (local600 == 1) {
											local644 = 38;
										}
										if (local600 == 2) {
											local644 = 3;
										}
										if (local600 == 3) {
											local644 = 8;
										}
										if (local600 == 4) {
											local644 = 36;
										}
										Static29.method758(local539.anInt1708, local588[local600], local49, local43, local644, Static97.method1655(new Class1[] { Static77.aClass1_2163, local546.aClass1_2571 }));
									} else if (local600 == 2) {
										Static29.method758(local539.anInt1708, Static54.aClass1_1835, local49, local43, 3, Static97.method1655(new Class1[] { Static77.aClass1_2163, local546.aClass1_2571 }));
									}
								}
								Static29.method758(local539.anInt1708, Static95.aClass1_2519, local49, local43, 1003, Static97.method1655(new Class1[] { Static77.aClass1_2163, local546.aClass1_2571 }));
							} else if ((Static96.anInt2434 & 0x1) == 1) {
								Static29.method758(local539.anInt1708, Static52.aClass1_1774, local49, local43, 15, Static97.method1655(new Class1[] { Static46.aClass1_1507, Static8.aClass1_426, local546.aClass1_2571 }));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public static void method1764() {
		@Pc(1) Class63 local1 = Static48.aClass63_1;
		synchronized (Static48.aClass63_1) {
			Static25.anInt1019 = Static13.anInt651;
			Static22.anInt930 = Static21.anInt917;
			Static84.anInt2248 = Static13.anInt653;
			Static103.anInt2617 = Static67.anInt2761;
			Static93.anInt2360 = Static90.anInt2331;
			Static1.anInt13 = Static80.anInt2128;
			Static44.aLong46 = Static29.aLong28;
			Static67.anInt2761 = 0;
		}
	}
}
