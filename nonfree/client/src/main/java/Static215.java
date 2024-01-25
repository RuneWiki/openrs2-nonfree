import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "Lclient!uh;")
	public static Class201 aClass201_11;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "Lclient!te;")
	public static final Class188 aClass188_7 = new Class188(64);

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
	public static final int anInt4408 = -9017772;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
	public static int anInt4409 = 0;

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "J")
	public static long aLong145 = 0L;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBIIII)Z")
	public static boolean method3745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg4; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg1; local16 <= arg3; local16++) {
				if (arg0 == Static72.anIntArrayArray8[local12][local16] && Static149.anIntArrayArray19[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
