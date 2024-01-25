import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray55 = new byte[50][];

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
	public static final int[] anIntArray827 = new int[5];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Z")
	public static boolean method9286(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public static void method9293() {
		for (@Pc(7) int local7 = 0; local7 < Static54.anInt1357; local7++) {
			Static673.aClass296Array4[local7] = null;
		}
		Static54.anInt1357 = 0;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (@Pc(25) int local25 = 0; local25 < Static613.anInt10338; local25++) {
			for (local34 = 0; local34 < Static28.anInt704; local34++) {
				for (local38 = 0; local38 < Static55.anInt1384; local38++) {
					@Pc(48) Class58 local48 = Static486.aClass58ArrayArrayArray2[local25][local38][local34];
					if (local48 != null) {
						if (local48.aShort24 > 0) {
							local48.aShort24 = (short) (local48.aShort24 * -1);
						}
						if (local48.aShort23 > 0) {
							local48.aShort23 = (short) (local48.aShort23 * -1);
						}
					}
				}
			}
		}
		for (local34 = 0; local34 < Static613.anInt10338; local34++) {
			for (local38 = 0; local38 < Static28.anInt704; local38++) {
				for (@Pc(99) int local99 = 0; local99 < Static55.anInt1384; local99++) {
					@Pc(109) Class58 local109 = Static486.aClass58ArrayArrayArray2[local34][local99][local38];
					if (local109 != null) {
						@Pc(132) boolean local132 = Static486.aClass58ArrayArrayArray2[0][local99][local38] != null && Static486.aClass58ArrayArrayArray2[0][local99][local38].aClass58_1 != null;
						@Pc(140) int local140;
						@Pc(142) int local142;
						@Pc(156) Class58 local156;
						@Pc(164) int local164;
						@Pc(316) int local316;
						@Pc(330) int local330;
						@Pc(337) int local337;
						@Pc(353) int local353;
						@Pc(360) int local360;
						@Pc(364) int local364;
						@Pc(368) int local368;
						@Pc(374) int local374;
						@Pc(413) int local413;
						@Pc(417) int local417;
						if (local109.aShort23 < 0) {
							local140 = local38;
							local142 = local38;
							local156 = Static486.aClass58ArrayArrayArray2[local34][local99][local38 - 1];
							local164 = Static343.aClass51Array1[local34].method7857(local38, local99);
							while (local140 > 0 && local156 != null && local156.aShort23 < 0 && local156.aShort23 == local109.aShort23 && local156.aShort21 == local109.aShort21 && Static343.aClass51Array1[local34].method7857(local140 - 1, local99) == local164 && (local140 - 1 <= 0 || Static343.aClass51Array1[local34].method7857(local140 - 2, local99) == local164)) {
								local140--;
								local156 = Static486.aClass58ArrayArrayArray2[local34][local99][local140 - 1];
							}
							for (local156 = Static486.aClass58ArrayArrayArray2[local34][local99][local38 + 1]; local142 < Static55.anInt1384 && local156 != null && local156.aShort23 < 0 && local109.aShort23 == local156.aShort23 && local109.aShort21 == local156.aShort21 && local164 == Static343.aClass51Array1[local34].method7857(local142 + 1, local99) && (local142 + 1 >= Static55.anInt1384 || Static343.aClass51Array1[local34].method7857(local142 + 2, local99) == local164); local156 = Static486.aClass58ArrayArrayArray2[local34][local99][local142 + 1]) {
								local142++;
							}
							local316 = local34 + 1 - local34;
							local330 = Static343.aClass51Array1[local132 ? local34 + 1 : local34].method7857(local140, local99);
							local337 = local316 * local109.aShort23 + local330;
							local353 = Static343.aClass51Array1[local132 ? local34 + 1 : local34].method7857(local142 + 1, local99);
							local360 = local316 * local109.aShort23 + local353;
							local364 = local99 << Static579.anInt9935;
							local368 = local140 << Static579.anInt9935;
							local374 = (local142 << Static579.anInt9935) + Static222.anInt4166;
							Static673.aClass296Array4[Static54.anInt1357++] = new Class296(1, local34, local364 + local109.aShort21, local364 - -local109.aShort21, local109.aShort21 + local364, local109.aShort21 + local364, local330, local353, local360, local337, local368, local374, local374, local368);
							for (local413 = local34; local413 <= local34; local413++) {
								for (local417 = local140; local417 <= local142; local417++) {
									Static486.aClass58ArrayArrayArray2[local413][local99][local417].aShort23 = (short) (Static486.aClass58ArrayArrayArray2[local413][local99][local417].aShort23 * -1);
								}
							}
						}
						if (local109.aShort24 < 0) {
							local140 = local99;
							local142 = local99;
							local156 = Static486.aClass58ArrayArrayArray2[local34][local99 - 1][local38];
							local164 = Static343.aClass51Array1[local34].method7857(local38, local99);
							while (local140 > 0 && local156 != null && local156.aShort24 < 0 && local156.aShort24 == local109.aShort24 && local109.aShort22 == local156.aShort22 && Static343.aClass51Array1[local34].method7857(local38, local140 - 1) == local164 && (local140 - 1 <= 0 || Static343.aClass51Array1[local34].method7857(local38, local140 - 2) == local164)) {
								local140--;
								local156 = Static486.aClass58ArrayArrayArray2[local34][local140 - 1][local38];
							}
							for (local156 = Static486.aClass58ArrayArrayArray2[local34][local99 + 1][local38]; local142 < Static28.anInt704 && local156 != null && local156.aShort24 < 0 && local156.aShort24 == local109.aShort24 && local156.aShort22 == local109.aShort22 && Static343.aClass51Array1[local34].method7857(local38, local142 + 1) == local164 && (local142 + 1 >= Static28.anInt704 || local164 == Static343.aClass51Array1[local34].method7857(local38, local142 + 2)); local156 = Static486.aClass58ArrayArrayArray2[local34][local142 + 1][local38]) {
								local142++;
							}
							local316 = local34 + 1 - local34;
							local330 = Static343.aClass51Array1[local132 ? local34 + 1 : local34].method7857(local38, local140);
							local337 = local316 * local109.aShort24 + local330;
							local353 = Static343.aClass51Array1[local132 ? local34 + 1 : local34].method7857(local38, local142 + 1);
							local360 = local353 + local109.aShort24 * local316;
							local364 = local140 << Static579.anInt9935;
							local368 = Static222.anInt4166 + (local142 << Static579.anInt9935);
							local374 = local38 << Static579.anInt9935;
							Static673.aClass296Array4[Static54.anInt1357++] = new Class296(2, local34, local364, local368, local368, local364, local330, local353, local360, local337, local374 + local109.aShort22, local109.aShort22 + local374, local109.aShort22 + local374, local109.aShort22 + local374);
							for (local413 = local34; local413 <= local34; local413++) {
								for (local417 = local140; local417 <= local142; local417++) {
									Static486.aClass58ArrayArrayArray2[local413][local417][local38].aShort24 = (short) (Static486.aClass58ArrayArrayArray2[local413][local417][local38].aShort24 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static200.aBoolean279 = true;
	}
}
