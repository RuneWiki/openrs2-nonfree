import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!sh", name = "O", descriptor = "S")
	public static short aShort39 = 256;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)Ljava/lang/String;")
	public static String method3896() {
		@Pc(5) String local5 = "www";
		if (Static210.anInt4148 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(12) String local12 = "";
		if (Static198.aString134 != null) {
			local12 = "/p=" + Static198.aString134;
		}
		return "http://" + local5 + ".runescape.com/l=" + Static117.anInt2307 + "/a=" + Static119.anInt5881 + local12 + "/";
	}
}
