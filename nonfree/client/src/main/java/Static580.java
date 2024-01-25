import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "Lclient!eha;")
	public static Class3_Sub22 aClass3_Sub22_24;

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_107 = new Class397(63, 0);

	@OriginalMember(owner = "client!saa", name = "o", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_108 = new Class397(16, 3);

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)I")
	public static int method5882() {
		@Pc(7) int local7 = Static351.aClass331_1.method7410();
		if (local7 < Static238.aClass331Array1.length - 1) {
			Static351.aClass331_1 = Static238.aClass331Array1[local7 + 1];
		}
		return 100;
	}
}
