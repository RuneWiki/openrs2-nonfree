import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	public static int anInt9601;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_174 = new Class73(39, 14);

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "Lclient!hd;")
	public static final Class128 aClass128_43 = new Class128(64);

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "Lclient!dga;")
	public static final Class68 aClass68_7 = new Class68();

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
	public static int anInt9600 = 0;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)V")
	public static void method7820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static317.aClass37_3 == Static255.aClass37_2) {
			if (!Static32.method910(-2, false, 1, arg1, 0, 0, 1, arg0)) {
				Static32.method910(-3, false, 1, arg1, 0, 0, 1, arg0);
			}
		} else if (!Static32.method910(-3, false, 1, arg1, 0, 0, 1, arg0)) {
			Static32.method910(-2, false, 1, arg1, 0, 0, 1, arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!pfa;III)Lclient!ek;")
	public static Class6_Sub2_Sub6 method7822(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class6_Sub21 local14 = new Class6_Sub21(arg0.method5772(arg2, arg1));
		@Pc(45) Class6_Sub2_Sub6 local45 = new Class6_Sub2_Sub6(arg2, local14.method6044(), local14.method6044(), local14.method6036(), local14.method6036(), local14.method6069() == 1, local14.method6069(), local14.method6069());
		@Pc(49) int local49 = local14.method6069();
		for (@Pc(58) int local58 = 0; local58 < local49; local58++) {
			local45.aClass361_11.method7833(new Class6_Sub13(local14.method6069(), local14.method6003(), local14.method6003(), local14.method6003(), local14.method6003(), local14.method6003(), local14.method6003(), local14.method6003(), local14.method6003()));
		}
		local45.method2031();
		return local45;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII[FIIIFIF)V")
	public static void method7823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg1 - arg8;
		@Pc(9) int local9 = arg0 - arg2;
		@Pc(13) int local13 = arg5 - arg4;
		@Pc(38) float local38 = (float) local5 * arg3[0] + arg3[1] * (float) local9 + arg3[2] * (float) local13;
		@Pc(59) float local59 = arg3[4] * (float) local9 + arg3[3] * (float) local5 + arg3[5] * (float) local13;
		@Pc(80) float local80 = arg3[7] * (float) local9 + (float) local5 * arg3[6] + arg3[8] * (float) local13;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local91 *= arg7;
		}
		@Pc(105) float local105 = arg9 + local59 + 0.5F;
		@Pc(126) float local126;
		if (arg6 == 1) {
			local126 = local91;
			local91 = -local105;
			local105 = local126;
		} else if (arg6 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg6 == 3) {
			local126 = local91;
			local91 = local105;
			local105 = -local126;
		}
		Static22.aFloat111 = local91;
		Static280.aFloat132 = local105;
	}
}
