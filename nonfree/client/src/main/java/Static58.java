import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public static int anInt1078;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
	public static final int[] anIntArray68 = new int[4096];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
	public static int method1039(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
