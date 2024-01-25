import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static400 {

	@OriginalMember(owner = "client!no", name = "n", descriptor = "I")
	public static int anInt6733;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "I")
	public static int anInt6735 = -2;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)I")
	public static int method5779(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
