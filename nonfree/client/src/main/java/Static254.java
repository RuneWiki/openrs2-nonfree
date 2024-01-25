import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_171 = new Class137(35, 7);

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_133 = new Class151("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "[I")
	public static final int[] anIntArray218 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public static void method3257() {
		Static149.aClass167_100.method3390();
		Static325.aClass167_75.method3390();
		Static329.aClass167_76.method3390();
		Static416.aClass167_94.method3390();
		Static239.aClass167_61.method3390();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!se;I)I")
	public static int method3259(@OriginalArg(0) Class20_Sub3_Sub3_Sub2 arg0) {
		@Pc(8) Class246 local8 = arg0.aClass246_1;
		if (local8.anIntArray459 != null) {
			local8 = local8.method5255(Static364.aClass259_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt6823;
		@Pc(27) Class51 local27 = arg0.method4676();
		if (arg0.aBoolean502) {
			local23 = local8.anInt6846;
		} else if (arg0.anInt6037 == local27.anInt1321 || local27.anInt1322 == arg0.anInt6037 || arg0.anInt6037 == local27.anInt1310 || arg0.anInt6037 == local27.anInt1294) {
			local23 = local8.anInt6834;
		} else if (arg0.anInt6037 == local27.anInt1317 || arg0.anInt6037 == local27.anInt1303 || arg0.anInt6037 == local27.anInt1291 || local27.anInt1300 == arg0.anInt6037) {
			local23 = local8.anInt6836;
		}
		return local23;
	}
}
