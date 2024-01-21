import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!id;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public static int anInt11;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public static final int anInt1 = 7759444;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public static int anInt2 = 0;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
	public static int[] anIntArray1 = new int[25];

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1 = Static28.method504("Username: ");

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!ja;")
	private static Class39 aClass39_5 = Static28.method504("This world is full)3");

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_2 = aClass39_5;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_3 = aClass39_1;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_4 = Static28.method504("blinken3:");

	@OriginalMember(owner = "client!a", name = "p", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array1 = new Class39[5];

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_6 = Static28.method504("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	public static int anInt9 = 0;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Lclient!c;")
	public static Class12 aClass12_1 = new Class12(30);

	@OriginalMember(owner = "client!a", name = "v", descriptor = "[[B")
	private static byte[][] aByteArrayArray1 = new byte[1000][];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBILclient!qd;I)V")
	public static void method1(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub2_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1 == arg2 || Static105.anInt2033 >= 400) {
			return;
		}
		@Pc(54) Class39 local54;
		if (arg2.anInt2432 == 0) {
			local54 = Static62.method1123(new Class39[] { arg2.aClass39_1279, Static50.method821(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2439, arg2.anInt2439), Static82.aClass39_1044, Static102.aClass39_1327, Static29.method510(arg2.anInt2439), Static9.aClass39_209 });
		} else {
			local54 = Static62.method1123(new Class39[] { arg2.aClass39_1279, Static82.aClass39_1044, Static45.aClass39_690, Static29.method510(arg2.anInt2432), Static9.aClass39_209 });
		}
		@Pc(130) int local130;
		if (Static59.anInt1555 == 1) {
			Static110.method1950(Static62.method1123(new Class39[] { Static52.aClass39_764, Static30.aClass39_419, local54 }), Static31.aClass39_428, arg0, arg1, arg3, 4);
		} else if (!Static78.aBoolean101) {
			for (local130 = 4; local130 >= 0; local130--) {
				if (aClass39Array1[local130] != null) {
					@Pc(142) short local142 = 0;
					@Pc(144) int local144 = 0;
					if (aClass39Array1[local130].method954(Static23.aClass39_364)) {
						if (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2439 < arg2.anInt2439) {
							local142 = 2000;
						}
						if (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2449 != 0 && arg2.anInt2449 != 0) {
							if (arg2.anInt2449 == Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2449) {
								local142 = 2000;
							} else {
								local142 = 0;
							}
						}
					} else if (Static13.aBooleanArray2[local130]) {
						local142 = 2000;
					}
					if (local130 == 0) {
						local144 = local142 + 30;
					}
					if (local130 == 1) {
						local144 = local142 + 24;
					}
					if (local130 == 2) {
						local144 = local142 + 18;
					}
					if (local130 == 3) {
						local144 = local142 + 25;
					}
					if (local130 == 4) {
						local144 = local142 + 3;
					}
					Static110.method1950(Static62.method1123(new Class39[] { Static127.aClass39_1758, local54 }), aClass39Array1[local130], arg0, arg1, arg3, local144);
				}
			}
		} else if ((Static44.anInt1130 & 0x8) == 8) {
			Static110.method1950(Static62.method1123(new Class39[] { Static24.aClass39_299, Static30.aClass39_419, local54 }), Static104.aClass39_1338, arg0, arg1, arg3, 28);
		}
		for (local130 = 0; local130 < Static105.anInt2033; local130++) {
			if (Static125.anIntArray358[local130] == 31) {
				Static52.aClass39Array11[local130] = Static62.method1123(new Class39[] { Static127.aClass39_1758, local54 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method2() {
		aClass39_4 = null;
		aClass39_6 = null;
		anIntArray1 = null;
		aClass39_5 = null;
		aClass12_1 = null;
		aClass39_2 = null;
		aClass39_1 = null;
		aClass39_3 = null;
		anIntArray2 = null;
		aByteArrayArray1 = null;
		aClass38_1 = null;
		aClass39Array1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3(@OriginalArg(1) int arg0) {
		@Pc(28) byte[] local28;
		if (arg0 == 100 && Static131.anInt3204 > 0) {
			local28 = aByteArrayArray1[--Static131.anInt3204];
			aByteArrayArray1[Static131.anInt3204] = null;
			return local28;
		} else if (arg0 == 5000 && Static59.anInt1557 > 0) {
			local28 = Static64.aByteArrayArray5[--Static59.anInt1557];
			Static64.aByteArrayArray5[Static59.anInt1557] = null;
			return local28;
		} else if (arg0 == 30000 && Static10.anInt330 > 0) {
			local28 = Static125.aByteArrayArray9[--Static10.anInt330];
			Static125.aByteArrayArray9[Static10.anInt330] = null;
			return local28;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method4() {
		if (!Static78.aBoolean101) {
			return;
		}
		@Pc(11) Class4_Sub5 local11 = Static59.method1051(Static101.anInt2518, Static65.anInt1667);
		if (local11 != null && local11.anObjectArray17 != null) {
			@Pc(20) Class4_Sub17 local20 = new Class4_Sub17();
			local20.aClass4_Sub5_51 = local11;
			local20.anObjectArray27 = local11.anObjectArray17;
			Static104.method1857(local20);
		}
		Static78.aBoolean101 = false;
		Static19.method344(local11);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBI)I")
	public static int method5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
	public static void method6(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) int local9 = 0; local9 < Static87.anInt2227; local9++) {
			if (Static11.anIntArray38[local9] + Static108.anIntArray301[local9] > arg0 && Static11.anIntArray38[local9] < arg0 + arg1 && Static94.anIntArray252[local9] + Static30.anIntArray89[local9] > arg2 && Static30.anIntArray89[local9] < arg2 + arg3) {
				Static13.aBooleanArray3[local9] = true;
			}
		}
	}
}
