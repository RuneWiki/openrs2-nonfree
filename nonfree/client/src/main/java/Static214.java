import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	public static int anInt1383 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)I")
	public static int method1167(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static244.method3859();
		for (@Pc(20) Class1_Sub19 local20 = arg0 ? (Class1_Sub19) Static284.aClass86_35.method2134() : (Class1_Sub19) Static284.aClass86_35.method2141(); local20 != null; local20 = (Class1_Sub19) Static284.aClass86_35.method2141()) {
			if ((local20.aLong120 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local20.aLong120 & 0x4000000000000000L) != 0L) {
					@Pc(52) int local52 = (int) local20.aLong210;
					Static99.anIntArray148[local52] = Static193.anIntArray402[local52];
					local20.method4573();
					return local52;
				}
				local20.method4573();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(CI)Z")
	public static boolean method1168(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!nm;IILclient!nm;)Lclient!me;")
	public static Class1_Sub5_Sub9_Sub2 method1170(@OriginalArg(1) Class119 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class119 arg2) {
		return Static114.method2083(arg1, arg2, 0) ? Static231.method3706(arg0.method3235(0, arg1)) : null;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
	public static void method1171() {
		if (Static249.aClass1_Sub5_Sub14_3 == null) {
			return;
		}
		if (Static114.anInt2348 < 10) {
			if (!Static249.aClass119_94.method3248(Static249.aClass1_Sub5_Sub14_3.aString120)) {
				Static114.anInt2348 = Static74.aClass119_28.method3238(Static249.aClass1_Sub5_Sub14_3.aString120) / 10;
				return;
			}
			Static276.method4234();
			Static114.anInt2348 = 10;
		}
		if (Static114.anInt2348 == 10) {
			Static249.anInt5571 = Static249.aClass1_Sub5_Sub14_3.anInt3534 >> 6 << 6;
			Static249.anInt5573 = Static249.aClass1_Sub5_Sub14_3.anInt3535 >> 6 << 6;
			Static249.anInt5575 = (Static249.aClass1_Sub5_Sub14_3.anInt3526 >> 6 << 6) + 64 - Static249.anInt5573;
			@Pc(73) int[] local73 = new int[3];
			Static249.anInt5574 = (Static249.aClass1_Sub5_Sub14_3.anInt3536 >> 6 << 6) + 64 - Static249.anInt5571;
			@Pc(87) int local87 = -1;
			@Pc(89) int local89 = -1;
			if (Static249.aClass1_Sub5_Sub14_3.method3125(local73, (Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7) + Static135.anInt2659, Static38.anInt714 - -(Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7), Static132.anInt2608)) {
				local87 = local73[1] - Static249.anInt5573;
				local89 = Static249.anInt5574 + Static249.anInt5571 - local73[2] - 1;
			}
			if (!Static62.aBoolean129 && local87 >= 0 && Static249.anInt5575 > local87 && local89 >= 0 && local89 < Static249.anInt5574) {
				local89 += (int) (Math.random() * 10.0D) - 5;
				Static175.anInt3415 = local89;
				local87 += (int) (Math.random() * 10.0D) - 5;
				Static54.anInt1167 = local87;
			} else if (Static107.anInt2250 == -1 || Static301.anInt5415 == -1) {
				Static249.aClass1_Sub5_Sub14_3.method3126(Static249.aClass1_Sub5_Sub14_3.anInt3528 >> 14 & 0x3FFF, Static249.aClass1_Sub5_Sub14_3.anInt3528 & 0x3FFF, local73);
				Static175.anInt3415 = Static249.anInt5571 + Static249.anInt5574 - local73[2] - 1;
				Static54.anInt1167 = local73[1] - Static249.anInt5573;
			} else {
				Static249.aClass1_Sub5_Sub14_3.method3126(Static107.anInt2250, Static301.anInt5415, local73);
				Static301.anInt5415 = -1;
				Static107.anInt2250 = -1;
				Static62.aBoolean129 = false;
				if (local73 != null) {
					Static175.anInt3415 = Static249.anInt5574 + Static249.anInt5571 - local73[2] - 1;
					Static54.anInt1167 = local73[1] - Static249.anInt5573;
				}
			}
			if (Static249.aClass1_Sub5_Sub14_3.anInt3533 == 37) {
				Static249.aFloat100 = 3.0F;
				Static249.aFloat101 = 3.0F;
			} else if (Static249.aClass1_Sub5_Sub14_3.anInt3533 == 50) {
				Static249.aFloat100 = 4.0F;
				Static249.aFloat101 = 4.0F;
			} else if (Static249.aClass1_Sub5_Sub14_3.anInt3533 == 75) {
				Static249.aFloat100 = 6.0F;
				Static249.aFloat101 = 6.0F;
			} else if (Static249.aClass1_Sub5_Sub14_3.anInt3533 == 100) {
				Static249.aFloat100 = 8.0F;
				Static249.aFloat101 = 8.0F;
			} else if (Static249.aClass1_Sub5_Sub14_3.anInt3533 == 200) {
				Static249.aFloat100 = 16.0F;
				Static249.aFloat101 = 16.0F;
			} else {
				Static249.aFloat100 = 8.0F;
				Static249.aFloat101 = 8.0F;
			}
			Static94.method1798();
			@Pc(308) int local308 = Static249.anInt5574 >> 6;
			Static249.anIntArray609 = new int[Static110.anInt2280 + 1];
			@Pc(317) int local317 = Static249.anInt5575 >> 6;
			Static249.aByteArrayArrayArray16 = new byte[local317][local308][];
			Static249.aByteArrayArrayArray20 = new byte[local317][local308][];
			Static249.aByteArrayArrayArray17 = new byte[local317][local308][];
			Static249.aByteArrayArrayArray19 = new byte[local317][local308][];
			Static249.anIntArrayArrayArray15 = new int[local317][local308][];
			Static249.aByteArrayArrayArray18 = new byte[local317][local308][];
			Static249.anIntArrayArrayArray16 = new int[local317][local308][];
			Static215.aClass96_18 = new Class96();
			Static234.aClass98_1 = new Class98();
			@Pc(359) int local359 = Static21.anInt442 >> 2 << 10;
			@Pc(363) int local363 = Static53.anInt1159 >> 1;
			Static249.method4636(local359, local363);
			Static153.method2081(1024, 256);
			Static84.method1709(256);
			Static114.anInt2348 = 20;
		} else if (Static114.anInt2348 == 20) {
			Static243.method3851(new Class1_Sub13(Static249.aClass119_94.method3220("underlay", Static249.aClass1_Sub5_Sub14_3.aString120)));
			Static114.anInt2348 = 30;
			Static173.method2973(true);
			Static165.method4610();
		} else if (Static114.anInt2348 == 30) {
			Static249.method4638(new Class1_Sub13(Static249.aClass119_94.method3220("overlay", Static249.aClass1_Sub5_Sub14_3.aString120)));
			Static114.anInt2348 = 40;
			Static165.method4610();
		} else if (Static114.anInt2348 == 40) {
			Static249.method4625(new Class1_Sub13(Static249.aClass119_94.method3220("overlay2", Static249.aClass1_Sub5_Sub14_3.aString120)));
			Static114.anInt2348 = 50;
			Static165.method4610();
		} else if (Static114.anInt2348 == 50) {
			Static249.method4629(new Class1_Sub13(Static249.aClass119_94.method3220("loc", Static249.aClass1_Sub5_Sub14_3.aString120)), Static217.aBoolean369);
			Static114.anInt2348 = 60;
			Static173.method2973(true);
			Static165.method4610();
		} else if (Static114.anInt2348 == 60) {
			if (Static249.aClass119_94.method3219(Static249.aClass1_Sub5_Sub14_3.aString120 + "_labels")) {
				if (!Static249.aClass119_94.method3248(Static249.aClass1_Sub5_Sub14_3.aString120 + "_labels")) {
					return;
				}
				Static249.aClass78_3 = Static24.method476(Static249.aClass1_Sub5_Sub14_3.aString120 + "_labels", Static217.aBoolean369, Static249.aClass119_94);
			} else {
				Static249.aClass78_3 = new Class78(0);
			}
			Static249.method4632();
			Static114.anInt2348 = 70;
			Static165.method4610();
		} else if (Static114.anInt2348 == 70) {
			Static239.aClass6_7 = new Class6(11, true, Static229.aCanvas2);
			Static114.anInt2348 = 73;
			Static173.method2973(true);
			Static165.method4610();
		} else if (Static114.anInt2348 == 73) {
			Static182.aClass6_6 = new Class6(12, true, Static229.aCanvas2);
			Static114.anInt2348 = 76;
			Static173.method2973(true);
			Static165.method4610();
		} else if (Static114.anInt2348 == 76) {
			Static289.aClass6_8 = new Class6(14, true, Static229.aCanvas2);
			Static114.anInt2348 = 79;
			Static173.method2973(true);
			Static165.method4610();
		} else if (Static114.anInt2348 == 79) {
			Static125.aClass6_3 = new Class6(17, true, Static229.aCanvas2);
			Static114.anInt2348 = 82;
			Static173.method2973(true);
			Static165.method4610();
		} else if (Static114.anInt2348 == 82) {
			Static24.aClass6_1 = new Class6(19, true, Static229.aCanvas2);
			Static114.anInt2348 = 85;
			Static173.method2973(true);
			Static165.method4610();
		} else if (Static114.anInt2348 == 85) {
			Static148.aClass6_5 = new Class6(22, true, Static229.aCanvas2);
			Static114.anInt2348 = 88;
			Static173.method2973(true);
			Static165.method4610();
		} else if (Static114.anInt2348 == 88) {
			Static55.aClass6_2 = new Class6(26, true, Static229.aCanvas2);
			Static114.anInt2348 = 91;
			Static173.method2973(true);
			Static165.method4610();
		} else {
			Static144.aClass6_4 = new Class6(30, true, Static229.aCanvas2);
			Static114.anInt2348 = 100;
			Static173.method2973(true);
			Static165.method4610();
			System.gc();
		}
	}
}
