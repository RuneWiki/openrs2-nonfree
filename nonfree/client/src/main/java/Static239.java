import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static239 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public static int anInt4868;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	public static int anInt4870;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	public static int anInt4867 = 0;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "[I")
	public static int[] anIntArray440 = new int[14];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	public static int method3936(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
