import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public static int anInt745;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!gl;")
	public static final Class93 aClass93_3 = new Class93("", 13);

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[6][];

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Z")
	public static boolean method590() {
		if (Static197.aBoolean435) {
			try {
				if ((Boolean) Static459.method3567(Static89.aClass114_3.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method592(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
