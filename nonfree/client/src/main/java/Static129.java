import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
	public static int anInt9539;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
	public static int anInt9544;

	@OriginalMember(owner = "client!fba", name = "u", descriptor = "Lclient!an;")
	public static Class16 aClass16_119;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_279 = new Class88("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "Lclient!mc;")
	public static Class198 aClass198_17 = null;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)I")
	public static int method7912(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "([BII)I")
	public static int method7913(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static29.method559(0, arg0, arg1);
	}
}
