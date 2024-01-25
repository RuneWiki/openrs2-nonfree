import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static105 {

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "[I")
	public static final int[] anIntArray202 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
	public static final int anInt1911 = 1339;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
	public static int anInt1912 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!lt;)V")
	public static void method1767(@OriginalArg(1) Class158 arg0) {
		Static360.anInt6052 = arg0.method3677("titlebg");
		Static117.anInt2047 = arg0.method3677("logo");
	}
}
