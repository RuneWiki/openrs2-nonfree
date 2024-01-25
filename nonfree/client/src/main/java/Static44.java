import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Lclient!wd;")
	public static final Class210 aClass210_3 = new Class210();

	@OriginalMember(owner = "client!co", name = "s", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!co", name = "u", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	public static void method663() {
		Static102.method1554(false);
		Static9.anInt154 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static178.aByteArrayArray25.length; local14++) {
			if (Static293.anIntArray451[local14] != -1 && Static178.aByteArrayArray25[local14] == null) {
				Static178.aByteArrayArray25[local14] = Static316.aClass144_100.method3896(0, Static293.anIntArray451[local14]);
				if (Static178.aByteArrayArray25[local14] == null) {
					Static9.anInt154++;
					local12 = false;
				}
			}
			if (Static211.anIntArray332[local14] != -1 && Static311.aByteArrayArray6[local14] == null) {
				Static311.aByteArrayArray6[local14] = Static316.aClass144_100.method3899(0, Static211.anIntArray332[local14], Static253.anIntArrayArray57[local14]);
				if (Static311.aByteArrayArray6[local14] == null) {
					Static9.anInt154++;
					local12 = false;
				}
			}
			if (Static217.anIntArray339[local14] != -1 && Static245.aByteArrayArray49[local14] == null) {
				Static245.aByteArrayArray49[local14] = Static316.aClass144_100.method3896(0, Static217.anIntArray339[local14]);
				if (Static245.aByteArrayArray49[local14] == null) {
					local12 = false;
					Static9.anInt154++;
				}
			}
			if (Static70.anIntArray89[local14] != -1 && Static114.aByteArrayArray18[local14] == null) {
				Static114.aByteArrayArray18[local14] = Static316.aClass144_100.method3896(0, Static70.anIntArray89[local14]);
				if (Static114.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static9.anInt154++;
				}
			}
			if (Static131.anIntArray171 != null && Static82.aByteArrayArray13[local14] == null && Static131.anIntArray171[local14] != -1) {
				Static82.aByteArrayArray13[local14] = Static316.aClass144_100.method3899(0, Static131.anIntArray171[local14], Static253.anIntArrayArray57[local14]);
				if (Static82.aByteArrayArray13[local14] == null) {
					Static9.anInt154++;
					local12 = false;
				}
			}
		}
		if (Static22.aClass199_1 == null) {
			if (Static226.aClass11_Sub4_Sub7_3 == null || !Static225.aClass144_74.method3892(Static226.aClass11_Sub4_Sub7_3.aString20 + "_staticelements")) {
				Static22.aClass199_1 = new Class199(0);
			} else if (Static225.aClass144_74.method3900(Static226.aClass11_Sub4_Sub7_3.aString20 + "_staticelements")) {
				Static22.aClass199_1 = Static33.method467(Static220.aBoolean298, Static226.aClass11_Sub4_Sub7_3.aString20 + "_staticelements", Static225.aClass144_74);
			} else {
				local12 = false;
				Static9.anInt154++;
			}
		}
		if (!local12) {
			Static252.anInt5975 = 1;
			return;
		}
		Static106.anInt1980 = 0;
		local12 = true;
		@Pc(271) int local271;
		@Pc(282) int local282;
		for (@Pc(252) int local252 = 0; local252 < Static178.aByteArrayArray25.length; local252++) {
			@Pc(258) byte[] local258 = Static311.aByteArrayArray6[local252];
			if (local258 != null) {
				local271 = (Static157.anIntArray201[local252] >> 8) * 64 - Static182.anInt3662;
				local282 = (Static157.anIntArray201[local252] & 0xFF) * 64 - Static169.anInt6312;
				if (Static325.aBoolean81) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static348.method5639(local258, local271, local282);
			}
			local258 = Static114.aByteArrayArray18[local252];
			if (local258 != null) {
				local271 = (Static157.anIntArray201[local252] >> 8) * 64 - Static182.anInt3662;
				local282 = (Static157.anIntArray201[local252] & 0xFF) * 64 - Static169.anInt6312;
				if (Static325.aBoolean81) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static348.method5639(local258, local271, local282);
			}
		}
		if (!local12) {
			Static252.anInt5975 = 2;
			return;
		}
		if (Static252.anInt5975 != 0) {
			Static151.method2279(Static30.aClass9_1, true, Static349.aClass117_119.method2684(Static230.anInt4634) + "<br>(100%)");
		}
		Static168.method2723();
		Static42.method638();
		@Pc(376) boolean local376 = false;
		if (Static107.aClass129_4.method5021() && Static36.aBoolean36) {
			for (local271 = 0; local271 < Static178.aByteArrayArray25.length; local271++) {
				if (Static114.aByteArrayArray18[local271] != null || Static245.aByteArrayArray49[local271] != null) {
					local376 = true;
					break;
				}
			}
		}
		if (Static117.aBoolean145) {
			local271 = Static29.anIntArray33[Static7.anInt71];
		} else {
			local271 = Static285.anIntArray439[Static7.anInt71];
		}
		if (Static107.aClass129_4.method5022()) {
			local271++;
		}
		Static87.method1247(Static24.anInt454, Static240.anInt4832, local271, local376, Static107.aClass129_4.method5000() > 0);
		for (local282 = 0; local282 < 4; local282++) {
			Static211.aClass92Array1[local282].method1770();
		}
		Static77.method5671();
		Static352.method5666(false);
		Static145.method2209();
		Static168.method2723();
		System.gc();
		Static102.method1554(true);
		Static242.method4804(4, false);
		@Pc(470) int[][] local470 = null;
		if (!Static325.aBoolean81) {
			Static221.method3950(false);
			Static20.method302(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0] >> 3, Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] >> 3);
			Static217.method3920();
			Static184.method3188(4, Static107.aClass129_4, false, null);
			local470 = Static263.anIntArrayArrayArray13[0];
			Static102.method1554(true);
			Static166.method2686(false);
			if (Static82.aByteArrayArray13 != null) {
				Static282.method4709();
			}
		}
		if (Static325.aBoolean81) {
			Static314.method1711(false);
			Static20.method302(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0] >> 3, Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] >> 3);
			Static217.method3920();
			Static184.method3188(4, Static107.aClass129_4, false, null);
			local470 = Static263.anIntArrayArrayArray13[0];
			Static102.method1554(true);
			Static27.method388(false);
		}
		Static42.method638();
		Static102.method1554(true);
		Static51.method732(false, null, 4, Static211.aClass92Array1, Static107.aClass129_4);
		Static120.method1444(4, Static107.aClass129_4);
		Static102.method1554(true);
		@Pc(571) int local571 = Static217.anInt4442;
		if (local571 > Static322.anInt6250) {
			local571 = Static322.anInt6250;
		}
		if (local571 < Static322.anInt6250 - 1) {
			local571 = Static322.anInt6250 - 1;
		}
		if (Static283.method4712()) {
			Static106.method1619(0);
		} else {
			Static106.method1619(local571);
		}
		Static288.method4788();
		if (local376) {
			Static355.method5699(true);
			Static242.method4804(1, true);
			if (!Static325.aBoolean81) {
				Static221.method3950(true);
				Static184.method3188(1, Static107.aClass129_4, true, local470);
				Static102.method1554(true);
				Static166.method2686(true);
				Static120.method1444(1, Static107.aClass129_4);
			}
			if (Static325.aBoolean81) {
				Static314.method1711(true);
				Static184.method3188(1, Static107.aClass129_4, true, local470);
				Static102.method1554(true);
				Static27.method388(true);
			}
			Static42.method638();
			Static102.method1554(true);
			Static51.method732(true, Static129.aClass77Array3[0], 1, Static211.aClass92Array1, Static107.aClass129_4);
			Static120.method1444(1, Static107.aClass129_4);
			Static102.method1554(true);
			Static288.method4788();
			Static355.method5699(false);
		}
		@Pc(677) int local677;
		@Pc(681) int local681;
		for (@Pc(673) int local673 = 0; local673 < 4; local673++) {
			for (local677 = 0; local677 < Static24.anInt454; local677++) {
				for (local681 = 0; local681 < Static240.anInt4832; local681++) {
					Static212.method3826(local673, local681, local677);
				}
			}
		}
		Static76.method4698();
		Static168.method2723();
		Static101.method1494();
		Static42.method638();
		Static88.aBoolean94 = false;
		Static69.method1038();
		if (Static241.aFrame2 != null && Static291.aClass156_103 != null && Static245.anInt6561 == 25) {
			Static313.aClass11_Sub25_Sub1_5.method2454(151);
			Static313.aClass11_Sub25_Sub1_5.method5168(1057001181);
		}
		if (!Static325.aBoolean81) {
			local677 = (Static16.anInt277 - (Static24.anInt454 >> 4)) / 8;
			local681 = ((Static24.anInt454 >> 4) + Static16.anInt277) / 8;
			@Pc(771) int local771 = (Static19.anInt1986 - (Static240.anInt4832 >> 4)) / 8;
			@Pc(779) int local779 = (Static19.anInt1986 + (Static240.anInt4832 >> 4)) / 8;
			for (@Pc(783) int local783 = local677 - 1; local783 <= local681 + 1; local783++) {
				for (@Pc(789) int local789 = local771 - 1; local789 <= local779 + 1; local789++) {
					if (local677 > local783 || local681 < local783 || local789 < local771 || local789 > local779) {
						Static316.aClass144_100.method3906("m" + local783 + "_" + local789);
						Static316.aClass144_100.method3906("l" + local783 + "_" + local789);
					}
				}
			}
		}
		if (Static245.anInt6561 == 28) {
			Static284.method4731(10);
		} else {
			Static284.method4731(30);
			if (Static291.aClass156_103 != null) {
				Static313.aClass11_Sub25_Sub1_5.method2454(197);
			}
		}
		Static342.method5582();
		Static168.method2723();
		Static277.method4683();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZIBI[Lclient!hh;ILclient!uo;I[B)[I")
	public static int[] method664(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class92[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class129 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (!arg1) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class92 local15 = arg4[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local27 = local17 + arg5;
						local31 = local21 + arg3;
						if (local27 >= 0 && Static24.anInt454 > local27 && local31 >= 0 && Static240.anInt4832 > local31) {
							local15.method1755(local31, local27);
						}
					}
				}
			}
		}
		@Pc(65) Class11_Sub25 local65 = new Class11_Sub25(arg8);
		@Pc(70) int local70 = arg7 + arg5;
		local17 = arg2 + arg3;
		for (local21 = 0; local21 < arg0; local21++) {
			for (local27 = 0; local27 < 64; local27++) {
				for (local31 = 0; local31 < 64; local31++) {
					Static300.method5112(local31 + arg3, 0, local21, local70 + local27, 0, 0, false, local31 + local17, arg5 + local27, local65, arg1);
				}
			}
		}
		@Pc(132) boolean local132 = false;
		@Pc(134) boolean local134 = false;
		@Pc(140) int local140;
		@Pc(163) int local163;
		@Pc(205) int local205;
		@Pc(209) int local209;
		@Pc(257) int local257;
		@Pc(211) int local211;
		while (local65.aByteArray93.length > local65.anInt6076) {
			local140 = local65.method5185();
			if (local140 == 128) {
				Static193.anIntArray304[0] = local65.method5187();
				Static193.anIntArray304[1] = local65.method5220();
				Static193.anIntArray304[2] = local65.method5220();
				Static193.anIntArray304[3] = local65.method5220();
				Static193.anIntArray304[4] = local65.method5187();
				local132 = true;
			} else {
				if (local140 != 129) {
					local65.anInt6076--;
					break;
				}
				if (Static128.aByteArrayArrayArray4 == null) {
					Static128.aByteArrayArrayArray4 = new byte[4][][];
				}
				for (local163 = 0; local163 < 4; local163++) {
					@Pc(169) byte local169 = local65.method5175();
					if (local169 == 0 && Static128.aByteArrayArrayArray4[local163] != null) {
						local205 = arg5;
						local209 = arg5 + 64;
						local211 = arg3;
						if (arg3 < 0) {
							local211 = 0;
						} else if (Static240.anInt4832 <= arg3) {
							local211 = Static240.anInt4832;
						}
						if (local209 < 0) {
							local209 = 0;
						} else if (local209 >= Static24.anInt454) {
							local209 = Static24.anInt454;
						}
						if (arg5 < 0) {
							local205 = 0;
						} else if (arg5 >= Static24.anInt454) {
							local205 = Static24.anInt454;
						}
						local257 = arg3 + 64;
						if (local257 < 0) {
							local257 = 0;
						} else if (Static240.anInt4832 <= local257) {
							local257 = Static240.anInt4832;
						}
						while (local205 < local209) {
							while (local211 < local257) {
								Static128.aByteArrayArrayArray4[local163][local205][local211] = 0;
								local211++;
							}
							local205++;
						}
					} else if (local169 == 1) {
						if (Static128.aByteArrayArrayArray4[local163] == null) {
							Static128.aByteArrayArrayArray4[local163] = new byte[Static24.anInt454 + 1][Static240.anInt4832 + 1];
						}
						for (local205 = 0; local205 < 64; local205 += 4) {
							for (local209 = 0; local209 < 64; local209 += 4) {
								@Pc(325) byte local325 = local65.method5175();
								for (local257 = arg5 + local205; local257 < local205 + arg5 + 4; local257++) {
									for (@Pc(336) int local336 = local209 + arg3; local336 < arg3 + local209 + 4; local336++) {
										if (local257 >= 0 && local257 < Static24.anInt454 && local336 >= 0 && local336 < Static240.anInt4832) {
											Static128.aByteArrayArrayArray4[local163][local257][local336] = local325;
										}
									}
								}
							}
						}
					} else if (local169 == 2) {
						if (Static128.aByteArrayArrayArray4[local163] == null) {
							Static128.aByteArrayArrayArray4[local163] = new byte[Static24.anInt454 + 1][Static240.anInt4832 + 1];
						}
						if (local163 > 0) {
							local205 = arg5;
							local209 = arg5 + 64;
							local211 = arg3;
							if (arg3 < 0) {
								local211 = 0;
							} else if (arg3 >= Static240.anInt4832) {
								local211 = Static240.anInt4832;
							}
							if (arg5 < 0) {
								local205 = 0;
							} else if (arg5 >= Static24.anInt454) {
								local205 = Static24.anInt454;
							}
							if (local209 < 0) {
								local209 = 0;
							} else if (Static24.anInt454 <= local209) {
								local209 = Static24.anInt454;
							}
							local257 = arg3 + 64;
							if (local257 < 0) {
								local257 = 0;
							} else if (local257 >= Static240.anInt4832) {
								local257 = Static240.anInt4832;
							}
							while (local205 < local209) {
								while (local257 > local211) {
									Static128.aByteArrayArrayArray4[local163][local205][local211] = Static128.aByteArrayArrayArray4[local163 - 1][local205][local211];
									local211++;
								}
								local205++;
							}
						}
					}
				}
				local134 = true;
			}
		}
		@Pc(590) int local590;
		if (!arg1) {
			@Pc(546) Class214 local546 = null;
			while (true) {
				while (local65.aByteArray93.length > local65.anInt6076) {
					local163 = local65.method5185();
					if (local163 == 0) {
						local546 = new Class214(local65);
					} else if (local163 == 1) {
						local590 = local65.method5185();
						if (local590 > 0) {
							for (local205 = 0; local205 < local590; local205++) {
								@Pc(601) Class11_Sub5_Sub1 local601 = new Class11_Sub5_Sub1(local65);
								if (local601.anInt1302 == 31) {
									@Pc(611) Class13 local611 = Static208.method5453(local65.method5187());
									local601.method1044(local611.anInt222, local611.anInt220, local611.anInt225, local611.anInt226);
								}
								local601.anInt1285 += arg5 << 7;
								local601.anInt1286 += arg3 << 7;
								local211 = local601.anInt1285 >> 7;
								local257 = local601.anInt1286 >> 7;
								if (local211 >= 0 && local257 >= 0 && Static24.anInt454 > local211 && Static240.anInt4832 > local257) {
									local601.anInt1287 = Static263.anIntArrayArrayArray13[local601.anInt1306][local211][local257] - local601.anInt1287;
									if (arg6.method5000() > 0) {
										Static267.method4624(local601);
									}
								}
							}
						}
					} else if (local163 == 2) {
						if (local546 == null) {
							local546 = new Class214();
						}
						local546.method5662(local65);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local546 != null) {
					for (local163 = 0; local163 < 8; local163++) {
						for (local590 = 0; local590 < 8; local590++) {
							local205 = local163 + (arg5 >> 3);
							local209 = local590 + (arg3 >> 3);
							if (local205 >= 0 && Static24.anInt454 >> 3 > local205 && local209 >= 0 && Static240.anInt4832 >> 3 > local209) {
								Static225.method4019(local546, local205, local209);
							}
						}
					}
				}
				break;
			}
		}
		if (!local134 && Static128.aByteArrayArrayArray4 != null) {
			for (local140 = 0; local140 < 4; local140++) {
				if (Static128.aByteArrayArrayArray4[local140] != null) {
					for (local163 = 0; local163 < 16; local163++) {
						for (local590 = 0; local590 < 16; local590++) {
							local205 = (arg5 >> 2) + local163;
							local209 = local590 + (arg3 >> 2);
							if (local205 >= 0 && local205 < 26 && local209 >= 0 && local209 < 26) {
								Static128.aByteArrayArrayArray4[local140][local205][local209] = 0;
							}
						}
					}
				}
			}
		}
		if (local132) {
			return Static193.anIntArray304;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([JI[IZI)V")
	public static void method665(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local16;
		@Pc(30) int local30 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local30;
		for (@Pc(42) int local42 = arg3; local42 < arg1; local42++) {
			if (arg0[local42] < (long) (local42 & 0x1) + local16) {
				@Pc(59) long local59 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local59;
				@Pc(73) int local73 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12++] = local73;
			}
		}
		arg0[arg1] = arg0[local12];
		arg0[local12] = local16;
		arg2[arg1] = arg2[local12];
		arg2[local12] = local30;
		method665(arg0, local12 - 1, arg2, arg3);
		method665(arg0, arg1, arg2, local12 + 1);
	}
}
