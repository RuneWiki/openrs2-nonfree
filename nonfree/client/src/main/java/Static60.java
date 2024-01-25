import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "Lclient!fia;")
	public static final Class117 aClass117_4 = new Class117(15, 0, 1, 0);

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
	public static final int anInt1448 = -1;

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
	public static int anInt1449 = 0;

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "Z")
	public static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZ)V")
	public static void method1320(@OriginalArg(0) int arg0) {
		Static214.method3548();
		@Pc(11) int local11 = Static47.aClass364_1.method8544(arg0).anInt5082;
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static382.aClass282_1.anIntArray508[arg0];
		if (local11 == 6) {
			Static161.anInt3273 = local19;
		}
		if (local11 == 5) {
			Static193.anInt10392 = local19;
		}
	}
}
