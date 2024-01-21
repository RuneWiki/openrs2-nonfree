import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Lclient!o;")
	public static Class67 aClass67_6;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "[Lclient!fc;")
	public static Class29[] aClass29Array6;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_897 = Static181.method2795("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!qe;")
	public static Class83 aClass83_898 = aClass83_897;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "[I")
	public static int[] anIntArray301 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
	public static int method2326(@OriginalArg(1) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
	public static void method2327(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static210.aBooleanArray29[arg0]) {
			return;
		}
		Static201.aClass28_190.method850(arg0);
		if (Static175.aClass5ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < Static175.aClass5ArrayArray1[arg0].length; local36++) {
			if (Static175.aClass5ArrayArray1[arg0][local36] != null) {
				if (Static175.aClass5ArrayArray1[arg0][local36].anInt130 == 2) {
					local34 = false;
				} else {
					Static175.aClass5ArrayArray1[arg0][local36] = null;
				}
			}
		}
		if (local34) {
			Static175.aClass5ArrayArray1[arg0] = null;
		}
		Static210.aBooleanArray29[arg0] = false;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V")
	public static void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) int local14 = arg0;
		Static22.method438(arg3 + arg2, arg1, arg2 - arg3, Static14.anIntArrayArray18[arg4]);
		@Pc(29) int local29 = 0;
		@Pc(33) int local33 = arg3 * arg3;
		@Pc(37) int local37 = local33 << 1;
		@Pc(41) int local41 = arg0 * arg0;
		@Pc(45) int local45 = arg0 << 1;
		@Pc(49) int local49 = local41 << 1;
		@Pc(58) int local58 = local49 + (1 - local45) * local33;
		@Pc(67) int local67 = local41 - local37 * (local45 - 1);
		@Pc(71) int local71 = local33 << 2;
		@Pc(75) int local75 = local41 << 2;
		@Pc(83) int local83 = local49 * 3;
		@Pc(91) int local91 = local37 * ((arg0 << 1) - 3);
		@Pc(97) int local97 = local75;
		@Pc(103) int local103 = local71 * (arg0 - 1);
		while (local14 > 0) {
			if (local58 < 0) {
				while (local58 < 0) {
					local67 += local97;
					local58 += local83;
					local29++;
					local97 += local75;
					local83 += local75;
				}
			}
			local14--;
			if (local67 < 0) {
				local67 += local97;
				local97 += local75;
				local58 += local83;
				local29++;
				local83 += local75;
			}
			local67 += -local91;
			@Pc(163) int local163 = arg4 - local14;
			local58 += -local103;
			local91 -= local71;
			local103 -= local71;
			@Pc(180) int local180 = arg4 + local14;
			@Pc(184) int local184 = arg2 + local29;
			@Pc(189) int local189 = arg2 - local29;
			Static22.method438(local184, arg1, local189, Static14.anIntArrayArray18[local163]);
			Static22.method438(local184, arg1, local189, Static14.anIntArrayArray18[local180]);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
	public static void method2329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2].anInt3552 = arg3;
		}
	}
}
