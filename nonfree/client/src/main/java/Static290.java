import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static290 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
	public static int anInt5629;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
	public static int anInt5633;

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
	public static int anInt5634;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "[I")
	public static final int[] anIntArray398 = new int[500];

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "[S")
	public static final short[] aShortArray87 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)I")
	public static int method4722(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
