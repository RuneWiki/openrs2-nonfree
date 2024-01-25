import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!qga", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray38;

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "Lclient!ib;")
	public static final Class147 aClass147_8 = new Class147("LIVE", "", "", 0);

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method7040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg4; local12++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg0; local16++) {
				if (arg3 == Static242.anIntArrayArray47[local12][local16] && Static224.anIntArrayArray24[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
