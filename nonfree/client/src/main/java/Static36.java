import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!qc;")
	private static Class60 aClass60_384 = Static121.method2047("Existing User");

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_385 = aClass60_384;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_386 = Static121.method2047("va");

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_387 = Static121.method2047("Angreifen");

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
	public static int[] anIntArray71 = new int[500];

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!qc;")
	public static Class60 aClass60_388 = Static121.method2047(" )2> ");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method634() {
		@Pc(14) int local14;
		for (@Pc(7) int local7 = -1; local7 < Static43.anInt1107; local7++) {
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static94.anIntArray231[local7];
			}
			@Pc(24) Class4_Sub4_Sub1_Sub2_Sub2 local24 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local14];
			if (local24 != null && local24.anInt2596 > 0) {
				local24.anInt2596--;
				if (local24.anInt2596 == 0) {
					local24.aClass60_1059 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static114.anInt2750; local14++) {
			@Pc(56) int local56 = Static38.anIntArray72[local14];
			@Pc(60) Class4_Sub4_Sub1_Sub2_Sub1 local60 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local56];
			if (local60 != null && local60.anInt2596 > 0) {
				local60.anInt2596--;
				if (local60.anInt2596 == 0) {
					local60.aClass60_1059 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method635() {
		anIntArray71 = null;
		aByteArrayArrayArray2 = null;
		aClass60_387 = null;
		aClass60_384 = null;
		aClass60_388 = null;
		aClass60_386 = null;
		aClass60_385 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!jf;)V")
	public static void method636(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static90.aBoolean86) {
			Static119.method2025(arg0);
			return;
		}
		if (Static3.anInt28 == 1 && Static128.anInt2648 >= 715 && Static22.anInt652 >= 453) {
			Static130.aBoolean125 = !Static130.aBoolean125;
			if (Static130.aBoolean125) {
				Static31.method599();
			} else {
				Static5.method34(Static69.aClass60_631, Static33.aClass60_365, Static5.aClass40_Sub1_3);
			}
		}
		if (Static71.anInt1828 == 5) {
			return;
		}
		Static108.anInt2554++;
		if (Static71.anInt1828 != 10) {
			return;
		}
		if (Static7.anInt2989 != 2 && Static25.anInt697 == 0) {
			if (Static3.anInt28 == 1 && Static128.anInt2648 >= 5 && Static128.anInt2648 <= 105 && Static22.anInt652 >= 463 && Static22.anInt652 <= 498) {
				Static115.method1946();
				return;
			}
			if (Static127.aClass23_1 != null) {
				Static115.method1946();
			}
		}
		@Pc(103) int local103 = Static3.anInt28;
		@Pc(105) int local105 = Static128.anInt2648;
		@Pc(107) int local107 = Static22.anInt652;
		if (Static90.anInt2110 == 0) {
			if (local103 == 1 && local105 >= 227 && local105 <= 377 && local107 >= 271 && local107 <= 311) {
				Static90.anInt2110 = 3;
				Static54.anInt1381 = 0;
			}
			if (local103 != 1 || local105 < 387 || local105 > 537 || local107 < 271 || local107 > 311) {
				return;
			}
			Static33.aClass60_368 = Static71.aClass60_707;
			Static90.anInt2110 = 2;
			Static54.anInt1381 = 0;
			Static33.aClass60_364 = Static71.aClass60_708;
			Static33.aClass60_362 = Static121.aClass60_1155;
			return;
		}
		if (Static90.anInt2110 == 2) {
			@Pc(121) short local121 = 231;
			@Pc(122) int local122 = local121 + 30;
			if (local103 == 1 && local107 >= 246 && local107 < 261) {
				Static54.anInt1381 = 0;
			}
			local122 += 15;
			if (local103 == 1 && local107 >= 261 && local107 < 276) {
				Static54.anInt1381 = 1;
			}
			local122 += 15;
			if (local103 == 1 && local105 >= 227 && local105 <= 377 && local107 >= 301 && local107 <= 341) {
				Static33.aClass60_361 = Static33.aClass60_361.method1668().method1651();
				if (Static33.aClass60_361.method1644() == 0) {
					Static37.method637(Static71.aClass60_682, Static60.aClass60_947, Static71.aClass60_664);
					return;
				}
				if (Static33.aClass60_371.method1644() == 0) {
					Static37.method637(Static71.aClass60_684, Static5.aClass60_27, Static71.aClass60_666);
					return;
				}
				Static37.method637(Static71.aClass60_687, Static127.aClass60_1193, Static71.aClass60_698);
				Static4.method32(20);
				return;
			}
			if (local103 == 1 && local105 >= 387 && local105 <= 537 && local107 >= 301 && local107 <= 341) {
				Static33.aClass60_371 = Static33.aClass60_365;
				Static33.aClass60_361 = Static33.aClass60_365;
				Static90.anInt2110 = 0;
			}
			while (true) {
				while (Static61.method1127()) {
					@Pc(266) boolean local266 = false;
					for (@Pc(268) int local268 = 0; local268 < Static99.aClass60_984.method1644(); local268++) {
						if (Static13.anInt427 == Static99.aClass60_984.method1634(local268)) {
							local266 = true;
							break;
						}
					}
					if (Static54.anInt1381 == 0) {
						if (Static111.anInt2685 == 85 && Static33.aClass60_361.method1644() > 0) {
							Static33.aClass60_361 = Static33.aClass60_361.method1657(Static33.aClass60_361.method1644() - 1, 0);
						}
						if (Static111.anInt2685 == 84 || Static111.anInt2685 == 80) {
							Static54.anInt1381 = 1;
						}
						if (local266 && Static33.aClass60_361.method1644() < 12) {
							Static33.aClass60_361 = Static33.aClass60_361.method1638(Static13.anInt427);
						}
					} else if (Static54.anInt1381 == 1) {
						if (Static111.anInt2685 == 85 && Static33.aClass60_371.method1644() > 0) {
							Static33.aClass60_371 = Static33.aClass60_371.method1657(Static33.aClass60_371.method1644() - 1, 0);
						}
						if (Static111.anInt2685 == 84 || Static111.anInt2685 == 80) {
							Static54.anInt1381 = 0;
						}
						if (Static105.anInt2515 == 2 && Static111.anInt2685 == 84) {
							Static33.aClass60_361 = Static33.aClass60_361.method1668().method1651();
							if (Static33.aClass60_361.method1644() == 0) {
								Static37.method637(Static71.aClass60_682, Static60.aClass60_947, Static71.aClass60_664);
								return;
							}
							if (Static33.aClass60_371.method1644() == 0) {
								Static37.method637(Static71.aClass60_684, Static5.aClass60_27, Static71.aClass60_666);
								return;
							}
							Static37.method637(Static71.aClass60_687, Static127.aClass60_1193, Static71.aClass60_698);
							Static4.method32(20);
							return;
						}
						if (local266 && Static33.aClass60_371.method1644() < 20) {
							Static33.aClass60_371 = Static33.aClass60_371.method1638(Static13.anInt427);
						}
					}
				}
				return;
			}
		}
		if (Static90.anInt2110 == 3 && local103 == 1 && local105 >= 307 && local105 <= 457 && local107 >= 301 && local107 <= 341) {
			Static90.anInt2110 = 0;
			return;
		}
	}
}
