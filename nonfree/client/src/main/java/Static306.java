import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static306 {

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!aj;")
	public static Class15 aClass15_81;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
	public static final int[] anIntArray457 = new int[25];

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!dia;IIB)Lclient!me;")
	public static Class85_Sub3_Sub1 method4684(@OriginalArg(0) int arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1.aBoolean170 || Static129.method2437(arg3) && Static129.method2437(arg2)) {
			return new Class85_Sub3_Sub1(arg1, 3553, arg0, arg3, arg2);
		} else if (arg1.aBoolean176) {
			return new Class85_Sub3_Sub1(arg1, 34037, arg0, arg3, arg2);
		} else {
			return new Class85_Sub3_Sub1(arg1, arg0, arg3, arg2, Static282.method4521(arg3), Static282.method4521(arg2));
		}
	}
}
