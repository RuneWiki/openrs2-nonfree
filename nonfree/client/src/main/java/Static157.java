import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
	public static int anInt3570;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public static int anInt3571;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public static int anInt3574;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!h;")
	public static Class30 aClass30_15 = new Class30();

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!bi;")
	public static Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!ah;")
	public static Class5 aClass5_11 = new Class5(32);

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[4][105][105];

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Z")
	public static volatile boolean aBoolean151 = false;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "[Lclient!eh;")
	public static Class21[] aClass21Array1 = new Class21[50];

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public static int anInt3572 = 0;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
	public static int anInt3573 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method2706() {
		aClass5_11 = null;
		aClass21Array1 = null;
		aClass8_1 = null;
		aClass30_15 = null;
		anIntArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!lh;IIIIIII)V")
	public static void method2707(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static122.anInt2747;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static184.anInt4119;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static116.anIntArrayArrayArray4[arg1][arg6][arg7] - Static89.anInt4025;
		@Pc(49) int local49 = Static116.anIntArrayArrayArray4[arg1][arg6 + 1][arg7] - Static89.anInt4025;
		@Pc(63) int local63 = Static116.anIntArrayArrayArray4[arg1][arg6 + 1][arg7 + 1] - Static89.anInt4025;
		@Pc(75) int local75 = Static116.anIntArrayArrayArray4[arg1][arg6][arg7 + 1] - Static89.anInt4025;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static22.anInt575 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static22.anInt579 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static22.anInt575 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static22.anInt579 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static22.anInt575 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static22.anInt579 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static22.anInt575 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static22.anInt579 + (local85 << 9) / local261;
		Static22.anInt578 = 0;
		@Pc(467) int local467;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static148.aBoolean143 && Static141.method602(Static79.anInt1837, Static92.anInt2062, local315, local331, local299, local307, local323, local291)) {
				Static183.anInt4108 = arg6;
				Static151.anInt3418 = arg7;
			}
			Static22.aBoolean17 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static22.anInt574 || local323 > Static22.anInt574 || local291 > Static22.anInt574) {
				Static22.aBoolean17 = true;
			}
			if (arg0.anInt2170 == -1) {
				if (arg0.anInt2169 != 12345678) {
					Static22.method498(local315, local331, local299, local307, local323, local291, arg0.anInt2169, arg0.anInt2165, arg0.anInt2175);
				}
			} else if (Static33.aBoolean30) {
				local467 = Static22.anInterface3_2.method1027(arg0.anInt2170);
				Static22.method498(local315, local331, local299, local307, local323, local291, Static181.method3106(local467, arg0.anInt2169), Static181.method3106(local467, arg0.anInt2165), Static181.method3106(local467, arg0.anInt2175));
			} else if (arg0.aBoolean93) {
				Static22.method502(local315, local331, local299, local307, local323, local291, arg0.anInt2169, arg0.anInt2165, arg0.anInt2175, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2170);
			} else {
				Static22.method502(local315, local331, local299, local307, local323, local291, arg0.anInt2169, arg0.anInt2165, arg0.anInt2175, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt2170);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static148.aBoolean143 && Static141.method602(Static79.anInt1837, Static92.anInt2062, local283, local299, local331, local275, local291, local323)) {
			Static183.anInt4108 = arg6;
			Static151.anInt3418 = arg7;
		}
		Static22.aBoolean17 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static22.anInt574 || local291 > Static22.anInt574 || local323 > Static22.anInt574) {
			Static22.aBoolean17 = true;
		}
		if (arg0.anInt2170 != -1) {
			if (!Static33.aBoolean30) {
				Static22.method502(local283, local299, local331, local275, local291, local323, arg0.anInt2173, arg0.anInt2175, arg0.anInt2165, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2170);
				return;
			}
			local467 = Static22.anInterface3_2.method1027(arg0.anInt2170);
			Static22.method498(local283, local299, local331, local275, local291, local323, Static181.method3106(local467, arg0.anInt2173), Static181.method3106(local467, arg0.anInt2175), Static181.method3106(local467, arg0.anInt2165));
		} else if (arg0.anInt2173 != 12345678) {
			Static22.method498(local283, local299, local331, local275, local291, local323, arg0.anInt2173, arg0.anInt2175, arg0.anInt2165);
			return;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method2708() {
		Static140.aLong113 = 0L;
		Static80.aBoolean73 = true;
		Static40.aClass51_1.anInt2068 = 0;
		Static110.aBoolean104 = true;
		Static144.anInt3163 = 0;
		Static21.method423();
		Static104.aClass1_Sub8_Sub1_2.anInt446 = 0;
		Static86.anInt1952 = -1;
		Static153.anInt3498 = 0;
		Static70.anInt1716 = 0;
		Static172.anInt3987 = -1;
		Static92.anInt2058 = -1;
		Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
		Static43.anInt1082 = -1;
		Static106.anInt2330 = 0;
		for (@Pc(2297) int local2297 = 0; local2297 < Static2.aClass80Array1.length; local2297++) {
			Static2.aClass80Array1[local2297] = null;
		}
		Static149.aBoolean145 = false;
		Static118.anInt2616 = 0;
		Static172.method3034(0);
		for (@Pc(2326) int local2326 = 0; local2326 < 100; local2326++) {
			Static68.aClass81Array7[local2326] = null;
		}
		Static37.anInt977 = 0;
		Static2.anInt37 = (int) (Math.random() * 120.0D) - 60;
		Static46.anInt1126 = (int) (Math.random() * 100.0D) - 50;
		Static50.anInt1176 = 0;
		Static25.anInt645 = 0;
		Static135.anInt2049 = 0;
		Static89.anInt4029 = 0;
		Static168.anInt3903 = -1;
		Static1.anInt14 = (int) (Math.random() * 80.0D) - 40;
		Static164.anInt3767 = 0;
		Static184.aBoolean172 = false;
		Static85.anInt418 = (int) (Math.random() * 110.0D) - 55;
		Static160.anInt3643 = (int) (Math.random() * 30.0D) - 20;
		Static35.anInt964 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static35.anInt962 = 0;
		Static81.anInt1859 = 0;
		for (@Pc(2404) int local2404 = 0; local2404 < 2048; local2404++) {
			Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local2404] = null;
			Static21.aClass1_Sub8Array1[local2404] = null;
		}
		for (@Pc(2420) int local2420 = 0; local2420 < 32768; local2420++) {
			Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local2420] = null;
		}
		Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[2047] = new Class1_Sub2_Sub1_Sub3_Sub1();
		Static6.aClass30_3.method1118();
		Static47.aClass30_8.method1118();
		@Pc(2452) int local2452;
		@Pc(2456) int local2456;
		for (@Pc(2448) int local2448 = 0; local2448 < 4; local2448++) {
			for (local2452 = 0; local2452 < 104; local2452++) {
				for (local2456 = 0; local2456 < 104; local2456++) {
					Static139.aClass30ArrayArrayArray1[local2448][local2452][local2456] = null;
				}
			}
		}
		Static70.aClass30_11 = new Class30();
		Static58.anInt1378 = 0;
		Static150.anInt3394 = 0;
		for (local2452 = 0; local2452 < Static132.anInt2861; local2452++) {
			@Pc(2496) Class1_Sub2_Sub11 local2496 = Static52.method933(local2452);
			if (local2496 != null && local2496.anInt2132 == 0) {
				Static33.anIntArray71[local2452] = 0;
				Static83.anIntArray178[local2452] = 0;
			}
		}
		for (local2456 = 0; local2456 < Static58.anIntArray117.length; local2456++) {
			Static58.anIntArray117[local2456] = -1;
		}
		if (Static97.anInt2134 != -1) {
			Static120.method2062(Static97.anInt2134);
		}
		for (@Pc(2540) Class1_Sub4 local2540 = (Class1_Sub4) Static119.aClass5_8.method140(); local2540 != null; local2540 = (Class1_Sub4) Static119.aClass5_8.method132()) {
			Static139.method2337(true, local2540);
		}
		Static97.anInt2134 = -1;
		Static119.aClass5_8 = new Class5(8);
		Static118.anInt2616 = 0;
		Static46.aClass77_7 = null;
		Static149.aBoolean145 = false;
		Static33.aClass90_1.method3116(-1, new int[5], false, null);
		for (@Pc(2576) int local2576 = 0; local2576 < 8; local2576++) {
			Static170.aClass81Array21[local2576] = null;
			Static81.aBooleanArray8[local2576] = false;
		}
		Static19.method395();
		Static181.aBoolean168 = true;
		for (@Pc(2598) int local2598 = 0; local2598 < 100; local2598++) {
			Static87.aBooleanArray11[local2598] = true;
		}
		Static12.aClass81_1448 = null;
		Static94.anInt2072 = 0;
		Static163.aClass1_Sub13Array1 = null;
		for (@Pc(2616) int local2616 = 0; local2616 < 6; local2616++) {
			Static54.aClass61Array1[local2616] = new Class61();
		}
		for (@Pc(2632) int local2632 = 0; local2632 < 25; local2632++) {
			Static70.anIntArray149[local2632] = 0;
			Static16.anIntArray13[local2632] = 0;
			Static113.anIntArray272[local2632] = 0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!d;IIIIII)V")
	public static void method2709(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray53.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray53[local5] - Static122.anInt2747;
			local20 = arg0.anIntArray46[local5] - Static89.anInt4025;
			local27 = arg0.anIntArray49[local5] - Static184.anInt4119;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray51 != null) {
				Static28.anIntArray50[local5] = local37;
				Static28.anIntArray41[local5] = local59;
				Static28.anIntArray55[local5] = local69;
			}
			Static28.anIntArray54[local5] = Static22.anInt575 + (local37 << 9) / local69;
			Static28.anIntArray52[local5] = Static22.anInt579 + (local59 << 9) / local69;
		}
		Static22.anInt578 = 0;
		local3 = arg0.anIntArray42.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray42[local13];
			local27 = arg0.anIntArray43[local13];
			local37 = arg0.anIntArray44[local13];
			@Pc(142) int local142 = Static28.anIntArray54[local20];
			@Pc(146) int local146 = Static28.anIntArray54[local27];
			@Pc(150) int local150 = Static28.anIntArray54[local37];
			@Pc(154) int local154 = Static28.anIntArray52[local20];
			@Pc(158) int local158 = Static28.anIntArray52[local27];
			@Pc(162) int local162 = Static28.anIntArray52[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static148.aBoolean143 && Static141.method602(Static79.anInt1837, Static92.anInt2062, local154, local158, local162, local142, local146, local150)) {
					Static183.anInt4108 = arg5;
					Static151.anInt3418 = arg6;
				}
				Static22.aBoolean17 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static22.anInt574 || local146 > Static22.anInt574 || local150 > Static22.anInt574) {
					Static22.aBoolean17 = true;
				}
				if (arg0.anIntArray51 == null || arg0.anIntArray51[local13] == -1) {
					if (arg0.anIntArray47[local13] != 12345678) {
						Static22.method498(local154, local158, local162, local142, local146, local150, arg0.anIntArray47[local13], arg0.anIntArray48[local13], arg0.anIntArray45[local13]);
					}
				} else if (Static33.aBoolean30) {
					@Pc(363) int local363 = Static22.anInterface3_2.method1027(arg0.anIntArray51[local13]);
					Static22.method498(local154, local158, local162, local142, local146, local150, Static181.method3106(local363, arg0.anIntArray47[local13]), Static181.method3106(local363, arg0.anIntArray48[local13]), Static181.method3106(local363, arg0.anIntArray45[local13]));
				} else if (arg0.aBoolean24) {
					Static22.method502(local154, local158, local162, local142, local146, local150, arg0.anIntArray47[local13], arg0.anIntArray48[local13], arg0.anIntArray45[local13], Static28.anIntArray50[0], Static28.anIntArray50[1], Static28.anIntArray50[3], Static28.anIntArray41[0], Static28.anIntArray41[1], Static28.anIntArray41[3], Static28.anIntArray55[0], Static28.anIntArray55[1], Static28.anIntArray55[3], arg0.anIntArray51[local13]);
				} else {
					Static22.method502(local154, local158, local162, local142, local146, local150, arg0.anIntArray47[local13], arg0.anIntArray48[local13], arg0.anIntArray45[local13], Static28.anIntArray50[local20], Static28.anIntArray50[local27], Static28.anIntArray50[local37], Static28.anIntArray41[local20], Static28.anIntArray41[local27], Static28.anIntArray41[local37], Static28.anIntArray55[local20], Static28.anIntArray55[local27], Static28.anIntArray55[local37], arg0.anIntArray51[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Z")
	public static boolean method2710(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}
}
