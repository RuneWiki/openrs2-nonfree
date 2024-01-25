import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static483 {

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Lclient!ra;")
	public static final Class280 aClass280_8 = new Class280();

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIB)Z")
	public static boolean method6645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static569.method7617(arg0, arg1) || Static524.method7193(arg0, arg1);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	public static void method6646() {
		if (Static240.aClass14_7.method6895()) {
			Static240.aClass14_7.method6902(Static32.aCanvas3);
			Static283.method4640();
			Static240.aClass14_7.method6844(Static32.aCanvas3);
			Static240.aClass14_7.method6900(Static32.aCanvas3);
		} else {
			Static293.method4707(Static560.anInt9242);
		}
		Static415.method7746();
	}
}
