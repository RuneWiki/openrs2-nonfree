import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!xa;")
	public static Class58 aClass58_29;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_75;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "F")
	public static float aFloat136;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_109 = new Class73(22, 0);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)V")
	public static void method4896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg1, 16);
		local8.method2582();
		local8.anInt2944 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Lclient!mc;")
	public static Class6_Sub31 method4898() {
		@Pc(14) Class6_Sub31 local14 = Static59.method1229();
		local14.anInt5588 = 0;
		local14.aClass47_90 = null;
		local14.aClass6_Sub21_Sub2_2 = new Class6_Sub21_Sub2(5000);
		return local14;
	}
}
