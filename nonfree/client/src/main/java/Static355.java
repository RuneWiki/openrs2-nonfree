import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method5465() {
		if (Static439.aFileOutputStream1 != null) {
			try {
				Static439.aFileOutputStream1.close();
			} catch (@Pc(14) IOException local14) {
			}
		}
		Static439.aFileOutputStream1 = null;
	}
}
