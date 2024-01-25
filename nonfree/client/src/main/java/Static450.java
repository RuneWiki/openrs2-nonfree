import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
	public static int anInt7884;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_117 = new Class45(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	public static int anInt7887 = -1;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "Z")
	public static boolean aBoolean584 = true;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)V")
	public static void method6965(@OriginalArg(0) int arg0) {
		Static167.anInt3394 = arg0;
		@Pc(12) Class277 local12 = Static301.aClass277_42;
		synchronized (Static301.aClass277_42) {
			Static301.aClass277_42.method7019();
		}
		local12 = Static346.aClass277_50;
		synchronized (Static346.aClass277_50) {
			Static346.aClass277_50.method7019();
		}
	}
}
