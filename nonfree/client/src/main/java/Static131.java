import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!qg", name = "db", descriptor = "Lclient!pa;")
	public static Class63 aClass63_22 = new Class63(260);

	@OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
	public static int anInt3323 = 2;

	@OriginalMember(owner = "client!qg", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1087 = Static170.method3101("<col=ff0000>");

	@OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
	public static int anInt3324 = 0;

	@OriginalMember(owner = "client!qg", name = "jb", descriptor = "Lclient!wg;")
	public static Class88 aClass88_2 = new Class88();

	@OriginalMember(owner = "client!qg", name = "kb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_23 = new Class63(128);

	@OriginalMember(owner = "client!qg", name = "lb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1088 = Static170.method3101("welle:");

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V")
	public static void method2556() {
		aClass63_23 = null;
		aClass63_22 = null;
		aClass28_1088 = null;
		aClass88_2 = null;
		aClass28_1087 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILclient!kb;J)V")
	public static void method2557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2_Sub1 arg4, @OriginalArg(5) long arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class84 local6 = new Class84();
		local6.aClass3_Sub2_Sub1_9 = arg4;
		local6.anInt4187 = arg1 * 128 + 64;
		local6.anInt4186 = arg2 * 128 + 64;
		local6.anInt4188 = arg3;
		local6.aLong143 = arg5;
		if (Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub20(arg0, arg1, arg2);
		}
		Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass84_1 = local6;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
	public static void method2558(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static21.aShortArray8[arg0];
		@Pc(17) int local17 = Static8.anIntArray228[arg0];
		@Pc(21) int local21 = Static46.anIntArray238[arg0];
		if (local13 >= 2000) {
			local13 -= 2000;
		}
		@Pc(32) int local32 = (int) Static149.aLongArray6[arg0];
		@Pc(36) long local36 = Static149.aLongArray6[arg0];
		@Pc(45) Class3_Sub2_Sub1_Sub2_Sub2 local45;
		if (local13 == 41) {
			local45 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local32];
			if (local45 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local45.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local45.anIntArray314[0], 0);
				Static78.anInt2324 = 2;
				Static176.anInt4190 = 0;
				Static146.anInt3647 = Static2.anInt80;
				Static128.anInt3274 = Static160.anInt3914;
				Static51.aClass3_Sub8_Sub1_2.method1559(241);
				Static51.aClass3_Sub8_Sub1_2.method1515(Static38.anInt1094);
				Static51.aClass3_Sub8_Sub1_2.method1531(Static176.anInt4193);
				Static51.aClass3_Sub8_Sub1_2.method1514(local32);
			}
		}
		@Pc(128) boolean local128;
		if (local13 == 48) {
			local128 = Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			if (!local128) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			}
			Static176.anInt4190 = 0;
			Static146.anInt3647 = Static2.anInt80;
			Static128.anInt3274 = Static160.anInt3914;
			Static78.anInt2324 = 2;
			Static51.aClass3_Sub8_Sub1_2.method1559(168);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static176.anInt4193);
			Static51.aClass3_Sub8_Sub1_2.method1503(local32);
			Static51.aClass3_Sub8_Sub1_2.method1531(local17 + Static111.anInt2843);
			Static51.aClass3_Sub8_Sub1_2.method1524(Static29.anInt907 + local21);
			Static51.aClass3_Sub8_Sub1_2.method1513(Static38.anInt1094);
		}
		if (local13 == 45 && Static81.method1865(local36, local17, local21)) {
			Static51.aClass3_Sub8_Sub1_2.method1559(246);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static176.anInt4193);
			Static51.aClass3_Sub8_Sub1_2.method1531((int) (local36 >>> 32) & Integer.MAX_VALUE);
			Static51.aClass3_Sub8_Sub1_2.method1515(Static38.anInt1094);
			Static51.aClass3_Sub8_Sub1_2.method1514(Static29.anInt907 + local21);
			Static51.aClass3_Sub8_Sub1_2.method1503(local17 + Static111.anInt2843);
		}
		if (local13 == 17) {
			local45 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local32];
			if (local45 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local45.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local45.anIntArray314[0], 0);
				Static78.anInt2324 = 2;
				Static128.anInt3274 = Static160.anInt3914;
				Static176.anInt4190 = 0;
				Static146.anInt3647 = Static2.anInt80;
				Static51.aClass3_Sub8_Sub1_2.method1559(193);
				Static51.aClass3_Sub8_Sub1_2.method1514(Static7.anInt226);
				Static51.aClass3_Sub8_Sub1_2.method1531(local32);
				Static51.aClass3_Sub8_Sub1_2.method1524(Static161.anInt3932);
				Static51.aClass3_Sub8_Sub1_2.method1513(Static167.anInt4077);
			}
		}
		if (local13 == 44 && Static175.aClass33_15 == null) {
			Static100.method2109(local17, local21);
			Static175.aClass33_15 = Static27.method739(local21, local17);
			Static16.method534(Static175.aClass33_15);
		}
		@Pc(347) Class3_Sub2_Sub1_Sub2_Sub1 local347;
		if (local13 == 51) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static128.anInt3274 = Static160.anInt3914;
				Static146.anInt3647 = Static2.anInt80;
				Static78.anInt2324 = 2;
				Static176.anInt4190 = 0;
				Static51.aClass3_Sub8_Sub1_2.method1559(2);
				Static51.aClass3_Sub8_Sub1_2.method1503(local32);
			}
		}
		if (local13 == 38) {
			local45 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local32];
			if (local45 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local45.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local45.anIntArray314[0], 0);
				Static128.anInt3274 = Static160.anInt3914;
				Static78.anInt2324 = 2;
				Static176.anInt4190 = 0;
				Static146.anInt3647 = Static2.anInt80;
				Static51.aClass3_Sub8_Sub1_2.method1559(87);
				Static51.aClass3_Sub8_Sub1_2.method1514(local32);
			}
		}
		if (local13 == 58) {
			Static166.method3063();
		}
		@Pc(474) Class33 local474;
		if (local13 == 1007) {
			local474 = Static19.method576(local21);
			if (local474 == null || local474.anIntArray266[local17] < 100000) {
				Static51.aClass3_Sub8_Sub1_2.method1559(231);
				Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			} else {
				Static51.method1192(Static156.aClass28_1306, 0, Static4.method96(new Class28[] { Static146.method2793(local474.anIntArray266[local17]), Static125.aClass28_1057, Static76.method1736(local32).aClass28_566 }));
			}
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 37 || local13 == 1001) {
			Static128.method2512(local21, Static69.aClass28Array12[arg0], local17, local32);
		}
		if (local13 == 1002) {
			Static81.method1865(local36, local17, local21);
			Static51.aClass3_Sub8_Sub1_2.method1559(158);
			Static51.aClass3_Sub8_Sub1_2.method1531((int) (local36 >>> 32) & Integer.MAX_VALUE);
			Static51.aClass3_Sub8_Sub1_2.method1531(local21 + Static29.anInt907);
			Static51.aClass3_Sub8_Sub1_2.method1503(local17 + Static111.anInt2843);
		}
		if (local13 == 47) {
			Static51.aClass3_Sub8_Sub1_2.method1559(236);
			Static51.aClass3_Sub8_Sub1_2.method1513(local21);
			Static51.aClass3_Sub8_Sub1_2.method1531(local17);
			Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 3) {
			local474 = Static19.method576(local21);
			@Pc(639) boolean local639 = true;
			if (local474.anInt1477 > 0) {
				local639 = Static62.method1463(local474);
			}
			if (local639) {
				Static51.aClass3_Sub8_Sub1_2.method1559(90);
				Static51.aClass3_Sub8_Sub1_2.method1547(local21);
			}
		}
		if (local13 == 15) {
			local45 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local32];
			if (local45 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local45.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local45.anIntArray314[0], 0);
				Static146.anInt3647 = Static2.anInt80;
				Static78.anInt2324 = 2;
				Static176.anInt4190 = 0;
				Static128.anInt3274 = Static160.anInt3914;
				Static51.aClass3_Sub8_Sub1_2.method1559(85);
				Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			}
		}
		if (local13 == 2) {
			Static51.aClass3_Sub8_Sub1_2.method1559(191);
			Static51.aClass3_Sub8_Sub1_2.method1515(local21);
			Static51.aClass3_Sub8_Sub1_2.method1503(local32);
			Static51.aClass3_Sub8_Sub1_2.method1503(local17);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		@Pc(791) int local791;
		if (local13 == 29) {
			Static51.aClass3_Sub8_Sub1_2.method1559(90);
			Static51.aClass3_Sub8_Sub1_2.method1547(local21);
			local474 = Static19.method576(local21);
			if (local474.anIntArrayArray19 != null && local474.anIntArrayArray19[0][0] == 5) {
				local791 = local474.anIntArrayArray19[0][1];
				Static72.anIntArray354[local791] = 1 - Static72.anIntArray354[local791];
				Static110.method2234(local791);
			}
		}
		if (local13 == 4) {
			local45 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local32];
			if (local45 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local45.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local45.anIntArray314[0], 0);
				Static128.anInt3274 = Static160.anInt3914;
				Static146.anInt3647 = Static2.anInt80;
				Static176.anInt4190 = 0;
				Static78.anInt2324 = 2;
				Static51.aClass3_Sub8_Sub1_2.method1559(167);
				Static51.aClass3_Sub8_Sub1_2.method1514(local32);
			}
		}
		if (local13 == 25) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static128.anInt3274 = Static160.anInt3914;
				Static78.anInt2324 = 2;
				Static176.anInt4190 = 0;
				Static146.anInt3647 = Static2.anInt80;
				Static51.aClass3_Sub8_Sub1_2.method1559(176);
				Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			}
		}
		if (local13 == 1004) {
			Static176.anInt4190 = 0;
			Static146.anInt3647 = Static2.anInt80;
			Static128.anInt3274 = Static160.anInt3914;
			Static78.anInt2324 = 2;
			Static51.aClass3_Sub8_Sub1_2.method1559(231);
			Static51.aClass3_Sub8_Sub1_2.method1524(local32);
		}
		if (local13 == 12) {
			Static51.aClass3_Sub8_Sub1_2.method1559(8);
			Static51.aClass3_Sub8_Sub1_2.method1514(local17);
			Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			Static51.aClass3_Sub8_Sub1_2.method1539(local21);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 34) {
			local474 = Static27.method739(local21, local17);
			if (local474 != null) {
				Static76.method1741();
				Static55.method1227(local17, local21, Static161.method3002(Static4.method97(local474)));
				Static95.anInt2636 = 0;
				Static30.aClass28_313 = Static173.method3139(local474);
				if (Static30.aClass28_313 == null) {
					Static30.aClass28_313 = Static17.aClass28_200;
				}
				if (local474.aBoolean90) {
					Static101.aClass28_843 = Static4.method96(new Class28[] { local474.aClass28_450, Static65.aClass28_593 });
					return;
				}
				Static101.aClass28_843 = Static4.method96(new Class28[] { Static168.aClass28_1427, local474.aClass28_456, Static65.aClass28_593 });
			}
			return;
		}
		if (local13 == 49 && Static81.method1865(local36, local17, local21)) {
			Static51.aClass3_Sub8_Sub1_2.method1559(28);
			Static51.aClass3_Sub8_Sub1_2.method1531(Static7.anInt226);
			Static51.aClass3_Sub8_Sub1_2.method1515(Static167.anInt4077);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static111.anInt2843 + local17);
			Static51.aClass3_Sub8_Sub1_2.method1531(Integer.MAX_VALUE & (int) (local36 >>> 32));
			Static51.aClass3_Sub8_Sub1_2.method1503(Static161.anInt3932);
			Static51.aClass3_Sub8_Sub1_2.method1524(Static29.anInt907 + local21);
		}
		if (local13 == 57) {
			Static51.aClass3_Sub8_Sub1_2.method1559(101);
			Static51.aClass3_Sub8_Sub1_2.method1539(local21);
			Static51.aClass3_Sub8_Sub1_2.method1514(local17);
			Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 50) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static78.anInt2324 = 2;
				Static146.anInt3647 = Static2.anInt80;
				Static176.anInt4190 = 0;
				Static128.anInt3274 = Static160.anInt3914;
				Static51.aClass3_Sub8_Sub1_2.method1559(32);
				Static51.aClass3_Sub8_Sub1_2.method1531(local32);
			}
		}
		if (local13 == 46) {
			local128 = Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			if (!local128) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			}
			Static146.anInt3647 = Static2.anInt80;
			Static78.anInt2324 = 2;
			Static128.anInt3274 = Static160.anInt3914;
			Static176.anInt4190 = 0;
			Static51.aClass3_Sub8_Sub1_2.method1559(104);
			Static51.aClass3_Sub8_Sub1_2.method1531(local32);
			Static51.aClass3_Sub8_Sub1_2.method1514(Static7.anInt226);
			Static51.aClass3_Sub8_Sub1_2.method1531(Static161.anInt3932);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static111.anInt2843 + local17);
			Static51.aClass3_Sub8_Sub1_2.method1514(Static29.anInt907 + local21);
			Static51.aClass3_Sub8_Sub1_2.method1515(Static167.anInt4077);
		}
		if (local13 == 9) {
			local45 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local32];
			if (local45 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local45.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local45.anIntArray314[0], 0);
				Static128.anInt3274 = Static160.anInt3914;
				Static78.anInt2324 = 2;
				Static176.anInt4190 = 0;
				Static146.anInt3647 = Static2.anInt80;
				Static51.aClass3_Sub8_Sub1_2.method1559(13);
				Static51.aClass3_Sub8_Sub1_2.method1503(local32);
			}
		}
		if (local13 == 21) {
			Static51.aClass3_Sub8_Sub1_2.method1559(134);
			Static51.aClass3_Sub8_Sub1_2.method1514(local17);
			Static51.aClass3_Sub8_Sub1_2.method1539(local21);
			Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 7) {
			Static76.method1741();
			local474 = Static19.method576(local21);
			Static161.anInt3932 = local17;
			Static7.anInt226 = local32;
			Static167.anInt4077 = local21;
			Static95.anInt2636 = 1;
			Static16.method534(local474);
			Static154.aClass28_1288 = Static4.method96(new Class28[] { Static29.aClass28_304, Static76.method1736(local32).aClass28_566, Static65.aClass28_593 });
			if (Static154.aClass28_1288 == null) {
				Static154.aClass28_1288 = Static50.aClass28_439;
			}
			return;
		}
		if (local13 == 32) {
			Static51.aClass3_Sub8_Sub1_2.method1559(195);
			Static51.aClass3_Sub8_Sub1_2.method1503(local17);
			Static51.aClass3_Sub8_Sub1_2.method1515(local21);
			Static51.aClass3_Sub8_Sub1_2.method1514(Static176.anInt4193);
			Static51.aClass3_Sub8_Sub1_2.method1513(Static38.anInt1094);
		}
		if (local13 == 1005) {
			Static78.anInt2324 = 2;
			Static128.anInt3274 = Static160.anInt3914;
			Static146.anInt3647 = Static2.anInt80;
			Static176.anInt4190 = 0;
			local45 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local32];
			if (local45 != null) {
				@Pc(1482) Class3_Sub2_Sub7 local1482 = local45.aClass3_Sub2_Sub7_1;
				if (local1482.anIntArray242 != null) {
					local1482 = local1482.method1118();
				}
				if (local1482 != null) {
					Static51.aClass3_Sub8_Sub1_2.method1559(159);
					Static51.aClass3_Sub8_Sub1_2.method1524(local1482.anInt1315);
				}
			}
		}
		if (local13 == 31) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static176.anInt4190 = 0;
				Static78.anInt2324 = 2;
				Static128.anInt3274 = Static160.anInt3914;
				Static146.anInt3647 = Static2.anInt80;
				Static51.aClass3_Sub8_Sub1_2.method1559(171);
				Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			}
		}
		if (local13 == 1) {
			Static51.aClass3_Sub8_Sub1_2.method1559(185);
			Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			Static51.aClass3_Sub8_Sub1_2.method1539(local21);
			Static51.aClass3_Sub8_Sub1_2.method1531(local17);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 23) {
			Static51.aClass3_Sub8_Sub1_2.method1559(161);
			Static51.aClass3_Sub8_Sub1_2.method1531(local32);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static7.anInt226);
			Static51.aClass3_Sub8_Sub1_2.method1547(Static167.anInt4077);
			Static51.aClass3_Sub8_Sub1_2.method1539(local21);
			Static51.aClass3_Sub8_Sub1_2.method1531(Static161.anInt3932);
			Static51.aClass3_Sub8_Sub1_2.method1524(local17);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 14) {
			Static77.method1749(Static171.anInt4109, local17, local21);
		}
		if (local13 == 28) {
			local128 = Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			if (!local128) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			}
			Static146.anInt3647 = Static2.anInt80;
			Static78.anInt2324 = 2;
			Static128.anInt3274 = Static160.anInt3914;
			Static176.anInt4190 = 0;
			Static51.aClass3_Sub8_Sub1_2.method1559(26);
			Static51.aClass3_Sub8_Sub1_2.method1531(local17 + Static111.anInt2843);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static29.anInt907 + local21);
			Static51.aClass3_Sub8_Sub1_2.method1503(local32);
		}
		if (local13 == 43) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static128.anInt3274 = Static160.anInt3914;
				Static146.anInt3647 = Static2.anInt80;
				Static78.anInt2324 = 2;
				Static176.anInt4190 = 0;
				Static51.aClass3_Sub8_Sub1_2.method1559(0);
				Static51.aClass3_Sub8_Sub1_2.method1503(Static7.anInt226);
				Static51.aClass3_Sub8_Sub1_2.method1524(local32);
				Static51.aClass3_Sub8_Sub1_2.method1515(Static167.anInt4077);
				Static51.aClass3_Sub8_Sub1_2.method1503(Static161.anInt3932);
			}
		}
		if (local13 == 40) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static78.anInt2324 = 2;
				Static128.anInt3274 = Static160.anInt3914;
				Static146.anInt3647 = Static2.anInt80;
				Static176.anInt4190 = 0;
				Static51.aClass3_Sub8_Sub1_2.method1559(163);
				Static51.aClass3_Sub8_Sub1_2.method1514(local32);
			}
		}
		if (local13 == 6) {
			Static81.method1865(local36, local17, local21);
			Static51.aClass3_Sub8_Sub1_2.method1559(54);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static111.anInt2843 + local17);
			Static51.aClass3_Sub8_Sub1_2.method1524(Static29.anInt907 + local21);
			Static51.aClass3_Sub8_Sub1_2.method1503((int) (local36 >>> 32) & Integer.MAX_VALUE);
		}
		if (local13 == 33) {
			Static51.aClass3_Sub8_Sub1_2.method1559(69);
			Static51.aClass3_Sub8_Sub1_2.method1503(local32);
			Static51.aClass3_Sub8_Sub1_2.method1531(local17);
			Static51.aClass3_Sub8_Sub1_2.method1547(local21);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 1006) {
			Static176.anInt4190 = 0;
			Static128.anInt3274 = Static160.anInt3914;
			Static146.anInt3647 = Static2.anInt80;
			Static78.anInt2324 = 2;
			Static51.aClass3_Sub8_Sub1_2.method1559(214);
			Static51.aClass3_Sub8_Sub1_2.method1524(local32);
		}
		if (local13 == 42) {
			Static81.method1865(local36, local17, local21);
			Static51.aClass3_Sub8_Sub1_2.method1559(155);
			Static51.aClass3_Sub8_Sub1_2.method1503((int) (local36 >>> 32) & Integer.MAX_VALUE);
			Static51.aClass3_Sub8_Sub1_2.method1524(local17 + Static111.anInt2843);
			Static51.aClass3_Sub8_Sub1_2.method1524(local21 + Static29.anInt907);
		}
		if (local13 == 30) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static128.anInt3274 = Static160.anInt3914;
				Static176.anInt4190 = 0;
				Static146.anInt3647 = Static2.anInt80;
				Static78.anInt2324 = 2;
				Static51.aClass3_Sub8_Sub1_2.method1559(65);
				Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			}
		}
		if (local13 == 24) {
			Static51.aClass3_Sub8_Sub1_2.method1559(90);
			Static51.aClass3_Sub8_Sub1_2.method1547(local21);
			local474 = Static19.method576(local21);
			if (local474.anIntArrayArray19 != null && local474.anIntArrayArray19[0][0] == 5) {
				local791 = local474.anIntArrayArray19[0][1];
				if (Static72.anIntArray354[local791] != local474.anIntArray257[0]) {
					Static72.anIntArray354[local791] = local474.anIntArray257[0];
					Static110.method2234(local791);
				}
			}
		}
		if (local13 == 5) {
			Static51.aClass3_Sub8_Sub1_2.method1559(106);
			Static51.aClass3_Sub8_Sub1_2.method1514(local17);
			Static51.aClass3_Sub8_Sub1_2.method1513(local21);
			Static51.aClass3_Sub8_Sub1_2.method1514(local32);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 36) {
			local128 = Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			if (!local128) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			}
			Static176.anInt4190 = 0;
			Static78.anInt2324 = 2;
			Static146.anInt3647 = Static2.anInt80;
			Static128.anInt3274 = Static160.anInt3914;
			Static51.aClass3_Sub8_Sub1_2.method1559(60);
			Static51.aClass3_Sub8_Sub1_2.method1503(local32);
			Static51.aClass3_Sub8_Sub1_2.method1503(local17 + Static111.anInt2843);
			Static51.aClass3_Sub8_Sub1_2.method1503(local21 + Static29.anInt907);
		}
		if (local13 == 18) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static176.anInt4190 = 0;
				Static146.anInt3647 = Static2.anInt80;
				Static78.anInt2324 = 2;
				Static128.anInt3274 = Static160.anInt3914;
				Static51.aClass3_Sub8_Sub1_2.method1559(74);
				Static51.aClass3_Sub8_Sub1_2.method1531(local32);
			}
		}
		if (local13 == 10) {
			Static81.method1865(local36, local17, local21);
			Static51.aClass3_Sub8_Sub1_2.method1559(105);
			Static51.aClass3_Sub8_Sub1_2.method1514(local21 + Static29.anInt907);
			Static51.aClass3_Sub8_Sub1_2.method1503((int) (local36 >>> 32) & Integer.MAX_VALUE);
			Static51.aClass3_Sub8_Sub1_2.method1531(Static111.anInt2843 + local17);
		}
		if (local13 == 11) {
			local45 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local32];
			if (local45 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local45.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local45.anIntArray314[0], 0);
				Static128.anInt3274 = Static160.anInt3914;
				Static146.anInt3647 = Static2.anInt80;
				Static176.anInt4190 = 0;
				Static78.anInt2324 = 2;
				Static51.aClass3_Sub8_Sub1_2.method1559(223);
				Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			}
		}
		if (local13 == 20) {
			Static81.method1865(local36, local17, local21);
			Static51.aClass3_Sub8_Sub1_2.method1559(180);
			Static51.aClass3_Sub8_Sub1_2.method1503(local21 + Static29.anInt907);
			Static51.aClass3_Sub8_Sub1_2.method1531((int) (local36 >>> 32) & Integer.MAX_VALUE);
			Static51.aClass3_Sub8_Sub1_2.method1531(Static111.anInt2843 + local17);
		}
		if (local13 == 16) {
			local128 = Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			if (!local128) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			}
			Static146.anInt3647 = Static2.anInt80;
			Static128.anInt3274 = Static160.anInt3914;
			Static78.anInt2324 = 2;
			Static176.anInt4190 = 0;
			Static51.aClass3_Sub8_Sub1_2.method1559(179);
			Static51.aClass3_Sub8_Sub1_2.method1531(local32);
			Static51.aClass3_Sub8_Sub1_2.method1524(Static29.anInt907 + local21);
			Static51.aClass3_Sub8_Sub1_2.method1524(Static111.anInt2843 + local17);
		}
		if (local13 == 22) {
			Static51.aClass3_Sub8_Sub1_2.method1559(110);
			Static51.aClass3_Sub8_Sub1_2.method1503(local17);
			Static51.aClass3_Sub8_Sub1_2.method1547(local21);
			Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 8) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static128.anInt3274 = Static160.anInt3914;
				Static78.anInt2324 = 2;
				Static176.anInt4190 = 0;
				Static146.anInt3647 = Static2.anInt80;
				Static51.aClass3_Sub8_Sub1_2.method1559(12);
				Static51.aClass3_Sub8_Sub1_2.method1514(local32);
			}
		}
		if (local13 == 13) {
			Static51.aClass3_Sub8_Sub1_2.method1559(232);
			Static51.aClass3_Sub8_Sub1_2.method1531(local32);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static176.anInt4193);
			Static51.aClass3_Sub8_Sub1_2.method1547(Static38.anInt1094);
			Static51.aClass3_Sub8_Sub1_2.method1524(local17);
			Static51.aClass3_Sub8_Sub1_2.method1513(local21);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 26) {
			local128 = Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			if (!local128) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			}
			Static176.anInt4190 = 0;
			Static146.anInt3647 = Static2.anInt80;
			Static128.anInt3274 = Static160.anInt3914;
			Static78.anInt2324 = 2;
			Static51.aClass3_Sub8_Sub1_2.method1559(221);
			Static51.aClass3_Sub8_Sub1_2.method1531(Static111.anInt2843 + local17);
			Static51.aClass3_Sub8_Sub1_2.method1514(Static29.anInt907 + local21);
			Static51.aClass3_Sub8_Sub1_2.method1503(local32);
		}
		if (local13 == 35) {
			local347 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local32];
			if (local347 != null) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local347.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local347.anIntArray314[0], 0);
				Static176.anInt4190 = 0;
				Static78.anInt2324 = 2;
				Static128.anInt3274 = Static160.anInt3914;
				Static146.anInt3647 = Static2.anInt80;
				Static51.aClass3_Sub8_Sub1_2.method1559(46);
				Static51.aClass3_Sub8_Sub1_2.method1514(local32);
				Static51.aClass3_Sub8_Sub1_2.method1524(Static176.anInt4193);
				Static51.aClass3_Sub8_Sub1_2.method1539(Static38.anInt1094);
			}
		}
		if (local13 == 19) {
			Static51.aClass3_Sub8_Sub1_2.method1559(190);
			Static51.aClass3_Sub8_Sub1_2.method1514(local32);
			Static51.aClass3_Sub8_Sub1_2.method1503(local17);
			Static51.aClass3_Sub8_Sub1_2.method1539(local21);
			Static153.anInt3786 = 0;
			Static159.aClass33_12 = Static19.method576(local21);
			Static19.anInt557 = local17;
		}
		if (local13 == 39) {
			local128 = Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			if (!local128) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local17, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local21, 0);
			}
			Static128.anInt3274 = Static160.anInt3914;
			Static78.anInt2324 = 2;
			Static176.anInt4190 = 0;
			Static146.anInt3647 = Static2.anInt80;
			Static51.aClass3_Sub8_Sub1_2.method1559(170);
			Static51.aClass3_Sub8_Sub1_2.method1524(local17 + Static111.anInt2843);
			Static51.aClass3_Sub8_Sub1_2.method1524(local32);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static29.anInt907 + local21);
		}
		if (Static95.anInt2636 != 0) {
			Static95.anInt2636 = 0;
			Static16.method534(Static19.method576(Static167.anInt4077));
		}
		if (Static67.aBoolean109) {
			Static76.method1741();
		}
		if (Static159.aClass33_12 != null && Static153.anInt3786 == 0) {
			Static16.method534(Static159.aClass33_12);
		}
	}
}
