import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_102 = new Class268(98, 17);

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "[I")
	public static final int[] anIntArray354 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method5098(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(16) String local16 = arg0[arg2];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg2 + arg1;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg2; local31 < local27; local31++) {
				@Pc(37) String local37 = arg0[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local29);
			for (@Pc(62) int local62 = arg2; local62 < local27; local62++) {
				@Pc(68) String local68 = arg0[local62];
				if (local68 == null) {
					local60.append("null");
				} else {
					local60.append(local68);
				}
			}
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIILclient!ha;)V")
	public static void method5099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class100 arg4) {
		arg4.KA(arg3, arg1, arg0 + arg3, arg1 + arg2);
		arg4.method8815(arg3, -16777216, arg0, arg1, arg2);
		if (Static433.anInt7858 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static487.anInt7457 / (float) Static487.anInt7462;
		@Pc(37) int local37 = arg0;
		@Pc(44) int local44 = arg2;
		if (local35 < 1.0F) {
			local44 = (int) (local35 * (float) arg0);
		} else {
			local37 = (int) ((float) arg2 / local35);
		}
		@Pc(70) int local70 = arg1 + (arg2 - local44) / 2;
		@Pc(78) int local78 = arg3 + (arg0 - local37) / 2;
		if (Static164.aClass32_7 == null || arg0 != Static164.aClass32_7.method5072() || arg2 != Static164.aClass32_7.method5077()) {
			Static487.method6438(Static487.anInt7459, Static487.anInt7457 + Static487.anInt7453, Static487.anInt7459 - -Static487.anInt7462, Static487.anInt7453, local78, local70, local78 + local37, local70 + local44);
			Static487.method6434(arg4);
			Static164.aClass32_7 = arg4.method8804(local78, local70, local37, local44, false);
		}
		Static164.aClass32_7.method5071(local78, local70);
		@Pc(130) int local130 = Static122.anInt2384 * local37 / Static487.anInt7462;
		@Pc(136) int local136 = Static354.anInt1505 * local44 / Static487.anInt7457;
		@Pc(144) int local144 = local78 + Static72.anInt1516 * local37 / Static487.anInt7462;
		@Pc(158) int local158 = local70 + local44 - local136 - Static284.anInt7920 * local44 / Static487.anInt7457;
		@Pc(160) int local160 = -1996554240;
		if (Static646.aClass271_15 == Static630.aClass271_17) {
			local160 = -1996488705;
		}
		arg4.aa(local144, local158, local130, local136, local160, 1);
		arg4.method8845(local144, local158, local130, local136, local160, 0);
		if (Static344.anInt6482 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static243.anInt4836 > 50) {
			local198 = (100 - Static243.anInt4836) * 5;
		} else {
			local198 = Static243.anInt4836 * 5;
		}
		for (@Pc(209) Class6_Sub45 local209 = (Class6_Sub45) Static487.aClass8_51.method149(); local209 != null; local209 = (Class6_Sub45) Static487.aClass8_51.method155()) {
			@Pc(217) Class105 local217 = Static487.aClass337_4.method8119(local209.anInt9417);
			if (Static292.method5057(local217)) {
				@Pc(245) int local245;
				@Pc(256) int local256;
				if (local209.anInt9417 == Static16.anInt284) {
					local245 = local78 + local209.anInt9419 * local37 / Static487.anInt7462;
					local256 = (Static487.anInt7457 - local209.anInt9422) * local44 / Static487.anInt7457 + local70;
					arg4.method8815(local245 - 2, local198 << 24 | 0xFFFF00, 4, local256 - 2, 4);
				} else if (Static316.anInt6069 != -1 && local217.anInt3392 == Static316.anInt6069) {
					local245 = local37 * local209.anInt9419 / Static487.anInt7462 + local78;
					local256 = local44 * (Static487.anInt7457 - local209.anInt9422) / Static487.anInt7457 + local70;
					arg4.method8815(local245 - 2, local198 << 24 | 0xFFFF00, 4, local256 - 2, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	public static void method5101() {
		for (@Pc(7) int local7 = 0; local7 < Static496.anInt8600; local7++) {
			Static542.aClass226Array4[local7] = null;
		}
		Static496.anInt8600 = 0;
		@Pc(29) int local29;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static535.anInt9275; local25++) {
			for (local29 = 0; local29 < Static544.anInt9353; local29++) {
				for (local33 = 0; local33 < Static608.anInt10072; local33++) {
					@Pc(43) Class97 local43 = Static272.aClass97ArrayArrayArray3[local25][local33][local29];
					if (local43 != null) {
						if (local43.aShort42 > 0) {
							local43.aShort42 = (short) (local43.aShort42 * -1);
						}
						if (local43.aShort41 > 0) {
							local43.aShort41 = (short) (local43.aShort41 * -1);
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < Static535.anInt9275; local29++) {
			for (local33 = 0; local33 < Static544.anInt9353; local33++) {
				for (@Pc(87) int local87 = 0; local87 < Static608.anInt10072; local87++) {
					@Pc(97) Class97 local97 = Static272.aClass97ArrayArrayArray3[local29][local87][local33];
					if (local97 != null) {
						@Pc(120) boolean local120 = Static272.aClass97ArrayArrayArray3[0][local87][local33] != null && Static272.aClass97ArrayArrayArray3[0][local87][local33].aClass97_1 != null;
						@Pc(125) int local125;
						@Pc(127) int local127;
						@Pc(141) Class97 local141;
						@Pc(151) int local151;
						@Pc(305) int local305;
						@Pc(319) int local319;
						@Pc(326) int local326;
						@Pc(342) int local342;
						@Pc(349) int local349;
						@Pc(353) int local353;
						@Pc(357) int local357;
						@Pc(363) int local363;
						@Pc(401) int local401;
						@Pc(405) int local405;
						if (local97.aShort41 < 0) {
							local125 = local33;
							local127 = local33;
							local141 = Static272.aClass97ArrayArrayArray3[local29][local87][local33 - 1];
							local151 = Static228.aClass199Array2[local29].method8532(local87, local33);
							while (local125 > 0 && local141 != null && local141.aShort41 < 0 && local141.aShort41 == local97.aShort41 && local97.aShort44 == local141.aShort44 && Static228.aClass199Array2[local29].method8532(local87, local125 - 1) == local151 && (local125 - 1 <= 0 || Static228.aClass199Array2[local29].method8532(local87, local125 - 2) == local151)) {
								local125--;
								local141 = Static272.aClass97ArrayArrayArray3[local29][local87][local125 - 1];
							}
							for (local141 = Static272.aClass97ArrayArrayArray3[local29][local87][local33 + 1]; local127 < Static608.anInt10072 && local141 != null && local141.aShort41 < 0 && local97.aShort41 == local141.aShort41 && local97.aShort44 == local141.aShort44 && Static228.aClass199Array2[local29].method8532(local87, local127 + 1) == local151 && (local127 + 1 >= Static608.anInt10072 || local151 == Static228.aClass199Array2[local29].method8532(local87, local127 + 2)); local141 = Static272.aClass97ArrayArrayArray3[local29][local87][local127 + 1]) {
								local127++;
							}
							local305 = local29 + 1 - local29;
							local319 = Static228.aClass199Array2[local120 ? local29 + 1 : local29].method8532(local87, local125);
							local326 = local97.aShort41 * local305 + local319;
							local342 = Static228.aClass199Array2[local120 ? local29 + 1 : local29].method8532(local87, local127 + 1);
							local349 = local97.aShort41 * local305 + local342;
							local353 = local87 << Static643.anInt10682;
							local357 = local125 << Static643.anInt10682;
							local363 = (local127 << Static643.anInt10682) + Static246.anInt4917;
							Static542.aClass226Array4[Static496.anInt8600++] = new Class226(1, local29, local353 + local97.aShort44, local353 + local97.aShort44, local97.aShort44 + local353, local353 + local97.aShort44, local319, local342, local349, local326, local357, local363, local363, local357);
							for (local401 = local29; local401 <= local29; local401++) {
								for (local405 = local125; local405 <= local127; local405++) {
									Static272.aClass97ArrayArrayArray3[local401][local87][local405].aShort41 = (short) (Static272.aClass97ArrayArrayArray3[local401][local87][local405].aShort41 * -1);
								}
							}
						}
						if (local97.aShort42 < 0) {
							local125 = local87;
							local127 = local87;
							local141 = Static272.aClass97ArrayArrayArray3[local29][local87 - 1][local33];
							local151 = Static228.aClass199Array2[local29].method8532(local87, local33);
							while (local125 > 0 && local141 != null && local141.aShort42 < 0 && local97.aShort42 == local141.aShort42 && local141.aShort43 == local97.aShort43 && Static228.aClass199Array2[local29].method8532(local125 - 1, local33) == local151 && (local125 - 1 <= 0 || local151 == Static228.aClass199Array2[local29].method8532(local125 - 2, local33))) {
								local125--;
								local141 = Static272.aClass97ArrayArrayArray3[local29][local125 - 1][local33];
							}
							for (local141 = Static272.aClass97ArrayArrayArray3[local29][local87 + 1][local33]; local127 < Static544.anInt9353 && local141 != null && local141.aShort42 < 0 && local141.aShort42 == local97.aShort42 && local97.aShort43 == local141.aShort43 && local151 == Static228.aClass199Array2[local29].method8532(local127 + 1, local33) && (Static544.anInt9353 <= local127 + 1 || local151 == Static228.aClass199Array2[local29].method8532(local127 + 2, local33)); local141 = Static272.aClass97ArrayArrayArray3[local29][local127 + 1][local33]) {
								local127++;
							}
							local305 = local29 + 1 - local29;
							local319 = Static228.aClass199Array2[local120 ? local29 + 1 : local29].method8532(local125, local33);
							local326 = local305 * local97.aShort42 + local319;
							local342 = Static228.aClass199Array2[local120 ? local29 + 1 : local29].method8532(local127 + 1, local33);
							local349 = local97.aShort42 * local305 + local342;
							local353 = local125 << Static643.anInt10682;
							local357 = Static246.anInt4917 + (local127 << Static643.anInt10682);
							local363 = local33 << Static643.anInt10682;
							Static542.aClass226Array4[Static496.anInt8600++] = new Class226(2, local29, local353, local357, local357, local353, local319, local342, local349, local326, local97.aShort43 + local363, local363 + local97.aShort43, local363 + local97.aShort43, local97.aShort43 + local363);
							for (local401 = local29; local401 <= local29; local401++) {
								for (local405 = local125; local405 <= local127; local405++) {
									Static272.aClass97ArrayArrayArray3[local401][local405][local33].aShort42 = (short) (Static272.aClass97ArrayArrayArray3[local401][local405][local33].aShort42 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static582.aBoolean667 = true;
	}
}
