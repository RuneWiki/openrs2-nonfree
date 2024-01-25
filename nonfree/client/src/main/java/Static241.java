import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Lclient!of;")
	public static final Class174 aClass174_122 = new Class174("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)Ljava/lang/String;")
	public static String method3493() {
		@Pc(7) String local7 = "www";
		if (Static230.aClass35_2 == Static266.aClass35_5) {
			local7 = "www-wtrc";
		} else if (Static246.aClass35_4 == Static230.aClass35_2) {
			local7 = "www-wtqa";
		} else if (Static230.aClass35_2 == Static390.aClass35_7) {
			local7 = "www-wtwip";
		}
		@Pc(32) String local32 = "";
		if (Static153.aString38 != null) {
			local32 = "/p=" + Static153.aString38;
		}
		return "http://" + local7 + "." + Static154.aClass113_3.aString40 + ".com/l=" + Static300.anInt5192 + "/a=" + Static59.anInt1131 + local32 + "/";
	}
}
