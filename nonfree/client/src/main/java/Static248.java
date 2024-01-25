import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static248 {

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[100];

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)Z")
	public static boolean method3792(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
