import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
	public static int anInt3200;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "[Lclient!hs;")
	public static final Class165[] aClass165Array2 = new Class165[14];

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "[I")
	public static final int[] anIntArray183 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "[I")
	public static final int[] anIntArray186 = new int[50];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
	public static void method2829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static216.anInt3515 == 1) {
			Static369.method5421(Static117.aClass5_Sub5_Sub19_1, arg1, arg0);
		} else if (Static216.anInt3515 == 2) {
			if (Static40.aBoolean61) {
				Static275.method4065(arg0 + Static169.method2467(), Static375.method5510() + arg1);
			} else {
				Static275.method4065(arg0, arg1);
			}
		}
		Static117.aClass5_Sub5_Sub19_1 = null;
		Static216.anInt3515 = 0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIBII)V")
	public static void method2830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg0;
		@Pc(14) int local14 = arg4 - arg1;
		if (local14 == 0) {
			if (local9 != 0) {
				Static227.method3224(arg2, arg1, arg3, arg0);
			}
		} else if (local9 == 0) {
			Static624.method8764(arg4, arg1, arg3, arg0);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(74) boolean local74 = local14 < local9;
			@Pc(78) int local78;
			@Pc(80) int local80;
			if (local74) {
				local78 = arg1;
				local80 = arg4;
				arg1 = arg0;
				arg4 = arg2;
				arg0 = local78;
				arg2 = local80;
			}
			if (arg1 > arg4) {
				local78 = arg1;
				arg1 = arg4;
				local80 = arg0;
				arg0 = arg2;
				arg4 = local78;
				arg2 = local80;
			}
			local78 = arg0;
			local80 = arg4 - arg1;
			@Pc(114) int local114 = arg2 - arg0;
			@Pc(119) int local119 = -(local80 >> 1);
			if (local114 < 0) {
				local114 = -local114;
			}
			@Pc(135) int local135 = arg0 < arg2 ? 1 : -1;
			@Pc(139) int local139;
			if (local74) {
				for (local139 = arg1; local139 <= arg4; local139++) {
					Static569.anIntArrayArray54[local139][local78] = arg3;
					local119 += local114;
					if (local119 > 0) {
						local119 -= local80;
						local78 += local135;
					}
				}
			} else {
				for (local139 = arg1; local139 <= arg4; local139++) {
					local119 += local114;
					Static569.anIntArrayArray54[local78][local139] = arg3;
					if (local119 > 0) {
						local119 -= local80;
						local78 += local135;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)Z")
	public static boolean method2833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
