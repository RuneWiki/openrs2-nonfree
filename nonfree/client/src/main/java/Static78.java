import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!hf", name = "jb", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_11;

	@OriginalMember(owner = "client!hf", name = "rb", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_12;

	@OriginalMember(owner = "client!hf", name = "ub", descriptor = "Lclient!ke;")
	public static Class52 aClass52_18;

	@OriginalMember(owner = "client!hf", name = "db", descriptor = "[I")
	public static final int[] anIntArray84 = new int[128];

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)Lclient!ad;")
	public static Class3_Sub3_Sub1 method1141(@OriginalArg(1) int arg0) {
		@Pc(19) Class3_Sub3_Sub1 local19 = (Class3_Sub3_Sub1) Static74.aClass85_15.method2558((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(33) byte[] local33 = Static76.aClass52_17.method1581(Static4.method62(arg0), Static37.method2343(arg0));
		local19 = new Class3_Sub3_Sub1();
		local19.anInt112 = arg0;
		if (local33 != null) {
			local19.method91(new Class3_Sub4(local33));
		}
		Static74.aClass85_15.method2560(local19, (long) arg0);
		return local19;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZLclient!we;)V")
	public static void method1142(@OriginalArg(0) int arg0, @OriginalArg(2) Class26_Sub2 arg1) {
		if (arg1.anInt2624 > Static184.anInt3760) {
			Static30.method554(arg1);
		} else if (arg1.anInt2640 < Static184.anInt3760) {
			Static107.method2407(arg1);
		} else {
			Static61.method941(arg1);
		}
		if (arg1.anInt2593 < 128 || arg1.anInt2611 < 128 || arg1.anInt2593 >= 13184 || arg1.anInt2611 >= 13184) {
			arg1.anInt2640 = 0;
			arg1.anInt2608 = -1;
			arg1.anInt2624 = 0;
			arg1.anInt2599 = -1;
			arg1.anInt2611 = arg1.anIntArray185[0] * 128 + arg1.anInt2604 * 64;
			arg1.anInt2593 = arg1.anIntArray182[0] * 128 + arg1.anInt2604 * 64;
			arg1.method1856();
		}
		if (arg1 == Static144.aClass26_Sub2_Sub1_1 && (arg1.anInt2593 < 1536 || arg1.anInt2611 < 1536 || arg1.anInt2593 >= 11776 || arg1.anInt2611 >= 11776)) {
			arg1.anInt2599 = -1;
			arg1.anInt2624 = 0;
			arg1.anInt2611 = arg1.anInt2604 * 64 + arg1.anIntArray185[0] * 128;
			arg1.anInt2593 = arg1.anInt2604 * 64 + arg1.anIntArray182[0] * 128;
			arg1.anInt2640 = 0;
			arg1.anInt2608 = -1;
			arg1.method1856();
		}
		Static145.method2122(arg1);
		Static75.method1079(arg1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ij;III)V")
	public static void method1143(@OriginalArg(0) int arg0, @OriginalArg(1) Class26_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == Static144.aClass26_Sub2_Sub1_1 || Static35.anInt770 >= 400) {
			return;
		}
		@Pc(61) Class70 local61;
		if (arg1.anInt1945 == 0) {
			local61 = Static207.method3296(new Class70[] { arg1.aClass70_952, Static59.method1602(arg1.anInt1947, Static144.aClass26_Sub2_Sub1_1.anInt1947), Static186.aClass70_1840, Static183.aClass70_1369, Static107.method2404(arg1.anInt1947), Static47.aClass70_477 });
		} else {
			local61 = Static207.method3296(new Class70[] { arg1.aClass70_952, Static186.aClass70_1840, Static143.aClass70_1354, Static107.method2404(arg1.anInt1945), Static47.aClass70_477 });
		}
		@Pc(134) int local134;
		if (Static210.anInt4244 == 1) {
			Static50.method784((short) 30, arg0, Static41.aClass70_428, Static207.method3296(new Class70[] { Static2.aClass70_2, Static84.aClass70_829, local61 }), (long) arg3, arg2);
		} else if (!Static5.aBoolean7) {
			for (local134 = 7; local134 >= 0; local134--) {
				if (Static124.aClass70Array71[local134] != null) {
					@Pc(145) short local145 = 0;
					if (Static55.anInt1196 == 0 && Static124.aClass70Array71[local134].method2059(Static178.aClass70_1749)) {
						if (Static144.aClass26_Sub2_Sub1_1.anInt1947 < arg1.anInt1947) {
							local145 = 2000;
						}
						if (Static144.aClass26_Sub2_Sub1_1.anInt1955 != 0 && arg1.anInt1955 != 0) {
							if (Static144.aClass26_Sub2_Sub1_1.anInt1955 == arg1.anInt1955) {
								local145 = 2000;
							} else {
								local145 = 0;
							}
						}
					} else if (Static36.aBooleanArray1[local134]) {
						local145 = 2000;
					}
					@Pc(196) short local196 = Static182.aShortArray60[local134];
					@Pc(201) short local201 = (short) (local196 + local145);
					Static50.method784(local201, arg0, Static124.aClass70Array71[local134], Static207.method3296(new Class70[] { Static211.aClass70_2097, local61 }), (long) arg3, arg2);
				}
			}
		} else if ((Static117.anInt2370 & 0x8) == 8) {
			Static50.method784((short) 8, arg0, Static136.aClass70_1289, Static207.method3296(new Class70[] { Static110.aClass70_1097, Static84.aClass70_829, local61 }), (long) arg3, arg2);
		}
		for (local134 = 0; local134 < Static35.anInt770; local134++) {
			if (Static55.aShortArray13[local134] == 22) {
				Static49.aClass70Array21[local134] = Static207.method3296(new Class70[] { Static211.aClass70_2097, local61 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILclient!b;I)V")
	public static void method1146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) int arg3) {
		Static48.method3330();
		Static104.method3092(arg1, arg0, arg1 + arg2.anInt244, arg0 + arg2.anInt217);
		if (Static211.anInt4256 == 2 || Static211.anInt4256 == 5) {
			Static104.method3093(arg1, arg0, arg2.anIntArray13, arg2.anIntArray19);
		} else {
			@Pc(35) int local35 = Static179.anInt1329 + Static62.anInt1310 & 0x7FF;
			@Pc(43) int local43 = Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32 + 48;
			@Pc(51) int local51 = 464 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
			Static19.aClass3_Sub3_Sub2_Sub1_1.method202(arg1, arg0, arg2.anInt244, arg2.anInt217, local43, local51, local35, Static212.anInt4284 + 256, arg2.anIntArray13, arg2.anIntArray19);
			@Pc(87) int local87;
			@Pc(101) int local101;
			for (@Pc(71) int local71 = 0; local71 < Static96.anInt2000; local71++) {
				local87 = Static85.anIntArray90[local71] * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
				local101 = Static201.anIntArray357[local71] * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
				@Pc(107) Class3_Sub3_Sub9 local107 = Static161.method2421(Static73.anIntArray78[local71]);
				if (local107.anIntArray52 != null) {
					local107 = local107.method769();
					if (local107 == null || local107.anInt999 == -1) {
						continue;
					}
				}
				Static196.method3056(local101, arg2, local87, arg0, Static41.aClass3_Sub3_Sub2_Sub1Array6[local107.anInt999], arg1);
			}
			@Pc(179) int local179;
			for (local87 = 0; local87 < 104; local87++) {
				for (local101 = 0; local101 < 104; local101++) {
					@Pc(153) Class10 local153 = Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local87][local101];
					if (local153 != null) {
						@Pc(167) int local167 = local87 * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
						local179 = local101 * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
						Static196.method3056(local179, arg2, local167, arg0, Static109.aClass3_Sub3_Sub2_Sub1Array9[0], arg1);
					}
				}
			}
			@Pc(257) int local257;
			for (local101 = 0; local101 < Static201.anInt4110; local101++) {
				@Pc(209) Class26_Sub2_Sub2 local209 = Static8.aClass26_Sub2_Sub2Array1[Static80.anIntArray85[local101]];
				if (local209 != null && local209.method1861()) {
					@Pc(218) Class3_Sub3_Sub24 local218 = local209.aClass3_Sub3_Sub24_1;
					if (local218 != null && local218.anIntArray344 != null) {
						local218 = local218.method3065();
					}
					if (local218 != null && local218.aBoolean178 && local218.aBoolean177) {
						local179 = local209.anInt2593 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
						local257 = local209.anInt2611 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
						Static196.method3056(local257, arg2, local179, arg0, Static109.aClass3_Sub3_Sub2_Sub1Array9[1], arg1);
					}
				}
			}
			for (@Pc(277) int local277 = 0; local277 < Static80.anInt1607; local277++) {
				@Pc(285) Class26_Sub2_Sub1 local285 = Static146.aClass26_Sub2_Sub1Array1[Static76.anIntArray81[local277]];
				if (local285 != null && local285.method1861()) {
					local257 = local285.anInt2611 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
					local179 = local285.anInt2593 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
					@Pc(318) long local318 = local285.aClass70_952.method2018();
					@Pc(320) boolean local320 = false;
					for (@Pc(322) int local322 = 0; local322 < Static13.anInt318; local322++) {
						if (Static70.aLongArray1[local322] == local318 && Static179.anIntArray74[local322] != 0) {
							local320 = true;
							break;
						}
					}
					@Pc(347) boolean local347 = false;
					if (Static144.aClass26_Sub2_Sub1_1.anInt1955 != 0 && local285.anInt1955 != 0 && Static144.aClass26_Sub2_Sub1_1.anInt1955 == local285.anInt1955) {
						local347 = true;
					}
					if (local320) {
						Static196.method3056(local257, arg2, local179, arg0, Static109.aClass3_Sub3_Sub2_Sub1Array9[3], arg1);
					} else if (local347) {
						Static196.method3056(local257, arg2, local179, arg0, Static109.aClass3_Sub3_Sub2_Sub1Array9[4], arg1);
					} else {
						Static196.method3056(local257, arg2, local179, arg0, Static109.aClass3_Sub3_Sub2_Sub1Array9[2], arg1);
					}
				}
			}
			@Pc(411) Class42[] local411 = Static192.aClass42Array1;
			@Pc(507) int local507;
			for (local179 = 0; local179 < local411.length; local179++) {
				@Pc(419) Class42 local419 = local411[local179];
				if (local419 != null && local419.anInt1605 != 0 && Static184.anInt3760 % 20 < 10) {
					@Pc(476) int local476;
					@Pc(465) int local465;
					if (local419.anInt1605 == 1 && local419.anInt1602 >= 0 && local419.anInt1602 < Static8.aClass26_Sub2_Sub2Array1.length) {
						@Pc(452) Class26_Sub2_Sub2 local452 = Static8.aClass26_Sub2_Sub2Array1[local419.anInt1602];
						if (local452 != null) {
							local465 = local452.anInt2593 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
							local476 = local452.anInt2611 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
							Static60.method2383(local419.anInt1600, arg1, arg0, arg2, local476, local465);
						}
					}
					if (local419.anInt1605 == 2) {
						local507 = (local419.anInt1601 + -Static30.anInt695) * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
						local465 = (-Static55.anInt1184 + local419.anInt1606) * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
						Static60.method2383(local419.anInt1600, arg1, arg0, arg2, local465, local507);
					}
					if (local419.anInt1605 == 10 && local419.anInt1602 >= 0 && Static146.aClass26_Sub2_Sub1Array1.length > local419.anInt1602) {
						@Pc(556) Class26_Sub2_Sub1 local556 = Static146.aClass26_Sub2_Sub1Array1[local419.anInt1602];
						if (local556 != null) {
							local465 = local556.anInt2593 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
							local476 = local556.anInt2611 / 32 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
							Static60.method2383(local419.anInt1600, arg1, arg0, arg2, local476, local465);
						}
					}
				}
			}
			if (Static65.anInt1365 != 0) {
				local257 = Static65.anInt1365 * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2593 / 32;
				local507 = Static101.anInt2072 * 4 + 2 - Static144.aClass26_Sub2_Sub1_1.anInt2611 / 32;
				Static196.method3056(local507, arg2, local257, arg0, Static160.aClass3_Sub3_Sub2_Sub1_7, arg1);
			}
			Static104.method3079(arg1 + arg2.anInt244 / 2 - 1, arg0 - -(arg2.anInt217 / 2) + -1, 3, 3, 16777215);
		}
		Static70.aBooleanArray3[arg3] = true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ce;)Lclient!oc;")
	public static Class70 method1147(@OriginalArg(1) Class3_Sub4 arg0) {
		return Static52.method834(arg0);
	}
}
