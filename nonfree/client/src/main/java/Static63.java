import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!bv", name = "jb", descriptor = "I")
	public static int anInt1565;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1479(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
