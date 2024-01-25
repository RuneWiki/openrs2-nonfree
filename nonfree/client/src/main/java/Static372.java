import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static372 {

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "Z")
	public static boolean aBoolean418 = false;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "[I")
	public static int[] anIntArray624 = new int[2];

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
	public static final int[] anIntArray625 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Z")
	public static boolean method4979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
