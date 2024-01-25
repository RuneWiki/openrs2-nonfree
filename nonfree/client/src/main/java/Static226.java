import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static226 {

	@OriginalMember(owner = "client!le", name = "L", descriptor = "I")
	public static int anInt4101 = 0;

	@OriginalMember(owner = "client!le", name = "R", descriptor = "[[I")
	public static final int[][] anIntArrayArray115 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)Z")
	public static boolean method3405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
