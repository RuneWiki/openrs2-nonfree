import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public static int anInt7273;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	public static int anInt7276;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
	public static int method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static131.aShortArrayArray3 == null ? 0 : Static131.aShortArrayArray3[arg0][arg1] & 0xFFFF;
	}
}
