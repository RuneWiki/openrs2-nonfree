import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "Lclient!h;")
	public static Class1_Sub9_Sub1 aClass1_Sub9_Sub1_33;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "J")
	public static long aLong127 = 0L;

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "Lclient!rb;")
	public static Class60 aClass60_87 = new Class60(64);

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1674 = Static106.method1849("Registrierter Benutzer");

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "Lclient!rb;")
	public static Class60 aClass60_88 = new Class60(30);

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1675 = Static106.method1849("p11_full");

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
	public static int anInt2851 = 0;

	@OriginalMember(owner = "client!gd", name = "R", descriptor = "Lclient!sb;")
	public static Class65 aClass65_43 = new Class65(32);

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1676 = Static106.method1849("(U2");

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
	public static int anInt2852 = -1;

	@OriginalMember(owner = "client!gd", name = "V", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1677 = Static106.method1849("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III[B)Lclient!sc;")
	public static Class66 method2001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) Class66 local9 = new Class66();
		local9.aByteArray29 = new byte[arg1];
		local9.anInt2583 = 0;
		for (@Pc(18) int local18 = arg0; local18 < arg1 + arg0; local18++) {
			if (arg2[local18] != 0) {
				local9.aByteArray29[local9.anInt2583++] = arg2[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lclient!he;")
	public static Class1_Sub10 method2002(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static100.aClass1_Sub10ArrayArray1[local7] == null || Static100.aClass1_Sub10ArrayArray1[local7][local19] == null) {
			@Pc(33) boolean local33 = Static51.method1090(local7);
			if (!local33) {
				return null;
			}
		}
		return Static100.aClass1_Sub10ArrayArray1[local7][local19];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!sf;IILclient!sf;Z)Lclient!pd;")
	public static Class1_Sub1_Sub11 method2004(@OriginalArg(0) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(18) int[] local18 = arg0.method129(arg1);
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < local18.length; local22++) {
			@Pc(32) byte[] local32 = arg0.method108(local18[local22], arg1);
			if (local32 == null) {
				local20 = false;
			} else {
				@Pc(52) int local52 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
				@Pc(60) byte[] local60 = arg2.method108(0, local52);
				if (local60 == null) {
					local20 = false;
				}
			}
		}
		if (!local20) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub11(arg0, arg2, arg1, false);
		} catch (@Pc(94) Exception local94) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!cc;I)V")
	public static void method2005(@OriginalArg(0) Class1_Sub5 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray3;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class1_Sub1_Sub10 local18 = Static2.method51(local14);
		if (local18 == null) {
			return;
		}
		Static119.anInt2775 = 0;
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = 0;
		@Pc(30) int[] local30 = local18.anIntArray377;
		@Pc(32) int local32 = 0;
		@Pc(35) int[] local35 = local18.anIntArray378;
		@Pc(37) byte local37 = -1;
		@Pc(55) int local55;
		@Pc(93) int local93;
		try {
			Static53.anIntArray246 = new int[local18.anInt2247];
			@Pc(47) int local47 = 0;
			Static84.aClass66Array17 = new Class66[local18.anInt2246];
			@Pc(53) int local53 = 0;
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local93 = (Integer) local8[local55];
					if (local93 == -2147483647) {
						local93 = arg0.anInt465;
					}
					if (local93 == -2147483646) {
						local93 = arg0.anInt459;
					}
					if (local93 == -2147483645) {
						local93 = arg0.aClass1_Sub10_1 == null ? -1 : arg0.aClass1_Sub10_1.anInt1348;
					}
					if (local93 == -2147483644) {
						local93 = arg0.anInt453;
					}
					if (local93 == -2147483643) {
						local93 = arg0.aClass1_Sub10_1 == null ? -1 : arg0.aClass1_Sub10_1.anInt1371;
					}
					if (local93 == -2147483642) {
						local93 = arg0.aClass1_Sub10_2 == null ? -1 : arg0.aClass1_Sub10_2.anInt1348;
					}
					if (local93 == -2147483641) {
						local93 = arg0.aClass1_Sub10_2 == null ? -1 : arg0.aClass1_Sub10_2.anInt1371;
					}
					if (local93 == -2147483640) {
						local93 = arg0.anInt452;
					}
					if (local93 == -2147483639) {
						local93 = arg0.anInt460;
					}
					Static53.anIntArray246[local47++] = local93;
				} else if (local8[local55] instanceof Class66) {
					@Pc(72) Class66 local72 = (Class66) local8[local55];
					if (local72.method1824(Static51.aClass66_856)) {
						local72 = arg0.aClass66_285;
					}
					Static84.aClass66Array17[local53++] = local72;
				}
			}
			local93 = 0;
			label1976: while (true) {
				local93++;
				if (local93 > 200000) {
					throw new RuntimeException("slow");
				}
				local25++;
				@Pc(211) int local211 = local30[local25];
				@Pc(619) int local619;
				@Pc(641) int local641;
				@Pc(758) int local758;
				@Pc(764) int local764;
				@Pc(579) Class66 local579;
				if (local211 < 100) {
					if (local211 == 0) {
						Static118.anIntArray477[local32++] = local35[local25];
						continue;
					}
					@Pc(235) int local235;
					if (local211 == 1) {
						local235 = local35[local25];
						Static118.anIntArray477[local32++] = Static103.anIntArray429[local235];
						continue;
					}
					if (local211 == 2) {
						local235 = local35[local25];
						local32--;
						Static103.anIntArray429[local235] = Static118.anIntArray477[local32];
						continue;
					}
					if (local211 == 3) {
						Static79.aClass66Array14[local27++] = local18.aClass66Array19[local25];
						continue;
					}
					if (local211 == 6) {
						local25 += local35[local25];
						continue;
					}
					if (local211 == 7) {
						local32 -= 2;
						if (Static118.anIntArray477[local32] != Static118.anIntArray477[local32 + 1]) {
							local25 += local35[local25];
						}
						continue;
					}
					if (local211 == 8) {
						local32 -= 2;
						if (Static118.anIntArray477[local32] == Static118.anIntArray477[local32 + 1]) {
							local25 += local35[local25];
						}
						continue;
					}
					if (local211 == 9) {
						local32 -= 2;
						if (Static118.anIntArray477[local32 + 1] > Static118.anIntArray477[local32]) {
							local25 += local35[local25];
						}
						continue;
					}
					if (local211 == 10) {
						local32 -= 2;
						if (Static118.anIntArray477[local32] > Static118.anIntArray477[local32 + 1]) {
							local25 += local35[local25];
						}
						continue;
					}
					if (local211 == 21) {
						if (Static119.anInt2775 == 0) {
							return;
						}
						@Pc(400) Class80 local400 = Static87.aClass80Array1[--Static119.anInt2775];
						Static84.aClass66Array17 = local400.aClass66Array23;
						local25 = local400.anInt2920;
						local18 = local400.aClass1_Sub1_Sub10_1;
						local30 = local18.anIntArray377;
						local35 = local18.anIntArray378;
						Static53.anIntArray246 = local400.anIntArray496;
						continue;
					}
					if (local211 == 25) {
						local235 = local35[local25];
						Static118.anIntArray477[local32++] = Static52.method1096(local235);
						continue;
					}
					if (local211 == 27) {
						local235 = local35[local25];
						local32--;
						Static129.method2040(Static118.anIntArray477[local32], local235);
						continue;
					}
					if (local211 == 31) {
						local32 -= 2;
						if (Static118.anIntArray477[local32] <= Static118.anIntArray477[local32 + 1]) {
							local25 += local35[local25];
						}
						continue;
					}
					if (local211 == 32) {
						local32 -= 2;
						if (Static118.anIntArray477[local32] >= Static118.anIntArray477[local32 + 1]) {
							local25 += local35[local25];
						}
						continue;
					}
					if (local211 == 33) {
						Static118.anIntArray477[local32++] = Static53.anIntArray246[local35[local25]];
						continue;
					}
					@Pc(525) int local525;
					if (local211 == 34) {
						local525 = local35[local25];
						local32--;
						Static53.anIntArray246[local525] = Static118.anIntArray477[local32];
						continue;
					}
					if (local211 == 35) {
						Static79.aClass66Array14[local27++] = Static84.aClass66Array17[local35[local25]];
						continue;
					}
					if (local211 == 36) {
						local525 = local35[local25];
						local27--;
						Static84.aClass66Array17[local525] = Static79.aClass66Array14[local27];
						continue;
					}
					if (local211 == 37) {
						local235 = local35[local25];
						local27 -= local235;
						local579 = Static56.method1244(Static79.aClass66Array14, local27, local235);
						Static79.aClass66Array14[local27++] = local579;
						continue;
					}
					if (local211 == 38) {
						local32--;
						continue;
					}
					if (local211 == 39) {
						local27--;
						continue;
					}
					if (local211 == 40) {
						local235 = local35[local25];
						@Pc(609) Class1_Sub1_Sub10 local609 = Static2.method51(local235);
						@Pc(613) int[] local613 = new int[local609.anInt2247];
						@Pc(617) Class66[] local617 = new Class66[local609.anInt2246];
						for (local619 = 0; local619 < local609.anInt2252; local619++) {
							local613[local619] = Static118.anIntArray477[local32 + local619 - local609.anInt2252];
						}
						for (local641 = 0; local641 < local609.anInt2245; local641++) {
							local617[local641] = Static79.aClass66Array14[local641 + local27 - local609.anInt2245];
						}
						local27 -= local609.anInt2245;
						local32 -= local609.anInt2252;
						@Pc(678) Class80 local678 = new Class80();
						local678.aClass66Array23 = Static84.aClass66Array17;
						local678.aClass1_Sub1_Sub10_1 = local18;
						local678.anInt2920 = local25;
						local678.anIntArray496 = Static53.anIntArray246;
						local18 = local609;
						local25 = -1;
						Static87.aClass80Array1[Static119.anInt2775++] = local678;
						local35 = local609.anIntArray378;
						Static53.anIntArray246 = local613;
						Static84.aClass66Array17 = local617;
						local30 = local609.anIntArray377;
						continue;
					}
					if (local211 == 42) {
						Static118.anIntArray477[local32++] = Static11.anIntArray68[local35[local25]];
						continue;
					}
					if (local211 == 43) {
						local525 = local35[local25];
						local32--;
						Static11.anIntArray68[local525] = Static118.anIntArray477[local32];
						continue;
					}
					if (local211 == 44) {
						local235 = local35[local25] >> 16;
						local32--;
						local758 = Static118.anIntArray477[local32];
						local764 = local35[local25] & 0xFFFF;
						if (local758 >= 0 && local758 <= 5000) {
							@Pc(775) byte local775 = -1;
							Static74.anIntArray334[local235] = local758;
							if (local764 == 105) {
								local775 = 0;
							}
							local619 = 0;
							while (true) {
								if (local758 <= local619) {
									continue label1976;
								}
								Static14.anIntArrayArray9[local235][local619] = local775;
								local619++;
							}
						}
						throw new RuntimeException();
					}
					if (local211 == 45) {
						local235 = local35[local25];
						local32--;
						local764 = Static118.anIntArray477[local32];
						if (local764 >= 0 && Static74.anIntArray334[local235] > local764) {
							Static118.anIntArray477[local32++] = Static14.anIntArrayArray9[local235][local764];
							continue;
						}
						throw new RuntimeException();
					}
					if (local211 == 46) {
						local32 -= 2;
						local235 = local35[local25];
						local764 = Static118.anIntArray477[local32];
						if (local764 >= 0 && Static74.anIntArray334[local235] > local764) {
							Static14.anIntArrayArray9[local235][local764] = Static118.anIntArray477[local32 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local211 == 47) {
						@Pc(891) Class66 local891 = Static79.aClass66Array13[local35[local25]];
						if (local891 == null) {
							local891 = Static108.aClass66_130;
						}
						Static79.aClass66Array14[local27++] = local891;
						continue;
					}
					if (local211 == 48) {
						local525 = local35[local25];
						local27--;
						Static79.aClass66Array13[local525] = Static79.aClass66Array14[local27];
						continue;
					}
				}
				@Pc(925) boolean local925;
				if (local35[local25] == 1) {
					local925 = true;
				} else {
					local925 = false;
				}
				@Pc(1004) Class1_Sub10 local1004;
				@Pc(2559) int local2559;
				@Pc(1060) int local1060;
				@Pc(5588) Class1_Sub10 local5588;
				@Pc(5615) Class1_Sub10 local5615;
				if (local211 < 1000) {
					if (local211 == 100) {
						local32 -= 3;
						local758 = Static118.anIntArray477[local32 + 1];
						local1060 = Static118.anIntArray477[local32 + 2];
						local764 = Static118.anIntArray477[local32];
						if (local758 == 0) {
							throw new RuntimeException();
						}
						local5588 = method2002(local764);
						if (local5588.aClass1_Sub10Array2 == null) {
							local5588.aClass1_Sub10Array2 = new Class1_Sub10[local1060 + 1];
						}
						if (local5588.aClass1_Sub10Array2.length <= local1060) {
							@Pc(6962) Class1_Sub10[] local6962 = new Class1_Sub10[local1060 + 1];
							for (local2559 = 0; local2559 < local5588.aClass1_Sub10Array2.length; local2559++) {
								local6962[local2559] = local5588.aClass1_Sub10Array2[local2559];
							}
							local5588.aClass1_Sub10Array2 = local6962;
						}
						if (local1060 > 0 && local5588.aClass1_Sub10Array2[local1060 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1060 - 1));
						}
						@Pc(7008) Class1_Sub10 local7008 = new Class1_Sub10();
						local7008.anInt1371 = local1060;
						local7008.anInt1359 = local758;
						local7008.anInt1375 = local7008.anInt1348 = local5588.anInt1348;
						local7008.aBoolean54 = true;
						local5588.aClass1_Sub10Array2[local1060] = local7008;
						if (local925) {
							Static120.aClass1_Sub10_13 = local7008;
						} else {
							Static130.aClass1_Sub10_14 = local7008;
						}
						Static70.method537(local5588);
						continue;
					}
					if (local211 == 101) {
						local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
						@Pc(7058) Class1_Sub10 local7058 = method2002(local1004.anInt1348);
						local7058.aClass1_Sub10Array2[local1004.anInt1371] = null;
						Static70.method537(local7058);
						continue;
					}
					if (local211 == 102) {
						local32--;
						local1004 = method2002(Static118.anIntArray477[local32]);
						local1004.aClass1_Sub10Array2 = null;
						Static70.method537(local1004);
						continue;
					}
					if (local211 == 200) {
						local32 -= 2;
						local764 = Static118.anIntArray477[local32];
						local758 = Static118.anIntArray477[local32 + 1];
						local5615 = Static127.method2030(local764, local758);
						if (local5615 != null && local758 != -1) {
							Static118.anIntArray477[local32++] = 1;
							if (local925) {
								Static120.aClass1_Sub10_13 = local5615;
							} else {
								Static130.aClass1_Sub10_14 = local5615;
							}
							continue;
						}
						Static118.anIntArray477[local32++] = 0;
						continue;
					}
				} else if (local211 >= 1000 && local211 < 1100 || local211 >= 2000 && local211 < 2100) {
					if (local211 < 2000) {
						local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
					} else {
						local211 -= 1000;
						local32--;
						local1004 = method2002(Static118.anIntArray477[local32]);
					}
					if (local211 == 1000) {
						local32 -= 2;
						local1004.anInt1344 = Static118.anIntArray477[local32];
						local1004.anInt1388 = Static118.anIntArray477[local32 + 1];
						Static70.method537(local1004);
						continue;
					}
					if (local211 == 1001) {
						local32 -= 2;
						local1004.anInt1367 = Static118.anIntArray477[local32];
						local1004.anInt1345 = Static118.anIntArray477[local32 + 1];
						Static70.method537(local1004);
						continue;
					}
					if (local211 == 1003) {
						local32--;
						@Pc(6888) boolean local6888 = Static118.anIntArray477[local32] == 1;
						if (local6888 != local1004.aBoolean53) {
							local1004.aBoolean53 = local6888;
							Static70.method537(local1004);
						}
						continue;
					}
				} else {
					@Pc(2453) Class66 local2453;
					if (local211 >= 1100 && local211 < 1200 || !(local211 < 2100 || local211 >= 2200)) {
						if (local211 < 2000) {
							local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
						} else {
							local211 -= 1000;
							local32--;
							local1004 = method2002(Static118.anIntArray477[local32]);
						}
						if (local211 == 1100) {
							local32 -= 2;
							local1004.anInt1369 = Static118.anIntArray477[local32];
							if (local1004.anInt1372 - local1004.anInt1367 < local1004.anInt1369) {
								local1004.anInt1369 = local1004.anInt1372 - local1004.anInt1367;
							}
							if (local1004.anInt1369 < 0) {
								local1004.anInt1369 = 0;
							}
							local1004.anInt1396 = Static118.anIntArray477[local32 + 1];
							if (local1004.anInt1354 - local1004.anInt1345 < local1004.anInt1396) {
								local1004.anInt1396 = local1004.anInt1354 - local1004.anInt1345;
							}
							if (local1004.anInt1396 < 0) {
								local1004.anInt1396 = 0;
							}
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1101) {
							local32--;
							local1004.anInt1331 = Static118.anIntArray477[local32];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1102) {
							local32--;
							local1004.aBoolean50 = Static118.anIntArray477[local32] == 1;
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1103) {
							local32--;
							local1004.anInt1350 = Static118.anIntArray477[local32];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1104) {
							local32--;
							local1004.anInt1356 = Static118.anIntArray477[local32];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1105) {
							local32--;
							local1004.anInt1392 = Static118.anIntArray477[local32];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1106) {
							local32--;
							local1004.anInt1353 = Static118.anIntArray477[local32];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1107) {
							local32--;
							local1004.aBoolean49 = Static118.anIntArray477[local32] == 1;
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1108) {
							local1004.anInt1376 = 1;
							local32--;
							local1004.anInt1337 = Static118.anIntArray477[local32];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1109) {
							local32 -= 6;
							local1004.anInt1368 = Static118.anIntArray477[local32];
							local1004.anInt1370 = Static118.anIntArray477[local32 + 1];
							local1004.anInt1402 = Static118.anIntArray477[local32 + 2];
							local1004.anInt1355 = Static118.anIntArray477[local32 + 3];
							local1004.anInt1382 = Static118.anIntArray477[local32 + 4];
							local1004.anInt1374 = Static118.anIntArray477[local32 + 5];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1110) {
							local32--;
							local758 = Static118.anIntArray477[local32];
							if (local758 != local1004.anInt1360) {
								local1004.anInt1360 = local758;
								local1004.anInt1379 = 0;
								local1004.anInt1366 = 0;
								Static70.method537(local1004);
							}
							continue;
						}
						if (local211 == 1111) {
							local32--;
							local1004.aBoolean55 = Static118.anIntArray477[local32] == 1;
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1112) {
							local27--;
							local2453 = Static79.aClass66Array14[local27];
							if (!local2453.method1824(local1004.aClass66_732)) {
								local1004.aClass66_732 = local2453;
								Static70.method537(local1004);
							}
							continue;
						}
						if (local211 == 1113) {
							local32--;
							local1004.anInt1334 = Static118.anIntArray477[local32];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1114) {
							local32 -= 3;
							local1004.anInt1385 = Static118.anIntArray477[local32];
							local1004.anInt1377 = Static118.anIntArray477[local32 + 1];
							local1004.anInt1358 = Static118.anIntArray477[local32 + 2];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1115) {
							local32--;
							local1004.aBoolean56 = Static118.anIntArray477[local32] == 1;
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1116) {
							local32--;
							local1004.anInt1395 = Static118.anIntArray477[local32];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1117) {
							local32--;
							local1004.anInt1364 = Static118.anIntArray477[local32];
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1118) {
							local32--;
							local1004.aBoolean51 = Static118.anIntArray477[local32] == 1;
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1119) {
							local32--;
							local1004.aBoolean48 = Static118.anIntArray477[local32] == 1;
							Static70.method537(local1004);
							continue;
						}
						if (local211 == 1120) {
							local32 -= 2;
							local1004.anInt1372 = Static118.anIntArray477[local32];
							local1004.anInt1354 = Static118.anIntArray477[local32 + 1];
							Static70.method537(local1004);
							continue;
						}
					} else if (local211 >= 1200 && local211 < 1300 || local211 >= 2200 && local211 < 2300) {
						if (local211 >= 2000) {
							local32--;
							local1004 = method2002(Static118.anIntArray477[local32]);
							local211 -= 1000;
						} else {
							local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
						}
						Static70.method537(local1004);
						if (local211 == 1200) {
							local32 -= 2;
							local1060 = Static118.anIntArray477[local32 + 1];
							local758 = Static118.anIntArray477[local32];
							local1004.anInt1399 = local758;
							local1004.anInt1390 = local1060;
							@Pc(6207) Class1_Sub1_Sub6 local6207 = Static20.method496(local758);
							local1004.anInt1355 = local6207.anInt1541;
							local1004.anInt1374 = local6207.anInt1568;
							local1004.anInt1402 = local6207.anInt1551;
							if (local1004.anInt1367 > 0) {
								local1004.anInt1374 = local1004.anInt1374 * 32 / local1004.anInt1367;
							}
							local1004.anInt1370 = local6207.anInt1534;
							local1004.anInt1382 = local6207.anInt1574;
							local1004.anInt1368 = local6207.anInt1562;
							continue;
						}
						if (local211 == 1201) {
							local1004.anInt1376 = 2;
							local32--;
							local1004.anInt1337 = Static118.anIntArray477[local32];
							continue;
						}
						if (local211 == 1202) {
							local1004.anInt1376 = 3;
							local1004.anInt1337 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass38_1.method1251();
							continue;
						}
					} else if (local211 >= 1300 && local211 < 1400 || local211 >= 2300 && local211 < 2400) {
						if (local211 >= 2000) {
							local32--;
							local1004 = method2002(Static118.anIntArray477[local32]);
							local211 -= 1000;
						} else {
							local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
						}
						if (local211 == 1300) {
							local32--;
							local758 = Static118.anIntArray477[local32] - 1;
							if (local758 >= 0 && local758 <= 9) {
								local27--;
								local1004.method953(Static79.aClass66Array14[local27], local758);
								continue;
							}
							local27--;
							continue;
						}
						if (local211 == 1301) {
							local32 -= 2;
							local758 = Static118.anIntArray477[local32];
							local1060 = Static118.anIntArray477[local32 + 1];
							local1004.aClass1_Sub10_7 = Static127.method2030(local758, local1060);
							continue;
						}
						if (local211 == 1302) {
							local32--;
							local1004.aBoolean57 = Static118.anIntArray477[local32] == 1;
							continue;
						}
						if (local211 == 1303) {
							local32--;
							local1004.anInt1394 = Static118.anIntArray477[local32];
							continue;
						}
						if (local211 == 1304) {
							local32--;
							local1004.anInt1357 = Static118.anIntArray477[local32];
							continue;
						}
						if (local211 == 1305) {
							local27--;
							local1004.aClass66_731 = Static79.aClass66Array14[local27];
							continue;
						}
						if (local211 == 1306) {
							local27--;
							local1004.aClass66_730 = Static79.aClass66Array14[local27];
							continue;
						}
						if (local211 == 1307) {
							local1004.aClass66Array6 = null;
							continue;
						}
					} else {
						if (local211 >= 1400 && local211 < 1500 || local211 >= 2400 && local211 < 2500) {
							if (local211 >= 2000) {
								local32--;
								local1004 = method2002(Static118.anIntArray477[local32]);
								local211 -= 1000;
							} else {
								local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
							}
							local27--;
							local2453 = Static79.aClass66Array14[local27];
							@Pc(5856) int[] local5856 = null;
							if (local2453.method1847() > 0 && local2453.method1814(local2453.method1847() - 1) == 89) {
								local32--;
								local619 = Static118.anIntArray477[local32];
								if (local619 > 0) {
									local5856 = new int[local619];
									while (local619-- > 0) {
										local32--;
										local5856[local619] = Static118.anIntArray477[local32];
									}
								}
								local2453 = local2453.method1807(0, local2453.method1847() - 1);
							}
							@Pc(5916) Object[] local5916 = new Object[local2453.method1847() + 1];
							for (local641 = local5916.length - 1; local641 >= 1; local641--) {
								if (local2453.method1814(local641 - 1) == 115) {
									local27--;
									local5916[local641] = Static79.aClass66Array14[local27];
								} else {
									local32--;
									local5916[local641] = Integer.valueOf(Static118.anIntArray477[local32]);
								}
							}
							local32--;
							local2559 = Static118.anIntArray477[local32];
							if (local2559 == -1) {
								local5916 = null;
							} else {
								local5916[0] = Integer.valueOf(local2559);
							}
							if (local211 == 1423) {
								local1004.anObjectArray12 = local5916;
							}
							if (local211 == 1410) {
								local1004.anObjectArray20 = local5916;
							}
							if (local211 == 1408) {
								local1004.anObjectArray4 = local5916;
							}
							if (local211 == 1412) {
								local1004.anObjectArray10 = local5916;
							}
							if (local211 == 1400) {
								local1004.anObjectArray6 = local5916;
							}
							if (local211 == 1419) {
								local1004.anObjectArray5 = local5916;
							}
							if (local211 == 1416) {
								local1004.anObjectArray26 = local5916;
							}
							if (local211 == 1404) {
								local1004.anObjectArray18 = local5916;
							}
							if (local211 == 1407) {
								local1004.anIntArray205 = local5856;
								local1004.anObjectArray21 = local5916;
							}
							if (local211 == 1411) {
								local1004.anObjectArray28 = local5916;
							}
							if (local211 == 1405) {
								local1004.anObjectArray9 = local5916;
							}
							if (local211 == 1421) {
								local1004.anObjectArray16 = local5916;
							}
							if (local211 == 1403) {
								local1004.anObjectArray25 = local5916;
							}
							if (local211 == 1415) {
								local1004.anIntArray196 = local5856;
								local1004.anObjectArray13 = local5916;
							}
							if (local211 == 1402) {
								local1004.anObjectArray19 = local5916;
							}
							if (local211 == 1409) {
								local1004.anObjectArray8 = local5916;
							}
							if (local211 == 1420) {
								local1004.anObjectArray7 = local5916;
							}
							if (local211 == 1401) {
								local1004.anObjectArray23 = local5916;
							}
							if (local211 == 1424) {
								local1004.anObjectArray27 = local5916;
							}
							if (local211 == 1418) {
								local1004.anObjectArray11 = local5916;
							}
							if (local211 == 1422) {
								local1004.anObjectArray22 = local5916;
							}
							if (local211 == 1414) {
								local1004.anIntArray200 = local5856;
								local1004.anObjectArray14 = local5916;
							}
							if (local211 == 1417) {
								local1004.anObjectArray17 = local5916;
							}
							local1004.aBoolean52 = true;
							if (local211 == 1406) {
								local1004.anObjectArray15 = local5916;
							}
							continue;
						}
						if (local211 < 1600) {
							local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
							if (local211 == 1500) {
								Static118.anIntArray477[local32++] = local1004.anInt1344;
								continue;
							}
							if (local211 == 1501) {
								Static118.anIntArray477[local32++] = local1004.anInt1388;
								continue;
							}
							if (local211 == 1502) {
								Static118.anIntArray477[local32++] = local1004.anInt1367;
								continue;
							}
							if (local211 == 1503) {
								Static118.anIntArray477[local32++] = local1004.anInt1345;
								continue;
							}
							if (local211 == 1504) {
								Static118.anIntArray477[local32++] = local1004.aBoolean53 ? 1 : 0;
								continue;
							}
							if (local211 == 1505) {
								Static118.anIntArray477[local32++] = local1004.anInt1375;
								continue;
							}
						} else if (local211 < 1700) {
							local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
							if (local211 == 1600) {
								Static118.anIntArray477[local32++] = local1004.anInt1369;
								continue;
							}
							if (local211 == 1601) {
								Static118.anIntArray477[local32++] = local1004.anInt1396;
								continue;
							}
							if (local211 == 1602) {
								Static79.aClass66Array14[local27++] = local1004.aClass66_732;
								continue;
							}
							if (local211 == 1603) {
								Static118.anIntArray477[local32++] = local1004.anInt1372;
								continue;
							}
							if (local211 == 1604) {
								Static118.anIntArray477[local32++] = local1004.anInt1354;
								continue;
							}
							if (local211 == 1605) {
								Static118.anIntArray477[local32++] = local1004.anInt1374;
								continue;
							}
							if (local211 == 1606) {
								Static118.anIntArray477[local32++] = local1004.anInt1402;
								continue;
							}
							if (local211 == 1607) {
								Static118.anIntArray477[local32++] = local1004.anInt1382;
								continue;
							}
							if (local211 == 1608) {
								Static118.anIntArray477[local32++] = local1004.anInt1355;
								continue;
							}
						} else if (local211 < 1800) {
							local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
							if (local211 == 1700) {
								Static118.anIntArray477[local32++] = local1004.anInt1399;
								continue;
							}
							if (local211 == 1701) {
								if (local1004.anInt1399 == -1) {
									Static118.anIntArray477[local32++] = 0;
								} else {
									Static118.anIntArray477[local32++] = local1004.anInt1390;
								}
								continue;
							}
							if (local211 == 1702) {
								Static118.anIntArray477[local32++] = local1004.anInt1371;
								continue;
							}
						} else if (local211 < 1900) {
							local1004 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
							if (local211 == 1800) {
								Static118.anIntArray477[local32++] = Static5.method162(Static61.method1301(local1004));
								continue;
							}
							if (local211 == 1801) {
								local32--;
								local758 = Static118.anIntArray477[local32];
								local758--;
								if (local1004.aClass66Array6 != null && local1004.aClass66Array6.length > local758 && local1004.aClass66Array6[local758] != null) {
									Static79.aClass66Array14[local27++] = local1004.aClass66Array6[local758];
									continue;
								}
								Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								continue;
							}
							if (local211 == 1802) {
								if (local1004.aClass66_731 == null) {
									Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								} else {
									Static79.aClass66Array14[local27++] = local1004.aClass66_731;
								}
								continue;
							}
						} else if (local211 < 2600) {
							local32--;
							local1004 = method2002(Static118.anIntArray477[local32]);
							if (local211 == 2500) {
								Static118.anIntArray477[local32++] = local1004.anInt1344;
								continue;
							}
							if (local211 == 2501) {
								Static118.anIntArray477[local32++] = local1004.anInt1388;
								continue;
							}
							if (local211 == 2502) {
								Static118.anIntArray477[local32++] = local1004.anInt1367;
								continue;
							}
							if (local211 == 2503) {
								Static118.anIntArray477[local32++] = local1004.anInt1345;
								continue;
							}
							if (local211 == 2504) {
								Static118.anIntArray477[local32++] = local1004.aBoolean53 ? 1 : 0;
								continue;
							}
							if (local211 == 2505) {
								Static118.anIntArray477[local32++] = local1004.anInt1375;
								continue;
							}
						} else if (local211 < 2700) {
							local32--;
							local1004 = method2002(Static118.anIntArray477[local32]);
							if (local211 == 2600) {
								Static118.anIntArray477[local32++] = local1004.anInt1369;
								continue;
							}
							if (local211 == 2601) {
								Static118.anIntArray477[local32++] = local1004.anInt1396;
								continue;
							}
							if (local211 == 2602) {
								Static79.aClass66Array14[local27++] = local1004.aClass66_732;
								continue;
							}
							if (local211 == 2603) {
								Static118.anIntArray477[local32++] = local1004.anInt1372;
								continue;
							}
							if (local211 == 2604) {
								Static118.anIntArray477[local32++] = local1004.anInt1354;
								continue;
							}
							if (local211 == 2605) {
								Static118.anIntArray477[local32++] = local1004.anInt1374;
								continue;
							}
							if (local211 == 2606) {
								Static118.anIntArray477[local32++] = local1004.anInt1402;
								continue;
							}
							if (local211 == 2607) {
								Static118.anIntArray477[local32++] = local1004.anInt1382;
								continue;
							}
							if (local211 == 2608) {
								Static118.anIntArray477[local32++] = local1004.anInt1355;
								continue;
							}
						} else if (local211 < 2800) {
							if (local211 == 2700) {
								local32--;
								local1004 = method2002(Static118.anIntArray477[local32]);
								Static118.anIntArray477[local32++] = local1004.anInt1399;
								continue;
							}
							if (local211 == 2701) {
								local32--;
								local1004 = method2002(Static118.anIntArray477[local32]);
								if (local1004.anInt1399 == -1) {
									Static118.anIntArray477[local32++] = 0;
								} else {
									Static118.anIntArray477[local32++] = local1004.anInt1390;
								}
								continue;
							}
							if (local211 == 2702) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								@Pc(1594) Class1_Sub22 local1594 = (Class1_Sub22) Static52.aClass65_22.method1802((long) local764);
								if (local1594 == null) {
									Static118.anIntArray477[local32++] = 0;
								} else {
									Static118.anIntArray477[local32++] = 1;
								}
								continue;
							}
						} else if (local211 < 2900) {
							local32--;
							local1004 = method2002(Static118.anIntArray477[local32]);
							if (local211 == 2800) {
								Static118.anIntArray477[local32++] = Static5.method162(Static61.method1301(local1004));
								continue;
							}
							if (local211 == 2801) {
								local32--;
								local758 = Static118.anIntArray477[local32];
								local758--;
								if (local1004.aClass66Array6 != null && local1004.aClass66Array6.length > local758 && local1004.aClass66Array6[local758] != null) {
									Static79.aClass66Array14[local27++] = local1004.aClass66Array6[local758];
									continue;
								}
								Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								continue;
							}
							if (local211 == 2802) {
								if (local1004.aClass66_731 == null) {
									Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								} else {
									Static79.aClass66Array14[local27++] = local1004.aClass66_731;
								}
								continue;
							}
						} else if (local211 < 3200) {
							if (local211 == 3100) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static103.method1791(0, Static15.aClass66_1747, local579);
								continue;
							}
							if (local211 == 3101) {
								local32 -= 2;
								Static114.method1924(Static118.anIntArray477[local32], Static118.anIntArray477[local32 + 1], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1);
								continue;
							}
							if (local211 == 3103) {
								Static83.method1508();
								continue;
							}
							if (local211 == 3104) {
								local758 = 0;
								local27--;
								local579 = Static79.aClass66Array14[local27];
								if (local579.method1826()) {
									local758 = local579.method1840();
								}
								Static127.aClass1_Sub12_Sub1_2.method1227(59);
								Static127.aClass1_Sub12_Sub1_2.method1193(local758);
								continue;
							}
							if (local211 == 3105) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static127.aClass1_Sub12_Sub1_2.method1227(210);
								Static127.aClass1_Sub12_Sub1_2.method1195(local579.method1806());
								continue;
							}
							if (local211 == 3106) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static127.aClass1_Sub12_Sub1_2.method1227(103);
								Static127.aClass1_Sub12_Sub1_2.method1197(local579.method1847() + 1);
								Static127.aClass1_Sub12_Sub1_2.method1188(local579);
								continue;
							}
							if (local211 == 3107) {
								local27--;
								local2453 = Static79.aClass66Array14[local27];
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static126.method2018(local2453, local764);
								continue;
							}
							if (local211 == 3108) {
								local32 -= 3;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								local1060 = Static118.anIntArray477[local32 + 2];
								local5588 = method2002(local1060);
								Static57.method1250(local5588, local758, local764);
								continue;
							}
							if (local211 == 3109) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								local5615 = local925 ? Static120.aClass1_Sub10_13 : Static130.aClass1_Sub10_14;
								Static57.method1250(local5615, local758, local764);
								continue;
							}
						} else if (local211 < 3300) {
							if (local211 == 3200) {
								local32 -= 3;
								Static120.method1964(Static118.anIntArray477[local32 + 1], Static118.anIntArray477[local32 + 2], Static118.anIntArray477[local32]);
								continue;
							}
							if (local211 == 3201) {
								local32--;
								Static81.method1498(Static118.anIntArray477[local32]);
								continue;
							}
							if (local211 == 3202) {
								local32 -= 2;
								Static128.method2032(Static118.anIntArray477[local32 + 1], Static118.anIntArray477[local32]);
								continue;
							}
						} else if (local211 < 3400) {
							if (local211 == 3300) {
								Static118.anIntArray477[local32++] = Static22.anInt636;
								continue;
							}
							if (local211 == 3301) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = Static48.method1051(local764, local758);
								continue;
							}
							if (local211 == 3302) {
								local32 -= 2;
								local758 = Static118.anIntArray477[local32 + 1];
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static55.method1239(local758, local764);
								continue;
							}
							if (local211 == 3303) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = Static6.method273(local758, local764);
								continue;
							}
							if (local211 == 3304) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static36.method656(local764).anInt344;
								continue;
							}
							if (local211 == 3305) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static4.anIntArray31[local764];
								continue;
							}
							if (local211 == 3306) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static50.anIntArray234[local764];
								continue;
							}
							if (local211 == 3307) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static127.anIntArray495[local764];
								continue;
							}
							if (local211 == 3308) {
								local758 = Static48.anInt1496 + (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 >> 7);
								local764 = Static22.anInt635;
								local1060 = (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 >> 7) + Static52.anInt1603;
								Static118.anIntArray477[local32++] = (local764 << 28) + (local758 << 14) + local1060;
								continue;
							}
							if (local211 == 3309) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = local764 >> 14 & 0x3FFF;
								continue;
							}
							if (local211 == 3310) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = local764 >> 28;
								continue;
							}
							if (local211 == 3311) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = local764 & 0x3FFF;
								continue;
							}
							if (local211 == 3312) {
								Static118.anIntArray477[local32++] = Static32.aBoolean35 ? 1 : 0;
								continue;
							}
							if (local211 == 3313) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32] + 32768;
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = Static48.method1051(local764, local758);
								continue;
							}
							if (local211 == 3314) {
								local32 -= 2;
								local758 = Static118.anIntArray477[local32 + 1];
								local764 = Static118.anIntArray477[local32] + 32768;
								Static118.anIntArray477[local32++] = Static55.method1239(local758, local764);
								continue;
							}
							if (local211 == 3315) {
								local32 -= 2;
								local758 = Static118.anIntArray477[local32 + 1];
								local764 = Static118.anIntArray477[local32] + 32768;
								Static118.anIntArray477[local32++] = Static6.method273(local758, local764);
								continue;
							}
							if (local211 == 3316) {
								if (Static33.anInt850 >= 2) {
									Static118.anIntArray477[local32++] = Static33.anInt850;
								} else {
									Static118.anIntArray477[local32++] = 0;
								}
								continue;
							}
							if (local211 == 3317) {
								Static118.anIntArray477[local32++] = Static49.anInt1513;
								continue;
							}
							if (local211 == 3318) {
								Static118.anIntArray477[local32++] = Static118.anInt2768;
								continue;
							}
							if (local211 == 3321) {
								Static118.anIntArray477[local32++] = Static1.anInt79;
								continue;
							}
							if (local211 == 3322) {
								Static118.anIntArray477[local32++] = Static127.anInt2905;
								continue;
							}
							if (local211 == 3323) {
								if (Static33.anInt850 == 1) {
									Static118.anIntArray477[local32++] = 1;
								} else {
									Static118.anIntArray477[local32++] = 0;
								}
								continue;
							}
						} else if (local211 < 3500) {
							if (local211 == 3400) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								@Pc(4806) Class1_Sub1_Sub8 local4806 = Static11.method358(local764);
								for (local619 = 0; local619 < local4806.anInt2030; local619++) {
									if (local4806.anIntArray333[local619] == local758) {
										Static79.aClass66Array14[local27++] = local4806.aClass66Array11[local619];
										local4806 = null;
										break;
									}
								}
								if (local4806 != null) {
									Static79.aClass66Array14[local27++] = local4806.aClass66_1105;
								}
								continue;
							}
							if (local211 == 3408) {
								local32 -= 4;
								local764 = Static118.anIntArray477[local32];
								local1060 = Static118.anIntArray477[local32 + 2];
								local758 = Static118.anIntArray477[local32 + 1];
								local619 = Static118.anIntArray477[local32 + 3];
								@Pc(4882) Class1_Sub1_Sub8 local4882 = Static11.method358(local1060);
								if (local764 == local4882.anInt2028 && local758 == local4882.anInt2037) {
									for (local2559 = 0; local2559 < local4882.anInt2030; local2559++) {
										if (local4882.anIntArray333[local2559] == local619) {
											if (local758 == 115) {
												Static79.aClass66Array14[local27++] = local4882.aClass66Array11[local2559];
											} else {
												Static118.anIntArray477[local32++] = local4882.anIntArray332[local2559];
											}
											local4882 = null;
											break;
										}
									}
									if (local4882 != null) {
										if (local758 == 115) {
											Static79.aClass66Array14[local27++] = local4882.aClass66_1105;
										} else {
											Static118.anIntArray477[local32++] = local4882.anInt2038;
										}
									}
									continue;
								}
								if (local758 == 115) {
									Static79.aClass66Array14[local27++] = Static108.aClass66_130;
								} else {
									Static118.anIntArray477[local32++] = 0;
								}
								continue;
							}
						} else if (local211 < 3700) {
							if (local211 == 3600) {
								if (Static28.anInt743 == 0) {
									Static118.anIntArray477[local32++] = -2;
								} else if (Static28.anInt743 == 1) {
									Static118.anIntArray477[local32++] = -1;
								} else {
									Static118.anIntArray477[local32++] = Static27.anInt730;
								}
								continue;
							}
							if (local211 == 3601) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								if (Static28.anInt743 == 2 && Static27.anInt730 > local764) {
									Static79.aClass66Array14[local27++] = Static88.aClass66Array20[local764];
									continue;
								}
								Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								continue;
							}
							if (local211 == 3602) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								if (Static28.anInt743 == 2 && Static27.anInt730 > local764) {
									Static118.anIntArray477[local32++] = Static9.anIntArray56[local764];
									continue;
								}
								Static118.anIntArray477[local32++] = 0;
								continue;
							}
							if (local211 == 3603) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								if (Static28.anInt743 == 2 && Static27.anInt730 > local764) {
									Static118.anIntArray477[local32++] = Static8.anIntArray55[local764];
									continue;
								}
								Static118.anIntArray477[local32++] = 0;
								continue;
							}
							if (local211 == 3604) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								local32--;
								local758 = Static118.anIntArray477[local32];
								Static6.method270(local758, local579);
								continue;
							}
							if (local211 == 3605) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static19.method491(local579.method1806());
								continue;
							}
							if (local211 == 3606) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static56.method1245(local579.method1806());
								continue;
							}
							if (local211 == 3607) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static80.method1487(local579.method1806());
								continue;
							}
							if (local211 == 3608) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static84.method1524(local579.method1806());
								continue;
							}
							if (local211 == 3609) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								if (local579.method1829(Static118.aClass66_1595) || local579.method1829(Static15.aClass66_1746)) {
									local579 = local579.method1831(7);
								}
								Static118.anIntArray477[local32++] = Static60.method1299(local579) ? 1 : 0;
								continue;
							}
							if (local211 == 3611) {
								if (Static93.aClass66_1333 == null) {
									Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								} else {
									Static79.aClass66Array14[local27++] = Static93.aClass66_1333.method1820();
								}
								continue;
							}
							if (local211 == 3612) {
								if (Static93.aClass66_1333 == null) {
									Static118.anIntArray477[local32++] = 0;
								} else {
									Static118.anIntArray477[local32++] = Static81.anInt2188;
								}
								continue;
							}
							if (local211 == 3613) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								if (Static93.aClass66_1333 != null && Static81.anInt2188 > local764) {
									Static79.aClass66Array14[local27++] = Static3.aClass1_Sub11Array1[local764].aClass66_826.method1820();
									continue;
								}
								Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								continue;
							}
							if (local211 == 3614) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								if (Static93.aClass66_1333 != null && local764 < Static81.anInt2188) {
									Static118.anIntArray477[local32++] = Static3.aClass1_Sub11Array1[local764].anInt1508;
									continue;
								}
								Static118.anIntArray477[local32++] = 0;
								continue;
							}
							if (local211 == 3615) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								if (Static93.aClass66_1333 != null && local764 < Static81.anInt2188) {
									Static118.anIntArray477[local32++] = Static3.aClass1_Sub11Array1[local764].aByte3;
									continue;
								}
								Static118.anIntArray477[local32++] = 0;
								continue;
							}
							if (local211 == 3616) {
								Static118.anIntArray477[local32++] = Static71.aByte5;
								continue;
							}
							if (local211 == 3617) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static109.method1856(local579);
								continue;
							}
							if (local211 == 3618) {
								Static118.anIntArray477[local32++] = Static132.aByte8;
								continue;
							}
							if (local211 == 3619) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static65.method1371(local579.method1806());
								continue;
							}
							if (local211 == 3620) {
								Static75.method1449();
								continue;
							}
							if (local211 == 3621) {
								if (Static28.anInt743 == 0) {
									Static118.anIntArray477[local32++] = -1;
								} else {
									Static118.anIntArray477[local32++] = Static126.anInt2886;
								}
								continue;
							}
							if (local211 == 3622) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								if (Static28.anInt743 != 0 && Static126.anInt2886 > local764) {
									Static79.aClass66Array14[local27++] = Static106.method1850(Static41.aLongArray4[local764]).method1820();
									continue;
								}
								Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								continue;
							}
							if (local211 == 3623) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								if (local579.method1829(Static118.aClass66_1595) || local579.method1829(Static15.aClass66_1746)) {
									local579 = local579.method1831(7);
								}
								Static118.anIntArray477[local32++] = Static34.method70(local579) ? 1 : 0;
								continue;
							}
							if (local211 == 3624) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								if (Static3.aClass1_Sub11Array1 != null && local764 < Static81.anInt2188 && Static3.aClass1_Sub11Array1[local764].aClass66_826.method1843(Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass66_707)) {
									Static118.anIntArray477[local32++] = 1;
									continue;
								}
								Static118.anIntArray477[local32++] = 0;
								continue;
							}
							if (local211 == 3625) {
								if (Static117.aClass66_1571 == null) {
									Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								} else {
									Static79.aClass66Array14[local27++] = Static117.aClass66_1571.method1820();
								}
								continue;
							}
						} else if (local211 < 4100) {
							if (local211 == 4000) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = local764 + local758;
								continue;
							}
							if (local211 == 4001) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = local764 - local758;
								continue;
							}
							if (local211 == 4002) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = local758 * local764;
								continue;
							}
							if (local211 == 4003) {
								local32 -= 2;
								local758 = Static118.anIntArray477[local32 + 1];
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = local764 / local758;
								continue;
							}
							if (local211 == 4004) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = (int) (Math.random() * (double) local764);
								continue;
							}
							if (local211 == 4005) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = (int) ((double) (local764 + 1) * Math.random());
								continue;
							}
							if (local211 == 4006) {
								local32 -= 5;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								local1060 = Static118.anIntArray477[local32 + 2];
								local641 = Static118.anIntArray477[local32 + 4];
								local619 = Static118.anIntArray477[local32 + 3];
								Static118.anIntArray477[local32++] = local764 + (local758 - local764) * (-local1060 + local641) / (local619 - local1060);
								continue;
							}
							if (local211 == 4007) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = local764 * local758 / 100 + local764;
								continue;
							}
							if (local211 == 4008) {
								local32 -= 2;
								local758 = Static118.anIntArray477[local32 + 1];
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = local764 | 0x1 << local758;
								continue;
							}
							if (local211 == 4009) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = -(0x1 << local758) - 1 & local764;
								continue;
							}
							if (local211 == 4010) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = (local764 & 0x1 << local758) == 0 ? 0 : 1;
								continue;
							}
							if (local211 == 4011) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = local764 % local758;
								continue;
							}
							if (local211 == 4012) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								if (local764 == 0) {
									Static118.anIntArray477[local32++] = 0;
								} else {
									Static118.anIntArray477[local32++] = (int) Math.pow((double) local764, (double) local758);
								}
								continue;
							}
							if (local211 == 4013) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								if (local764 == 0) {
									Static118.anIntArray477[local32++] = 0;
								} else if (local758 == 0) {
									Static118.anIntArray477[local32++] = Integer.MAX_VALUE;
								} else {
									Static118.anIntArray477[local32++] = (int) Math.pow((double) local764, 1.0D / (double) local758);
								}
								continue;
							}
							if (local211 == 4014) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								Static118.anIntArray477[local32++] = local764 & local758;
								continue;
							}
							if (local211 == 4015) {
								local32 -= 2;
								local758 = Static118.anIntArray477[local32 + 1];
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = local764 | local758;
								continue;
							}
						} else if (local211 < 4200) {
							if (local211 == 4100) {
								local32--;
								local758 = Static118.anIntArray477[local32];
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static79.aClass66Array14[local27++] = Static41.method897(new Class66[] { local579, Static88.method1632(local758) });
								continue;
							}
							if (local211 == 4101) {
								local27 -= 2;
								local579 = Static79.aClass66Array14[local27];
								local2453 = Static79.aClass66Array14[local27 + 1];
								Static79.aClass66Array14[local27++] = Static41.method897(new Class66[] { local579, local2453 });
								continue;
							}
							if (local211 == 4102) {
								local32--;
								local758 = Static118.anIntArray477[local32];
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static79.aClass66Array14[local27++] = Static41.method897(new Class66[] { local579, Static42.method943(local758) });
								continue;
							}
							if (local211 == 4103) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static79.aClass66Array14[local27++] = local579.method1823();
								continue;
							}
							if (local211 == 4104) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								@Pc(2541) long local2541 = (long) local764 * 86400000L + 1014768000000L;
								Static11.aCalendar1.setTime(new Date(local2541));
								local619 = Static11.aCalendar1.get(5);
								local641 = Static11.aCalendar1.get(2);
								local2559 = Static11.aCalendar1.get(1);
								Static79.aClass66Array14[local27++] = Static41.method897(new Class66[] { Static88.method1632(local619), Static77.aClass66_1141, Static17.aClass66Array1[local641], Static77.aClass66_1141, Static88.method1632(local2559) });
								continue;
							}
							if (local211 == 4105) {
								local27 -= 2;
								local579 = Static79.aClass66Array14[local27];
								local2453 = Static79.aClass66Array14[local27 + 1];
								if (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass38_1 != null && Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass38_1.aBoolean71) {
									Static79.aClass66Array14[local27++] = local2453;
									continue;
								}
								Static79.aClass66Array14[local27++] = local579;
								continue;
							}
							if (local211 == 4106) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static79.aClass66Array14[local27++] = Static88.method1632(local764);
								continue;
							}
							if (local211 == 4107) {
								local27 -= 2;
								Static118.anIntArray477[local32++] = Static79.aClass66Array14[local27].method1832(Static79.aClass66Array14[local27 + 1]);
								continue;
							}
							@Pc(2700) byte[] local2700;
							@Pc(2705) Class1_Sub1_Sub2_Sub2_Sub1 local2705;
							if (local211 == 4108) {
								local32 -= 2;
								local27--;
								local579 = Static79.aClass66Array14[local27];
								local758 = Static118.anIntArray477[local32];
								local1060 = Static118.anIntArray477[local32 + 1];
								local2700 = Static73.aClass5_Sub1_21.method107(0, local1060);
								local2705 = new Class1_Sub1_Sub2_Sub2_Sub1(local2700);
								Static118.anIntArray477[local32++] = local2705.method780(local579, local758);
								continue;
							}
							if (local211 == 4109) {
								local32 -= 2;
								local27--;
								local579 = Static79.aClass66Array14[local27];
								local1060 = Static118.anIntArray477[local32 + 1];
								local758 = Static118.anIntArray477[local32];
								local2700 = Static73.aClass5_Sub1_21.method107(0, local1060);
								local2705 = new Class1_Sub1_Sub2_Sub2_Sub1(local2700);
								Static118.anIntArray477[local32++] = local2705.method774(local579, local758);
								continue;
							}
							if (local211 == 4110) {
								local27 -= 2;
								local2453 = Static79.aClass66Array14[local27 + 1];
								local579 = Static79.aClass66Array14[local27];
								local32--;
								if (Static118.anIntArray477[local32] == 1) {
									Static79.aClass66Array14[local27++] = local579;
								} else {
									Static79.aClass66Array14[local27++] = local2453;
								}
								continue;
							}
							if (local211 == 4111) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static79.aClass66Array14[local27++] = Static110.method772(local579);
								continue;
							}
							if (local211 == 4112) {
								local32--;
								local758 = Static118.anIntArray477[local32];
								local27--;
								local579 = Static79.aClass66Array14[local27];
								Static79.aClass66Array14[local27++] = local579.method1837(local758);
								continue;
							}
							if (local211 == 4113) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static28.method552(local764) ? 1 : 0;
								continue;
							}
							if (local211 == 4114) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static13.method398(local764) ? 1 : 0;
								continue;
							}
							if (local211 == 4115) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static48.method1052(local764) ? 1 : 0;
								continue;
							}
							if (local211 == 4116) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static60.method1300(local764) ? 1 : 0;
								continue;
							}
							if (local211 == 4117) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								if (local579 == null) {
									Static118.anIntArray477[local32++] = 0;
								} else {
									Static118.anIntArray477[local32++] = local579.method1847();
								}
								continue;
							}
							if (local211 == 4118) {
								local32 -= 2;
								local27--;
								local579 = Static79.aClass66Array14[local27];
								local758 = Static118.anIntArray477[local32];
								local1060 = Static118.anIntArray477[local32 + 1];
								Static79.aClass66Array14[local27++] = local579.method1807(local758, local1060);
								continue;
							}
							if (local211 == 4119) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								local2453 = Static42.method942(local579.method1847());
								@Pc(2996) boolean local2996 = false;
								for (local619 = 0; local619 < local579.method1847(); local619++) {
									local641 = local579.method1814(local619);
									if (local641 == 60) {
										local2996 = true;
									} else if (local641 == 62) {
										local2996 = false;
									} else if (!local2996) {
										local2453.method1805(local641);
									}
								}
								local2453.method1815();
								Static79.aClass66Array14[local27++] = local2453;
								continue;
							}
							if (local211 == 4120) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								local32--;
								local758 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = local579.method1812(local758);
								continue;
							}
						} else if (local211 < 4300) {
							if (local211 == 4200) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static79.aClass66Array14[local27++] = Static20.method496(local764).aClass66_847;
								continue;
							}
							@Pc(3115) Class1_Sub1_Sub6 local3115;
							if (local211 == 4201) {
								local32 -= 2;
								local758 = Static118.anIntArray477[local32 + 1];
								local764 = Static118.anIntArray477[local32];
								local3115 = Static20.method496(local764);
								if (local758 >= 1 && local758 <= 5 && local3115.aClass66Array8[local758 - 1] != null) {
									Static79.aClass66Array14[local27++] = local3115.aClass66Array8[local758 - 1];
									continue;
								}
								Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								continue;
							}
							if (local211 == 4202) {
								local32 -= 2;
								local764 = Static118.anIntArray477[local32];
								local758 = Static118.anIntArray477[local32 + 1];
								local3115 = Static20.method496(local764);
								if (local758 >= 1 && local758 <= 5 && local3115.aClass66Array9[local758 - 1] != null) {
									Static79.aClass66Array14[local27++] = local3115.aClass66Array9[local758 - 1];
									continue;
								}
								Static79.aClass66Array14[local27++] = Static15.aClass66_1747;
								continue;
							}
							if (local211 == 4203) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static20.method496(local764).anInt1550;
								continue;
							}
							if (local211 == 4204) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static20.method496(local764).anInt1543 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3260) Class1_Sub1_Sub6 local3260;
							if (local211 == 4205) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								local3260 = Static20.method496(local764);
								if (local3260.anInt1536 == -1 && local3260.anInt1557 >= 0) {
									Static118.anIntArray477[local32++] = local3260.anInt1557;
									continue;
								}
								Static118.anIntArray477[local32++] = local764;
								continue;
							}
							if (local211 == 4206) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								local3260 = Static20.method496(local764);
								if (local3260.anInt1536 >= 0 && local3260.anInt1557 >= 0) {
									Static118.anIntArray477[local32++] = local3260.anInt1557;
									continue;
								}
								Static118.anIntArray477[local32++] = local764;
								continue;
							}
							if (local211 == 4207) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								Static118.anIntArray477[local32++] = Static20.method496(local764).aBoolean64 ? 1 : 0;
								continue;
							}
						} else if (local211 < 5100) {
							if (local211 == 5000) {
								Static118.anIntArray477[local32++] = Static14.anInt475;
								continue;
							}
							if (local211 == 5001) {
								local32 -= 3;
								Static14.anInt475 = Static118.anIntArray477[local32];
								Static103.anInt2539 = Static118.anIntArray477[local32 + 1];
								Static100.anInt2501 = Static118.anIntArray477[local32 + 2];
								Static127.aClass1_Sub12_Sub1_2.method1227(250);
								Static127.aClass1_Sub12_Sub1_2.method1197(Static14.anInt475);
								Static127.aClass1_Sub12_Sub1_2.method1197(Static103.anInt2539);
								Static127.aClass1_Sub12_Sub1_2.method1197(Static100.anInt2501);
								continue;
							}
							if (local211 == 5002) {
								local32 -= 2;
								local1060 = Static118.anIntArray477[local32 + 1];
								local27--;
								local579 = Static79.aClass66Array14[local27];
								local758 = Static118.anIntArray477[local32];
								Static127.aClass1_Sub12_Sub1_2.method1227(217);
								Static127.aClass1_Sub12_Sub1_2.method1195(local579.method1806());
								Static127.aClass1_Sub12_Sub1_2.method1197(local758 - 1);
								Static127.aClass1_Sub12_Sub1_2.method1197(local1060);
								continue;
							}
							if (local211 == 5003) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								local2453 = null;
								if (local764 < 100) {
									local2453 = Static53.aClass66Array10[local764];
								}
								if (local2453 == null) {
									local2453 = Static15.aClass66_1747;
								}
								Static79.aClass66Array14[local27++] = local2453;
								continue;
							}
							if (local211 == 5004) {
								local758 = -1;
								local32--;
								local764 = Static118.anIntArray477[local32];
								if (local764 < 100 && Static53.aClass66Array10[local764] != null) {
									local758 = Static58.anIntArray254[local764];
								}
								Static118.anIntArray477[local32++] = local758;
								continue;
							}
							if (local211 == 5005) {
								Static118.anIntArray477[local32++] = Static103.anInt2539;
								continue;
							}
							if (local211 == 5008) {
								local27--;
								local579 = Static79.aClass66Array14[local27];
								if (local579.method1829(Static55.aClass66_924)) {
									Static98.method1751(local579);
								} else {
									local2453 = local579.method1823();
									@Pc(3550) byte local3550 = 0;
									@Pc(3552) byte local3552 = 0;
									if (local2453.method1829(Static53.aClass66_914)) {
										local579 = local579.method1831(Static53.aClass66_914.method1847());
										local3550 = 0;
									} else if (local2453.method1829(Static33.aClass66_500)) {
										local3550 = 1;
										local579 = local579.method1831(Static33.aClass66_500.method1847());
									} else if (local2453.method1829(Static134.aClass66_1765)) {
										local3550 = 2;
										local579 = local579.method1831(Static134.aClass66_1765.method1847());
									} else if (local2453.method1829(Static105.aClass66_1445)) {
										local3550 = 3;
										local579 = local579.method1831(Static105.aClass66_1445.method1847());
									} else if (local2453.method1829(Static105.aClass66_1434)) {
										local3550 = 4;
										local579 = local579.method1831(Static105.aClass66_1434.method1847());
									} else if (local2453.method1829(Static130.aClass66_1722)) {
										local579 = local579.method1831(Static130.aClass66_1722.method1847());
										local3550 = 5;
									} else if (local2453.method1829(Static71.aClass66_1080)) {
										local3550 = 6;
										local579 = local579.method1831(Static71.aClass66_1080.method1847());
									} else if (local2453.method1829(Static122.aClass66_1657)) {
										local579 = local579.method1831(Static122.aClass66_1657.method1847());
										local3550 = 7;
									} else if (local2453.method1829(Static27.aClass66_454)) {
										local3550 = 8;
										local579 = local579.method1831(Static27.aClass66_454.method1847());
									} else if (local2453.method1829(Static23.aClass66_419)) {
										local579 = local579.method1831(Static23.aClass66_419.method1847());
										local3550 = 9;
									} else if (local2453.method1829(Static34.aClass66_108)) {
										local3550 = 10;
										local579 = local579.method1831(Static34.aClass66_108.method1847());
									} else if (local2453.method1829(Static56.aClass66_933)) {
										local579 = local579.method1831(Static56.aClass66_933.method1847());
										local3550 = 11;
									} else if (Static129.anInt2913 != 0) {
										if (local2453.method1829(Static53.aClass66_912)) {
											local3550 = 0;
											local579 = local579.method1831(Static53.aClass66_912.method1847());
										} else if (local2453.method1829(Static33.aClass66_496)) {
											local579 = local579.method1831(Static33.aClass66_496.method1847());
											local3550 = 1;
										} else if (local2453.method1829(Static134.aClass66_1766)) {
											local3550 = 2;
											local579 = local579.method1831(Static134.aClass66_1766.method1847());
										} else if (local2453.method1829(Static105.aClass66_1437)) {
											local3550 = 3;
											local579 = local579.method1831(Static105.aClass66_1437.method1847());
										} else if (local2453.method1829(Static105.aClass66_1439)) {
											local3550 = 4;
											local579 = local579.method1831(Static105.aClass66_1439.method1847());
										} else if (local2453.method1829(Static130.aClass66_1720)) {
											local579 = local579.method1831(Static130.aClass66_1720.method1847());
											local3550 = 5;
										} else if (local2453.method1829(Static71.aClass66_1082)) {
											local3550 = 6;
											local579 = local579.method1831(Static71.aClass66_1082.method1847());
										} else if (local2453.method1829(Static122.aClass66_1653)) {
											local579 = local579.method1831(Static122.aClass66_1653.method1847());
											local3550 = 7;
										} else if (local2453.method1829(Static27.aClass66_452)) {
											local3550 = 8;
											local579 = local579.method1831(Static27.aClass66_452.method1847());
										} else if (local2453.method1829(Static23.aClass66_416)) {
											local3550 = 9;
											local579 = local579.method1831(Static23.aClass66_416.method1847());
										} else if (local2453.method1829(Static34.aClass66_110)) {
											local579 = local579.method1831(Static34.aClass66_110.method1847());
											local3550 = 10;
										} else if (local2453.method1829(Static56.aClass66_932)) {
											local3550 = 11;
											local579 = local579.method1831(Static56.aClass66_932.method1847());
										}
									}
									local2453 = local579.method1823();
									if (local2453.method1829(Static132.aClass66_1728)) {
										local3552 = 1;
										local579 = local579.method1831(Static132.aClass66_1728.method1847());
									} else if (local2453.method1829(Static68.aClass66_1063)) {
										local3552 = 2;
										local579 = local579.method1831(Static68.aClass66_1063.method1847());
									} else if (local2453.method1829(Static23.aClass66_421)) {
										local3552 = 3;
										local579 = local579.method1831(Static23.aClass66_421.method1847());
									} else if (local2453.method1829(Static102.aClass66_1418)) {
										local579 = local579.method1831(Static102.aClass66_1418.method1847());
										local3552 = 4;
									} else if (local2453.method1829(Static134.aClass66_1762)) {
										local579 = local579.method1831(Static134.aClass66_1762.method1847());
										local3552 = 5;
									} else if (Static129.anInt2913 != 0) {
										if (local2453.method1829(Static132.aClass66_1726)) {
											local3552 = 1;
											local579 = local579.method1831(Static132.aClass66_1726.method1847());
										} else if (local2453.method1829(Static68.aClass66_1056)) {
											local579 = local579.method1831(Static68.aClass66_1056.method1847());
											local3552 = 2;
										} else if (local2453.method1829(Static23.aClass66_424)) {
											local579 = local579.method1831(Static23.aClass66_424.method1847());
											local3552 = 3;
										} else if (local2453.method1829(Static102.aClass66_1417)) {
											local579 = local579.method1831(Static102.aClass66_1417.method1847());
											local3552 = 4;
										} else if (local2453.method1829(Static134.aClass66_1761)) {
											local3552 = 5;
											local579 = local579.method1831(Static134.aClass66_1761.method1847());
										}
									}
									Static127.aClass1_Sub12_Sub1_2.method1227(191);
									Static127.aClass1_Sub12_Sub1_2.method1197(0);
									local641 = Static127.aClass1_Sub12_Sub1_2.anInt1694;
									Static127.aClass1_Sub12_Sub1_2.method1197(local3550);
									Static127.aClass1_Sub12_Sub1_2.method1197(local3552);
									Static52.method1095(local579, Static127.aClass1_Sub12_Sub1_2);
									Static127.aClass1_Sub12_Sub1_2.method1191(Static127.aClass1_Sub12_Sub1_2.anInt1694 - local641);
								}
								continue;
							}
							if (local211 == 5009) {
								local27 -= 2;
								local2453 = Static79.aClass66Array14[local27 + 1];
								local579 = Static79.aClass66Array14[local27];
								Static127.aClass1_Sub12_Sub1_2.method1227(138);
								Static127.aClass1_Sub12_Sub1_2.method1197(0);
								local1060 = Static127.aClass1_Sub12_Sub1_2.anInt1694;
								Static127.aClass1_Sub12_Sub1_2.method1195(local579.method1806());
								Static52.method1095(local2453, Static127.aClass1_Sub12_Sub1_2);
								Static127.aClass1_Sub12_Sub1_2.method1191(Static127.aClass1_Sub12_Sub1_2.anInt1694 - local1060);
								continue;
							}
							if (local211 == 5010) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								local2453 = null;
								if (local764 < 100) {
									local2453 = Static29.aClass66Array2[local764];
								}
								if (local2453 == null) {
									local2453 = Static15.aClass66_1747;
								}
								Static79.aClass66Array14[local27++] = local2453;
								continue;
							}
							if (local211 == 5011) {
								local32--;
								local764 = Static118.anIntArray477[local32];
								local2453 = null;
								if (local764 < 100) {
									local2453 = Static82.aClass66Array16[local764];
								}
								if (local2453 == null) {
									local2453 = Static15.aClass66_1747;
								}
								Static79.aClass66Array14[local27++] = local2453;
								continue;
							}
							if (local211 == 5015) {
								if (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1 == null || Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass66_707 == null) {
									local579 = Static109.aClass66_1489;
								} else {
									local579 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass66_707;
								}
								Static79.aClass66Array14[local27++] = local579;
								continue;
							}
							if (local211 == 5016) {
								Static118.anIntArray477[local32++] = Static100.anInt2501;
								continue;
							}
							if (local211 == 5017) {
								Static118.anIntArray477[local32++] = Static63.anInt1934;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7141) Exception local7141) {
			if (local18.aClass66_1224 == null) {
				if (Static126.anInt2891 != 0) {
					Static103.method1791(0, Static15.aClass66_1747, Static94.aClass66_1339);
				}
				Static93.method1709(local7141, "CS2 - scr:" + local18.aLong130 + " op:" + local37);
			} else {
				@Pc(7178) Class66 local7178 = Static42.method942(30);
				local7178.method1825(Static52.aClass66_860).method1825(local18.aClass66_1224);
				for (local55 = Static119.anInt2775 - 1; local55 >= 0; local55--) {
					local7178.method1825(Static126.aClass66_1690).method1825(Static87.aClass80Array1[local55].aClass1_Sub1_Sub10_1.aClass66_1224);
				}
				if (local37 == 40) {
					local93 = local35[local25];
					local7178.method1825(Static129.aClass66_1718).method1825(Static88.method1632(local93));
				}
				if (Static126.anInt2891 != 0) {
					Static103.method1791(0, Static15.aClass66_1747, Static41.method897(new Class66[] { Static49.aClass66_823, local18.aClass66_1224 }));
				}
				Static93.method1709(local7141, "CS2 - scr:" + local18.aLong130 + " op:" + local37 + new String(local7178.method1810()));
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	public static void method2006() {
		aClass66_1674 = null;
		aClass66_1675 = null;
		aClass60_87 = null;
		aClass66_1676 = null;
		aClass66_1677 = null;
		aClass60_88 = null;
		anIntArray491 = null;
		aClass1_Sub9_Sub1_33 = null;
		aClass65_43 = null;
	}
}
