import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
	public static int anInt3261;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!ae;")
	public static Class9 aClass9_10;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "Lclient!fa;")
	public static Class94 aClass94_4;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
	public static int anInt3262;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_30 = new Class236(49, 11);

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "[I")
	public static final int[] anIntArray248 = new int[14];

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Z")
	public static boolean method2891() {
		if (Static343.aBoolean436) {
			try {
				if ((Boolean) Static555.method5217(aClass9_10.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}
}
