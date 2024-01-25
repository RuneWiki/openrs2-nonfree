import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BFFIF)F")
	public static float method2239(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static394.aFloatArrayArray8[arg2];
		return arg1 * local12[2] + arg0 * local12[0] + arg3 * local12[1];
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZIII)V")
	public static void method2240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg0) {
			Static166.method2393(arg1, arg3, arg4, arg2);
		} else if (arg2 - arg1 >= Static270.anInt4759 && arg2 + arg1 <= Static162.anInt2935 && arg4 - arg0 >= Static514.anInt8722 && Static451.anInt7775 >= arg4 + arg0) {
			Static345.method4711(arg3, arg4, arg2, arg1, arg0);
		} else {
			Static501.method7002(arg4, arg2, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BILclient!pu;)Lclient!f;")
	public static Class22 method2241(@OriginalArg(1) int arg0, @OriginalArg(2) Class270 arg1) {
		@Pc(18) Class22 local18 = (Class22) Static158.aClass222_18.method4430((long) arg0);
		if (local18 == null) {
			if (Static521.aBoolean684) {
				local18 = Static16.aClass134_1.method6896(Static601.method2081(arg1, arg0), true);
			} else {
				local18 = Static561.method7604(arg1.method5691(arg0));
			}
			Static158.aClass222_18.method4434(local18, (long) arg0);
		}
		return local18;
	}
}
