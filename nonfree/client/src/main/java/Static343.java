import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5201(@OriginalArg(0) String arg0) {
		return Static621.aHashtable35.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[IIII)V")
	public static void method5202(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(5) int local5 = arg3 - 1;
		@Pc(9) int local9 = local5 - 7;
		while (arg0 < local9) {
			@Pc(12) int local12 = arg0 + 1;
			arg1[local12] = arg2;
			@Pc(17) int local17 = local12 + 1;
			arg1[local17] = arg2;
			@Pc(22) int local22 = local17 + 1;
			arg1[local22] = arg2;
			@Pc(27) int local27 = local22 + 1;
			arg1[local27] = arg2;
			@Pc(32) int local32 = local27 + 1;
			arg1[local32] = arg2;
			@Pc(37) int local37 = local32 + 1;
			arg1[local37] = arg2;
			@Pc(42) int local42 = local37 + 1;
			arg1[local42] = arg2;
			arg0 = local42 + 1;
			arg1[arg0] = arg2;
		}
		while (arg0 < local5) {
			arg0++;
			arg1[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
	public static void method5203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(7, (long) arg0);
		local9.method2438();
		local9.anInt2749 = arg1;
	}
}
