import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static646 {

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
	public static int anInt10428;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "[I")
	public static final int[] anIntArray736 = new int[4];

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "Z")
	public static boolean aBoolean757 = false;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)I")
	public static int method8864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static348.aShortArrayArray5 == null ? 0 : Static348.aShortArrayArray5[arg0][arg1] & 0xFFFF;
	}
}
