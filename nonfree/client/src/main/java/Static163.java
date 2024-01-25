import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static163 {

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "[B")
	public static final byte[] aByteArray42 = new byte[520];

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "[I")
	public static final int[] anIntArray352 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
	public static int anInt3567 = 0;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(III)Z")
	public static boolean method3178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static97.aByteArrayArrayArray19[1].length && arg0 < Static97.aByteArrayArrayArray19[1][arg1].length) {
			return (Static97.aByteArrayArrayArray19[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
