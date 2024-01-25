import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static188 {

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!tc;")
	public static Class221 aClass221_4;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_47 = new Class32("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3247(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
