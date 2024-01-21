import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	public static int anInt1316;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Lclient!wg;")
	public static Class94 aClass94_2;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_521 = Static120.method1824("yellow:");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!rd;")
	public static Class80 aClass80_520 = aClass80_521;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_522 = aClass80_521;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public static int anInt1309 = 0;

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
	public static int anInt1317 = 0;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
	public static final int[] anIntArray173 = new int[128];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)Z")
	public static boolean method887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static112.anInt2518 + arg0 * Static112.anInt2527 >> 16;
		@Pc(19) int local19 = arg2 * Static112.anInt2527 - arg0 * Static112.anInt2518 >> 16;
		@Pc(29) int local29 = arg1 * Static14.anInt320 + local19 * Static21.anInt512 >> 16;
		@Pc(39) int local39 = arg1 * Static21.anInt512 - local19 * Static14.anInt320 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static33.anInt774 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static186.anInt4212 + (local39 << 9) / local29;
			return local55 >= Static18.anInt460 && local55 <= Static190.anInt4380 && local63 >= Static168.anInt3761 && local63 <= anInt1316;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public static void method888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub1_Sub13 local7 = Static20.method341(arg1);
		@Pc(10) int local10 = local7.anInt2615;
		@Pc(13) int local13 = local7.anInt2613;
		@Pc(16) int local16 = local7.anInt2620;
		@Pc(23) int local23 = Class3_Sub3.anIntArray33[local16 - local13];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static41.anIntArray131[local10] = local23 & arg0 << local13 | Static41.anIntArray131[local10] & ~local23;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!rc;I)V")
	public static void method889(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static107.anInt2370 != 1) {
			return;
		}
		if (Static37.anInt855 >= 280 && Static37.anInt855 <= 294 && Static20.anInt497 >= 4 && Static20.anInt497 <= 18) {
			Static5.method142(0, 0);
			return;
		}
		if (Static37.anInt855 >= 295 && Static37.anInt855 <= 360 && Static20.anInt497 >= 4 && Static20.anInt497 <= 18) {
			Static5.method142(0, 1);
			return;
		}
		if (Static37.anInt855 >= 390 && Static37.anInt855 <= 404 && Static20.anInt497 >= 4 && Static20.anInt497 <= 18) {
			Static5.method142(1, 0);
			return;
		}
		if (Static37.anInt855 >= 405 && Static37.anInt855 <= 470 && Static20.anInt497 >= 4 && Static20.anInt497 <= 18) {
			Static5.method142(1, 1);
			return;
		}
		if (Static37.anInt855 >= 500 && Static37.anInt855 <= 514 && Static20.anInt497 >= 4 && Static20.anInt497 <= 18) {
			Static5.method142(2, 0);
			return;
		}
		if (Static37.anInt855 >= 515 && Static37.anInt855 <= 580 && Static20.anInt497 >= 4 && Static20.anInt497 <= 18) {
			Static5.method142(2, 1);
			return;
		}
		if (Static37.anInt855 >= 610 && Static37.anInt855 <= 624 && Static20.anInt497 >= 4 && Static20.anInt497 <= 18) {
			Static5.method142(3, 0);
			return;
		}
		if (Static37.anInt855 >= 625 && Static37.anInt855 <= 690 && Static20.anInt497 >= 4 && Static20.anInt497 <= 18) {
			Static5.method142(3, 1);
			return;
		}
		if (Static37.anInt855 >= 708 && Static20.anInt497 >= 4 && Static37.anInt855 <= 758 && Static20.anInt497 <= 20) {
			Static21.aBoolean29 = false;
			Static147.aClass3_Sub1_Sub4_Sub4_31.method2599(0, 0);
			Static13.aClass3_Sub1_Sub4_Sub4_3.method2599(382, 0);
			Static101.aClass3_Sub1_Sub4_Sub1_4.method567(382 - Static101.aClass3_Sub1_Sub4_Sub1_4.anInt819 / 2, 18);
			return;
		}
		if (Static89.anInt1875 == -1) {
			return;
		}
		@Pc(272) Class21 local272 = Static176.aClass21Array1[Static89.anInt1875];
		if (Static156.aBoolean143 == local272.aBoolean39) {
			@Pc(300) byte[] local300 = Static154.method2467(new Class80[] { local272.aClass80_289, Static36.aClass80_284 }).method2444();
			Static46.aString2 = new String(local300, 0, local300.length);
			if (Static94.anInt2013 != 0) {
				Static94.anInt2013 = 0;
				Static22.anInt537 = 443;
				Static60.anInt1320 = 43594;
				Static100.anInt2099 = 43594;
			}
			Static21.aBoolean29 = false;
			Static120.anInt2639 = local272.anInt826;
			Static147.aClass3_Sub1_Sub4_Sub4_31.method2599(0, 0);
			Static13.aClass3_Sub1_Sub4_Sub4_3.method2599(382, 0);
			Static101.aClass3_Sub1_Sub4_Sub1_4.method567(382 - Static101.aClass3_Sub1_Sub4_Sub1_4.anInt819 / 2, 18);
			return;
		}
		@Pc(401) Class80 local401 = Static154.method2467(new Class80[] { Static108.aClass80_1151, local272.aClass80_289, Static36.aClass80_284, Static185.aClass80_1640, Static194.aClass80_1719, Static83.method1219(Static96.aBoolean83 ? 1 : 0), Static81.aClass80_678, Static83.method1219(Static85.anInt1782), Static69.aClass80_597, Static83.method1219(Static196.anInt3935) });
		try {
			arg0.getAppletContext().showDocument(local401.method2438(), "_self");
			return;
		} catch (@Pc(410) Exception local410) {
			return;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
	public static void method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static7.anInt221 == 0 && !Static162.aBoolean147) {
			Static16.method273((short) 30, 0L, Static175.aClass80_1521, arg0 - arg3, Static185.aClass80_1637, arg2 - arg1);
		}
		@Pc(30) long local30 = -1L;
		for (@Pc(32) int local32 = 0; local32 < Static189.anInt1936; local32++) {
			@Pc(38) long local38 = Static189.aLongArray7[local32];
			@Pc(43) int local43 = (int) local38 & 0x7F;
			@Pc(50) int local50 = (int) local38 >> 29 & 0x3;
			@Pc(57) int local57 = (int) local38 >> 7 & 0x7F;
			@Pc(64) int local64 = Integer.MAX_VALUE & (int) (local38 >>> 32);
			if (local38 != local30) {
				local30 = local38;
				@Pc(183) int local183;
				if (local50 == 2 && Static141.method2189(Static153.anInt673, local43, local57, local38)) {
					@Pc(85) Class3_Sub1_Sub1 local85 = Static162.method2627(local64);
					if (local85.anIntArray23 != null) {
						local85 = local85.method125();
					}
					if (local85 == null) {
						continue;
					}
					if (Static7.anInt221 == 1) {
						Static16.method273((short) 28, local38, Static17.aClass80_131, local43, Static154.method2467(new Class80[] { Static134.aClass80_1289, Static93.aClass80_803, local85.aClass80_36 }), local57);
					} else if (!Static162.aBoolean147) {
						@Pc(173) Class80[] local173 = local85.aClass80Array1;
						if (Static157.aBoolean144) {
							local173 = Static105.method1564(local173);
						}
						if (local173 != null) {
							for (local183 = 4; local183 >= 0; local183--) {
								if (local173[local183] != null) {
									@Pc(191) short local191 = 0;
									if (local183 == 0) {
										local191 = 42;
									}
									if (local183 == 1) {
										local191 = 2;
									}
									if (local183 == 2) {
										local191 = 36;
									}
									if (local183 == 3) {
										local191 = 20;
									}
									if (local183 == 4) {
										local191 = 1003;
									}
									Static16.method273(local191, local38, local173[local183], local43, Static154.method2467(new Class80[] { Static35.aClass80_691, local85.aClass80_36 }), local57);
								}
							}
						}
						Static16.method273((short) 1002, (long) local85.anInt167, Static148.aClass80_1303, local43, Static154.method2467(new Class80[] { Static35.aClass80_691, local85.aClass80_36 }), local57);
					} else if ((Static33.anInt778 & 0x4) == 4) {
						Static16.method273((short) 37, local38, Static44.aClass80_376, local43, Static154.method2467(new Class80[] { Static38.aClass80_309, Static93.aClass80_803, local85.aClass80_36 }), local57);
					}
				}
				@Pc(297) int local297;
				@Pc(305) Class3_Sub1_Sub5_Sub4_Sub1 local305;
				@Pc(360) Class3_Sub1_Sub5_Sub4_Sub2 local360;
				if (local50 == 1) {
					@Pc(276) Class3_Sub1_Sub5_Sub4_Sub1 local276 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local64];
					if (local276.aClass3_Sub1_Sub7_1.anInt912 == 1 && (local276.anInt4329 & 0x7F) == 64 && (local276.anInt4315 & 0x7F) == 64) {
						for (local297 = 0; local297 < anInt1317; local297++) {
							local305 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[Static125.anIntArray359[local297]];
							if (local305 != null && local276 != local305 && local305.aClass3_Sub1_Sub7_1.anInt912 == 1 && local276.anInt4329 == local305.anInt4329 && local276.anInt4315 == local305.anInt4315) {
								Static183.method2934(local305.aClass3_Sub1_Sub7_1, local43, Static125.anIntArray359[local297], local57);
							}
						}
						for (local183 = 0; local183 < Static15.anInt327; local183++) {
							local360 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[Static168.anIntArray460[local183]];
							if (local360 != null && local276.anInt4329 == local360.anInt4329 && local360.anInt4315 == local276.anInt4315) {
								Static192.method3103(Static168.anIntArray460[local183], local360, local43, local57);
							}
						}
					}
					Static183.method2934(local276.aClass3_Sub1_Sub7_1, local43, local64, local57);
				}
				if (local50 == 0) {
					@Pc(404) Class3_Sub1_Sub5_Sub4_Sub2 local404 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local64];
					if ((local404.anInt4329 & 0x7F) == 64 && (local404.anInt4315 & 0x7F) == 64) {
						for (local297 = 0; local297 < anInt1317; local297++) {
							local305 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[Static125.anIntArray359[local297]];
							if (local305 != null && local305.aClass3_Sub1_Sub7_1.anInt912 == 1 && local305.anInt4329 == local404.anInt4329 && local305.anInt4315 == local404.anInt4315) {
								Static183.method2934(local305.aClass3_Sub1_Sub7_1, local43, Static125.anIntArray359[local297], local57);
							}
						}
						for (local183 = 0; local183 < Static15.anInt327; local183++) {
							local360 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[Static168.anIntArray460[local183]];
							if (local360 != null && local404 != local360 && local404.anInt4329 == local360.anInt4329 && local404.anInt4315 == local360.anInt4315) {
								Static192.method3103(Static168.anIntArray460[local183], local360, local43, local57);
							}
						}
					}
					Static192.method3103(local64, local404, local43, local57);
				}
				if (local50 == 3) {
					@Pc(524) Class70 local524 = Static142.aClass70ArrayArrayArray1[Static153.anInt673][local43][local57];
					if (local524 != null) {
						for (@Pc(531) Class3_Sub1_Sub5_Sub7 local531 = (Class3_Sub1_Sub5_Sub7) local524.method1956(); local531 != null; local531 = (Class3_Sub1_Sub5_Sub7) local524.method1961()) {
							@Pc(538) Class3_Sub1_Sub2 local538 = Static173.method2793(local531.anInt4093);
							if (Static7.anInt221 == 1) {
								Static16.method273((short) 46, (long) local531.anInt4093, Static17.aClass80_131, local43, Static154.method2467(new Class80[] { Static134.aClass80_1289, Static95.aClass80_1416, local538.aClass80_116 }), local57);
							} else if (!Static162.aBoolean147) {
								@Pc(584) Class80[] local584 = local538.aClass80Array4;
								if (Static157.aBoolean144) {
									local584 = Static105.method1564(local584);
								}
								for (@Pc(592) int local592 = 4; local592 >= 0; local592--) {
									if (local584 != null && local584[local592] != null) {
										@Pc(633) byte local633 = 0;
										if (local592 == 0) {
											local633 = 19;
										}
										if (local592 == 1) {
											local633 = 35;
										}
										if (local592 == 2) {
											local633 = 17;
										}
										if (local592 == 3) {
											local633 = 1;
										}
										if (local592 == 4) {
											local633 = 38;
										}
										Static16.method273(local633, (long) local531.anInt4093, local584[local592], local43, Static154.method2467(new Class80[] { Static190.aClass80_1700, local538.aClass80_116 }), local57);
									} else if (local592 == 2) {
										Static16.method273((short) 17, (long) local531.anInt4093, Static15.aClass80_103, local43, Static154.method2467(new Class80[] { Static190.aClass80_1700, local538.aClass80_116 }), local57);
									}
								}
								Static16.method273((short) 1006, (long) local531.anInt4093, Static148.aClass80_1303, local43, Static154.method2467(new Class80[] { Static190.aClass80_1700, local538.aClass80_116 }), local57);
							} else if ((Static33.anInt778 & 0x1) == 1) {
								Static16.method273((short) 48, (long) local531.anInt4093, Static44.aClass80_376, local43, Static154.method2467(new Class80[] { Static38.aClass80_309, Static95.aClass80_1416, local538.aClass80_116 }), local57);
							}
						}
					}
				}
			}
		}
	}
}
