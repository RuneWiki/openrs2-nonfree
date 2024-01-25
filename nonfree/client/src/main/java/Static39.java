import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Lclient!ae;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "Lclient!cl;")
	public static Class56 aClass56_3;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "[S")
	public static short[] aShortArray15;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!pca;")
	public static final Class268 aClass268_1 = new Class268();

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
	public static final int[] anIntArray53 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
	public static final int[] anIntArray54 = new int[5];

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(JI)I")
	public static int method713(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method715(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) byte[] local13;
		if (arg2 > 0) {
			local13 = new byte[arg1];
			for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
				local13[local15] = arg0[local15 + arg2];
			}
		} else {
			local13 = arg0;
		}
		@Pc(41) Class162 local41 = new Class162();
		local41.method3793();
		local41.method3788(local13, (long) (arg1 * 8));
		@Pc(55) byte[] local55 = new byte[64];
		local41.method3789(local55);
		return local55;
	}
}
