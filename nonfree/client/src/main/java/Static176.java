import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1309 = Static151.method2243(":");

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public static final int[] anIntArray323 = new int[25];

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1310 = Static151.method2243("Freie Welt");

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1311 = Static151.method2243("<col=00ff00>");

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1312 = Static151.method2243("<col=40ff00>");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt3717 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIII)V")
	public static void method2553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static64.anInt1337 == arg3 && arg2 == Static18.anInt449 && (Static119.anInt2627 == arg4 || !Static60.aBoolean52)) {
			return;
		}
		Static64.anInt1337 = arg3;
		Static18.anInt449 = arg2;
		Static119.anInt2627 = arg4;
		if (!Static60.aBoolean52) {
			Static119.anInt2627 = 0;
		}
		Static2.method55(25);
		Static175.method2549(Static17.aClass62_132, true);
		@Pc(49) int local49 = Static116.anInt2535;
		@Pc(51) int local51 = Static153.anInt3278;
		Static153.anInt3278 = (arg2 - 6) * 8;
		Static116.anInt2535 = (arg3 - 6) * 8;
		@Pc(67) int local67 = Static153.anInt3278 - local51;
		@Pc(71) int local71 = Static116.anInt2535 - local49;
		for (@Pc(77) int local77 = 0; local77 < 32768; local77++) {
			@Pc(83) Class7_Sub2_Sub1 local83 = Static9.aClass7_Sub2_Sub1Array1[local77];
			if (local83 != null) {
				for (@Pc(87) int local87 = 0; local87 < 10; local87++) {
					local83.anIntArray275[local87] -= local71;
					local83.anIntArray274[local87] -= local67;
				}
				local83.anInt3085 -= local67 * 128;
				local83.anInt3046 -= local71 * 128;
			}
		}
		for (@Pc(133) int local133 = 0; local133 < 2048; local133++) {
			@Pc(139) Class7_Sub2_Sub2 local139 = Static62.aClass7_Sub2_Sub2Array1[local133];
			if (local139 != null) {
				for (@Pc(143) int local143 = 0; local143 < 10; local143++) {
					local139.anIntArray275[local143] -= local71;
					local139.anIntArray274[local143] -= local67;
				}
				local139.anInt3046 -= local71 * 128;
				local139.anInt3085 -= local67 * 128;
			}
		}
		Static126.anInt2806 = arg4;
		@Pc(191) byte local191 = 1;
		@Pc(193) byte local193 = 0;
		Static186.aClass7_Sub2_Sub2_1.method2176(arg0, arg1, false);
		@Pc(201) byte local201 = 104;
		if (local71 < 0) {
			local193 = 103;
			local191 = -1;
			local201 = -1;
		}
		@Pc(211) byte local211 = 0;
		@Pc(213) byte local213 = 104;
		@Pc(215) byte local215 = 1;
		if (local67 < 0) {
			local211 = 103;
			local215 = -1;
			local213 = -1;
		}
		for (@Pc(225) int local225 = local193; local225 != local201; local225 += local191) {
			for (@Pc(229) int local229 = local211; local229 != local213; local229 += local215) {
				@Pc(235) int local235 = local67 + local229;
				@Pc(239) int local239 = local71 + local225;
				for (@Pc(241) int local241 = 0; local241 < 4; local241++) {
					if (local239 >= 0 && local235 >= 0 && local239 < 104 && local235 < 104) {
						Static13.aClass13ArrayArrayArray1[local241][local225][local229] = Static13.aClass13ArrayArrayArray1[local241][local239][local235];
					} else {
						Static13.aClass13ArrayArrayArray1[local241][local225][local229] = null;
					}
				}
			}
		}
		for (@Pc(304) Class2_Sub25 local304 = (Class2_Sub25) Static76.aClass13_3.method303(); local304 != null; local304 = (Class2_Sub25) Static76.aClass13_3.method309()) {
			local304.anInt4163 -= local67;
			local304.anInt4168 -= local71;
			if (local304.anInt4168 < 0 || local304.anInt4163 < 0 || local304.anInt4168 >= 104 || local304.anInt4163 >= 104) {
				local304.method3183();
			}
		}
		Static83.anInt1739 = 0;
		Static162.aBoolean147 = false;
		Static179.anInt3763 = -1;
		if (Static11.anInt310 != 0) {
			Static11.anInt310 -= local71;
			Static76.anInt1575 -= local67;
		}
		Static163.aClass13_11.method314();
		Static179.aClass13_13.method314();
	}
}
