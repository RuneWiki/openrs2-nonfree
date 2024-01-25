import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lclient!ga;")
	public static Class111 aClass111_52;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "[I")
	public static final int[] anIntArray287 = new int[13];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
	public static void method3999(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static374.method5445(5, arg0);
		local12.method488();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[IIII)V")
	public static void method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(8) int local8 = arg0 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (local11 > arg2) {
			@Pc(15) int local15 = arg2 + 1;
			arg1[local15] = arg3;
			@Pc(20) int local20 = local15 + 1;
			arg1[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg1[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg1[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg1[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg1[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg1[local45] = arg3;
			arg2 = local45 + 1;
			arg1[arg2] = arg3;
		}
		while (local8 > arg2) {
			arg2++;
			arg1[arg2] = arg3;
		}
	}
}
