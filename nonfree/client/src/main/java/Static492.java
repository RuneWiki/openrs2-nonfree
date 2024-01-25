import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
	public static int anInt6134;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "S")
	public static short aShort80 = 1;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)Z")
	public static boolean method5182() {
		if (Static301.aBoolean334) {
			try {
				if ((Boolean) Static683.method5174(Static180.anApplet6, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(24) Throwable local24) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lclient!o;")
	public static Class246 method5183(@OriginalArg(0) int arg0) {
		@Pc(8) Class246[] local8 = Static135.method2045();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt6833) {
				return local8[local10];
			}
		}
		return null;
	}
}
