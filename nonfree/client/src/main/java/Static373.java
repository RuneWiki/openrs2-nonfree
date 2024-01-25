import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Lclient!sb;")
	public static Class212 aClass212_8;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Lclient!sp;")
	public static final Class219 aClass219_6 = new Class219("LIVE", 0);

	@OriginalMember(owner = "client!st", name = "l", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_127 = new Class83("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	public static int anInt6383 = -1;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(CI)C")
	public static char method4980(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
