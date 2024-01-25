import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "Ljava/awt/Image;")
	public static Image anImage12;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "[I")
	public static int[] anIntArray300;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
	public static void method3150() {
		@Pc(5) Class165 local5 = Static643.aClass165_77;
		synchronized (Static643.aClass165_77) {
			Static643.aClass165_77.method4400();
		}
		local5 = Static291.aClass165_34;
		synchronized (Static291.aClass165_34) {
			Static291.aClass165_34.method4400();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[FIIIIII[FFIIFF)V")
	public static void method3151(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11, @OriginalArg(13) float arg12) {
		@Pc(5) int local5 = arg10 - arg3;
		@Pc(9) int local9 = arg9 - arg4;
		@Pc(13) int local13 = arg5 - arg6;
		@Pc(38) float local38 = arg7[2] * (float) local9 + arg7[0] * (float) local13 + arg7[1] * (float) local5;
		@Pc(59) float local59 = arg7[5] * (float) local9 + arg7[4] * (float) local5 + arg7[3] * (float) local13;
		@Pc(80) float local80 = arg7[7] * (float) local5 + (float) local13 * arg7[6] + (float) local9 * arg7[8];
		@Pc(102) float local102;
		@Pc(109) float local109;
		if (arg0 == 0) {
			local109 = arg8 + 0.5F - local80;
			local102 = arg11 + local38 + 0.5F;
		} else if (arg0 == 1) {
			local102 = local38 + arg11 + 0.5F;
			local109 = arg8 + local80 + 0.5F;
		} else if (arg0 == 2) {
			local102 = arg11 + 0.5F - local38;
			local109 = arg12 + 0.5F - local59;
		} else if (arg0 == 3) {
			local109 = arg12 + 0.5F - local59;
			local102 = local38 + arg11 + 0.5F;
		} else if (arg0 == 4) {
			local102 = arg8 + local80 + 0.5F;
			local109 = arg12 + 0.5F - local59;
		} else {
			local102 = arg8 + 0.5F - local80;
			local109 = arg12 + 0.5F - local59;
		}
		@Pc(199) float local199;
		if (arg2 == 1) {
			local199 = local102;
			local102 = -local109;
			local109 = local199;
		} else if (arg2 == 2) {
			local109 = -local109;
			local102 = -local102;
		} else if (arg2 == 3) {
			local199 = local102;
			local102 = local109;
			local109 = -local199;
		}
		arg1[1] = local109;
		arg1[0] = local102;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIII)V")
	public static void method3152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg3;
		@Pc(15) int local15 = arg0 - arg2;
		if (local10 == 0) {
			if (local15 != 0) {
				Static376.method5446(arg2, arg3, arg4, arg0);
			}
		} else if (local15 == 0) {
			Static638.method8434(arg4, arg2, arg1, arg3);
		} else {
			@Pc(41) int local41 = (local15 << 12) / local10;
			@Pc(50) int local50 = arg2 - (arg3 * local41 >> 12);
			@Pc(68) int local68;
			@Pc(66) int local66;
			if (arg3 < Static7.anInt93) {
				local66 = (local41 * Static7.anInt93 >> 12) + local50;
				local68 = Static7.anInt93;
			} else if (Static115.anInt2377 < arg3) {
				local68 = Static115.anInt2377;
				local66 = (Static115.anInt2377 * local41 >> 12) + local50;
			} else {
				local66 = arg2;
				local68 = arg3;
			}
			@Pc(102) int local102;
			@Pc(100) int local100;
			if (arg1 < Static7.anInt93) {
				local100 = (Static7.anInt93 * local41 >> 12) + local50;
				local102 = Static7.anInt93;
			} else if (arg1 <= Static115.anInt2377) {
				local100 = arg0;
				local102 = arg1;
			} else {
				local100 = local50 + (local41 * Static115.anInt2377 >> 12);
				local102 = Static115.anInt2377;
			}
			if (local100 < Static374.anInt5986) {
				local102 = (Static374.anInt5986 - local50 << 12) / local41;
				local100 = Static374.anInt5986;
			} else if (Static84.anInt1667 < local100) {
				local100 = Static84.anInt1667;
				local102 = (Static84.anInt1667 - local50 << 12) / local41;
			}
			if (Static374.anInt5986 > local66) {
				local68 = (Static374.anInt5986 - local50 << 12) / local41;
				local66 = Static374.anInt5986;
			} else if (local66 > Static84.anInt1667) {
				local66 = Static84.anInt1667;
				local68 = (Static84.anInt1667 - local50 << 12) / local41;
			}
			Static536.method7971(arg4, local66, local100, local102, local68);
		}
	}
}
