import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static141 {

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
	public static int anInt2713;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "[B")
	public static final byte[] aByteArray36 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
	public static int anInt2714 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Z")
	public static boolean method2321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static291.aByteArrayArrayArray11[1][arg0][arg1] & 0x2) != 0;
	}
}
