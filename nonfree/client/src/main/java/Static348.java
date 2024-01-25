import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "[I")
	public static int[] anIntArray458;

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_81 = new Class316(3, -1);

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "[I")
	public static final int[] anIntArray459 = new int[5];

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_95 = new Class98(65, 3);

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "[I")
	public static final int[] anIntArray460 = new int[6];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)I")
	public static int method5290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	public static void method5291() {
		@Pc(1) Class330 local1 = Static180.aClass330_22;
		synchronized (Static180.aClass330_22) {
			Static180.aClass330_22.method7688();
		}
		local1 = Static395.aClass330_46;
		synchronized (Static395.aClass330_46) {
			Static395.aClass330_46.method7688();
		}
	}
}
