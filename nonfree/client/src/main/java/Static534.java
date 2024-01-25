import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_148 = new Class337(110, 28);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V")
	public static void method7879(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) int local16 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg2];
		arg3[arg2] = local30;
		@Pc(49) int local49 = ~local16 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg0; local51 < arg2; local51++) {
			if (arg1[local51] < (local51 & local49) + local16) {
				@Pc(66) int local66 = arg1[local51];
				arg1[local51] = arg1[local12];
				arg1[local12] = local66;
				@Pc(80) Object local80 = arg3[local51];
				arg3[local51] = arg3[local12];
				arg3[local12++] = local80;
			}
		}
		arg1[arg2] = arg1[local12];
		arg1[local12] = local16;
		arg3[arg2] = arg3[local12];
		arg3[local12] = local30;
		method7879(arg0, arg1, local12 - 1, arg3);
		method7879(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Lclient!pe;")
	public static Class4_Sub2_Sub1_Sub1 method7880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class217 local11 = Static421.aClass217ArrayArrayArray5[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class4_Sub2_Sub1_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class290 local22 = local11.aClass290_2; local22 != null; local22 = local22.aClass290_3) {
			@Pc(26) Class4_Sub2_Sub1 local26 = local22.aClass4_Sub2_Sub1_1;
			if (local26 instanceof Class4_Sub2_Sub1_Sub1) {
				@Pc(32) Class4_Sub2_Sub1_Sub1 local32 = (Class4_Sub2_Sub1_Sub1) local26;
				@Pc(42) int local42 = local32.method1018() * 256 + 252 - 256;
				@Pc(50) int local50 = local32.anInt10231 - local42 >> 9;
				@Pc(58) int local58 = local32.anInt10229 - local42 >> 9;
				@Pc(66) int local66 = local32.anInt10231 + local42 >> 9;
				@Pc(73) int local73 = local42 + local32.anInt10229 >> 9;
				if (arg1 >= local50 && local58 <= arg0 && arg1 <= local66 && arg0 <= local73) {
					@Pc(103) int local103 = (local66 + 1 - arg1) * (-arg0 + 1 + local73);
					if (local103 > local19) {
						local17 = local32;
						local19 = local103;
					}
				}
			}
		}
		return local17;
	}
}
