import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
	public static int anInt6173;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "[I")
	public static int[] anIntArray610 = new int[128];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIB)I")
	public static int method4780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg1;
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(22) int local22 = Static89.method1536(local7, local3);
		@Pc(28) int local28 = arg2 & arg1 - 1;
		@Pc(35) int local35 = Static89.method1536(local7, local3 + 1);
		@Pc(42) int local42 = Static89.method1536(local7 + 1, local3);
		@Pc(59) int local59 = Static89.method1536(local7 + 1, local3 + 1);
		@Pc(66) int local66 = Static177.method3224(local35, local22, arg1, local13);
		@Pc(73) int local73 = Static177.method3224(local59, local42, arg1, local13);
		return Static177.method3224(local73, local66, arg1, local28);
	}
}
