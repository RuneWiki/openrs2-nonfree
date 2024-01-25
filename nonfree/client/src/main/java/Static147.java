import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!eka", name = "h", descriptor = "I")
	public static int anInt2695;

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_13 = new Class313(8);

	@OriginalMember(owner = "client!eka", name = "j", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_25 = new Class144(0, 1);

	@OriginalMember(owner = "client!eka", name = "m", descriptor = "I")
	public static int anInt2696 = 0;

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIIIII)V")
	public static void method2483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg2) {
			Static21.method641(arg1, arg3, arg4, arg0);
		} else if (Static82.anInt1902 <= arg4 - arg3 && arg3 + arg4 <= Static77.anInt1737 && arg0 - arg2 >= Static549.anInt5294 && arg0 + arg2 <= Static334.anInt5381) {
			Static390.method5303(arg1, arg0, arg2, arg3, arg4);
		} else {
			Static213.method3186(arg3, arg1, arg0, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(Z)V")
	public static void method2484() {
		if (Static301.aClass379_9 != Static416.aClass379_6) {
			try {
				Static728.method688(Static459.aClient1, "tbrefresh");
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}
}
