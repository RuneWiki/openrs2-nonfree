import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "[S")
	public static short[] aShortArray5;

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "Lclient!ec;")
	public static Class46 aClass46_5 = new Class46(4);

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
	public static int anInt610 = 1;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)V")
	public static void method543() {
		if (Static209.aBoolean145) {
			Static268.aClass71_1 = null;
			Static286.aClass2_Sub3_Sub1_11 = null;
			Static209.aBoolean145 = false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(B)V")
	public static void method545() {
		@Pc(7) int local7 = Static221.anInt4607;
		@Pc(9) int local9 = Static243.anInt3779;
		@Pc(11) int local11 = Static297.anInt6219;
		@Pc(13) int local13 = Static63.anInt1431;
		if (Static60.aBoolean106) {
			Static94.method1758(local7, local9, local11, local13, 6116423);
			Static94.method1758(local7 + 1, local9 + 1, local11 - 2, 16, 0);
			Static94.method1756(local7 + 1, local9 + 18, local11 - 2, local13 + -19, 0);
		} else {
			Static160.method2788(local7, local9, local11, local13, 6116423);
			Static160.method2788(local7 + 1, local9 + 1, local11 - 2, 16, 0);
			Static160.method2782(local7 + 1, local9 + 18, local11 - 2, local13 + -19, 0);
		}
		Static153.aClass2_Sub3_Sub5_1.method3317(Static169.aString178, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(96) int local96 = Static86.anInt1911;
		@Pc(98) int local98 = Static238.anInt4852;
		for (@Pc(100) int local100 = 0; local100 < Static216.anInt4481; local100++) {
			@Pc(116) int local116 = (Static216.anInt4481 - local100 - 1) * 15 + local9 + 31;
			@Pc(118) int local118 = 16777215;
			if (local7 < local96 && local7 + local11 > local96 && local116 - 13 < local98 && local98 < local116 + 3) {
				local118 = 16776960;
			}
			Static153.aClass2_Sub3_Sub5_1.method3317(Static196.method3333(local100), local7 + 3, local116, local118, 0);
		}
		Static75.method1374(Static221.anInt4607, Static243.anInt3779, Static297.anInt6219, Static63.anInt1431);
	}
}
