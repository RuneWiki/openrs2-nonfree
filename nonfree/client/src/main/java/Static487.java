import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)I")
	public static int method7256() {
		@Pc(7) int local7 = Static582.aClass310_23.method7732();
		if (local7 < Static356.aClass310Array1.length - 1) {
			Static582.aClass310_23 = Static356.aClass310Array1[local7 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)Z")
	public static boolean method7257(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
