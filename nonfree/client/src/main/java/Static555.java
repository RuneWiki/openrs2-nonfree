import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "[I")
	public static final int[] anIntArray694 = new int[200];

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V")
	public static void method7801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static599.anInt6161; local7++) {
			@Pc(13) Rectangle local13 = Class334.aRectangleArray1[local7];
			if (arg0 < local13.x + local13.width && local13.x < arg3 + arg0 && arg2 < local13.y + local13.height && arg2 + arg1 > local13.y) {
				Static337.aBooleanArray16[local7] = true;
			}
		}
		Static357.method5407(arg0, arg2, arg1 + arg2, arg3 + arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLclient!so;)V")
	public static void method7802(@OriginalArg(1) Class14_Sub29 arg0) {
		@Pc(17) byte[] local17 = new byte[24];
		if (Static426.aClass179_3 != null) {
			@Pc(29) int local29;
			try {
				Static426.aClass179_3.method4026(0L);
				Static426.aClass179_3.method4022(local17);
				for (local29 = 0; local29 < 24 && local17[local29] == 0; local29++) {
				}
				if (local29 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(54) Exception local54) {
				for (local29 = 0; local29 < 24; local29++) {
					local17[local29] = -1;
				}
			}
		}
		arg0.method5838(0, local17, 24);
	}
}
