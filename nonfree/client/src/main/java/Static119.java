import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	public static int anInt2901;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_898 = Static60.method1113("auf der Hautpseite)3");

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Lclient!ec;")
	public static Class22 aClass22_899 = Static60.method1113("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!ec;")
	public static Class22 aClass22_900 = Static60.method1113(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZI)V")
	public static void method1857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static38.aClass4_Sub11_Sub1_1.method752(172);
		Static38.aClass4_Sub11_Sub1_1.method713(arg1);
		Static38.aClass4_Sub11_Sub1_1.method735(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	public static void method1858() {
		@Pc(7) int local7 = Static101.anInt2612;
		@Pc(9) int local9 = Static39.anInt974;
		@Pc(11) int local11 = Static91.anInt2422;
		@Pc(15) int local15 = Static31.anInt801;
		Static118.method1373(local15, local7, local9, local11, 6116423);
		Static118.method1373(local15 + 1, local7 + 1, local9 - 2, 16, 0);
		Static118.method1378(local15 + 1, local7 - -18, local9 - 2, local11 - 19, 0);
		Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1415(Static5.aClass22_40, local15 + 3, local7 + 14, 6116423, -1);
		@Pc(60) int local60 = Static117.anInt2876;
		@Pc(62) int local62 = Static72.anInt1914;
		for (@Pc(64) int local64 = 0; local64 < Static99.anInt2589; local64++) {
			@Pc(68) int local68 = 16777215;
			@Pc(81) int local81 = (Static99.anInt2589 - local64 - 1) * 15 + local7 + 31;
			if (local15 < local62 && local15 + local9 > local62 && local60 > local81 - 13 && local60 < local81 + 3) {
				local68 = 16776960;
			}
			Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1415(Static92.method1620(local64), local15 + 3, local81, local68, 0);
		}
		Static28.method474(Static39.anInt974, Static101.anInt2612, Static31.anInt801, Static91.anInt2422);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method1859() {
		aClass22_899 = null;
		aClass22_900 = null;
		aByteArrayArray8 = null;
		aClass4_Sub1_Sub2_Sub2_7 = null;
		aClass22_898 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ea;Lclient!ea;)I")
	public static int method1860(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class20 arg1) {
		@Pc(10) int local10 = 0;
		if (arg1.method601(Static68.aClass22_144, Static61.aClass22_474)) {
			local10++;
		}
		if (arg0.method601(Static28.aClass22_185, Static61.aClass22_474)) {
			local10++;
		}
		if (arg0.method601(Static56.aClass22_394, Static61.aClass22_474)) {
			local10++;
		}
		if (arg0.method601(Static96.aClass22_717, Static61.aClass22_474)) {
			local10++;
		}
		if (arg0.method601(Static58.aClass22_452, Static61.aClass22_474)) {
			local10++;
		}
		if (arg0.method601(Static87.aClass22_663, Static61.aClass22_474)) {
			local10++;
		}
		arg0.method601(Static58.aClass22_459, Static61.aClass22_474);
		arg0.method601(Static54.aClass22_386, Static61.aClass22_474);
		arg0.method601(Static52.aClass22_370, Static61.aClass22_474);
		arg0.method601(Static92.aClass22_729, Static61.aClass22_474);
		arg0.method601(Static97.aClass22_752, Static61.aClass22_474);
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
	public static void method1861() {
		while (true) {
			if (Static133.aClass4_Sub11_Sub1_3.method750(Static96.anInt2463) >= 27) {
				@Pc(18) int local18 = Static133.aClass4_Sub11_Sub1_3.method748(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local18] == null) {
						local23 = true;
						Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local18] = new Class4_Sub1_Sub3_Sub2_Sub2();
					}
					@Pc(39) Class4_Sub1_Sub3_Sub2_Sub2 local39 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local18];
					Static13.anIntArray33[Static84.anInt2255++] = local18;
					local39.anInt2475 = Static117.anInt2877;
					@Pc(57) int local57 = Static27.anIntArray74[Static133.aClass4_Sub11_Sub1_3.method748(3)];
					if (local23) {
						local39.anInt2496 = local39.anInt2499 = local57;
					}
					@Pc(70) int local70 = Static133.aClass4_Sub11_Sub1_3.method748(5);
					@Pc(75) int local75 = Static133.aClass4_Sub11_Sub1_3.method748(1);
					if (local70 > 15) {
						local70 -= 32;
					}
					if (local75 == 1) {
						Static51.anIntArray146[Static50.anInt1405++] = local18;
					}
					local39.aClass4_Sub1_Sub10_1 = Static14.method279(Static133.aClass4_Sub11_Sub1_3.method748(14));
					@Pc(105) int local105 = Static133.aClass4_Sub11_Sub1_3.method748(1);
					@Pc(110) int local110 = Static133.aClass4_Sub11_Sub1_3.method748(5);
					local39.anInt2457 = local39.aClass4_Sub1_Sub10_1.anInt2170;
					local39.anInt2481 = local39.aClass4_Sub1_Sub10_1.anInt2171;
					local39.anInt2473 = local39.aClass4_Sub1_Sub10_1.anInt2153;
					local39.anInt2487 = local39.aClass4_Sub1_Sub10_1.anInt2165;
					local39.anInt2478 = local39.aClass4_Sub1_Sub10_1.anInt2146;
					if (local39.anInt2457 == 0) {
						local39.anInt2499 = 0;
					}
					local39.anInt2498 = local39.aClass4_Sub1_Sub10_1.anInt2163;
					local39.anInt2491 = local39.aClass4_Sub1_Sub10_1.anInt2157;
					local39.anInt2471 = local39.aClass4_Sub1_Sub10_1.anInt2158;
					local39.anInt2452 = local39.aClass4_Sub1_Sub10_1.anInt2152;
					if (local110 > 15) {
						local110 -= 32;
					}
					local39.method1610(local110 + Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], local105 == 1, local70 + Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0]);
					continue;
				}
			}
			Static133.aClass4_Sub11_Sub1_3.method751();
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public static void method1862() {
		for (@Pc(11) Class4_Sub1_Sub3_Sub6 local11 = (Class4_Sub1_Sub3_Sub6) Static73.aClass82_7.method2025(); local11 != null; local11 = (Class4_Sub1_Sub3_Sub6) Static73.aClass82_7.method2023()) {
			if (local11.anInt2671 != Static37.anInt895 || local11.anInt2678 < Static117.anInt2877) {
				local11.method1999();
			} else if (Static117.anInt2877 >= local11.anInt2685) {
				if (local11.anInt2683 > 0) {
					@Pc(43) Class4_Sub1_Sub3_Sub2_Sub2 local43 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local11.anInt2683 - 1];
					if (local43 != null && local43.anInt2500 >= 0 && local43.anInt2500 < 13312 && local43.anInt2462 >= 0 && local43.anInt2462 < 13312) {
						local11.method1752(local43.anInt2462, local43.anInt2500, Static117.anInt2877, Static69.method1173(local11.anInt2671, local43.anInt2500, local43.anInt2462) - local11.anInt2670);
					}
				}
				if (local11.anInt2683 < 0) {
					@Pc(96) int local96 = -local11.anInt2683 - 1;
					@Pc(103) Class4_Sub1_Sub3_Sub2_Sub1 local103;
					if (Static32.anInt824 == local96) {
						local103 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1;
					} else {
						local103 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local96];
					}
					if (local103 != null && local103.anInt2500 >= 0 && local103.anInt2500 < 13312 && local103.anInt2462 >= 0 && local103.anInt2462 < 13312) {
						local11.method1752(local103.anInt2462, local103.anInt2500, Static117.anInt2877, Static69.method1173(local11.anInt2671, local103.anInt2500, local103.anInt2462) - local11.anInt2670);
					}
				}
				local11.method1746(Static46.anInt1293);
				Static134.aClass77_1.method1950(Static37.anInt895, (int) local11.aDouble4, (int) local11.aDouble5, (int) local11.aDouble6, 60, local11, local11.anInt2690, -1, false);
			}
		}
	}
}
