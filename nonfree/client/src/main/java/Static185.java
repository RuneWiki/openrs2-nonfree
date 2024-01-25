import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Lclient!sd;")
	public static Class303 aClass303_1;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array5;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z[[[Lclient!mf;IIII)Z")
	public static boolean method3330(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class217[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) byte local12 = arg0 ? 1 : (byte) (Static143.anInt3169 & 0xFF);
		if (local12 == Static198.aByteArrayArrayArray8[Static16.anInt308][arg3][arg2]) {
			return false;
		} else if ((Static244.aByteArrayArrayArray9[Static16.anInt308][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(49) byte local49 = 0;
			Static437.anIntArray532[0] = arg3;
			@Pc(55) int local55 = 0;
			@Pc(58) int local58 = local49 + 1;
			Static444.anIntArray538[0] = arg2;
			Static198.aByteArrayArrayArray8[Static16.anInt308][arg3][arg2] = local12;
			while (local58 != local55) {
				@Pc(75) int local75 = Static437.anIntArray532[local55] & 0xFFFF;
				@Pc(83) int local83 = Static437.anIntArray532[local55] >> 16 & 0xFF;
				@Pc(91) int local91 = Static437.anIntArray532[local55] >> 24 & 0xFF;
				@Pc(97) int local97 = Static444.anIntArray538[local55] & 0xFFFF;
				@Pc(105) int local105 = Static444.anIntArray538[local55] >> 16 & 0xFF;
				local55 = local55 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static244.aByteArrayArrayArray9[Static16.anInt308][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(170) int local170;
				@Pc(218) int local218;
				label231: for (@Pc(134) int local134 = Static16.anInt308 + 1; local134 <= 3; local134++) {
					if ((Static244.aByteArrayArrayArray9[local134][local75][local97] & 0x8) == 0) {
						@Pc(320) Class11_Sub1_Sub1 local320;
						@Pc(330) int local330;
						@Pc(310) Class217 local310;
						@Pc(316) Class61 local316;
						if (local113 && arg1[local134][local75][local97] != null) {
							if (arg1[local134][local75][local97].aClass11_Sub1_Sub2_1 != null) {
								local170 = Static501.method7133(local83);
								if (local170 == arg1[local134][local75][local97].aClass11_Sub1_Sub2_1.aShort102 || arg1[local134][local75][local97].aClass11_Sub1_Sub2_2 != null && arg1[local134][local75][local97].aClass11_Sub1_Sub2_2.aShort102 == local170) {
									continue;
								}
								if (local91 != 0) {
									local218 = Static501.method7133(local91);
									if (arg1[local134][local75][local97].aClass11_Sub1_Sub2_1.aShort102 == local218 || arg1[local134][local75][local97].aClass11_Sub1_Sub2_2 != null && arg1[local134][local75][local97].aClass11_Sub1_Sub2_2.aShort102 == local218) {
										continue;
									}
								}
								if (local105 != 0) {
									local218 = Static501.method7133(local105);
									if (local218 == arg1[local134][local75][local97].aClass11_Sub1_Sub2_1.aShort102 || arg1[local134][local75][local97].aClass11_Sub1_Sub2_2 != null && local218 == arg1[local134][local75][local97].aClass11_Sub1_Sub2_2.aShort102) {
										continue;
									}
								}
							}
							local310 = arg1[local134][local75][local97];
							if (local310.aClass61_2 != null) {
								for (local316 = local310.aClass61_2; local316 != null; local316 = local316.aClass61_1) {
									local320 = local316.aClass11_Sub1_Sub1_1;
									if (local320 instanceof Interface27) {
										@Pc(326) Interface27 local326 = (Interface27) local320;
										local330 = local326.method8329();
										@Pc(334) int local334 = local326.method8328();
										if (local330 == 21) {
											local330 = 19;
										}
										@Pc(347) int local347 = local330 | local334 << 6;
										if (local83 == local347 || local91 != 0 && local347 == local91 || local105 != 0 && local347 == local105) {
											continue label231;
										}
									}
								}
							}
						}
						local310 = arg1[local134][local75][local97];
						if (local310 != null && local310.aClass61_2 != null) {
							for (local316 = local310.aClass61_2; local316 != null; local316 = local316.aClass61_1) {
								local320 = local316.aClass11_Sub1_Sub1_1;
								if (local320.aShort95 != local320.aShort96 || local320.aShort94 != local320.aShort97) {
									for (@Pc(414) int local414 = local320.aShort95; local414 <= local320.aShort96; local414++) {
										for (local330 = local320.aShort97; local330 <= local320.aShort94; local330++) {
											Static198.aByteArrayArrayArray8[local134][local414][local330] = local12;
										}
									}
								}
							}
						}
						Static198.aByteArrayArrayArray8[local134][local75][local97] = local12;
						local130 = true;
					}
				}
				if (local130) {
					local170 = Static331.aClass112Array3[Static16.anInt308 + 1].method7819(local97, local75);
					if (local170 > Static118.anIntArray207[arg4]) {
						Static118.anIntArray207[arg4] = local170;
					}
					local218 = local75 << 9;
					@Pc(485) int local485 = local97 << 9;
					if (Static386.anIntArray467[arg4] > local218) {
						Static386.anIntArray467[arg4] = local218;
					} else if (Static498.anIntArray582[arg4] < local218) {
						Static498.anIntArray582[arg4] = local218;
					}
					if (Static382.anIntArray457[arg4] > local485) {
						Static382.anIntArray457[arg4] = local485;
					} else if (Static611.anIntArray695[arg4] < local485) {
						Static611.anIntArray695[arg4] = local485;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local12 != Static198.aByteArrayArrayArray8[Static16.anInt308][local75 - 1][local97]) {
						Static437.anIntArray532[local58] = local75 - 1 | 0xD3000000 | 0x120000;
						Static444.anIntArray538[local58] = local97 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						Static198.aByteArrayArrayArray8[Static16.anInt308][local75 - 1][local97] = local12;
					}
					@Pc(588) int local588 = ~Static270.anInt5194;
					local97++;
					if (local588 < ~local97) {
						if (local75 - 1 >= 0 && local12 != Static198.aByteArrayArrayArray8[Static16.anInt308][local75 - 1][local97] && (Static244.aByteArrayArrayArray9[Static16.anInt308][local75][local97] & 0x4) == 0 && (Static244.aByteArrayArrayArray9[Static16.anInt308][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static437.anIntArray532[local58] = local75 - 1 | 0x52000000 | 0x120000;
							Static444.anIntArray538[local58] = local97 | 0x130000;
							local58 = local58 + 1 & 0xFFF;
							Static198.aByteArrayArrayArray8[Static16.anInt308][local75 - 1][local97] = local12;
						}
						if (local12 != Static198.aByteArrayArrayArray8[Static16.anInt308][local75][local97]) {
							Static437.anIntArray532[local58] = local75 | 0x13000000 | 0x520000;
							Static444.anIntArray538[local58] = local97 | 0x530000;
							Static198.aByteArrayArrayArray8[Static16.anInt308][local75][local97] = local12;
							local58 = local58 + 1 & 0xFFF;
						}
						if (Static3.anInt46 > local75 + 1 && local12 != Static198.aByteArrayArrayArray8[Static16.anInt308][local75 + 1][local97] && (Static244.aByteArrayArrayArray9[Static16.anInt308][local75][local97] & 0x4) == 0 && (Static244.aByteArrayArrayArray9[Static16.anInt308][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static437.anIntArray532[local58] = 0x92000000 | 0x520000 | local75 + 1;
							Static444.anIntArray538[local58] = local97 | 0x530000;
							Static198.aByteArrayArrayArray8[Static16.anInt308][local75 + 1][local97] = local12;
							local58 = local58 + 1 & 0xFFF;
						}
					}
					local97--;
					if (local75 + 1 < Static3.anInt46 && Static198.aByteArrayArrayArray8[Static16.anInt308][local75 + 1][local97] != local12) {
						Static437.anIntArray532[local58] = local75 + 1 | 0x920000 | 0x53000000;
						Static444.anIntArray538[local58] = local97 | 0x930000;
						local58 = local58 + 1 & 0xFFF;
						Static198.aByteArrayArrayArray8[Static16.anInt308][local75 + 1][local97] = local12;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && local12 != Static198.aByteArrayArrayArray8[Static16.anInt308][local75 - 1][local97] && (Static244.aByteArrayArrayArray9[Static16.anInt308][local75][local97] & 0x4) == 0 && (Static244.aByteArrayArrayArray9[Static16.anInt308][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static437.anIntArray532[local58] = 0x12000000 | 0xD20000 | local75 - 1;
							Static444.anIntArray538[local58] = local97 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static198.aByteArrayArrayArray8[Static16.anInt308][local75 - 1][local97] = local12;
						}
						if (local12 != Static198.aByteArrayArrayArray8[Static16.anInt308][local75][local97]) {
							Static437.anIntArray532[local58] = local75 | 0xD20000 | 0x93000000;
							Static444.anIntArray538[local58] = local97 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static198.aByteArrayArrayArray8[Static16.anInt308][local75][local97] = local12;
						}
						if (local75 + 1 < Static3.anInt46 && local12 != Static198.aByteArrayArrayArray8[Static16.anInt308][local75 + 1][local97] && (Static244.aByteArrayArrayArray9[Static16.anInt308][local75][local97] & 0x4) == 0 && (Static244.aByteArrayArrayArray9[Static16.anInt308][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static437.anIntArray532[local58] = local75 + 1 | 0x920000 | 0xD2000000;
							Static444.anIntArray538[local58] = local97 | 0x930000;
							Static198.aByteArrayArrayArray8[Static16.anInt308][local75 + 1][local97] = local12;
							local58 = local58 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static118.anIntArray207[arg4] != -1000000) {
				Static118.anIntArray207[arg4] += 40;
				Static386.anIntArray467[arg4] -= 512;
				Static498.anIntArray582[arg4] += 512;
				Static611.anIntArray695[arg4] += 512;
				Static382.anIntArray457[arg4] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public static void method3331() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static314.anInt5702 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(29) Exception local29) {
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!ud;)Lclient!ge;")
	public static Class126 method3332(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(9) int local9 = arg0.method6904();
		@Pc(16) Class174 local16 = Static534.method7469()[arg0.method6904()];
		@Pc(25) Class176 local25 = Static85.method1548()[arg0.method6904()];
		@Pc(29) int local29 = arg0.method6856();
		@Pc(33) int local33 = arg0.method6856();
		@Pc(39) int local39 = arg0.method6884();
		@Pc(45) int local45 = arg0.method6884();
		@Pc(49) int local49 = arg0.method6865();
		@Pc(58) int local58 = arg0.method6865();
		@Pc(62) int local62 = arg0.method6865();
		@Pc(71) boolean local71 = arg0.method6904() == 1;
		return new Class126(local9, local16, local25, local29, local33, local39, local45, local49, local58, local62, local71);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIB)V")
	public static void method3333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static76.method1457(false, true, local35);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ud;B)Lclient!rv;")
	public static Class138 method3335(@OriginalArg(0) Class2_Sub34 arg0) {
		@Pc(15) int local15 = arg0.method6884();
		@Pc(22) Class174 local22 = Static534.method7469()[arg0.method6904()];
		@Pc(29) Class176 local29 = Static85.method1548()[arg0.method6904()];
		@Pc(33) int local33 = arg0.method6856();
		@Pc(37) int local37 = arg0.method6856();
		return new Class138(local15, local22, local29, local33, local37);
	}
}
