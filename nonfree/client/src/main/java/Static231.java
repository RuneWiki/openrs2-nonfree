import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!iaa", name = "J", descriptor = "Lclient!ni;")
	public static Class223 aClass223_56;

	@OriginalMember(owner = "client!iaa", name = "L", descriptor = "I")
	public static int anInt5129;

	@OriginalMember(owner = "client!iaa", name = "O", descriptor = "I")
	public static int anInt5131 = 0;

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(Z)V")
	public static void method4209() {
		if (Static466.aFileOutputStream1 != null) {
			try {
				Static466.aFileOutputStream1.close();
			} catch (@Pc(9) IOException local9) {
			}
		}
		Static466.aFileOutputStream1 = null;
	}
}
