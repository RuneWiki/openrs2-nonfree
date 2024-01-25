import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!tda", name = "W", descriptor = "I")
	public static int anInt9848;

	@OriginalMember(owner = "client!tda", name = "Y", descriptor = "I")
	public static int anInt9850;

	@OriginalMember(owner = "client!tda", name = "P", descriptor = "Lclient!vd;")
	public static final Class370 aClass370_1 = new Class370();

	@OriginalMember(owner = "client!tda", name = "R", descriptor = "I")
	public static volatile int anInt9844 = -1;

	@OriginalMember(owner = "client!tda", name = "V", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_58 = new Class22(64);

	@OriginalMember(owner = "client!tda", name = "X", descriptor = "I")
	public static int anInt9849 = 0;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(II[III)V")
	public static void method8614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg0--;
		@Pc(8) int local8 = arg1 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg0 < local11) {
			@Pc(15) int local15 = arg0 + 1;
			arg2[local15] = arg3;
			@Pc(20) int local20 = local15 + 1;
			arg2[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg3;
			arg0 = local45 + 1;
			arg2[arg0] = arg3;
		}
		while (arg0 < local8) {
			arg0++;
			arg2[arg0] = arg3;
		}
	}
}
