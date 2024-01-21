import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_406 = Static169.method2903("Loaded update list");

	@OriginalMember(owner = "client!eb", name = "db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_401 = aClass23_406;

	@OriginalMember(owner = "client!eb", name = "hb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_402 = Static169.method2903("scroll:");

	@OriginalMember(owner = "client!eb", name = "ib", descriptor = "Lclient!ed;")
	public static Class23 aClass23_403 = Static169.method2903("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!eb", name = "kb", descriptor = "I")
	public static int anInt1035 = 255;

	@OriginalMember(owner = "client!eb", name = "lb", descriptor = "I")
	public static int anInt1036 = -1;

	@OriginalMember(owner = "client!eb", name = "mb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_404 = Static169.method2903(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!eb", name = "nb", descriptor = "I")
	public static int anInt1037 = 0;

	@OriginalMember(owner = "client!eb", name = "ub", descriptor = "Lclient!ed;")
	public static Class23 aClass23_405 = aClass23_402;

	@OriginalMember(owner = "client!eb", name = "Ab", descriptor = "Lclient!ed;")
	public static Class23 aClass23_407 = aClass23_402;

	@OriginalMember(owner = "client!eb", name = "Cb", descriptor = "I")
	public static int anInt1049 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Lclient!ed;")
	public static Class23 method621(@OriginalArg(1) int arg0) {
		@Pc(7) Class23 local7 = new Class23();
		local7.anInt1053 = 0;
		local7.aByteArray10 = new byte[arg0];
		return local7;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	public static void method622() {
		if (Static149.aClass40_2 != null) {
			Static149.aClass40_2.method2516();
		}
		if (Static74.aClass40_1 != null) {
			Static74.aClass40_1.method2516();
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	public static void method623() {
		aClass23_401 = null;
		aClass23_404 = null;
		aClass23_403 = null;
		aClass23_405 = null;
		aClass23_406 = null;
		aClass23_407 = null;
		aClass23_402 = null;
	}
}
