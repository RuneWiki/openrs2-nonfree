import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static500 {

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "[I")
	public static int[] anIntArray611 = null;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
	public static int method7558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static223.anIntArray286[arg1 & 0x3] : 256;
	}
}
