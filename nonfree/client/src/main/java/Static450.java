import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(B[B)V")
	public static void method7621(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub35 local8 = new Class1_Sub35(arg0);
		while (true) {
			@Pc(18) int local18 = local8.method5750();
			if (local18 == 0) {
				return;
			}
			if (local18 == 2) {
				Static130.anInt2565 = local8.method5771();
			}
		}
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)V")
	public static void method7632() {
		if (Static593.anInt9646 != -1) {
			Static222.method3418(-1, false, Static593.anInt9646, -1);
			Static593.anInt9646 = -1;
		}
	}
}
