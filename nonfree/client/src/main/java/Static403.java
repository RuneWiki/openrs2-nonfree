import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static403 {

	@OriginalMember(owner = "client!nja", name = "i", descriptor = "I")
	public static int anInt10573;

	@OriginalMember(owner = "client!nja", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!nja", name = "g", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_32 = new Class177(2, 16);

	@OriginalMember(owner = "client!nja", name = "m", descriptor = "I")
	public static int anInt10576 = 0;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!ec;BLclient!uq;)V")
	public static void method8657(@OriginalArg(0) Class92 arg0, @OriginalArg(2) Class362 arg1) {
		Static134.aClass362_30 = arg1;
		Static340.aClass92_4 = arg0;
		Static499.aString95 = "";
		if (Class171.aString60.startsWith("win")) {
			Static499.aString95 = Static499.aString95 + "windows/";
		} else if (Class171.aString60.startsWith("linux")) {
			Static499.aString95 = Static499.aString95 + "linux/";
		} else if (Class171.aString60.startsWith("mac")) {
			Static499.aString95 = Static499.aString95 + "macos/";
		}
		if (Static340.aClass92_4.aBoolean170) {
			Static499.aString95 = Static499.aString95 + "msjava/";
		} else if (Class171.aString59.startsWith("amd64") || Class171.aString59.startsWith("x86_64")) {
			Static499.aString95 = Static499.aString95 + "x86_64/";
		} else if (Class171.aString59.startsWith("i386") || Class171.aString59.startsWith("i486") || Class171.aString59.startsWith("i586") || Class171.aString59.startsWith("x86")) {
			Static499.aString95 = Static499.aString95 + "x86/";
		} else if (Class171.aString59.startsWith("ppc")) {
			Static499.aString95 = Static499.aString95 + "ppc/";
		} else {
			Static499.aString95 = Static499.aString95 + "universal/";
		}
	}
}
