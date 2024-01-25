import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_135 = new Class289(58, -1);

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_136 = new Class289(48, 3);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IJI)Lclient!tia;")
	public static Class6_Sub4_Sub18 method7924(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class6_Sub4_Sub18 local19 = (Class6_Sub4_Sub18) Static237.aClass209_15.method5038(arg0 | (long) arg1 << 56);
		if (local19 == null) {
			local19 = new Class6_Sub4_Sub18(arg1, arg0);
			Static237.aClass209_15.method5035(local19.aLong314, local19);
		}
		return local19;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(F[FFIIIIIIIF[FII)V")
	public static void method7928(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float[] arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg12 - arg6;
		@Pc(9) int local9 = arg3 - arg8;
		@Pc(17) int local17 = arg9 - arg4;
		@Pc(38) float local38 = arg11[2] * (float) local9 + arg11[0] * (float) local17 + (float) local5 * arg11[1];
		@Pc(59) float local59 = (float) local5 * arg11[4] + arg11[3] * (float) local17 + (float) local9 * arg11[5];
		@Pc(80) float local80 = arg11[6] * (float) local17 + arg11[7] * (float) local5 + (float) local9 * arg11[8];
		@Pc(108) float local108;
		@Pc(101) float local101;
		if (arg5 == 0) {
			local108 = local38 + arg10 + 0.5F;
			local101 = arg2 + 0.5F - local80;
		} else if (arg5 == 1) {
			local108 = arg10 + local38 + 0.5F;
			local101 = arg2 + local80 + 0.5F;
		} else if (arg5 == 2) {
			local101 = arg0 + 0.5F - local59;
			local108 = arg10 + 0.5F - local38;
		} else if (arg5 == 3) {
			local101 = arg0 + 0.5F - local59;
			local108 = local38 + arg10 + 0.5F;
		} else if (arg5 == 4) {
			local101 = arg0 + 0.5F - local59;
			local108 = local80 + arg2 + 0.5F;
		} else {
			local101 = arg0 + 0.5F - local59;
			local108 = arg2 + 0.5F - local80;
		}
		@Pc(206) float local206;
		if (arg7 == 1) {
			local206 = local108;
			local108 = -local101;
			local101 = local206;
		} else if (arg7 == 2) {
			local108 = -local108;
			local101 = -local101;
		} else if (arg7 == 3) {
			local206 = local108;
			local108 = local101;
			local101 = -local206;
		}
		arg1[1] = local101;
		arg1[0] = local108;
	}
}
