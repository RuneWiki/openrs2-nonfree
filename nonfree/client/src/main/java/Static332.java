import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static332 {

	@OriginalMember(owner = "client!uq", name = "jb", descriptor = "[[I")
	public static int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I", line = 71)
	public static int method5988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static78.anIntArrayArray16 == null ? 0 : Static78.anIntArrayArray16[arg0][arg1] & 0xFFFFFF;
	}
}
