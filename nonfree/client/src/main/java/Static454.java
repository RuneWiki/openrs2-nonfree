import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!ck;")
	public static Class56 aClass56_5;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!bi;")
	public static Class31 aClass31_98;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_105 = new Class61(7, 16);

	@OriginalMember(owner = "client!re", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[6][];

	@OriginalMember(owner = "client!re", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
	public static boolean method6415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V")
	public static void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class10_Sub4 local13 = local7.aClass10_Sub4_1;
		@Pc(16) Class10_Sub4 local16 = local7.aClass10_Sub4_2;
		if (local13 != null) {
			local13.anInt8735 = local13.anInt8735 * arg3 / (0x10 << Static41.anInt810 - 7);
			local13.anInt8729 = local13.anInt8729 * arg3 / (0x10 << Static41.anInt810 - 7);
		}
		if (local16 != null) {
			local16.anInt8735 = local16.anInt8735 * arg3 / (0x10 << Static41.anInt810 - 7);
			local16.anInt8729 = local16.anInt8729 * arg3 / (0x10 << Static41.anInt810 - 7);
		}
	}
}
