import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static574 {

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	public static int anInt9353;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "Z")
	public static boolean aBoolean682 = false;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)I")
	public static int method7735(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
