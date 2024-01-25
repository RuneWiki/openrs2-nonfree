import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!cl;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	public static int anInt2704;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!or;")
	public static final Class244 aClass244_23 = new Class244();

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZI)V")
	public static void method2275(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static262.anInt5047--;
			if (Static262.anInt5047 == 0) {
				Static133.anIntArray113 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static168.anInt3738--;
		if (Static168.anInt3738 == 0) {
			Static422.anIntArray428 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!fa;Ljava/awt/Canvas;)Lclient!r;")
	public static Class31 method2276(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Canvas arg1) {
		return new l(arg1, arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBFIIFII[FIFII)V")
	public static void method2277(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg10 - arg8;
		@Pc(9) int local9 = arg11 - arg0;
		@Pc(13) int local13 = arg5 - arg6;
		@Pc(38) float local38 = arg7[2] * (float) local9 + (float) local5 * arg7[0] + arg7[1] * (float) local13;
		@Pc(59) float local59 = (float) local9 * arg7[5] + (float) local13 * arg7[4] + (float) local5 * arg7[3];
		@Pc(85) float local85 = (float) local9 * arg7[8] + arg7[7] * (float) local13 + arg7[6] * (float) local5;
		@Pc(100) float local100;
		@Pc(94) float local94;
		if (arg2 == 0) {
			local94 = arg1 + 0.5F - local85;
			local100 = arg4 + local38 + 0.5F;
		} else if (arg2 == 1) {
			local94 = arg1 + local85 + 0.5F;
			local100 = arg4 + local38 + 0.5F;
		} else if (arg2 == 2) {
			local100 = arg4 + 0.5F - local38;
			local94 = arg9 + 0.5F - local59;
		} else if (arg2 == 3) {
			local94 = arg9 + 0.5F - local59;
			local100 = local38 + arg4 + 0.5F;
		} else if (arg2 == 4) {
			local100 = local85 + arg1 + 0.5F;
			local94 = arg9 + 0.5F - local59;
		} else {
			local100 = arg1 + 0.5F - local85;
			local94 = arg9 + 0.5F - local59;
		}
		@Pc(215) float local215;
		if (arg3 == 1) {
			local215 = local100;
			local100 = -local94;
			local94 = local215;
		} else if (arg3 == 2) {
			local94 = -local94;
			local100 = -local100;
		} else if (arg3 == 3) {
			local215 = local100;
			local100 = local94;
			local94 = -local215;
		}
		Static210.aFloat211 = local94;
		Static291.aFloat129 = local100;
	}
}
