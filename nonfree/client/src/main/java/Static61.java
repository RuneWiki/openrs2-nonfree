import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "J")
	public static long aLong28;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_17 = new Class387(68, 4);

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	public static int anInt970 = -50;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBII)V")
	public static void method869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static449.anInt7746; local15++) {
			@Pc(21) Rectangle local21 = Class13_Sub11.aRectangleArray2[local15];
			if (local21.x + local21.width > arg3 && local21.x < arg3 + arg0 && local21.y + local21.height > arg1 && arg1 + arg2 > local21.y) {
				Static587.aBooleanArray26[local15] = true;
			}
		}
		Static82.method9318(arg1 + arg2, arg1, arg0 + arg3, arg3);
	}
}
