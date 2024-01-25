import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "Lclient!ta;")
	public static Class91 aClass91_3;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "Lclient!xa;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_4 = new Class284(15, -1);

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
	public static int anInt953 = 0;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZLclient!ba;II)Lclient!dd;")
	public static Class68 method848(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg1 == null ? null : new Class68(arg2, arg0, arg3, arg1.ZA(), arg1.ha(), arg1.M(), arg1.DA(), arg1.EA(), arg1.LA(), arg1.K());
	}
}
