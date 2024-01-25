import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
	public static int anInt8353;

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)V")
	public static void method7283() {
		@Pc(19) Class3_Sub11_Sub4 local19 = Static583.method8201(15, 0L);
		local19.method2194();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!dia;IIII)Lclient!me;")
	public static Class85_Sub3_Sub1 method7286(@OriginalArg(0) int arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean170 || Static129.method2437(arg4) && Static129.method2437(arg0)) {
			return new Class85_Sub3_Sub1(arg1, 3553, arg2, arg3, arg4, arg0, true);
		} else if (arg1.aBoolean176) {
			return new Class85_Sub3_Sub1(arg1, 34037, arg2, arg3, arg4, arg0, true);
		} else {
			return new Class85_Sub3_Sub1(arg1, arg2, arg3, arg4, arg0, Static282.method4521(arg4), Static282.method4521(arg0), true);
		}
	}
}
