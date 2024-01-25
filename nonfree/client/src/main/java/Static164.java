import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "Lclient!ok;")
	public static Class178 aClass178_45;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_53 = new Class2(44, 3);

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
	public static int anInt2971 = -1;

	@OriginalMember(owner = "client!hs", name = "J", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!fe;Lclient!fe;ZIZ)I")
	public static int method2383(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(17) int local17;
		if (arg3 == 1) {
			local14 = arg1.anInt2214;
			local17 = arg0.anInt2214;
			if (!arg2) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local17 == -1) {
					local17 = 2001;
				}
			}
			return local14 - local17;
		} else if (arg3 == 2) {
			return Static290.method3850(arg0.method1892().aString33, Static5.anInt20, arg1.method1892().aString33);
		} else if (arg3 == 3) {
			if (arg1.aString19.equals("-")) {
				if (arg0.aString19.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString19.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static290.method3850(arg0.aString19, Static5.anInt20, arg1.aString19);
			}
		} else if (arg3 == 4) {
			if (arg1.method1880()) {
				return arg0.method1880() ? 0 : 1;
			} else if (arg0.method1880()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method1885()) {
				return arg0.method1885() ? 0 : 1;
			} else if (arg0.method1885()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method1887()) {
				return arg0.method1887() ? 0 : 1;
			} else if (arg0.method1887()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method1882()) {
				return arg0.method1882() ? 0 : 1;
			} else if (arg0.method1882()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local14 = arg1.anInt2228;
			local17 = arg0.anInt2228;
			if (arg2) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local17 == 1000) {
					local17 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local17 == -1) {
					local17 = 1000;
				}
			}
			return local14 - local17;
		} else {
			return arg1.anInt2225 - arg0.anInt2225;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIFF[FIIIIII)V")
	public static void method2387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg0 - arg5;
		@Pc(13) int local13 = arg9 - arg6;
		@Pc(17) int local17 = arg7 - arg8;
		@Pc(38) float local38 = arg4[2] * (float) local5 + arg4[0] * (float) local13 + arg4[1] * (float) local17;
		@Pc(59) float local59 = (float) local5 * arg4[5] + arg4[4] * (float) local17 + arg4[3] * (float) local13;
		@Pc(80) float local80 = arg4[8] * (float) local5 + (float) local17 * arg4[7] + arg4[6] * (float) local13;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local91 *= arg3;
		}
		@Pc(105) float local105 = local59 + arg2 + 0.5F;
		@Pc(110) float local110;
		if (arg1 == 1) {
			local110 = local91;
			local91 = -local105;
			local105 = local110;
		} else if (arg1 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg1 == 3) {
			local110 = local91;
			local91 = local105;
			local105 = -local110;
		}
		Static83.aFloat222 = local91;
		Static60.aFloat27 = local105;
	}
}
