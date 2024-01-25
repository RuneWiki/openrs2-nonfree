import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "[I")
	public static int[] anIntArray525;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!im;")
	public static final Class140 aClass140_76 = new Class140(52, 8);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Z")
	public static boolean method4475(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static252.aCharArray27[local7 - 128] != '\u0000';
		}
	}
}
