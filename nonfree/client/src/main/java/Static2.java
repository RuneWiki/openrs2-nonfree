import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public static int anInt4 = 1;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public static int anInt8 = 64;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	public static int anInt9 = 0;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
	public static final int[] anIntArray1 = new int[14];
}
