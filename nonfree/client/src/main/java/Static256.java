import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "Lclient!jl;")
	public static Class89 aClass89_40 = new Class89(5);

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "[I")
	public static int[] anIntArray475 = new int[500];

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "[I")
	public static int[] anIntArray476 = new int[50];

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "Lclient!jl;")
	public static Class89 aClass89_41 = new Class89(50);

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString368 = "Please remove ";

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(CI)Z")
	public static boolean method3952(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Lclient!ui;")
	public static Class1_Sub3_Sub21 method3953(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub21 local10 = (Class1_Sub3_Sub21) Static185.aClass89_26.method2268((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static223.method3541(arg0, Static166.aClass168_124, Static260.aClass168_177);
		if (local10 != null) {
			Static185.aClass89_26.method2272((long) arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZIZIZBLclient!tf;I)Lclient!ml;")
	public static Class1_Sub3_Sub13 method3954(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) Class167 arg6, @OriginalArg(8) int arg7) {
		@Pc(5) Class57 local5 = Static56.method1050(arg2);
		if (arg7 > 1 && local5.anIntArray188 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (local5.anIntArray190[local19] <= arg7 && local5.anIntArray190[local19] != 0) {
					local17 = local5.anIntArray188[local19];
				}
			}
			if (local17 != -1) {
				local5 = Static56.method1050(local17);
			}
		}
		@Pc(62) Class2_Sub1_Sub2 local62 = local5.method1327(arg6);
		if (local62 == null) {
			return null;
		}
		@Pc(69) Class1_Sub3_Sub13_Sub2 local69 = null;
		if (local5.anInt1777 != -1) {
			local69 = (Class1_Sub3_Sub13_Sub2) method3954(1, true, local5.anInt1808, false, 0, true, arg6, 10);
			if (local69 == null) {
				return null;
			}
		} else if (local5.anInt1768 != -1) {
			local69 = (Class1_Sub3_Sub13_Sub2) method3954(arg0, false, local5.anInt1821, false, arg4, true, arg6, arg7);
			if (local69 == null) {
				return null;
			}
		}
		@Pc(117) int local117 = Static231.anInt4850;
		@Pc(119) int[] local119 = Static231.anIntArray448;
		@Pc(130) int[] local130 = new int[4];
		@Pc(132) int local132 = Static231.anInt4851;
		Static231.method3631(local130);
		@Pc(140) Class1_Sub3_Sub13_Sub2 local140 = new Class1_Sub3_Sub13_Sub2(36, 32);
		Static231.method3639(local140.anIntArray504, 36, 32);
		Static237.method3736();
		Static237.method3747(16, 16);
		Static237.aBoolean311 = false;
		@Pc(154) int local154 = local5.anInt1794;
		if (arg1) {
			local154 = (int) ((double) local154 * 1.5D);
		} else if (arg0 == 2) {
			local154 = (int) ((double) local154 * 1.04D);
		}
		@Pc(185) int local185 = local154 * Class146.anIntArray461[local5.anInt1806] >> 16;
		@Pc(194) int local194 = Class146.anIntArray463[local5.anInt1806] * local154 >> 16;
		local62.method559(local5.anInt1790, local5.anInt1791, local5.anInt1806, local5.anInt1815, local185 + local5.anInt1779 - local62.method3948() / 2, local194 - -local5.anInt1779, -1L);
		if (arg0 >= 1) {
			local140.method4229(1);
			if (arg0 >= 2) {
				local140.method4229(16777215);
			}
			Static231.method3639(local140.anIntArray504, 36, 32);
		}
		if (arg4 != 0) {
			local140.method4214(arg4);
		}
		if (local5.anInt1777 != -1) {
			local69.method4204(0, 0);
		} else if (local5.anInt1768 != -1) {
			Static231.method3639(local69.anIntArray504, 36, 32);
			local140.method4204(0, 0);
			local140 = local69;
		}
		if (arg3 && (local5.anInt1824 == 1 || arg7 != 1) && arg7 != -1) {
			Static119.aClass1_Sub3_Sub5_Sub1_1.method3503(Static181.method2924(arg7), 0, 9, 16776960, 1);
		}
		Static231.method3639(local119, local132, local117);
		Static231.method3628(local130);
		Static237.method3736();
		Static237.aBoolean311 = true;
		return Static294.aBoolean367 && !arg5 ? new Class1_Sub3_Sub13_Sub1(local140) : local140;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BZI)Ljava/lang/String;")
	public static String method3955(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static257.method3966(arg0);
	}
}
