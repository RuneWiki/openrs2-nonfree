import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "Lclient!dda;")
	public static Class53 aClass53_86;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "Lclient!ra;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_168 = new Class202("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)[Lclient!rb;")
	public static Class245[] method4736() {
		return new Class245[] { Static483.aClass245_19, Static522.aClass245_21, Static19.aClass245_3, Static77.aClass245_8, Static472.aClass245_17, Static318.aClass245_15, Static234.aClass245_14, Static507.aClass245_10, Static216.aClass245_13, Static478.aClass245_18, Static60.aClass245_7, Static398.aClass245_16, Static518.aClass245_20, Static329.aClass245_12 };
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZBII)V")
	public static void method4737(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static485.aLong221 = 0L;
		@Pc(13) int local13 = Static181.method3002();
		if (arg3 == 3 || local13 == 3) {
			arg1 = true;
		}
		if (!Static103.aClass39_3.method6080()) {
			arg1 = true;
		}
		Static451.method6876(arg2, arg3, arg1, arg0, local13);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public static void method4738(@OriginalArg(1) int arg0) {
		if (Static271.anInt8654 == arg0) {
			return;
		}
		if (Static271.anInt8654 == 0) {
			Static524.method7596();
		}
		if (arg0 == 12) {
			if (Static302.aString124 == null) {
				Static299.method4719(Static454.aString170, Static456.anInt8316, Static43.aString22);
			} else {
				Static415.method6468(Static456.anInt8316);
			}
		}
		if (arg0 != 12 && Static398.aClass173_1 != null) {
			Static398.aClass173_1.method7261();
			Static398.aClass173_1 = null;
		}
		if (arg0 == 2) {
			Static292.method4619(Static387.anInt7341 != Static110.anInt2138);
		}
		if (arg0 == 6) {
			Static246.method3903(Static467.anInt8408 != Static387.anInt7341);
		}
		if (arg0 == 4) {
			if (Static302.aString124 == null) {
				Static14.method450(Static43.aString22, Static454.aString170);
			} else {
				Static92.method1720();
			}
		} else if (arg0 == 5) {
			if (Static302.aString124 == null) {
				Static299.method4719(Static454.aString170, Static456.anInt8316, Static43.aString22);
			} else {
				Static415.method6468(Static456.anInt8316);
			}
		} else if (arg0 == 8) {
			if (Static302.aString124 == null) {
				Static299.method4719(Static454.aString170, Static456.anInt8316, Static43.aString22);
			} else {
				Static415.method6468(Static456.anInt8316);
			}
		} else if (arg0 == 11) {
			if (Static302.aString124 == null) {
				Static14.method450(Static43.aString22, Static454.aString170);
			} else {
				Static92.method1720();
			}
		}
		if (Static246.method3900(Static271.anInt8654)) {
			Static163.aClass53_50.anInt1684 = 2;
			Static36.aClass53_9.anInt1684 = 2;
			Static478.aClass53_137.anInt1684 = 2;
			Static358.aClass53_101.anInt1684 = 2;
			Static62.aClass53_20.anInt1684 = 2;
			Static501.aClass53_141.anInt1684 = 2;
			Static103.aClass53_32.anInt1684 = 2;
		}
		if (Static246.method3900(arg0)) {
			Static60.anInt1161 = 1;
			Static384.anInt7093 = 1;
			Static181.anInt3350 = 0;
			Static182.anInt3354 = 0;
			Static261.anInt4671 = 0;
			Static499.method7335(true);
			Static163.aClass53_50.anInt1684 = 1;
			Static36.aClass53_9.anInt1684 = 1;
			Static478.aClass53_137.anInt1684 = 1;
			Static358.aClass53_101.anInt1684 = 1;
			Static62.aClass53_20.anInt1684 = 1;
			Static501.aClass53_141.anInt1684 = 1;
			Static103.aClass53_32.anInt1684 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static161.method2728();
		}
		if (arg0 == 1) {
			Static83.method1624(Static460.aClass53_147, Static103.aClass39_3);
		} else {
			Static7.method6811();
		}
		@Pc(249) boolean local249 = arg0 == 1 || Static490.method6649(arg0) || Static14.method452(arg0);
		@Pc(266) boolean local266 = Static271.anInt8654 == 1 || Static490.method6649(Static271.anInt8654) || Static14.method452(Static271.anInt8654);
		if (local249 != local266) {
			if (local249) {
				Static294.anInt5419 = Static292.anInt5375;
				if (Static281.aClass2_Sub19_Sub1_1.anInt2190 == 0) {
					Static198.method3201();
				} else {
					Static7.method6808(Static292.anInt5375, Static281.aClass2_Sub19_Sub1_1.anInt2190, Static463.aClass53_134);
				}
				Static100.aClass94_1.method2498(false);
			} else {
				Static198.method3201();
				Static100.aClass94_1.method2498(true);
			}
		}
		if (Static246.method3900(arg0) || arg0 == 12) {
			Static103.aClass39_3.method6062();
		}
		Static271.anInt8654 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)Lclient!ae;")
	public static Class9 method4739(@OriginalArg(0) int arg0) {
		@Pc(15) Class9[] local15 = Static438.method6694();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class9 local23 = local15[local17];
			if (local23.anInt226 == arg0) {
				return local23;
			}
		}
		return null;
	}
}
