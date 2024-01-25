import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "Lclient!of;")
	public static Class2_Sub26_Sub3 aClass2_Sub26_Sub3_3;

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIILclient!lea;I)Lclient!uk;")
	public static Class50_Sub4_Sub1 method2355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class101_Sub2 arg3) {
		if (arg3.aBoolean457 || Static100.method1457(arg2) && Static100.method1457(arg1)) {
			return new Class50_Sub4_Sub1(arg3, 3553, arg0, arg2, arg1);
		} else if (arg3.aBoolean467) {
			return new Class50_Sub4_Sub1(arg3, 34037, arg0, arg2, arg1);
		} else {
			return new Class50_Sub4_Sub1(arg3, arg0, arg2, arg1, Static432.method7064(arg2), Static432.method7064(arg1));
		}
	}
}
