import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[50][];

	@OriginalMember(owner = "client!rf", name = "xb", descriptor = "I")
	public static int anInt9099 = 0;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public static void method7947() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static38.anInt792 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}
}
