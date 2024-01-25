import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "Lclient!bc;")
	public static final Class25 aClass25_32 = new Class25(32);

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
	public static int anInt8255 = 0;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB[III)V")
	public static void method6794(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(6) int local6 = arg0 - 1;
		@Pc(9) int local9 = local6 - 7;
		while (arg2 < local9) {
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
		while (arg2 < local6) {
			arg2++;
			arg1[arg2] = arg3;
		}
	}
}
