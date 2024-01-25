import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "Lclient!bt;")
	public static Class34 aClass34_44;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean223 = true;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Lclient!ol;")
	public static Class270 method2841() {
		try {
			return (Class270) Class.forName("Class270_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}
}
