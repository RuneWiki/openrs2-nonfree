import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public static int anInt3335;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "J")
	public static long aLong93;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_51 = new Class15("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public static int anInt3339 = 0;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public static int anInt3346 = -1;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ob;B)V")
	public static void method2530(@OriginalArg(0) Class4_Sub30 arg0) {
		if (!Static339.aBoolean390) {
			arg0.method6059();
			Static351.anInt5841--;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z")
	public static boolean method2532(@OriginalArg(1) int arg0) {
		Static249.aBoolean536 = true;
		Static318.anInt5169 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
