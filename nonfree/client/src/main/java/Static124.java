import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "J")
	public static long aLong90;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
	public static int anInt2382;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
	public static int anInt2384;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!cea;ILclient!lb;)V")
	public static void method2114(@OriginalArg(0) Class47 arg0, @OriginalArg(2) Class221 arg1) {
		Static239.aString78 = "";
		Static106.aClass221_18 = arg1;
		Static196.aClass47_3 = arg0;
		if (Class13.aString3.startsWith("win")) {
			Static239.aString78 = Static239.aString78 + "windows/";
		} else if (Class13.aString3.startsWith("linux")) {
			Static239.aString78 = Static239.aString78 + "linux/";
		} else if (Class13.aString3.startsWith("mac")) {
			Static239.aString78 = Static239.aString78 + "macos/";
		}
		if (Static196.aClass47_3.aBoolean98) {
			Static239.aString78 = Static239.aString78 + "msjava/";
		} else if (Class13.aString4.startsWith("amd64") || Class13.aString4.startsWith("x86_64")) {
			Static239.aString78 = Static239.aString78 + "x86_64/";
		} else if (Class13.aString4.startsWith("i386") || Class13.aString4.startsWith("i486") || Class13.aString4.startsWith("i586") || Class13.aString4.startsWith("x86")) {
			Static239.aString78 = Static239.aString78 + "x86/";
		} else if (Class13.aString4.startsWith("ppc")) {
			Static239.aString78 = Static239.aString78 + "ppc/";
		} else {
			Static239.aString78 = Static239.aString78 + "universal/";
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)I")
	public static int method2115(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
