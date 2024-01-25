import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static511 {

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
	public static int anInt8867;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
	public static int anInt8868 = -2;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)Z")
	public static boolean method7646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
