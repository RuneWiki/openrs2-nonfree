import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!m;")
	public static Class181 aClass181_13;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_183 = new Class202("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public static int anInt6263 = 0;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_64 = new Class243(54, 12);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!jaa;")
	public static Class72 method5343() {
		try {
			return new Class72_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class72) Class.forName("Class72_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class72_Sub3();
			}
		}
	}
}
