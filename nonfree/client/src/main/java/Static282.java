import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "Z")
	public static boolean aBoolean321;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "[Lclient!ug;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array17;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	public static int anInt6020 = -1;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Lclient!qg;")
	public static Class131 aClass131_27 = new Class131();

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
	public static int anInt6026 = 0;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString194 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static13.method293(arg0);
		@Pc(6) int local6 = 0;
		@Pc(11) int local11 = arg0 - arg2;
		if (local11 < 0) {
			local11 = 0;
		}
		@Pc(25) int local25 = arg0;
		@Pc(28) int local28 = -arg0;
		@Pc(30) int local30 = local11;
		@Pc(32) int local32 = -1;
		@Pc(35) int local35 = -local11;
		@Pc(37) int local37 = -1;
		@Pc(41) int[] local41 = Static57.anIntArrayArray9[arg5];
		@Pc(46) int local46 = arg3 - local11;
		Static89.method1538(local41, local46, arg3 - arg0, arg4);
		@Pc(59) int local59 = local11 + arg3;
		Static89.method1538(local41, local59, local46, arg1);
		Static89.method1538(local41, arg0 + arg3, local59, arg4);
		while (local6 < local25) {
			local32 += 2;
			local37 += 2;
			local35 += local32;
			if (local35 >= 0 && local30 >= 1) {
				Static275.anIntArray590[local30] = local6;
				local30--;
				local35 -= local30 << 1;
			}
			local6++;
			local28 += local37;
			@Pc(141) int[] local141;
			@Pc(135) int[] local135;
			@Pc(145) int local145;
			@Pc(149) int local149;
			@Pc(153) int local153;
			@Pc(157) int local157;
			@Pc(162) int local162;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				if (local11 > local25) {
					local135 = Static57.anIntArrayArray9[arg5 - local25];
					local141 = Static57.anIntArrayArray9[arg5 + local25];
					local145 = Static275.anIntArray590[local25];
					local149 = arg3 + local6;
					local153 = arg3 - local6;
					local157 = local145 + arg3;
					local162 = arg3 - local145;
					Static89.method1538(local141, local162, local153, arg4);
					Static89.method1538(local141, local157, local162, arg1);
					Static89.method1538(local141, local149, local157, arg4);
					Static89.method1538(local135, local162, local153, arg4);
					Static89.method1538(local135, local157, local162, arg1);
					Static89.method1538(local135, local149, local157, arg4);
				} else {
					local141 = Static57.anIntArrayArray9[arg5 + local25];
					local135 = Static57.anIntArrayArray9[arg5 - local25];
					local145 = arg3 + local6;
					local149 = arg3 - local6;
					Static89.method1538(local141, local145, local149, arg4);
					Static89.method1538(local135, local145, local149, arg4);
				}
			}
			local141 = Static57.anIntArrayArray9[arg5 + local6];
			local145 = local25 + arg3;
			local135 = Static57.anIntArrayArray9[arg5 - local6];
			local149 = arg3 - local25;
			if (local6 < local11) {
				local153 = local30 >= local6 ? local30 : Static275.anIntArray590[local6];
				local162 = arg3 - local153;
				local157 = arg3 + local153;
				Static89.method1538(local141, local162, local149, arg4);
				Static89.method1538(local141, local157, local162, arg1);
				Static89.method1538(local141, local145, local157, arg4);
				Static89.method1538(local135, local162, local149, arg4);
				Static89.method1538(local135, local157, local162, arg1);
				Static89.method1538(local135, local145, local157, arg4);
			} else {
				Static89.method1538(local141, local145, local149, arg4);
				Static89.method1538(local135, local145, local149, arg4);
			}
		}
	}
}
