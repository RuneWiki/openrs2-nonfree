import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!ns;")
	public static Class166 aClass166_226;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "[[Lclient!jb;")
	public static Class126[][] aClass126ArrayArray2;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_72 = new Class242("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method4404() {
		Static58.anInt4352 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static165.aClass4_Sub30Array1[local9] = null;
			Static251.aByteArray45[local9] = 1;
			Static114.aClass171Array1[local9] = null;
		}
	}
}
