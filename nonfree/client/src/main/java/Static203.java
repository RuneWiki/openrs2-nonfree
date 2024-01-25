import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public static int anInt4534;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_123 = new Class88("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Lclient!h;")
	public static final Class125 aClass125_24 = new Class125(200);

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_124 = new Class88("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public static int anInt4533 = 10;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method3817() {
		Static497.aClass42_9.M(((float) Static208.aClass12_Sub10_Sub1_1.anInt2219 * 0.1F + 0.7F) * 1.1523438F);
		Static497.aClass42_9.m(Static114.anInt2634, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static497.aClass42_9.E(Static9.anInt120, -1, 256);
		Static497.aClass42_9.method5801(Static500.aClass124_3);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z")
	public static boolean method3818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static334.method5354(arg0, arg1) | Static437.method6659(arg1, arg0) | Static190.method3667(arg0, arg1)) & Static368.method5723(arg0, arg1);
	}
}
