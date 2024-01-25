import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
	public static int anInt7293;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array15;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_122 = new Class242(7, 8);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public static void method5894() {
		for (@Pc(14) Class1_Sub10 local14 = (Class1_Sub10) Static57.aClass14_3.method203(); local14 != null; local14 = (Class1_Sub10) Static57.aClass14_3.method208()) {
			if (Static14.method273(local14.anInt1057)) {
				Static237.method3378(local14);
			}
		}
		if (Static76.anInt1078 == 1) {
			Static220.method3164();
			return;
		}
		Static171.method2271(Static25.anInt358, Static64.anInt995, Static361.anInt5833, Static273.anInt4719);
		@Pc(57) int local57 = Static15.aClass252_5.method5291(Static141.aClass142_97.method3118(Static63.anInt981));
		for (@Pc(62) Class1_Sub10 local62 = (Class1_Sub10) Static57.aClass14_3.method203(); local62 != null; local62 = (Class1_Sub10) Static57.aClass14_3.method208()) {
			@Pc(68) int local68 = Static150.method3711(local62);
			if (local68 > local57) {
				local57 = local68;
			}
		}
		Static361.anInt5833 = (Static51.aBoolean102 ? 26 : 22) + Static76.anInt1078 * 16;
		Static273.anInt4719 = local57 + 8;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Z")
	public static boolean method5895() {
		return Static270.anInt1979 == 0 ? Static181.aClass1_Sub9_Sub3_2.method4647() : true;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(III)I")
	public static int method5896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static94.method1109(arg0 + 45365, arg1 - -91923, 4) + (Static94.method1109(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (-128 + Static94.method1109(arg0, arg1, 1) >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
