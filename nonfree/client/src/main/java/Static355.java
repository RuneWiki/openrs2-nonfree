import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	public static int anInt5529 = 0;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "J")
	public static final long aLong157 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public static void method4578() {
		@Pc(12) Class3_Sub9 local12 = Static587.method8316(Static187.aClass40_2, Static582.aClass230_109);
		local12.aClass3_Sub7_Sub1_1.method6494(Static216.method3759());
		local12.aClass3_Sub7_Sub1_1.method6528(Static582.anInt10234);
		local12.aClass3_Sub7_Sub1_1.method6528(Static294.anInt10217);
		local12.aClass3_Sub7_Sub1_1.method6494(Static455.aClass3_Sub27_Sub1_1.anInt4798);
		Static230.method3933(local12);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)I")
	public static int method4579(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIIBF[FI)V")
	public static void method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg3 - arg1;
		@Pc(9) int local9 = arg4 - arg2;
		@Pc(13) int local13 = arg8 - arg0;
		@Pc(38) float local38 = (float) local9 * arg7[2] + arg7[0] * (float) local13 + (float) local5 * arg7[1];
		@Pc(59) float local59 = (float) local9 * arg7[5] + (float) local5 * arg7[4] + arg7[3] * (float) local13;
		@Pc(80) float local80 = (float) local9 * arg7[8] + (float) local5 * arg7[7] + arg7[6] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(133) float local133 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg6 + 0.5F;
		@Pc(138) float local138;
		if (arg5 == 1) {
			local138 = local106;
			local106 = -local133;
			local133 = local138;
		} else if (arg5 == 2) {
			local106 = -local106;
			local133 = -local133;
		} else if (arg5 == 3) {
			local138 = local106;
			local106 = local133;
			local133 = -local138;
		}
		Static496.aFloat182 = local133;
		Static413.aFloat172 = local106;
	}
}
