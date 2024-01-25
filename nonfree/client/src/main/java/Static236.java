import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!li", name = "y", descriptor = "I")
	public static int anInt4262;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_69 = new Class242(78, -1);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)V")
	public static void method3366(@OriginalArg(1) int arg0) {
		Static388.anInt6818 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!oi;Lclient!za;I)V")
	public static void method3367(@OriginalArg(0) Class185 arg0, @OriginalArg(1) Class117 arg1) {
		if (Static87.aBoolean140) {
			return;
		}
		arg1.t(0);
		Static42.aClass85_5 = arg1.method5707(Static467.method893(arg0, Static249.anInt4442));
		Static42.aClass85_5.method5406((Static192.anInt3532 - Static42.aClass85_5.RA()) / 2, (Static40.anInt597 - Static42.aClass85_5.Q()) / 2);
		Static40.aClass85_1 = arg1.method5707(Static467.method893(arg0, Static28.anInt421));
		Static40.aClass85_1.method5406((Static192.anInt3532 - Static40.aClass85_1.RA()) / 2, 18);
		Static87.aBoolean140 = true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!za;Lclient!ge;III)V")
	public static void method3368(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class216 local12;
		if (arg3 < Static174.anInt2873) {
			local12 = Static259.aClass216ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method5183()) {
				arg1.method5179(arg0, 0, local12.aClass11_Sub2_2, Static383.anInt6136, true, 0);
			}
		}
		if (arg4 < Static174.anInt2873) {
			local12 = Static259.aClass216ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method5183()) {
				arg1.method5179(arg0, 0, local12.aClass11_Sub2_2, 0, true, Static383.anInt6136);
			}
		}
		if (arg3 < Static174.anInt2873 && arg4 < Static325.anInt5351) {
			local12 = Static259.aClass216ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method5183()) {
				arg1.method5179(arg0, 0, local12.aClass11_Sub2_2, Static383.anInt6136, true, Static383.anInt6136);
			}
		}
		if (arg3 < Static174.anInt2873 && arg4 > 0) {
			local12 = Static259.aClass216ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass11_Sub2_2 != null && local12.aClass11_Sub2_2.method5183()) {
				arg1.method5179(arg0, 0, local12.aClass11_Sub2_2, Static383.anInt6136, true, -Static383.anInt6136);
			}
		}
	}
}
