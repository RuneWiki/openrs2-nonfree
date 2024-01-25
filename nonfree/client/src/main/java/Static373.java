import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "[I")
	public static int[] anIntArray420;

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "Lclient!vn;")
	public static Class190 aClass190_2;

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
	public static int anInt6851 = 0;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)V")
	public static void method5885(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(4, arg0);
		local8.method3722();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(III[IIIII)Z")
	public static boolean method5886(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > Static497.anInt8615) {
			arg5 = Static497.anInt8615;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg5 <= arg0) {
			return true;
		}
		arg3 += arg4 * arg0;
		arg1 += arg0 - 1;
		@Pc(42) int local42 = arg5 - arg0 >> 2;
		@Pc(55) int local55;
		@Pc(67) int local67;
		if (Static600.anInt10018 == 1) {
			Static113.anInt2246 += local42;
			while (true) {
				local42--;
				if (local42 < 0) {
					local42 = arg5 - arg0 & 0x3;
					while (true) {
						local42--;
						if (local42 < 0) {
							return true;
						}
						arg1++;
						if (arg2[arg1] > arg3) {
							arg2[arg1] = arg3;
						}
						arg3 += arg4;
					}
				}
				local55 = arg1 + 1;
				if (arg2[local55] > arg3) {
					arg2[local55] = arg3;
				}
				local67 = arg3 + arg4;
				local55++;
				if (local67 < arg2[local55]) {
					arg2[local55] = local67;
				}
				local67 += arg4;
				local55++;
				if (arg2[local55] > local67) {
					arg2[local55] = local67;
				}
				local67 += arg4;
				arg1 = local55 + 1;
				if (local67 < arg2[arg1]) {
					arg2[arg1] = local67;
				}
				arg3 = local67 + arg4;
			}
		} else {
			arg3 -= 38400;
			while (true) {
				local42--;
				if (local42 < 0) {
					local42 = arg5 - arg0 & 0x3;
					while (true) {
						local42--;
						if (local42 < 0) {
							return true;
						}
						arg1++;
						if (arg2[arg1] > arg3) {
							return false;
						}
						arg3 += arg4;
					}
				}
				local55 = arg1 + 1;
				if (arg2[local55] > arg3) {
					return false;
				}
				local67 = arg3 + arg4;
				@Pc(169) int local169 = ~local67;
				local55++;
				if (local169 > ~arg2[local55]) {
					return false;
				}
				local67 += arg4;
				local169 = ~local67;
				local55++;
				if (local169 > ~arg2[local55]) {
					return false;
				}
				local67 += arg4;
				arg1 = local55 + 1;
				if (arg2[arg1] > local67) {
					return false;
				}
				arg3 = local67 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
	public static void method5888() {
		Static591.method8326();
		Static389.aBoolean497 = false;
	}
}
