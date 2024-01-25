import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
	public static int anInt4368 = 0;

	@OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
	public static int anInt4385 = 0;

	@OriginalMember(owner = "client!lu", name = "L", descriptor = "I")
	public static int anInt4390 = 0;

	@OriginalMember(owner = "client!lu", name = "Q", descriptor = "[I")
	public static final int[] anIntArray357 = new int[250];

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	public static void method3307() {
		if (Static159.aString34.toLowerCase().indexOf("microsoft") != -1) {
			Static190.anIntArray303[187] = 27;
			Static190.anIntArray303[188] = 71;
			Static190.anIntArray303[220] = 74;
			Static190.anIntArray303[186] = 57;
			Static190.anIntArray303[223] = 28;
			Static190.anIntArray303[190] = 72;
			Static190.anIntArray303[222] = 59;
			Static190.anIntArray303[219] = 42;
			Static190.anIntArray303[192] = 58;
			Static190.anIntArray303[191] = 73;
			Static190.anIntArray303[189] = 26;
			Static190.anIntArray303[221] = 43;
			return;
		}
		Static190.anIntArray303[61] = 27;
		Static190.anIntArray303[59] = 57;
		Static190.anIntArray303[47] = 73;
		Static190.anIntArray303[45] = 26;
		Static190.anIntArray303[92] = 74;
		Static190.anIntArray303[93] = 43;
		Static190.anIntArray303[91] = 42;
		if (Static159.aMethod1 == null) {
			Static190.anIntArray303[222] = 59;
			Static190.anIntArray303[192] = 58;
		} else {
			Static190.anIntArray303[520] = 59;
			Static190.anIntArray303[222] = 58;
			Static190.anIntArray303[192] = 28;
		}
		Static190.anIntArray303[46] = 72;
		Static190.anIntArray303[44] = 71;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IB)V")
	public static void method3308(@OriginalArg(0) int arg0) {
		if (!Static126.aClass67_Sub1_1.aBoolean393) {
			arg0 = -1;
		}
		if (arg0 == Static446.anInt7427) {
			return;
		}
		if (arg0 != -1) {
			@Pc(20) Class52 local20 = Static232.aClass138_2.method2988(arg0);
			@Pc(24) Class205 local24 = local20.method1394();
			if (local24 == null) {
				arg0 = -1;
			} else {
				Static89.aClass114_3.method2358(local24.method4780(), new Point(local20.anInt1841, local20.anInt1842), Static248.aCanvas5, local24.method4793(), local24.method4779());
				Static446.anInt7427 = arg0;
			}
		}
		if (arg0 == -1 && Static446.anInt7427 != -1) {
			Static89.aClass114_3.method2358(null, new Point(), Static248.aCanvas5, -1, -1);
			Static446.anInt7427 = -1;
		}
	}
}
