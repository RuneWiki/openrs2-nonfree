import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static585 {

	@OriginalMember(owner = "client!un", name = "F", descriptor = "Z")
	public static boolean aBoolean670 = false;

	@OriginalMember(owner = "client!un", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!un", name = "L", descriptor = "[I")
	public static final int[] anIntArray599 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!un", name = "M", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_175 = new Class268(1, 10);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(CI)Z")
	public static boolean method8233(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
