import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static146 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Lclient!ae;")
	public static Class8 aClass8_75;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public static int anInt4860;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt4859 = -60;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!d;Lclient!ae;)V")
	public static void method4126(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) Class8 arg1) {
		Static131.anInterface6_2 = arg0;
		Static115.aClass8_31 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILclient!pq;III)Lclient!iq;")
	public static Class53_Sub2_Sub1 method4128(@OriginalArg(1) int arg0, @OriginalArg(2) Class132_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean538 || Static177.method2498(arg0) && Static177.method2498(arg2)) {
			return new Class53_Sub2_Sub1(arg1, 3553, arg3, arg4, arg0, arg2, true);
		} else if (arg1.aBoolean539) {
			return new Class53_Sub2_Sub1(arg1, 34037, arg3, arg4, arg0, arg2, true);
		} else {
			return new Class53_Sub2_Sub1(arg1, arg3, arg4, arg0, arg2, Static655.method8912(arg0), Static655.method8912(arg2), true);
		}
	}
}
