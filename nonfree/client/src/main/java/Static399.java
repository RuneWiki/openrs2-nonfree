import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "Lclient!be;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "J")
	public static long aLong204 = 20000000L;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V")
	public static void method5645() {
		if (Static354.aFileOutputStream1 != null) {
			try {
				Static354.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static354.aFileOutputStream1 = null;
	}
}
