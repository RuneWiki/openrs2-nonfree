import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "[B")
	public static byte[] aByteArray69;

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "Lclient!th;")
	public static Class168 aClass168_199;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "Lclient!jl;")
	public static Class89 aClass89_49 = new Class89(200);

	@OriginalMember(owner = "client!vd", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString418 = null;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!th;II)[Lclient!si;")
	public static Class1_Sub3_Sub13_Sub2[] method4467(@OriginalArg(1) Class168 arg0, @OriginalArg(3) int arg1) {
		return Static131.method2257(0, arg0, arg1) ? Static56.method1053() : null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([[FLclient!ua;IB[[FI[[FIIIIFZ[[IIII[[I)I")
	public static int method4469(@OriginalArg(0) float[][] arg0, @OriginalArg(1) Class1_Sub28 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int[][] arg16) {
		@Pc(32) int local32;
		if (arg9 == 1) {
			local32 = arg6;
			arg6 = arg13;
			arg13 = 128 - local32;
		} else if (arg9 == 2) {
			arg6 = 128 - arg6;
			arg13 = 128 - arg13;
		} else if (arg9 == 3) {
			local32 = arg6;
			arg6 = 128 - arg13;
			arg13 = local32;
		}
		@Pc(79) float local79;
		@Pc(65) float local65;
		@Pc(73) int local73;
		@Pc(71) float local71;
		if (arg6 == 0 && arg13 == 0) {
			local65 = arg0[arg15][arg7];
			local71 = arg3[arg15][arg7];
			local73 = arg14;
			local79 = arg5[arg15][arg7];
		} else if (arg6 == 128 && arg13 == 0) {
			local65 = arg0[arg15 + 1][arg7];
			local79 = arg5[arg15 + 1][arg7];
			local71 = arg3[arg15 + 1][arg7];
			local73 = arg2;
		} else if (arg6 == 128 && arg13 == 128) {
			local73 = arg4;
			local79 = arg5[arg15 + 1][arg7 + 1];
			local65 = arg0[arg15 + 1][arg7 + 1];
			local71 = arg3[arg15 + 1][arg7 + 1];
		} else if (arg6 == 0 && arg13 == 128) {
			local71 = arg3[arg15][arg7 + 1];
			local73 = arg8;
			local65 = arg0[arg15][arg7 + 1];
			local79 = arg5[arg15][arg7 + 1];
		} else {
			@Pc(138) float local138 = (float) arg6 / 128.0F;
			local79 = arg5[arg15][arg7];
			local65 = arg0[arg15][arg7];
			@Pc(164) float local164 = local79 + local138 * (arg5[arg15 + 1][arg7] - local79);
			@Pc(179) float local179 = local65 + local138 * (arg0[arg15 + 1][arg7] - local65);
			@Pc(184) float local184 = (float) arg13 / 128.0F;
			@Pc(192) float local192 = arg3[arg15][arg7 + 1];
			@Pc(200) float local200 = arg5[arg15][arg7 + 1];
			@Pc(217) float local217 = local192 + local138 * (arg3[arg15 + 1][arg7 + 1] - local192);
			local71 = arg3[arg15][arg7];
			@Pc(237) float local237 = local71 + (arg3[arg15 + 1][arg7] - local71) * local138;
			@Pc(245) float local245 = arg0[arg15][arg7 + 1];
			@Pc(262) float local262 = local200 + (arg5[arg15 + 1][arg7 + 1] - local200) * local138;
			local79 = local164 + (local262 - local164) * local184;
			local71 = local237 + (local217 - local237) * local184;
			@Pc(295) float local295 = local245 + local138 * (arg0[arg15 + 1][arg7 + 1] - local245);
			local65 = local179 + local184 * (local295 - local179);
			@Pc(309) int local309 = Static195.method3122(arg2, arg14, arg6);
			@Pc(317) int local317 = Static195.method3122(arg4, arg8, arg6);
			local73 = Static195.method3122(local317, local309, arg13);
		}
		@Pc(392) int local392 = (arg15 << 7) + arg6;
		@Pc(398) int local398 = (arg7 << 7) + arg13;
		@Pc(406) int local406 = Static108.method1779(arg7, arg16, arg6, arg13, arg15);
		return arg1.method4171(local392, local406, local398, local71, local79, local65, arg11 ? local73 & 0xFFFFFF00 : local73, arg12 == null ? 0.0F : (float) (local406 - Static108.method1779(arg7, arg12, arg6, arg13, arg15)) / arg10);
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
	public static void method4471() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(18) Runtime local18 = Runtime.getRuntime();
					@Pc(25) Long local25 = (Long) local12.invoke(local18, (Object[]) null);
					Static196.anInt4274 = (int) (local25 / 1048576L) + 1;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}
}
