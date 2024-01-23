import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Lclient!ie;")
	public static Class78 aClass78_8;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public static int anInt5942 = 0;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
	public static int anInt5946 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIZII)V")
	public static void method4861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg2) {
			Static267.method4420(arg1, arg5, arg4, arg0, arg3, arg2);
		} else if (arg1 - arg2 >= Static175.anInt3267 && Static204.anInt4020 >= arg2 + arg1 && Static245.anInt6027 <= arg4 - arg6 && arg4 + arg6 <= Static111.anInt2039) {
			Static13.method194(arg4, arg2, arg1, arg6, arg0, arg3, arg5);
		} else {
			Static276.method4533(arg6, arg5, arg1, arg3, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZZIZI)Lclient!rn;")
	public static Class155 method4862(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(11) Class171 local11 = null;
		if (Static200.aClass159_4 != null) {
			local11 = new Class171(arg2, Static200.aClass159_4, Static90.aClass159Array1[arg2], 1000000);
		}
		Static196.aClass4_Sub1Array1[arg2] = Static79.aClass188_2.method4865(local11, arg2, Static47.aClass171_5);
		if (arg0) {
			Static196.aClass4_Sub1Array1[arg2].method3433();
		}
		return new Class155(Static196.aClass4_Sub1Array1[arg2], arg1, arg3);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
	public static void method4864() {
		Static53.method5036(0, 0);
	}
}
