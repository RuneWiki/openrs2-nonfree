import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ed", name = "eb", descriptor = "Z")
	public static boolean aBoolean34;

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "Lclient!nb;")
	public static Class57 aClass57_10 = new Class57(64);

	@OriginalMember(owner = "client!ed", name = "cb", descriptor = "I")
	public static int anInt1076 = 0;

	@OriginalMember(owner = "client!ed", name = "gb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_297 = Static65.method1172("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ed", name = "hb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_298 = Static65.method1172("");

	@OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
	public static int anInt1078 = 0;

	@OriginalMember(owner = "client!ed", name = "jb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_299 = Static65.method1172("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ed", name = "kb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_300 = aClass46_298;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	public static void method683() {
		aClass46_297 = null;
		aClass46_299 = null;
		aClass46_298 = null;
		aClass57_10 = null;
		aClass46_300 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Object;Lclient!qd;I)V")
	public static void method685(@OriginalArg(0) Object arg0, @OriginalArg(1) Class68 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static35.method627(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
