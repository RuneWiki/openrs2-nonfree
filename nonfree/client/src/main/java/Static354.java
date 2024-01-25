import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static354 {

	@OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
	public static int anInt5391 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)I")
	public static int method4751(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
