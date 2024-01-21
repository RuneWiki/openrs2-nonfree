import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!ve;")
	public static Class2_Sub25 aClass2_Sub25_1;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!hf;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	public static int anInt739 = 0;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!gg;")
	private static Class28 aClass28_486 = Static107.method1838("Loading config )2 ");

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!gg;")
	private static Class28 aClass28_490 = Static107.method1838("Loaded interfaces");

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_487 = aClass28_490;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!gg;")
	private static Class28 aClass28_489 = Static107.method1838("Attack");

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_488 = aClass28_489;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!na;")
	public static Class2_Sub17 aClass2_Sub17_1 = new Class2_Sub17(0, 0);

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Lclient!gg;")
	public static Class28 aClass28_491 = aClass28_486;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Lclient!gg;")
	public static Class28 aClass28_492 = Static107.method1838("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method473() {
		if (!Static169.aBoolean165) {
			Static176.aShortArray41[0] = 1004;
			Static98.aClass28Array34[0] = Static95.aClass28_1404;
			Static150.anInt3365 = 1;
			Static80.aClass28Array29[0] = Static136.aClass28_1828;
		}
		if (Static118.anInt4001 != -1) {
			Static172.method2691(Static118.anInt4001);
		}
		for (@Pc(30) int local30 = 0; local30 < Static179.anInt4042; local30++) {
			if (Static123.aBooleanArray17[local30]) {
				Static59.aBooleanArray11[local30] = true;
			}
			Static11.aBooleanArray7[local30] = Static123.aBooleanArray17[local30];
			Static123.aBooleanArray17[local30] = false;
		}
		Static129.anInt3033 = Static156.anInt3491;
		Static151.anInt3392 = -1;
		Static44.anInt1155 = -1;
		Static13.aClass24_2 = null;
		if (Static118.anInt4001 != -1) {
			Static179.anInt4042 = 0;
			Static162.method2501(503, 0, 765, -1, 0, 0, 0, Static118.anInt4001);
		}
		Static161.method2808();
		Static26.method565();
		if (Static169.aBoolean165) {
			Static102.method1794();
		} else if (Static151.anInt3392 != -1) {
			Static155.method2400(Static44.anInt1155, Static151.anInt3392);
		}
		if (Static12.anInt554 == 3) {
			for (@Pc(109) int local109 = 0; local109 < Static179.anInt4042; local109++) {
				if (Static11.aBooleanArray7[local109]) {
					Static161.method2811(Static27.anIntArray264[local109], Static101.anIntArray29[local109], Static90.anIntArray221[local109], Static91.anIntArray223[local109], 16711935, 128);
				} else if (Static59.aBooleanArray11[local109]) {
					Static161.method2811(Static27.anIntArray264[local109], Static101.anIntArray29[local109], Static90.anIntArray221[local109], Static91.anIntArray223[local109], 16711680, 128);
				}
			}
		}
		Static31.method2857(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633, Static103.anInt2568, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635, Static119.anInt2853);
		Static119.anInt2853 = 0;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method474() {
		aClass2_Sub25_1 = null;
		aClass2_Sub17_1 = null;
		aClass28_492 = null;
		aClass28_489 = null;
		aClass28_491 = null;
		aClass32_1 = null;
		aClass28_488 = null;
		aClass28_486 = null;
		aClass28_490 = null;
		aClass28_487 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!eh;I)V")
	public static void method475(@OriginalArg(0) Class2_Sub4_Sub1_Sub1 arg0) {
		arg0.aBoolean82 = false;
		@Pc(22) Class2_Sub4_Sub2 local22;
		if (arg0.anInt1606 != -1) {
			local22 = Static49.method926(arg0.anInt1606);
			if (local22 == null || local22.anIntArray37 == null) {
				arg0.anInt1606 = -1;
			} else {
				arg0.anInt1602++;
				if (arg0.anInt1614 < local22.anIntArray37.length && arg0.anInt1602 > local22.anIntArray36[arg0.anInt1614]) {
					arg0.anInt1602 = 1;
					arg0.anInt1614++;
					Static119.method1970(arg0.anInt1635, arg0.anInt1633, arg0 == Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2, arg0.anInt1614, local22);
				}
				if (local22.anIntArray37.length <= arg0.anInt1614) {
					arg0.anInt1602 = 0;
					arg0.anInt1614 = 0;
					Static119.method1970(arg0.anInt1635, arg0.anInt1633, arg0 == Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2, arg0.anInt1614, local22);
				}
			}
		}
		if (arg0.anInt1627 != -1 && arg0.anInt1640 <= Static156.anInt3491) {
			if (arg0.anInt1611 < 0) {
				arg0.anInt1611 = 0;
			}
			@Pc(138) int local138 = Static19.method611(arg0.anInt1627).anInt1224;
			if (local138 == -1) {
				arg0.anInt1627 = -1;
			} else {
				@Pc(152) Class2_Sub4_Sub2 local152 = Static49.method926(local138);
				if (local152 == null || local152.anIntArray37 == null) {
					arg0.anInt1627 = -1;
				} else {
					arg0.anInt1622++;
					if (arg0.anInt1611 < local152.anIntArray37.length && arg0.anInt1622 > local152.anIntArray36[arg0.anInt1611]) {
						arg0.anInt1622 = 1;
						arg0.anInt1611++;
						Static119.method1970(arg0.anInt1635, arg0.anInt1633, arg0 == Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2, arg0.anInt1611, local152);
					}
					if (arg0.anInt1611 >= local152.anIntArray37.length) {
						arg0.anInt1627 = -1;
					}
				}
			}
		}
		if (arg0.anInt1653 != -1 && arg0.anInt1641 <= 1) {
			local22 = Static49.method926(arg0.anInt1653);
			if (local22.anInt474 == 1 && arg0.anInt1644 > 0 && arg0.anInt1620 <= Static156.anInt3491 && Static156.anInt3491 > arg0.anInt1632) {
				arg0.anInt1641 = 1;
				return;
			}
		}
		if (arg0.anInt1653 != -1 && arg0.anInt1641 == 0) {
			local22 = Static49.method926(arg0.anInt1653);
			if (local22 == null || local22.anIntArray37 == null) {
				arg0.anInt1653 = -1;
			} else {
				arg0.anInt1616++;
				if (local22.anIntArray37.length > arg0.anInt1597 && local22.anIntArray36[arg0.anInt1597] < arg0.anInt1616) {
					arg0.anInt1597++;
					arg0.anInt1616 = 1;
					Static119.method1970(arg0.anInt1635, arg0.anInt1633, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt1597, local22);
				}
				if (arg0.anInt1597 >= local22.anIntArray37.length) {
					arg0.anInt1609++;
					arg0.anInt1597 -= local22.anInt486;
					if (arg0.anInt1609 >= local22.anInt487) {
						arg0.anInt1653 = -1;
					} else if (arg0.anInt1597 >= 0 && arg0.anInt1597 < local22.anIntArray37.length) {
						Static119.method1970(arg0.anInt1635, arg0.anInt1633, arg0 == Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2, arg0.anInt1597, local22);
					} else {
						arg0.anInt1653 = -1;
					}
				}
				arg0.aBoolean82 = local22.aBoolean14;
			}
		}
		if (arg0.anInt1641 > 0) {
			arg0.anInt1641--;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZIIZ)Lclient!mc;")
	public static Class40_Sub1 method476(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class32 local5 = null;
		if (Static77.aClass5_3 != null) {
			local5 = new Class32(arg2, Static77.aClass5_3, Static62.aClass5Array1[arg2], 1000000);
		}
		return new Class40_Sub1(local5, aClass32_1, arg2, arg0, arg3, arg1);
	}
}
