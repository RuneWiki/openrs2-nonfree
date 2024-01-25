import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wo", name = "F", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_124 = new Class257(37, 2);

	@OriginalMember(owner = "client!wo", name = "I", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject24 = null;

	@OriginalMember(owner = "client!wo", name = "L", descriptor = "Lclient!vda;")
	public static final Class8_Sub49 aClass8_Sub49_1 = new Class8_Sub49(0, 0);

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "I")
	public static int anInt10565 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IFIIIFI[F[FZII)V")
	public static void method8513(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg3 - arg0;
		@Pc(9) int local9 = arg9 - arg6;
		@Pc(13) int local13 = arg4 - arg2;
		@Pc(38) float local38 = (float) local9 * arg8[2] + arg8[1] * (float) local5 + arg8[0] * (float) local13;
		@Pc(64) float local64 = (float) local5 * arg8[4] + arg8[3] * (float) local13 + (float) local9 * arg8[5];
		@Pc(85) float local85 = arg8[7] * (float) local5 + arg8[6] * (float) local13 + arg8[8] * (float) local9;
		@Pc(96) float local96 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local96 *= arg1;
		}
		@Pc(110) float local110 = arg5 + local64 + 0.5F;
		@Pc(133) float local133;
		if (arg10 == 1) {
			local133 = local96;
			local96 = -local110;
			local110 = local133;
		} else if (arg10 == 2) {
			local110 = -local110;
			local96 = -local96;
		} else if (arg10 == 3) {
			local133 = local96;
			local96 = local110;
			local110 = -local133;
		}
		arg7[1] = local110;
		arg7[0] = local96;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)Lclient!fg;")
	public static Class101 method8514(@OriginalArg(1) int arg0) {
		@Pc(10) Class101 local10 = (Class101) Static285.aClass236_55.method6242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static69.aClass237_107.method6314(0, arg0);
		local10 = new Class101();
		if (local25 != null) {
			local10.method3047(new Class8_Sub8(local25), arg0);
		}
		Static285.aClass236_55.method6241((long) arg0, local10);
		return local10;
	}
}
