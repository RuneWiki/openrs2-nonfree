import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	public static int anInt6825;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "Lclient!er;")
	public static final Class69 aClass69_69 = new Class69(50);

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIB)Z")
	public static boolean method5297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static327.aByteArrayArrayArray11[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static327.aByteArrayArrayArray11[arg0][arg2][arg3] & 0x10) == 0) {
			return arg1 == Static25.method528(arg3, arg2, arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Lclient!ha;")
	public static Class102 method5298(@OriginalArg(0) int arg0) {
		@Pc(10) Class102 local10 = (Class102) Static7.aClass69_3.method1591((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static240.aClass166_166.method3696(arg0, 0);
		local10 = new Class102();
		if (local22 != null) {
			local10.method2105(new Class4_Sub30(local22), arg0);
		}
		Static7.aClass69_3.method1590((long) arg0, local10);
		return local10;
	}
}
