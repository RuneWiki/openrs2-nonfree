import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!re", name = "J", descriptor = "I")
	public static int anInt5644 = 0;

	@OriginalMember(owner = "client!re", name = "X", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_179 = new Class151("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_207 = new Class214(60, -2);

	@OriginalMember(owner = "client!re", name = "Z", descriptor = "[I")
	public static final int[] anIntArray339 = new int[13];

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "Z")
	public static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III[[[Lclient!fl;ZI)Z")
	public static boolean method4398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82[][][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static116.anInt5420 & 0xFF);
		if (local14 == Static417.aByteArrayArrayArray3[Static138.anInt3548][arg1][arg4]) {
			return false;
		} else if ((Static357.aByteArrayArrayArray11[Static138.anInt3548][arg1][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			Static399.anIntArray403[0] = arg1;
			@Pc(53) int local53 = local39 + 1;
			Static195.anIntArray170[0] = arg4;
			Static417.aByteArrayArrayArray3[Static138.anInt3548][arg1][arg4] = local14;
			while (local53 != local41) {
				@Pc(71) int local71 = Static399.anIntArray403[local41] & 0xFFFF;
				@Pc(79) int local79 = Static399.anIntArray403[local41] >> 16 & 0xFF;
				@Pc(87) int local87 = Static399.anIntArray403[local41] >> 24 & 0xFF;
				@Pc(93) int local93 = Static195.anIntArray170[local41] & 0xFFFF;
				@Pc(101) int local101 = Static195.anIntArray170[local41] >> 16 & 0xFF;
				local41 = local41 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static357.aByteArrayArrayArray11[Static138.anInt3548][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(123) boolean local123 = false;
				@Pc(162) int local162;
				@Pc(205) int local205;
				label231: for (@Pc(127) int local127 = Static138.anInt3548 + 1; local127 <= 3; local127++) {
					if ((Static357.aByteArrayArrayArray11[local127][local71][local93] & 0x8) == 0) {
						@Pc(300) Class20_Sub3 local300;
						@Pc(310) int local310;
						@Pc(289) Class82 local289;
						@Pc(295) Class146 local295;
						if (local109 && arg2[local127][local71][local93] != null) {
							if (arg2[local127][local71][local93].aClass20_Sub1_2 != null) {
								local162 = Static144.method1904(local79);
								if (local162 == arg2[local127][local71][local93].aClass20_Sub1_2.anInt5820 || arg2[local127][local71][local93].aClass20_Sub1_3 != null && arg2[local127][local71][local93].aClass20_Sub1_3.anInt5820 == local162) {
									continue;
								}
								if (local87 != 0) {
									local205 = Static144.method1904(local87);
									if (local205 == arg2[local127][local71][local93].aClass20_Sub1_2.anInt5820 || arg2[local127][local71][local93].aClass20_Sub1_3 != null && local205 == arg2[local127][local71][local93].aClass20_Sub1_3.anInt5820) {
										continue;
									}
								}
								if (local101 != 0) {
									local205 = Static144.method1904(local101);
									if (arg2[local127][local71][local93].aClass20_Sub1_2.anInt5820 == local205 || arg2[local127][local71][local93].aClass20_Sub1_3 != null && local205 == arg2[local127][local71][local93].aClass20_Sub1_3.anInt5820) {
										continue;
									}
								}
							}
							local289 = arg2[local127][local71][local93];
							if (local289.aClass146_1 != null) {
								for (local295 = local289.aClass146_1; local295 != null; local295 = local295.aClass146_3) {
									local300 = local295.aClass20_Sub3_1;
									if (local300 instanceof Interface9) {
										@Pc(306) Interface9 local306 = (Interface9) local300;
										local310 = local306.method5125();
										@Pc(316) int local316 = local306.method5122();
										if (local310 == 21) {
											local310 = 19;
										}
										@Pc(327) int local327 = local310 | local316 << 6;
										if (local79 == local327 || local87 != 0 && local327 == local87 || local101 != 0 && local101 == local327) {
											continue label231;
										}
									}
								}
							}
						}
						local289 = arg2[local127][local71][local93];
						if (local289 != null && local289.aClass146_1 != null) {
							for (local295 = local289.aClass146_1; local295 != null; local295 = local295.aClass146_3) {
								local300 = local295.aClass20_Sub3_1;
								if (local300.aShort87 != local300.aShort85 || local300.aShort88 != local300.aShort86) {
									for (@Pc(396) int local396 = local300.aShort85; local396 <= local300.aShort87; local396++) {
										for (local310 = local300.aShort88; local310 <= local300.aShort86; local310++) {
											Static417.aByteArrayArrayArray3[local127][local396][local310] = local14;
										}
									}
								}
							}
						}
						local123 = true;
						Static417.aByteArrayArrayArray3[local127][local71][local93] = local14;
					}
				}
				if (local123) {
					local162 = Static202.aClass163Array2[Static138.anInt3548 + 1].I(local71, local93);
					if (Static355.anIntArray347[arg0] < local162) {
						Static355.anIntArray347[arg0] = local162;
					}
					local205 = local71 << 7;
					if (local205 < Static331.anIntArray328[arg0]) {
						Static331.anIntArray328[arg0] = local205;
					} else if (local205 > Static425.anIntArray461[arg0]) {
						Static425.anIntArray461[arg0] = local205;
					}
					@Pc(498) int local498 = local93 << 7;
					if (Static127.anIntArray104[arg0] > local498) {
						Static127.anIntArray104[arg0] = local498;
					} else if (Static367.anIntArray377[arg0] < local498) {
						Static367.anIntArray377[arg0] = local498;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 - 1][local93] != local14) {
						Static399.anIntArray403[local53] = local71 - 1 | 0x120000 | 0xD3000000;
						Static195.anIntArray170[local53] = local93 | 0x130000;
						Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 - 1][local93] = local14;
						local53 = local53 + 1 & 0xFFF;
					}
					@Pc(579) int local579 = ~Static251.anInt4072;
					local93++;
					if (local579 < ~local93) {
						if (local71 - 1 >= 0 && local14 != Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 - 1][local93] && (Static357.aByteArrayArrayArray11[Static138.anInt3548][local71][local93] & 0x4) == 0 && (Static357.aByteArrayArrayArray11[Static138.anInt3548][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static399.anIntArray403[local53] = 0x52000000 | 0x120000 | local71 - 1;
							Static195.anIntArray170[local53] = local93 | 0x130000;
							local53 = local53 + 1 & 0xFFF;
							Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 - 1][local93] = local14;
						}
						if (Static417.aByteArrayArrayArray3[Static138.anInt3548][local71][local93] != local14) {
							Static399.anIntArray403[local53] = 0x13000000 | 0x520000 | local71;
							Static195.anIntArray170[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static417.aByteArrayArrayArray3[Static138.anInt3548][local71][local93] = local14;
						}
						if (Static425.anInt6922 > local71 + 1 && Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 + 1][local93] != local14 && (Static357.aByteArrayArrayArray11[Static138.anInt3548][local71][local93] & 0x4) == 0 && (Static357.aByteArrayArrayArray11[Static138.anInt3548][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static399.anIntArray403[local53] = 0x92000000 | 0x520000 | local71 + 1;
							Static195.anIntArray170[local53] = local93 | 0x530000;
							Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 + 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
					}
					local93--;
					if (local71 + 1 < Static425.anInt6922 && local14 != Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 + 1][local93]) {
						Static399.anIntArray403[local53] = local71 + 1 | 0x920000 | 0x53000000;
						Static195.anIntArray170[local53] = local93 | 0x930000;
						local53 = local53 + 1 & 0xFFF;
						Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 + 1][local93] = local14;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && local14 != Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 - 1][local93] && (Static357.aByteArrayArrayArray11[Static138.anInt3548][local71][local93] & 0x4) == 0 && (Static357.aByteArrayArrayArray11[Static138.anInt3548][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static399.anIntArray403[local53] = local71 - 1 | 0xD20000 | 0x12000000;
							Static195.anIntArray170[local53] = local93 | 0xD30000;
							Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 - 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local14 != Static417.aByteArrayArrayArray3[Static138.anInt3548][local71][local93]) {
							Static399.anIntArray403[local53] = local71 | 0xD20000 | 0x93000000;
							Static195.anIntArray170[local53] = local93 | 0xD30000;
							Static417.aByteArrayArrayArray3[Static138.anInt3548][local71][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local71 + 1 < Static425.anInt6922 && Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 + 1][local93] != local14 && (Static357.aByteArrayArrayArray11[Static138.anInt3548][local71][local93] & 0x4) == 0 && (Static357.aByteArrayArrayArray11[Static138.anInt3548][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static399.anIntArray403[local53] = local71 + 1 | 0x920000 | 0xD2000000;
							Static195.anIntArray170[local53] = local93 | 0x930000;
							local53 = local53 + 1 & 0xFFF;
							Static417.aByteArrayArrayArray3[Static138.anInt3548][local71 + 1][local93] = local14;
						}
					}
				}
			}
			if (Static355.anIntArray347[arg0] != -1000000) {
				Static355.anIntArray347[arg0] += 10;
				Static331.anIntArray328[arg0] -= 50;
				Static425.anIntArray461[arg0] += 50;
				Static367.anIntArray377[arg0] += 50;
				Static127.anIntArray104[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public static void method4400() {
		if (Static191.anInt3047 == 2) {
			Static144.anInt2437 = 96;
			return;
		}
		try {
			@Pc(28) Method local28 = Runtime.class.getMethod("maxMemory");
			if (local28 != null) {
				try {
					@Pc(32) Runtime local32 = Runtime.getRuntime();
					@Pc(38) Long local38 = (Long) local28.invoke(local32, (Object[]) null);
					Static144.anInt2437 = (int) (local38 / 1048576L) + 1;
				} catch (@Pc(48) Throwable local48) {
				}
			}
		} catch (@Pc(50) Exception local50) {
		}
	}
}
