import java.awt.Graphics;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!oc", name = "Sb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!oc", name = "Tb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_910 = Static14.method2017(" )2>");

	@OriginalMember(owner = "client!oc", name = "Ub", descriptor = "Lclient!kc;")
	private static Class36 aClass36_911 = Static14.method2017("Your account has been disabled)3");

	@OriginalMember(owner = "client!oc", name = "bc", descriptor = "Lclient!kc;")
	private static Class36 aClass36_916 = Static14.method2017(" is already on your friend list");

	@OriginalMember(owner = "client!oc", name = "Vb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_912 = aClass36_916;

	@OriginalMember(owner = "client!oc", name = "Wb", descriptor = "[I")
	public static int[] anIntArray236 = new int[25];

	@OriginalMember(owner = "client!oc", name = "Xb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_913 = Static14.method2017("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!oc", name = "Zb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_914 = Static14.method2017("@yel@*V");

	@OriginalMember(owner = "client!oc", name = "ac", descriptor = "Lclient!kc;")
	public static Class36 aClass36_915 = aClass36_911;

	@OriginalMember(owner = "client!oc", name = "cc", descriptor = "I")
	public static int anInt1988 = 0;

	@OriginalMember(owner = "client!oc", name = "dc", descriptor = "[I")
	public static int[] anIntArray237 = new int[50];

	@OriginalMember(owner = "client!oc", name = "ec", descriptor = "Lclient!kc;")
	public static Class36 aClass36_917 = Static14.method2017(": ");

	@OriginalMember(owner = "client!oc", name = "fc", descriptor = "Lclient!kc;")
	public static Class36 aClass36_918 = aClass36_913;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(Z)V")
	public static void method1420() {
		for (@Pc(10) Class2_Sub1_Sub4_Sub5 local10 = (Class2_Sub1_Sub4_Sub5) Static59.aClass8_4.method175(); local10 != null; local10 = (Class2_Sub1_Sub4_Sub5) Static59.aClass8_4.method173()) {
			if (local10.anInt2672 != Static92.anInt2412 || local10.anInt2669 < Static113.anInt2952) {
				local10.method2073();
			} else if (Static113.anInt2952 >= local10.anInt2664) {
				if (local10.anInt2659 > 0) {
					@Pc(42) Class2_Sub1_Sub4_Sub2_Sub1 local42 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local10.anInt2659 - 1];
					if (local42 != null && local42.anInt2204 >= 0 && local42.anInt2204 < 13312 && local42.anInt2149 >= 0 && local42.anInt2149 < 13312) {
						local10.method1881(Static113.anInt2952, Static56.method1044(local42.anInt2149, local42.anInt2204, local10.anInt2672) - local10.anInt2661, local42.anInt2204, local42.anInt2149);
					}
				}
				if (local10.anInt2659 < 0) {
					@Pc(96) int local96 = -local10.anInt2659 - 1;
					@Pc(101) Class2_Sub1_Sub4_Sub2_Sub2 local101;
					if (local96 == Static18.anInt455) {
						local101 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3;
					} else {
						local101 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local96];
					}
					if (local101 != null && local101.anInt2204 >= 0 && local101.anInt2204 < 13312 && local101.anInt2149 >= 0 && local101.anInt2149 < 13312) {
						local10.method1881(Static113.anInt2952, Static56.method1044(local101.anInt2149, local101.anInt2204, local10.anInt2672) - local10.anInt2661, local101.anInt2204, local101.anInt2149);
					}
				}
				local10.method1879(Static100.anInt2609);
				Static85.aClass61_1.method1688(Static92.anInt2412, (int) local10.aDouble7, (int) local10.aDouble6, (int) local10.aDouble2, 60, local10, local10.anInt2674, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLclient!ed;I)I")
	public static int method1421(@OriginalArg(1) Class2_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray8 == null || arg1 >= arg0.anIntArrayArray8.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray8[arg1];
			@Pc(26) int local26 = 0;
			@Pc(36) byte local36 = 0;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(40) int local40 = 0;
				@Pc(45) int local45 = local24[local38++];
				@Pc(47) byte local47 = 0;
				if (local45 == 0) {
					return local26;
				}
				if (local45 == 15) {
					local47 = 1;
				}
				if (local45 == 16) {
					local47 = 2;
				}
				if (local45 == 1) {
					local40 = anIntArray236[local24[local38++]];
				}
				if (local45 == 17) {
					local47 = 3;
				}
				if (local45 == 2) {
					local40 = Static25.anIntArray49[local24[local38++]];
				}
				if (local45 == 3) {
					local40 = Static107.anIntArray333[local24[local38++]];
				}
				@Pc(112) int local112;
				@Pc(123) Class2_Sub1_Sub6 local123;
				@Pc(128) int local128;
				@Pc(141) int local141;
				if (local45 == 4) {
					local112 = local24[local38++] << 16;
					@Pc(119) int local119 = local112 + local24[local38++];
					local123 = Static71.method1274(local119);
					local128 = local24[local38++];
					if (local128 != -1 && (!Static43.method832(local128).aBoolean132 || Static33.aBoolean13)) {
						for (local141 = 0; local141 < local123.anIntArray57.length; local141++) {
							if (local123.anIntArray57[local141] == local128 + 1) {
								local40 += local123.anIntArray54[local141];
							}
						}
					}
				}
				if (local45 == 5) {
					local40 = Static4.anIntArray14[local24[local38++]];
				}
				if (local45 == 6) {
					local40 = RuntimeException_Sub1.anIntArray47[Static25.anIntArray49[local24[local38++]] - 1];
				}
				if (local45 == 7) {
					local40 = Static4.anIntArray14[local24[local38++]] * 100 / 46875;
				}
				if (local45 == 8) {
					local40 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2222;
				}
				if (local45 == 9) {
					for (local112 = 0; local112 < 25; local112++) {
						if (Static114.aBooleanArray15[local112]) {
							local40 += Static25.anIntArray49[local112];
						}
					}
				}
				if (local45 == 10) {
					local112 = local24[local38++] << 16;
					local112 += local24[local38++];
					local123 = Static71.method1274(local112);
					local128 = local24[local38++];
					if (local128 != -1 && (!Static43.method832(local128).aBoolean132 || Static33.aBoolean13)) {
						for (local141 = 0; local141 < local123.anIntArray57.length; local141++) {
							if (local123.anIntArray57[local141] == local128 + 1) {
								local40 = 999999999;
								break;
							}
						}
					}
				}
				if (local45 == 11) {
					local40 = Static57.anInt1502;
				}
				if (local45 == 12) {
					local40 = Static1.anInt10;
				}
				if (local45 == 13) {
					local112 = Static4.anIntArray14[local24[local38++]];
					@Pc(333) int local333 = local24[local38++];
					local40 = (local112 & 0x1 << local333) == 0 ? 0 : 1;
				}
				if (local45 == 14) {
					local112 = local24[local38++];
					local40 = Static4.method133(local112);
				}
				if (local45 == 18) {
					local40 = Static25.anInt632 + (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 >> 7);
				}
				if (local45 == 19) {
					local40 = Static23.anInt592 + (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 >> 7);
				}
				if (local45 == 20) {
					local40 = local24[local38++];
				}
				if (local47 == 0) {
					if (local36 == 0) {
						local26 += local40;
					}
					if (local36 == 1) {
						local26 -= local40;
					}
					if (local36 == 2 && local40 != 0) {
						local26 /= local40;
					}
					if (local36 == 3) {
						local26 *= local40;
					}
					local36 = 0;
				} else {
					local36 = local47;
				}
			}
		} catch (@Pc(431) Exception local431) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "(I)V")
	public static void method1423() {
		for (@Pc(11) int local11 = -1; local11 < Static65.anInt1689; local11++) {
			@Pc(19) int local19;
			if (local11 == -1) {
				local19 = 2047;
			} else {
				local19 = Static99.anIntArray243[local11];
			}
			@Pc(29) Class2_Sub1_Sub4_Sub2_Sub2 local29 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local19];
			if (local29 != null) {
				Static95.method1787(1, local29);
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "(I)Lclient!cc;")
	public static Class12 method1426() {
		try {
			return (Class12) Class.forName("Class12_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!df;ILclient!df;)V")
	public static void method1428(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub2 arg1) {
		Static55.aClass14_35.method1472();
		if (Static23.anInt591 == 0 || Static23.anInt591 == 5) {
			arg1.method454(Static11.aClass36_160, 180, 54, 16777215);
			Static54.method1583(28, 62, 304, 34, 9179409);
			Static54.method1583(29, 63, 302, 32, 0);
			Static54.method1591(30, 64, Static57.anInt1497 * 3, 30, 9179409);
			Static54.method1591(Static57.anInt1497 * 3 + 30, 64, 300 - Static57.anInt1497 * 3, 30, 0);
			arg1.method454(Static15.aClass36_181, 180, 85, 16777215);
		}
		@Pc(91) byte local91;
		@Pc(99) int local99;
		if (Static23.anInt591 == 20) {
			Static82.aClass2_Sub1_Sub1_Sub1_20.method97(0, 0);
			local91 = 40;
			arg1.method457(Static15.aClass36_189, 180, 40, 16776960, true);
			local99 = local91 + 15;
			arg1.method457(Static15.aClass36_180, 180, 55, 16776960, true);
			@Pc(107) int local107 = local99 + 15;
			arg1.method457(Static15.aClass36_188, 180, 70, 16776960, true);
			@Pc(115) int local115 = local107 + 15;
			@Pc(116) int local116 = local115 + 10;
			arg1.method475(Static49.method949(new Class36[] { Static90.aClass36_1091, Static15.aClass36_186 }), 90, 95, 16777215, true);
			@Pc(135) int local135 = local116 + 15;
			arg1.method475(Static49.method949(new Class36[] { Static64.aClass36_797, Static15.aClass36_190.method1015() }), 92, 110, 16777215, true);
			@Pc(158) int local158 = local135 + 15;
		}
		if (Static23.anInt591 == 10) {
			Static82.aClass2_Sub1_Sub1_Sub1_20.method97(0, 0);
			if (Static85.anInt2215 == 0) {
				local91 = 80;
				arg1.method457(Static79.aClass36_967, 180, 80, 16776960, true);
				Static85.aClass2_Sub1_Sub1_Sub1_21.method97(27, 100);
				local99 = local91 + 30;
				arg1.method465(Static17.aClass36_223, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static85.aClass2_Sub1_Sub1_Sub1_21.method97(187, 100);
				arg1.method465(Static82.aClass36_981, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static85.anInt2215 == 2) {
				local91 = 40;
				arg1.method457(Static15.aClass36_189, 180, 40, 16776960, true);
				local99 = local91 + 15;
				arg1.method457(Static15.aClass36_180, 180, 55, 16776960, true);
				local99 += 15;
				arg1.method457(Static15.aClass36_188, 180, 70, 16776960, true);
				local99 += 15;
				local99 += 10;
				arg1.method475(Static49.method949(new Class36[] { Static90.aClass36_1091, Static15.aClass36_186, Static113.anInt2952 % 40 < 20 & Static64.anInt1641 == 0 ? aClass36_914 : Static15.aClass36_179 }), 90, 95, 16777215, true);
				local99 += 15;
				arg1.method475(Static49.method949(new Class36[] { Static64.aClass36_797, Static15.aClass36_190.method1015(), Static64.anInt1641 == 1 & Static113.anInt2952 % 40 < 20 ? aClass36_914 : Static15.aClass36_179 }), 92, 110, 16777215, true);
				local99 += 15;
				Static85.aClass2_Sub1_Sub1_Sub1_21.method97(27, 130);
				arg1.method457(Static58.aClass36_737, 100, 155, 16777215, true);
				Static85.aClass2_Sub1_Sub1_Sub1_21.method97(187, 130);
				arg1.method457(Static77.aClass36_941, 260, 155, 16777215, true);
			} else if (Static85.anInt2215 == 3) {
				arg1.method457(Static59.aClass36_763, 180, 40, 16776960, true);
				local91 = 65;
				arg1.method457(Static10.aClass36_149, 180, 65, 16777215, true);
				local99 = local91 + 15;
				arg1.method457(Static100.aClass36_1280, 180, 80, 16777215, true);
				local99 += 15;
				arg1.method457(Static96.aClass36_1241, 180, 95, 16777215, true);
				local99 += 15;
				arg1.method457(Static97.aClass36_1253, 180, 110, 16777215, true);
				local99 += 15;
				Static85.aClass2_Sub1_Sub1_Sub1_21.method97(107, 130);
				arg1.method457(Static77.aClass36_941, 180, 155, 16777215, true);
			}
		}
		Static104.method1918();
		try {
			@Pc(466) Graphics local466 = Static107.aCanvas1.getGraphics();
			Static55.aClass14_35.method1470(202, local466, 171);
			Static61.aClass14_22.method1470(0, local466, 0);
			Static101.aClass14_33.method1470(637, local466, 0);
			if (Static108.aBoolean131) {
				Static108.aBoolean131 = false;
				Static110.aClass14_36.method1470(128, local466, 0);
				Static57.aClass14_21.method1470(202, local466, 371);
				Static55.aClass14_34.method1470(0, local466, 265);
				Static7.aClass14_3.method1470(562, local466, 265);
				Static89.aClass14_28.method1470(128, local466, 171);
				Static43.aClass14_16.method1470(562, local466, 171);
			}
		} catch (@Pc(536) Exception local536) {
			Static107.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "(I)V")
	public static void method1429() {
		aClass36_914 = null;
		anIntArray236 = null;
		aClass36_912 = null;
		aClass36_911 = null;
		aCalendar1 = null;
		aClass36_913 = null;
		aClass36_918 = null;
		aClass36_915 = null;
		aClass36_910 = null;
		anIntArray237 = null;
		aClass36_917 = null;
		aClass36_916 = null;
	}

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "(B)V")
	public static void method1430() {
		if (Static64.aClass19_1 != null) {
			Static64.aClass19_1.method1262();
			Static64.aClass19_1 = null;
		}
		Static3.anInt1282 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIZ)I")
	public static int method1431() {
		return Static43.anInt1148 + Static76.anInt2015;
	}

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "(I)V")
	public static void method1432() {
		Static65.method1151(Static46.anInt1229);
		if (Static9.anInt237 != -1) {
			Static65.method1151(Static9.anInt237);
		}
		Static100.anInt2609 = 0;
		Static65.aClass14_24.method1472();
		Static113.anIntArray351 = Static87.method1600(Static113.anIntArray351);
		Static54.method1587();
		Static81.method1494(503, 765, 0, Static46.anInt1229);
		if (Static9.anInt237 != -1) {
			Static81.method1494(503, 765, 0, Static9.anInt237);
		}
		if (Static73.aBoolean82) {
			Static95.method1789();
		} else {
			Static69.method1199();
			Static56.method1048();
		}
		try {
			@Pc(62) Graphics local62 = Static107.aCanvas1.getGraphics();
			Static65.aClass14_24.method1470(0, local62, 0);
		} catch (@Pc(70) Exception local70) {
			Static107.aCanvas1.repaint();
		}
	}
}
