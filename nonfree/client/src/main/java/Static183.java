import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
	public static final int[] anIntArray297 = new int[1];

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
	public static final int anInt3331 = 205;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
	public static int anInt3335 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
	public static int method2897(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
