import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!bt", name = "db", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_25 = new Class239(26, -2);

	@OriginalMember(owner = "client!bt", name = "Z", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_10 = new Class231(64);

	@OriginalMember(owner = "client!bt", name = "cb", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_10 = new Class243(82, -1);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)I")
	public static int method860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
