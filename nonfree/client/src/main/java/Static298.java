import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
	public static int anInt5840;

	@OriginalMember(owner = "client!sr", name = "D", descriptor = "[Lclient!ip;")
	public static Class53[] aClass53Array3;

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "[I")
	public static final int[] anIntArray492 = new int[250];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B[B)[B")
	public static byte[] method4991(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static361.method1335(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIBIII)V")
	public static void method4992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg4);
		@Pc(15) int local15 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg0);
		@Pc(21) int local21 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1);
		@Pc(27) int local27 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg3);
		for (@Pc(29) int local29 = local9; local29 <= local15; local29++) {
			Static39.method919(arg2, Static344.anIntArrayArray65[local29], local27, local21);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)V")
	public static void method4993(@OriginalArg(0) int arg0) {
		Static139.anInt4713 = 100;
		Static339.anInt6507 = 3;
		Static128.anInt6686 = arg0;
		Static259.anInt2903 = -1;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)I")
	public static int method4994() {
		try {
			if (Static46.anInt1505 == 0) {
				if (Static162.method3252() - 5000L < Static132.aLong97) {
					return 0;
				}
				Static46.aClass162_2 = Static15.aClass143_1.method3889(Static154.anInt3393, Static31.aString16);
				Static27.aLong30 = Static162.method3252();
				Static46.anInt1505 = 1;
			}
			if (Static27.aLong30 + 30000L < Static162.method3252()) {
				return Static237.method4334(1000);
			}
			@Pc(77) int local77;
			@Pc(118) int local118;
			if (Static46.anInt1505 == 1) {
				if (Static46.aClass162_2.anInt4801 == 2) {
					return Static237.method4334(1001);
				}
				if (Static46.aClass162_2.anInt4801 != 1) {
					return -1;
				}
				Static7.aClass148_1 = new Class148((Socket) Static46.aClass162_2.anObject5, Static15.aClass143_1);
				Static46.aClass162_2 = null;
				local77 = 0;
				Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
				if (Static195.aBoolean384) {
					local77 = Static121.anInt2759;
				}
				Static342.aClass1_Sub8_Sub1_7.method4562(23);
				Static342.aClass1_Sub8_Sub1_7.method4529(local77);
				Static7.aClass148_1.method4122(Static342.aClass1_Sub8_Sub1_7.anInt5182, Static342.aClass1_Sub8_Sub1_7.aByteArray81);
				if (Static129.aClass7_2 != null) {
					Static129.aClass7_2.method5559();
				}
				if (Static88.aClass7_1 != null) {
					Static88.aClass7_1.method5559();
				}
				local118 = Static7.aClass148_1.method4127();
				if (Static129.aClass7_2 != null) {
					Static129.aClass7_2.method5559();
				}
				if (Static88.aClass7_1 != null) {
					Static88.aClass7_1.method5559();
				}
				if (local118 != 0) {
					return Static237.method4334(local118);
				}
				Static46.anInt1505 = 2;
			}
			if (Static46.anInt1505 == 2) {
				if (Static7.aClass148_1.method4125() < 2) {
					return -1;
				}
				Static68.anInt1822 = Static7.aClass148_1.method4127();
				Static68.anInt1822 <<= 0x8;
				Static68.anInt1822 += Static7.aClass148_1.method4127();
				Static6.aByteArray3 = new byte[Static68.anInt1822];
				Static46.anInt1505 = 3;
				Static285.anInt4460 = 0;
			}
			if (Static46.anInt1505 != 3) {
				return -1;
			}
			local77 = Static7.aClass148_1.method4125();
			if (local77 < 1) {
				return -1;
			}
			if (Static68.anInt1822 - Static285.anInt4460 < local77) {
				local77 = Static68.anInt1822 - Static285.anInt4460;
			}
			Static7.aClass148_1.method4124(Static285.anInt4460, local77, Static6.aByteArray3);
			Static285.anInt4460 += local77;
			if (Static285.anInt4460 < Static68.anInt1822) {
				return -1;
			} else if (Static94.method2027(Static6.aByteArray3)) {
				Static90.aClass104_Sub1Array3 = new Class104_Sub1[Static227.anInt4728];
				local118 = 0;
				for (@Pc(225) int local225 = Static285.anInt4459; local225 <= Static351.anInt6705; local225++) {
					@Pc(231) Class104_Sub1 local231 = Static283.method4901(local225);
					if (local231 != null) {
						Static90.aClass104_Sub1Array3[local118++] = local231;
					}
				}
				Static90.anInt2261 = 0;
				Static86.aClass1_Sub39_1 = null;
				Static7.aClass148_1.method4123();
				Static175.anInt3795 = 0;
				Static7.aClass148_1 = null;
				Static6.aByteArray3 = null;
				Static46.anInt1505 = 0;
				Static132.aLong97 = Static162.method3252();
				return 0;
			} else {
				return Static237.method4334(1002);
			}
		} catch (@Pc(273) IOException local273) {
			return Static237.method4334(1003);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V")
	public static void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg1, 8);
		local8.method1869();
		local8.anInt2148 = arg2;
		local8.anInt2145 = arg0;
		local8.anInt2142 = arg3;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
	public static void method4997(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static5.anInt208 - Static154.anInt3395;
		if (local8 >= 100) {
			Static147.anInt3204 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static36.aFloat5;
		if (Static241.anInt4974 >> 8 > local19) {
			local19 = Static241.anInt4974 >> 8;
		}
		if (Static72.aBooleanArray9[4] && local19 < Static187.anIntArray369[4] + 128) {
			local19 = Static187.anIntArray369[4] + 128;
		}
		@Pc(56) int local56 = (int) Static75.aFloat13 + Static36.anInt1199 & 0x3FFF;
		Static126.method2614(Static87.anInt2179, (local19 >> 3) * 3 + 600, Static94.method2022(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108, Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109, Static242.anInt6745) - 50, Static107.anInt2547, local56, arg0, local19);
		@Pc(99) float local99 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static64.anInt1797 = (int) ((float) (Static64.anInt1797 - Static276.anInt5649) * local99 + (float) Static276.anInt5649);
		Static179.anInt3884 = (int) ((float) Static264.anInt6560 + local99 * (float) (Static179.anInt3884 - Static264.anInt6560));
		Static320.anInt5326 = (int) (local99 * (float) (Static320.anInt5326 - Static150.anInt3342) + (float) Static150.anInt3342);
		Static95.anInt2319 = (int) ((float) Static309.anInt6065 + (float) (Static95.anInt2319 - Static309.anInt6065) * local99);
		@Pc(151) int local151 = Static18.anInt555 - Static291.anInt5765;
		if (local151 > 8192) {
			local151 -= 16384;
		} else if (local151 < -8192) {
			local151 += 16384;
		}
		Static18.anInt555 = (int) (local99 * (float) local151 + (float) Static291.anInt5765);
		Static18.anInt555 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(BII)V")
	public static void method4998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub4_Sub9 local15 = Static139.method4227(arg0, 13);
		local15.method1869();
		local15.anInt2142 = arg1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILclient!aq;IIILclient!em;I)V")
	public static void method4999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class52 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg7 * arg7 + arg5 * arg5;
		if (arg0 < local16) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg3.lb / 2, arg3.anInt446 / 2);
		if (local16 <= local30 * local30) {
			Static120.method2555(arg1, arg3, arg4, arg5, Static314.aClass5Array24[arg2], arg6, arg7);
			return;
		}
		local30 -= 10;
		@Pc(56) int local56;
		if (Static147.anInt3204 == 4) {
			local56 = (int) Static75.aFloat13 & 0x3FFF;
		} else {
			local56 = (int) Static75.aFloat13 + Static337.anInt6461 & 0x3FFF;
		}
		@Pc(70) int local70 = Class1_Sub3_Sub8.anIntArray159[local56];
		@Pc(74) int local74 = Class1_Sub3_Sub8.anIntArray156[local56];
		if (Static147.anInt3204 != 4) {
			local70 = local70 * 256 / (Static287.anInt5748 + 256);
			local74 = local74 * 256 / (Static287.anInt5748 + 256);
		}
		@Pc(105) int local105 = local74 * arg5 + arg7 * local70 >> 15;
		@Pc(116) int local116 = arg7 * local74 - local70 * arg5 >> 15;
		@Pc(122) double local122 = Math.atan2((double) local105, (double) local116);
		@Pc(129) int local129 = (int) (Math.sin(local122) * (double) local30);
		@Pc(136) int local136 = (int) ((double) local30 * Math.cos(local122));
		Static9.aClass5Array1[arg2].method3624((float) local129 + (float) arg3.lb / 2.0F + (float) arg4, (float) arg3.anInt446 / 2.0F + (float) arg1 - (float) local136, 4096, (int) (-local122 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ip;[[B[[B[[I[[BZILclient!uo;II[[BBLclient!ip;)V")
	public static void method5000(@OriginalArg(0) Class53 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class32 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte[][] arg10, @OriginalArg(12) Class53 arg11) {
		for (@Pc(13) int local13 = 0; local13 < arg9; local13++) {
			@Pc(26) int local26 = arg9 - 1 > local13 ? local13 + 1 : local13;
			for (@Pc(28) int local28 = 0; local28 < arg6; local28++) {
				@Pc(45) int local45 = local28 < arg6 - 1 ? local28 + 1 : local28;
				if (Static40.method953() || Static106.method2323(local28, local13, Static141.anInt6334, arg8)) {
					@Pc(59) boolean local59 = false;
					@Pc(61) boolean local61 = false;
					@Pc(64) boolean[] local64 = new boolean[4];
					@Pc(70) int local70 = arg10[local13][local28];
					@Pc(76) int local76 = arg4[local13][local28];
					@Pc(84) int local84 = arg1[local13][local28] & 0xFF;
					@Pc(92) int local92 = arg2[local13][local28] & 0xFF;
					@Pc(100) int local100 = arg2[local13][local45] & 0xFF;
					@Pc(108) int local108 = arg2[local26][local45] & 0xFF;
					@Pc(116) int local116 = arg2[local26][local28] & 0xFF;
					if (local84 != 0 || local92 != 0) {
						@Pc(136) Class108 local136 = local84 == 0 ? null : Static2.method65(local84 - 1);
						@Pc(146) Class181 local146 = local92 == 0 ? null : Static269.method4742(local92 - 1);
						if (local70 == 0 && local136 == null) {
							local70 = 12;
						}
						@Pc(157) Class108 local157 = local136;
						if (local136 != null) {
							if (local136.anInt3153 == -1 && local136.anInt3155 == -1) {
								local157 = local136;
								local136 = null;
							} else if (local146 != null && local70 != 0) {
								local61 = local136.aBoolean300;
							}
						}
						@Pc(240) int local240;
						@Pc(289) int local289;
						@Pc(361) int local361;
						@Pc(374) int local374;
						if ((local70 == 0 || local70 == 12) && local13 > 0 && local28 > 0 && arg9 > local13 && arg6 > local28) {
							local240 = arg2[local13 - 1][local28 - 1] == local92 ? 1 : -1;
							@Pc(257) int local257 = local92 == arg2[local26][local28 - 1] ? 1 : -1;
							@Pc(270) int local270 = arg2[local26][local45] == local92 ? 1 : -1;
							local289 = local92 == arg2[local13 - 1][local45] ? 1 : -1;
							if (arg2[local13][local28 - 1] == local92) {
								local240++;
								local257++;
							} else {
								local257--;
								local240--;
							}
							if (arg2[local26][local28] == local92) {
								local257++;
								local270++;
							} else {
								local257--;
								local270--;
							}
							if (local92 == arg2[local13][local45]) {
								local270++;
								local289++;
							} else {
								local289--;
								local270--;
							}
							if (local92 == arg2[local13 - 1][local28]) {
								local289++;
								local240++;
							} else {
								local289--;
								local240--;
							}
							local361 = local240 - local270;
							if (local361 < 0) {
								local361 = -local361;
							}
							local374 = local257 - local289;
							if (local374 < 0) {
								local374 = -local374;
							}
							if (local374 == local361) {
								local361 = arg0.method2785(local13, local28) - arg0.method2785(local26, local45);
								if (local361 < 0) {
									local361 = -local361;
								}
								local374 = arg0.method2785(local26, local28) - arg0.method2785(local13, local45);
								if (local374 < 0) {
									local374 = -local374;
								}
							}
							local76 = local361 < local374 ? 1 : 0;
						}
						for (local240 = 0; local240 < 13; local240++) {
							Static294.anIntArray482[local240] = -1;
							Static129.anIntArray256[local240] = 1;
						}
						@Pc(460) boolean[] local460 = local136 != null && local136.aBoolean300 ? Static222.aBooleanArrayArray5[local70] : Static38.aBooleanArrayArray1[local70];
						Static293.method4940(local13, local70, arg4, arg10, local76, local64, arg7, arg1, arg9, local28, local136, arg6, local146);
						@Pc(486) boolean local486 = local136 != null && local136.anInt3155 != local136.anInt3153;
						if (!local486) {
							for (local289 = 0; local289 < 8; local289++) {
								if (Static294.anIntArray482[local289] >= 0 && Static226.anIntArray420[local289] != Static240.anIntArray194[local289]) {
									local486 = true;
									break;
								}
							}
						}
						if (!local460[local76 + 1 & 0x3]) {
							local64[1] = Static177.method3704(local64[1], (Static129.anIntArray256[4] & Static129.anIntArray256[2]) == 0);
						}
						if (!local460[local76 + 3 & 0x3]) {
							local64[3] = Static177.method3704(local64[3], (Static129.anIntArray256[6] & Static129.anIntArray256[0]) == 0);
						}
						if (!local460[local76 & 0x3]) {
							local64[0] = Static177.method3704(local64[0], (Static129.anIntArray256[0] & Static129.anIntArray256[2]) == 0);
						}
						if (!local460[local76 + 2 & 0x3]) {
							local64[2] = Static177.method3704(local64[2], (Static129.anIntArray256[6] & Static129.anIntArray256[4]) == 0);
						}
						if (!local61 && (local70 == 0 || local70 == 12)) {
							if (local64[0] && !local64[1] && !local64[2] && local64[3]) {
								local70 = local70 == 0 ? 13 : 14;
								local64[0] = local64[3] = false;
								local76 = 0;
							} else if (local64[0] && local64[1] && !local64[2] && !local64[3]) {
								local64[0] = local64[1] = false;
								local76 = 3;
								local70 = local70 == 0 ? 13 : 14;
							} else if (!local64[0] && local64[1] && local64[2] && !local64[3]) {
								local64[1] = local64[2] = false;
								local70 = local70 == 0 ? 13 : 14;
								local76 = 2;
							} else if (!local64[0] && !local64[1] && local64[2] && local64[3]) {
								local76 = 1;
								local64[2] = local64[3] = false;
								local70 = local70 == 0 ? 13 : 14;
							}
						}
						@Pc(797) boolean local797 = !local61 && !local64[0] && !local64[2] && !local64[1] && !local64[3];
						@Pc(799) int[] local799 = null;
						@Pc(811) int[] local811;
						@Pc(819) int[] local819;
						@Pc(807) int[] local807;
						if (local797) {
							local807 = Static128.anIntArrayArray66[local70];
							local811 = Static341.anIntArrayArray64[local70];
							local819 = Static156.anIntArrayArray38[local70];
							local374 = local136 == null ? 0 : Static51.anIntArray120[local70];
							local361 = local146 == null ? 0 : Static46.anIntArray117[local70];
						} else if (local61) {
							local819 = Static99.anIntArrayArray26[local70];
							local374 = local136 == null ? 0 : Static21.anIntArray77[local70];
							local807 = Static171.anIntArrayArray42[local70];
							local799 = Static27.anIntArrayArray7[local70];
							local361 = local146 == null ? 0 : Static251.anIntArray418[local70];
							local811 = Static21.anIntArrayArray6[local70];
						} else {
							local807 = Static199.anIntArrayArray46[local70];
							local811 = Static31.anIntArrayArray9[local70];
							local799 = Static16.anIntArrayArray3[local70];
							local819 = Static157.anIntArrayArray54[local70];
							local361 = local146 == null ? 0 : Static204.anIntArray393[local70];
							local374 = local136 == null ? 0 : Static41.anIntArray105[local70];
						}
						@Pc(901) int local901 = local361 + local374;
						if (local901 <= 0) {
							Static269.method4738(arg8, local13, local28);
						} else {
							if (local64[0]) {
								local901++;
							}
							if (local64[2]) {
								local901++;
							}
							if (local64[1]) {
								local901++;
							}
							if (local64[3]) {
								local901++;
							}
							@Pc(934) int local934 = 0;
							@Pc(936) int local936 = 0;
							@Pc(940) int local940 = local901 * 3;
							@Pc(947) int[] local947 = arg5 ? new int[local940] : null;
							@Pc(954) int[] local954 = local486 ? new int[local940] : null;
							@Pc(957) int[] local957 = new int[local940];
							@Pc(960) int[] local960 = new int[local940];
							@Pc(963) int[] local963 = new int[local940];
							@Pc(966) int[] local966 = new int[local940];
							@Pc(969) int[] local969 = new int[local940];
							@Pc(971) int local971 = -1;
							@Pc(973) int local973 = -1;
							@Pc(975) int local975 = 256;
							@Pc(1045) byte local1045;
							@Pc(999) int local999;
							@Pc(1001) int local1001;
							@Pc(1233) int local1233;
							@Pc(1239) int local1239;
							@Pc(1248) int local1248;
							@Pc(1252) int local1252;
							@Pc(1256) int local1256;
							@Pc(1333) int local1333;
							@Pc(1341) int local1341;
							if (local136 != null) {
								local971 = local136.anInt3153;
								local973 = arg7.method2178() ? local136.anInt3150 : local136.anInt3158;
								local975 = local136.anInt3156;
								local999 = Static343.method5441(arg7, local136);
								for (local1001 = 0; local1001 < local374; local1001++) {
									if (local64[-local76 & 0x3] && local799[0] == local934) {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = 1;
										Static172.anIntArray342[2] = local807[local934];
										Static172.anIntArray342[3] = 1;
										Static172.anIntArray342[4] = local819[local934];
										local1045 = 6;
										Static172.anIntArray342[5] = local807[local934];
									} else if (local64[2 - local76 & 0x3] && local934 == local799[2]) {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = 5;
										Static172.anIntArray342[2] = local807[local934];
										Static172.anIntArray342[3] = 5;
										Static172.anIntArray342[4] = local819[local934];
										Static172.anIntArray342[5] = local807[local934];
										local1045 = 6;
									} else if (local64[1 - local76 & 0x3] && local799[1] == local934) {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = 3;
										Static172.anIntArray342[2] = local807[local934];
										Static172.anIntArray342[3] = 3;
										Static172.anIntArray342[4] = local819[local934];
										local1045 = 6;
										Static172.anIntArray342[5] = local807[local934];
									} else if (local64[3 - local76 & 0x3] && local934 == local799[3]) {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = 7;
										Static172.anIntArray342[2] = local807[local934];
										Static172.anIntArray342[3] = 7;
										Static172.anIntArray342[4] = local819[local934];
										local1045 = 6;
										Static172.anIntArray342[5] = local807[local934];
									} else {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = local819[local934];
										Static172.anIntArray342[2] = local807[local934];
										local1045 = 3;
									}
									for (local1233 = 0; local1233 < local1045; local1233++) {
										local1239 = Static172.anIntArray342[local1233];
										local1248 = local1239 - local76 * 2 & 0x7;
										local1252 = Static309.anIntArray497[local1239];
										local1256 = Static121.anIntArray250[local1239];
										if (local76 == 1) {
											local957[local936] = local1256;
											local960[local936] = 128 - local1252;
										} else if (local76 == 2) {
											local957[local936] = 128 - local1252;
											local960[local936] = 128 - local1256;
										} else if (local76 == 3) {
											local957[local936] = 128 - local1256;
											local960[local936] = local1252;
										} else {
											local957[local936] = local1252;
											local960[local936] = local1256;
										}
										if (arg5 && Static240.aBooleanArrayArray3[local70][local1239]) {
											local1333 = (local13 << 7) + local957[local936];
											local1341 = local960[local936] + (local28 << 7);
											local947[local936] = arg11.method2792(local1333, local1341) - arg0.method2792(local1333, local1341);
										}
										if (local1239 < 8 && local136.anInt3148 < Static294.anIntArray482[local1248]) {
											if (local954 != null) {
												local954[local936] = Static240.anIntArray194[local1248];
											}
											local969[local936] = Static289.anIntArray449[local1248];
											local966[local936] = Static112.anIntArray245[local1248];
											local963[local936] = Static226.anIntArray420[local1248];
										} else {
											if (local954 != null) {
												local954[local936] = local999;
											}
											local966[local936] = arg7.method2178() ? local136.anInt3150 : local136.anInt3158;
											local969[local936] = local136.anInt3156;
											local963[local936] = local971;
										}
										local936++;
									}
									local934++;
								}
								if (!arg5 && arg8 == 0) {
									Static179.method3547(local13, local28, local136.anInt3157, local136.anInt3149 * 8);
								}
								if (local70 != 12 && local136.anInt3153 != -1 && local136.aBoolean303) {
									local59 = true;
								}
							} else if (local797) {
								local934 = Static51.anIntArray120[local70];
							} else if (local61) {
								local934 = Static21.anIntArray77[local70];
							} else {
								local934 = Static41.anIntArray105[local70];
							}
							if (local146 != null) {
								if (local100 == 0) {
									local100 = local92;
								}
								if (local116 == 0) {
									local116 = local92;
								}
								if (local108 == 0) {
									local108 = local92;
								}
								@Pc(1516) Class181 local1516 = Static269.method4742(local92 - 1);
								@Pc(1522) Class181 local1522 = Static269.method4742(local100 - 1);
								@Pc(1528) Class181 local1528 = Static269.method4742(local108 - 1);
								@Pc(1534) Class181 local1534 = Static269.method4742(local116 - 1);
								for (local1248 = 0; local1248 < local361; local1248++) {
									if (local64[-local76 & 0x3] && local799[0] == local934) {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = 1;
										Static172.anIntArray342[2] = local807[local934];
										Static172.anIntArray342[3] = 1;
										Static172.anIntArray342[4] = local819[local934];
										Static172.anIntArray342[5] = local807[local934];
										local1045 = 6;
									} else if (local64[2 - local76 & 0x3] && local799[2] == local934) {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = 5;
										Static172.anIntArray342[2] = local807[local934];
										Static172.anIntArray342[3] = 5;
										Static172.anIntArray342[4] = local819[local934];
										local1045 = 6;
										Static172.anIntArray342[5] = local807[local934];
									} else if (local64[1 - local76 & 0x3] && local934 == local799[1]) {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = 3;
										Static172.anIntArray342[2] = local807[local934];
										Static172.anIntArray342[3] = 3;
										Static172.anIntArray342[4] = local819[local934];
										local1045 = 6;
										Static172.anIntArray342[5] = local807[local934];
									} else if (local64[3 - local76 & 0x3] && local934 == local799[3]) {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = 7;
										Static172.anIntArray342[2] = local807[local934];
										Static172.anIntArray342[3] = 7;
										Static172.anIntArray342[4] = local819[local934];
										Static172.anIntArray342[5] = local807[local934];
										local1045 = 6;
									} else {
										Static172.anIntArray342[0] = local811[local934];
										Static172.anIntArray342[1] = local819[local934];
										Static172.anIntArray342[2] = local807[local934];
										local1045 = 3;
									}
									for (local1252 = 0; local1252 < local1045; local1252++) {
										local1256 = Static172.anIntArray342[local1252];
										local1333 = local1256 - local76 * 2 & 0x7;
										local1341 = Static309.anIntArray497[local1256];
										@Pc(1791) int local1791 = Static121.anIntArray250[local1256];
										@Pc(1796) int local1796;
										@Pc(1801) int local1801;
										if (local76 == 1) {
											local1796 = local1791;
											local1801 = 128 - local1341;
										} else if (local76 == 2) {
											local1796 = 128 - local1341;
											local1801 = 128 - local1791;
										} else if (local76 == 3) {
											local1796 = 128 - local1791;
											local1801 = local1341;
										} else {
											local1796 = local1341;
											local1801 = local1791;
										}
										local957[local936] = local1796;
										local960[local936] = local1801;
										@Pc(1857) int local1857;
										@Pc(1863) int local1863;
										if (arg5 && Static240.aBooleanArrayArray3[local70][local1256]) {
											local1857 = local1796 + (local13 << 7);
											local1863 = local1801 + (local28 << 7);
											local947[local936] = arg11.method2792(local1857, local1863) - arg0.method2792(local1857, local1863);
										}
										if (local1256 < 8 && Static294.anIntArray482[local1333] >= 0) {
											if (local954 != null) {
												local954[local936] = Static240.anIntArray194[local1333];
											}
											local969[local936] = Static289.anIntArray449[local1333];
											local966[local936] = Static112.anIntArray245[local1333];
											local963[local936] = Static226.anIntArray420[local1333];
										} else {
											if (local61 && Static240.aBooleanArrayArray3[local70][local1256]) {
												local966[local936] = local973;
												local969[local936] = local975;
												local963[local936] = local971;
											} else if (local1796 == 0 && local1801 == 0) {
												local963[local936] = arg3[local13][local28];
												local966[local936] = local1516.anInt5618;
												local969[local936] = local1516.anInt5616;
											} else if (local1796 == 0 && local1801 == 128) {
												local963[local936] = arg3[local13][local45];
												local966[local936] = local1522.anInt5618;
												local969[local936] = local1522.anInt5616;
											} else if (local1796 == 128 && local1801 == 128) {
												local963[local936] = arg3[local26][local45];
												local966[local936] = local1528.anInt5618;
												local969[local936] = local1528.anInt5616;
											} else if (local1796 == 128 && local1801 == 0) {
												local963[local936] = arg3[local26][local28];
												local966[local936] = local1534.anInt5618;
												local969[local936] = local1534.anInt5616;
											} else {
												if (local1796 < 64) {
													if (local1801 >= 64) {
														local966[local936] = local1522.anInt5618;
														local969[local936] = local1522.anInt5616;
													} else {
														local966[local936] = local1516.anInt5618;
														local969[local936] = local1516.anInt5616;
													}
												} else if (local1801 >= 64) {
													local966[local936] = local1528.anInt5618;
													local969[local936] = local1528.anInt5616;
												} else {
													local966[local936] = local1534.anInt5618;
													local969[local936] = local1534.anInt5616;
												}
												local1857 = Static55.method1434(local1796 << 7 >> 7, arg3[local26][local28], arg3[local13][local28]);
												local1863 = Static55.method1434(local1796 << 7 >> 7, arg3[local26][local45], arg3[local13][local45]);
												local963[local936] = Static55.method1434(local1801 << 7 >> 7, local1863, local1857);
											}
											if (local954 != null) {
												local954[local936] = local963[local936];
											}
										}
										local936++;
									}
									local934++;
								}
								if (local70 != 0 && local146.aBoolean545) {
									local59 = true;
								}
							}
							local999 = arg0.method2785(local13, local28);
							local1001 = arg0.method2785(local26, local28);
							local1233 = arg0.method2785(local26, local45);
							local1239 = arg0.method2785(local13, local45);
							if (arg8 > 0) {
								@Pc(2212) boolean local2212 = true;
								if (local92 == 0 && local70 != 0) {
									local2212 = false;
								}
								if (local84 > 0 && local157 != null && !local157.aBoolean301) {
									local2212 = false;
								}
								if (local2212 && local999 == local1001 && local999 == local1233 && local1239 == local999) {
									Static64.aByteArrayArrayArray2[arg8][local13][local28] = (byte) (Static64.aByteArrayArrayArray2[arg8][local13][local28] | 0x4);
								}
							}
							local1248 = 0;
							local1252 = 0;
							if (arg5) {
								local1248 = Static296.method4975(local13, local28);
								local1252 = Static57.method1494(local13, local28);
							}
							arg0.method2790(local13, local28, local957, local947, local960, local963, local954, local966, local969, local1248, local1252, local59);
							Static269.method4738(arg8, local13, local28);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!uo;Lclient!pc;IIIII)V")
	public static void method5001(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static113.anInt2651) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static242.anInt6744) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static315.anInt6124 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class194 local62 = Static77.aClass194ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (aClass53Array3[local17].method2785(local23, local32) + aClass53Array3[local17].method2785(local23 + 1, local32) + aClass53Array3[local17].method2785(local23, local32 + 1) + aClass53Array3[local17].method2785(local23 + 1, local32 + 1)) / 4 - (aClass53Array3[arg2].method2785(arg3, arg4) + aClass53Array3[arg2].method2785(arg3 + 1, arg4) + aClass53Array3[arg2].method2785(arg3, arg4 + 1) + aClass53Array3[arg2].method2785(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class17_Sub4 local143 = local62.aClass17_Sub4_1;
									@Pc(146) Class17_Sub4 local146 = local62.aClass17_Sub4_2;
									if (local143 != null && local143.method4778()) {
										arg1.method4786(arg0, (local32 - arg4) * 128 + (1 - arg6) * 64, (local23 - arg3) * 128 + (1 - arg5) * 64, local140, local1, local143);
									}
									if (local146 != null && local146.method4778()) {
										arg1.method4786(arg0, (local32 - arg4) * 128 + (1 - arg6) * 64, (local23 - arg3) * 128 + (1 - arg5) * 64, local140, local1, local146);
									}
									for (@Pc(219) Class126 local219 = local62.aClass126_2; local219 != null; local219 = local219.aClass126_1) {
										@Pc(223) Class17_Sub1 local223 = local219.aClass17_Sub1_1;
										if (local223 != null && local223.method4778() && (local23 == local223.aShort75 || local23 == local3) && (local32 == local223.aShort77 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort74 + 1 - local223.aShort75;
											@Pc(260) int local260 = local223.aShort76 + 1 - local223.aShort77;
											arg1.method4786(arg0, (local223.aShort77 - arg4) * 128 + (local260 - arg6) * 64, (local223.aShort75 - arg3) * 128 + (local252 - arg5) * 64, local140, local1, local223);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
