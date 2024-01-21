import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public static int anInt3002;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!of;")
	public static Class1_Sub19 aClass1_Sub19_6;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Z")
	public static boolean aBoolean176;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_28;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!ie;")
	public static Class35 aClass35_34;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "Lclient!n;")
	public static Class51 aClass51_4;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array24;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public static int anInt3003 = 0;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[S")
	public static short[] aShortArray19 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!id;")
	private static Class34 aClass34_1538 = Static9.method266("Examine");

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_1539 = Static9.method266("Wordpack geladen)3");

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!id;")
	private static Class34 aClass34_1542 = Static9.method266("Loaded config");

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!id;")
	public static Class34 aClass34_1540 = aClass34_1542;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "Lclient!id;")
	private static Class34 aClass34_1541 = Static9.method266("Prepared visibility map");

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!id;")
	public static Class34 aClass34_1543 = aClass34_1541;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "[I")
	public static int[] anIntArray370 = new int[5];

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Lclient!id;")
	public static Class34 aClass34_1544 = Static9.method266("headicons_pk");

	@OriginalMember(owner = "client!w", name = "C", descriptor = "I")
	public static int anInt3014 = 0;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "Lclient!id;")
	public static Class34 aClass34_1545 = aClass34_1538;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "J")
	public static volatile long aLong155 = 0L;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method1991() {
		Static76.aClass63_12.method1665();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIB)I")
	public static int method1992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg2;
			arg2 = local6;
		}
		@Pc(14) int local14 = arg4 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return 7 + 1 - arg1 - arg3;
		} else if (local14 == 2) {
			return 1 + 7 - arg2 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	public static void method1993() {
		while (true) {
			if (Static51.aClass1_Sub19_Sub1_4.method2104(Static81.anInt2134) >= 27) {
				@Pc(18) int local18 = Static51.aClass1_Sub19_Sub1_4.method2096(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18] == null) {
						Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18] = new Class1_Sub1_Sub1_Sub1_Sub2();
						local25 = true;
					}
					@Pc(41) Class1_Sub1_Sub1_Sub1_Sub2 local41 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18];
					Static1.anIntArray19[Static64.anInt1731++] = local18;
					local41.anInt1435 = Static73.anInt1947;
					@Pc(57) int local57 = Static51.aClass1_Sub19_Sub1_4.method2096(5);
					@Pc(64) int local64 = Static44.anIntArray127[Static51.aClass1_Sub19_Sub1_4.method2096(3)];
					if (local25) {
						local41.anInt1402 = local41.anInt1436 = local64;
					}
					@Pc(77) int local77 = Static51.aClass1_Sub19_Sub1_4.method2096(5);
					if (local77 > 15) {
						local77 -= 32;
					}
					if (local57 > 15) {
						local57 -= 32;
					}
					@Pc(92) int local92 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
					if (local92 == 1) {
						Static17.anIntArray65[Static32.anInt1453++] = local18;
					}
					local41.aClass1_Sub1_Sub17_1 = Static65.method1119(Static51.aClass1_Sub19_Sub1_4.method2096(14));
					@Pc(118) int local118 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
					local41.anInt1395 = local41.aClass1_Sub1_Sub17_1.anInt3056;
					local41.anInt1447 = local41.aClass1_Sub1_Sub17_1.anInt3046;
					local41.anInt1409 = local41.aClass1_Sub1_Sub17_1.anInt3036;
					local41.anInt1443 = local41.aClass1_Sub1_Sub17_1.anInt3042;
					local41.anInt1432 = local41.aClass1_Sub1_Sub17_1.anInt3057;
					local41.anInt1398 = local41.aClass1_Sub1_Sub17_1.anInt3044;
					if (local41.anInt1432 == 0) {
						local41.anInt1436 = 0;
					}
					local41.anInt1404 = local41.aClass1_Sub1_Sub17_1.anInt3063;
					local41.anInt1442 = local41.aClass1_Sub1_Sub17_1.anInt3062;
					local41.anInt1392 = local41.aClass1_Sub1_Sub17_1.anInt3040;
					local41.method903(local77 + Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0] + local57, local118 == 1);
					continue;
				}
			}
			Static51.aClass1_Sub19_Sub1_4.method2095();
			return;
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	public static void method1995() {
		aClass34_1539 = null;
		aClass35_34 = null;
		aClass51_4 = null;
		aClass34_1543 = null;
		aClass34_1541 = null;
		aShortArray19 = null;
		anIntArray370 = null;
		aClass34_1544 = null;
		aClass34_1540 = null;
		aClass34_1545 = null;
		aClass34_1538 = null;
		aClass1_Sub19_6 = null;
		aClass34_1542 = null;
		aClass34Array24 = null;
		aClass35_Sub1_28 = null;
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	public static void method1997() {
		Static92.aClass63_16.method1665();
	}
}
