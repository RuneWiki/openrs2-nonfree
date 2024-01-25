import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static193 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
	public static int anInt3724;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	public static int anInt3726;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "[I")
	public static final int[] anIntArray314 = new int[3];

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
	public static final int[] anIntArray315 = new int[8];

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	public static int anInt3727 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)I")
	public static int method3299(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
