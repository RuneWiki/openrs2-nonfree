import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!kf;")
	public static final Class171 aClass171_1 = new Class171(1);

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
	public static final int[] anIntArray15 = new int[1];

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Lclient!kh;")
	public static final Class172 aClass172_1 = new Class172();

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
	public static boolean method202(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
