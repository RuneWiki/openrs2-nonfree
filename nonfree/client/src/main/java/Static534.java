import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "[Lclient!fv;")
	public static Class124[] aClass124Array6 = new Class124[50];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public static void method7990() {
		if (Static214.aFileOutputStream1 != null) {
			try {
				Static214.aFileOutputStream1.close();
			} catch (@Pc(17) IOException local17) {
			}
		}
		Static214.aFileOutputStream1 = null;
	}
}
