import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_16 = new Class40("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_17 = new Class40(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "J")
	public static long aLong40 = 20000000L;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZLclient!p;)Z")
	public static boolean method1114(@OriginalArg(1) Interface10 arg0) {
		@Pc(15) Class283 local15 = Static453.aClass88_3.method2294(arg0.method6868());
		if (local15.anInt8166 == -1) {
			return true;
		} else {
			@Pc(28) Class260 local28 = Static196.aClass274_1.method6382(local15.anInt8166);
			return local28.anInt7677 == -1 ? true : local28.method6212();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIILclient!qa;)V")
	public static void method1118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2) {
		Static206.aClass62_24 = arg2;
		Static227.aClass227ArrayArray1 = new Class227[arg0][arg1];
		if (Static194.anIntArray273 != null) {
			Static465.aClass92_4 = Static214.method3472(Static194.anIntArray273[1], Static194.anIntArray273[2], Static194.anIntArray273[4], Static194.anIntArray273[0], Static194.anIntArray273[3], Static194.anIntArray273[5]);
		}
		Static281.aClass227_1 = new Class227();
		Static442.method6257();
	}
}
