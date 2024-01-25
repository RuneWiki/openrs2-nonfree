import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static445 {

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_42 = new Class391(4);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ffa;BIII)Lclient!gda;")
	public static Class32_Sub1_Sub1 method6627(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean228 || Static45.method8836(arg1) && Static45.method8836(arg3)) {
			return new Class32_Sub1_Sub1(arg0, 3553, arg2, arg1, arg3);
		} else if (arg0.aBoolean231) {
			return new Class32_Sub1_Sub1(arg0, 34037, arg2, arg1, arg3);
		} else {
			return new Class32_Sub1_Sub1(arg0, arg2, arg1, arg3, Static94.method1393(arg1), Static94.method1393(arg3));
		}
	}
}
