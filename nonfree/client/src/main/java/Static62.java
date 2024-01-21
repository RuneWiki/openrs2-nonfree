import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	public static int anInt1362;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Lclient!mf;")
	public static Class69 aClass69_5;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
	public static int anInt1366;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_473 = Static161.method2452(" )2>");

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_475 = Static161.method2452("Your account has been disabled)3");

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!dc;")
	public static Class20 aClass20_474 = aClass20_475;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "[I")
	public static final int[] anIntArray128 = new int[256];

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIBLclient!ld;)V")
	public static void method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub2_Sub2 arg3) {
		if (arg3 == Static210.aClass1_Sub2_Sub2_2 || Static85.anInt1879 >= 400) {
			return;
		}
		@Pc(47) Class20 local47;
		if (arg3.anInt2276 == 0) {
			local47 = Static70.method1166(new Class20[] { arg3.aClass20_848, Static3.method97(Static210.aClass1_Sub2_Sub2_2.anInt2275, arg3.anInt2275), Static186.aClass20_1373, Static116.aClass20_900, Static132.method2805(arg3.anInt2275), Static65.aClass20_489 });
		} else {
			local47 = Static70.method1166(new Class20[] { arg3.aClass20_848, Static186.aClass20_1373, Static165.aClass20_839, Static132.method2805(arg3.anInt2276), Static65.aClass20_489 });
		}
		@Pc(124) int local124;
		if (Static57.anInt1307 == 1) {
			Static175.method2670((long) arg2, (short) 40, arg1, Static70.method1166(new Class20[] { Static196.aClass20_1443, Static26.aClass20_1502, local47 }), Static180.aClass20_1324, arg0);
		} else if (!Static28.aBoolean32) {
			for (local124 = 7; local124 >= 0; local124--) {
				if (Static146.aClass20Array25[local124] != null) {
					@Pc(132) short local132 = 0;
					if (Static167.anInt3347 == 0 && Static146.aClass20Array25[local124].method551(Static61.aClass20_464)) {
						if (Static210.aClass1_Sub2_Sub2_2.anInt2275 < arg3.anInt2275) {
							local132 = 2000;
						}
						if (Static210.aClass1_Sub2_Sub2_2.anInt2284 != 0 && arg3.anInt2284 != 0) {
							if (arg3.anInt2284 == Static210.aClass1_Sub2_Sub2_2.anInt2284) {
								local132 = 2000;
							} else {
								local132 = 0;
							}
						}
					} else if (Static67.aBooleanArray47[local124]) {
						local132 = 2000;
					}
					@Pc(186) short local186 = Static197.aShortArray59[local124];
					@Pc(191) short local191 = (short) (local186 + local132);
					Static175.method2670((long) arg2, local191, arg1, Static70.method1166(new Class20[] { Static3.aClass20_35, local47 }), Static146.aClass20Array25[local124], arg0);
				}
			}
		} else if ((Static22.anInt2837 & 0x8) == 8) {
			Static175.method2670((long) arg2, (short) 38, arg1, Static70.method1166(new Class20[] { Static10.aClass20_115, Static26.aClass20_1502, local47 }), Static96.aClass20_754, arg0);
		}
		for (local124 = 0; local124 < Static85.anInt1879; local124++) {
			if (Static151.aShortArray40[local124] == 5) {
				Static193.aClass20Array31[local124] = Static70.method1166(new Class20[] { Static3.aClass20_35, local47 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
	public static void method1030() {
		@Pc(3) int local3 = Static77.anIntArray351[Static80.anInt1804];
		@Pc(7) Class64[] local7 = Static77.aClass64ArrayArray11[Static80.anInt1804];
		Static29.anInt575 = 0;
		label187: for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class64 local16 = local7[local11];
			@Pc(20) int local20;
			if (Static72.anIntArray142 != null) {
				for (local20 = 0; local20 < Static72.anIntArray142.length; local20++) {
					if (Static72.anIntArray142[local20] != -1000000 && (local16.anInt2380 <= Static72.anIntArray142[local20] || local16.anInt2378 <= Static72.anIntArray142[local20]) && (local16.anInt2395 <= Static132.anIntArray383[local20] || local16.anInt2381 <= Static132.anIntArray383[local20]) && (local16.anInt2395 >= Static154.anIntArray342[local20] || local16.anInt2381 >= Static154.anIntArray342[local20]) && (local16.anInt2392 <= Static174.anIntArray368[local20] || local16.anInt2382 <= Static174.anIntArray368[local20]) && (local16.anInt2392 >= Static159.anIntArray349[local20] || local16.anInt2382 >= Static159.anIntArray349[local20])) {
						continue label187;
					}
				}
			}
			@Pc(118) int local118;
			@Pc(129) int local129;
			@Pc(161) int local161;
			@Pc(140) boolean local140;
			if (local16.anInt2396 == 1) {
				local20 = local16.anInt2389 + Static74.anInt1609 - Static212.anInt4111;
				if (local20 >= 0 && local20 <= Static74.anInt1609 + Static74.anInt1609) {
					local118 = local16.anInt2379 + Static74.anInt1609 - Static174.anInt3487;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt2386 + Static74.anInt1609 - Static174.anInt3487;
					if (local129 > Static74.anInt1609 + Static74.anInt1609) {
						local129 = Static74.anInt1609 + Static74.anInt1609;
					}
					local140 = false;
					while (local118 <= local129) {
						if (Static188.aBooleanArrayArray2[local20][local118++]) {
							local140 = true;
							break;
						}
					}
					if (local140) {
						local161 = Static37.anInt1357 - local16.anInt2395;
						if (local161 > 32) {
							local16.anInt2384 = 1;
						} else {
							if (local161 >= -32) {
								continue;
							}
							local16.anInt2384 = 2;
							local161 = -local161;
						}
						local16.anInt2388 = (local16.anInt2392 - Static132.anInt3725 << 8) / local161;
						local16.anInt2377 = (local16.anInt2382 - Static132.anInt3725 << 8) / local161;
						local16.anInt2397 = (local16.anInt2380 - Static117.anInt2448 << 8) / local161;
						local16.anInt2391 = (local16.anInt2378 - Static117.anInt2448 << 8) / local161;
						Static4.aClass64Array1[Static29.anInt575++] = local16;
					}
				}
			} else if (local16.anInt2396 == 2) {
				local20 = local16.anInt2379 + Static74.anInt1609 - Static174.anInt3487;
				if (local20 >= 0 && local20 <= Static74.anInt1609 + Static74.anInt1609) {
					local118 = local16.anInt2389 + Static74.anInt1609 - Static212.anInt4111;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt2373 + Static74.anInt1609 - Static212.anInt4111;
					if (local129 > Static74.anInt1609 + Static74.anInt1609) {
						local129 = Static74.anInt1609 + Static74.anInt1609;
					}
					local140 = false;
					while (local118 <= local129) {
						if (Static188.aBooleanArrayArray2[local118++][local20]) {
							local140 = true;
							break;
						}
					}
					if (local140) {
						local161 = Static132.anInt3725 - local16.anInt2392;
						if (local161 > 32) {
							local16.anInt2384 = 3;
						} else {
							if (local161 >= -32) {
								continue;
							}
							local16.anInt2384 = 4;
							local161 = -local161;
						}
						local16.anInt2387 = (local16.anInt2395 - Static37.anInt1357 << 8) / local161;
						local16.anInt2390 = (local16.anInt2381 - Static37.anInt1357 << 8) / local161;
						local16.anInt2397 = (local16.anInt2380 - Static117.anInt2448 << 8) / local161;
						local16.anInt2391 = (local16.anInt2378 - Static117.anInt2448 << 8) / local161;
						Static4.aClass64Array1[Static29.anInt575++] = local16;
					}
				}
			} else if (local16.anInt2396 == 4) {
				local20 = local16.anInt2380 - Static117.anInt2448;
				if (local20 > 128) {
					local118 = local16.anInt2379 + Static74.anInt1609 - Static174.anInt3487;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt2386 + Static74.anInt1609 - Static174.anInt3487;
					if (local129 > Static74.anInt1609 + Static74.anInt1609) {
						local129 = Static74.anInt1609 + Static74.anInt1609;
					}
					if (local118 <= local129) {
						@Pc(411) int local411 = local16.anInt2389 + Static74.anInt1609 - Static212.anInt4111;
						if (local411 < 0) {
							local411 = 0;
						}
						local161 = local16.anInt2373 + Static74.anInt1609 - Static212.anInt4111;
						if (local161 > Static74.anInt1609 + Static74.anInt1609) {
							local161 = Static74.anInt1609 + Static74.anInt1609;
						}
						@Pc(433) boolean local433 = false;
						label159: for (@Pc(435) int local435 = local411; local435 <= local161; local435++) {
							for (@Pc(438) int local438 = local118; local438 <= local129; local438++) {
								if (Static188.aBooleanArrayArray2[local435][local438]) {
									local433 = true;
									break label159;
								}
							}
						}
						if (local433) {
							local16.anInt2384 = 5;
							local16.anInt2387 = (local16.anInt2395 - Static37.anInt1357 << 8) / local20;
							local16.anInt2390 = (local16.anInt2381 - Static37.anInt1357 << 8) / local20;
							local16.anInt2388 = (local16.anInt2392 - Static132.anInt3725 << 8) / local20;
							local16.anInt2377 = (local16.anInt2382 - Static132.anInt3725 << 8) / local20;
							Static4.aClass64Array1[Static29.anInt575++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
	public static void method1031(@OriginalArg(1) int arg0) {
		Static148.anInt3057 = -1;
		Static212.anInt4113 = arg0;
		Static129.anInt2701 = -1;
		Static117.method1868();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)Z")
	public static boolean method1033(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
