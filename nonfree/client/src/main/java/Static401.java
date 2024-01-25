import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	public static int anInt7143 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method6291() {
		@Pc(13) String local13 = "www";
		if (Static38.aClass220_2 == Static1.aClass220_12) {
			local13 = "www-wtrc";
		} else if (Static601.aClass220_14 == Static38.aClass220_2) {
			local13 = "www-wtqa";
		} else if (Static38.aClass220_2 == Static579.aClass220_13) {
			local13 = "www-wtwip";
		}
		@Pc(34) String local34 = "";
		if (Static587.aString90 != null) {
			local34 = "/p=" + Static587.aString90;
		}
		return "http://" + local13 + "." + Static431.aClass133_11.aString24 + ".com/l=" + Static455.anInt7738 + "/a=" + Static541.anInt9077 + local34 + "/";
	}
}
