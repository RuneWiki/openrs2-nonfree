import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!oa;")
	public static Class5 aClass5_11;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "[I")
	public static int[] anIntArray638;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
	public static int anInt7219;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public static int anInt7214 = 0;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "[S")
	public static final short[] aShortArray180 = new short[] { 49, 8, 3, 25, 48, 16, 60, 17 };

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII[FIIIFI)V")
	public static void method5993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 - arg1;
		@Pc(13) int local13 = arg2 - arg6;
		@Pc(17) int local17 = arg3 - arg8;
		@Pc(38) float local38 = arg4[2] * (float) local17 + (float) local13 * arg4[0] + (float) local9 * arg4[1];
		@Pc(59) float local59 = arg4[4] * (float) local9 + (float) local13 * arg4[3] + (float) local17 * arg4[5];
		@Pc(80) float local80 = arg4[7] * (float) local9 + (float) local13 * arg4[6] + (float) local17 * arg4[8];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg7 + 0.5F;
		@Pc(140) float local140;
		if (arg5 == 1) {
			local140 = local106;
			local106 = -local119;
			local119 = local140;
		} else if (arg5 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg5 == 3) {
			local140 = local106;
			local106 = local119;
			local119 = -local140;
		}
		Static307.aFloat155 = local119;
		Static497.aFloat259 = local106;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!lk;B)I")
	public static int method5995(@OriginalArg(0) Class177 arg0) {
		if (Static289.aClass177_2 == arg0) {
			return 9216;
		} else if (arg0 == Static534.aClass177_4) {
			return 34065;
		} else if (arg0 == Static254.aClass177_1) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
	public static int method5997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static166.anIntArray582[arg0 & 0x3] : Static70.anIntArray102[arg0 & 0x3];
	}
}
