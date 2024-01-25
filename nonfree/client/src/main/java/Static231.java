import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public static void method3122() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static323.anInt5773 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}
}
