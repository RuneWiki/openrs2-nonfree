import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	public static int anInt4126;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "[I")
	public static final int[] anIntArray348 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
	public static void method3603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static351.anInt6257 = arg0 - Static118.anInt815;
		Static340.anInt6093 = arg1 - Static118.anInt813;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!on;I)V")
	public static void method3604(@OriginalArg(0) Class1_Sub36 arg0) {
		if (Static242.aClass255ArrayArrayArray2 == null) {
			return;
		}
		@Pc(13) Interface18 local13 = null;
		if (arg0.anInt6246 == 0) {
			local13 = (Interface18) Static453.method6441(arg0.anInt6243, arg0.anInt6239, arg0.anInt6235);
		}
		if (arg0.anInt6246 == 1) {
			local13 = (Interface18) Static53.method1029(arg0.anInt6243, arg0.anInt6239, arg0.anInt6235);
		}
		if (arg0.anInt6246 == 2) {
			local13 = (Interface18) Static156.method2467(arg0.anInt6243, arg0.anInt6239, arg0.anInt6235, vaa.class);
		}
		if (arg0.anInt6246 == 3) {
			local13 = (Interface18) Static117.method1983(arg0.anInt6243, arg0.anInt6239, arg0.anInt6235);
		}
		if (local13 == null) {
			arg0.anInt6237 = 0;
			arg0.anInt6244 = 0;
			arg0.anInt6240 = -1;
		} else {
			arg0.anInt6240 = local13.method7467();
			arg0.anInt6237 = local13.method7465();
			arg0.anInt6244 = local13.method7469();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
	public static void method3606(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(14, arg0);
		local8.method4945();
	}
}
