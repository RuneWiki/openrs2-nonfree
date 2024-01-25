import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!hja", name = "j", descriptor = "Z")
	public static boolean aBoolean242 = false;

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
	public static int anInt3877 = 0;

	@OriginalMember(owner = "client!hja", name = "c", descriptor = "[I")
	public static final int[] anIntArray287 = new int[32];

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "(I)Lclient!gga;")
	public static Class137 method3498() {
		try {
			return (Class137) Class.forName("hn").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}
}
