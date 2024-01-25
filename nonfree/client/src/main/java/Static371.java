import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static371 {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray50 = new byte[50][];

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "F")
	public static float aFloat96 = 0.0F;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method4841(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static49.method691(arg1.length - 1, arg0, arg1, 0);
	}
}
