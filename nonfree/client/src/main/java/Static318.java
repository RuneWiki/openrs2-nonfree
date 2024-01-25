import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Lclient!gm;")
	public static final Class118 aClass118_1 = new Class118();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIIIIIII)V")
	public static void method5064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static108.method2267(arg4, Static507.anInt9124, Static234.anInt4897);
		@Pc(17) int local17 = Static108.method2267(arg2, Static507.anInt9124, Static234.anInt4897);
		@Pc(23) int local23 = Static108.method2267(arg3, Static251.anInt5168, Static341.anInt6481);
		@Pc(29) int local29 = Static108.method2267(arg6, Static251.anInt5168, Static341.anInt6481);
		@Pc(38) int local38 = Static108.method2267(arg4 + arg0, Static507.anInt9124, Static234.anInt4897);
		@Pc(47) int local47 = Static108.method2267(arg2 - arg0, Static507.anInt9124, Static234.anInt4897);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static118.method2461(Static228.anIntArrayArray46[local49], local29, arg5, local23);
		}
		for (@Pc(69) int local69 = local17; local69 > local47; local69--) {
			Static118.method2461(Static228.anIntArrayArray46[local69], local29, arg5, local23);
		}
		@Pc(95) int local95 = Static108.method2267(arg3 + arg0, Static251.anInt5168, Static341.anInt6481);
		@Pc(104) int local104 = Static108.method2267(arg6 - arg0, Static251.anInt5168, Static341.anInt6481);
		for (@Pc(114) int local114 = local38; local114 <= local47; local114++) {
			@Pc(120) int[] local120 = Static228.anIntArrayArray46[local114];
			Static118.method2461(local120, local95, arg5, local23);
			Static118.method2461(local120, local104, arg1, local95);
			Static118.method2461(local120, local29, arg5, local104);
		}
	}
}
