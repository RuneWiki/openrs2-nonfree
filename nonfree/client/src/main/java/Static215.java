import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Lclient!cs;")
	public static Class6_Sub2_Sub4 aClass6_Sub2_Sub4_2;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public static int anInt4208 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIZI)V")
	public static void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg1) {
			Static312.method5228(arg3, Static484.anIntArrayArray41[arg0], arg2, arg1);
		} else {
			Static312.method5228(arg3, Static484.anIntArrayArray41[arg0], arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!ao;I)V")
	public static void method3663(@OriginalArg(1) Class21 arg0, @OriginalArg(2) int arg1) {
		if (Static277.anInt5443 >= 50 || (arg0 == null || arg0.anIntArrayArray2 == null || arg0.anIntArrayArray2.length <= arg1 || arg0.anIntArrayArray2[arg1] == null)) {
			return;
		}
		@Pc(41) int local41 = arg0.anIntArrayArray2[arg1][0];
		@Pc(45) int local45 = local41 >> 8;
		@Pc(64) int local64;
		if (arg0.anIntArrayArray2[arg1].length > 1) {
			local64 = (int) ((double) arg0.anIntArrayArray2[arg1].length * Math.random());
			if (local64 > 0) {
				local45 = arg0.anIntArrayArray2[arg1][local64];
			}
		}
		@Pc(82) int local82 = local41 >> 5 & 0x7;
		local64 = 256;
		if (arg0.anIntArray18 != null && arg0.anIntArray19 != null) {
			local64 = Static134.method2186(arg0.anIntArray19[arg1], arg0.anIntArray18[arg1]);
		}
		if (arg0.aBoolean11) {
			Static4.method7049(local64, false, 0, local45, 255, local82);
		} else {
			Static513.method7613(local64, 255, local45, local82, 0);
		}
	}
}
