import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Z")
	public static boolean aBoolean265;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public static int anInt3869;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_54 = new Class47(69, 3);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!rr;)V")
	public static void method3402(@OriginalArg(1) Class292 arg0) {
		if (!Static199.aBoolean458) {
			return;
		}
		if (arg0.anObjectArray20 != null) {
			@Pc(18) Class292 local18 = Static391.method5747(Static593.anInt9601, Static115.anInt2199);
			if (local18 != null) {
				@Pc(24) Class6_Sub43 local24 = new Class6_Sub43();
				local24.anObjectArray34 = arg0.anObjectArray20;
				local24.aClass292_12 = arg0;
				local24.aClass292_11 = local18;
				Static446.method6319(local24);
			}
		}
		@Pc(41) Class6_Sub31 local41 = Static114.method2007(Static11.aClass47_7, Static337.aClass324_1);
		local41.aClass6_Sub21_Sub2_2.method6033(arg0.anInt7890);
		local41.aClass6_Sub21_Sub2_2.method6045(Static593.anInt9601);
		local41.aClass6_Sub21_Sub2_2.method6023(Static188.anInt3896);
		local41.aClass6_Sub21_Sub2_2.method6039(Static115.anInt2199);
		local41.aClass6_Sub21_Sub2_2.method6052(arg0.anInt7964);
		local41.aClass6_Sub21_Sub2_2.method6052(arg0.anInt7933);
		Static534.method7251(local41);
	}
}
