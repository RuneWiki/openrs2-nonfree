import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
	public static int anInt2919;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "Lclient!vt;")
	public static Class263 aClass263_3;

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	public static int anInt2920;

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
	public static int anInt2921;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_60 = new Class231("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
	public static int anInt2922 = 503;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
	public static void method2392() {
		Static428.anInt7267 = 0;
		@Pc(12) int local12 = (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >> 7) + Static386.anInt7205;
		@Pc(28) int local28 = (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >> 7) + Static153.anInt2798;
		if (local12 >= 3053 && local12 <= 3156 && local28 >= 3056 && local28 <= 3136) {
			Static428.anInt7267 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local28 >= 9492 && local28 <= 9535) {
			Static428.anInt7267 = 1;
		}
		if (Static428.anInt7267 == 1 && local12 >= 3139 && local12 <= 3199 && local28 >= 3008 && local28 <= 3062) {
			Static428.anInt7267 = 0;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!gi;)V")
	public static void method2393(@OriginalArg(1) Class93 arg0) {
		if (arg0.anInt2494 == 5 && arg0.anInt2488 != -1) {
			Static359.method5045(arg0, Static257.aClass75_8);
		}
	}
}
