import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "D")
	public static double aDouble23;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(B)V")
	public static void method8097() {
		Static550.aClass133_14.method7321(Static72.aFloat18, Static55.aFloat9, Static266.aFloat92);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!gba;)I")
	public static int method8100(@OriginalArg(1) Class5_Sub22_Sub1 arg0) {
		@Pc(17) int local17 = arg0.method2655(2);
		@Pc(30) int local30;
		if (local17 == 0) {
			local30 = 0;
		} else if (local17 == 1) {
			local30 = arg0.method2655(5);
		} else if (local17 == 2) {
			local30 = arg0.method2655(8);
		} else {
			local30 = arg0.method2655(11);
		}
		return local30;
	}
}
