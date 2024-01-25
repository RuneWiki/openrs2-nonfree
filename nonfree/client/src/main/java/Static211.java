import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ik", name = "hb", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_42 = new Class236(54, -1);

	@OriginalMember(owner = "client!ik", name = "bb", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_94 = new Class150(27, -1);

	@OriginalMember(owner = "client!ik", name = "eb", descriptor = "I")
	public static int anInt3979 = -1;

	@OriginalMember(owner = "client!ik", name = "ib", descriptor = "I")
	public static int anInt3982 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V")
	public static void method3426(@OriginalArg(1) int arg0) {
		Static54.aLong40 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBILclient!gca;II)V")
	public static void method3429(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub19 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt3164 == -1 && arg2.anIntArray245 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = Static300.aClass5_Sub28_Sub1_1.anInt4870 * arg2.anInt3168 >> 8;
		if (arg1 > arg2.anInt3160) {
			local15 = arg1 - arg2.anInt3160;
		} else if (arg1 < arg2.anInt3159) {
			local15 = arg2.anInt3159 - arg1;
		}
		if (arg0 > arg2.anInt3166) {
			local15 += arg0 - arg2.anInt3166;
		} else if (arg2.anInt3163 > arg0) {
			local15 += arg2.anInt3163 - arg0;
		}
		if (arg2.anInt3170 == 0 || arg2.anInt3170 < local15 - 64 || Static300.aClass5_Sub28_Sub1_1.anInt4870 == 0 || arg4 != arg2.anInt3173) {
			if (arg2.aClass5_Sub15_Sub1_2 != null) {
				Static373.aClass5_Sub15_Sub2_1.method4871(arg2.aClass5_Sub15_Sub1_2);
				arg2.aClass5_Sub15_Sub1_2 = null;
			}
			if (arg2.aClass5_Sub15_Sub1_1 != null) {
				Static373.aClass5_Sub15_Sub2_1.method4871(arg2.aClass5_Sub15_Sub1_1);
				arg2.aClass5_Sub15_Sub1_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(162) int local162 = (arg2.anInt3170 - local15) * local23 / arg2.anInt3170;
		if (arg2.aClass5_Sub15_Sub1_2 != null) {
			arg2.aClass5_Sub15_Sub1_2.method2495(local162);
		} else if (arg2.anInt3164 >= 0) {
			@Pc(177) Class200 local177 = Static554.method5070(Static371.aClass117_157, arg2.anInt3164, 0);
			if (local177 != null) {
				@Pc(184) Class5_Sub5_Sub1 local184 = local177.method5068().method616(Static151.aClass157_1);
				@Pc(189) Class5_Sub15_Sub1 local189 = Static552.method2476(local184, local162);
				local189.method2472(-1);
				Static373.aClass5_Sub15_Sub2_1.method4866(local189);
				arg2.aClass5_Sub15_Sub1_2 = local189;
			}
		}
		if (arg2.aClass5_Sub15_Sub1_1 != null) {
			arg2.aClass5_Sub15_Sub1_1.method2495(local162);
			if (!arg2.aClass5_Sub15_Sub1_1.method7426()) {
				arg2.aClass5_Sub15_Sub1_1 = null;
			}
		} else if (arg2.anIntArray245 != null && (arg2.anInt3172 -= arg3) <= 0) {
			@Pc(242) int local242 = (int) (Math.random() * (double) arg2.anIntArray245.length);
			@Pc(250) Class200 local250 = Static554.method5070(Static371.aClass117_157, arg2.anIntArray245[local242], 0);
			if (local250 != null) {
				@Pc(257) Class5_Sub5_Sub1 local257 = local250.method5068().method616(Static151.aClass157_1);
				@Pc(262) Class5_Sub15_Sub1 local262 = Static552.method2476(local257, local162);
				local262.method2472(0);
				Static373.aClass5_Sub15_Sub2_1.method4866(local262);
				arg2.anInt3172 = (int) ((double) (arg2.anInt3167 - arg2.anInt3162) * Math.random()) + arg2.anInt3162;
				arg2.aClass5_Sub15_Sub1_1 = local262;
				return;
			}
		}
	}
}
