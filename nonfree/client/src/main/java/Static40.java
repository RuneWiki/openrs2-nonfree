import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[Lclient!vi;")
	public static Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array4;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Z")
	public static boolean aBoolean40;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_300 = Static151.method2243("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_301 = Static151.method2243("Free world");

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	public static int anInt964 = 0;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!mb;")
	public static Class62 aClass62_302 = aClass62_301;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_303 = Static151.method2243("cross");

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_304 = Static151.method2243("Spieler");

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	public static int anInt968 = 0;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	public static int anInt969 = -1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/Object;Lclient!hf;I)V")
	public static void method663(@OriginalArg(0) Object arg0, @OriginalArg(1) Class41 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static117.method1813(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
