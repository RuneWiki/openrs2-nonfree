import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
	public static int anInt7371;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
	public static int anInt7372 = 0;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
	public static int anInt7377 = 0;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BI)I")
	public static int method6426(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method6429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19;
		if (Static31.method728(arg1)) {
			local19 = 0;
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			if (Static148.aBoolean241) {
				local36 = Static82.anInt2149;
				local34 = Static457.anInt8803;
				local19 = Static515.anInt8310;
				local40 = Static412.anInt6936;
				local38 = Static252.anInt4805;
				Static412.anInt6936 = 1;
			}
			if (Static649.aClass303ArrayArray5[arg1] == null) {
				Static439.method6317(arg5, arg6, arg2, arg0, arg3, -1, arg7, arg4, Static261.aClass303ArrayArray1[arg1], arg7 < 0);
			} else {
				Static439.method6317(arg5, arg6, arg2, arg0, arg3, -1, arg7, arg4, Static649.aClass303ArrayArray5[arg1], arg7 < 0);
			}
			if (Static148.aBoolean241) {
				if (arg7 >= 0 && Static412.anInt6936 == 2) {
					Static103.method1953(Static457.anInt8803, Static82.anInt2149, Static515.anInt8310, Static252.anInt4805);
				}
				Static515.anInt8310 = local19;
				Static457.anInt8803 = local34;
				Static412.anInt6936 = local40;
				Static252.anInt4805 = local38;
				Static82.anInt2149 = local36;
			}
		} else if (arg7 == -1) {
			for (local19 = 0; local19 < 100; local19++) {
				Static377.aBooleanArray14[local19] = true;
			}
		} else {
			Static377.aBooleanArray14[arg7] = true;
		}
	}
}
