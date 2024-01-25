import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_9 = new Class215(12, 4);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BIIII)V")
	public static void method4602(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static453.anInt7674; local15++) {
			@Pc(21) Rectangle local21 = Class18_Sub3.aRectangleArray1[local15];
			if (arg3 < local21.x + local21.width && arg3 + arg2 > local21.x && local21.height + local21.y > arg1 && arg1 + arg0 > local21.y) {
				Static110.aBooleanArray5[local15] = true;
			}
		}
		Static304.method7235(arg3 + arg2, arg1 + arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBI)I")
	public static int method4603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (local7 + arg1) / arg0 - local7;
	}
}
