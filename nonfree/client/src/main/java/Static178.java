import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!n", name = "U", descriptor = "Lclient!rn;")
	public static Class155 aClass155_71;

	@OriginalMember(owner = "client!n", name = "L", descriptor = "Lclient!l;")
	public static Class98 aClass98_29 = new Class98(128);

	@OriginalMember(owner = "client!n", name = "O", descriptor = "[I")
	public static int[] anIntArray405 = new int[2048];

	@OriginalMember(owner = "client!n", name = "R", descriptor = "I")
	public static int anInt3331 = 0;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Z")
	public static boolean method2933(@OriginalArg(0) int arg0) {
		Static270.aBoolean381 = true;
		Static263.anInt5410 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)I")
	public static int method2934(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!nc;[I[IB[I)V")
	public static void method2937(@OriginalArg(0) Class10_Sub5_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(15) int local15 = 0; local15 < arg3.length; local15++) {
			@Pc(27) int local27 = arg3[local15];
			@Pc(31) int local31 = arg1[local15];
			@Pc(35) int local35 = arg2[local15];
			@Pc(37) int local37 = 0;
			while (local31 != 0 && local37 < arg0.aClass145Array3.length) {
				if ((local31 & 0x1) != 0) {
					if (local27 == -1) {
						arg0.aClass145Array3[local37] = null;
					} else {
						@Pc(67) Class15 local67 = Static253.method4288(local27);
						@Pc(70) int local70 = local67.anInt412;
						@Pc(75) Class145 local75 = arg0.aClass145Array3[local37];
						if (local75 != null) {
							if (local27 == local75.anInt4347) {
								if (local70 == 0) {
									local75 = arg0.aClass145Array3[local37] = null;
								} else if (local70 == 1) {
									local75.anInt4348 = local35;
									local75.anInt4350 = 0;
									local75.anInt4345 = 1;
									local75.anInt4346 = 0;
									local75.anInt4341 = 0;
									Static158.method2622(arg0.anInt5073, 0, local67, Static136.aClass10_Sub5_Sub1_1 == arg0, arg0.anInt5016);
								} else if (local70 == 2) {
									local75.anInt4346 = 0;
								}
							} else if (local67.anInt420 >= Static253.method4288(local75.anInt4347).anInt420) {
								local75 = arg0.aClass145Array3[local37] = null;
							}
						}
						if (local75 == null) {
							local75 = arg0.aClass145Array3[local37] = new Class145();
							local75.anInt4348 = local35;
							local75.anInt4350 = 0;
							local75.anInt4347 = local27;
							local75.anInt4345 = 1;
							local75.anInt4346 = 0;
							local75.anInt4341 = 0;
							Static158.method2622(arg0.anInt5073, 0, local67, Static136.aClass10_Sub5_Sub1_1 == arg0, arg0.anInt5016);
						}
					}
				}
				local37++;
				local31 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
	public static void method2938() {
		Static249.aClass3_Sub26_Sub1_3.method3960();
		@Pc(19) int local19 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
		if (local19 == 0) {
			return;
		}
		@Pc(33) int local33 = Static249.aClass3_Sub26_Sub1_3.method3962(2);
		if (local33 == 0) {
			anIntArray405[Static11.anInt5178++] = 2047;
			return;
		}
		@Pc(53) int local53;
		@Pc(65) int local65;
		if (local33 == 1) {
			local53 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
			Static136.aClass10_Sub5_Sub1_1.method4196(local53, 1);
			local65 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
			if (local65 == 1) {
				anIntArray405[Static11.anInt5178++] = 2047;
			}
		} else if (local33 == 2) {
			if (Static249.aClass3_Sub26_Sub1_3.method3962(1) == 1) {
				local53 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
				Static136.aClass10_Sub5_Sub1_1.method4196(local53, 2);
				local65 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
				Static136.aClass10_Sub5_Sub1_1.method4196(local65, 2);
			} else {
				local53 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
				Static136.aClass10_Sub5_Sub1_1.method4196(local53, 0);
			}
			local53 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
			if (local53 == 1) {
				anIntArray405[Static11.anInt5178++] = 2047;
			}
		} else if (local33 == 3) {
			local53 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
			local65 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
			if (local65 == 1) {
				anIntArray405[Static11.anInt5178++] = 2047;
			}
			@Pc(172) int local172 = Static249.aClass3_Sub26_Sub1_3.method3962(7);
			@Pc(177) int local177 = Static249.aClass3_Sub26_Sub1_3.method3962(7);
			Static99.anInt1826 = Static249.aClass3_Sub26_Sub1_3.method3962(2);
			Static136.aClass10_Sub5_Sub1_1.method3047(local172, local177, local53 == 1);
		}
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(B)V")
	public static void method2939() {
		if (!Static39.aBoolean56) {
			return;
		}
		@Pc(11) Class151 local11 = Static114.method5019(Static296.anInt5869, Static63.anInt1200);
		if (local11 != null && local11.anObjectArray5 != null) {
			@Pc(22) Class3_Sub24 local22 = new Class3_Sub24();
			local22.aClass151_13 = local11;
			local22.anObjectArray1 = local11.anObjectArray5;
			Static161.method2653(local22);
		}
		Static39.aBoolean56 = false;
		Static144.anInt4821 = -1;
		Static134.method3639(local11);
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V")
	public static void method2940(@OriginalArg(1) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static110.anInt2023 += arg0 * 128;
		@Pc(44) int local44;
		if (Static33.anIntArray50.length < Static110.anInt2023) {
			Static110.anInt2023 -= Static33.anIntArray50.length;
			local44 = (int) (Math.random() * 12.0D);
			Static220.method4261(Static59.aClass81_Sub2Array1[local44]);
		}
		local44 = 0;
		@Pc(57) int local57 = arg0 * 128;
		@Pc(64) int local64 = (256 - arg0) * 128;
		@Pc(66) int local66;
		@Pc(92) int local92;
		for (local66 = 0; local66 < local64; local66++) {
			local92 = Static255.anIntArray551[local44 + local57] - arg0 * Static33.anIntArray50[Static33.anIntArray50.length - 1 & local44 - -Static110.anInt2023] / 6;
			if (local92 < 0) {
				local92 = 0;
			}
			Static255.anIntArray551[local44++] = local92;
		}
		@Pc(122) int local122;
		@Pc(132) int local132;
		for (local66 = 256 - arg0; local66 < 256; local66++) {
			local92 = local66 * 128;
			for (local122 = 0; local122 < 128; local122++) {
				local132 = (int) (Math.random() * 100.0D);
				if (local132 < 50 && local122 > 10 && local122 < 118) {
					Static255.anIntArray551[local122 + local92] = 255;
				} else {
					Static255.anIntArray551[local122 + local92] = 0;
				}
			}
		}
		for (local66 = 0; local66 < 256 - arg0; local66++) {
			Static39.anIntArray61[local66] = Static39.anIntArray61[arg0 + local66];
		}
		for (local66 = 256 - arg0; local66 < 256; local66++) {
			Static39.anIntArray61[local66] = (int) (Math.sin((double) Static2.anInt31 / 14.0D) * 16.0D + Math.sin((double) Static2.anInt31 / 15.0D) * 14.0D + Math.sin((double) Static2.anInt31 / 16.0D) * 12.0D);
			Static2.anInt31++;
		}
		local66 = ((Static124.anInt2371 & 0x1) + arg0) / 2;
		Static145.anInt2775 += arg0;
		if (local66 <= 0) {
			return;
		}
		for (local92 = 0; local92 < Static145.anInt2775; local92++) {
			local132 = (int) (Math.random() * 128.0D) + 128;
			local122 = (int) (Math.random() * 124.0D) + 2;
			Static255.anIntArray551[local122 + (local132 << 7)] = 192;
		}
		Static145.anInt2775 = 0;
		@Pc(300) int local300;
		for (local92 = 0; local92 < 256; local92++) {
			local132 = local92 * 128;
			local122 = 0;
			for (local300 = -local66; local300 < 128; local300++) {
				if (local66 + local300 < 128) {
					local122 += Static255.anIntArray551[local66 + local300 + local132];
				}
				if (local300 - local66 - 1 >= 0) {
					local122 -= Static255.anIntArray551[local132 + local300 - local66 - 1];
				}
				if (local300 >= 0) {
					Static309.anIntArray627[local132 + local300] = local122 / (local66 * 2 + 1);
				}
			}
		}
		for (local92 = 0; local92 < 128; local92++) {
			local122 = 0;
			for (local132 = -local66; local132 < 256; local132++) {
				local300 = local132 * 128;
				if (local66 + local132 < 256) {
					local122 += Static309.anIntArray627[local92 + local300 + local66 * 128];
				}
				if (local132 - local66 - 1 >= 0) {
					local122 -= Static309.anIntArray627[local92 + local300 - local66 * 128 - 128];
				}
				if (local132 >= 0) {
					Static255.anIntArray551[local300 + local92] = local122 / (local66 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(B)Lclient!qg;")
	public static Class87_Sub1 method2941() {
		return Static126.anInt2449 >= Static100.aClass87_Sub1Array1.length ? null : Static100.aClass87_Sub1Array1[Static126.anInt2449++];
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!rg;IB)V")
	public static void method2942(@OriginalArg(0) int arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) int arg2) {
		if (Static152.anInt2876 < 2 && Static153.anInt2895 == 0 && !Static39.aBoolean56) {
			return;
		}
		@Pc(24) String local24 = Static122.method2040();
		if (arg1 == null) {
			@Pc(87) int local87 = Static224.aClass3_Sub4_Sub2_14.method3710(local24, arg0 + 4, arg2 + 15, Static3.aRandom1, Static232.anInt4518);
			Static35.method534(15, local87 + Static224.aClass3_Sub4_Sub2_14.method3690(local24), arg2, arg0 + 4);
			return;
		}
		@Pc(31) Class3_Sub4_Sub2 local31 = arg1.method4014(Static96.aClass81Array2);
		if (local31 == null) {
			local31 = Static224.aClass3_Sub4_Sub2_14;
		}
		local31.method3708(local24, arg0, arg2, arg1.anInt4773, arg1.anInt4751, arg1.anInt4719, arg1.anInt4793, arg1.anInt4802, arg1.anInt4785, Static3.aRandom1, Static232.anInt4518, Static253.anIntArray548);
		Static35.method534(Static253.anIntArray548[3], Static253.anIntArray548[2], Static253.anIntArray548[1], Static253.anIntArray548[0]);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)Z")
	public static boolean method2943(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static30.method461();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static30.method465();
		} else if (!Static30.method466() || !Static30.method467() || !Static30.method462()) {
			arg0 = false;
		}
		Static17.aBoolean31 = arg0;
		Static188.method3143(Static274.aClass176_4);
		if (local6 == arg0) {
			return false;
		} else {
			((Class91_Sub1) Static16.anInterface4_1).method2913();
			return true;
		}
	}
}
