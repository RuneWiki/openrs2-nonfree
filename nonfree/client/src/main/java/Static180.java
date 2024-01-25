import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!ri;")
	public static Class285 aClass285_4;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
	public static int anInt3231 = 0;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)Z")
	public static boolean method2752() {
		try {
			@Pc(12) Class122 local12 = new Class122();
			@Pc(17) byte[] local17 = local12.method2604(Static472.aByteArray101);
			Static503.method6986(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}
}
