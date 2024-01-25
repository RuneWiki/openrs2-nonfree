import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
	public static int anInt4978;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "Lclient!mn;")
	public static Class171 aClass171_64;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_114 = new Class25(70, 3);

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_115 = new Class25(66, -2);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V")
	public static void method3920(@OriginalArg(0) int arg0) {
		if (arg0 == Static433.anInt7309) {
			return;
		}
		if (Static433.anInt7309 == 0) {
			Static136.method2142();
		}
		if (arg0 == 12) {
			Static444.method6032(Static199.anInt3422, Static205.aString31, Static448.aString72);
		}
		if (arg0 != 12 && Static54.aClass66_1 != null) {
			Static54.aClass66_1.method1388();
			Static54.aClass66_1 = null;
		}
		if (arg0 == 2) {
			Static150.method5917(Static103.anInt5365 != Static306.anInt5515);
		}
		if (arg0 == 6) {
			Static319.method4540(anInt4978 != Static103.anInt5365);
		}
		if (arg0 == 4) {
			Static64.method1053(Static448.aString72, Static205.aString31);
		} else if (arg0 == 5) {
			Static444.method6032(Static199.anInt3422, Static205.aString31, Static448.aString72);
		} else if (arg0 == 8) {
			Static444.method6032(Static199.anInt3422, Static205.aString31, Static448.aString72);
		} else if (arg0 == 11) {
			Static64.method1053(Static448.aString72, Static205.aString31);
		}
		if (Static200.method2819(Static433.anInt7309)) {
			Static73.aClass171_16.anInt4582 = 2;
			Static16.aClass171_68.anInt4582 = 2;
			Static233.aClass171_51.anInt4582 = 2;
			Static178.aClass171_45.anInt4582 = 2;
			Static112.aClass171_29.anInt4582 = 2;
			Static82.aClass171_50.anInt4582 = 2;
			Static358.aClass171_100.anInt4582 = 2;
		}
		if (Static200.method2819(arg0)) {
			Static294.anInt5266 = 1;
			Static407.anInt7041 = 0;
			Static211.anInt3607 = 0;
			Static257.anInt4492 = 1;
			Static191.anInt3353 = 0;
			Static428.method5826(true);
			Static73.aClass171_16.anInt4582 = 1;
			Static16.aClass171_68.anInt4582 = 1;
			Static233.aClass171_51.anInt4582 = 1;
			Static178.aClass171_45.anInt4582 = 1;
			Static112.aClass171_29.anInt4582 = 1;
			Static82.aClass171_50.anInt4582 = 1;
			Static358.aClass171_100.anInt4582 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static280.method3979();
		}
		if (arg0 == 1) {
			Static326.method4637(Static446.aClass171_101, Static257.aClass75_8);
		} else {
			Static256.method4479();
		}
		@Pc(204) boolean local204 = arg0 == 1 || Static126.method1972(arg0) || Static203.method2864(arg0);
		@Pc(221) boolean local221 = Static433.anInt7309 == 1 || Static126.method1972(Static433.anInt7309) || Static203.method2864(Static433.anInt7309);
		if (local221 != local204) {
			if (local204) {
				Static323.anInt5772 = Static278.anInt5024;
				if (Static434.aClass165_Sub1_1.anInt4208 == 0) {
					Static30.method513();
				} else {
					Static148.method2247(Static434.aClass165_Sub1_1.anInt4208, Static278.anInt5024, Static431.aClass171_95);
				}
				Static29.aClass249_1.method5691(false);
			} else {
				Static30.method513();
				Static29.aClass249_1.method5691(true);
			}
		}
		if (Static200.method2819(arg0) || arg0 == 12) {
			Static257.aClass75_8.method5998();
		}
		Static433.anInt7309 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZC)Z")
	public static boolean method3924(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(39) char[] local39 = Static205.aCharArray3;
			for (@Pc(41) int local41 = 0; local41 < local39.length; local41++) {
				@Pc(47) char local47 = local39[local41];
				if (arg0 == local47) {
					return true;
				}
			}
		}
		return false;
	}
}
