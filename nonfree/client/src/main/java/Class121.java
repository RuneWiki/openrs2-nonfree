import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class121 {

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "[Lclient!fg;")
	private static final Class78[] aClass78Array1 = new Class78[32];

	static {
		@Pc(85) Class78[] local85 = Static71.method1104();
		for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
			aClass78Array1[local85[local87].anInt1850] = local85[local87];
		}
		new Class231("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}
}
