import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
	public static int anInt3540 = -2;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "[Lclient!em;")
	public static final Class60_Sub1_Sub1_Sub3_Sub1[] aClass60_Sub1_Sub1_Sub3_Sub1Array1 = new Class60_Sub1_Sub1_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method3328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg6 < 1 || Static29.anInt380 - 2 < arg5 || arg6 > Static327.anInt5650 - 2) {
			return;
		}
		@Pc(40) int local40 = arg7;
		if (arg7 < 3 && Static180.method3417(53 - 52, arg5, arg6)) {
			local40 = arg7 + 1;
		}
		if (Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 0 && !Static596.method8244(arg6, arg5, Static621.anInt9796, local40)) {
			return;
		}
		if (Static334.aClass243ArrayArrayArray2 == null) {
			return;
		}
		Static286.aClass116_Sub1_4.method3297(arg7, arg6, Static669.aClass356Array1[arg7], arg5, arg4, Static202.aClass75_5);
		if (arg1 < 0) {
			return;
		}
		@Pc(99) int local99 = Static687.aClass6_Sub44_33.aClass7_Sub8_1.method1416();
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub8_1);
		Static286.aClass116_Sub1_4.method3289(local40, Static669.aClass356Array1[arg7], Static202.aClass75_5, arg5, arg7, arg2, arg1, arg3, arg0, arg6);
		Static687.aClass6_Sub44_33.method7080(local99, Static687.aClass6_Sub44_33.aClass7_Sub8_1);
		return;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIB)I")
	public static int method3329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static379.method5862(arg0 + 91923, 4, arg1 + 45365) + (Static379.method5862(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static379.method5862(arg0, 1, arg1) + -128 >> 2) - 128;
		local49 = (int) ((double) local49 * 0.3D) + 35;
		if (local49 < 10) {
			local49 = 10;
		} else if (local49 > 60) {
			local49 = 60;
		}
		return local49;
	}
}
