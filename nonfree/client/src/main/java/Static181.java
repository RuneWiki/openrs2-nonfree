import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "[Lclient!mb;")
	public static Class234[] aClass234Array1;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
	public static final int[] anIntArray235 = new int[13];

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[S)[S")
	public static short[] method2980(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static689.method8060(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ij;IILclient!ha;II)V")
	public static void method2981(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class173 local9 = Static453.aClass116_2.method2727(arg0.anInt4729);
		if (local9.anInt4590 == -1) {
			return;
		}
		if (arg0.aBoolean379) {
			@Pc(22) int local22 = arg1 + arg0.anInt4773;
			arg1 = local22 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(38) Class102 local38 = local9.method3929(arg3, arg0.aBoolean389, arg1);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg0.anInt4774;
		@Pc(47) int local47 = arg0.anInt4746;
		if ((arg1 & 0x1) == 1) {
			local47 = arg0.anInt4774;
			local44 = arg0.anInt4746;
		}
		@Pc(61) int local61 = local38.method6951();
		@Pc(64) int local64 = local38.method6958();
		if (local9.aBoolean362) {
			local61 = local44 * 4;
			local64 = local47 * 4;
		}
		if (local9.anInt4593 == 0) {
			local38.method6947(arg4, arg2 - (local47 - 1) * 4, local61, local64);
		} else {
			local38.method6970(arg4, arg2 - (local47 - 1) * 4, local61, local64, 0, local9.anInt4593 | 0xFF000000, 1);
		}
	}
}
