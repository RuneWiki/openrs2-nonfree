import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
	public static int anInt44 = -1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)I")
	public static int method41(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
