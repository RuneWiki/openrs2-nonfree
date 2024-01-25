import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static338 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!kga;III)Lclient!eb;")
	public static Class77_Sub1_Sub1 method8131(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aBoolean402 || Static100.method2181(arg2) && Static100.method2181(arg0)) {
			return new Class77_Sub1_Sub1(arg1, 3553, 6408, arg2, arg0);
		} else if (arg1.aBoolean400) {
			return new Class77_Sub1_Sub1(arg1, 34037, 6408, arg2, arg0);
		} else {
			return new Class77_Sub1_Sub1(arg1, 6408, arg2, arg0, Static341.method5553(arg2), Static341.method5553(arg0));
		}
	}
}
