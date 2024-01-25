import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "[Lclient!jv;")
	public static Class46_Sub3_Sub1_Sub1[] aClass46_Sub3_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!js;")
	public static final Class156 aClass156_17 = new Class156(1, 2, 2, 0);

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	public static int anInt7228 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
	public static void method6507(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(11, arg0);
		local8.method6700();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[IBLclient!mh;Z)Lclient!wo;")
	public static Class164_Sub3_Sub1 method6509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class4_Sub3 arg3) {
		if (arg3.aBoolean430 || Static329.method5606(arg0) && Static329.method5606(arg1)) {
			return new Class164_Sub3_Sub1(arg3, 3553, arg0, arg1, false, arg2);
		} else if (arg3.aBoolean433) {
			return new Class164_Sub3_Sub1(arg3, 34037, arg0, arg1, false, arg2);
		} else {
			return new Class164_Sub3_Sub1(arg3, arg0, arg1, Static184.method3549(arg0), Static184.method3549(arg1), arg2);
		}
	}
}
