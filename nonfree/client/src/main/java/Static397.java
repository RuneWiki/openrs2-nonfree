import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZB)V")
	public static void method6080(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			@Pc(12) Class14_Sub54 local12 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static201.aClass251_95);
			local12.aClass14_Sub21_Sub2_2.method7751(arg0);
			Static277.aClass347_2.method8308(local12);
		} else {
			Static672.method9299(Static679.aClass162_16, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "([SII)[S")
	public static short[] method6081(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static691.method85(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
