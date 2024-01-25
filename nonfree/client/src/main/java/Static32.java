import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bd", name = "cb", descriptor = "[[I")
	public static int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bd", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[128][128];

	@OriginalMember(owner = "client!bd", name = "Rb", descriptor = "[I")
	public static final int[] anIntArray63 = new int[14];

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(III)Z")
	public static boolean method708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
