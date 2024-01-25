import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!fo;")
	public static Class82 aClass82_60;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public static int anInt4687;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_30 = new Class220(7, 0, 1, 1);

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Z")
	public static boolean aBoolean534 = true;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	public static void method3691() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static336.anInt5735 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(35) Exception local35) {
		}
	}
}
