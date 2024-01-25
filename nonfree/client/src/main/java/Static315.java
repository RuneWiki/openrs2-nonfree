import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_169 = new Class235(106, 8);

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
	public static int anInt5405 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V")
	public static void method4375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static348.aClass1_Sub30_Sub1_1.anInt4865 * arg0 >> 8;
		if (arg2 == -1 && !Static340.aBoolean451) {
			Static587.method7823();
		} else if (arg2 != -1 && (Static300.anInt5153 != arg2 || !Static550.method7492()) && local10 != 0 && !Static340.aBoolean451) {
			Static13.method130(local10, arg1, arg2, Static358.aClass270_69);
		}
		Static300.anInt5153 = arg2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)V")
	public static void method4378(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = 0; local16 < Static367.anInt6098; local16++) {
			@Pc(22) Rectangle local22 = Class81.aRectangleArray1[local16];
			if (local22.x + local22.width > arg2 && arg3 + arg2 > local22.x && local22.height + local22.y > arg1 && arg1 + arg0 > local22.y) {
				Static544.aBooleanArray24[local16] = true;
			}
		}
	}
}
