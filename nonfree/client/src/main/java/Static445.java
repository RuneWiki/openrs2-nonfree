import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
	public static final int[] anIntArray621 = new int[1000];

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZI)I")
	public static int method5719(@OriginalArg(2) int arg0) {
		@Pc(12) Class2_Sub38 local12 = Static448.method5748(arg0, false);
		if (local12 == null) {
			return Static378.aClass172_1.method3944(arg0).anInt5811;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local12.anIntArray512.length; local24++) {
			if (local12.anIntArray512[local24] == -1) {
				local22++;
			}
		}
		return local22 + Static378.aClass172_1.method3944(arg0).anInt5811 - local12.anIntArray512.length;
	}
}
