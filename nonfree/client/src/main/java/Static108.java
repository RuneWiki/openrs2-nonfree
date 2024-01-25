import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "Lclient!hf;")
	public static final Class136 aClass136_2 = new Class136();

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(CI)Z")
	public static boolean method2380(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZIILclient!kga;I[BI)Lclient!eb;")
	public static Class77_Sub1_Sub1 method2381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class44_Sub3 arg2, @OriginalArg(6) byte[] arg3) {
		if (arg2.aBoolean402 || Static100.method2181(arg0) && Static100.method2181(arg1)) {
			return new Class77_Sub1_Sub1(arg2, 3553, 6406, arg0, arg1, false, arg3, 6406);
		} else if (arg2.aBoolean400) {
			return new Class77_Sub1_Sub1(arg2, 34037, 6406, arg0, arg1, false, arg3, 6406);
		} else {
			return new Class77_Sub1_Sub1(arg2, 6406, arg0, arg1, Static341.method5553(arg0), Static341.method5553(arg1), arg3, 6406);
		}
	}
}
