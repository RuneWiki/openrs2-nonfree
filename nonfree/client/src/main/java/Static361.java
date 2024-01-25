import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static361 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IBI)Z")
	public static boolean method5443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
