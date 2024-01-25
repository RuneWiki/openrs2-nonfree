import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	public static int anInt6720;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "[[Lclient!aca;")
	public static Class5[][] aClass5ArrayArray1;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[6][];

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_99 = new Class98(12, 0);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
	public static void method5431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static97.anInt1562; local3++) {
			@Pc(9) Rectangle local9 = Class343.aRectangleArray5[local3];
			if (local9.width + local9.x > arg1 && arg1 + arg2 > local9.x && arg3 < local9.y + local9.height && local9.y < arg3 + arg0) {
				Static543.aBooleanArray30[local3] = true;
			}
		}
	}
}
