import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bda", name = "j", descriptor = "Lclient!mv;")
	public static Class229 aClass229_8;

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
	public static int anInt657 = -1;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(III)Z")
	public static boolean method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static525.method6782(arg0, arg1) | (arg1 & 0x10000) != 0 || Static265.method3687(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static540.method7100(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!gk;I)Lclient!og;")
	public static Class187_Sub2 method556(@OriginalArg(0) Class2_Sub7 arg0) {
		return new Class187_Sub2(arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4503(), arg0.method4464());
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V")
	public static void method557() {
		if (Static237.anInterface12Array1 == null) {
			return;
		}
		@Pc(5) Interface12[] local5 = Static237.anInterface12Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface12 local13 = local5[local7];
			local13.method2484();
		}
	}
}
