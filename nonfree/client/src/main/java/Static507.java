import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
	public static int anInt8745;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!ef;")
	public static final Class77 aClass77_4 = new Class77();

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public static int anInt8741 = 765;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Lclient!he;")
	public static Class128 aClass128_42 = new Class128(8);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)I")
	public static int method7514(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method7515() {
		@Pc(9) int local9 = Static456.aClass6_Sub40_Sub2_2.method8552();
		Static152.anInt5122 = Static456.aClass6_Sub40_Sub2_2.method8576();
		@Pc(17) int local17 = Static456.aClass6_Sub40_Sub2_2.method8573();
		@Pc(28) boolean local28 = Static456.aClass6_Sub40_Sub2_2.method8573() == 1;
		@Pc(32) int local32 = Static456.aClass6_Sub40_Sub2_2.method8614();
		Static518.method7753();
		Static351.method5660(local17);
		Static456.aClass6_Sub40_Sub2_2.method8618();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static442.anInt7975 >> 3; local46++) {
				for (local50 = 0; local50 < Static284.anInt7916 >> 3; local50++) {
					local57 = Static456.aClass6_Sub40_Sub2_2.method8619(1);
					if (local57 == 1) {
						Static246.anIntArrayArrayArray2[local42][local46][local50] = Static456.aClass6_Sub40_Sub2_2.method8619(26);
					} else {
						Static246.anIntArrayArrayArray2[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static456.aClass6_Sub40_Sub2_2.method8631();
		local46 = (Static501.anInt8676 - Static456.aClass6_Sub40_Sub2_2.anInt10169) / 16;
		Static495.anIntArrayArray43 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static495.anIntArrayArray43[local50][local57] = Static456.aClass6_Sub40_Sub2_2.method8579();
			}
		}
		Static510.aByteArrayArray140 = new byte[local46][];
		Static91.aByteArrayArray23 = new byte[local46][];
		Static327.aByteArrayArray102 = null;
		Static173.anIntArray217 = new int[local46];
		Static330.anIntArray372 = new int[local46];
		Static82.anIntArray114 = null;
		Static85.aByteArrayArray31 = new byte[local46][];
		Static29.anIntArray36 = new int[local46];
		Static480.anIntArray523 = new int[local46];
		Static69.anIntArray100 = new int[local46];
		Static117.aByteArrayArray43 = new byte[local46][];
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(189) int local189 = 0; local189 < Static442.anInt7975 >> 3; local189++) {
				for (@Pc(193) int local193 = 0; local193 < Static284.anInt7916 >> 3; local193++) {
					@Pc(203) int local203 = Static246.anIntArrayArrayArray2[local57][local189][local193];
					if (local203 != -1) {
						@Pc(212) int local212 = local203 >> 14 & 0x3FF;
						@Pc(218) int local218 = local203 >> 3 & 0x7FF;
						@Pc(229) int local229 = (local212 / 8 << 8) + (local218 / 8);
						for (@Pc(231) int local231 = 0; local231 < local46; local231++) {
							if (local229 == Static480.anIntArray523[local231]) {
								local229 = -1;
								break;
							}
						}
						if (local229 != -1) {
							Static480.anIntArray523[local46] = local229;
							@Pc(267) int local267 = local229 >> 8 & 0xFF;
							@Pc(271) int local271 = local229 & 0xFF;
							Static29.anIntArray36[local46] = Static503.aClass353_102.method8410("m" + local267 + "_" + local271);
							Static69.anIntArray100[local46] = Static503.aClass353_102.method8410("l" + local267 + "_" + local271);
							Static173.anIntArray217[local46] = Static503.aClass353_102.method8410("um" + local267 + "_" + local271);
							Static330.anIntArray372[local46] = Static503.aClass353_102.method8410("ul" + local267 + "_" + local271);
							local46++;
						}
					}
				}
			}
		}
		Static323.method5375(local28, local32, local9, 11);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
	public static void method7517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1012) {
			Static244.method4200(Static467.aClass240_11, arg1, arg0);
		} else if (arg2 == 1007) {
			Static244.method4200(Static333.aClass240_13, arg1, arg0);
		} else if (arg2 == 1002) {
			Static244.method4200(Static357.aClass240_4, arg1, arg0);
		} else if (arg2 == 1006) {
			Static244.method4200(Static225.aClass240_6, arg1, arg0);
		} else if (arg2 == 1010) {
			Static244.method4200(Static348.aClass240_8, arg1, arg0);
		}
	}
}
