import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!gf", name = "Vb", descriptor = "Z")
	public static boolean aBoolean85;

	@OriginalMember(owner = "client!gf", name = "Oc", descriptor = "Lclient!ig;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "[I")
	public static int[] anIntArray256 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "Lclient!eh;")
	public static Class28 aClass28_448 = Static170.method3101("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "Z")
	public static final boolean aBoolean79 = false;

	@OriginalMember(owner = "client!gf", name = "Sc", descriptor = "Lclient!eh;")
	private static Class28 aClass28_457 = Static170.method3101("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!gf", name = "db", descriptor = "Lclient!eh;")
	public static Class28 aClass28_449 = aClass28_457;

	@OriginalMember(owner = "client!gf", name = "ub", descriptor = "Lclient!eh;")
	public static Class28 aClass28_452 = Static170.method3101("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!gf", name = "Mb", descriptor = "I")
	public static int anInt1498 = 0;

	@OriginalMember(owner = "client!gf", name = "Nb", descriptor = "I")
	public static int anInt1499 = 1;

	@OriginalMember(owner = "client!gf", name = "kc", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method1196() {
		aClass28_449 = null;
		aClass28_457 = null;
		anIntArray256 = null;
		aClass28_448 = null;
		aClass28_452 = null;
		anIntArray254 = null;
		aClass38_1 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!gf;IB)Lclient!eh;")
	public static Class28 method1200(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		if (!Static78.method1812(Static4.method97(arg0), arg1) && arg0.anObjectArray4 == null) {
			return null;
		} else if (arg0.aClass28Array6 == null || arg0.aClass28Array6.length <= arg1 || arg0.aClass28Array6[arg1] == null || arg0.aClass28Array6[arg1].method915().method901() == 0) {
			return Static168.aBoolean190 ? Static4.method96(new Class28[] { Static138.aClass28_1163, Static146.method2793(arg1) }) : null;
		} else {
			return arg0.aClass28Array6[arg1];
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!ed;I)V")
	public static void method1203(@OriginalArg(1) Class3_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Object[] local6 = arg0.anObjectArray2;
		@Pc(12) int local12 = (Integer) local6[0];
		@Pc(16) Class3_Sub2_Sub8 local16 = Static155.method2946(local12);
		if (local16 == null) {
			return;
		}
		Static34.anInt1041 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = 0;
		@Pc(30) int[] local30 = local16.anIntArray283;
		@Pc(33) int[] local33 = local16.anIntArray282;
		@Pc(35) byte local35 = -1;
		@Pc(49) int local49;
		@Pc(85) int local85;
		try {
			Static78.anIntArray381 = new int[local16.anInt1582];
			Static81.aClass28Array15 = new Class28[local16.anInt1581];
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 0;
			for (local49 = 1; local49 < local6.length; local49++) {
				if (local6[local49] instanceof Integer) {
					local85 = (Integer) local6[local49];
					if (local85 == -2147483647) {
						local85 = arg0.anInt1084;
					}
					if (local85 == -2147483646) {
						local85 = arg0.anInt1085;
					}
					if (local85 == -2147483645) {
						local85 = arg0.aClass33_3 == null ? -1 : arg0.aClass33_3.anInt1471;
					}
					if (local85 == -2147483644) {
						local85 = arg0.anInt1083;
					}
					if (local85 == -2147483643) {
						local85 = arg0.aClass33_3 == null ? -1 : arg0.aClass33_3.anInt1496;
					}
					if (local85 == -2147483642) {
						local85 = arg0.aClass33_4 == null ? -1 : arg0.aClass33_4.anInt1471;
					}
					if (local85 == -2147483641) {
						local85 = arg0.aClass33_4 == null ? -1 : arg0.aClass33_4.anInt1496;
					}
					if (local85 == -2147483640) {
						local85 = arg0.anInt1080;
					}
					if (local85 == -2147483639) {
						local85 = arg0.anInt1081;
					}
					Static78.anIntArray381[local45++] = local85;
				} else if (local6[local49] instanceof Class28) {
					@Pc(65) Class28 local65 = (Class28) local6[local49];
					if (local65.method934(Static17.aClass28_199)) {
						local65 = arg0.aClass28_355;
					}
					Static81.aClass28Array15[local47++] = local65;
				}
			}
			local85 = 0;
			label2214: while (true) {
				local85++;
				if (arg1 < local85) {
					throw new RuntimeException("slow");
				}
				local25++;
				@Pc(200) int local200 = local30[local25];
				@Pc(737) int local737;
				@Pc(742) int local742;
				@Pc(585) int local585;
				@Pc(609) int local609;
				@Pc(546) Class28 local546;
				if (local200 < 100) {
					if (local200 == 0) {
						Static78.anIntArray380[local23++] = local33[local25];
						continue;
					}
					@Pc(220) int local220;
					if (local200 == 1) {
						local220 = local33[local25];
						Static78.anIntArray380[local23++] = Static72.anIntArray354[local220];
						continue;
					}
					if (local200 == 2) {
						local220 = local33[local25];
						local23--;
						Static72.anIntArray354[local220] = Static78.anIntArray380[local23];
						continue;
					}
					if (local200 == 3) {
						Static23.aClass28Array3[local27++] = local16.aClass28Array9[local25];
						continue;
					}
					if (local200 == 6) {
						local25 += local33[local25];
						continue;
					}
					if (local200 == 7) {
						local23 -= 2;
						if (Static78.anIntArray380[local23 + 1] != Static78.anIntArray380[local23]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local200 == 8) {
						local23 -= 2;
						if (Static78.anIntArray380[local23] == Static78.anIntArray380[local23 + 1]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local200 == 9) {
						local23 -= 2;
						if (Static78.anIntArray380[local23] < Static78.anIntArray380[local23 + 1]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local200 == 10) {
						local23 -= 2;
						if (Static78.anIntArray380[local23] > Static78.anIntArray380[local23 + 1]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local200 == 21) {
						if (Static34.anInt1041 == 0) {
							return;
						}
						@Pc(376) Class64 local376 = Static80.aClass64Array11[--Static34.anInt1041];
						local25 = local376.anInt3083;
						local16 = local376.aClass3_Sub2_Sub8_1;
						local33 = local16.anIntArray282;
						Static81.aClass28Array15 = local376.aClass28Array19;
						Static78.anIntArray381 = local376.anIntArray536;
						local30 = local16.anIntArray283;
						continue;
					}
					if (local200 == 25) {
						local220 = local33[local25];
						Static78.anIntArray380[local23++] = Static138.method2708(local220);
						continue;
					}
					if (local200 == 27) {
						local220 = local33[local25];
						local23--;
						Static65.method1572(Static78.anIntArray380[local23], local220);
						continue;
					}
					if (local200 == 31) {
						local23 -= 2;
						if (Static78.anIntArray380[local23 + 1] >= Static78.anIntArray380[local23]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local200 == 32) {
						local23 -= 2;
						if (Static78.anIntArray380[local23] >= Static78.anIntArray380[local23 + 1]) {
							local25 += local33[local25];
						}
						continue;
					}
					if (local200 == 33) {
						Static78.anIntArray380[local23++] = Static78.anIntArray381[local33[local25]];
						continue;
					}
					@Pc(491) int local491;
					if (local200 == 34) {
						local491 = local33[local25];
						local23--;
						Static78.anIntArray381[local491] = Static78.anIntArray380[local23];
						continue;
					}
					if (local200 == 35) {
						Static23.aClass28Array3[local27++] = Static81.aClass28Array15[local33[local25]];
						continue;
					}
					if (local200 == 36) {
						local491 = local33[local25];
						local27--;
						Static81.aClass28Array15[local491] = Static23.aClass28Array3[local27];
						continue;
					}
					if (local200 == 37) {
						local220 = local33[local25];
						local27 -= local220;
						local546 = Static63.method1492(local27, Static23.aClass28Array3, local220);
						Static23.aClass28Array3[local27++] = local546;
						continue;
					}
					if (local200 == 38) {
						local23--;
						continue;
					}
					if (local200 == 39) {
						local27--;
						continue;
					}
					if (local200 == 40) {
						local220 = local33[local25];
						@Pc(575) Class3_Sub2_Sub8 local575 = Static155.method2946(local220);
						@Pc(579) int[] local579 = new int[local575.anInt1582];
						@Pc(583) Class28[] local583 = new Class28[local575.anInt1581];
						for (local585 = 0; local585 < local575.anInt1586; local585++) {
							local579[local585] = Static78.anIntArray380[local23 + local585 - local575.anInt1586];
						}
						for (local609 = 0; local609 < local575.anInt1588; local609++) {
							local583[local609] = Static23.aClass28Array3[local27 + local609 - local575.anInt1588];
						}
						local27 -= local575.anInt1588;
						local23 -= local575.anInt1586;
						@Pc(645) Class64 local645 = new Class64();
						local645.anInt3083 = local25;
						local645.anIntArray536 = Static78.anIntArray381;
						local645.aClass28Array19 = Static81.aClass28Array15;
						local645.aClass3_Sub2_Sub8_1 = local16;
						if (Static34.anInt1041 >= Static80.aClass64Array11.length) {
							throw new RuntimeException();
						}
						local16 = local575;
						local25 = -1;
						Static80.aClass64Array11[Static34.anInt1041++] = local645;
						Static78.anIntArray381 = local579;
						local30 = local575.anIntArray283;
						Static81.aClass28Array15 = local583;
						local33 = local575.anIntArray282;
						continue;
					}
					if (local200 == 42) {
						Static78.anIntArray380[local23++] = Static105.anIntArray480[local33[local25]];
						continue;
					}
					if (local200 == 43) {
						local491 = local33[local25];
						local23--;
						Static105.anIntArray480[local491] = Static78.anIntArray380[local23];
						continue;
					}
					if (local200 == 44) {
						local220 = local33[local25] >> 16;
						local737 = local33[local25] & 0xFFFF;
						local23--;
						local742 = Static78.anIntArray380[local23];
						if (local742 >= 0 && local742 <= 5000) {
							@Pc(758) byte local758 = -1;
							if (local737 == 105) {
								local758 = 0;
							}
							Static115.anIntArray513[local220] = local742;
							local585 = 0;
							while (true) {
								if (local585 >= local742) {
									continue label2214;
								}
								Static146.anIntArrayArray27[local220][local585] = local758;
								local585++;
							}
						}
						throw new RuntimeException();
					}
					if (local200 == 45) {
						local220 = local33[local25];
						local23--;
						local737 = Static78.anIntArray380[local23];
						if (local737 >= 0 && Static115.anIntArray513[local220] > local737) {
							Static78.anIntArray380[local23++] = Static146.anIntArrayArray27[local220][local737];
							continue;
						}
						throw new RuntimeException();
					}
					if (local200 == 46) {
						local23 -= 2;
						local737 = Static78.anIntArray380[local23];
						local220 = local33[local25];
						if (local737 >= 0 && local737 < Static115.anIntArray513[local220]) {
							Static146.anIntArrayArray27[local220][local737] = Static78.anIntArray380[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local200 == 47) {
						@Pc(870) Class28 local870 = Static73.aClass28Array13[local33[local25]];
						if (local870 == null) {
							local870 = Static80.aClass28_1200;
						}
						Static23.aClass28Array3[local27++] = local870;
						continue;
					}
					if (local200 == 48) {
						local491 = local33[local25];
						local27--;
						Static73.aClass28Array13[local491] = Static23.aClass28Array3[local27];
						continue;
					}
				}
				@Pc(902) boolean local902;
				if (local33[local25] == 1) {
					local902 = true;
				} else {
					local902 = false;
				}
				@Pc(1119) Class33 local1119;
				@Pc(940) Class33 local940;
				@Pc(965) int local965;
				@Pc(1049) Class33 local1049;
				@Pc(924) int local924;
				if (local200 < 300) {
					if (local200 == 100) {
						local23 -= 3;
						local737 = Static78.anIntArray380[local23];
						local924 = Static78.anIntArray380[local23 + 2];
						local742 = Static78.anIntArray380[local23 + 1];
						if (local742 == 0) {
							throw new RuntimeException();
						}
						local940 = Static19.method576(local737);
						if (local940.aClass33Array2 == null) {
							local940.aClass33Array2 = new Class33[local924 + 1];
						}
						if (local924 >= local940.aClass33Array2.length) {
							@Pc(963) Class33[] local963 = new Class33[local924 + 1];
							for (local965 = 0; local965 < local940.aClass33Array2.length; local965++) {
								local963[local965] = local940.aClass33Array2[local965];
							}
							local940.aClass33Array2 = local963;
						}
						if (local924 > 0 && local940.aClass33Array2[local924 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local924 - 1));
						}
						@Pc(1008) Class33 local1008 = new Class33();
						local1008.anInt1496 = local924;
						local1008.anInt1488 = local1008.anInt1471 = local940.anInt1471;
						local1008.aBoolean90 = true;
						local1008.anInt1522 = local742;
						local940.aClass33Array2[local924] = local1008;
						if (local902) {
							Static157.aClass33_11 = local1008;
						} else {
							Static166.aClass33_14 = local1008;
						}
						Static16.method534(local940);
						continue;
					}
					@Pc(1071) Class33 local1071;
					if (local200 == 101) {
						local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
						if (local1049.anInt1496 == -1) {
							if (!local902) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1071 = Static19.method576(local1049.anInt1471);
						local1071.aClass33Array2[local1049.anInt1496] = null;
						Static16.method534(local1071);
						continue;
					}
					if (local200 == 102) {
						local23--;
						local1049 = Static19.method576(Static78.anIntArray380[local23]);
						local1049.aClass33Array2 = null;
						Static16.method534(local1049);
						continue;
					}
					if (local200 == 200) {
						local23 -= 2;
						local737 = Static78.anIntArray380[local23];
						local742 = Static78.anIntArray380[local23 + 1];
						local1119 = Static27.method739(local737, local742);
						if (local1119 != null && local742 != -1) {
							Static78.anIntArray380[local23++] = 1;
							if (local902) {
								Static157.aClass33_11 = local1119;
							} else {
								Static166.aClass33_14 = local1119;
							}
							continue;
						}
						Static78.anIntArray380[local23++] = 0;
						continue;
					}
					if (local200 == 201) {
						local23--;
						local737 = Static78.anIntArray380[local23];
						local1071 = Static19.method576(local737);
						if (local1071 == null) {
							Static78.anIntArray380[local23++] = 0;
						} else {
							Static78.anIntArray380[local23++] = 1;
							if (local902) {
								Static157.aClass33_11 = local1071;
							} else {
								Static166.aClass33_14 = local1071;
							}
						}
						continue;
					}
				} else if (local200 < 500) {
					if (local200 == 403) {
						local23 -= 2;
						local737 = Static78.anIntArray380[local23];
						if (local737 >= 7) {
							local737 -= 7;
						}
						local742 = Static78.anIntArray380[local23 + 1];
						Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1.method2970(local737, local742);
						continue;
					}
					if (local200 == 404) {
						local23 -= 2;
						local737 = Static78.anIntArray380[local23];
						local742 = Static78.anIntArray380[local23 + 1];
						Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1.method2966(local737, local742);
						continue;
					}
					if (local200 == 410) {
						local23--;
						@Pc(7584) boolean local7584 = Static78.anIntArray380[local23] != 0;
						Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1.method2975(local7584);
						continue;
					}
				} else if (local200 >= 1000 && local200 < 1100 || local200 >= 2000 && local200 < 2100) {
					if (local200 >= 2000) {
						local200 -= 1000;
						local23--;
						local1049 = Static19.method576(Static78.anIntArray380[local23]);
					} else {
						local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
					}
					if (local200 == 1000) {
						local23 -= 2;
						local1049.anInt1492 = Static78.anIntArray380[local23];
						local1049.anInt1480 = Static78.anIntArray380[local23 + 1];
						Static16.method534(local1049);
						continue;
					}
					if (local200 == 1001) {
						local23 -= 2;
						local1049.anInt1457 = Static78.anIntArray380[local23];
						local1049.anInt1515 = Static78.anIntArray380[local23 + 1];
						Static16.method534(local1049);
						continue;
					}
					if (local200 == 1003) {
						local23--;
						@Pc(7511) boolean local7511 = Static78.anIntArray380[local23] == 1;
						if (local1049.aBoolean78 != local7511) {
							local1049.aBoolean78 = local7511;
							Static16.method534(local1049);
						}
						continue;
					}
				} else {
					@Pc(2042) Class28 local2042;
					if (local200 >= 1100 && local200 < 1200 || !(local200 < 2100 || local200 >= 2200)) {
						if (local200 >= 2000) {
							local23--;
							local1049 = Static19.method576(Static78.anIntArray380[local23]);
							local200 -= 1000;
						} else {
							local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
						}
						if (local200 == 1100) {
							local23 -= 2;
							local1049.anInt1524 = Static78.anIntArray380[local23];
							if (local1049.anInt1524 > local1049.anInt1520 - local1049.anInt1457) {
								local1049.anInt1524 = local1049.anInt1520 - local1049.anInt1457;
							}
							if (local1049.anInt1524 < 0) {
								local1049.anInt1524 = 0;
							}
							local1049.anInt1490 = Static78.anIntArray380[local23 + 1];
							if (local1049.anInt1458 - local1049.anInt1515 < local1049.anInt1490) {
								local1049.anInt1490 = local1049.anInt1458 - local1049.anInt1515;
							}
							if (local1049.anInt1490 < 0) {
								local1049.anInt1490 = 0;
							}
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1101) {
							local23--;
							local1049.anInt1461 = Static78.anIntArray380[local23];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1102) {
							local23--;
							local1049.aBoolean80 = Static78.anIntArray380[local23] == 1;
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1103) {
							local23--;
							local1049.anInt1456 = Static78.anIntArray380[local23];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1104) {
							local23--;
							local1049.anInt1463 = Static78.anIntArray380[local23];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1105) {
							local23--;
							local1049.anInt1510 = Static78.anIntArray380[local23];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1106) {
							local23--;
							local1049.anInt1484 = Static78.anIntArray380[local23];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1107) {
							local23--;
							local1049.aBoolean89 = Static78.anIntArray380[local23] == 1;
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1108) {
							local1049.anInt1493 = 1;
							local23--;
							local1049.anInt1455 = Static78.anIntArray380[local23];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1109) {
							local23 -= 6;
							local1049.anInt1526 = Static78.anIntArray380[local23];
							local1049.anInt1459 = Static78.anIntArray380[local23 + 1];
							local1049.anInt1474 = Static78.anIntArray380[local23 + 2];
							local1049.anInt1508 = Static78.anIntArray380[local23 + 3];
							local1049.anInt1504 = Static78.anIntArray380[local23 + 4];
							local1049.anInt1519 = Static78.anIntArray380[local23 + 5];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1110) {
							local23--;
							local742 = Static78.anIntArray380[local23];
							if (local742 != local1049.anInt1523) {
								local1049.anInt1523 = local742;
								local1049.anInt1467 = 0;
								local1049.anInt1485 = 0;
								Static16.method534(local1049);
							}
							continue;
						}
						if (local200 == 1111) {
							local23--;
							local1049.aBoolean84 = Static78.anIntArray380[local23] == 1;
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1112) {
							local27--;
							local2042 = Static23.aClass28Array3[local27];
							if (!local2042.method934(local1049.aClass28_455)) {
								local1049.aClass28_455 = local2042;
								Static16.method534(local1049);
							}
							continue;
						}
						if (local200 == 1113) {
							local23--;
							local1049.anInt1530 = Static78.anIntArray380[local23];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1114) {
							local23 -= 3;
							local1049.anInt1473 = Static78.anIntArray380[local23];
							local1049.anInt1466 = Static78.anIntArray380[local23 + 1];
							local1049.anInt1478 = Static78.anIntArray380[local23 + 2];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1115) {
							local23--;
							local1049.aBoolean81 = Static78.anIntArray380[local23] == 1;
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1116) {
							local23--;
							local1049.anInt1506 = Static78.anIntArray380[local23];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1117) {
							local23--;
							local1049.anInt1482 = Static78.anIntArray380[local23];
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1118) {
							local23--;
							local1049.aBoolean83 = Static78.anIntArray380[local23] == 1;
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1119) {
							local23--;
							local1049.aBoolean77 = Static78.anIntArray380[local23] == 1;
							Static16.method534(local1049);
							continue;
						}
						if (local200 == 1120) {
							local23 -= 2;
							local1049.anInt1520 = Static78.anIntArray380[local23];
							local1049.anInt1458 = Static78.anIntArray380[local23 + 1];
							Static16.method534(local1049);
							continue;
						}
					} else if (local200 >= 1200 && local200 < 1300 || !(local200 < 2200 || local200 >= 2300)) {
						if (local200 >= 2000) {
							local23--;
							local1049 = Static19.method576(Static78.anIntArray380[local23]);
							local200 -= 1000;
						} else {
							local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
						}
						Static16.method534(local1049);
						if (local200 == 1200) {
							local23 -= 2;
							local742 = Static78.anIntArray380[local23];
							local924 = Static78.anIntArray380[local23 + 1];
							local1049.anInt1514 = local742;
							local1049.anInt1511 = local924;
							@Pc(1275) Class3_Sub2_Sub10 local1275 = Static76.method1736(local742);
							local1049.anInt1504 = local1275.anInt1884;
							local1049.anInt1519 = local1275.anInt1880;
							local1049.anInt1459 = local1275.anInt1867;
							if (local1049.anInt1457 > 0) {
								local1049.anInt1519 = local1049.anInt1519 * 32 / local1049.anInt1457;
							}
							local1049.anInt1526 = local1275.anInt1879;
							local1049.anInt1508 = local1275.anInt1873;
							local1049.anInt1474 = local1275.anInt1895;
							continue;
						}
						if (local200 == 1201) {
							local1049.anInt1493 = 2;
							local23--;
							local1049.anInt1455 = Static78.anIntArray380[local23];
							continue;
						}
						if (local200 == 1202) {
							local1049.anInt1493 = 3;
							local1049.anInt1455 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1.method2976();
							continue;
						}
						if (local200 == 1203) {
							local1049.anInt1493 = 6;
							local23--;
							local1049.anInt1455 = Static78.anIntArray380[local23];
							continue;
						}
						if (local200 == 1204) {
							local1049.anInt1493 = 5;
							local23--;
							local1049.anInt1455 = Static78.anIntArray380[local23];
							continue;
						}
					} else if (local200 >= 1300 && local200 < 1400 || local200 >= 2300 && local200 < 2400) {
						if (local200 < 2000) {
							local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
						} else {
							local200 -= 1000;
							local23--;
							local1049 = Static19.method576(Static78.anIntArray380[local23]);
						}
						if (local200 == 1300) {
							local23--;
							local742 = Static78.anIntArray380[local23] - 1;
							if (local742 >= 0 && local742 <= 9) {
								local27--;
								local1049.method1201(local742, Static23.aClass28Array3[local27]);
								continue;
							}
							local27--;
							continue;
						}
						if (local200 == 1301) {
							local23 -= 2;
							local924 = Static78.anIntArray380[local23 + 1];
							local742 = Static78.anIntArray380[local23];
							local1049.aClass33_7 = Static27.method739(local742, local924);
							continue;
						}
						if (local200 == 1302) {
							local23--;
							local1049.aBoolean76 = Static78.anIntArray380[local23] == 1;
							continue;
						}
						if (local200 == 1303) {
							local23--;
							local1049.anInt1525 = Static78.anIntArray380[local23];
							continue;
						}
						if (local200 == 1304) {
							local23--;
							local1049.anInt1513 = Static78.anIntArray380[local23];
							continue;
						}
						if (local200 == 1305) {
							local27--;
							local1049.aClass28_450 = Static23.aClass28Array3[local27];
							continue;
						}
						if (local200 == 1306) {
							local27--;
							local1049.aClass28_453 = Static23.aClass28Array3[local27];
							continue;
						}
						if (local200 == 1307) {
							local1049.aClass28Array6 = null;
							continue;
						}
					} else {
						if (local200 >= 1400 && local200 < 1500 || local200 >= 2400 && local200 < 2500) {
							if (local200 >= 2000) {
								local200 -= 1000;
								local23--;
								local1049 = Static19.method576(Static78.anIntArray380[local23]);
							} else {
								local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
							}
							local27--;
							local2042 = Static23.aClass28Array3[local27];
							@Pc(6648) int[] local6648 = null;
							if (local2042.method901() > 0 && local2042.method917(local2042.method901() - 1) == 89) {
								local23--;
								local585 = Static78.anIntArray380[local23];
								if (local585 > 0) {
									local6648 = new int[local585];
									while (local585-- > 0) {
										local23--;
										local6648[local585] = Static78.anIntArray380[local23];
									}
								}
								local2042 = local2042.method926(local2042.method901() - 1, 0);
							}
							@Pc(6710) Object[] local6710 = new Object[local2042.method901() + 1];
							for (local609 = local6710.length - 1; local609 >= 1; local609--) {
								if (local2042.method917(local609 - 1) == 115) {
									local27--;
									local6710[local609] = Static23.aClass28Array3[local27];
								} else {
									local23--;
									local6710[local609] = Integer.valueOf(Static78.anIntArray380[local23]);
								}
							}
							local23--;
							local965 = Static78.anIntArray380[local23];
							if (local965 == -1) {
								local6710 = null;
							} else {
								local6710[0] = Integer.valueOf(local965);
							}
							if (local200 == 1411) {
								local1049.anObjectArray10 = local6710;
							}
							if (local200 == 1423) {
								local1049.anObjectArray8 = local6710;
							}
							if (local200 == 1400) {
								local1049.anObjectArray15 = local6710;
							}
							if (local200 == 1404) {
								local1049.anObjectArray21 = local6710;
							}
							local1049.aBoolean82 = true;
							if (local200 == 1405) {
								local1049.anObjectArray11 = local6710;
							}
							if (local200 == 1402) {
								local1049.anObjectArray14 = local6710;
							}
							if (local200 == 1408) {
								local1049.anObjectArray19 = local6710;
							}
							if (local200 == 1425) {
								local1049.anObjectArray29 = local6710;
							}
							if (local200 == 1401) {
								local1049.anObjectArray12 = local6710;
							}
							if (local200 == 1419) {
								local1049.anObjectArray5 = local6710;
							}
							if (local200 == 1415) {
								local1049.anIntArray262 = local6648;
								local1049.anObjectArray24 = local6710;
							}
							if (local200 == 1421) {
								local1049.anObjectArray16 = local6710;
							}
							if (local200 == 1407) {
								local1049.anObjectArray26 = local6710;
								local1049.anIntArray264 = local6648;
							}
							if (local200 == 1414) {
								local1049.anIntArray255 = local6648;
								local1049.anObjectArray6 = local6710;
							}
							if (local200 == 1403) {
								local1049.anObjectArray13 = local6710;
							}
							if (local200 == 1422) {
								local1049.anObjectArray9 = local6710;
							}
							if (local200 == 1416) {
								local1049.anObjectArray23 = local6710;
							}
							if (local200 == 1412) {
								local1049.anObjectArray22 = local6710;
							}
							if (local200 == 1418) {
								local1049.anObjectArray18 = local6710;
							}
							if (local200 == 1420) {
								local1049.anObjectArray7 = local6710;
							}
							if (local200 == 1417) {
								local1049.anObjectArray27 = local6710;
							}
							if (local200 == 1410) {
								local1049.anObjectArray20 = local6710;
							}
							if (local200 == 1406) {
								local1049.anObjectArray17 = local6710;
							}
							if (local200 == 1424) {
								local1049.anObjectArray25 = local6710;
							}
							if (local200 == 1409) {
								local1049.anObjectArray4 = local6710;
							}
							continue;
						}
						if (local200 < 1600) {
							local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
							if (local200 == 1500) {
								Static78.anIntArray380[local23++] = local1049.anInt1492;
								continue;
							}
							if (local200 == 1501) {
								Static78.anIntArray380[local23++] = local1049.anInt1480;
								continue;
							}
							if (local200 == 1502) {
								Static78.anIntArray380[local23++] = local1049.anInt1457;
								continue;
							}
							if (local200 == 1503) {
								Static78.anIntArray380[local23++] = local1049.anInt1515;
								continue;
							}
							if (local200 == 1504) {
								Static78.anIntArray380[local23++] = local1049.aBoolean78 ? 1 : 0;
								continue;
							}
							if (local200 == 1505) {
								Static78.anIntArray380[local23++] = local1049.anInt1488;
								continue;
							}
						} else if (local200 < 1700) {
							local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
							if (local200 == 1600) {
								Static78.anIntArray380[local23++] = local1049.anInt1524;
								continue;
							}
							if (local200 == 1601) {
								Static78.anIntArray380[local23++] = local1049.anInt1490;
								continue;
							}
							if (local200 == 1602) {
								Static23.aClass28Array3[local27++] = local1049.aClass28_455;
								continue;
							}
							if (local200 == 1603) {
								Static78.anIntArray380[local23++] = local1049.anInt1520;
								continue;
							}
							if (local200 == 1604) {
								Static78.anIntArray380[local23++] = local1049.anInt1458;
								continue;
							}
							if (local200 == 1605) {
								Static78.anIntArray380[local23++] = local1049.anInt1519;
								continue;
							}
							if (local200 == 1606) {
								Static78.anIntArray380[local23++] = local1049.anInt1474;
								continue;
							}
							if (local200 == 1607) {
								Static78.anIntArray380[local23++] = local1049.anInt1504;
								continue;
							}
							if (local200 == 1608) {
								Static78.anIntArray380[local23++] = local1049.anInt1508;
								continue;
							}
							if (local200 == 1609) {
								Static78.anIntArray380[local23++] = local1049.anInt1456;
								continue;
							}
						} else if (local200 < 1800) {
							local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
							if (local200 == 1700) {
								Static78.anIntArray380[local23++] = local1049.anInt1514;
								continue;
							}
							if (local200 == 1701) {
								if (local1049.anInt1514 == -1) {
									Static78.anIntArray380[local23++] = 0;
								} else {
									Static78.anIntArray380[local23++] = local1049.anInt1511;
								}
								continue;
							}
							if (local200 == 1702) {
								Static78.anIntArray380[local23++] = local1049.anInt1496;
								continue;
							}
						} else if (local200 < 1900) {
							local1049 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
							if (local200 == 1800) {
								Static78.anIntArray380[local23++] = Static161.method3002(Static4.method97(local1049));
								continue;
							}
							if (local200 == 1801) {
								local23--;
								local742 = Static78.anIntArray380[local23];
								local742--;
								if (local1049.aClass28Array6 != null && local1049.aClass28Array6.length > local742 && local1049.aClass28Array6[local742] != null) {
									Static23.aClass28Array3[local27++] = local1049.aClass28Array6[local742];
									continue;
								}
								Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								continue;
							}
							if (local200 == 1802) {
								if (local1049.aClass28_450 == null) {
									Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								} else {
									Static23.aClass28Array3[local27++] = local1049.aClass28_450;
								}
								continue;
							}
						} else if (local200 < 2600) {
							local23--;
							local1049 = Static19.method576(Static78.anIntArray380[local23]);
							if (local200 == 2500) {
								Static78.anIntArray380[local23++] = local1049.anInt1492;
								continue;
							}
							if (local200 == 2501) {
								Static78.anIntArray380[local23++] = local1049.anInt1480;
								continue;
							}
							if (local200 == 2502) {
								Static78.anIntArray380[local23++] = local1049.anInt1457;
								continue;
							}
							if (local200 == 2503) {
								Static78.anIntArray380[local23++] = local1049.anInt1515;
								continue;
							}
							if (local200 == 2504) {
								Static78.anIntArray380[local23++] = local1049.aBoolean78 ? 1 : 0;
								continue;
							}
							if (local200 == 2505) {
								Static78.anIntArray380[local23++] = local1049.anInt1488;
								continue;
							}
						} else if (local200 < 2700) {
							local23--;
							local1049 = Static19.method576(Static78.anIntArray380[local23]);
							if (local200 == 2600) {
								Static78.anIntArray380[local23++] = local1049.anInt1524;
								continue;
							}
							if (local200 == 2601) {
								Static78.anIntArray380[local23++] = local1049.anInt1490;
								continue;
							}
							if (local200 == 2602) {
								Static23.aClass28Array3[local27++] = local1049.aClass28_455;
								continue;
							}
							if (local200 == 2603) {
								Static78.anIntArray380[local23++] = local1049.anInt1520;
								continue;
							}
							if (local200 == 2604) {
								Static78.anIntArray380[local23++] = local1049.anInt1458;
								continue;
							}
							if (local200 == 2605) {
								Static78.anIntArray380[local23++] = local1049.anInt1519;
								continue;
							}
							if (local200 == 2606) {
								Static78.anIntArray380[local23++] = local1049.anInt1474;
								continue;
							}
							if (local200 == 2607) {
								Static78.anIntArray380[local23++] = local1049.anInt1504;
								continue;
							}
							if (local200 == 2608) {
								Static78.anIntArray380[local23++] = local1049.anInt1508;
								continue;
							}
							if (local200 == 2609) {
								Static78.anIntArray380[local23++] = local1049.anInt1456;
								continue;
							}
						} else if (local200 < 2800) {
							if (local200 == 2700) {
								local23--;
								local1049 = Static19.method576(Static78.anIntArray380[local23]);
								Static78.anIntArray380[local23++] = local1049.anInt1514;
								continue;
							}
							if (local200 == 2701) {
								local23--;
								local1049 = Static19.method576(Static78.anIntArray380[local23]);
								if (local1049.anInt1514 == -1) {
									Static78.anIntArray380[local23++] = 0;
								} else {
									Static78.anIntArray380[local23++] = local1049.anInt1511;
								}
								continue;
							}
							if (local200 == 2702) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								@Pc(6228) Class3_Sub7 local6228 = (Class3_Sub7) Static119.aClass87_11.method3201((long) local737);
								if (local6228 == null) {
									Static78.anIntArray380[local23++] = 0;
								} else {
									Static78.anIntArray380[local23++] = 1;
								}
								continue;
							}
							if (local200 == 2703) {
								local23--;
								local1049 = Static19.method576(Static78.anIntArray380[local23]);
								if (local1049.aClass33Array2 == null) {
									Static78.anIntArray380[local23++] = 0;
									continue;
								}
								local742 = local1049.aClass33Array2.length;
								for (local924 = 0; local924 < local1049.aClass33Array2.length; local924++) {
									if (local1049.aClass33Array2[local924] == null) {
										local742 = local924;
										break;
									}
								}
								Static78.anIntArray380[local23++] = local742;
								continue;
							}
							if (local200 == 2704 || local200 == 2705) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								@Pc(6320) Class3_Sub7 local6320 = (Class3_Sub7) Static119.aClass87_11.method3201((long) local737);
								if (local6320 != null && local742 == local6320.anInt1548) {
									Static78.anIntArray380[local23++] = 1;
									continue;
								}
								Static78.anIntArray380[local23++] = 0;
								continue;
							}
						} else if (local200 < 2900) {
							local23--;
							local1049 = Static19.method576(Static78.anIntArray380[local23]);
							if (local200 == 2800) {
								Static78.anIntArray380[local23++] = Static161.method3002(Static4.method97(local1049));
								continue;
							}
							if (local200 == 2801) {
								local23--;
								local742 = Static78.anIntArray380[local23];
								local742--;
								if (local1049.aClass28Array6 != null && local1049.aClass28Array6.length > local742 && local1049.aClass28Array6[local742] != null) {
									Static23.aClass28Array3[local27++] = local1049.aClass28Array6[local742];
									continue;
								}
								Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								continue;
							}
							if (local200 == 2802) {
								if (local1049.aClass28_450 == null) {
									Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								} else {
									Static23.aClass28Array3[local27++] = local1049.aClass28_450;
								}
								continue;
							}
						} else if (local200 < 3200) {
							if (local200 == 3100) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static51.method1192(Static111.aClass28_920, 0, local546);
								continue;
							}
							if (local200 == 3101) {
								local23 -= 2;
								Static76.method1740(Static78.anIntArray380[local23], Static78.anIntArray380[local23 + 1], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1);
								continue;
							}
							if (local200 == 3103) {
								Static166.method3063();
								continue;
							}
							if (local200 == 3104) {
								local742 = 0;
								local27--;
								local546 = Static23.aClass28Array3[local27];
								if (local546.method927()) {
									local742 = local546.method929();
								}
								Static51.aClass3_Sub8_Sub1_2.method1559(242);
								Static51.aClass3_Sub8_Sub1_2.method1547(local742);
								continue;
							}
							if (local200 == 3105) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static51.aClass3_Sub8_Sub1_2.method1559(21);
								Static51.aClass3_Sub8_Sub1_2.method1541(local546.method924());
								continue;
							}
							if (local200 == 3106) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static51.aClass3_Sub8_Sub1_2.method1559(196);
								Static51.aClass3_Sub8_Sub1_2.method1550(local546.method901() + 1);
								Static51.aClass3_Sub8_Sub1_2.method1538(local546);
								continue;
							}
							if (local200 == 3107) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								local27--;
								local2042 = Static23.aClass28Array3[local27];
								Static152.method2882(local737, local2042);
								continue;
							}
							if (local200 == 3108) {
								local23 -= 3;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								local924 = Static78.anIntArray380[local23 + 2];
								local940 = Static19.method576(local924);
								Static112.method2248(local737, local742, local940);
								continue;
							}
							if (local200 == 3109) {
								local23 -= 2;
								local1119 = local902 ? Static157.aClass33_11 : Static166.aClass33_14;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static112.method2248(local737, local742, local1119);
								continue;
							}
							if (local200 == 3110) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static51.aClass3_Sub8_Sub1_2.method1559(133);
								Static51.aClass3_Sub8_Sub1_2.method1531(local737);
								continue;
							}
						} else if (local200 < 3300) {
							if (local200 == 3200) {
								local23 -= 3;
								Static18.method567(Static78.anIntArray380[local23 + 1], Static78.anIntArray380[local23 + 2], Static78.anIntArray380[local23]);
								continue;
							}
							if (local200 == 3201) {
								local23--;
								Static99.method2102(Static78.anIntArray380[local23]);
								continue;
							}
							if (local200 == 3202) {
								local23 -= 2;
								Static70.method1650(Static78.anIntArray380[local23 + 1], Static78.anIntArray380[local23]);
								continue;
							}
						} else if (local200 < 3400) {
							if (local200 == 3300) {
								Static78.anIntArray380[local23++] = Static14.anInt481;
								continue;
							}
							if (local200 == 3301) {
								local23 -= 2;
								local742 = Static78.anIntArray380[local23 + 1];
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static156.method2961(local737, local742);
								continue;
							}
							if (local200 == 3302) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = Static81.method1867(local742, local737);
								continue;
							}
							if (local200 == 3303) {
								local23 -= 2;
								local742 = Static78.anIntArray380[local23 + 1];
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static118.method2368(local737, local742);
								continue;
							}
							if (local200 == 3304) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static140.method2742(local737).anInt3927;
								continue;
							}
							if (local200 == 3305) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static18.anIntArray144[local737];
								continue;
							}
							if (local200 == 3306) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static95.anIntArray451[local737];
								continue;
							}
							if (local200 == 3307) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static111.anIntArray498[local737];
								continue;
							}
							if (local200 == 3308) {
								local924 = (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 >> 7) + Static29.anInt907;
								local742 = Static111.anInt2843 + (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 >> 7);
								local737 = Static171.anInt4109;
								Static78.anIntArray380[local23++] = (local737 << 28) + (local742 << 14) + local924;
								continue;
							}
							if (local200 == 3309) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = local737 >> 14 & 0x3FFF;
								continue;
							}
							if (local200 == 3310) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = local737 >> 28;
								continue;
							}
							if (local200 == 3311) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = local737 & 0x3FFF;
								continue;
							}
							if (local200 == 3312) {
								Static78.anIntArray380[local23++] = Static86.aBoolean127 ? 1 : 0;
								continue;
							}
							if (local200 == 3313) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23] + 32768;
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = Static156.method2961(local737, local742);
								continue;
							}
							if (local200 == 3314) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23] + 32768;
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = Static81.method1867(local742, local737);
								continue;
							}
							if (local200 == 3315) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23] + 32768;
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = Static118.method2368(local737, local742);
								continue;
							}
							if (local200 == 3316) {
								if (Static32.anInt991 < 2) {
									Static78.anIntArray380[local23++] = 0;
								} else {
									Static78.anIntArray380[local23++] = Static32.anInt991;
								}
								continue;
							}
							if (local200 == 3317) {
								Static78.anIntArray380[local23++] = Static135.anInt3444;
								continue;
							}
							if (local200 == 3318) {
								Static78.anIntArray380[local23++] = Static170.anInt4098;
								continue;
							}
							if (local200 == 3321) {
								Static78.anIntArray380[local23++] = Static139.anInt3674;
								continue;
							}
							if (local200 == 3322) {
								Static78.anIntArray380[local23++] = Static35.anInt1048;
								continue;
							}
							if (local200 == 3323) {
								if (Static32.anInt991 == 1) {
									Static78.anIntArray380[local23++] = 1;
								} else {
									Static78.anIntArray380[local23++] = 0;
								}
								continue;
							}
							if (local200 == 3324) {
								if (Static26.anInt716 >= 5 && Static26.anInt716 <= 9) {
									Static78.anIntArray380[local23++] = Static26.anInt716;
									continue;
								}
								Static78.anIntArray380[local23++] = 0;
								continue;
							}
							if (local200 == 3325) {
								if (Static22.anInt598 > 0) {
									Static78.anIntArray380[local23++] = 1;
								} else {
									Static78.anIntArray380[local23++] = 0;
								}
								continue;
							}
							if (local200 == 3326) {
								Static78.anIntArray380[local23++] = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt877;
								continue;
							}
							if (local200 == 3327) {
								Static78.anIntArray380[local23++] = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1.aBoolean180 ? 1 : 0;
								continue;
							}
						} else if (local200 < 3500) {
							if (local200 == 3400) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								@Pc(2159) Class3_Sub2_Sub14 local2159 = Static76.method1742(local737);
								for (local585 = 0; local585 < local2159.anInt2750; local585++) {
									if (local742 == local2159.anIntArray484[local585]) {
										Static23.aClass28Array3[local27++] = local2159.aClass28Array16[local585];
										local2159 = null;
										break;
									}
								}
								if (local2159 != null) {
									Static23.aClass28Array3[local27++] = local2159.aClass28_885;
								}
								continue;
							}
							if (local200 == 3408) {
								local23 -= 4;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								local924 = Static78.anIntArray380[local23 + 2];
								local585 = Static78.anIntArray380[local23 + 3];
								@Pc(2229) Class3_Sub2_Sub14 local2229 = Static76.method1742(local924);
								if (local2229.anInt2752 == local737 && local2229.anInt2753 == local742) {
									for (local965 = 0; local965 < local2229.anInt2750; local965++) {
										if (local2229.anIntArray484[local965] == local585) {
											if (local742 == 115) {
												Static23.aClass28Array3[local27++] = local2229.aClass28Array16[local965];
											} else {
												Static78.anIntArray380[local23++] = local2229.anIntArray485[local965];
											}
											local2229 = null;
											break;
										}
									}
									if (local2229 != null) {
										if (local742 == 115) {
											Static23.aClass28Array3[local27++] = local2229.aClass28_885;
										} else {
											Static78.anIntArray380[local23++] = local2229.anInt2749;
										}
									}
									continue;
								}
								if (local742 == 115) {
									Static23.aClass28Array3[local27++] = Static80.aClass28_1200;
								} else {
									Static78.anIntArray380[local23++] = 0;
								}
								continue;
							}
						} else if (local200 < 3700) {
							if (local200 == 3600) {
								if (Static177.anInt4222 == 0) {
									Static78.anIntArray380[local23++] = -2;
								} else if (Static177.anInt4222 == 1) {
									Static78.anIntArray380[local23++] = -1;
								} else {
									Static78.anIntArray380[local23++] = Static66.anInt2068;
								}
								continue;
							}
							if (local200 == 3601) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (Static177.anInt4222 == 2 && local737 < Static66.anInt2068) {
									Static23.aClass28Array3[local27++] = Static37.aClass28Array4[local737];
									continue;
								}
								Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								continue;
							}
							if (local200 == 3602) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (Static177.anInt4222 == 2 && local737 < Static66.anInt2068) {
									Static78.anIntArray380[local23++] = Static114.anIntArray509[local737];
									continue;
								}
								Static78.anIntArray380[local23++] = 0;
								continue;
							}
							if (local200 == 3603) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (Static177.anInt4222 == 2 && local737 < Static66.anInt2068) {
									Static78.anIntArray380[local23++] = Static165.anIntArray669[local737];
									continue;
								}
								Static78.anIntArray380[local23++] = 0;
								continue;
							}
							if (local200 == 3604) {
								local23--;
								local742 = Static78.anIntArray380[local23];
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static145.method2781(local546, local742);
								continue;
							}
							if (local200 == 3605) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static7.method218(local546.method924());
								continue;
							}
							if (local200 == 3606) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static22.method613(local546.method924());
								continue;
							}
							if (local200 == 3607) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static180.method3208(local546.method924());
								continue;
							}
							if (local200 == 3608) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static91.method3122(local546.method924());
								continue;
							}
							if (local200 == 3609) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								if (local546.method918(Static50.aClass28_437) || local546.method918(Static84.aClass28_774)) {
									local546 = local546.method905(7);
								}
								Static78.anIntArray380[local23++] = Static63.method1491(local546) ? 1 : 0;
								continue;
							}
							if (local200 == 3611) {
								if (Static106.aClass28_889 == null) {
									Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								} else {
									Static23.aClass28Array3[local27++] = Static106.aClass28_889.method912();
								}
								continue;
							}
							if (local200 == 3612) {
								if (Static106.aClass28_889 == null) {
									Static78.anIntArray380[local23++] = 0;
								} else {
									Static78.anIntArray380[local23++] = Static35.anInt1045;
								}
								continue;
							}
							if (local200 == 3613) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (Static106.aClass28_889 != null && Static35.anInt1045 > local737) {
									Static23.aClass28Array3[local27++] = Static34.aClass3_Sub12Array1[local737].aClass28_694.method912();
									continue;
								}
								Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								continue;
							}
							if (local200 == 3614) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (Static106.aClass28_889 != null && local737 < Static35.anInt1045) {
									Static78.anIntArray380[local23++] = Static34.aClass3_Sub12Array1[local737].anInt2285;
									continue;
								}
								Static78.anIntArray380[local23++] = 0;
								continue;
							}
							if (local200 == 3615) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (Static106.aClass28_889 != null && Static35.anInt1045 > local737) {
									Static78.anIntArray380[local23++] = Static34.aClass3_Sub12Array1[local737].aByte5;
									continue;
								}
								Static78.anIntArray380[local23++] = 0;
								continue;
							}
							if (local200 == 3616) {
								Static78.anIntArray380[local23++] = Static177.aByte9;
								continue;
							}
							if (local200 == 3617) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static121.method2432(local546);
								continue;
							}
							if (local200 == 3618) {
								Static78.anIntArray380[local23++] = Static51.aByte4;
								continue;
							}
							if (local200 == 3619) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static141.method2766(local546.method924());
								continue;
							}
							if (local200 == 3620) {
								Static19.method582();
								continue;
							}
							if (local200 == 3621) {
								if (Static177.anInt4222 == 0) {
									Static78.anIntArray380[local23++] = -1;
								} else {
									Static78.anIntArray380[local23++] = Static4.anInt128;
								}
								continue;
							}
							if (local200 == 3622) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (Static177.anInt4222 != 0 && Static4.anInt128 > local737) {
									Static23.aClass28Array3[local27++] = Static149.method2829(Static21.aLongArray3[local737]).method912();
									continue;
								}
								Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								continue;
							}
							if (local200 == 3623) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								if (local546.method918(Static50.aClass28_437) || local546.method918(Static84.aClass28_774)) {
									local546 = local546.method905(7);
								}
								Static78.anIntArray380[local23++] = Static170.method3102(local546) ? 1 : 0;
								continue;
							}
							if (local200 == 3624) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (Static34.aClass3_Sub12Array1 != null && local737 < Static35.anInt1045 && Static34.aClass3_Sub12Array1[local737].aClass28_694.method936(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass28_296)) {
									Static78.anIntArray380[local23++] = 1;
									continue;
								}
								Static78.anIntArray380[local23++] = 0;
								continue;
							}
							if (local200 == 3625) {
								if (Static67.aClass28_615 == null) {
									Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								} else {
									Static23.aClass28Array3[local27++] = Static67.aClass28_615.method912();
								}
								continue;
							}
						} else if (local200 < 4000) {
							if (local200 == 3903) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static129.aClass20Array1[local737].method792();
								continue;
							}
							if (local200 == 3904) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static129.aClass20Array1[local737].anInt965;
								continue;
							}
							if (local200 == 3905) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static129.aClass20Array1[local737].anInt961;
								continue;
							}
							if (local200 == 3906) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static129.aClass20Array1[local737].anInt958;
								continue;
							}
							if (local200 == 3907) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static129.aClass20Array1[local737].anInt966;
								continue;
							}
							if (local200 == 3908) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static129.aClass20Array1[local737].anInt963;
								continue;
							}
							if (local200 == 3910) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								local742 = Static129.aClass20Array1[local737].method789();
								Static78.anIntArray380[local23++] = local742 == 0 ? 1 : 0;
								continue;
							}
							if (local200 == 3911) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								local742 = Static129.aClass20Array1[local737].method789();
								Static78.anIntArray380[local23++] = local742 == 2 ? 1 : 0;
								continue;
							}
							if (local200 == 3912) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								local742 = Static129.aClass20Array1[local737].method789();
								Static78.anIntArray380[local23++] = local742 == 5 ? 1 : 0;
								continue;
							}
							if (local200 == 3913) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								local742 = Static129.aClass20Array1[local737].method789();
								Static78.anIntArray380[local23++] = local742 == 1 ? 1 : 0;
								continue;
							}
						} else if (local200 < 4100) {
							if (local200 == 4000) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local742 + local737;
								continue;
							}
							if (local200 == 4001) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local737 - local742;
								continue;
							}
							if (local200 == 4002) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local737 * local742;
								continue;
							}
							if (local200 == 4003) {
								local23 -= 2;
								local742 = Static78.anIntArray380[local23 + 1];
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = local737 / local742;
								continue;
							}
							if (local200 == 4004) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = (int) (Math.random() * (double) local737);
								continue;
							}
							if (local200 == 4005) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = (int) (Math.random() * (double) (local737 + 1));
								continue;
							}
							if (local200 == 4006) {
								local23 -= 5;
								local742 = Static78.anIntArray380[local23 + 1];
								local737 = Static78.anIntArray380[local23];
								local585 = Static78.anIntArray380[local23 + 3];
								local609 = Static78.anIntArray380[local23 + 4];
								local924 = Static78.anIntArray380[local23 + 2];
								Static78.anIntArray380[local23++] = (local609 - local924) * (-local737 + local742) / (local585 - local924) + local737;
								continue;
							}
							if (local200 == 4007) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local737 * local742 / 100 + local737;
								continue;
							}
							if (local200 == 4008) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local737 | 0x1 << local742;
								continue;
							}
							if (local200 == 4009) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local737 & -(0x1 << local742) - 1;
								continue;
							}
							if (local200 == 4010) {
								local23 -= 2;
								local742 = Static78.anIntArray380[local23 + 1];
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = (0x1 << local742 & local737) == 0 ? 0 : 1;
								continue;
							}
							if (local200 == 4011) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local737 % local742;
								continue;
							}
							if (local200 == 4012) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								if (local737 == 0) {
									Static78.anIntArray380[local23++] = 0;
								} else {
									Static78.anIntArray380[local23++] = (int) Math.pow((double) local737, (double) local742);
								}
								continue;
							}
							if (local200 == 4013) {
								local23 -= 2;
								local742 = Static78.anIntArray380[local23 + 1];
								local737 = Static78.anIntArray380[local23];
								if (local737 == 0) {
									Static78.anIntArray380[local23++] = 0;
								} else if (local742 == 0) {
									Static78.anIntArray380[local23++] = Integer.MAX_VALUE;
								} else {
									Static78.anIntArray380[local23++] = (int) Math.pow((double) local737, 1.0D / (double) local742);
								}
								continue;
							}
							if (local200 == 4014) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local737 & local742;
								continue;
							}
							if (local200 == 4015) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local737 | local742;
								continue;
							}
							if (local200 == 4016) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local742 > local737 ? local737 : local742;
								continue;
							}
							if (local200 == 4017) {
								local23 -= 2;
								local742 = Static78.anIntArray380[local23 + 1];
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = local742 >= local737 ? local742 : local737;
								continue;
							}
							if (local200 == 4018) {
								local23 -= 3;
								@Pc(5025) long local5025 = (long) Static78.anIntArray380[local23];
								@Pc(5032) long local5032 = (long) Static78.anIntArray380[local23 + 1];
								@Pc(5039) long local5039 = (long) Static78.anIntArray380[local23 + 2];
								Static78.anIntArray380[local23++] = (int) (local5039 * local5025 / local5032);
								continue;
							}
						} else if (local200 < 4200) {
							if (local200 == 4100) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								local23--;
								local742 = Static78.anIntArray380[local23];
								Static23.aClass28Array3[local27++] = Static4.method96(new Class28[] { local546, Static146.method2793(local742) });
								continue;
							}
							if (local200 == 4101) {
								local27 -= 2;
								local2042 = Static23.aClass28Array3[local27 + 1];
								local546 = Static23.aClass28Array3[local27];
								Static23.aClass28Array3[local27++] = Static4.method96(new Class28[] { local546, local2042 });
								continue;
							}
							if (local200 == 4102) {
								local23--;
								local742 = Static78.anIntArray380[local23];
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static23.aClass28Array3[local27++] = Static4.method96(new Class28[] { local546, Static59.method1339(local742) });
								continue;
							}
							if (local200 == 4103) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static23.aClass28Array3[local27++] = local546.method931();
								continue;
							}
							if (local200 == 4104) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								@Pc(3962) long local3962 = ((long) local737 + 11745L) * 86400000L;
								Static159.aCalendar1.setTime(new Date(local3962));
								local585 = Static159.aCalendar1.get(5);
								local609 = Static159.aCalendar1.get(2);
								local965 = Static159.aCalendar1.get(1);
								Static23.aClass28Array3[local27++] = Static4.method96(new Class28[] { Static146.method2793(local585), Static47.aClass28_415, Static115.aClass28Array18[local609], Static47.aClass28_415, Static146.method2793(local965) });
								continue;
							}
							if (local200 == 4105) {
								local27 -= 2;
								local546 = Static23.aClass28Array3[local27];
								local2042 = Static23.aClass28Array3[local27 + 1];
								if (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1 != null && Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1.aBoolean180) {
									Static23.aClass28Array3[local27++] = local2042;
									continue;
								}
								Static23.aClass28Array3[local27++] = local546;
								continue;
							}
							if (local200 == 4106) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static23.aClass28Array3[local27++] = Static146.method2793(local737);
								continue;
							}
							if (local200 == 4107) {
								local27 -= 2;
								Static78.anIntArray380[local23++] = Static23.aClass28Array3[local27].method904(Static23.aClass28Array3[local27 + 1]);
								continue;
							}
							@Pc(4115) Class3_Sub2_Sub2_Sub1_Sub1 local4115;
							@Pc(4110) byte[] local4110;
							if (local200 == 4108) {
								local23 -= 2;
								local27--;
								local546 = Static23.aClass28Array3[local27];
								local742 = Static78.anIntArray380[local23];
								local924 = Static78.anIntArray380[local23 + 1];
								local4110 = Static7.aClass7_Sub1_2.method1021(local924, 0);
								local4115 = new Class3_Sub2_Sub2_Sub1_Sub1(local4110);
								Static78.anIntArray380[local23++] = local4115.method1799(local546, local742);
								continue;
							}
							if (local200 == 4109) {
								local23 -= 2;
								local27--;
								local546 = Static23.aClass28Array3[local27];
								local742 = Static78.anIntArray380[local23];
								local924 = Static78.anIntArray380[local23 + 1];
								local4110 = Static7.aClass7_Sub1_2.method1021(local924, 0);
								local4115 = new Class3_Sub2_Sub2_Sub1_Sub1(local4110);
								Static78.anIntArray380[local23++] = local4115.method1785(local546, local742);
								continue;
							}
							if (local200 == 4110) {
								local27 -= 2;
								local2042 = Static23.aClass28Array3[local27 + 1];
								local546 = Static23.aClass28Array3[local27];
								local23--;
								if (Static78.anIntArray380[local23] == 1) {
									Static23.aClass28Array3[local27++] = local546;
								} else {
									Static23.aClass28Array3[local27++] = local2042;
								}
								continue;
							}
							if (local200 == 4111) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static23.aClass28Array3[local27++] = Static10.method1786(local546);
								continue;
							}
							if (local200 == 4112) {
								local23--;
								local742 = Static78.anIntArray380[local23];
								local27--;
								local546 = Static23.aClass28Array3[local27];
								Static23.aClass28Array3[local27++] = local546.method937(local742);
								continue;
							}
							if (local200 == 4113) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static35.method867(local737) ? 1 : 0;
								continue;
							}
							if (local200 == 4114) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static160.method2987(local737) ? 1 : 0;
								continue;
							}
							if (local200 == 4115) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static142.method2771(local737) ? 1 : 0;
								continue;
							}
							if (local200 == 4116) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static164.method3025(local737) ? 1 : 0;
								continue;
							}
							if (local200 == 4117) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								if (local546 == null) {
									Static78.anIntArray380[local23++] = 0;
								} else {
									Static78.anIntArray380[local23++] = local546.method901();
								}
								continue;
							}
							if (local200 == 4118) {
								local23 -= 2;
								local27--;
								local546 = Static23.aClass28Array3[local27];
								local742 = Static78.anIntArray380[local23];
								local924 = Static78.anIntArray380[local23 + 1];
								Static23.aClass28Array3[local27++] = local546.method926(local924, local742);
								continue;
							}
							if (local200 == 4119) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								local2042 = Static128.method2515(local546.method901());
								@Pc(4403) boolean local4403 = false;
								for (local585 = 0; local546.method901() > local585; local585++) {
									local609 = local546.method917(local585);
									if (local609 == 60) {
										local4403 = true;
									} else if (local609 == 62) {
										local4403 = false;
									} else if (!local4403) {
										local2042.method907(local609);
									}
								}
								local2042.method902();
								Static23.aClass28Array3[local27++] = local2042;
								continue;
							}
							if (local200 == 4120) {
								local23 -= 2;
								local27--;
								local546 = Static23.aClass28Array3[local27];
								local742 = Static78.anIntArray380[local23];
								local924 = Static78.anIntArray380[local23 + 1];
								Static78.anIntArray380[local23++] = local546.method906(local924, local742);
								continue;
							}
							if (local200 == 4121) {
								local27 -= 2;
								local2042 = Static23.aClass28Array3[local27 + 1];
								local546 = Static23.aClass28Array3[local27];
								local23--;
								local924 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = local546.method908(local924, local2042);
								continue;
							}
						} else if (local200 < 4300) {
							if (local200 == 4200) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static23.aClass28Array3[local27++] = Static76.method1736(local737).aClass28_566;
								continue;
							}
							@Pc(3538) Class3_Sub2_Sub10 local3538;
							if (local200 == 4201) {
								local23 -= 2;
								local737 = Static78.anIntArray380[local23];
								local742 = Static78.anIntArray380[local23 + 1];
								local3538 = Static76.method1736(local737);
								if (local742 >= 1 && local742 <= 5 && local3538.aClass28Array10[local742 - 1] != null) {
									Static23.aClass28Array3[local27++] = local3538.aClass28Array10[local742 - 1];
									continue;
								}
								Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								continue;
							}
							if (local200 == 4202) {
								local23 -= 2;
								local742 = Static78.anIntArray380[local23 + 1];
								local737 = Static78.anIntArray380[local23];
								local3538 = Static76.method1736(local737);
								if (local742 >= 1 && local742 <= 5 && local3538.aClass28Array11[local742 - 1] != null) {
									Static23.aClass28Array3[local27++] = local3538.aClass28Array11[local742 - 1];
									continue;
								}
								Static23.aClass28Array3[local27++] = Static111.aClass28_920;
								continue;
							}
							if (local200 == 4203) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static76.method1736(local737).anInt1875;
								continue;
							}
							if (local200 == 4204) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static76.method1736(local737).anInt1896 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3679) Class3_Sub2_Sub10 local3679;
							if (local200 == 4205) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								local3679 = Static76.method1736(local737);
								if (local3679.anInt1890 == -1 && local3679.anInt1887 >= 0) {
									Static78.anIntArray380[local23++] = local3679.anInt1887;
									continue;
								}
								Static78.anIntArray380[local23++] = local737;
								continue;
							}
							if (local200 == 4206) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								local3679 = Static76.method1736(local737);
								if (local3679.anInt1890 >= 0 && local3679.anInt1887 >= 0) {
									Static78.anIntArray380[local23++] = local3679.anInt1887;
									continue;
								}
								Static78.anIntArray380[local23++] = local737;
								continue;
							}
							if (local200 == 4207) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								Static78.anIntArray380[local23++] = Static76.method1736(local737).aBoolean103 ? 1 : 0;
								continue;
							}
							if (local200 == 4210) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								local23--;
								local742 = Static78.anIntArray380[local23];
								Static78.method1814(local546, local742 == 1);
								Static78.anIntArray380[local23++] = Static73.anInt2180;
								continue;
							}
							if (local200 == 4211) {
								if (Static45.aShortArray13 != null && Static174.anInt4183 < Static73.anInt2180) {
									Static78.anIntArray380[local23++] = Static45.aShortArray13[Static174.anInt4183++] & 0xFFFF;
									continue;
								}
								Static78.anIntArray380[local23++] = -1;
								continue;
							}
							if (local200 == 4212) {
								Static174.anInt4183 = 0;
								continue;
							}
						} else if (local200 < 5100) {
							if (local200 == 5000) {
								Static78.anIntArray380[local23++] = Static108.anInt2803;
								continue;
							}
							if (local200 == 5001) {
								local23 -= 3;
								Static108.anInt2803 = Static78.anIntArray380[local23];
								Static84.anInt2473 = Static78.anIntArray380[local23 + 1];
								Static157.anInt3884 = Static78.anIntArray380[local23 + 2];
								Static51.aClass3_Sub8_Sub1_2.method1559(100);
								Static51.aClass3_Sub8_Sub1_2.method1550(Static108.anInt2803);
								Static51.aClass3_Sub8_Sub1_2.method1550(Static84.anInt2473);
								Static51.aClass3_Sub8_Sub1_2.method1550(Static157.anInt3884);
								continue;
							}
							if (local200 == 5002) {
								local23 -= 2;
								local27--;
								local546 = Static23.aClass28Array3[local27];
								local924 = Static78.anIntArray380[local23 + 1];
								local742 = Static78.anIntArray380[local23];
								Static51.aClass3_Sub8_Sub1_2.method1559(153);
								Static51.aClass3_Sub8_Sub1_2.method1541(local546.method924());
								Static51.aClass3_Sub8_Sub1_2.method1550(local742 - 1);
								Static51.aClass3_Sub8_Sub1_2.method1550(local924);
								continue;
							}
							if (local200 == 5003) {
								local2042 = null;
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (local737 < 100) {
									local2042 = Static175.aClass28Array23[local737];
								}
								if (local2042 == null) {
									local2042 = Static111.aClass28_920;
								}
								Static23.aClass28Array3[local27++] = local2042;
								continue;
							}
							if (local200 == 5004) {
								local23--;
								local737 = Static78.anIntArray380[local23];
								local742 = -1;
								if (local737 < 100 && Static175.aClass28Array23[local737] != null) {
									local742 = Static59.anIntArray292[local737];
								}
								Static78.anIntArray380[local23++] = local742;
								continue;
							}
							if (local200 == 5005) {
								Static78.anIntArray380[local23++] = Static84.anInt2473;
								continue;
							}
							if (local200 == 5008) {
								local27--;
								local546 = Static23.aClass28Array3[local27];
								if (local546.method918(Static162.aClass28_1374)) {
									Static47.method1113(local546);
								} else {
									local2042 = local546.method931();
									@Pc(2765) byte local2765 = 0;
									@Pc(2767) byte local2767 = 0;
									if (local2042.method918(Static83.aClass28_762)) {
										local546 = local546.method905(Static83.aClass28_762.method901());
										local2767 = 0;
									} else if (local2042.method918(Static15.aClass28_364)) {
										local2767 = 1;
										local546 = local546.method905(Static15.aClass28_364.method901());
									} else if (local2042.method918(Static70.aClass28_638)) {
										local2767 = 2;
										local546 = local546.method905(Static70.aClass28_638.method901());
									} else if (local2042.method918(Static154.aClass28_1289)) {
										local2767 = 3;
										local546 = local546.method905(Static154.aClass28_1289.method901());
									} else if (local2042.method918(Static119.aClass28_1002)) {
										local546 = local546.method905(Static119.aClass28_1002.method901());
										local2767 = 4;
									} else if (local2042.method918(Static144.aClass28_532)) {
										local546 = local546.method905(Static144.aClass28_532.method901());
										local2767 = 5;
									} else if (local2042.method918(Static144.aClass28_534)) {
										local546 = local546.method905(Static144.aClass28_534.method901());
										local2767 = 6;
									} else if (local2042.method918(Static107.aClass28_894)) {
										local2767 = 7;
										local546 = local546.method905(Static107.aClass28_894.method901());
									} else if (local2042.method918(Static145.aClass28_1213)) {
										local2767 = 8;
										local546 = local546.method905(Static145.aClass28_1213.method901());
									} else if (local2042.method918(Static84.aClass28_770)) {
										local546 = local546.method905(Static84.aClass28_770.method901());
										local2767 = 9;
									} else if (local2042.method918(Static168.aClass28_1419)) {
										local546 = local546.method905(Static168.aClass28_1419.method901());
										local2767 = 10;
									} else if (local2042.method918(Static20.aClass28_223)) {
										local546 = local546.method905(Static20.aClass28_223.method901());
										local2767 = 11;
									} else if (Static114.anInt2922 != 0) {
										if (local2042.method918(Static83.aClass28_764)) {
											local2767 = 0;
											local546 = local546.method905(Static83.aClass28_764.method901());
										} else if (local2042.method918(Static15.aClass28_362)) {
											local546 = local546.method905(Static15.aClass28_362.method901());
											local2767 = 1;
										} else if (local2042.method918(Static70.aClass28_636)) {
											local2767 = 2;
											local546 = local546.method905(Static70.aClass28_636.method901());
										} else if (local2042.method918(Static154.aClass28_1287)) {
											local2767 = 3;
											local546 = local546.method905(Static154.aClass28_1287.method901());
										} else if (local2042.method918(Static119.aClass28_1003)) {
											local2767 = 4;
											local546 = local546.method905(Static119.aClass28_1003.method901());
										} else if (local2042.method918(Static144.aClass28_528)) {
											local546 = local546.method905(Static144.aClass28_528.method901());
											local2767 = 5;
										} else if (local2042.method918(Static144.aClass28_535)) {
											local2767 = 6;
											local546 = local546.method905(Static144.aClass28_535.method901());
										} else if (local2042.method918(Static107.aClass28_890)) {
											local546 = local546.method905(Static107.aClass28_890.method901());
											local2767 = 7;
										} else if (local2042.method918(Static145.aClass28_1217)) {
											local2767 = 8;
											local546 = local546.method905(Static145.aClass28_1217.method901());
										} else if (local2042.method918(Static84.aClass28_772)) {
											local546 = local546.method905(Static84.aClass28_772.method901());
											local2767 = 9;
										} else if (local2042.method918(Static168.aClass28_1426)) {
											local2767 = 10;
											local546 = local546.method905(Static168.aClass28_1426.method901());
										} else if (local2042.method918(Static20.aClass28_226)) {
											local2767 = 11;
											local546 = local546.method905(Static20.aClass28_226.method901());
										}
									}
									local2042 = local546.method931();
									if (local2042.method918(Static159.aClass28_1312)) {
										local2765 = 1;
										local546 = local546.method905(Static159.aClass28_1312.method901());
									} else if (local2042.method918(Static112.aClass28_925)) {
										local2765 = 2;
										local546 = local546.method905(Static112.aClass28_925.method901());
									} else if (local2042.method918(Static149.aClass28_1245)) {
										local546 = local546.method905(Static149.aClass28_1245.method901());
										local2765 = 3;
									} else if (local2042.method918(Static137.aClass28_1154)) {
										local2765 = 4;
										local546 = local546.method905(Static137.aClass28_1154.method901());
									} else if (local2042.method918(Static2.aClass28_26)) {
										local2765 = 5;
										local546 = local546.method905(Static2.aClass28_26.method901());
									} else if (Static114.anInt2922 != 0) {
										if (local2042.method918(Static159.aClass28_1315)) {
											local2765 = 1;
											local546 = local546.method905(Static159.aClass28_1315.method901());
										} else if (local2042.method918(Static112.aClass28_928)) {
											local2765 = 2;
											local546 = local546.method905(Static112.aClass28_928.method901());
										} else if (local2042.method918(Static149.aClass28_1247)) {
											local2765 = 3;
											local546 = local546.method905(Static149.aClass28_1247.method901());
										} else if (local2042.method918(Static137.aClass28_1151)) {
											local546 = local546.method905(Static137.aClass28_1151.method901());
											local2765 = 4;
										} else if (local2042.method918(Static2.aClass28_27)) {
											local546 = local546.method905(Static2.aClass28_27.method901());
											local2765 = 5;
										}
									}
									Static51.aClass3_Sub8_Sub1_2.method1559(107);
									Static51.aClass3_Sub8_Sub1_2.method1550(0);
									local609 = Static51.aClass3_Sub8_Sub1_2.anInt1948;
									Static51.aClass3_Sub8_Sub1_2.method1550(local2767);
									Static51.aClass3_Sub8_Sub1_2.method1550(local2765);
									method1206(Static51.aClass3_Sub8_Sub1_2, local546);
									Static51.aClass3_Sub8_Sub1_2.method1522(Static51.aClass3_Sub8_Sub1_2.anInt1948 - local609);
								}
								continue;
							}
							if (local200 == 5009) {
								local27 -= 2;
								local546 = Static23.aClass28Array3[local27];
								local2042 = Static23.aClass28Array3[local27 + 1];
								Static51.aClass3_Sub8_Sub1_2.method1559(66);
								Static51.aClass3_Sub8_Sub1_2.method1550(0);
								local924 = Static51.aClass3_Sub8_Sub1_2.anInt1948;
								Static51.aClass3_Sub8_Sub1_2.method1541(local546.method924());
								method1206(Static51.aClass3_Sub8_Sub1_2, local2042);
								Static51.aClass3_Sub8_Sub1_2.method1522(Static51.aClass3_Sub8_Sub1_2.anInt1948 - local924);
								continue;
							}
							if (local200 == 5010) {
								local2042 = null;
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (local737 < 100) {
									local2042 = Static57.aClass28Array8[local737];
								}
								if (local2042 == null) {
									local2042 = Static111.aClass28_920;
								}
								Static23.aClass28Array3[local27++] = local2042;
								continue;
							}
							if (local200 == 5011) {
								local2042 = null;
								local23--;
								local737 = Static78.anIntArray380[local23];
								if (local737 < 100) {
									local2042 = Static106.aClass28Array17[local737];
								}
								if (local2042 == null) {
									local2042 = Static111.aClass28_920;
								}
								Static23.aClass28Array3[local27++] = local2042;
								continue;
							}
							if (local200 == 5015) {
								if (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1 == null || Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass28_296 == null) {
									local546 = Static140.aClass28_1189;
								} else {
									local546 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass28_296;
								}
								Static23.aClass28Array3[local27++] = local546;
								continue;
							}
							if (local200 == 5016) {
								Static78.anIntArray380[local23++] = Static157.anInt3884;
								continue;
							}
							if (local200 == 5017) {
								Static78.anIntArray380[local23++] = Static78.anInt2319;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7595) Exception local7595) {
			if (local16.aClass28_477 == null) {
				if (Static81.anInt2377 != 0) {
					Static51.method1192(Static111.aClass28_920, 0, Static7.aClass28_88);
				}
				Static146.method2791(local7595, "CS2 - scr:" + local16.aLong144 + " op:" + local35);
			} else {
				@Pc(7625) Class28 local7625 = Static128.method2515(30);
				local7625.method930(Static104.aClass28_862).method930(local16.aClass28_477);
				for (local49 = Static34.anInt1041 - 1; local49 >= 0; local49--) {
					local7625.method930(Static19.aClass28_217).method930(Static80.aClass64Array11[local49].aClass3_Sub2_Sub8_1.aClass28_477);
				}
				if (local35 == 40) {
					local85 = local33[local25];
					local7625.method930(Static70.aClass28_639).method930(Static146.method2793(local85));
				}
				if (Static81.anInt2377 != 0) {
					Static51.method1192(Static111.aClass28_920, 0, Static4.method96(new Class28[] { Static180.aClass28_1496, local16.aClass28_477 }));
				}
				Static146.method2791(local7595, "CS2 - scr:" + local16.aLong144 + " op:" + local35 + new String(local7625.method935()));
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!hd;Lclient!eh;)I")
	private static int method1206(@OriginalArg(1) Class3_Sub8 arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(6) int local6 = arg0.anInt1948;
		arg0.method1537(arg1.anInt1118);
		arg0.anInt1948 += Static96.aClass80_103.method3094(arg0.aByteArray19, 0, arg1.aByteArray15, arg0.anInt1948, arg1.anInt1118);
		return arg0.anInt1948 - local6;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([BZI)I")
	public static int method1209(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static20.method591(arg1, arg0, 0);
	}
}
