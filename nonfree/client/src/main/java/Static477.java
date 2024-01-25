import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static477 {

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
	public static int anInt7888;

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "[B")
	public static final byte[] aByteArray89 = new byte[2048];

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)Z")
	public static boolean method6558(@OriginalArg(1) int arg0) {
		return arg0 == 0;
	}
}
