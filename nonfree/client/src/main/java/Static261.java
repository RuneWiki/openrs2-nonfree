import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!of;")
	public static final Class174 aClass174_125 = new Class174("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Lclient!of;")
	public static final Class174 aClass174_126 = new Class174("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIB)V")
	public static void method3617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg1 * Static39.aClass79_Sub1_1.anInt2147 >> 8;
		if (local6 != 0 && arg2 != -1) {
			Static84.method4994(arg2, Static145.aClass250_42, local6);
			Static240.aBoolean428 = true;
		}
	}
}
