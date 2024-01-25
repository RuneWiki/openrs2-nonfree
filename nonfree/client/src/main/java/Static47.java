import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Lclient!wo;")
	public static Class216 aClass216_12;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_35 = new Class34("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public static int anInt1510 = 0;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Z")
	public static boolean aBoolean146 = true;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	public static int anInt1511 = 13156520;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method1288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 < 128 || arg4 < 128 || Static233.anInt5573 * 128 - 256 < arg2 || (Static134.anInt2971 - 2) * 128 < arg4) {
			Static22.anIntArray444[0] = Static22.anIntArray444[1] = -1;
			return;
		}
		@Pc(53) int local53 = Static94.method2022(arg4, arg2, Static242.anInt6745) - arg3;
		Static265.aClass109_33.method3874(arg5, 0, 0);
		Static208.aClass32_11.method2201(Static265.aClass109_33);
		Static208.aClass32_11.method2170(arg2, local53, arg4, Static22.anIntArray444);
		Static265.aClass109_33.method3874(-arg5, 0, 0);
		Static208.aClass32_11.method2201(Static265.aClass109_33);
	}
}
