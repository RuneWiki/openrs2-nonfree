import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Lclient!in;")
	public static Class157 aClass157_284;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!da;")
	public static Class68 aClass68_12;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[[Lclient!bp;")
	public static Class41[][] aClass41ArrayArray1;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(FF[FIIZIIIIF[FII)V")
	public static void method8520(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(9) int local9 = arg7 - arg6;
		@Pc(13) int local13 = arg3 - arg4;
		@Pc(17) int local17 = arg8 - arg11;
		@Pc(38) float local38 = arg2[2] * (float) local13 + arg2[1] * (float) local17 + arg2[0] * (float) local9;
		@Pc(59) float local59 = (float) local9 * arg2[3] + (float) local17 * arg2[4] + (float) local13 * arg2[5];
		@Pc(80) float local80 = arg2[8] * (float) local13 + arg2[6] * (float) local9 + (float) local17 * arg2[7];
		@Pc(102) float local102;
		@Pc(96) float local96;
		if (arg12 == 0) {
			local102 = arg1 + local38 + 0.5F;
			local96 = arg0 + 0.5F - local80;
		} else if (arg12 == 1) {
			local96 = local80 + arg0 + 0.5F;
			local102 = arg1 + local38 + 0.5F;
		} else if (arg12 == 2) {
			local102 = arg1 + 0.5F - local38;
			local96 = arg9 + 0.5F - local59;
		} else if (arg12 == 3) {
			local96 = arg9 + 0.5F - local59;
			local102 = local38 + arg1 + 0.5F;
		} else if (arg12 == 4) {
			local102 = local80 + arg0 + 0.5F;
			local96 = arg9 + 0.5F - local59;
		} else {
			local102 = arg0 + 0.5F - local80;
			local96 = arg9 + 0.5F - local59;
		}
		@Pc(197) float local197;
		if (arg5 == 1) {
			local197 = local102;
			local102 = -local96;
			local96 = local197;
		} else if (arg5 == 2) {
			local96 = -local96;
			local102 = -local102;
		} else if (arg5 == 3) {
			local197 = local102;
			local102 = local96;
			local96 = -local197;
		}
		arg10[1] = local96;
		arg10[0] = local102;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ga;III)V")
	public static void method8521(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class100 local12;
		if (arg2 < Static477.anInt8929) {
			local12 = Static395.aClass100ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass3_Sub1_Sub1_1 != null && local12.aClass3_Sub1_Sub1_1.method8612()) {
				arg0.method8604(Static194.aClass20_5, 0, true, local12.aClass3_Sub1_Sub1_1, 0, Static582.anInt10356);
			}
		}
		if (arg3 < Static477.anInt8929) {
			local12 = Static395.aClass100ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass3_Sub1_Sub1_1 != null && local12.aClass3_Sub1_Sub1_1.method8612()) {
				arg0.method8604(Static194.aClass20_5, 0, true, local12.aClass3_Sub1_Sub1_1, Static582.anInt10356, 0);
			}
		}
		if (arg2 < Static477.anInt8929 && arg3 < Static562.anInt10128) {
			local12 = Static395.aClass100ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass3_Sub1_Sub1_1 != null && local12.aClass3_Sub1_Sub1_1.method8612()) {
				arg0.method8604(Static194.aClass20_5, 0, true, local12.aClass3_Sub1_Sub1_1, Static582.anInt10356, Static582.anInt10356);
			}
		}
		if (arg2 < Static477.anInt8929 && arg3 > 0) {
			local12 = Static395.aClass100ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass3_Sub1_Sub1_1 != null && local12.aClass3_Sub1_Sub1_1.method8612()) {
				arg0.method8604(Static194.aClass20_5, 0, true, local12.aClass3_Sub1_Sub1_1, -Static582.anInt10356, Static582.anInt10356);
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!d;)Lclient!ha;")
	public static Class20 method8529(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface4 arg2) {
		return new Class20_Sub3(arg1, arg2, arg0);
	}
}
