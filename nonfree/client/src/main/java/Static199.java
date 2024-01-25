import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "I")
	public static int anInt3915 = 0;

	@OriginalMember(owner = "client!gka", name = "d", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_53 = new Class218(55, 0);

	@OriginalMember(owner = "client!gka", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[128][128];

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "([I[IBII)V")
	public static void method3581(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg2) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) int local25 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local25;
		@Pc(39) int local39 = arg0[local19];
		arg0[local19] = arg0[arg2];
		arg0[arg2] = local39;
		@Pc(58) int local58 = ~local25 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg3; local60 < arg2; local60++) {
			if (local25 + (local60 & local58) > arg1[local60]) {
				@Pc(75) int local75 = arg1[local60];
				arg1[local60] = arg1[local21];
				arg1[local21] = local75;
				@Pc(89) int local89 = arg0[local60];
				arg0[local60] = arg0[local21];
				arg0[local21++] = local89;
			}
		}
		arg1[arg2] = arg1[local21];
		arg1[local21] = local25;
		arg0[arg2] = arg0[local21];
		arg0[local21] = local39;
		method3581(arg0, arg1, local21 - 1, arg3);
		method3581(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(BI)V")
	public static void method3583(@OriginalArg(1) int arg0) {
		Static94.anIntArray148 = new int[arg0];
		Static158.anIntArray77 = new int[arg0];
		Static580.anIntArray805 = new int[arg0];
		Static401.anIntArray557 = new int[arg0];
		Static287.anIntArray442 = new int[arg0];
	}
}
