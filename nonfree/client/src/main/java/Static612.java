import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Lclient!hda;")
	public static Class136 aClass136_191;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Lclient!kk;")
	public static Class192 aClass192_5;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
	public static int anInt10006;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "S")
	public static short aShort127 = 205;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!pf;I)V")
	public static void method8496(@OriginalArg(0) Class5_Sub40 arg0) {
		Static50.aClass306_8.method7303(arg0);
		arg0.anInt7278 = arg0.aClass5_Sub12_Sub2_2.anInt10154;
		Static54.anInt826 += arg0.anInt7278;
		arg0.aClass5_Sub12_Sub2_2.anInt10154 = 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBIIII)V")
	public static void method8497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = arg4 * arg4;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = arg4 << 1;
		@Pc(41) int local41 = local25 + local17 * (1 - local33);
		@Pc(50) int local50 = local21 - (local33 - 1) * local29;
		@Pc(54) int local54 = local17 << 2;
		@Pc(58) int local58 = local21 << 2;
		@Pc(66) int local66 = local25 * 3;
		@Pc(74) int local74 = local29 * ((arg4 << 1) - 3);
		@Pc(80) int local80 = local58;
		@Pc(86) int local86 = (arg4 - 1) * local54;
		@Pc(100) int local100;
		@Pc(111) int local111;
		if (Static304.anInt4824 <= arg1 && Static231.anInt3977 >= arg1) {
			local100 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg3 + arg2);
			local111 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg2 - arg3);
			Static260.method3979(arg0, local111, Static267.anIntArrayArray20[arg1], local100);
		}
		while (local9 > 0) {
			if (local41 < 0) {
				while (local41 < 0) {
					local50 += local80;
					local41 += local66;
					local80 += local58;
					local7++;
					local66 += local58;
				}
			}
			if (local50 < 0) {
				local50 += local80;
				local41 += local66;
				local7++;
				local80 += local58;
				local66 += local58;
			}
			local50 += -local74;
			local41 += -local86;
			local86 -= local54;
			local9--;
			local74 -= local54;
			local100 = arg1 - local9;
			local111 = local9 + arg1;
			if (Static304.anInt4824 <= local111 && Static231.anInt3977 >= local100) {
				@Pc(222) int local222 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg2 + local7);
				@Pc(230) int local230 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg2 - local7);
				if (local100 >= Static304.anInt4824) {
					Static260.method3979(arg0, local230, Static267.anIntArrayArray20[local100], local222);
				}
				if (local111 <= Static231.anInt3977) {
					Static260.method3979(arg0, local230, Static267.anIntArrayArray20[local111], local222);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!ck;I)Z")
	public static boolean method8499(@OriginalArg(0) Class55 arg0) {
		return arg0 == null ? false : Static382.method8495(arg0.anInt1132 - arg0.anInt1129, -arg0.anInt1137 + arg0.anInt1133, arg0.anInt1137, arg0.anInt1130, arg0.anInt1129, arg0.anInt1128 - arg0.anInt1130);
	}
}
