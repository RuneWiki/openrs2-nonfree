import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "Lclient!in;")
	public static final Class169 aClass169_100 = new Class169(13, 6);

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "[Lclient!kn;")
	public static final Class200[] aClass200Array1 = new Class200[4];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method3779() {
		Static118.aClass22_10.method461();
		Static207.aClass22_18.method461();
		Static103.aClass22_8.method461();
		Static359.aClass22_30.method461();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)I")
	public static int method3781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
