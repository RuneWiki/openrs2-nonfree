import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
	public static int anInt558;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	public static volatile int anInt553 = 0;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
	public static int anInt554 = 0;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "Lclient!gg;")
	private static Class28 aClass28_376 = Static107.method1838("FULL");

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Lclient!gg;")
	public static Class28 aClass28_372 = aClass28_376;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "Lclient!gg;")
	private static Class28 aClass28_378 = Static107.method1838("Please wait)3)3)3");

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!gg;")
	public static Class28 aClass28_373 = aClass28_378;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "Lclient!gg;")
	private static Class28 aClass28_374 = Static107.method1838("Select");

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "Lclient!gg;")
	public static Class28 aClass28_375 = Static107.method1838("sl_button");

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!gg;")
	public static Class28 aClass28_377 = Static107.method1838("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "Lclient!gg;")
	public static Class28 aClass28_379 = aClass28_374;

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "Lclient!gg;")
	public static Class28 aClass28_380 = Static107.method1838("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "Lclient!gg;")
	public static Class28 aClass28_381 = Static107.method1838("Clientscript error in: ");

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method358() {
		aClass28_374 = null;
		aClass28_377 = null;
		aClass28_373 = null;
		aClass28_376 = null;
		aClass28_379 = null;
		aClass28_375 = null;
		aClass28_372 = null;
		aClass28_381 = null;
		aClass28_380 = null;
		aClass28_378 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIII[Lclient!ie;[B)V")
	public static void method359(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class36[] arg7, @OriginalArg(9) byte[] arg8) {
		for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if (arg2 + local11 > 0 && arg2 + local11 < 103 && local15 + arg3 > 0 && local15 + arg3 < 103) {
					arg7[arg4].anIntArrayArray15[arg2 + local11][local15 + arg3] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(85) Class2_Sub2 local85 = new Class2_Sub2(arg8);
		for (@Pc(87) int local87 = 0; local87 < 4; local87++) {
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					if (local87 == arg0 && local91 >= arg1 && arg1 + 8 > local91 && local95 >= arg6 && arg6 + 8 > local95) {
						Static39.method720(arg3 + Static168.method2645(local95 & 0x7, arg5, local91 & 0x7), arg5, 0, 0, arg4, Static11.method350(local95 & 0x7, local91 & 0x7, arg5) + arg2, local85);
					} else {
						Static39.method720(-1, 0, 0, 0, 0, -1, local85);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)Lclient!ff;")
	public static Class24 method360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(23) Class24 local23 = Static58.method1035(arg1);
		if (arg0 == -1) {
			return local23;
		} else if (local23 == null || local23.aClass24Array1 == null || arg0 >= local23.aClass24Array1.length) {
			return null;
		} else {
			return local23.aClass24Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!th;Lclient!th;)V")
	public static void method361(@OriginalArg(1) Class2_Sub4_Sub3_Sub2_Sub1 arg0, @OriginalArg(2) Class2_Sub4_Sub3_Sub2_Sub1 arg1) {
		if (Static176.aClass2_Sub4_Sub3_Sub4Array13 == null) {
			Static176.aClass2_Sub4_Sub3_Sub4Array13 = Static57.method1030(Static150.aClass28_1981, Static138.aClass28_1860, Static101.aClass40_Sub1_16);
		}
		if (Static167.aClass2_Sub4_Sub3_Sub3Array10 == null) {
			Static167.aClass2_Sub4_Sub3_Sub3Array10 = Static38.method709(Static101.aClass40_Sub1_16, Static138.aClass28_1860, Static153.aClass28_2009);
		}
		if (Static149.aClass2_Sub4_Sub3_Sub3Array6 == null) {
			Static149.aClass2_Sub4_Sub3_Sub3Array6 = Static38.method709(Static101.aClass40_Sub1_16, Static138.aClass28_1860, Static66.aClass28_1041);
		}
		if (Static150.aClass2_Sub4_Sub3_Sub3Array7 == null) {
			Static150.aClass2_Sub4_Sub3_Sub3Array7 = Static38.method709(Static101.aClass40_Sub1_16, Static138.aClass28_1860, Static110.aClass28_1581);
		}
		Static161.method2809(0, 23, 765, 480, 0);
		Static161.method2806(0, 0, 125, 23, 12425273, 9135624);
		Static161.method2806(125, 0, 640, 23, 5197647, 2697513);
		arg0.method2457(Static145.aClass28_1933, 62, 15, 0, -1);
		if (Static150.aClass2_Sub4_Sub3_Sub3Array7 != null) {
			Static150.aClass2_Sub4_Sub3_Sub3Array7[1].method2242(140, 1);
			arg1.method2454(Static159.aClass28_2433, 152, 10, 16777215, -1);
			Static150.aClass2_Sub4_Sub3_Sub3Array7[0].method2242(140, 12);
			arg1.method2454(Static113.aClass28_1601, 152, 21, 16777215, -1);
		}
		if (Static149.aClass2_Sub4_Sub3_Sub3Array6 != null) {
			if (Static96.anIntArray229[0] == 0 && Static160.anIntArray326[0] == 0) {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[2].method2242(280, 4);
			} else {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[0].method2242(280, 4);
			}
			if (Static96.anIntArray229[0] == 0 && Static160.anIntArray326[0] == 1) {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[3].method2242(295, 4);
			} else {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[1].method2242(295, 4);
			}
			arg0.method2454(Static107.aClass28_1541, 312, 17, 16777215, -1);
			if (Static96.anIntArray229[0] == 1 && Static160.anIntArray326[0] == 0) {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[2].method2242(390, 4);
			} else {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[0].method2242(390, 4);
			}
			if (Static96.anIntArray229[0] == 1 && Static160.anIntArray326[0] == 1) {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[3].method2242(405, 4);
			} else {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[1].method2242(405, 4);
			}
			arg0.method2454(Static132.aClass28_1821, 422, 17, 16777215, -1);
			if (Static96.anIntArray229[0] == 2 && Static160.anIntArray326[0] == 0) {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[2].method2242(500, 4);
			} else {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[0].method2242(500, 4);
			}
			if (Static96.anIntArray229[0] == 2 && Static160.anIntArray326[0] == 1) {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[3].method2242(515, 4);
			} else {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[1].method2242(515, 4);
			}
			arg0.method2454(Static172.aClass28_2279, 532, 17, 16777215, -1);
			if (Static96.anIntArray229[0] == 3 && Static160.anIntArray326[0] == 0) {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[2].method2242(610, 4);
			} else {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[0].method2242(610, 4);
			}
			if (Static96.anIntArray229[0] == 3 && Static160.anIntArray326[0] == 1) {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[3].method2242(625, 4);
			} else {
				Static149.aClass2_Sub4_Sub3_Sub3Array6[1].method2242(625, 4);
			}
			arg0.method2454(Static83.aClass28_1246, 642, 17, 16777215, -1);
		}
		Static161.method2809(708, 4, 50, 16, 0);
		arg1.method2457(Static95.aClass28_1404, 733, 16, 16777215, -1);
		Static56.anInt1497 = -1;
		if (Static176.aClass2_Sub4_Sub3_Sub4Array13 == null) {
			return;
		}
		@Pc(380) int local380 = 8;
		@Pc(386) int local386 = 24;
		@Pc(390) int local390;
		@Pc(388) int local388;
		do {
			local388 = local380;
			local390 = local386;
			if (Static9.anInt467 <= (local380 - 1) * local386) {
				local380--;
			}
			if (Static9.anInt467 <= (local386 - 1) * local380) {
				local386--;
			}
			if ((local386 - 1) * local380 >= Static9.anInt467) {
				local386--;
			}
		} while (local390 != local386 || local388 != local380);
		local388 = (480 - local386 * 19) / (local386 + 1);
		local390 = (765 - local380 * 88) / (local380 + 1);
		if (local388 > 5) {
			local388 = 5;
		}
		if (local390 > 5) {
			local390 = 5;
		}
		@Pc(477) int local477 = (765 - local390 * (local380 - 1) - local380 * 88) / 2;
		@Pc(479) int local479 = local477;
		@Pc(481) int local481 = 0;
		@Pc(497) int local497 = (480 - local388 * (local386 - 1) - local386 * 19) / 2;
		@Pc(501) int local501 = local497 + 23;
		for (@Pc(503) int local503 = 0; local503 < Static9.anInt467; local503++) {
			@Pc(509) Class31 local509 = Static47.aClass31Array3[local503];
			@Pc(511) boolean local511 = true;
			@Pc(516) Class28 local516 = Static158.method2411(local509.anInt1798);
			if (local509.anInt1798 == -1) {
				local511 = false;
				local516 = Static63.aClass28_980;
			} else if (local509.anInt1798 > 1980) {
				local516 = aClass28_372;
				local511 = false;
			}
			if (Static93.anInt2353 >= local479 && Static169.anInt3798 >= local501 && Static93.anInt2353 < local479 + 88 && local501 + 19 > Static169.anInt3798 && local511) {
				Static56.anInt1497 = local503;
				Static176.aClass2_Sub4_Sub3_Sub4Array13[local509.aBoolean91 ? 1 : 0].method2832(local479, local501);
			} else {
				Static176.aClass2_Sub4_Sub3_Sub4Array13[local509.aBoolean91 ? 1 : 0].method2823(local479, local501);
			}
			if (Static167.aClass2_Sub4_Sub3_Sub3Array10 != null) {
				Static167.aClass2_Sub4_Sub3_Sub3Array10[local509.anInt1794 + (local509.aBoolean91 ? 8 : 0)].method2242(local479 + 29, local501);
			}
			arg0.method2457(Static158.method2411(local509.anInt1795), local479 + 15, local501 - -9 + 5, 0, -1);
			arg1.method2457(local516, local479 + 60, local501 - -9 - -5, 268435455, -1);
			local501 += local388 + 19;
			local481++;
			if (local481 >= local386) {
				local479 += local390 + 88;
				local501 = local497 + 23;
				local481 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method362() {
		Static147.anIntArray314 = null;
		Static59.anIntArray135 = null;
		Static81.aByteArrayArray5 = null;
		Static171.anIntArray358 = null;
		Static171.anIntArray359 = null;
		Static101.anIntArray31 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!rg;IIIIII)V")
	public static void method363(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray308.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray308[local5] - Static125.anInt2954;
			local20 = arg0.anIntArray297[local5] - Static95.anInt2362;
			local27 = arg0.anIntArray294[local5] - Static14.anInt612;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray306 != null) {
				Static144.anIntArray298[local5] = local37;
				Static144.anIntArray303[local5] = local59;
				Static144.anIntArray302[local5] = local69;
			}
			Static144.anIntArray295[local5] = Static25.anInt795 + (local37 << 9) / local69;
			Static144.anIntArray307[local5] = Static25.anInt799 + (local59 << 9) / local69;
		}
		Static25.anInt792 = 0;
		local3 = arg0.anIntArray299.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray299[local13];
			local27 = arg0.anIntArray300[local13];
			local37 = arg0.anIntArray304[local13];
			@Pc(142) int local142 = Static144.anIntArray295[local20];
			@Pc(146) int local146 = Static144.anIntArray295[local27];
			@Pc(150) int local150 = Static144.anIntArray295[local37];
			@Pc(154) int local154 = Static144.anIntArray307[local20];
			@Pc(158) int local158 = Static144.anIntArray307[local27];
			@Pc(162) int local162 = Static144.anIntArray307[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static126.aBoolean134 && Static162.method2496(Static163.anInt3610, Static31.anInt4010, local154, local158, local162, local142, local146, local150)) {
					Static177.anInt3920 = arg5;
					Static18.anInt3710 = arg6;
				}
				Static25.aBoolean26 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static25.anInt800 || local146 > Static25.anInt800 || local150 > Static25.anInt800) {
					Static25.aBoolean26 = true;
				}
				if (arg0.anIntArray306 == null || arg0.anIntArray306[local13] == -1) {
					if (arg0.anIntArray296[local13] != 12345678) {
						Static25.method546(local154, local158, local162, local142, local146, local150, arg0.anIntArray296[local13], arg0.anIntArray301[local13], arg0.anIntArray305[local13]);
					}
				} else if (Static18.aBoolean161) {
					@Pc(363) int local363 = Static25.anInterface2_1.method2659(arg0.anIntArray306[local13]);
					Static25.method546(local154, local158, local162, local142, local146, local150, Static138.method2169(local363, arg0.anIntArray296[local13]), Static138.method2169(local363, arg0.anIntArray301[local13]), Static138.method2169(local363, arg0.anIntArray305[local13]));
				} else if (arg0.aBoolean145) {
					Static25.method550(local154, local158, local162, local142, local146, local150, arg0.anIntArray296[local13], arg0.anIntArray301[local13], arg0.anIntArray305[local13], Static144.anIntArray298[0], Static144.anIntArray298[1], Static144.anIntArray298[3], Static144.anIntArray303[0], Static144.anIntArray303[1], Static144.anIntArray303[3], Static144.anIntArray302[0], Static144.anIntArray302[1], Static144.anIntArray302[3], arg0.anIntArray306[local13]);
				} else {
					Static25.method550(local154, local158, local162, local142, local146, local150, arg0.anIntArray296[local13], arg0.anIntArray301[local13], arg0.anIntArray305[local13], Static144.anIntArray298[local20], Static144.anIntArray298[local27], Static144.anIntArray298[local37], Static144.anIntArray303[local20], Static144.anIntArray303[local27], Static144.anIntArray303[local37], Static144.anIntArray302[local20], Static144.anIntArray302[local27], Static144.anIntArray302[local37], arg0.anIntArray306[local13]);
				}
			}
		}
	}
}
