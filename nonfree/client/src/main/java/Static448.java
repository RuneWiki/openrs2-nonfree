import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static448 {

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "[[Lclient!ss;")
	public static Class219[][] aClass219ArrayArray2;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_130 = new Class237(83, 8);

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
	public static int anInt7686 = 0;

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean489 = false;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_104 = new Class84("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)I")
	public static int method6002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
