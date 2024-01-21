import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "[I")
	public static int[] anIntArray101;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Lclient!ag;")
	public static Class4 aClass4_28;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Lclient!l;")
	public static Class45 aClass45_3 = new Class45(8);

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!dd;")
	public static Class13 aClass13_266 = Static161.method2971("title_mute");

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_267 = Static161.method2971("Die Verbindung konnte");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method658() {
		aClass13_266 = null;
		anIntArray101 = null;
		aClass45_3 = null;
		aClass4_28 = null;
		aClass13_267 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static171.method2892(arg6)) {
			Static82.aClass20Array2 = null;
			Static90.method1893(arg3, arg5, arg1, arg2, arg7, Static145.aClass20ArrayArray1[arg6], -1, arg4, arg0);
			if (Static82.aClass20Array2 != null) {
				Static90.method1893(Static67.anInt1952, arg5, arg1, arg2, arg7, Static82.aClass20Array2, -1412584499, arg4, Static90.anInt2630);
				Static82.aClass20Array2 = null;
			}
		} else if (arg2 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static140.aBooleanArray45[local19] = true;
			}
		} else {
			Static140.aBooleanArray45[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([S[Lclient!dd;I)V")
	public static void method660(@OriginalArg(0) short[] arg0, @OriginalArg(1) Class13[] arg1) {
		Static150.method2611(arg1, arg0, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method661() {
		while (true) {
			if (Static153.aClass1_Sub8_Sub1_2.method1659(Static89.anInt2506) >= 27) {
				@Pc(18) int local18 = Static153.aClass1_Sub8_Sub1_2.method1656(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local18] == null) {
						local25 = true;
						Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local18] = new Class1_Sub2_Sub2_Sub2_Sub1();
					}
					@Pc(41) Class1_Sub2_Sub2_Sub2_Sub1 local41 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local18];
					Static66.anIntArray202[Static74.anInt2127++] = local18;
					local41.anInt2597 = Static78.anInt2168;
					@Pc(57) int local57 = Static153.aClass1_Sub8_Sub1_2.method1656(5);
					if (local57 > 15) {
						local57 -= 32;
					}
					@Pc(68) int local68 = Static153.aClass1_Sub8_Sub1_2.method1656(5);
					if (local68 > 15) {
						local68 -= 32;
					}
					@Pc(79) int local79 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
					local41.aClass1_Sub2_Sub19_1 = Static165.method2827(Static153.aClass1_Sub8_Sub1_2.method1656(14));
					@Pc(94) int local94 = Static173.anIntArray443[Static153.aClass1_Sub8_Sub1_2.method1656(3)];
					if (local25) {
						local41.anInt2555 = local41.anInt2560 = local94;
					}
					@Pc(107) int local107 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
					if (local107 == 1) {
						Static147.anIntArray350[Static156.anInt3694++] = local18;
					}
					local41.anInt2577 = local41.aClass1_Sub2_Sub19_1.anInt3851;
					local41.anInt2550 = local41.aClass1_Sub2_Sub19_1.anInt3838;
					local41.anInt2574 = local41.aClass1_Sub2_Sub19_1.anInt3849;
					local41.anInt2583 = local41.aClass1_Sub2_Sub19_1.anInt3836;
					local41.anInt2552 = local41.aClass1_Sub2_Sub19_1.anInt3830;
					local41.anInt2582 = local41.aClass1_Sub2_Sub19_1.anInt3831;
					if (local41.anInt2577 == 0) {
						local41.anInt2560 = 0;
					}
					local41.anInt2581 = local41.aClass1_Sub2_Sub19_1.anInt3842;
					local41.anInt2561 = local41.aClass1_Sub2_Sub19_1.anInt3850;
					local41.anInt2584 = local41.aClass1_Sub2_Sub19_1.anInt3857;
					local41.method1884(local79 == 1, local57 + Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], local68 + Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0]);
					continue;
				}
			}
			Static153.aClass1_Sub8_Sub1_2.method1662();
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILclient!ag;)Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4 method662(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		return Static88.method1852(arg1, arg0) ? Static66.method1447() : null;
	}
}
