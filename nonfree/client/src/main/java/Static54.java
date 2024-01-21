import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static int anInt1286;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!ff;")
	public static Class3_Sub12 aClass3_Sub12_5;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
	public static int[] anIntArray133 = new int[25];

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_706 = Static122.method531("sl_back");

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
	public static int anInt1289 = 0;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!sd;")
	public static Class73 aClass73_707 = Static122.method531("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!pb;I)V")
	public static void method966(@OriginalArg(1) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray3;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class3_Sub1_Sub6 local18 = Static26.method550(local14);
		if (local18 == null) {
			return;
		}
		Static68.anInt1578 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local18.anIntArray66;
		@Pc(35) int[] local35 = local18.anIntArray65;
		@Pc(37) byte local37 = -1;
		@Pc(51) int local51;
		@Pc(64) int local64;
		try {
			@Pc(39) int local39 = 0;
			Static100.aClass73Array13 = new Class73[local18.anInt627];
			Static95.anIntArray220 = new int[local18.anInt624];
			@Pc(49) int local49 = 0;
			for (local51 = 1; local51 < local8.length; local51++) {
				if (local8[local51] instanceof Integer) {
					local64 = (Integer) local8[local51];
					if (local64 == -2147483647) {
						local64 = arg0.anInt2863;
					}
					if (local64 == -2147483646) {
						local64 = arg0.anInt2864;
					}
					if (local64 == -2147483645) {
						local64 = arg0.aClass83_13 == null ? -1 : arg0.aClass83_13.anInt3676;
					}
					if (local64 == -2147483644) {
						local64 = arg0.anInt2862;
					}
					if (local64 == -2147483643) {
						local64 = arg0.aClass83_13 == null ? -1 : arg0.aClass83_13.anInt3677;
					}
					if (local64 == -2147483642) {
						local64 = arg0.aClass83_12 == null ? -1 : arg0.aClass83_12.anInt3676;
					}
					if (local64 == -2147483641) {
						local64 = arg0.aClass83_12 == null ? -1 : arg0.aClass83_12.anInt3677;
					}
					if (local64 == -2147483640) {
						local64 = arg0.anInt2861;
					}
					if (local64 == -2147483639) {
						local64 = arg0.anInt2866;
					}
					Static95.anIntArray220[local49++] = local64;
				} else if (local8[local51] instanceof Class73) {
					@Pc(169) Class73 local169 = (Class73) local8[local51];
					if (local169.method2430(Static14.aClass73_217)) {
						local169 = arg0.aClass73_1615;
					}
					Static100.aClass73Array13[local39++] = local169;
				}
			}
			local64 = 0;
			label2174: while (true) {
				local64++;
				if (arg1 < local64) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(216) int local216 = local32[local29];
				@Pc(777) int local777;
				@Pc(634) int local634;
				@Pc(656) int local656;
				@Pc(766) int local766;
				@Pc(590) Class73 local590;
				if (local216 < 100) {
					if (local216 == 0) {
						Static80.anIntArray185[local25++] = local35[local29];
						continue;
					}
					@Pc(242) int local242;
					if (local216 == 1) {
						local242 = local35[local29];
						Static80.anIntArray185[local25++] = Static81.anIntArray186[local242];
						continue;
					}
					if (local216 == 2) {
						local242 = local35[local29];
						local25--;
						Static81.anIntArray186[local242] = Static80.anIntArray185[local25];
						continue;
					}
					if (local216 == 3) {
						Static154.aClass73Array23[local27++] = local18.aClass73Array6[local29];
						continue;
					}
					if (local216 == 6) {
						local29 += local35[local29];
						continue;
					}
					if (local216 == 7) {
						local25 -= 2;
						if (Static80.anIntArray185[local25] != Static80.anIntArray185[local25 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local216 == 8) {
						local25 -= 2;
						if (Static80.anIntArray185[local25 + 1] == Static80.anIntArray185[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local216 == 9) {
						local25 -= 2;
						if (Static80.anIntArray185[local25 + 1] > Static80.anIntArray185[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local216 == 10) {
						local25 -= 2;
						if (Static80.anIntArray185[local25 + 1] < Static80.anIntArray185[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local216 == 21) {
						if (Static68.anInt1578 == 0) {
							return;
						}
						@Pc(399) Class47 local399 = Static148.aClass47Array1[--Static68.anInt1578];
						Static95.anIntArray220 = local399.anIntArray200;
						local18 = local399.aClass3_Sub1_Sub6_1;
						local29 = local399.anInt1940;
						Static100.aClass73Array13 = local399.aClass73Array12;
						local32 = local18.anIntArray66;
						local35 = local18.anIntArray65;
						continue;
					}
					if (local216 == 25) {
						local242 = local35[local29];
						Static80.anIntArray185[local25++] = Static78.method1323(local242);
						continue;
					}
					if (local216 == 27) {
						local242 = local35[local29];
						local25--;
						Static4.method51(Static80.anIntArray185[local25], local242);
						continue;
					}
					if (local216 == 31) {
						local25 -= 2;
						if (Static80.anIntArray185[local25] <= Static80.anIntArray185[local25 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local216 == 32) {
						local25 -= 2;
						if (Static80.anIntArray185[local25 + 1] <= Static80.anIntArray185[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local216 == 33) {
						Static80.anIntArray185[local25++] = Static95.anIntArray220[local35[local29]];
						continue;
					}
					@Pc(532) int local532;
					if (local216 == 34) {
						local532 = local35[local29];
						local25--;
						Static95.anIntArray220[local532] = Static80.anIntArray185[local25];
						continue;
					}
					if (local216 == 35) {
						Static154.aClass73Array23[local27++] = Static100.aClass73Array13[local35[local29]];
						continue;
					}
					if (local216 == 36) {
						local532 = local35[local29];
						local27--;
						Static100.aClass73Array13[local532] = Static154.aClass73Array23[local27];
						continue;
					}
					if (local216 == 37) {
						local242 = local35[local29];
						local27 -= local242;
						local590 = Static61.method1114(Static154.aClass73Array23, local27, local242);
						Static154.aClass73Array23[local27++] = local590;
						continue;
					}
					if (local216 == 38) {
						local25--;
						continue;
					}
					if (local216 == 39) {
						local27--;
						continue;
					}
					if (local216 == 40) {
						local242 = local35[local29];
						@Pc(624) Class3_Sub1_Sub6 local624 = Static26.method550(local242);
						@Pc(628) Class73[] local628 = new Class73[local624.anInt627];
						@Pc(632) int[] local632 = new int[local624.anInt624];
						for (local634 = 0; local634 < local624.anInt622; local634++) {
							local632[local634] = Static80.anIntArray185[local25 + local634 - local624.anInt622];
						}
						for (local656 = 0; local656 < local624.anInt619; local656++) {
							local628[local656] = Static154.aClass73Array23[local656 + local27 - local624.anInt619];
						}
						local25 -= local624.anInt622;
						local27 -= local624.anInt619;
						@Pc(689) Class47 local689 = new Class47();
						local689.aClass73Array12 = Static100.aClass73Array13;
						local689.aClass3_Sub1_Sub6_1 = local18;
						local18 = local624;
						local689.anIntArray200 = Static95.anIntArray220;
						local689.anInt1940 = local29;
						local29 = -1;
						Static148.aClass47Array1[Static68.anInt1578++] = local689;
						Static95.anIntArray220 = local632;
						Static100.aClass73Array13 = local628;
						local35 = local624.anIntArray65;
						local32 = local624.anIntArray66;
						continue;
					}
					if (local216 == 42) {
						Static80.anIntArray185[local25++] = Static61.anIntArray156[local35[local29]];
						continue;
					}
					if (local216 == 43) {
						local532 = local35[local29];
						local25--;
						Static61.anIntArray156[local532] = Static80.anIntArray185[local25];
						continue;
					}
					if (local216 == 44) {
						local766 = local35[local29] & 0xFFFF;
						local242 = local35[local29] >> 16;
						local25--;
						local777 = Static80.anIntArray185[local25];
						if (local777 >= 0 && local777 <= 5000) {
							Static138.anIntArray330[local242] = local777;
							@Pc(792) byte local792 = -1;
							if (local766 == 105) {
								local792 = 0;
							}
							local634 = 0;
							while (true) {
								if (local634 >= local777) {
									continue label2174;
								}
								Static59.anIntArrayArray30[local242][local634] = local792;
								local634++;
							}
						}
						throw new RuntimeException();
					}
					if (local216 == 45) {
						local242 = local35[local29];
						local25--;
						local766 = Static80.anIntArray185[local25];
						if (local766 >= 0 && local766 < Static138.anIntArray330[local242]) {
							Static80.anIntArray185[local25++] = Static59.anIntArrayArray30[local242][local766];
							continue;
						}
						throw new RuntimeException();
					}
					if (local216 == 46) {
						local242 = local35[local29];
						local25 -= 2;
						local766 = Static80.anIntArray185[local25];
						if (local766 >= 0 && Static138.anIntArray330[local242] > local766) {
							Static59.anIntArrayArray30[local242][local766] = Static80.anIntArray185[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local216 == 47) {
						@Pc(903) Class73 local903 = Static163.aClass73Array21[local35[local29]];
						if (local903 == null) {
							local903 = Static140.aClass73_1755;
						}
						Static154.aClass73Array23[local27++] = local903;
						continue;
					}
					if (local216 == 48) {
						local532 = local35[local29];
						local27--;
						Static163.aClass73Array21[local532] = Static154.aClass73Array23[local27];
						continue;
					}
				}
				@Pc(939) boolean local939;
				if (local35[local29] == 1) {
					local939 = true;
				} else {
					local939 = false;
				}
				@Pc(1098) Class83 local1098;
				@Pc(962) int local962;
				@Pc(1002) int local1002;
				@Pc(981) Class83 local981;
				@Pc(1171) Class83 local1171;
				if (local216 < 1000) {
					if (local216 == 100) {
						local25 -= 3;
						local766 = Static80.anIntArray185[local25];
						local962 = Static80.anIntArray185[local25 + 2];
						local777 = Static80.anIntArray185[local25 + 1];
						if (local777 == 0) {
							throw new RuntimeException();
						}
						local981 = Static80.method1396(local766);
						if (local981.aClass83Array2 == null) {
							local981.aClass83Array2 = new Class83[local962 + 1];
						}
						if (local981.aClass83Array2.length <= local962) {
							@Pc(1000) Class83[] local1000 = new Class83[local962 + 1];
							for (local1002 = 0; local1002 < local981.aClass83Array2.length; local1002++) {
								local1000[local1002] = local981.aClass83Array2[local1002];
							}
							local981.aClass83Array2 = local1000;
						}
						if (local962 > 0 && local981.aClass83Array2[local962 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local962 - 1));
						}
						@Pc(1053) Class83 local1053 = new Class83();
						local1053.anInt3702 = local1053.anInt3676 = local981.anInt3676;
						local1053.anInt3677 = local962;
						local1053.anInt3722 = local777;
						local1053.aBoolean257 = true;
						local981.aClass83Array2[local962] = local1053;
						if (local939) {
							Static84.aClass83_9 = local1053;
						} else {
							Static39.aClass83_7 = local1053;
						}
						Static60.method1104(local981);
						continue;
					}
					@Pc(1119) Class83 local1119;
					if (local216 == 101) {
						local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
						if (local1098.anInt3677 == -1) {
							if (local939) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local1119 = Static80.method1396(local1098.anInt3676);
						local1119.aClass83Array2[local1098.anInt3677] = null;
						Static60.method1104(local1119);
						continue;
					}
					if (local216 == 102) {
						local25--;
						local1098 = Static80.method1396(Static80.anIntArray185[local25]);
						local1098.aClass83Array2 = null;
						Static60.method1104(local1098);
						continue;
					}
					if (local216 == 200) {
						local25 -= 2;
						local766 = Static80.anIntArray185[local25];
						local777 = Static80.anIntArray185[local25 + 1];
						local1171 = Static109.method1959(local777, local766);
						if (local1171 != null && local777 != -1) {
							Static80.anIntArray185[local25++] = 1;
							if (local939) {
								Static84.aClass83_9 = local1171;
							} else {
								Static39.aClass83_7 = local1171;
							}
							continue;
						}
						Static80.anIntArray185[local25++] = 0;
						continue;
					}
					if (local216 == 201) {
						local25--;
						local766 = Static80.anIntArray185[local25];
						local1119 = Static80.method1396(local766);
						if (local1119 == null) {
							Static80.anIntArray185[local25++] = 0;
						} else {
							Static80.anIntArray185[local25++] = 1;
							if (local939) {
								Static84.aClass83_9 = local1119;
							} else {
								Static39.aClass83_7 = local1119;
							}
						}
						continue;
					}
				} else if ((local216 < 1000 || local216 >= 1100) && (local216 < 2000 || local216 >= 2100)) {
					@Pc(1621) Class73 local1621;
					if (local216 >= 1100 && local216 < 1200 || !(local216 < 2100 || local216 >= 2200)) {
						if (local216 < 2000) {
							local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
						} else {
							local25--;
							local1098 = Static80.method1396(Static80.anIntArray185[local25]);
							local216 -= 1000;
						}
						if (local216 == 1100) {
							local25 -= 2;
							local1098.anInt3728 = Static80.anIntArray185[local25];
							if (local1098.anInt3721 - local1098.anInt3670 < local1098.anInt3728) {
								local1098.anInt3728 = local1098.anInt3721 - local1098.anInt3670;
							}
							if (local1098.anInt3728 < 0) {
								local1098.anInt3728 = 0;
							}
							local1098.anInt3689 = Static80.anIntArray185[local25 + 1];
							if (local1098.anInt3691 - local1098.anInt3708 < local1098.anInt3689) {
								local1098.anInt3689 = local1098.anInt3691 - local1098.anInt3708;
							}
							if (local1098.anInt3689 < 0) {
								local1098.anInt3689 = 0;
							}
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1101) {
							local25--;
							local1098.anInt3712 = Static80.anIntArray185[local25];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1102) {
							local25--;
							local1098.aBoolean248 = Static80.anIntArray185[local25] == 1;
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1103) {
							local25--;
							local1098.anInt3718 = Static80.anIntArray185[local25];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1104) {
							local25--;
							local1098.anInt3706 = Static80.anIntArray185[local25];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1105) {
							local25--;
							local1098.anInt3698 = Static80.anIntArray185[local25];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1106) {
							local25--;
							local1098.anInt3715 = Static80.anIntArray185[local25];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1107) {
							local25--;
							local1098.aBoolean254 = Static80.anIntArray185[local25] == 1;
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1108) {
							local1098.anInt3734 = 1;
							local25--;
							local1098.anInt3678 = Static80.anIntArray185[local25];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1109) {
							local25 -= 6;
							local1098.anInt3695 = Static80.anIntArray185[local25];
							local1098.anInt3686 = Static80.anIntArray185[local25 + 1];
							local1098.anInt3672 = Static80.anIntArray185[local25 + 2];
							local1098.anInt3704 = Static80.anIntArray185[local25 + 3];
							local1098.anInt3679 = Static80.anIntArray185[local25 + 4];
							local1098.anInt3741 = Static80.anIntArray185[local25 + 5];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1110) {
							local25--;
							local777 = Static80.anIntArray185[local25];
							if (local1098.anInt3725 != local777) {
								local1098.anInt3725 = local777;
								local1098.anInt3693 = 0;
								local1098.anInt3688 = 0;
								Static60.method1104(local1098);
							}
							continue;
						}
						if (local216 == 1111) {
							local25--;
							local1098.aBoolean255 = Static80.anIntArray185[local25] == 1;
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1112) {
							local27--;
							local1621 = Static154.aClass73Array23[local27];
							if (!local1621.method2430(local1098.aClass73_1986)) {
								local1098.aClass73_1986 = local1621;
								Static60.method1104(local1098);
							}
							continue;
						}
						if (local216 == 1113) {
							local25--;
							local1098.anInt3739 = Static80.anIntArray185[local25];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1114) {
							local25 -= 3;
							local1098.anInt3681 = Static80.anIntArray185[local25];
							local1098.anInt3723 = Static80.anIntArray185[local25 + 1];
							local1098.anInt3742 = Static80.anIntArray185[local25 + 2];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1115) {
							local25--;
							local1098.aBoolean251 = Static80.anIntArray185[local25] == 1;
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1116) {
							local25--;
							local1098.anInt3709 = Static80.anIntArray185[local25];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1117) {
							local25--;
							local1098.anInt3699 = Static80.anIntArray185[local25];
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1118) {
							local25--;
							local1098.aBoolean247 = Static80.anIntArray185[local25] == 1;
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1119) {
							local25--;
							local1098.aBoolean252 = Static80.anIntArray185[local25] == 1;
							Static60.method1104(local1098);
							continue;
						}
						if (local216 == 1120) {
							local25 -= 2;
							local1098.anInt3721 = Static80.anIntArray185[local25];
							local1098.anInt3691 = Static80.anIntArray185[local25 + 1];
							Static60.method1104(local1098);
							continue;
						}
					} else if (local216 >= 1200 && local216 < 1300 || !(local216 < 2200 || local216 >= 2300)) {
						if (local216 < 2000) {
							local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
						} else {
							local25--;
							local1098 = Static80.method1396(Static80.anIntArray185[local25]);
							local216 -= 1000;
						}
						Static60.method1104(local1098);
						if (local216 == 1200) {
							local25 -= 2;
							local962 = Static80.anIntArray185[local25 + 1];
							local777 = Static80.anIntArray185[local25];
							local1098.anInt3682 = local777;
							local1098.anInt3732 = local962;
							@Pc(7553) Class3_Sub1_Sub7 local7553 = Static3.method42(local777);
							local1098.anInt3679 = local7553.anInt1202;
							local1098.anInt3686 = local7553.anInt1217;
							local1098.anInt3672 = local7553.anInt1229;
							local1098.anInt3704 = local7553.anInt1218;
							local1098.anInt3695 = local7553.anInt1232;
							local1098.anInt3741 = local7553.anInt1244;
							if (local1098.anInt3670 > 0) {
								local1098.anInt3741 = local1098.anInt3741 * 32 / local1098.anInt3670;
							}
							continue;
						}
						if (local216 == 1201) {
							local1098.anInt3734 = 2;
							local25--;
							local1098.anInt3678 = Static80.anIntArray185[local25];
							continue;
						}
						if (local216 == 1202) {
							local1098.anInt3734 = 3;
							local1098.anInt3678 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass52_2.method1710();
							continue;
						}
						if (local216 == 1203) {
							local1098.anInt3734 = 6;
							local25--;
							local1098.anInt3678 = Static80.anIntArray185[local25];
							continue;
						}
						if (local216 == 1204) {
							local1098.anInt3734 = 5;
							local25--;
							local1098.anInt3678 = Static80.anIntArray185[local25];
							continue;
						}
					} else if (local216 >= 1300 && local216 < 1400 || local216 >= 2300 && local216 < 2400) {
						if (local216 >= 2000) {
							local25--;
							local1098 = Static80.method1396(Static80.anIntArray185[local25]);
							local216 -= 1000;
						} else {
							local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
						}
						if (local216 == 1300) {
							local25--;
							local777 = Static80.anIntArray185[local25] - 1;
							if (local777 >= 0 && local777 <= 9) {
								local27--;
								local1098.method2651(local777, Static154.aClass73Array23[local27]);
								continue;
							}
							local27--;
							continue;
						}
						if (local216 == 1301) {
							local25 -= 2;
							local777 = Static80.anIntArray185[local25];
							local962 = Static80.anIntArray185[local25 + 1];
							local1098.aClass83_15 = Static109.method1959(local962, local777);
							continue;
						}
						if (local216 == 1302) {
							local25--;
							local1098.aBoolean256 = Static80.anIntArray185[local25] == 1;
							continue;
						}
						if (local216 == 1303) {
							local25--;
							local1098.anInt3737 = Static80.anIntArray185[local25];
							continue;
						}
						if (local216 == 1304) {
							local25--;
							local1098.anInt3669 = Static80.anIntArray185[local25];
							continue;
						}
						if (local216 == 1305) {
							local27--;
							local1098.aClass73_1983 = Static154.aClass73Array23[local27];
							continue;
						}
						if (local216 == 1306) {
							local27--;
							local1098.aClass73_1981 = Static154.aClass73Array23[local27];
							continue;
						}
						if (local216 == 1307) {
							local1098.aClass73Array26 = null;
							continue;
						}
					} else {
						if (local216 >= 1400 && local216 < 1500 || local216 >= 2400 && local216 < 2500) {
							if (local216 < 2000) {
								local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
							} else {
								local25--;
								local1098 = Static80.method1396(Static80.anIntArray185[local25]);
								local216 -= 1000;
							}
							@Pc(1995) int[] local1995 = null;
							local27--;
							local1621 = Static154.aClass73Array23[local27];
							if (local1621.method2435() > 0 && local1621.method2444(local1621.method2435() - 1) == 89) {
								local25--;
								local634 = Static80.anIntArray185[local25];
								if (local634 > 0) {
									local1995 = new int[local634];
									while (local634-- > 0) {
										local25--;
										local1995[local634] = Static80.anIntArray185[local25];
									}
								}
								local1621 = local1621.method2413(local1621.method2435() - 1, 0);
							}
							@Pc(2058) Object[] local2058 = new Object[local1621.method2435() + 1];
							for (local656 = local2058.length - 1; local656 >= 1; local656--) {
								if (local1621.method2444(local656 - 1) == 115) {
									local27--;
									local2058[local656] = Static154.aClass73Array23[local27];
								} else {
									local25--;
									local2058[local656] = Integer.valueOf(Static80.anIntArray185[local25]);
								}
							}
							local25--;
							local1002 = Static80.anIntArray185[local25];
							if (local1002 == -1) {
								local2058 = null;
							} else {
								local2058[0] = Integer.valueOf(local1002);
							}
							if (local216 == 1410) {
								local1098.anObjectArray20 = local2058;
							}
							if (local216 == 1412) {
								local1098.anObjectArray18 = local2058;
							}
							local1098.aBoolean250 = true;
							if (local216 == 1404) {
								local1098.anObjectArray19 = local2058;
							}
							if (local216 == 1409) {
								local1098.anObjectArray8 = local2058;
							}
							if (local216 == 1415) {
								local1098.anIntArray386 = local1995;
								local1098.anObjectArray27 = local2058;
							}
							if (local216 == 1408) {
								local1098.anObjectArray17 = local2058;
							}
							if (local216 == 1425) {
								local1098.anObjectArray24 = local2058;
							}
							if (local216 == 1414) {
								local1098.anObjectArray16 = local2058;
								local1098.anIntArray390 = local1995;
							}
							if (local216 == 1402) {
								local1098.anObjectArray26 = local2058;
							}
							if (local216 == 1417) {
								local1098.anObjectArray23 = local2058;
							}
							if (local216 == 1419) {
								local1098.anObjectArray14 = local2058;
							}
							if (local216 == 1420) {
								local1098.anObjectArray7 = local2058;
							}
							if (local216 == 1407) {
								local1098.anIntArray394 = local1995;
								local1098.anObjectArray10 = local2058;
							}
							if (local216 == 1403) {
								local1098.anObjectArray15 = local2058;
							}
							if (local216 == 1411) {
								local1098.anObjectArray12 = local2058;
							}
							if (local216 == 1418) {
								local1098.anObjectArray4 = local2058;
							}
							if (local216 == 1401) {
								local1098.anObjectArray22 = local2058;
							}
							if (local216 == 1423) {
								local1098.anObjectArray5 = local2058;
							}
							if (local216 == 1416) {
								local1098.anObjectArray11 = local2058;
							}
							if (local216 == 1405) {
								local1098.anObjectArray13 = local2058;
							}
							if (local216 == 1422) {
								local1098.anObjectArray6 = local2058;
							}
							if (local216 == 1424) {
								local1098.anObjectArray21 = local2058;
							}
							if (local216 == 1406) {
								local1098.anObjectArray28 = local2058;
							}
							if (local216 == 1421) {
								local1098.anObjectArray9 = local2058;
							}
							if (local216 == 1400) {
								local1098.anObjectArray29 = local2058;
							}
							continue;
						}
						if (local216 < 1600) {
							local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
							if (local216 == 1500) {
								Static80.anIntArray185[local25++] = local1098.anInt3667;
								continue;
							}
							if (local216 == 1501) {
								Static80.anIntArray185[local25++] = local1098.anInt3707;
								continue;
							}
							if (local216 == 1502) {
								Static80.anIntArray185[local25++] = local1098.anInt3670;
								continue;
							}
							if (local216 == 1503) {
								Static80.anIntArray185[local25++] = local1098.anInt3708;
								continue;
							}
							if (local216 == 1504) {
								Static80.anIntArray185[local25++] = local1098.aBoolean249 ? 1 : 0;
								continue;
							}
							if (local216 == 1505) {
								Static80.anIntArray185[local25++] = local1098.anInt3702;
								continue;
							}
						} else if (local216 < 1700) {
							local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
							if (local216 == 1600) {
								Static80.anIntArray185[local25++] = local1098.anInt3728;
								continue;
							}
							if (local216 == 1601) {
								Static80.anIntArray185[local25++] = local1098.anInt3689;
								continue;
							}
							if (local216 == 1602) {
								Static154.aClass73Array23[local27++] = local1098.aClass73_1986;
								continue;
							}
							if (local216 == 1603) {
								Static80.anIntArray185[local25++] = local1098.anInt3721;
								continue;
							}
							if (local216 == 1604) {
								Static80.anIntArray185[local25++] = local1098.anInt3691;
								continue;
							}
							if (local216 == 1605) {
								Static80.anIntArray185[local25++] = local1098.anInt3741;
								continue;
							}
							if (local216 == 1606) {
								Static80.anIntArray185[local25++] = local1098.anInt3672;
								continue;
							}
							if (local216 == 1607) {
								Static80.anIntArray185[local25++] = local1098.anInt3679;
								continue;
							}
							if (local216 == 1608) {
								Static80.anIntArray185[local25++] = local1098.anInt3704;
								continue;
							}
							if (local216 == 1609) {
								Static80.anIntArray185[local25++] = local1098.anInt3718;
								continue;
							}
						} else if (local216 < 1800) {
							local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
							if (local216 == 1700) {
								Static80.anIntArray185[local25++] = local1098.anInt3682;
								continue;
							}
							if (local216 == 1701) {
								if (local1098.anInt3682 == -1) {
									Static80.anIntArray185[local25++] = 0;
								} else {
									Static80.anIntArray185[local25++] = local1098.anInt3732;
								}
								continue;
							}
							if (local216 == 1702) {
								Static80.anIntArray185[local25++] = local1098.anInt3677;
								continue;
							}
						} else if (local216 < 1900) {
							local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
							if (local216 == 1800) {
								Static80.anIntArray185[local25++] = Static172.method2691(Static127.method484(local1098));
								continue;
							}
							if (local216 == 1801) {
								local25--;
								local777 = Static80.anIntArray185[local25];
								local777--;
								if (local1098.aClass73Array26 != null && local1098.aClass73Array26.length > local777 && local1098.aClass73Array26[local777] != null) {
									Static154.aClass73Array23[local27++] = local1098.aClass73Array26[local777];
									continue;
								}
								Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								continue;
							}
							if (local216 == 1802) {
								if (local1098.aClass73_1983 == null) {
									Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								} else {
									Static154.aClass73Array23[local27++] = local1098.aClass73_1983;
								}
								continue;
							}
						} else if (local216 < 2600) {
							local25--;
							local1098 = Static80.method1396(Static80.anIntArray185[local25]);
							if (local216 == 2500) {
								Static80.anIntArray185[local25++] = local1098.anInt3667;
								continue;
							}
							if (local216 == 2501) {
								Static80.anIntArray185[local25++] = local1098.anInt3707;
								continue;
							}
							if (local216 == 2502) {
								Static80.anIntArray185[local25++] = local1098.anInt3670;
								continue;
							}
							if (local216 == 2503) {
								Static80.anIntArray185[local25++] = local1098.anInt3708;
								continue;
							}
							if (local216 == 2504) {
								Static80.anIntArray185[local25++] = local1098.aBoolean249 ? 1 : 0;
								continue;
							}
							if (local216 == 2505) {
								Static80.anIntArray185[local25++] = local1098.anInt3702;
								continue;
							}
						} else if (local216 < 2700) {
							local25--;
							local1098 = Static80.method1396(Static80.anIntArray185[local25]);
							if (local216 == 2600) {
								Static80.anIntArray185[local25++] = local1098.anInt3728;
								continue;
							}
							if (local216 == 2601) {
								Static80.anIntArray185[local25++] = local1098.anInt3689;
								continue;
							}
							if (local216 == 2602) {
								Static154.aClass73Array23[local27++] = local1098.aClass73_1986;
								continue;
							}
							if (local216 == 2603) {
								Static80.anIntArray185[local25++] = local1098.anInt3721;
								continue;
							}
							if (local216 == 2604) {
								Static80.anIntArray185[local25++] = local1098.anInt3691;
								continue;
							}
							if (local216 == 2605) {
								Static80.anIntArray185[local25++] = local1098.anInt3741;
								continue;
							}
							if (local216 == 2606) {
								Static80.anIntArray185[local25++] = local1098.anInt3672;
								continue;
							}
							if (local216 == 2607) {
								Static80.anIntArray185[local25++] = local1098.anInt3679;
								continue;
							}
							if (local216 == 2608) {
								Static80.anIntArray185[local25++] = local1098.anInt3704;
								continue;
							}
							if (local216 == 2609) {
								Static80.anIntArray185[local25++] = local1098.anInt3718;
								continue;
							}
						} else if (local216 < 2800) {
							if (local216 == 2700) {
								local25--;
								local1098 = Static80.method1396(Static80.anIntArray185[local25]);
								Static80.anIntArray185[local25++] = local1098.anInt3682;
								continue;
							}
							if (local216 == 2701) {
								local25--;
								local1098 = Static80.method1396(Static80.anIntArray185[local25]);
								if (local1098.anInt3682 == -1) {
									Static80.anIntArray185[local25++] = 0;
								} else {
									Static80.anIntArray185[local25++] = local1098.anInt3732;
								}
								continue;
							}
							if (local216 == 2702) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								@Pc(7092) Class3_Sub13 local7092 = (Class3_Sub13) Static91.aClass16_9.method554((long) local766);
								if (local7092 == null) {
									Static80.anIntArray185[local25++] = 0;
								} else {
									Static80.anIntArray185[local25++] = 1;
								}
								continue;
							}
							if (local216 == 2703) {
								local25--;
								local1098 = Static80.method1396(Static80.anIntArray185[local25]);
								if (local1098.aClass83Array2 == null) {
									Static80.anIntArray185[local25++] = 0;
									continue;
								}
								local777 = local1098.aClass83Array2.length;
								for (local962 = 0; local962 < local1098.aClass83Array2.length; local962++) {
									if (local1098.aClass83Array2[local962] == null) {
										local777 = local962;
										break;
									}
								}
								Static80.anIntArray185[local25++] = local777;
								continue;
							}
							if (local216 == 2704 || local216 == 2705) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								@Pc(7190) Class3_Sub13 local7190 = (Class3_Sub13) Static91.aClass16_9.method554((long) local766);
								if (local7190 != null && local7190.anInt1133 == local777) {
									Static80.anIntArray185[local25++] = 1;
									continue;
								}
								Static80.anIntArray185[local25++] = 0;
								continue;
							}
						} else if (local216 < 2900) {
							local25--;
							local1098 = Static80.method1396(Static80.anIntArray185[local25]);
							if (local216 == 2800) {
								Static80.anIntArray185[local25++] = Static172.method2691(Static127.method484(local1098));
								continue;
							}
							if (local216 == 2801) {
								local25--;
								local777 = Static80.anIntArray185[local25];
								local777--;
								if (local1098.aClass73Array26 != null && local777 < local1098.aClass73Array26.length && local1098.aClass73Array26[local777] != null) {
									Static154.aClass73Array23[local27++] = local1098.aClass73Array26[local777];
									continue;
								}
								Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								continue;
							}
							if (local216 == 2802) {
								if (local1098.aClass73_1983 == null) {
									Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								} else {
									Static154.aClass73Array23[local27++] = local1098.aClass73_1983;
								}
								continue;
							}
						} else if (local216 < 3200) {
							if (local216 == 3100) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static135.method2234(0, local590, Static61.aClass73_810);
								continue;
							}
							if (local216 == 3101) {
								local25 -= 2;
								Static110.method1963(Static80.anIntArray185[local25 + 1], Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1, Static80.anIntArray185[local25]);
								continue;
							}
							if (local216 == 3103) {
								Static72.method1260();
								continue;
							}
							if (local216 == 3104) {
								local777 = 0;
								local27--;
								local590 = Static154.aClass73Array23[local27];
								if (local590.method2417()) {
									local777 = local590.method2431();
								}
								Static139.aClass3_Sub12_Sub1_3.method1400(82);
								Static139.aClass3_Sub12_Sub1_3.method1392(local777);
								continue;
							}
							if (local216 == 3105) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static139.aClass3_Sub12_Sub1_3.method1400(88);
								Static139.aClass3_Sub12_Sub1_3.method1382(local590.method2425());
								continue;
							}
							if (local216 == 3106) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static139.aClass3_Sub12_Sub1_3.method1400(184);
								Static139.aClass3_Sub12_Sub1_3.method1383(local590.method2435() + 1);
								Static139.aClass3_Sub12_Sub1_3.method1350(local590);
								continue;
							}
							if (local216 == 3107) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								local27--;
								local1621 = Static154.aClass73Array23[local27];
								Static65.method1180(local766, local1621);
								continue;
							}
							if (local216 == 3108) {
								local25 -= 3;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								local962 = Static80.anIntArray185[local25 + 2];
								local981 = Static80.method1396(local962);
								Static40.method770(local777, local766, local981);
								continue;
							}
							if (local216 == 3109) {
								local25 -= 2;
								local777 = Static80.anIntArray185[local25 + 1];
								local1171 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
								local766 = Static80.anIntArray185[local25];
								Static40.method770(local777, local766, local1171);
								continue;
							}
							if (local216 == 3110) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static139.aClass3_Sub12_Sub1_3.method1400(182);
								Static139.aClass3_Sub12_Sub1_3.method1361(local766);
								continue;
							}
						} else if (local216 < 3300) {
							if (local216 == 3200) {
								local25 -= 3;
								Static88.method1534(Static80.anIntArray185[local25 + 2], Static80.anIntArray185[local25], Static80.anIntArray185[local25 + 1]);
								continue;
							}
							if (local216 == 3201) {
								local25--;
								Static111.method2018(Static80.anIntArray185[local25]);
								continue;
							}
							if (local216 == 3202) {
								local25 -= 2;
								Static126.method2144(Static80.anIntArray185[local25], Static80.anIntArray185[local25 + 1]);
								continue;
							}
						} else if (local216 < 3400) {
							if (local216 == 3300) {
								Static80.anIntArray185[local25++] = Static44.anInt1024;
								continue;
							}
							if (local216 == 3301) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = Static160.method2533(local766, local777);
								continue;
							}
							if (local216 == 3302) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = Static99.method1700(local766, local777);
								continue;
							}
							if (local216 == 3303) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = Static137.method2247(local766, local777);
								continue;
							}
							if (local216 == 3304) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static109.method1961(local766).anInt3407;
								continue;
							}
							if (local216 == 3305) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static122.anIntArray70[local766];
								continue;
							}
							if (local216 == 3306) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = anIntArray133[local766];
								continue;
							}
							if (local216 == 3307) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static12.anIntArray15[local766];
								continue;
							}
							if (local216 == 3308) {
								local777 = Static151.anInt3389 + (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 >> 7);
								local766 = Static147.anInt3309;
								local962 = Static134.anInt3066 + (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 >> 7);
								Static80.anIntArray185[local25++] = (local766 << 28) + (local777 << 14) + local962;
								continue;
							}
							if (local216 == 3309) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = local766 >> 14 & 0x3FFF;
								continue;
							}
							if (local216 == 3310) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = local766 >> 28;
								continue;
							}
							if (local216 == 3311) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = local766 & 0x3FFF;
								continue;
							}
							if (local216 == 3312) {
								Static80.anIntArray185[local25++] = Static109.aBoolean173 ? 1 : 0;
								continue;
							}
							if (local216 == 3313) {
								local25 -= 2;
								local777 = Static80.anIntArray185[local25 + 1];
								local766 = Static80.anIntArray185[local25] + 32768;
								Static80.anIntArray185[local25++] = Static160.method2533(local766, local777);
								continue;
							}
							if (local216 == 3314) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25] + 32768;
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = Static99.method1700(local766, local777);
								continue;
							}
							if (local216 == 3315) {
								local25 -= 2;
								local777 = Static80.anIntArray185[local25 + 1];
								local766 = Static80.anIntArray185[local25] + 32768;
								Static80.anIntArray185[local25++] = Static137.method2247(local766, local777);
								continue;
							}
							if (local216 == 3316) {
								if (Static91.anInt2031 >= 2) {
									Static80.anIntArray185[local25++] = Static91.anInt2031;
								} else {
									Static80.anIntArray185[local25++] = 0;
								}
								continue;
							}
							if (local216 == 3317) {
								Static80.anIntArray185[local25++] = Static94.anInt2079;
								continue;
							}
							if (local216 == 3318) {
								Static80.anIntArray185[local25++] = Static94.anInt2078;
								continue;
							}
							if (local216 == 3321) {
								Static80.anIntArray185[local25++] = Static10.anInt277;
								continue;
							}
							if (local216 == 3322) {
								Static80.anIntArray185[local25++] = Static38.anInt3121;
								continue;
							}
							if (local216 == 3323) {
								if (Static91.anInt2031 == 1) {
									Static80.anIntArray185[local25++] = 1;
								} else {
									Static80.anIntArray185[local25++] = 0;
								}
								continue;
							}
							if (local216 == 3324) {
								if (Static34.anInt832 >= 5 && Static34.anInt832 <= 9) {
									Static80.anIntArray185[local25++] = Static34.anInt832;
									continue;
								}
								Static80.anIntArray185[local25++] = 0;
								continue;
							}
							if (local216 == 3325) {
								if (Static12.anInt292 > 0) {
									Static80.anIntArray185[local25++] = 1;
								} else {
									Static80.anIntArray185[local25++] = 0;
								}
								continue;
							}
						} else if (local216 < 3500) {
							if (local216 == 3400) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								@Pc(6862) Class3_Sub1_Sub5 local6862 = Static13.method204(local766);
								for (local634 = 0; local634 < local6862.anInt595; local634++) {
									if (local6862.anIntArray62[local634] == local777) {
										Static154.aClass73Array23[local27++] = local6862.aClass73Array5[local634];
										local6862 = null;
										break;
									}
								}
								if (local6862 != null) {
									Static154.aClass73Array23[local27++] = local6862.aClass73_351;
								}
								continue;
							}
							if (local216 == 3408) {
								local25 -= 4;
								local777 = Static80.anIntArray185[local25 + 1];
								local766 = Static80.anIntArray185[local25];
								local962 = Static80.anIntArray185[local25 + 2];
								local634 = Static80.anIntArray185[local25 + 3];
								@Pc(6934) Class3_Sub1_Sub5 local6934 = Static13.method204(local962);
								if (local766 == local6934.anInt594 && local6934.anInt592 == local777) {
									for (local1002 = 0; local1002 < local6934.anInt595; local1002++) {
										if (local634 == local6934.anIntArray62[local1002]) {
											if (local777 == 115) {
												Static154.aClass73Array23[local27++] = local6934.aClass73Array5[local1002];
											} else {
												Static80.anIntArray185[local25++] = local6934.anIntArray60[local1002];
											}
											local6934 = null;
											break;
										}
									}
									if (local6934 != null) {
										if (local777 == 115) {
											Static154.aClass73Array23[local27++] = local6934.aClass73_351;
										} else {
											Static80.anIntArray185[local25++] = local6934.anInt588;
										}
									}
									continue;
								}
								if (local777 == 115) {
									Static154.aClass73Array23[local27++] = Static140.aClass73_1755;
								} else {
									Static80.anIntArray185[local25++] = 0;
								}
								continue;
							}
						} else if (local216 < 3700) {
							if (local216 == 3600) {
								if (Static150.anInt3582 == 0) {
									Static80.anIntArray185[local25++] = -2;
								} else if (Static150.anInt3582 == 1) {
									Static80.anIntArray185[local25++] = -1;
								} else {
									Static80.anIntArray185[local25++] = Static166.anInt3619;
								}
								continue;
							}
							if (local216 == 3601) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (Static150.anInt3582 == 2 && local766 < Static166.anInt3619) {
									Static154.aClass73Array23[local27++] = Static115.aClass73Array17[local766];
									continue;
								}
								Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								continue;
							}
							if (local216 == 3602) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (Static150.anInt3582 == 2 && Static166.anInt3619 > local766) {
									Static80.anIntArray185[local25++] = Static109.anIntArray283[local766];
									continue;
								}
								Static80.anIntArray185[local25++] = 0;
								continue;
							}
							if (local216 == 3603) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (Static150.anInt3582 == 2 && Static166.anInt3619 > local766) {
									Static80.anIntArray185[local25++] = Static85.anIntArray199[local766];
									continue;
								}
								Static80.anIntArray185[local25++] = 0;
								continue;
							}
							if (local216 == 3604) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local25--;
								local777 = Static80.anIntArray185[local25];
								Static14.method232(local777, local590);
								continue;
							}
							if (local216 == 3605) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static135.method2228(local590.method2425());
								continue;
							}
							if (local216 == 3606) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static169.method2644(local590.method2425());
								continue;
							}
							if (local216 == 3607) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static25.method542(local590.method2425());
								continue;
							}
							if (local216 == 3608) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static62.method1118(local590.method2425());
								continue;
							}
							if (local216 == 3609) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								if (local590.method2434(Static42.aClass73_281) || local590.method2434(Static111.aClass73_1520)) {
									local590 = local590.method2447(7);
								}
								Static80.anIntArray185[local25++] = Static76.method1296(local590) ? 1 : 0;
								continue;
							}
							if (local216 == 3611) {
								if (Static13.aClass73_191 == null) {
									Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								} else {
									Static154.aClass73Array23[local27++] = Static13.aClass73_191.method2451();
								}
								continue;
							}
							if (local216 == 3612) {
								if (Static13.aClass73_191 == null) {
									Static80.anIntArray185[local25++] = 0;
								} else {
									Static80.anIntArray185[local25++] = Static52.anInt1279;
								}
								continue;
							}
							if (local216 == 3613) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (Static13.aClass73_191 != null && Static52.anInt1279 > local766) {
									Static154.aClass73Array23[local27++] = Static139.aClass3_Sub5Array2[local766].aClass73_434.method2451();
									continue;
								}
								Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								continue;
							}
							if (local216 == 3614) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (Static13.aClass73_191 != null && Static52.anInt1279 > local766) {
									Static80.anIntArray185[local25++] = Static139.aClass3_Sub5Array2[local766].anInt750;
									continue;
								}
								Static80.anIntArray185[local25++] = 0;
								continue;
							}
							if (local216 == 3615) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (Static13.aClass73_191 != null && Static52.anInt1279 > local766) {
									Static80.anIntArray185[local25++] = Static139.aClass3_Sub5Array2[local766].aByte1;
									continue;
								}
								Static80.anIntArray185[local25++] = 0;
								continue;
							}
							if (local216 == 3616) {
								Static80.anIntArray185[local25++] = Static140.aByte9;
								continue;
							}
							if (local216 == 3617) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static130.method2164(local590);
								continue;
							}
							if (local216 == 3618) {
								Static80.anIntArray185[local25++] = Static88.aByte4;
								continue;
							}
							if (local216 == 3619) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static92.method1597(local590.method2425());
								continue;
							}
							if (local216 == 3620) {
								Static133.method2208();
								continue;
							}
							if (local216 == 3621) {
								if (Static150.anInt3582 == 0) {
									Static80.anIntArray185[local25++] = -1;
								} else {
									Static80.anIntArray185[local25++] = Static107.anInt2468;
								}
								continue;
							}
							if (local216 == 3622) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (Static150.anInt3582 != 0 && local766 < Static107.anInt2468) {
									Static154.aClass73Array23[local27++] = Static168.method2643(Static63.aLongArray1[local766]).method2451();
									continue;
								}
								Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								continue;
							}
							if (local216 == 3623) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								if (local590.method2434(Static42.aClass73_281) || local590.method2434(Static111.aClass73_1520)) {
									local590 = local590.method2447(7);
								}
								Static80.anIntArray185[local25++] = Static143.method2383(local590) ? 1 : 0;
								continue;
							}
							if (local216 == 3624) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (Static139.aClass3_Sub5Array2 != null && local766 < Static52.anInt1279 && Static139.aClass3_Sub5Array2[local766].aClass73_434.method2438(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass73_1521)) {
									Static80.anIntArray185[local25++] = 1;
									continue;
								}
								Static80.anIntArray185[local25++] = 0;
								continue;
							}
							if (local216 == 3625) {
								if (Static11.aClass73_158 == null) {
									Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								} else {
									Static154.aClass73Array23[local27++] = Static11.aClass73_158.method2451();
								}
								continue;
							}
						} else if (local216 < 4000) {
							if (local216 == 3903) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static169.aClass63Array1[local766].method2177();
								continue;
							}
							if (local216 == 3904) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static169.aClass63Array1[local766].anInt2982;
								continue;
							}
							if (local216 == 3905) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static169.aClass63Array1[local766].anInt2986;
								continue;
							}
							if (local216 == 3906) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static169.aClass63Array1[local766].anInt2974;
								continue;
							}
							if (local216 == 3907) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static169.aClass63Array1[local766].anInt2975;
								continue;
							}
							if (local216 == 3908) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static169.aClass63Array1[local766].anInt2980;
								continue;
							}
							if (local216 == 3910) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								local777 = Static169.aClass63Array1[local766].method2171();
								Static80.anIntArray185[local25++] = local777 == 0 ? 1 : 0;
								continue;
							}
							if (local216 == 3911) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								local777 = Static169.aClass63Array1[local766].method2171();
								Static80.anIntArray185[local25++] = local777 == 2 ? 1 : 0;
								continue;
							}
							if (local216 == 3912) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								local777 = Static169.aClass63Array1[local766].method2171();
								Static80.anIntArray185[local25++] = local777 == 5 ? 1 : 0;
								continue;
							}
						} else if (local216 < 4100) {
							if (local216 == 4000) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local766 + local777;
								continue;
							}
							if (local216 == 4001) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local766 - local777;
								continue;
							}
							if (local216 == 4002) {
								local25 -= 2;
								local777 = Static80.anIntArray185[local25 + 1];
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = local766 * local777;
								continue;
							}
							if (local216 == 4003) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local766 / local777;
								continue;
							}
							if (local216 == 4004) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = (int) (Math.random() * (double) local766);
								continue;
							}
							if (local216 == 4005) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = (int) (Math.random() * (double) (local766 + 1));
								continue;
							}
							if (local216 == 4006) {
								local25 -= 5;
								local766 = Static80.anIntArray185[local25];
								local962 = Static80.anIntArray185[local25 + 2];
								local634 = Static80.anIntArray185[local25 + 3];
								local777 = Static80.anIntArray185[local25 + 1];
								local656 = Static80.anIntArray185[local25 + 4];
								Static80.anIntArray185[local25++] = (local656 - local962) * (local777 - local766) / (local634 - local962) + local766;
								continue;
							}
							if (local216 == 4007) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local766 + local766 * local777 / 100;
								continue;
							}
							if (local216 == 4008) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local766 | 0x1 << local777;
								continue;
							}
							if (local216 == 4009) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = -(0x1 << local777) - 1 & local766;
								continue;
							}
							if (local216 == 4010) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = (0x1 << local777 & local766) == 0 ? 0 : 1;
								continue;
							}
							if (local216 == 4011) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local766 % local777;
								continue;
							}
							if (local216 == 4012) {
								local25 -= 2;
								local777 = Static80.anIntArray185[local25 + 1];
								local766 = Static80.anIntArray185[local25];
								if (local766 == 0) {
									Static80.anIntArray185[local25++] = 0;
								} else {
									Static80.anIntArray185[local25++] = (int) Math.pow((double) local766, (double) local777);
								}
								continue;
							}
							if (local216 == 4013) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								if (local766 == 0) {
									Static80.anIntArray185[local25++] = 0;
								} else if (local777 == 0) {
									Static80.anIntArray185[local25++] = Integer.MAX_VALUE;
								} else {
									Static80.anIntArray185[local25++] = (int) Math.pow((double) local766, 1.0D / (double) local777);
								}
								continue;
							}
							if (local216 == 4014) {
								local25 -= 2;
								local777 = Static80.anIntArray185[local25 + 1];
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = local766 & local777;
								continue;
							}
							if (local216 == 4015) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local766 | local777;
								continue;
							}
							if (local216 == 4016) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local777 <= local766 ? local777 : local766;
								continue;
							}
							if (local216 == 4017) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local777 >= local766 ? local777 : local766;
								continue;
							}
							if (local216 == 4018) {
								local25 -= 3;
								@Pc(4209) long local4209 = (long) Static80.anIntArray185[local25];
								@Pc(4216) long local4216 = (long) Static80.anIntArray185[local25 + 1];
								@Pc(4223) long local4223 = (long) Static80.anIntArray185[local25 + 2];
								Static80.anIntArray185[local25++] = (int) (local4209 * local4223 / local4216);
								continue;
							}
						} else if (local216 < 4200) {
							if (local216 == 4100) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local25--;
								local777 = Static80.anIntArray185[local25];
								Static154.aClass73Array23[local27++] = Static19.method372(new Class73[] { local590, Static154.method2485(local777) });
								continue;
							}
							if (local216 == 4101) {
								local27 -= 2;
								local590 = Static154.aClass73Array23[local27];
								local1621 = Static154.aClass73Array23[local27 + 1];
								Static154.aClass73Array23[local27++] = Static19.method372(new Class73[] { local590, local1621 });
								continue;
							}
							if (local216 == 4102) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local25--;
								local777 = Static80.anIntArray185[local25];
								Static154.aClass73Array23[local27++] = Static19.method372(new Class73[] { local590, Static148.method2421(local777) });
								continue;
							}
							if (local216 == 4103) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static154.aClass73Array23[local27++] = local590.method2419();
								continue;
							}
							if (local216 == 4104) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								@Pc(5660) long local5660 = (long) local766 * 86400000L + 1014768000000L;
								Static5.aCalendar1.setTime(new Date(local5660));
								local634 = Static5.aCalendar1.get(5);
								local656 = Static5.aCalendar1.get(2);
								local1002 = Static5.aCalendar1.get(1);
								Static154.aClass73Array23[local27++] = Static19.method372(new Class73[] { Static154.method2485(local634), Static33.aClass73_486, Static25.aClass73Array7[local656], Static33.aClass73_486, Static154.method2485(local1002) });
								continue;
							}
							if (local216 == 4105) {
								local27 -= 2;
								local1621 = Static154.aClass73Array23[local27 + 1];
								local590 = Static154.aClass73Array23[local27];
								if (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass52_2 != null && Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass52_2.aBoolean147) {
									Static154.aClass73Array23[local27++] = local1621;
									continue;
								}
								Static154.aClass73Array23[local27++] = local590;
								continue;
							}
							if (local216 == 4106) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static154.aClass73Array23[local27++] = Static154.method2485(local766);
								continue;
							}
							if (local216 == 4107) {
								local27 -= 2;
								Static80.anIntArray185[local25++] = Static154.aClass73Array23[local27].method2424(Static154.aClass73Array23[local27 + 1]);
								continue;
							}
							@Pc(5822) Class3_Sub1_Sub3_Sub1_Sub1 local5822;
							@Pc(5817) byte[] local5817;
							if (local216 == 4108) {
								local25 -= 2;
								local777 = Static80.anIntArray185[local25];
								local962 = Static80.anIntArray185[local25 + 1];
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local5817 = Static179.aClass13_Sub1_20.method348(local962, 0);
								local5822 = new Class3_Sub1_Sub3_Sub1_Sub1(local5817);
								Static80.anIntArray185[local25++] = local5822.method1052(local590, local777);
								continue;
							}
							if (local216 == 4109) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local25 -= 2;
								local777 = Static80.anIntArray185[local25];
								local962 = Static80.anIntArray185[local25 + 1];
								local5817 = Static179.aClass13_Sub1_20.method348(local962, 0);
								local5822 = new Class3_Sub1_Sub3_Sub1_Sub1(local5817);
								Static80.anIntArray185[local25++] = local5822.method1077(local590, local777);
								continue;
							}
							if (local216 == 4110) {
								local27 -= 2;
								local590 = Static154.aClass73Array23[local27];
								local1621 = Static154.aClass73Array23[local27 + 1];
								local25--;
								if (Static80.anIntArray185[local25] == 1) {
									Static154.aClass73Array23[local27++] = local590;
								} else {
									Static154.aClass73Array23[local27++] = local1621;
								}
								continue;
							}
							if (local216 == 4111) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								Static154.aClass73Array23[local27++] = Static21.method1055(local590);
								continue;
							}
							if (local216 == 4112) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local25--;
								local777 = Static80.anIntArray185[local25];
								Static154.aClass73Array23[local27++] = local590.method2432(local777);
								continue;
							}
							if (local216 == 4113) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static139.method1768(local766) ? 1 : 0;
								continue;
							}
							if (local216 == 4114) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static112.method2031(local766) ? 1 : 0;
								continue;
							}
							if (local216 == 4115) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static160.method2529(local766) ? 1 : 0;
								continue;
							}
							if (local216 == 4116) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static67.method1187(local766) ? 1 : 0;
								continue;
							}
							if (local216 == 4117) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								if (local590 == null) {
									Static80.anIntArray185[local25++] = 0;
								} else {
									Static80.anIntArray185[local25++] = local590.method2435();
								}
								continue;
							}
							if (local216 == 4118) {
								local25 -= 2;
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local962 = Static80.anIntArray185[local25 + 1];
								local777 = Static80.anIntArray185[local25];
								Static154.aClass73Array23[local27++] = local590.method2413(local962, local777);
								continue;
							}
							if (local216 == 4119) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local1621 = Static116.method2047(local590.method2435());
								@Pc(6111) boolean local6111 = false;
								for (local634 = 0; local590.method2435() > local634; local634++) {
									local656 = local590.method2444(local634);
									if (local656 == 60) {
										local6111 = true;
									} else if (local656 == 62) {
										local6111 = false;
									} else if (!local6111) {
										local1621.method2420(local656);
									}
								}
								local1621.method2409();
								Static154.aClass73Array23[local27++] = local1621;
								continue;
							}
							if (local216 == 4120) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local25 -= 2;
								local777 = Static80.anIntArray185[local25];
								local962 = Static80.anIntArray185[local25 + 1];
								Static80.anIntArray185[local25++] = local590.method2415(local962, local777);
								continue;
							}
							if (local216 == 4121) {
								local27 -= 2;
								local25--;
								local962 = Static80.anIntArray185[local25];
								local1621 = Static154.aClass73Array23[local27 + 1];
								local590 = Static154.aClass73Array23[local27];
								Static80.anIntArray185[local25++] = local590.method2410(local962, local1621);
								continue;
							}
						} else if (local216 < 4300) {
							if (local216 == 4200) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static154.aClass73Array23[local27++] = Static3.method42(local766).aClass73_680;
								continue;
							}
							@Pc(5227) Class3_Sub1_Sub7 local5227;
							if (local216 == 4201) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								local5227 = Static3.method42(local766);
								if (local777 >= 1 && local777 <= 5 && local5227.aClass73Array8[local777 - 1] != null) {
									Static154.aClass73Array23[local27++] = local5227.aClass73Array8[local777 - 1];
									continue;
								}
								Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								continue;
							}
							if (local216 == 4202) {
								local25 -= 2;
								local766 = Static80.anIntArray185[local25];
								local777 = Static80.anIntArray185[local25 + 1];
								local5227 = Static3.method42(local766);
								if (local777 >= 1 && local777 <= 5 && local5227.aClass73Array9[local777 - 1] != null) {
									Static154.aClass73Array23[local27++] = local5227.aClass73Array9[local777 - 1];
									continue;
								}
								Static154.aClass73Array23[local27++] = Static61.aClass73_810;
								continue;
							}
							if (local216 == 4203) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static3.method42(local766).anInt1208;
								continue;
							}
							if (local216 == 4204) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static3.method42(local766).anInt1216 == 1 ? 1 : 0;
								continue;
							}
							@Pc(5368) Class3_Sub1_Sub7 local5368;
							if (local216 == 4205) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								local5368 = Static3.method42(local766);
								if (local5368.anInt1204 == -1 && local5368.anInt1222 >= 0) {
									Static80.anIntArray185[local25++] = local5368.anInt1222;
									continue;
								}
								Static80.anIntArray185[local25++] = local766;
								continue;
							}
							if (local216 == 4206) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								local5368 = Static3.method42(local766);
								if (local5368.anInt1204 >= 0 && local5368.anInt1222 >= 0) {
									Static80.anIntArray185[local25++] = local5368.anInt1222;
									continue;
								}
								Static80.anIntArray185[local25++] = local766;
								continue;
							}
							if (local216 == 4207) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								Static80.anIntArray185[local25++] = Static3.method42(local766).aBoolean83 ? 1 : 0;
								continue;
							}
							if (local216 == 4210) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local25--;
								local777 = Static80.anIntArray185[local25];
								Static100.method1726(local590, local777 == 1);
								Static80.anIntArray185[local25++] = Static50.anInt1168;
								continue;
							}
							if (local216 == 4211) {
								if (Static175.aShortArray37 != null && Static50.anInt1168 > Static104.anInt2353) {
									Static80.anIntArray185[local25++] = Static175.aShortArray37[Static104.anInt2353++] & 0xFFFF;
									continue;
								}
								Static80.anIntArray185[local25++] = -1;
								continue;
							}
							if (local216 == 4212) {
								Static104.anInt2353 = 0;
								continue;
							}
						} else if (local216 < 5100) {
							if (local216 == 5000) {
								Static80.anIntArray185[local25++] = Static28.anInt749;
								continue;
							}
							if (local216 == 5001) {
								local25 -= 3;
								Static28.anInt749 = Static80.anIntArray185[local25];
								Static116.anInt2764 = Static80.anIntArray185[local25 + 1];
								Static103.anInt2327 = Static80.anIntArray185[local25 + 2];
								Static139.aClass3_Sub12_Sub1_3.method1400(127);
								Static139.aClass3_Sub12_Sub1_3.method1383(Static28.anInt749);
								Static139.aClass3_Sub12_Sub1_3.method1383(Static116.anInt2764);
								Static139.aClass3_Sub12_Sub1_3.method1383(Static103.anInt2327);
								continue;
							}
							if (local216 == 5002) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								local25 -= 2;
								local777 = Static80.anIntArray185[local25];
								local962 = Static80.anIntArray185[local25 + 1];
								Static139.aClass3_Sub12_Sub1_3.method1400(66);
								Static139.aClass3_Sub12_Sub1_3.method1382(local590.method2425());
								Static139.aClass3_Sub12_Sub1_3.method1383(local777 - 1);
								Static139.aClass3_Sub12_Sub1_3.method1383(local962);
								continue;
							}
							if (local216 == 5003) {
								local1621 = null;
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (local766 < 100) {
									local1621 = Static102.aClass73Array14[local766];
								}
								if (local1621 == null) {
									local1621 = Static61.aClass73_810;
								}
								Static154.aClass73Array23[local27++] = local1621;
								continue;
							}
							if (local216 == 5004) {
								local777 = -1;
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (local766 < 100 && Static102.aClass73Array14[local766] != null) {
									local777 = Static116.anIntArray302[local766];
								}
								Static80.anIntArray185[local25++] = local777;
								continue;
							}
							if (local216 == 5005) {
								Static80.anIntArray185[local25++] = Static116.anInt2764;
								continue;
							}
							if (local216 == 5008) {
								local27--;
								local590 = Static154.aClass73Array23[local27];
								if (local590.method2434(Static32.aClass73_482)) {
									Static42.method360(local590);
								} else {
									local1621 = local590.method2419();
									@Pc(4449) byte local4449 = 0;
									if (local1621.method2434(Static17.aClass73_2021)) {
										local590 = local590.method2447(Static17.aClass73_2021.method2435());
										local4449 = 0;
									} else if (local1621.method2434(Static16.aClass73_273)) {
										local4449 = 1;
										local590 = local590.method2447(Static16.aClass73_273.method2435());
									} else if (local1621.method2434(Static164.aClass73_1936)) {
										local4449 = 2;
										local590 = local590.method2447(Static164.aClass73_1936.method2435());
									} else if (local1621.method2434(Static6.aClass73_110)) {
										local590 = local590.method2447(Static6.aClass73_110.method2435());
										local4449 = 3;
									} else if (local1621.method2434(Static31.aClass73_472)) {
										local4449 = 4;
										local590 = local590.method2447(Static31.aClass73_472.method2435());
									} else if (local1621.method2434(Static12.aClass73_169)) {
										local590 = local590.method2447(Static12.aClass73_169.method2435());
										local4449 = 5;
									} else if (local1621.method2434(Static59.aClass73_1528)) {
										local590 = local590.method2447(Static59.aClass73_1528.method2435());
										local4449 = 6;
									} else if (local1621.method2434(Static118.aClass73_2101)) {
										local590 = local590.method2447(Static118.aClass73_2101.method2435());
										local4449 = 7;
									} else if (local1621.method2434(Static55.aClass73_712)) {
										local590 = local590.method2447(Static55.aClass73_712.method2435());
										local4449 = 8;
									} else if (local1621.method2434(Static105.aClass73_1368)) {
										local4449 = 9;
										local590 = local590.method2447(Static105.aClass73_1368.method2435());
									} else if (local1621.method2434(Static45.aClass73_619)) {
										local590 = local590.method2447(Static45.aClass73_619.method2435());
										local4449 = 10;
									} else if (local1621.method2434(Static67.aClass73_830)) {
										local590 = local590.method2447(Static67.aClass73_830.method2435());
										local4449 = 11;
									} else if (Static104.anInt2351 != 0) {
										if (local1621.method2434(Static17.aClass73_2020)) {
											local4449 = 0;
											local590 = local590.method2447(Static17.aClass73_2020.method2435());
										} else if (local1621.method2434(Static16.aClass73_274)) {
											local4449 = 1;
											local590 = local590.method2447(Static16.aClass73_274.method2435());
										} else if (local1621.method2434(Static164.aClass73_1944)) {
											local590 = local590.method2447(Static164.aClass73_1944.method2435());
											local4449 = 2;
										} else if (local1621.method2434(Static6.aClass73_109)) {
											local590 = local590.method2447(Static6.aClass73_109.method2435());
											local4449 = 3;
										} else if (local1621.method2434(Static31.aClass73_476)) {
											local590 = local590.method2447(Static31.aClass73_476.method2435());
											local4449 = 4;
										} else if (local1621.method2434(Static12.aClass73_165)) {
											local4449 = 5;
											local590 = local590.method2447(Static12.aClass73_165.method2435());
										} else if (local1621.method2434(Static59.aClass73_1527)) {
											local4449 = 6;
											local590 = local590.method2447(Static59.aClass73_1527.method2435());
										} else if (local1621.method2434(Static118.aClass73_2098)) {
											local4449 = 7;
											local590 = local590.method2447(Static118.aClass73_2098.method2435());
										} else if (local1621.method2434(Static55.aClass73_708)) {
											local590 = local590.method2447(Static55.aClass73_708.method2435());
											local4449 = 8;
										} else if (local1621.method2434(Static105.aClass73_1363)) {
											local590 = local590.method2447(Static105.aClass73_1363.method2435());
											local4449 = 9;
										} else if (local1621.method2434(Static45.aClass73_614)) {
											local590 = local590.method2447(Static45.aClass73_614.method2435());
											local4449 = 10;
										} else if (local1621.method2434(Static67.aClass73_829)) {
											local4449 = 11;
											local590 = local590.method2447(Static67.aClass73_829.method2435());
										}
									}
									@Pc(4835) byte local4835 = 0;
									local1621 = local590.method2419();
									if (local1621.method2434(Static113.aClass73_1535)) {
										local4835 = 1;
										local590 = local590.method2447(Static113.aClass73_1535.method2435());
									} else if (local1621.method2434(Static175.aClass73_2035)) {
										local4835 = 2;
										local590 = local590.method2447(Static175.aClass73_2035.method2435());
									} else if (local1621.method2434(Static66.aClass73_823)) {
										local590 = local590.method2447(Static66.aClass73_823.method2435());
										local4835 = 3;
									} else if (local1621.method2434(Static96.aClass73_1220)) {
										local590 = local590.method2447(Static96.aClass73_1220.method2435());
										local4835 = 4;
									} else if (local1621.method2434(Static169.aClass73_1976)) {
										local590 = local590.method2447(Static169.aClass73_1976.method2435());
										local4835 = 5;
									} else if (Static104.anInt2351 != 0) {
										if (local1621.method2434(Static113.aClass73_1539)) {
											local4835 = 1;
											local590 = local590.method2447(Static113.aClass73_1539.method2435());
										} else if (local1621.method2434(Static175.aClass73_2038)) {
											local4835 = 2;
											local590 = local590.method2447(Static175.aClass73_2038.method2435());
										} else if (local1621.method2434(Static66.aClass73_825)) {
											local590 = local590.method2447(Static66.aClass73_825.method2435());
											local4835 = 3;
										} else if (local1621.method2434(Static96.aClass73_1221)) {
											local4835 = 4;
											local590 = local590.method2447(Static96.aClass73_1221.method2435());
										} else if (local1621.method2434(Static169.aClass73_1979)) {
											local4835 = 5;
											local590 = local590.method2447(Static169.aClass73_1979.method2435());
										}
									}
									Static139.aClass3_Sub12_Sub1_3.method1400(91);
									Static139.aClass3_Sub12_Sub1_3.method1383(0);
									local656 = Static139.aClass3_Sub12_Sub1_3.anInt1793;
									Static139.aClass3_Sub12_Sub1_3.method1383(local4449);
									Static139.aClass3_Sub12_Sub1_3.method1383(local4835);
									Static44.method786(local590, Static139.aClass3_Sub12_Sub1_3);
									Static139.aClass3_Sub12_Sub1_3.method1362(Static139.aClass3_Sub12_Sub1_3.anInt1793 - local656);
								}
								continue;
							}
							if (local216 == 5009) {
								local27 -= 2;
								local590 = Static154.aClass73Array23[local27];
								local1621 = Static154.aClass73Array23[local27 + 1];
								Static139.aClass3_Sub12_Sub1_3.method1400(238);
								Static139.aClass3_Sub12_Sub1_3.method1383(0);
								local962 = Static139.aClass3_Sub12_Sub1_3.anInt1793;
								Static139.aClass3_Sub12_Sub1_3.method1382(local590.method2425());
								Static44.method786(local1621, Static139.aClass3_Sub12_Sub1_3);
								Static139.aClass3_Sub12_Sub1_3.method1362(Static139.aClass3_Sub12_Sub1_3.anInt1793 - local962);
								continue;
							}
							if (local216 == 5010) {
								local1621 = null;
								local25--;
								local766 = Static80.anIntArray185[local25];
								if (local766 < 100) {
									local1621 = Static125.aClass73Array19[local766];
								}
								if (local1621 == null) {
									local1621 = Static61.aClass73_810;
								}
								Static154.aClass73Array23[local27++] = local1621;
								continue;
							}
							if (local216 == 5011) {
								local25--;
								local766 = Static80.anIntArray185[local25];
								local1621 = null;
								if (local766 < 100) {
									local1621 = Static150.aClass73Array25[local766];
								}
								if (local1621 == null) {
									local1621 = Static61.aClass73_810;
								}
								Static154.aClass73Array23[local27++] = local1621;
								continue;
							}
							if (local216 == 5015) {
								if (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1 == null || Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass73_1521 == null) {
									local590 = Static12.aClass73_171;
								} else {
									local590 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass73_1521;
								}
								Static154.aClass73Array23[local27++] = local590;
								continue;
							}
							if (local216 == 5016) {
								Static80.anIntArray185[local25++] = Static103.anInt2327;
								continue;
							}
							if (local216 == 5017) {
								Static80.anIntArray185[local25++] = Static50.anInt1147;
								continue;
							}
						}
					}
				} else {
					if (local216 >= 2000) {
						local25--;
						local1098 = Static80.method1396(Static80.anIntArray185[local25]);
						local216 -= 1000;
					} else {
						local1098 = local939 ? Static84.aClass83_9 : Static39.aClass83_7;
					}
					if (local216 == 1000) {
						local25 -= 2;
						local1098.anInt3667 = Static80.anIntArray185[local25];
						local1098.anInt3707 = Static80.anIntArray185[local25 + 1];
						Static60.method1104(local1098);
						continue;
					}
					if (local216 == 1001) {
						local25 -= 2;
						local1098.anInt3670 = Static80.anIntArray185[local25];
						local1098.anInt3708 = Static80.anIntArray185[local25 + 1];
						Static60.method1104(local1098);
						continue;
					}
					if (local216 == 1003) {
						local25--;
						@Pc(7732) boolean local7732 = Static80.anIntArray185[local25] == 1;
						if (local1098.aBoolean249 != local7732) {
							local1098.aBoolean249 = local7732;
							Static60.method1104(local1098);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7757) Exception local7757) {
			if (local18.aClass73_376 == null) {
				if (Static90.anInt2026 != 0) {
					Static135.method2234(0, Static92.aClass73_1164, Static61.aClass73_810);
				}
				Static29.method571(local7757, "CS2 - scr:" + local18.aLong183 + " op:" + local37);
			} else {
				@Pc(7764) Class73 local7764 = Static116.method2047(30);
				local7764.method2443(Static131.aClass73_1665).method2443(local18.aClass73_376);
				for (local51 = Static68.anInt1578 - 1; local51 >= 0; local51--) {
					local7764.method2443(Static31.aClass73_475).method2443(Static148.aClass47Array1[local51].aClass3_Sub1_Sub6_1.aClass73_376);
				}
				if (local37 == 40) {
					local64 = local35[local29];
					local7764.method2443(Static72.aClass73_885).method2443(Static154.method2485(local64));
				}
				if (Static90.anInt2026 != 0) {
					Static135.method2234(0, Static19.method372(new Class73[] { Static11.aClass73_161, local18.aClass73_376 }), Static61.aClass73_810);
				}
				Static29.method571(local7757, "CS2 - scr:" + local18.aLong183 + " op:" + local37 + new String(local7764.method2416()));
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!cb;BI)V")
	public static void method967(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static2.aClass3_Sub12_1 == null) {
			Static126.method2143(255, true, 0, (byte) 0, null, 255);
			Static162.aClass13_Sub1Array1[arg1] = arg0;
		} else {
			Static2.aClass3_Sub12_1.anInt1793 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static2.aClass3_Sub12_1.method1373();
			@Pc(20) int local20 = Static2.aClass3_Sub12_1.method1373();
			arg0.method376(local20, local16);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIII)V")
	public static void method968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg2; local11 <= arg1 + arg2; local11++) {
			for (@Pc(15) int local15 = arg0; local15 <= arg0 + arg3; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static65.aByteArrayArrayArray3[0][local15][local11] = 127;
					if (local15 == arg0 && local15 > 0) {
						Static65.anIntArrayArrayArray5[0][local15][local11] = Static65.anIntArrayArrayArray5[0][local15 - 1][local11];
					}
					if (local15 == arg0 + arg3 && local15 < 103) {
						Static65.anIntArrayArrayArray5[0][local15][local11] = Static65.anIntArrayArrayArray5[0][local15 + 1][local11];
					}
					if (arg2 == local11 && local11 > 0) {
						Static65.anIntArrayArrayArray5[0][local15][local11] = Static65.anIntArrayArrayArray5[0][local15][local11 - 1];
					}
					if (arg1 + arg2 == local11 && local11 < 103) {
						Static65.anIntArrayArrayArray5[0][local15][local11] = Static65.anIntArrayArrayArray5[0][local15][local11 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method969() {
		aClass73_707 = null;
		aClass73_706 = null;
		anIntArray133 = null;
		aClass3_Sub12_5 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!f;ILclient!f;)I")
	public static int method970(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(1) int local1 = 0;
		if (arg0.method365(Static12.aClass73_167, Static12.aClass73_164)) {
			local1++;
		}
		if (arg1.method365(Static12.aClass73_167, Static120.aClass73_1590)) {
			local1++;
		}
		if (arg1.method365(Static12.aClass73_167, Static158.aClass73_1894)) {
			local1++;
		}
		if (arg1.method365(Static12.aClass73_167, Static144.aClass73_1881)) {
			local1++;
		}
		if (arg1.method365(Static12.aClass73_167, Static79.aClass73_947)) {
			local1++;
		}
		if (arg1.method365(Static12.aClass73_167, Static17.aClass73_2018)) {
			local1++;
		}
		arg1.method365(Static12.aClass73_167, aClass73_706);
		arg1.method365(Static12.aClass73_167, Static57.aClass73_732);
		arg1.method365(Static12.aClass73_167, Static26.aClass73_415);
		arg1.method365(Static12.aClass73_167, Static146.aClass73_1809);
		arg1.method365(Static12.aClass73_167, Static90.aClass73_1119);
		return local1;
	}
}
