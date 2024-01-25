import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static115 {

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)I")
	public static int method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static142.aShortArrayArray4 == null ? 0 : Static142.aShortArrayArray4[arg0][arg1] & 0xFFFF;
	}
}
