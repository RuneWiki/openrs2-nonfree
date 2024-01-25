import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
	public static int anInt962;

	@OriginalMember(owner = "client!ck", name = "gb", descriptor = "Lclient!fo;")
	public static Class82 aClass82_15;

	@OriginalMember(owner = "client!ck", name = "Y", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_32 = new Class12(23, 2);

	@OriginalMember(owner = "client!ck", name = "Z", descriptor = "[I")
	public static final int[] anIntArray48 = new int[25];

	@OriginalMember(owner = "client!ck", name = "bb", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ck", name = "fb", descriptor = "[I")
	public static final int[] anIntArray51 = new int[500];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIZIIII)V")
	public static void method914(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg1) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) Class147_Sub1 local25 = Static22.aClass147_Sub1Array1[local19];
		Static22.aClass147_Sub1Array1[local19] = Static22.aClass147_Sub1Array1[arg1];
		Static22.aClass147_Sub1Array1[arg1] = local25;
		for (@Pc(37) int local37 = arg3; local37 < arg1; local37++) {
			if (Static200.method2832(arg5, local25, arg0, arg4, arg2, Static22.aClass147_Sub1Array1[local37]) <= 0) {
				@Pc(54) Class147_Sub1 local54 = Static22.aClass147_Sub1Array1[local37];
				Static22.aClass147_Sub1Array1[local37] = Static22.aClass147_Sub1Array1[local21];
				Static22.aClass147_Sub1Array1[local21++] = local54;
			}
		}
		Static22.aClass147_Sub1Array1[arg1] = Static22.aClass147_Sub1Array1[local21];
		Static22.aClass147_Sub1Array1[local21] = local25;
		method914(arg0, local21 - 1, arg2, arg3, arg4, arg5);
		method914(arg0, arg1, arg2, local21 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBIIIII[FIF)V")
	public static void method915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(5) int local5 = arg2 - arg1;
		@Pc(9) int local9 = arg0 - arg4;
		@Pc(17) int local17 = arg7 - arg3;
		@Pc(38) float local38 = (float) local9 * arg6[2] + arg6[0] * (float) local5 + (float) local17 * arg6[1];
		@Pc(59) float local59 = (float) local9 * arg6[5] + arg6[4] * (float) local17 + (float) local5 * arg6[3];
		@Pc(80) float local80 = (float) local5 * arg6[6] + (float) local17 * arg6[7] + arg6[8] * (float) local9;
		@Pc(103) float local103 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(114) float local114 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = arg8 + (float) Math.asin((double) (local59 / local103)) / 3.1415927F + 0.5F;
		@Pc(150) float local150;
		if (arg5 == 1) {
			local150 = local114;
			local114 = -local127;
			local127 = local150;
		} else if (arg5 == 2) {
			local127 = -local127;
			local114 = -local114;
		} else if (arg5 == 3) {
			local150 = local114;
			local114 = local127;
			local127 = -local150;
		}
		Static72.aFloat15 = local127;
		Static115.aFloat25 = local114;
	}
}
