import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!eq;")
	public static Class65 aClass65_4;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public static int anInt731;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!ea;")
	public static Class55 aClass55_3;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "[[Lclient!eq;")
	public static Class65[][] aClass65ArrayArray1;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	public static int anInt735 = 0;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_19 = new Class85("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
	public static int anInt740 = -1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(CI)Z")
	public static boolean method646(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
