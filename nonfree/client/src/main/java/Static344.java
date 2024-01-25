import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static344 {

	@OriginalMember(owner = "client!mda", name = "p", descriptor = "Lclient!di;")
	public static Class31 aClass31_4;

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_68 = new Class185(30, 4);

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IJ)V")
	public static void method5698(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static137.method2746(arg0 - 1L);
			Static137.method2746(1L);
		} else {
			Static137.method2746(arg0);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IBI)I")
	public static int method5699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
