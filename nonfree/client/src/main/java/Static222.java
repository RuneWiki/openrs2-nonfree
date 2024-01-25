import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "Lclient!cj;")
	public static final Class54 aClass54_4 = new Class54();

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V")
	public static void method3856() {
		if (Static300.aClass53_34 != null) {
			Static369.aClass302_1 = new Class302();
			Static369.aClass302_1.method7399(Static389.aLong184, Static300.aClass53_34.aClass235_1.method5893(Static455.anInt7738), Static300.aClass53_34.anInt1431, Static300.aClass53_34);
			Static188.aThread3 = new Thread(Static369.aClass302_1, "");
			Static188.aThread3.start();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z")
	public static boolean method3857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
