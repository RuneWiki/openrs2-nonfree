import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
	public static int[] anIntArray187;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!hb;")
	public static Class3_Sub1_Sub3_Sub1_Sub1 aClass3_Sub1_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_970 = Static122.method531("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!sd;")
	private static Class73 aClass73_971 = Static122.method531("as it was used to break our rules)3");

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!sd;")
	public static Class73 aClass73_972 = Static122.method531("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!sd;")
	public static Class73 aClass73_973 = aClass73_971;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!sd;")
	public static Class73 aClass73_974 = Static122.method531(")1");

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Lclient!sd;")
	public static Class73 aClass73_975 = Static122.method531("Spieler");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public static void method1413() {
		if (Static57.anIntArray142 != null && anIntArray188 != null) {
			return;
		}
		anIntArray188 = new int[256];
		Static57.anIntArray142 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static57.anIntArray142[local13] = (int) (Math.sin(local22) * 4096.0D);
			anIntArray188[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1414() {
		Static180.aClass7_29.method190();
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method1415() {
		anIntArray188 = null;
		aClass73_974 = null;
		anIntArray187 = null;
		anIntArray189 = null;
		aClass73_970 = null;
		aClass73_973 = null;
		aClass73_971 = null;
		aClass73_972 = null;
		aClass73_975 = null;
		aClass3_Sub1_Sub3_Sub1_Sub1_1 = null;
	}
}
