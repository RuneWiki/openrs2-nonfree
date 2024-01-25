import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array5;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!pu;Lclient!ft;I)V")
	public static void method1716(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class109 arg1) {
		Static233.aClass109_12 = arg1;
		Static456.aString75 = "";
		Static278.aClass270_71 = arg0;
		if (Class193.aString44.startsWith("win")) {
			Static456.aString75 = Static456.aString75 + "windows/";
		} else if (Class193.aString44.startsWith("linux")) {
			Static456.aString75 = Static456.aString75 + "linux/";
		} else if (Class193.aString44.startsWith("mac")) {
			Static456.aString75 = Static456.aString75 + "macos/";
		}
		if (Static233.aClass109_12.aBoolean205) {
			Static456.aString75 = Static456.aString75 + "msjava/";
		} else if (Class193.aString43.startsWith("amd64") || Class193.aString43.startsWith("x86_64")) {
			Static456.aString75 = Static456.aString75 + "x86_64/";
		} else if (Class193.aString43.startsWith("i386") || Class193.aString43.startsWith("i486") || Class193.aString43.startsWith("i586") || Class193.aString43.startsWith("x86")) {
			Static456.aString75 = Static456.aString75 + "x86/";
		} else if (Class193.aString43.startsWith("ppc")) {
			Static456.aString75 = Static456.aString75 + "ppc/";
		} else {
			Static456.aString75 = Static456.aString75 + "universal/";
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
	public static boolean method1718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static427.method5927(arg1, arg0) | (arg1 & 0x70000) != 0 || Static69.method1218(arg1, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!pu;I)Lclient!os;")
	public static Class1_Sub39 method1719(@OriginalArg(1) Class270 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5691(arg1);
		return local13 == null ? null : new Class1_Sub39(local13);
	}
}
