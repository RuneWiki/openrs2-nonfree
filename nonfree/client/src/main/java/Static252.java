import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mp", name = "K", descriptor = "Lclient!pm;")
	public static Class201 aClass201_5;

	@OriginalMember(owner = "client!mp", name = "M", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array13;

	@OriginalMember(owner = "client!mp", name = "N", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_75 = new Class231("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "(I)Lclient!fb;")
	public static Class76 method3888() {
		try {
			return (Class76) Class.forName("Class76_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[[[Lclient!oh;IIIZ)Z")
	public static boolean method3889(@OriginalArg(1) Class189[][][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(19) byte local19 = arg4 ? 1 : (byte) (Static75.anInt1503 & 0xFF);
		if (Static193.aByteArrayArrayArray4[Static4.anInt30][arg3][arg1] == local19) {
			return false;
		} else if ((Static179.aByteArrayArrayArray3[Static4.anInt30][arg3][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			Static59.anIntArray104[0] = arg3;
			@Pc(50) int local50 = 0;
			@Pc(53) int local53 = local44 + 1;
			Static48.anIntArray575[0] = arg1;
			Static193.aByteArrayArrayArray4[Static4.anInt30][arg3][arg1] = local19;
			while (local53 != local50) {
				@Pc(71) int local71 = Static59.anIntArray104[local50] & 0xFFFF;
				@Pc(79) int local79 = Static59.anIntArray104[local50] >> 16 & 0xFF;
				@Pc(87) int local87 = Static59.anIntArray104[local50] >> 24 & 0xFF;
				@Pc(93) int local93 = Static48.anIntArray575[local50] & 0xFFFF;
				@Pc(101) int local101 = Static48.anIntArray575[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static179.aByteArrayArrayArray3[Static4.anInt30][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(123) boolean local123 = false;
				@Pc(165) int local165;
				@Pc(212) int local212;
				label231: for (@Pc(127) int local127 = Static4.anInt30 + 1; local127 <= 3; local127++) {
					if ((Static179.aByteArrayArrayArray3[local127][local71][local93] & 0x8) == 0) {
						@Pc(310) Class3_Sub3 local310;
						@Pc(320) int local320;
						@Pc(299) Class189 local299;
						@Pc(305) Class242 local305;
						if (local109 && arg0[local127][local71][local93] != null) {
							if (arg0[local127][local71][local93].aClass3_Sub1_1 != null) {
								local165 = Static386.method5319(local79);
								if (local165 == arg0[local127][local71][local93].aClass3_Sub1_1.anInt6326 || arg0[local127][local71][local93].aClass3_Sub1_2 != null && arg0[local127][local71][local93].aClass3_Sub1_2.anInt6326 == local165) {
									continue;
								}
								if (local87 != 0) {
									local212 = Static386.method5319(local87);
									if (local212 == arg0[local127][local71][local93].aClass3_Sub1_1.anInt6326 || arg0[local127][local71][local93].aClass3_Sub1_2 != null && arg0[local127][local71][local93].aClass3_Sub1_2.anInt6326 == local212) {
										continue;
									}
								}
								if (local101 != 0) {
									local212 = Static386.method5319(local101);
									if (arg0[local127][local71][local93].aClass3_Sub1_1.anInt6326 == local212 || arg0[local127][local71][local93].aClass3_Sub1_2 != null && local212 == arg0[local127][local71][local93].aClass3_Sub1_2.anInt6326) {
										continue;
									}
								}
							}
							local299 = arg0[local127][local71][local93];
							if (local299.aClass242_2 != null) {
								for (local305 = local299.aClass242_2; local305 != null; local305 = local305.aClass242_4) {
									local310 = local305.aClass3_Sub3_2;
									if (local310 instanceof Interface10) {
										@Pc(316) Interface10 local316 = (Interface10) local310;
										local320 = local316.method5807();
										if (local320 == 21) {
											local320 = 19;
										}
										@Pc(331) int local331 = local316.method5811();
										@Pc(337) int local337 = local320 | local331 << 6;
										if (local337 == local79 || local87 != 0 && local337 == local87 || local101 != 0 && local337 == local101) {
											continue label231;
										}
									}
								}
							}
						}
						local299 = arg0[local127][local71][local93];
						if (local299 != null && local299.aClass242_2 != null) {
							for (local305 = local299.aClass242_2; local305 != null; local305 = local305.aClass242_4) {
								local310 = local305.aClass3_Sub3_2;
								if (local310.aShort98 != local310.aShort97 || local310.aShort95 != local310.aShort96) {
									for (@Pc(406) int local406 = local310.aShort97; local406 <= local310.aShort98; local406++) {
										for (local320 = local310.aShort95; local320 <= local310.aShort96; local320++) {
											Static193.aByteArrayArrayArray4[local127][local406][local320] = local19;
										}
									}
								}
							}
						}
						Static193.aByteArrayArrayArray4[local127][local71][local93] = local19;
						local123 = true;
					}
				}
				if (local123) {
					local165 = Static420.aClass84Array4[Static4.anInt30 + 1].method5322(local71, local93);
					if (local165 > Static23.anIntArray32[arg2]) {
						Static23.anIntArray32[arg2] = local165;
					}
					local212 = local71 << 7;
					if (Static97.anIntArray189[arg2] > local212) {
						Static97.anIntArray189[arg2] = local212;
					} else if (local212 > Static10.anIntArray567[arg2]) {
						Static10.anIntArray567[arg2] = local212;
					}
					@Pc(508) int local508 = local93 << 7;
					if (Static375.anIntArray546[arg2] > local508) {
						Static375.anIntArray546[arg2] = local508;
					} else if (local508 > Static243.anIntArray371[arg2]) {
						Static243.anIntArray371[arg2] = local508;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static193.aByteArrayArrayArray4[Static4.anInt30][local71 - 1][local93] != local19) {
						Static59.anIntArray104[local53] = local71 - 1 | 0xD3000000 | 0x120000;
						Static48.anIntArray575[local53] = local93 | 0x130000;
						local53 = local53 + 1 & 0xFFF;
						Static193.aByteArrayArrayArray4[Static4.anInt30][local71 - 1][local93] = local19;
					}
					local93++;
					if (local93 < Static261.anInt4480) {
						if (local71 - 1 >= 0 && local19 != Static193.aByteArrayArrayArray4[Static4.anInt30][local71 - 1][local93] && (Static179.aByteArrayArrayArray3[Static4.anInt30][local71][local93] & 0x4) == 0 && (Static179.aByteArrayArrayArray3[Static4.anInt30][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static59.anIntArray104[local53] = local71 - 1 | 0x120000 | 0x52000000;
							Static48.anIntArray575[local53] = local93 | 0x130000;
							Static193.aByteArrayArrayArray4[Static4.anInt30][local71 - 1][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local19 != Static193.aByteArrayArrayArray4[Static4.anInt30][local71][local93]) {
							Static59.anIntArray104[local53] = local71 | 0x520000 | 0x13000000;
							Static48.anIntArray575[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static193.aByteArrayArrayArray4[Static4.anInt30][local71][local93] = local19;
						}
						if (local71 + 1 < Static84.anInt1632 && local19 != Static193.aByteArrayArrayArray4[Static4.anInt30][local71 + 1][local93] && (Static179.aByteArrayArrayArray3[Static4.anInt30][local71][local93] & 0x4) == 0 && (Static179.aByteArrayArrayArray3[Static4.anInt30][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static59.anIntArray104[local53] = local71 + 1 | 0x520000 | 0x92000000;
							Static48.anIntArray575[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static193.aByteArrayArrayArray4[Static4.anInt30][local71 + 1][local93] = local19;
						}
					}
					local93--;
					if (local71 + 1 < Static84.anInt1632 && Static193.aByteArrayArrayArray4[Static4.anInt30][local71 + 1][local93] != local19) {
						Static59.anIntArray104[local53] = 0x53000000 | 0x920000 | local71 + 1;
						Static48.anIntArray575[local53] = local93 | 0x930000;
						local53 = local53 + 1 & 0xFFF;
						Static193.aByteArrayArrayArray4[Static4.anInt30][local71 + 1][local93] = local19;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && local19 != Static193.aByteArrayArrayArray4[Static4.anInt30][local71 - 1][local93] && (Static179.aByteArrayArrayArray3[Static4.anInt30][local71][local93] & 0x4) == 0 && (Static179.aByteArrayArrayArray3[Static4.anInt30][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static59.anIntArray104[local53] = 0x12000000 | 0xD20000 | local71 - 1;
							Static48.anIntArray575[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static193.aByteArrayArrayArray4[Static4.anInt30][local71 - 1][local93] = local19;
						}
						if (local19 != Static193.aByteArrayArrayArray4[Static4.anInt30][local71][local93]) {
							Static59.anIntArray104[local53] = 0x93000000 | 0xD20000 | local71;
							Static48.anIntArray575[local53] = local93 | 0xD30000;
							Static193.aByteArrayArrayArray4[Static4.anInt30][local71][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local71 + 1 < Static84.anInt1632 && local19 != Static193.aByteArrayArrayArray4[Static4.anInt30][local71 + 1][local93] && (Static179.aByteArrayArrayArray3[Static4.anInt30][local71][local93] & 0x4) == 0 && (Static179.aByteArrayArrayArray3[Static4.anInt30][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static59.anIntArray104[local53] = local71 + 1 | 0xD2000000 | 0x920000;
							Static48.anIntArray575[local53] = local93 | 0x930000;
							Static193.aByteArrayArrayArray4[Static4.anInt30][local71 + 1][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static23.anIntArray32[arg2] != -1000000) {
				Static23.anIntArray32[arg2] += 10;
				Static97.anIntArray189[arg2] -= 50;
				Static10.anIntArray567[arg2] += 50;
				Static243.anIntArray371[arg2] += 50;
				Static375.anIntArray546[arg2] -= 50;
			}
			return true;
		}
	}
}
