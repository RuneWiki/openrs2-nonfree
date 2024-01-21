import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
	public static int[] anIntArray5 = new int[500];

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
	public static int[] anIntArray6 = new int[500];

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
	public static int[] anIntArray7 = new int[500];

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
	public static int[] anIntArray10 = new int[500];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
	public static void method11() {
		anIntArray10 = null;
		anIntArray5 = null;
		anIntArray7 = null;
		anIntArray6 = null;
	}
}
