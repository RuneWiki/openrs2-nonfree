import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "J")
	public static long aLong96 = 0L;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
	public static int anInt3500 = 0;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "Lclient!ee;")
	public static final Class63 aClass63_1 = new Class63();

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)B")
	public static byte method2779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
