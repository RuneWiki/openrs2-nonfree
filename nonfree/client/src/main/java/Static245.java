import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "[Lclient!us;")
	public static Class356[] aClass356Array5;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[FIFFI[FIIIFII)V")
	public static void method9052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg9 - arg6;
		@Pc(9) int local9 = arg0 - arg12;
		@Pc(13) int local13 = arg8 - arg11;
		@Pc(38) float local38 = arg7[0] * (float) local5 + arg7[1] * (float) local13 + (float) local9 * arg7[2];
		@Pc(59) float local59 = arg7[5] * (float) local9 + (float) local5 * arg7[3] + arg7[4] * (float) local13;
		@Pc(80) float local80 = (float) local5 * arg7[6] + (float) local13 * arg7[7] + arg7[8] * (float) local9;
		@Pc(93) float local93;
		@Pc(99) float local99;
		if (arg3 == 0) {
			local93 = local38 + arg5 + 0.5F;
			local99 = arg4 + 0.5F - local80;
		} else if (arg3 == 1) {
			local93 = local38 + arg5 + 0.5F;
			local99 = arg4 + local80 + 0.5F;
		} else if (arg3 == 2) {
			local93 = arg5 + 0.5F - local38;
			local99 = arg10 + 0.5F - local59;
		} else if (arg3 == 3) {
			local99 = arg10 + 0.5F - local59;
			local93 = arg5 + local38 + 0.5F;
		} else if (arg3 == 4) {
			local99 = arg10 + 0.5F - local59;
			local93 = arg4 + local80 + 0.5F;
		} else {
			local99 = arg10 + 0.5F - local59;
			local93 = arg4 + 0.5F - local80;
		}
		@Pc(200) float local200;
		if (arg1 == 1) {
			local200 = local93;
			local93 = -local99;
			local99 = local200;
		} else if (arg1 == 2) {
			local99 = -local99;
			local93 = -local93;
		} else if (arg1 == 3) {
			local200 = local93;
			local93 = local99;
			local99 = -local200;
		}
		arg2[0] = local93;
		arg2[1] = local99;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIBLclient!ha;)Lclient!ka;")
	public static Class80 method9053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class137 arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(12) Class80 local12 = (Class80) Static629.aClass264_62.method6367(local6);
		if (local12 == null) {
			@Pc(22) Class67 local22 = Static40.method1465(Static577.aClass386_122, arg3);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt2022 < 13) {
				local22.method1718();
			}
			local12 = arg5.method7901(local22, 2055, Static665.anInt4336, 64, 768);
			Static629.aClass264_62.method6364(local6, local12);
		}
		local12 = local12.method6378((byte) 2, 2055, true);
		if (arg0 != 0) {
			local12.a(arg0);
		}
		if (arg1 != 0) {
			local12.FA(arg1);
		}
		if (arg2 != 0) {
			local12.VA(arg2);
		}
		if (arg4 != 0) {
			local12.H(0, arg4, 0);
		}
		return local12;
	}
}
