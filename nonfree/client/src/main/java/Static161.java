import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
	public static int anInt3239 = 0;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
	public static int anInt3241 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIZI)V")
	public static void method2673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static165.anInt3313 <= arg5 && arg0 <= Static152.anInt3132 && arg3 >= Static172.anInt3442 && arg4 <= Static324.anInt5590) {
			if (arg2 == 1) {
				Static122.method2099(arg5, arg4, arg0, arg1, arg3);
			} else {
				Static251.method5358(arg0, arg2, arg4, arg1, arg3, arg5);
			}
		} else if (arg2 == 1) {
			Static207.method3184(arg4, arg1, arg0, arg5, arg3);
		} else {
			Static127.method2264(arg3, arg5, arg2, arg0, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "([I[[BIB[[B[BI[I)I")
	public static int method2675(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg5];
		@Pc(16) int local16 = local9 + arg0[arg5];
		@Pc(20) int local20 = arg6[arg2];
		@Pc(26) int local26 = arg0[arg2] + local20;
		@Pc(28) int local28 = local9;
		if (local9 < local20) {
			local28 = local20;
		}
		@Pc(39) int local39 = local16;
		if (local16 > local26) {
			local39 = local26;
		}
		@Pc(54) int local54 = arg4[arg5] & 0xFF;
		if ((arg4[arg2] & 0xFF) < local54) {
			local54 = arg4[arg2] & 0xFF;
		}
		@Pc(75) byte[] local75 = arg3[arg5];
		@Pc(79) byte[] local79 = arg1[arg2];
		@Pc(84) int local84 = local28 - local9;
		@Pc(89) int local89 = local28 - local20;
		for (@Pc(91) int local91 = local28; local91 < local39; local91++) {
			@Pc(104) int local104 = local75[local84++] + local79[local89++];
			if (local104 < local54) {
				local54 = local104;
			}
		}
		return -local54;
	}
}
