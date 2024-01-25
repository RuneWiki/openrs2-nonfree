import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "Lclient!bh;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Lclient!us;")
	public static final Class234 aClass234_113 = new Class234(85, -1);

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(B)Z")
	public static boolean method5049() {
		if (Static153.aBoolean211) {
			try {
				Static398.method1714(Static61.aClass156_1.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}
}
