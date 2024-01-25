import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_54 = new Class145(81, -1);

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static void method2810() {
		if (Static113.aClass23_1 != null) {
			Static113.aClass23_1.method625();
		}
		if (Static272.aThread2 == null) {
			return;
		}
		while (true) {
			try {
				Static272.aThread2.join();
				return;
			} catch (@Pc(18) InterruptedException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2811(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
