import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!qw", name = "x", descriptor = "I")
	public static int anInt3795;

	@OriginalMember(owner = "client!qw", name = "y", descriptor = "I")
	public static int anInt3796;

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
	public static int anInt3783 = 0;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)V")
	public static void method3328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class12_Sub4_Sub1 local10 = Static389.method6156(5, arg0);
		local10.method820();
		local10.anInt806 = arg1;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([FIFIIBIIII)V")
	public static void method3330(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg1 - arg8;
		@Pc(13) int local13 = arg4 - arg5;
		@Pc(17) int local17 = arg6 - arg7;
		@Pc(38) float local38 = arg0[2] * (float) local13 + arg0[0] * (float) local5 + (float) local17 * arg0[1];
		@Pc(59) float local59 = (float) local17 * arg0[4] + arg0[3] * (float) local5 + arg0[5] * (float) local13;
		@Pc(80) float local80 = arg0[8] * (float) local13 + arg0[6] * (float) local5 + arg0[7] * (float) local17;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg2 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(142) float local142;
		if (arg3 == 1) {
			local142 = local106;
			local106 = -local119;
			local119 = local142;
		} else if (arg3 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg3 == 3) {
			local142 = local106;
			local106 = local119;
			local119 = -local142;
		}
		Static147.aFloat80 = local106;
		Static191.aFloat111 = local119;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
	public static void method3337() {
		Static8.anInt118 = 0;
		Static192.aClass73_33.method2014();
		Static389.aBoolean533 = false;
	}
}
