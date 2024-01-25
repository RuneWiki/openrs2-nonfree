import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!lja", name = "s", descriptor = "Lclient!ib;")
	public static Class2_Sub1_Sub1_Sub3_Sub1 aClass2_Sub1_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!lja", name = "p", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_226 = new Class179(64, -1);

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "(IZ)I")
	public static int method5030(@OriginalArg(1) boolean arg0) {
		if (Static169.anIntArray157 == null) {
			return 0;
		} else if (arg0 || Static614.aClass290Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static169.anIntArray157.length; local22++) {
				@Pc(28) int local28 = Static169.anIntArray157[local22];
				if (Static360.aClass8_135.method273(local28)) {
					local20++;
				}
				if (Static320.aClass8_89.method273(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static169.anIntArray157.length * 2;
		}
	}
}
