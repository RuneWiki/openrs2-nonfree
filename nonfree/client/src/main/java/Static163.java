import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static163 {

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
	public static int anInt2844;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "Lclient!dia;")
	public static final Class74 aClass74_17 = new Class74("", 15);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z[BLclient!rda;IIIII)Lclient!qd;")
	public static Class24_Sub4_Sub1 method2450(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class126_Sub3 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg1.aBoolean681 || Static586.method8223(arg3) && Static586.method8223(arg2)) {
			return new Class24_Sub4_Sub1(arg1, 3553, 6406, arg3, arg2, false, arg0, 6406);
		} else if (arg1.aBoolean667) {
			return new Class24_Sub4_Sub1(arg1, 34037, 6406, arg3, arg2, false, arg0, 6406);
		} else {
			return new Class24_Sub4_Sub1(arg1, 6406, arg3, arg2, Static522.method6795(arg3), Static522.method6795(arg2), arg0, 6406);
		}
	}
}
