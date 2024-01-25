import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	public static int anInt7908 = -1;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray79 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!qe;I)I")
	public static int method6532(@OriginalArg(0) Class6_Sub14_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method6052(2);
		@Pc(22) int local22;
		if (local15 == 0) {
			local22 = 0;
		} else if (local15 == 1) {
			local22 = arg0.method6052(5);
		} else if (local15 == 2) {
			local22 = arg0.method6052(8);
		} else {
			local22 = arg0.method6052(11);
		}
		return local22;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZI[I)V")
	public static void method6536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1--;
		@Pc(13) int local13 = arg0 - 1;
		@Pc(16) int local16 = local13 - 7;
		while (arg1 < local16) {
			@Pc(20) int local20 = arg1 + 1;
			arg3[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg3[local50] = arg2;
			arg1 = local50 + 1;
			arg3[arg1] = arg2;
		}
		while (local13 > arg1) {
			arg1++;
			arg3[arg1] = arg2;
		}
	}
}
