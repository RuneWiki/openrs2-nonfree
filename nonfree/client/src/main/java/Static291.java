import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public static int anInt5054;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)I")
	public static int method4410() {
		@Pc(5) Class160 local5 = Static208.aClass160_33;
		synchronized (Static208.aClass160_33) {
			return Static208.aClass160_33.method3603();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	public static void method4411(@OriginalArg(1) int arg0) {
		Static17.anInt398 = -1;
		Static33.anInt699 = 100;
		Static121.anInt2597 = 3;
		Static223.anInt3988 = arg0;
	}
}
