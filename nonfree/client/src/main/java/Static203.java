import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!wo;")
	public static Class216 aClass216_67;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!nd", name = "Hb", descriptor = "Lclient!wo;")
	public static Class216 aClass216_68;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(BII)B")
	public static byte method3840(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	public static void method3843() {
		Static312.aClass87_39.method2485();
	}
}
