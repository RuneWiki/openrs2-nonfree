import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
	public static int anInt8290;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
	public static int anInt8292;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_88 = new Class46(57, 2);

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	public static int anInt8293 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([IIIII)V")
	public static void method7219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(7) int local7 = arg3 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (arg1 < local11) {
			@Pc(15) int local15 = arg1 + 1;
			arg0[local15] = arg2;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			arg1 = local45 + 1;
			arg0[arg1] = arg2;
		}
		while (arg1 < local7) {
			arg1++;
			arg0[arg1] = arg2;
		}
	}
}
