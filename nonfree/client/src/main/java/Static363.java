import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!naa", name = "x", descriptor = "I")
	public static int anInt1643;

	@OriginalMember(owner = "client!naa", name = "y", descriptor = "[I")
	public static int[] anIntArray57;

	@OriginalMember(owner = "client!naa", name = "q", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_26 = new Class130(51, 4);

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)V")
	public static void method1643(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub4_Sub12 local13 = Static556.method8018(2, arg0);
		local13.method3607();
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIBI)V")
	public static void method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static619.anInt10014; local11++) {
			@Pc(17) Rectangle local17 = Class10_Sub2.aRectangleArray2[local11];
			if (arg2 < local17.x + local17.width && arg2 + arg3 > local17.x && arg0 < local17.y + local17.height && arg1 + arg0 > local17.y) {
				Static314.aBooleanArray17[local11] = true;
			}
		}
		Static520.method8069(arg2, arg0, arg3 + arg2, arg0 - -arg1);
	}
}
