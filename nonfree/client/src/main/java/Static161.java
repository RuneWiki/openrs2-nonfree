import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_45 = new Class25(69, 0);

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_2 = new Class106(10, 2, 2, 0);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[S)[S")
	public static short[] method2655(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static459.method5351(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!qq;Lclient!ps;III)V")
	public static void method2658(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class189 local12;
		if (arg3 < Static401.anInt6621) {
			local12 = Static30.aClass189ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass3_Sub5_1 != null && local12.aClass3_Sub5_1.method5791()) {
				arg1.method5794(0, arg0, local12.aClass3_Sub5_1, true, 0, Static22.anInt397);
			}
		}
		if (arg4 < Static401.anInt6621) {
			local12 = Static30.aClass189ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass3_Sub5_1 != null && local12.aClass3_Sub5_1.method5791()) {
				arg1.method5794(0, arg0, local12.aClass3_Sub5_1, true, Static22.anInt397, 0);
			}
		}
		if (arg3 < Static401.anInt6621 && arg4 < Static364.anInt6134) {
			local12 = Static30.aClass189ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass3_Sub5_1 != null && local12.aClass3_Sub5_1.method5791()) {
				arg1.method5794(0, arg0, local12.aClass3_Sub5_1, true, Static22.anInt397, Static22.anInt397);
			}
		}
		if (arg3 < Static401.anInt6621 && arg4 > 0) {
			local12 = Static30.aClass189ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass3_Sub5_1 != null && local12.aClass3_Sub5_1.method5791()) {
				arg1.method5794(0, arg0, local12.aClass3_Sub5_1, true, -Static22.anInt397, Static22.anInt397);
			}
		}
	}
}
