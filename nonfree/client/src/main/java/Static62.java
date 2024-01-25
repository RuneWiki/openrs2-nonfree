import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static62 {

	@OriginalMember(owner = "client!cu", name = "K", descriptor = "Lclient!pi;")
	public static Class184 aClass184_58;

	@OriginalMember(owner = "client!cu", name = "M", descriptor = "Lclient!ta;")
	public static Class159 aClass159_1;

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_49 = new Class92(36, 12);

	@OriginalMember(owner = "client!cu", name = "H", descriptor = "Lclient!il;")
	public static final Class111 aClass111_1 = Static351.method4988();

	@OriginalMember(owner = "client!cu", name = "I", descriptor = "Lclient!pi;")
	public static Class184 aClass184_57 = null;

	@OriginalMember(owner = "client!cu", name = "L", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_53 = new Class175("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!cu", name = "N", descriptor = "I")
	public static int anInt1469 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!eo;I)I")
	public static int method1211(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1) {
		if (!Static56.method1160(arg1).method3485(arg0) && arg1.anObjectArray25 == null) {
			return -1;
		} else if (arg1.anIntArray192 == null || arg0 >= arg1.anIntArray192.length) {
			return -1;
		} else {
			return arg1.anIntArray192[arg0];
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIZIII)V")
	public static void method1213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static54.anInt1294 = arg5;
		Static243.anInt4634 = arg3;
		Static223.anInt6306 = arg4;
		Static267.anInt5000 = arg1;
		Static231.anInt4454 = arg0;
		if (arg2 && Static223.anInt6306 >= 100) {
			Static398.anInt6901 = Static243.anInt4634 * 128 + 64;
			Static80.anInt1722 = Static267.anInt5000 * 128 + 64;
			Static422.anInt7281 = Static124.method2209(Static124.anInt2688, Static398.anInt6901, Static80.anInt1722) - Static54.anInt1294;
		}
		Static107.anInt2382 = 2;
	}
}
