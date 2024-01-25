import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!wo", name = "L", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_113 = new Class183(19, 4);

	@OriginalMember(owner = "client!wo", name = "Q", descriptor = "I")
	public static int anInt7080 = -1;

	@OriginalMember(owner = "client!wo", name = "S", descriptor = "[S")
	public static short[] aShortArray118 = new short[256];

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZI)V")
	public static void method6091(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class2_Sub32 local8 = Static76.method1317(arg1, arg0);
		if (local8 != null) {
			local8.method6130();
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	public static void method6092() {
		if (Static339.method5448() != 2) {
			return;
		}
		@Pc(17) byte local17 = (byte) (Static87.anInt1878 - 4 & 0xFF);
		@Pc(25) int local25 = Static87.anInt1878 % Static89.anInt1891;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static85.anInt1839; local31++) {
				Static116.aByteArrayArrayArray2[local27][local25][local31] = local17;
			}
		}
		if (Static241.anInt2711 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static172.anIntArray273[local31] = -1000000;
			Static67.anIntArray112[local31] = 1000000;
			Static230.anIntArray383[local31] = 0;
			Static345.anIntArray541[local31] = 1000000;
			Static17.anIntArray51[local31] = 0;
		}
		@Pc(96) int local96;
		if (Static198.anInt4108 != 1) {
			local96 = Static36.method2335(Static27.anInt2842, Static241.anInt2711, Static145.anInt5345);
			if (local96 - Static266.anInt5034 < 800 && (Static329.aByteArrayArrayArray17[Static241.anInt2711][Static145.anInt5345 >> 7][Static27.anInt2842 >> 7] & 0x4) != 0) {
				Static190.method3482(Static45.aClass188ArrayArrayArray5, Static145.anInt5345 >> 7, false, Static27.anInt2842 >> 7, 1);
				return;
			}
			return;
		}
		if ((Static329.aByteArrayArrayArray17[Static241.anInt2711][Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >> 7][Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >> 7] & 0x4) != 0) {
			Static190.method3482(Static45.aClass188ArrayArrayArray5, Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >> 7, false, Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >> 7, 0);
		}
		if (Static237.anInt4684 >= 2560) {
			return;
		}
		local96 = Static145.anInt5345 >> 7;
		@Pc(171) int local171 = Static27.anInt2842 >> 7;
		@Pc(176) int local176 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >> 7;
		@Pc(181) int local181 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >> 7;
		@Pc(193) int local193;
		if (local96 < local176) {
			local193 = local176 - local96;
		} else {
			local193 = local96 - local176;
		}
		@Pc(207) int local207;
		if (local181 > local171) {
			local207 = local181 - local171;
		} else {
			local207 = local171 - local181;
		}
		if (local193 == 0 && local207 == 0 || -Static89.anInt1891 >= local193 || local193 >= Static89.anInt1891 || -Static85.anInt1839 >= local207 || local207 >= Static85.anInt1839) {
			Static346.method5531(null, "RC: " + local96 + "," + local171 + " " + local176 + "," + local181 + " " + Static279.anInt5198 + "," + Static350.anInt6470);
			return;
		}
		@Pc(295) int local295;
		@Pc(297) int local297;
		if (local207 >= local193) {
			local295 = local193 * 65536 / local207;
			local297 = 32768;
			while (local181 != local171) {
				if (local171 < local181) {
					local171++;
				} else if (local181 < local171) {
					local171--;
				}
				if ((Static329.aByteArrayArrayArray17[Static241.anInt2711][local96][local171] & 0x4) != 0) {
					Static190.method3482(Static45.aClass188ArrayArrayArray5, local96, false, local171, 1);
					return;
				}
				local297 += local295;
				if (local297 >= 65536) {
					if (local176 > local96) {
						local96++;
					} else if (local96 > local176) {
						local96--;
					}
					local297 -= 65536;
					if ((Static329.aByteArrayArrayArray17[Static241.anInt2711][local96][local171] & 0x4) != 0) {
						Static190.method3482(Static45.aClass188ArrayArrayArray5, local96, false, local171, 1);
						return;
					}
				}
			}
			return;
		}
		local295 = local207 * 65536 / local193;
		local297 = 32768;
		while (local96 != local176) {
			if (local176 > local96) {
				local96++;
			} else if (local96 > local176) {
				local96--;
			}
			if ((Static329.aByteArrayArrayArray17[Static241.anInt2711][local96][local171] & 0x4) != 0) {
				Static190.method3482(Static45.aClass188ArrayArrayArray5, local96, false, local171, 1);
				return;
			}
			local297 += local295;
			if (local297 >= 65536) {
				if (local171 < local181) {
					local171++;
				} else if (local171 > local181) {
					local171--;
				}
				local297 -= 65536;
				if ((Static329.aByteArrayArrayArray17[Static241.anInt2711][local96][local171] & 0x4) != 0) {
					Static190.method3482(Static45.aClass188ArrayArrayArray5, local96, false, local171, 1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(Z)V")
	public static void method6093() {
		Static137.method1143(Static42.anInt733);
		@Pc(17) int local17 = (Static145.anInt5345 >> 10) + (Static279.anInt5198 >> 3);
		Static241.anInt2711 = Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 = 0;
		@Pc(31) int local31 = (Static27.anInt2842 >> 10) + (Static350.anInt6470 >> 3);
		Static182.aClass1_Sub2_Sub1_Sub1_1.method703(8, 8);
		Static297.aByteArrayArray17 = new byte[18][];
		Static164.anIntArray263 = new int[18];
		Static40.aByteArrayArray3 = new byte[18][];
		Static146.aByteArrayArray12 = new byte[18][];
		Static51.anIntArray80 = new int[18];
		Static42.aByteArrayArray4 = new byte[18][];
		Static1.anIntArray583 = new int[18];
		Static71.anIntArray118 = new int[18];
		Static132.anIntArray220 = new int[18];
		Static310.anIntArray498 = new int[18];
		Static25.anIntArrayArray20 = new int[18][4];
		Static227.aByteArrayArray15 = new byte[18][];
		@Pc(77) int local77 = 0;
		@Pc(97) int local97;
		for (@Pc(86) int local86 = (local17 - (Static89.anInt1891 >> 4)) / 8; local86 <= ((Static89.anInt1891 >> 4) + local17) / 8; local86++) {
			for (local97 = (local31 - (Static85.anInt1839 >> 4)) / 8; local97 <= (local31 + (Static85.anInt1839 >> 4)) / 8; local97++) {
				@Pc(105) int local105 = (local86 << 8) + local97;
				Static71.anIntArray118[local77] = local105;
				Static1.anIntArray583[local77] = Static90.aClass83_42.method1961("m" + local86 + "_" + local97);
				Static51.anIntArray80[local77] = Static90.aClass83_42.method1961("l" + local86 + "_" + local97);
				Static132.anIntArray220[local77] = Static90.aClass83_42.method1961("n" + local86 + "_" + local97);
				Static164.anIntArray263[local77] = Static90.aClass83_42.method1961("um" + local86 + "_" + local97);
				Static310.anIntArray498[local77] = Static90.aClass83_42.method1961("ul" + local86 + "_" + local97);
				if (Static132.anIntArray220[local77] == -1) {
					Static1.anIntArray583[local77] = -1;
					Static51.anIntArray80[local77] = -1;
					Static164.anIntArray263[local77] = -1;
					Static310.anIntArray498[local77] = -1;
				}
				local77++;
			}
		}
		for (local97 = local77; local97 < Static132.anIntArray220.length; local97++) {
			Static132.anIntArray220[local97] = -1;
			Static1.anIntArray583[local97] = -1;
			Static51.anIntArray80[local97] = -1;
			Static164.anIntArray263[local97] = -1;
			Static310.anIntArray498[local97] = -1;
		}
		Static131.method2287(false, local31, true, local17);
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V")
	public static void method6095() {
		Static203.method3470();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static165.aClass178Array1[local8].method4482();
		}
		Static124.method3771();
		Static227.method4131();
		System.gc();
	}
}
