import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	public static int anInt2715;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public static int anInt2716;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 3)
	public static void method2711() {
		Static261.anInt5347 = Static106.aClass239_2.anInt6823 + Static106.aClass239_2.anInt6833 + 2;
		Static117.aStringArray65 = new String[500];
		Static74.anInt6297 = Static155.aClass239_3.anInt6833 + Static155.aClass239_3.anInt6823 + 2;
		for (@Pc(34) int local34 = 0; local34 < Static117.aStringArray65.length; local34++) {
			Static117.aStringArray65[local34] = "";
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII)V", line = 28)
	public static void method2712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Class109.anInt2803; local8++) {
			@Pc(14) Rectangle local14 = Class55.aRectangleArray1[local8];
			if (arg1 < local14.x + local14.width && local14.x < arg3 + arg1 && local14.y + local14.height > arg0 && arg0 + arg2 > local14.y) {
				Class243.aBooleanArray64[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)I", line = 57)
	public static int method2713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
