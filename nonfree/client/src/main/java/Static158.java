import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
	public static int anInt3055;

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
	public static int anInt3050 = 0;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!de;IIILjava/awt/Component;)Lclient!ea;")
	public static Class30 method2503(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static244.anInt4835 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class30 local38 = (Class30) Class.forName("Class30_Sub2").getDeclaredConstructor().newInstance();
			local38.anInt5348 = arg2;
			local38.anIntArray429 = new int[(Static272.aBoolean339 ? 2 : 1) * 256];
			local38.method4524(arg3);
			local38.anInt5351 = (arg2 & 0xFFFFFC00) + 1024;
			if (local38.anInt5351 > 16384) {
				local38.anInt5351 = 16384;
			}
			local38.method4512(local38.anInt5351);
			if (Static87.anInt1719 > 0 && Static240.aClass47_1 == null) {
				Static240.aClass47_1 = new Class47();
				Static240.aClass47_1.aClass42_3 = arg0;
				arg0.method972(Static240.aClass47_1, Static87.anInt1719);
			}
			if (Static240.aClass47_1 != null) {
				if (Static240.aClass47_1.aClass30Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static240.aClass47_1.aClass30Array1[arg1] = local38;
			}
			return local38;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class30_Sub1 local114 = new Class30_Sub1(arg0, arg1);
				local114.anInt5348 = arg2;
				local114.anIntArray429 = new int[(Static272.aBoolean339 ? 2 : 1) * 256];
				local114.method4524(arg3);
				local114.anInt5351 = 16384;
				local114.method4512(local114.anInt5351);
				if (Static87.anInt1719 > 0 && Static240.aClass47_1 == null) {
					Static240.aClass47_1 = new Class47();
					Static240.aClass47_1.aClass42_3 = arg0;
					arg0.method972(Static240.aClass47_1, Static87.anInt1719);
				}
				if (Static240.aClass47_1 != null) {
					if (Static240.aClass47_1.aClass30Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static240.aClass47_1.aClass30Array1[arg1] = local114;
				}
				return local114;
			} catch (@Pc(173) Throwable local173) {
				return new Class30();
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
	public static void method2505() {
		Static224.aClass127_22.method3401();
		for (@Pc(18) Class3_Sub26 local18 = (Class3_Sub26) Static116.aClass127_12.method3402(); local18 != null; local18 = (Class3_Sub26) Static116.aClass127_12.method3400()) {
			if (local18.anInt2734 < 1000) {
				local18.method5717();
				Static224.aClass127_22.method3387(local18);
			}
		}
		Static224.aClass127_22.method3397(Static116.aClass127_12);
		if (Static262.aClass181_59 != null || (Static328.aClass181_50 != null || Static278.anInt5569 > 0)) {
			return;
		}
		@Pc(56) int local56 = Static249.anInt4645;
		@Pc(71) int local71;
		if (!Static168.aBoolean192) {
			if (local56 == 1 && Static170.anInt6279 > 0) {
				local71 = ((Class3_Sub26) Static116.aClass127_12.aClass3_156.aClass3_247).anInt2734;
				if (local71 == 1 || local71 == 41 || local71 == 60 || local71 == 5 || local71 == 13 || local71 == 8 || local71 == 4 || local71 == 47 || local71 == 15 || local71 == 30 || local71 == 3 || local71 == 1002) {
					@Pc(122) Class3_Sub26 local122 = (Class3_Sub26) Static116.aClass127_12.aClass3_156.aClass3_247;
					@Pc(127) Class181 local127 = Static20.method415(local122.anInt2736);
					@Pc(130) Class3_Sub15 local130 = Static47.method819(local127);
					if (local130.method1139()) {
						Static255.anInt6077 = 0;
						Static203.aBoolean236 = false;
						if (Static262.aClass181_59 != null) {
							Static316.method5250(Static262.aClass181_59);
						}
						Static262.aClass181_59 = Static20.method415(local122.anInt2736);
						Static164.anInt6261 = local122.anInt2737;
						Static35.anInt2863 = Static99.anInt2129;
						Static13.anInt354 = Static170.anInt6277;
						Static316.method5250(Static262.aClass181_59);
						return;
					}
				}
			}
			if (local56 <= 0 && Static6.anInt6079 > 0) {
				local56 = Static6.anInt6079;
			}
			Static6.anInt6079 = 0;
			if (local56 == 1 && (Static285.anInt5662 == 1 && Static170.anInt6279 > 2 || Static331.method5461())) {
				local56 = 2;
			}
			if (local56 == 2 && Static170.anInt6279 > 0) {
				Static67.method1072();
			}
			if (local56 == 1 && Static170.anInt6279 > 0) {
				Static131.method2230();
				return;
			}
			return;
		}
		@Pc(219) int local219;
		if (local56 != 1) {
			local71 = Static192.anInt4000;
			local219 = Static221.anInt4562;
			if (local71 < Static277.anInt5536 - 10 || Static277.anInt5536 + Static260.anInt5197 + 10 < local71 || local219 < Static86.anInt4285 - 10 || Static86.anInt4285 + Static257.anInt5150 + 10 < local219) {
				Static168.aBoolean192 = false;
				Static171.method2843(Static257.anInt5150, Static260.anInt5197, Static86.anInt4285, Static277.anInt5536);
			}
		}
		if (local56 != 1) {
			return;
		}
		local71 = Static277.anInt5536;
		local219 = Static86.anInt4285;
		@Pc(275) int local275 = Static260.anInt5197;
		@Pc(277) int local277 = Static99.anInt2129;
		@Pc(279) int local279 = Static170.anInt6277;
		@Pc(281) int local281 = -1;
		@Pc(300) int local300;
		for (@Pc(283) int local283 = 0; local283 < Static170.anInt6279; local283++) {
			if (Static74.aBoolean73) {
				local300 = (Static170.anInt6279 - local283 - 1) * 16 + local219 + 33;
				if (local277 > local71 && local71 + local275 > local277 && local279 > local300 - 13 && local279 < local300 + 3) {
					local281 = local283;
				}
			} else {
				local300 = local219 + (-local283 + -1 + Static170.anInt6279) * 16 + 31;
				if (local71 < local277 && local275 + local71 > local277 && local300 - 13 < local279 && local300 + 3 > local279) {
					local281 = local283;
				}
			}
		}
		if (local281 != -1) {
			local300 = 0;
			@Pc(396) Class137 local396 = new Class137(Static116.aClass127_12);
			for (@Pc(401) Class3_Sub26 local401 = (Class3_Sub26) local396.method3466(); local401 != null; local401 = (Class3_Sub26) local396.method3465()) {
				if (local300 == local281) {
					Static107.method1839(local401);
				}
				local300++;
			}
		}
		Static168.aBoolean192 = false;
		Static171.method2843(Static257.anInt5150, Static260.anInt5197, Static86.anInt4285, Static277.anInt5536);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIII[[[Lclient!dh;)Z")
	public static boolean method2508(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class45[][][] arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static293.anInt6246 & 0xFF);
		if (local14 == Static219.aByteArrayArrayArray10[Static163.anInt3184][arg3][arg1]) {
			return false;
		} else if ((Static160.aByteArrayArrayArray9[Static163.anInt3184][arg3][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) byte local43 = 0;
			Static348.anIntArray565[0] = arg3;
			@Pc(49) int local49 = 0;
			@Pc(52) int local52 = local43 + 1;
			Static104.anIntArray128[0] = arg1;
			Static219.aByteArrayArrayArray10[Static163.anInt3184][arg3][arg1] = local14;
			while (local49 != local52) {
				@Pc(75) int local75 = Static348.anIntArray565[local49] & 0xFFFF;
				@Pc(83) int local83 = Static348.anIntArray565[local49] >> 16 & 0xFF;
				@Pc(91) int local91 = Static348.anIntArray565[local49] >> 24 & 0xFF;
				@Pc(97) int local97 = Static104.anIntArray128[local49] & 0xFFFF;
				@Pc(105) int local105 = Static104.anIntArray128[local49] >> 16 & 0xFF;
				local49 = local49 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static160.aByteArrayArrayArray9[Static163.anInt3184][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(127) boolean local127 = false;
				@Pc(166) int local166;
				@Pc(212) int local212;
				label231: for (@Pc(131) int local131 = Static163.anInt3184 + 1; local131 <= 3; local131++) {
					if ((Static160.aByteArrayArrayArray9[local131][local75][local97] & 0x8) == 0) {
						@Pc(322) Class5_Sub4 local322;
						@Pc(332) int local332;
						@Pc(311) Class45 local311;
						@Pc(317) Class160 local317;
						if (local113 && arg4[local131][local75][local97] != null) {
							if (arg4[local131][local75][local97].aClass5_Sub5_1 != null) {
								local166 = Static231.method3987(local83);
								if (local166 == arg4[local131][local75][local97].aClass5_Sub5_1.anInt6285 || arg4[local131][local75][local97].aClass5_Sub5_2 != null && arg4[local131][local75][local97].aClass5_Sub5_2.anInt6285 == local166) {
									continue;
								}
								if (local91 != 0) {
									local212 = Static231.method3987(local91);
									if (local212 == arg4[local131][local75][local97].aClass5_Sub5_1.anInt6285 || arg4[local131][local75][local97].aClass5_Sub5_2 != null && local212 == arg4[local131][local75][local97].aClass5_Sub5_2.anInt6285) {
										continue;
									}
								}
								if (local105 != 0) {
									local212 = Static231.method3987(local105);
									if (local212 == arg4[local131][local75][local97].aClass5_Sub5_1.anInt6285 || arg4[local131][local75][local97].aClass5_Sub5_2 != null && arg4[local131][local75][local97].aClass5_Sub5_2.anInt6285 == local212) {
										continue;
									}
								}
							}
							local311 = arg4[local131][local75][local97];
							if (local311.aClass160_1 != null) {
								for (local317 = local311.aClass160_1; local317 != null; local317 = local317.aClass160_3) {
									local322 = local317.aClass5_Sub4_1;
									if (local322 instanceof Interface5) {
										@Pc(328) Interface5 local328 = (Interface5) local322;
										local332 = local328.method5342();
										@Pc(338) int local338 = local328.method5337();
										if (local332 == 21) {
											local332 = 19;
										}
										@Pc(351) int local351 = local332 | local338 << 6;
										if (local351 == local83 || local91 != 0 && local351 == local91 || local105 != 0 && local105 == local351) {
											continue label231;
										}
									}
								}
							}
						}
						local311 = arg4[local131][local75][local97];
						if (local311 != null && local311.aClass160_1 != null) {
							for (local317 = local311.aClass160_1; local317 != null; local317 = local317.aClass160_3) {
								local322 = local317.aClass5_Sub4_1;
								if (local322.aShort86 != local322.aShort89 || local322.aShort87 != local322.aShort88) {
									for (@Pc(424) int local424 = local322.aShort86; local424 <= local322.aShort89; local424++) {
										for (local332 = local322.aShort87; local332 <= local322.aShort88; local332++) {
											Static219.aByteArrayArrayArray10[local131][local424][local332] = local14;
										}
									}
								}
							}
						}
						Static219.aByteArrayArrayArray10[local131][local75][local97] = local14;
						local127 = true;
					}
				}
				if (local127) {
					local166 = Static69.aClass22Array1[Static163.anInt3184 + 1].method4672(local75, local97);
					if (Static51.anIntArray69[arg2] < local166) {
						Static51.anIntArray69[arg2] = local166;
					}
					local212 = local75 << 7;
					@Pc(506) int local506 = local97 << 7;
					if (local212 < Static27.anIntArray36[arg2]) {
						Static27.anIntArray36[arg2] = local212;
					} else if (Static111.anIntArray139[arg2] < local212) {
						Static111.anIntArray139[arg2] = local212;
					}
					if (Static122.anIntArray164[arg2] > local506) {
						Static122.anIntArray164[arg2] = local506;
					} else if (local506 > Static160.anIntArray218[arg2]) {
						Static160.anIntArray218[arg2] = local506;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local14 != Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 - 1][local97]) {
						Static348.anIntArray565[local52] = 0xD3000000 | 0x120000 | local75 - 1;
						Static104.anIntArray128[local52] = local97 | 0x130000;
						local52 = local52 + 1 & 0xFFF;
						Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 - 1][local97] = local14;
					}
					local97++;
					if (local97 < Static122.anInt2632) {
						if (local75 - 1 >= 0 && local14 != Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 - 1][local97] && (Static160.aByteArrayArrayArray9[Static163.anInt3184][local75][local97] & 0x4) == 0 && (Static160.aByteArrayArrayArray9[Static163.anInt3184][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static348.anIntArray565[local52] = local75 - 1 | 0x120000 | 0x52000000;
							Static104.anIntArray128[local52] = local97 | 0x130000;
							local52 = local52 + 1 & 0xFFF;
							Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 - 1][local97] = local14;
						}
						if (Static219.aByteArrayArrayArray10[Static163.anInt3184][local75][local97] != local14) {
							Static348.anIntArray565[local52] = local75 | 0x13000000 | 0x520000;
							Static104.anIntArray128[local52] = local97 | 0x530000;
							Static219.aByteArrayArrayArray10[Static163.anInt3184][local75][local97] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local75 + 1 < Static162.anInt2152 && Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 + 1][local97] != local14 && (Static160.aByteArrayArrayArray9[Static163.anInt3184][local75][local97] & 0x4) == 0 && (Static160.aByteArrayArrayArray9[Static163.anInt3184][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static348.anIntArray565[local52] = 0x92000000 | 0x520000 | local75 + 1;
							Static104.anIntArray128[local52] = local97 | 0x530000;
							local52 = local52 + 1 & 0xFFF;
							Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 + 1][local97] = local14;
						}
					}
					local97--;
					if (Static162.anInt2152 > local75 + 1 && local14 != Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 + 1][local97]) {
						Static348.anIntArray565[local52] = local75 + 1 | 0x920000 | 0x53000000;
						Static104.anIntArray128[local52] = local97 | 0x930000;
						local52 = local52 + 1 & 0xFFF;
						Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 + 1][local97] = local14;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 - 1][local97] != local14 && (Static160.aByteArrayArrayArray9[Static163.anInt3184][local75][local97] & 0x4) == 0 && (Static160.aByteArrayArrayArray9[Static163.anInt3184][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static348.anIntArray565[local52] = local75 - 1 | 0x12000000 | 0xD20000;
							Static104.anIntArray128[local52] = local97 | 0xD30000;
							local52 = local52 + 1 & 0xFFF;
							Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 - 1][local97] = local14;
						}
						if (Static219.aByteArrayArrayArray10[Static163.anInt3184][local75][local97] != local14) {
							Static348.anIntArray565[local52] = 0x93000000 | 0xD20000 | local75;
							Static104.anIntArray128[local52] = local97 | 0xD30000;
							local52 = local52 + 1 & 0xFFF;
							Static219.aByteArrayArrayArray10[Static163.anInt3184][local75][local97] = local14;
						}
						if (local75 + 1 < Static162.anInt2152 && Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 + 1][local97] != local14 && (Static160.aByteArrayArrayArray9[Static163.anInt3184][local75][local97] & 0x4) == 0 && (Static160.aByteArrayArrayArray9[Static163.anInt3184][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static348.anIntArray565[local52] = 0xD2000000 | 0x920000 | local75 + 1;
							Static104.anIntArray128[local52] = local97 | 0x930000;
							local52 = local52 + 1 & 0xFFF;
							Static219.aByteArrayArrayArray10[Static163.anInt3184][local75 + 1][local97] = local14;
						}
					}
				}
			}
			if (Static51.anIntArray69[arg2] != -1000000) {
				Static51.anIntArray69[arg2] += 10;
				Static27.anIntArray36[arg2] -= 50;
				Static111.anIntArray139[arg2] += 50;
				Static160.anIntArray218[arg2] += 50;
				Static122.anIntArray164[arg2] -= 50;
			}
			return true;
		}
	}
}
