import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString90;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_70 = new Class211(102, 28);

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "[I")
	public static final int[] anIntArray233 = new int[14];

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_99 = new Class102(14, 2);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIZI)V")
	public static void method2385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(18) long local18 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg1);
		@Pc(24) Class2_Sub36 local24 = (Class2_Sub36) Static10.aClass72_1.method1659(local18);
		if (local24 == null) {
			local24 = new Class2_Sub36();
			Static10.aClass72_1.method1653(local24, local18);
		}
		if (local24.anIntArray395.length <= arg0) {
			@Pc(45) int[] local45 = new int[arg0 + 1];
			@Pc(50) int[] local50 = new int[arg0 + 1];
			for (@Pc(52) int local52 = 0; local52 < local24.anIntArray395.length; local52++) {
				local45[local52] = local24.anIntArray395[local52];
				local50[local52] = local24.anIntArray396[local52];
			}
			for (@Pc(78) int local78 = local24.anIntArray395.length; local78 < arg0; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local24.anIntArray396 = local50;
			local24.anIntArray395 = local45;
		}
		local24.anIntArray395[arg0] = arg3;
		local24.anIntArray396[arg0] = arg2;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)V")
	public static void method2386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 - arg4;
		@Pc(13) int local13 = arg3 - arg0;
		if (local13 == 0) {
			if (local9 != 0) {
				Static340.method5397(arg1, arg2, arg4, arg0);
			}
		} else if (local9 == 0) {
			Static373.method4858(arg3, arg0, arg4, arg2);
		} else {
			if (local13 < 0) {
				local13 = -local13;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(53) boolean local53 = local13 < local9;
			@Pc(57) int local57;
			@Pc(61) int local61;
			if (local53) {
				local57 = arg0;
				arg0 = arg4;
				local61 = arg3;
				arg3 = arg1;
				arg4 = local57;
				arg1 = local61;
			}
			if (arg0 > arg3) {
				local57 = arg0;
				arg0 = arg3;
				local61 = arg4;
				arg3 = local57;
				arg4 = arg1;
				arg1 = local61;
			}
			local57 = arg4;
			local61 = arg3 - arg0;
			@Pc(93) int local93 = arg1 - arg4;
			@Pc(105) int local105 = -(local61 >> 1);
			if (local93 < 0) {
				local93 = -local93;
			}
			@Pc(121) int local121 = arg4 >= arg1 ? -1 : 1;
			@Pc(125) int local125;
			if (local53) {
				for (local125 = arg0; local125 <= arg3; local125++) {
					Static229.anIntArrayArray26[local125][local57] = arg2;
					local105 += local93;
					if (local105 > 0) {
						local105 -= local61;
						local57 += local121;
					}
				}
			} else {
				for (local125 = arg0; local125 <= arg3; local125++) {
					local105 += local93;
					Static229.anIntArrayArray26[local57][local125] = arg2;
					if (local105 > 0) {
						local57 += local121;
						local105 -= local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
	public static void method2388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass3_Sub3_2 != null) {
			local7.aClass3_Sub3_2 = null;
		}
		if (local7.aClass3_Sub3_3 != null) {
			local7.aClass3_Sub3_3 = null;
		}
	}
}
