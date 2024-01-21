import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!u", name = "g", descriptor = "[Lclient!di;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!af;")
	public static final Class5 aClass5_57 = new Class5(64);

	@OriginalMember(owner = "client!u", name = "h", descriptor = "[J")
	public static final long[] aLongArray9 = new long[500];

	@OriginalMember(owner = "client!u", name = "i", descriptor = "[I")
	public static final int[] anIntArray476 = new int[25];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIII)V")
	public static void method2826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		Static46.method726(arg2 - arg1, arg3, Static96.anIntArrayArray27[arg4], arg1 + arg2);
		@Pc(23) int local23 = arg1 * arg1;
		@Pc(25) int local25 = arg0;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local29 << 1;
		@Pc(37) int local37 = local23 << 1;
		@Pc(41) int local41 = arg0 << 1;
		@Pc(50) int local50 = local29 - (local41 - 1) * local37;
		@Pc(59) int local59 = local33 + (1 - local41) * local23;
		@Pc(63) int local63 = local23 << 2;
		@Pc(71) int local71 = ((arg0 << 1) - 3) * local37;
		@Pc(79) int local79 = local33 * 3;
		@Pc(85) int local85 = (arg0 - 1) * local63;
		@Pc(89) int local89 = local29 << 2;
		@Pc(95) int local95 = local89;
		while (local25 > 0) {
			if (local59 < 0) {
				while (local59 < 0) {
					local50 += local95;
					local95 += local89;
					local59 += local79;
					local79 += local89;
					local3++;
				}
			}
			if (local50 < 0) {
				local3++;
				local59 += local79;
				local79 += local89;
				local50 += local95;
				local95 += local89;
			}
			local59 += -local85;
			local50 += -local71;
			local25--;
			@Pc(161) int local161 = arg4 - local25;
			@Pc(166) int local166 = arg2 + local3;
			@Pc(171) int local171 = arg2 - local3;
			@Pc(175) int local175 = arg4 + local25;
			Static46.method726(local171, arg3, Static96.anIntArrayArray27[local161], local166);
			Static46.method726(local171, arg3, Static96.anIntArrayArray27[local175], local166);
			local71 -= local63;
			local85 -= local63;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2827(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local6];
		Static200.method1179(arg0, 0, local16, 0, local6);
		return local16;
	}
}
