import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean587 = false;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	public static int anInt6928 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBIZ)I")
	public static int method5435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class2_Sub44 local10 = Static432.method5828(arg2, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray498.length; local24++) {
				if (local10.anIntArray499[local24] == arg1) {
					local22 += local10.anIntArray498[local24];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!wt;")
	public static Class40 method5441(@OriginalArg(2) Component arg0) {
		return new Class40_Sub1(arg0, true);
	}
}
