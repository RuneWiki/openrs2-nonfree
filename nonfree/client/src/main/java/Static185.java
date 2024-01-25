import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_77 = new Class56(23, -1);

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "J")
	public static long aLong101 = 0L;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
	public static int anInt3523 = -1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!vs;ILclient!vs;)V")
	public static void method3151(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_62 != null) {
			arg1.method7614();
		}
		arg1.aClass3_Sub7_61 = arg0.aClass3_Sub7_61;
		arg1.aClass3_Sub7_62 = arg0;
		arg1.aClass3_Sub7_62.aClass3_Sub7_61 = arg1;
		arg1.aClass3_Sub7_61.aClass3_Sub7_62 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIFI[FI)V")
	public static void method3152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg2 - arg3;
		@Pc(9) int local9 = arg1 - arg8;
		@Pc(13) int local13 = arg4 - arg0;
		@Pc(38) float local38 = arg7[1] * (float) local5 + (float) local13 * arg7[0] + arg7[2] * (float) local9;
		@Pc(59) float local59 = (float) local5 * arg7[4] + arg7[3] * (float) local13 + arg7[5] * (float) local9;
		@Pc(80) float local80 = (float) local5 * arg7[7] + arg7[6] * (float) local13 + (float) local9 * arg7[8];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg5 + 0.5F;
		@Pc(136) float local136;
		if (arg6 == 1) {
			local136 = local106;
			local106 = -local119;
			local119 = local136;
		} else if (arg6 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg6 == 3) {
			local136 = local106;
			local106 = local119;
			local119 = -local136;
		}
		Static233.aFloat98 = local106;
		Static105.aFloat46 = local119;
	}
}
