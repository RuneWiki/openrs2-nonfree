import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_28 = new Class74();

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Lclient!on;")
	public static final Class154 aClass154_5 = new Class154(64);

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public static final int anInt3696 = -1;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	public static void method3333(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static248.aByteArrayArray16;
			local11 = 1;
		} else {
			local9 = Static75.aByteArrayArray7;
			local11 = 4;
		}
		@Pc(23) int[] local23 = null;
		for (@Pc(25) int local25 = 0; local25 < local11; local25++) {
			Static263.method4429();
			for (@Pc(30) int local30 = 0; local30 < Static15.anInt287 >> 3; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static325.anInt6173 >> 3; local34++) {
					@Pc(38) boolean local38 = false;
					@Pc(46) int local46 = Static142.anIntArrayArrayArray10[local25][local30][local34];
					if (local46 != -1) {
						@Pc(55) int local55 = local46 >> 24 & 0x3;
						if (!arg0 || local55 == 0) {
							@Pc(65) int local65 = local46 >> 1 & 0x3;
							@Pc(71) int local71 = local46 >> 14 & 0x3FF;
							@Pc(77) int local77 = local46 >> 3 & 0x7FF;
							@Pc(88) int local88 = (local71 / 8 << 8) + (local77 / 8);
							for (@Pc(90) int local90 = 0; local90 < Static94.anIntArray311.length; local90++) {
								if (local88 == Static94.anIntArray311[local90] && local9[local90] != null) {
									@Pc(125) int[] local125 = Static310.method5010(local25, local9[local90], arg0, local77, local65, Static327.aClass149Array1, local71, local34 * 8, Static128.aClass89_3, local55, local30 * 8);
									if (local23 == null && local125 != null) {
										local23 = local125;
									}
									local38 = true;
									break;
								}
							}
						}
					}
					if (!local38) {
						Static342.method5550(local25, 8, 8, local30 * 8, local34 * 8);
					}
				}
			}
		}
		if (local23 == null) {
			Static62.aClass46_1 = null;
		} else {
			Static62.aClass46_1 = Static251.method5278(local23[2], local23[1], local23[0], local23[3]);
			Static263.anInt5170 = local23[4];
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
	public static void method3335(@OriginalArg(0) int arg0) {
		Static142.anInt3109 = -1;
		Static107.anInt1502 = arg0;
		Static142.anInt3109 = -1;
		Static201.method3720();
	}
}
