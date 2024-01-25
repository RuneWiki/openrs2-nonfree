import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
	public static int anInt6027;

	@OriginalMember(owner = "client!nca", name = "l", descriptor = "[Lclient!saa;")
	public static Class299_Sub1[] aClass299_Sub1Array2 = new Class299_Sub1[0];

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
	public static void method5171(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		Static193.anInt9352 = arg2;
		Static560.anInt9247 = 2;
		Static17.method406(arg1, arg0, false);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IC)Z")
	public static boolean method5172(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V")
	public static void method5174(@OriginalArg(0) boolean arg0) {
		Static246.anInt4914 = 0;
		Static241.anInt4871 = 0;
		Static211.method3734();
		Static297.method989(arg0);
		Static5.method172();
		@Pc(26) boolean local26 = false;
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < Static246.anInt4914; local28++) {
			local34 = Static203.anIntArray262[local28];
			@Pc(41) Class6_Sub34 local41 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local34);
			@Pc(44) Class4_Sub1_Sub1_Sub1 local44 = local41.aClass4_Sub1_Sub1_Sub1_2;
			if (Static587.aBoolean734 && Static509.method7735(local34)) {
				Static175.method3221();
			}
			if (local44.anInt7080 != Static312.anInt5688) {
				if (local44.aClass273_1.method6161()) {
					Static105.method1888(local44);
				}
				local44.method152(null);
				local26 = true;
				local41.method7804();
			}
		}
		if (local26) {
			Static535.anInt8885 = Static593.aClass128_43.method3268();
			Static593.aClass128_43.method3271(Static76.aClass6_Sub34Array7);
		}
		if (Static177.anInt3710 != Static282.aClass6_Sub21_Sub2_1.anInt7338) {
			throw new RuntimeException("gnp1 pos:" + Static282.aClass6_Sub21_Sub2_1.anInt7338 + " psize:" + Static177.anInt3710);
		}
		for (local34 = 0; local34 < Static464.anInt7995; local34++) {
			if (Static593.aClass128_43.method3263((long) Static291.anIntArray405[local34]) == null) {
				throw new RuntimeException("gnp2 pos:" + local34 + " size:" + Static464.anInt7995);
			}
		}
	}
}
