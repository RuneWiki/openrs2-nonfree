import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!om", name = "w", descriptor = "I")
	public static int anInt4563;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "Lclient!tb;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!om", name = "R", descriptor = "I")
	public static final int anInt4577 = 50;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "[I")
	public static final int[] anIntArray504 = new int[anInt4577];

	@OriginalMember(owner = "client!om", name = "p", descriptor = "[I")
	public static final int[] anIntArray505 = new int[anInt4577];

	@OriginalMember(owner = "client!om", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[anInt4577];

	@OriginalMember(owner = "client!om", name = "t", descriptor = "[I")
	public static final int[] anIntArray506 = new int[anInt4577];

	@OriginalMember(owner = "client!om", name = "z", descriptor = "[I")
	public static final int[] anIntArray507 = new int[anInt4577];

	@OriginalMember(owner = "client!om", name = "A", descriptor = "I")
	public static int anInt4565 = -1;

	@OriginalMember(owner = "client!om", name = "D", descriptor = "[I")
	public static final int[] anIntArray508 = new int[anInt4577];

	@OriginalMember(owner = "client!om", name = "F", descriptor = "[I")
	public static final int[] anIntArray509 = new int[anInt4577];

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	public static int anInt4567 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!np;Z)V")
	public static void method4127(@OriginalArg(0) Class155 arg0) {
		@Pc(7) int local7 = Static96.anInt1932;
		@Pc(9) int local9 = Static321.anInt3403;
		@Pc(11) int local11 = Static392.anInt6472;
		@Pc(15) int local15 = Static139.anInt2635 - 3;
		if (Static233.aClass110_9 == null || Static108.aClass110_6 == null) {
			if (Static77.aClass20_19.method226(Static242.anInt4267) && Static77.aClass20_19.method226(Static43.anInt776)) {
				Static233.aClass110_9 = arg0.method4869(Static402.method2800(Static77.aClass20_19, Static242.anInt4267, 0));
				@Pc(44) Class127 local44 = Static402.method2800(Static77.aClass20_19, Static43.anInt776, 0);
				Static108.aClass110_6 = arg0.method4869(local44);
				local44.method2802();
				Static285.aClass110_14 = arg0.method4869(local44);
			} else {
				arg0.method4896(local7, local9, local11, 20, Static254.anInt1039 | 255 - Static224.anInt3981 << 24, 1);
			}
		}
		@Pc(88) int local88;
		@Pc(86) int local86;
		if (Static233.aClass110_9 != null && Static108.aClass110_6 != null) {
			local86 = (local11 - Static108.aClass110_6.method5091() * 2) / Static233.aClass110_9.method5091();
			for (local88 = 0; local88 < local86; local88++) {
				Static233.aClass110_9.method5094(Static108.aClass110_6.method5091() + local7 + local88 * Static233.aClass110_9.method5091(), local9);
			}
			Static108.aClass110_6.method5094(local7, local9);
			Static285.aClass110_14.method5094(local11 + local7 - Static285.aClass110_14.method5091(), local9);
		}
		Static95.aClass150_6.method5722(Static14.aClass57_6.method1122(Static66.anInt1307), Static220.anInt3913 | 0xFF000000, -1, local7 + 3, local9 + 14);
		arg0.method4896(local7, local9 + 20, local11, local15 - 20, -Static224.anInt3981 + 255 << 24 | Static254.anInt1039, 1);
		local86 = Static200.aClass10_1.method5242();
		local88 = Static200.aClass10_1.method5240();
		@Pc(177) int local177 = 0;
		@Pc(198) int local198;
		for (@Pc(182) Class3_Sub4 local182 = (Class3_Sub4) Static47.aClass138_7.method3051(); local182 != null; local182 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
			local198 = (Static105.anInt2076 - local177 - 1) * 16 + local9 + 20 + 13;
			if (local86 > local7 && local11 + local7 > local86 && local88 > local198 - 13 && local88 < local198 + 4 && local182.aBoolean43) {
				arg0.method4896(local7, local198 - 12, local11, 16, 255 - Static23.anInt300 << 24 | Static138.anInt2625, 1);
			}
			local177++;
		}
		if ((Static276.aClass110_13 == null || Static350.aClass110_18 == null || Static45.aClass110_1 == null) && Static77.aClass20_19.method226(Static390.anInt6094) && Static77.aClass20_19.method226(Static187.anInt3395) && Static77.aClass20_19.method226(Static119.anInt2255)) {
			@Pc(274) Class127 local274 = Static402.method2800(Static77.aClass20_19, Static187.anInt3395, 0);
			Static350.aClass110_18 = arg0.method4869(local274);
			local274.method2802();
			Static180.aClass110_8 = arg0.method4869(local274);
			Static276.aClass110_13 = arg0.method4869(Static402.method2800(Static77.aClass20_19, Static390.anInt6094, 0));
			@Pc(299) Class127 local299 = Static402.method2800(Static77.aClass20_19, Static119.anInt2255, 0);
			Static45.aClass110_1 = arg0.method4869(local299);
			local299.method2802();
			Static331.aClass110_16 = arg0.method4869(local299);
		}
		local177 = 0;
		@Pc(373) int local373;
		@Pc(332) int local332;
		if (Static276.aClass110_13 != null && Static350.aClass110_18 != null && Static45.aClass110_1 != null) {
			local198 = (local11 - Static45.aClass110_1.method5091() * 2) / Static276.aClass110_13.method5091();
			for (local332 = 0; local332 < local198; local332++) {
				Static276.aClass110_13.method5094(Static45.aClass110_1.method5091() + local7 + Static276.aClass110_13.method5091() * local332, -Static276.aClass110_13.method5090() + local9 + local15);
			}
			local373 = (local15 - Static45.aClass110_1.method5090() - 20) / Static350.aClass110_18.method5090();
			for (@Pc(375) int local375 = 0; local375 < local373; local375++) {
				Static350.aClass110_18.method5094(local7, local375 * Static350.aClass110_18.method5090() + local9 + 20);
				Static180.aClass110_8.method5094(local7 + local11 - Static180.aClass110_8.method5091(), Static350.aClass110_18.method5090() * local375 + local9 + 20);
			}
			Static45.aClass110_1.method5094(local7, local15 + local9 - Static45.aClass110_1.method5090());
			Static331.aClass110_16.method5094(local7 + local11 - Static45.aClass110_1.method5091(), -Static45.aClass110_1.method5090() + local15 + local9);
		}
		for (@Pc(441) Class3_Sub4 local441 = (Class3_Sub4) Static47.aClass138_7.method3051(); local441 != null; local441 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
			local332 = (Static105.anInt2076 - local177 - 1) * 16 + local9 + 33;
			local373 = Static220.anInt3913 | 0xFF000000;
			if (local86 > local7 && local11 + local7 > local86 && local88 > local332 - 13 && local332 + 4 > local88 && local441.aBoolean43) {
				local373 = Static233.anInt4155 | 0xFF000000;
			}
			@Pc(502) int[] local502 = null;
			if (Static336.method1972(local441.anInt808)) {
				local502 = Static176.aClass78_3.method1641((int) local441.aLong17).anIntArray103;
			} else if (local441.anInt809 != -1) {
				local502 = Static176.aClass78_3.method1641(local441.anInt809).anIntArray103;
			} else if (Static325.method5003(local441.anInt808)) {
				@Pc(522) Class28_Sub1_Sub1_Sub1 local522 = Static166.aClass28_Sub1_Sub1_Sub1Array41[(int) local441.aLong17];
				if (local522 != null) {
					@Pc(527) Class61 local527 = local522.aClass61_1;
					if (local527.anIntArray142 != null) {
						local527 = local527.method1216(Static331.aClass115_1);
					}
					if (local527 != null) {
						local502 = local527.anIntArray144;
					}
				}
			} else if (Static248.method4059(local441.anInt808)) {
				@Pc(563) Class60 local563;
				if (local441.anInt808 == 1007) {
					local563 = Static97.aClass217_4.method5007((int) local441.aLong17);
				} else {
					local563 = Static97.aClass217_4.method5007((int) (local441.aLong17 >>> 32 & 0x7FFFFFFFL));
				}
				if (local563.anIntArray134 != null) {
					local563 = local563.method1191(Static331.aClass115_1);
				}
				if (local563 != null) {
					local502 = local563.anIntArray136;
				}
			}
			@Pc(605) String local605 = Static380.method5624(local441);
			if (local502 != null) {
				local605 = local605 + Static131.method2067(local502);
			}
			Static95.aClass150_6.method5726(local373, Static371.aClass110Array14, local605, Static72.anIntArray141, local7 + 3, local332);
			local177++;
			if (local441.aBoolean44) {
				Static362.aClass110_19.method5094(Static366.aClass190_7.method4358(local605) + local7 + 5, local332 + -12);
			}
		}
		Static355.method5327(Static96.anInt1932, Static139.anInt2635, Static321.anInt3403, Static392.anInt6472);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!np;)V")
	public static void method4128(@OriginalArg(1) Class155 arg0) {
		@Pc(7) int local7 = Static96.anInt1932;
		@Pc(15) int local15 = Static321.anInt3403;
		@Pc(17) int local17 = Static392.anInt6472;
		@Pc(19) int local19 = Static139.anInt2635;
		arg0.method4954(local19, local15, local17, local7, -10660793);
		arg0.method4954(16, local15 + 1, local17 + -2, local7 + 1, -16777216);
		arg0.method4885(local19 - 19, -16777216, -2 + local17, local15 + 18, local7 - -1);
		Static95.aClass150_6.method5722(Static14.aClass57_6.method1122(Static66.anInt1307), -10660793, -1, local7 + 3, local15 - -14);
		@Pc(78) int local78 = Static200.aClass10_1.method5242();
		@Pc(82) int local82 = Static200.aClass10_1.method5240();
		@Pc(84) int local84 = 0;
		for (@Pc(89) Class3_Sub4 local89 = (Class3_Sub4) Static47.aClass138_7.method3051(); local89 != null; local89 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
			@Pc(103) int local103 = local15 + (Static105.anInt2076 + -1 - local84) * 16 + 31;
			@Pc(105) short local105 = -1;
			if (local78 > local7 && local17 + local7 > local78 && local103 - 13 < local82 && local82 < local103 + 3 && local89.aBoolean43) {
				local105 = -256;
			}
			@Pc(138) int[] local138 = null;
			if (Static336.method1972(local89.anInt808)) {
				local138 = Static176.aClass78_3.method1641((int) local89.aLong17).anIntArray103;
			} else if (local89.anInt809 != -1) {
				local138 = Static176.aClass78_3.method1641(local89.anInt809).anIntArray103;
			} else if (Static325.method5003(local89.anInt808)) {
				@Pc(215) Class28_Sub1_Sub1_Sub1 local215 = Static166.aClass28_Sub1_Sub1_Sub1Array41[(int) local89.aLong17];
				if (local215 != null) {
					@Pc(220) Class61 local220 = local215.aClass61_1;
					if (local220.anIntArray142 != null) {
						local220 = local220.method1216(Static331.aClass115_1);
					}
					if (local220 != null) {
						local138 = local220.anIntArray144;
					}
				}
			} else if (Static248.method4059(local89.anInt808)) {
				@Pc(183) Class60 local183;
				if (local89.anInt808 == 1007) {
					local183 = Static97.aClass217_4.method5007((int) local89.aLong17);
				} else {
					local183 = Static97.aClass217_4.method5007((int) (local89.aLong17 >>> 32 & 0x7FFFFFFFL));
				}
				if (local183.anIntArray134 != null) {
					local183 = local183.method1191(Static331.aClass115_1);
				}
				if (local183 != null) {
					local138 = local183.anIntArray136;
				}
			}
			@Pc(247) String local247 = Static380.method5624(local89);
			if (local138 != null) {
				local247 = local247 + Static131.method2067(local138);
			}
			Static95.aClass150_6.method5726(local105, Static371.aClass110Array14, local247, Static72.anIntArray141, local7 + 3, local103);
			if (local89.aBoolean44) {
				Static362.aClass110_19.method5094(Static366.aClass190_7.method4358(local247) + local7 + 5, local103 + -12);
			}
			local84++;
		}
		Static355.method5327(Static96.anInt1932, Static139.anInt2635, Static321.anInt3403, Static392.anInt6472);
	}
}
