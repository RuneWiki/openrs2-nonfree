import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_42 = new Class44(12, 8);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIII)V")
	public static void method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg0; local7++) {
			Static49.method990(Static277.anIntArrayArray40[local7], arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)V")
	public static void method2595() {
		if (Static197.anInt3816 == 2) {
			Static43.anInt1146 = 96;
			return;
		}
		try {
			@Pc(15) Method local15 = Runtime.class.getMethod("maxMemory");
			if (local15 != null) {
				try {
					@Pc(19) Runtime local19 = Runtime.getRuntime();
					@Pc(25) Long local25 = (Long) local15.invoke(local19, (Object[]) null);
					Static43.anInt1146 = (int) (local25 / 1048576L) + 1;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}
}
