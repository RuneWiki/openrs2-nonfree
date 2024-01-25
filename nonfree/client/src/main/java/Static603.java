import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
	public static int anInt9778;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "[[S")
	public static short[][] aShortArrayArray19;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "Lclient!ef;")
	public static final Class88 aClass88_5 = new Class88();

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "Z")
	public static boolean aBoolean740 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!uu;)V")
	public static void method8313(@OriginalArg(1) Class343 arg0) {
		Static498.anInt8414 = arg0.method8158("hitmarks");
		Static97.anInt1972 = arg0.method8158("hitbar_default");
		Static552.anInt9164 = arg0.method8158("timerbar_default");
		Static56.anInt1068 = arg0.method8158("headicons_pk");
		Static304.anInt8390 = arg0.method8158("headicons_prayer");
		Static205.anInt8400 = arg0.method8158("hint_headicons");
		Static49.anInt966 = arg0.method8158("hint_mapmarkers");
		Static135.anInt2829 = arg0.method8158("mapflag");
		Static507.anInt8547 = arg0.method8158("cross");
		Static62.anInt1089 = arg0.method8158("mapdots");
		Static321.anInt6142 = arg0.method8158("scrollbar");
		Static488.anInt8317 = arg0.method8158("name_icons");
		Static151.anInt3056 = arg0.method8158("floorshadows");
		Static527.anInt8941 = arg0.method8158("compass");
		Static216.anInt7759 = arg0.method8158("otherlevel");
		Static539.anInt9067 = arg0.method8158("hint_mapedge");
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method8314(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static606.anInt9791; local11++) {
			if (arg0.equalsIgnoreCase(Static233.aStringArray32[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
