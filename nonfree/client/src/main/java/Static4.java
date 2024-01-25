import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!ha;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_7 = new Class202("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!ica;")
	public static final Class127 aClass127_2 = new Class127(16);

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
	public static final int[] anIntArray10 = new int[5];

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public static int anInt114 = -1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public static int anInt115 = 0;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_8 = new Class202("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method267() {
		@Pc(17) byte[] local17;
		if (Static468.anObject17 == null) {
			@Pc(10) Class10_Sub1_Sub1 local10 = new Class10_Sub1_Sub1();
			local17 = local10.method2534();
			Static468.anObject17 = Static252.method3975(local17);
		}
		if (Static48.anObject3 == null) {
			@Pc(32) Class10_Sub2_Sub1 local32 = new Class10_Sub2_Sub1();
			local17 = local32.method702();
			Static48.anObject3 = Static252.method3975(local17);
		}
	}
}
