import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Lclient!ta;")
	public static Class92 aClass92_4;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_27;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
	public static int anInt2194 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!cga;Lclient!tu;B)Lclient!mc;")
	public static Class6_Sub31 method2007(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class324 arg1) {
		@Pc(8) Class6_Sub31 local8 = Static59.method1229();
		local8.aClass47_90 = arg0;
		local8.anInt5588 = arg0.anInt1283;
		if (local8.anInt5588 == -1) {
			local8.aClass6_Sub21_Sub2_2 = new Class6_Sub21_Sub2(260);
		} else if (local8.anInt5588 == -2) {
			local8.aClass6_Sub21_Sub2_2 = new Class6_Sub21_Sub2(10000);
		} else if (local8.anInt5588 <= 18) {
			local8.aClass6_Sub21_Sub2_2 = new Class6_Sub21_Sub2(20);
		} else if (local8.anInt5588 > 98) {
			local8.aClass6_Sub21_Sub2_2 = new Class6_Sub21_Sub2(260);
		} else {
			local8.aClass6_Sub21_Sub2_2 = new Class6_Sub21_Sub2(100);
		}
		local8.aClass6_Sub21_Sub2_2.method6072(arg1);
		local8.aClass6_Sub21_Sub2_2.method6080(local8.aClass47_90.method1264());
		local8.anInt5591 = 0;
		return local8;
	}
}
