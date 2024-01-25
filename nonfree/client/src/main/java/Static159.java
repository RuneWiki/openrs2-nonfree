import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!rs;III)Lclient!sb;")
	public static Class167_Sub3_Sub1 method8530(@OriginalArg(1) Class133_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean620 || Static413.method8723(arg3) && Static413.method8723(arg1)) {
			return new Class167_Sub3_Sub1(arg0, 3553, arg2, arg3, arg1);
		} else if (arg0.aBoolean622) {
			return new Class167_Sub3_Sub1(arg0, 34037, arg2, arg3, arg1);
		} else {
			return new Class167_Sub3_Sub1(arg0, arg2, arg3, arg1, Static613.method8740(arg3), Static613.method8740(arg1));
		}
	}
}
