import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static72 {

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
	public static int anInt1263;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)V")
	public static void method1096(@OriginalArg(0) boolean arg0) {
		if (Static591.aClass337_3 == null) {
			Static655.method8998();
		}
		if (arg0) {
			Static591.aClass337_3.method8094();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BII)Z")
	public static boolean method1101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x37) != 0;
	}
}
