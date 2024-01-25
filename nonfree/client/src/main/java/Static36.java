import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt684 = 0;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
	public static final int[] anIntArray43 = new int[25];

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "[I")
	public static final int[] anIntArray44 = new int[14];

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	public static int anInt686 = 999999;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!on;)Ljava/lang/String;")
	public static String method849(@OriginalArg(1) Class146 arg0) {
		if (Static43.method1056(arg0).method714() == 0) {
			return null;
		} else if (arg0.aString41 == null || arg0.aString41.trim().length() == 0) {
			return Static300.aBoolean520 ? "Hidden-use" : null;
		} else {
			return arg0.aString41;
		}
	}
}
