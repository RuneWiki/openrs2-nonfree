import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!le", name = "E", descriptor = "Lclient!sa;")
	public static Class3_Sub3_Sub2_Sub3 aClass3_Sub3_Sub2_Sub3_7;

	@OriginalMember(owner = "client!le", name = "I", descriptor = "[[[Lclient!dg;")
	public static Class3_Sub6[][][] aClass3_Sub6ArrayArrayArray1;

	@OriginalMember(owner = "client!le", name = "L", descriptor = "I")
	public static int anInt2400;

	@OriginalMember(owner = "client!le", name = "O", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_19;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1139 = Static193.method3027("title)3jpg");

	@OriginalMember(owner = "client!le", name = "J", descriptor = "[Lclient!rc;")
	public static final Class82[] aClass82Array1 = new Class82[24];

	@OriginalMember(owner = "client!le", name = "K", descriptor = "I")
	public static int anInt2399 = 0;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1140 = Static193.method3027("sl_arrows");

	@OriginalMember(owner = "client!le", name = "Q", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1141 = Static193.method3027("Please reload this page)3");

	@OriginalMember(owner = "client!le", name = "R", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1142 = aClass70_1141;

	@OriginalMember(owner = "client!le", name = "S", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[104][104];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg4;
		@Pc(12) int local12 = arg0 - arg2;
		@Pc(16) int local16 = arg4 - arg2;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = arg0 * arg0;
		@Pc(26) int local26 = local12 * local12;
		@Pc(30) int local30 = local22 << 1;
		@Pc(42) int local42 = local16 * local16;
		@Pc(46) int local46 = arg4 * arg4;
		@Pc(50) int local50 = local26 << 1;
		@Pc(54) int local54 = local46 << 1;
		@Pc(58) int local58 = local42 << 1;
		@Pc(62) int local62 = arg4 << 1;
		@Pc(71) int local71 = local54 + local22 * (1 - local62);
		@Pc(75) int local75 = local16 << 1;
		@Pc(84) int local84 = local46 - (local62 - 1) * local30;
		@Pc(93) int local93 = (1 - local75) * local26 + local58;
		@Pc(97) int local97 = local22 << 2;
		@Pc(106) int local106 = local42 - local50 * (local75 - 1);
		@Pc(110) int local110 = local26 << 2;
		@Pc(114) int local114 = local54 * 3;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 << 2;
		@Pc(128) int local128 = (arg4 - 1) * local97;
		@Pc(132) int local132 = local58 * 3;
		@Pc(138) int local138 = (local75 - 3) * local50;
		@Pc(144) int local144 = local30 * (local62 - 3);
		@Pc(146) int local146 = local118;
		@Pc(148) int local148 = local122;
		@Pc(152) int[] local152 = Static157.anIntArrayArray24[arg1];
		Static16.method302(arg6, arg5 - arg0, arg5 - local12, local152);
		@Pc(169) int local169 = (local16 - 1) * local110;
		Static16.method302(arg3, arg5 - local12, arg5 + local12, local152);
		Static16.method302(arg6, local12 + arg5, arg0 + arg5, local152);
		while (local7 > 0) {
			@Pc(197) boolean local197 = local7 <= local16;
			local7--;
			@Pc(202) int local202 = arg1 - local7;
			if (local71 < 0) {
				while (local71 < 0) {
					local84 += local148;
					local5++;
					local148 += local122;
					local71 += local114;
					local114 += local122;
				}
			}
			if (local197) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local132;
						local106 += local146;
						local18++;
						local146 += local118;
						local132 += local118;
					}
				}
				if (local106 < 0) {
					local18++;
					local93 += local132;
					local106 += local146;
					local132 += local118;
					local146 += local118;
				}
				local106 += -local138;
				local138 -= local110;
				local93 += -local169;
				local169 -= local110;
			}
			if (local84 < 0) {
				local5++;
				local71 += local114;
				local84 += local148;
				local148 += local122;
				local114 += local122;
			}
			local71 += -local128;
			local128 -= local97;
			local84 += -local144;
			@Pc(338) int local338 = arg5 - local5;
			@Pc(342) int local342 = local5 + arg5;
			local144 -= local97;
			@Pc(350) int local350 = arg1 + local7;
			if (local197) {
				@Pc(373) int local373 = arg5 + local18;
				@Pc(377) int local377 = arg5 - local18;
				Static16.method302(arg6, local338, local377, Static157.anIntArrayArray24[local202]);
				Static16.method302(arg3, local377, local373, Static157.anIntArrayArray24[local202]);
				Static16.method302(arg6, local373, local342, Static157.anIntArrayArray24[local202]);
				Static16.method302(arg6, local338, local377, Static157.anIntArrayArray24[local350]);
				Static16.method302(arg3, local377, local373, Static157.anIntArrayArray24[local350]);
				Static16.method302(arg6, local373, local342, Static157.anIntArrayArray24[local350]);
			} else {
				Static16.method302(arg6, local338, local342, Static157.anIntArrayArray24[local202]);
				Static16.method302(arg6, local338, local342, Static157.anIntArrayArray24[local350]);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)Lclient!i;")
	public static Class3_Sub3_Sub15 method1710(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3_Sub15 local10 = (Class3_Sub3_Sub15) Static135.aClass85_29.method2558((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(34) byte[] local34 = Static86.aClass52_19.method1581(27, arg0);
		local10 = new Class3_Sub3_Sub15();
		if (local34 != null) {
			local10.method1202(new Class3_Sub4(local34));
		}
		Static135.aClass85_29.method2560(local10, (long) arg0);
		return local10;
	}
}
