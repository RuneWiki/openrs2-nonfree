import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
	public static int anInt3678;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1357 = Static161.method2452("New User");

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1355 = aClass20_1357;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1356 = Static161.method2452("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
	public static int anInt3681 = 0;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
	public static int anInt3683 = 0;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "[S")
	public static short[] aShortArray57 = new short[256];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!wa;B)V")
	public static void method2771(@OriginalArg(0) Class23 arg0) {
		Static197.aClass23_75 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)I")
	public static int method2772(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!wa;ZII)Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1 method2773(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static167.method2532(arg0, arg1, arg2) ? Static166.method2508() : null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Z")
	public static boolean method2774(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(22) int local22 = Static151.aShortArray40[arg0];
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		return local22 == 1002;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method2775() {
		Static9.method194(false);
		Static80.anInt1807 = 0;
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < Static104.aByteArrayArray7.length; local21++) {
			if (Static132.anIntArray382[local21] != -1 && Static104.aByteArrayArray7[local21] == null) {
				Static104.aByteArrayArray7[local21] = Static161.aClass23_Sub1_21.method738(0, Static132.anIntArray382[local21]);
				if (Static104.aByteArrayArray7[local21] == null) {
					local19 = false;
					Static80.anInt1807++;
				}
			}
			if (Static174.anIntArray369[local21] != -1 && Static44.aByteArrayArray3[local21] == null) {
				Static44.aByteArrayArray3[local21] = Static161.aClass23_Sub1_21.method740(Static174.anIntArray369[local21], 0, Static17.anIntArrayArray2[local21]);
				if (Static44.aByteArrayArray3[local21] == null) {
					local19 = false;
					Static80.anInt1807++;
				}
			}
		}
		if (!local19) {
			Static137.anInt2874 = 1;
			return;
		}
		local19 = true;
		Static52.anInt1112 = 0;
		@Pc(133) int local133;
		@Pc(122) int local122;
		for (@Pc(103) int local103 = 0; local103 < Static104.aByteArrayArray7.length; local103++) {
			@Pc(109) byte[] local109 = Static44.aByteArrayArray3[local103];
			if (local109 != null) {
				local122 = (Static125.anIntArray290[local103] & 0xFF) * 64 - Static110.anInt2295;
				local133 = (Static125.anIntArray290[local103] >> 8) * 64 - Static86.anInt1895;
				if (Static203.aBoolean181) {
					local133 = 10;
					local122 = 10;
				}
				local19 &= Static6.method154(local122, local109, local133);
			}
		}
		if (!local19) {
			Static137.anInt2874 = 2;
			return;
		}
		if (Static137.anInt2874 != 0) {
			Static167.method2533(Static70.method1166(new Class20[] { Static119.aClass20_924, Static170.aClass20_1261 }), true);
		}
		Static95.method1546();
		Static98.method1641();
		Static4.method117();
		for (@Pc(181) int local181 = 0; local181 < 4; local181++) {
			Static9.aClass76Array1[local181].method2223();
		}
		@Pc(204) int local204;
		for (local133 = 0; local133 < 4; local133++) {
			for (local122 = 0; local122 < 104; local122++) {
				for (local204 = 0; local204 < 104; local204++) {
					Static168.aByteArrayArrayArray13[local133][local122][local204] = 0;
				}
			}
		}
		Static83.method1435();
		Static95.method1546();
		System.gc();
		Static95.method1546();
		Static9.method194(true);
		Static85.method1459();
		if (!Static203.aBoolean181) {
			Static95.method1545();
			Static9.method194(true);
			Static151.method2319();
		}
		if (Static203.aBoolean181) {
			Static116.method1859();
			Static9.method194(true);
			Static201.method1362();
		}
		Static98.method1641();
		Static9.method194(true);
		Static95.method1546();
		Static150.method2297(Static9.aClass76Array1);
		Static9.method194(true);
		Static95.method1546();
		local122 = Static56.anInt1162;
		if (Static111.anInt2327 < local122) {
			local122 = Static111.anInt2327;
		}
		if (local122 < Static111.anInt2327 - 1) {
		}
		if (Static14.aBoolean14) {
			Static198.method2924(Static56.anInt1162);
		} else {
			Static198.method2924(0);
		}
		Static209.method3118();
		@Pc(333) int local333;
		for (local204 = 0; local204 < 104; local204++) {
			for (local333 = 0; local333 < 104; local333++) {
				Static88.method1474(local204, local333);
			}
		}
		Static95.method1546();
		Static131.method2026();
		Static98.method1641();
		if (Static116.aFrame1 != null) {
			Static43.aClass5_Sub6_Sub1_2.method3087(7);
			Static43.aClass5_Sub6_Sub1_2.method3030(1057001181);
		}
		if (!Static203.aBoolean181) {
			local333 = (Static132.anInt3723 - 6) / 8;
			@Pc(385) int local385 = (Static132.anInt3723 + 6) / 8;
			@Pc(391) int local391 = (Static119.anInt2546 - 6) / 8;
			@Pc(397) int local397 = (Static119.anInt2546 + 6) / 8;
			for (@Pc(401) int local401 = local333 - 1; local401 <= local385 + 1; local401++) {
				for (@Pc(407) int local407 = local391 - 1; local407 <= local397 + 1; local407++) {
					if (local333 > local401 || local385 < local401 || local391 > local407 || local407 > local397) {
						Static161.aClass23_Sub1_21.method729(Static70.method1166(new Class20[] { Static31.aClass20_244, Static132.method2805(local401), Static57.aClass20_448, Static132.method2805(local407) }));
						Static161.aClass23_Sub1_21.method729(Static70.method1166(new Class20[] { Static84.aClass20_676, Static132.method2805(local401), Static57.aClass20_448, Static132.method2805(local407) }));
					}
				}
			}
		}
		Static208.method3109(30);
		Static95.method1546();
		Static43.aClass5_Sub6_Sub1_2.method3087(70);
		Static28.method425();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
	public static void method2776(@OriginalArg(0) int arg0) {
		if (Static37.method1027(arg0)) {
			Static54.method941(Static155.aClass69ArrayArray1[arg0], -1);
		}
	}
}
