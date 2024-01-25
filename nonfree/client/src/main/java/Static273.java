import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
	public static final int[] anIntArray411 = new int[1000];

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public static int anInt4956 = -1;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Z")
	public static boolean method3912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
