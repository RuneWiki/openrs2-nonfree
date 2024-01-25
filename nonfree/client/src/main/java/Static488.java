import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_58 = new Class112();

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt7959 = 0;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "I")
	public static int anInt7961 = 1;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method6616() {
		@Pc(11) String local11 = "www";
		if (Static522.aClass272_12 == Static516.aClass272_11) {
			local11 = "www-wtrc";
		} else if (Static516.aClass272_11 == Static72.aClass272_5) {
			local11 = "www-wtqa";
		} else if (Static516.aClass272_11 == Static434.aClass272_9) {
			local11 = "www-wtwip";
		}
		@Pc(32) String local32 = "";
		if (Static568.aString87 != null) {
			local32 = "/p=" + Static568.aString87;
		}
		return "http://" + local11 + "." + Static121.aClass274_1.aString69 + ".com/l=" + Static256.anInt4535 + "/a=" + Static535.anInt8570 + local32 + "/";
	}
}
