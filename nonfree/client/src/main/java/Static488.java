import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Ljava/lang/Class;")
	private static Class aClass44;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!gk;")
	public static final Class137 aClass137_10 = new Class137();

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method7355() {
		if (Static344.aClass173_5.aBoolean359) {
			Static360.anInt6168 = 96;
			return;
		}
		try {
			@Pc(29) Method local29 = (aClass44 == null ? (aClass44 = Class296.a("java.lang.Runtime")) : aClass44).getMethod("maxMemory");
			if (local29 != null) {
				try {
					@Pc(33) Runtime local33 = Runtime.getRuntime();
					@Pc(39) Long local39 = (Long) local29.invoke(local33, (Object[]) null);
					Static360.anInt6168 = (int) (local39 / 1048576L) + 1;
					return;
				} catch (@Pc(49) Throwable local49) {
					return;
				}
			}
		} catch (@Pc(51) Exception local51) {
			return;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Z")
	public static boolean method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x37) != 0;
	}
}
