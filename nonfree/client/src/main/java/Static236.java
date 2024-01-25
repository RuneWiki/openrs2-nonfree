import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_133 = new Class202("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "[I")
	public static final int[] anIntArray413 = new int[1];

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "[F")
	public static final float[] aFloatArray21 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
	public static int anInt4204 = 0;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIII)V")
	public static void method3660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg1 + 1;
		Static403.method6377(arg2, Static130.anIntArrayArray89[arg1], arg3, arg4);
		@Pc(18) int local18 = arg0 - 1;
		Static403.method6377(arg2, Static130.anIntArrayArray89[arg0], arg3, arg4);
		for (@Pc(25) int local25 = local5; local25 <= local18; local25++) {
			@Pc(31) int[] local31 = Static130.anIntArrayArray89[local25];
			local31[arg4] = local31[arg3] = arg2;
		}
	}
}
