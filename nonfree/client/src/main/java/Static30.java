import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Lclient!oi;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_49 = new Class123(3, 10);

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "[I")
	public static final int[] anIntArray52 = new int[32];

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean46 = true;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Z")
	public static boolean method750() {
		if (Static29.aBoolean43) {
			try {
				if ((Boolean) Static456.method3806("showingVideoAd", Static45.aClass209_127.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!eq;Z)V")
	public static void method752(@OriginalArg(0) Class66 arg0) {
		if (Static215.aBoolean261) {
			Static120.method2811(arg0);
		} else {
			Static250.method3881(arg0);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIILclient!he;)Lclient!mo;")
	public static Class166 method756(@OriginalArg(2) int arg0, @OriginalArg(3) Class100 arg1) {
		@Pc(17) byte[] local17 = arg1.method2520(0, arg0);
		return local17 == null ? null : new Class166(local17);
	}
}
