import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_14 = new Class306("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "[I")
	public static final int[] anIntArray121 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
	public static void method915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static99.anInt1988 <= arg0 && Static205.anInt4042 >= arg0) {
			@Pc(31) int local31 = Static400.method6041(arg3, Static216.anInt4203, Static358.anInt8908);
			@Pc(37) int local37 = Static400.method6041(arg2, Static216.anInt4203, Static358.anInt8908);
			Static108.method1864(arg1, local31, arg0, local37);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public static void method916() {
		Static384.aClass313_46.method7398();
		Static416.aClass313_51.method7398();
		Static425.aClass313_54.method7398();
		Static431.aClass313_56.method7398();
		Static71.aClass313_7.method7398();
	}
}
