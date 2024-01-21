import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!s", name = "Ab", descriptor = "Lclient!dd;")
	public static Class14 aClass14_25;

	@OriginalMember(owner = "client!s", name = "Tb", descriptor = "Lclient!dd;")
	public static Class14 aClass14_26;

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
	public static int anInt2431 = 1;

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1141 = Static56.method816("l");

	@OriginalMember(owner = "client!s", name = "vb", descriptor = "Lclient!lf;")
	public static Class48 aClass48_48 = new Class48(64);

	@OriginalMember(owner = "client!s", name = "Gb", descriptor = "I")
	public static int anInt2450 = 0;

	@OriginalMember(owner = "client!s", name = "Mb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1143 = Static56.method816("<)4col> x");

	@OriginalMember(owner = "client!s", name = "Ob", descriptor = "Lclient!ud;")
	public static Class8_Sub20_Sub1 aClass8_Sub20_Sub1_3 = new Class8_Sub20_Sub1(5000);

	@OriginalMember(owner = "client!s", name = "Qb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1144 = Static56.method816(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!s", name = "Rb", descriptor = "I")
	public static int anInt2455 = 0;

	@OriginalMember(owner = "client!s", name = "Ub", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1146 = Static56.method816(" more options");

	@OriginalMember(owner = "client!s", name = "Sb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1145 = aClass34_1146;

	@OriginalMember(owner = "client!s", name = "Vb", descriptor = "I")
	public static int anInt2456 = 0;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public static void method1496() {
		@Pc(1) Class36 local1 = Static125.aClass36_1;
		synchronized (Static125.aClass36_1) {
			Static134.anInt3170 = Static118.anInt2651;
			Static14.anInt366 = Static82.anInt1970;
			Static121.anInt2909 = Static29.anInt836;
			Static39.anInt964 = Static103.anInt2370;
			Static3.anInt51 = Static123.anInt2931;
			Static74.anInt1781 = Static40.anInt975;
			Static123.aLong98 = Static123.aLong97;
			Static103.anInt2370 = 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!u;I)V")
	public static void method1497(@OriginalArg(0) Class8_Sub19 arg0) {
		@Pc(4) Object[] local4 = arg0.anObjectArray3;
		@Pc(14) int local14 = (Integer) local4[0];
		@Pc(20) Class8_Sub1_Sub2 local20 = Static2.method9(local14);
		if (local20 == null) {
			return;
		}
		@Pc(25) int local25 = 0;
		Static104.anInt2389 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = -1;
		@Pc(34) int[] local34 = local20.anIntArray25;
		@Pc(36) byte local36 = -1;
		@Pc(47) int[] local47 = local20.anIntArray28;
		@Pc(61) int local61;
		@Pc(99) int local99;
		try {
			Static100.anIntArray324 = new int[local20.anInt222];
			Static52.aClass34Array10 = new Class34[local20.anInt227];
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			for (local61 = 1; local61 < local4.length; local61++) {
				if (local4[local61] instanceof Integer) {
					local99 = (Integer) local4[local61];
					if (local99 == -2147483647) {
						local99 = arg0.anInt2644;
					}
					if (local99 == -2147483646) {
						local99 = arg0.anInt2650;
					}
					if (local99 == -2147483645) {
						local99 = arg0.aClass8_Sub24_13 == null ? -1 : arg0.aClass8_Sub24_13.anInt3124;
					}
					if (local99 == -2147483644) {
						local99 = arg0.anInt2653;
					}
					if (local99 == -2147483643) {
						local99 = arg0.aClass8_Sub24_13 == null ? -1 : arg0.aClass8_Sub24_13.anInt3122;
					}
					if (local99 == -2147483642) {
						local99 = arg0.aClass8_Sub24_12 == null ? -1 : arg0.aClass8_Sub24_12.anInt3124;
					}
					if (local99 == -2147483641) {
						local99 = arg0.aClass8_Sub24_12 == null ? -1 : arg0.aClass8_Sub24_12.anInt3122;
					}
					if (local99 == -2147483640) {
						local99 = arg0.anInt2649;
					}
					if (local99 == -2147483639) {
						local99 = arg0.anInt2652;
					}
					Static100.anIntArray324[local59++] = local99;
				} else if (local4[local61] instanceof Class34) {
					@Pc(78) Class34 local78 = (Class34) local4[local61];
					if (local78.method804(Static96.aClass34_284)) {
						local78 = arg0.aClass34_1240;
					}
					Static52.aClass34Array10[local57++] = local78;
				}
			}
			local99 = 0;
			label1973: while (true) {
				local99++;
				if (local99 > 200000) {
					throw new RuntimeException("slow");
				}
				local31++;
				@Pc(223) int local223 = local34[local31];
				@Pc(792) int local792;
				@Pc(787) int local787;
				@Pc(641) int local641;
				@Pc(601) Class34 local601;
				@Pc(666) int local666;
				if (local223 < 100) {
					if (local223 == 0) {
						Static75.anIntArray230[local25++] = local47[local31];
						continue;
					}
					@Pc(249) int local249;
					if (local223 == 1) {
						local249 = local47[local31];
						Static75.anIntArray230[local25++] = Static78.anIntArray238[local249];
						continue;
					}
					if (local223 == 2) {
						local249 = local47[local31];
						local25--;
						Static78.anIntArray238[local249] = Static75.anIntArray230[local25];
						continue;
					}
					if (local223 == 3) {
						Static132.aClass34Array23[local29++] = local20.aClass34Array4[local31];
						continue;
					}
					if (local223 == 6) {
						local31 += local47[local31];
						continue;
					}
					if (local223 == 7) {
						local25 -= 2;
						if (Static75.anIntArray230[local25] != Static75.anIntArray230[local25 + 1]) {
							local31 += local47[local31];
						}
						continue;
					}
					if (local223 == 8) {
						local25 -= 2;
						if (Static75.anIntArray230[local25] == Static75.anIntArray230[local25 + 1]) {
							local31 += local47[local31];
						}
						continue;
					}
					if (local223 == 9) {
						local25 -= 2;
						if (Static75.anIntArray230[local25] < Static75.anIntArray230[local25 + 1]) {
							local31 += local47[local31];
						}
						continue;
					}
					if (local223 == 10) {
						local25 -= 2;
						if (Static75.anIntArray230[local25] > Static75.anIntArray230[local25 + 1]) {
							local31 += local47[local31];
						}
						continue;
					}
					if (local223 == 21) {
						if (Static104.anInt2389 == 0) {
							return;
						}
						@Pc(410) Class77 local410 = Static128.aClass77Array1[--Static104.anInt2389];
						Static52.aClass34Array10 = local410.aClass34Array21;
						local31 = local410.anInt2735;
						local20 = local410.aClass8_Sub1_Sub2_1;
						local34 = local20.anIntArray25;
						Static100.anIntArray324 = local410.anIntArray384;
						local47 = local20.anIntArray28;
						continue;
					}
					if (local223 == 25) {
						local249 = local47[local31];
						Static75.anIntArray230[local25++] = Static23.method423(local249);
						continue;
					}
					if (local223 == 27) {
						local249 = local47[local31];
						local25--;
						Static96.method339(Static75.anIntArray230[local25], local249);
						continue;
					}
					if (local223 == 31) {
						local25 -= 2;
						if (Static75.anIntArray230[local25] <= Static75.anIntArray230[local25 + 1]) {
							local31 += local47[local31];
						}
						continue;
					}
					if (local223 == 32) {
						local25 -= 2;
						if (Static75.anIntArray230[local25 + 1] <= Static75.anIntArray230[local25]) {
							local31 += local47[local31];
						}
						continue;
					}
					if (local223 == 33) {
						Static75.anIntArray230[local25++] = Static100.anIntArray324[local47[local31]];
						continue;
					}
					@Pc(543) int local543;
					if (local223 == 34) {
						local543 = local47[local31];
						local25--;
						Static100.anIntArray324[local543] = Static75.anIntArray230[local25];
						continue;
					}
					if (local223 == 35) {
						Static132.aClass34Array23[local29++] = Static52.aClass34Array10[local47[local31]];
						continue;
					}
					if (local223 == 36) {
						local543 = local47[local31];
						local29--;
						Static52.aClass34Array10[local543] = Static132.aClass34Array23[local29];
						continue;
					}
					if (local223 == 37) {
						local249 = local47[local31];
						local29 -= local249;
						local601 = Static30.method524(local29, local249, Static132.aClass34Array23);
						Static132.aClass34Array23[local29++] = local601;
						continue;
					}
					if (local223 == 38) {
						local25--;
						continue;
					}
					if (local223 == 39) {
						local29--;
						continue;
					}
					if (local223 == 40) {
						local249 = local47[local31];
						@Pc(631) Class8_Sub1_Sub2 local631 = Static2.method9(local249);
						@Pc(635) Class34[] local635 = new Class34[local631.anInt227];
						@Pc(639) int[] local639 = new int[local631.anInt222];
						for (local641 = 0; local641 < local631.anInt224; local641++) {
							local639[local641] = Static75.anIntArray230[local641 + local25 - local631.anInt224];
						}
						for (local666 = 0; local666 < local631.anInt228; local666++) {
							local635[local666] = Static132.aClass34Array23[local29 + local666 - local631.anInt228];
						}
						local25 -= local631.anInt224;
						local29 -= local631.anInt228;
						@Pc(704) Class77 local704 = new Class77();
						local704.anIntArray384 = Static100.anIntArray324;
						local704.aClass8_Sub1_Sub2_1 = local20;
						local704.anInt2735 = local31;
						local704.aClass34Array21 = Static52.aClass34Array10;
						local31 = -1;
						Static128.aClass77Array1[Static104.anInt2389++] = local704;
						Static52.aClass34Array10 = local635;
						local20 = local631;
						Static100.anIntArray324 = local639;
						local47 = local631.anIntArray28;
						local34 = local631.anIntArray25;
						continue;
					}
					if (local223 == 42) {
						Static75.anIntArray230[local25++] = Static129.anIntArray403[local47[local31]];
						continue;
					}
					if (local223 == 43) {
						local543 = local47[local31];
						local25--;
						Static129.anIntArray403[local543] = Static75.anIntArray230[local25];
						continue;
					}
					if (local223 == 44) {
						local249 = local47[local31] >> 16;
						local787 = local47[local31] & 0xFFFF;
						local25--;
						local792 = Static75.anIntArray230[local25];
						if (local792 >= 0 && local792 <= 5000) {
							Static10.anIntArray27[local249] = local792;
							@Pc(807) byte local807 = -1;
							if (local787 == 105) {
								local807 = 0;
							}
							local641 = 0;
							while (true) {
								if (local792 <= local641) {
									continue label1973;
								}
								Static27.anIntArrayArray7[local249][local641] = local807;
								local641++;
							}
						}
						throw new RuntimeException();
					}
					if (local223 == 45) {
						local249 = local47[local31];
						local25--;
						local787 = Static75.anIntArray230[local25];
						if (local787 >= 0 && local787 < Static10.anIntArray27[local249]) {
							Static75.anIntArray230[local25++] = Static27.anIntArrayArray7[local249][local787];
							continue;
						}
						throw new RuntimeException();
					}
					if (local223 == 46) {
						local249 = local47[local31];
						local25 -= 2;
						local787 = Static75.anIntArray230[local25];
						if (local787 >= 0 && Static10.anIntArray27[local249] > local787) {
							Static27.anIntArrayArray7[local249][local787] = Static75.anIntArray230[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local223 == 47) {
						@Pc(917) Class34 local917 = Static17.aClass34Array6[local47[local31]];
						if (local917 == null) {
							local917 = Static69.aClass34_783;
						}
						Static132.aClass34Array23[local29++] = local917;
						continue;
					}
					if (local223 == 48) {
						local543 = local47[local31];
						local29--;
						Static17.aClass34Array6[local543] = Static132.aClass34Array23[local29];
						continue;
					}
				}
				@Pc(949) boolean local949;
				if (local47[local31] == 1) {
					local949 = true;
				} else {
					local949 = false;
				}
				@Pc(987) Class8_Sub24 local987;
				@Pc(1650) int local1650;
				@Pc(3062) int local3062;
				@Pc(2433) Class8_Sub24 local2433;
				@Pc(2406) Class8_Sub24 local2406;
				if (local223 < 1000) {
					if (local223 == 100) {
						local25 -= 3;
						local787 = Static75.anIntArray230[local25];
						local1650 = Static75.anIntArray230[local25 + 2];
						local792 = Static75.anIntArray230[local25 + 1];
						if (local792 == 0) {
							throw new RuntimeException();
						}
						local2406 = Static113.method1614(local787);
						if (local2406.aClass8_Sub24Array2 == null) {
							local2406.aClass8_Sub24Array2 = new Class8_Sub24[local1650 + 1];
						}
						if (local2406.aClass8_Sub24Array2.length <= local1650) {
							@Pc(7000) Class8_Sub24[] local7000 = new Class8_Sub24[local1650 + 1];
							for (local3062 = 0; local3062 < local2406.aClass8_Sub24Array2.length; local3062++) {
								local7000[local3062] = local2406.aClass8_Sub24Array2[local3062];
							}
							local2406.aClass8_Sub24Array2 = local7000;
						}
						if (local1650 > 0 && local2406.aClass8_Sub24Array2[local1650 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1650 - 1));
						}
						@Pc(7053) Class8_Sub24 local7053 = new Class8_Sub24();
						local7053.aBoolean117 = true;
						local7053.anInt3122 = local1650;
						local7053.anInt3166 = local7053.anInt3124 = local2406.anInt3124;
						local7053.anInt3145 = local792;
						local2406.aClass8_Sub24Array2[local1650] = local7053;
						if (local949) {
							Static83.aClass8_Sub24_6 = local7053;
						} else {
							Static116.aClass8_Sub24_11 = local7053;
						}
						Static40.method608(local2406);
						continue;
					}
					if (local223 == 101) {
						local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
						@Pc(7103) Class8_Sub24 local7103 = Static113.method1614(local987.anInt3124);
						local7103.aClass8_Sub24Array2[local987.anInt3122] = null;
						Static40.method608(local7103);
						continue;
					}
					if (local223 == 102) {
						local25--;
						local987 = Static113.method1614(Static75.anIntArray230[local25]);
						local987.aClass8_Sub24Array2 = null;
						Static40.method608(local987);
						continue;
					}
					if (local223 == 200) {
						local25 -= 2;
						local787 = Static75.anIntArray230[local25];
						local792 = Static75.anIntArray230[local25 + 1];
						local2433 = Static69.method1044(local787, local792);
						if (local2433 != null && local792 != -1) {
							Static75.anIntArray230[local25++] = 1;
							if (local949) {
								Static83.aClass8_Sub24_6 = local2433;
							} else {
								Static116.aClass8_Sub24_11 = local2433;
							}
							continue;
						}
						Static75.anIntArray230[local25++] = 0;
						continue;
					}
				} else if (local223 >= 1000 && local223 < 1100 || local223 >= 2000 && local223 < 2100) {
					if (local223 < 2000) {
						local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
					} else {
						local223 -= 1000;
						local25--;
						local987 = Static113.method1614(Static75.anIntArray230[local25]);
					}
					if (local223 == 1000) {
						local25 -= 2;
						local987.anInt3093 = Static75.anIntArray230[local25];
						local987.anInt3107 = Static75.anIntArray230[local25 + 1];
						Static40.method608(local987);
						continue;
					}
					if (local223 == 1001) {
						local25 -= 2;
						local987.anInt3154 = Static75.anIntArray230[local25];
						local987.anInt3111 = Static75.anIntArray230[local25 + 1];
						Static40.method608(local987);
						continue;
					}
					if (local223 == 1003) {
						local25--;
						@Pc(1058) boolean local1058 = Static75.anIntArray230[local25] == 1;
						if (local1058 != local987.aBoolean119) {
							local987.aBoolean119 = local1058;
							Static40.method608(local987);
						}
						continue;
					}
				} else {
					@Pc(1422) Class34 local1422;
					if (local223 >= 1100 && local223 < 1200 || local223 >= 2100 && local223 < 2200) {
						if (local223 >= 2000) {
							local223 -= 1000;
							local25--;
							local987 = Static113.method1614(Static75.anIntArray230[local25]);
						} else {
							local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
						}
						if (local223 == 1100) {
							local25 -= 2;
							local987.anInt3115 = Static75.anIntArray230[local25];
							if (local987.anInt3115 > local987.anInt3109 - local987.anInt3154) {
								local987.anInt3115 = local987.anInt3109 - local987.anInt3154;
							}
							if (local987.anInt3115 < 0) {
								local987.anInt3115 = 0;
							}
							local987.anInt3103 = Static75.anIntArray230[local25 + 1];
							if (local987.anInt3151 - local987.anInt3111 < local987.anInt3103) {
								local987.anInt3103 = local987.anInt3151 - local987.anInt3111;
							}
							if (local987.anInt3103 < 0) {
								local987.anInt3103 = 0;
							}
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1101) {
							local25--;
							local987.anInt3110 = Static75.anIntArray230[local25];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1102) {
							local25--;
							local987.aBoolean123 = Static75.anIntArray230[local25] == 1;
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1103) {
							local25--;
							local987.anInt3106 = Static75.anIntArray230[local25];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1104) {
							local25--;
							local987.anInt3162 = Static75.anIntArray230[local25];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1105) {
							local25--;
							local987.anInt3138 = Static75.anIntArray230[local25];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1106) {
							local25--;
							local987.anInt3152 = Static75.anIntArray230[local25];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1107) {
							local25--;
							local987.aBoolean122 = Static75.anIntArray230[local25] == 1;
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1108) {
							local987.anInt3116 = 1;
							local25--;
							local987.anInt3133 = Static75.anIntArray230[local25];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1109) {
							local25 -= 6;
							local987.anInt3148 = Static75.anIntArray230[local25];
							local987.anInt3129 = Static75.anIntArray230[local25 + 1];
							local987.anInt3101 = Static75.anIntArray230[local25 + 2];
							local987.anInt3160 = Static75.anIntArray230[local25 + 3];
							local987.anInt3098 = Static75.anIntArray230[local25 + 4];
							local987.anInt3095 = Static75.anIntArray230[local25 + 5];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1110) {
							local25--;
							local792 = Static75.anIntArray230[local25];
							if (local987.anInt3144 != local792) {
								local987.anInt3144 = local792;
								local987.anInt3158 = 0;
								local987.anInt3147 = 0;
								Static40.method608(local987);
							}
							continue;
						}
						if (local223 == 1111) {
							local25--;
							local987.aBoolean121 = Static75.anIntArray230[local25] == 1;
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1112) {
							local29--;
							local1422 = Static132.aClass34Array23[local29];
							if (!local1422.method804(local987.aClass34_1437)) {
								local987.aClass34_1437 = local1422;
								Static40.method608(local987);
							}
							continue;
						}
						if (local223 == 1113) {
							local25--;
							local987.anInt3126 = Static75.anIntArray230[local25];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1114) {
							local25 -= 3;
							local987.anInt3132 = Static75.anIntArray230[local25];
							local987.anInt3121 = Static75.anIntArray230[local25 + 1];
							local987.anInt3149 = Static75.anIntArray230[local25 + 2];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1115) {
							local25--;
							local987.aBoolean113 = Static75.anIntArray230[local25] == 1;
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1116) {
							local25--;
							local987.anInt3141 = Static75.anIntArray230[local25];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1117) {
							local25--;
							local987.anInt3150 = Static75.anIntArray230[local25];
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1118) {
							local25--;
							local987.aBoolean120 = Static75.anIntArray230[local25] == 1;
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1119) {
							local25--;
							local987.aBoolean114 = Static75.anIntArray230[local25] == 1;
							Static40.method608(local987);
							continue;
						}
						if (local223 == 1120) {
							local25 -= 2;
							local987.anInt3109 = Static75.anIntArray230[local25];
							local987.anInt3151 = Static75.anIntArray230[local25 + 1];
							Static40.method608(local987);
							continue;
						}
					} else if (local223 >= 1200 && local223 < 1300 || !(local223 < 2200 || local223 >= 2300)) {
						if (local223 >= 2000) {
							local223 -= 1000;
							local25--;
							local987 = Static113.method1614(Static75.anIntArray230[local25]);
						} else {
							local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
						}
						Static40.method608(local987);
						if (local223 == 1200) {
							local25 -= 2;
							local792 = Static75.anIntArray230[local25];
							local1650 = Static75.anIntArray230[local25 + 1];
							local987.anInt3146 = local1650;
							local987.anInt3131 = local792;
							@Pc(1662) Class8_Sub1_Sub13 local1662 = Static7.method49(local792);
							local987.anInt3095 = local1662.anInt1727;
							local987.anInt3160 = local1662.anInt1766;
							if (local987.anInt3154 > 0) {
								local987.anInt3095 = local987.anInt3095 * 32 / local987.anInt3154;
							}
							local987.anInt3129 = local1662.anInt1757;
							local987.anInt3148 = local1662.anInt1758;
							local987.anInt3098 = local1662.anInt1767;
							local987.anInt3101 = local1662.anInt1733;
							continue;
						}
						if (local223 == 1201) {
							local987.anInt3116 = 2;
							local25--;
							local987.anInt3133 = Static75.anIntArray230[local25];
							continue;
						}
						if (local223 == 1202) {
							local987.anInt3116 = 3;
							local987.anInt3133 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass52_1.method1205();
							continue;
						}
					} else if (local223 >= 1300 && local223 < 1400 || local223 >= 2300 && local223 < 2400) {
						if (local223 >= 2000) {
							local223 -= 1000;
							local25--;
							local987 = Static113.method1614(Static75.anIntArray230[local25]);
						} else {
							local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
						}
						if (local223 == 1300) {
							local25--;
							local792 = Static75.anIntArray230[local25] - 1;
							if (local792 >= 0 && local792 <= 9) {
								local29--;
								local987.method2020(Static132.aClass34Array23[local29], local792);
								continue;
							}
							local29--;
							continue;
						}
						if (local223 == 1301) {
							local25 -= 2;
							local1650 = Static75.anIntArray230[local25 + 1];
							local792 = Static75.anIntArray230[local25];
							local987.aClass8_Sub24_16 = Static69.method1044(local792, local1650);
							continue;
						}
						if (local223 == 1302) {
							local25--;
							local987.aBoolean118 = Static75.anIntArray230[local25] == 1;
							continue;
						}
						if (local223 == 1303) {
							local25--;
							local987.anInt3113 = Static75.anIntArray230[local25];
							continue;
						}
						if (local223 == 1304) {
							local25--;
							local987.anInt3097 = Static75.anIntArray230[local25];
							continue;
						}
						if (local223 == 1305) {
							local29--;
							local987.aClass34_1435 = Static132.aClass34Array23[local29];
							continue;
						}
						if (local223 == 1306) {
							local29--;
							local987.aClass34_1439 = Static132.aClass34Array23[local29];
							continue;
						}
						if (local223 == 1307) {
							local987.aClass34Array25 = null;
							continue;
						}
					} else {
						if (local223 >= 1400 && local223 < 1500 || local223 >= 2400 && local223 < 2500) {
							if (local223 < 2000) {
								local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
							} else {
								local223 -= 1000;
								local25--;
								local987 = Static113.method1614(Static75.anIntArray230[local25]);
							}
							local29--;
							local1422 = Static132.aClass34Array23[local29];
							@Pc(6485) int[] local6485 = null;
							if (local1422.method820() > 0 && local1422.method808(local1422.method820() - 1) == 89) {
								local25--;
								local641 = Static75.anIntArray230[local25];
								if (local641 > 0) {
									local6485 = new int[local641];
									while (local641-- > 0) {
										local25--;
										local6485[local641] = Static75.anIntArray230[local25];
									}
								}
								local1422 = local1422.method810(local1422.method820() - 1, 0);
							}
							@Pc(6546) Object[] local6546 = new Object[local1422.method820() + 1];
							for (local666 = local6546.length - 1; local666 >= 1; local666--) {
								if (local1422.method808(local666 - 1) == 115) {
									local29--;
									local6546[local666] = Static132.aClass34Array23[local29];
								} else {
									local25--;
									local6546[local666] = Integer.valueOf(Static75.anIntArray230[local25]);
								}
							}
							local25--;
							local3062 = Static75.anIntArray230[local25];
							if (local3062 == -1) {
								local6546 = null;
							} else {
								local6546[0] = Integer.valueOf(local3062);
							}
							if (local223 == 1408) {
								local987.anObjectArray12 = local6546;
							}
							local987.aBoolean112 = true;
							if (local223 == 1423) {
								local987.anObjectArray25 = local6546;
							}
							if (local223 == 1422) {
								local987.anObjectArray8 = local6546;
							}
							if (local223 == 1405) {
								local987.anObjectArray23 = local6546;
							}
							if (local223 == 1420) {
								local987.anObjectArray18 = local6546;
							}
							if (local223 == 1424) {
								local987.anObjectArray14 = local6546;
							}
							if (local223 == 1419) {
								local987.anObjectArray13 = local6546;
							}
							if (local223 == 1414) {
								local987.anObjectArray20 = local6546;
								local987.anIntArray413 = local6485;
							}
							if (local223 == 1401) {
								local987.anObjectArray21 = local6546;
							}
							if (local223 == 1400) {
								local987.anObjectArray5 = local6546;
							}
							if (local223 == 1418) {
								local987.anObjectArray24 = local6546;
							}
							if (local223 == 1410) {
								local987.anObjectArray26 = local6546;
							}
							if (local223 == 1402) {
								local987.anObjectArray15 = local6546;
							}
							if (local223 == 1421) {
								local987.anObjectArray22 = local6546;
							}
							if (local223 == 1416) {
								local987.anObjectArray7 = local6546;
							}
							if (local223 == 1412) {
								local987.anObjectArray4 = local6546;
							}
							if (local223 == 1403) {
								local987.anObjectArray28 = local6546;
							}
							if (local223 == 1406) {
								local987.anObjectArray6 = local6546;
							}
							if (local223 == 1409) {
								local987.anObjectArray10 = local6546;
							}
							if (local223 == 1415) {
								local987.anIntArray417 = local6485;
								local987.anObjectArray11 = local6546;
							}
							if (local223 == 1407) {
								local987.anIntArray411 = local6485;
								local987.anObjectArray9 = local6546;
							}
							if (local223 == 1417) {
								local987.anObjectArray19 = local6546;
							}
							if (local223 == 1411) {
								local987.anObjectArray17 = local6546;
							}
							if (local223 == 1404) {
								local987.anObjectArray16 = local6546;
							}
							continue;
						}
						if (local223 < 1600) {
							local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
							if (local223 == 1500) {
								Static75.anIntArray230[local25++] = local987.anInt3093;
								continue;
							}
							if (local223 == 1501) {
								Static75.anIntArray230[local25++] = local987.anInt3107;
								continue;
							}
							if (local223 == 1502) {
								Static75.anIntArray230[local25++] = local987.anInt3154;
								continue;
							}
							if (local223 == 1503) {
								Static75.anIntArray230[local25++] = local987.anInt3111;
								continue;
							}
							if (local223 == 1504) {
								Static75.anIntArray230[local25++] = local987.aBoolean119 ? 1 : 0;
								continue;
							}
							if (local223 == 1505) {
								Static75.anIntArray230[local25++] = local987.anInt3166;
								continue;
							}
						} else if (local223 < 1700) {
							local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
							if (local223 == 1600) {
								Static75.anIntArray230[local25++] = local987.anInt3115;
								continue;
							}
							if (local223 == 1601) {
								Static75.anIntArray230[local25++] = local987.anInt3103;
								continue;
							}
							if (local223 == 1602) {
								Static132.aClass34Array23[local29++] = local987.aClass34_1437;
								continue;
							}
							if (local223 == 1603) {
								Static75.anIntArray230[local25++] = local987.anInt3109;
								continue;
							}
							if (local223 == 1604) {
								Static75.anIntArray230[local25++] = local987.anInt3151;
								continue;
							}
							if (local223 == 1605) {
								Static75.anIntArray230[local25++] = local987.anInt3095;
								continue;
							}
							if (local223 == 1606) {
								Static75.anIntArray230[local25++] = local987.anInt3101;
								continue;
							}
							if (local223 == 1607) {
								Static75.anIntArray230[local25++] = local987.anInt3098;
								continue;
							}
							if (local223 == 1608) {
								Static75.anIntArray230[local25++] = local987.anInt3160;
								continue;
							}
						} else if (local223 < 1800) {
							local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
							if (local223 == 1700) {
								Static75.anIntArray230[local25++] = local987.anInt3131;
								continue;
							}
							if (local223 == 1701) {
								if (local987.anInt3131 == -1) {
									Static75.anIntArray230[local25++] = 0;
								} else {
									Static75.anIntArray230[local25++] = local987.anInt3146;
								}
								continue;
							}
							if (local223 == 1702) {
								Static75.anIntArray230[local25++] = local987.anInt3122;
								continue;
							}
						} else if (local223 < 1900) {
							local987 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
							if (local223 == 1800) {
								Static75.anIntArray230[local25++] = Static47.method735(Static99.method1445(local987));
								continue;
							}
							if (local223 == 1801) {
								local25--;
								local792 = Static75.anIntArray230[local25];
								local792--;
								if (local987.aClass34Array25 != null && local987.aClass34Array25.length > local792 && local987.aClass34Array25[local792] != null) {
									Static132.aClass34Array23[local29++] = local987.aClass34Array25[local792];
									continue;
								}
								Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								continue;
							}
							if (local223 == 1802) {
								if (local987.aClass34_1435 == null) {
									Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								} else {
									Static132.aClass34Array23[local29++] = local987.aClass34_1435;
								}
								continue;
							}
						} else if (local223 < 2600) {
							local25--;
							local987 = Static113.method1614(Static75.anIntArray230[local25]);
							if (local223 == 2500) {
								Static75.anIntArray230[local25++] = local987.anInt3093;
								continue;
							}
							if (local223 == 2501) {
								Static75.anIntArray230[local25++] = local987.anInt3107;
								continue;
							}
							if (local223 == 2502) {
								Static75.anIntArray230[local25++] = local987.anInt3154;
								continue;
							}
							if (local223 == 2503) {
								Static75.anIntArray230[local25++] = local987.anInt3111;
								continue;
							}
							if (local223 == 2504) {
								Static75.anIntArray230[local25++] = local987.aBoolean119 ? 1 : 0;
								continue;
							}
							if (local223 == 2505) {
								Static75.anIntArray230[local25++] = local987.anInt3166;
								continue;
							}
						} else if (local223 < 2700) {
							local25--;
							local987 = Static113.method1614(Static75.anIntArray230[local25]);
							if (local223 == 2600) {
								Static75.anIntArray230[local25++] = local987.anInt3115;
								continue;
							}
							if (local223 == 2601) {
								Static75.anIntArray230[local25++] = local987.anInt3103;
								continue;
							}
							if (local223 == 2602) {
								Static132.aClass34Array23[local29++] = local987.aClass34_1437;
								continue;
							}
							if (local223 == 2603) {
								Static75.anIntArray230[local25++] = local987.anInt3109;
								continue;
							}
							if (local223 == 2604) {
								Static75.anIntArray230[local25++] = local987.anInt3151;
								continue;
							}
							if (local223 == 2605) {
								Static75.anIntArray230[local25++] = local987.anInt3095;
								continue;
							}
							if (local223 == 2606) {
								Static75.anIntArray230[local25++] = local987.anInt3101;
								continue;
							}
							if (local223 == 2607) {
								Static75.anIntArray230[local25++] = local987.anInt3098;
								continue;
							}
							if (local223 == 2608) {
								Static75.anIntArray230[local25++] = local987.anInt3160;
								continue;
							}
						} else if (local223 < 2800) {
							if (local223 == 2700) {
								local25--;
								local987 = Static113.method1614(Static75.anIntArray230[local25]);
								Static75.anIntArray230[local25++] = local987.anInt3131;
								continue;
							}
							if (local223 == 2701) {
								local25--;
								local987 = Static113.method1614(Static75.anIntArray230[local25]);
								if (local987.anInt3131 == -1) {
									Static75.anIntArray230[local25++] = 0;
								} else {
									Static75.anIntArray230[local25++] = local987.anInt3146;
								}
								continue;
							}
							if (local223 == 2702) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								@Pc(2113) Class8_Sub7 local2113 = (Class8_Sub7) Static31.aClass7_3.method45((long) local787);
								if (local2113 == null) {
									Static75.anIntArray230[local25++] = 0;
								} else {
									Static75.anIntArray230[local25++] = 1;
								}
								continue;
							}
						} else if (local223 < 2900) {
							local25--;
							local987 = Static113.method1614(Static75.anIntArray230[local25]);
							if (local223 == 2800) {
								Static75.anIntArray230[local25++] = Static47.method735(Static99.method1445(local987));
								continue;
							}
							if (local223 == 2801) {
								local25--;
								local792 = Static75.anIntArray230[local25];
								local792--;
								if (local987.aClass34Array25 != null && local792 < local987.aClass34Array25.length && local987.aClass34Array25[local792] != null) {
									Static132.aClass34Array23[local29++] = local987.aClass34Array25[local792];
									continue;
								}
								Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								continue;
							}
							if (local223 == 2802) {
								if (local987.aClass34_1435 == null) {
									Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								} else {
									Static132.aClass34Array23[local29++] = local987.aClass34_1435;
								}
								continue;
							}
						} else if (local223 < 3200) {
							if (local223 == 3100) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static108.method1530(local601, Static95.aClass34_1051, 0);
								continue;
							}
							if (local223 == 3101) {
								local25 -= 2;
								Static107.method1513(Static75.anIntArray230[local25], Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1, Static75.anIntArray230[local25 + 1]);
								continue;
							}
							if (local223 == 3103) {
								Static54.method782();
								continue;
							}
							if (local223 == 3104) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local792 = 0;
								if (local601.method838()) {
									local792 = local601.method823();
								}
								aClass8_Sub20_Sub1_3.method1907(40);
								aClass8_Sub20_Sub1_3.method1873(local792);
								continue;
							}
							if (local223 == 3105) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								aClass8_Sub20_Sub1_3.method1907(134);
								aClass8_Sub20_Sub1_3.method1879(local601.method830());
								continue;
							}
							if (local223 == 3106) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								aClass8_Sub20_Sub1_3.method1907(50);
								aClass8_Sub20_Sub1_3.method1883(local601.method820() + 1);
								aClass8_Sub20_Sub1_3.method1865(local601);
								continue;
							}
							if (local223 == 3107) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								local29--;
								local1422 = Static132.aClass34Array23[local29];
								Static109.method1536(local787, local1422);
								continue;
							}
							if (local223 == 3108) {
								local25 -= 3;
								local792 = Static75.anIntArray230[local25 + 1];
								local1650 = Static75.anIntArray230[local25 + 2];
								local787 = Static75.anIntArray230[local25];
								local2406 = Static113.method1614(local1650);
								Static132.method1838(local2406, local792, local787);
								continue;
							}
							if (local223 == 3109) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								local2433 = local949 ? Static83.aClass8_Sub24_6 : Static116.aClass8_Sub24_11;
								Static132.method1838(local2433, local792, local787);
								continue;
							}
						} else if (local223 < 3300) {
							if (local223 == 3200) {
								local25 -= 3;
								Static8.method93(Static75.anIntArray230[local25 + 1], Static75.anIntArray230[local25], Static75.anIntArray230[local25 + 2]);
								continue;
							}
							if (local223 == 3201) {
								local25--;
								Static32.method537(Static75.anIntArray230[local25]);
								continue;
							}
							if (local223 == 3202) {
								local25 -= 2;
								Static120.method1898(Static75.anIntArray230[local25], Static75.anIntArray230[local25 + 1]);
								continue;
							}
						} else if (local223 < 3400) {
							if (local223 == 3300) {
								Static75.anIntArray230[local25++] = Static21.anInt655;
								continue;
							}
							if (local223 == 3301) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = Static59.method928(local792, local787);
								continue;
							}
							if (local223 == 3302) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = Static24.method1152(local787, local792);
								continue;
							}
							if (local223 == 3303) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = Static59.method929(local792, local787);
								continue;
							}
							if (local223 == 3304) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static50.method750(local787).anInt2334;
								continue;
							}
							if (local223 == 3305) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static92.anIntArray306[local787];
								continue;
							}
							if (local223 == 3306) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static117.anIntArray362[local787];
								continue;
							}
							if (local223 == 3307) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static84.anIntArray270[local787];
								continue;
							}
							if (local223 == 3308) {
								local787 = Static42.anInt1024;
								local1650 = Static64.anInt2062 + (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 >> 7);
								local792 = (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 >> 7) + Static82.anInt1959;
								Static75.anIntArray230[local25++] = (local792 << 14) + (local787 << 28) + local1650;
								continue;
							}
							if (local223 == 3309) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = local787 >> 14 & 0x3FFF;
								continue;
							}
							if (local223 == 3310) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = local787 >> 28;
								continue;
							}
							if (local223 == 3311) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = local787 & 0x3FFF;
								continue;
							}
							if (local223 == 3312) {
								Static75.anIntArray230[local25++] = Static16.aBoolean19 ? 1 : 0;
								continue;
							}
							if (local223 == 3313) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25] + 32768;
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = Static59.method928(local792, local787);
								continue;
							}
							if (local223 == 3314) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25] + 32768;
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = Static24.method1152(local787, local792);
								continue;
							}
							if (local223 == 3315) {
								local25 -= 2;
								local792 = Static75.anIntArray230[local25 + 1];
								local787 = Static75.anIntArray230[local25] + 32768;
								Static75.anIntArray230[local25++] = Static59.method929(local792, local787);
								continue;
							}
							if (local223 == 3316) {
								if (Static9.anInt194 < 2) {
									Static75.anIntArray230[local25++] = 0;
								} else {
									Static75.anIntArray230[local25++] = Static9.anInt194;
								}
								continue;
							}
							if (local223 == 3317) {
								Static75.anIntArray230[local25++] = Static104.anInt2385;
								continue;
							}
							if (local223 == 3318) {
								Static75.anIntArray230[local25++] = Static9.anInt189;
								continue;
							}
							if (local223 == 3321) {
								Static75.anIntArray230[local25++] = Static10.anInt230;
								continue;
							}
							if (local223 == 3322) {
								Static75.anIntArray230[local25++] = Static108.anInt2487;
								continue;
							}
							if (local223 == 3323) {
								if (Static9.anInt194 == 1) {
									Static75.anIntArray230[local25++] = 1;
								} else {
									Static75.anIntArray230[local25++] = 0;
								}
								continue;
							}
						} else if (local223 < 3500) {
							if (local223 == 3400) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								@Pc(2959) Class8_Sub1_Sub9 local2959 = Static129.method1996(local787);
								for (local641 = 0; local641 < local2959.anInt1030; local641++) {
									if (local792 == local2959.anIntArray137[local641]) {
										Static132.aClass34Array23[local29++] = local2959.aClass34Array9[local641];
										local2959 = null;
										break;
									}
								}
								if (local2959 != null) {
									Static132.aClass34Array23[local29++] = local2959.aClass34_546;
								}
								continue;
							}
							if (local223 == 3408) {
								local25 -= 4;
								local787 = Static75.anIntArray230[local25];
								local641 = Static75.anIntArray230[local25 + 3];
								local1650 = Static75.anIntArray230[local25 + 2];
								local792 = Static75.anIntArray230[local25 + 1];
								@Pc(3031) Class8_Sub1_Sub9 local3031 = Static129.method1996(local1650);
								if (local3031.anInt1033 == local787 && local792 == local3031.anInt1022) {
									for (local3062 = 0; local3062 < local3031.anInt1030; local3062++) {
										if (local3031.anIntArray137[local3062] == local641) {
											if (local792 == 115) {
												Static132.aClass34Array23[local29++] = local3031.aClass34Array9[local3062];
											} else {
												Static75.anIntArray230[local25++] = local3031.anIntArray136[local3062];
											}
											local3031 = null;
											break;
										}
									}
									if (local3031 != null) {
										if (local792 == 115) {
											Static132.aClass34Array23[local29++] = local3031.aClass34_546;
										} else {
											Static75.anIntArray230[local25++] = local3031.anInt1026;
										}
									}
									continue;
								}
								if (local792 == 115) {
									Static132.aClass34Array23[local29++] = Static69.aClass34_783;
								} else {
									Static75.anIntArray230[local25++] = 0;
								}
								continue;
							}
						} else if (local223 < 3700) {
							if (local223 == 3600) {
								if (Static70.anInt1700 == 0) {
									Static75.anIntArray230[local25++] = -2;
								} else if (Static70.anInt1700 == 1) {
									Static75.anIntArray230[local25++] = -1;
								} else {
									Static75.anIntArray230[local25++] = Static62.anInt1593;
								}
								continue;
							}
							if (local223 == 3601) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (Static70.anInt1700 == 2 && local787 < Static62.anInt1593) {
									Static132.aClass34Array23[local29++] = Static93.aClass34Array16[local787];
									continue;
								}
								Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								continue;
							}
							if (local223 == 3602) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (Static70.anInt1700 == 2 && local787 < Static62.anInt1593) {
									Static75.anIntArray230[local25++] = Static83.anIntArray266[local787];
									continue;
								}
								Static75.anIntArray230[local25++] = 0;
								continue;
							}
							if (local223 == 3603) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (Static70.anInt1700 == 2 && Static62.anInt1593 > local787) {
									Static75.anIntArray230[local25++] = Static21.anIntArray70[local787];
									continue;
								}
								Static75.anIntArray230[local25++] = 0;
								continue;
							}
							if (local223 == 3604) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local25--;
								local792 = Static75.anIntArray230[local25];
								Static34.method553(local601, local792);
								continue;
							}
							if (local223 == 3605) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static39.method595(local601.method830());
								continue;
							}
							if (local223 == 3606) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static79.method1140(local601.method830());
								continue;
							}
							if (local223 == 3607) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static123.method1943(local601.method830());
								continue;
							}
							if (local223 == 3608) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static130.method2001(local601.method830());
								continue;
							}
							if (local223 == 3609) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								if (local601.method826(Static75.aClass34_838) || local601.method826(Static5.aClass34_30)) {
									local601 = local601.method835(7);
								}
								Static75.anIntArray230[local25++] = Static111.method1993(local601) ? 1 : 0;
								continue;
							}
							if (local223 == 3611) {
								if (Static34.aClass34_488 == null) {
									Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								} else {
									Static132.aClass34Array23[local29++] = Static34.aClass34_488.method842();
								}
								continue;
							}
							if (local223 == 3612) {
								if (Static34.aClass34_488 == null) {
									Static75.anIntArray230[local25++] = 0;
								} else {
									Static75.anIntArray230[local25++] = Static41.anInt990;
								}
								continue;
							}
							if (local223 == 3613) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (Static34.aClass34_488 != null && local787 < Static41.anInt990) {
									Static132.aClass34Array23[local29++] = Static24.aClass8_Sub17Array2[local787].aClass34_1035.method842();
									continue;
								}
								Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								continue;
							}
							if (local223 == 3614) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (Static34.aClass34_488 != null && local787 < Static41.anInt990) {
									Static75.anIntArray230[local25++] = Static24.aClass8_Sub17Array2[local787].anInt2224;
									continue;
								}
								Static75.anIntArray230[local25++] = 0;
								continue;
							}
							if (local223 == 3615) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (Static34.aClass34_488 != null && local787 < Static41.anInt990) {
									Static75.anIntArray230[local25++] = Static24.aClass8_Sub17Array2[local787].aByte5;
									continue;
								}
								Static75.anIntArray230[local25++] = 0;
								continue;
							}
							if (local223 == 3616) {
								Static75.anIntArray230[local25++] = Static115.aByte7;
								continue;
							}
							if (local223 == 3617) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static79.method1136(local601);
								continue;
							}
							if (local223 == 3618) {
								Static75.anIntArray230[local25++] = Static113.aByte6;
								continue;
							}
							if (local223 == 3619) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static77.method1122(local601.method830());
								continue;
							}
							if (local223 == 3620) {
								Static133.method2010();
								continue;
							}
							if (local223 == 3621) {
								if (Static70.anInt1700 == 0) {
									Static75.anIntArray230[local25++] = -1;
								} else {
									Static75.anIntArray230[local25++] = Static69.anInt1679;
								}
								continue;
							}
							if (local223 == 3622) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (Static70.anInt1700 != 0 && local787 < Static69.anInt1679) {
									Static132.aClass34Array23[local29++] = Static83.method1229(Static5.aLongArray2[local787]).method842();
									continue;
								}
								Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								continue;
							}
							if (local223 == 3623) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								if (local601.method826(Static75.aClass34_838) || local601.method826(Static5.aClass34_30)) {
									local601 = local601.method835(7);
								}
								Static75.anIntArray230[local25++] = Static21.method383(local601) ? 1 : 0;
								continue;
							}
							if (local223 == 3624) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (Static24.aClass8_Sub17Array2 != null && local787 < Static41.anInt990 && Static24.aClass8_Sub17Array2[local787].aClass34_1035.method806(Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass34_638)) {
									Static75.anIntArray230[local25++] = 1;
									continue;
								}
								Static75.anIntArray230[local25++] = 0;
								continue;
							}
							if (local223 == 3625) {
								if (Static5.aClass34_35 == null) {
									Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								} else {
									Static132.aClass34Array23[local29++] = Static5.aClass34_35.method842();
								}
								continue;
							}
						} else if (local223 < 4100) {
							if (local223 == 4000) {
								local25 -= 2;
								local792 = Static75.anIntArray230[local25 + 1];
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = local787 + local792;
								continue;
							}
							if (local223 == 4001) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = local787 - local792;
								continue;
							}
							if (local223 == 4002) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = local792 * local787;
								continue;
							}
							if (local223 == 4003) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = local787 / local792;
								continue;
							}
							if (local223 == 4004) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = (int) (Math.random() * (double) local787);
								continue;
							}
							if (local223 == 4005) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = (int) ((double) (local787 + 1) * Math.random());
								continue;
							}
							if (local223 == 4006) {
								local25 -= 5;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								local666 = Static75.anIntArray230[local25 + 4];
								local641 = Static75.anIntArray230[local25 + 3];
								local1650 = Static75.anIntArray230[local25 + 2];
								Static75.anIntArray230[local25++] = (local666 - local1650) * (-local787 + local792) / (local641 - local1650) + local787;
								continue;
							}
							if (local223 == 4007) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = local792 * local787 / 100 + local787;
								continue;
							}
							if (local223 == 4008) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = local787 | 0x1 << local792;
								continue;
							}
							if (local223 == 4009) {
								local25 -= 2;
								local792 = Static75.anIntArray230[local25 + 1];
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = -(0x1 << local792) - 1 & local787;
								continue;
							}
							if (local223 == 4010) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = (local787 & 0x1 << local792) == 0 ? 0 : 1;
								continue;
							}
							if (local223 == 4011) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = local787 % local792;
								continue;
							}
							if (local223 == 4012) {
								local25 -= 2;
								local792 = Static75.anIntArray230[local25 + 1];
								local787 = Static75.anIntArray230[local25];
								if (local787 == 0) {
									Static75.anIntArray230[local25++] = 0;
								} else {
									Static75.anIntArray230[local25++] = (int) Math.pow((double) local787, (double) local792);
								}
								continue;
							}
							if (local223 == 4013) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								if (local787 == 0) {
									Static75.anIntArray230[local25++] = 0;
								} else if (local792 == 0) {
									Static75.anIntArray230[local25++] = Integer.MAX_VALUE;
								} else {
									Static75.anIntArray230[local25++] = (int) Math.pow((double) local787, 1.0D / (double) local792);
								}
								continue;
							}
							if (local223 == 4014) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = local787 & local792;
								continue;
							}
							if (local223 == 4015) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = local787 | local792;
								continue;
							}
						} else if (local223 < 4200) {
							if (local223 == 4100) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local25--;
								local792 = Static75.anIntArray230[local25];
								Static132.aClass34Array23[local29++] = Static44.method669(new Class34[] { local601, Static44.method672(local792) });
								continue;
							}
							if (local223 == 4101) {
								local29 -= 2;
								local601 = Static132.aClass34Array23[local29];
								local1422 = Static132.aClass34Array23[local29 + 1];
								Static132.aClass34Array23[local29++] = Static44.method669(new Class34[] { local601, local1422 });
								continue;
							}
							if (local223 == 4102) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local25--;
								local792 = Static75.anIntArray230[local25];
								Static132.aClass34Array23[local29++] = Static44.method669(new Class34[] { local601, Static97.method1365(local792) });
								continue;
							}
							if (local223 == 4103) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static132.aClass34Array23[local29++] = local601.method834();
								continue;
							}
							if (local223 == 4104) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								@Pc(3751) long local3751 = (long) local787 * 86400000L + 1014768000000L;
								Static54.aCalendar1.setTime(new Date(local3751));
								local641 = Static54.aCalendar1.get(5);
								local666 = Static54.aCalendar1.get(2);
								local3062 = Static54.aCalendar1.get(1);
								Static132.aClass34Array23[local29++] = Static44.method669(new Class34[] { Static44.method672(local641), Static113.aClass34_1212, Static16.aClass34Array5[local666], Static113.aClass34_1212, Static44.method672(local3062) });
								continue;
							}
							if (local223 == 4105) {
								local29 -= 2;
								local601 = Static132.aClass34Array23[local29];
								local1422 = Static132.aClass34Array23[local29 + 1];
								if (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass52_1 != null && Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass52_1.aBoolean75) {
									Static132.aClass34Array23[local29++] = local1422;
									continue;
								}
								Static132.aClass34Array23[local29++] = local601;
								continue;
							}
							if (local223 == 4106) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static132.aClass34Array23[local29++] = Static44.method672(local787);
								continue;
							}
							if (local223 == 4107) {
								local29 -= 2;
								Static75.anIntArray230[local25++] = Static132.aClass34Array23[local29].method815(Static132.aClass34Array23[local29 + 1]);
								continue;
							}
							@Pc(3902) byte[] local3902;
							@Pc(3907) Class8_Sub1_Sub3_Sub4_Sub1 local3907;
							if (local223 == 4108) {
								local25 -= 2;
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local792 = Static75.anIntArray230[local25];
								local1650 = Static75.anIntArray230[local25 + 1];
								local3902 = Static68.aClass14_Sub1_10.method1156(0, local1650);
								local3907 = new Class8_Sub1_Sub3_Sub4_Sub1(local3902);
								Static75.anIntArray230[local25++] = local3907.method1759(local601, local792);
								continue;
							}
							if (local223 == 4109) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local25 -= 2;
								local792 = Static75.anIntArray230[local25];
								local1650 = Static75.anIntArray230[local25 + 1];
								local3902 = Static68.aClass14_Sub1_10.method1156(0, local1650);
								local3907 = new Class8_Sub1_Sub3_Sub4_Sub1(local3902);
								Static75.anIntArray230[local25++] = local3907.method1764(local601, local792);
								continue;
							}
							if (local223 == 4110) {
								local29 -= 2;
								local601 = Static132.aClass34Array23[local29];
								local1422 = Static132.aClass34Array23[local29 + 1];
								local25--;
								if (Static75.anIntArray230[local25] == 1) {
									Static132.aClass34Array23[local29++] = local601;
								} else {
									Static132.aClass34Array23[local29++] = local1422;
								}
								continue;
							}
							if (local223 == 4111) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static132.aClass34Array23[local29++] = Static131.method1757(local601);
								continue;
							}
							if (local223 == 4112) {
								local25--;
								local792 = Static75.anIntArray230[local25];
								local29--;
								local601 = Static132.aClass34Array23[local29];
								Static132.aClass34Array23[local29++] = local601.method803(local792);
								continue;
							}
							if (local223 == 4113) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static42.method638(local787) ? 1 : 0;
								continue;
							}
							if (local223 == 4114) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static20.method370(local787) ? 1 : 0;
								continue;
							}
							if (local223 == 4115) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static5.method35(local787) ? 1 : 0;
								continue;
							}
							if (local223 == 4116) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static120.method1910(local787) ? 1 : 0;
								continue;
							}
							if (local223 == 4117) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								if (local601 == null) {
									Static75.anIntArray230[local25++] = 0;
								} else {
									Static75.anIntArray230[local25++] = local601.method820();
								}
								continue;
							}
							if (local223 == 4118) {
								local25 -= 2;
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local1650 = Static75.anIntArray230[local25 + 1];
								local792 = Static75.anIntArray230[local25];
								Static132.aClass34Array23[local29++] = local601.method810(local1650, local792);
								continue;
							}
							if (local223 == 4119) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local1422 = Static82.method1198(local601.method820());
								@Pc(4204) boolean local4204 = false;
								for (local641 = 0; local601.method820() > local641; local641++) {
									local666 = local601.method808(local641);
									if (local666 == 60) {
										local4204 = true;
									} else if (local666 == 62) {
										local4204 = false;
									} else if (!local4204) {
										local1422.method817(local666);
									}
								}
								local1422.method819();
								Static132.aClass34Array23[local29++] = local1422;
								continue;
							}
							if (local223 == 4120) {
								local25 -= 2;
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local792 = Static75.anIntArray230[local25];
								local1650 = Static75.anIntArray230[local25 + 1];
								Static75.anIntArray230[local25++] = local601.method805(local1650, local792);
								continue;
							}
							if (local223 == 4121) {
								local29 -= 2;
								local601 = Static132.aClass34Array23[local29];
								local25--;
								local1650 = Static75.anIntArray230[local25];
								local1422 = Static132.aClass34Array23[local29 + 1];
								Static75.anIntArray230[local25++] = local601.method824(local1422, local1650);
								continue;
							}
						} else if (local223 < 4300) {
							if (local223 == 4200) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static132.aClass34Array23[local29++] = Static7.method49(local787).aClass34_812;
								continue;
							}
							@Pc(5335) Class8_Sub1_Sub13 local5335;
							if (local223 == 4201) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								local5335 = Static7.method49(local787);
								if (local792 >= 1 && local792 <= 5 && local5335.aClass34Array13[local792 - 1] != null) {
									Static132.aClass34Array23[local29++] = local5335.aClass34Array13[local792 - 1];
									continue;
								}
								Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								continue;
							}
							if (local223 == 4202) {
								local25 -= 2;
								local787 = Static75.anIntArray230[local25];
								local792 = Static75.anIntArray230[local25 + 1];
								local5335 = Static7.method49(local787);
								if (local792 >= 1 && local792 <= 5 && local5335.aClass34Array12[local792 - 1] != null) {
									Static132.aClass34Array23[local29++] = local5335.aClass34Array12[local792 - 1];
									continue;
								}
								Static132.aClass34Array23[local29++] = Static95.aClass34_1051;
								continue;
							}
							if (local223 == 4203) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static7.method49(local787).anInt1726;
								continue;
							}
							if (local223 == 4204) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static7.method49(local787).anInt1752 == 1 ? 1 : 0;
								continue;
							}
							@Pc(5482) Class8_Sub1_Sub13 local5482;
							if (local223 == 4205) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								local5482 = Static7.method49(local787);
								if (local5482.anInt1739 == -1 && local5482.anInt1740 >= 0) {
									Static75.anIntArray230[local25++] = local5482.anInt1740;
									continue;
								}
								Static75.anIntArray230[local25++] = local787;
								continue;
							}
							if (local223 == 4206) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								local5482 = Static7.method49(local787);
								if (local5482.anInt1739 >= 0 && local5482.anInt1740 >= 0) {
									Static75.anIntArray230[local25++] = local5482.anInt1740;
									continue;
								}
								Static75.anIntArray230[local25++] = local787;
								continue;
							}
							if (local223 == 4207) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								Static75.anIntArray230[local25++] = Static7.method49(local787).aBoolean68 ? 1 : 0;
								continue;
							}
						} else if (local223 < 5100) {
							if (local223 == 5000) {
								Static75.anIntArray230[local25++] = Static112.anInt2506;
								continue;
							}
							if (local223 == 5001) {
								local25 -= 3;
								Static112.anInt2506 = Static75.anIntArray230[local25];
								Static117.anInt2632 = Static75.anIntArray230[local25 + 1];
								Static41.anInt991 = Static75.anIntArray230[local25 + 2];
								aClass8_Sub20_Sub1_3.method1907(114);
								aClass8_Sub20_Sub1_3.method1883(Static112.anInt2506);
								aClass8_Sub20_Sub1_3.method1883(Static117.anInt2632);
								aClass8_Sub20_Sub1_3.method1883(Static41.anInt991);
								continue;
							}
							if (local223 == 5002) {
								local25 -= 2;
								local29--;
								local601 = Static132.aClass34Array23[local29];
								local792 = Static75.anIntArray230[local25];
								local1650 = Static75.anIntArray230[local25 + 1];
								aClass8_Sub20_Sub1_3.method1907(130);
								aClass8_Sub20_Sub1_3.method1879(local601.method830());
								aClass8_Sub20_Sub1_3.method1883(local792 - 1);
								aClass8_Sub20_Sub1_3.method1883(local1650);
								continue;
							}
							if (local223 == 5003) {
								local1422 = null;
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (local787 < 100) {
									local1422 = Static78.aClass34Array14[local787];
								}
								if (local1422 == null) {
									local1422 = Static95.aClass34_1051;
								}
								Static132.aClass34Array23[local29++] = local1422;
								continue;
							}
							if (local223 == 5004) {
								local792 = -1;
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (local787 < 100 && Static78.aClass34Array14[local787] != null) {
									local792 = Static10.anIntArray26[local787];
								}
								Static75.anIntArray230[local25++] = local792;
								continue;
							}
							if (local223 == 5005) {
								Static75.anIntArray230[local25++] = Static117.anInt2632;
								continue;
							}
							if (local223 == 5008) {
								local29--;
								local601 = Static132.aClass34Array23[local29];
								if (local601.method826(Static24.aClass34_858)) {
									Static95.method1347(local601);
								} else {
									local1422 = local601.method834();
									@Pc(4536) byte local4536 = 0;
									@Pc(4538) byte local4538 = 0;
									if (local1422.method826(Static36.aClass34_493)) {
										local601 = local601.method835(Static36.aClass34_493.method820());
										local4536 = 0;
									} else if (local1422.method826(Static86.aClass34_1001)) {
										local4536 = 1;
										local601 = local601.method835(Static86.aClass34_1001.method820());
									} else if (local1422.method826(Static36.aClass34_505)) {
										local601 = local601.method835(Static36.aClass34_505.method820());
										local4536 = 2;
									} else if (local1422.method826(Static115.aClass34_1222)) {
										local4536 = 3;
										local601 = local601.method835(Static115.aClass34_1222.method820());
									} else if (local1422.method826(Static34.aClass34_489)) {
										local601 = local601.method835(Static34.aClass34_489.method820());
										local4536 = 4;
									} else if (local1422.method826(Static5.aClass34_37)) {
										local601 = local601.method835(Static5.aClass34_37.method820());
										local4536 = 5;
									} else if (local1422.method826(Static45.aClass34_572)) {
										local4536 = 6;
										local601 = local601.method835(Static45.aClass34_572.method820());
									} else if (local1422.method826(Static134.aClass34_1440)) {
										local601 = local601.method835(Static134.aClass34_1440.method820());
										local4536 = 7;
									} else if (local1422.method826(Static52.aClass34_686)) {
										local601 = local601.method835(Static52.aClass34_686.method820());
										local4536 = 8;
									} else if (local1422.method826(Static109.aClass34_1174)) {
										local601 = local601.method835(Static109.aClass34_1174.method820());
										local4536 = 9;
									} else if (local1422.method826(Static81.aClass34_885)) {
										local4536 = 10;
										local601 = local601.method835(Static81.aClass34_885.method820());
									} else if (local1422.method826(Static50.aClass34_660)) {
										local4536 = 11;
										local601 = local601.method835(Static50.aClass34_660.method820());
									} else if (Static115.anInt2594 != 0) {
										if (local1422.method826(Static36.aClass34_494)) {
											local601 = local601.method835(Static36.aClass34_494.method820());
											local4536 = 0;
										} else if (local1422.method826(Static86.aClass34_998)) {
											local4536 = 1;
											local601 = local601.method835(Static86.aClass34_998.method820());
										} else if (local1422.method826(Static36.aClass34_499)) {
											local4536 = 2;
											local601 = local601.method835(Static36.aClass34_499.method820());
										} else if (local1422.method826(Static115.aClass34_1219)) {
											local4536 = 3;
											local601 = local601.method835(Static115.aClass34_1219.method820());
										} else if (local1422.method826(Static34.aClass34_490)) {
											local601 = local601.method835(Static34.aClass34_490.method820());
											local4536 = 4;
										} else if (local1422.method826(Static5.aClass34_34)) {
											local4536 = 5;
											local601 = local601.method835(Static5.aClass34_34.method820());
										} else if (local1422.method826(Static45.aClass34_573)) {
											local4536 = 6;
											local601 = local601.method835(Static45.aClass34_573.method820());
										} else if (local1422.method826(Static134.aClass34_1438)) {
											local4536 = 7;
											local601 = local601.method835(Static134.aClass34_1438.method820());
										} else if (local1422.method826(Static52.aClass34_683)) {
											local601 = local601.method835(Static52.aClass34_683.method820());
											local4536 = 8;
										} else if (local1422.method826(Static109.aClass34_1176)) {
											local601 = local601.method835(Static109.aClass34_1176.method820());
											local4536 = 9;
										} else if (local1422.method826(Static81.aClass34_883)) {
											local601 = local601.method835(Static81.aClass34_883.method820());
											local4536 = 10;
										} else if (local1422.method826(Static50.aClass34_657)) {
											local4536 = 11;
											local601 = local601.method835(Static50.aClass34_657.method820());
										}
									}
									local1422 = local601.method834();
									if (local1422.method826(Static95.aClass34_1044)) {
										local601 = local601.method835(Static95.aClass34_1044.method820());
										local4538 = 1;
									} else if (local1422.method826(Static80.aClass34_864)) {
										local4538 = 2;
										local601 = local601.method835(Static80.aClass34_864.method820());
									} else if (local1422.method826(Static28.aClass34_393)) {
										local4538 = 3;
										local601 = local601.method835(Static28.aClass34_393.method820());
									} else if (local1422.method826(Static72.aClass34_813)) {
										local4538 = 4;
										local601 = local601.method835(Static72.aClass34_813.method820());
									} else if (local1422.method826(Static115.aClass34_1218)) {
										local601 = local601.method835(Static115.aClass34_1218.method820());
										local4538 = 5;
									} else if (Static115.anInt2594 != 0) {
										if (local1422.method826(Static95.aClass34_1047)) {
											local601 = local601.method835(Static95.aClass34_1047.method820());
											local4538 = 1;
										} else if (local1422.method826(Static80.aClass34_866)) {
											local601 = local601.method835(Static80.aClass34_866.method820());
											local4538 = 2;
										} else if (local1422.method826(Static28.aClass34_390)) {
											local601 = local601.method835(Static28.aClass34_390.method820());
											local4538 = 3;
										} else if (local1422.method826(Static72.aClass34_817)) {
											local4538 = 4;
											local601 = local601.method835(Static72.aClass34_817.method820());
										} else if (local1422.method826(Static115.aClass34_1221)) {
											local601 = local601.method835(Static115.aClass34_1221.method820());
											local4538 = 5;
										}
									}
									aClass8_Sub20_Sub1_3.method1907(128);
									aClass8_Sub20_Sub1_3.method1883(0);
									local666 = aClass8_Sub20_Sub1_3.anInt2853;
									aClass8_Sub20_Sub1_3.method1883(local4536);
									aClass8_Sub20_Sub1_3.method1883(local4538);
									Static32.method536(aClass8_Sub20_Sub1_3, local601);
									aClass8_Sub20_Sub1_3.method1893(aClass8_Sub20_Sub1_3.anInt2853 - local666);
								}
								continue;
							}
							if (local223 == 5009) {
								local29 -= 2;
								local601 = Static132.aClass34Array23[local29];
								local1422 = Static132.aClass34Array23[local29 + 1];
								aClass8_Sub20_Sub1_3.method1907(97);
								aClass8_Sub20_Sub1_3.method1883(0);
								local1650 = aClass8_Sub20_Sub1_3.anInt2853;
								aClass8_Sub20_Sub1_3.method1879(local601.method830());
								Static32.method536(aClass8_Sub20_Sub1_3, local1422);
								aClass8_Sub20_Sub1_3.method1893(aClass8_Sub20_Sub1_3.anInt2853 - local1650);
								continue;
							}
							if (local223 == 5010) {
								local1422 = null;
								local25--;
								local787 = Static75.anIntArray230[local25];
								if (local787 < 100) {
									local1422 = Static108.aClass34Array18[local787];
								}
								if (local1422 == null) {
									local1422 = Static95.aClass34_1051;
								}
								Static132.aClass34Array23[local29++] = local1422;
								continue;
							}
							if (local223 == 5011) {
								local25--;
								local787 = Static75.anIntArray230[local25];
								local1422 = null;
								if (local787 < 100) {
									local1422 = Static5.aClass34Array2[local787];
								}
								if (local1422 == null) {
									local1422 = Static95.aClass34_1051;
								}
								Static132.aClass34Array23[local29++] = local1422;
								continue;
							}
							if (local223 == 5015) {
								if (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1 == null || Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass34_638 == null) {
									local601 = Static83.aClass34_941;
								} else {
									local601 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass34_638;
								}
								Static132.aClass34Array23[local29++] = local601;
								continue;
							}
							if (local223 == 5016) {
								Static75.anIntArray230[local25++] = Static41.anInt991;
								continue;
							}
							if (local223 == 5017) {
								Static75.anIntArray230[local25++] = Static56.anInt1447;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7185) Exception local7185) {
			if (local20.aClass34_132 == null) {
				if (Static88.anInt2341 != 0) {
					Static108.method1530(Static75.aClass34_837, Static95.aClass34_1051, 0);
				}
				Static79.method1133(local7185, "CS2 - scr:" + local20.aLong102 + " op:" + local36);
			} else {
				@Pc(7192) Class34 local7192 = Static82.method1198(30);
				local7192.method807(Static69.aClass34_786).method807(local20.aClass34_132);
				for (local61 = Static104.anInt2389 - 1; local61 >= 0; local61--) {
					local7192.method807(Static48.aClass34_1356).method807(Static128.aClass77Array1[local61].aClass8_Sub1_Sub2_1.aClass34_132);
				}
				if (local36 == 40) {
					local99 = local47[local31];
					local7192.method807(Static118.aClass34_1238).method807(Static44.method672(local99));
				}
				if (Static88.anInt2341 != 0) {
					Static108.method1530(Static44.method669(new Class34[] { Static96.aClass34_282, local20.aClass34_132 }), Static95.aClass34_1051, 0);
				}
				Static79.method1133(local7185, "CS2 - scr:" + local20.aLong102 + " op:" + local36 + new String(local7192.method836()));
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[B)I")
	public static int method1499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) int local10 = -1;
		for (@Pc(12) int local12 = arg1; local12 < arg0; local12++) {
			local10 = Class8_Sub1.anIntArray391[(local10 ^ arg2[local12]) & 0xFF] ^ local10 >>> 8;
		}
		return ~local10;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public static void method1501() {
		aClass8_Sub20_Sub1_3 = null;
		aClass34_1144 = null;
		aClass14_26 = null;
		aClass34_1146 = null;
		aClass34_1141 = null;
		aClass48_48 = null;
		aClass34_1143 = null;
		aClass34_1145 = null;
		aClass14_25 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!je;Lclient!wd;)V")
	public static void method1505(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class8_Sub20 arg2) {
		@Pc(9) Class8_Sub4 local9 = new Class8_Sub4();
		local9.anInt362 = arg2.method1872();
		local9.anInt365 = arg2.method1853();
		local9.anIntArray52 = new int[local9.anInt362];
		local9.anIntArray49 = new int[local9.anInt362];
		local9.aClass10Array2 = new Class10[local9.anInt362];
		local9.aByteArrayArrayArray2 = new byte[local9.anInt362][][];
		local9.aClass10Array1 = new Class10[local9.anInt362];
		local9.anIntArray50 = new int[local9.anInt362];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt362; local51++) {
			try {
				@Pc(57) int local57 = arg2.method1872();
				@Pc(84) String local84;
				@Pc(93) String local93;
				@Pc(97) int local97;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local84 = new String(arg2.method1892().method836());
					local93 = new String(arg2.method1892().method836());
					local97 = 0;
					if (local57 == 1) {
						local97 = arg2.method1853();
					}
					local9.anIntArray49[local51] = local57;
					local9.anIntArray50[local51] = local97;
					local9.aClass10Array2[local51] = arg1.method945(Static121.method1931(local84), local93);
				} else if (local57 == 3 || local57 == 4) {
					local84 = new String(arg2.method1892().method836());
					local93 = new String(arg2.method1892().method836());
					local97 = arg2.method1872();
					@Pc(100) String[] local100 = new String[local97];
					for (@Pc(102) int local102 = 0; local102 < local97; local102++) {
						local100[local102] = new String(arg2.method1892().method836());
					}
					@Pc(126) byte[][] local126 = new byte[local97][];
					@Pc(139) int local139;
					if (local57 == 3) {
						for (@Pc(133) int local133 = 0; local133 < local97; local133++) {
							local139 = arg2.method1853();
							local126[local133] = new byte[local139];
							arg2.method1846(local139, local126[local133]);
						}
					}
					local9.anIntArray49[local51] = local57;
					@Pc(168) Class[] local168 = new Class[local97];
					for (local139 = 0; local139 < local97; local139++) {
						local168[local139] = Static121.method1931(local100[local139]);
					}
					local9.aClass10Array1[local51] = arg1.method949(local168, Static121.method1931(local84), local93);
					local9.aByteArrayArrayArray2[local51] = local126;
				}
			} catch (@Pc(255) ClassNotFoundException local255) {
				local9.anIntArray52[local51] = -1;
			} catch (@Pc(262) SecurityException local262) {
				local9.anIntArray52[local51] = -2;
			} catch (@Pc(269) NullPointerException local269) {
				local9.anIntArray52[local51] = -3;
			} catch (@Pc(276) Exception local276) {
				local9.anIntArray52[local51] = -4;
			} catch (@Pc(283) Throwable local283) {
				local9.anIntArray52[local51] = -5;
			}
		}
		Static2.aClass49_1.method1114(local9);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!dd;ZZLclient!dd;)V")
	public static void method1509(@OriginalArg(0) Class14 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class14 arg2) {
		Static120.aClass14_29 = arg0;
		Static105.aClass14_24 = arg2;
		Static105.aBoolean91 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V")
	public static void method1510() {
		Static128.anInt3020 = 0;
		Static90.aBoolean14 = false;
		Static75.anInt1804 = -1;
		Static96.anInt552 = 0;
		Static81.anInt1951 = 0;
		aClass8_Sub20_Sub1_3.anInt2853 = 0;
		Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
		Static104.anInt2385 = 0;
		Static50.anInt1320 = -1;
		Static28.anInt797 = -1;
		Static17.anInt434 = 0;
		Static30.anInt852 = -1;
		Static32.anInt872 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1.length; local35++) {
			if (Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local35] != null) {
				Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local35].anInt2029 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1.length; local57++) {
			if (Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local57] != null) {
				Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local57].anInt2029 = -1;
			}
		}
		Static4.method31();
		Static82.method1201(30);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static23.aBooleanArray2[local84] = true;
		}
	}
}
