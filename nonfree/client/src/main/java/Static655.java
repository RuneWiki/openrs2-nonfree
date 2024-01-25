import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
	public static int anInt10935;

	@OriginalMember(owner = "client!wea", name = "w", descriptor = "F")
	public static float aFloat267;

	@OriginalMember(owner = "client!wea", name = "y", descriptor = "Lclient!tea;")
	public static Class335 aClass335_1;

	@OriginalMember(owner = "client!wea", name = "u", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_140 = new Class100(59, 1);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(BI)Lclient!mea;")
	public static Class230 method9094(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static559.aClass230ArrayArray2[local12] == null || Static559.aClass230ArrayArray2[local12][local16] == null) {
			@Pc(30) boolean local30 = Static220.method3432(local12);
			if (!local30) {
				return null;
			}
		}
		return Static559.aClass230ArrayArray2[local12][local16];
	}
}
