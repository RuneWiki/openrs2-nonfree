import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_66 = new Class134("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_129 = new Class102(47, -1);

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_67 = new Class134("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_3 = new Class4("stellardawn", 1);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
	public static int method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static94.aByteArrayArray60 == null ? 0 : Static94.aByteArrayArray60[arg0][arg1] & 0xFF;
	}
}
