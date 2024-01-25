import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
	public static int anInt7618;

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "Lclient!ri;")
	public static Class284 aClass284_123;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "[I")
	public static final int[] anIntArray438 = new int[2];

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(III)Z")
	public static boolean method5958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static251.method5133(arg0, arg1) | (arg1 & 0x10000) != 0 || Static507.method6860(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static81.method1881(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(III)I")
	public static int method5959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}
}
