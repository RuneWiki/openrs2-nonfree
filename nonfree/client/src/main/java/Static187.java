import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public static int anInt3975 = 0;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public static int anInt3976 = 0;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "S")
	public static short aShort54 = 256;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method3080() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static142.anInt3100 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}
}
