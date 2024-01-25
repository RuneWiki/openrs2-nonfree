import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ek", name = "O", descriptor = "Lclient!e;")
	public static Interface4 anInterface4_5;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_45 = new Class73(104, 2);

	@OriginalMember(owner = "client!ek", name = "N", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_37 = new Class47(50, 8);

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
	public static void method2030() {
		Static192.aClass223_1 = new Class223(8);
		Static202.anInt4160 = 0;
		for (@Pc(17) Class98_Sub3 local17 = (Class98_Sub3) Static439.aClass40_6.method1132(); local17 != null; local17 = (Class98_Sub3) Static439.aClass40_6.method1129()) {
			local17.method4539();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IFIIIIIIFIFI[F)V")
	public static void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(5) int local5 = arg7 - arg3;
		@Pc(9) int local9 = arg2 - arg10;
		@Pc(17) int local17 = arg0 - arg6;
		@Pc(38) float local38 = arg11[1] * (float) local9 + (float) local5 * arg11[0] + arg11[2] * (float) local17;
		@Pc(59) float local59 = (float) local17 * arg11[5] + arg11[4] * (float) local9 + (float) local5 * arg11[3];
		@Pc(80) float local80 = (float) local9 * arg11[7] + (float) local5 * arg11[6] + (float) local17 * arg11[8];
		@Pc(99) float local99;
		@Pc(93) float local93;
		if (arg5 == 0) {
			local93 = arg1 + 0.5F - local80;
			local99 = arg9 + local38 + 0.5F;
		} else if (arg5 == 1) {
			local93 = local80 + arg1 + 0.5F;
			local99 = arg9 + local38 + 0.5F;
		} else if (arg5 == 2) {
			local93 = arg8 + 0.5F - local59;
			local99 = arg9 + 0.5F - local38;
		} else if (arg5 == 3) {
			local99 = arg9 + local38 + 0.5F;
			local93 = arg8 + 0.5F - local59;
		} else if (arg5 == 4) {
			local93 = arg8 + 0.5F - local59;
			local99 = arg1 + local80 + 0.5F;
		} else {
			local99 = arg1 + 0.5F - local80;
			local93 = arg8 + 0.5F - local59;
		}
		@Pc(206) float local206;
		if (arg4 == 1) {
			local206 = local99;
			local99 = -local93;
			local93 = local206;
		} else if (arg4 == 2) {
			local99 = -local99;
			local93 = -local93;
		} else if (arg4 == 3) {
			local206 = local99;
			local99 = local93;
			local93 = -local206;
		}
		Static248.aFloat134 = local99;
		Static417.aFloat157 = local93;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[I[I)V")
	public static void method2033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(13) int local13 = (arg0 + arg1) / 2;
		@Pc(15) int local15 = arg0;
		@Pc(19) int local19 = arg2[local13];
		arg2[local13] = arg2[arg1];
		arg2[arg1] = local19;
		@Pc(33) int local33 = arg3[local13];
		arg3[local13] = arg3[arg1];
		arg3[arg1] = local33;
		@Pc(50) int local50 = local19 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg0; local52 < arg1; local52++) {
			if ((local50 & local52) + local19 > arg2[local52]) {
				@Pc(71) int local71 = arg2[local52];
				arg2[local52] = arg2[local15];
				arg2[local15] = local71;
				@Pc(85) int local85 = arg3[local52];
				arg3[local52] = arg3[local15];
				arg3[local15++] = local85;
			}
		}
		arg2[arg1] = arg2[local15];
		arg2[local15] = local19;
		arg3[arg1] = arg3[local15];
		arg3[local15] = local33;
		method2033(arg0, local15 - 1, arg2, arg3);
		method2033(local15 + 1, arg1, arg2, arg3);
	}
}
