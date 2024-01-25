import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "[I")
	public static final int[] anIntArray89 = new int[4];

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!cr;B[[B)V")
	public static void method855(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1034; local11++) {
			Static330.method4331();
			for (@Pc(17) int local17 = 0; local17 < Static333.anInt3375 >> 3; local17++) {
				for (@Pc(21) int local21 = 0; local21 < Static102.anInt2086 >> 3; local21++) {
					@Pc(31) int local31 = Static17.anIntArrayArrayArray1[local11][local17][local21];
					if (local31 != -1) {
						@Pc(40) int local40 = local31 >> 24 & 0x3;
						if (!arg0.aBoolean64 || local40 == 0) {
							@Pc(54) int local54 = local31 >> 1 & 0x3;
							@Pc(60) int local60 = local31 >> 14 & 0x3FF;
							@Pc(66) int local66 = local31 >> 3 & 0x7FF;
							@Pc(76) int local76 = (local60 / 8 << 8) + local66 / 8;
							for (@Pc(78) int local78 = 0; local78 < Static331.anIntArray494.length; local78++) {
								if (Static331.anIntArray494[local78] == local76 && arg1[local78] != null) {
									arg0.method814((local60 & 0x7) * 8, arg1[local78], local11, Static179.aClass70Array3, (local66 & 0x7) * 8, local21 * 8, local17 * 8, Static269.aClass51_9, local54, local40);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
