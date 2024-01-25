import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "Z")
	public static boolean aBoolean647;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Z")
	public static boolean method7551() {
		try {
			@Pc(7) Class249 local7 = new Class249();
			@Pc(20) byte[] local20 = local7.method6043(Static199.aByteArray51);
			Static493.method7306(local20);
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}
}
