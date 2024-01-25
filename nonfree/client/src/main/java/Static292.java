import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static292 {

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
	public static int anInt4643;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	public static int anInt4638 = -1;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_136 = new Class34("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
	public static int anInt4644 = -2;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Z")
	public static boolean method4180(@OriginalArg(1) int arg0) {
		Static190.anInt4079 = arg0 + 1 & 0xFFFF;
		Static239.aBoolean479 = true;
		return true;
	}
}
