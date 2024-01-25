import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static572 {

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
	public static int anInt9322;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	public static int anInt9323 = 0;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "[S")
	public static short[] aShortArray138 = new short[256];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([BZBILclient!ep;III)Lclient!dd;")
	public static Class65_Sub1_Sub1 method7835(@OriginalArg(0) byte[] arg0, @OriginalArg(4) Class95_Sub1 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg1.aBoolean173 || Static485.method6790(arg2) && Static485.method6790(arg3)) {
			return new Class65_Sub1_Sub1(arg1, 3553, 6406, arg2, arg3, false, arg0, 6406);
		} else if (arg1.aBoolean176) {
			return new Class65_Sub1_Sub1(arg1, 34037, 6406, arg2, arg3, false, arg0, 6406);
		} else {
			return new Class65_Sub1_Sub1(arg1, 6406, arg2, arg3, Static350.method4699(arg2), Static350.method4699(arg3), arg0, 6406);
		}
	}
}
