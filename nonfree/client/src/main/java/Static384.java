import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	public static int anInt6890 = 0;

	@OriginalMember(owner = "client!np", name = "hb", descriptor = "S")
	public static short aShort100 = 256;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IBI[FIFIF[FIIFII)V")
	public static void method5782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(9) int local9 = arg8 - arg11;
		@Pc(13) int local13 = arg9 - arg0;
		@Pc(17) int local17 = arg3 - arg5;
		@Pc(38) float local38 = (float) local13 * arg2[2] + arg2[1] * (float) local9 + (float) local17 * arg2[0];
		@Pc(64) float local64 = (float) local17 * arg2[3] + arg2[4] * (float) local9 + (float) local13 * arg2[5];
		@Pc(85) float local85 = (float) local13 * arg2[8] + (float) local17 * arg2[6] + (float) local9 * arg2[7];
		@Pc(103) float local103;
		@Pc(97) float local97;
		if (arg12 == 0) {
			local97 = arg6 + 0.5F - local85;
			local103 = arg10 + local38 + 0.5F;
		} else if (arg12 == 1) {
			local97 = local85 + arg6 + 0.5F;
			local103 = arg10 + local38 + 0.5F;
		} else if (arg12 == 2) {
			local97 = arg4 + 0.5F - local64;
			local103 = arg10 + 0.5F - local38;
		} else if (arg12 == 3) {
			local97 = arg4 + 0.5F - local64;
			local103 = local38 + arg10 + 0.5F;
		} else if (arg12 == 4) {
			local97 = arg4 + 0.5F - local64;
			local103 = local85 + arg6 + 0.5F;
		} else {
			local103 = arg6 + 0.5F - local85;
			local97 = arg4 + 0.5F - local64;
		}
		@Pc(200) float local200;
		if (arg1 == 1) {
			local200 = local103;
			local103 = -local97;
			local97 = local200;
		} else if (arg1 == 2) {
			local97 = -local97;
			local103 = -local103;
		} else if (arg1 == 3) {
			local200 = local103;
			local103 = local97;
			local97 = -local200;
		}
		arg7[1] = local97;
		arg7[0] = local103;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLjava/awt/Component;Z)Lclient!ec;")
	public static Class40 method5786(@OriginalArg(1) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class40_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class40) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(50) Throwable local50) {
			return new Class40_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Z")
	public static boolean method5787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public static void method5790(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub5_Sub10 local14 = Static594.method8175(arg0, 12);
		local14.method4387();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!oga;")
	public static Class32 method5791(@OriginalArg(0) Component arg0) {
		return new Class32_Sub1(arg0);
	}
}
