import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "J")
	public static long aLong37;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!r;")
	private static Class61 aClass61_282 = Static129.method2060("glow1:");

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
	public static int anInt940 = 0;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "Lclient!r;")
	private static Class61 aClass61_283 = Static129.method2060("Your account has been disabled)3");

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	public static int anInt942 = 0;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "Lclient!r;")
	private static Class61 aClass61_284 = Static129.method2060("Checking for updates )2 ");

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
	public static volatile int anInt943 = -1;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "Lclient!r;")
	public static Class61 aClass61_285 = aClass61_282;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "Lclient!r;")
	public static Class61 aClass61_286 = Static129.method2060("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "Lclient!r;")
	public static Class61 aClass61_287 = aClass61_284;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "Lclient!r;")
	public static Class61 aClass61_288 = aClass61_282;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "Lclient!r;")
	public static Class61 aClass61_289 = aClass61_283;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
	public static void method640() {
		aClass61_285 = null;
		aClass61_287 = null;
		aClass61_283 = null;
		anImage1 = null;
		aClass61_282 = null;
		aClass61_286 = null;
		aClass61_288 = null;
		aClass61_284 = null;
		aClass61_289 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V")
	public static void method641(@OriginalArg(1) int arg0) {
		Static129.anInt3238 += arg0 * 128;
		@Pc(25) int local25;
		if (Static129.anInt3238 > Static39.anIntArray174.length) {
			Static129.anInt3238 -= Static39.anIntArray174.length;
			local25 = (int) (Math.random() * 12.0D);
			Static59.method1017(Static105.aClass5_Sub2_Sub1_Sub3Array42[local25]);
		}
		local25 = 0;
		@Pc(38) int local38 = arg0 * 128;
		@Pc(45) int local45 = (256 - arg0) * 128;
		@Pc(71) int local71;
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			local71 = Static133.anIntArray448[local38 + local25] - Static39.anIntArray174[Static39.anIntArray174.length - 1 & local25 - -Static129.anInt3238] * arg0 / 6;
			if (local71 < 0) {
				local71 = 0;
			}
			Static133.anIntArray448[local25++] = local71;
		}
		@Pc(101) int local101;
		@Pc(108) int local108;
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			@Pc(99) int local99 = local71 * 128;
			for (local101 = 0; local101 < 128; local101++) {
				local108 = (int) (Math.random() * 100.0D);
				if (local108 < 50 && local101 > 10 && local101 < 118) {
					Static133.anIntArray448[local101 + local99] = 255;
				} else {
					Static133.anIntArray448[local101 + local99] = 0;
				}
			}
		}
		if (Static62.anInt1530 > 0) {
			Static62.anInt1530 -= arg0 * 4;
		}
		if (Static38.anInt1481 > 0) {
			Static38.anInt1481 -= arg0 * 4;
		}
		if (Static38.anInt1481 == 0 && Static62.anInt1530 == 0) {
			local101 = (int) ((double) (2000 / arg0) * Math.random());
			if (local101 == 0) {
				Static38.anInt1481 = 1024;
			}
			if (local101 == 1) {
				Static62.anInt1530 = 1024;
			}
		}
		for (local101 = 0; local101 < 256 - arg0; local101++) {
			Static41.anIntArray292[local101] = Static41.anIntArray292[local101 + arg0];
		}
		for (local108 = 256 - arg0; local108 < 256; local108++) {
			Static41.anIntArray292[local108] = (int) (Math.sin((double) Static90.anInt2397 / 14.0D) * 16.0D + Math.sin((double) Static90.anInt2397 / 15.0D) * 14.0D + Math.sin((double) Static90.anInt2397 / 16.0D) * 12.0D);
			Static90.anInt2397++;
		}
		Static65.anInt1587 += arg0;
		@Pc(281) int local281 = ((Static58.anInt1422 & 0x1) + arg0) / 2;
		if (local281 <= 0) {
			return;
		}
		@Pc(294) int local294;
		@Pc(301) int local301;
		for (@Pc(285) int local285 = 0; local285 < Static65.anInt1587 * 100; local285++) {
			local294 = (int) (Math.random() * 124.0D) + 2;
			local301 = (int) (Math.random() * 128.0D) + 128;
			Static133.anIntArray448[local294 + (local301 << 7)] = 192;
		}
		Static65.anInt1587 = 0;
		@Pc(332) int local332;
		@Pc(335) int local335;
		for (local294 = 0; local294 < 256; local294++) {
			local301 = 0;
			local332 = local294 * 128;
			for (local335 = -local281; local335 < 128; local335++) {
				if (local335 + local281 < 128) {
					local301 += Static133.anIntArray448[local281 + local332 + local335];
				}
				if (local335 - local281 - 1 >= 0) {
					local301 -= Static133.anIntArray448[local332 + local335 - local281 - 1];
				}
				if (local335 >= 0) {
					Static32.anIntArray154[local332 + local335] = local301 / (local281 * 2 + 1);
				}
			}
		}
		for (local301 = 0; local301 < 128; local301++) {
			local332 = 0;
			for (local335 = -local281; local335 < 256; local335++) {
				@Pc(417) int local417 = local335 * 128;
				if (local281 + local335 < 256) {
					local332 += Static32.anIntArray154[local417 + local301 + local281 * 128];
				}
				if (local335 - local281 - 1 >= 0) {
					local332 -= Static32.anIntArray154[local301 + local417 - (local281 + 1) * 128];
				}
				if (local335 >= 0) {
					Static133.anIntArray448[local417 + local301] = local332 / (local281 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILclient!ke;)V")
	public static void method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub11 arg2) {
		if (arg2.anInt1631 == 1) {
			Static92.method1470(arg2.aClass61_508, 0, Static96.aClass61_746, arg2.anInt1614, 0, 29);
		}
		if (arg2.anInt1631 == 2 && !Static32.aBoolean27) {
			@Pc(33) Class61 local33 = Static53.method985(arg2);
			if (local33 != null) {
				Static92.method1470(local33, 0, Static123.method1929(new Class61[] { Static83.aClass61_657, arg2.aClass61_505 }), arg2.anInt1614, -1, 22);
			}
		}
		if (arg2.anInt1631 == 3) {
			Static92.method1470(Static90.aClass61_702, 0, Static96.aClass61_746, arg2.anInt1614, 0, 8);
		}
		if (arg2.anInt1631 == 4) {
			Static92.method1470(arg2.aClass61_508, 0, Static96.aClass61_746, arg2.anInt1614, 0, 35);
		}
		if (arg2.anInt1631 == 5) {
			Static92.method1470(arg2.aClass61_508, 0, Static96.aClass61_746, arg2.anInt1614, 0, 47);
		}
		if (arg2.anInt1631 == 6 && Static90.aClass5_Sub11_9 == null) {
			Static92.method1470(arg2.aClass61_508, 0, Static96.aClass61_746, arg2.anInt1614, -1, 3);
		}
		@Pc(149) int local149;
		@Pc(143) int local143;
		if (arg2.anInt1669 == 2) {
			local143 = 0;
			for (@Pc(145) int local145 = 0; local145 < arg2.anInt1636; local145++) {
				for (local149 = 0; local149 < arg2.anInt1653; local149++) {
					@Pc(159) int local159 = local149 * (arg2.anInt1635 + 32);
					@Pc(166) int local166 = (arg2.anInt1616 + 32) * local145;
					if (local143 < 20) {
						local159 += arg2.anIntArray239[local143];
						local166 += arg2.anIntArray245[local143];
					}
					if (arg0 >= local159 && arg1 >= local166 && local159 + 32 > arg0 && arg1 < local166 + 32) {
						Static21.aClass5_Sub11_2 = arg2;
						Static60.anInt1457 = local143;
						if (arg2.anIntArray246[local143] > 0) {
							@Pc(228) Class5_Sub2_Sub11 local228 = Static111.method1830(arg2.anIntArray246[local143] - 1);
							if (Static123.anInt3071 == 1 && Static77.method1251(Static42.method755(arg2))) {
								if (Static86.anInt2322 != arg2.anInt1614 || local143 != Static112.anInt2933) {
									Static92.method1470(Static30.aClass61_277, local228.anInt1965, Static123.method1929(new Class61[] { Static86.aClass61_673, Static77.aClass61_590, local228.aClass61_597 }), arg2.anInt1614, local143, 6);
								}
							} else if (!Static32.aBoolean27 || !Static77.method1251(Static42.method755(arg2))) {
								@Pc(252) Class61[] local252 = local228.aClass61Array15;
								if (Static90.aBoolean83) {
									local252 = Static40.method737(local252);
								}
								@Pc(266) int local266;
								@Pc(316) byte local316;
								if (Static77.method1251(Static42.method755(arg2))) {
									for (local266 = 4; local266 >= 3; local266--) {
										if (local252 != null && local252[local266] != null) {
											if (local266 == 3) {
												local316 = 40;
											} else {
												local316 = 7;
											}
											Static92.method1470(local252[local266], local228.anInt1965, Static123.method1929(new Class61[] { Static82.aClass61_652, local228.aClass61_597 }), arg2.anInt1614, local143, local316);
										} else if (local266 == 4) {
											Static92.method1470(Static48.aClass61_380, local228.anInt1965, Static123.method1929(new Class61[] { Static82.aClass61_652, local228.aClass61_597 }), arg2.anInt1614, local143, 7);
										}
									}
								}
								if (Static83.method1503(Static42.method755(arg2))) {
									Static92.method1470(Static30.aClass61_277, local228.anInt1965, Static123.method1929(new Class61[] { Static82.aClass61_652, local228.aClass61_597 }), arg2.anInt1614, local143, 18);
								}
								if (Static77.method1251(Static42.method755(arg2)) && local252 != null) {
									for (local266 = 2; local266 >= 0; local266--) {
										if (local252[local266] != null) {
											local316 = 0;
											if (local266 == 0) {
												local316 = 45;
											}
											if (local266 == 1) {
												local316 = 23;
											}
											if (local266 == 2) {
												local316 = 16;
											}
											Static92.method1470(local252[local266], local228.anInt1965, Static123.method1929(new Class61[] { Static82.aClass61_652, local228.aClass61_597 }), arg2.anInt1614, local143, local316);
										}
									}
								}
								local252 = arg2.aClass61Array10;
								if (Static90.aBoolean83) {
									local252 = Static40.method737(local252);
								}
								if (local252 != null) {
									for (local266 = 4; local266 >= 0; local266--) {
										if (local252[local266] != null) {
											local316 = 0;
											if (local266 == 0) {
												local316 = 4;
											}
											if (local266 == 1) {
												local316 = 44;
											}
											if (local266 == 2) {
												local316 = 42;
											}
											if (local266 == 3) {
												local316 = 58;
											}
											if (local266 == 4) {
												local316 = 28;
											}
											Static92.method1470(local252[local266], local228.anInt1965, Static123.method1929(new Class61[] { Static82.aClass61_652, local228.aClass61_597 }), arg2.anInt1614, local143, local316);
										}
									}
								}
								Static92.method1470(Static133.aClass61_1094, local228.anInt1965, Static123.method1929(new Class61[] { Static82.aClass61_652, local228.aClass61_597 }), arg2.anInt1614, local143, 1002);
							} else if ((Static73.anInt1738 & 0x10) == 16) {
								Static92.method1470(Static91.aClass61_717, local228.anInt1965, Static123.method1929(new Class61[] { Static50.aClass61_396, Static77.aClass61_590, local228.aClass61_597 }), arg2.anInt1614, local143, 25);
							}
						}
					}
					local143++;
				}
			}
		}
		if (!arg2.aBoolean66) {
			return;
		}
		if (Static32.aBoolean27) {
			if (Static12.method238(Static42.method755(arg2)) && (Static73.anInt1738 & 0x20) == 32) {
				Static92.method1470(Static91.aClass61_717, 0, Static123.method1929(new Class61[] { Static50.aClass61_396, Static109.aClass61_844, arg2.aClass61_510 }), arg2.anInt1614, arg2.anInt1645, 2);
				return;
			}
			return;
		}
		@Pc(709) Class61 local709;
		for (local143 = 9; local143 >= 5; local143--) {
			local709 = Static102.method1740(arg2, local143);
			if (local709 != null) {
				Static92.method1470(local709, local143 + 1, arg2.aClass61_510, arg2.anInt1614, arg2.anInt1645, 1004);
			}
		}
		local709 = Static53.method985(arg2);
		if (local709 != null) {
			Static92.method1470(local709, 0, arg2.aClass61_510, arg2.anInt1614, arg2.anInt1645, 22);
		}
		for (local149 = 4; local149 >= 0; local149--) {
			@Pc(762) Class61 local762 = Static102.method1740(arg2, local149);
			if (local762 != null) {
				Static92.method1470(local762, local149 + 1, arg2.aClass61_510, arg2.anInt1614, arg2.anInt1645, 24);
			}
		}
		if (Static36.method696(Static42.method755(arg2))) {
			Static92.method1470(Static92.aClass61_648, 0, Static96.aClass61_746, arg2.anInt1614, arg2.anInt1645, 3);
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ke;Z)Lclient!ke;")
	public static Class5_Sub11 method643(@OriginalArg(0) Class5_Sub11 arg0) {
		@Pc(12) int local12 = Static26.method434(Static42.method755(arg0));
		if (local12 == 0) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < local12; local25++) {
			arg0 = Static88.method2191(arg0.anInt1681);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!ff;)V")
	public static void method644(@OriginalArg(1) Class26 arg0) {
		Static98.aClass26_22 = arg0;
	}
}
