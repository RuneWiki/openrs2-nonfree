import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_177 = new Class62("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!db;")
	public static final Class49 aClass49_6 = new Class49("WTQA", 2);

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
	public static boolean method4405(@OriginalArg(0) int arg0) {
		return arg0 == 15 || arg0 == 22 || arg0 == 1010 || arg0 == 18 || arg0 == 49;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method4406() {
		@Pc(12) String local12 = "www";
		if (Static311.aClass49_2 == Static306.aClass49_7) {
			local12 = "www-wtrc";
		} else if (aClass49_6 == Static306.aClass49_7) {
			local12 = "www-wtqa";
		} else if (Static306.aClass49_7 == Static209.aClass49_5) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static60.aString14 != null) {
			local33 = "/p=" + Static60.aString14;
		}
		return "http://" + local12 + "." + Static85.aClass38_1.aString8 + ".com/l=" + Static200.anInt4144 + "/a=" + Static369.anInt6788 + local33 + "/";
	}
}
