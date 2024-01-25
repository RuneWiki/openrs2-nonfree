import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static680 {

	@OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
	public static int anInt10754;

	@OriginalMember(owner = "client!vg", name = "S", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!gg;[[B)V")
	public static void method8981(@OriginalArg(1) Class131_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt3589; local14++) {
			Static140.method2345();
			for (local20 = 0; local20 < Static362.anInt8653 >> 3; local20++) {
				for (local24 = 0; local24 < Static206.anInt11291 >> 3; local24++) {
					local34 = Static486.anIntArrayArrayArray6[local14][local20][local24];
					if (local34 != -1) {
						local44 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean291 || local44 == 0) {
							@Pc(60) int local60 = local34 >> 1 & 0x3;
							@Pc(66) int local66 = local34 >> 14 & 0x3FF;
							@Pc(72) int local72 = local34 >> 3 & 0x7FF;
							@Pc(83) int local83 = (local66 / 8 << 8) + (local72 / 8);
							for (@Pc(85) int local85 = 0; local85 < Static46.anIntArray54.length; local85++) {
								if (Static46.anIntArray54[local85] == local83 && arg1[local85] != null) {
									@Pc(111) Class3_Sub28 local111 = new Class3_Sub28(arg1[local85]);
									arg0.method3073(local111, local60, local44, local14, local24 * 8, Static678.aClass360Array5, local72, local66, local20 * 8);
									arg0.method3088(local44, local111, Static488.aClass67_12, local66, local60, local72, local24 * 8, local20 * 8, local14);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt3589; local20++) {
			Static140.method2345();
			for (local24 = 0; local24 < Static362.anInt8653 >> 3; local24++) {
				for (local34 = 0; local34 < Static206.anInt11291 >> 3; local34++) {
					local44 = Static486.anIntArrayArrayArray6[local20][local24][local34];
					if (local44 == -1) {
						arg0.method3072(local34 * 8, local20, 8, local24 * 8, 8);
					}
				}
			}
		}
	}
}
