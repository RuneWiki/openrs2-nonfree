import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_1 = new Class326(260);

	@OriginalMember(owner = "client!af", name = "l", descriptor = "Z")
	public static boolean aBoolean10 = true;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "[S")
	public static short[] aShortArray5 = new short[256];

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	public static void method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class293 local28 = Static118.aClass293ArrayArrayArray14[local9][arg0][arg1] = Static118.aClass293ArrayArrayArray14[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class285 local33 = local28.aClass285_6; local33 != null; local33 = local33.aClass285_5) {
					@Pc(37) Class20_Sub2_Sub4 local37 = local33.aClass20_Sub2_Sub4_1;
					if (local37.aShort100 == arg0 && local37.aShort97 == arg1) {
						local37.aByte116--;
					}
				}
				if (local28.aClass20_Sub2_Sub3_1 != null) {
					local28.aClass20_Sub2_Sub3_1.aByte116--;
				}
				if (local28.aClass20_Sub2_Sub2_2 != null) {
					local28.aClass20_Sub2_Sub2_2.aByte116--;
				}
				if (local28.aClass20_Sub2_Sub2_1 != null) {
					local28.aClass20_Sub2_Sub2_1.aByte116--;
				}
				if (local28.aClass20_Sub2_Sub1_1 != null) {
					local28.aClass20_Sub2_Sub1_1.aByte116--;
				}
				if (local28.aClass20_Sub2_Sub1_2 != null) {
					local28.aClass20_Sub2_Sub1_2.aByte116--;
				}
			}
		}
		if (Static118.aClass293ArrayArrayArray14[0][arg0][arg1] == null) {
			Static118.aClass293ArrayArrayArray14[0][arg0][arg1] = new Class293(0);
			Static118.aClass293ArrayArrayArray14[0][arg0][arg1].aByte100 = 1;
		}
		Static118.aClass293ArrayArrayArray14[0][arg0][arg1].aClass293_1 = local7;
		Static118.aClass293ArrayArrayArray14[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(II)Lclient!rb;")
	public static Class276 method206(@OriginalArg(0) int arg0) {
		@Pc(10) Class276[] local10 = Static258.method4055();
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class276 local18 = local10[local12];
			if (arg0 == local18.anInt7744) {
				return local18;
			}
		}
		return null;
	}
}
