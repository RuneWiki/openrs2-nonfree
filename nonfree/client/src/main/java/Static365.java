import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!so", name = "y", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_81 = new Class44(61, 7);

	@OriginalMember(owner = "client!so", name = "w", descriptor = "Lclient!mv;")
	public static final Class164 aClass164_2 = new Class164(128);

	@OriginalMember(owner = "client!so", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[[BLclient!cd;)V")
	public static void method5072(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class33_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt1247; local7++) {
			Static438.method5925();
			for (@Pc(21) int local21 = 0; local21 < Static81.anInt1950 >> 3; local21++) {
				for (@Pc(25) int local25 = 0; local25 < Static171.anInt3288 >> 3; local25++) {
					@Pc(35) int local35 = Static293.anIntArrayArrayArray13[local7][local21][local25];
					if (local35 != -1) {
						@Pc(45) int local45 = local35 >> 24 & 0x3;
						if (!arg1.aBoolean106 || local45 == 0) {
							@Pc(59) int local59 = local35 >> 1 & 0x3;
							@Pc(65) int local65 = local35 >> 14 & 0x3FF;
							@Pc(71) int local71 = local35 >> 3 & 0x7FF;
							@Pc(81) int local81 = local71 / 8 + (local65 / 8 << 8);
							for (@Pc(83) int local83 = 0; local83 < Static96.anIntArray119.length; local83++) {
								if (Static96.anIntArray119[local83] == local81 && arg0[local83] != null) {
									arg1.method920((local65 & 0x7) * 8, arg0[local83], local25 * 8, Static387.aClass26_9, local59, local21 * 8, Static332.aClass37Array1, (local71 & 0x7) * 8, local45, local7);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!pc;Lclient!qa;)V")
	public static void method5073(@OriginalArg(1) Class188 arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(10) Class89[] local10 = Static456.method1762(arg0, Static119.anInt2385);
		Static218.aClass76Array3 = new Class76[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static218.aClass76Array3[local16] = arg1.method2230(local10[local16]);
		}
		local10 = Static456.method1762(arg0, Static419.anInt7349);
		Static192.aClass76Array6 = new Class76[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static192.aClass76Array6[local47] = arg1.method2230(local10[local47]);
		}
		local10 = Static456.method1762(arg0, Static352.anInt7235);
		Static375.aClass76Array17 = new Class76[local10.length];
		for (@Pc(78) int local78 = 0; local78 < local10.length; local78++) {
			Static375.aClass76Array17[local78] = arg1.method2230(local10[local78]);
		}
		local10 = Static456.method1762(arg0, Static406.anInt7052);
		Static372.aClass76Array16 = new Class76[local10.length];
		for (@Pc(114) int local114 = 0; local114 < local10.length; local114++) {
			Static372.aClass76Array16[local114] = arg1.method2230(local10[local114]);
		}
		local10 = Static456.method1762(arg0, Static99.anInt1741);
		Static266.aClass76Array14 = new Class76[local10.length];
		for (@Pc(145) int local145 = 0; local145 < local10.length; local145++) {
			Static266.aClass76Array14[local145] = arg1.method2230(local10[local145]);
		}
		local10 = Static456.method1762(arg0, Static397.anInt6958);
		Static76.aClass76Array8 = new Class76[local10.length];
		for (@Pc(172) int local172 = 0; local172 < local10.length; local172++) {
			Static76.aClass76Array8[local172] = arg1.method2230(local10[local172]);
		}
		local10 = Static456.method1762(arg0, Static139.anInt2700);
		Static411.aClass76Array18 = new Class76[local10.length];
		for (@Pc(199) int local199 = 0; local199 < local10.length; local199++) {
			Static411.aClass76Array18[local199] = arg1.method2230(local10[local199]);
		}
		local10 = Static456.method1762(arg0, Static151.anInt2929);
		Static344.aClass76Array15 = new Class76[local10.length];
		for (@Pc(230) int local230 = 0; local230 < local10.length; local230++) {
			Static344.aClass76Array15[local230] = arg1.method2230(local10[local230]);
		}
		local10 = Static456.method1762(arg0, Static339.anInt5985);
		Static23.aClass76Array1 = new Class76[local10.length];
		for (@Pc(261) int local261 = 0; local261 < local10.length; local261++) {
			Static23.aClass76Array1[local261] = arg1.method2230(local10[local261]);
		}
		local10 = Static456.method1762(arg0, Static294.anInt4185);
		Static91.aClass76Array9 = new Class76[local10.length];
		for (@Pc(292) int local292 = 0; local292 < local10.length; local292++) {
			Static91.aClass76Array9[local292] = arg1.method2230(local10[local292]);
		}
		local10 = Static456.method1762(arg0, Static358.anInt6320);
		Static245.aClass76Array13 = new Class76[local10.length];
		for (@Pc(319) int local319 = 0; local319 < local10.length; local319++) {
			Static245.aClass76Array13[local319] = arg1.method2230(local10[local319]);
		}
		local10 = Static456.method1762(arg0, Static369.anInt6559);
		Static119.aClass76Array11 = new Class76[local10.length];
		for (@Pc(350) int local350 = 0; local350 < local10.length; local350++) {
			Static119.aClass76Array11[local350] = arg1.method2230(local10[local350]);
		}
		Static284.aClass76_13 = arg1.method2230(Static456.method1764(arg0, Static143.anInt7606, 0));
		Static226.aClass76_11 = arg1.method2230(Static456.method1764(arg0, Static447.anInt4686, 0));
		local10 = Static456.method1762(arg0, Static439.anInt7664);
		Static120.aClass76Array12 = new Class76[local10.length];
		for (@Pc(397) int local397 = 0; local397 < local10.length; local397++) {
			Static120.aClass76Array12[local397] = arg1.method2230(local10[local397]);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZIIIII)V")
	public static void method5074(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static140.aFrame12 != null && (arg3 != 3 || arg4 != Static399.aClass167_Sub1_1.anInt5569 || arg2 != Static399.aClass167_Sub1_1.anInt5561)) {
			Static9.method189(Static140.aFrame12, Static303.aClass131_4);
			Static140.aFrame12 = null;
		}
		if (arg3 == 3 && Static140.aFrame12 == null) {
			Static140.aFrame12 = Static366.method5099(arg4, arg2, 0, Static303.aClass131_4);
			if (Static140.aFrame12 != null) {
				Static399.aClass167_Sub1_1.anInt5569 = arg4;
				Static399.aClass167_Sub1_1.anInt5561 = arg2;
				Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
			}
		}
		if (arg3 == 3 && Static140.aFrame12 == null) {
			method5074(true, arg1, -1, Static399.aClass167_Sub1_1.anInt5557, -1);
			return;
		}
		@Pc(109) Container local109;
		@Pc(87) Insets local87;
		if (Static140.aFrame12 != null) {
			local109 = Static140.aFrame12;
			Static13.anInt316 = arg2;
			Static203.anInt3944 = arg4;
		} else if (Static373.aFrame2 == null) {
			local109 = Static303.aClass131_4.anApplet1;
			Static203.anInt3944 = local109.getSize().width;
			Static13.anInt316 = local109.getSize().height;
		} else {
			local87 = Static373.aFrame2.getInsets();
			Static203.anInt3944 = Static373.aFrame2.getSize().width - local87.right - local87.left;
			Static13.anInt316 = Static373.aFrame2.getSize().height - local87.bottom - local87.top;
			local109 = Static373.aFrame2;
		}
		@Pc(171) int local171;
		if (arg3 == 1) {
			Static128.anInt2522 = (Static203.anInt3944 - Static355.anInt6274) / 2;
			Static442.anInt7733 = 0;
			Static96.anInt2175 = Static355.anInt6274;
			Static216.anInt4171 = Static400.anInt6970;
		} else if (Static43.anInt1146 < 96 && Static281.anInt5126 == 0) {
			local171 = Static203.anInt3944 <= 1024 ? Static203.anInt3944 : 1024;
			Static96.anInt2175 = local171;
			Static128.anInt2522 = (Static203.anInt3944 - local171) / 2;
			@Pc(187) int local187 = Static13.anInt316 <= 768 ? Static13.anInt316 : 768;
			Static442.anInt7733 = 0;
			Static216.anInt4171 = local187;
		} else {
			Static216.anInt4171 = Static13.anInt316;
			Static96.anInt2175 = Static203.anInt3944;
			Static442.anInt7733 = 0;
			Static128.anInt2522 = 0;
		}
		if (Static343.aClass269_11 != Static293.aClass269_10) {
			@Pc(205) boolean local205;
			if (Static96.anInt2175 < 1024 && Static216.anInt4171 < 768) {
				local205 = true;
			} else {
				local205 = false;
			}
		}
		if (arg0) {
			Static6.method143();
		} else {
			Static118.aCanvas3.setSize(Static96.anInt2175, Static216.anInt4171);
			Static387.aClass26_9.method2264(Static118.aCanvas3);
			if (local109 == Static373.aFrame2) {
				local87 = Static373.aFrame2.getInsets();
				Static118.aCanvas3.setLocation(Static128.anInt2522 + local87.left, local87.top + Static442.anInt7733);
			} else {
				Static118.aCanvas3.setLocation(Static128.anInt2522, Static442.anInt7733);
			}
		}
		if (arg3 >= 2) {
			Static196.aBoolean467 = true;
		} else {
			Static196.aBoolean467 = false;
		}
		if (Static108.anInt2264 != -1) {
			Static264.method3971(true);
		}
		if (Static423.aClass199_11 != null && (Static297.anInt5339 == 30 || Static297.anInt5339 == 25)) {
			Static151.method2320();
		}
		for (local171 = 0; local171 < 100; local171++) {
			Static10.aBooleanArray5[local171] = true;
		}
		Static153.aBoolean263 = true;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
	public static void method5075() {
		Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
		Static141.aClass81_59 = null;
		Static182.anInt7663 = 0;
		Static193.anInt3787 = 0;
		Static356.aClass81_160 = null;
		Static325.anInt5840 = 0;
		Static405.aClass81_177 = null;
		Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
		Static106.aClass81_49 = null;
		Static407.method5519();
		Static174.method2736();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static129.aClass4_Sub2_Sub2_Sub1Array27[local31] = null;
		}
		Static231.aClass4_Sub2_Sub2_Sub1_2 = null;
		for (@Pc(47) int local47 = 0; local47 < Static4.aClass4_Sub2_Sub2_Sub2Array1.length; local47++) {
			@Pc(53) Class4_Sub2_Sub2_Sub2 local53 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local47];
			if (local53 != null) {
				local53.anInt6481 = -1;
			}
		}
		Static186.method2956();
		Static65.anInt7824 = 1;
		Static446.method6043(30);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static10.aBooleanArray5[local74] = true;
		}
		Static151.method2320();
		Static267.aLong147 = 0;
		Static310.aClass2_Sub29_2 = null;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[[[Lclient!ht;BIIZ)Z")
	public static boolean method5076(@OriginalArg(0) int arg0, @OriginalArg(1) Class113[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static41.anInt1082 & 0xFF);
		if (Static440.aByteArrayArrayArray17[Static301.anInt5383][arg3][arg0] == local14) {
			return false;
		} else if ((Static367.aByteArrayArrayArray16[Static301.anInt5383][arg3][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) byte local43 = 0;
			Static147.anIntArray309[0] = arg3;
			@Pc(49) int local49 = 0;
			@Pc(60) int local60 = local43 + 1;
			Static35.anIntArray508[0] = arg0;
			Static440.aByteArrayArrayArray17[Static301.anInt5383][arg3][arg0] = local14;
			while (local60 != local49) {
				@Pc(78) int local78 = Static147.anIntArray309[local49] & 0xFFFF;
				@Pc(86) int local86 = Static147.anIntArray309[local49] >> 16 & 0xFF;
				@Pc(94) int local94 = Static147.anIntArray309[local49] >> 24 & 0xFF;
				@Pc(100) int local100 = Static35.anIntArray508[local49] & 0xFFFF;
				@Pc(108) int local108 = Static35.anIntArray508[local49] >> 16 & 0xFF;
				local49 = local49 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static367.aByteArrayArrayArray16[Static301.anInt5383][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(172) int local172;
				@Pc(218) int local218;
				label231: for (@Pc(134) int local134 = Static301.anInt5383 + 1; local134 <= 3; local134++) {
					if ((Static367.aByteArrayArrayArray16[local134][local78][local100] & 0x8) == 0) {
						@Pc(316) Class4_Sub2 local316;
						@Pc(326) int local326;
						@Pc(305) Class113 local305;
						@Pc(311) Class134 local311;
						if (local116 && arg1[local134][local78][local100] != null) {
							if (arg1[local134][local78][local100].aClass4_Sub4_2 != null) {
								local172 = Static324.method4646(local86);
								if (arg1[local134][local78][local100].aClass4_Sub4_2.anInt7608 == local172 || arg1[local134][local78][local100].aClass4_Sub4_1 != null && arg1[local134][local78][local100].aClass4_Sub4_1.anInt7608 == local172) {
									continue;
								}
								if (local94 != 0) {
									local218 = Static324.method4646(local94);
									if (local218 == arg1[local134][local78][local100].aClass4_Sub4_2.anInt7608 || arg1[local134][local78][local100].aClass4_Sub4_1 != null && arg1[local134][local78][local100].aClass4_Sub4_1.anInt7608 == local218) {
										continue;
									}
								}
								if (local108 != 0) {
									local218 = Static324.method4646(local108);
									if (local218 == arg1[local134][local78][local100].aClass4_Sub4_2.anInt7608 || arg1[local134][local78][local100].aClass4_Sub4_1 != null && arg1[local134][local78][local100].aClass4_Sub4_1.anInt7608 == local218) {
										continue;
									}
								}
							}
							local305 = arg1[local134][local78][local100];
							if (local305.aClass134_1 != null) {
								for (local311 = local305.aClass134_1; local311 != null; local311 = local311.aClass134_2) {
									local316 = local311.aClass4_Sub2_1;
									if (local316 instanceof Interface9) {
										@Pc(322) Interface9 local322 = (Interface9) local316;
										local326 = local322.method5904();
										@Pc(330) int local330 = local322.method5902();
										if (local326 == 21) {
											local326 = 19;
										}
										@Pc(341) int local341 = local330 << 6 | local326;
										if (local341 == local86 || local94 != 0 && local94 == local341 || local108 != 0 && local341 == local108) {
											continue label231;
										}
									}
								}
							}
						}
						local305 = arg1[local134][local78][local100];
						if (local305 != null && local305.aClass134_1 != null) {
							for (local311 = local305.aClass134_1; local311 != null; local311 = local311.aClass134_2) {
								local316 = local311.aClass4_Sub2_1;
								if (local316.aShort88 != local316.aShort87 || local316.aShort86 != local316.aShort89) {
									for (@Pc(409) int local409 = local316.aShort88; local409 <= local316.aShort87; local409++) {
										for (local326 = local316.aShort89; local326 <= local316.aShort86; local326++) {
											Static440.aByteArrayArrayArray17[local134][local409][local326] = local14;
										}
									}
								}
							}
						}
						local130 = true;
						Static440.aByteArrayArrayArray17[local134][local78][local100] = local14;
					}
				}
				if (local130) {
					local172 = Static372.aClass106Array11[Static301.anInt5383 + 1].I(local78, local100);
					if (Static255.anIntArray326[arg2] < local172) {
						Static255.anIntArray326[arg2] = local172;
					}
					local218 = local78 << 7;
					@Pc(491) int local491 = local100 << 7;
					if (Static43.anIntArray49[arg2] > local218) {
						Static43.anIntArray49[arg2] = local218;
					} else if (local218 > Static277.anIntArray341[arg2]) {
						Static277.anIntArray341[arg2] = local218;
					}
					if (Static209.anIntArray262[arg2] > local491) {
						Static209.anIntArray262[arg2] = local491;
					} else if (Static328.anIntArray378[arg2] < local491) {
						Static328.anIntArray378[arg2] = local491;
					}
				}
				if (!local116) {
					if (local78 >= 1 && local14 != Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 - 1][local100]) {
						Static147.anIntArray309[local60] = local78 - 1 | 0xD3000000 | 0x120000;
						Static35.anIntArray508[local60] = local100 | 0x130000;
						local60 = local60 + 1 & 0xFFF;
						Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 - 1][local100] = local14;
					}
					local100++;
					if (Static171.anInt3288 > local100) {
						if (local78 - 1 >= 0 && Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 - 1][local100] != local14 && (Static367.aByteArrayArrayArray16[Static301.anInt5383][local78][local100] & 0x4) == 0 && (Static367.aByteArrayArrayArray16[Static301.anInt5383][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static147.anIntArray309[local60] = local78 - 1 | 0x120000 | 0x52000000;
							Static35.anIntArray508[local60] = local100 | 0x130000;
							local60 = local60 + 1 & 0xFFF;
							Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 - 1][local100] = local14;
						}
						if (Static440.aByteArrayArrayArray17[Static301.anInt5383][local78][local100] != local14) {
							Static147.anIntArray309[local60] = local78 | 0x13000000 | 0x520000;
							Static35.anIntArray508[local60] = local100 | 0x530000;
							Static440.aByteArrayArrayArray17[Static301.anInt5383][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local78 + 1 < Static81.anInt1950 && local14 != Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 + 1][local100] && (Static367.aByteArrayArrayArray16[Static301.anInt5383][local78][local100] & 0x4) == 0 && (Static367.aByteArrayArrayArray16[Static301.anInt5383][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static147.anIntArray309[local60] = local78 + 1 | 0x92000000 | 0x520000;
							Static35.anIntArray508[local60] = local100 | 0x530000;
							local60 = local60 + 1 & 0xFFF;
							Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 + 1][local100] = local14;
						}
					}
					local100--;
					if (local78 + 1 < Static81.anInt1950 && Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 + 1][local100] != local14) {
						Static147.anIntArray309[local60] = local78 + 1 | 0x920000 | 0x53000000;
						Static35.anIntArray508[local60] = local100 | 0x930000;
						Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 + 1][local100] = local14;
						local60 = local60 + 1 & 0xFFF;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && local14 != Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 - 1][local100] && (Static367.aByteArrayArrayArray16[Static301.anInt5383][local78][local100] & 0x4) == 0 && (Static367.aByteArrayArrayArray16[Static301.anInt5383][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static147.anIntArray309[local60] = local78 - 1 | 0xD20000 | 0x12000000;
							Static35.anIntArray508[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 - 1][local100] = local14;
						}
						if (local14 != Static440.aByteArrayArrayArray17[Static301.anInt5383][local78][local100]) {
							Static147.anIntArray309[local60] = 0x93000000 | 0xD20000 | local78;
							Static35.anIntArray508[local60] = local100 | 0xD30000;
							Static440.aByteArrayArrayArray17[Static301.anInt5383][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local78 + 1 < Static81.anInt1950 && local14 != Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 + 1][local100] && (Static367.aByteArrayArrayArray16[Static301.anInt5383][local78][local100] & 0x4) == 0 && (Static367.aByteArrayArrayArray16[Static301.anInt5383][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static147.anIntArray309[local60] = local78 + 1 | 0xD2000000 | 0x920000;
							Static35.anIntArray508[local60] = local100 | 0x930000;
							Static440.aByteArrayArrayArray17[Static301.anInt5383][local78 + 1][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static255.anIntArray326[arg2] != -1000000) {
				Static255.anIntArray326[arg2] += 10;
				Static43.anIntArray49[arg2] -= 50;
				Static277.anIntArray341[arg2] += 50;
				Static328.anIntArray378[arg2] += 50;
				Static209.anIntArray262[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V")
	public static void method5077() {
		if (Static197.aString28.toLowerCase().indexOf("microsoft") != -1) {
			Static158.anIntArray205[192] = 58;
			Static158.anIntArray205[219] = 42;
			Static158.anIntArray205[221] = 43;
			Static158.anIntArray205[220] = 74;
			Static158.anIntArray205[187] = 27;
			Static158.anIntArray205[189] = 26;
			Static158.anIntArray205[191] = 73;
			Static158.anIntArray205[223] = 28;
			Static158.anIntArray205[186] = 57;
			Static158.anIntArray205[222] = 59;
			Static158.anIntArray205[190] = 72;
			Static158.anIntArray205[188] = 71;
			return;
		}
		Static158.anIntArray205[93] = 43;
		Static158.anIntArray205[47] = 73;
		Static158.anIntArray205[44] = 71;
		Static158.anIntArray205[59] = 57;
		Static158.anIntArray205[92] = 74;
		Static158.anIntArray205[45] = 26;
		Static158.anIntArray205[91] = 42;
		Static158.anIntArray205[46] = 72;
		Static158.anIntArray205[61] = 27;
		if (Static197.aMethod1 == null) {
			Static158.anIntArray205[192] = 58;
			Static158.anIntArray205[222] = 59;
		} else {
			Static158.anIntArray205[222] = 58;
			Static158.anIntArray205[520] = 59;
			Static158.anIntArray205[192] = 28;
		}
	}
}
