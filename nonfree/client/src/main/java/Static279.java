import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static279 {

	@OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
	public static int anInt4936;

	@OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
	public static int anInt4940;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_132 = new Class77(89, -2);

	@OriginalMember(owner = "client!pn", name = "N", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!pn", name = "P", descriptor = "I")
	public static int anInt4939 = 0;

	@OriginalMember(owner = "client!pn", name = "R", descriptor = "[I")
	public static final int[] anIntArray612 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!pn", name = "S", descriptor = "I")
	public static int anInt4941 = -1;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIZI)V")
	public static void method4311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			Static264.method4096(Static267.anIntArrayArray38[arg1], arg0, arg2, arg3);
		} else {
			Static264.method4096(Static267.anIntArrayArray38[arg1], arg0, arg3, arg2);
		}
	}
}
