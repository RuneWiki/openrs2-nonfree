import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_43 = new Class41(26, 6);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V")
	public static void method1467(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub1_Sub2 local13 = Static323.method4982(arg0, 10);
		local13.method412();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public static void method1468() {
		if (Static65.anInt1255 == 2) {
			Static314.anInt5576 = 96;
			return;
		}
		try {
			@Pc(26) Method local26 = Runtime.class.getMethod("maxMemory");
			if (local26 != null) {
				try {
					@Pc(30) Runtime local30 = Runtime.getRuntime();
					@Pc(36) Long local36 = (Long) local26.invoke(local30, (Object[]) null);
					Static314.anInt5576 = (int) (local36 / 1048576L) + 1;
					return;
				} catch (@Pc(46) Throwable local46) {
					return;
				}
			}
		} catch (@Pc(48) Exception local48) {
			return;
		}
	}
}
