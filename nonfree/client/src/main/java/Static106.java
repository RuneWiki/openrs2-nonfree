import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fq", name = "N", descriptor = "[I")
	public static final int[] anIntArray196 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!fq", name = "Q", descriptor = "F")
	public static float aFloat8 = 0.0F;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(III)V")
	public static void method1901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class189 local9 = Static169.aClass189ArrayArray3[arg1][arg0];
		if (local9 != null) {
			Static77.anInt1695 = local9.anInt5249;
			Static209.anInt4261 = local9.anInt5256;
			Static383.anInt6967 = local9.anInt5251;
		}
		Static270.method4571();
	}
}
