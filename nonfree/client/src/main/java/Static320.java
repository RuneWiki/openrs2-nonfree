import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
	public static int[] anIntArray634;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_138 = new Class211(56, 8);

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_139 = new Class211(7, -1);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIBZZ)V")
	public static void method4702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg2 && arg0 == Static275.anInt4800 && Static35.anInt682 == arg1 && (Static35.anInt678 == Static122.anInt2188 || Static188.aClass135_Sub1_1.method2747(Static25.anInt394))) {
			return;
		}
		Static35.anInt678 = Static122.anInt2188;
		Static35.anInt682 = arg1;
		Static275.anInt4800 = arg0;
		if (Static188.aClass135_Sub1_1.method2747(Static25.anInt394)) {
			Static35.anInt678 = 0;
		}
		if (arg3) {
			Static212.method2974(28);
		} else {
			Static212.method2974(25);
		}
		Static62.method1008(Static125.aClass169_112.method3680(Static48.anInt952), Static334.aClass137_7, true);
		@Pc(68) int local68 = Static256.anInt4410;
		@Pc(70) int local70 = Static293.anInt5053;
		Static256.anInt4410 = (Static275.anInt4800 - (Static92.anInt1675 >> 4)) * 8;
		Static293.anInt5053 = (Static35.anInt682 - (Static262.anInt6340 >> 4)) * 8;
		Static286.aClass1_Sub6_Sub4_3 = Static353.method2110(Static275.anInt4800 * 8, Static35.anInt682 * 8);
		Static208.aClass93_3 = null;
		@Pc(103) int local103 = Static256.anInt4410 - local68;
		@Pc(108) int local108 = Static293.anInt5053 - local70;
		@Pc(118) int local118;
		@Pc(126) int local126;
		if (arg3) {
			Static309.anInt5243 = 0;
			local118 = Static92.anInt1675 * 128 - 128;
			@Pc(124) int local124 = (Static262.anInt6340 - 1) * 128;
			for (local126 = 0; local126 < 32768; local126++) {
				@Pc(132) Class25_Sub1_Sub1_Sub2 local132 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local126];
				if (local132 != null) {
					local132.anInt6077 -= local108 * 128;
					local132.anInt6080 -= local103 * 128;
					if (local132.anInt6080 >= 0 && local118 >= local132.anInt6080 && local132.anInt6077 >= 0 && local124 >= local132.anInt6077) {
						@Pc(180) boolean local180 = true;
						for (@Pc(182) int local182 = 0; local182 < 10; local182++) {
							local132.anIntArray296[local182] -= local103;
							local132.anIntArray295[local182] -= local108;
							if (local132.anIntArray296[local182] < 0 || Static92.anInt1675 <= local132.anIntArray296[local182] || local132.anIntArray295[local182] < 0 || local132.anIntArray295[local182] >= Static262.anInt6340) {
								local180 = false;
							}
						}
						if (local180) {
							Static131.anIntArray302[Static309.anInt5243++] = local126;
						} else {
							Static171.aClass25_Sub1_Sub1_Sub2Array1[local126].method1899(null);
							Static171.aClass25_Sub1_Sub1_Sub2Array1[local126] = null;
						}
					} else {
						Static171.aClass25_Sub1_Sub1_Sub2Array1[local126].method1899(null);
						Static171.aClass25_Sub1_Sub1_Sub2Array1[local126] = null;
					}
				}
			}
		} else {
			for (local118 = 0; local118 < 32768; local118++) {
				@Pc(285) Class25_Sub1_Sub1_Sub2 local285 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local118];
				if (local285 != null) {
					for (local126 = 0; local126 < 10; local126++) {
						local285.anIntArray296[local126] -= local103;
						local285.anIntArray295[local126] -= local108;
					}
					local285.anInt6080 -= local103 * 128;
					local285.anInt6077 -= local108 * 128;
				}
			}
		}
		for (local118 = 0; local118 < 2048; local118++) {
			@Pc(341) Class25_Sub1_Sub1_Sub1 local341 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local118];
			if (local341 != null) {
				for (local126 = 0; local126 < 10; local126++) {
					local341.anIntArray296[local126] -= local103;
					local341.anIntArray295[local126] -= local108;
				}
				local341.anInt6080 -= local103 * 128;
				local341.anInt6077 -= local108 * 128;
			}
		}
		Static72.method1158(local103, local108);
		for (@Pc(400) Class1_Sub14 local400 = (Class1_Sub14) Static271.aClass17_53.method202(); local400 != null; local400 = (Class1_Sub14) Static271.aClass17_53.method207()) {
			local400.anInt1831 -= local103;
			local400.anInt1823 -= local108;
			if (local400.anInt1831 < 0 || local400.anInt1823 < 0 || Static92.anInt1675 <= local400.anInt1831 || Static262.anInt6340 <= local400.anInt1823) {
				local400.method5577();
			}
		}
		Static104.anInt1830 = 0;
		if (Static190.anInt3337 != 0) {
			Static190.anInt3337 -= local103;
			Static76.anInt5658 -= local108;
		}
		if (arg3) {
			Static17.anInt306 -= local103;
			Static360.anInt3947 -= local108;
			Static226.anInt3832 -= local108;
			Static256.anInt4409 -= local103 * 128;
			Static391.anInt6384 -= local103;
			Static133.anInt2471 -= local108 * 128;
			if (Math.abs(local103) > Static92.anInt1675 || Math.abs(local108) > Static262.anInt6340) {
				Static146.method2198();
			}
		} else if (Static323.anInt5463 == 4) {
			Static85.anInt1570 -= local103 * 128;
			Static16.anInt287 -= local108 * 128;
			Static305.anInt5159 -= local103 * 128;
			Static92.anInt1674 -= local108 * 128;
		} else {
			Static323.anInt5463 = 1;
		}
		Static88.method1340();
		Static372.method1264();
		Static137.aClass17_23.method205();
		Static310.aClass17_63.method205();
		Static10.aClass208_1.method4657();
		Static166.method2985();
	}
}
