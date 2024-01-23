import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!em", name = "l", descriptor = "I")
	public static int anInt1325;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Lclient!eo;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!em", name = "A", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString81 = null;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!dj;")
	public static Class40 aClass40_6 = new Class40(64);

	@OriginalMember(owner = "client!em", name = "z", descriptor = "I")
	public static int anInt1333 = 0;

	@OriginalMember(owner = "client!em", name = "B", descriptor = "I")
	public static int anInt1334 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method1077(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static239.anInt4517; local12++) {
			if (arg0.equalsIgnoreCase(Static130.aStringArray18[local12])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Z")
	public static boolean method1079() {
		if (Static75.aBoolean102) {
			try {
				return !((Boolean) Static319.method1852(Static276.aClass139_4.anApplet1, "showingVideoAd"));
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
