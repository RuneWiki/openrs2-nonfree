import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
	public static int anInt6241 = 0;

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_204 = new Class123(87, 8);

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "Lclient!lca;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method5026() {
		@Pc(7) String local7 = "www";
		if (Static332.aClass5_3 == Static205.aClass5_6) {
			local7 = "www-wtrc";
		} else if (Static28.aClass5_1 == Static332.aClass5_3) {
			local7 = "www-wtqa";
		} else if (Static587.aClass5_5 == Static332.aClass5_3) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static44.aString268 != null) {
			local33 = "/p=" + Static44.aString268;
		}
		return "http://" + local7 + "." + Static31.aClass89_1.aString66 + ".com/l=" + Static201.anInt4321 + "/a=" + Static501.anInt8649 + local33 + "/";
	}
}
