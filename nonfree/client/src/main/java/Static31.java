import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_27 = new Class221("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public static final int[] anIntArray107 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method733(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!km;)V")
	public static void method735(@OriginalArg(1) Class82 arg0) {
		@Pc(7) int local7 = Static8.anInt189;
		@Pc(9) int local9 = Static40.anInt6591;
		@Pc(11) int local11 = Static300.anInt5403;
		@Pc(20) int local20 = Static71.anInt1351;
		arg0.method4486(local20, local11, local7, -10660793, local9);
		arg0.method4486(16, local11 - 2, local7 + 1, -16777216, local9 + 1);
		arg0.method4525(local11 - 2, local20 - 19, local9 + 18, -16777216, local7 + 1);
		Static34.aClass13_1.method5602(local9 + 14, Static5.aClass221_239.method5229(Static189.anInt5185), -10660793, -1, local7 + 3);
		@Pc(79) int local79 = Static138.aClass78_1.method1804();
		@Pc(85) int local85 = Static138.aClass78_1.method1808();
		@Pc(87) int local87 = 0;
		for (@Pc(92) Class2_Sub7 local92 = (Class2_Sub7) Static66.aClass210_43.method5035(); local92 != null; local92 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
			@Pc(107) int local107 = (Static379.anInt1192 - local87 - 1) * 16 + local9 + 31;
			@Pc(109) short local109 = -1;
			if (local7 < local79 && local11 + local7 > local79 && local107 - 13 < local85 && local85 < local107 + 3 && local92.aBoolean39) {
				local109 = -256;
			}
			@Pc(134) int[] local134 = null;
			if (Static79.method1414(local92.anInt541)) {
				local134 = Static106.aClass250_1.method5735((int) local92.aLong22).anIntArray326;
			} else if (local92.anInt546 != -1) {
				local134 = Static106.aClass250_1.method5735(local92.anInt546).anIntArray326;
			} else if (Static27.method683(local92.anInt541)) {
				@Pc(200) Class12_Sub1_Sub2_Sub1 local200 = Static107.aClass12_Sub1_Sub2_Sub1Array1[(int) local92.aLong22];
				if (local200 != null) {
					@Pc(205) Class240 local205 = local200.aClass240_1;
					if (local205.anIntArray781 != null) {
						local205 = local205.method5567(Static248.aClass125_1);
					}
					if (local205 != null) {
						local134 = local205.anIntArray783;
					}
				}
			} else if (Static173.method2826(local92.anInt541)) {
				@Pc(172) Class34 local172;
				if (local92.anInt541 == 1007) {
					local172 = Static11.aClass123_5.method2703((int) local92.aLong22);
				} else {
					local172 = Static11.aClass123_5.method2703((int) (local92.aLong22 >>> 32 & 0x7FFFFFFFL));
				}
				if (local172.anIntArray122 != null) {
					local172 = local172.method831(Static248.aClass125_1);
				}
				if (local172 != null) {
					local134 = local172.anIntArray120;
				}
			}
			@Pc(239) String local239 = Static58.method4853(local92);
			if (local134 != null) {
				local239 = local239 + Static254.method4014(local134);
			}
			Static34.aClass13_1.method5620(Static215.anIntArray491, local239, local7 + 3, local109, Static52.aClass5Array11, local107);
			local87++;
			if (local92.aBoolean38) {
				Static372.aClass5_16.method5004(Static60.aClass216_3.method5073(local239) + local7 + 5, local107 + -12);
			}
		}
		Static380.method5676(Static300.anInt5403, Static8.anInt189, Static40.anInt6591, Static71.anInt1351);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	public static void method736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) int local25;
		if (arg1 != Static151.anInt2711) {
			Static160.anIntArray329 = new int[arg1];
			for (local25 = 0; local25 < arg1; local25++) {
				Static160.anIntArray329[local25] = (local25 << 12) / arg1;
			}
			Static274.anInt1078 = arg1 - 1;
			Static151.anInt2711 = arg1;
			Static23.anInt552 = arg1 * 32;
		}
		if (Static372.anInt6520 == arg0) {
			return;
		}
		if (Static151.anInt2711 == arg0) {
			Static138.anIntArray291 = Static160.anIntArray329;
		} else {
			Static138.anIntArray291 = new int[arg0];
			for (local25 = 0; local25 < arg0; local25++) {
				Static138.anIntArray291[local25] = (local25 << 12) / arg0;
			}
		}
		Static372.anInt6520 = arg0;
		Static71.anInt1349 = arg0 - 1;
	}
}
