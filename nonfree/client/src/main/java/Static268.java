import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static268 {

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	public static int anInt5680 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
	public static int method4691(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
