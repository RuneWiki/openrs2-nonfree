import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
	public static int anInt2719;

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
	public static int anInt2727 = 2;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)Lclient!ks;")
	public static Class11_Sub4_Sub9 method2271(@OriginalArg(0) int arg0) {
		@Pc(12) Class11_Sub4_Sub9 local12 = (Class11_Sub4_Sub9) Static260.aClass142_11.method3874((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static52.aClass144_79.method3896(0, arg0);
		if (local22 == null || local22.length <= 1) {
			return null;
		} else {
			local12 = Static39.method581(local22);
			Static260.aClass142_11.method3870(local12, (long) arg0);
			return local12;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)I")
	public static int method2274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = 255 - arg1;
		@Pc(26) int local26 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | arg1 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return local26 + (((arg0 & 0xFF00) * local8 & 0xFF0000 | (arg0 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method2275(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static171.method2793(arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[I[III)V")
	public static void method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(24) int local24 = (arg3 + arg0) / 2;
		@Pc(26) int local26 = arg3;
		@Pc(30) int local30 = arg1[local24];
		arg1[local24] = arg1[arg0];
		arg1[arg0] = local30;
		@Pc(44) int local44 = arg2[local24];
		arg2[local24] = arg2[arg0];
		arg2[arg0] = local44;
		for (@Pc(56) int local56 = arg3; local56 < arg0; local56++) {
			if (arg1[local56] < local30 + (local56 & 0x1)) {
				@Pc(72) int local72 = arg1[local56];
				arg1[local56] = arg1[local26];
				arg1[local26] = local72;
				@Pc(86) int local86 = arg2[local56];
				arg2[local56] = arg2[local26];
				arg2[local26++] = local86;
			}
		}
		arg1[arg0] = arg1[local26];
		arg1[local26] = local30;
		arg2[arg0] = arg2[local26];
		arg2[local26] = local44;
		method2276(local26 - 1, arg1, arg2, arg3);
		method2276(arg0, arg1, arg2, local26 + 1);
	}
}
