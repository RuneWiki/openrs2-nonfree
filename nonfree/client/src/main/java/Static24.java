import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
	public static int anInt770;

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
	public static int anInt772 = 0;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)I")
	public static int method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static171.aShortArrayArray6 == null ? 0 : Static171.aShortArrayArray6[arg0][arg1] & 0xFFFF;
	}
}
