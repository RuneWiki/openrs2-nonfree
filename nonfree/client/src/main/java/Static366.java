import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
	public static int anInt6539 = 0;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_239 = new Class184(100, 12);

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_217 = new Class92(7, 8);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)B")
	public static byte method5146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
