import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static269 {

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!kv;")
	public static Class80 aClass80_3;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Z")
	public static final boolean aBoolean385 = true;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!wd;Lclient!jn;B)V")
	public static void method4521(@OriginalArg(0) Class354 arg0, @OriginalArg(1) Class176 arg1) {
		Static210.aString36 = "";
		Static357.aClass176_90 = arg1;
		Static368.aClass354_4 = arg0;
		if (Class332.aString91.startsWith("win")) {
			Static210.aString36 = Static210.aString36 + "windows/";
		} else if (Class332.aString91.startsWith("linux")) {
			Static210.aString36 = Static210.aString36 + "linux/";
		} else if (Class332.aString91.startsWith("mac")) {
			Static210.aString36 = Static210.aString36 + "macos/";
		}
		if (Static368.aClass354_4.aBoolean710) {
			Static210.aString36 = Static210.aString36 + "msjava/";
		} else if (Class332.aString90.startsWith("amd64") || Class332.aString90.startsWith("x86_64")) {
			Static210.aString36 = Static210.aString36 + "x86_64/";
		} else if (Class332.aString90.startsWith("i386") || Class332.aString90.startsWith("i486") || Class332.aString90.startsWith("i586") || Class332.aString90.startsWith("x86")) {
			Static210.aString36 = Static210.aString36 + "x86/";
		} else if (Class332.aString90.startsWith("ppc")) {
			Static210.aString36 = Static210.aString36 + "ppc/";
		} else {
			Static210.aString36 = Static210.aString36 + "universal/";
		}
	}
}
