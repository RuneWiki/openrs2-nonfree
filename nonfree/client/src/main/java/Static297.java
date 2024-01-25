import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
	public static int anInt7294;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "[I")
	public static final int[] anIntArray433 = new int[50];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V")
	public static void method6206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static595.anInt9912; local1++) {
			@Pc(9) Rectangle local9 = Class6.aRectangleArray148[local1];
			if (local9.width + local9.x > arg0 && arg2 + arg0 > local9.x && arg1 < local9.height + local9.y && local9.y < arg3 + arg1) {
				Static623.aBooleanArray57[local1] = true;
			}
		}
		Static347.method5621(arg1 + arg3, arg0 + arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I")
	public static int method6208(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
