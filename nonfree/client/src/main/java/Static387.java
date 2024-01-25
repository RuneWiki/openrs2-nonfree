import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public static void method5634() {
		Static48.aClass160_8.method3595();
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	public static void method5636() {
		if (Static152.anInt2983 == 2) {
			Static253.anInt4468 = 96;
			return;
		}
		try {
			@Pc(25) Method local25 = Runtime.class.getMethod("maxMemory");
			if (local25 != null) {
				try {
					@Pc(29) Runtime local29 = Runtime.getRuntime();
					@Pc(35) Long local35 = (Long) local25.invoke(local29, (Object[]) null);
					Static253.anInt4468 = (int) (local35 / 1048576L) + 1;
				} catch (@Pc(45) Throwable local45) {
				}
			}
		} catch (@Pc(47) Exception local47) {
		}
	}
}
