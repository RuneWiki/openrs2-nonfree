import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!js", name = "K", descriptor = "Lclient!tj;")
	public static Class193 aClass193_59;

	@OriginalMember(owner = "client!js", name = "Q", descriptor = "I")
	public static int anInt3399;

	@OriginalMember(owner = "client!js", name = "R", descriptor = "Lclient!fa;")
	public static Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!js", name = "X", descriptor = "Z")
	public static boolean aBoolean271 = true;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([I[I[IILclient!fa;)V")
	public static void method3079(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class8_Sub1_Sub2_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) int local9 = arg1[local3];
			@Pc(13) int local13 = arg2[local3];
			@Pc(17) int local17 = arg0[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg3.aClass202Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg3.aClass202Array3[local19] = null;
					} else {
						@Pc(43) Class14 local43 = Static225.method4042(local9);
						@Pc(46) int local46 = local43.anInt351;
						@Pc(51) Class202 local51 = arg3.aClass202Array3[local19];
						if (local51 != null) {
							if (local9 == local51.anInt6226) {
								if (local46 == 0) {
									local51 = arg3.aClass202Array3[local19] = null;
								} else if (local46 == 1) {
									local51.anInt6227 = 0;
									local51.anInt6229 = local17;
									local51.anInt6230 = 0;
									local51.anInt6228 = 1;
									local51.anInt6233 = 0;
									Static167.method3265(arg3.anInt6701, arg3.anInt6702, 0, aClass8_Sub1_Sub2_Sub1_1 == arg3, local43);
								} else if (local46 == 2) {
									local51.anInt6230 = 0;
								}
							} else if (local43.anInt344 >= Static225.method4042(local51.anInt6226).anInt344) {
								local51 = arg3.aClass202Array3[local19] = null;
							}
						}
						if (local51 == null) {
							local51 = arg3.aClass202Array3[local19] = new Class202();
							local51.anInt6229 = local17;
							local51.anInt6226 = local9;
							local51.anInt6228 = 1;
							local51.anInt6233 = 0;
							local51.anInt6227 = 0;
							local51.anInt6230 = 0;
							Static167.method3265(arg3.anInt6701, arg3.anInt6702, 0, arg3 == aClass8_Sub1_Sub2_Sub1_1, local43);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIII)V")
	public static void method3080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(21) int local21 = arg0 * arg0;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = arg0 << 1;
		@Pc(42) int local42 = (1 - local33) * local13 + local25;
		@Pc(50) int local50 = local21 - (local33 - 1) * local29;
		@Pc(54) int local54 = local13 << 2;
		@Pc(58) int local58 = local21 << 2;
		@Pc(66) int local66 = local25 * 3;
		@Pc(74) int local74 = ((arg0 << 1) - 3) * local29;
		@Pc(80) int local80 = local58;
		@Pc(86) int local86 = (arg0 - 1) * local54;
		@Pc(105) int local105;
		@Pc(113) int local113;
		if (Static349.anInt6619 <= arg1 && Static195.anInt4097 >= arg1) {
			local105 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 + arg2);
			local113 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 - arg2);
			Static135.method2878(Static223.anIntArrayArray124[arg1], local105, arg3, local113);
		}
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local50 += local80;
					local42 += local66;
					local66 += local58;
					local80 += local58;
					local7++;
				}
			}
			if (local50 < 0) {
				local42 += local66;
				local50 += local80;
				local66 += local58;
				local7++;
				local80 += local58;
			}
			local50 += -local74;
			local42 += -local86;
			local86 -= local54;
			local9--;
			local74 -= local54;
			local105 = arg1 - local9;
			local113 = local9 + arg1;
			if (Static349.anInt6619 <= local113 && local105 <= Static195.anInt4097) {
				@Pc(222) int local222 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, local7 + arg4);
				@Pc(231) int local231 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 - local7);
				if (Static349.anInt6619 <= local105) {
					Static135.method2878(Static223.anIntArrayArray124[local105], local222, arg3, local231);
				}
				if (Static195.anInt4097 >= local113) {
					Static135.method2878(Static223.anIntArrayArray124[local113], local222, arg3, local231);
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZZ)V")
	public static void method3081(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static259.aBoolean383) {
			Static259.aBoolean383 = arg0;
			Static152.method3021();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIZZ)V")
	public static void method3082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static198.anInt4128 = arg0;
		Static15.anInt1162 = arg1;
		Static328.anInt6272 = arg2;
		Static1.aClass128ArrayArrayArray3 = new Class128[4][Static198.anInt4128][Static15.anInt1162];
		Static304.aClass60Array3 = new Class60[4];
		if (arg3) {
			Static24.aClass128ArrayArrayArray2 = new Class128[1][Static198.anInt4128][Static15.anInt1162];
			Static22.anIntArrayArray12 = new int[Static198.anInt4128][Static15.anInt1162];
			Static77.aClass60Array1 = new Class60[1];
		} else {
			Static24.aClass128ArrayArrayArray2 = null;
			Static22.anIntArrayArray12 = null;
			Static77.aClass60Array1 = null;
		}
		if (arg4) {
			Static134.anIntArrayArrayArray17 = new int[4][arg0][arg1];
			Static25.aClass4_Sub33_Sub1Array1 = new Class4_Sub33_Sub1[255];
			Static114.aBooleanArray14 = new boolean[255];
			Static201.anInt4146 = 0;
		} else {
			Static134.anIntArrayArrayArray17 = null;
			Static25.aClass4_Sub33_Sub1Array1 = null;
			Static114.aBooleanArray14 = null;
			Static201.anInt4146 = 0;
		}
		Static58.method1231(false);
		Static183.aClass183Array2 = new Class183[500];
		Static67.anInt1776 = 0;
		Static118.aClass183Array1 = new Class183[500];
		Static29.anInt638 = 0;
		Static180.anIntArrayArrayArray21 = new int[4][Static198.anInt4128 + 1][Static15.anInt1162 + 1];
		Static213.aClass8_Sub1Array1 = new Class8_Sub1[5000];
		Static329.anInt3942 = 0;
		Static339.aBooleanArrayArray2 = new boolean[Static328.anInt6272 + Static328.anInt6272 + 1][Static328.anInt6272 + Static328.anInt6272 + 1];
		Static229.aBooleanArrayArray6 = new boolean[Static328.anInt6272 + Static328.anInt6272 + 2][Static328.anInt6272 + Static328.anInt6272 + 2];
		Static57.aClass45_1 = null;
	}
}
