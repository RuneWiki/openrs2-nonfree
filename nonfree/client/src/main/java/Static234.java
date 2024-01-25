import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!iba", name = "S", descriptor = "I")
	public static int anInt4239;

	@OriginalMember(owner = "client!iba", name = "qb", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "(I)I")
	public static int method3562() {
		return Static353.anInt6019 == 1 ? Static596.anInt9747 : 0;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIBI)Lclient!iaa;")
	public static Class6_Sub26 method3563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class6_Sub26 local5 = null;
		if (arg0 == 0) {
			local5 = Static268.method3981(Static377.aClass15_2, Static7.aClass289_2);
		}
		if (arg0 == 1) {
			local5 = Static268.method3981(Static377.aClass15_2, Static85.aClass289_27);
		}
		local5.aClass6_Sub23_Sub1_2.method8342(arg2 + Static534.anInt8753);
		local5.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
		local5.aClass6_Sub23_Sub1_2.method8405(arg1 + anInt4239);
		Static508.anInt9992 = arg1;
		Static291.aBoolean316 = false;
		Static566.anInt9418 = arg2;
		Static493.method7104();
		return local5;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method3564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg6 < 512 || arg2 < 512 || (Static491.anInt9856 - 2) * 512 < arg6 || arg2 > (Static393.anInt6574 - 2) * 512) {
			Static574.anIntArray632[0] = Static574.anIntArray632[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static284.method4118(arg6, arg0, arg2) - arg1;
		if (Static594.aBoolean693) {
			Static614.method8490(true);
		} else {
			Static185.aClass207_13.method8209(arg5, 0, 0);
			Static546.aClass132_13.method7517(Static185.aClass207_13);
		}
		if (Static487.aBoolean565) {
			Static546.aClass132_13.HA(arg6, local49, arg2, Static472.anInt8136, Static574.anIntArray632);
		} else {
			Static546.aClass132_13.da(arg6, local49, arg2, Static574.anIntArray632);
		}
		if (Static594.aBoolean693) {
			Static260.method8777();
		} else {
			Static185.aClass207_13.method8209(-arg5, 0, 0);
			Static546.aClass132_13.method7517(Static185.aClass207_13);
		}
	}
}
