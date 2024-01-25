import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
	public static int anInt2616;

	@OriginalMember(owner = "client!dv", name = "A", descriptor = "Lclient!bca;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_88 = new Class123(31, -2);

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "Lclient!tr;")
	public static final Class321 aClass321_1 = new Class321(16);

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "Lclient!or;")
	public static final Class244 aClass244_19 = new Class244();

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "[I")
	public static final int[] anIntArray87 = new int[13];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIII[II)Z")
	public static boolean method2188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg1 > Static69.anInt6608) {
			arg1 = Static69.anInt6608;
		}
		if (arg1 <= arg2) {
			return true;
		}
		arg0 += arg2 - 1;
		@Pc(33) int local33 = arg1 - arg2 >> 2;
		arg3 += arg5 * arg2;
		@Pc(52) int local52;
		@Pc(66) int local66;
		if (Static412.anInt7415 == 1) {
			Static325.anInt5933 += local33;
			while (true) {
				local33--;
				if (local33 < 0) {
					local33 = arg1 - arg2 & 0x3;
					while (true) {
						local33--;
						if (local33 < 0) {
							return true;
						}
						arg0++;
						if (arg3 < arg4[arg0]) {
							arg4[arg0] = arg3;
						}
						arg3 += arg5;
					}
				}
				local52 = arg0 + 1;
				if (arg4[local52] > arg3) {
					arg4[local52] = arg3;
				}
				local66 = arg3 + arg5;
				local52++;
				if (arg4[local52] > local66) {
					arg4[local52] = local66;
				}
				local66 += arg5;
				local52++;
				if (arg4[local52] > local66) {
					arg4[local52] = local66;
				}
				local66 += arg5;
				arg0 = local52 + 1;
				if (local66 < arg4[arg0]) {
					arg4[arg0] = local66;
				}
				arg3 = local66 + arg5;
			}
		} else {
			arg3 -= 38400;
			while (true) {
				local33--;
				if (local33 < 0) {
					local33 = arg1 - arg2 & 0x3;
					while (true) {
						local33--;
						if (local33 < 0) {
							return true;
						}
						arg0++;
						if (arg3 < arg4[arg0]) {
							return false;
						}
						arg3 += arg5;
					}
				}
				local52 = arg0 + 1;
				if (arg4[local52] > arg3) {
					return false;
				}
				local66 = arg3 + arg5;
				local52++;
				if (local66 < arg4[local52]) {
					return false;
				}
				local66 += arg5;
				local52++;
				if (local66 < arg4[local52]) {
					return false;
				}
				local66 += arg5;
				arg0 = local52 + 1;
				if (local66 < arg4[arg0]) {
					return false;
				}
				arg3 = local66 + arg5;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(JB)V")
	public static void method2189(@OriginalArg(0) long arg0) {
		@Pc(14) int local14 = Static411.anInt7378 + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476;
		@Pc(20) int local20 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 + Static196.anInt4253;
		if (Static377.anInt6530 - local14 < -2000 || Static377.anInt6530 - local14 > 2000 || Static262.anInt5037 - local20 < -2000 || Static262.anInt5037 - local20 > 2000) {
			Static377.anInt6530 = local14;
			Static262.anInt5037 = local20;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (local14 != Static377.anInt6530) {
			local62 = local14 - Static377.anInt6530;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local62 > local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local62 < local70) {
				local70 = local62;
			}
			Static377.anInt6530 += local70;
		}
		if (!Static348.aClass3_Sub51_Sub1_5.aBoolean681) {
			Static123.aFloat75 += (float) arg0 * Static240.aFloat116 / 6.0F;
			Static209.aFloat229 += (float) arg0 * Static1.aFloat1 / 6.0F;
		}
		if (local20 != Static262.anInt5037) {
			local62 = local20 - Static262.anInt5037;
			local70 = (int) ((long) local62 * arg0 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local70 < local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local70 > local62) {
				local70 = local62;
			}
			Static262.anInt5037 += local70;
		}
		Static459.method6313();
	}
}
