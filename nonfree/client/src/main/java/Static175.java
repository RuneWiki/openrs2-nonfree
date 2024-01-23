import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!mi", name = "B", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!sf;")
	public static Class157 aClass157_33 = new Class157(260);

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public static volatile int anInt3854 = -1;

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
	public static int anInt3864 = 0;

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
	public static int anInt3866 = 0;

	@OriginalMember(owner = "client!mi", name = "F", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[500];

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)Z")
	public static boolean method3165() {
		if (Static219.aBoolean300) {
			try {
				return !((Boolean) Static322.method2907(Static164.aClass102_2.anApplet1, "showingVideoAd"));
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return true;
	}
}
