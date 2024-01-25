import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static325 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "[I")
	public static int[] anIntArray328 = null;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z")
	public static boolean method5113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
