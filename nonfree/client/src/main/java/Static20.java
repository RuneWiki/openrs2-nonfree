import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!au", name = "e", descriptor = "I")
	public static int anInt4875;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "I")
	public static int anInt4876;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_177 = new Class103(4, -1);

	@OriginalMember(owner = "client!au", name = "d", descriptor = "[I")
	public static final int[] anIntArray310 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!au", name = "f", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_113 = new Class119("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!au", name = "h", descriptor = "Z")
	public static boolean aBoolean552 = false;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
	public static boolean method3816(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}
}
