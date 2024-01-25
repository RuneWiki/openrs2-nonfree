import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[8];

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Lclient!ws;")
	public static Class284 method5981() {
		try {
			return (Class284) Class.forName("Class284_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
