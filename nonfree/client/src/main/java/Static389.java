import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!pe;")
	public static Class254 aClass254_103;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)Z")
	public static boolean method6206() {
		try {
			@Pc(7) Class139 local7 = new Class139();
			@Pc(12) byte[] local12 = local7.method3289(Static578.aByteArray112);
			Static10.method364(local12);
			return true;
		} catch (@Pc(19) Exception local19) {
			return false;
		}
	}
}
