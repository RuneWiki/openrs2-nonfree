import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static409 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)Z")
	public static boolean method5810(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5813(@OriginalArg(0) String arg0) {
		return Static541.method7782(arg0);
	}
}
