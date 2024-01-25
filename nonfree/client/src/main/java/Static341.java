import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	public static int anInt6104;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_272 = new Class296(60, -1);

	@OriginalMember(owner = "client!of", name = "p", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Z")
	public static boolean aBoolean437 = false;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_273 = new Class296(35, -1);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBFFFII[FIIII)V")
	public static void method5167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(13) int local13 = arg11 - arg6;
		@Pc(21) int local21 = arg1 - arg5;
		@Pc(25) int local25 = arg10 - arg9;
		@Pc(46) float local46 = (float) local25 * arg7[2] + arg7[0] * (float) local21 + arg7[1] * (float) local13;
		@Pc(67) float local67 = arg7[3] * (float) local21 + arg7[4] * (float) local13 + arg7[5] * (float) local25;
		@Pc(88) float local88 = arg7[8] * (float) local25 + arg7[6] * (float) local21 + arg7[7] * (float) local13;
		@Pc(113) float local113;
		@Pc(106) float local106;
		if (arg0 == 0) {
			local113 = arg2 + local46 + 0.5F;
			local106 = arg3 + 0.5F - local88;
		} else if (arg0 == 1) {
			local113 = local46 + arg2 + 0.5F;
			local106 = local88 + arg3 + 0.5F;
		} else if (arg0 == 2) {
			local106 = arg4 + 0.5F - local67;
			local113 = arg2 + 0.5F - local46;
		} else if (arg0 == 3) {
			local113 = arg2 + local46 + 0.5F;
			local106 = arg4 + 0.5F - local67;
		} else if (arg0 == 4) {
			local106 = arg4 + 0.5F - local67;
			local113 = local88 + arg3 + 0.5F;
		} else {
			local113 = arg3 + 0.5F - local88;
			local106 = arg4 + 0.5F - local67;
		}
		@Pc(217) float local217;
		if (arg8 == 1) {
			local217 = local113;
			local113 = -local106;
			local106 = local217;
		} else if (arg8 == 2) {
			local106 = -local106;
			local113 = -local113;
		} else if (arg8 == 3) {
			local217 = local113;
			local113 = local106;
			local106 = -local217;
		}
		Static284.aFloat108 = local106;
		Static135.aFloat31 = local113;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILclient!jc;)V")
	public static void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class49_Sub2_Sub2_Sub2 arg2) {
		if (arg1 == arg2.anInt4297 && arg1 != -1) {
			@Pc(11) Class199 local11 = Static182.aClass218_1.method5221(arg1);
			@Pc(14) int local14 = local11.anInt5744;
			if (local14 == 1) {
				arg2.anInt4265 = 0;
				arg2.anInt4293 = 0;
				arg2.anInt4288 = 1;
				arg2.anInt4316 = arg0;
				arg2.anInt4303 = 0;
				Static381.method5839(arg2.anInt7141, false, local11, arg2.anInt4303, arg2.aByte98, arg2.anInt7137);
			}
			if (local14 == 2) {
				arg2.anInt4293 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt4297 == -1 || Static182.aClass218_1.method5221(arg1).anInt5750 >= Static182.aClass218_1.method5221(arg2.anInt4297).anInt5750) {
			arg2.anInt4339 = arg2.anInt4338;
			arg2.anInt4297 = arg1;
			arg2.anInt4293 = 0;
			arg2.anInt4288 = 1;
			arg2.anInt4303 = 0;
			arg2.anInt4316 = arg0;
			arg2.anInt4265 = 0;
			if (arg2.anInt4297 != -1) {
				Static381.method5839(arg2.anInt7141, false, Static182.aClass218_1.method5221(arg2.anInt4297), arg2.anInt4303, arg2.aByte98, arg2.anInt7137);
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method5170() {
		Static174.aClass313_23.method7398();
	}
}
