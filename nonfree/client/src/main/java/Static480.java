import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Lclient!mn;")
	public static Class227 aClass227_3;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	public static int anInt8096;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "[I")
	public static int[] anIntArray622 = null;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "J")
	public static long aLong248 = 0L;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)Z")
	public static boolean method6521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface19 local9 = (Interface19) Static82.method1473(arg1, arg2, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static201.method3243(local9) & true;
		}
		local9 = (Interface19) Static14.method147(arg1, arg2, arg0, rda.class);
		if (local9 != null) {
			local11 &= Static201.method3243(local9);
		}
		local9 = (Interface19) Static308.method4292(arg1, arg2, arg0);
		if (local9 != null) {
			local11 &= Static201.method3243(local9);
		}
		return local11;
	}
}
