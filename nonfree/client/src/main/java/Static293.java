import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt6015;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[J")
	public static long[] aLongArray10;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public static int anInt6017 = 0;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_74 = new Class276(75, 12);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[FIIFIIIIF)V")
	public static void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg4 - arg0;
		@Pc(9) int local9 = arg8 - arg6;
		@Pc(17) int local17 = arg3 - arg7;
		@Pc(38) float local38 = arg2[1] * (float) local9 + arg2[0] * (float) local17 + (float) local5 * arg2[2];
		@Pc(59) float local59 = arg2[5] * (float) local5 + arg2[3] * (float) local17 + (float) local9 * arg2[4];
		@Pc(80) float local80 = arg2[6] * (float) local17 + arg2[7] * (float) local9 + (float) local5 * arg2[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg9 != 1.0F) {
			local91 *= arg9;
		}
		@Pc(105) float local105 = local59 + arg5 + 0.5F;
		@Pc(118) float local118;
		if (arg1 == 1) {
			local118 = local91;
			local91 = -local105;
			local105 = local118;
		} else if (arg1 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg1 == 3) {
			local118 = local91;
			local91 = local105;
			local105 = -local118;
		}
		Static430.aFloat174 = local105;
		Static314.aFloat124 = local91;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIB)Z")
	public static boolean method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method4983() {
		if (Static185.anInt3726 < 0) {
			Static423.anInt8217 = -1;
			Static593.anInt10380 = -1;
			Static185.anInt3726 = 0;
		}
		if (Static185.anInt3726 > Static87.anInt6925) {
			Static423.anInt8217 = -1;
			Static593.anInt10380 = -1;
			Static185.anInt3726 = Static87.anInt6925;
		}
		if (Static18.anInt597 < 0) {
			Static593.anInt10380 = -1;
			Static423.anInt8217 = -1;
			Static18.anInt597 = 0;
		}
		if (Static87.anInt6919 < Static18.anInt597) {
			Static18.anInt597 = Static87.anInt6919;
			Static593.anInt10380 = -1;
			Static423.anInt8217 = -1;
		}
	}
}
