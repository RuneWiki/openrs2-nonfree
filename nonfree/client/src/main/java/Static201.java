import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "Lclient!av;")
	public static Class26 aClass26_14;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "Lclient!kg;")
	public static final Class188 aClass188_2 = new Class188("", 12);

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "Lclient!jg;")
	public static final Class174 aClass174_9 = new Class174();

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBLclient!vr;II)V")
	public static void method3524(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub50 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.aClass2_Sub34_Sub2_2.method6864(arg2);
		arg1.aClass2_Sub34_Sub2_2.method6854(arg3);
		arg1.aClass2_Sub34_Sub2_2.method6916(arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Z")
	public static boolean method3526(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!eq;BLclient!eq;Lclient!eq;Lclient!eq;)V")
	public static void method3527(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) Class97 arg3) {
		Static455.aClass97_116 = arg1;
		Static463.aClass97_117 = arg3;
		Static157.aClass97_41 = arg0;
		Static399.aClass78ArrayArray1 = new Class78[Static455.aClass97_116.method2546()][];
		Static214.aBooleanArray27 = new boolean[Static455.aClass97_116.method2546()];
	}
}
