import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "Lclient!q;")
	public static Class25 aClass25_6;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Z")
	public static final boolean aBoolean623 = false;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public static void method6021(@OriginalArg(0) int arg0) {
		Static238.anInt3981 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static83.anInt1434; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static405.anInt6657; local6++) {
				if (Static469.aClass228ArrayArrayArray6[arg0][local3][local6] == null) {
					Static469.aClass228ArrayArrayArray6[arg0][local3][local6] = new Class228(arg0);
				}
			}
		}
	}
}
