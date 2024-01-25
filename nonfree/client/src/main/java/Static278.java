import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!jo;")
	public static Class168 aClass168_67;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[6][];

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
	public static final int[] anIntArray401 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "[I")
	public static final int[] anIntArray402 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)I")
	public static int method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local11;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)Z")
	public static boolean method4603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
