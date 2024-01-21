import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "Lclient!gf;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_10;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!ja;")
	public static Class33 aClass33_18 = new Class33(128);

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_290 = null;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_291 = Static60.method1113("<img=0>");

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "Lclient!ec;")
	public static Class22 aClass22_292 = Static60.method1113("p11_full");

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_9 = null;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "[I")
	public static int[] anIntArray130 = new int[25];

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
	public static int anInt1179 = 0;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "Lclient!ec;")
	public static Class22 aClass22_293 = Static60.method1113("mapmarker");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method817() {
		aClass22_290 = null;
		aClass4_Sub7_10 = null;
		aClass33_18 = null;
		aClass4_Sub7_9 = null;
		aClass22_291 = null;
		aClass11_1 = null;
		aClass22_292 = null;
		aClass22_293 = null;
		anIntArray130 = null;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)I")
	public static int method818() {
		@Pc(15) int local15 = Static69.method1173(Static37.anInt895, Static87.anInt2318, Static42.anInt885);
		return local15 - Static60.anInt1788 >= 800 || (Static3.aByteArrayArrayArray1[Static37.anInt895][Static87.anInt2318 >> 7][Static42.anInt885 >> 7] & 0x4) == 0 ? 3 : Static37.anInt895;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!nf;ZLclient!nf;)V")
	public static void method819(@OriginalArg(0) Class4_Sub1_Sub2_Sub4_Sub1 arg0, @OriginalArg(2) Class4_Sub1_Sub2_Sub4_Sub1 arg1) {
		if (Static57.aClass4_Sub1_Sub2_Sub2Array10 == null) {
			Static57.aClass4_Sub1_Sub2_Sub2Array10 = Static51.method987(Static58.aClass22_459, Static26.aClass20_Sub1_25, Static61.aClass22_474);
		}
		if (Static46.aClass4_Sub1_Sub2_Sub3Array3 == null) {
			Static46.aClass4_Sub1_Sub2_Sub3Array3 = Static48.method906(Static61.aClass22_474, Static54.aClass22_386, Static26.aClass20_Sub1_25);
		}
		if (Static35.aClass4_Sub1_Sub2_Sub3Array2 == null) {
			Static35.aClass4_Sub1_Sub2_Sub3Array2 = Static48.method906(Static61.aClass22_474, Static52.aClass22_370, Static26.aClass20_Sub1_25);
		}
		if (Static131.aClass4_Sub1_Sub2_Sub3Array10 == null) {
			Static131.aClass4_Sub1_Sub2_Sub3Array10 = Static48.method906(Static61.aClass22_474, Static92.aClass22_729, Static26.aClass20_Sub1_25);
		}
		Static118.method1373(0, 23, 765, 480, 0);
		Static118.method1379(0, 0, 125, 23, 12425273, 9135624);
		Static118.method1379(125, 0, 640, 23, 5197647, 2697513);
		arg0.method1417(Static4.aClass22_24, 62, 15, 0, -1);
		if (Static131.aClass4_Sub1_Sub2_Sub3Array10 != null) {
			Static131.aClass4_Sub1_Sub2_Sub3Array10[1].method853(140, 1);
			arg1.method1415(Static87.aClass22_653, 152, 10, 16777215, -1);
			Static131.aClass4_Sub1_Sub2_Sub3Array10[0].method853(140, 12);
			arg1.method1415(Static28.aClass22_184, 152, 21, 16777215, -1);
		}
		if (Static35.aClass4_Sub1_Sub2_Sub3Array2 != null) {
			if (Static130.anIntArray339[0] == 0 && Static80.anIntArray223[0] == 0) {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[2].method853(280, 4);
			} else {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[0].method853(280, 4);
			}
			if (Static130.anIntArray339[0] == 0 && Static80.anIntArray223[0] == 1) {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[3].method853(295, 4);
			} else {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[1].method853(295, 4);
			}
			arg0.method1415(Static13.aClass22_91, 312, 17, 16777215, -1);
			if (Static130.anIntArray339[0] == 1 && Static80.anIntArray223[0] == 0) {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[2].method853(390, 4);
			} else {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[0].method853(390, 4);
			}
			if (Static130.anIntArray339[0] == 1 && Static80.anIntArray223[0] == 1) {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[3].method853(405, 4);
			} else {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[1].method853(405, 4);
			}
			arg0.method1415(Static75.aClass22_555, 422, 17, 16777215, -1);
			if (Static130.anIntArray339[0] == 2 && Static80.anIntArray223[0] == 0) {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[2].method853(500, 4);
			} else {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[0].method853(500, 4);
			}
			if (Static130.anIntArray339[0] == 2 && Static80.anIntArray223[0] == 1) {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[3].method853(515, 4);
			} else {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[1].method853(515, 4);
			}
			arg0.method1415(Static30.aClass22_197, 532, 17, 16777215, -1);
			if (Static130.anIntArray339[0] == 3 && Static80.anIntArray223[0] == 0) {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[2].method853(610, 4);
			} else {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[0].method853(610, 4);
			}
			if (Static130.anIntArray339[0] == 3 && Static80.anIntArray223[0] == 1) {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[3].method853(625, 4);
			} else {
				Static35.aClass4_Sub1_Sub2_Sub3Array2[1].method853(625, 4);
			}
			arg0.method1415(Static93.aClass22_732, 642, 17, 16777215, -1);
		}
		Static118.method1373(708, 4, 50, 16, 0);
		arg1.method1417(Static76.aClass22_562, 733, 16, 16777215, -1);
		Static115.anInt2839 = -1;
		if (Static57.aClass4_Sub1_Sub2_Sub2Array10 != null) {
			@Pc(388) int local388 = 8;
			@Pc(394) int local394 = 24;
			@Pc(396) int local396;
			@Pc(398) int local398;
			do {
				local396 = local394;
				local398 = local388;
				if (local394 * (local388 - 1) >= Static62.anInt1802) {
					local388--;
				}
				if (Static62.anInt1802 <= (local394 - 1) * local388) {
					local394--;
				}
				if (Static62.anInt1802 <= (local394 - 1) * local388) {
					local394--;
				}
			} while (local394 != local396 || local388 != local398);
			local398 = (480 - local394 * 19) / (local394 + 1);
			if (local398 > 5) {
				local398 = 5;
			}
			local396 = (765 - local388 * 88) / (local388 + 1);
			if (local396 > 5) {
				local396 = 5;
			}
			@Pc(489) int local489 = (765 - local388 * 88 - local396 * (local388 - 1)) / 2;
			@Pc(505) int local505 = (480 - local398 * (local394 - 1) - local394 * 19) / 2;
			@Pc(509) int local509 = local505 + 23;
			@Pc(511) int local511 = local489;
			@Pc(513) int local513 = 0;
			for (@Pc(515) int local515 = 0; local515 < Static62.anInt1802; local515++) {
				@Pc(521) Class54 local521 = Static79.aClass54Array1[local515];
				@Pc(523) boolean local523 = true;
				@Pc(528) Class22 local528 = Static134.method2042(local521.anInt2251);
				if (local521.anInt2251 == -1) {
					local528 = Static30.aClass22_195;
					local523 = false;
				} else if (local521.anInt2251 > 1980) {
					local528 = Static103.aClass22_771;
					local523 = false;
				}
				if (local511 <= Static72.anInt1914 && Static117.anInt2876 >= local509 && local511 + 88 > Static72.anInt1914 && Static117.anInt2876 < local509 + 19 && local523) {
					Static115.anInt2839 = local515;
					Static57.aClass4_Sub1_Sub2_Sub2Array10[local521.aBoolean201 ? 1 : 0].method807(local511, local509);
				} else {
					Static57.aClass4_Sub1_Sub2_Sub2Array10[local521.aBoolean201 ? 1 : 0].method808(local511, local509);
				}
				if (Static46.aClass4_Sub1_Sub2_Sub3Array3 != null) {
					Static46.aClass4_Sub1_Sub2_Sub3Array3[(local521.aBoolean201 ? 8 : 0) + local521.anInt2249].method853(local511 + 29, local509);
				}
				arg0.method1417(Static134.method2042(local521.anInt2254), local511 + 15, local509 + 9 + 5, 0, -1);
				arg1.method1417(local528, local511 + 60, local509 + 5 + 9, 268435455, -1);
				local509 += local398 + 19;
				local513++;
				if (local394 <= local513) {
					local509 = local505 + 23;
					local513 = 0;
					local511 += local396 + 88;
				}
			}
		}
		try {
			@Pc(687) Graphics local687 = Static89.aCanvas1.getGraphics();
			aClass11_1.method578(local687);
		} catch (@Pc(700) Exception local700) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[II[I[Lclient!oe;)V")
	public static void method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class54[] arg4) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(12) int local12 = arg1 + 1;
		@Pc(18) int local18 = (arg0 + arg1) / 2;
		@Pc(22) Class54 local22 = arg4[local18];
		arg4[local18] = arg4[arg0];
		@Pc(32) int local32 = arg0 - 1;
		arg4[arg0] = local22;
		while (local32 < local12) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(64) int local64;
			@Pc(67) int local67;
			do {
				local12--;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg3[local43] == 2) {
						local67 = local22.anInt2256;
						local64 = arg4[local12].anInt2256;
					} else if (arg3[local43] == 1) {
						local64 = arg4[local12].anInt2251;
						local67 = local22.anInt2251;
						if (local64 == -1 && arg2[local43] == 1) {
							local64 = 2001;
						}
						if (local67 == -1 && arg2[local43] == 1) {
							local67 = 2001;
						}
					} else if (arg3[local43] == 3) {
						local64 = arg4[local12].aBoolean201 ? 1 : 0;
						local67 = local22.aBoolean201 ? 1 : 0;
					} else {
						local67 = local22.anInt2254;
						local64 = arg4[local12].anInt2254;
					}
					if (local64 != local67) {
						if ((arg2[local43] != 1 || local64 <= local67) && (arg2[local43] != 0 || local67 <= local64)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local32++;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg3[local43] == 2) {
						local67 = local22.anInt2256;
						local64 = arg4[local32].anInt2256;
					} else if (arg3[local43] == 1) {
						local67 = local22.anInt2251;
						if (local67 == -1 && arg2[local43] == 1) {
							local67 = 2001;
						}
						local64 = arg4[local32].anInt2251;
						if (local64 == -1 && arg2[local43] == 1) {
							local64 = 2001;
						}
					} else if (arg3[local43] == 3) {
						local64 = arg4[local32].aBoolean201 ? 1 : 0;
						local67 = local22.aBoolean201 ? 1 : 0;
					} else {
						local67 = local22.anInt2254;
						local64 = arg4[local32].anInt2254;
					}
					if (local67 != local64) {
						if ((arg2[local43] != 1 || local67 <= local64) && (arg2[local43] != 0 || local67 >= local64)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local32 < local12) {
				@Pc(326) Class54 local326 = arg4[local32];
				arg4[local32] = arg4[local12];
				arg4[local12] = local326;
			}
		}
		method820(arg0, local12, arg2, arg3, arg4);
		method820(local12 + 1, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
	public static int method821(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lclient!ia;")
	public static Class4_Sub1_Sub6 method822(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1_Sub6 local12 = (Class4_Sub1_Sub6) Static5.aClass33_3.method998((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(24) byte[] local24 = Static4.aClass20_4.method597(4, arg0);
		local12 = new Class4_Sub1_Sub6();
		if (local24 != null) {
			local12.method919(new Class4_Sub11(local24), arg0);
		}
		local12.method918();
		Static5.aClass33_3.method997((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public static void method823() {
		@Pc(13) int local13;
		for (@Pc(3) int local3 = -1; local3 < Static51.anInt1461; local3++) {
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static115.anIntArray310[local3];
			}
			@Pc(21) Class4_Sub1_Sub3_Sub2_Sub1 local21 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local13];
			if (local21 != null && local21.anInt2468 > 0) {
				local21.anInt2468--;
				if (local21.anInt2468 == 0) {
					local21.aClass22_715 = null;
				}
			}
		}
		for (local13 = 0; local13 < Static84.anInt2255; local13++) {
			@Pc(57) int local57 = Static13.anIntArray33[local13];
			@Pc(61) Class4_Sub1_Sub3_Sub2_Sub2 local61 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local57];
			if (local61 != null && local61.anInt2468 > 0) {
				local61.anInt2468--;
				if (local61.anInt2468 == 0) {
					local61.aClass22_715 = null;
				}
			}
		}
	}
}
