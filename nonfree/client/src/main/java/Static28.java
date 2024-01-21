import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "Lclient!fd;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!cg", name = "vb", descriptor = "I")
	public static int anInt862;

	@OriginalMember(owner = "client!cg", name = "X", descriptor = "Lclient!gg;")
	private static Class28 aClass28_535 = Static107.method1838("Login limit exceeded)3");

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "Lclient!gg;")
	public static Class28 aClass28_533 = aClass28_535;

	@OriginalMember(owner = "client!cg", name = "Y", descriptor = "Lclient!gg;")
	public static Class28 aClass28_536 = Static107.method1838("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!cg", name = "gb", descriptor = "[I")
	public static int[] anIntArray68 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!cg", name = "hb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_537 = Static107.method1838("Benutzen");

	@OriginalMember(owner = "client!cg", name = "lb", descriptor = "I")
	public static int anInt855 = -1;

	@OriginalMember(owner = "client!cg", name = "ub", descriptor = "[I")
	public static int[] anIntArray69 = new int[5];

	@OriginalMember(owner = "client!cg", name = "Hb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_539 = Static107.method1838("Use");

	@OriginalMember(owner = "client!cg", name = "Gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_538 = aClass28_539;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public static void method586() {
		aClass22_2 = null;
		aClass28_536 = null;
		anIntArray68 = null;
		aClass28_533 = null;
		aClass28_538 = null;
		aClass28_537 = null;
		anIntArray69 = null;
		aClass28_539 = null;
		aClass28_535 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)V")
	public static void method587(@OriginalArg(1) int arg0) {
		Static114.anInt2752 += arg0 * 128;
		@Pc(27) int local27;
		if (Static19.anIntArray71.length < Static114.anInt2752) {
			Static114.anInt2752 -= Static19.anIntArray71.length;
			local27 = (int) (Math.random() * 12.0D);
			Static142.method2253(Static162.aClass2_Sub4_Sub3_Sub3Array9[local27]);
		}
		local27 = 0;
		@Pc(38) int local38 = arg0 * 128;
		@Pc(45) int local45 = (256 - arg0) * 128;
		@Pc(71) int local71;
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			local71 = Static48.anIntArray106[local38 + local27] - Static19.anIntArray71[local27 + Static114.anInt2752 & Static19.anIntArray71.length - 1] * arg0 / 6;
			if (local71 < 0) {
				local71 = 0;
			}
			Static48.anIntArray106[local27++] = local71;
		}
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			local105 = local71 * 128;
			for (local107 = 0; local107 < 128; local107++) {
				local114 = (int) (Math.random() * 100.0D);
				if (local114 < 50 && local107 > 10 && local107 < 118) {
					Static48.anIntArray106[local105 + local107] = 255;
				} else {
					Static48.anIntArray106[local107 + local105] = 0;
				}
			}
		}
		if (Static95.anInt2366 > 0) {
			Static95.anInt2366 -= arg0 * 4;
		}
		if (Static62.anInt1684 > 0) {
			Static62.anInt1684 -= arg0 * 4;
		}
		if (Static62.anInt1684 == 0 && Static95.anInt2366 == 0) {
			local105 = (int) (Math.random() * (double) (2000 / arg0));
			if (local105 == 1) {
				Static95.anInt2366 = 1024;
			}
			if (local105 == 0) {
				Static62.anInt1684 = 1024;
			}
		}
		for (local105 = 0; local105 < 256 - arg0; local105++) {
			Static74.anIntArray189[local105] = Static74.anIntArray189[local105 + arg0];
		}
		for (local107 = 256 - arg0; local107 < 256; local107++) {
			Static74.anIntArray189[local107] = (int) (Math.sin((double) Static149.anInt3360 / 14.0D) * 16.0D + Math.sin((double) Static149.anInt3360 / 15.0D) * 14.0D + Math.sin((double) Static149.anInt3360 / 16.0D) * 12.0D);
			Static149.anInt3360++;
		}
		local114 = (arg0 + (Static156.anInt3491 & 0x1)) / 2;
		Static120.anInt2868 += arg0;
		if (local114 <= 0) {
			return;
		}
		@Pc(284) int local284;
		@Pc(291) int local291;
		for (@Pc(275) int local275 = 0; local275 < Static120.anInt2868 * 100; local275++) {
			local284 = (int) (Math.random() * 124.0D) + 2;
			local291 = (int) (Math.random() * 128.0D) + 128;
			Static48.anIntArray106[local284 + (local291 << 7)] = 192;
		}
		Static120.anInt2868 = 0;
		@Pc(322) int local322;
		@Pc(325) int local325;
		for (local284 = 0; local284 < 256; local284++) {
			local291 = 0;
			local322 = local284 * 128;
			for (local325 = -local114; local325 < 128; local325++) {
				if (local325 + local114 < 128) {
					local291 += Static48.anIntArray106[local114 + local322 + local325];
				}
				if (local325 - local114 - 1 >= 0) {
					local291 -= Static48.anIntArray106[local325 + local322 - local114 - 1];
				}
				if (local325 >= 0) {
					Static141.anIntArray284[local322 + local325] = local291 / (local114 * 2 + 1);
				}
			}
		}
		for (local291 = 0; local291 < 128; local291++) {
			local322 = 0;
			for (local325 = -local114; local325 < 256; local325++) {
				@Pc(403) int local403 = local325 * 128;
				if (local114 + local325 < 256) {
					local322 += Static141.anIntArray284[local114 * 128 + local291 + local403];
				}
				if (local325 - local114 - 1 >= 0) {
					local322 -= Static141.anIntArray284[local291 + local403 - (local114 + 1) * 128];
				}
				if (local325 >= 0) {
					Static48.anIntArray106[local403 + local291] = local322 / (local114 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
	public static void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static54.anInt1391 = 0;
		@Pc(81) int local81;
		for (@Pc(13) int local13 = -1; local13 < Static35.anInt973 + Static29.anInt884; local13++) {
			@Pc(32) Class2_Sub4_Sub1_Sub1 local32;
			if (local13 == -1) {
				local32 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2;
			} else if (Static35.anInt973 > local13) {
				local32 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[Static160.anIntArray327[local13]];
			} else {
				local32 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[Static129.anIntArray274[local13 - Static35.anInt973]];
			}
			if (local32 != null && local32.method1093()) {
				@Pc(62) Class2_Sub4_Sub4 local62;
				if (local32 instanceof Class2_Sub4_Sub1_Sub1_Sub1) {
					local62 = ((Class2_Sub4_Sub1_Sub1_Sub1) local32).aClass2_Sub4_Sub4_1;
					if (local62.anIntArray66 != null) {
						local62 = local62.method595();
					}
					if (local62 == null) {
						continue;
					}
				}
				if (Static35.anInt973 <= local13) {
					local62 = ((Class2_Sub4_Sub1_Sub1_Sub1) local32).aClass2_Sub4_Sub4_1;
					if (local62.anIntArray66 != null) {
						local62 = local62.method595();
					}
					if (local62.anInt846 >= 0 && Static40.aClass2_Sub4_Sub3_Sub4Array5.length > local62.anInt846) {
						Static69.method1282(local32.method1092() + 15, local32);
						if (Static125.anInt2948 > -1) {
							Static40.aClass2_Sub4_Sub3_Sub4Array5[local62.anInt846].method2829(Static125.anInt2948 + arg2 - 12, Static167.anInt3744 + -30 + arg0);
						}
					}
					if (Static100.anInt2509 == 1 && Static129.anIntArray274[local13 - Static35.anInt973] == Static168.anInt3787 && Static156.anInt3491 % 20 < 10) {
						Static69.method1282(local32.method1092() + 15, local32);
						if (Static125.anInt2948 > -1) {
							Static102.aClass2_Sub4_Sub3_Sub4Array8[0].method2829(arg2 + Static125.anInt2948 - 12, Static167.anInt3744 + -28 + arg0);
						}
					}
				} else {
					@Pc(79) Class2_Sub4_Sub1_Sub1_Sub2 local79 = (Class2_Sub4_Sub1_Sub1_Sub2) local32;
					local81 = 30;
					if (local79.anInt1658 != -1 || local79.anInt1673 != -1) {
						Static69.method1282(local32.method1092() + 15, local32);
						if (Static125.anInt2948 > -1) {
							if (local79.anInt1658 != -1) {
								Static3.aClass2_Sub4_Sub3_Sub4Array7[local79.anInt1658].method2829(arg2 + Static125.anInt2948 - 12, arg0 - (-Static167.anInt3744 + 30));
								local81 += 25;
							}
							if (local79.anInt1673 != -1) {
								Static40.aClass2_Sub4_Sub3_Sub4Array5[local79.anInt1673].method2829(arg2 + Static125.anInt2948 - 12, -local81 + (arg0 - -Static167.anInt3744));
								local81 += 25;
							}
						}
					}
					if (local13 >= 0 && Static100.anInt2509 == 10 && Static160.anIntArray327[local13] == Static152.anInt3420) {
						Static69.method1282(local32.method1092() + 15, local32);
						if (Static125.anInt2948 > -1) {
							Static102.aClass2_Sub4_Sub3_Sub4Array8[1].method2829(arg2 + Static125.anInt2948 - 12, Static167.anInt3744 + (arg0 - local81));
						}
					}
				}
				if (local32.aClass28_951 != null && (Static35.anInt973 <= local13 || Static176.anInt3910 == 0 || Static176.anInt3910 == 3 || Static176.anInt3910 == 1 && Static21.method471(((Class2_Sub4_Sub1_Sub1_Sub2) local32).aClass28_953))) {
					Static69.method1282(local32.method1092(), local32);
					if (Static125.anInt2948 > -1 && Static54.anInt1391 < Static166.anInt3701) {
						Static166.anIntArray342[Static54.anInt1391] = Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2475(local32.aClass28_951) / 2;
						Static166.anIntArray345[Static54.anInt1391] = Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.anInt3536;
						Static166.anIntArray348[Static54.anInt1391] = Static125.anInt2948;
						Static166.anIntArray347[Static54.anInt1391] = Static167.anInt3744;
						Static166.anIntArray344[Static54.anInt1391] = local32.anInt1630;
						Static166.anIntArray346[Static54.anInt1391] = local32.anInt1621;
						Static166.anIntArray341[Static54.anInt1391] = local32.anInt1637;
						Static166.aClass28Array58[Static54.anInt1391] = local32.aClass28_951;
						Static54.anInt1391++;
					}
				}
				if (Static156.anInt3491 < local32.anInt1645) {
					Static69.method1282(local32.method1092() + 15, local32);
					if (Static125.anInt2948 > -1) {
						Static161.method2809(Static125.anInt2948 + arg2 - 15, arg0 + (Static167.anInt3744 - 3), local32.anInt1629, 5, 65280);
						Static161.method2809(Static125.anInt2948 + arg2 + local32.anInt1629 - 15, Static167.anInt3744 + -3 + arg0, 30 - local32.anInt1629, 5, 16711680);
					}
				}
				for (local81 = 0; local81 < 4; local81++) {
					if (Static156.anInt3491 < local32.anIntArray138[local81]) {
						Static69.method1282(local32.method1092() / 2, local32);
						if (Static125.anInt2948 > -1) {
							if (local81 == 1) {
								Static167.anInt3744 -= 20;
							}
							if (local81 == 2) {
								Static125.anInt2948 -= 15;
								Static167.anInt3744 -= 10;
							}
							if (local81 == 3) {
								Static125.anInt2948 += 15;
								Static167.anInt3744 -= 10;
							}
							Static113.aClass2_Sub4_Sub3_Sub4Array9[local32.anIntArray140[local81]].method2829(arg2 + Static125.anInt2948 - 12, arg0 + Static167.anInt3744 - 12);
							Static165.aClass2_Sub4_Sub3_Sub2_Sub1_5.method2457(Static158.method2411(local32.anIntArray141[local81]), arg2 + Static125.anInt2948 - 1, Static167.anInt3744 + 3 + arg0, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(543) int local543 = 0; local543 < Static54.anInt1391; local543++) {
			local81 = Static166.anIntArray348[local543];
			@Pc(553) int local553 = Static166.anIntArray345[local543];
			@Pc(557) int local557 = Static166.anIntArray342[local543];
			@Pc(561) int local561 = Static166.anIntArray347[local543];
			@Pc(563) boolean local563 = true;
			while (local563) {
				local563 = false;
				for (@Pc(569) int local569 = 0; local569 < local543; local569++) {
					if (local561 + 2 > Static166.anIntArray347[local569] + -Static166.anIntArray345[local569] && Static166.anIntArray347[local569] + 2 > -local553 + local561 && Static166.anIntArray348[local569] + Static166.anIntArray342[local569] > -local557 + local81 && local557 + local81 > Static166.anIntArray348[local569] - Static166.anIntArray342[local569] && local561 > Static166.anIntArray347[local569] - Static166.anIntArray345[local569]) {
						local561 = Static166.anIntArray347[local569] - Static166.anIntArray345[local569];
						local563 = true;
					}
				}
			}
			Static125.anInt2948 = Static166.anIntArray348[local543];
			Static167.anInt3744 = Static166.anIntArray347[local543] = local561;
			@Pc(664) Class28 local664 = Static166.aClass28Array58[local543];
			if (Static136.anInt3111 == 0) {
				@Pc(671) int local671 = 16776960;
				if (Static166.anIntArray344[local543] < 6) {
					local671 = Static145.anIntArray309[Static166.anIntArray344[local543]];
				}
				if (Static166.anIntArray344[local543] == 6) {
					local671 = Static87.anInt2197 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static166.anIntArray344[local543] == 7) {
					local671 = Static87.anInt2197 % 20 >= 10 ? 65535 : 255;
				}
				if (Static166.anIntArray344[local543] == 8) {
					local671 = Static87.anInt2197 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(746) int local746;
				if (Static166.anIntArray344[local543] == 9) {
					local746 = 150 - Static166.anIntArray341[local543];
					if (local746 < 50) {
						local671 = local746 * 1280 + 16711680;
					} else if (local746 < 100) {
						local671 = 16776960 - (local746 - 50) * 327680;
					} else if (local746 < 150) {
						local671 = local746 * 5 + 65280 - 500;
					}
				}
				if (Static166.anIntArray344[local543] == 10) {
					local746 = 150 - Static166.anIntArray341[local543];
					if (local746 < 50) {
						local671 = local746 * 5 + 16711680;
					} else if (local746 < 100) {
						local671 = 16384000 + 16711935 - local746 * 327680;
					} else if (local746 < 150) {
						local671 = local746 * 327680 + 255 + 500 - local746 * 5 - 32768000;
					}
				}
				if (Static166.anIntArray344[local543] == 11) {
					local746 = 150 - Static166.anIntArray341[local543];
					if (local746 < 50) {
						local671 = 16777215 - local746 * 327685;
					} else if (local746 < 100) {
						local671 = local746 * 327685 + 65280 - 16384250;
					} else if (local746 < 150) {
						local671 = 16777215 - (local746 - 100) * 327680;
					}
				}
				if (Static166.anIntArray346[local543] == 0) {
					Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2457(local664, arg2 + Static125.anInt2948, arg0 + Static167.anInt3744, local671, 0);
				}
				if (Static166.anIntArray346[local543] == 1) {
					Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2452(local664, arg2 + Static125.anInt2948, Static167.anInt3744 + arg0, local671, Static87.anInt2197);
				}
				if (Static166.anIntArray346[local543] == 2) {
					Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2447(local664, arg2 + Static125.anInt2948, arg0 - -Static167.anInt3744, local671, Static87.anInt2197);
				}
				if (Static166.anIntArray346[local543] == 3) {
					Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2464(local664, arg2 + Static125.anInt2948, arg0 + Static167.anInt3744, local671, Static87.anInt2197, 150 - Static166.anIntArray341[local543]);
				}
				if (Static166.anIntArray346[local543] == 4) {
					local746 = (150 - Static166.anIntArray341[local543]) * (Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2475(local664) + 100) / 150;
					Static161.method2799(Static125.anInt2948 + arg2 - 50, arg0, Static125.anInt2948 + arg2 + 50, arg0 + arg3);
					Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2454(local664, Static125.anInt2948 + arg2 + 50 - local746, Static167.anInt3744 + arg0, local671, 0);
					Static161.method2805(arg2, arg0, arg2 + arg1, arg0 - -arg3);
				}
				if (Static166.anIntArray346[local543] == 5) {
					local746 = 150 - Static166.anIntArray341[local543];
					@Pc(1051) int local1051 = 0;
					Static161.method2799(arg2, Static167.anInt3744 + arg0 - Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.anInt3536 - 1, arg1 + arg2, Static167.anInt3744 + arg0 + 5);
					if (local746 < 25) {
						local1051 = local746 - 25;
					} else if (local746 > 125) {
						local1051 = local746 - 125;
					}
					Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2457(local664, Static125.anInt2948 + arg2, Static167.anInt3744 + arg0 + local1051, local671, 0);
					Static161.method2805(arg2, arg0, arg2 + arg1, arg3 + arg0);
				}
			} else {
				Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2457(local664, arg2 + Static125.anInt2948, Static167.anInt3744 + arg0, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(Z)V")
	public static void method591() {
		Static95.aClass14_122.method596();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIILclient!d;Lclient!d;IIJ)V")
	public static void method592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub4_Sub1 arg4, @OriginalArg(5) Class2_Sub4_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class52 local8 = new Class52();
		local8.aLong93 = arg8;
		local8.anInt2608 = arg1 * 128 + 64;
		local8.anInt2612 = arg2 * 128 + 64;
		local8.anInt2611 = arg3;
		local8.aClass2_Sub4_Sub1_6 = arg4;
		local8.aClass2_Sub4_Sub1_5 = arg5;
		local8.anInt2613 = arg6;
		local8.anInt2607 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static133.aClass2_Sub14ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static133.aClass2_Sub14ArrayArrayArray1[local42][arg1][arg2] = new Class2_Sub14(local42, arg1, arg2);
			}
		}
		Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass52_1 = local8;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
	public static void method593(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub4_Sub11 local7 = Static117.method1958(arg1);
		@Pc(10) int local10 = local7.anInt1855;
		@Pc(13) int local13 = local7.anInt1852;
		@Pc(20) int local20 = local7.anInt1851;
		@Pc(27) int local27 = Class2_Sub3_Sub28.anIntArray334[local13 - local20];
		if (arg0 < 0 || arg0 > local27) {
			arg0 = 0;
		}
		local27 <<= local20;
		Static24.anIntArray52[local10] = ~local27 & Static24.anIntArray52[local10] | arg0 << local20 & local27;
	}
}
