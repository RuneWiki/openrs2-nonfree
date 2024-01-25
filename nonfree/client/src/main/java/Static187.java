import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static187 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt3756;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
	public static final int[] anIntArray377 = new int[500];

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public static int anInt3752 = 0;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public static int anInt3754 = 0;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	public static int anInt3755 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)B")
	public static byte method3004(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
