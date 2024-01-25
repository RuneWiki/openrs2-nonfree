import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!at", name = "J", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!at", name = "o", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_9 = new Class257(80, -1);

	@OriginalMember(owner = "client!at", name = "K", descriptor = "[I")
	public static final int[] anIntArray33 = new int[2];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZI)I")
	public static int method975(@OriginalArg(0) boolean arg0) {
		if (Static232.anIntArray311 == null) {
			return 0;
		} else if (arg0 || Static510.aClass3Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static232.anIntArray311.length; local22++) {
				@Pc(28) int local28 = Static232.anIntArray311[local22];
				if (Static115.aClass237_32.method6296(local28)) {
					local20++;
				}
				if (Static503.aClass237_138.method6296(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static232.anIntArray311.length * 2;
		}
	}
}
