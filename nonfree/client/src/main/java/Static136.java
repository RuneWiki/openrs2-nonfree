import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "J")
	public static long aLong92;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "[I")
	public static final int[] anIntArray137 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "[I")
	public static final int[] anIntArray138 = new int[2];

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Z")
	public static boolean method2058() {
		if (Static571.aBoolean654) {
			try {
				if ((Boolean) Static698.method8237(Static531.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public static void method2059() {
		Static191.aBoolean244 = false;
		Static438.method6532();
	}
}
