import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sw", name = "K", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_147 = new Class337(72, -1);

	@OriginalMember(owner = "client!sw", name = "E", descriptor = "I")
	public static int anInt9045 = 0;

	@OriginalMember(owner = "client!sw", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray72 = new String[100];

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIBI)Z")
	public static boolean method7810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg4; local16 <= arg1; local16++) {
				if (arg2 == Static254.anIntArrayArray24[local12][local16] && Static217.anIntArrayArray20[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)V")
	public static void method7812(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(3, arg0);
		local8.method8961();
	}
}
