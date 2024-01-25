import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "[I")
	public static final int[] anIntArray356 = new int[3];

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_49 = new Class70(36, 16);

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
	public static int anInt4536 = 0;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	public static int anInt4537 = -1;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
	public static void method3676(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static250.method3703(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(FIFIIFFIIIF[BLclient!tk;)V")
	public static void method3677(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) float arg4, @OriginalArg(10) float arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) Class230 arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static213.method3334(arg6, arg4, arg3, arg5, arg0, arg2, local3, arg1, arg7);
			arg1 += 16384;
		}
	}
}
