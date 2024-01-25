import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Z")
	public static boolean aBoolean412;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "Lclient!lga;")
	public static Class223 aClass223_72;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public static int anInt5495;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
	public static int anInt5500;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_98 = new Class322(22, -1);

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)Ljava/lang/String;")
	public static String method5013() {
		@Pc(16) String local16 = "www";
		if (Static88.aClass352_3 == Static520.aClass352_8) {
			local16 = "www-wtrc";
		} else if (Static520.aClass352_8 == Static452.aClass352_7) {
			local16 = "www-wtqa";
		} else if (Static520.aClass352_8 == Static353.aClass352_6) {
			local16 = "www-wtwip";
		}
		@Pc(47) String local47 = "";
		if (Static506.aString97 != null) {
			local47 = "/p=" + Static506.aString97;
		}
		return "http://" + local16 + "." + Static129.aClass121_1.aString30 + ".com/l=" + Static601.anInt9518 + "/a=" + Static99.anInt1987 + local47 + "/";
	}
}
