import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
	public static int anInt5464;

	@OriginalMember(owner = "client!maa", name = "h", descriptor = "Lclient!bt;")
	public static Class34 aClass34_81;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "Z")
	public static final boolean aBoolean410 = false;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "S")
	public static short aShort86 = 1;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method4813(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static64.method1423(arg0.length - 1, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BIIZ)I")
	public static int method4814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) Class4_Sub54 local15 = Static473.method6525(arg1, arg2);
		if (local15 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local15.anIntArray721.length) {
			return local15.anIntArray721[arg0];
		} else {
			return 0;
		}
	}
}
