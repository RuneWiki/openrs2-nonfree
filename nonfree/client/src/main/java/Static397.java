import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
	public static int anInt6799;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "F")
	public static float aFloat147;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "[Lclient!gp;")
	public static Class9_Sub6[] aClass9_Sub6Array1;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
	public static int anInt6803;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIII)V")
	public static void method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg2 < arg0) {
			for (local6 = arg2; local6 < arg0; local6++) {
				Static176.anIntArrayArray28[local6][arg3] = arg1;
			}
		} else {
			for (local6 = arg0; local6 < arg2; local6++) {
				Static176.anIntArrayArray28[local6][arg3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	public static void method5822() {
		if (Static268.aClass366_1 != null) {
			Static268.aClass366_1.method7800();
		}
		if (Static516.aThread7 == null) {
			return;
		}
		while (true) {
			try {
				Static516.aThread7.join();
				return;
			} catch (@Pc(22) InterruptedException local22) {
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)I")
	public static int method5823(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
