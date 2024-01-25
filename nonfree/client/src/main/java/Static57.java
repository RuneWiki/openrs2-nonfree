import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cr", name = "D", descriptor = "Lclient!f;")
	public static Class49 aClass49_4;

	@OriginalMember(owner = "client!cr", name = "C", descriptor = "[I")
	public static final int[] anIntArray49 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!cr", name = "Z", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
	public static void method883() {
		Static364.aBoolean508 = false;
		Static75.anIntArray65 = null;
		Static28.anIntArray30 = null;
		Static124.anIntArray101 = null;
		Static443.anIntArray379 = null;
		Static354.anIntArray346 = null;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public static String method884() {
		@Pc(7) String local7 = "www";
		if (Static208.aClass166_5 == Static136.aClass166_3) {
			local7 = "www-wtrc";
		} else if (Static194.aClass166_4 == Static136.aClass166_3) {
			local7 = "www-wtqa";
		} else if (Static136.aClass166_3 == Static368.aClass166_7) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static116.aString52 != null) {
			local33 = "/p=" + Static116.aString52;
		}
		return "http://" + local7 + "." + Static357.aClass6_4.aString4 + ".com/l=" + Static188.anInt3028 + "/a=" + Static28.anInt564 + local33 + "/";
	}
}
