import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!uj;")
	public static Class366 aClass366_1;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ[III)V")
	public static void method4038(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(10) int local10 = arg0 - 1;
		@Pc(14) int local14 = local10 - 7;
		while (arg3 < local14) {
			@Pc(17) int local17 = arg3 + 1;
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
			@Pc(47) int local47 = local42 + 1;
			arg1[local47] = arg2;
			arg3 = local47 + 1;
			arg1[arg3] = arg2;
		}
		while (arg3 < local10) {
			arg3++;
			arg1[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!nh;IIII)V")
	public static void method4039(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub3_Sub3_Sub3 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static552.method7981(arg3, arg1.anInt11178, arg2, 0, arg1.anInt11184, arg1.aByte146, arg0);
	}
}
