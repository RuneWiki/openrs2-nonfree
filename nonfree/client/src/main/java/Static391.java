import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString69 = null;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method5690() {
		@Pc(9) Class265 local9 = Static540.aClass265_59;
		synchronized (Static540.aClass265_59) {
			Static540.aClass265_59.method6568();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
	public static void method5695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static283.anInt4411; local1++) {
			@Pc(9) Rectangle local9 = Class305.aRectangleArray1[local1];
			if (local9.width + local9.x > arg1 && local9.x < arg1 + arg3 && arg2 < local9.height + local9.y && arg0 + arg2 > local9.y) {
				Static209.aBooleanArray4[local1] = true;
			}
		}
		Static430.method7439(arg2, arg2 + arg0, arg1, arg1 + arg3);
	}
}
