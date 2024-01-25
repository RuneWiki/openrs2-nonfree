import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	public static int anInt8271;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	public static int anInt8269 = -1;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
	public static int anInt8272 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([Lclient!ee;II)V")
	public static void method7068(@OriginalArg(0) Class9_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class9_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10693;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10693 < local27 + (local29 & 0x1)) {
				@Pc(44) Class9_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7068(arg0, arg1, local10 - 1);
		method7068(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public static void method7069() {
		if (Static708.anInt11107 > 1) {
			Static708.anInt11107--;
			Static365.anInt5729 = Static475.anInt7494;
		}
		if (Static95.aClass292_2.aBoolean535) {
			Static95.aClass292_2.aBoolean535 = false;
			Static526.method7028();
			return;
		}
		if (!Static530.aBoolean556) {
			Static205.method3103();
		}
		for (@Pc(42) int local42 = 0; local42 < 100 && Static414.method5528(Static95.aClass292_2); local42++) {
		}
		if (Static98.anInt2140 != 11) {
			return;
		}
		@Pc(75) Class3_Sub29 local75;
		@Pc(84) int local84;
		while (Static326.method4758()) {
			local75 = Static507.method6901(Static636.aClass144_96, Static95.aClass292_2.aClass88_2);
			local75.aClass3_Sub2_Sub1_1.method2065(0);
			local84 = local75.aClass3_Sub2_Sub1_1.anInt2178;
			Static723.method9561(local75.aClass3_Sub2_Sub1_1);
			local75.aClass3_Sub2_Sub1_1.method2057(local75.aClass3_Sub2_Sub1_1.anInt2178 - local84);
			Static95.aClass292_2.method6855(local75);
		}
		if (Static369.aClass3_Sub3_2 == null) {
			if (Static517.method6965() >= Static85.aLong68) {
				Static369.aClass3_Sub3_2 = Static417.aClass24_2.method979(Static226.aClass43_3.aString20);
			}
		} else if (Static369.aClass3_Sub3_2.anInt228 != -1) {
			local75 = Static507.method6901(Static711.aClass144_112, Static95.aClass292_2.aClass88_2);
			local75.aClass3_Sub2_Sub1_1.method2032(Static369.aClass3_Sub3_2.anInt228);
			Static95.aClass292_2.method6855(local75);
			Static369.aClass3_Sub3_2 = null;
			Static85.aLong68 = Static517.method6965() + 30000L;
		}
		@Pc(161) Class3_Sub23 local161 = (Class3_Sub23) Static114.aClass342_21.method7644();
		@Pc(180) int local180;
		@Pc(205) int local205;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(288) int local288;
		@Pc(299) int local299;
		@Pc(178) Class3_Sub29 local178;
		if (local161 != null || Static630.aLong311 < Static517.method6965() - 2000L) {
			local178 = null;
			local180 = 0;
			for (@Pc(185) Class3_Sub23 local185 = (Class3_Sub23) Static10.aClass342_1.method7644(); local185 != null && (local178 == null || local178.aClass3_Sub2_Sub1_1.anInt2178 - local180 < 240); local185 = (Class3_Sub23) Static10.aClass342_1.method7650()) {
				local185.method9596();
				local205 = local185.method3196();
				if (local205 < -1) {
					local205 = -1;
				} else if (local205 > 65534) {
					local205 = 65534;
				}
				local226 = local185.method3197();
				if (local226 < -1) {
					local226 = -1;
				} else if (local226 > 65534) {
					local226 = 65534;
				}
				if (local226 != Static34.anInt1179 || Static633.anInt9755 != local205) {
					if (local178 == null) {
						local178 = Static507.method6901(Static275.aClass144_54, Static95.aClass292_2.aClass88_2);
						local178.aClass3_Sub2_Sub1_1.method2065(0);
						local180 = local178.aClass3_Sub2_Sub1_1.anInt2178;
					}
					local282 = local226 - Static34.anInt1179;
					Static34.anInt1179 = local226;
					local288 = local205 - Static633.anInt9755;
					Static633.anInt9755 = local205;
					local299 = (int) ((local185.method3199() - Static630.aLong311) / 20L);
					if (local299 < 8 && local282 >= -32 && local282 <= 31 && local288 >= -32 && local288 <= 31) {
						local288 += 32;
						local282 += 32;
						local178.aClass3_Sub2_Sub1_1.method2032((local282 << 6) + (local299 << 12) + local288);
					} else if (local299 < 32 && local282 >= -128 && local282 <= 127 && local288 >= -128 && local288 <= 127) {
						local288 += 128;
						local178.aClass3_Sub2_Sub1_1.method2065(local299 + 128);
						local282 += 128;
						local178.aClass3_Sub2_Sub1_1.method2032((local282 << 8) + local288);
					} else if (local299 < 32) {
						local178.aClass3_Sub2_Sub1_1.method2065(local299 + 192);
						if (local226 == 1 || local205 == -1) {
							local178.aClass3_Sub2_Sub1_1.method2018(Integer.MIN_VALUE);
						} else {
							local178.aClass3_Sub2_Sub1_1.method2018(local226 | local205 << 16);
						}
					} else {
						local178.aClass3_Sub2_Sub1_1.method2032(local299 + 57344);
						if (local226 == 1 || local205 == -1) {
							local178.aClass3_Sub2_Sub1_1.method2018(Integer.MIN_VALUE);
						} else {
							local178.aClass3_Sub2_Sub1_1.method2018(local226 | local205 << 16);
						}
					}
					Static630.aLong311 = local185.method3199();
				}
			}
			if (local178 != null) {
				local178.aClass3_Sub2_Sub1_1.method2057(local178.aClass3_Sub2_Sub1_1.anInt2178 - local180);
				Static95.aClass292_2.method6855(local178);
			}
		}
		@Pc(552) int local552;
		if (local161 != null) {
			@Pc(538) long local538 = (local161.method3199() - Static26.aLong23) / 50L;
			if (local538 > 32767L) {
				local538 = 32767L;
			}
			Static26.aLong23 = local161.method3199();
			local552 = local161.method3196();
			if (local552 < 0) {
				local552 = 0;
			} else if (local552 > 65535) {
				local552 = 65535;
			}
			local205 = local161.method3197();
			if (local205 < 0) {
				local205 = 0;
			} else if (local205 > 65535) {
				local205 = 65535;
			}
			@Pc(591) byte local591 = 0;
			if (local161.method3194() == 2) {
				local591 = 1;
			}
			local282 = (int) local538;
			@Pc(613) Class3_Sub29 local613 = Static507.method6901(Static32.aClass144_10, Static95.aClass292_2.aClass88_2);
			local613.aClass3_Sub2_Sub1_1.method2037(local282 | local591 << 15);
			local613.aClass3_Sub2_Sub1_1.method2025(local205 | local552 << 16);
			Static95.aClass292_2.method6855(local613);
		}
		@Pc(674) long local674;
		if (Static362.anInt5713 > 0) {
			local178 = Static507.method6901(Static645.aClass144_98, Static95.aClass292_2.aClass88_2);
			local178.aClass3_Sub2_Sub1_1.method2065(Static362.anInt5713 * 3);
			for (local180 = 0; local180 < Static362.anInt5713; local180++) {
				@Pc(665) Interface26 local665 = Static461.anInterface26Array1[local180];
				local674 = (local665.method5025() - Static21.aLong19) / 50L;
				Static21.aLong19 = local665.method5025();
				if (local674 > 65535L) {
					local674 = 65535L;
				}
				local178.aClass3_Sub2_Sub1_1.method2065(local665.method5024());
				local178.aClass3_Sub2_Sub1_1.method2032((int) local674);
			}
			Static95.aClass292_2.method6855(local178);
		}
		if (Static253.anInt3919 > 0) {
			Static253.anInt3919--;
		}
		if (Static96.aBoolean732 && Static253.anInt3919 <= 0) {
			Static96.aBoolean732 = false;
			Static253.anInt3919 = 20;
			local178 = Static507.method6901(Static666.aClass144_102, Static95.aClass292_2.aClass88_2);
			local178.aClass3_Sub2_Sub1_1.method2055((int) Static447.aFloat107 >> 3);
			local178.aClass3_Sub2_Sub1_1.method2055((int) Static382.aFloat40 >> 3);
			Static95.aClass292_2.method6855(local178);
		}
		if (Static19.aBoolean43 != Static213.aBoolean221) {
			Static19.aBoolean43 = Static213.aBoolean221;
			local178 = Static507.method6901(Static147.aClass144_25, Static95.aClass292_2.aClass88_2);
			local178.aClass3_Sub2_Sub1_1.method2065(Static213.aBoolean221 ? 1 : 0);
			Static95.aClass292_2.method6855(local178);
		}
		if (!Static569.aBoolean580) {
			local178 = Static507.method6901(Static342.aClass144_53, Static95.aClass292_2.aClass88_2);
			local178.aClass3_Sub2_Sub1_1.method2065(0);
			local180 = local178.aClass3_Sub2_Sub1_1.anInt2178;
			@Pc(822) Class3_Sub2 local822 = Static580.aClass3_Sub22_24.method2420();
			local178.aClass3_Sub2_Sub1_1.method2068(0, local822.anInt2178, local822.aByteArray20);
			local178.aClass3_Sub2_Sub1_1.method2057(local178.aClass3_Sub2_Sub1_1.anInt2178 - local180);
			Static95.aClass292_2.method6855(local178);
			Static569.aBoolean580 = true;
		}
		if (Static448.aClass364ArrayArrayArray2 != null) {
			if (Static262.anInt4081 == 2) {
				Static38.method1144();
			} else if (Static262.anInt4081 == 3) {
				Static26.method929();
			}
		}
		if (Static558.aBoolean576) {
			Static558.aBoolean576 = false;
		} else {
			Static522.aFloat127 /= 2.0F;
		}
		if (Static372.aBoolean374) {
			Static372.aBoolean374 = false;
		} else {
			Static150.aFloat57 /= 2.0F;
		}
		Static700.method9280();
		if (Static98.anInt2140 != 11) {
			return;
		}
		Static125.method2294();
		Static333.method4784();
		Static240.method6915();
		Static95.aClass292_2.anInt8011++;
		if (Static95.aClass292_2.anInt8011 > 750) {
			Static526.method7028();
			return;
		}
		if (Static103.anInt2245 == 0) {
			Static170.method2743();
			Static113.method2183();
		} else {
			if (Static103.anInt2245 == 1 && Static71.method1571(Static238.anInt3790)) {
				Static18.method582();
				Static103.anInt2245 = 2;
			}
			if (Static103.anInt2245 == 2 && Static98.anInt2140 != 12) {
				Static339.aClass313_24.method7101();
				Static544.anInt9948 = 0;
				Static66.anInt1578 = Static716.anInt11157;
				Static103.anInt2245 = 3;
				Static322.method4691();
			}
			if (Static103.anInt2245 == 3) {
				local84 = Static716.anInt11157 - Static66.anInt1578;
				if (Static544.anInt9948 < Static340.aClass29Array1.length) {
					do {
						@Pc(1003) Class29 local1003 = Static340.aClass29Array1[Static544.anInt9948];
						if (local1003.anInt11151 > local84) {
							break;
						}
						local1003.method9495();
					} while (Static103.anInt2245 == 3 && ++Static544.anInt9948 < Static340.aClass29Array1.length);
				}
				if (Static103.anInt2245 == 3) {
					for (local180 = 0; local180 < Static470.aClass7Array1.length; local180++) {
						@Pc(1042) Class7 local1042 = Static470.aClass7Array1[local180];
						if (local1042.aBoolean4) {
							@Pc(1049) Class9_Sub1_Sub1_Sub2 local1049 = local1042.method249();
							Static126.method2307(true, local1049);
						}
					}
				}
			}
		}
		Static579.method7512();
		if (!Static543.aBoolean565) {
			Static441.method5858();
			Static543.aBoolean565 = true;
		}
		for (local84 = Static380.aClass127_1.method2985(true); local84 != -1; local84 = Static380.aClass127_1.method2985(false)) {
			Static445.method5894(local84);
			Static141.anIntArray163[Static120.anInt2463++ & 0x1F] = local84;
		}
		for (@Pc(1103) Class3_Sub7_Sub21 local1103 = Static203.method3091(); local1103 != null; local1103 = Static203.method3091()) {
			local552 = local1103.method9254();
			local674 = local1103.method9253();
			if (local552 == 1) {
				Static227.anIntArray269[(int) local674] = local1103.anInt10899;
				Static652.aBoolean155 |= Static317.aBooleanArray10[(int) local674];
				Static521.anIntArray591[Static420.anInt6421++ & 0x1F] = (int) local674;
			} else if (local552 == 2) {
				Static115.aStringArray8[(int) local674] = local1103.aString131;
				Static706.anIntArray786[Static313.anInt5064++ & 0x1F] = (int) local674;
			} else {
				@Pc(1259) Class270 local1259;
				if (local552 == 3) {
					local1259 = Static254.method3544((int) local674);
					if (!local1103.aString131.equals(local1259.aString89)) {
						local1259.aString89 = local1103.aString131;
						Static539.method7146(local1259);
					}
				} else {
					@Pc(1200) int local1200;
					if (local552 == 4) {
						local1259 = Static254.method3544((int) local674);
						local288 = local1103.anInt10899;
						local299 = local1103.anInt10897;
						local1200 = local1103.anInt10896;
						if (local1259.anInt7027 != local288 || local1259.anInt7007 != local299 || local1200 != local1259.anInt6977) {
							local1259.anInt7007 = local299;
							local1259.anInt6977 = local1200;
							local1259.anInt7027 = local288;
							Static539.method7146(local1259);
						}
					} else if (local552 == 5) {
						local1259 = Static254.method3544((int) local674);
						if (local1103.anInt10899 != local1259.anInt7026) {
							if (local1103.anInt10899 == -1) {
								local1259.aClass45_8 = null;
							} else {
								if (local1259.aClass45_8 == null) {
									local1259.aClass45_8 = new Class45_Sub1();
								}
								local1259.aClass45_8.method6576(local1103.anInt10899);
							}
							local1259.anInt7026 = local1103.anInt10899;
							Static539.method7146(local1259);
						}
					} else if (local552 == 6) {
						local282 = local1103.anInt10899;
						local288 = local282 >> 10 & 0x1F;
						local299 = local282 >> 5 & 0x1F;
						local1200 = local282 & 0x1F;
						@Pc(1214) int local1214 = (local288 << 19) - (-(local299 << 11) - (local1200 << 3));
						@Pc(1219) Class270 local1219 = Static254.method3544((int) local674);
						if (local1219.anInt6972 != local1214) {
							local1219.anInt6972 = local1214;
							Static539.method7146(local1219);
						}
					} else if (local552 == 7) {
						local1259 = Static254.method3544((int) local674);
						@Pc(1724) boolean local1724 = local1103.anInt10899 == 1;
						if (local1724 != local1259.aBoolean470) {
							local1259.aBoolean470 = local1724;
							Static539.method7146(local1259);
						}
					} else if (local552 == 8) {
						local1259 = Static254.method3544((int) local674);
						if (local1103.anInt10899 != local1259.anInt6989 || local1259.anInt6993 != local1103.anInt10897 || local1259.anInt7004 != local1103.anInt10896) {
							local1259.anInt6993 = local1103.anInt10897;
							local1259.anInt6989 = local1103.anInt10899;
							local1259.anInt7004 = local1103.anInt10896;
							if (local1259.anInt7001 != -1) {
								if (local1259.anInt7016 > 0) {
									local1259.anInt7004 = local1259.anInt7004 * 32 / local1259.anInt7016;
								} else if (local1259.anInt7011 > 0) {
									local1259.anInt7004 = local1259.anInt7004 * 32 / local1259.anInt7011;
								}
							}
							Static539.method7146(local1259);
						}
					} else if (local552 == 9) {
						local1259 = Static254.method3544((int) local674);
						if (local1259.anInt7001 != local1103.anInt10899 || local1259.anInt7003 != local1103.anInt10897) {
							local1259.anInt7001 = local1103.anInt10899;
							local1259.anInt7003 = local1103.anInt10897;
							Static539.method7146(local1259);
						}
					} else if (local552 == 10) {
						local1259 = Static254.method3544((int) local674);
						if (local1259.anInt7009 != local1103.anInt10899 || local1259.anInt7043 != local1103.anInt10897 || local1103.anInt10896 != local1259.anInt7046) {
							local1259.anInt7046 = local1103.anInt10896;
							local1259.anInt7043 = local1103.anInt10897;
							local1259.anInt7009 = local1103.anInt10899;
							Static539.method7146(local1259);
						}
					} else if (local552 == 11) {
						local1259 = Static254.method3544((int) local674);
						local1259.anInt7036 = local1259.anInt7054 = local1103.anInt10899;
						local1259.anInt6981 = local1259.anInt6974 = local1103.anInt10897;
						local1259.aByte109 = 0;
						local1259.aByte110 = 0;
						Static539.method7146(local1259);
					} else if (local552 == 12) {
						local1259 = Static254.method3544((int) local674);
						local288 = local1103.anInt10899;
						if (local1259 != null && local1259.anInt7008 == 0) {
							if (local288 > local1259.anInt7013 - local1259.anInt7045) {
								local288 = local1259.anInt7013 - local1259.anInt7045;
							}
							if (local288 < 0) {
								local288 = 0;
							}
							if (local1259.lb != local288) {
								local1259.lb = local288;
								Static539.method7146(local1259);
							}
						}
					} else if (local552 == 14) {
						local1259 = Static254.method3544((int) local674);
						local1259.anInt7040 = local1103.anInt10899;
					} else if (local552 == 15) {
						Static681.anInt10651 = local1103.anInt10899;
						Static517.anInt8136 = local1103.anInt10897;
						Static216.aBoolean223 = true;
					} else if (local552 == 16) {
						local1259 = Static254.method3544((int) local674);
						local1259.anInt6987 = local1103.anInt10899;
					} else if (local552 == 20) {
						local1259 = Static254.method3544((int) local674);
						local1259.aBoolean474 = local1103.anInt10899 == 1;
					} else if (local552 == 21) {
						local1259 = Static254.method3544((int) local674);
						local1259.aBoolean468 = local1103.anInt10899 == 1;
					} else if (local552 == 17) {
						local1259 = Static254.method3544((int) local674);
						local1259.anInt7044 = local1103.anInt10899;
					} else if (local552 == 18) {
						local1259 = Static254.method3544((int) local674);
						local288 = (int) (local674 >> 32);
						local1259.method6014(local288, (short) local1103.anInt10897, (short) local1103.anInt10899);
					} else if (local552 == 19) {
						local1259 = Static254.method3544((int) local674);
						local288 = (int) (local674 >> 32);
						local1259.method6022((short) local1103.anInt10897, (short) local1103.anInt10899, local288);
					}
				}
			}
		}
		if (Static448.anInt6836 != 0) {
			Static419.anInt10150 += 20;
			if (Static419.anInt10150 >= 400) {
				Static448.anInt6836 = 0;
			}
		}
		Static286.anInt4372++;
		if (Static407.aClass270_14 != null) {
			Static96.anInt10770++;
			if (Static96.anInt10770 >= 15) {
				Static539.method7146(Static407.aClass270_14);
				Static407.aClass270_14 = null;
			}
		}
		Static633.aBoolean655 = false;
		Static512.aBoolean721 = false;
		Static140.aClass270_6 = null;
		Static21.aClass270_1 = null;
		Static262.method3720(-1, -1, (Class270) null);
		if (!Static474.aBoolean505) {
			Static167.anInt2966 = -1;
		}
		Static642.method8457();
		Static475.anInt7494++;
		if (Static685.aBoolean393) {
			@Pc(1970) Class3_Sub29 local1970 = Static507.method6901(Static297.aClass144_46, Static95.aClass292_2.aClass88_2);
			local1970.aClass3_Sub2_Sub1_1.method2018(Static263.anInt4103 << 14 | Static605.anInt9181 << 28 | Static362.anInt5707);
			Static95.aClass292_2.method6855(local1970);
			Static685.aBoolean393 = false;
		}
		while (true) {
			@Pc(1994) Class3_Sub41 local1994;
			@Pc(2011) Class270 local2011;
			@Pc(1999) Class270 local1999;
			do {
				local1994 = (Class3_Sub41) Static477.aClass342_58.method7653();
				if (local1994 == null) {
					while (true) {
						do {
							local1994 = (Class3_Sub41) Static408.aClass342_48.method7653();
							if (local1994 == null) {
								while (true) {
									do {
										local1994 = (Class3_Sub41) Static501.aClass342_61.method7653();
										if (local1994 == null) {
											if (Static140.aClass270_6 == null) {
												Static116.anInt2383 = 0;
											}
											if (Static334.aClass270_10 != null) {
												Static655.method8594();
											}
											if (Static432.anInt6579 > 0 && Static43.aClass50_1.method7394(82) && Static43.aClass50_1.method7394(81) && Static452.anInt6919 != 0) {
												local552 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 - Static452.anInt6919;
												if (local552 < 0) {
													local552 = 0;
												} else if (local552 > 3) {
													local552 = 3;
												}
												Static688.method9110(local552, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0] + Static189.anInt3243, Static291.anInt4448 + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0]);
											}
											Static425.method5642();
											for (local552 = 0; local552 < 5; local552++) {
												@Pc(2226) int local2226 = Static502.anIntArray580[local552]++;
											}
											if (Static652.aBoolean155 && Static517.method6965() - 60000L > Static346.aLong189) {
												Static563.method7341();
											}
											for (@Pc(2265) Class9_Sub2_Sub2 local2265 = (Class9_Sub2_Sub2) Static187.aClass319_3.method7195(); local2265 != null; local2265 = (Class9_Sub2_Sub2) Static187.aClass319_3.method7188()) {
												if ((long) local2265.anInt2345 < Static517.method6965() / 1000L - 5L) {
													if (local2265.aShort41 > 0) {
														Static97.method1971(local2265.aString42 + Static430.aClass257_19.method5699(Static456.anInt7118), "", "", "", 5, 0);
													}
													if (local2265.aShort41 == 0) {
														Static97.method1971(local2265.aString42 + Static430.aClass257_20.method5699(Static456.anInt7118), "", "", "", 5, 0);
													}
													local2265.method9182();
												}
											}
											Static387.anInt5983++;
											if (Static387.anInt5983 > 500) {
												Static387.anInt5983 = 0;
												local226 = (int) (Math.random() * 8.0D);
												if ((local226 & 0x2) == 2) {
													Static331.anInt5334 += Static179.anInt3138;
												}
												if ((local226 & 0x4) == 4) {
													Static88.anInt2043 += Static155.anInt2759;
												}
												if ((local226 & 0x1) == 1) {
													Static635.anInt9788 += Static381.anInt5891;
												}
											}
											if (Static635.anInt9788 < -50) {
												Static381.anInt5891 = 2;
											}
											if (Static331.anInt5334 < -55) {
												Static179.anInt3138 = 2;
											}
											if (Static635.anInt9788 > 50) {
												Static381.anInt5891 = -2;
											}
											if (Static331.anInt5334 > 55) {
												Static179.anInt3138 = -2;
											}
											if (Static88.anInt2043 < -40) {
												Static155.anInt2759 = 1;
											}
											if (Static88.anInt2043 > 40) {
												Static155.anInt2759 = -1;
											}
											Static629.anInt9701++;
											if (Static629.anInt9701 > 500) {
												Static629.anInt9701 = 0;
												local226 = (int) (Math.random() * 8.0D);
												if ((local226 & 0x1) == 1) {
													Static194.anInt3310 += Static652.anInt2342;
												}
												if ((local226 & 0x2) == 2) {
													Static402.anInt6239 += Static69.anInt1630;
												}
											}
											if (Static194.anInt3310 < -60) {
												Static652.anInt2342 = 2;
											}
											if (Static402.anInt6239 < -20) {
												Static69.anInt1630 = 1;
											}
											if (Static194.anInt3310 > 60) {
												Static652.anInt2342 = -2;
											}
											if (Static402.anInt6239 > 10) {
												Static69.anInt1630 = -1;
											}
											Static95.aClass292_2.anInt8015++;
											if (Static95.aClass292_2.anInt8015 > 50) {
												@Pc(2549) Class3_Sub29 local2549 = Static507.method6901(Static658.aClass144_101, Static95.aClass292_2.aClass88_2);
												Static95.aClass292_2.method6855(local2549);
											}
											if (Static572.aBoolean586) {
												Static725.method9586();
												Static572.aBoolean586 = false;
											}
											try {
												Static95.aClass292_2.method6851();
												return;
											} catch (@Pc(2566) IOException local2566) {
												Static526.method7028();
												return;
											}
										}
										local1999 = local1994.aClass270_12;
										if (local1999.anInt7020 < 0) {
											break;
										}
										local2011 = Static254.method3544(local1999.anInt7050);
									} while (local2011 == null || local2011.aClass270Array3 == null || local1999.anInt7020 >= local2011.aClass270Array3.length || local2011.aClass270Array3[local1999.anInt7020] != local1999);
									Static540.method7160(local1994);
								}
							}
							local1999 = local1994.aClass270_12;
							if (local1999.anInt7020 < 0) {
								break;
							}
							local2011 = Static254.method3544(local1999.anInt7050);
						} while (local2011 == null || local2011.aClass270Array3 == null || local1999.anInt7020 >= local2011.aClass270Array3.length || local2011.aClass270Array3[local1999.anInt7020] != local1999);
						Static540.method7160(local1994);
					}
				}
				local1999 = local1994.aClass270_12;
				if (local1999.anInt7020 < 0) {
					break;
				}
				local2011 = Static254.method3544(local1999.anInt7050);
			} while (local2011 == null || local2011.aClass270Array3 == null || local2011.aClass270Array3.length <= local1999.anInt7020 || local1999 != local2011.aClass270Array3[local1999.anInt7020]);
			Static540.method7160(local1994);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public static void method7070() {
		@Pc(20) Class3_Sub2_Sub1 local20 = Static95.aClass292_2.aClass3_Sub2_Sub1_2;
		while (local20.method217(Static95.aClass292_2.anInt8012) >= 15) {
			@Pc(32) int local32 = local20.method216(15);
			if (local32 == 32767) {
				break;
			}
			@Pc(37) boolean local37 = false;
			@Pc(46) Class3_Sub52 local46 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local32);
			@Pc(52) Class9_Sub1_Sub1_Sub2_Sub2 local52;
			if (local46 == null) {
				local52 = new Class9_Sub1_Sub1_Sub2_Sub2();
				local52.anInt8783 = local32;
				local46 = new Class3_Sub52(local52);
				Static94.aClass313_8.method7107((long) local32, local46);
				local37 = true;
				Static169.aClass3_Sub52Array1[Static568.anInt8629++] = local46;
			}
			local52 = local46.aClass9_Sub1_Sub1_Sub2_Sub2_2;
			Static633.anIntArray705[Static28.anInt1087++] = local32;
			local52.anInt8801 = Static216.anInt3560;
			if (local52.aClass219_1 != null && local52.aClass219_1.method5038()) {
				Static454.method6007(local52);
			}
			@Pc(112) int local112 = local20.method216(5);
			if (local112 > 15) {
				local112 -= 32;
			}
			@Pc(125) int local125 = local20.method216(5);
			if (local125 > 15) {
				local125 -= 32;
			}
			@Pc(144) int local144 = (local20.method216(3) + 4 & 0x31A00007) << 11;
			@Pc(149) int local149 = local20.method216(2);
			@Pc(156) int local156 = local20.method216(1);
			if (local156 == 1) {
				Static493.anIntArray574[Static412.anInt6361++] = local32;
			}
			local52.method7509(Static255.aClass14_1.method619(local20.method216(15)));
			@Pc(186) int local186 = local20.method216(1);
			local52.method7481(local52.aClass219_1.anInt5693);
			local52.anInt8807 = local52.aClass219_1.lb << 3;
			if (local37) {
				local52.method7495(local144, true);
			}
			local52.method7506(local52.method7485(), Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0] + local112, local125 + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0], local186 == 1, local149);
			if (local52.aClass219_1.method5038()) {
				Static296.method4149(local52.anIntArray644[0], (Class9_Sub1_Sub1_Sub2_Sub1) null, 0, (Class247) null, local52, local52.aByte139, local52.anIntArray643[0]);
			}
		}
		local20.method219();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([BZI)[B")
	public static byte[] method7071(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = new byte[arg1];
		Static732.method6320(arg0, 0, local13, 0, arg1);
		return local13;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Z")
	public static boolean method7072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static338.method4837(arg0, arg1) | (arg0 & 0x40000) != 0 || Static571.method7409(arg0, arg1);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(FIFFI)F")
	public static float method7073(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(13) float[] local13 = Static56.aFloatArrayArray1[arg1];
		return arg2 * local13[1] + arg0 * local13[0] + arg3 * local13[2];
	}
}
