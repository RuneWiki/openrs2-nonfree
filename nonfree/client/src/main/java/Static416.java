import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "Lclient!wu;")
	public static Class384 aClass384_104;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "Lclient!el;")
	public static final Class97 aClass97_4 = new Class97("RC", 1);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method6341() {
		if (Static425.aFileOutputStream1 != null) {
			try {
				Static425.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static425.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)Z")
	public static boolean method6342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
