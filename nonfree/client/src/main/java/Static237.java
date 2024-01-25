import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array7;

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "[I")
	public static int[] anIntArray237 = new int[1];

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public static void method3381() {
		if (Static322.aClass378ArrayArray1 == null) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < Static322.aClass378ArrayArray1.length; local7++) {
			for (@Pc(10) int local10 = 0; local10 < Static322.aClass378ArrayArray1[local7].length; local10++) {
				Static322.aClass378ArrayArray1[local7][local10] = Static477.aClass378_4;
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)Lclient!ib;")
	public static Class160_Sub1 method3382() {
		Static375.anInt6552 = 0;
		return Static140.method2103();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)I")
	public static int method3383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static21.method156(arg1 + 45365, 4, arg0 + 91923) + (Static21.method156(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static21.method156(arg1, 1, arg0) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
