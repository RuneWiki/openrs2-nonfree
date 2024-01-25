import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
	public static int anInt4982 = -1;

	@OriginalMember(owner = "client!vt", name = "P", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_184 = new Class67(95, 8);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BZ)V")
	public static void method3974(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static118.anInt1785 != -1) {
				Static364.method4777(Static118.anInt1785);
			}
			for (@Pc(23) Class1_Sub37 local23 = (Class1_Sub37) Static462.aClass208_42.method4414(); local23 != null; local23 = (Class1_Sub37) Static462.aClass208_42.method4410()) {
				if (!local23.method5956()) {
					local23 = (Class1_Sub37) Static462.aClass208_42.method4414();
					if (local23 == null) {
						break;
					}
				}
				Static393.method5106(local23, true, false);
			}
			Static118.anInt1785 = -1;
			Static462.aClass208_42 = new Class208(8);
			Static219.method3140();
			Static118.anInt1785 = Static249.anInt4441;
			Static428.method5437(false);
			Static186.method2688();
			Static198.method2835(Static118.anInt1785);
		}
		Static297.aBoolean453 = true;
	}
}
