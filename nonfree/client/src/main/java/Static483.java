import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!re", name = "d", descriptor = "[[Lclient!gs;")
	public static Class11_Sub1[][] aClass11_Sub1ArrayArray3;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_134 = new Class274(43, 0);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZII)Lclient!vr;")
	public static Class2_Sub50 method6942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class2_Sub50 local5 = null;
		if (arg0 == 0) {
			local5 = Static595.method8194(Static610.aClass310_2, Static428.aClass269_73);
		}
		if (arg0 == 1) {
			local5 = Static595.method8194(Static610.aClass310_2, Static365.aClass269_64);
		}
		local5.aClass2_Sub34_Sub2_2.method6854(Static451.anInt7933 + arg1);
		local5.aClass2_Sub34_Sub2_2.method6897(Static63.aClass32_1.method789(82) ? 1 : 0);
		local5.aClass2_Sub34_Sub2_2.method6854(arg2 + Static470.anInt8063);
		Static70.aBoolean136 = false;
		Static271.anInt5226 = arg2;
		Static129.anInt2985 = arg1;
		Static510.method7209();
		return local5;
	}
}
