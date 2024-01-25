import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static328 {

	@OriginalMember(owner = "client!jw", name = "t", descriptor = "I")
	public static int anInt8407;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IB)I")
	public static int method7179(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
