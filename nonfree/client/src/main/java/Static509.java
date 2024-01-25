import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
	public static int anInt8273;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BII)Z")
	public static boolean method6874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static407.method5863(arg0, arg1) || Static380.method5566(arg1, arg0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([IIBIIIII)Z")
	public static boolean method6875(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 > Static365.anInt6275) {
			arg1 = Static365.anInt6275;
		}
		if (arg5 < 0) {
			arg5 = 0;
		}
		if (arg1 <= arg5) {
			return true;
		}
		@Pc(30) int local30 = arg1 - arg5 >> 2;
		arg3 += arg5 - 1;
		arg2 += arg5 * arg4;
		@Pc(58) int local58;
		@Pc(71) int local71;
		@Pc(60) int local60;
		if (Static468.anInt7786 == 1) {
			Static328.anInt5532 += local30;
			while (true) {
				local30--;
				if (local30 < 0) {
					local30 = arg1 - arg5 & 0x3;
					while (true) {
						local30--;
						if (local30 < 0) {
							return true;
						}
						arg3++;
						if (arg2 < arg0[arg3]) {
							arg0[arg3] = arg2;
						}
						arg2 += arg4;
					}
				}
				local58 = ~arg2;
				local60 = arg3 + 1;
				if (local58 > ~arg0[local60]) {
					arg0[local60] = arg2;
				}
				local71 = arg2 + arg4;
				local60++;
				if (arg0[local60] > local71) {
					arg0[local60] = local71;
				}
				local71 += arg4;
				local58 = ~local71;
				local60++;
				if (local58 > ~arg0[local60]) {
					arg0[local60] = local71;
				}
				local71 += arg4;
				arg3 = local60 + 1;
				if (arg0[arg3] > local71) {
					arg0[arg3] = local71;
				}
				arg2 = local71 + arg4;
			}
		} else {
			arg2 -= 15360;
			while (true) {
				local30--;
				if (local30 < 0) {
					local30 = arg1 - arg5 & 0x3;
					while (true) {
						local30--;
						if (local30 < 0) {
							return true;
						}
						arg3++;
						if (arg0[arg3] > arg2) {
							return false;
						}
						arg2 += arg4;
					}
				}
				local58 = ~arg2;
				local60 = arg3 + 1;
				if (local58 > ~arg0[local60]) {
					return false;
				}
				local71 = arg2 + arg4;
				local58 = ~local71;
				local60++;
				if (local58 > ~arg0[local60]) {
					return false;
				}
				local71 += arg4;
				local58 = ~local71;
				local60++;
				if (local58 > ~arg0[local60]) {
					return false;
				}
				local71 += arg4;
				local58 = ~local71;
				arg3 = local60 + 1;
				if (local58 > ~arg0[arg3]) {
					return false;
				}
				arg2 = local71 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z")
	public static boolean method6876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static134.method2625(arg1, arg0) || Static171.method3051(arg0, arg1);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBI)V")
	public static void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(6, arg0);
		local8.method7326();
		local8.anInt8802 = arg1;
	}
}
