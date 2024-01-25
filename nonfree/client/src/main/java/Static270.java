import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
	public static int anInt4885;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
	public static int anInt4887;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IB)I")
	public static int method4124(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
