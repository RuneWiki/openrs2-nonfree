import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static288 {

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "[[[Lclient!ko;")
	public static Class182[][][] aClass182ArrayArrayArray2;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!caa;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_83 = new Class90(117, 0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!wv;Lclient!vo;)V")
	public static void method4599(@OriginalArg(1) Class366 arg0, @OriginalArg(2) Class348 arg1) {
		Static380.aClass348_88 = arg1;
		Static222.aClass366_3 = arg0;
		Static345.aString136 = "";
		if (Class119.aString61.startsWith("win")) {
			Static345.aString136 = Static345.aString136 + "windows/";
		} else if (Class119.aString61.startsWith("linux")) {
			Static345.aString136 = Static345.aString136 + "linux/";
		} else if (Class119.aString61.startsWith("mac")) {
			Static345.aString136 = Static345.aString136 + "macos/";
		}
		if (Static222.aClass366_3.aBoolean720) {
			Static345.aString136 = Static345.aString136 + "msjava/";
		} else if (Class119.aString62.startsWith("amd64") || Class119.aString62.startsWith("x86_64")) {
			Static345.aString136 = Static345.aString136 + "x86_64/";
		} else if (Class119.aString62.startsWith("i386") || Class119.aString62.startsWith("i486") || Class119.aString62.startsWith("i586") || Class119.aString62.startsWith("x86")) {
			Static345.aString136 = Static345.aString136 + "x86/";
		} else if (Class119.aString62.startsWith("ppc")) {
			Static345.aString136 = Static345.aString136 + "ppc/";
		} else {
			Static345.aString136 = Static345.aString136 + "universal/";
		}
	}
}
