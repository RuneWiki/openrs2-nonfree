import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static184 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public static int anInt3358;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
	public static final int[] anIntArray258 = new int[25];

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "[I")
	public static int[] anIntArray259 = new int[2];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static454.method6024(arg1, arg0) | (arg0 & 0x2000) != 0 | Static160.method3985(arg1, arg0)) & Static202.method2860(arg0, arg1);
	}
}
