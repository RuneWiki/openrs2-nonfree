import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Lclient!ri;")
	public static Class284 aClass284_127;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Lclient!nr;")
	public static Class223 aClass223_6;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_18 = new Class364(11, 7);

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!j;")
	public static final Class153 aClass153_116 = new Class153("RC", 1);

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	public static boolean aBoolean554 = false;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "[Lclient!pea;")
	public static final Class3_Sub7_Sub15[] aClass3_Sub7_Sub15Array8 = new Class3_Sub7_Sub15[14];

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method6315() {
		if (Static372.aClass163_1 != null) {
			Static372.aClass163_1.method4031();
		}
		if (Static431.aThread5 == null) {
			return;
		}
		while (true) {
			try {
				Static431.aThread5.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}
}
