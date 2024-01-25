import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
	public static int anInt541 = -1;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
	public static int anInt543 = 1;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
	public static boolean method493(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
