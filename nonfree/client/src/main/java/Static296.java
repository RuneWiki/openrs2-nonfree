import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "Z")
	public static final boolean aBoolean290 = true;

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[128][128];

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Z")
	public static boolean aBoolean291 = false;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!afa;ILclient!mf;Lclient!rw;II)V")
	public static void method4149(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class247 arg3, @OriginalArg(5) Class9_Sub1_Sub1_Sub2_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub56 local7 = new Class3_Sub56();
		local7.anInt10753 = arg5;
		local7.anInt10741 = arg6 << 9;
		local7.anInt10743 = arg0 << 9;
		if (arg3 != null) {
			local7.aClass247_1 = arg3;
			@Pc(35) int local35 = arg3.anInt6246;
			@Pc(38) int local38 = arg3.anInt6242;
			if (arg2 == 1 || arg2 == 3) {
				local38 = arg3.anInt6246;
				local35 = arg3.anInt6242;
			}
			local7.anInt10740 = arg3.anInt6254;
			local7.anInt10745 = arg3.anInt6288;
			local7.anInt10755 = arg3.anInt6271;
			local7.anInt10739 = arg3.anInt6264 << 9;
			local7.anInt10744 = arg0 + local35 << 9;
			local7.anInt10749 = arg3.anInt6273;
			local7.aBoolean730 = arg3.aBoolean412;
			local7.anInt10748 = arg6 + local38 << 9;
			local7.aBoolean731 = arg3.aBoolean414;
			local7.anInt10751 = arg3.anInt6268;
			local7.anIntArray770 = arg3.anIntArray481;
			local7.anInt10746 = arg3.anInt6252;
			local7.anInt10752 = arg3.anInt6256 << 9;
			if (arg3.anIntArray477 != null) {
				local7.aBoolean729 = true;
				local7.method9129();
			}
			if (local7.anIntArray770 != null) {
				local7.anInt10742 = local7.anInt10755 + (int) (Math.random() * (double) (local7.anInt10745 - local7.anInt10755));
			}
			Static581.aClass342_71.method7654(local7);
		} else if (arg4 != null) {
			local7.aClass9_Sub1_Sub1_Sub2_Sub2_3 = arg4;
			@Pc(223) Class219 local223 = arg4.aClass219_1;
			if (local223.anIntArray405 != null) {
				local7.aBoolean729 = true;
				local223 = local223.method5035(Static380.aClass127_1);
			}
			if (local223 != null) {
				local7.anInt10744 = local223.anInt5693 + arg0 << 9;
				local7.anInt10748 = local223.anInt5693 + arg6 << 9;
				local7.anInt10749 = Static642.method8456(arg4);
				local7.aBoolean731 = local223.aBoolean368;
				local7.anInt10740 = local223.anInt5717;
				local7.anInt10751 = local223.anInt5712;
				local7.anInt10752 = local223.anInt5695 << 9;
				local7.anInt10746 = local223.anInt5689;
				local7.anInt10739 = local223.anInt5679 << 9;
			}
			Static420.aClass342_49.method7654(local7);
		} else if (arg1 != null) {
			local7.aClass9_Sub1_Sub1_Sub2_Sub1_3 = arg1;
			local7.anInt10744 = arg1.method7485() + arg0 << 9;
			local7.anInt10748 = arg6 + arg1.method7485() << 9;
			local7.anInt10749 = Static157.method2548(arg1);
			local7.anInt10746 = arg1.anInt519;
			local7.anInt10752 = 0;
			local7.anInt10739 = arg1.anInt549 << 9;
			local7.anInt10751 = 256;
			local7.anInt10740 = 256;
			local7.aBoolean731 = arg1.aBoolean35;
			Static251.aClass313_20.method7107((long) arg1.anInt8783, local7);
			return;
		}
	}
}
