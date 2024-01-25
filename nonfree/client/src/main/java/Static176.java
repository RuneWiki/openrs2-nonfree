import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
	public static int anInt3129 = -1;

	@OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
	public static int anInt3132 = -1;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIBI)Z")
	public static boolean method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static355.aClass113_5.method8448(arg1, arg0, arg2, Static75.anIntArray109);
		@Pc(13) int local13 = Static75.anIntArray109[2];
		if (local13 < 50) {
			return false;
		} else {
			Static75.anIntArray109[2] = local13;
			Static75.anIntArray109[0] = Static411.anInt7153 + Static322.anInt5454 * Static75.anIntArray109[0] / local13;
			Static75.anIntArray109[1] = Static34.anInt568 * Static75.anIntArray109[1] / local13 + Static26.anInt349;
			return true;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!bg;II)Z")
	public static boolean method2704(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		Static355.aClass113_5.method8448(arg0.anIntArray62[arg1], arg0.anIntArray60[arg1], arg0.anIntArray61[arg1], Static75.anIntArray109);
		@Pc(22) int local22 = Static75.anIntArray109[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray19[arg1] = (short) (Static411.anInt7153 + Static75.anIntArray109[0] * Static322.anInt5454 / local22);
			arg0.aShortArray21[arg1] = (short) (Static26.anInt349 + Static34.anInt568 * Static75.anIntArray109[1] / local22);
			arg0.aShortArray20[arg1] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(II)V")
	public static void method2706(@OriginalArg(1) int arg0) {
		Static438.anInt10554 = arg0;
		Static461.aClass87_191.method1801();
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BLclient!la;)V")
	public static void method2707(@OriginalArg(1) Class207 arg0) {
		Static130.anInt2325 = 0;
		Static634.anInt10545 = 0;
		Static340.aClass99_6 = new Class99();
		Static521.aClass4_Sub1_Sub1_Sub1Array2 = new Class4_Sub1_Sub1_Sub1[1024];
		Static318.aClass4_Sub4Array1 = new Class4_Sub4[Static592.anIntArray562[Static359.anInt6012] + 1];
		Static117.anInt2173 = 0;
		Static8.anInt6060 = 0;
		Static461.method6849(arg0);
		Static558.method8115(arg0);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)I")
	public static int method2708() {
		return Static577.anInt9742;
	}
}
