import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "Lclient!ph;")
	public static Class138 aClass138_38;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
	public static int anInt2249 = 0;

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "Lclient!bo;")
	public static Class24 aClass24_16 = new Class24();

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
	public static int anInt2268 = 0;

	@OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
	public static int anInt2269 = 0;

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)I")
	public static int method1824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!vc;I)V")
	public static void method1825(@OriginalArg(0) Class1_Sub4 arg0) {
		arg0.aBoolean385 = false;
		if (arg0.aClass1_Sub7_5 != null) {
			arg0.aClass1_Sub7_5.anInt807 = 0;
		}
		for (@Pc(19) Class1_Sub4 local19 = arg0.method4189(); local19 != null; local19 = arg0.method4186()) {
			method1825(local19);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIZIIZLclient!nh;Z)Lclient!in;")
	public static Class1_Sub1_Sub3 method1827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class119 arg6, @OriginalArg(8) boolean arg7) {
		@Pc(9) Class149 local9 = Static271.method4006(arg3);
		if (arg1 > 1 && local9.anIntArray433 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (local9.anIntArray431[local19] <= arg1 && local9.anIntArray431[local19] != 0) {
					local17 = local9.anIntArray433[local19];
				}
			}
			if (local17 != -1) {
				local9 = Static271.method4006(local17);
			}
		}
		@Pc(55) Class22_Sub4_Sub2 local55 = local9.method3742(arg6);
		if (local55 == null) {
			return null;
		}
		@Pc(63) Class1_Sub1_Sub3_Sub2 local63 = null;
		if (local9.anInt4800 != -1) {
			local63 = (Class1_Sub1_Sub3_Sub2) method1827(1, 10, true, local9.anInt4787, 0, true, arg6, false);
			if (local63 == null) {
				return null;
			}
		} else if (local9.anInt4805 != -1) {
			local63 = (Class1_Sub1_Sub3_Sub2) method1827(arg0, arg1, false, local9.anInt4794, arg4, true, arg6, false);
			if (local63 == null) {
				return null;
			}
		}
		@Pc(109) int[] local109 = Static41.anIntArray62;
		@Pc(112) int[] local112 = new int[4];
		@Pc(114) int local114 = Static41.anInt829;
		@Pc(116) int local116 = Static41.anInt826;
		Static41.method748(local112);
		@Pc(124) Class1_Sub1_Sub3_Sub2 local124 = new Class1_Sub1_Sub3_Sub2(36, 32);
		Static41.method738(local124.anIntArray344, 36, 32);
		Static18.method310();
		Static18.method304(16, 16);
		Static18.aBoolean20 = false;
		@Pc(138) int local138 = local9.anInt4767;
		if (arg2) {
			local138 = (int) ((double) local138 * 1.5D);
		} else if (arg0 == 2) {
			local138 = (int) ((double) local138 * 1.04D);
		}
		@Pc(166) int local166 = Class17.anIntArray22[local9.anInt4778] * local138 >> 16;
		@Pc(175) int local175 = Class17.anIntArray24[local9.anInt4778] * local138 >> 16;
		local55.method3571(local9.anInt4812, local9.anInt4774, local9.anInt4778, local9.anInt4795, local166 + local9.anInt4820 - local55.method4071() / 2, local175 + local9.anInt4820, -1L);
		if (arg0 >= 1) {
			local124.method3472(1);
			if (arg0 >= 2) {
				local124.method3472(16777215);
			}
			Static41.method738(local124.anIntArray344, 36, 32);
		}
		if (arg4 != 0) {
			local124.method3482(arg4);
		}
		if (local9.anInt4800 != -1) {
			local63.method4628(0, 0);
		} else if (local9.anInt4805 != -1) {
			Static41.method738(local63.anIntArray344, 36, 32);
			local124.method4628(0, 0);
			local124 = local63;
		}
		if (arg7 && (local9.anInt4790 == 1 || arg1 != 1) && arg1 != -1) {
			Static300.aClass1_Sub1_Sub12_Sub2_2.method4421(Static187.method3071(arg1), 0, 9, 16776960, 1);
		}
		Static41.method738(local109, local114, local116);
		Static41.method744(local112);
		Static18.method310();
		Static18.aBoolean20 = true;
		return Static291.aBoolean404 && !arg5 ? new Class1_Sub1_Sub3_Sub1(local124) : local124;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBILclient!ph;)[Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2[] method1829(@OriginalArg(2) int arg0, @OriginalArg(3) Class138 arg1) {
		return Static27.method486(arg0, 0, arg1) ? Static106.method1767() : null;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)Z")
	public static boolean method1832(@OriginalArg(1) int arg0) {
		Static44.aBoolean70 = true;
		Static189.anInt3780 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
