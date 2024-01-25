import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!r;)V")
	public static void method6357(@OriginalArg(1) Class12 arg0) {
		if (Static268.aBoolean383) {
			Static449.method6369(arg0);
		} else {
			Static396.method5613(arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(JJ)J")
	public static long method6359(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([SZ)[S")
	public static short[] method6360(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static600.method3770(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[FIIIIIIIF)V")
	public static void method6361(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(5) int local5 = arg2 - arg1;
		@Pc(9) int local9 = arg4 - arg7;
		@Pc(17) int local17 = arg3 - arg5;
		@Pc(38) float local38 = (float) local9 * arg0[2] + (float) local5 * arg0[1] + (float) local17 * arg0[0];
		@Pc(59) float local59 = arg0[5] * (float) local9 + arg0[4] * (float) local5 + arg0[3] * (float) local17;
		@Pc(80) float local80 = arg0[8] * (float) local9 + (float) local5 * arg0[7] + (float) local17 * arg0[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local59 * local59 + local38 * local38));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg8 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(130) float local130;
		if (arg6 == 1) {
			local130 = local106;
			local106 = -local123;
			local123 = local130;
		} else if (arg6 == 2) {
			local123 = -local123;
			local106 = -local106;
		} else if (arg6 == 3) {
			local130 = local106;
			local106 = local123;
			local123 = -local130;
		}
		Static97.aFloat154 = local106;
		Static120.aFloat45 = local123;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Z")
	public static boolean method6363() {
		return Static352.anInt6186 == 0 ? Static504.aClass1_Sub8_Sub3_33.method4658() : true;
	}
}
