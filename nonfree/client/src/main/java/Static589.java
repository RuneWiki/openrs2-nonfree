import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	public static int anInt9568;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "[I")
	public static final int[] anIntArray715 = new int[14];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ji;B)Lclient!bk;")
	public static Class32 method7801(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(16) int local16 = arg0.method6036();
		return new Class32(local16);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIII)V")
	public static void method7802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 < arg3) {
			Static208.method3687(arg2, arg1, Static454.anIntArrayArray71[arg0], arg3);
		} else {
			Static208.method3687(arg3, arg1, Static454.anIntArrayArray71[arg0], arg2);
		}
	}
}
