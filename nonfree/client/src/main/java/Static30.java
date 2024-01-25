import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_8 = new Class231(4);

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg4; local16++) {
				if (arg0 == Static200.anIntArrayArray44[local12][local16] && Static97.anIntArrayArray23[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
