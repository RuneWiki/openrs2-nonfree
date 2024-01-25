import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!lv", name = "Q", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_84 = new Class45("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!lv", name = "W", descriptor = "I")
	public static int anInt5493 = 0;

	@OriginalMember(owner = "client!lv", name = "X", descriptor = "Z")
	public static boolean aBoolean413 = false;

	@OriginalMember(owner = "client!lv", name = "Y", descriptor = "I")
	public static int anInt5494 = 0;

	@OriginalMember(owner = "client!lv", name = "Z", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_274 = new Class305(10, 7);

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "(B)V")
	public static void method5034() {
		if (Static328.anInt6167 == -1) {
			return;
		}
		@Pc(16) int local16 = Static10.aClass99_1.method6618();
		@Pc(20) int local20 = Static10.aClass99_1.method6619();
		@Pc(25) Class1_Sub32 local25 = (Class1_Sub32) Static77.aClass295_9.method7543();
		if (local25 != null) {
			local16 = local25.method5772();
			local20 = local25.method5774();
		}
		Static303.method5350(Static508.anInt8910, 0, 0, local20, local16, Static328.anInt6167, Static70.anInt1753, 0, 0);
		if (Static267.aClass91_9 != null) {
			Static189.method3655(local16, local20);
		}
	}
}
