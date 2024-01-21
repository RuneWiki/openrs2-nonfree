import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
	public static int anInt426;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
	public static int anInt429 = 0;

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "Lclient!u;")
	public static Class74 aClass74_405 = Static72.method1077("http:)4)4");

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "Lclient!u;")
	public static Class74 aClass74_406 = Static72.method1077("blinken3:");

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "Lclient!u;")
	private static Class74 aClass74_407 = Static72.method1077("From");

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "Lclient!u;")
	public static Class74 aClass74_408 = aClass74_407;

	@OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
	public static int anInt442 = 0;

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "Lclient!u;")
	private static Class74 aClass74_410 = Static72.method1077("level)2");

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "Lclient!u;")
	public static Class74 aClass74_409 = aClass74_410;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)I")
	public static int method348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(30) int local30 = arg2;
		@Pc(34) int local34 = arg1 & 0x7F;
		@Pc(38) int local38 = arg0 & 0x7F;
		if (arg2 < 3 && (Static17.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
			local30 = arg2 + 1;
		}
		@Pc(89) int local89 = (128 - local38) * Static56.anIntArrayArrayArray2[local30][local7][local11 + 1] + local38 * Static56.anIntArrayArrayArray2[local30][local7 + 1][local11 + 1] >> 7;
		@Pc(117) int local117 = Static56.anIntArrayArrayArray2[local30][local7][local11] * (128 - local38) + Static56.anIntArrayArrayArray2[local30][local7 + 1][local11] * local38 >> 7;
		return local89 * local34 + local117 * (128 - local34) >> 7;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!g;Ljava/awt/Component;Lclient!g;I)V")
	public static void method349(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class26 arg2) {
		if (Static24.aBoolean23) {
			return;
		}
		Static97.aClass9_58 = Static80.method1253(503, 765, arg1);
		Static97.aClass9_58.method1589();
		Static58.method698();
		@Pc(26) byte[] local26 = arg2.method1371(Static49.aClass74_843, Static68.aClass74_1047);
		Static109.aClass2_Sub2_Sub1_Sub2_7 = new Class2_Sub2_Sub1_Sub2(local26, arg1);
		Static62.aClass2_Sub2_Sub1_Sub2_2 = Static109.aClass2_Sub2_Sub1_Sub2_7.method212();
		Static24.aClass2_Sub2_Sub1_Sub1_15 = Static29.method517(Static49.aClass74_843, Static7.aClass74_1659, arg0);
		Static77.aClass2_Sub2_Sub1_Sub1_33 = Static29.method517(Static49.aClass74_843, Static67.aClass74_1033, arg0);
		Static126.aClass2_Sub2_Sub1_Sub1_50 = Static29.method517(Static49.aClass74_843, Static116.aClass74_1555, arg0);
		Static53.aClass2_Sub2_Sub1_Sub1Array7 = Static25.method494(Static101.aClass74_1456, arg0, Static49.aClass74_843);
		Static37.aClass2_Sub2_Sub1_Sub1Array9 = Static25.method494(Static70.aClass74_1092, arg0, Static49.aClass74_843);
		Static48.anIntArray136 = new int[256];
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			Static48.anIntArray136[local70] = local70 * 262144;
		}
		for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
			Static48.anIntArray136[local86 + 64] = local86 * 1024 + 16711680;
		}
		for (@Pc(111) int local111 = 0; local111 < 64; local111++) {
			Static48.anIntArray136[local111 + 128] = local111 * 4 + 16776960;
		}
		for (@Pc(129) int local129 = 0; local129 < 64; local129++) {
			Static48.anIntArray136[local129 + 192] = 16777215;
		}
		Static17.anIntArray55 = new int[256];
		for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
			Static17.anIntArray55[local146] = local146 * 1024;
		}
		for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
			Static17.anIntArray55[local160 + 64] = local160 * 4 + 65280;
		}
		for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
			Static17.anIntArray55[local178 + 128] = local178 * 262144 + 65535;
		}
		for (@Pc(198) int local198 = 0; local198 < 64; local198++) {
			Static17.anIntArray55[local198 + 192] = 16777215;
		}
		Static128.anIntArray416 = new int[256];
		for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
			Static128.anIntArray416[local217] = local217 * 4;
		}
		for (@Pc(231) int local231 = 0; local231 < 64; local231++) {
			Static128.anIntArray416[local231 + 64] = local231 * 262144 + 255;
		}
		for (@Pc(251) int local251 = 0; local251 < 64; local251++) {
			Static128.anIntArray416[local251 + 128] = local251 * 1024 + 16711935;
		}
		for (@Pc(271) int local271 = 0; local271 < 64; local271++) {
			Static128.anIntArray416[local271 + 192] = 16777215;
		}
		Static42.anIntArray113 = new int[32768];
		Static5.anIntArray8 = new int[32768];
		Static24.anIntArray68 = new int[256];
		Static126.method1918(null);
		Static49.aClass74_853 = Static49.aClass74_843;
		Static51.anIntArray313 = new int[32768];
		Static31.anInt791 = 0;
		Static98.aBoolean87 = false;
		Static32.anIntArray96 = new int[32768];
		if (Static69.anInt1519 == 0) {
			Static4.aBoolean6 = true;
		} else {
			Static4.aBoolean6 = false;
		}
		Static49.aClass74_842 = Static49.aClass74_843;
		if (Static4.aBoolean6) {
			Static16.method358();
		} else {
			Static27.method511(Static49.aClass74_843, Static35.aClass26_Sub1_77, Static14.aClass74_398);
		}
		Static90.method1335(false);
		Static46.aBoolean43 = true;
		Static24.aBoolean23 = true;
		Static109.aClass2_Sub2_Sub1_Sub2_7.method207(0, 0);
		Static62.aClass2_Sub2_Sub1_Sub2_2.method207(382, 0);
		Static24.aClass2_Sub2_Sub1_Sub1_15.method97(382 - Static24.aClass2_Sub2_Sub1_Sub1_15.anInt116 / 2, 18);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public static void method351() {
		Static19.aClass2_Sub10_Sub1_1.method1540();
		@Pc(13) int local13 = Static19.aClass2_Sub10_Sub1_1.method1538(8);
		@Pc(22) int local22;
		if (local13 < Static29.anInt686) {
			for (local22 = local13; local22 < Static29.anInt686; local22++) {
				Static85.anIntArray257[Static17.anInt548++] = Static40.anIntArray110[local22];
			}
		}
		if (local13 > Static29.anInt686) {
			throw new RuntimeException("gnpov1");
		}
		Static29.anInt686 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(61) int local61 = Static40.anIntArray110[local22];
			@Pc(65) Class2_Sub2_Sub2_Sub1_Sub1 local65 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local61];
			@Pc(70) int local70 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
			if (local70 == 0) {
				Static40.anIntArray110[Static29.anInt686++] = local61;
				local65.anInt2681 = Static107.anInt2338;
			} else {
				@Pc(93) int local93 = Static19.aClass2_Sub10_Sub1_1.method1538(2);
				if (local93 == 0) {
					Static40.anIntArray110[Static29.anInt686++] = local61;
					local65.anInt2681 = Static107.anInt2338;
					Static81.anIntArray255[Static107.anInt2342++] = local61;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local93 == 1) {
						Static40.anIntArray110[Static29.anInt686++] = local61;
						local65.anInt2681 = Static107.anInt2338;
						local140 = Static19.aClass2_Sub10_Sub1_1.method1538(3);
						local65.method1863(local140, false);
						local150 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
						if (local150 == 1) {
							Static81.anIntArray255[Static107.anInt2342++] = local61;
						}
					} else if (local93 == 2) {
						Static40.anIntArray110[Static29.anInt686++] = local61;
						local65.anInt2681 = Static107.anInt2338;
						local140 = Static19.aClass2_Sub10_Sub1_1.method1538(3);
						local65.method1863(local140, true);
						local150 = Static19.aClass2_Sub10_Sub1_1.method1538(3);
						local65.method1863(local150, true);
						@Pc(204) int local204 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
						if (local204 == 1) {
							Static81.anIntArray255[Static107.anInt2342++] = local61;
						}
					} else if (local93 == 3) {
						Static85.anIntArray257[Static17.anInt548++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
	public static void method352() {
		try {
			@Pc(11) Graphics local11 = Static51.aCanvas2.getGraphics();
			Static63.aClass9_30.method1585(4, local11, 550);
		} catch (@Pc(19) Exception local19) {
			Static51.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBII)V")
	public static void method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == Static113.anInt2442 && Static48.anInt1147 == arg3 && (Static71.anInt1547 == arg0 || !Static84.aBoolean73)) {
			return;
		}
		Static113.anInt2442 = arg2;
		Static48.anInt1147 = arg3;
		Static71.anInt1547 = arg0;
		if (!Static84.aBoolean73) {
			Static71.anInt1547 = 0;
		}
		Static106.method1597(25);
		Static9.method226(Static92.aClass74_1314, null, false);
		@Pc(57) int local57 = Static107.anInt2343;
		@Pc(59) int local59 = Static62.anInt1413;
		Static62.anInt1413 = arg3 * 8 - 48;
		@Pc(70) int local70 = Static62.anInt1413 - local59;
		Static107.anInt2343 = arg2 * 8 - 48;
		@Pc(83) int local83 = Static107.anInt2343 - local57;
		for (@Pc(87) int local87 = 0; local87 < 32768; local87++) {
			@Pc(93) Class2_Sub2_Sub2_Sub1_Sub1 local93 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local87];
			if (local93 != null) {
				for (@Pc(97) int local97 = 0; local97 < 10; local97++) {
					local93.anIntArray394[local97] -= local83;
					local93.anIntArray393[local97] -= local70;
				}
				local93.anInt2672 -= local70 * 128;
				local93.anInt2673 -= local83 * 128;
			}
		}
		for (@Pc(141) int local141 = 0; local141 < 2048; local141++) {
			@Pc(147) Class2_Sub2_Sub2_Sub1_Sub2 local147 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local141];
			if (local147 != null) {
				for (@Pc(151) int local151 = 0; local151 < 10; local151++) {
					local147.anIntArray394[local151] -= local83;
					local147.anIntArray393[local151] -= local70;
				}
				local147.anInt2672 -= local70 * 128;
				local147.anInt2673 -= local83 * 128;
			}
		}
		@Pc(197) byte local197 = 0;
		Static117.anInt2529 = arg0;
		Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.method1867(false, arg4, arg1);
		@Pc(209) byte local209 = 104;
		@Pc(211) byte local211 = 1;
		if (local83 < 0) {
			local209 = -1;
			local197 = 103;
			local211 = -1;
		}
		@Pc(224) byte local224 = 0;
		@Pc(226) byte local226 = 104;
		@Pc(228) byte local228 = 1;
		if (local70 < 0) {
			local224 = 103;
			local226 = -1;
			local228 = -1;
		}
		for (@Pc(241) int local241 = local197; local241 != local209; local241 += local211) {
			for (@Pc(245) int local245 = local224; local245 != local226; local245 += local228) {
				@Pc(251) int local251 = local245 + local70;
				@Pc(255) int local255 = local83 + local241;
				for (@Pc(257) int local257 = 0; local257 < 4; local257++) {
					if (local255 >= 0 && local251 >= 0 && local255 < 104 && local251 < 104) {
						Static41.aClass13ArrayArrayArray1[local257][local241][local245] = Static41.aClass13ArrayArrayArray1[local257][local255][local251];
					} else {
						Static41.aClass13ArrayArrayArray1[local257][local241][local245] = null;
					}
				}
			}
		}
		for (@Pc(329) Class2_Sub8 local329 = (Class2_Sub8) Static104.aClass13_66.method415(); local329 != null; local329 = (Class2_Sub8) Static104.aClass13_66.method414()) {
			local329.anInt921 -= local83;
			local329.anInt933 -= local70;
			if (local329.anInt921 < 0 || local329.anInt933 < 0 || local329.anInt921 >= 104 || local329.anInt933 >= 104) {
				local329.method1930();
			}
		}
		Static99.anInt2136 = -1;
		Static90.aBoolean76 = false;
		if (Static71.anInt1556 != 0) {
			Static71.anInt1556 -= local83;
			Static109.anInt2398 -= local70;
		}
		Static48.anInt1157 = 0;
		Static113.aClass13_58.method421();
		Static5.aClass13_4.method421();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ve;B)Lclient!ve;")
	public static Class2_Sub2_Sub17 method354(@OriginalArg(0) Class2_Sub2_Sub17 arg0) {
		@Pc(7) Class2_Sub2_Sub17 local7 = Static9.method228(arg0);
		if (local7 == null) {
			local7 = arg0.aClass2_Sub2_Sub17_5;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	public static void method355() {
		Static63.aClass9_30.method1589();
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
	public static void method356() {
		aClass74_410 = null;
		aClass74_408 = null;
		aClass74_407 = null;
		aClass74_406 = null;
		aClass74_409 = null;
		aClass74_405 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)I")
	public static int method357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class2_Sub2_Sub1_Sub4.anIntArray119[arg2 * 1024 / arg1] >> 1;
		return (local21 * arg3 >> 16) + ((65536 - local21) * arg0 >> 16);
	}
}
