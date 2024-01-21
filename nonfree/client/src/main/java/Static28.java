import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	public static int anInt649;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "Lclient!ec;")
	private static Class22 aClass22_186 = Static60.method1113("Welcome to RuneScape");

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_183 = aClass22_186;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "Lclient!ec;")
	private static Class22 aClass22_187 = Static60.method1113("Free world");

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_184 = aClass22_187;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_185 = Static60.method1113("logo");

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!ec", name = "ib", descriptor = "I")
	public static int anInt671 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Z")
	public static boolean method446(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(18) int local18 = Static38.anIntArray111[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		return local18 == 1005;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method448() {
		aClass22_187 = null;
		aClass22_186 = null;
		aClass22_185 = null;
		aClass22_184 = null;
		aFont1 = null;
		aClass22_183 = null;
		anIntArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	public static void method451() {
		for (@Pc(15) int local15 = 0; local15 < Static50.anInt1405; local15++) {
			@Pc(21) int local21 = Static51.anIntArray146[local15];
			@Pc(25) Class4_Sub1_Sub3_Sub2_Sub2 local25 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local21];
			@Pc(29) int local29 = Static133.aClass4_Sub11_Sub1_3.method719();
			if ((local29 & 0x1) != 0) {
				local25.aClass4_Sub1_Sub10_1 = Static14.method279(Static133.aClass4_Sub11_Sub1_3.method711());
				local25.anInt2487 = local25.aClass4_Sub1_Sub10_1.anInt2165;
				local25.anInt2473 = local25.aClass4_Sub1_Sub10_1.anInt2153;
				local25.anInt2478 = local25.aClass4_Sub1_Sub10_1.anInt2146;
				local25.anInt2481 = local25.aClass4_Sub1_Sub10_1.anInt2171;
				local25.anInt2452 = local25.aClass4_Sub1_Sub10_1.anInt2152;
				local25.anInt2471 = local25.aClass4_Sub1_Sub10_1.anInt2158;
				local25.anInt2457 = local25.aClass4_Sub1_Sub10_1.anInt2170;
				local25.anInt2491 = local25.aClass4_Sub1_Sub10_1.anInt2157;
				local25.anInt2498 = local25.aClass4_Sub1_Sub10_1.anInt2163;
			}
			@Pc(101) int local101;
			if ((local29 & 0x8) != 0) {
				local25.anInt2489 = Static133.aClass4_Sub11_Sub1_3.method706();
				local101 = Static133.aClass4_Sub11_Sub1_3.method696();
				local25.anInt2466 = (local101 & 0xFFFF) + Static117.anInt2877;
				if (local25.anInt2489 == 65535) {
					local25.anInt2489 = -1;
				}
				local25.anInt2485 = local101 >> 16;
				local25.anInt2464 = 0;
				local25.anInt2507 = 0;
				if (local25.anInt2466 > Static117.anInt2877) {
					local25.anInt2507 = -1;
				}
			}
			@Pc(145) int local145;
			if ((local29 & 0x4) != 0) {
				local101 = Static133.aClass4_Sub11_Sub1_3.method716();
				local145 = Static133.aClass4_Sub11_Sub1_3.method716();
				local25.method1615(Static117.anInt2877, local145, local101);
				local25.anInt2456 = Static117.anInt2877 + 300;
				local25.anInt2508 = Static133.aClass4_Sub11_Sub1_3.method707();
				local25.anInt2493 = Static133.aClass4_Sub11_Sub1_3.method722();
			}
			if ((local29 & 0x40) != 0) {
				local25.aClass22_715 = Static133.aClass4_Sub11_Sub1_3.method742();
				local25.anInt2468 = 100;
			}
			if ((local29 & 0x20) != 0) {
				local25.anInt2509 = Static133.aClass4_Sub11_Sub1_3.method711();
				if (local25.anInt2509 == 65535) {
					local25.anInt2509 = -1;
				}
			}
			if ((local29 & 0x80) != 0) {
				local101 = Static133.aClass4_Sub11_Sub1_3.method719();
				local145 = Static133.aClass4_Sub11_Sub1_3.method707();
				local25.method1615(Static117.anInt2877, local145, local101);
				local25.anInt2456 = Static117.anInt2877 + 300;
				local25.anInt2508 = Static133.aClass4_Sub11_Sub1_3.method707();
				local25.anInt2493 = Static133.aClass4_Sub11_Sub1_3.method719();
			}
			if ((local29 & 0x10) != 0) {
				local101 = Static133.aClass4_Sub11_Sub1_3.method706();
				local145 = Static133.aClass4_Sub11_Sub1_3.method707();
				if (local101 == 65535) {
					local101 = -1;
				}
				if (local101 == local25.anInt2474 && local101 != -1) {
					@Pc(305) int local305 = Static79.method1437(local101).anInt3005;
					if (local305 == 1) {
						local25.anInt2492 = 0;
						local25.anInt2476 = 0;
						local25.anInt2477 = local145;
						local25.anInt2483 = 0;
					}
					if (local305 == 2) {
						local25.anInt2476 = 0;
					}
				} else if (local101 == -1 || local25.anInt2474 == -1 || Static79.method1437(local101).anInt2997 >= Static79.method1437(local25.anInt2474).anInt2997) {
					local25.anInt2501 = local25.anInt2460;
					local25.anInt2476 = 0;
					local25.anInt2474 = local101;
					local25.anInt2483 = 0;
					local25.anInt2477 = local145;
					local25.anInt2492 = 0;
				}
			}
			if ((local29 & 0x2) != 0) {
				local25.anInt2495 = Static133.aClass4_Sub11_Sub1_3.method711();
				local25.anInt2461 = Static133.aClass4_Sub11_Sub1_3.method706();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!o;III)V")
	public static void method460(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static99.anInt2589 >= 400) {
			return;
		}
		if (arg1.anIntArray221 != null) {
			arg1 = arg1.method1434();
		}
		if (arg1 == null || !arg1.aBoolean189) {
			return;
		}
		@Pc(28) Class22 local28 = arg1.aClass22_615;
		if (arg1.anInt2154 != 0) {
			local28 = Static44.method856(new Class22[] { local28, Static23.method391(arg1.anInt2154, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt1732), Static35.aClass22_244, Static51.aClass22_364, Static134.method2042(arg1.anInt2154), Static19.aClass22_150 });
		}
		if (Static104.anInt2636 == 1) {
			Static48.method905(arg2, Static35.aClass22_246, arg3, 58, Static44.method856(new Class22[] { Static43.aClass22_290, Static62.aClass22_479, local28 }), arg0);
		} else if (!Static128.aBoolean274) {
			@Pc(158) Class22[] local158 = arg1.aClass22Array17;
			if (Static78.aBoolean179) {
				local158 = Static104.method1728(local158);
			}
			@Pc(168) int local168;
			if (local158 != null) {
				for (local168 = 4; local168 >= 0; local168--) {
					if (local158[local168] != null && !local158[local168].method480(Static59.aClass22_463)) {
						@Pc(187) byte local187 = 0;
						if (local168 == 0) {
							local187 = 14;
						}
						if (local168 == 1) {
							local187 = 28;
						}
						if (local168 == 2) {
							local187 = 10;
						}
						if (local168 == 3) {
							local187 = 9;
						}
						if (local168 == 4) {
							local187 = 24;
						}
						Static48.method905(arg2, local158[local168], arg3, local187, Static44.method856(new Class22[] { Static115.aClass22_884, local28 }), arg0);
					}
				}
			}
			if (local158 != null) {
				for (local168 = 4; local168 >= 0; local168--) {
					if (local158[local168] != null && local158[local168].method480(Static59.aClass22_463)) {
						@Pc(267) short local267 = 0;
						if (arg1.anInt2154 > Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt1732) {
							local267 = 2000;
						}
						@Pc(280) int local280 = 0;
						if (local168 == 0) {
							local280 = local267 + 14;
						}
						if (local168 == 1) {
							local280 = local267 + 28;
						}
						if (local168 == 2) {
							local280 = local267 + 10;
						}
						if (local168 == 3) {
							local280 = local267 + 9;
						}
						if (local168 == 4) {
							local280 = local267 + 24;
						}
						Static48.method905(arg2, local158[local168], arg3, local280, Static44.method856(new Class22[] { Static115.aClass22_884, local28 }), arg0);
					}
				}
			}
			Static48.method905(arg2, Static113.aClass22_870, arg3, 1006, Static44.method856(new Class22[] { Static115.aClass22_884, local28 }), arg0);
		} else if ((Static73.anInt1961 & 0x2) == 2) {
			Static48.method905(arg2, Static124.aClass22_927, arg3, 12, Static44.method856(new Class22[] { Static12.aClass22_80, Static62.aClass22_479, local28 }), arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIIIII)V")
	public static void method466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static80.aClass4_Sub1_Sub2_Sub3Array8[0].method853(arg2, arg1);
		Static80.aClass4_Sub1_Sub2_Sub3Array8[1].method853(arg2, arg1 + arg4 - 16);
		Static118.method1373(arg2, arg1 + 16, 16, arg4 - 32, Static93.anInt2526);
		@Pc(45) int local45 = arg4 * (arg4 - 32) / arg3;
		if (local45 < 8) {
			local45 = 8;
		}
		@Pc(66) int local66 = arg0 * (arg4 - local45 - 32) / (arg3 - arg4);
		Static118.method1373(arg2, local66 + arg1 + 16, 16, local45, Static60.anInt1793);
		Static118.method1380(arg2, arg1 + local66 + 16, local45, Static120.anInt2928);
		Static118.method1380(arg2 + 1, local66 + 16 + arg1, local45, Static120.anInt2928);
		Static118.method1383(arg2, arg1 + local66 + 16, 16, Static120.anInt2928);
		Static118.method1383(arg2, local66 + arg1 + 17, 16, Static120.anInt2928);
		Static118.method1380(arg2 + 15, arg1 + 16 + local66, local45, Static90.anInt2394);
		Static118.method1380(arg2 + 14, arg1 - -local66 + 17, local45 - 1, Static90.anInt2394);
		Static118.method1383(arg2, arg1 + local66 + local45 + 15, 16, Static90.anInt2394);
		Static118.method1383(arg2 + 1, local45 + 14 + arg1 - -local66, 15, Static90.anInt2394);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB)V")
	public static void method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static111.anInt2765; local8++) {
			if (arg2 < Static121.anIntArray317[local8] + Static24.anIntArray62[local8] && Static121.anIntArray317[local8] < arg2 + arg0 && Static103.anIntArray294[local8] + Static16.anIntArray42[local8] > arg1 && Static103.anIntArray294[local8] < arg3 + arg1) {
				Static67.aBooleanArray11[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(ZI)Lclient!ud;")
	public static Class4_Sub1_Sub16 method485(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub16 local8 = (Class4_Sub1_Sub16) Static43.aClass33_18.method998((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static80.aClass20_Sub1_54.method597(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class4_Sub1_Sub16();
		@Pc(35) Class4_Sub11 local35 = new Class4_Sub11(local22);
		@Pc(37) int local37 = 0;
		local35.anInt1099 = local35.aByteArray9.length - 12;
		@Pc(48) int local48 = local35.method725();
		local8.anInt2922 = local35.method718();
		local8.anInt2925 = local35.method718();
		local8.anInt2927 = local35.method718();
		local8.anInt2924 = local35.method718();
		local35.anInt1099 = 0;
		local8.aClass22_905 = local35.method694();
		local8.anIntArray312 = new int[local48];
		local8.aClass22Array22 = new Class22[local48];
		local8.anIntArray313 = new int[local48];
		while (local35.aByteArray9.length - 12 > local35.anInt1099) {
			@Pc(94) int local94 = local35.method718();
			if (local94 == 3) {
				local8.aClass22Array22[local37] = local35.method742();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local8.anIntArray313[local37] = local35.method719();
			} else {
				local8.anIntArray313[local37] = local35.method725();
			}
			local8.anIntArray312[local37++] = local94;
		}
		Static43.aClass33_18.method997((long) arg0, local8);
		return local8;
	}
}
