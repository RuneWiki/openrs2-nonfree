import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vp", name = "G", descriptor = "Lclient!hw;")
	public static final Class108 aClass108_1 = new Class108();

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!pf;III)V")
	public static void method5774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub31 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt4923 == -1 && arg2.anIntArray371 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg2.anInt4925 < arg4) {
			local15 = arg4 - arg2.anInt4925;
		} else if (arg2.anInt4921 > arg4) {
			local15 = arg2.anInt4921 - arg4;
		}
		@Pc(56) int local56 = arg2.anInt4927 * Static216.aClass1_Sub1_1.anInt4521 >> 8;
		if (arg0 > arg2.anInt4930) {
			local15 += arg0 - arg2.anInt4930;
		} else if (arg0 < arg2.anInt4918) {
			local15 += arg2.anInt4918 - arg0;
		}
		if (arg2.anInt4920 == 0 || local15 - 64 > arg2.anInt4920 || Static216.aClass1_Sub1_1.anInt4521 == 0 || arg1 != arg2.anInt4924) {
			if (arg2.aClass5_Sub22_Sub2_4 != null) {
				Static119.aClass5_Sub22_Sub3_3.method3636(arg2.aClass5_Sub22_Sub2_4);
				arg2.aClass5_Sub22_Sub2_4 = null;
			}
			if (arg2.aClass5_Sub22_Sub2_3 != null) {
				Static119.aClass5_Sub22_Sub3_3.method3636(arg2.aClass5_Sub22_Sub2_3);
				arg2.aClass5_Sub22_Sub2_3 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(146) int local146 = (arg2.anInt4920 - local15) * local56 / arg2.anInt4920;
		if (arg2.aClass5_Sub22_Sub2_4 != null) {
			arg2.aClass5_Sub22_Sub2_4.method3111(local146);
		} else if (arg2.anInt4923 >= 0) {
			@Pc(172) Class90 local172 = Static465.method1968(Static318.aClass243_176, arg2.anInt4923, 0);
			if (local172 != null) {
				@Pc(179) Class5_Sub5_Sub1 local179 = local172.method1965().method4649(Static202.aClass251_1);
				@Pc(184) Class5_Sub22_Sub2 local184 = Static467.method3103(local179, local146);
				local184.method3128(-1);
				Static119.aClass5_Sub22_Sub3_3.method3641(local184);
				arg2.aClass5_Sub22_Sub2_4 = local184;
			}
		}
		if (arg2.aClass5_Sub22_Sub2_3 != null) {
			arg2.aClass5_Sub22_Sub2_3.method3111(local146);
			if (arg2.aClass5_Sub22_Sub2_3.method6005()) {
				return;
			}
			arg2.aClass5_Sub22_Sub2_3 = null;
		} else if (arg2.anIntArray371 != null && (arg2.anInt4926 -= arg3) <= 0) {
			@Pc(215) int local215 = (int) (Math.random() * (double) arg2.anIntArray371.length);
			@Pc(223) Class90 local223 = Static465.method1968(Static318.aClass243_176, arg2.anIntArray371[local215], 0);
			if (local223 != null) {
				@Pc(230) Class5_Sub5_Sub1 local230 = local223.method1965().method4649(Static202.aClass251_1);
				@Pc(235) Class5_Sub22_Sub2 local235 = Static467.method3103(local230, local146);
				local235.method3128(0);
				Static119.aClass5_Sub22_Sub3_3.method3641(local235);
				arg2.aClass5_Sub22_Sub2_3 = local235;
				arg2.anInt4926 = (int) ((double) (arg2.anInt4919 - arg2.anInt4931) * Math.random()) + arg2.anInt4931;
				return;
			}
		}
	}
}
