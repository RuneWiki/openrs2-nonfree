import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!km", name = "h", descriptor = "I")
	public static int anInt4223;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_57 = new Class212(3, 5);

	@OriginalMember(owner = "client!km", name = "s", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_58 = new Class212(9, -1);

	@OriginalMember(owner = "client!km", name = "t", descriptor = "[I")
	public static final int[] anIntArray322 = new int[8];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	public static void method3648() {
		Static335.anInt5946 = 2;
		Static242.aBoolean314 = false;
		Static445.anInt7575 = 1;
		Static395.anInt6972 = -1;
		Static410.anInt7145 = -1;
		Static236.aClass38_50 = null;
		Static263.anInt5010 = 0;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public static void method3650() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static65.anInt1627 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}
}
