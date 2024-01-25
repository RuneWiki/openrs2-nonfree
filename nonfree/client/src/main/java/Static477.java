import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZI)V")
	public static void method6609(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static148.anInt2785++;
			Static282.method4298();
		}
		if (arg0) {
			Static305.anInt1756++;
			Static221.method3507();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZIILclient!oo;II)V")
	public static void method6610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub34 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt6877 == -1 && arg2.anIntArray485 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = Static58.aClass6_Sub17_Sub1_1.anInt9286 * arg2.anInt6882 >> 8;
		if (arg2.anInt6880 < arg3) {
			local15 = arg3 - arg2.anInt6880;
		} else if (arg2.anInt6879 > arg3) {
			local15 = arg2.anInt6879 - arg3;
		}
		if (arg2.anInt6875 < arg0) {
			local15 += arg0 - arg2.anInt6875;
		} else if (arg2.anInt6886 > arg0) {
			local15 += arg2.anInt6886 - arg0;
		}
		if (arg2.anInt6876 == 0 || local15 - 256 > arg2.anInt6876 || Static58.aClass6_Sub17_Sub1_1.anInt9286 == 0 || arg2.anInt6887 != arg4) {
			if (arg2.aClass6_Sub15_Sub2_3 != null) {
				Static204.aClass6_Sub15_Sub1_1.method2421(arg2.aClass6_Sub15_Sub2_3);
				arg2.aClass6_Sub6_Sub1_4 = null;
				arg2.aClass6_Sub23_2 = null;
				arg2.aClass6_Sub15_Sub2_3 = null;
			}
			if (arg2.aClass6_Sub15_Sub2_4 != null) {
				Static204.aClass6_Sub15_Sub1_1.method2421(arg2.aClass6_Sub15_Sub2_4);
				arg2.aClass6_Sub23_3 = null;
				arg2.aClass6_Sub15_Sub2_4 = null;
				arg2.aClass6_Sub6_Sub1_3 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(160) int local160 = local23 * (arg2.anInt6876 - local15) / arg2.anInt6876;
		@Pc(236) Class6_Sub15_Sub2 local236;
		if (arg2.aClass6_Sub15_Sub2_3 != null) {
			arg2.aClass6_Sub15_Sub2_3.method3879(local160);
		} else if (arg2.anInt6877 >= 0) {
			if (arg2.aBoolean473) {
				if (arg2.aClass6_Sub23_2 == null) {
					arg2.aClass6_Sub23_2 = Static254.method3949(Static35.aClass248_8, arg2.anInt6877);
				}
				if (arg2.aClass6_Sub23_2 != null) {
					if (arg2.aClass6_Sub6_Sub1_4 == null) {
						arg2.aClass6_Sub6_Sub1_4 = arg2.aClass6_Sub23_2.method3945(new int[] { 22050 });
					}
					if (arg2.aClass6_Sub6_Sub1_4 != null) {
						local236 = Static591.method3858(arg2.aClass6_Sub6_Sub1_4, local160);
						local236.method3880(-1);
						Static204.aClass6_Sub15_Sub1_1.method2422(local236);
						arg2.aClass6_Sub15_Sub2_3 = local236;
					}
				}
			} else {
				@Pc(178) Class161 local178 = Static592.method3933(Static492.aClass248_96, arg2.anInt6877, 0);
				if (local178 != null) {
					@Pc(185) Class6_Sub6_Sub1 local185 = local178.method3934().method6127(Static446.aClass96_1);
					@Pc(190) Class6_Sub15_Sub2 local190 = Static591.method3858(local185, local160);
					local190.method3880(-1);
					Static204.aClass6_Sub15_Sub1_1.method2422(local190);
					arg2.aClass6_Sub15_Sub2_3 = local190;
				}
			}
		}
		if (arg2.aClass6_Sub15_Sub2_4 != null) {
			arg2.aClass6_Sub15_Sub2_4.method3879(local160);
			if (arg2.aClass6_Sub15_Sub2_4.method7949()) {
				return;
			}
			arg2.aClass6_Sub15_Sub2_4 = null;
			arg2.aClass6_Sub23_3 = null;
			arg2.aClass6_Sub6_Sub1_3 = null;
		} else if (arg2.anIntArray485 != null && (arg2.anInt6873 -= arg1) <= 0) {
			@Pc(282) int local282;
			if (arg2.aBoolean474) {
				if (arg2.aClass6_Sub23_3 == null) {
					local282 = (int) (Math.random() * (double) arg2.anIntArray485.length);
					arg2.aClass6_Sub23_3 = Static254.method3949(Static35.aClass248_8, arg2.anIntArray485[local282]);
				}
				if (arg2.aClass6_Sub23_3 != null) {
					if (arg2.aClass6_Sub6_Sub1_3 == null) {
						arg2.aClass6_Sub6_Sub1_3 = arg2.aClass6_Sub23_3.method3945(new int[] { 22050 });
					}
					if (arg2.aClass6_Sub6_Sub1_3 != null) {
						local236 = Static591.method3858(arg2.aClass6_Sub6_Sub1_3, local160);
						local236.method3880(0);
						Static204.aClass6_Sub15_Sub1_1.method2422(local236);
						arg2.aClass6_Sub15_Sub2_4 = local236;
						arg2.anInt6873 = (int) (Math.random() * (double) (arg2.anInt6881 - arg2.anInt6883)) + arg2.anInt6883;
						return;
					}
				}
				return;
			}
			local282 = (int) (Math.random() * (double) arg2.anIntArray485.length);
			@Pc(357) Class161 local357 = Static592.method3933(Static492.aClass248_96, arg2.anIntArray485[local282], 0);
			if (local357 != null) {
				@Pc(364) Class6_Sub6_Sub1 local364 = local357.method3934().method6127(Static446.aClass96_1);
				@Pc(369) Class6_Sub15_Sub2 local369 = Static591.method3858(local364, local160);
				local369.method3880(0);
				Static204.aClass6_Sub15_Sub1_1.method2422(local369);
				arg2.aClass6_Sub15_Sub2_4 = local369;
				arg2.anInt6873 = (int) ((double) (arg2.anInt6881 - arg2.anInt6883) * Math.random()) + arg2.anInt6883;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZZ)V")
	public static void method6611(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static305.anInt1756--;
			if (Static305.anInt1756 == 0) {
				Static36.anIntArray31 = null;
			}
		}
		if (arg1) {
			Static148.anInt2785--;
			if (Static148.anInt2785 == 0) {
				Static246.anIntArray653 = null;
			}
		}
	}
}
