import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "[[[Lclient!wg;")
	public static Class360[][][] aClass360ArrayArrayArray8;

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg4; local7++) {
			for (@Pc(11) int local11 = arg0; local11 <= arg1; local11++) {
				if (arg3 == Static448.anIntArrayArray44[local7][local11] && Static313.anIntArrayArray26[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
