import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static399 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public static int anInt6653 = -1;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	public static int anInt6656 = -1;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)I")
	public static int method5262(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
