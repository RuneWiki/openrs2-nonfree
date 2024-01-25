import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!kr;")
	public static Class138 aClass138_37;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!b;")
	public static Class20 aClass20_73;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!b;")
	public static Class20 aClass20_74;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!on;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIZII)V")
	public static void method4621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 + arg2;
		@Pc(14) int local14 = arg0 - arg2;
		for (@Pc(16) int local16 = arg1; local16 < local9; local16++) {
			Static349.method5265(arg3, arg4, arg5, Static325.anIntArrayArray50[local16]);
		}
		@Pc(39) int local39 = arg4 - arg2;
		@Pc(43) int local43 = arg3 + arg2;
		for (@Pc(50) int local50 = arg0; local50 > local14; local50--) {
			Static349.method5265(arg3, arg4, arg5, Static325.anIntArrayArray50[local50]);
		}
		for (@Pc(70) int local70 = local9; local70 <= local14; local70++) {
			@Pc(76) int[] local76 = Static325.anIntArrayArray50[local70];
			Static349.method5265(arg3, local43, arg5, local76);
			Static349.method5265(local39, arg4, arg5, local76);
		}
	}
}
