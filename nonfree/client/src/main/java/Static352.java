import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "Lclient!kb;")
	public static Class52 aClass52_31;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "Z")
	public static final boolean aBoolean483 = false;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "Z")
	public static boolean aBoolean484 = true;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
	public static void method5647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static43.anInt1148; local1++) {
			@Pc(6) Rectangle local6 = Class167.aRectangleArray2[local1];
			if (local6.x + local6.width > arg1 && local6.x < arg2 + arg1 && local6.height + local6.y > arg0 && arg0 + arg3 > local6.y) {
				Static276.aBooleanArray27[local1] = true;
			}
		}
	}
}
