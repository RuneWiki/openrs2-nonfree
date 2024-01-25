import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)I")
	public static int method5469(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static236.method3940(arg0);
	}
}
