import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	public static int anInt1375;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_37 = new Class189("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "[S")
	public static short[] aShortArray20 = new short[256];

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
	public static int anInt1374 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public static void method1068() {
		Static248.method3735();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static382.aClass29Array3[local8].method751();
		}
		Static47.method862();
		Static235.method3584();
		System.gc();
	}
}
