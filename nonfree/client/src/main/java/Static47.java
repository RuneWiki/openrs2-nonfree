import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!sa;")
	public static Class72 aClass72_11 = new Class72(64);

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_526 = Static51.method932("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	public static volatile int anInt1149 = 0;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[104][104];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLclient!va;)V")
	public static void method879(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(4) byte[] local4 = new byte[24];
		if (Static19.aClass26_1 != null) {
			@Pc(16) int local16;
			try {
				Static19.aClass26_1.method891(0L);
				local16 = 0;
				Static19.aClass26_1.method894(local4);
				while (local16 < 24 && local4[local16] == 0) {
					local16++;
				}
				if (local16 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local16 = 0; local16 < 24; local16++) {
					local4[local16] = -1;
				}
			}
		}
		arg0.method1441(24, local4);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method880() {
		aClass10_526 = null;
		anIntArrayArray15 = null;
		aClass72_11 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method881(@OriginalArg(1) Class2_Sub18 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray29;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub1_Sub18 local18 = Static16.method264(local14);
		if (local18 == null) {
			return;
		}
		Static123.anInt2777 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		@Pc(37) int[] local37 = local18.anIntArray373;
		@Pc(40) int[] local40 = local18.anIntArray372;
		@Pc(42) byte local42 = -1;
		@Pc(56) int local56;
		@Pc(94) int local94;
		try {
			Static34.aClass10Array5 = new Class10[local18.anInt3532];
			@Pc(48) int local48 = 0;
			Static24.anIntArray40 = new int[local18.anInt3530];
			@Pc(54) int local54 = 0;
			for (local56 = 1; local56 < local8.length; local56++) {
				if (local8[local56] instanceof Integer) {
					local94 = (Integer) local8[local56];
					if (local94 == -2147483647) {
						local94 = arg0.anInt2889;
					}
					if (local94 == -2147483646) {
						local94 = arg0.anInt2887;
					}
					if (local94 == -2147483645) {
						local94 = arg0.aClass23_9 == null ? -1 : arg0.aClass23_9.anInt1057;
					}
					if (local94 == -2147483644) {
						local94 = arg0.anInt2884;
					}
					if (local94 == -2147483643) {
						local94 = arg0.aClass23_9 == null ? -1 : arg0.aClass23_9.anInt1056;
					}
					if (local94 == -2147483642) {
						local94 = arg0.aClass23_10 == null ? -1 : arg0.aClass23_10.anInt1057;
					}
					if (local94 == -2147483641) {
						local94 = arg0.aClass23_10 == null ? -1 : arg0.aClass23_10.anInt1056;
					}
					if (local94 == -2147483640) {
						local94 = arg0.anInt2885;
					}
					if (local94 == -2147483639) {
						local94 = arg0.anInt2888;
					}
					Static24.anIntArray40[local48++] = local94;
				} else if (local8[local56] instanceof Class10) {
					@Pc(73) Class10 local73 = (Class10) local8[local56];
					if (local73.method358(Static175.aClass10_1596)) {
						local73 = arg0.aClass10_1247;
					}
					Static34.aClass10Array5[local54++] = local73;
				}
			}
			local94 = 0;
			label2055: while (true) {
				local94++;
				if (local94 > 200000) {
					throw new RuntimeException("slow");
				}
				local32++;
				@Pc(210) int local210 = local40[local32];
				@Pc(757) int local757;
				@Pc(610) int local610;
				@Pc(634) int local634;
				@Pc(752) int local752;
				@Pc(566) Class10 local566;
				if (local210 < 100) {
					if (local210 == 0) {
						Static145.anIntArray281[local30++] = local37[local32];
						continue;
					}
					@Pc(236) int local236;
					if (local210 == 1) {
						local236 = local37[local32];
						Static145.anIntArray281[local30++] = Static51.anIntArray143[local236];
						continue;
					}
					if (local210 == 2) {
						local236 = local37[local32];
						local30--;
						Static51.anIntArray143[local236] = Static145.anIntArray281[local30];
						continue;
					}
					if (local210 == 3) {
						Static59.aClass10Array9[local34++] = local18.aClass10Array24[local32];
						continue;
					}
					if (local210 == 6) {
						local32 += local37[local32];
						continue;
					}
					if (local210 == 7) {
						local30 -= 2;
						if (Static145.anIntArray281[local30 + 1] != Static145.anIntArray281[local30]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local210 == 8) {
						local30 -= 2;
						if (Static145.anIntArray281[local30 + 1] == Static145.anIntArray281[local30]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local210 == 9) {
						local30 -= 2;
						if (Static145.anIntArray281[local30 + 1] > Static145.anIntArray281[local30]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local210 == 10) {
						local30 -= 2;
						if (Static145.anIntArray281[local30 + 1] < Static145.anIntArray281[local30]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local210 == 21) {
						if (Static123.anInt2777 == 0) {
							return;
						}
						@Pc(393) Class56 local393 = Static109.aClass56Array1[--Static123.anInt2777];
						local18 = local393.aClass2_Sub1_Sub18_1;
						Static34.aClass10Array5 = local393.aClass10Array18;
						local40 = local18.anIntArray372;
						local37 = local18.anIntArray373;
						Static24.anIntArray40 = local393.anIntArray257;
						local32 = local393.anInt2510;
						continue;
					}
					if (local210 == 25) {
						local236 = local37[local32];
						Static145.anIntArray281[local30++] = Static26.method592(local236);
						continue;
					}
					if (local210 == 27) {
						local236 = local37[local32];
						local30--;
						Static110.method1757(local236, Static145.anIntArray281[local30]);
						continue;
					}
					if (local210 == 31) {
						local30 -= 2;
						if (Static145.anIntArray281[local30 + 1] >= Static145.anIntArray281[local30]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local210 == 32) {
						local30 -= 2;
						if (Static145.anIntArray281[local30 + 1] <= Static145.anIntArray281[local30]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local210 == 33) {
						Static145.anIntArray281[local30++] = Static24.anIntArray40[local37[local32]];
						continue;
					}
					@Pc(512) int local512;
					if (local210 == 34) {
						local512 = local37[local32];
						local30--;
						Static24.anIntArray40[local512] = Static145.anIntArray281[local30];
						continue;
					}
					if (local210 == 35) {
						Static59.aClass10Array9[local34++] = Static34.aClass10Array5[local37[local32]];
						continue;
					}
					if (local210 == 36) {
						local512 = local37[local32];
						local34--;
						Static34.aClass10Array5[local512] = Static59.aClass10Array9[local34];
						continue;
					}
					if (local210 == 37) {
						local236 = local37[local32];
						local34 -= local236;
						local566 = Static123.method1979(local34, Static59.aClass10Array9, local236);
						Static59.aClass10Array9[local34++] = local566;
						continue;
					}
					if (local210 == 38) {
						local30--;
						continue;
					}
					if (local210 == 39) {
						local34--;
						continue;
					}
					if (local210 == 40) {
						local236 = local37[local32];
						@Pc(600) Class2_Sub1_Sub18 local600 = Static16.method264(local236);
						@Pc(604) int[] local604 = new int[local600.anInt3530];
						@Pc(608) Class10[] local608 = new Class10[local600.anInt3532];
						for (local610 = 0; local610 < local600.anInt3534; local610++) {
							local604[local610] = Static145.anIntArray281[local30 + local610 - local600.anInt3534];
						}
						for (local634 = 0; local634 < local600.anInt3527; local634++) {
							local608[local634] = Static59.aClass10Array9[local634 + local34 - local600.anInt3527];
						}
						local30 -= local600.anInt3534;
						local34 -= local600.anInt3527;
						@Pc(671) Class56 local671 = new Class56();
						local671.anIntArray257 = Static24.anIntArray40;
						local671.aClass2_Sub1_Sub18_1 = local18;
						local18 = local600;
						local671.anInt2510 = local32;
						local671.aClass10Array18 = Static34.aClass10Array5;
						Static109.aClass56Array1[Static123.anInt2777++] = local671;
						Static24.anIntArray40 = local604;
						local37 = local600.anIntArray373;
						local40 = local600.anIntArray372;
						local32 = -1;
						Static34.aClass10Array5 = local608;
						continue;
					}
					if (local210 == 42) {
						Static145.anIntArray281[local30++] = Static150.anIntArray380[local37[local32]];
						continue;
					}
					if (local210 == 43) {
						local512 = local37[local32];
						local30--;
						Static150.anIntArray380[local512] = Static145.anIntArray281[local30];
						continue;
					}
					if (local210 == 44) {
						local236 = local37[local32] >> 16;
						local752 = local37[local32] & 0xFFFF;
						local30--;
						local757 = Static145.anIntArray281[local30];
						if (local757 >= 0 && local757 <= 5000) {
							Static161.anIntArray361[local236] = local757;
							@Pc(777) byte local777 = -1;
							if (local752 == 105) {
								local777 = 0;
							}
							local610 = 0;
							while (true) {
								if (local757 <= local610) {
									continue label2055;
								}
								Static26.anIntArrayArray7[local236][local610] = local777;
								local610++;
							}
						}
						throw new RuntimeException();
					}
					if (local210 == 45) {
						local236 = local37[local32];
						local30--;
						local752 = Static145.anIntArray281[local30];
						if (local752 >= 0 && local752 < Static161.anIntArray361[local236]) {
							Static145.anIntArray281[local30++] = Static26.anIntArrayArray7[local236][local752];
							continue;
						}
						throw new RuntimeException();
					}
					if (local210 == 46) {
						local30 -= 2;
						local236 = local37[local32];
						local752 = Static145.anIntArray281[local30];
						if (local752 >= 0 && local752 < Static161.anIntArray361[local236]) {
							Static26.anIntArrayArray7[local236][local752] = Static145.anIntArray281[local30 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local210 == 47) {
						@Pc(893) Class10 local893 = Static80.aClass10Array13[local37[local32]];
						if (local893 == null) {
							local893 = Static119.aClass10_1159;
						}
						Static59.aClass10Array9[local34++] = local893;
						continue;
					}
					if (local210 == 48) {
						local512 = local37[local32];
						local34--;
						Static80.aClass10Array13[local512] = Static59.aClass10Array9[local34];
						continue;
					}
				}
				@Pc(929) boolean local929;
				if (local37[local32] == 1) {
					local929 = true;
				} else {
					local929 = false;
				}
				@Pc(1089) Class23 local1089;
				@Pc(956) int local956;
				@Pc(998) int local998;
				@Pc(973) Class23 local973;
				@Pc(1144) Class23 local1144;
				if (local210 < 1000) {
					if (local210 == 100) {
						local30 -= 3;
						local757 = Static145.anIntArray281[local30 + 1];
						local956 = Static145.anIntArray281[local30 + 2];
						local752 = Static145.anIntArray281[local30];
						if (local757 == 0) {
							throw new RuntimeException();
						}
						local973 = Static102.method2541(local752);
						if (local973.aClass23Array1 == null) {
							local973.aClass23Array1 = new Class23[local956 + 1];
						}
						if (local973.aClass23Array1.length <= local956) {
							@Pc(996) Class23[] local996 = new Class23[local956 + 1];
							for (local998 = 0; local998 < local973.aClass23Array1.length; local998++) {
								local996[local998] = local973.aClass23Array1[local998];
							}
							local973.aClass23Array1 = local996;
						}
						if (local956 > 0 && local973.aClass23Array1[local956 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local956 - 1));
						}
						@Pc(1046) Class23 local1046 = new Class23();
						local1046.aBoolean37 = true;
						local1046.anInt1056 = local956;
						local1046.anInt1045 = local1046.anInt1057 = local973.anInt1057;
						local1046.anInt1090 = local757;
						local973.aClass23Array1[local956] = local1046;
						if (local929) {
							Static89.aClass23_8 = local1046;
						} else {
							Static132.aClass23_11 = local1046;
						}
						Static3.method34(local973);
						continue;
					}
					if (local210 == 101) {
						local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
						@Pc(1094) Class23 local1094 = Static102.method2541(local1089.anInt1057);
						local1094.aClass23Array1[local1089.anInt1056] = null;
						Static3.method34(local1094);
						continue;
					}
					if (local210 == 102) {
						local30--;
						local1089 = Static102.method2541(Static145.anIntArray281[local30]);
						local1089.aClass23Array1 = null;
						Static3.method34(local1089);
						continue;
					}
					if (local210 == 200) {
						local30 -= 2;
						local752 = Static145.anIntArray281[local30];
						local757 = Static145.anIntArray281[local30 + 1];
						local1144 = Static14.method222(local752, local757);
						if (local1144 != null && local757 != -1) {
							Static145.anIntArray281[local30++] = 1;
							if (local929) {
								Static89.aClass23_8 = local1144;
							} else {
								Static132.aClass23_11 = local1144;
							}
							continue;
						}
						Static145.anIntArray281[local30++] = 0;
						continue;
					}
				} else if ((local210 < 1000 || local210 >= 1100) && (local210 < 2000 || local210 >= 2100)) {
					@Pc(1529) Class10 local1529;
					if (local210 >= 1100 && local210 < 1200 || !(local210 < 2100 || local210 >= 2200)) {
						if (local210 >= 2000) {
							local30--;
							local1089 = Static102.method2541(Static145.anIntArray281[local30]);
							local210 -= 1000;
						} else {
							local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
						}
						if (local210 == 1100) {
							local30 -= 2;
							local1089.anInt1071 = Static145.anIntArray281[local30];
							if (local1089.anInt1031 - local1089.anInt1089 < local1089.anInt1071) {
								local1089.anInt1071 = local1089.anInt1031 - local1089.anInt1089;
							}
							if (local1089.anInt1071 < 0) {
								local1089.anInt1071 = 0;
							}
							local1089.anInt1053 = Static145.anIntArray281[local30 + 1];
							if (local1089.anInt1053 > local1089.anInt1076 - local1089.anInt1087) {
								local1089.anInt1053 = local1089.anInt1076 - local1089.anInt1087;
							}
							if (local1089.anInt1053 < 0) {
								local1089.anInt1053 = 0;
							}
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1101) {
							local30--;
							local1089.anInt1080 = Static145.anIntArray281[local30];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1102) {
							local30--;
							local1089.aBoolean41 = Static145.anIntArray281[local30] == 1;
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1103) {
							local30--;
							local1089.anInt1083 = Static145.anIntArray281[local30];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1104) {
							local30--;
							local1089.anInt1050 = Static145.anIntArray281[local30];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1105) {
							local30--;
							local1089.anInt1033 = Static145.anIntArray281[local30];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1106) {
							local30--;
							local1089.anInt1036 = Static145.anIntArray281[local30];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1107) {
							local30--;
							local1089.aBoolean42 = Static145.anIntArray281[local30] == 1;
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1108) {
							local1089.anInt1093 = 1;
							local30--;
							local1089.anInt1034 = Static145.anIntArray281[local30];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1109) {
							local30 -= 6;
							local1089.anInt1038 = Static145.anIntArray281[local30];
							local1089.anInt1030 = Static145.anIntArray281[local30 + 1];
							local1089.anInt1058 = Static145.anIntArray281[local30 + 2];
							local1089.anInt1044 = Static145.anIntArray281[local30 + 3];
							local1089.anInt1055 = Static145.anIntArray281[local30 + 4];
							local1089.anInt1039 = Static145.anIntArray281[local30 + 5];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1110) {
							local30--;
							local757 = Static145.anIntArray281[local30];
							if (local757 != local1089.anInt1069) {
								local1089.anInt1098 = 0;
								local1089.anInt1062 = 0;
								local1089.anInt1069 = local757;
								Static3.method34(local1089);
							}
							continue;
						}
						if (local210 == 1111) {
							local30--;
							local1089.aBoolean47 = Static145.anIntArray281[local30] == 1;
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1112) {
							local34--;
							local1529 = Static59.aClass10Array9[local34];
							if (!local1529.method358(local1089.aClass10_500)) {
								local1089.aClass10_500 = local1529;
								Static3.method34(local1089);
							}
							continue;
						}
						if (local210 == 1113) {
							local30--;
							local1089.anInt1046 = Static145.anIntArray281[local30];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1114) {
							local30 -= 3;
							local1089.anInt1077 = Static145.anIntArray281[local30];
							local1089.anInt1075 = Static145.anIntArray281[local30 + 1];
							local1089.anInt1024 = Static145.anIntArray281[local30 + 2];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1115) {
							local30--;
							local1089.aBoolean39 = Static145.anIntArray281[local30] == 1;
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1116) {
							local30--;
							local1089.anInt1082 = Static145.anIntArray281[local30];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1117) {
							local30--;
							local1089.anInt1052 = Static145.anIntArray281[local30];
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1118) {
							local30--;
							local1089.aBoolean45 = Static145.anIntArray281[local30] == 1;
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1119) {
							local30--;
							local1089.aBoolean36 = Static145.anIntArray281[local30] == 1;
							Static3.method34(local1089);
							continue;
						}
						if (local210 == 1120) {
							local30 -= 2;
							local1089.anInt1031 = Static145.anIntArray281[local30];
							local1089.anInt1076 = Static145.anIntArray281[local30 + 1];
							Static3.method34(local1089);
							continue;
						}
					} else if (local210 >= 1200 && local210 < 1300 || !(local210 < 2200 || local210 >= 2300)) {
						if (local210 < 2000) {
							local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
						} else {
							local210 -= 1000;
							local30--;
							local1089 = Static102.method2541(Static145.anIntArray281[local30]);
						}
						Static3.method34(local1089);
						if (local210 == 1200) {
							local30 -= 2;
							local757 = Static145.anIntArray281[local30];
							local956 = Static145.anIntArray281[local30 + 1];
							local1089.anInt1067 = local956;
							local1089.anInt1099 = local757;
							@Pc(6934) Class2_Sub1_Sub6 local6934 = Static78.method577(local757);
							local1089.anInt1044 = local6934.anInt1532;
							local1089.anInt1058 = local6934.anInt1518;
							local1089.anInt1038 = local6934.anInt1529;
							local1089.anInt1055 = local6934.anInt1496;
							local1089.anInt1030 = local6934.anInt1515;
							local1089.anInt1039 = local6934.anInt1509;
							if (local1089.anInt1089 > 0) {
								local1089.anInt1039 = local1089.anInt1039 * 32 / local1089.anInt1089;
							}
							continue;
						}
						if (local210 == 1201) {
							local1089.anInt1093 = 2;
							local30--;
							local1089.anInt1034 = Static145.anIntArray281[local30];
							continue;
						}
						if (local210 == 1202) {
							local1089.anInt1093 = 3;
							local1089.anInt1034 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass74_2.method2270();
							continue;
						}
					} else if ((local210 < 1300 || local210 >= 1400) && (local210 < 2300 || local210 >= 2400)) {
						if (local210 >= 1400 && local210 < 1500 || local210 >= 2400 && local210 < 2500) {
							@Pc(1505) int[] local1505 = null;
							if (local210 < 2000) {
								local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
							} else {
								local210 -= 1000;
								local30--;
								local1089 = Static102.method2541(Static145.anIntArray281[local30]);
							}
							local34--;
							local1529 = Static59.aClass10Array9[local34];
							if (local1529.method340() > 0 && local1529.method357(local1529.method340() - 1) == 89) {
								local30--;
								local610 = Static145.anIntArray281[local30];
								if (local610 > 0) {
									local1505 = new int[local610];
									while (local610-- > 0) {
										local30--;
										local1505[local610] = Static145.anIntArray281[local30];
									}
								}
								local1529 = local1529.method353(0, local1529.method340() - 1);
							}
							@Pc(1596) Object[] local1596 = new Object[local1529.method340() + 1];
							for (local634 = local1596.length - 1; local634 >= 1; local634--) {
								if (local1529.method357(local634 - 1) == 115) {
									local34--;
									local1596[local634] = Static59.aClass10Array9[local34];
								} else {
									local30--;
									local1596[local634] = Integer.valueOf(Static145.anIntArray281[local30]);
								}
							}
							local30--;
							local998 = Static145.anIntArray281[local30];
							if (local998 == -1) {
								local1596 = null;
							} else {
								local1596[0] = Integer.valueOf(local998);
							}
							if (local210 == 1425) {
								local1089.anObjectArray17 = local1596;
							}
							if (local210 == 1423) {
								local1089.anObjectArray26 = local1596;
							}
							if (local210 == 1401) {
								local1089.anObjectArray4 = local1596;
							}
							if (local210 == 1407) {
								local1089.anObjectArray19 = local1596;
								local1089.anIntArray133 = local1505;
							}
							if (local210 == 1411) {
								local1089.anObjectArray15 = local1596;
							}
							if (local210 == 1406) {
								local1089.anObjectArray3 = local1596;
							}
							if (local210 == 1420) {
								local1089.anObjectArray11 = local1596;
							}
							if (local210 == 1418) {
								local1089.anObjectArray7 = local1596;
							}
							if (local210 == 1422) {
								local1089.anObjectArray23 = local1596;
							}
							local1089.aBoolean40 = true;
							if (local210 == 1424) {
								local1089.anObjectArray20 = local1596;
							}
							if (local210 == 1405) {
								local1089.anObjectArray1 = local1596;
							}
							if (local210 == 1419) {
								local1089.anObjectArray10 = local1596;
							}
							if (local210 == 1410) {
								local1089.anObjectArray6 = local1596;
							}
							if (local210 == 1403) {
								local1089.anObjectArray12 = local1596;
							}
							if (local210 == 1404) {
								local1089.anObjectArray16 = local1596;
							}
							if (local210 == 1400) {
								local1089.anObjectArray18 = local1596;
							}
							if (local210 == 1414) {
								local1089.anObjectArray14 = local1596;
								local1089.anIntArray129 = local1505;
							}
							if (local210 == 1412) {
								local1089.anObjectArray5 = local1596;
							}
							if (local210 == 1415) {
								local1089.anObjectArray9 = local1596;
								local1089.anIntArray130 = local1505;
							}
							if (local210 == 1408) {
								local1089.anObjectArray2 = local1596;
							}
							if (local210 == 1421) {
								local1089.anObjectArray21 = local1596;
							}
							if (local210 == 1402) {
								local1089.anObjectArray22 = local1596;
							}
							if (local210 == 1409) {
								local1089.anObjectArray25 = local1596;
							}
							if (local210 == 1417) {
								local1089.anObjectArray24 = local1596;
							}
							if (local210 == 1416) {
								local1089.anObjectArray13 = local1596;
							}
							continue;
						}
						if (local210 < 1600) {
							local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
							if (local210 == 1500) {
								Static145.anIntArray281[local30++] = local1089.anInt1073;
								continue;
							}
							if (local210 == 1501) {
								Static145.anIntArray281[local30++] = local1089.anInt1085;
								continue;
							}
							if (local210 == 1502) {
								Static145.anIntArray281[local30++] = local1089.anInt1089;
								continue;
							}
							if (local210 == 1503) {
								Static145.anIntArray281[local30++] = local1089.anInt1087;
								continue;
							}
							if (local210 == 1504) {
								Static145.anIntArray281[local30++] = local1089.aBoolean49 ? 1 : 0;
								continue;
							}
							if (local210 == 1505) {
								Static145.anIntArray281[local30++] = local1089.anInt1045;
								continue;
							}
						} else if (local210 < 1700) {
							local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
							if (local210 == 1600) {
								Static145.anIntArray281[local30++] = local1089.anInt1071;
								continue;
							}
							if (local210 == 1601) {
								Static145.anIntArray281[local30++] = local1089.anInt1053;
								continue;
							}
							if (local210 == 1602) {
								Static59.aClass10Array9[local34++] = local1089.aClass10_500;
								continue;
							}
							if (local210 == 1603) {
								Static145.anIntArray281[local30++] = local1089.anInt1031;
								continue;
							}
							if (local210 == 1604) {
								Static145.anIntArray281[local30++] = local1089.anInt1076;
								continue;
							}
							if (local210 == 1605) {
								Static145.anIntArray281[local30++] = local1089.anInt1039;
								continue;
							}
							if (local210 == 1606) {
								Static145.anIntArray281[local30++] = local1089.anInt1058;
								continue;
							}
							if (local210 == 1607) {
								Static145.anIntArray281[local30++] = local1089.anInt1055;
								continue;
							}
							if (local210 == 1608) {
								Static145.anIntArray281[local30++] = local1089.anInt1044;
								continue;
							}
						} else if (local210 < 1800) {
							local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
							if (local210 == 1700) {
								Static145.anIntArray281[local30++] = local1089.anInt1099;
								continue;
							}
							if (local210 == 1701) {
								if (local1089.anInt1099 == -1) {
									Static145.anIntArray281[local30++] = 0;
								} else {
									Static145.anIntArray281[local30++] = local1089.anInt1067;
								}
								continue;
							}
							if (local210 == 1702) {
								Static145.anIntArray281[local30++] = local1089.anInt1056;
								continue;
							}
						} else if (local210 < 1900) {
							local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
							if (local210 == 1800) {
								Static145.anIntArray281[local30++] = Static64.method1127(Static126.method2068(local1089));
								continue;
							}
							if (local210 == 1801) {
								local30--;
								local757 = Static145.anIntArray281[local30];
								local757--;
								if (local1089.aClass10Array6 != null && local1089.aClass10Array6.length > local757 && local1089.aClass10Array6[local757] != null) {
									Static59.aClass10Array9[local34++] = local1089.aClass10Array6[local757];
									continue;
								}
								Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								continue;
							}
							if (local210 == 1802) {
								if (local1089.aClass10_501 == null) {
									Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								} else {
									Static59.aClass10Array9[local34++] = local1089.aClass10_501;
								}
								continue;
							}
						} else if (local210 < 2600) {
							local30--;
							local1089 = Static102.method2541(Static145.anIntArray281[local30]);
							if (local210 == 2500) {
								Static145.anIntArray281[local30++] = local1089.anInt1073;
								continue;
							}
							if (local210 == 2501) {
								Static145.anIntArray281[local30++] = local1089.anInt1085;
								continue;
							}
							if (local210 == 2502) {
								Static145.anIntArray281[local30++] = local1089.anInt1089;
								continue;
							}
							if (local210 == 2503) {
								Static145.anIntArray281[local30++] = local1089.anInt1087;
								continue;
							}
							if (local210 == 2504) {
								Static145.anIntArray281[local30++] = local1089.aBoolean49 ? 1 : 0;
								continue;
							}
							if (local210 == 2505) {
								Static145.anIntArray281[local30++] = local1089.anInt1045;
								continue;
							}
						} else if (local210 < 2700) {
							local30--;
							local1089 = Static102.method2541(Static145.anIntArray281[local30]);
							if (local210 == 2600) {
								Static145.anIntArray281[local30++] = local1089.anInt1071;
								continue;
							}
							if (local210 == 2601) {
								Static145.anIntArray281[local30++] = local1089.anInt1053;
								continue;
							}
							if (local210 == 2602) {
								Static59.aClass10Array9[local34++] = local1089.aClass10_500;
								continue;
							}
							if (local210 == 2603) {
								Static145.anIntArray281[local30++] = local1089.anInt1031;
								continue;
							}
							if (local210 == 2604) {
								Static145.anIntArray281[local30++] = local1089.anInt1076;
								continue;
							}
							if (local210 == 2605) {
								Static145.anIntArray281[local30++] = local1089.anInt1039;
								continue;
							}
							if (local210 == 2606) {
								Static145.anIntArray281[local30++] = local1089.anInt1058;
								continue;
							}
							if (local210 == 2607) {
								Static145.anIntArray281[local30++] = local1089.anInt1055;
								continue;
							}
							if (local210 == 2608) {
								Static145.anIntArray281[local30++] = local1089.anInt1044;
								continue;
							}
						} else if (local210 < 2800) {
							if (local210 == 2700) {
								local30--;
								local1089 = Static102.method2541(Static145.anIntArray281[local30]);
								Static145.anIntArray281[local30++] = local1089.anInt1099;
								continue;
							}
							if (local210 == 2701) {
								local30--;
								local1089 = Static102.method2541(Static145.anIntArray281[local30]);
								if (local1089.anInt1099 == -1) {
									Static145.anIntArray281[local30++] = 0;
								} else {
									Static145.anIntArray281[local30++] = local1089.anInt1067;
								}
								continue;
							}
							if (local210 == 2702) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								@Pc(2014) Class2_Sub15 local2014 = (Class2_Sub15) Static30.aClass18_2.method683((long) local752);
								if (local2014 == null) {
									Static145.anIntArray281[local30++] = 0;
								} else {
									Static145.anIntArray281[local30++] = 1;
								}
								continue;
							}
						} else if (local210 < 2900) {
							local30--;
							local1089 = Static102.method2541(Static145.anIntArray281[local30]);
							if (local210 == 2800) {
								Static145.anIntArray281[local30++] = Static64.method1127(Static126.method2068(local1089));
								continue;
							}
							if (local210 == 2801) {
								local30--;
								local757 = Static145.anIntArray281[local30];
								local757--;
								if (local1089.aClass10Array6 != null && local757 < local1089.aClass10Array6.length && local1089.aClass10Array6[local757] != null) {
									Static59.aClass10Array9[local34++] = local1089.aClass10Array6[local757];
									continue;
								}
								Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								continue;
							}
							if (local210 == 2802) {
								if (local1089.aClass10_501 == null) {
									Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								} else {
									Static59.aClass10Array9[local34++] = local1089.aClass10_501;
								}
								continue;
							}
						} else if (local210 < 3200) {
							if (local210 == 3100) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static96.method2627(Static123.aClass10_1204, 0, local566);
								continue;
							}
							if (local210 == 3101) {
								local30 -= 2;
								Static131.method2089(Static145.anIntArray281[local30 + 1], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1, Static145.anIntArray281[local30]);
								continue;
							}
							if (local210 == 3103) {
								Static10.method168();
								continue;
							}
							if (local210 == 3104) {
								local757 = 0;
								local34--;
								local566 = Static59.aClass10Array9[local34];
								if (local566.method362()) {
									local757 = local566.method332();
								}
								Static141.aClass2_Sub11_Sub1_3.method1495(79);
								Static141.aClass2_Sub11_Sub1_3.method1445(local757);
								continue;
							}
							if (local210 == 3105) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static141.aClass2_Sub11_Sub1_3.method1495(229);
								Static141.aClass2_Sub11_Sub1_3.method1458(local566.method363());
								continue;
							}
							if (local210 == 3106) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static141.aClass2_Sub11_Sub1_3.method1495(214);
								Static141.aClass2_Sub11_Sub1_3.method1439(local566.method340() + 1);
								Static141.aClass2_Sub11_Sub1_3.method1450(local566);
								continue;
							}
							if (local210 == 3107) {
								local34--;
								local1529 = Static59.aClass10Array9[local34];
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static177.method2698(local1529, local752);
								continue;
							}
							if (local210 == 3108) {
								local30 -= 3;
								local752 = Static145.anIntArray281[local30];
								local956 = Static145.anIntArray281[local30 + 2];
								local757 = Static145.anIntArray281[local30 + 1];
								local973 = Static102.method2541(local956);
								Static22.method346(local752, local757, local973);
								continue;
							}
							if (local210 == 3109) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30 + 1];
								local1144 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
								local752 = Static145.anIntArray281[local30];
								Static22.method346(local752, local757, local1144);
								continue;
							}
							if (local210 == 3110) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static141.aClass2_Sub11_Sub1_3.method1495(222);
								Static141.aClass2_Sub11_Sub1_3.method1479(local752);
								continue;
							}
						} else if (local210 < 3300) {
							if (local210 == 3200) {
								local30 -= 3;
								Static179.method2709(Static145.anIntArray281[local30 + 1], Static145.anIntArray281[local30 + 2], Static145.anIntArray281[local30]);
								continue;
							}
							if (local210 == 3201) {
								local30--;
								Static71.method1208(Static145.anIntArray281[local30]);
								continue;
							}
							if (local210 == 3202) {
								local30 -= 2;
								Static151.method2298(Static145.anIntArray281[local30 + 1], Static145.anIntArray281[local30]);
								continue;
							}
						} else if (local210 < 3400) {
							if (local210 == 3300) {
								Static145.anIntArray281[local30++] = Static14.anInt386;
								continue;
							}
							if (local210 == 3301) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30 + 1];
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static30.method643(local757, local752);
								continue;
							}
							if (local210 == 3302) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = Static155.method2396(local757, local752);
								continue;
							}
							if (local210 == 3303) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = Static138.method2182(local752, local757);
								continue;
							}
							if (local210 == 3304) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static34.method686(local752).anInt2706;
								continue;
							}
							if (local210 == 3305) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static99.anIntArray241[local752];
								continue;
							}
							if (local210 == 3306) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static58.anIntArray165[local752];
								continue;
							}
							if (local210 == 3307) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static138.anIntArray327[local752];
								continue;
							}
							if (local210 == 3308) {
								local956 = Static85.anInt1937 + (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 >> 7);
								local752 = Static56.anInt1432;
								local757 = (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 >> 7) + Static137.anInt3049;
								Static145.anIntArray281[local30++] = local956 + (local757 << 14) + (local752 << 28);
								continue;
							}
							if (local210 == 3309) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = local752 >> 14 & 0x3FFF;
								continue;
							}
							if (local210 == 3310) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = local752 >> 28;
								continue;
							}
							if (local210 == 3311) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = local752 & 0x3FFF;
								continue;
							}
							if (local210 == 3312) {
								Static145.anIntArray281[local30++] = Static165.aBoolean157 ? 1 : 0;
								continue;
							}
							if (local210 == 3313) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30] + 32768;
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = Static30.method643(local757, local752);
								continue;
							}
							if (local210 == 3314) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30 + 1];
								local752 = Static145.anIntArray281[local30] + 32768;
								Static145.anIntArray281[local30++] = Static155.method2396(local757, local752);
								continue;
							}
							if (local210 == 3315) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30] + 32768;
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = Static138.method2182(local752, local757);
								continue;
							}
							if (local210 == 3316) {
								if (Static92.anInt2191 >= 2) {
									Static145.anIntArray281[local30++] = Static92.anInt2191;
								} else {
									Static145.anIntArray281[local30++] = 0;
								}
								continue;
							}
							if (local210 == 3317) {
								Static145.anIntArray281[local30++] = Static79.anInt1819;
								continue;
							}
							if (local210 == 3318) {
								Static145.anIntArray281[local30++] = Static12.anInt363;
								continue;
							}
							if (local210 == 3321) {
								Static145.anIntArray281[local30++] = Static68.anInt1630;
								continue;
							}
							if (local210 == 3322) {
								Static145.anIntArray281[local30++] = Static24.anInt559;
								continue;
							}
							if (local210 == 3323) {
								if (Static92.anInt2191 == 1) {
									Static145.anIntArray281[local30++] = 1;
								} else {
									Static145.anIntArray281[local30++] = 0;
								}
								continue;
							}
							if (local210 == 3325) {
								if (Static163.anInt3514 <= 0) {
									Static145.anIntArray281[local30++] = 0;
								} else {
									Static145.anIntArray281[local30++] = 1;
								}
								continue;
							}
						} else if (local210 < 3500) {
							if (local210 == 3400) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								@Pc(6034) Class2_Sub1_Sub12 local6034 = Static37.method772(local752);
								for (local610 = 0; local610 < local6034.anInt2613; local610++) {
									if (local757 == local6034.anIntArray276[local610]) {
										Static59.aClass10Array9[local34++] = local6034.aClass10Array19[local610];
										local6034 = null;
										break;
									}
								}
								if (local6034 != null) {
									Static59.aClass10Array9[local34++] = local6034.aClass10_1123;
								}
								continue;
							}
							if (local210 == 3408) {
								local30 -= 4;
								local757 = Static145.anIntArray281[local30 + 1];
								local752 = Static145.anIntArray281[local30];
								local956 = Static145.anIntArray281[local30 + 2];
								local610 = Static145.anIntArray281[local30 + 3];
								@Pc(6100) Class2_Sub1_Sub12 local6100 = Static37.method772(local956);
								if (local6100.anInt2606 == local752 && local6100.anInt2608 == local757) {
									for (local998 = 0; local998 < local6100.anInt2613; local998++) {
										if (local610 == local6100.anIntArray276[local998]) {
											if (local757 == 115) {
												Static59.aClass10Array9[local34++] = local6100.aClass10Array19[local998];
											} else {
												Static145.anIntArray281[local30++] = local6100.anIntArray275[local998];
											}
											local6100 = null;
											break;
										}
									}
									if (local6100 != null) {
										if (local757 == 115) {
											Static59.aClass10Array9[local34++] = local6100.aClass10_1123;
										} else {
											Static145.anIntArray281[local30++] = local6100.anInt2605;
										}
									}
									continue;
								}
								if (local757 == 115) {
									Static59.aClass10Array9[local34++] = Static119.aClass10_1159;
								} else {
									Static145.anIntArray281[local30++] = 0;
								}
								continue;
							}
						} else if (local210 < 3700) {
							if (local210 == 3600) {
								if (Static69.anInt1635 == 0) {
									Static145.anIntArray281[local30++] = -2;
								} else if (Static69.anInt1635 == 1) {
									Static145.anIntArray281[local30++] = -1;
								} else {
									Static145.anIntArray281[local30++] = Static76.anInt1789;
								}
								continue;
							}
							if (local210 == 3601) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								if (Static69.anInt1635 == 2 && local752 < Static76.anInt1789) {
									Static59.aClass10Array9[local34++] = Static5.aClass10Array2[local752];
									continue;
								}
								Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								continue;
							}
							if (local210 == 3602) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								if (Static69.anInt1635 == 2 && local752 < Static76.anInt1789) {
									Static145.anIntArray281[local30++] = Static70.anIntArray181[local752];
									continue;
								}
								Static145.anIntArray281[local30++] = 0;
								continue;
							}
							if (local210 == 3603) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								if (Static69.anInt1635 == 2 && local752 < Static76.anInt1789) {
									Static145.anIntArray281[local30++] = Static62.anIntArray174[local752];
									continue;
								}
								Static145.anIntArray281[local30++] = 0;
								continue;
							}
							if (local210 == 3604) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								local30--;
								local757 = Static145.anIntArray281[local30];
								Static34.method684(local757, local566);
								continue;
							}
							if (local210 == 3605) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static129.method2079(local566.method363());
								continue;
							}
							if (local210 == 3606) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static180.method2715(local566.method363());
								continue;
							}
							if (local210 == 3607) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static161.method2444(local566.method363());
								continue;
							}
							if (local210 == 3608) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static11.method2465(local566.method363());
								continue;
							}
							if (local210 == 3609) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								if (local566.method341(Static34.aClass10_403) || local566.method341(Static62.aClass10_669)) {
									local566 = local566.method333(7);
								}
								Static145.anIntArray281[local30++] = Static169.method2597(local566) ? 1 : 0;
								continue;
							}
							if (local210 == 3611) {
								if (Static60.aClass10_659 == null) {
									Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								} else {
									Static59.aClass10Array9[local34++] = Static60.aClass10_659.method361();
								}
								continue;
							}
							if (local210 == 3612) {
								if (Static60.aClass10_659 == null) {
									Static145.anIntArray281[local30++] = 0;
								} else {
									Static145.anIntArray281[local30++] = Static146.anInt3197;
								}
								continue;
							}
							if (local210 == 3613) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								if (Static60.aClass10_659 != null && local752 < Static146.anInt3197) {
									Static59.aClass10Array9[local34++] = Static141.aClass2_Sub17Array1[local752].aClass10_1175.method361();
									continue;
								}
								Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								continue;
							}
							if (local210 == 3614) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								if (Static60.aClass10_659 != null && local752 < Static146.anInt3197) {
									Static145.anIntArray281[local30++] = Static141.aClass2_Sub17Array1[local752].anInt2721;
									continue;
								}
								Static145.anIntArray281[local30++] = 0;
								continue;
							}
							if (local210 == 3615) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								if (Static60.aClass10_659 != null && Static146.anInt3197 > local752) {
									Static145.anIntArray281[local30++] = Static141.aClass2_Sub17Array1[local752].aByte6;
									continue;
								}
								Static145.anIntArray281[local30++] = 0;
								continue;
							}
							if (local210 == 3616) {
								Static145.anIntArray281[local30++] = Static170.aByte9;
								continue;
							}
							if (local210 == 3617) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static152.method2370(local566);
								continue;
							}
							if (local210 == 3618) {
								Static145.anIntArray281[local30++] = Static114.aByte5;
								continue;
							}
							if (local210 == 3619) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static8.method158(local566.method363());
								continue;
							}
							if (local210 == 3620) {
								Static131.method2087();
								continue;
							}
							if (local210 == 3621) {
								if (Static69.anInt1635 == 0) {
									Static145.anIntArray281[local30++] = -1;
								} else {
									Static145.anIntArray281[local30++] = Static139.anInt3081;
								}
								continue;
							}
							if (local210 == 3622) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								if (Static69.anInt1635 != 0 && local752 < Static139.anInt3081) {
									Static59.aClass10Array9[local34++] = Static36.method764(Static167.aLongArray6[local752]).method361();
									continue;
								}
								Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								continue;
							}
							if (local210 == 3623) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								if (local566.method341(Static34.aClass10_403) || local566.method341(Static62.aClass10_669)) {
									local566 = local566.method333(7);
								}
								Static145.anIntArray281[local30++] = Static147.method2706(local566) ? 1 : 0;
								continue;
							}
							if (local210 == 3624) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								if (Static141.aClass2_Sub17Array1 != null && local752 < Static146.anInt3197 && Static141.aClass2_Sub17Array1[local752].aClass10_1175.method343(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass10_598)) {
									Static145.anIntArray281[local30++] = 1;
									continue;
								}
								Static145.anIntArray281[local30++] = 0;
								continue;
							}
							if (local210 == 3625) {
								if (Static65.aClass10_695 == null) {
									Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								} else {
									Static59.aClass10Array9[local34++] = Static65.aClass10_695.method361();
								}
								continue;
							}
						} else if (local210 < 4000) {
							if (local210 == 3902) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static174.aClass19Array1[local752].method784();
								continue;
							}
							if (local210 == 3903) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static174.aClass19Array1[local752].method786();
								continue;
							}
							if (local210 == 3904) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static174.aClass19Array1[local752].anInt972;
								continue;
							}
							if (local210 == 3905) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static174.aClass19Array1[local752].anInt965;
								continue;
							}
							if (local210 == 3906) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static174.aClass19Array1[local752].anInt970;
								continue;
							}
							if (local210 == 3907) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static174.aClass19Array1[local752].anInt968;
								continue;
							}
						} else if (local210 < 4100) {
							if (local210 == 4000) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = local752 + local757;
								continue;
							}
							if (local210 == 4001) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = local752 - local757;
								continue;
							}
							if (local210 == 4002) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = local757 * local752;
								continue;
							}
							if (local210 == 4003) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = local752 / local757;
								continue;
							}
							if (local210 == 4004) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = (int) ((double) local752 * Math.random());
								continue;
							}
							if (local210 == 4005) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = (int) (Math.random() * (double) (local752 + 1));
								continue;
							}
							if (local210 == 4006) {
								local30 -= 5;
								local752 = Static145.anIntArray281[local30];
								local956 = Static145.anIntArray281[local30 + 2];
								local610 = Static145.anIntArray281[local30 + 3];
								local757 = Static145.anIntArray281[local30 + 1];
								local634 = Static145.anIntArray281[local30 + 4];
								Static145.anIntArray281[local30++] = local752 + (local757 - local752) * (local634 + -local956) / (local610 - local956);
								continue;
							}
							if (local210 == 4007) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = local752 + local752 * local757 / 100;
								continue;
							}
							if (local210 == 4008) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30 + 1];
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = 0x1 << local757 | local752;
								continue;
							}
							if (local210 == 4009) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30 + 1];
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = local752 & -(0x1 << local757) - 1;
								continue;
							}
							if (local210 == 4010) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = (0x1 << local757 & local752) == 0 ? 0 : 1;
								continue;
							}
							if (local210 == 4011) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = local752 % local757;
								continue;
							}
							if (local210 == 4012) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								if (local752 == 0) {
									Static145.anIntArray281[local30++] = 0;
								} else {
									Static145.anIntArray281[local30++] = (int) Math.pow((double) local752, (double) local757);
								}
								continue;
							}
							if (local210 == 4013) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								if (local752 == 0) {
									Static145.anIntArray281[local30++] = 0;
								} else if (local757 == 0) {
									Static145.anIntArray281[local30++] = Integer.MAX_VALUE;
								} else {
									Static145.anIntArray281[local30++] = (int) Math.pow((double) local752, 1.0D / (double) local757);
								}
								continue;
							}
							if (local210 == 4014) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = local757 & local752;
								continue;
							}
							if (local210 == 4015) {
								local30 -= 2;
								local752 = Static145.anIntArray281[local30];
								local757 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = local757 | local752;
								continue;
							}
							if (local210 == 4016) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30 + 1];
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = local757 <= local752 ? local757 : local752;
								continue;
							}
							if (local210 == 4017) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30 + 1];
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = local752 <= local757 ? local757 : local752;
								continue;
							}
							if (local210 == 4018) {
								local30 -= 3;
								@Pc(3191) long local3191 = (long) Static145.anIntArray281[local30];
								@Pc(3198) long local3198 = (long) Static145.anIntArray281[local30 + 2];
								@Pc(3205) long local3205 = (long) Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = (int) (local3198 * local3191 / local3205);
								continue;
							}
						} else if (local210 < 4200) {
							if (local210 == 4100) {
								local30--;
								local757 = Static145.anIntArray281[local30];
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static59.aClass10Array9[local34++] = Static3.method36(new Class10[] { local566, Static164.method2485(local757) });
								continue;
							}
							if (local210 == 4101) {
								local34 -= 2;
								local1529 = Static59.aClass10Array9[local34 + 1];
								local566 = Static59.aClass10Array9[local34];
								Static59.aClass10Array9[local34++] = Static3.method36(new Class10[] { local566, local1529 });
								continue;
							}
							if (local210 == 4102) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								local30--;
								local757 = Static145.anIntArray281[local30];
								Static59.aClass10Array9[local34++] = Static3.method36(new Class10[] { local566, Static59.method1078(local757) });
								continue;
							}
							if (local210 == 4103) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static59.aClass10Array9[local34++] = local566.method360();
								continue;
							}
							if (local210 == 4104) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								@Pc(3361) long local3361 = ((long) local752 + 11745L) * 86400000L;
								Static111.aCalendar1.setTime(new Date(local3361));
								local610 = Static111.aCalendar1.get(5);
								local634 = Static111.aCalendar1.get(2);
								local998 = Static111.aCalendar1.get(1);
								Static59.aClass10Array9[local34++] = Static3.method36(new Class10[] { Static164.method2485(local610), Static25.aClass10_327, Static81.aClass10Array15[local634], Static25.aClass10_327, Static164.method2485(local998) });
								continue;
							}
							if (local210 == 4105) {
								local34 -= 2;
								local566 = Static59.aClass10Array9[local34];
								local1529 = Static59.aClass10Array9[local34 + 1];
								if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass74_2 != null && Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass74_2.aBoolean141) {
									Static59.aClass10Array9[local34++] = local1529;
									continue;
								}
								Static59.aClass10Array9[local34++] = local566;
								continue;
							}
							if (local210 == 4106) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static59.aClass10Array9[local34++] = Static164.method2485(local752);
								continue;
							}
							if (local210 == 4107) {
								local34 -= 2;
								Static145.anIntArray281[local30++] = Static59.aClass10Array9[local34].method331(Static59.aClass10Array9[local34 + 1]);
								continue;
							}
							@Pc(3520) byte[] local3520;
							@Pc(3525) Class2_Sub1_Sub4_Sub1_Sub1 local3525;
							if (local210 == 4108) {
								local30 -= 2;
								local34--;
								local566 = Static59.aClass10Array9[local34];
								local757 = Static145.anIntArray281[local30];
								local956 = Static145.anIntArray281[local30 + 1];
								local3520 = Static162.aClass29_Sub1_48.method1030(0, local956);
								local3525 = new Class2_Sub1_Sub4_Sub1_Sub1(local3520);
								Static145.anIntArray281[local30++] = local3525.method529(local566, local757);
								continue;
							}
							if (local210 == 4109) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								local30 -= 2;
								local956 = Static145.anIntArray281[local30 + 1];
								local757 = Static145.anIntArray281[local30];
								local3520 = Static162.aClass29_Sub1_48.method1030(0, local956);
								local3525 = new Class2_Sub1_Sub4_Sub1_Sub1(local3520);
								Static145.anIntArray281[local30++] = local3525.method524(local566, local757);
								continue;
							}
							if (local210 == 4110) {
								local34 -= 2;
								local566 = Static59.aClass10Array9[local34];
								local1529 = Static59.aClass10Array9[local34 + 1];
								local30--;
								if (Static145.anIntArray281[local30] == 1) {
									Static59.aClass10Array9[local34++] = local566;
								} else {
									Static59.aClass10Array9[local34++] = local1529;
								}
								continue;
							}
							if (local210 == 4111) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								Static59.aClass10Array9[local34++] = Static35.method525(local566);
								continue;
							}
							if (local210 == 4112) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								local30--;
								local757 = Static145.anIntArray281[local30];
								Static59.aClass10Array9[local34++] = local566.method354(local757);
								continue;
							}
							if (local210 == 4113) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static95.method1588(local752) ? 1 : 0;
								continue;
							}
							if (local210 == 4114) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static160.method2424(local752) ? 1 : 0;
								continue;
							}
							if (local210 == 4115) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static10.method171(local752) ? 1 : 0;
								continue;
							}
							if (local210 == 4116) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static156.method2401(local752) ? 1 : 0;
								continue;
							}
							if (local210 == 4117) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								if (local566 == null) {
									Static145.anIntArray281[local30++] = 0;
								} else {
									Static145.anIntArray281[local30++] = local566.method340();
								}
								continue;
							}
							if (local210 == 4118) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30];
								local34--;
								local566 = Static59.aClass10Array9[local34];
								local956 = Static145.anIntArray281[local30 + 1];
								Static59.aClass10Array9[local34++] = local566.method353(local757, local956);
								continue;
							}
							if (local210 == 4119) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								@Pc(3814) boolean local3814 = false;
								local1529 = Static161.method2445(local566.method340());
								for (local610 = 0; local566.method340() > local610; local610++) {
									local634 = local566.method357(local610);
									if (local634 == 60) {
										local3814 = true;
									} else if (local634 == 62) {
										local3814 = false;
									} else if (!local3814) {
										local1529.method351(local634);
									}
								}
								local1529.method356();
								Static59.aClass10Array9[local34++] = local1529;
								continue;
							}
							if (local210 == 4120) {
								local30 -= 2;
								local34--;
								local566 = Static59.aClass10Array9[local34];
								local757 = Static145.anIntArray281[local30];
								local956 = Static145.anIntArray281[local30 + 1];
								Static145.anIntArray281[local30++] = local566.method347(local757, local956);
								continue;
							}
							if (local210 == 4121) {
								local34 -= 2;
								local566 = Static59.aClass10Array9[local34];
								local1529 = Static59.aClass10Array9[local34 + 1];
								local30--;
								local956 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = local566.method350(local956, local1529);
								continue;
							}
						} else if (local210 < 4300) {
							if (local210 == 4200) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static59.aClass10Array9[local34++] = Static78.method577(local752).aClass10_662;
								continue;
							}
							@Pc(4991) Class2_Sub1_Sub6 local4991;
							if (local210 == 4201) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30 + 1];
								local752 = Static145.anIntArray281[local30];
								local4991 = Static78.method577(local752);
								if (local757 >= 1 && local757 <= 5 && local4991.aClass10Array11[local757 - 1] != null) {
									Static59.aClass10Array9[local34++] = local4991.aClass10Array11[local757 - 1];
									continue;
								}
								Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								continue;
							}
							if (local210 == 4202) {
								local30 -= 2;
								local757 = Static145.anIntArray281[local30 + 1];
								local752 = Static145.anIntArray281[local30];
								local4991 = Static78.method577(local752);
								if (local757 >= 1 && local757 <= 5 && local4991.aClass10Array10[local757 - 1] != null) {
									Static59.aClass10Array9[local34++] = local4991.aClass10Array10[local757 - 1];
									continue;
								}
								Static59.aClass10Array9[local34++] = Static123.aClass10_1204;
								continue;
							}
							if (local210 == 4203) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static78.method577(local752).anInt1517;
								continue;
							}
							if (local210 == 4204) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static78.method577(local752).anInt1507 == 1 ? 1 : 0;
								continue;
							}
							@Pc(5136) Class2_Sub1_Sub6 local5136;
							if (local210 == 4205) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								local5136 = Static78.method577(local752);
								if (local5136.anInt1506 == -1 && local5136.anInt1512 >= 0) {
									Static145.anIntArray281[local30++] = local5136.anInt1512;
									continue;
								}
								Static145.anIntArray281[local30++] = local752;
								continue;
							}
							if (local210 == 4206) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								local5136 = Static78.method577(local752);
								if (local5136.anInt1506 >= 0 && local5136.anInt1512 >= 0) {
									Static145.anIntArray281[local30++] = local5136.anInt1512;
									continue;
								}
								Static145.anIntArray281[local30++] = local752;
								continue;
							}
							if (local210 == 4207) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								Static145.anIntArray281[local30++] = Static78.method577(local752).aBoolean64 ? 1 : 0;
								continue;
							}
							if (local210 == 4210) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								local30--;
								local757 = Static145.anIntArray281[local30];
								Static95.method1587(local566, local757 == 1);
								Static145.anIntArray281[local30++] = Static135.anInt2995;
								continue;
							}
							if (local210 == 4211) {
								if (Static118.aShortArray22 != null && Static18.anInt486 < Static135.anInt2995) {
									Static145.anIntArray281[local30++] = Static118.aShortArray22[Static18.anInt486++] & 0xFFFF;
									continue;
								}
								Static145.anIntArray281[local30++] = -1;
								continue;
							}
							if (local210 == 4212) {
								Static18.anInt486 = 0;
								continue;
							}
						} else if (local210 < 5100) {
							if (local210 == 5000) {
								Static145.anIntArray281[local30++] = Static66.anInt1600;
								continue;
							}
							if (local210 == 5001) {
								local30 -= 3;
								Static66.anInt1600 = Static145.anIntArray281[local30];
								Static130.anInt2890 = Static145.anIntArray281[local30 + 1];
								Static111.anInt2515 = Static145.anIntArray281[local30 + 2];
								Static141.aClass2_Sub11_Sub1_3.method1495(171);
								Static141.aClass2_Sub11_Sub1_3.method1439(Static66.anInt1600);
								Static141.aClass2_Sub11_Sub1_3.method1439(Static130.anInt2890);
								Static141.aClass2_Sub11_Sub1_3.method1439(Static111.anInt2515);
								continue;
							}
							if (local210 == 5002) {
								local30 -= 2;
								local34--;
								local566 = Static59.aClass10Array9[local34];
								local956 = Static145.anIntArray281[local30 + 1];
								local757 = Static145.anIntArray281[local30];
								Static141.aClass2_Sub11_Sub1_3.method1495(108);
								Static141.aClass2_Sub11_Sub1_3.method1458(local566.method363());
								Static141.aClass2_Sub11_Sub1_3.method1439(local757 - 1);
								Static141.aClass2_Sub11_Sub1_3.method1439(local956);
								continue;
							}
							if (local210 == 5003) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								local1529 = null;
								if (local752 < 100) {
									local1529 = Static135.aClass10Array22[local752];
								}
								if (local1529 == null) {
									local1529 = Static123.aClass10_1204;
								}
								Static59.aClass10Array9[local34++] = local1529;
								continue;
							}
							if (local210 == 5004) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								local757 = -1;
								if (local752 < 100 && Static135.aClass10Array22[local752] != null) {
									local757 = Static129.anIntArray320[local752];
								}
								Static145.anIntArray281[local30++] = local757;
								continue;
							}
							if (local210 == 5005) {
								Static145.anIntArray281[local30++] = Static130.anInt2890;
								continue;
							}
							if (local210 == 5008) {
								local34--;
								local566 = Static59.aClass10Array9[local34];
								if (local566.method341(Static101.aClass10_1019)) {
									Static168.method2585(local566);
								} else {
									local1529 = local566.method360();
									@Pc(4154) byte local4154 = 0;
									if (local1529.method341(Static62.aClass10_667)) {
										local566 = local566.method333(Static62.aClass10_667.method340());
										local4154 = 0;
									} else if (local1529.method341(Static56.aClass10_614)) {
										local4154 = 1;
										local566 = local566.method333(Static56.aClass10_614.method340());
									} else if (local1529.method341(Static58.aClass10_643)) {
										local566 = local566.method333(Static58.aClass10_643.method340());
										local4154 = 2;
									} else if (local1529.method341(Static142.aClass10_1388)) {
										local566 = local566.method333(Static142.aClass10_1388.method340());
										local4154 = 3;
									} else if (local1529.method341(Static119.aClass10_1162)) {
										local566 = local566.method333(Static119.aClass10_1162.method340());
										local4154 = 4;
									} else if (local1529.method341(Static138.aClass10_1334)) {
										local566 = local566.method333(Static138.aClass10_1334.method340());
										local4154 = 5;
									} else if (local1529.method341(Static107.aClass10_1076)) {
										local566 = local566.method333(Static107.aClass10_1076.method340());
										local4154 = 6;
									} else if (local1529.method341(Static137.aClass10_1328)) {
										local566 = local566.method333(Static137.aClass10_1328.method340());
										local4154 = 7;
									} else if (local1529.method341(Static13.aClass10_175)) {
										local4154 = 8;
										local566 = local566.method333(Static13.aClass10_175.method340());
									} else if (local1529.method341(Static27.aClass10_347)) {
										local4154 = 9;
										local566 = local566.method333(Static27.aClass10_347.method340());
									} else if (local1529.method341(Static7.aClass10_113)) {
										local566 = local566.method333(Static7.aClass10_113.method340());
										local4154 = 10;
									} else if (local1529.method341(Static177.aClass10_1607)) {
										local4154 = 11;
										local566 = local566.method333(Static177.aClass10_1607.method340());
									} else if (Static130.anInt2891 != 0) {
										if (local1529.method341(Static62.aClass10_670)) {
											local566 = local566.method333(Static62.aClass10_670.method340());
											local4154 = 0;
										} else if (local1529.method341(Static56.aClass10_615)) {
											local566 = local566.method333(Static56.aClass10_615.method340());
											local4154 = 1;
										} else if (local1529.method341(Static58.aClass10_642)) {
											local566 = local566.method333(Static58.aClass10_642.method340());
											local4154 = 2;
										} else if (local1529.method341(Static142.aClass10_1392)) {
											local4154 = 3;
											local566 = local566.method333(Static142.aClass10_1392.method340());
										} else if (local1529.method341(Static119.aClass10_1164)) {
											local4154 = 4;
											local566 = local566.method333(Static119.aClass10_1164.method340());
										} else if (local1529.method341(Static138.aClass10_1333)) {
											local566 = local566.method333(Static138.aClass10_1333.method340());
											local4154 = 5;
										} else if (local1529.method341(Static107.aClass10_1074)) {
											local566 = local566.method333(Static107.aClass10_1074.method340());
											local4154 = 6;
										} else if (local1529.method341(Static137.aClass10_1330)) {
											local4154 = 7;
											local566 = local566.method333(Static137.aClass10_1330.method340());
										} else if (local1529.method341(Static13.aClass10_176)) {
											local566 = local566.method333(Static13.aClass10_176.method340());
											local4154 = 8;
										} else if (local1529.method341(Static27.aClass10_346)) {
											local4154 = 9;
											local566 = local566.method333(Static27.aClass10_346.method340());
										} else if (local1529.method341(Static7.aClass10_111)) {
											local566 = local566.method333(Static7.aClass10_111.method340());
											local4154 = 10;
										} else if (local1529.method341(Static177.aClass10_1606)) {
											local566 = local566.method333(Static177.aClass10_1606.method340());
											local4154 = 11;
										}
									}
									local1529 = local566.method360();
									@Pc(4583) byte local4583 = 0;
									if (local1529.method341(Static131.aClass10_1260)) {
										local4583 = 1;
										local566 = local566.method333(Static131.aClass10_1260.method340());
									} else if (local1529.method341(Static93.aClass10_924)) {
										local566 = local566.method333(Static93.aClass10_924.method340());
										local4583 = 2;
									} else if (local1529.method341(Static143.aClass10_1399)) {
										local566 = local566.method333(Static143.aClass10_1399.method340());
										local4583 = 3;
									} else if (local1529.method341(Static32.aClass10_398)) {
										local566 = local566.method333(Static32.aClass10_398.method340());
										local4583 = 4;
									} else if (local1529.method341(Static14.aClass10_183)) {
										local4583 = 5;
										local566 = local566.method333(Static14.aClass10_183.method340());
									} else if (Static130.anInt2891 != 0) {
										if (local1529.method341(Static131.aClass10_1258)) {
											local566 = local566.method333(Static131.aClass10_1258.method340());
											local4583 = 1;
										} else if (local1529.method341(Static93.aClass10_927)) {
											local566 = local566.method333(Static93.aClass10_927.method340());
											local4583 = 2;
										} else if (local1529.method341(Static143.aClass10_1396)) {
											local566 = local566.method333(Static143.aClass10_1396.method340());
											local4583 = 3;
										} else if (local1529.method341(Static32.aClass10_395)) {
											local4583 = 4;
											local566 = local566.method333(Static32.aClass10_395.method340());
										} else if (local1529.method341(Static14.aClass10_178)) {
											local566 = local566.method333(Static14.aClass10_178.method340());
											local4583 = 5;
										}
									}
									Static141.aClass2_Sub11_Sub1_3.method1495(10);
									Static141.aClass2_Sub11_Sub1_3.method1439(0);
									local634 = Static141.aClass2_Sub11_Sub1_3.anInt2077;
									Static141.aClass2_Sub11_Sub1_3.method1439(local4154);
									Static141.aClass2_Sub11_Sub1_3.method1439(local4583);
									Static37.method774(Static141.aClass2_Sub11_Sub1_3, local566);
									Static141.aClass2_Sub11_Sub1_3.method1465(Static141.aClass2_Sub11_Sub1_3.anInt2077 - local634);
								}
								continue;
							}
							if (local210 == 5009) {
								local34 -= 2;
								local566 = Static59.aClass10Array9[local34];
								local1529 = Static59.aClass10Array9[local34 + 1];
								Static141.aClass2_Sub11_Sub1_3.method1495(233);
								Static141.aClass2_Sub11_Sub1_3.method1439(0);
								local956 = Static141.aClass2_Sub11_Sub1_3.anInt2077;
								Static141.aClass2_Sub11_Sub1_3.method1458(local566.method363());
								Static37.method774(Static141.aClass2_Sub11_Sub1_3, local1529);
								Static141.aClass2_Sub11_Sub1_3.method1465(Static141.aClass2_Sub11_Sub1_3.anInt2077 - local956);
								continue;
							}
							if (local210 == 5010) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								local1529 = null;
								if (local752 < 100) {
									local1529 = Static58.aClass10Array8[local752];
								}
								if (local1529 == null) {
									local1529 = Static123.aClass10_1204;
								}
								Static59.aClass10Array9[local34++] = local1529;
								continue;
							}
							if (local210 == 5011) {
								local30--;
								local752 = Static145.anIntArray281[local30];
								local1529 = null;
								if (local752 < 100) {
									local1529 = Static143.aClass10Array23[local752];
								}
								if (local1529 == null) {
									local1529 = Static123.aClass10_1204;
								}
								Static59.aClass10Array9[local34++] = local1529;
								continue;
							}
							if (local210 == 5015) {
								if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1 == null || Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass10_598 == null) {
									local566 = Static95.aClass10_951;
								} else {
									local566 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass10_598;
								}
								Static59.aClass10Array9[local34++] = local566;
								continue;
							}
							if (local210 == 5016) {
								Static145.anIntArray281[local30++] = Static111.anInt2515;
								continue;
							}
							if (local210 == 5017) {
								Static145.anIntArray281[local30++] = Static95.anInt2254;
								continue;
							}
						}
					} else {
						if (local210 < 2000) {
							local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
						} else {
							local30--;
							local1089 = Static102.method2541(Static145.anIntArray281[local30]);
							local210 -= 1000;
						}
						if (local210 == 1300) {
							local30--;
							local757 = Static145.anIntArray281[local30] - 1;
							if (local757 >= 0 && local757 <= 9) {
								local34--;
								local1089.method841(Static59.aClass10Array9[local34], local757);
								continue;
							}
							local34--;
							continue;
						}
						if (local210 == 1301) {
							local30 -= 2;
							local757 = Static145.anIntArray281[local30];
							local956 = Static145.anIntArray281[local30 + 1];
							local1089.aClass23_3 = Static14.method222(local757, local956);
							continue;
						}
						if (local210 == 1302) {
							local30--;
							local1089.aBoolean38 = Static145.anIntArray281[local30] == 1;
							continue;
						}
						if (local210 == 1303) {
							local30--;
							local1089.anInt1063 = Static145.anIntArray281[local30];
							continue;
						}
						if (local210 == 1304) {
							local30--;
							local1089.anInt1081 = Static145.anIntArray281[local30];
							continue;
						}
						if (local210 == 1305) {
							local34--;
							local1089.aClass10_501 = Static59.aClass10Array9[local34];
							continue;
						}
						if (local210 == 1306) {
							local34--;
							local1089.aClass10_499 = Static59.aClass10Array9[local34];
							continue;
						}
						if (local210 == 1307) {
							local1089.aClass10Array6 = null;
							continue;
						}
					}
				} else {
					if (local210 < 2000) {
						local1089 = local929 ? Static89.aClass23_8 : Static132.aClass23_11;
					} else {
						local30--;
						local1089 = Static102.method2541(Static145.anIntArray281[local30]);
						local210 -= 1000;
					}
					if (local210 == 1000) {
						local30 -= 2;
						local1089.anInt1073 = Static145.anIntArray281[local30];
						local1089.anInt1085 = Static145.anIntArray281[local30 + 1];
						Static3.method34(local1089);
						continue;
					}
					if (local210 == 1001) {
						local30 -= 2;
						local1089.anInt1089 = Static145.anIntArray281[local30];
						local1089.anInt1087 = Static145.anIntArray281[local30 + 1];
						Static3.method34(local1089);
						continue;
					}
					if (local210 == 1003) {
						local30--;
						@Pc(1269) boolean local1269 = Static145.anIntArray281[local30] == 1;
						if (local1089.aBoolean49 != local1269) {
							local1089.aBoolean49 = local1269;
							Static3.method34(local1089);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7511) Exception local7511) {
			if (local18.aClass10_1531 == null) {
				if (Static174.anInt3740 != 0) {
					Static96.method2627(Static123.aClass10_1204, 0, Static116.aClass10_1137);
				}
				Static165.method2525("CS2 - scr:" + local18.aLong139 + " op:" + local42, local7511);
			} else {
				@Pc(7518) Class10 local7518 = Static161.method2445(30);
				local7518.method352(Static161.aClass10_1498).method352(local18.aClass10_1531);
				for (local56 = Static123.anInt2777 - 1; local56 >= 0; local56--) {
					local7518.method352(Static150.aClass10_1548).method352(Static109.aClass56Array1[local56].aClass2_Sub1_Sub18_1.aClass10_1531);
				}
				if (local42 == 40) {
					local94 = local37[local32];
					local7518.method352(Static109.aClass10_1091).method352(Static164.method2485(local94));
				}
				if (Static174.anInt3740 != 0) {
					Static96.method2627(Static123.aClass10_1204, 0, Static3.method36(new Class10[] { Static87.aClass10_868, local18.aClass10_1531 }));
				}
				Static165.method2525("CS2 - scr:" + local18.aLong139 + " op:" + local42 + new String(local7518.method359()), local7511);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!gb;II)V")
	public static void method882(@OriginalArg(1) Class2_Sub1_Sub3_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if ((arg2 & 0x1) != 0) {
			local16 = Static75.aClass2_Sub11_Sub1_1.method1461();
			local20 = Static75.aClass2_Sub11_Sub1_1.method1461();
			arg0.method2464(Static14.anInt386, local20, local16);
			arg0.anInt3474 = Static14.anInt386 + 300;
			arg0.anInt3486 = Static75.aClass2_Sub11_Sub1_1.method1462();
			arg0.anInt3495 = Static75.aClass2_Sub11_Sub1_1.method1462();
		}
		if ((arg2 & 0x400) != 0) {
			arg0.anInt3453 = Static75.aClass2_Sub11_Sub1_1.method1461();
			arg0.anInt3492 = Static75.aClass2_Sub11_Sub1_1.method1461();
			arg0.anInt3490 = Static75.aClass2_Sub11_Sub1_1.method1462();
			arg0.anInt3471 = Static75.aClass2_Sub11_Sub1_1.method1460();
			arg0.anInt3461 = Static75.aClass2_Sub11_Sub1_1.method1456() + Static14.anInt386;
			arg0.anInt3488 = Static75.aClass2_Sub11_Sub1_1.method1459() + Static14.anInt386;
			arg0.anInt3463 = Static75.aClass2_Sub11_Sub1_1.method1460();
			arg0.anInt3476 = 1;
			arg0.anInt3469 = 0;
		}
		if ((arg2 & 0x200) != 0) {
			local16 = Static75.aClass2_Sub11_Sub1_1.method1462();
			local20 = Static75.aClass2_Sub11_Sub1_1.method1462();
			arg0.method2464(Static14.anInt386, local20, local16);
			arg0.anInt3474 = Static14.anInt386 + 300;
			arg0.anInt3486 = Static75.aClass2_Sub11_Sub1_1.method1466();
			arg0.anInt3495 = Static75.aClass2_Sub11_Sub1_1.method1466();
		}
		if ((arg2 & 0x100) != 0) {
			arg0.anInt3508 = Static75.aClass2_Sub11_Sub1_1.method1459();
			local16 = Static75.aClass2_Sub11_Sub1_1.method1435();
			arg0.anInt3478 = local16 >> 16;
			arg0.anInt3500 = 0;
			if (arg0.anInt3508 == 65535) {
				arg0.anInt3508 = -1;
			}
			arg0.anInt3485 = Static14.anInt386 + (local16 & 0xFFFF);
			if (Static14.anInt386 < arg0.anInt3485) {
				arg0.anInt3500 = -1;
			}
			arg0.anInt3470 = 0;
		}
		if ((arg2 & 0x80) != 0) {
			local16 = Static75.aClass2_Sub11_Sub1_1.method1456();
			local20 = Static75.aClass2_Sub11_Sub1_1.method1462();
			@Pc(202) int local202 = Static75.aClass2_Sub11_Sub1_1.method1462();
			@Pc(205) int local205 = Static75.aClass2_Sub11_Sub1_1.anInt2077;
			if (arg0.aClass10_598 != null && arg0.aClass74_2 != null) {
				@Pc(216) long local216 = arg0.aClass10_598.method363();
				@Pc(218) boolean local218 = false;
				if (local20 <= 1) {
					for (@Pc(225) int local225 = 0; local225 < Static139.anInt3081; local225++) {
						if (Static167.aLongArray6[local225] == local216) {
							local218 = true;
							break;
						}
					}
				}
				if (!local218 && Static3.anInt41 == 0) {
					Static169.aClass2_Sub11_5.anInt2077 = 0;
					Static75.aClass2_Sub11_Sub1_1.method1488(Static169.aClass2_Sub11_5.aByteArray24, local202);
					Static169.aClass2_Sub11_5.anInt2077 = 0;
					@Pc(272) Class10 local272 = Static35.method525(Static81.method1309(Static169.aClass2_Sub11_5).method348());
					arg0.aClass10_1514 = local272.method336();
					arg0.anInt3462 = local16 & 0xFF;
					arg0.anInt3459 = 150;
					arg0.anInt3460 = local16 >> 8;
					if (local20 == 2 || local20 == 3) {
						Static96.method2627(Static3.method36(new Class10[] { Static18.aClass10_221, arg0.aClass10_598 }), 1, local272);
					} else if (local20 == 1) {
						Static96.method2627(Static3.method36(new Class10[] { Static154.aClass10_1448, arg0.aClass10_598 }), 1, local272);
					} else {
						Static96.method2627(arg0.aClass10_598, 2, local272);
					}
				}
			}
			Static75.aClass2_Sub11_Sub1_1.anInt2077 = local205 + local202;
		}
		if ((arg2 & 0x2) != 0) {
			arg0.aClass10_1514 = Static75.aClass2_Sub11_Sub1_1.method1452();
			if (arg0.aClass10_1514.method357(0) == 126) {
				arg0.aClass10_1514 = arg0.aClass10_1514.method333(1);
				Static96.method2627(arg0.aClass10_598, 2, arg0.aClass10_1514);
			} else if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1 == arg0) {
				Static96.method2627(arg0.aClass10_598, 2, arg0.aClass10_1514);
			}
			arg0.anInt3459 = 150;
			arg0.anInt3460 = 0;
			arg0.anInt3462 = 0;
		}
		if ((arg2 & 0x8) != 0) {
			local16 = Static75.aClass2_Sub11_Sub1_1.method1475();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = Static75.aClass2_Sub11_Sub1_1.method1461();
			Static131.method2089(local20, arg0, local16);
		}
		if ((arg2 & 0x40) != 0) {
			arg0.anInt3457 = Static75.aClass2_Sub11_Sub1_1.method1475();
			if (arg0.anInt3457 == 65535) {
				arg0.anInt3457 = -1;
			}
		}
		if ((arg2 & 0x20) != 0) {
			arg0.anInt3475 = Static75.aClass2_Sub11_Sub1_1.method1456();
			arg0.anInt3456 = Static75.aClass2_Sub11_Sub1_1.method1456();
		}
		if ((arg2 & 0x4) == 0) {
			return;
		}
		local16 = Static75.aClass2_Sub11_Sub1_1.method1466();
		@Pc(476) byte[] local476 = new byte[local16];
		@Pc(481) Class2_Sub11 local481 = new Class2_Sub11(local476);
		Static75.aClass2_Sub11_Sub1_1.method1482(local16, local476);
		Static133.aClass2_Sub11Array1[arg1] = local481;
		arg0.method980(local481);
	}
}
