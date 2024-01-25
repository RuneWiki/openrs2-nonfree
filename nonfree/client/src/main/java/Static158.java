import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "Lclient!kr;")
	public static final Class147 aClass147_1 = new Class147(128);

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
	public static void method2582(@OriginalArg(0) int arg0) {
		Static316.method4369();
		@Pc(19) int local19 = Static191.aClass151_1.method3406(arg0).anInt7124;
		if (local19 == 0) {
			return;
		}
		@Pc(30) int local30 = Static344.aClass108_1.anIntArray273[arg0];
		if (local19 == 5) {
			Class64_Sub1.lb = local30;
		}
		if (local19 == 6) {
			Static150.anInt4211 = local30;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!em;B)I")
	public static int method2583(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1) {
		if (!Static47.method787(arg1).method5399(arg0) && arg1.anObjectArray15 == null) {
			return -1;
		} else if (arg1.anIntArray162 == null || arg1.anIntArray162.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray162[arg0];
		}
	}
}
