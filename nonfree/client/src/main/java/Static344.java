import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static344 {

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_93 = new Class130(36, 4);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!cda;Lclient!cda;I)V")
	public static void method5774(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_67 != null) {
			arg1.method7841();
		}
		arg1.aClass4_67 = arg0.aClass4_67;
		arg1.aClass4_68 = arg0;
		arg1.aClass4_67.aClass4_68 = arg1;
		arg1.aClass4_68.aClass4_67 = arg1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5775(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static474.method7127(arg0, arg2, 0, arg3, arg5, arg4, arg1);
	}
}
