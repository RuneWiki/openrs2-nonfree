import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!lga", name = "n", descriptor = "Lclient!tg;")
	public static Class349 aClass349_1;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIBIII)V")
	public static void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(27) int local27 = arg4 * arg4;
		@Pc(31) int local31 = local27 << 1;
		@Pc(35) int local35 = local13 << 1;
		@Pc(39) int local39 = arg4 << 1;
		@Pc(48) int local48 = local13 * (1 - local39) + local31;
		@Pc(56) int local56 = local27 - (local39 - 1) * local35;
		@Pc(60) int local60 = local13 << 2;
		@Pc(64) int local64 = local27 << 2;
		@Pc(72) int local72 = local31 * 3;
		@Pc(80) int local80 = ((arg4 << 1) - 3) * local35;
		@Pc(86) int local86 = local64;
		Static559.method7424(arg3, Static172.anIntArrayArray17[arg2], arg1 + arg0, -arg0 + arg1);
		@Pc(105) int local105 = (arg4 - 1) * local60;
		while (local9 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local56 += local86;
					local48 += local72;
					local7++;
					local72 += local64;
					local86 += local64;
				}
			}
			if (local56 < 0) {
				local56 += local86;
				local48 += local72;
				local7++;
				local72 += local64;
				local86 += local64;
			}
			local48 += -local105;
			local56 += -local80;
			local80 -= local60;
			local105 -= local60;
			local9--;
			@Pc(176) int local176 = arg2 - local9;
			@Pc(181) int local181 = arg2 + local9;
			@Pc(185) int local185 = arg1 + local7;
			@Pc(190) int local190 = arg1 - local7;
			Static559.method7424(arg3, Static172.anIntArrayArray17[local176], local185, local190);
			Static559.method7424(arg3, Static172.anIntArrayArray17[local181], local185, local190);
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!bn;I)V")
	public static void method4652(@OriginalArg(0) Class4_Sub11_Sub1 arg0) {
		arg0.method986();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static518.anInt10290; local12++) {
			local18 = Static489.anIntArray519[local12];
			if ((Static663.aByteArray104[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static663.aByteArray104[local18] = (byte) (Static663.aByteArray104[local18] | 0x2);
					local10--;
				} else {
					local43 = arg0.method988(1);
					if (local43 == 0) {
						local10 = Static611.method8017(arg0);
						Static663.aByteArray104[local18] = (byte) (Static663.aByteArray104[local18] | 0x2);
					} else {
						Static401.method5124(arg0, local18);
					}
				}
			}
		}
		arg0.method992();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method986();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static518.anInt10290; local18++) {
			local43 = Static489.anIntArray519[local18];
			if ((Static663.aByteArray104[local43] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static663.aByteArray104[local43] = (byte) (Static663.aByteArray104[local43] | 0x2);
				} else {
					local124 = arg0.method988(1);
					if (local124 == 0) {
						local10 = Static611.method8017(arg0);
						Static663.aByteArray104[local43] = (byte) (Static663.aByteArray104[local43] | 0x2);
					} else {
						Static401.method5124(arg0, local43);
					}
				}
			}
		}
		arg0.method992();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method986();
		@Pc(208) int local208;
		for (local43 = 0; local43 < Static535.anInt8296; local43++) {
			local124 = Static414.anIntArray449[local43];
			if ((Static663.aByteArray104[local124] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static663.aByteArray104[local124] = (byte) (Static663.aByteArray104[local124] | 0x2);
				} else {
					local208 = arg0.method988(1);
					if (local208 == 0) {
						local10 = Static611.method8017(arg0);
						Static663.aByteArray104[local124] = (byte) (Static663.aByteArray104[local124] | 0x2);
					} else if (Static662.method8785(local124, arg0)) {
						Static663.aByteArray104[local124] = (byte) (Static663.aByteArray104[local124] | 0x2);
					}
				}
			}
		}
		arg0.method992();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method986();
		for (local124 = 0; local124 < Static535.anInt8296; local124++) {
			local208 = Static414.anIntArray449[local124];
			if ((Static663.aByteArray104[local208] & 0x1) == 0) {
				if (local10 > 0) {
					Static663.aByteArray104[local208] = (byte) (Static663.aByteArray104[local208] | 0x2);
					local10--;
				} else {
					@Pc(303) int local303 = arg0.method988(1);
					if (local303 == 0) {
						local10 = Static611.method8017(arg0);
						Static663.aByteArray104[local208] = (byte) (Static663.aByteArray104[local208] | 0x2);
					} else if (Static662.method8785(local208, arg0)) {
						Static663.aByteArray104[local208] = (byte) (Static663.aByteArray104[local208] | 0x2);
					}
				}
			}
		}
		arg0.method992();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static518.anInt10290 = 0;
		Static535.anInt8296 = 0;
		for (local208 = 1; local208 < 2048; local208++) {
			Static663.aByteArray104[local208] = (byte) (Static663.aByteArray104[local208] >> 1);
			@Pc(375) Class3_Sub1_Sub2_Sub2_Sub1 local375 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local208];
			if (local375 == null) {
				Static414.anIntArray449[Static535.anInt8296++] = local208;
			} else {
				Static489.anIntArray519[Static518.anInt10290++] = local208;
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method4653(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static633.anInt9792 >= 100) {
			Static417.method5293(Static279.aClass179_39.method4066(Static164.anInt2984));
			return;
		}
		@Pc(23) String local23 = Static317.method4379(arg0);
		if (local23 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(28) int local28 = 0; local28 < Static633.anInt9792; local28++) {
			@Pc(36) String local36 = Static317.method4379(Static16.aStringArray4[local28]);
			if (local36 != null && local36.equals(local23)) {
				Static417.method5293(arg0 + Static279.aClass179_40.method4066(Static164.anInt2984));
				return;
			}
			if (Static301.aStringArray21[local28] != null) {
				local67 = Static317.method4379(Static301.aStringArray21[local28]);
				if (local67 != null && local67.equals(local23)) {
					Static417.method5293(arg0 + Static279.aClass179_40.method4066(Static164.anInt2984));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static450.anInt7035; local98++) {
			local67 = Static317.method4379(Static289.aStringArray20[local98]);
			if (local67 != null && local67.equals(local23)) {
				Static417.method5293(Static279.aClass179_45.method4066(Static164.anInt2984) + arg0 + Static279.aClass179_46.method4066(Static164.anInt2984));
				return;
			}
			if (Static496.aStringArray41[local98] != null) {
				@Pc(142) String local142 = Static317.method4379(Static496.aStringArray41[local98]);
				if (local142 != null && local142.equals(local23)) {
					Static417.method5293(Static279.aClass179_45.method4066(Static164.anInt2984) + arg0 + Static279.aClass179_46.method4066(Static164.anInt2984));
					return;
				}
			}
		}
		if (Static317.method4379(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37).equals(local23)) {
			Static417.method5293(Static279.aClass179_42.method4066(Static164.anInt2984));
			return;
		}
		@Pc(200) Class4_Sub48 local200 = Static335.method4615(Static19.aClass216_8, Static669.aClass196_2);
		local200.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(arg0) + 1);
		local200.aClass4_Sub11_Sub1_2.method8857(arg0);
		local200.aClass4_Sub11_Sub1_2.method8822(arg1 ? 1 : 0);
		Static410.method5170(local200);
	}
}
