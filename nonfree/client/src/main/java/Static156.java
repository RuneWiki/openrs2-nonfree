import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
	public static int anInt3180;

	@OriginalMember(owner = "client!fj", name = "E", descriptor = "[I")
	public static final int[] anIntArray200 = new int[2];

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)I")
	public static int method2752() {
		return Static65.anIntArray96 == null ? 0 : Static65.anIntArray96.length * 2;
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)J")
	public static long method2753(@OriginalArg(1) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}
