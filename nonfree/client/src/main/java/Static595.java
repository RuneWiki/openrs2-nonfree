import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!vea", name = "I", descriptor = "I")
	public static int anInt9812 = -1;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILclient!ud;)Lclient!iha;")
	public static Class160_Sub1 method8193(@OriginalArg(1) Class2_Sub34 arg0) {
		return new Class160_Sub1(arg0.method6856(), arg0.method6856(), arg0.method6856(), arg0.method6856(), arg0.method6870(), arg0.method6904());
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!sp;Lclient!qaa;I)Lclient!vr;")
	public static Class2_Sub50 method8194(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class269 arg1) {
		@Pc(11) Class2_Sub50 local11 = Static66.method1257();
		local11.aClass269_95 = arg1;
		local11.anInt9983 = arg1.anInt7912;
		if (local11.anInt9983 == -1) {
			local11.aClass2_Sub34_Sub2_2 = new Class2_Sub34_Sub2(260);
		} else if (local11.anInt9983 == -2) {
			local11.aClass2_Sub34_Sub2_2 = new Class2_Sub34_Sub2(10000);
		} else if (local11.anInt9983 <= 18) {
			local11.aClass2_Sub34_Sub2_2 = new Class2_Sub34_Sub2(20);
		} else if (local11.anInt9983 <= 98) {
			local11.aClass2_Sub34_Sub2_2 = new Class2_Sub34_Sub2(100);
		} else {
			local11.aClass2_Sub34_Sub2_2 = new Class2_Sub34_Sub2(260);
		}
		local11.aClass2_Sub34_Sub2_2.method6928(arg0);
		local11.aClass2_Sub34_Sub2_2.method6921(local11.aClass269_95.method6631());
		local11.anInt9982 = 0;
		return local11;
	}
}
