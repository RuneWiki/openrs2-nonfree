import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "[I")
	public static int[] anIntArray592;

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "(I)Lclient!te;")
	public static Class3_Sub33_Sub3 method7004() {
		return Static708.aClass3_Sub33_Sub3_4;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
	public static void method7009() {
		if (Static653.anInterface24Array1 == null) {
			return;
		}
		@Pc(9) Interface24[] local9 = Static653.anInterface24Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(17) Interface24 local17 = local9[local11];
			local17.method7123();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZIII)I")
	public static int method7011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(28) int local28 = arg0 / arg2;
		@Pc(34) int local34 = arg2 - 1 & arg0;
		@Pc(39) int local39 = Static207.method3115(local28, local7);
		@Pc(46) int local46 = Static207.method3115(local28, local7 + 1);
		@Pc(53) int local53 = Static207.method3115(local28 + 1, local7);
		@Pc(62) int local62 = Static207.method3115(local28 + 1, local7 + 1);
		@Pc(69) int local69 = Static257.method3551(local39, arg2, local46, local13);
		@Pc(76) int local76 = Static257.method3551(local53, arg2, local62, local13);
		return Static257.method3551(local69, arg2, local76, local34);
	}
}
