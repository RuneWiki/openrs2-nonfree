import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	public static int anInt4331 = 0;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Lclient!ve;")
	public static Class3_Sub31 aClass3_Sub31_1 = new Class3_Sub31(0, -1);

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt4335 = 0;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	public static int anInt4336 = 1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 >= Static175.anInt3267 && Static204.anInt4020 >= arg6 && Static245.anInt6027 <= arg1 && Static111.anInt2039 >= arg0) {
			Static67.method1036(arg4, arg5, arg1, arg6, arg3, arg2, arg0);
		} else {
			Static40.method4951(arg4, arg0, arg3, arg2, arg1, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!sd;Z)I")
	public static int method3631(@OriginalArg(0) Class10_Sub5_Sub2 arg0) {
		@Pc(8) Class124 local8 = arg0.aClass124_1;
		if (local8.anIntArray432 != null) {
			local8 = local8.method3191();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(24) int local24 = local8.anInt3774;
		@Pc(28) Class31 local28 = arg0.method4191();
		if (local28.anInt912 == arg0.anInt5066) {
			local24 = local8.anInt3783;
		} else if (local28.anInt919 == arg0.anInt5066 || local28.anInt910 == arg0.anInt5066 || arg0.anInt5066 == local28.anInt885 || arg0.anInt5066 == local28.anInt902) {
			local24 = local8.anInt3793;
		} else if (local28.anInt915 == arg0.anInt5066 || local28.anInt884 == arg0.anInt5066 || local28.anInt906 == arg0.anInt5066 || local28.anInt899 == arg0.anInt5066) {
			local24 = local8.anInt3777;
		}
		return local24;
	}
}
