import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
	public static int anInt922;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[112];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method729() {
		if (!Static40.method1450() && Static228.anInt5022 != Static145.anInt3477) {
			Static32.method666(false, false, Static239.aClass25_Sub1_Sub1_2.anIntArray173[0], Static239.aClass25_Sub1_Sub1_2.anIntArray172[0], Static238.anInt5219, Static145.anInt3477, Static222.anInt4928);
		} else if (Static33.anInt870 != Static145.anInt3477 && Static122.method2091(Static145.anInt3477)) {
			Static33.anInt870 = Static145.anInt3477;
			Static86.method1510();
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	public static void method730() {
		@Pc(9) int local9 = Static156.aClass1_Sub2_Sub16_3.method3966(Static141.aString94);
		@Pc(11) int local11;
		@Pc(24) int local24;
		for (local11 = 0; local11 < Static111.anInt2398; local11++) {
			local24 = Static156.aClass1_Sub2_Sub16_3.method3966(Static254.method4242(local11));
			if (local24 > local9) {
				local9 = local24;
			}
		}
		local9 += 8;
		local11 = Static111.anInt2398 * 15 + 21;
		local24 = Static190.anInt4241 - local9 / 2;
		if (local24 + local9 > Static193.anInt4370) {
			local24 = Static193.anInt4370 - local9;
		}
		if (local24 < 0) {
			local24 = 0;
		}
		@Pc(68) int local68 = Static281.anInt6019;
		if (Static144.anInt3368 < local11 + local68) {
			local68 = Static144.anInt3368 - local11;
		}
		if (local68 < 0) {
			local68 = 0;
		}
		if (Static259.anInt5653 == 1) {
			if (Static139.anInt6139 == Static190.anInt4241 && Static3.anInt108 == Static281.anInt6019) {
				Static82.anInt1976 = local9;
				Static66.anInt3695 = (Static236.aBoolean285 ? 26 : 22) + Static111.anInt2398 * 15;
				Static204.anInt4548 = local24;
				Static218.aBoolean267 = true;
				anInt922 = local68;
				Static259.anInt5653 = 0;
			}
		} else if (Static182.anInt4419 == Static190.anInt4241 && Static281.anInt6019 == Static279.anInt5967) {
			Static259.anInt5653 = 0;
			anInt922 = local68;
			Static218.aBoolean267 = true;
			Static82.anInt1976 = local9;
			Static66.anInt3695 = Static111.anInt2398 * 15 + (Static236.aBoolean285 ? 26 : 22);
			Static204.anInt4548 = local24;
		} else {
			Static139.anInt6139 = Static182.anInt4419;
			Static259.anInt5653 = 1;
			Static3.anInt108 = Static279.anInt5967;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBIZ)V")
	public static void method731(@OriginalArg(3) boolean arg0) {
		Static246.anInt5380 = 2;
		Static199.aBoolean240 = arg0;
		Static43.anInt1255 = 22050;
	}
}
