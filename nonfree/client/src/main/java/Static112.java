import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
	public static int[] anIntArray187;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_86 = new Class217(65, 1);

	@OriginalMember(owner = "client!h", name = "z", descriptor = "Lclient!bt;")
	public static Class21 aClass21_72 = new Class21(64);

	@OriginalMember(owner = "client!h", name = "A", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_86 = new Class106("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!h", name = "B", descriptor = "I")
	public static int anInt2495 = 0;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_87 = new Class217(93, -2);

	@OriginalMember(owner = "client!h", name = "D", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZII)I")
	public static int method2381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class208.anIntArray478[arg0 * 8192 / arg1] >> 1;
		return (arg3 * local16 >> 16) + ((65536 - local16) * arg2 >> 16);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	public static void method2382() {
		Static102.aClass21_181.method857();
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public static void method2383() {
		Static153.anInt3172 = 0;
		Static102.anInt7002 = 0;
		Static56.anInt1434 = 0;
		Static264.anInt5203 = 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ct;)V")
	public static void method2385(@OriginalArg(1) Class30 arg0) {
		Static9.aClass30_1 = arg0;
		Static9.aClass30_1.method1180(35);
	}
}
