import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_65 = new Class397(100, 10);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)Lclient!nt;")
	public static Class270 method3544(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static172.aClass270ArrayArray2[local15] == null || Static172.aClass270ArrayArray2[local15][local19] == null) {
			@Pc(35) boolean local35 = Static221.method3276(local15);
			if (!local35) {
				return null;
			}
		}
		return Static172.aClass270ArrayArray2[local15][local19];
	}
}
