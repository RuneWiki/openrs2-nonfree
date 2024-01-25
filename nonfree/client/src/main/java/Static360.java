import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FFIIIIIIIZIF[F)V")
	public static void method5431(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) float[] arg11) {
		@Pc(5) int local5 = arg2 - arg9;
		@Pc(13) int local13 = arg8 - arg3;
		@Pc(17) int local17 = arg6 - arg5;
		@Pc(38) float local38 = (float) local17 * arg11[2] + (float) local5 * arg11[1] + (float) local13 * arg11[0];
		@Pc(59) float local59 = (float) local13 * arg11[3] + (float) local5 * arg11[4] + arg11[5] * (float) local17;
		@Pc(80) float local80 = arg11[6] * (float) local13 + (float) local5 * arg11[7] + arg11[8] * (float) local17;
		@Pc(88) float local88;
		@Pc(95) float local95;
		if (arg7 == 0) {
			local88 = local38 + arg1 + 0.5F;
			local95 = arg0 + 0.5F - local80;
		} else if (arg7 == 1) {
			local88 = arg1 + local38 + 0.5F;
			local95 = local80 + arg0 + 0.5F;
		} else if (arg7 == 2) {
			local95 = arg10 + 0.5F - local59;
			local88 = arg1 + 0.5F - local38;
		} else if (arg7 == 3) {
			local95 = arg10 + 0.5F - local59;
			local88 = local38 + arg1 + 0.5F;
		} else if (arg7 == 4) {
			local88 = arg0 + local80 + 0.5F;
			local95 = arg10 + 0.5F - local59;
		} else {
			local95 = arg10 + 0.5F - local59;
			local88 = arg0 + 0.5F - local80;
		}
		@Pc(200) float local200;
		if (arg4 == 1) {
			local200 = local88;
			local88 = -local95;
			local95 = local200;
		} else if (arg4 == 2) {
			local95 = -local95;
			local88 = -local88;
		} else if (arg4 == 3) {
			local200 = local88;
			local88 = local95;
			local95 = -local200;
		}
		Static63.aFloat17 = local95;
		Static225.aFloat112 = local88;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
	public static void method5432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(27) Class98_Sub2 local27 = (Class98_Sub2) Static328.aClass40_5.method1132(); local27 != null; local27 = (Class98_Sub2) Static328.aClass40_5.method1129()) {
			if (Static312.anInt5688 >= local27.anInt3184) {
				local27.method7855();
			} else {
				Static134.method2627((local27.anInt3187 << 9) + 256, arg3 >> 1, local27.anInt3182 * 2, (local27.anInt3183 << 9) + 256, local27.anInt3181, arg0 >> 1);
				Static114.aClass92_4.method6387(Static373.anIntArray490[0] + arg2, local27.aString25, local27.anInt3185 | 0xFF000000, 0, Static373.anIntArray490[1] + arg1);
			}
		}
	}
}
