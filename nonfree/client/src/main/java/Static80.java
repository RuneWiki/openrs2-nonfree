import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
	public static int anInt1786;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!nc;")
	public static Class63 aClass63_5;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	public static int anInt1787;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
	public static int anInt1792;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_566 = Static181.method2795("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!qe;")
	public static Class83 aClass83_567 = aClass83_566;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_568 = Static181.method2795("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_569 = Static181.method2795("<col=ff7000>");

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!a;Ljava/lang/Object;)V")
	public static void method1451(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static119.method2069(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
	public static void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static209.anInt4155 <= arg2 - arg3 && Static36.anInt940 >= arg2 + arg3 && Static147.anInt4074 <= arg0 - arg3 && Static61.anInt1501 >= arg0 + arg3) {
			Static121.method2089(arg0, arg3, arg1, arg2);
		} else {
			Static132.method2198(arg1, arg3, arg0, arg2);
		}
	}
}
