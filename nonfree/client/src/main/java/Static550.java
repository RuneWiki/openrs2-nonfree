import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!ida;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBII)V")
	public static void method7731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static633.anInt10644 && Static389.anInt7300 >= arg3) {
			@Pc(19) int local19 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg1);
			@Pc(25) int local25 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2);
			Static300.method5132(arg0, local19, local25, arg3);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
	public static void method7732() {
		Static588.aClass94_65.method2952();
		Static92.aClass94_12.method2952();
		Static635.aClass94_68.method2952();
		Static528.aClass94_57.method2952();
	}
}
