import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_13 = new Class96(6, 0, 4, 2);

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!el;")
	public static final Class109 aClass109_125 = new Class109(64, 2);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)I")
	public static int method5337(@OriginalArg(1) int arg0) {
		@Pc(23) byte local23;
		if (arg0 > 12000) {
			local23 = 4;
			Static206.method2965();
		} else if (arg0 > 5000) {
			local23 = 3;
			Static233.method3391();
		} else if (arg0 <= 2000) {
			local23 = 1;
			Static601.method8651();
		} else {
			local23 = 2;
			Static356.method5330();
		}
		if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() != 2) {
			Static637.aClass5_Sub20_31.method3194(2, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
			Static565.method8890(2, false);
		}
		Static52.method792();
		return local23;
	}
}
