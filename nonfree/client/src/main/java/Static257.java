import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "[I")
	public static final int[] anIntArray327 = new int[25];

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_71 = new Class194(67, 8);

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!nj;")
	public static final Class172 aClass172_2 = new Class172("WIP", 2);

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "Z")
	public static boolean aBoolean275 = false;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!za;BLclient!um;)V")
	public static void method3314(@OriginalArg(0) Class200 arg0, @OriginalArg(2) Class243 arg1) {
		@Pc(10) Class214[] local10 = Static470.method4679(arg1, Static17.anInt368);
		Static217.aClass49Array7 = new Class49[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static217.aClass49Array7[local16] = arg0.method5871(local10[local16]);
		}
		local10 = Static470.method4679(arg1, Static442.anInt7326);
		Static219.aClass49Array8 = new Class49[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static219.aClass49Array8[local47] = arg0.method5871(local10[local47]);
		}
		local10 = Static470.method4679(arg1, Static43.anInt5303);
		Static5.aClass49Array1 = new Class49[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static5.aClass49Array1[local74] = arg0.method5871(local10[local74]);
		}
		local10 = Static470.method4679(arg1, Static363.anInt5901);
		Static394.aClass49Array12 = new Class49[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static394.aClass49Array12[local105] = arg0.method5871(local10[local105]);
		}
		local10 = Static470.method4679(arg1, Static225.anInt3735);
		Static102.aClass49Array4 = new Class49[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static102.aClass49Array4[local132] = arg0.method5871(local10[local132]);
		}
		local10 = Static470.method4679(arg1, Static419.anInt6978);
		Static278.aClass49Array10 = new Class49[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static278.aClass49Array10[local163] = arg0.method5871(local10[local163]);
		}
		local10 = Static470.method4679(arg1, Static319.anInt4968);
		Static49.aClass49Array3 = new Class49[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static49.aClass49Array3[local194] = arg0.method5871(local10[local194]);
		}
		local10 = Static470.method4679(arg1, Static451.anInt7415);
		Static112.aClass49Array6 = new Class49[local10.length];
		for (@Pc(221) int local221 = 0; local221 < local10.length; local221++) {
			Static112.aClass49Array6[local221] = arg0.method5871(local10[local221]);
		}
		local10 = Static470.method4679(arg1, Static462.anInt7532);
		Static269.aClass49Array9 = new Class49[local10.length];
		for (@Pc(252) int local252 = 0; local252 < local10.length; local252++) {
			Static269.aClass49Array9[local252] = arg0.method5871(local10[local252]);
		}
		local10 = Static470.method4679(arg1, Static246.anInt3975);
		Static454.aClass49Array14 = new Class49[local10.length];
		for (@Pc(279) int local279 = 0; local279 < local10.length; local279++) {
			Static454.aClass49Array14[local279] = arg0.method5871(local10[local279]);
		}
		local10 = Static470.method4679(arg1, Static265.anInt4221);
		Static435.aClass49Array13 = new Class49[local10.length];
		for (@Pc(310) int local310 = 0; local310 < local10.length; local310++) {
			Static435.aClass49Array13[local310] = arg0.method5871(local10[local310]);
		}
		local10 = Static470.method4679(arg1, Static91.anInt1609);
		Static107.aClass49Array5 = new Class49[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static107.aClass49Array5[local337] = arg0.method5871(local10[local337]);
		}
		Static429.aClass49_24 = arg0.method5871(Static470.method4672(arg1, Static256.anInt4161, 0));
		Static18.aClass49_1 = arg0.method5871(Static470.method4672(arg1, Static214.anInt3566, 0));
		local10 = Static470.method4679(arg1, Static391.anInt6412);
		Static44.aClass49Array2 = new Class49[local10.length];
		for (@Pc(380) int local380 = 0; local380 < local10.length; local380++) {
			Static44.aClass49Array2[local380] = arg0.method5871(local10[local380]);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	public static void method3318() {
		if (Static227.anInt3788 > 1) {
			Static227.anInt3788--;
			Static460.anInt7523 = Static319.anInt4969;
		}
		if (Static419.aBoolean470) {
			Static419.aBoolean470 = false;
			Static152.method2174();
			return;
		}
		if (!Static272.aBoolean283) {
			Static2.method6028();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static280.method3471(); local29++) {
		}
		if (Static376.anInt6324 != 9) {
			return;
		}
		Static240.method5503(Static368.aClass194_98.method3978(), Static281.aClass5_Sub15_Sub2_13);
		if (Static332.aClass5_Sub10_2 == null) {
			if (Static446.method5903() >= Static379.aLong134) {
				Static332.aClass5_Sub10_2 = Static175.aClass140_2.method2905(Static239.aClass165_7.aString50);
			}
		} else if (Static332.aClass5_Sub10_2.anInt1414 != -1) {
			Static288.method3576(Static453.aClass194_102);
			Static281.aClass5_Sub15_Sub2_13.method5566(Static332.aClass5_Sub10_2.anInt1414);
			Static332.aClass5_Sub10_2 = null;
			Static379.aLong134 = Static446.method5903() + 30000L;
		}
		@Pc(94) Class5_Sub4 local94 = (Class5_Sub4) Static362.aClass177_33.method3618();
		@Pc(131) int local131;
		@Pc(155) int local155;
		@Pc(171) boolean local171;
		@Pc(220) int local220;
		@Pc(227) int local227;
		@Pc(239) int local239;
		if (local94 != null || Static446.method5903() - 2000L > Static351.aLong176) {
			@Pc(105) boolean local105 = false;
			@Pc(108) int local108 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
			for (@Pc(113) Class5_Sub4 local113 = (Class5_Sub4) Static444.aClass177_49.method3618(); local113 != null && Static281.aClass5_Sub15_Sub2_13.anInt7013 - local108 < 240; local113 = (Class5_Sub4) Static444.aClass177_49.method3619()) {
				local113.method6003();
				local131 = local113.method3833();
				if (local131 < 0) {
					local131 = 0;
				} else if (local131 > 65534) {
					local131 = 65534;
				}
				local155 = local113.method3837();
				if (local155 < 0) {
					local155 = 0;
				} else if (local155 > 65534) {
					local155 = 65534;
				}
				local171 = false;
				if (local113.method3833() == -1 && local113.method3837() == -1) {
					local131 = -1;
					local171 = true;
					local155 = -1;
				}
				if (local155 != Static252.anInt4104 || Static60.anInt1115 != local131) {
					if (!local105) {
						Static288.method3576(Static449.aClass194_121);
						Static281.aClass5_Sub15_Sub2_13.method5583(0);
						local105 = true;
						local108 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
					}
					local220 = local155 - Static252.anInt4104;
					Static252.anInt4104 = local155;
					local227 = local131 - Static60.anInt1115;
					Static60.anInt1115 = local131;
					local239 = (int) ((local113.method3835() - Static351.aLong176) / 20L);
					if (local239 < 8 && local220 >= -32 && local220 <= 31 && local227 >= -32 && local227 <= 31) {
						local220 += 32;
						local227 += 32;
						Static281.aClass5_Sub15_Sub2_13.method5566((local220 << 6) + (local239 << 12) + local227);
					} else if (local239 < 32 && local220 >= -128 && local220 <= 127 && local227 >= -128 && local227 <= 127) {
						local220 += 128;
						Static281.aClass5_Sub15_Sub2_13.method5583(local239 + 128);
						local227 += 128;
						Static281.aClass5_Sub15_Sub2_13.method5566((local220 << 8) + local227);
					} else if (local239 < 32) {
						Static281.aClass5_Sub15_Sub2_13.method5583(local239 + 192);
						if (local171) {
							Static281.aClass5_Sub15_Sub2_13.method5550(Integer.MIN_VALUE);
						} else {
							Static281.aClass5_Sub15_Sub2_13.method5550(local131 << 16 | local155);
						}
					} else {
						Static281.aClass5_Sub15_Sub2_13.method5566(local239 + 57344);
						if (local171) {
							Static281.aClass5_Sub15_Sub2_13.method5550(Integer.MIN_VALUE);
						} else {
							Static281.aClass5_Sub15_Sub2_13.method5550(local155 | local131 << 16);
						}
					}
					Static351.aLong176 = local113.method3835();
				}
			}
			if (local105) {
				Static281.aClass5_Sub15_Sub2_13.method5556(Static281.aClass5_Sub15_Sub2_13.anInt7013 - local108);
			}
		}
		@Pc(411) int local411;
		@Pc(460) int local460;
		if (local94 != null) {
			@Pc(395) long local395 = (local94.method3835() - Static150.aLong88) / 50L;
			if (local395 > 32767L) {
				local395 = 32767L;
			}
			Static150.aLong88 = local94.method3835();
			local411 = local94.method3833();
			if (local411 < 0) {
				local411 = 0;
			} else if (local411 > 65535) {
				local411 = 65535;
			}
			local131 = local94.method3837();
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 65535) {
				local131 = 65535;
			}
			@Pc(441) byte local441 = 0;
			if (local94.method3834() == 2) {
				local441 = 1;
			}
			Static288.method3576(Static393.aClass194_72);
			local460 = (int) local395;
			Static281.aClass5_Sub15_Sub2_13.method5561(local411 << 16 | local131);
			Static281.aClass5_Sub15_Sub2_13.method5588(local460 | local441 << 15);
		}
		@Pc(496) int local496;
		if (Static409.anInt6824 > 0) {
			Static288.method3576(Static58.aClass194_15);
			Static281.aClass5_Sub15_Sub2_13.method5583(Static409.anInt6824 * 3);
			for (local496 = 0; local496 < Static409.anInt6824; local496++) {
				@Pc(502) Interface10 local502 = Static122.anInterface10Array1[local496];
				@Pc(511) long local511 = (local502.method1254() - Static240.aLong218) / 50L;
				if (local511 > 65535L) {
					local511 = 65535L;
				}
				Static240.aLong218 = local502.method1254();
				Static281.aClass5_Sub15_Sub2_13.method5583(local502.method1255());
				Static281.aClass5_Sub15_Sub2_13.method5566((int) local511);
			}
		}
		if (Static160.anInt2799 > 0) {
			Static160.anInt2799--;
		}
		if (Static324.aBoolean348 && Static160.anInt2799 <= 0) {
			Static324.aBoolean348 = false;
			Static160.anInt2799 = 20;
			Static288.method3576(Static236.aClass194_65);
			Static281.aClass5_Sub15_Sub2_13.method5566((int) Static10.aFloat7 >> 3);
			Static281.aClass5_Sub15_Sub2_13.method5564((int) Static99.aFloat33 >> 3);
		}
		if (Static68.aBoolean96 && !Static264.aBoolean277) {
			Static264.aBoolean277 = true;
			Static288.method3576(Static211.aClass194_57);
			Static281.aClass5_Sub15_Sub2_13.method5583(1);
		}
		if (!Static68.aBoolean96 && Static264.aBoolean277) {
			Static264.aBoolean277 = false;
			Static288.method3576(Static211.aClass194_57);
			Static281.aClass5_Sub15_Sub2_13.method5583(0);
		}
		if (!Static81.aBoolean103) {
			Static288.method3576(Static215.aClass194_59);
			Static281.aClass5_Sub15_Sub2_13.method5583(0);
			local496 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
			@Pc(644) Class5_Sub15 local644 = Static216.aClass1_Sub1_1.method3594();
			Static281.aClass5_Sub15_Sub2_13.method5557(local644.anInt7013, local644.aByteArray93);
			Static281.aClass5_Sub15_Sub2_13.method5556(Static281.aClass5_Sub15_Sub2_13.anInt7013 - local496);
			Static81.aBoolean103 = true;
		}
		if (Static319.aClass258ArrayArrayArray3 != null) {
			if (Static449.anInt7379 == 2) {
				Static313.method4881();
			} else if (Static449.anInt7379 == 3) {
				Static143.method2067();
			}
		}
		if (Static309.aBoolean335) {
			Static309.aBoolean335 = false;
		} else {
			Static346.aFloat136 /= 2.0F;
		}
		if (Static406.aBoolean456) {
			Static406.aBoolean456 = false;
		} else {
			Static405.aFloat177 /= 2.0F;
		}
		Static205.method2741();
		if (Static376.anInt6324 != 9) {
			return;
		}
		Static268.method3384();
		Static444.method5901();
		Static331.method4085();
		Static369.method4830();
		Static299.anInt4665++;
		if (Static299.anInt4665 > 750) {
			Static152.method2174();
			return;
		}
		Static171.method2362();
		Static245.method3168();
		Static249.method3199();
		for (local496 = Static408.aClass39_1.method967(true); local496 != -1; local496 = Static408.aClass39_1.method967(false)) {
			Static71.method6004(local496);
			Static68.anIntArray61[Static27.anInt552++ & 0x1F] = local496;
		}
		@Pc(811) Class76 local811;
		for (@Pc(763) Class5_Sub2_Sub9 local763 = Static288.method3575(); local763 != null; local763 = Static288.method3575()) {
			local411 = local763.method3023();
			local131 = local763.method3027();
			if (local411 == 1) {
				Static174.anIntArray171[local131] = local763.anInt3818;
				Static264.aBoolean278 |= Static14.aBooleanArray2[local131];
				Static117.anIntArray478[Static209.anInt3500++ & 0x1F] = local131;
			} else if (local411 == 2) {
				Static124.aStringArray15[local131] = local763.aString42;
				Static263.anIntArray331[Static202.anInt3344++ & 0x1F] = local131;
			} else if (local411 == 3) {
				local811 = Static213.method2817(local131);
				if (!local763.aString42.equals(local811.aString19)) {
					local811.aString19 = local763.aString42;
					Static53.method833(local811);
				}
			} else if (local411 == 4) {
				local811 = Static213.method2817(local131);
				local460 = local763.anInt3818;
				local220 = local763.anInt3826;
				local227 = local763.anInt3821;
				if (local460 != local811.anInt2134 || local220 != local811.anInt2053 || local811.anInt2129 != local227) {
					local811.anInt2053 = local220;
					local811.anInt2129 = local227;
					local811.anInt2134 = local460;
					Static53.method833(local811);
				}
			} else if (local411 == 5) {
				local811 = Static213.method2817(local131);
				if (local763.anInt3818 != local811.anInt2084 || local763.anInt3818 == -1) {
					local811.anInt2051 = 1;
					local811.anInt2064 = 0;
					local811.anInt2084 = local763.anInt3818;
					local811.anInt2050 = 0;
					Static53.method833(local811);
				}
			} else if (local411 == 6) {
				local155 = local763.anInt3818;
				local460 = local155 >> 10 & 0x1F;
				local220 = local155 >> 5 & 0x1F;
				local227 = local155 & 0x1F;
				local239 = (local227 << 3) + (local460 << 19) + (local220 << 11);
				@Pc(1275) Class76 local1275 = Static213.method2817(local131);
				if (local1275.anInt2054 != local239) {
					local1275.anInt2054 = local239;
					Static53.method833(local1275);
				}
			} else if (local411 == 7) {
				local811 = Static213.method2817(local131);
				local171 = local763.anInt3818 == 1;
				if (local811.aBoolean143 != local171) {
					local811.aBoolean143 = local171;
					Static53.method833(local811);
				}
			} else if (local411 == 8) {
				local811 = Static213.method2817(local131);
				if (local763.anInt3818 != local811.anInt2093 || local811.anInt2117 != local763.anInt3826 || local763.anInt3821 != local811.anInt2137) {
					local811.anInt2117 = local763.anInt3826;
					local811.anInt2093 = local763.anInt3818;
					local811.anInt2137 = local763.anInt3821;
					if (local811.anInt2057 != -1) {
						if (local811.anInt2095 > 0) {
							local811.anInt2137 = local811.anInt2137 * 32 / local811.anInt2095;
						} else if (local811.anInt2075 > 0) {
							local811.anInt2137 = local811.anInt2137 * 32 / local811.anInt2075;
						}
					}
					Static53.method833(local811);
				}
			} else if (local411 == 9) {
				local811 = Static213.method2817(local131);
				if (local763.anInt3818 != local811.anInt2057 || local763.anInt3826 != local811.anInt2125) {
					local811.anInt2125 = local763.anInt3826;
					local811.anInt2057 = local763.anInt3818;
					Static53.method833(local811);
				}
			} else if (local411 == 10) {
				local811 = Static213.method2817(local131);
				if (local811.anInt2092 != local763.anInt3818 || local811.anInt2078 != local763.anInt3826 || local763.anInt3821 != local811.anInt2069) {
					local811.anInt2092 = local763.anInt3818;
					local811.anInt2069 = local763.anInt3821;
					local811.anInt2078 = local763.anInt3826;
					Static53.method833(local811);
				}
			} else if (local411 == 11) {
				local811 = Static213.method2817(local131);
				local811.aByte20 = 0;
				local811.aByte18 = 0;
				local811.anInt2079 = local811.anInt2102 = local763.anInt3826;
				local811.anInt2126 = local811.anInt2071 = local763.anInt3818;
				Static53.method833(local811);
			} else if (local411 == 12) {
				local811 = Static213.method2817(local131);
				local460 = local763.anInt3818;
				if (local811 != null && local811.anInt2060 == 0) {
					if (local811.anInt2114 - local811.anInt2106 < local460) {
						local460 = local811.anInt2114 - local811.anInt2106;
					}
					if (local460 < 0) {
						local460 = 0;
					}
					if (local460 != local811.anInt2061) {
						local811.anInt2061 = local460;
						Static53.method833(local811);
					}
				}
			} else if (local411 == 14) {
				local811 = Static213.method2817(local131);
				local811.anInt2130 = local763.anInt3818;
			} else if (local411 == 15) {
				Static209.anInt3498 = local763.anInt3826;
				Static375.aBoolean416 = true;
				Static453.anInt6195 = local763.anInt3818;
			} else if (local411 == 16) {
				local811 = Static213.method2817(local131);
				local811.anInt2131 = local763.anInt3818;
			}
		}
		Static173.anInt2946++;
		if (Static133.anInt2318 != 0) {
			Static190.anInt3182 += 20;
			if (Static190.anInt3182 >= 400) {
				Static133.anInt2318 = 0;
			}
		}
		if (Static78.aClass76_10 != null) {
			Static285.anInt4433++;
			if (Static285.anInt4433 >= 15) {
				Static53.method833(Static78.aClass76_10);
				Static78.aClass76_10 = null;
			}
		}
		Static240.aBoolean469 = false;
		Static161.aClass76_6 = null;
		Static22.aClass76_2 = null;
		Static320.aBoolean344 = false;
		Static348.method4520(-1, -1, null);
		Static277.method3449(-1, -1, null);
		if (!Static423.aBoolean478) {
			Static333.anInt5333 = -1;
		}
		Static233.method3037();
		Static319.anInt4969++;
		if (Static199.aBoolean211) {
			Static288.method3576(Static397.aClass194_110);
			Static281.aClass5_Sub15_Sub2_13.method5597(Static34.anInt672 | Static353.anInt5761 << 28 | Static164.anInt2787 << 14);
			Static199.aBoolean211 = false;
		}
		while (true) {
			@Pc(1399) Class5_Sub33 local1399;
			@Pc(1404) Class76 local1404;
			do {
				local1399 = (Class5_Sub33) Static374.aClass177_34.method3621();
				if (local1399 == null) {
					while (true) {
						do {
							local1399 = (Class5_Sub33) Static293.aClass177_29.method3621();
							if (local1399 == null) {
								while (true) {
									do {
										local1399 = (Class5_Sub33) Static250.aClass177_26.method3621();
										if (local1399 == null) {
											if (Static22.aClass76_2 == null) {
												Static151.anInt7436 = 0;
											}
											if (Static387.aClass76_14 != null) {
												Static452.method5945();
											}
											if (Static189.anInt3178 > 0 && Static188.aClass80_1.method1723(82) && Static188.aClass80_1.method1723(81) && Static104.anInt1776 != 0) {
												local411 = Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 - Static104.anInt1776;
												if (local411 < 0) {
													local411 = 0;
												} else if (local411 > 3) {
													local411 = 3;
												}
												Static16.method275(Static226.anInt3768 + Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray433[0], Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray434[0] + Static31.anInt618, local411);
											}
											Static459.method3789();
											for (local411 = 0; local411 < 5; local411++) {
												@Pc(1598) int local1598 = Static47.anIntArray42[local411]++;
											}
											if (Static264.aBoolean278 && Static446.method5903() - 60000L > Static458.aLong236) {
												Static299.method3711();
											}
											for (@Pc(1625) Class88_Sub1_Sub2 local1625 = (Class88_Sub1_Sub2) Static27.aClass107_3.method2326(); local1625 != null; local1625 = (Class88_Sub1_Sub2) Static27.aClass107_3.method2327()) {
												if ((long) local1625.anInt3884 < Static446.method5903() / 1000L - 5L) {
													if (local1625.aShort42 > 0) {
														Static44.method702("", local1625.aString44 + Static46.aClass198_27.method4012(Static38.anInt4834), 5, 0, "");
													}
													if (local1625.aShort42 == 0) {
														Static44.method702("", local1625.aString44 + Static451.aClass198_126.method4012(Static38.anInt4834), 5, 0, "");
													}
													local1625.method5917();
												}
											}
											Static37.anInt727++;
											if (Static37.anInt727 > 500) {
												Static37.anInt727 = 0;
												local155 = (int) (Math.random() * 8.0D);
												if ((local155 & 0x4) == 4) {
													Static185.anInt3145 += Static253.anInt4109;
												}
												if ((local155 & 0x1) == 1) {
													Static417.anInt6956 += Static43.anInt5304;
												}
												if ((local155 & 0x2) == 2) {
													Static288.anInt4500 += Static113.anInt1916;
												}
											}
											if (Static417.anInt6956 < -50) {
												Static43.anInt5304 = 2;
											}
											if (Static417.anInt6956 > 50) {
												Static43.anInt5304 = -2;
											}
											if (Static288.anInt4500 < -55) {
												Static113.anInt1916 = 2;
											}
											if (Static185.anInt3145 < -40) {
												Static253.anInt4109 = 1;
											}
											if (Static288.anInt4500 > 55) {
												Static113.anInt1916 = -2;
											}
											Static239.anInt6067++;
											if (Static185.anInt3145 > 40) {
												Static253.anInt4109 = -1;
											}
											if (Static239.anInt6067 > 500) {
												Static239.anInt6067 = 0;
												local155 = (int) (Math.random() * 8.0D);
												if ((local155 & 0x2) == 2) {
													Static430.anInt7181 += Static407.anInt6821;
												}
												if ((local155 & 0x1) == 1) {
													Static65.anInt5018 += Static110.anInt1843;
												}
											}
											if (Static65.anInt5018 < -60) {
												Static110.anInt1843 = 2;
											}
											if (Static430.anInt7181 < -20) {
												Static407.anInt6821 = 1;
											}
											if (Static65.anInt5018 > 60) {
												Static110.anInt1843 = -2;
											}
											Static324.anInt5058++;
											if (Static430.anInt7181 > 10) {
												Static407.anInt6821 = -1;
											}
											if (Static324.anInt5058 > 50) {
												Static288.method3576(Static393.aClass194_73);
											}
											if (Static297.aBoolean330) {
												Static180.method2464();
												Static297.aBoolean330 = false;
											}
											try {
												if (Static14.aClass99_2 != null && Static281.aClass5_Sub15_Sub2_13.anInt7013 > 0) {
													Static95.anInt1636 += Static281.aClass5_Sub15_Sub2_13.anInt7013;
													Static14.aClass99_2.method4964(Static281.aClass5_Sub15_Sub2_13.anInt7013, Static281.aClass5_Sub15_Sub2_13.aByteArray93);
													Static324.anInt5058 = 0;
													Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
													return;
												}
												return;
											} catch (@Pc(1890) IOException local1890) {
												Static152.method2174();
												return;
											}
										}
										local1404 = local1399.aClass76_12;
										if (local1404.anInt2115 < 0) {
											break;
										}
										local811 = Static213.method2817(local1404.anInt2112);
									} while (local811 == null || local811.aClass76Array2 == null || local811.aClass76Array2.length <= local1404.anInt2115 || local811.aClass76Array2[local1404.anInt2115] != local1404);
									Static181.method2470(local1399);
								}
							}
							local1404 = local1399.aClass76_12;
							if (local1404.anInt2115 < 0) {
								break;
							}
							local811 = Static213.method2817(local1404.anInt2112);
						} while (local811 == null || local811.aClass76Array2 == null || local1404.anInt2115 >= local811.aClass76Array2.length || local811.aClass76Array2[local1404.anInt2115] != local1404);
						Static181.method2470(local1399);
					}
				}
				local1404 = local1399.aClass76_12;
				if (local1404.anInt2115 < 0) {
					break;
				}
				local811 = Static213.method2817(local1404.anInt2112);
			} while (local811 == null || local811.aClass76Array2 == null || local811.aClass76Array2.length <= local1404.anInt2115 || local1404 != local811.aClass76Array2[local1404.anInt2115]);
			Static181.method2470(local1399);
		}
	}
}
