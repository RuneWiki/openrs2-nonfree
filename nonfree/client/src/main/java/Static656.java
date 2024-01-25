import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZ)Z")
	public static boolean method8799(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(BLclient!el;[[B)V")
	public static void method8800(@OriginalArg(1) Class104_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(10) int[] local10 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(19) int local19;
		@Pc(22) int local22;
		@Pc(31) int local31;
		@Pc(40) int local40;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2904; local12++) {
			Static250.method3863();
			for (local19 = 0; local19 < Static201.anInt3834 >> 3; local19++) {
				for (local22 = 0; local22 < Static626.anInt10238 >> 3; local22++) {
					local31 = Static396.anIntArrayArrayArray33[local12][local19][local22];
					if (local31 != -1) {
						local40 = local31 >> 24 & 0x3;
						if (!arg0.aBoolean248 || local40 == 0) {
							@Pc(51) int local51 = local31 >> 1 & 0x3;
							@Pc(57) int local57 = local31 >> 14 & 0x3FF;
							@Pc(63) int local63 = local31 >> 3 & 0x7FF;
							@Pc(73) int local73 = (local57 / 8 << 8) + local63 / 8;
							for (@Pc(75) int local75 = 0; local75 < Static611.anIntArray552.length; local75++) {
								if (Static611.anIntArray552[local75] == local73 && arg1[local75] != null) {
									@Pc(92) Class5_Sub41 local92 = new Class5_Sub41(arg1[local75]);
									arg0.method2582(local40, local63, local92, local51, Static275.aClass106Array1, local19 * 8, local57, local12, local22 * 8);
									arg0.method2597(local92, local40, Static208.aClass65_7, local10[0] == -1 ? local10 : null, local63, local51, local22 * 8, local57, local19 * 8, local12);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local19 = 0; local19 < arg0.anInt2904; local19++) {
			Static250.method3863();
			for (local22 = 0; local22 < Static201.anInt3834 >> 3; local22++) {
				for (local31 = 0; local31 < Static626.anInt10238 >> 3; local31++) {
					local40 = Static396.anIntArrayArrayArray33[local19][local22][local31];
					if (local40 == -1) {
						arg0.method2588(8, local19, local22 * 8, local31 * 8, 8);
					}
				}
			}
		}
		if (local10[0] != -1) {
			Static424.aClass20_1 = Static62.aClass393_1.method9019(local10[3], local10[1], local10[2], local10[0], Static230.aClass122_1);
			Static487.anInt8173 = local10[4];
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method8801(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) String local2 = arg0.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg1 ? 32768 : 0;
		@Pc(27) int local27 = local17 + (arg1 ? Static502.aClass163_2.anInt4618 : Static502.aClass163_2.anInt4617);
		for (@Pc(36) int local36 = local17; local36 < local27; local36++) {
			@Pc(42) Class5_Sub3_Sub2 local42 = Static502.aClass163_2.method3900(local36);
			if (local42.aBoolean218 && local42.method2141().toLowerCase().indexOf(local2) != -1) {
				if (local11 >= 50) {
					Static285.aShortArray74 = null;
					Static227.anInt4175 = -1;
					return;
				}
				if (local9.length <= local11) {
					@Pc(72) short[] local72 = new short[local9.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local11; local74++) {
						local72[local74] = local9[local74];
					}
					local9 = local72;
				}
				local9[local11++] = (short) local36;
			}
		}
		Static227.anInt4175 = local11;
		Static285.aShortArray74 = local9;
		Static175.anInt3412 = 0;
		@Pc(114) String[] local114 = new String[Static227.anInt4175];
		for (@Pc(116) int local116 = 0; local116 < Static227.anInt4175; local116++) {
			local114[local116] = Static502.aClass163_2.method3900(local9[local116]).method2141();
		}
		Static679.method9047(Static285.aShortArray74, local114);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZIILjava/lang/String;)V")
	public static void method8802(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static417.method6202();
		Static613.method8325();
		Static446.method6474();
		Static77.method1011(arg2, arg0, arg1);
		Static236.method3644();
		Static508.method7269(Static208.aClass65_7);
		Static679.method9046(Static208.aClass65_7);
		Static113.method2119(Static257.aClass390_60, Static208.aClass65_7);
		Static169.method2948();
		Static436.method6381(Static366.aClass50Array9);
		Static283.method4543();
		Static675.method9021();
		if (Static173.anInt3397 == 3) {
			Static271.method4671(4);
		} else if (Static173.anInt3397 == 7) {
			Static271.method4671(8);
		} else if (Static173.anInt3397 == 10) {
			Static271.method4671(11);
		} else if (Static173.anInt3397 == 1 || Static173.anInt3397 == 2) {
			Static389.method5739();
		}
	}
}
