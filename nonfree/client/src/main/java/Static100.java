import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
	public static int anInt1781;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "Lclient!hq;")
	public static Class108 aClass108_1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method1441(@OriginalArg(1) Class128 arg0) {
		@Pc(7) int local7 = Static351.anInt5784;
		@Pc(9) int local9 = Static430.anInt7189;
		@Pc(11) int local11 = Static163.anInt2682;
		@Pc(18) int local18 = Static360.anInt5991;
		arg0.method3580(local9, local7, local18, -10660793, local11);
		arg0.method3580(local9 + 1, local7 - -1, 16, -16777216, local11 - 2);
		arg0.method3551(local7 + 1, local9 + 18, local18 - 19, local11 + -2, -16777216);
		Static227.aClass16_1.method5478(local7 + 3, local9 + 14, -1, Static328.aClass151_169.method3122(Static188.anInt3028), -10660793);
		@Pc(77) int local77 = Static210.aClass26_1.method576();
		@Pc(81) int local81 = Static210.aClass26_1.method574();
		@Pc(83) int local83 = 0;
		for (@Pc(88) Class1_Sub45 local88 = (Class1_Sub45) Static50.aClass254_8.method5437(); local88 != null; local88 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
			@Pc(104) int local104 = local9 + (Static19.anInt396 - local83 - 1) * 16 + 31;
			@Pc(106) short local106 = -1;
			if (local7 < local77 && local77 < local7 + local11 && local81 > local104 - 13 && local81 < local104 + 3 && local88.aBoolean607) {
				local106 = -256;
			}
			@Pc(144) int[] local144 = null;
			if (Static97.method1391(local88.anInt7398)) {
				local144 = Static227.aClass65_2.method1327((int) local88.aLong225).anIntArray87;
			} else if (local88.anInt7396 != -1) {
				local144 = Static227.aClass65_2.method1327(local88.anInt7396).anIntArray87;
			} else if (Static109.method1524(local88.anInt7398)) {
				@Pc(217) Class20_Sub3_Sub3_Sub2 local217 = Static98.aClass20_Sub3_Sub3_Sub2Array1[(int) local88.aLong225];
				if (local217 != null) {
					@Pc(222) Class246 local222 = local217.aClass246_1;
					if (local222.anIntArray459 != null) {
						local222 = local222.method5255(Static364.aClass259_1);
					}
					if (local222 != null) {
						local144 = local222.anIntArray455;
					}
				}
			} else if (Static29.method506(local88.anInt7398)) {
				@Pc(185) Class141 local185;
				if (local88.anInt7398 == 1006) {
					local185 = Static259.aClass95_3.method1821((int) local88.aLong225);
				} else {
					local185 = Static259.aClass95_3.method1821((int) (local88.aLong225 >>> 32 & 0x7FFFFFFFL));
				}
				if (local185.anIntArray184 != null) {
					local185 = local185.method2832(Static364.aClass259_1);
				}
				if (local185 != null) {
					local144 = local185.anIntArray187;
				}
			}
			@Pc(248) String local248 = Static258.method3272(local88);
			if (local144 != null) {
				local248 = local248 + Static108.method1518(local144);
			}
			Static227.aClass16_1.method5496(local248, Static214.aClass49Array147, local104, local7 + 3, Static419.anIntArray454, local106);
			local83++;
			if (local88.aBoolean606) {
				Static238.aClass49_10.method5636(Static6.aClass122_1.method2464(local248) + local7 + 5, local104 + -12);
			}
		}
		Static319.method4119(Static360.anInt5991, Static430.anInt7189, Static163.anInt2682, Static351.anInt5784);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1443(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
