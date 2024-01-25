import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
	public static int anInt6809;

	@OriginalMember(owner = "client!nq", name = "G", descriptor = "[Lclient!mj;")
	public static final Interface13[] anInterface13Array1 = new Interface13[128];

	@OriginalMember(owner = "client!nq", name = "N", descriptor = "[I")
	public static final int[] anIntArray481 = new int[8];

	@OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
	public static int anInt6817 = -1;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	public static void method5744() {
		if (!Static25.aBoolean80) {
			return;
		}
		@Pc(16) Class93 local16 = Static100.method2145(Static150.anInt7378, Static244.anInt4934);
		if (local16 != null && local16.anObjectArray20 != null) {
			@Pc(25) Class6_Sub38 local25 = new Class6_Sub38();
			local25.anObjectArray36 = local16.anObjectArray20;
			local25.aClass93_14 = local16;
			Static89.method1979(local25);
		}
		Static25.aBoolean80 = false;
		anInt6817 = -1;
		Static530.anInt9191 = -1;
		if (local16 != null) {
			Static468.method7221(local16);
		}
	}
}
