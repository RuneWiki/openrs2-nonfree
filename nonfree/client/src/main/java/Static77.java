import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static77 {

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString86 = "";

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)I")
	public static int method6749(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)Z")
	public static boolean method6754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
