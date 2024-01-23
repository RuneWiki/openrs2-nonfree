import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public static int anInt3403 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILclient!sk;ZZIZI)Lclient!bf;")
	public static Class1_Sub2_Sub2 method2763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class149 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class120 local9 = Static183.method4458(arg7);
		if (arg0 > 1 && local9.anIntArray388 != null) {
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
				if (local9.anIntArray390[local22] <= arg0 && local9.anIntArray390[local22] != 0) {
					local20 = local9.anIntArray388[local22];
				}
			}
			if (local20 != -1) {
				local9 = Static183.method4458(local20);
			}
		}
		@Pc(64) Class6_Sub2_Sub1 local64 = local9.method2674(arg3);
		if (local64 == null) {
			return null;
		}
		@Pc(72) Class1_Sub2_Sub2_Sub1 local72 = null;
		if (local9.anInt3302 != -1) {
			local72 = (Class1_Sub2_Sub2_Sub1) method2763(10, 0, 1, arg3, false, true, true, local9.anInt3308);
			if (local72 == null) {
				return null;
			}
		} else if (local9.anInt3314 != -1) {
			local72 = (Class1_Sub2_Sub2_Sub1) method2763(arg0, arg1, arg2, arg3, false, true, false, local9.anInt3293);
			if (local72 == null) {
				return null;
			}
		}
		@Pc(118) int[] local118 = Static213.anIntArray495;
		@Pc(120) int local120 = Static213.anInt4239;
		@Pc(122) int local122 = Static213.anInt4240;
		@Pc(125) int[] local125 = new int[4];
		Static213.method3384(local125);
		@Pc(133) Class1_Sub2_Sub2_Sub1 local133 = new Class1_Sub2_Sub2_Sub1(36, 32);
		Static213.method3381(local133.anIntArray598, 36, 32);
		Static208.method3241();
		Static208.method3238(16, 16);
		Static208.aBoolean312 = false;
		@Pc(153) int local153 = local9.anInt3297;
		if (arg6) {
			local153 = (int) ((double) local153 * 1.5D);
		} else if (arg2 == 2) {
			local153 = (int) ((double) local153 * 1.04D);
		}
		@Pc(184) int local184 = Class135.anIntArray472[local9.anInt3260] * local153 >> 16;
		@Pc(193) int local193 = local153 * Class135.anIntArray474[local9.anInt3260] >> 16;
		local64.method2084(local9.anInt3298, local9.anInt3295, local9.anInt3260, local9.anInt3289, local184 + local9.anInt3272 - local64.method3833() / 2, local193 - -local9.anInt3272, -1L);
		if (arg2 >= 1) {
			local133.method3928(1);
			if (arg2 >= 2) {
				local133.method3928(16777215);
			}
			Static213.method3381(local133.anIntArray598, 36, 32);
		}
		if (arg1 != 0) {
			local133.method3933(arg1);
		}
		if (local9.anInt3302 != -1) {
			local72.method3921(0, 0);
		} else if (local9.anInt3314 != -1) {
			Static213.method3381(local72.anIntArray598, 36, 32);
			local133.method3921(0, 0);
			local133 = local72;
		}
		if (arg4 && (local9.anInt3266 == 1 || arg0 != 1) && arg0 != -1) {
			Static105.aClass1_Sub2_Sub12_Sub1_1.method4394(Static283.method4316(arg0), 0, 9, 16776960, 1);
		}
		Static213.method3381(local118, local120, local122);
		Static213.method3365(local125);
		Static208.method3241();
		Static208.aBoolean312 = true;
		return Static240.aBoolean369 && !arg5 ? new Class1_Sub2_Sub2_Sub2(local133) : local133;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!qm;)I")
	public static int method2764(@OriginalArg(1) Class6_Sub6_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt4602;
		@Pc(17) Class79 local17 = arg0.method3503();
		if (arg0.anInt4544 == local17.anInt2197) {
			local8 = arg0.anInt4597;
		} else if (local17.anInt2225 == arg0.anInt4544 || local17.anInt2207 == arg0.anInt4544 || local17.anInt2214 == arg0.anInt4544 || arg0.anInt4544 == local17.anInt2199) {
			local8 = arg0.anInt4594;
		} else if (local17.anInt2221 == arg0.anInt4544 || local17.anInt2205 == arg0.anInt4544 || local17.anInt2215 == arg0.anInt4544 || arg0.anInt4544 == local17.anInt2196) {
			local8 = arg0.anInt4589;
		}
		return local8;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method2765(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local8[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local8[local18] = local8[local18] + arg0[local18];
			}
		}
		return local8;
	}
}
