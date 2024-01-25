import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
	public static int anInt1438;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_24 = new Class96("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
	public static final int anInt1443 = 1406;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)I")
	public static int method1130() {
		@Pc(10) Class151 local10 = Static299.aClass151_126;
		synchronized (Static299.aClass151_126) {
			return Static299.aClass151_126.method3294();
		}
	}
}
