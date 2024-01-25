import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_128 = new Class67("Profiling", "Profiling", "Profilage", "Profiling");

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 == arg0) {
			Static2.method221(arg3, arg5, arg6, arg1, arg4, arg2);
		} else if (arg3 - arg1 >= Static190.anInt4314 && Static145.anInt2941 >= arg1 + arg3 && Static269.anInt5577 <= arg6 - arg0 && Static81.anInt1788 >= arg6 + arg0) {
			Static302.method4987(arg1, arg2, arg3, arg5, arg6, arg4, arg0);
		} else {
			Static200.method7659(arg6, arg3, arg5, arg0, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
	public static void method6530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		if (Static305.anInt5998 == 2) {
			Static100.anInt2054 = 0;
			Static262.anInt5491 = local3;
			Static27.anInt778 = local11;
		}
		Static487.aFloat258 = local3;
		Static343.aFloat198 = local11;
		Static199.method3746();
		Static256.aBoolean354 = true;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)V")
	public static void method6531(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub10_Sub16 local13 = Static362.method5701(arg0, 8);
		local13.method6212();
	}
}
