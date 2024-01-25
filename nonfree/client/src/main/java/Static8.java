import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!tq;")
	public static Class191 aClass191_7;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_1 = new Class93("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	public static int anInt164 = 0;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
	public static final int[] anIntArray7 = new int[4];

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
	public static int anInt165 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIZ)V")
	public static void method216(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static96.anInt2180 = arg0;
		Static228.anInt920 = 0;
		Static307.anInt6214 = arg1;
		Static124.anInt4221 = 0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/Object;Lclient!rd;B)V")
	public static void method218(@OriginalArg(0) Object arg0, @OriginalArg(1) Class168 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static102.method2276(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public static void method219() {
		Static265.aClass146ArrayArray41 = new Class146[Static252.aClass191_161.method5460()][];
		Static104.aBooleanArray24 = new boolean[Static252.aClass191_161.method5460()];
	}
}
