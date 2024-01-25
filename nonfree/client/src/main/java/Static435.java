import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static435 {

	@OriginalMember(owner = "client!oja", name = "A", descriptor = "I")
	public static int anInt7103;

	@OriginalMember(owner = "client!oja", name = "E", descriptor = "I")
	public static int anInt7105;

	@OriginalMember(owner = "client!oja", name = "B", descriptor = "J")
	public static long aLong194 = -1L;

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IBI)Z")
	public static boolean method5966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
