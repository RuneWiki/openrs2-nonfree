import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "Lclient!da;")
	public static Class68 aClass68_11;

	@OriginalMember(owner = "client!nq", name = "hb", descriptor = "Lclient!dr;")
	public static Class89 aClass89_1 = new Class89();

	@OriginalMember(owner = "client!nq", name = "Z", descriptor = "Z")
	public static boolean aBoolean600 = false;

	@OriginalMember(owner = "client!nq", name = "O", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_98 = new Class349(47, 3);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)Z")
	public static boolean method6316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static158.method8587(arg1, arg0) | Static172.method2596(arg1, arg0) | Static327.method8981(arg1, arg0)) & Static645.method8740(arg0, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLclient!sj;Z)V")
	public static void method6318(@OriginalArg(1) Class4_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt2358 > Static528.anInt8386) {
			Static690.method9316(arg0);
		} else if (Static528.anInt8386 > arg0.anInt2367) {
			Static297.method4183(arg1, arg0);
			local9 = Static668.anInt10394;
			local7 = Static4.anInt42;
		} else {
			Static40.method559(arg0);
		}
		@Pc(88) int local88;
		if (arg0.anInt10229 < 512 || arg0.anInt10228 < 512 || arg0.anInt10229 >= (Static426.anInt6942 - 1) * 512 || (Static280.anInt6752 - 1) * 512 <= arg0.anInt10228) {
			arg0.aClass53_7.method4089(-1);
			for (local88 = 0; local88 < arg0.aClass315Array3.length; local88++) {
				arg0.aClass315Array3[local88].anInt8456 = -1;
				arg0.aClass315Array3[local88].aClass53_10.method4089(-1);
			}
			local9 = 0;
			arg0.anIntArray179 = null;
			arg0.anInt2358 = 0;
			arg0.anInt2367 = 0;
			local7 = -1;
			arg0.anInt10229 = arg0.anIntArray183[0] * 512 + arg0.method2046() * 256;
			arg0.anInt10228 = arg0.anIntArray182[0] * 512 + arg0.method2046() * 256;
			arg0.method2053();
		}
		if (arg0 == Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 && (arg0.anInt10229 < 6144 || arg0.anInt10228 < 6144 || arg0.anInt10229 >= Static426.anInt6942 * 512 - 6144 || arg0.anInt10228 >= (Static280.anInt6752 - 12) * 512)) {
			arg0.aClass53_7.method4089(-1);
			for (local88 = 0; local88 < arg0.aClass315Array3.length; local88++) {
				arg0.aClass315Array3[local88].anInt8456 = -1;
				arg0.aClass315Array3[local88].aClass53_10.method4089(-1);
			}
			arg0.anInt2358 = 0;
			arg0.anIntArray179 = null;
			local7 = -1;
			arg0.anInt2367 = 0;
			local9 = 0;
			arg0.anInt10229 = arg0.anIntArray183[0] * 512 + arg0.method2046() * 256;
			arg0.anInt10228 = arg0.anIntArray182[0] * 512 + arg0.method2046() * 256;
			arg0.method2053();
		}
		local88 = Static677.method9183(arg0);
		Static344.method4782((byte) 59, arg0);
		Static447.method6533(local88, arg0, local9, local7);
		Static296.method4165(local7, arg0);
		Static511.method7251(arg0);
	}
}
