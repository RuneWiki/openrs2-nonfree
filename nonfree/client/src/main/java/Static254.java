import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mq", name = "Uc", descriptor = "I")
	public static int anInt4875;

	@OriginalMember(owner = "client!mq", name = "kd", descriptor = "I")
	public static int anInt4882;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
	public static int anInt4793 = 0;

	@OriginalMember(owner = "client!mq", name = "Zc", descriptor = "[F")
	public static final float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
	public static void method3766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class118 local28 = Static263.aClass118ArrayArrayArray2[local9][arg0][arg1] = Static263.aClass118ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte66--;
				for (@Pc(40) Class179 local40 = local28.aClass179_2; local40 != null; local40 = local40.aClass179_3) {
					@Pc(44) Class7_Sub2 local44 = local40.aClass7_Sub2_2;
					if (local44.aShort71 == arg0 && local44.aShort73 == arg1) {
						local44.aByte77--;
					}
				}
			}
		}
		if (Static263.aClass118ArrayArrayArray2[0][arg0][arg1] == null) {
			Static263.aClass118ArrayArrayArray2[0][arg0][arg1] = new Class118(0, arg0, arg1);
			Static263.aClass118ArrayArrayArray2[0][arg0][arg1].aByte63 = 1;
		}
		Static263.aClass118ArrayArrayArray2[0][arg0][arg1].aClass118_1 = local7;
		Static263.aClass118ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
