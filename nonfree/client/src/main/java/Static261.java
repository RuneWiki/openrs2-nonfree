import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "Z")
	public static boolean aBoolean387 = false;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)Lclient!fa;")
	public static Class41_Sub1 method4005() {
		return Static62.aClass41_Sub1Array1.length > Static171.anInt3644 ? Static62.aClass41_Sub1Array1[Static171.anInt3644++] : null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!km;Lclient!km;)V")
	public static void method4006(@OriginalArg(1) Class91 arg0, @OriginalArg(2) Class91 arg1) {
		Static39.aClass1_Sub2_Sub1_1 = Static276.method2259(arg1, arg0, Static185.anInt3837);
		if (Static277.aBoolean412) {
			Static89.aClass1_Sub2_Sub1_Sub2_3 = Static227.method3557(arg0, arg1, Static185.anInt3837);
		} else {
			Static89.aClass1_Sub2_Sub1_Sub2_3 = (Class1_Sub2_Sub1_Sub2) Static39.aClass1_Sub2_Sub1_1;
		}
		Static88.aClass1_Sub2_Sub1_2 = Static276.method2259(arg1, arg0, Static197.anInt4052);
		Static134.aClass1_Sub2_Sub1_3 = Static276.method2259(arg1, arg0, Static39.anInt1012);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB[[FLclient!re;Lclient!wf;I[I[[F[[F[[I)V")
	public static void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[][] arg2, @OriginalArg(4) Class144 arg3, @OriginalArg(5) Class178 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int[][] arg9) {
		@Pc(11) int[] local11 = new int[arg6.length / 2];
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(29) int local29 = arg6[local13 + local13 + 1];
			@Pc(35) int local35 = arg6[local13 + local13];
			@Pc(40) int local40;
			if (arg1 == 1) {
				local40 = local35;
				local35 = local29;
				local29 = 128 - local40;
			} else if (arg1 == 2) {
				local35 = 128 - local35;
				local29 = 128 - local29;
			} else if (arg1 == 3) {
				local40 = local35;
				local35 = 128 - local29;
				local29 = local40;
			}
			@Pc(93) float local93;
			@Pc(105) float local105;
			@Pc(99) float local99;
			if (local35 == 0 && local29 == 0) {
				local93 = arg8[arg5][arg0];
				local99 = arg2[arg5][arg0];
				local105 = arg7[arg5][arg0];
			} else if (local35 == 128 && local29 == 0) {
				local105 = arg7[arg5 + 1][arg0];
				local99 = arg2[arg5 + 1][arg0];
				local93 = arg8[arg5 + 1][arg0];
			} else if (local35 == 128 && local29 == 128) {
				local105 = arg7[arg5 + 1][arg0 + 1];
				local99 = arg2[arg5 + 1][arg0 + 1];
				local93 = arg8[arg5 + 1][arg0 + 1];
			} else if (local35 == 0 && local29 == 128) {
				local99 = arg2[arg5][arg0 + 1];
				local105 = arg7[arg5][arg0 + 1];
				local93 = arg8[arg5][arg0 + 1];
			} else {
				local93 = arg8[arg5][arg0];
				local105 = arg7[arg5][arg0];
				@Pc(152) float local152 = (float) local35 / 128.0F;
				local99 = arg2[arg5][arg0];
				@Pc(173) float local173 = local99 + local152 * (arg2[arg5 + 1][arg0] - local99);
				@Pc(187) float local187 = local93 + (arg8[arg5 + 1][arg0] - local93) * local152;
				@Pc(192) float local192 = (float) local29 / 128.0F;
				@Pc(200) float local200 = arg2[arg5][arg0 + 1];
				@Pc(217) float local217 = local200 + local152 * (arg2[arg5 + 1][arg0 + 1] - local200);
				local99 = local173 + (local217 - local173) * local192;
				@Pc(240) float local240 = local105 + local152 * (arg7[arg5 + 1][arg0] - local105);
				@Pc(248) float local248 = arg8[arg5][arg0 + 1];
				@Pc(264) float local264 = local248 + (arg8[arg5 + 1][arg0 + 1] - local248) * local152;
				local93 = local187 + (local264 - local187) * local192;
				@Pc(281) float local281 = arg7[arg5][arg0 + 1];
				@Pc(297) float local297 = local281 + (arg7[arg5 + 1][arg0 + 1] - local281) * local152;
				local105 = local240 + local192 * (local297 - local240);
			}
			@Pc(395) int local395 = (arg5 << 7) + local35;
			@Pc(403) int local403 = Static30.method2649(arg5, local35, local29, arg9, arg0);
			@Pc(409) int local409 = local29 + (arg0 << 7);
			local11[local13] = arg4.method4393(arg3, local395, local403, local409, local99, local93, local105);
		}
		arg4.method4391(local11);
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
	public static void method4008() {
		Static283.aClass1_Sub11_Sub1_3.method2697(98);
		for (@Pc(18) Class1_Sub17 local18 = (Class1_Sub17) Static256.aClass70_17.method2074(); local18 != null; local18 = (Class1_Sub17) Static256.aClass70_17.method2079()) {
			if (local18.anInt2430 == 0) {
				Static59.method3199(true, local18);
			}
		}
		if (Static3.aClass71_1 != null) {
			Static160.method2779(Static3.aClass71_1);
			Static3.aClass71_1 = null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!in;)Lclient!in;")
	public static Class71 method4009(@OriginalArg(1) Class71 arg0) {
		if (arg0.anInt2674 != -1) {
			return Static56.method1058(arg0.anInt2674);
		}
		@Pc(25) int local25 = arg0.anInt2655 >>> 16;
		@Pc(30) Class37 local30 = new Class37(Static256.aClass70_17);
		for (@Pc(35) Class1_Sub17 local35 = (Class1_Sub17) local30.method1129(); local35 != null; local35 = (Class1_Sub17) local30.method1127()) {
			if (local35.anInt2431 == local25) {
				return Static56.method1058((int) local35.aLong205);
			}
		}
		return null;
	}
}
