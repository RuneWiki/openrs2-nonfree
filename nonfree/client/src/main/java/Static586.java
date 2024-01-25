import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IB)V")
	public static void method7962(@OriginalArg(0) int arg0) {
		if (!Static76.method1083(arg0)) {
			return;
		}
		@Pc(14) Class97[] local14 = Static360.aClass97ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class97 local26 = local14[local20];
			if (local26 != null) {
				local26.anInt2601 = 0;
				local26.anInt2685 = 0;
				local26.anInt2626 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
	public static void method7963() {
		Static64.method901();
	}
}
