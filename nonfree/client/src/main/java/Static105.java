import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "Lclient!q;")
	public static Class1_Sub2_Sub12_Sub1 aClass1_Sub2_Sub12_Sub1_1;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "[I")
	public static int[] anIntArray261;

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array5;

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
	public static int anInt1963;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	public static int anInt1945 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!og;I)Ljava/lang/String;")
	public static String method1656(@OriginalArg(0) int arg0, @OriginalArg(1) Class127 arg1) {
		if (!Static43.method794(arg1).method4350(arg0) && arg1.anObjectArray26 == null) {
			return null;
		} else if (arg1.aStringArray20 == null || arg1.aStringArray20.length <= arg0 || arg1.aStringArray20[arg0] == null || arg1.aStringArray20[arg0].trim().length() == 0) {
			return Static26.aBoolean49 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray20[arg0];
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public static void method1657() {
		@Pc(15) int local15;
		@Pc(29) int local29;
		@Pc(21) int local21;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if (Static221.anInt4611 == 229) {
			local15 = Static63.aClass1_Sub18_Sub1_1.method3099();
			local21 = (local15 & 0x7) + Static159.anInt2976;
			local29 = Static58.anInt1227 + (local15 >> 4 & 0x7);
			local33 = Static63.aClass1_Sub18_Sub1_1.method3062();
			local37 = Static63.aClass1_Sub18_Sub1_1.method3107();
			local43 = Static63.aClass1_Sub18_Sub1_1.method3107();
			if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104 && Static216.anInt4446 != local33) {
				@Pc(71) Class6_Sub7 local71 = new Class6_Sub7();
				local71.anInt4999 = local43;
				local71.anInt4998 = local37;
				if (Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local29][local21] == null) {
					Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local29][local21] = new Class69();
				}
				Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local29][local21].method1628(new Class1_Sub2_Sub5(local71));
				Static261.method4030(local21, local29);
			}
		} else if (Static221.anInt4611 == 145) {
			local15 = Static63.aClass1_Sub18_Sub1_1.method3107();
			local29 = Static63.aClass1_Sub18_Sub1_1.method3122();
			Static35.method636(local15).method2357(local29);
		} else if (Static221.anInt4611 == 8) {
			local15 = Static63.aClass1_Sub18_Sub1_1.method3122();
			local29 = (local15 >> 4 & 0x7) + Static58.anInt1227;
			local21 = (local15 & 0x7) + Static159.anInt2976;
			local33 = Static63.aClass1_Sub18_Sub1_1.method3107();
			local37 = Static63.aClass1_Sub18_Sub1_1.method3107();
			local43 = Static63.aClass1_Sub18_Sub1_1.method3107();
			if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
				@Pc(200) Class69 local200 = Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local29][local21];
				if (local200 != null) {
					for (@Pc(208) Class1_Sub2_Sub5 local208 = (Class1_Sub2_Sub5) local200.method1636(); local208 != null; local208 = (Class1_Sub2_Sub5) local200.method1631()) {
						@Pc(213) Class6_Sub7 local213 = local208.aClass6_Sub7_1;
						if ((local33 & 0x7FFF) == local213.anInt4998 && local213.anInt4999 == local37) {
							local213.anInt4999 = local43;
							break;
						}
					}
					Static261.method4030(local21, local29);
				}
			}
		} else {
			@Pc(311) int local311;
			@Pc(315) int local315;
			@Pc(319) int local319;
			@Pc(331) int local331;
			@Pc(418) Class6_Sub1 local418;
			@Pc(295) int local295;
			@Pc(301) int local301;
			@Pc(307) int local307;
			if (Static221.anInt4611 == 44) {
				local15 = Static63.aClass1_Sub18_Sub1_1.method3122();
				local29 = Static58.anInt1227 + (local15 >> 4 & 0x7);
				local21 = Static159.anInt2976 + (local15 & 0x7);
				local33 = local29 + Static63.aClass1_Sub18_Sub1_1.method3082();
				local37 = Static63.aClass1_Sub18_Sub1_1.method3082() + local21;
				local43 = Static63.aClass1_Sub18_Sub1_1.method3064();
				local295 = Static63.aClass1_Sub18_Sub1_1.method3107();
				local301 = Static63.aClass1_Sub18_Sub1_1.method3122() * 4;
				local307 = Static63.aClass1_Sub18_Sub1_1.method3122() * 4;
				local311 = Static63.aClass1_Sub18_Sub1_1.method3107();
				local315 = Static63.aClass1_Sub18_Sub1_1.method3107();
				local319 = Static63.aClass1_Sub18_Sub1_1.method3122();
				if (local319 == 255) {
					local319 = -1;
				}
				local331 = Static63.aClass1_Sub18_Sub1_1.method3122();
				if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104 && local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104 && local295 != 65535) {
					local33 = local33 * 128 + 64;
					local37 = local37 * 128 + 64;
					local21 = local21 * 128 + 64;
					local29 = local29 * 128 + 64;
					local418 = new Class6_Sub1(local295, Static159.anInt2978, local29, local21, Static124.method1919(Static159.anInt2978, local29, local21) - local301, Static261.anInt5259 + local311, local315 + Static261.anInt5259, local319, local331, local43, local307);
					local418.method231(Static124.method1919(Static159.anInt2978, local33, local37) - local307, local311 + Static261.anInt5259, local33, local37);
					Static70.aClass69_6.method1628(new Class1_Sub2_Sub6(local418));
				}
			} else if (Static221.anInt4611 == 82) {
				local15 = Static63.aClass1_Sub18_Sub1_1.method3122();
				local29 = Static58.anInt1227 + (local15 >> 4 & 0x7);
				local21 = (local15 & 0x7) + Static159.anInt2976;
				local33 = Static63.aClass1_Sub18_Sub1_1.method3107();
				local37 = Static63.aClass1_Sub18_Sub1_1.method3122();
				local43 = Static63.aClass1_Sub18_Sub1_1.method3107();
				if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
					local21 = local21 * 128 + 64;
					local29 = local29 * 128 + 64;
					@Pc(525) Class6_Sub4 local525 = new Class6_Sub4(local33, Static159.anInt2978, local29, local21, Static124.method1919(Static159.anInt2978, local29, local21) - local37, local43, Static261.anInt5259);
					Static44.aClass69_5.method1628(new Class1_Sub2_Sub7(local525));
				}
			} else {
				@Pc(616) int local616;
				if (Static221.anInt4611 == 254) {
					local15 = Static63.aClass1_Sub18_Sub1_1.method3122();
					local21 = (local15 & 0xF) + Static159.anInt2976 * 2;
					local29 = (local15 >> 4 & 0xF) + Static58.anInt1227 * 2;
					local33 = local29 + Static63.aClass1_Sub18_Sub1_1.method3082();
					local37 = local21 + Static63.aClass1_Sub18_Sub1_1.method3082();
					local43 = Static63.aClass1_Sub18_Sub1_1.method3064();
					local295 = Static63.aClass1_Sub18_Sub1_1.method3064();
					local301 = Static63.aClass1_Sub18_Sub1_1.method3107();
					local307 = Static63.aClass1_Sub18_Sub1_1.method3082();
					local311 = Static63.aClass1_Sub18_Sub1_1.method3122() * 4;
					local315 = Static63.aClass1_Sub18_Sub1_1.method3107();
					local319 = Static63.aClass1_Sub18_Sub1_1.method3107();
					local331 = Static63.aClass1_Sub18_Sub1_1.method3122();
					local616 = Static63.aClass1_Sub18_Sub1_1.method3122();
					if (local331 == 255) {
						local331 = -1;
					}
					if (local29 >= 0 && local21 >= 0 && local29 < 208 && local21 < 208 && local33 >= 0 && local37 >= 0 && local33 < 208 && local37 < 208 && local301 != 65535) {
						local33 = local33 * 64;
						local29 *= 64;
						local37 = local37 * 64;
						local21 = local21 * 64;
						if (local43 != 0) {
							@Pc(696) int local696;
							@Pc(700) Class6_Sub6 local700;
							@Pc(686) int local686;
							@Pc(690) int local690;
							if (local43 >= 0) {
								local686 = local43 - 1;
								local690 = local686 & 0x7FF;
								local696 = local686 >> 11 & 0xF;
								local700 = Static211.aClass6_Sub6_Sub1Array2[local690];
							} else {
								local686 = -local43 - 1;
								local690 = local686 & 0x7FF;
								if (local690 == Static216.anInt4446) {
									local700 = Static28.aClass6_Sub6_Sub2_1;
								} else {
									local700 = Static77.aClass6_Sub6_Sub2Array1[local690];
								}
								local696 = local686 >> 11 & 0xF;
							}
							if (local700 != null) {
								@Pc(739) Class79 local739 = local700.method3503();
								if (local739.anIntArrayArray19 != null && local739.anIntArrayArray19[local696] != null) {
									local690 = local739.anIntArrayArray19[local696][0];
									@Pc(759) int local759 = Class135.anIntArray472[local700.anInt4511];
									@Pc(766) int local766 = local739.anIntArrayArray19[local696][2];
									local307 -= local739.anIntArrayArray19[local696][1];
									@Pc(780) int local780 = Class135.anIntArray474[local700.anInt4511];
									@Pc(790) int local790 = local690 * local780 + local766 * local759 >> 16;
									@Pc(801) int local801 = local780 * local766 - local690 * local759 >> 16;
									local21 += local801;
									local29 += local790;
								}
							}
						}
						@Pc(837) Class6_Sub1 local837 = new Class6_Sub1(local301, Static159.anInt2978, local29, local21, Static124.method1919(Static159.anInt2978, local29, local21) - local307, local315 + Static261.anInt5259, Static261.anInt5259 + local319, local331, local616, local295, local311);
						local837.method231(Static124.method1919(Static159.anInt2978, local33, local37) - local311, local315 - -Static261.anInt5259, local33, local37);
						Static70.aClass69_6.method1628(new Class1_Sub2_Sub6(local837));
					}
				} else if (Static221.anInt4611 == 250) {
					local15 = Static63.aClass1_Sub18_Sub1_1.method3122();
					local29 = local15 >> 2;
					local21 = local15 & 0x3;
					local33 = Static271.anIntArray631[local29];
					local37 = Static63.aClass1_Sub18_Sub1_1.method3122();
					local295 = Static159.anInt2976 + (local37 & 0x7);
					local43 = (local37 >> 4 & 0x7) + Static58.anInt1227;
					local301 = Static63.aClass1_Sub18_Sub1_1.method3107();
					if (local43 >= 0 && local295 >= 0 && local43 < 104 && local295 < 104) {
						Static39.method721(local33, -1, Static159.anInt2978, local295, local21, local43, local29, 0, local301);
					}
				} else {
					if (Static221.anInt4611 == 14) {
						local15 = Static63.aClass1_Sub18_Sub1_1.method3118();
						@Pc(947) byte local947 = Static63.aClass1_Sub18_Sub1_1.method3079();
						local21 = Static63.aClass1_Sub18_Sub1_1.method3107();
						@Pc(955) byte local955 = Static63.aClass1_Sub18_Sub1_1.method3079();
						@Pc(959) byte local959 = Static63.aClass1_Sub18_Sub1_1.method3083();
						local43 = Static63.aClass1_Sub18_Sub1_1.method3099();
						local295 = (local43 >> 4 & 0x7) + Static58.anInt1227;
						local301 = Static159.anInt2976 + (local43 & 0x7);
						@Pc(981) byte local981 = Static63.aClass1_Sub18_Sub1_1.method3083();
						local311 = Static63.aClass1_Sub18_Sub1_1.method3057();
						local315 = local311 >> 2;
						local319 = local311 & 0x3;
						local331 = Static63.aClass1_Sub18_Sub1_1.method3103();
						local616 = Static63.aClass1_Sub18_Sub1_1.method3064();
						if (!Static240.aBoolean369) {
							Static11.method232(local301, local15, local947, local319, local616, local959, local981, local331, local315, local21, local295, local955);
						}
					}
					if (Static221.anInt4611 == 88) {
						local15 = Static63.aClass1_Sub18_Sub1_1.method3099();
						local21 = (local15 & 0x7) + Static159.anInt2976;
						local29 = Static58.anInt1227 + (local15 >> 4 & 0x7);
						local33 = Static63.aClass1_Sub18_Sub1_1.method3057();
						local43 = local33 & 0x3;
						local37 = local33 >> 2;
						local295 = Static271.anIntArray631[local37];
						if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
							Static39.method721(local295, -1, Static159.anInt2978, local21, local43, local29, local37, 0, -1);
						}
					} else if (Static221.anInt4611 == 222) {
						local15 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local29 = (local15 >> 4 & 0x7) + Static58.anInt1227;
						local21 = Static159.anInt2976 + (local15 & 0x7);
						local33 = Static63.aClass1_Sub18_Sub1_1.method3107();
						if (local33 == 65535) {
							local33 = -1;
						}
						local37 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local295 = local37 & 0x7;
						local43 = local37 >> 4 & 0xF;
						local301 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local307 = Static63.aClass1_Sub18_Sub1_1.method3122();
						if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
							local311 = local43 + 1;
							if (Static28.aClass6_Sub6_Sub2_1.anIntArray519[0] >= local29 - local311 && Static28.aClass6_Sub6_Sub2_1.anIntArray519[0] <= local29 + local311 && Static28.aClass6_Sub6_Sub2_1.anIntArray516[0] >= local21 - local311 && Static28.aClass6_Sub6_Sub2_1.anIntArray516[0] <= local311 + local21 && Static267.anInt5346 != 0 && local295 > 0 && Static25.anInt2862 < 50 && local33 != -1) {
								Static55.anIntArray139[Static25.anInt2862] = local33;
								Static237.anIntArray360[Static25.anInt2862] = local295;
								Static207.anIntArray471[Static25.anInt2862] = local301;
								Static221.aClass44Array1[Static25.anInt2862] = null;
								Static93.anIntArray237[Static25.anInt2862] = (local29 << 16) + (local21 << 8) + local43;
								Static282.anIntArray689[Static25.anInt2862] = local307;
								Static25.anInt2862++;
							}
						}
					} else if (Static221.anInt4611 == 101) {
						local15 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local21 = Static159.anInt2976 + (local15 & 0x7);
						local29 = Static58.anInt1227 + (local15 >> 4 & 0x7);
						local33 = Static63.aClass1_Sub18_Sub1_1.method3118();
						local37 = Static63.aClass1_Sub18_Sub1_1.method3118();
						if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
							@Pc(1318) Class6_Sub7 local1318 = new Class6_Sub7();
							local1318.anInt4999 = local37;
							local1318.anInt4998 = local33;
							if (Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local29][local21] == null) {
								Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local29][local21] = new Class69();
							}
							Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local29][local21].method1628(new Class1_Sub2_Sub5(local1318));
							Static261.method4030(local21, local29);
						}
					} else if (Static221.anInt4611 == 225) {
						local15 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local29 = (local15 >> 4 & 0xF) + Static58.anInt1227 * 2;
						local21 = (local15 & 0xF) + Static159.anInt2976 * 2;
						local33 = local29 + Static63.aClass1_Sub18_Sub1_1.method3082();
						local37 = local21 + Static63.aClass1_Sub18_Sub1_1.method3082();
						local43 = Static63.aClass1_Sub18_Sub1_1.method3064();
						local295 = Static63.aClass1_Sub18_Sub1_1.method3107();
						local301 = Static63.aClass1_Sub18_Sub1_1.method3122() * 4;
						local307 = Static63.aClass1_Sub18_Sub1_1.method3122() * 4;
						local311 = Static63.aClass1_Sub18_Sub1_1.method3107();
						local315 = Static63.aClass1_Sub18_Sub1_1.method3107();
						local319 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local331 = Static63.aClass1_Sub18_Sub1_1.method3122();
						if (local319 == 255) {
							local319 = -1;
						}
						if (local29 >= 0 && local21 >= 0 && local29 < 208 && local21 < 208 && local33 >= 0 && local37 >= 0 && local33 < 208 && local37 < 208 && local295 != 65535) {
							local37 = local37 * 64;
							local21 *= 64;
							local33 *= 64;
							local29 *= 64;
							local418 = new Class6_Sub1(local295, Static159.anInt2978, local29, local21, Static124.method1919(Static159.anInt2978, local29, local21) - local301, local311 + Static261.anInt5259, Static261.anInt5259 + local315, local319, local331, local43, local307);
							local418.method231(Static124.method1919(Static159.anInt2978, local33, local37) - local307, local311 + Static261.anInt5259, local33, local37);
							Static70.aClass69_6.method1628(new Class1_Sub2_Sub6(local418));
						}
					} else if (Static221.anInt4611 == 133) {
						local15 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local29 = (local15 >> 4 & 0x7) + Static58.anInt1227;
						local21 = (local15 & 0x7) + Static159.anInt2976;
						local33 = Static63.aClass1_Sub18_Sub1_1.method3107();
						if (local29 >= 0 && local21 >= 0 && local29 < 104 && local21 < 104) {
							@Pc(1602) Class69 local1602 = Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local29][local21];
							if (local1602 != null) {
								for (@Pc(1611) Class1_Sub2_Sub5 local1611 = (Class1_Sub2_Sub5) local1602.method1636(); local1611 != null; local1611 = (Class1_Sub2_Sub5) local1602.method1631()) {
									if ((local33 & 0x7FFF) == local1611.aClass6_Sub7_1.anInt4998) {
										local1611.method4534();
										break;
									}
								}
								if (local1602.method1636() == null) {
									Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local29][local21] = null;
								}
								Static261.method4030(local21, local29);
							}
						}
					} else if (Static221.anInt4611 == 218) {
						local15 = Static63.aClass1_Sub18_Sub1_1.method3062();
						if (local15 == 65535) {
							local15 = -1;
						}
						local29 = Static63.aClass1_Sub18_Sub1_1.method3099();
						local21 = local29 >> 2;
						local33 = local29 & 0x3;
						local37 = Static271.anIntArray631[local21];
						local43 = Static63.aClass1_Sub18_Sub1_1.method3099();
						local295 = Static58.anInt1227 + (local43 >> 4 & 0x7);
						local301 = (local43 & 0x7) + Static159.anInt2976;
						Static178.method2687(local295, local21, local301, local15, local33, Static159.anInt2978, local37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZC)Z")
	public static boolean method1658(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V")
	public static void method1661() {
		if (Static129.anInt3910 > 1) {
			Static129.anInt3910--;
			Static70.anInt1408 = Static56.anInt1175;
		}
		if (Static103.anInt1940 > 0) {
			Static103.anInt1940--;
		}
		if (Static84.aBoolean122) {
			Static84.aBoolean122 = false;
			Static276.method4249();
			return;
		}
		@Pc(30) int local30;
		for (local30 = 0; local30 < 100 && Static235.method3738(); local30++) {
		}
		if (Static98.anInt1878 != 30) {
			return;
		}
		Static262.method4034(Static270.aClass1_Sub18_Sub1_3);
		@Pc(56) Object local56 = Static74.aClass3_1.anObject1;
		@Pc(93) int local93;
		@Pc(95) int local95;
		@Pc(117) int local117;
		@Pc(138) int local138;
		@Pc(193) int local193;
		@Pc(197) int local197;
		synchronized (Static74.aClass3_1.anObject1) {
			if (!Static27.aBoolean52) {
				Static74.aClass3_1.anInt168 = 0;
			} else if (Static143.anInt2663 != 0 || Static74.aClass3_1.anInt168 >= 40) {
				Static270.aClass1_Sub18_Sub1_3.method3130(93);
				Static270.aClass1_Sub18_Sub1_3.method3093(0);
				@Pc(91) int local91 = Static270.aClass1_Sub18_Sub1_3.anInt3911;
				local93 = 0;
				for (local95 = 0; local95 < Static74.aClass3_1.anInt168 && Static270.aClass1_Sub18_Sub1_3.anInt3911 - local91 < 240; local95++) {
					local93++;
					local117 = Static74.aClass3_1.anIntArray17[local95];
					if (local117 < 0) {
						local117 = 0;
					} else if (local117 > 65534) {
						local117 = 65534;
					}
					@Pc(133) boolean local133 = false;
					local138 = Static74.aClass3_1.anIntArray16[local95];
					if (local138 < 0) {
						local138 = 0;
					} else if (local138 > 65534) {
						local138 = 65534;
					}
					if (Static74.aClass3_1.anIntArray17[local95] == -1 && Static74.aClass3_1.anIntArray16[local95] == -1) {
						local117 = -1;
						local133 = true;
						local138 = -1;
					}
					if (Static119.anInt4990 != local138 || local117 != Static68.anInt4753) {
						local193 = local138 - Static119.anInt4990;
						local197 = local117 - Static68.anInt4753;
						Static119.anInt4990 = local138;
						Static68.anInt4753 = local117;
						if (Static107.anInt1999 < 8 && local193 >= -32 && local193 <= 31 && local197 >= -32 && local197 <= 31) {
							local193 += 32;
							local197 += 32;
							Static270.aClass1_Sub18_Sub1_3.method3123((Static107.anInt1999 << 12) + (local193 << 6) + local197);
							Static107.anInt1999 = 0;
						} else if (Static107.anInt1999 < 32 && local193 >= -128 && local193 <= 127 && local197 >= -128 && local197 <= 127) {
							Static270.aClass1_Sub18_Sub1_3.method3093(Static107.anInt1999 + 128);
							local197 += 128;
							local193 += 128;
							Static270.aClass1_Sub18_Sub1_3.method3123(local197 + (local193 << 8));
							Static107.anInt1999 = 0;
						} else if (Static107.anInt1999 >= 32) {
							Static270.aClass1_Sub18_Sub1_3.method3123(Static107.anInt1999 + 57344);
							if (local133) {
								Static270.aClass1_Sub18_Sub1_3.method3119(Integer.MIN_VALUE);
							} else {
								Static270.aClass1_Sub18_Sub1_3.method3119(local117 << 16 | local138);
							}
							Static107.anInt1999 = 0;
						} else {
							Static270.aClass1_Sub18_Sub1_3.method3093(Static107.anInt1999 + 192);
							if (local133) {
								Static270.aClass1_Sub18_Sub1_3.method3119(Integer.MIN_VALUE);
							} else {
								Static270.aClass1_Sub18_Sub1_3.method3119(local138 | local117 << 16);
							}
							Static107.anInt1999 = 0;
						}
					} else if (Static107.anInt1999 < 2047) {
						Static107.anInt1999++;
					}
				}
				Static270.aClass1_Sub18_Sub1_3.method3087(Static270.aClass1_Sub18_Sub1_3.anInt3911 - local91);
				if (Static74.aClass3_1.anInt168 > local93) {
					Static74.aClass3_1.anInt168 -= local93;
					for (local95 = 0; local95 < Static74.aClass3_1.anInt168; local95++) {
						Static74.aClass3_1.anIntArray16[local95] = Static74.aClass3_1.anIntArray16[local93 + local95];
						Static74.aClass3_1.anIntArray17[local95] = Static74.aClass3_1.anIntArray17[local93 + local95];
					}
				} else {
					Static74.aClass3_1.anInt168 = 0;
				}
			}
		}
		if (Static143.anInt2663 != 0) {
			@Pc(411) long local411 = (Static82.aLong54 - Static295.aLong198) / 50L;
			Static295.aLong198 = Static82.aLong54;
			local95 = Static207.anInt4122;
			local93 = Static72.anInt1427;
			if (local93 < 0) {
				local93 = 0;
			} else if (local93 > 65535) {
				local93 = 65535;
			}
			if (local95 < 0) {
				local95 = 0;
			} else if (local95 > 65535) {
				local95 = 65535;
			}
			if (local411 > 32767L) {
				local411 = 32767L;
			}
			@Pc(458) byte local458 = 0;
			if (Static143.anInt2663 == 2) {
				local458 = 1;
			}
			Static270.aClass1_Sub18_Sub1_3.method3130(167);
			Static270.aClass1_Sub18_Sub1_3.method3120(local95 | local93 << 16);
			local138 = (int) local411;
			Static270.aClass1_Sub18_Sub1_3.method3100(local458 << 15 | local138);
		}
		if (Static81.anInt1612 > 0) {
			Static81.anInt1612--;
		}
		if (Static45.aBoolean87 && Static81.anInt1612 <= 0) {
			Static45.aBoolean87 = false;
			Static81.anInt1612 = 20;
			Static270.aClass1_Sub18_Sub1_3.method3130(119);
			Static270.aClass1_Sub18_Sub1_3.method3100((int) Static177.aFloat97);
			Static270.aClass1_Sub18_Sub1_3.method3089((int) Static152.aFloat81);
		}
		if (Static297.aBoolean450 && !Static28.aBoolean53) {
			Static28.aBoolean53 = true;
			Static270.aClass1_Sub18_Sub1_3.method3130(39);
			Static270.aClass1_Sub18_Sub1_3.method3093(1);
		}
		if (!Static297.aBoolean450 && Static28.aBoolean53) {
			Static28.aBoolean53 = false;
			Static270.aClass1_Sub18_Sub1_3.method3130(39);
			Static270.aClass1_Sub18_Sub1_3.method3093(0);
		}
		if (!Static37.aBoolean219) {
			Static270.aClass1_Sub18_Sub1_3.method3130(208);
			Static270.aClass1_Sub18_Sub1_3.method3120(Static110.method1724());
			Static37.aBoolean219 = true;
		}
		if (Static214.aBoolean322) {
			Static214.aBoolean322 = false;
		} else {
			Static70.aFloat38 /= 2.0F;
		}
		if (Static282.aBoolean447) {
			Static282.aBoolean447 = false;
		} else {
			Static149.aFloat80 /= 2.0F;
		}
		Static151.method2344();
		if (Static98.anInt1878 != 30) {
			return;
		}
		Static178.method2686();
		Static167.method2550();
		Static75.method1283();
		Static209.anInt4188++;
		if (Static209.anInt4188 > 750) {
			Static276.method4249();
			return;
		}
		Static18.method322();
		Static137.method3043();
		Static234.method3733();
		if (Static260.aClass127_12 != null) {
			Static164.method2497();
		}
		for (local30 = Static38.method707(true); local30 != -1; local30 = Static38.method707(false)) {
			Static293.method4499(local30);
			Static16.anIntArray35[Static151.anInt2791++ & 0x1F] = local30;
		}
		@Pc(759) int local759;
		for (@Pc(697) Class1_Sub2_Sub11 local697 = Static121.method1901(); local697 != null; local697 = Static121.method1901()) {
			local93 = local697.method1854();
			local95 = local697.method1851();
			if (local93 == 1) {
				Static39.anIntArray119[local95] = local697.anInt2282;
				Static286.anIntArray594[Static236.anInt4920++ & 0x1F] = local95;
			} else if (local93 == 2) {
				Static236.aStringArray25[local95] = local697.aString70;
				Static30.anIntArray66[Static237.anInt2921++ & 0x1F] = local95;
			} else {
				@Pc(827) Class127 local827;
				if (local93 == 3) {
					local827 = Static75.method1287(local95);
					if (!local697.aString70.equals(local827.aString125)) {
						local827.aString125 = local697.aString70;
						Static155.method2392(local827);
					}
				} else if (local93 == 4) {
					local827 = Static75.method1287(local95);
					local138 = local697.anInt2282;
					local193 = local697.anInt2274;
					local759 = local697.anInt2279;
					if (local827.anInt3592 != local138 || local827.anInt3560 != local759 || local193 != local827.anInt3565) {
						local827.anInt3565 = local193;
						local827.anInt3592 = local138;
						local827.anInt3560 = local759;
						Static155.method2392(local827);
					}
				} else if (local93 == 5) {
					local827 = Static75.method1287(local95);
					if (local827.anInt3623 != local697.anInt2282 || local697.anInt2282 == -1) {
						local827.anInt3581 = 0;
						local827.anInt3624 = 1;
						local827.anInt3569 = 0;
						local827.anInt3623 = local697.anInt2282;
						Static155.method2392(local827);
					}
				} else if (local93 == 6) {
					local117 = local697.anInt2282;
					local759 = local117 >> 5 & 0x1F;
					local138 = local117 >> 10 & 0x1F;
					local193 = local117 & 0x1F;
					local197 = (local138 << 19) + (local759 << 11) + (local193 << 3);
					@Pc(788) Class127 local788 = Static75.method1287(local95);
					if (local197 != local788.anInt3550) {
						local788.anInt3550 = local197;
						Static155.method2392(local788);
					}
				} else if (local93 == 7) {
					local827 = Static75.method1287(local95);
					@Pc(1096) boolean local1096 = local697.anInt2282 == 1;
					if (local1096 != local827.aBoolean277) {
						local827.aBoolean277 = local1096;
						Static155.method2392(local827);
					}
				} else if (local93 == 8) {
					local827 = Static75.method1287(local95);
					if (local697.anInt2282 != local827.anInt3577 || local697.anInt2279 != local827.anInt3620 || local697.anInt2274 != local827.anInt3556) {
						local827.anInt3577 = local697.anInt2282;
						local827.anInt3556 = local697.anInt2274;
						if (local827.anInt3575 != -1) {
							if (local827.anInt3564 > 0) {
								local827.anInt3556 = local827.anInt3556 * 32 / local827.anInt3564;
							} else if (local827.anInt3546 > 0) {
								local827.anInt3556 = local827.anInt3556 * 32 / local827.anInt3546;
							}
						}
						local827.anInt3620 = local697.anInt2279;
						Static155.method2392(local827);
					}
				} else if (local93 == 9) {
					local827 = Static75.method1287(local95);
					if (local697.anInt2282 != local827.anInt3575 || local827.anInt3629 != local697.anInt2279) {
						local827.anInt3575 = local697.anInt2282;
						local827.anInt3629 = local697.anInt2279;
						Static155.method2392(local827);
					}
				} else if (local93 == 10) {
					local827 = Static75.method1287(local95);
					if (local827.anInt3622 != local697.anInt2282 || local697.anInt2279 != local827.anInt3549 || local697.anInt2274 != local827.anInt3634) {
						local827.anInt3634 = local697.anInt2274;
						local827.anInt3622 = local697.anInt2282;
						local827.anInt3549 = local697.anInt2279;
						Static155.method2392(local827);
					}
				} else if (local93 == 11) {
					local827 = Static75.method1287(local95);
					local827.anInt3593 = local827.anInt3568 = local697.anInt2279;
					local827.anInt3594 = local827.anInt3562 = local697.anInt2282;
					local827.aByte16 = 0;
					local827.aByte19 = 0;
					Static155.method2392(local827);
				} else if (local93 == 12) {
					local827 = Static75.method1287(local95);
					local138 = local697.anInt2282;
					if (local827 != null && local827.anInt3570 == 0) {
						if (local827.anInt3600 - local827.anInt3595 < local138) {
							local138 = local827.anInt3600 - local827.anInt3595;
						}
						if (local138 < 0) {
							local138 = 0;
						}
						if (local138 != local827.anInt3628) {
							local827.anInt3628 = local138;
							Static155.method2392(local827);
						}
					}
				} else if (local93 == 13) {
					local827 = Static75.method1287(local95);
					local827.anInt3636 = local697.anInt2282;
				}
			}
		}
		if (Static122.anInt2367 != 0) {
			Static63.anInt1290 += 20;
			if (Static63.anInt1290 >= 400) {
				Static122.anInt2367 = 0;
			}
		}
		Static47.anInt5866++;
		if (Static103.aClass127_6 != null) {
			Static123.anInt2370++;
			if (Static123.anInt2370 >= 15) {
				Static155.method2392(Static103.aClass127_6);
				Static103.aClass127_6 = null;
			}
		}
		@Pc(1354) Class127 local1354;
		if (Static284.aClass127_16 != null) {
			Static155.method2392(Static284.aClass127_16);
			if (Static224.anInt4700 > Static173.anInt3177 + 5 || Static173.anInt3177 - 5 > Static224.anInt4700 || Static293.anInt5833 > Static276.anInt5532 + 5 || Static293.anInt5833 < Static276.anInt5532 - 5) {
				Static30.aBoolean62 = true;
			}
			Static236.anInt4923++;
			if (Static211.anInt959 == 0) {
				if (Static30.aBoolean62 && Static236.anInt4923 >= 5) {
					if (Static284.aClass127_16 == Static256.aClass127_11 && Static126.anInt2412 != Static187.anInt3509) {
						local1354 = Static284.aClass127_16;
						@Pc(1356) byte local1356 = 0;
						if (Static207.anInt4127 == 1 && local1354.anInt3566 == 206) {
							local1356 = 1;
						}
						if (local1354.anIntArray415[Static126.anInt2412] <= 0) {
							local1356 = 0;
						}
						if (Static43.method794(local1354).method4340()) {
							local117 = Static187.anInt3509;
							local138 = Static126.anInt2412;
							local1354.anIntArray415[local138] = local1354.anIntArray415[local117];
							local1354.anIntArray422[local138] = local1354.anIntArray422[local117];
							local1354.anIntArray415[local117] = -1;
							local1354.anIntArray422[local117] = 0;
						} else if (local1356 == 1) {
							local138 = Static126.anInt2412;
							local117 = Static187.anInt3509;
							while (local117 != local138) {
								if (local117 > local138) {
									local1354.method2845(local117 - 1, local117);
									local117--;
								} else if (local138 > local117) {
									local1354.method2845(local117 + 1, local117);
									local117++;
								}
							}
						} else {
							local1354.method2845(Static126.anInt2412, Static187.anInt3509);
						}
						Static270.aClass1_Sub18_Sub1_3.method3130(203);
						Static270.aClass1_Sub18_Sub1_3.method3110(local1356);
						Static270.aClass1_Sub18_Sub1_3.method3100(Static126.anInt2412);
						Static270.aClass1_Sub18_Sub1_3.method3089(Static187.anInt3509);
						Static270.aClass1_Sub18_Sub1_3.method3106(Static284.aClass127_16.anInt3574);
					}
				} else if ((Static276.anInt5540 == 1 || Static150.method2339(Static29.anInt626 - 1)) && Static29.anInt626 > 2) {
					Static167.method2549();
				} else if (Static29.anInt626 > 0) {
					Static72.method1184();
				}
				Static143.anInt2663 = 0;
				Static284.aClass127_16 = null;
				Static123.anInt2370 = 10;
			}
		}
		Static261.aClass127_13 = null;
		local1354 = Static30.aClass127_1;
		Static109.aBoolean150 = false;
		Static259.aBoolean402 = false;
		Static30.aClass127_1 = null;
		@Pc(1510) Class127 local1510 = Static91.aClass127_5;
		Static91.aClass127_5 = null;
		for (Static57.anInt1183 = 0; Static64.method1059() && Static57.anInt1183 < 128; Static57.anInt1183++) {
			Static6.anIntArray21[Static57.anInt1183] = Static133.anInt2534;
			Static230.anIntArray567[Static57.anInt1183] = Static65.aChar1;
		}
		Static260.aClass127_12 = null;
		if (Static121.anInt2350 != -1) {
			Static152.method2350(Static145.anInt2690, 0, 0, 0, 0, Static166.anInt3046, Static121.anInt2350);
		}
		Static56.anInt1175++;
		while (true) {
			@Pc(1577) Class127 local1577;
			@Pc(1565) Class127 local1565;
			@Pc(1560) Class1_Sub20 local1560;
			do {
				local1560 = (Class1_Sub20) Static24.aClass69_3.method1630();
				if (local1560 == null) {
					while (true) {
						do {
							local1560 = (Class1_Sub20) Static106.aClass69_9.method1630();
							if (local1560 == null) {
								while (true) {
									do {
										local1560 = (Class1_Sub20) Static27.aClass69_4.method1630();
										if (local1560 == null) {
											if (Static260.aClass127_12 == null) {
												Static33.anInt720 = 0;
											}
											if (Static108.aClass127_7 != null) {
												Static207.method3230();
											}
											if (Static95.anInt1824 > 0 && Static246.aBooleanArray15[82] && Static246.aBooleanArray15[81] && Static286.anInt5073 != 0) {
												local117 = Static159.anInt2978 - Static286.anInt5073;
												if (local117 < 0) {
													local117 = 0;
												} else if (local117 > 3) {
													local117 = 3;
												}
												Static138.method2187(local117, Static28.aClass6_Sub6_Sub2_1.anIntArray519[0] + Static224.anInt4695, Static158.anInt2961 + Static28.aClass6_Sub6_Sub2_1.anIntArray516[0]);
											}
											if (Static95.anInt1824 > 0 && Static246.aBooleanArray15[82] && Static246.aBooleanArray15[81]) {
												if (Static186.anInt3478 != -1) {
													Static138.method2187(Static159.anInt2978, Static224.anInt4695 + Static186.anInt3478, Static158.anInt2961 - -Static228.anInt4527);
												}
												Static242.anInt4996 = 0;
												Static121.anInt2351 = 0;
											} else if (Static121.anInt2351 == 2) {
												if (Static186.anInt3478 != -1) {
													Static270.aClass1_Sub18_Sub1_3.method3130(135);
													Static270.aClass1_Sub18_Sub1_3.method3102(Static224.anInt4695 + Static186.anInt3478);
													Static270.aClass1_Sub18_Sub1_3.method3089(Static278.anInt5569);
													Static270.aClass1_Sub18_Sub1_3.method3119(Static197.anInt3818);
													Static270.aClass1_Sub18_Sub1_3.method3089(Static228.anInt4527 + Static158.anInt2961);
													Static63.anInt1290 = 0;
													Static122.anInt2367 = 1;
													Static220.anInt4583 = Static72.anInt1427;
													Static102.anInt1931 = Static207.anInt4122;
												}
												Static121.anInt2351 = 0;
											} else if (Static242.anInt4996 == 2) {
												if (Static186.anInt3478 != -1) {
													Static270.aClass1_Sub18_Sub1_3.method3130(166);
													Static270.aClass1_Sub18_Sub1_3.method3089(Static158.anInt2961 + Static228.anInt4527);
													Static270.aClass1_Sub18_Sub1_3.method3102(Static224.anInt4695 + Static186.anInt3478);
													Static220.anInt4583 = Static72.anInt1427;
													Static102.anInt1931 = Static207.anInt4122;
													Static122.anInt2367 = 1;
													Static63.anInt1290 = 0;
												}
												Static242.anInt4996 = 0;
											} else if (Static186.anInt3478 != -1 && Static121.anInt2351 == 0 && Static242.anInt4996 == 0) {
												Static11.method229(0, (Static186.anInt3478 << 1) - (Static28.aClass6_Sub6_Sub2_1.method3509() - 1) >> 1, (Static228.anInt4527 << 1) + 1 - Static28.aClass6_Sub6_Sub2_1.method3509() >> 1);
												Static63.anInt1290 = 0;
												Static102.anInt1931 = Static207.anInt4122;
												Static220.anInt4583 = Static72.anInt1427;
												Static122.anInt2367 = 1;
											}
											Static186.anInt3478 = -1;
											Static238.method3762();
											if (Static30.aClass127_1 != local1354) {
												if (local1354 != null) {
													Static155.method2392(local1354);
												}
												if (Static30.aClass127_1 != null) {
													Static155.method2392(Static30.aClass127_1);
												}
											}
											if (local1510 != Static91.aClass127_5 && Static238.anInt4934 == Static119.anInt4994) {
												if (local1510 != null) {
													Static155.method2392(local1510);
												}
												if (Static91.aClass127_5 != null) {
													Static155.method2392(Static91.aClass127_5);
												}
											}
											if (Static91.aClass127_5 == null) {
												if (Static238.anInt4934 > 0) {
													Static238.anInt4934--;
												}
											} else if (Static238.anInt4934 < Static119.anInt4994) {
												Static238.anInt4934++;
												if (Static119.anInt4994 == Static238.anInt4934) {
													Static155.method2392(Static91.aClass127_5);
												}
											}
											for (local117 = 0; local117 < 5; local117++) {
												@Pc(2028) int local2028 = Static227.anIntArray556[local117]++;
											}
											local117 = Static267.method4105();
											local138 = Static90.method3588();
											if (local117 > 15000 && local138 > 15000) {
												Static103.anInt1940 = 250;
												Static156.method1494(14500);
												Static270.aClass1_Sub18_Sub1_3.method3130(60);
											}
											if (Static19.aClass118_3 != null && Static19.aClass118_3.anInt3187 == 1) {
												if (Static19.aClass118_3.anObject3 != null) {
													Static163.method3583(Static112.aString65, Static173.aBoolean239);
												}
												Static112.aString65 = null;
												Static19.aClass118_3 = null;
												Static173.aBoolean239 = false;
											}
											Static3.anInt139++;
											Static247.anInt5041++;
											Static116.anInt2213++;
											if (Static116.anInt2213 > 500) {
												Static116.anInt2213 = 0;
												local759 = (int) (Math.random() * 8.0D);
												if ((local759 & 0x2) == 2) {
													Static103.anInt1938 += Static1.anInt3;
												}
												if ((local759 & 0x4) == 4) {
													Static156.anInt1708 += Static268.anInt5353;
												}
												if ((local759 & 0x1) == 1) {
													Static276.anInt5541 += Static299.anInt5911;
												}
											}
											if (Static276.anInt5541 < -50) {
												Static299.anInt5911 = 2;
											}
											if (Static156.anInt1708 < -40) {
												Static268.anInt5353 = 1;
											}
											if (Static247.anInt5041 > 500) {
												local759 = (int) (Math.random() * 8.0D);
												if ((local759 & 0x1) == 1) {
													Static35.anInt746 += Static1.anInt2;
												}
												Static247.anInt5041 = 0;
												if ((local759 & 0x2) == 2) {
													Static155.anInt2868 += Static198.anInt3846;
												}
											}
											if (Static276.anInt5541 > 50) {
												Static299.anInt5911 = -2;
											}
											if (Static156.anInt1708 > 40) {
												Static268.anInt5353 = -1;
											}
											if (Static35.anInt746 < -60) {
												Static1.anInt2 = 2;
											}
											if (Static35.anInt746 > 60) {
												Static1.anInt2 = -2;
											}
											if (Static103.anInt1938 < -55) {
												Static1.anInt3 = 2;
											}
											if (Static103.anInt1938 > 55) {
												Static1.anInt3 = -2;
											}
											if (Static155.anInt2868 < -20) {
												Static198.anInt3846 = 1;
											}
											if (Static155.anInt2868 > 10) {
												Static198.anInt3846 = -1;
											}
											if (Static3.anInt139 > 50) {
												Static270.aClass1_Sub18_Sub1_3.method3130(183);
											}
											if (Static92.aBoolean131) {
												Static234.method3735();
												Static92.aBoolean131 = false;
											}
											try {
												if (Static155.aClass73_3 != null && Static270.aClass1_Sub18_Sub1_3.anInt3911 > 0) {
													Static155.aClass73_3.method1685(Static270.aClass1_Sub18_Sub1_3.anInt3911, Static270.aClass1_Sub18_Sub1_3.aByteArray71);
													Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
													Static3.anInt139 = 0;
												}
											} catch (@Pc(2281) IOException local2281) {
												Static276.method4249();
											}
											return;
										}
										local1565 = local1560.aClass127_9;
										if (local1565.anInt3573 < 0) {
											break;
										}
										local1577 = Static75.method1287(local1565.anInt3563);
									} while (local1577 == null || local1577.aClass127Array1 == null || local1565.anInt3573 >= local1577.aClass127Array1.length || local1577.aClass127Array1[local1565.anInt3573] != local1565);
									Static283.method4321(local1560);
								}
							}
							local1565 = local1560.aClass127_9;
							if (local1565.anInt3573 < 0) {
								break;
							}
							local1577 = Static75.method1287(local1565.anInt3563);
						} while (local1577 == null || local1577.aClass127Array1 == null || local1577.aClass127Array1.length <= local1565.anInt3573 || local1565 != local1577.aClass127Array1[local1565.anInt3573]);
						Static283.method4321(local1560);
					}
				}
				local1565 = local1560.aClass127_9;
				if (local1565.anInt3573 < 0) {
					break;
				}
				local1577 = Static75.method1287(local1565.anInt3563);
			} while (local1577 == null || local1577.aClass127Array1 == null || local1577.aClass127Array1.length <= local1565.anInt3573 || local1565 != local1577.aClass127Array1[local1565.anInt3573]);
			Static283.method4321(local1560);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
	public static void method1663() {
		Static214.aClass31_34.method856(5);
		Static185.aClass31_27.method856(5);
		Static212.aClass31_38.method856(5);
		Static100.aClass31_16.method856(5);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)V")
	public static void method1664(@OriginalArg(1) boolean arg0) {
		for (@Pc(14) Class1_Sub6 local14 = (Class1_Sub6) Static261.aClass69_26.method1636(); local14 != null; local14 = (Class1_Sub6) Static261.aClass69_26.method1631()) {
			if (local14.aClass1_Sub8_Sub1_1 != null) {
				Static28.aClass1_Sub8_Sub3_1.method2409(local14.aClass1_Sub8_Sub1_1);
				local14.aClass1_Sub8_Sub1_1 = null;
			}
			if (local14.aClass1_Sub8_Sub1_2 != null) {
				Static28.aClass1_Sub8_Sub3_1.method2409(local14.aClass1_Sub8_Sub1_2);
				local14.aClass1_Sub8_Sub1_2 = null;
			}
			local14.method4534();
		}
		if (!arg0) {
			return;
		}
		@Pc(60) Class1_Sub6 local60;
		for (local60 = (Class1_Sub6) Static196.aClass69_22.method1636(); local60 != null; local60 = (Class1_Sub6) Static196.aClass69_22.method1631()) {
			if (local60.aClass1_Sub8_Sub1_1 != null) {
				Static28.aClass1_Sub8_Sub3_1.method2409(local60.aClass1_Sub8_Sub1_1);
				local60.aClass1_Sub8_Sub1_1 = null;
			}
			local60.method4534();
		}
		for (local60 = (Class1_Sub6) Static94.aClass22_10.method640(); local60 != null; local60 = (Class1_Sub6) Static94.aClass22_10.method637()) {
			if (local60.aClass1_Sub8_Sub1_1 != null) {
				Static28.aClass1_Sub8_Sub3_1.method2409(local60.aClass1_Sub8_Sub1_1);
				local60.aClass1_Sub8_Sub1_1 = null;
			}
			local60.method4534();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLclient!jj;)Lclient!ph;")
	public static Class35_Sub3 method1665(@OriginalArg(1) Class1_Sub18 arg0) {
		return new Class35_Sub3(arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3109(), arg0.method3122());
	}
}
