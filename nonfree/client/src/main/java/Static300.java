import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "Lclient!ck;")
	public static Class44 aClass44_2;

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_77 = new Class91(8);

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(II)Lclient!ec;")
	public static Class68 method4351(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static293.aClass68ArrayArray4[local12] == null || Static293.aClass68ArrayArray4[local12][local16] == null) {
			@Pc(30) boolean local30 = Static414.method5610(local12);
			if (!local30) {
				return null;
			}
		}
		return Static293.aClass68ArrayArray4[local12][local16];
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(FIZFF)F")
	public static float method4352(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static173.aFloatArrayArray8[arg1];
		return arg2 * local7[2] + local7[0] * arg3 + arg0 * local7[1];
	}
}
