import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static361 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public static int anInt6767;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "J")
	public static long aLong183;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray37 = new byte[1000][];

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "[I")
	public static final int[] anIntArray507 = new int[200];

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Z")
	public static boolean method5533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
