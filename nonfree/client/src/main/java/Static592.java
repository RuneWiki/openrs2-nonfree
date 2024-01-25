import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
	public static int anInt9706;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
	public static int anInt9709;

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "Lclient!la;")
	public static Class196 aClass196_123;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "[I")
	public static final int[] anIntArray630 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIBI)V")
	public static void method8324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static599.method8387(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(25) int local25 = arg1;
		@Pc(28) int local28 = -arg1;
		@Pc(30) int local30 = local15;
		@Pc(33) int local33 = -local15;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(41) int[] local41 = Static460.anIntArrayArray53[arg4];
		@Pc(46) int local46 = arg5 - local15;
		@Pc(50) int local50 = local15 + arg5;
		Static611.method8472(local46, arg5 - arg1, local41, arg2);
		Static611.method8472(local50, local46, local41, arg0);
		Static611.method8472(arg1 + arg5, local50, local41, arg2);
		while (local25 > local10) {
			local35 += 2;
			local37 += 2;
			local33 += local37;
			local28 += local35;
			if (local33 >= 0 && local30 >= 1) {
				Static233.anIntArray229[local30] = local10;
				local30--;
				local33 -= local30 << 1;
			}
			local10++;
			@Pc(126) int[] local126;
			@Pc(133) int[] local133;
			@Pc(137) int local137;
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(155) int local155;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				if (local15 > local25) {
					local126 = Static460.anIntArrayArray53[local25 + arg4];
					local133 = Static460.anIntArrayArray53[arg4 - local25];
					local137 = Static233.anIntArray229[local25];
					local141 = arg5 + local10;
					local146 = arg5 - local10;
					local150 = local137 + arg5;
					local155 = arg5 - local137;
					Static611.method8472(local155, local146, local126, arg2);
					Static611.method8472(local150, local155, local126, arg0);
					Static611.method8472(local141, local150, local126, arg2);
					Static611.method8472(local155, local146, local133, arg2);
					Static611.method8472(local150, local155, local133, arg0);
					Static611.method8472(local141, local150, local133, arg2);
				} else {
					local126 = Static460.anIntArrayArray53[local25 + arg4];
					local133 = Static460.anIntArrayArray53[arg4 - local25];
					local137 = local10 + arg5;
					local141 = arg5 - local10;
					Static611.method8472(local137, local141, local126, arg2);
					Static611.method8472(local137, local141, local133, arg2);
				}
			}
			local126 = Static460.anIntArrayArray53[arg4 + local10];
			local133 = Static460.anIntArrayArray53[arg4 - local10];
			local137 = arg5 + local25;
			local141 = arg5 - local25;
			if (local10 >= local15) {
				Static611.method8472(local137, local141, local126, arg2);
				Static611.method8472(local137, local141, local133, arg2);
			} else {
				local146 = local30 >= local10 ? local30 : Static233.anIntArray229[local10];
				local150 = local146 + arg5;
				local155 = arg5 - local146;
				Static611.method8472(local155, local141, local126, arg2);
				Static611.method8472(local150, local155, local126, arg0);
				Static611.method8472(local137, local150, local126, arg2);
				Static611.method8472(local155, local141, local133, arg2);
				Static611.method8472(local150, local155, local133, arg0);
				Static611.method8472(local137, local150, local133, arg2);
			}
		}
	}
}
