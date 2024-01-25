import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Lclient!ua;")
	public static final Class358 aClass358_8 = new Class358(3);

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_96 = new Class381(2, -1);

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_74 = new Class156(113, -1);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public static void method3526() {
		if (Static510.aClass216_1 != null) {
			Static510.aClass216_1.method4935();
		}
		if (Static340.aThread2 == null) {
			return;
		}
		while (true) {
			try {
				Static340.aThread2.join();
				return;
			} catch (@Pc(22) InterruptedException local22) {
			}
		}
	}
}
