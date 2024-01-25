import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "J")
	public static long aLong117 = 0L;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_115 = new Class92(54, -1);

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
	public static final int[] anIntArray292 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Z")
	public static boolean method3114() {
		return Static226.aBoolean334;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIZI)V")
	public static void method3116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg4) {
			Static289.method4238(arg1, arg4, arg2, arg0);
		} else if (Static142.anInt3212 <= arg1 - arg4 && Static450.anInt7594 >= arg1 + arg4 && Static161.anInt3448 <= arg2 - arg3 && Static163.anInt3488 >= arg2 + arg3) {
			Static286.method4829(arg1, arg2, arg0, arg4, arg3);
		} else {
			Static15.method461(arg4, arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method3117() {
		if (Static162.anInt3462 == 2) {
			Static102.anInt619 = 96;
			return;
		}
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("maxMemory");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Long local30 = (Long) local20.invoke(local24, (Object[]) null);
					Static102.anInt619 = (int) (local30 / 1048576L) + 1;
				} catch (@Pc(40) Throwable local40) {
				}
			}
		} catch (@Pc(42) Exception local42) {
		}
	}
}
