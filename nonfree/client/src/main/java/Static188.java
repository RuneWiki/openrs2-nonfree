import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_27;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
	public static int anInt4489;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static int anInt4478 = 2;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1280 = Static158.method3034("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1281 = Static158.method3034("weiss:");

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	public static int anInt4484 = 0;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!ae;")
	public static final Class2_Sub3_Sub1 aClass2_Sub3_Sub1_40 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
	public static final int[] anIntArray487 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!wc;II)V")
	public static void method3444(@OriginalArg(0) Class2_Sub25 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray29;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub1_Sub15 local18 = Static140.method2840(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		@Pc(30) int[] local30 = local18.anIntArray407;
		Static114.anInt3177 = 0;
		@Pc(35) int[] local35 = local18.anIntArray406;
		@Pc(37) int local37 = -1;
		@Pc(39) byte local39 = -1;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(93) int local93;
		try {
			Static82.anIntArray271 = new int[local18.anInt3563];
			Static150.aClass60Array22 = new Class60[local18.anInt3561];
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local93 = (Integer) local8[local55];
					if (local93 == -2147483647) {
						local93 = arg0.anInt4603;
					}
					if (local93 == -2147483646) {
						local93 = arg0.anInt4604;
					}
					if (local93 == -2147483645) {
						local93 = arg0.aClass72_15 == null ? -1 : arg0.aClass72_15.anInt3935;
					}
					if (local93 == -2147483644) {
						local93 = arg0.anInt4606;
					}
					if (local93 == -2147483643) {
						local93 = arg0.aClass72_15 == null ? -1 : arg0.aClass72_15.anInt3911;
					}
					if (local93 == -2147483642) {
						local93 = arg0.aClass72_14 == null ? -1 : arg0.aClass72_14.anInt3935;
					}
					if (local93 == -2147483641) {
						local93 = arg0.aClass72_14 == null ? -1 : arg0.aClass72_14.anInt3911;
					}
					if (local93 == -2147483640) {
						local93 = arg0.anInt4600;
					}
					if (local93 == -2147483639) {
						local93 = arg0.anInt4601;
					}
					Static82.anIntArray271[local51++] = local93;
				} else if (local8[local55] instanceof Class60) {
					@Pc(72) Class60 local72 = (Class60) local8[local55];
					if (local72.method2687(Static102.aClass60_830)) {
						local72 = arg0.aClass60_1307;
					}
					Static150.aClass60Array22[local53++] = local72;
				}
			}
			local93 = 0;
			label2232: while (true) {
				local93++;
				if (arg1 < local93) {
					throw new RuntimeException("slow");
				}
				local37++;
				@Pc(213) int local213 = local30[local37];
				@Pc(747) int local747;
				@Pc(758) int local758;
				@Pc(610) int local610;
				@Pc(631) int local631;
				@Pc(568) Class60 local568;
				if (local213 < 100) {
					if (local213 == 0) {
						Static196.anIntArray504[local41++] = local35[local37];
						continue;
					}
					@Pc(238) int local238;
					if (local213 == 1) {
						local238 = local35[local37];
						Static196.anIntArray504[local41++] = Static163.anIntArray447[local238];
						continue;
					}
					if (local213 == 2) {
						local238 = local35[local37];
						local41--;
						Static163.anIntArray447[local238] = Static196.anIntArray504[local41];
						continue;
					}
					if (local213 == 3) {
						Static122.aClass60Array19[local23++] = local18.aClass60Array20[local37];
						continue;
					}
					if (local213 == 6) {
						local37 += local35[local37];
						continue;
					}
					if (local213 == 7) {
						local41 -= 2;
						if (Static196.anIntArray504[local41 + 1] != Static196.anIntArray504[local41]) {
							local37 += local35[local37];
						}
						continue;
					}
					if (local213 == 8) {
						local41 -= 2;
						if (Static196.anIntArray504[local41 + 1] == Static196.anIntArray504[local41]) {
							local37 += local35[local37];
						}
						continue;
					}
					if (local213 == 9) {
						local41 -= 2;
						if (Static196.anIntArray504[local41] < Static196.anIntArray504[local41 + 1]) {
							local37 += local35[local37];
						}
						continue;
					}
					if (local213 == 10) {
						local41 -= 2;
						if (Static196.anIntArray504[local41] > Static196.anIntArray504[local41 + 1]) {
							local37 += local35[local37];
						}
						continue;
					}
					if (local213 == 21) {
						if (Static114.anInt3177 == 0) {
							return;
						}
						@Pc(397) Class49 local397 = Static164.aClass49Array1[--Static114.anInt3177];
						local37 = local397.anInt3058;
						Static82.anIntArray271 = local397.anIntArray349;
						Static150.aClass60Array22 = local397.aClass60Array18;
						local18 = local397.aClass2_Sub1_Sub15_1;
						local30 = local18.anIntArray407;
						local35 = local18.anIntArray406;
						continue;
					}
					if (local213 == 25) {
						local238 = local35[local37];
						Static196.anIntArray504[local41++] = Static7.method3570(local238);
						continue;
					}
					if (local213 == 27) {
						local238 = local35[local37];
						local41--;
						Static81.method1911(Static196.anIntArray504[local41], local238);
						continue;
					}
					if (local213 == 31) {
						local41 -= 2;
						if (Static196.anIntArray504[local41] <= Static196.anIntArray504[local41 + 1]) {
							local37 += local35[local37];
						}
						continue;
					}
					if (local213 == 32) {
						local41 -= 2;
						if (Static196.anIntArray504[local41 + 1] <= Static196.anIntArray504[local41]) {
							local37 += local35[local37];
						}
						continue;
					}
					if (local213 == 33) {
						Static196.anIntArray504[local41++] = Static82.anIntArray271[local35[local37]];
						continue;
					}
					@Pc(514) int local514;
					if (local213 == 34) {
						local514 = local35[local37];
						local41--;
						Static82.anIntArray271[local514] = Static196.anIntArray504[local41];
						continue;
					}
					if (local213 == 35) {
						Static122.aClass60Array19[local23++] = Static150.aClass60Array22[local35[local37]];
						continue;
					}
					if (local213 == 36) {
						local514 = local35[local37];
						local23--;
						Static150.aClass60Array22[local514] = Static122.aClass60Array19[local23];
						continue;
					}
					if (local213 == 37) {
						local238 = local35[local37];
						local23 -= local238;
						local568 = Static20.method446(local23, local238, Static122.aClass60Array19);
						Static122.aClass60Array19[local23++] = local568;
						continue;
					}
					if (local213 == 38) {
						local41--;
						continue;
					}
					if (local213 == 39) {
						local23--;
						continue;
					}
					if (local213 == 40) {
						local238 = local35[local37];
						@Pc(600) Class2_Sub1_Sub15 local600 = Static140.method2840(local238);
						@Pc(604) int[] local604 = new int[local600.anInt3563];
						@Pc(608) Class60[] local608 = new Class60[local600.anInt3561];
						for (local610 = 0; local610 < local600.anInt3566; local610++) {
							local604[local610] = Static196.anIntArray504[local610 + local41 - local600.anInt3566];
						}
						for (local631 = 0; local631 < local600.anInt3567; local631++) {
							local608[local631] = Static122.aClass60Array19[local23 + local631 - local600.anInt3567];
						}
						local23 -= local600.anInt3567;
						local41 -= local600.anInt3566;
						@Pc(664) Class49 local664 = new Class49();
						local664.anIntArray349 = Static82.anIntArray271;
						local664.anInt3058 = local37;
						local664.aClass2_Sub1_Sub15_1 = local18;
						local664.aClass60Array18 = Static150.aClass60Array22;
						if (Static164.aClass49Array1.length <= Static114.anInt3177) {
							throw new RuntimeException();
						}
						local18 = local600;
						local37 = -1;
						Static164.aClass49Array1[Static114.anInt3177++] = local664;
						local30 = local600.anIntArray407;
						local35 = local600.anIntArray406;
						Static150.aClass60Array22 = local608;
						Static82.anIntArray271 = local604;
						continue;
					}
					if (local213 == 42) {
						Static196.anIntArray504[local41++] = Static11.anIntArray35[local35[local37]];
						continue;
					}
					if (local213 == 43) {
						local514 = local35[local37];
						local41--;
						Static11.anIntArray35[local514] = Static196.anIntArray504[local41];
						continue;
					}
					if (local213 == 44) {
						local747 = local35[local37] & 0xFFFF;
						local238 = local35[local37] >> 16;
						local41--;
						local758 = Static196.anIntArray504[local41];
						if (local758 >= 0 && local758 <= 5000) {
							Static186.anIntArray485[local238] = local758;
							@Pc(775) byte local775 = -1;
							if (local747 == 105) {
								local775 = 0;
							}
							local610 = 0;
							while (true) {
								if (local610 >= local758) {
									continue label2232;
								}
								Static174.anIntArrayArray26[local238][local610] = local775;
								local610++;
							}
						}
						throw new RuntimeException();
					}
					if (local213 == 45) {
						local238 = local35[local37];
						local41--;
						local747 = Static196.anIntArray504[local41];
						if (local747 >= 0 && Static186.anIntArray485[local238] > local747) {
							Static196.anIntArray504[local41++] = Static174.anIntArrayArray26[local238][local747];
							continue;
						}
						throw new RuntimeException();
					}
					if (local213 == 46) {
						local41 -= 2;
						local747 = Static196.anIntArray504[local41];
						local238 = local35[local37];
						if (local747 >= 0 && Static186.anIntArray485[local238] > local747) {
							Static174.anIntArrayArray26[local238][local747] = Static196.anIntArray504[local41 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local213 == 47) {
						@Pc(889) Class60 local889 = Static3.aClass60Array1[local35[local37]];
						if (local889 == null) {
							local889 = Static75.aClass60_612;
						}
						Static122.aClass60Array19[local23++] = local889;
						continue;
					}
					if (local213 == 48) {
						local514 = local35[local37];
						local23--;
						Static3.aClass60Array1[local514] = Static122.aClass60Array19[local23];
						continue;
					}
					if (local213 == 51) {
						@Pc(924) Class51 local924 = local18.aClass51Array1[local35[local37]];
						local41--;
						@Pc(934) Class2_Sub12 local934 = (Class2_Sub12) local924.method2458((long) Static196.anIntArray504[local41]);
						if (local934 != null) {
							local37 += local934.anInt2882;
						}
						continue;
					}
				}
				@Pc(952) boolean local952;
				if (local35[local37] == 1) {
					local952 = true;
				} else {
					local952 = false;
				}
				@Pc(5997) Class72 local5997;
				@Pc(5980) Class72 local5980;
				@Pc(3054) int local3054;
				@Pc(1114) Class72 local1114;
				@Pc(1163) int local1163;
				if (local213 < 300) {
					if (local213 == 100) {
						local41 -= 3;
						local747 = Static196.anIntArray504[local41];
						local758 = Static196.anIntArray504[local41 + 1];
						local1163 = Static196.anIntArray504[local41 + 2];
						if (local758 == 0) {
							throw new RuntimeException();
						}
						local5980 = Static173.method3201(local747);
						if (local5980.aClass72Array1 == null) {
							local5980.aClass72Array1 = new Class72[local1163 + 1];
						}
						if (local5980.aClass72Array1.length <= local1163) {
							@Pc(7830) Class72[] local7830 = new Class72[local1163 + 1];
							for (local3054 = 0; local3054 < local5980.aClass72Array1.length; local3054++) {
								local7830[local3054] = local5980.aClass72Array1[local3054];
							}
							local5980.aClass72Array1 = local7830;
						}
						if (local1163 > 0 && local5980.aClass72Array1[local1163 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1163 - 1));
						}
						@Pc(7879) Class72 local7879 = new Class72();
						local7879.aBoolean151 = true;
						local7879.anInt3911 = local1163;
						local7879.anInt3932 = local758;
						local7879.anInt3937 = local7879.anInt3935 = local5980.anInt3935;
						local5980.aClass72Array1[local1163] = local7879;
						if (local952) {
							Static130.aClass72_7 = local7879;
						} else {
							Static60.aClass72_4 = local7879;
						}
						Static39.method900(local5980);
						continue;
					}
					@Pc(7946) Class72 local7946;
					if (local213 == 101) {
						local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
						if (local1114.anInt3911 == -1) {
							if (!local952) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local7946 = Static173.method3201(local1114.anInt3935);
						local7946.aClass72Array1[local1114.anInt3911] = null;
						Static39.method900(local7946);
						continue;
					}
					if (local213 == 102) {
						local41--;
						local1114 = Static173.method3201(Static196.anIntArray504[local41]);
						local1114.aClass72Array1 = null;
						Static39.method900(local1114);
						continue;
					}
					if (local213 == 200) {
						local41 -= 2;
						local758 = Static196.anIntArray504[local41 + 1];
						local747 = Static196.anIntArray504[local41];
						local5997 = Static181.method3381(local758, local747);
						if (local5997 != null && local758 != -1) {
							Static196.anIntArray504[local41++] = 1;
							if (local952) {
								Static130.aClass72_7 = local5997;
							} else {
								Static60.aClass72_4 = local5997;
							}
							continue;
						}
						Static196.anIntArray504[local41++] = 0;
						continue;
					}
					if (local213 == 201) {
						local41--;
						local747 = Static196.anIntArray504[local41];
						local7946 = Static173.method3201(local747);
						if (local7946 == null) {
							Static196.anIntArray504[local41++] = 0;
						} else {
							Static196.anIntArray504[local41++] = 1;
							if (local952) {
								Static130.aClass72_7 = local7946;
							} else {
								Static60.aClass72_4 = local7946;
							}
						}
						continue;
					}
				} else if (local213 < 500) {
					if (local213 == 403) {
						local41 -= 2;
						local747 = Static196.anIntArray504[local41];
						if (local747 >= 7) {
							local747 -= 7;
						}
						local758 = Static196.anIntArray504[local41 + 1];
						Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1.method1575(local758, local747);
						continue;
					}
					if (local213 == 404) {
						local41 -= 2;
						local758 = Static196.anIntArray504[local41 + 1];
						local747 = Static196.anIntArray504[local41];
						Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1.method1584(local758, local747);
						continue;
					}
					if (local213 == 410) {
						local41--;
						@Pc(1033) boolean local1033 = Static196.anIntArray504[local41] != 0;
						Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1.method1581(local1033);
						continue;
					}
				} else if ((local213 < 1000 || local213 >= 1100) && (local213 < 2000 || local213 >= 2100)) {
					@Pc(2946) Class60 local2946;
					if (local213 >= 1100 && local213 < 1200 || !(local213 < 2100 || local213 >= 2200)) {
						if (local213 < 2000) {
							local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
						} else {
							local41--;
							local1114 = Static173.method3201(Static196.anIntArray504[local41]);
							local213 -= 1000;
						}
						if (local213 == 1100) {
							local41 -= 2;
							local1114.anInt3903 = Static196.anIntArray504[local41];
							if (local1114.anInt3903 > local1114.anInt3921 - local1114.anInt3878) {
								local1114.anInt3903 = local1114.anInt3921 - local1114.anInt3878;
							}
							if (local1114.anInt3903 < 0) {
								local1114.anInt3903 = 0;
							}
							local1114.anInt3926 = Static196.anIntArray504[local41 + 1];
							if (local1114.anInt3926 > local1114.anInt3886 - local1114.anInt3871) {
								local1114.anInt3926 = local1114.anInt3886 - local1114.anInt3871;
							}
							if (local1114.anInt3926 < 0) {
								local1114.anInt3926 = 0;
							}
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1101) {
							local41--;
							local1114.anInt3879 = Static196.anIntArray504[local41];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1102) {
							local41--;
							local1114.aBoolean153 = Static196.anIntArray504[local41] == 1;
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1103) {
							local41--;
							local1114.anInt3890 = Static196.anIntArray504[local41];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1104) {
							local41--;
							local1114.anInt3896 = Static196.anIntArray504[local41];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1105) {
							local41--;
							local1114.anInt3861 = Static196.anIntArray504[local41];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1106) {
							local41--;
							local1114.anInt3882 = Static196.anIntArray504[local41];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1107) {
							local41--;
							local1114.aBoolean147 = Static196.anIntArray504[local41] == 1;
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1108) {
							local1114.anInt3885 = 1;
							local41--;
							local1114.anInt3891 = Static196.anIntArray504[local41];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1109) {
							local41 -= 6;
							local1114.anInt3889 = Static196.anIntArray504[local41];
							local1114.anInt3940 = Static196.anIntArray504[local41 + 1];
							local1114.anInt3865 = Static196.anIntArray504[local41 + 2];
							local1114.anInt3881 = Static196.anIntArray504[local41 + 3];
							local1114.anInt3925 = Static196.anIntArray504[local41 + 4];
							local1114.anInt3874 = Static196.anIntArray504[local41 + 5];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1110) {
							local41--;
							local758 = Static196.anIntArray504[local41];
							if (local1114.anInt3923 != local758) {
								local1114.anInt3941 = 0;
								local1114.anInt3902 = 0;
								local1114.anInt3923 = local758;
								Static39.method900(local1114);
							}
							continue;
						}
						if (local213 == 1111) {
							local41--;
							local1114.aBoolean146 = Static196.anIntArray504[local41] == 1;
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1112) {
							local23--;
							local2946 = Static122.aClass60Array19[local23];
							if (!local2946.method2687(local1114.aClass60_1057)) {
								local1114.aClass60_1057 = local2946;
								Static39.method900(local1114);
							}
							continue;
						}
						if (local213 == 1113) {
							local41--;
							local1114.anInt3930 = Static196.anIntArray504[local41];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1114) {
							local41 -= 3;
							local1114.anInt3876 = Static196.anIntArray504[local41];
							local1114.anInt3897 = Static196.anIntArray504[local41 + 1];
							local1114.anInt3862 = Static196.anIntArray504[local41 + 2];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1115) {
							local41--;
							local1114.aBoolean145 = Static196.anIntArray504[local41] == 1;
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1116) {
							local41--;
							local1114.anInt3916 = Static196.anIntArray504[local41];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1117) {
							local41--;
							local1114.anInt3868 = Static196.anIntArray504[local41];
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1118) {
							local41--;
							local1114.aBoolean150 = Static196.anIntArray504[local41] == 1;
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1119) {
							local41--;
							local1114.aBoolean156 = Static196.anIntArray504[local41] == 1;
							Static39.method900(local1114);
							continue;
						}
						if (local213 == 1120) {
							local41 -= 2;
							local1114.anInt3921 = Static196.anIntArray504[local41];
							local1114.anInt3886 = Static196.anIntArray504[local41 + 1];
							Static39.method900(local1114);
							continue;
						}
					} else if (local213 >= 1200 && local213 < 1300 || local213 >= 2200 && local213 < 2300) {
						if (local213 >= 2000) {
							local213 -= 1000;
							local41--;
							local1114 = Static173.method3201(Static196.anIntArray504[local41]);
						} else {
							local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
						}
						Static39.method900(local1114);
						if (local213 == 1200) {
							local41 -= 2;
							local758 = Static196.anIntArray504[local41];
							local1163 = Static196.anIntArray504[local41 + 1];
							if (local758 == -1) {
								local1114.anInt3913 = -1;
								local1114.anInt3891 = -1;
								local1114.anInt3885 = 1;
							} else {
								local1114.anInt3939 = local1163;
								local1114.anInt3913 = local758;
								@Pc(7057) Class2_Sub1_Sub8 local7057 = Static88.method2046(local758);
								local1114.anInt3889 = local7057.anInt1553;
								local1114.anInt3925 = local7057.anInt1557;
								local1114.anInt3881 = local7057.anInt1547;
								local1114.anInt3865 = local7057.anInt1556;
								local1114.anInt3940 = local7057.anInt1529;
								local1114.anInt3874 = local7057.anInt1527;
								if (local1114.anInt3878 > 0) {
									local1114.anInt3874 = local1114.anInt3874 * 32 / local1114.anInt3878;
								}
							}
							continue;
						}
						if (local213 == 1201) {
							local1114.anInt3885 = 2;
							local41--;
							local1114.anInt3891 = Static196.anIntArray504[local41];
							continue;
						}
						if (local213 == 1202) {
							local1114.anInt3885 = 3;
							local1114.anInt3891 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1.method1578();
							continue;
						}
						if (local213 == 1203) {
							local1114.anInt3885 = 6;
							local41--;
							local1114.anInt3891 = Static196.anIntArray504[local41];
							continue;
						}
						if (local213 == 1204) {
							local1114.anInt3885 = 5;
							local41--;
							local1114.anInt3891 = Static196.anIntArray504[local41];
							continue;
						}
					} else if (local213 >= 1300 && local213 < 1400 || local213 >= 2300 && local213 < 2400) {
						if (local213 >= 2000) {
							local41--;
							local1114 = Static173.method3201(Static196.anIntArray504[local41]);
							local213 -= 1000;
						} else {
							local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
						}
						if (local213 == 1300) {
							local41--;
							local758 = Static196.anIntArray504[local41] - 1;
							if (local758 >= 0 && local758 <= 9) {
								local23--;
								local1114.method2982(local758, Static122.aClass60Array19[local23]);
								continue;
							}
							local23--;
							continue;
						}
						if (local213 == 1301) {
							local41 -= 2;
							local1163 = Static196.anIntArray504[local41 + 1];
							local758 = Static196.anIntArray504[local41];
							local1114.aClass72_9 = Static181.method3381(local1163, local758);
							continue;
						}
						if (local213 == 1302) {
							local41--;
							local1114.aBoolean155 = Static196.anIntArray504[local41] == 1;
							continue;
						}
						if (local213 == 1303) {
							local41--;
							local1114.anInt3898 = Static196.anIntArray504[local41];
							continue;
						}
						if (local213 == 1304) {
							local41--;
							local1114.anInt3920 = Static196.anIntArray504[local41];
							continue;
						}
						if (local213 == 1305) {
							local23--;
							local1114.aClass60_1059 = Static122.aClass60Array19[local23];
							continue;
						}
						if (local213 == 1306) {
							local23--;
							local1114.aClass60_1053 = Static122.aClass60Array19[local23];
							continue;
						}
						if (local213 == 1307) {
							local1114.aClass60Array24 = null;
							continue;
						}
					} else {
						if (local213 >= 1400 && local213 < 1500 || local213 >= 2400 && local213 < 2500) {
							if (local213 >= 2000) {
								local213 -= 1000;
								local41--;
								local1114 = Static173.method3201(Static196.anIntArray504[local41]);
							} else {
								local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
							}
							@Pc(6678) int[] local6678 = null;
							local23--;
							local2946 = Static122.aClass60Array19[local23];
							if (local2946.method2673() > 0 && local2946.method2665(local2946.method2673() - 1) == 89) {
								local41--;
								local610 = Static196.anIntArray504[local41];
								if (local610 > 0) {
									local6678 = new int[local610];
									while (local610-- > 0) {
										local41--;
										local6678[local610] = Static196.anIntArray504[local41];
									}
								}
								local2946 = local2946.method2667(local2946.method2673() - 1, 0);
							}
							@Pc(6744) Object[] local6744 = new Object[local2946.method2673() + 1];
							for (local631 = local6744.length - 1; local631 >= 1; local631--) {
								if (local2946.method2665(local631 - 1) == 115) {
									local23--;
									local6744[local631] = Static122.aClass60Array19[local23];
								} else {
									local41--;
									local6744[local631] = Integer.valueOf(Static196.anIntArray504[local41]);
								}
							}
							local41--;
							local3054 = Static196.anIntArray504[local41];
							if (local3054 == -1) {
								local6744 = null;
							} else {
								local6744[0] = Integer.valueOf(local3054);
							}
							if (local213 == 1425) {
								local1114.anObjectArray28 = local6744;
							}
							if (local213 == 1411) {
								local1114.anObjectArray5 = local6744;
							}
							if (local213 == 1419) {
								local1114.anObjectArray8 = local6744;
							}
							if (local213 == 1412) {
								local1114.anObjectArray26 = local6744;
							}
							if (local213 == 1400) {
								local1114.anObjectArray15 = local6744;
							}
							if (local213 == 1415) {
								local1114.anIntArray431 = local6678;
								local1114.anObjectArray16 = local6744;
							}
							if (local213 == 1422) {
								local1114.anObjectArray24 = local6744;
							}
							if (local213 == 1417) {
								local1114.anObjectArray21 = local6744;
							}
							if (local213 == 1418) {
								local1114.anObjectArray17 = local6744;
							}
							if (local213 == 1402) {
								local1114.anObjectArray27 = local6744;
							}
							if (local213 == 1421) {
								local1114.anObjectArray11 = local6744;
							}
							if (local213 == 1407) {
								local1114.anIntArray427 = local6678;
								local1114.anObjectArray18 = local6744;
							}
							if (local213 == 1405) {
								local1114.anObjectArray4 = local6744;
							}
							if (local213 == 1409) {
								local1114.anObjectArray7 = local6744;
							}
							if (local213 == 1424) {
								local1114.anObjectArray25 = local6744;
							}
							local1114.aBoolean154 = true;
							if (local213 == 1414) {
								local1114.anIntArray429 = local6678;
								local1114.anObjectArray22 = local6744;
							}
							if (local213 == 1416) {
								local1114.anObjectArray20 = local6744;
							}
							if (local213 == 1423) {
								local1114.anObjectArray12 = local6744;
							}
							if (local213 == 1408) {
								local1114.anObjectArray13 = local6744;
							}
							if (local213 == 1406) {
								local1114.anObjectArray19 = local6744;
							}
							if (local213 == 1401) {
								local1114.anObjectArray10 = local6744;
							}
							if (local213 == 1404) {
								local1114.anObjectArray9 = local6744;
							}
							if (local213 == 1420) {
								local1114.anObjectArray23 = local6744;
							}
							if (local213 == 1410) {
								local1114.anObjectArray3 = local6744;
							}
							if (local213 == 1403) {
								local1114.anObjectArray6 = local6744;
							}
							continue;
						}
						if (local213 < 1600) {
							local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
							if (local213 == 1500) {
								Static196.anIntArray504[local41++] = local1114.anInt3907;
								continue;
							}
							if (local213 == 1501) {
								Static196.anIntArray504[local41++] = local1114.anInt3919;
								continue;
							}
							if (local213 == 1502) {
								Static196.anIntArray504[local41++] = local1114.anInt3878;
								continue;
							}
							if (local213 == 1503) {
								Static196.anIntArray504[local41++] = local1114.anInt3871;
								continue;
							}
							if (local213 == 1504) {
								Static196.anIntArray504[local41++] = local1114.aBoolean148 ? 1 : 0;
								continue;
							}
							if (local213 == 1505) {
								Static196.anIntArray504[local41++] = local1114.anInt3937;
								continue;
							}
						} else if (local213 < 1700) {
							local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
							if (local213 == 1600) {
								Static196.anIntArray504[local41++] = local1114.anInt3903;
								continue;
							}
							if (local213 == 1601) {
								Static196.anIntArray504[local41++] = local1114.anInt3926;
								continue;
							}
							if (local213 == 1602) {
								Static122.aClass60Array19[local23++] = local1114.aClass60_1057;
								continue;
							}
							if (local213 == 1603) {
								Static196.anIntArray504[local41++] = local1114.anInt3921;
								continue;
							}
							if (local213 == 1604) {
								Static196.anIntArray504[local41++] = local1114.anInt3886;
								continue;
							}
							if (local213 == 1605) {
								Static196.anIntArray504[local41++] = local1114.anInt3874;
								continue;
							}
							if (local213 == 1606) {
								Static196.anIntArray504[local41++] = local1114.anInt3865;
								continue;
							}
							if (local213 == 1607) {
								Static196.anIntArray504[local41++] = local1114.anInt3925;
								continue;
							}
							if (local213 == 1608) {
								Static196.anIntArray504[local41++] = local1114.anInt3881;
								continue;
							}
							if (local213 == 1609) {
								Static196.anIntArray504[local41++] = local1114.anInt3890;
								continue;
							}
						} else if (local213 < 1800) {
							local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
							if (local213 == 1700) {
								Static196.anIntArray504[local41++] = local1114.anInt3913;
								continue;
							}
							if (local213 == 1701) {
								if (local1114.anInt3913 == -1) {
									Static196.anIntArray504[local41++] = 0;
								} else {
									Static196.anIntArray504[local41++] = local1114.anInt3939;
								}
								continue;
							}
							if (local213 == 1702) {
								Static196.anIntArray504[local41++] = local1114.anInt3911;
								continue;
							}
						} else if (local213 < 1900) {
							local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
							if (local213 == 1800) {
								Static196.anIntArray504[local41++] = Static53.method1255(Static26.method637(local1114));
								continue;
							}
							if (local213 == 1801) {
								local41--;
								local758 = Static196.anIntArray504[local41];
								local758--;
								if (local1114.aClass60Array24 != null && local758 < local1114.aClass60Array24.length && local1114.aClass60Array24[local758] != null) {
									Static122.aClass60Array19[local23++] = local1114.aClass60Array24[local758];
									continue;
								}
								Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								continue;
							}
							if (local213 == 1802) {
								if (local1114.aClass60_1059 == null) {
									Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								} else {
									Static122.aClass60Array19[local23++] = local1114.aClass60_1059;
								}
								continue;
							}
						} else if (local213 < 2600) {
							local41--;
							local1114 = Static173.method3201(Static196.anIntArray504[local41]);
							if (local213 == 2500) {
								Static196.anIntArray504[local41++] = local1114.anInt3907;
								continue;
							}
							if (local213 == 2501) {
								Static196.anIntArray504[local41++] = local1114.anInt3919;
								continue;
							}
							if (local213 == 2502) {
								Static196.anIntArray504[local41++] = local1114.anInt3878;
								continue;
							}
							if (local213 == 2503) {
								Static196.anIntArray504[local41++] = local1114.anInt3871;
								continue;
							}
							if (local213 == 2504) {
								Static196.anIntArray504[local41++] = local1114.aBoolean148 ? 1 : 0;
								continue;
							}
							if (local213 == 2505) {
								Static196.anIntArray504[local41++] = local1114.anInt3937;
								continue;
							}
						} else if (local213 < 2700) {
							local41--;
							local1114 = Static173.method3201(Static196.anIntArray504[local41]);
							if (local213 == 2600) {
								Static196.anIntArray504[local41++] = local1114.anInt3903;
								continue;
							}
							if (local213 == 2601) {
								Static196.anIntArray504[local41++] = local1114.anInt3926;
								continue;
							}
							if (local213 == 2602) {
								Static122.aClass60Array19[local23++] = local1114.aClass60_1057;
								continue;
							}
							if (local213 == 2603) {
								Static196.anIntArray504[local41++] = local1114.anInt3921;
								continue;
							}
							if (local213 == 2604) {
								Static196.anIntArray504[local41++] = local1114.anInt3886;
								continue;
							}
							if (local213 == 2605) {
								Static196.anIntArray504[local41++] = local1114.anInt3874;
								continue;
							}
							if (local213 == 2606) {
								Static196.anIntArray504[local41++] = local1114.anInt3865;
								continue;
							}
							if (local213 == 2607) {
								Static196.anIntArray504[local41++] = local1114.anInt3925;
								continue;
							}
							if (local213 == 2608) {
								Static196.anIntArray504[local41++] = local1114.anInt3881;
								continue;
							}
							if (local213 == 2609) {
								Static196.anIntArray504[local41++] = local1114.anInt3890;
								continue;
							}
						} else if (local213 < 2800) {
							if (local213 == 2700) {
								local41--;
								local1114 = Static173.method3201(Static196.anIntArray504[local41]);
								Static196.anIntArray504[local41++] = local1114.anInt3913;
								continue;
							}
							if (local213 == 2701) {
								local41--;
								local1114 = Static173.method3201(Static196.anIntArray504[local41]);
								if (local1114.anInt3913 == -1) {
									Static196.anIntArray504[local41++] = 0;
								} else {
									Static196.anIntArray504[local41++] = local1114.anInt3939;
								}
								continue;
							}
							if (local213 == 2702) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								@Pc(6106) Class2_Sub20 local6106 = (Class2_Sub20) Static156.aClass51_11.method2458((long) local747);
								if (local6106 == null) {
									Static196.anIntArray504[local41++] = 0;
								} else {
									Static196.anIntArray504[local41++] = 1;
								}
								continue;
							}
							if (local213 == 2703) {
								local41--;
								local1114 = Static173.method3201(Static196.anIntArray504[local41]);
								if (local1114.aClass72Array1 == null) {
									Static196.anIntArray504[local41++] = 0;
									continue;
								}
								local758 = local1114.aClass72Array1.length;
								for (local1163 = 0; local1163 < local1114.aClass72Array1.length; local1163++) {
									if (local1114.aClass72Array1[local1163] == null) {
										local758 = local1163;
										break;
									}
								}
								Static196.anIntArray504[local41++] = local758;
								continue;
							}
							if (local213 == 2704 || local213 == 2705) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								@Pc(6208) Class2_Sub20 local6208 = (Class2_Sub20) Static156.aClass51_11.method2458((long) local747);
								if (local6208 != null && local758 == local6208.anInt3986) {
									Static196.anIntArray504[local41++] = 1;
									continue;
								}
								Static196.anIntArray504[local41++] = 0;
								continue;
							}
						} else if (local213 < 2900) {
							local41--;
							local1114 = Static173.method3201(Static196.anIntArray504[local41]);
							if (local213 == 2800) {
								Static196.anIntArray504[local41++] = Static53.method1255(Static26.method637(local1114));
								continue;
							}
							if (local213 == 2801) {
								local41--;
								local758 = Static196.anIntArray504[local41];
								local758--;
								if (local1114.aClass60Array24 != null && local758 < local1114.aClass60Array24.length && local1114.aClass60Array24[local758] != null) {
									Static122.aClass60Array19[local23++] = local1114.aClass60Array24[local758];
									continue;
								}
								Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								continue;
							}
							if (local213 == 2802) {
								if (local1114.aClass60_1059 == null) {
									Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								} else {
									Static122.aClass60Array19[local23++] = local1114.aClass60_1059;
								}
								continue;
							}
						} else if (local213 < 3200) {
							if (local213 == 3100) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static118.method2563(0, Static118.aClass60_921, local568);
								continue;
							}
							if (local213 == 3101) {
								local41 -= 2;
								Static79.method1891(Static196.anIntArray504[local41], Static196.anIntArray504[local41 + 1], Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1);
								continue;
							}
							if (local213 == 3103) {
								Static171.method3181();
								continue;
							}
							if (local213 == 3104) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								local758 = 0;
								if (local568.method2699()) {
									local758 = local568.method2692();
								}
								Static7.aClass2_Sub3_Sub1_43.method244(186);
								Static7.aClass2_Sub3_Sub1_43.method197(local758);
								continue;
							}
							if (local213 == 3105) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static7.aClass2_Sub3_Sub1_43.method244(207);
								Static7.aClass2_Sub3_Sub1_43.method205(local568.method2691());
								continue;
							}
							if (local213 == 3106) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static7.aClass2_Sub3_Sub1_43.method244(113);
								Static7.aClass2_Sub3_Sub1_43.method224(local568.method2673() + 1);
								Static7.aClass2_Sub3_Sub1_43.method226(local568);
								continue;
							}
							if (local213 == 3107) {
								local23--;
								local2946 = Static122.aClass60Array19[local23];
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static32.method795(local747, local2946);
								continue;
							}
							if (local213 == 3108) {
								local41 -= 3;
								local758 = Static196.anIntArray504[local41 + 1];
								local747 = Static196.anIntArray504[local41];
								local1163 = Static196.anIntArray504[local41 + 2];
								local5980 = Static173.method3201(local1163);
								Static190.method3485(local5980, local747, local758);
								continue;
							}
							if (local213 == 3109) {
								local41 -= 2;
								local5997 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static190.method3485(local5997, local747, local758);
								continue;
							}
							if (local213 == 3110) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static7.aClass2_Sub3_Sub1_43.method244(170);
								Static7.aClass2_Sub3_Sub1_43.method199(local747);
								continue;
							}
						} else if (local213 < 3300) {
							if (local213 == 3200) {
								local41 -= 3;
								Static80.method1894(Static196.anIntArray504[local41 + 1], Static196.anIntArray504[local41], Static196.anIntArray504[local41 + 2]);
								continue;
							}
							if (local213 == 3201) {
								local41--;
								Static173.method3200(Static196.anIntArray504[local41]);
								continue;
							}
							if (local213 == 3202) {
								local41 -= 2;
								Static122.method2602(Static196.anIntArray504[local41 + 1], Static196.anIntArray504[local41]);
								continue;
							}
						} else if (local213 < 3400) {
							if (local213 == 3300) {
								Static196.anIntArray504[local41++] = Static20.anInt580;
								continue;
							}
							if (local213 == 3301) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = Static41.method912(local758, local747);
								continue;
							}
							if (local213 == 3302) {
								local41 -= 2;
								local758 = Static196.anIntArray504[local41 + 1];
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static106.method2401(local758, local747);
								continue;
							}
							if (local213 == 3303) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = Static99.method2275(local747, local758);
								continue;
							}
							if (local213 == 3304) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static187.method3552(local747).anInt756;
								continue;
							}
							if (local213 == 3305) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static37.anIntArray100[local747];
								continue;
							}
							if (local213 == 3306) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static64.anIntArray183[local747];
								continue;
							}
							if (local213 == 3307) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static39.anIntArray118[local747];
								continue;
							}
							if (local213 == 3308) {
								local758 = (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 >> 7) + Static76.anInt2319;
								local747 = Static62.anInt1923;
								local1163 = (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 >> 7) + Static76.anInt2317;
								Static196.anIntArray504[local41++] = local1163 + (local747 << 28) + (local758 << 14);
								continue;
							}
							if (local213 == 3309) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = local747 >> 14 & 0x3FFF;
								continue;
							}
							if (local213 == 3310) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = local747 >> 28;
								continue;
							}
							if (local213 == 3311) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = local747 & 0x3FFF;
								continue;
							}
							if (local213 == 3312) {
								Static196.anIntArray504[local41++] = Static107.aBoolean117 ? 1 : 0;
								continue;
							}
							if (local213 == 3313) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41] + 32768;
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = Static41.method912(local758, local747);
								continue;
							}
							if (local213 == 3314) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41] + 32768;
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = Static106.method2401(local758, local747);
								continue;
							}
							if (local213 == 3315) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41] + 32768;
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = Static99.method2275(local747, local758);
								continue;
							}
							if (local213 == 3316) {
								if (Static2.anInt4174 < 2) {
									Static196.anIntArray504[local41++] = 0;
								} else {
									Static196.anIntArray504[local41++] = Static2.anInt4174;
								}
								continue;
							}
							if (local213 == 3317) {
								Static196.anIntArray504[local41++] = Static96.anInt3098;
								continue;
							}
							if (local213 == 3318) {
								Static196.anIntArray504[local41++] = Static156.anInt3974;
								continue;
							}
							if (local213 == 3321) {
								Static196.anIntArray504[local41++] = Static99.anInt2866;
								continue;
							}
							if (local213 == 3322) {
								Static196.anIntArray504[local41++] = Static153.anInt3875;
								continue;
							}
							if (local213 == 3323) {
								if (Static27.anInt836 >= 5 && Static27.anInt836 <= 9) {
									Static196.anIntArray504[local41++] = 1;
									continue;
								}
								Static196.anIntArray504[local41++] = 0;
								continue;
							}
							if (local213 == 3324) {
								if (Static27.anInt836 >= 5 && Static27.anInt836 <= 9) {
									Static196.anIntArray504[local41++] = Static27.anInt836;
									continue;
								}
								Static196.anIntArray504[local41++] = 0;
								continue;
							}
							if (local213 == 3325) {
								if (Static116.anInt3222 > 0) {
									Static196.anIntArray504[local41++] = 1;
								} else {
									Static196.anIntArray504[local41++] = 0;
								}
								continue;
							}
							if (local213 == 3326) {
								Static196.anIntArray504[local41++] = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1283;
								continue;
							}
							if (local213 == 3327) {
								Static196.anIntArray504[local41++] = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1.aBoolean88 ? 1 : 0;
								continue;
							}
						} else if (local213 < 3500) {
							if (local213 == 3400) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								@Pc(5708) Class2_Sub1_Sub13 local5708 = Static79.method1888(local747);
								Static122.aClass60Array19[local23++] = local5708.method1850(local758);
								continue;
							}
							if (local213 == 3408) {
								local41 -= 4;
								local610 = Static196.anIntArray504[local41 + 3];
								local758 = Static196.anIntArray504[local41 + 1];
								local1163 = Static196.anIntArray504[local41 + 2];
								local747 = Static196.anIntArray504[local41];
								@Pc(5750) Class2_Sub1_Sub13 local5750 = Static79.method1888(local1163);
								if (local5750.anInt2324 == local747 && local5750.anInt2318 == local758) {
									if (local758 == 115) {
										Static122.aClass60Array19[local23++] = local5750.method1850(local610);
									} else {
										Static196.anIntArray504[local41++] = local5750.method1855(local610);
									}
									continue;
								}
								if (local758 == 115) {
									Static122.aClass60Array19[local23++] = Static75.aClass60_612;
								} else {
									Static196.anIntArray504[local41++] = 0;
								}
								continue;
							}
						} else if (local213 < 3700) {
							if (local213 == 3600) {
								if (Static29.anInt888 == 0) {
									Static196.anIntArray504[local41++] = -2;
								} else if (Static29.anInt888 == 1) {
									Static196.anIntArray504[local41++] = -1;
								} else {
									Static196.anIntArray504[local41++] = Static81.anInt2399;
								}
								continue;
							}
							if (local213 == 3601) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static29.anInt888 == 2 && Static81.anInt2399 > local747) {
									Static122.aClass60Array19[local23++] = Static169.aClass60Array25[local747];
									continue;
								}
								Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								continue;
							}
							if (local213 == 3602) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static29.anInt888 == 2 && Static81.anInt2399 > local747) {
									Static196.anIntArray504[local41++] = Static93.anIntArray313[local747];
									continue;
								}
								Static196.anIntArray504[local41++] = 0;
								continue;
							}
							if (local213 == 3603) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static29.anInt888 == 2 && local747 < Static81.anInt2399) {
									Static196.anIntArray504[local41++] = Static180.anIntArray373[local747];
									continue;
								}
								Static196.anIntArray504[local41++] = 0;
								continue;
							}
							if (local213 == 3604) {
								local41--;
								local758 = Static196.anIntArray504[local41];
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static116.method2527(local758, local568);
								continue;
							}
							if (local213 == 3605) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static117.method755(local568.method2691());
								continue;
							}
							if (local213 == 3606) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static82.method1927(local568.method2691());
								continue;
							}
							if (local213 == 3607) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static152.method2235(local568.method2691());
								continue;
							}
							if (local213 == 3608) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static185.method3429(local568.method2691());
								continue;
							}
							if (local213 == 3609) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								if (local568.method2697(Static157.aClass60_1082) || local568.method2697(Static59.aClass60_434)) {
									local568 = local568.method2672(7);
								}
								Static196.anIntArray504[local41++] = Static140.method2837(local568) ? 1 : 0;
								continue;
							}
							if (local213 == 3610) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static29.anInt888 == 2 && Static81.anInt2399 > local747) {
									Static122.aClass60Array19[local23++] = Static25.aClass60Array6[local747];
									continue;
								}
								Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								continue;
							}
							if (local213 == 3611) {
								if (Static89.aClass60_709 == null) {
									Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								} else {
									Static122.aClass60Array19[local23++] = Static89.aClass60_709.method2663();
								}
								continue;
							}
							if (local213 == 3612) {
								if (Static89.aClass60_709 == null) {
									Static196.anIntArray504[local41++] = 0;
								} else {
									Static196.anIntArray504[local41++] = Static128.anInt3496;
								}
								continue;
							}
							if (local213 == 3613) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static89.aClass60_709 != null && local747 < Static128.anInt3496) {
									Static122.aClass60Array19[local23++] = Static163.aClass2_Sub23Array1[local747].aClass60_1284.method2663();
									continue;
								}
								Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								continue;
							}
							if (local213 == 3614) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static89.aClass60_709 != null && Static128.anInt3496 > local747) {
									Static196.anIntArray504[local41++] = Static163.aClass2_Sub23Array1[local747].anInt4504;
									continue;
								}
								Static196.anIntArray504[local41++] = 0;
								continue;
							}
							if (local213 == 3615) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static89.aClass60_709 != null && local747 < Static128.anInt3496) {
									Static196.anIntArray504[local41++] = Static163.aClass2_Sub23Array1[local747].aByte9;
									continue;
								}
								Static196.anIntArray504[local41++] = 0;
								continue;
							}
							if (local213 == 3616) {
								Static196.anIntArray504[local41++] = Static112.aByte5;
								continue;
							}
							if (local213 == 3617) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static32.method796(local568);
								continue;
							}
							if (local213 == 3618) {
								Static196.anIntArray504[local41++] = Static106.aByte4;
								continue;
							}
							if (local213 == 3619) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static128.method2705(local568.method2691());
								continue;
							}
							if (local213 == 3620) {
								Static135.method2776();
								continue;
							}
							if (local213 == 3621) {
								if (Static29.anInt888 == 0) {
									Static196.anIntArray504[local41++] = -1;
								} else {
									Static196.anIntArray504[local41++] = Static88.anInt2600;
								}
								continue;
							}
							if (local213 == 3622) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static29.anInt888 != 0 && Static88.anInt2600 > local747) {
									Static122.aClass60Array19[local23++] = Static182.method3394(Static138.aLongArray2[local747]).method2663();
									continue;
								}
								Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								continue;
							}
							if (local213 == 3623) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								if (local568.method2697(Static157.aClass60_1082) || local568.method2697(Static59.aClass60_434)) {
									local568 = local568.method2672(7);
								}
								Static196.anIntArray504[local41++] = Static117.method759(local568) ? 1 : 0;
								continue;
							}
							if (local213 == 3624) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static163.aClass2_Sub23Array1 != null && Static128.anInt3496 > local747 && Static163.aClass2_Sub23Array1[local747].aClass60_1284.method2698(Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass60_288)) {
									Static196.anIntArray504[local41++] = 1;
									continue;
								}
								Static196.anIntArray504[local41++] = 0;
								continue;
							}
							if (local213 == 3625) {
								if (Static4.aClass60_33 == null) {
									Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								} else {
									Static122.aClass60Array19[local23++] = Static4.aClass60_33.method2663();
								}
								continue;
							}
							if (local213 == 3626) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (Static89.aClass60_709 != null && local747 < Static128.anInt3496) {
									Static122.aClass60Array19[local23++] = Static163.aClass2_Sub23Array1[local747].aClass60_1287;
									continue;
								}
								Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								continue;
							}
						} else if (local213 < 4000) {
							if (local213 == 3903) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static96.aClass42Array3[local747].method2051();
								continue;
							}
							if (local213 == 3904) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static96.aClass42Array3[local747].anInt2588;
								continue;
							}
							if (local213 == 3905) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static96.aClass42Array3[local747].anInt2592;
								continue;
							}
							if (local213 == 3906) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static96.aClass42Array3[local747].anInt2589;
								continue;
							}
							if (local213 == 3907) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static96.aClass42Array3[local747].anInt2598;
								continue;
							}
							if (local213 == 3908) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static96.aClass42Array3[local747].anInt2594;
								continue;
							}
							if (local213 == 3910) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								local758 = Static96.aClass42Array3[local747].method2049();
								Static196.anIntArray504[local41++] = local758 == 0 ? 1 : 0;
								continue;
							}
							if (local213 == 3911) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								local758 = Static96.aClass42Array3[local747].method2049();
								Static196.anIntArray504[local41++] = local758 == 2 ? 1 : 0;
								continue;
							}
							if (local213 == 3912) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								local758 = Static96.aClass42Array3[local747].method2049();
								Static196.anIntArray504[local41++] = local758 == 5 ? 1 : 0;
								continue;
							}
							if (local213 == 3913) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								local758 = Static96.aClass42Array3[local747].method2049();
								Static196.anIntArray504[local41++] = local758 == 1 ? 1 : 0;
								continue;
							}
						} else if (local213 < 4100) {
							if (local213 == 4000) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = local758 + local747;
								continue;
							}
							if (local213 == 4001) {
								local41 -= 2;
								local758 = Static196.anIntArray504[local41 + 1];
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = local747 - local758;
								continue;
							}
							if (local213 == 4002) {
								local41 -= 2;
								local758 = Static196.anIntArray504[local41 + 1];
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = local758 * local747;
								continue;
							}
							if (local213 == 4003) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = local747 / local758;
								continue;
							}
							if (local213 == 4004) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = (int) (Math.random() * (double) local747);
								continue;
							}
							if (local213 == 4005) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = (int) ((double) (local747 + 1) * Math.random());
								continue;
							}
							if (local213 == 4006) {
								local41 -= 5;
								local747 = Static196.anIntArray504[local41];
								local1163 = Static196.anIntArray504[local41 + 2];
								local758 = Static196.anIntArray504[local41 + 1];
								local631 = Static196.anIntArray504[local41 + 4];
								local610 = Static196.anIntArray504[local41 + 3];
								Static196.anIntArray504[local41++] = (local758 - local747) * (-local1163 + local631) / (local610 - local1163) + local747;
								continue;
							}
							@Pc(2529) long local2529;
							@Pc(2534) long local2534;
							if (local213 == 4007) {
								local41 -= 2;
								local2529 = Static196.anIntArray504[local41 + 1];
								local2534 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = (int) (local2529 * local2534 / 100L + local2534);
								continue;
							}
							if (local213 == 4008) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = local747 | 0x1 << local758;
								continue;
							}
							if (local213 == 4009) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = -(0x1 << local758) - 1 & local747;
								continue;
							}
							if (local213 == 4010) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = (local747 & 0x1 << local758) == 0 ? 0 : 1;
								continue;
							}
							if (local213 == 4011) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = local747 % local758;
								continue;
							}
							if (local213 == 4012) {
								local41 -= 2;
								local758 = Static196.anIntArray504[local41 + 1];
								local747 = Static196.anIntArray504[local41];
								if (local747 == 0) {
									Static196.anIntArray504[local41++] = 0;
								} else {
									Static196.anIntArray504[local41++] = (int) Math.pow((double) local747, (double) local758);
								}
								continue;
							}
							if (local213 == 4013) {
								local41 -= 2;
								local758 = Static196.anIntArray504[local41 + 1];
								local747 = Static196.anIntArray504[local41];
								if (local747 == 0) {
									Static196.anIntArray504[local41++] = 0;
								} else if (local758 == 0) {
									Static196.anIntArray504[local41++] = Integer.MAX_VALUE;
								} else {
									Static196.anIntArray504[local41++] = (int) Math.pow((double) local747, 1.0D / (double) local758);
								}
								continue;
							}
							if (local213 == 4014) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = local758 & local747;
								continue;
							}
							if (local213 == 4015) {
								local41 -= 2;
								local758 = Static196.anIntArray504[local41 + 1];
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = local758 | local747;
								continue;
							}
							if (local213 == 4016) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = local747 < local758 ? local747 : local758;
								continue;
							}
							if (local213 == 4017) {
								local41 -= 2;
								local758 = Static196.anIntArray504[local41 + 1];
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = local758 >= local747 ? local758 : local747;
								continue;
							}
							if (local213 == 4018) {
								local41 -= 3;
								local2529 = Static196.anIntArray504[local41 + 1];
								local2534 = Static196.anIntArray504[local41];
								@Pc(2880) long local2880 = (long) Static196.anIntArray504[local41 + 2];
								Static196.anIntArray504[local41++] = (int) (local2880 * local2534 / local2529);
								continue;
							}
						} else if (local213 < 4200) {
							if (local213 == 4100) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								local41--;
								local758 = Static196.anIntArray504[local41];
								Static122.aClass60Array19[local23++] = Static193.method3536(new Class60[] { local568, Static72.method1661(local758) });
								continue;
							}
							if (local213 == 4101) {
								local23 -= 2;
								local568 = Static122.aClass60Array19[local23];
								local2946 = Static122.aClass60Array19[local23 + 1];
								Static122.aClass60Array19[local23++] = Static193.method3536(new Class60[] { local568, local2946 });
								continue;
							}
							if (local213 == 4102) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								local41--;
								local758 = Static196.anIntArray504[local41];
								Static122.aClass60Array19[local23++] = Static193.method3536(new Class60[] { local568, Static132.method2764(local758) });
								continue;
							}
							if (local213 == 4103) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static122.aClass60Array19[local23++] = local568.method2679();
								continue;
							}
							if (local213 == 4104) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								@Pc(3036) long local3036 = (long) local747 * 86400000L + 1014768000000L;
								Static96.aCalendar4.setTime(new Date(local3036));
								local610 = Static96.aCalendar4.get(5);
								local631 = Static96.aCalendar4.get(2);
								local3054 = Static96.aCalendar4.get(1);
								Static122.aClass60Array19[local23++] = Static193.method3536(new Class60[] { Static72.method1661(local610), Static85.aClass60_679, Static101.aClass60Array17[local631], Static85.aClass60_679, Static72.method1661(local3054) });
								continue;
							}
							if (local213 == 4105) {
								local23 -= 2;
								local2946 = Static122.aClass60Array19[local23 + 1];
								local568 = Static122.aClass60Array19[local23];
								if (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1 != null && Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1.aBoolean88) {
									Static122.aClass60Array19[local23++] = local2946;
									continue;
								}
								Static122.aClass60Array19[local23++] = local568;
								continue;
							}
							if (local213 == 4106) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static122.aClass60Array19[local23++] = Static72.method1661(local747);
								continue;
							}
							if (local213 == 4107) {
								local23 -= 2;
								Static196.anIntArray504[local41++] = Static122.aClass60Array19[local23].method2685(Static122.aClass60Array19[local23 + 1]);
								continue;
							}
							@Pc(3191) byte[] local3191;
							@Pc(3196) Class2_Sub1_Sub7_Sub3_Sub1 local3196;
							if (local213 == 4108) {
								local41 -= 2;
								local23--;
								local568 = Static122.aClass60Array19[local23];
								local758 = Static196.anIntArray504[local41];
								local1163 = Static196.anIntArray504[local41 + 1];
								local3191 = aClass13_Sub1_27.method521(0, local1163);
								local3196 = new Class2_Sub1_Sub7_Sub3_Sub1(local3191);
								local3196.method1804(Static22.aClass2_Sub1_Sub7_Sub2Array1, null);
								Static196.anIntArray504[local41++] = local3196.method1778(local568, local758);
								continue;
							}
							if (local213 == 4109) {
								local41 -= 2;
								local23--;
								local568 = Static122.aClass60Array19[local23];
								local1163 = Static196.anIntArray504[local41 + 1];
								local758 = Static196.anIntArray504[local41];
								local3191 = aClass13_Sub1_27.method521(0, local1163);
								local3196 = new Class2_Sub1_Sub7_Sub3_Sub1(local3191);
								local3196.method1804(Static22.aClass2_Sub1_Sub7_Sub2Array1, null);
								Static196.anIntArray504[local41++] = local3196.method1797(local568, local758);
								continue;
							}
							if (local213 == 4110) {
								local23 -= 2;
								local568 = Static122.aClass60Array19[local23];
								local2946 = Static122.aClass60Array19[local23 + 1];
								local41--;
								if (Static196.anIntArray504[local41] == 1) {
									Static122.aClass60Array19[local23++] = local568;
								} else {
									Static122.aClass60Array19[local23++] = local2946;
								}
								continue;
							}
							if (local213 == 4111) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static122.aClass60Array19[local23++] = Static124.method1777(local568);
								continue;
							}
							if (local213 == 4112) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								local41--;
								local758 = Static196.anIntArray504[local41];
								Static122.aClass60Array19[local23++] = local568.method2677(local758);
								continue;
							}
							if (local213 == 4113) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static67.method1569(local747) ? 1 : 0;
								continue;
							}
							if (local213 == 4114) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static62.method1442(local747) ? 1 : 0;
								continue;
							}
							if (local213 == 4115) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static40.method905(local747) ? 1 : 0;
								continue;
							}
							if (local213 == 4116) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static131.method243(local747) ? 1 : 0;
								continue;
							}
							if (local213 == 4117) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								if (local568 == null) {
									Static196.anIntArray504[local41++] = 0;
								} else {
									Static196.anIntArray504[local41++] = local568.method2673();
								}
								continue;
							}
							if (local213 == 4118) {
								local41 -= 2;
								local23--;
								local568 = Static122.aClass60Array19[local23];
								local1163 = Static196.anIntArray504[local41 + 1];
								local758 = Static196.anIntArray504[local41];
								Static122.aClass60Array19[local23++] = local568.method2667(local1163, local758);
								continue;
							}
							if (local213 == 4119) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								local2946 = Static185.method3428(local568.method2673());
								@Pc(3491) boolean local3491 = false;
								for (local610 = 0; local610 < local568.method2673(); local610++) {
									local631 = local568.method2665(local610);
									if (local631 == 60) {
										local3491 = true;
									} else if (local631 == 62) {
										local3491 = false;
									} else if (!local3491) {
										local2946.method2694(local631);
									}
								}
								local2946.method2701();
								Static122.aClass60Array19[local23++] = local2946;
								continue;
							}
							if (local213 == 4120) {
								local41 -= 2;
								local23--;
								local568 = Static122.aClass60Array19[local23];
								local758 = Static196.anIntArray504[local41];
								local1163 = Static196.anIntArray504[local41 + 1];
								Static196.anIntArray504[local41++] = local568.method2676(local758, local1163);
								continue;
							}
							if (local213 == 4121) {
								local23 -= 2;
								local41--;
								local1163 = Static196.anIntArray504[local41];
								local2946 = Static122.aClass60Array19[local23 + 1];
								local568 = Static122.aClass60Array19[local23];
								Static196.anIntArray504[local41++] = local568.method2693(local1163, local2946);
								continue;
							}
						} else if (local213 < 4300) {
							if (local213 == 4200) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static122.aClass60Array19[local23++] = Static88.method2046(local747).aClass60_363;
								continue;
							}
							@Pc(4684) Class2_Sub1_Sub8 local4684;
							if (local213 == 4201) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								local4684 = Static88.method2046(local747);
								if (local758 >= 1 && local758 <= 5 && local4684.aClass60Array8[local758 - 1] != null) {
									Static122.aClass60Array19[local23++] = local4684.aClass60Array8[local758 - 1];
									continue;
								}
								Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								continue;
							}
							if (local213 == 4202) {
								local41 -= 2;
								local747 = Static196.anIntArray504[local41];
								local758 = Static196.anIntArray504[local41 + 1];
								local4684 = Static88.method2046(local747);
								if (local758 >= 1 && local758 <= 5 && local4684.aClass60Array9[local758 - 1] != null) {
									Static122.aClass60Array19[local23++] = local4684.aClass60Array9[local758 - 1];
									continue;
								}
								Static122.aClass60Array19[local23++] = Static118.aClass60_921;
								continue;
							}
							if (local213 == 4203) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static88.method2046(local747).anInt1564;
								continue;
							}
							if (local213 == 4204) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static88.method2046(local747).anInt1535 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4823) Class2_Sub1_Sub8 local4823;
							if (local213 == 4205) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								local4823 = Static88.method2046(local747);
								if (local4823.anInt1538 == -1 && local4823.anInt1533 >= 0) {
									Static196.anIntArray504[local41++] = local4823.anInt1533;
									continue;
								}
								Static196.anIntArray504[local41++] = local747;
								continue;
							}
							if (local213 == 4206) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								local4823 = Static88.method2046(local747);
								if (local4823.anInt1538 >= 0 && local4823.anInt1533 >= 0) {
									Static196.anIntArray504[local41++] = local4823.anInt1533;
									continue;
								}
								Static196.anIntArray504[local41++] = local747;
								continue;
							}
							if (local213 == 4207) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								Static196.anIntArray504[local41++] = Static88.method2046(local747).aBoolean58 ? 1 : 0;
								continue;
							}
							if (local213 == 4210) {
								local41--;
								local758 = Static196.anIntArray504[local41];
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static55.method1324(local568, local758 == 1);
								Static196.anIntArray504[local41++] = Static87.anInt2586;
								continue;
							}
							if (local213 == 4211) {
								if (Static81.aShortArray45 != null && anInt4489 < Static87.anInt2586) {
									Static196.anIntArray504[local41++] = Static81.aShortArray45[anInt4489++] & 0xFFFF;
									continue;
								}
								Static196.anIntArray504[local41++] = -1;
								continue;
							}
							if (local213 == 4212) {
								anInt4489 = 0;
								continue;
							}
						} else if (local213 < 5100) {
							if (local213 == 5000) {
								Static196.anIntArray504[local41++] = Static63.anInt1932;
								continue;
							}
							if (local213 == 5001) {
								local41 -= 3;
								Static63.anInt1932 = Static196.anIntArray504[local41];
								Static22.anInt705 = Static196.anIntArray504[local41 + 1];
								Static123.anInt3380 = Static196.anIntArray504[local41 + 2];
								Static7.aClass2_Sub3_Sub1_43.method244(221);
								Static7.aClass2_Sub3_Sub1_43.method224(Static63.anInt1932);
								Static7.aClass2_Sub3_Sub1_43.method224(Static22.anInt705);
								Static7.aClass2_Sub3_Sub1_43.method224(Static123.anInt3380);
								continue;
							}
							if (local213 == 5002) {
								local41 -= 2;
								local758 = Static196.anIntArray504[local41];
								local1163 = Static196.anIntArray504[local41 + 1];
								local23--;
								local568 = Static122.aClass60Array19[local23];
								Static7.aClass2_Sub3_Sub1_43.method244(75);
								Static7.aClass2_Sub3_Sub1_43.method205(local568.method2691());
								Static7.aClass2_Sub3_Sub1_43.method224(local758 - 1);
								Static7.aClass2_Sub3_Sub1_43.method224(local1163);
								continue;
							}
							if (local213 == 5003) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								local2946 = null;
								if (local747 < 100) {
									local2946 = Static196.aClass60Array27[local747];
								}
								if (local2946 == null) {
									local2946 = Static118.aClass60_921;
								}
								Static122.aClass60Array19[local23++] = local2946;
								continue;
							}
							if (local213 == 5004) {
								local41--;
								local747 = Static196.anIntArray504[local41];
								local758 = -1;
								if (local747 < 100 && Static196.aClass60Array27[local747] != null) {
									local758 = Static102.anIntArray339[local747];
								}
								Static196.anIntArray504[local41++] = local758;
								continue;
							}
							if (local213 == 5005) {
								Static196.anIntArray504[local41++] = Static22.anInt705;
								continue;
							}
							if (local213 == 5008) {
								local23--;
								local568 = Static122.aClass60Array19[local23];
								if (local568.method2697(Static29.aClass60_209)) {
									Static48.method1094(local568);
								} else {
									local2946 = local568.method2679();
									@Pc(3815) byte local3815 = 0;
									if (local2946.method2697(Static111.aClass60_872)) {
										local3815 = 0;
										local568 = local568.method2672(Static111.aClass60_872.method2673());
									} else if (local2946.method2697(Static6.aClass60_70)) {
										local568 = local568.method2672(Static6.aClass60_70.method2673());
										local3815 = 1;
									} else if (local2946.method2697(Static49.aClass60_354)) {
										local568 = local568.method2672(Static49.aClass60_354.method2673());
										local3815 = 2;
									} else if (local2946.method2697(Static35.aClass60_857)) {
										local568 = local568.method2672(Static35.aClass60_857.method2673());
										local3815 = 3;
									} else if (local2946.method2697(Static193.aClass60_1309)) {
										local568 = local568.method2672(Static193.aClass60_1309.method2673());
										local3815 = 4;
									} else if (local2946.method2697(Static40.aClass60_289)) {
										local3815 = 5;
										local568 = local568.method2672(Static40.aClass60_289.method2673());
									} else if (local2946.method2697(Static31.aClass60_227)) {
										local568 = local568.method2672(Static31.aClass60_227.method2673());
										local3815 = 6;
									} else if (local2946.method2697(Static86.aClass60_692)) {
										local568 = local568.method2672(Static86.aClass60_692.method2673());
										local3815 = 7;
									} else if (local2946.method2697(Static150.aClass60_1051)) {
										local568 = local568.method2672(Static150.aClass60_1051.method2673());
										local3815 = 8;
									} else if (local2946.method2697(Static169.aClass60_1146)) {
										local568 = local568.method2672(Static169.aClass60_1146.method2673());
										local3815 = 9;
									} else if (local2946.method2697(Static58.aClass60_421)) {
										local3815 = 10;
										local568 = local568.method2672(Static58.aClass60_421.method2673());
									} else if (local2946.method2697(Static55.aClass60_401)) {
										local3815 = 11;
										local568 = local568.method2672(Static55.aClass60_401.method2673());
									} else if (Static132.anInt3564 != 0) {
										if (local2946.method2697(Static111.aClass60_870)) {
											local3815 = 0;
											local568 = local568.method2672(Static111.aClass60_870.method2673());
										} else if (local2946.method2697(Static6.aClass60_65)) {
											local568 = local568.method2672(Static6.aClass60_65.method2673());
											local3815 = 1;
										} else if (local2946.method2697(Static49.aClass60_353)) {
											local568 = local568.method2672(Static49.aClass60_353.method2673());
											local3815 = 2;
										} else if (local2946.method2697(Static35.aClass60_858)) {
											local568 = local568.method2672(Static35.aClass60_858.method2673());
											local3815 = 3;
										} else if (local2946.method2697(Static193.aClass60_1310)) {
											local568 = local568.method2672(Static193.aClass60_1310.method2673());
											local3815 = 4;
										} else if (local2946.method2697(Static40.aClass60_295)) {
											local3815 = 5;
											local568 = local568.method2672(Static40.aClass60_295.method2673());
										} else if (local2946.method2697(Static31.aClass60_223)) {
											local568 = local568.method2672(Static31.aClass60_223.method2673());
											local3815 = 6;
										} else if (local2946.method2697(Static86.aClass60_687)) {
											local568 = local568.method2672(Static86.aClass60_687.method2673());
											local3815 = 7;
										} else if (local2946.method2697(Static150.aClass60_1052)) {
											local3815 = 8;
											local568 = local568.method2672(Static150.aClass60_1052.method2673());
										} else if (local2946.method2697(Static169.aClass60_1145)) {
											local568 = local568.method2672(Static169.aClass60_1145.method2673());
											local3815 = 9;
										} else if (local2946.method2697(Static58.aClass60_422)) {
											local568 = local568.method2672(Static58.aClass60_422.method2673());
											local3815 = 10;
										} else if (local2946.method2697(Static55.aClass60_399)) {
											local3815 = 11;
											local568 = local568.method2672(Static55.aClass60_399.method2673());
										}
									}
									local2946 = local568.method2679();
									@Pc(4217) byte local4217 = 0;
									if (local2946.method2697(Static8.aClass60_74)) {
										local568 = local568.method2672(Static8.aClass60_74.method2673());
										local4217 = 1;
									} else if (local2946.method2697(Static74.aClass60_608)) {
										local568 = local568.method2672(Static74.aClass60_608.method2673());
										local4217 = 2;
									} else if (local2946.method2697(Static151.aClass60_743)) {
										local568 = local568.method2672(Static151.aClass60_743.method2673());
										local4217 = 3;
									} else if (local2946.method2697(Static80.aClass60_649)) {
										local4217 = 4;
										local568 = local568.method2672(Static80.aClass60_649.method2673());
									} else if (local2946.method2697(Static48.aClass60_341)) {
										local4217 = 5;
										local568 = local568.method2672(Static48.aClass60_341.method2673());
									} else if (Static132.anInt3564 != 0) {
										if (local2946.method2697(Static8.aClass60_72)) {
											local568 = local568.method2672(Static8.aClass60_72.method2673());
											local4217 = 1;
										} else if (local2946.method2697(Static74.aClass60_605)) {
											local568 = local568.method2672(Static74.aClass60_605.method2673());
											local4217 = 2;
										} else if (local2946.method2697(Static151.aClass60_741)) {
											local4217 = 3;
											local568 = local568.method2672(Static151.aClass60_741.method2673());
										} else if (local2946.method2697(Static80.aClass60_644)) {
											local568 = local568.method2672(Static80.aClass60_644.method2673());
											local4217 = 4;
										} else if (local2946.method2697(Static48.aClass60_344)) {
											local4217 = 5;
											local568 = local568.method2672(Static48.aClass60_344.method2673());
										}
									}
									Static7.aClass2_Sub3_Sub1_43.method244(124);
									Static7.aClass2_Sub3_Sub1_43.method224(0);
									local631 = Static7.aClass2_Sub3_Sub1_43.anInt273;
									Static7.aClass2_Sub3_Sub1_43.method224(local3815);
									Static7.aClass2_Sub3_Sub1_43.method224(local4217);
									Static164.method3102(Static7.aClass2_Sub3_Sub1_43, local568);
									Static7.aClass2_Sub3_Sub1_43.method200(Static7.aClass2_Sub3_Sub1_43.anInt273 - local631);
								}
								continue;
							}
							if (local213 == 5009) {
								local23 -= 2;
								local568 = Static122.aClass60Array19[local23];
								local2946 = Static122.aClass60Array19[local23 + 1];
								Static7.aClass2_Sub3_Sub1_43.method244(122);
								Static7.aClass2_Sub3_Sub1_43.method224(0);
								local1163 = Static7.aClass2_Sub3_Sub1_43.anInt273;
								Static7.aClass2_Sub3_Sub1_43.method205(local568.method2691());
								Static164.method3102(Static7.aClass2_Sub3_Sub1_43, local2946);
								Static7.aClass2_Sub3_Sub1_43.method200(Static7.aClass2_Sub3_Sub1_43.anInt273 - local1163);
								continue;
							}
							if (local213 == 5010) {
								local2946 = null;
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (local747 < 100) {
									local2946 = Static88.aClass60Array16[local747];
								}
								if (local2946 == null) {
									local2946 = Static118.aClass60_921;
								}
								Static122.aClass60Array19[local23++] = local2946;
								continue;
							}
							if (local213 == 5011) {
								local2946 = null;
								local41--;
								local747 = Static196.anIntArray504[local41];
								if (local747 < 100) {
									local2946 = Static31.aClass60Array7[local747];
								}
								if (local2946 == null) {
									local2946 = Static118.aClass60_921;
								}
								Static122.aClass60Array19[local23++] = local2946;
								continue;
							}
							if (local213 == 5015) {
								if (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1 == null || Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass60_288 == null) {
									local568 = Static95.aClass60_784;
								} else {
									local568 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass60_288;
								}
								Static122.aClass60Array19[local23++] = local568;
								continue;
							}
							if (local213 == 5016) {
								Static196.anIntArray504[local41++] = Static123.anInt3380;
								continue;
							}
							if (local213 == 5017) {
								Static196.anIntArray504[local41++] = Static98.anInt2865;
								continue;
							}
						} else if (local213 < 5200) {
							if (local213 == 5100) {
								if (Static57.aBooleanArray7[86]) {
									Static196.anIntArray504[local41++] = 1;
								} else {
									Static196.anIntArray504[local41++] = 0;
								}
								continue;
							}
							if (local213 == 5101) {
								if (Static57.aBooleanArray7[82]) {
									Static196.anIntArray504[local41++] = 1;
								} else {
									Static196.anIntArray504[local41++] = 0;
								}
								continue;
							}
							if (local213 == 5102) {
								if (Static57.aBooleanArray7[81]) {
									Static196.anIntArray504[local41++] = 1;
								} else {
									Static196.anIntArray504[local41++] = 0;
								}
								continue;
							}
						}
					}
				} else {
					if (local213 >= 2000) {
						local213 -= 1000;
						local41--;
						local1114 = Static173.method3201(Static196.anIntArray504[local41]);
					} else {
						local1114 = local952 ? Static130.aClass72_7 : Static60.aClass72_4;
					}
					if (local213 == 1000) {
						local41 -= 2;
						local1114.anInt3907 = Static196.anIntArray504[local41];
						local1114.anInt3919 = Static196.anIntArray504[local41 + 1];
						Static39.method900(local1114);
						continue;
					}
					if (local213 == 1001) {
						local41 -= 2;
						local1114.anInt3878 = Static196.anIntArray504[local41];
						local1114.anInt3871 = Static196.anIntArray504[local41 + 1];
						Static39.method900(local1114);
						continue;
					}
					if (local213 == 1003) {
						local41--;
						@Pc(7760) boolean local7760 = Static196.anIntArray504[local41] == 1;
						if (local7760 != local1114.aBoolean148) {
							local1114.aBoolean148 = local7760;
							Static39.method900(local1114);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(8070) Exception local8070) {
			if (local18.aClass60_987 == null) {
				if (Static143.anInt3743 != 0) {
					Static118.method2563(0, Static118.aClass60_921, Static27.aClass60_198);
				}
				Static153.method2973("CS2 - scr:" + local18.aLong151 + " op:" + local39, local8070);
			} else {
				@Pc(8077) Class60 local8077 = Static185.method3428(30);
				local8077.method2670(Static8.aClass60_75).method2670(local18.aClass60_987);
				for (local55 = Static114.anInt3177 - 1; local55 >= 0; local55--) {
					local8077.method2670(Static196.aClass60_1319).method2670(Static164.aClass49Array1[local55].aClass2_Sub1_Sub15_1.aClass60_987);
				}
				if (local39 == 40) {
					local93 = local35[local37];
					local8077.method2670(Static140.aClass60_1006).method2670(Static72.method1661(local93));
				}
				if (Static143.anInt3743 != 0) {
					Static118.method2563(0, Static118.aClass60_921, Static193.method3536(new Class60[] { Static115.aClass60_907, local18.aClass60_987 }));
				}
				Static153.method2973("CS2 - scr:" + local18.aLong151 + " op:" + local39 + new String(local8077.method2674()), local8070);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method3445() {
		for (@Pc(11) int local11 = 0; local11 < Static148.anInt3844; local11++) {
			@Pc(17) int local17 = Static113.anIntArray361[local11];
			@Pc(21) Class2_Sub1_Sub1_Sub3_Sub1 local21 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local17];
			@Pc(27) int local27 = Static139.aClass2_Sub3_Sub1_32.method218();
			if ((local27 & 0x1) != 0) {
				local27 += Static139.aClass2_Sub3_Sub1_32.method218() << 8;
			}
			Static114.method2497(local27, local21, local17);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
	public static boolean method3446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static198.anInt4664; local1++) {
			@Pc(6) Class38 local6 = Static9.aClass38Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2385 == 1) {
				local15 = local6.anInt2369 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2368 + (local6.anInt2386 * local15 >> 8);
					local37 = local6.anInt2382 + (local6.anInt2375 * local15 >> 8);
					local47 = local6.anInt2367 + (local6.anInt2380 * local15 >> 8);
					local57 = local6.anInt2390 + (local6.anInt2388 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2385 == 2) {
				local15 = arg0 - local6.anInt2369;
				if (local15 > 0) {
					local27 = local6.anInt2368 + (local6.anInt2386 * local15 >> 8);
					local37 = local6.anInt2382 + (local6.anInt2375 * local15 >> 8);
					local47 = local6.anInt2367 + (local6.anInt2380 * local15 >> 8);
					local57 = local6.anInt2390 + (local6.anInt2388 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2385 == 3) {
				local15 = local6.anInt2368 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2369 + (local6.anInt2372 * local15 >> 8);
					local37 = local6.anInt2374 + (local6.anInt2384 * local15 >> 8);
					local47 = local6.anInt2367 + (local6.anInt2380 * local15 >> 8);
					local57 = local6.anInt2390 + (local6.anInt2388 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2385 == 4) {
				local15 = arg2 - local6.anInt2368;
				if (local15 > 0) {
					local27 = local6.anInt2369 + (local6.anInt2372 * local15 >> 8);
					local37 = local6.anInt2374 + (local6.anInt2384 * local15 >> 8);
					local47 = local6.anInt2367 + (local6.anInt2380 * local15 >> 8);
					local57 = local6.anInt2390 + (local6.anInt2388 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2385 == 5) {
				local15 = arg1 - local6.anInt2367;
				if (local15 > 0) {
					local27 = local6.anInt2369 + (local6.anInt2372 * local15 >> 8);
					local37 = local6.anInt2374 + (local6.anInt2384 * local15 >> 8);
					local47 = local6.anInt2368 + (local6.anInt2386 * local15 >> 8);
					local57 = local6.anInt2382 + (local6.anInt2375 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
