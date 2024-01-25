import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Lclient!fca;")
	public static Class97 aClass97_14 = null;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	public static void method7578() {
		if (Static480.aClass6_Sub37_Sub1_1.method5159(Static567.anInt9503) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static43.anInt710 - 4 & 0xFF);
		@Pc(23) int local23 = Static43.anInt710 % Static301.anInt4912;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static473.anInt7969; local29++) {
				Static393.aByteArrayArrayArray16[local25][local23][local29] = local19;
			}
		}
		if (Static282.anInt4677 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static494.anIntArray640[local29] = -1000000;
			Static529.anIntArray680[local29] = 1000000;
			Static346.anIntArray533[local29] = 0;
			Static180.anIntArray693[local29] = 1000000;
			Static343.anIntArray529[local29] = 0;
		}
		@Pc(128) int local128;
		if (Static354.anInt6233 != 1) {
			local128 = Static490.method6768(Static388.anInt6921, Static282.anInt4677, Static220.anInt3753);
			if (local128 - Static33.anInt568 >= 3200 || (Static303.aByteArrayArrayArray13[Static282.anInt4677][Static388.anInt6921 >> 9][Static220.anInt3753 >> 9] & 0x4) == 0) {
				return;
			}
			Static111.method1750(Static208.aClass9ArrayArrayArray3, 1, Static388.anInt6921 >> 9, false, Static220.anInt3753 >> 9);
			return;
		}
		if ((Static303.aByteArrayArrayArray13[Static282.anInt4677][Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >> 9][Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >> 9] & 0x4) != 0) {
			Static111.method1750(Static208.aClass9ArrayArrayArray3, 0, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >> 9, false, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >> 9);
		}
		if (Static162.anInt2840 >= 2560) {
			return;
		}
		local128 = Static388.anInt6921 >> 9;
		@Pc(132) int local132 = Static220.anInt3753 >> 9;
		@Pc(137) int local137 = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >> 9;
		@Pc(142) int local142 = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >> 9;
		@Pc(154) int local154;
		if (local137 <= local128) {
			local154 = local128 - local137;
		} else {
			local154 = local137 - local128;
		}
		@Pc(173) int local173;
		if (local142 <= local132) {
			local173 = local132 - local142;
		} else {
			local173 = local142 - local132;
		}
		if ((local154 != 0 || local173 != 0) && -Static301.anInt4912 < local154 && Static301.anInt4912 > local154 && -Static473.anInt7969 < local173 && Static473.anInt7969 > local173) {
			@Pc(248) int local248;
			@Pc(250) int local250;
			if (local154 > local173) {
				local248 = local173 * 65536 / local154;
				local250 = 32768;
				while (local128 != local137) {
					if (local137 > local128) {
						local128++;
					} else if (local128 > local137) {
						local128--;
					}
					if ((Static303.aByteArrayArrayArray13[Static282.anInt4677][local128][local132] & 0x4) != 0) {
						Static111.method1750(Static208.aClass9ArrayArrayArray3, 1, local128, false, local132);
						return;
					}
					local250 += local248;
					if (local250 >= 65536) {
						if (local132 < local142) {
							local132++;
						} else if (local132 > local142) {
							local132--;
						}
						local250 -= 65536;
						if ((Static303.aByteArrayArrayArray13[Static282.anInt4677][local128][local132] & 0x4) != 0) {
							Static111.method1750(Static208.aClass9ArrayArrayArray3, 1, local128, false, local132);
							return;
						}
					}
				}
				return;
			}
			local248 = local154 * 65536 / local173;
			local250 = 32768;
			while (local142 != local132) {
				if (local132 < local142) {
					local132++;
				} else if (local132 > local142) {
					local132--;
				}
				if ((Static303.aByteArrayArrayArray13[Static282.anInt4677][local128][local132] & 0x4) != 0) {
					Static111.method1750(Static208.aClass9ArrayArrayArray3, 1, local128, false, local132);
					return;
				}
				local250 += local248;
				if (local250 >= 65536) {
					local250 -= 65536;
					if (local128 < local137) {
						local128++;
					} else if (local137 < local128) {
						local128--;
					}
					if ((Static303.aByteArrayArrayArray13[Static282.anInt4677][local128][local132] & 0x4) != 0) {
						Static111.method1750(Static208.aClass9ArrayArrayArray3, 1, local128, false, local132);
						return;
					}
				}
			}
			return;
		}
		Static169.method2641("RC: " + local128 + "," + local132 + " " + local137 + "," + local142 + " " + Static218.anInt3718 + "," + Static167.anInt3048, null);
		return;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7582(@OriginalArg(1) String arg0) {
		if (!Static492.aBoolean560) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static199.anInt3448;
		@Pc(14) int[] local14 = Static272.anIntArray443;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class29_Sub2_Sub1_Sub2 local24 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local14[local16]];
			if (local24 != null && local24 != Static426.aClass29_Sub2_Sub1_Sub2_2 && local24.aString108 != null && local24.aString108.equalsIgnoreCase(arg0)) {
				Static136.method2051(Static526.aClass160_114);
				Static218.aClass6_Sub14_Sub2_1.method5995(Static288.anInt4713);
				Static218.aClass6_Sub14_Sub2_1.method5980(local14[local16]);
				Static218.aClass6_Sub14_Sub2_1.method5980(Static443.anInt7698);
				Static218.aClass6_Sub14_Sub2_1.method5980(Static537.anInt9108);
				Static218.aClass6_Sub14_Sub2_1.method6004(0);
				Static229.method3372(0, local24.method7008(), -2, local24.anIntArray660[0], 0, local24.method7008(), local24.anIntArray661[0], true);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static418.method6132(Static141.aClass104_66.method2145(Static470.anInt7957) + arg0);
		}
		if (Static492.aBoolean560) {
			Static465.method6520();
		}
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)Lclient!efa;")
	public static Class8_Sub1 method7583() {
		Static93.anInt1570 = 0;
		return Static44.method596();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLclient!oa;IZ)Lclient!lu;")
	public static Class191 method7586(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return null;
		}
		if (Static380.anIntArray555 != null) {
			for (@Pc(20) int local20 = 0; local20 < Static380.anIntArray555.length; local20++) {
				if (arg1 == Static380.anIntArray555[local20]) {
					return Static400.aClass191Array2[local20];
				}
			}
		}
		@Pc(49) Class191 local49 = (Class191) Static397.aClass332_13.method7502((long) arg1);
		if (local49 != null) {
			if (local49.aClass146_5 == null) {
				@Pc(61) Class146 local61 = Static261.method3647(arg1, Static15.aClass251_139);
				if (local61 == null) {
					return null;
				}
				local49.aClass146_5 = local61;
			}
			return local49;
		}
		@Pc(74) Class196[] local74 = Static589.method4742(Static251.aClass251_87, arg1);
		if (local74 == null) {
			return null;
		}
		@Pc(83) Class146 local83 = Static261.method3647(arg1, Static15.aClass251_139);
		if (local83 == null) {
			return null;
		} else {
			local49 = new Class191(arg0.method7123(local83, local74), local83);
			Static397.aClass332_13.method7498((long) arg1, local49);
			return local49;
		}
	}
}
