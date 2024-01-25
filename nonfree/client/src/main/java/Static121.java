import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public static void method1904() {
		Static514.aStringArray35 = new String[500];
		Static457.anInt7855 = Static373.aClass334_13.anInt9005 + Static373.aClass334_13.anInt9008 + 2;
		Static483.anInt8128 = Static268.aClass334_14.anInt9008 + Static268.aClass334_14.anInt9005 + 2;
		for (@Pc(27) int local27 = 0; local27 < Static514.aStringArray35.length; local27++) {
			Static514.aStringArray35[local27] = "";
		}
		Static165.method2388(Static568.aClass351_5.method7651(Static307.anInt5279));
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1905(@OriginalArg(1) String arg0) {
		if (Class193.aString44.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class193.aString44.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class193.aString44.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
