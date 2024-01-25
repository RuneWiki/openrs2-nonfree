import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "E", descriptor = "Lclient!to;")
	public static Class228 aClass228_1;

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_4 = new Class84("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_5 = new Class84("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ap", name = "G", descriptor = "Lclient!tt;")
	public static final Class232 aClass232_1 = new Class232();

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIZLclient!vh;)V")
	public static void method333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) Class250 arg3) {
		Static296.aBoolean145 = false;
		Static228.anInt4117 = arg2;
		Static32.aClass250_7 = arg3;
		Static37.anInt703 = 0;
		Static348.anInt5981 = arg1;
		Static144.anInt2452 = 1;
		Static363.anInt6199 = Static327.aClass1_Sub7_Sub3_3.method5000() / arg0;
		if (Static363.anInt6199 < 1) {
			Static363.anInt6199 = 1;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	public static void method336(@OriginalArg(0) int arg0) {
		Static46.anInt865 = arg0;
		Static55.anInt1147 = -1;
		Static21.anInt465 = -1;
		Static144.method2162();
	}
}
