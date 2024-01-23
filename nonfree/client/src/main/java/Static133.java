import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString212 = "K";

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString213 = "Loaded defaults";

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "[I")
	public static int[] anIntArray253 = new int[14];

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt3300 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)V")
	public static void method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 - arg0 >= Static167.anInt3907 && Static150.anInt3860 >= arg1 + arg0 && arg5 - arg0 >= Static202.anInt4469 && Static94.anInt4237 >= arg5 + arg0) {
			Static263.method4208(arg1, arg3, arg0, arg4, arg2, arg5);
		} else {
			Static43.method922(arg3, arg2, arg5, arg1, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ql;Z)Lclient!tl;")
	public static Class1_Sub3 method2492(@OriginalArg(0) Class1_Sub13 arg0) {
		arg0.method1772();
		@Pc(18) int local18 = arg0.method1772();
		@Pc(22) Class1_Sub3 local22 = Static198.method3469(local18);
		local22.anInt5414 = arg0.method1772();
		@Pc(31) int local31 = arg0.method1772();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method1772();
			local22.method4121(arg0, local39);
		}
		local22.method4118();
		return local22;
	}
}
