import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray9 = new byte[1000][];

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_990 = Static81.method1507("overlay2)3dat");

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public static int anInt3371 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!wg;IIIIIII)V")
	public static void method2589(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static167.anInt3703;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static176.anInt4669;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static181.anIntArrayArrayArray10[arg1][arg6][arg7] - Static134.anInt2982;
		@Pc(49) int local49 = Static181.anIntArrayArrayArray10[arg1][arg6 + 1][arg7] - Static134.anInt2982;
		@Pc(63) int local63 = Static181.anIntArrayArrayArray10[arg1][arg6 + 1][arg7 + 1] - Static134.anInt2982;
		@Pc(75) int local75 = Static181.anIntArrayArrayArray10[arg1][arg6][arg7 + 1] - Static134.anInt2982;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static182.anInt4072 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static182.anInt4069 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static182.anInt4072 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static182.anInt4069 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static182.anInt4072 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static182.anInt4069 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static182.anInt4072 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static182.anInt4069 + (local85 << 9) / local261;
		Static182.anInt4071 = 0;
		@Pc(471) int local471;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static65.aBoolean84 && Static13.method305(Static191.anInt4295 + Static182.anInt4072, Static94.anInt2171 + Static182.anInt4069, local315, local331, local299, local307, local323, local291)) {
				Static28.anInt730 = arg6;
				Static137.anInt3092 = arg7;
			}
			Static182.aBoolean191 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static182.anInt4068 || local323 > Static182.anInt4068 || local291 > Static182.anInt4068) {
				Static182.aBoolean191 = true;
			}
			if (arg0.anInt4644 == -1) {
				if (arg0.anInt4645 != 12345678) {
					Static182.method3149(local315, local331, local299, local307, local323, local291, arg0.anInt4645, arg0.anInt4651, arg0.anInt4643);
				}
			} else if (Static193.aBoolean201) {
				local471 = Static182.anInterface2_2.method1320(arg0.anInt4644);
				Static182.method3149(local315, local331, local299, local307, local323, local291, Static57.method1096(local471, arg0.anInt4645), Static57.method1096(local471, arg0.anInt4651), Static57.method1096(local471, arg0.anInt4643));
			} else if (arg0.aBoolean229) {
				Static182.method3150(local315, local331, local299, local307, local323, local291, arg0.anInt4645, arg0.anInt4651, arg0.anInt4643, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4644);
			} else {
				Static182.method3150(local315, local331, local299, local307, local323, local291, arg0.anInt4645, arg0.anInt4651, arg0.anInt4643, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4644);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static65.aBoolean84 && Static13.method305(Static191.anInt4295 + Static182.anInt4072, Static94.anInt2171 + Static182.anInt4069, local283, local299, local331, local275, local291, local323)) {
			Static28.anInt730 = arg6;
			Static137.anInt3092 = arg7;
		}
		Static182.aBoolean191 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static182.anInt4068 || local291 > Static182.anInt4068 || local323 > Static182.anInt4068) {
			Static182.aBoolean191 = true;
		}
		if (arg0.anInt4644 != -1) {
			if (!Static193.aBoolean201) {
				Static182.method3150(local283, local299, local331, local275, local291, local323, arg0.anInt4652, arg0.anInt4643, arg0.anInt4651, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4644);
				return;
			}
			local471 = Static182.anInterface2_2.method1320(arg0.anInt4644);
			Static182.method3149(local283, local299, local331, local275, local291, local323, Static57.method1096(local471, arg0.anInt4652), Static57.method1096(local471, arg0.anInt4643), Static57.method1096(local471, arg0.anInt4651));
		} else if (arg0.anInt4652 != 12345678) {
			Static182.method3149(local283, local299, local331, local275, local291, local323, arg0.anInt4652, arg0.anInt4643, arg0.anInt4651);
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method2591(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static155.method2242(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			System.out.println("Error: " + local5);
			local5 = local5.replace(':', '.');
			local5 = local5.replace('@', '_');
			local5 = local5.replace('&', '_');
			local5 = local5.replace('#', '_');
			if (Static85.aClass99_5.anApplet1 != null) {
				@Pc(111) Class82 local111 = Static85.aClass99_5.method3418(new URL(Static85.aClass99_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static207.anInt4079 + "&u=" + Static91.aLong64 + "&v1=" + Static203.aString3 + "&v2=" + Static203.aString5 + "&e=" + local5));
				while (local111.anInt3421 == 0) {
					Static75.method3577(1L);
				}
				if (local111.anInt3421 == 1) {
					@Pc(131) DataInputStream local131 = (DataInputStream) local111.anObject2;
					local131.read();
					local131.close();
				}
			}
		} catch (@Pc(138) Exception local138) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lclient!ue;B)V")
	public static void method2592(@OriginalArg(0) Class93[] arg0) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static43.aByteArrayArrayArray3[local3][local7][local11] & 0x1) == 1) {
						@Pc(28) int local28 = local3;
						if ((Static43.aByteArrayArrayArray3[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg0[local28].method3275(local7, local11);
						}
					}
				}
			}
		}
		Static168.anInt3732 += (int) (Math.random() * 5.0D) - 2;
		Static92.anInt2144 += (int) (Math.random() * 5.0D) - 2;
		if (Static92.anInt2144 < -16) {
			Static92.anInt2144 = -16;
		}
		if (Static92.anInt2144 > 16) {
			Static92.anInt2144 = 16;
		}
		if (Static168.anInt3732 < -8) {
			Static168.anInt3732 = -8;
		}
		if (Static168.anInt3732 > 8) {
			Static168.anInt3732 = 8;
		}
		@Pc(114) int[][] local114 = new int[104][104];
		local11 = Static92.anInt2144 >> 1;
		local7 = Static168.anInt3732 >> 2 << 10;
		@Pc(128) int[][] local128 = new int[104][104];
		@Pc(149) int local149;
		@Pc(155) int local155;
		@Pc(157) int local157;
		@Pc(161) int local161;
		@Pc(251) int local251;
		@Pc(186) int local186;
		@Pc(206) int local206;
		@Pc(219) int local219;
		@Pc(225) int local225;
		@Pc(229) int local229;
		@Pc(235) int local235;
		@Pc(302) int local302;
		@Pc(518) int local518;
		@Pc(522) int local522;
		@Pc(804) int local804;
		for (@Pc(135) int local135 = 0; local135 < 4; local135++) {
			@Pc(141) byte[][] local141 = Static136.aByteArrayArrayArray7[local135];
			local149 = (int) Math.sqrt(5100.0D);
			local155 = local149 * 768 >> 8;
			for (local157 = 1; local157 < 103; local157++) {
				for (local161 = 1; local161 < 103; local161++) {
					local186 = Static186.anIntArrayArrayArray2[local135][local161 + 1][local157] - Static186.anIntArrayArrayArray2[local135][local161 - 1][local157];
					local206 = Static186.anIntArrayArrayArray2[local135][local161][local157 + 1] - Static186.anIntArrayArrayArray2[local135][local161][local157 - 1];
					local219 = (int) Math.sqrt((double) (local186 * local186 + local206 * local206 + 65536));
					local225 = (local186 << 8) / local219;
					local229 = -65536 / local219;
					local235 = (local206 << 8) / local219;
					local251 = (local229 * -10 + local225 * -50 + local235 * -50) / local155 + 74;
					local302 = (local141[local161 + 1][local157] >> 3) + (local141[local161 - 1][local157] >> 2) + (local141[local161][local157 + -1] >> 2) + (local141[local161][local157 + 1] >> 3) + (local141[local161][local157] >> 1);
					local128[local161][local157] = local251 - local302;
				}
			}
			for (local161 = 0; local161 < 104; local161++) {
				Static85.anIntArray287[local161] = 0;
				Static116.anIntArray205[local161] = 0;
				Static71.anIntArray148[local161] = 0;
				Static104.anIntArray191[local161] = 0;
				Static189.anIntArray366[local161] = 0;
			}
			for (local251 = -5; local251 < 104; local251++) {
				for (local186 = 0; local186 < 104; local186++) {
					local206 = local251 + 5;
					@Pc(422) int local422;
					if (local206 < 104) {
						local219 = Static27.aByteArrayArrayArray1[local135][local206][local186] & 0xFF;
						if (local219 > 0) {
							@Pc(386) Class1_Sub2_Sub18 local386 = Static39.method729(local219 - 1);
							Static85.anIntArray287[local186] += local386.anInt3162;
							Static116.anIntArray205[local186] += local386.anInt3167;
							Static71.anIntArray148[local186] += local386.anInt3160;
							Static104.anIntArray191[local186] += local386.anInt3168;
							local422 = Static189.anIntArray366[local186]++;
						}
					}
					local219 = local251 - 5;
					if (local219 >= 0) {
						local225 = Static27.aByteArrayArrayArray1[local135][local219][local186] & 0xFF;
						if (local225 > 0) {
							@Pc(455) Class1_Sub2_Sub18 local455 = Static39.method729(local225 - 1);
							Static85.anIntArray287[local186] -= local455.anInt3162;
							Static116.anIntArray205[local186] -= local455.anInt3167;
							Static71.anIntArray148[local186] -= local455.anInt3160;
							Static104.anIntArray191[local186] -= local455.anInt3168;
							local422 = Static189.anIntArray366[local186]--;
						}
					}
				}
				if (local251 >= 0) {
					local206 = 0;
					local219 = 0;
					local225 = 0;
					local235 = 0;
					local229 = 0;
					for (local302 = -5; local302 < 104; local302++) {
						local518 = local302 + 5;
						local522 = local302 - 5;
						if (local518 < 104) {
							local229 += Static104.anIntArray191[local518];
							local219 += Static116.anIntArray205[local518];
							local206 += Static85.anIntArray287[local518];
							local235 += Static189.anIntArray366[local518];
							local225 += Static71.anIntArray148[local518];
						}
						if (local522 >= 0) {
							local219 -= Static116.anIntArray205[local522];
							local235 -= Static189.anIntArray366[local522];
							local206 -= Static85.anIntArray287[local522];
							local225 -= Static71.anIntArray148[local522];
							local229 -= Static104.anIntArray191[local522];
						}
						if (local302 >= 0 && local235 > 0) {
							local114[local251][local302] = Static24.method506(local206 * 256 / local229, local219 / local235, local225 / local235);
						}
					}
				}
			}
			for (local186 = 1; local186 < 103; local186++) {
				for (local206 = 1; local206 < 103; local206++) {
					if (!Static30.aBoolean35 || (Static43.aByteArrayArrayArray3[0][local186][local206] & 0x2) != 0 || (Static43.aByteArrayArrayArray3[local135][local186][local206] & 0x10) == 0 && Static208.method3521(local186, local135, local206) == Static80.anInt1910) {
						if (Static80.anInt1917 > local135) {
							Static80.anInt1917 = local135;
						}
						local219 = Static27.aByteArrayArrayArray1[local135][local186][local206] & 0xFF;
						local225 = Static177.aByteArrayArrayArray12[local135][local186][local206] & 0xFF;
						if (local219 > 0 || local225 > 0) {
							local235 = Static186.anIntArrayArrayArray2[local135][local186 + 1][local206];
							local302 = Static186.anIntArrayArrayArray2[local135][local186 + 1][local206 + 1];
							local229 = Static186.anIntArrayArrayArray2[local135][local186][local206];
							local518 = Static186.anIntArrayArrayArray2[local135][local186][local206 + 1];
							if (local135 > 0) {
								@Pc(747) boolean local747 = true;
								if (local219 == 0 && Static144.aByteArrayArrayArray8[local135][local186][local206] != 0) {
									local747 = false;
								}
								if (local225 > 0 && !Static56.method1093(local225 - 1).aBoolean155) {
									local747 = false;
								}
								if (local747 && local229 == local235 && local229 == local302 && local518 == local229) {
									Static191.anIntArrayArrayArray11[local135][local186][local206] |= 0x924;
								}
							}
							@Pc(821) int local821;
							@Pc(846) int local846;
							if (local219 <= 0) {
								local804 = 0;
								local522 = -1;
							} else {
								local522 = local114[local186][local206];
								local821 = (local522 & 0x7F) + local11;
								if (local821 < 0) {
									local821 = 0;
								} else if (local821 > 127) {
									local821 = 127;
								}
								local846 = local821 + (local522 & 0x380) + (local7 + local522 & 0xFC00);
								local804 = Static182.anIntArray354[Static58.method1103(96, local846)];
							}
							local821 = local128[local186][local206];
							@Pc(869) int local869 = local128[local186 + 1][local206 + 1];
							@Pc(877) int local877 = local128[local186][local206 + 1];
							local846 = local128[local186 + 1][local206];
							if (local225 == 0) {
								Static140.method2433(local135, local186, local206, 0, 0, -1, local229, local235, local302, local518, Static58.method1103(local821, local522), Static58.method1103(local846, local522), Static58.method1103(local869, local522), Static58.method1103(local877, local522), 0, 0, 0, 0, local804, 0);
							} else {
								@Pc(900) int local900 = Static144.aByteArrayArrayArray8[local135][local186][local206] + 1;
								@Pc(908) byte local908 = Static195.aByteArrayArrayArray13[local135][local186][local206];
								@Pc(914) Class1_Sub2_Sub19 local914 = Static56.method1093(local225 - 1);
								@Pc(917) int local917 = local914.anInt3365;
								if (local917 >= 0 && !Static182.anInterface2_2.method1319(local917)) {
									local917 = -1;
								}
								@Pc(936) int local936;
								@Pc(977) int local977;
								@Pc(942) int local942;
								@Pc(970) int local970;
								if (local917 >= 0) {
									local936 = -1;
									local977 = Static182.anIntArray354[Static126.method2106(96, Static182.anInterface2_2.method1320(local917))];
								} else if (local914.anInt3368 == -1) {
									local936 = -2;
									local977 = 0;
								} else {
									local936 = local914.anInt3368;
									local942 = local11 + (local936 & 0x7F);
									if (local942 < 0) {
										local942 = 0;
									} else if (local942 > 127) {
										local942 = 127;
									}
									local970 = local942 + (local936 & 0x380) + (local936 + local7 & 0xFC00);
									local977 = Static182.anIntArray354[Static126.method2106(96, local970)];
								}
								if (local914.anInt3360 >= 0) {
									local942 = local914.anInt3360;
									local970 = local11 + (local942 & 0x7F);
									if (local970 < 0) {
										local970 = 0;
									} else if (local970 > 127) {
										local970 = 127;
									}
									@Pc(1034) int local1034 = local970 + (local942 & 0x380) + (local7 + local942 & 0xFC00);
									local977 = Static182.anIntArray354[Static126.method2106(96, local1034)];
								}
								Static140.method2433(local135, local186, local206, local900, local908, local917, local229, local235, local302, local518, Static58.method1103(local821, local522), Static58.method1103(local846, local522), Static58.method1103(local869, local522), Static58.method1103(local877, local522), Static126.method2106(local821, local936), Static126.method2106(local846, local936), Static126.method2106(local869, local936), Static126.method2106(local877, local936), local804, local977);
							}
						}
					}
				}
			}
			for (local206 = 1; local206 < 103; local206++) {
				for (local219 = 1; local219 < 103; local219++) {
					Static33.method640(local135, local219, local206, Static208.method3521(local219, local135, local206));
				}
			}
			Static27.aByteArrayArrayArray1[local135] = null;
			Static177.aByteArrayArrayArray12[local135] = null;
			Static144.aByteArrayArrayArray8[local135] = null;
			Static195.aByteArrayArrayArray13[local135] = null;
			Static136.aByteArrayArrayArray7[local135] = null;
		}
		Static35.method3214();
		@Pc(1194) int local1194;
		for (@Pc(1190) int local1190 = 0; local1190 < 104; local1190++) {
			for (local1194 = 0; local1194 < 104; local1194++) {
				if ((Static43.aByteArrayArrayArray3[1][local1190][local1194] & 0x2) == 2) {
					Static211.method3557(local1190, local1194);
				}
			}
		}
		local1194 = 1;
		@Pc(1226) int local1226 = 2;
		local149 = 4;
		for (local155 = 0; local155 < 4; local155++) {
			if (local155 > 0) {
				local1226 <<= 0x3;
				local1194 <<= 0x3;
				local149 <<= 0x3;
			}
			for (local157 = 0; local157 <= local155; local157++) {
				for (local161 = 0; local161 <= 104; local161++) {
					for (local251 = 0; local251 <= 104; local251++) {
						if ((Static191.anIntArrayArrayArray11[local157][local251][local161] & local1194) != 0) {
							for (local206 = local161; local206 < 104 && (local1194 & Static191.anIntArrayArrayArray11[local157][local251][local206 + 1]) != 0; local206++) {
							}
							local186 = local161;
							local225 = local157;
							while (local186 > 0 && (local1194 & Static191.anIntArrayArrayArray11[local157][local251][local186 - 1]) != 0) {
								local186--;
							}
							label350: for (local219 = local157; local219 > 0; local219--) {
								for (local229 = local186; local229 <= local206; local229++) {
									if ((local1194 & Static191.anIntArrayArrayArray11[local219 - 1][local251][local229]) == 0) {
										break label350;
									}
								}
							}
							label339: while (local155 > local225) {
								for (local229 = local186; local229 <= local206; local229++) {
									if ((Static191.anIntArrayArrayArray11[local225 + 1][local251][local229] & local1194) == 0) {
										break label339;
									}
								}
								local225++;
							}
							local229 = (local225 + 1 - local219) * (local206 - (local186 - 1));
							if (local229 >= 8) {
								local302 = Static186.anIntArrayArrayArray2[local225][local251][local186] - 240;
								local518 = Static186.anIntArrayArrayArray2[local219][local251][local186];
								Static92.method1673(local155, 1, local251 * 128, local251 * 128, local186 * 128, local206 * 128 + 128, local302, local518);
								for (local522 = local219; local522 <= local225; local522++) {
									for (local804 = local186; local804 <= local206; local804++) {
										Static191.anIntArrayArrayArray11[local522][local251][local804] &= ~local1194;
									}
								}
							}
						}
						if ((local1226 & Static191.anIntArrayArrayArray11[local157][local251][local161]) != 0) {
							for (local206 = local251; local206 < 104 && (local1226 & Static191.anIntArrayArrayArray11[local157][local206 + 1][local161]) != 0; local206++) {
							}
							local186 = local251;
							local219 = local157;
							local225 = local157;
							while (local186 > 0 && (local1226 & Static191.anIntArrayArrayArray11[local157][local186 - 1][local161]) != 0) {
								local186--;
							}
							label405: while (local219 > 0) {
								for (local229 = local186; local229 <= local206; local229++) {
									if ((local1226 & Static191.anIntArrayArrayArray11[local219 - 1][local229][local161]) == 0) {
										break label405;
									}
								}
								local219--;
							}
							label394: while (local155 > local225) {
								for (local229 = local186; local229 <= local206; local229++) {
									if ((local1226 & Static191.anIntArrayArrayArray11[local225 + 1][local229][local161]) == 0) {
										break label394;
									}
								}
								local225++;
							}
							local229 = (local225 + 1 - local219) * (local206 + 1 - local186);
							if (local229 >= 8) {
								local302 = Static186.anIntArrayArrayArray2[local225][local186][local161] - 240;
								local518 = Static186.anIntArrayArrayArray2[local219][local186][local161];
								Static92.method1673(local155, 2, local186 * 128, local206 * 128 + 128, local161 * 128, local161 * 128, local302, local518);
								for (local522 = local219; local522 <= local225; local522++) {
									for (local804 = local186; local804 <= local206; local804++) {
										Static191.anIntArrayArrayArray11[local522][local804][local161] &= ~local1226;
									}
								}
							}
						}
						if ((Static191.anIntArrayArrayArray11[local157][local251][local161] & local149) != 0) {
							local186 = local251;
							local206 = local251;
							local219 = local161;
							local225 = local161;
							while (local219 > 0 && (local149 & Static191.anIntArrayArrayArray11[local157][local251][local219 - 1]) != 0) {
								local219--;
							}
							while (local225 < 104 && (Static191.anIntArrayArrayArray11[local157][local251][local225 + 1] & local149) != 0) {
								local225++;
							}
							label459: while (local186 > 0) {
								for (local229 = local219; local229 <= local225; local229++) {
									if ((local149 & Static191.anIntArrayArrayArray11[local157][local186 - 1][local229]) == 0) {
										break label459;
									}
								}
								local186--;
							}
							label448: while (local206 < 104) {
								for (local229 = local219; local229 <= local225; local229++) {
									if ((local149 & Static191.anIntArrayArrayArray11[local157][local206 + 1][local229]) == 0) {
										break label448;
									}
								}
								local206++;
							}
							if ((local206 + 1 - local186) * (-local219 + 1 + local225) >= 4) {
								local229 = Static186.anIntArrayArrayArray2[local157][local186][local219];
								Static92.method1673(local155, 4, local186 * 128, local206 * 128 + 128, local219 * 128, local225 * 128 + 128, local229, local229);
								for (local235 = local186; local235 <= local206; local235++) {
									for (local302 = local219; local302 <= local225; local302++) {
										Static191.anIntArrayArrayArray11[local157][local235][local302] &= ~local149;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class1_Sub15 local7 = null;
		for (@Pc(12) Class1_Sub15 local12 = (Class1_Sub15) Static185.aClass87_28.method2827(); local12 != null; local12 = (Class1_Sub15) Static185.aClass87_28.method2830()) {
			if (arg1 == local12.anInt2649 && arg7 == local12.anInt2645 && local12.anInt2653 == arg6 && arg3 == local12.anInt2640) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub15();
			local7.anInt2649 = arg1;
			local7.anInt2653 = arg6;
			local7.anInt2645 = arg7;
			local7.anInt2640 = arg3;
			Static57.method1097(local7);
			Static185.aClass87_28.method2823(local7);
		}
		local7.anInt2643 = arg5;
		local7.anInt2656 = arg2;
		local7.anInt2646 = arg0;
		local7.anInt2652 = arg4;
		local7.anInt2648 = arg8;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)V")
	public static void method2594(@OriginalArg(0) boolean arg0) {
		if (Static108.aClass53_3 == null) {
			return;
		}
		try {
			@Pc(18) Class1_Sub7 local18 = new Class1_Sub7(4);
			local18.method2753(arg0 ? 2 : 3);
			local18.method2748(0);
			Static108.aClass53_3.method1717(local18.aByteArray38, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				Static108.aClass53_3.method1713();
			} catch (@Pc(48) Exception local48) {
			}
			Static108.aClass53_3 = null;
			Static49.anInt1249++;
		}
	}
}
