import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZZ)V")
	public static void method4678(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static186.anInt3550++;
			Static238.method3543();
		}
		if (arg1) {
			Static50.anInt855++;
			Static22.method293();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method4680(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static45.method766(Static96.method1684(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}
}
