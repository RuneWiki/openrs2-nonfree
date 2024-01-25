import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
	public static int anInt3724;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	public static int anInt3720 = 0;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
	public static int anInt3725 = 0;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)Ljava/lang/String;")
	public static String method3253() {
		@Pc(12) String local12 = "www";
		if (Static561.aClass194_6 == Static542.aClass194_5) {
			local12 = "www-wtrc";
		} else if (Static427.aClass194_3 == Static542.aClass194_5) {
			local12 = "www-wtqa";
		} else if (Static530.aClass194_4 == Static542.aClass194_5) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static110.aString17 != null) {
			local33 = "/p=" + Static110.aString17;
		}
		return "http://" + local12 + "." + Static317.aClass37_3.aString9 + ".com/l=" + Static25.anInt769 + "/a=" + Static488.anInt5164 + local33 + "/";
	}
}
