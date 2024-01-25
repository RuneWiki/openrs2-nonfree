import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
	public static int anInt3267;

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
	public static int anInt3268;

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "I")
	public static int anInt3275;

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)[Lclient!el;")
	public static Class97[] method2914() {
		return new Class97[] { Static650.aClass97_7, Static416.aClass97_4, Static447.aClass97_5 };
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)V")
	public static void method2915(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub4_Sub13 local12 = method2916(arg0, 9);
		local12.method4132();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)Lclient!ju;")
	public static Class5_Sub4_Sub13 method2916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class5_Sub4_Sub13 local20 = (Class5_Sub4_Sub13) Static94.aClass81_75.method1599((long) arg0 | (long) arg1 << 32);
		if (local20 == null) {
			local20 = new Class5_Sub4_Sub13(arg1, arg0);
			Static94.aClass81_75.method1607(local20, local20.aLong282);
		}
		return local20;
	}
}
