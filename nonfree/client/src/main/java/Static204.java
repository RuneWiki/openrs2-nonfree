import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "J")
	public static long aLong95;

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(BII)Z")
	public static boolean method3009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
