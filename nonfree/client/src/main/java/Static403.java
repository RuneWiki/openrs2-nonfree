import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static403 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)Z")
	public static boolean method6304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
