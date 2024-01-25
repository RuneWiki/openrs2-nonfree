import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "F")
	public static float aFloat203;

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "[Lclient!nd;")
	public static Class235_Sub1[] aClass235_Sub1Array2 = new Class235_Sub1[0];

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	public static void method9068() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static491.anInt9856; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static393.anInt6574; local13++) {
				if (Static278.method8279(Static441.aClass351ArrayArrayArray1, local7, local13, local9, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
