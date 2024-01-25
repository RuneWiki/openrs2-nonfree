import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!bc;")
	public static Class16 aClass16_7;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "Lclient!wn;")
	public static Class95 aClass95_10;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	public static int anInt4410 = 2;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "[I")
	public static final int[] anIntArray401 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZIFII)[I")
	public static int[] method4063(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class5_Sub3_Sub35 local10 = new Class5_Sub3_Sub35();
		local10.aBoolean528 = true;
		local10.anInt6337 = (int) (arg0 * 4096.0F);
		local10.anInt6328 = 8;
		local10.anInt6332 = 4;
		local10.anInt6333 = 35;
		local10.anInt6331 = 8;
		local10.method6010();
		Static230.method4145(1, 2048);
		local10.method5658(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIBIII)V")
	public static void method4068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class201 local8 = Static297.method5150(arg0, arg2);
		if (local8 != null && local8.anObjectArray12 != null) {
			@Pc(17) Class5_Sub17 local17 = new Class5_Sub17();
			local17.anObjectArray1 = local8.anObjectArray12;
			local17.aClass201_3 = local8;
			Static108.method1907(local17);
		}
		Static199.anInt3970 = arg4;
		Static169.anInt6216 = arg3;
		Static166.anInt3318 = arg0;
		Static5.anInt93 = arg5;
		if (local8 != null) {
			Static137.anInt2629 = local8.anInt6509;
		}
		Static280.anInt5514 = arg1;
		Static240.anInt4828 = arg2;
		Static54.aBoolean72 = true;
		Static189.method3383(local8);
	}
}
