import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static438 {

	@OriginalMember(owner = "client!vv", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!vv", name = "z", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_35 = new Class269(9, 3);

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)I")
	public static int method3772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static137.anIntArray162[arg0 & 0x3] : Static427.anIntArray488[arg0 & 0x3];
	}
}
