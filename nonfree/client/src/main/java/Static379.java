import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

	@OriginalMember(owner = "client!oga", name = "o", descriptor = "[I")
	public static int[] anIntArray506;

	@OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
	public static int anInt6307;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)I")
	public static int method5065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static535.aShortArrayArray12 == null ? 0 : Static535.aShortArrayArray12[arg0][arg1] & 0xFFFF;
	}
}
