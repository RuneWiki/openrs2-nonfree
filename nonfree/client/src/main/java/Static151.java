import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!da;")
	public static Class68 aClass68_6;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
	public static int anInt3896;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!qe;")
	public static Class275 aClass275_3;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	public static int anInt3895 = -1;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLclient!da;Lclient!oea;Ljava/lang/String;ILclient!ha;)V")
	public static void method3426(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) String arg3, @OriginalArg(5) Class20 arg4) {
		@Pc(17) boolean local17 = !Static619.aBoolean737 || Static141.method3123();
		if (!local17) {
			return;
		}
		@Pc(39) int local39;
		@Pc(50) int local50;
		if (Static619.aBoolean737 && local17) {
			@Pc(26) Class239 local26 = Static596.aClass239_17;
			@Pc(32) Class68 local32 = arg4.method7289(local26, Static644.aClass296Array1);
			local39 = local26.method6486(arg3, 250, null);
			local50 = local26.method6484(null, local26.anInt7563, 250, arg3);
			@Pc(53) int local53 = Static176.aClass296_3.anInt9028;
			@Pc(57) int local57 = local53 + 4;
			local50 += local57 * 2;
			local39 += local57 * 2;
			if (Static581.anInt10352 > local50) {
				local50 = Static581.anInt10352;
			}
			if (local39 < Static612.anInt10720) {
				local39 = Static612.anInt10720;
			}
			@Pc(92) int local92 = Static337.aClass309_7.method7817(Static326.anInt6591, local39) + Static63.anInt2056;
			@Pc(100) int local100 = Static162.aClass86_2.method2903(Static467.anInt8715, local50) + Static252.anInt5448;
			if (Static487.aBoolean676) {
				local92 += Static465.method7210();
				local100 += Static207.method4090();
			}
			arg4.method7294(Static4.aClass296_1, false).method6204(Static14.aClass296_2.anInt9028 + local92, Static14.aClass296_2.anInt9024 + local100, local39 - Static14.aClass296_2.anInt9028 * 2, -(Static14.aClass296_2.anInt9024 * 2) + local50, 1, 0, 0);
			arg4.method7294(Static14.aClass296_2, true).method6213(local92, local100);
			Static14.aClass296_2.method7580();
			arg4.method7294(Static14.aClass296_2, true).method6213(local92 + local39 - local53, local100);
			Static14.aClass296_2.method7576();
			arg4.method7294(Static14.aClass296_2, true).method6213(local92 + local39 - local53, -local53 + (local100 - -local50));
			Static14.aClass296_2.method7580();
			arg4.method7294(Static14.aClass296_2, true).method6213(local92, local100 + local50 - local53);
			Static14.aClass296_2.method7576();
			arg4.method7294(Static176.aClass296_3, true).method6211(local92, Static14.aClass296_2.anInt9024 + local100, local53, local50 - Static14.aClass296_2.anInt9024 * 2);
			Static176.aClass296_3.method7582();
			arg4.method7294(Static176.aClass296_3, true).method6211(Static14.aClass296_2.anInt9028 + local92, local100, local39 - Static14.aClass296_2.anInt9028 * 2, local53);
			Static176.aClass296_3.method7582();
			arg4.method7294(Static176.aClass296_3, true).method6211(local92 + local39 - local53, Static14.aClass296_2.anInt9024 + local100, local53, local50 - Static14.aClass296_2.anInt9024 * 2);
			Static176.aClass296_3.method7582();
			arg4.method7294(Static176.aClass296_3, true).method6211(Static14.aClass296_2.anInt9028 + local92, -local53 + local100 - -local50, local39 - Static14.aClass296_2.anInt9028 * 2, local53);
			Static176.aClass296_3.method7582();
			local32.method8115(null, 0, -1, null, Static319.anInt6493 | 0xFF000000, 1, local50 - local57 * 2, null, local100 + local57, 0, 0, local39 - local57 * 2, local92 + local57, 1, arg3);
			Static18.method369(local92, local39, local100, local50);
		} else {
			local39 = arg2.method6486(arg3, 250, null);
			local50 = arg2.method6489(null, arg3, 250) * 13;
			arg4.aa(6, 6, local39 + 4 + 4, local50 + 8, -16777216, 0);
			arg4.method7231(6, 6, local39 + 4 + 4, local50 + 8, -1, 0);
			arg1.method8115(null, 0, -1, null, -1, 1, local50, null, 10, 0, 0, local39, 10, 1, arg3);
			Static18.method369(6, local39 + 4 + 4, 6, local50 + 4 + 4);
		}
		if (!arg0) {
			return;
		}
		try {
			if (Static487.aBoolean676) {
				Static246.method4549();
			} else {
				arg4.method7292();
			}
		} catch (@Pc(464) Exception_Sub1 local464) {
		}
	}
}
