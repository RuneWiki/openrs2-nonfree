import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!e", name = "J", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!e", name = "N", descriptor = "I")
	public static int anInt733;

	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_4;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!va;")
	public static Class61 aClass61_283 = Static88.method1421("compass");

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "Lclient!va;")
	private static Class61 aClass61_288 = Static88.method1421("To create a new account you need to");

	@OriginalMember(owner = "client!e", name = "y", descriptor = "Lclient!va;")
	public static Class61 aClass61_284 = aClass61_288;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!va;")
	private static Class61 aClass61_285 = Static88.method1421("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!e", name = "C", descriptor = "Lclient!va;")
	public static Class61 aClass61_286 = Static88.method1421("(Z");

	@OriginalMember(owner = "client!e", name = "F", descriptor = "Lclient!va;")
	public static Class61 aClass61_287 = aClass61_285;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!e", name = "M", descriptor = "[I")
	public static int[] anIntArray78 = new int[500];

	@OriginalMember(owner = "client!e", name = "X", descriptor = "[Lclient!rb;")
	public static Class10_Sub1_Sub5_Sub4[] aClass10_Sub1_Sub5_Sub4Array1 = new Class10_Sub1_Sub5_Sub4[4];

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
	public static int anInt743 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method467() {
		anIntArray77 = null;
		aClass61_288 = null;
		aClass61_287 = null;
		aClass61_286 = null;
		aClass61_284 = null;
		aClass61_283 = null;
		aClass61_285 = null;
		anIntArray78 = null;
		aClass11_Sub1_4 = null;
		aClass10_Sub1_Sub5_Sub4Array1 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 method468() {
		@Pc(7) Class10_Sub1_Sub1_Sub2 local7 = new Class10_Sub1_Sub1_Sub2();
		local7.anInt1568 = Static1.anInt4;
		local7.anInt1565 = anInt740;
		local7.anInt1569 = Static96.anIntArray321[0];
		local7.anInt1567 = Static54.anIntArray158[0];
		local7.anInt1570 = Static88.anIntArray306[0];
		local7.anInt1566 = Static71.anIntArray207[0];
		local7.anIntArray173 = Static25.anIntArray80;
		local7.aByteArray5 = Static47.aByteArrayArray8[0];
		Static1.method5();
		return local7;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public static void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) (arg0 + (arg1 << 16));
		@Pc(21) Class10_Sub1_Sub9 local21 = (Class10_Sub1_Sub9) Static18.aClass50_2.method1250(local6);
		if (local21 != null) {
			Static94.aClass40_2.method895(local21);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZI)V")
	public static void method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg0; local3++) {
			for (@Pc(7) int local7 = arg2; local7 <= arg3 + arg2; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static18.aByteArrayArrayArray3[0][local7][local3] = 127;
					if (local7 == arg2 && local7 > 0) {
						Static37.anIntArrayArrayArray1[0][local7][local3] = Static37.anIntArrayArrayArray1[0][local7 - 1][local3];
					}
					if (arg3 + arg2 == local7 && local7 < 103) {
						Static37.anIntArrayArrayArray1[0][local7][local3] = Static37.anIntArrayArrayArray1[0][local7 + 1][local3];
					}
					if (arg1 == local3 && local3 > 0) {
						Static37.anIntArrayArrayArray1[0][local7][local3] = Static37.anIntArrayArrayArray1[0][local7][local3 - 1];
					}
					if (local3 == arg0 + arg1 && local3 < 103) {
						Static37.anIntArrayArrayArray1[0][local7][local3] = Static37.anIntArrayArrayArray1[0][local7][local3 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method471() {
		if (Static5.aClass13_1 == null) {
			return;
		}
		if (Static55.anInt1488 < 0) {
			if (Static80.anInt2152 > 0) {
				Static80.anInt2152--;
				if (Static80.anInt2152 == 0) {
					if (Static40.aByteArray4 == null) {
						Static5.aClass13_1.method1504(256);
					} else {
						Static5.aClass13_1.method1504(Static78.anInt2114);
						Static55.anInt1488 = Static78.anInt2114;
						Static5.aClass13_1.method1500(Static78.anInt2114, Static40.aByteArray4, Static55.aBoolean73);
						Static40.aByteArray4 = null;
					}
					Static25.anInt781 = 0;
				}
			}
		} else if (Static80.anInt2152 > 0) {
			Static25.anInt781 += Static62.anInt1711;
			Static5.aClass13_1.method1503(Static55.anInt1488, Static25.anInt781);
			Static80.anInt2152--;
			if (Static80.anInt2152 == 0) {
				Static5.aClass13_1.method1506();
				Static80.anInt2152 = 20;
				Static55.anInt1488 = -1;
			}
		}
		Static5.aClass13_1.method1505();
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static void method472() {
		if (Static74.anInt1876 != 0) {
			return;
		}
		Static19.aClass61Array7[0] = Static18.aClass61_203;
		Static29.anIntArray96[0] = 1002;
		Static23.anInt747 = 1;
		if (Static53.anInt1448 != -1) {
			Static89.anInt2328 = -1;
			Static26.anInt1666 = -1;
			Static26.method925(0, 0, Static28.anInt889, 0, 0, 765, -1, Static53.anInt1448, 503, Static17.anInt597);
			Static105.anInt2641 = Static26.anInt1666;
			Static6.anInt66 = Static89.anInt2328;
			return;
		}
		Static15.method339();
		Static89.anInt2328 = -1;
		@Pc(51) boolean local51 = false;
		Static26.anInt1666 = -1;
		if (Static28.anInt889 > 4 && Static17.anInt597 > 4 && Static28.anInt889 < 516 && Static17.anInt597 < 338) {
			if (Static23.anInt752 == -1) {
				Static17.method400();
			} else {
				Static26.method925(4, 0, Static28.anInt889, 0, 4, 516, -1, Static23.anInt752, 338, Static17.anInt597);
			}
		}
		Static6.anInt66 = Static89.anInt2328;
		Static89.anInt2328 = -1;
		Static105.anInt2641 = Static26.anInt1666;
		Static26.anInt1666 = -1;
		if (Static28.anInt889 > 553 && Static17.anInt597 > 205 && Static28.anInt889 < 743 && Static17.anInt597 < 466) {
			if (Static57.anInt1518 != -1) {
				Static26.method925(205, 0, Static28.anInt889, 1, 553, 743, -1, Static57.anInt1518, 466, Static17.anInt597);
			} else if (Static34.anIntArray114[Static25.anInt782] != -1) {
				Static26.method925(205, 0, Static28.anInt889, 1, 553, 743, -1, Static34.anIntArray114[Static25.anInt782], 466, Static17.anInt597);
			}
		}
		if (Static34.anInt1019 != Static89.anInt2328) {
			Static80.aBoolean94 = true;
			Static34.anInt1019 = Static89.anInt2328;
		}
		Static89.anInt2328 = -1;
		if (Static26.anInt1666 != Static96.anInt2448) {
			Static80.aBoolean94 = true;
			Static96.anInt2448 = Static26.anInt1666;
		}
		Static26.anInt1666 = -1;
		if (Static28.anInt889 > 17 && Static17.anInt597 > 357 && Static28.anInt889 < 496 && Static17.anInt597 < 453) {
			if (Static74.anInt1871 != -1) {
				Static26.method925(357, 0, Static28.anInt889, 2, 17, 496, -1, Static74.anInt1871, 453, Static17.anInt597);
			} else if (Static98.anInt2479 != -1) {
				Static26.method925(357, 0, Static28.anInt889, 3, 17, 496, -1, Static98.anInt2479, 453, Static17.anInt597);
			} else if (Static17.anInt597 < 434 && Static28.anInt889 < 426) {
				Static105.method1649(Static17.anInt597 - 357, Static28.anInt889 + -17);
			}
		}
		if ((Static74.anInt1871 != -1 || Static98.anInt2479 != -1) && Static74.anInt1875 != Static89.anInt2328) {
			Static74.anInt1875 = Static89.anInt2328;
			Static7.aBoolean1 = true;
		}
		if ((Static74.anInt1871 != -1 || Static98.anInt2479 != -1) && Static19.anInt631 != Static26.anInt1666) {
			Static19.anInt631 = Static26.anInt1666;
			Static7.aBoolean1 = true;
		}
		while (!local51) {
			local51 = true;
			for (@Pc(283) int local283 = 0; local283 < Static23.anInt747 - 1; local283++) {
				if (Static29.anIntArray96[local283] < 1000 && Static29.anIntArray96[local283 + 1] > 1000) {
					local51 = false;
					@Pc(305) Class61 local305 = Static19.aClass61Array7[local283];
					Static19.aClass61Array7[local283] = Static19.aClass61Array7[local283 + 1];
					Static19.aClass61Array7[local283 + 1] = local305;
					@Pc(323) int local323 = Static29.anIntArray96[local283];
					Static29.anIntArray96[local283] = Static29.anIntArray96[local283 + 1];
					Static29.anIntArray96[local283 + 1] = local323;
					@Pc(341) int local341 = Static38.anIntArray121[local283];
					Static38.anIntArray121[local283] = Static38.anIntArray121[local283 + 1];
					Static38.anIntArray121[local283 + 1] = local341;
					@Pc(359) int local359 = anIntArray78[local283];
					anIntArray78[local283] = anIntArray78[local283 + 1];
					anIntArray78[local283 + 1] = local359;
					@Pc(377) int local377 = Static33.anIntArray108[local283];
					Static33.anIntArray108[local283] = Static33.anIntArray108[local283 + 1];
					Static33.anIntArray108[local283 + 1] = local377;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	public static void method473(@OriginalArg(0) int arg0) {
		Static51.anInt1420 = arg0;
	}
}
