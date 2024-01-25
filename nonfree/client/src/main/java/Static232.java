import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static232 {

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "[[B")
	public static final byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Z")
	public static boolean method3903(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9 || arg0 == 10;
	}
}
