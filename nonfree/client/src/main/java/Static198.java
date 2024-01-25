import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
	public static int anInt3574;

	@OriginalMember(owner = "client!ju", name = "J", descriptor = "Lclient!ia;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BZZII)Lclient!hh;")
	public static Class109 method3051(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(5) Class141 local5 = null;
		if (Static39.aClass124_1 != null) {
			local5 = new Class141(arg2, Static39.aClass124_1, Static174.aClass124Array1[arg2], 1000000);
		}
		Static171.aClass113_Sub1Array1[arg2] = Static267.aClass172_1.method3699(arg2, Static123.aClass141_1, local5);
		if (arg0) {
			Static171.aClass113_Sub1Array1[arg2].method3798();
		}
		return new Class109(Static171.aClass113_Sub1Array1[arg2], arg1, 1);
	}
}
