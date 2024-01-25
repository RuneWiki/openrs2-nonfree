import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "[I")
	public static int[] anIntArray436;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!fh;")
	public static final Class90 aClass90_10 = new Class90();

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_71 = new Class67("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)Z")
	public static boolean method4083(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static121.aClass5_7.method7441();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static121.aClass5_7.method7420();
		} else if (!Static121.aClass5_7.method7472()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static7.aClass3_Sub15_Sub1_1.aBoolean595 = arg0;
			Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
			return true;
		}
	}
}
