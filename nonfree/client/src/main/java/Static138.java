import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!k", name = "W", descriptor = "I")
	public static int anInt2789;

	@OriginalMember(owner = "client!k", name = "I", descriptor = "I")
	public static int anInt2776 = 0;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "[I")
	public static int[] anIntArray234 = new int[1000];

	@OriginalMember(owner = "client!k", name = "R", descriptor = "I")
	public static int anInt2784 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)I")
	public static int method2399(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
