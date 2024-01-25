import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Lclient!dt;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_79 = new Class263(17, -1);

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_45 = new Class177(1, 4);

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
	public static int anInt3147 = 2;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BIIIIIII)V")
	public static void method2319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg5 < 0 || Static209.anInt4283 - 1 <= arg0 || Static211.anInt4295 - 1 <= arg5) {
			return;
		}
		if (Static67.aClass252ArrayArrayArray2 == null) {
			return;
		}
		@Pc(41) Interface5 local41;
		if (arg6 == 0) {
			local41 = (Interface5) Static232.method3536(arg2, arg0, arg5);
			@Pc(241) Interface5 local241 = (Interface5) Static220.method3426(arg2, arg0, arg5);
			if (local41 != null && arg1 != 2) {
				if (local41 instanceof Class30_Sub3_Sub3) {
					((Class30_Sub3_Sub3) local41).aClass196_2.method4399(arg4);
				} else {
					Static299.method940(arg3, arg0, arg5, local41.method5730(), arg6, arg4, arg1, arg2);
				}
			}
			if (local241 != null) {
				if (local241 instanceof Class30_Sub3_Sub3) {
					((Class30_Sub3_Sub3) local241).aClass196_2.method4399(arg4);
				} else {
					Static299.method940(arg3, arg0, arg5, local241.method5730(), arg6, arg4, arg1, arg2);
				}
			}
		} else if (arg6 == 1) {
			local41 = (Interface5) Static392.method5433(arg2, arg0, arg5);
			if (local41 != null) {
				if (local41 instanceof Class30_Sub2_Sub3) {
					((Class30_Sub2_Sub3) local41).aClass196_3.method4399(arg4);
				} else {
					@Pc(57) int local57 = local41.method5730();
					if (arg1 == 4 || arg1 == 5) {
						Static299.method940(arg3, arg0, arg5, local57, arg6, arg4, 4, arg2);
					} else if (arg1 == 6) {
						Static299.method940(arg3 + 4, arg0, arg5, local57, arg6, arg4, 4, arg2);
					} else if (arg1 == 7) {
						Static299.method940((arg3 + 2 & 0x3) + 4, arg0, arg5, local57, arg6, arg4, 4, arg2);
					} else if (arg1 == 8) {
						Static299.method940(arg3 + 4, arg0, arg5, local57, arg6, arg4, 4, arg2);
						Static299.method940((arg3 + 2 & 0x3) + 4, arg0, arg5, local57, arg6, arg4, 4, arg2);
					}
				}
			}
		} else if (arg6 == 2) {
			local41 = (Interface5) Static461.method5974(arg2, arg0, arg5, jg.class);
			if (local41 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local41 instanceof Class30_Sub1_Sub6) {
					((Class30_Sub1_Sub6) local41).aClass196_4.method4399(arg4);
				} else {
					Static299.method940(arg3, arg0, arg5, local41.method5730(), arg6, arg4, arg1, arg2);
				}
			}
		} else if (arg6 == 3) {
			local41 = (Interface5) Static454.method6163(arg2, arg0, arg5);
			if (local41 != null) {
				if (local41 instanceof Class30_Sub4_Sub1) {
					((Class30_Sub4_Sub1) local41).aClass196_1.method4399(arg4);
				} else {
					Static299.method940(arg3, arg0, arg5, local41.method5730(), arg6, arg4, arg1, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!bl;B)I")
	public static int method2320(@OriginalArg(0) Class30_Sub1_Sub1_Sub1 arg0) {
		@Pc(6) Class11 local6 = arg0.aClass11_1;
		if (local6.anIntArray12 != null) {
			local6 = local6.method136(Static366.aClass190_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local6.anInt165;
		@Pc(37) Class212 local37 = arg0.method948();
		if (arg0.aBoolean81) {
			local21 = local6.anInt154;
		} else if (arg0.anInt1255 == local37.anInt6253 || local37.anInt6267 == arg0.anInt1255 || local37.anInt6291 == arg0.anInt1255 || arg0.anInt1255 == local37.anInt6278) {
			local21 = local6.anInt153;
		} else if (local37.anInt6275 == arg0.anInt1255 || arg0.anInt1255 == local37.anInt6259 || local37.anInt6280 == arg0.anInt1255 || arg0.anInt1255 == local37.anInt6245) {
			local21 = local6.anInt158;
		}
		return local21;
	}
}
