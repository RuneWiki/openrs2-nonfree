import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hfa", name = "k", descriptor = "Z")
	public static boolean aBoolean331 = true;

	@OriginalMember(owner = "client!hfa", name = "m", descriptor = "I")
	public static int anInt4068 = 0;

	@OriginalMember(owner = "client!hfa", name = "n", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method3460() {
		@Pc(12) String local12 = "www";
		if (Static630.aClass212_18 == Static283.aClass212_16) {
			local12 = "www-wtrc";
		} else if (Static199.aClass212_6 == Static630.aClass212_18) {
			local12 = "www-wtqa";
		} else if (Static630.aClass212_18 == Static375.aClass212_15) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static162.aString39 != null) {
			local33 = "/p=" + Static162.aString39;
		}
		return "http://" + local12 + "." + Static8.aClass290_1.aString86 + ".com/l=" + Static638.anInt10709 + "/a=" + Static234.anInt5227 + local33 + "/";
	}
}
