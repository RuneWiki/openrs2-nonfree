import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	public static int anInt531;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
	public static int method436(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
