import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	public static int anInt4867;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!oi;")
	public static Class185 aClass185_75;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_73 = new Class142("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public static int anInt4869 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)B")
	public static byte method3884(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
