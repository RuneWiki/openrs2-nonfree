import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	public static int anInt8107;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	public static int anInt8115;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	public static int anInt8111 = 0;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "[F")
	public static final float[] aFloatArray78 = new float[4];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!mc;)Lclient!aea;")
	public static Class9_Sub1 method6881(@OriginalArg(1) Class5_Sub41 arg0) {
		return new Class9_Sub1(arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7807(), arg0.method7807(), arg0.method7816());
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IFIIII[FIII[F)V")
	public static void method6906(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(5) int local5 = arg8 - arg2;
		@Pc(13) int local13 = arg4 - arg3;
		@Pc(17) int local17 = arg6 - arg7;
		@Pc(38) float local38 = arg9[2] * (float) local13 + (float) local17 * arg9[0] + (float) local5 * arg9[1];
		@Pc(59) float local59 = (float) local13 * arg9[5] + (float) local17 * arg9[3] + arg9[4] * (float) local5;
		@Pc(80) float local80 = arg9[7] * (float) local5 + arg9[6] * (float) local17 + arg9[8] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local59 * local59 + local38 * local38));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg1 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(148) float local148;
		if (arg0 == 1) {
			local148 = local106;
			local106 = -local123;
			local123 = local148;
		} else if (arg0 == 2) {
			local106 = -local106;
			local123 = -local123;
		} else if (arg0 == 3) {
			local148 = local106;
			local106 = local123;
			local123 = -local148;
		}
		arg5[1] = local123;
		arg5[0] = local106;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZILclient!d;IILclient!wm;Ljava/awt/Canvas;)Lclient!ha;")
	public static synchronized Class65 method6962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class390 arg5, @OriginalArg(7) Canvas arg6) {
		if (arg3 == 0) {
			return Static451.method6508(arg2, arg4, arg6, arg1);
		} else if (arg3 == 2) {
			return Static173.method2973(arg1, arg4, arg2, arg6);
		} else if (arg3 == 1) {
			return Static352.method8975(arg0, arg2, arg6);
		} else if (arg3 == 5) {
			return Static483.method6865(arg6, arg0, arg2, arg5);
		} else if (arg3 == 3) {
			return Static687.method5735(arg0, arg5, arg6, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
