import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static385 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IBI)Z")
	public static boolean method6307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
