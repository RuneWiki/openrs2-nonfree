import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static128 {

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
	public static int anInt2082;

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!eia", name = "n", descriptor = "I")
	public static int anInt2091 = 0;

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIZ[IIILclient!rda;)Lclient!qd;")
	public static Class24_Sub4_Sub1 method1910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class126_Sub3 arg5) {
		if (arg5.aBoolean681 || Static586.method8223(arg4) && Static586.method8223(arg0)) {
			return new Class24_Sub4_Sub1(arg5, 3553, arg4, arg0, false, arg2, arg1, 0);
		} else if (arg5.aBoolean667) {
			return new Class24_Sub4_Sub1(arg5, 34037, arg4, arg0, false, arg2, arg1, 0);
		} else {
			return new Class24_Sub4_Sub1(arg5, arg4, arg0, Static522.method6795(arg4), Static522.method6795(arg0), arg2);
		}
	}
}
