import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!ae;")
	public static Class8 aClass8_76;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "D")
	public static double aDouble86;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	public static int anInt4874;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_187 = new Class179(113, -1);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZI)Lclient!sha;")
	public static Class321 method4134(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static109.aClass321ArrayArray1[local7] == null || Static109.aClass321ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static506.method7223(local7);
			if (!local25) {
				return null;
			}
		}
		return Static109.aClass321ArrayArray1[local7][local11];
	}
}
