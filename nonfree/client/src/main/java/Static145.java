import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "Lclient!c;")
	public static Class10 aClass10_115;

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1003 = Static38.method685("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
	public static int anInt3425 = 0;

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1004 = Static38.method685("Hierhin gehen");

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
	public static void method2245() {
		@Pc(1) Class46 local1 = Static74.aClass46_1;
		synchronized (Static74.aClass46_1) {
			Static51.anInt1408 = Static39.anInt1125;
			Static69.anInt1736 = Static160.anInt600;
			Static77.anInt1906 = Static121.anInt2821;
			Static19.anInt509 = Static149.anInt3474;
			Static155.anInt3959 = Static10.anInt245;
			Static5.anInt84 = Static49.anInt1366;
			Static153.aLong205 = Static58.aLong81;
			Static149.anInt3474 = 0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZ)Lclient!ai;")
	private static Class6 method2246(@OriginalArg(0) int arg0) {
		return Static135.method2098(true, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
	public static void method2247() {
		aClass6_1003 = null;
		aClass6_1004 = null;
		aClass10_115 = null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!ad;)V")
	public static void method2248(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		@Pc(4) Object[] local4 = arg1.anObjectArray1;
		@Pc(14) int local14 = (Integer) local4[0];
		@Pc(18) Class2_Sub3_Sub12 local18 = Static21.method379(local14);
		if (local18 == null) {
			return;
		}
		Static129.anInt4157 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(32) int[] local32 = local18.anIntArray237;
		@Pc(43) int[] local43 = local18.anIntArray234;
		@Pc(45) byte local45 = -1;
		@Pc(59) int local59;
		@Pc(72) int local72;
		try {
			@Pc(47) int local47 = 0;
			Static105.anIntArray216 = new int[local18.anInt2770];
			Static5.aClass6Array1 = new Class6[local18.anInt2774];
			@Pc(57) int local57 = 0;
			for (local59 = 1; local59 < local4.length; local59++) {
				if (local4[local59] instanceof Integer) {
					local72 = (Integer) local4[local59];
					if (local72 == -2147483647) {
						local72 = arg1.anInt85;
					}
					if (local72 == -2147483646) {
						local72 = arg1.anInt83;
					}
					if (local72 == -2147483645) {
						local72 = arg1.aClass87_1 == null ? -1 : arg1.aClass87_1.anInt4085;
					}
					if (local72 == -2147483644) {
						local72 = arg1.anInt82;
					}
					if (local72 == -2147483643) {
						local72 = arg1.aClass87_1 == null ? -1 : arg1.aClass87_1.anInt4105;
					}
					if (local72 == -2147483642) {
						local72 = arg1.aClass87_2 == null ? -1 : arg1.aClass87_2.anInt4085;
					}
					if (local72 == -2147483641) {
						local72 = arg1.aClass87_2 == null ? -1 : arg1.aClass87_2.anInt4105;
					}
					if (local72 == -2147483640) {
						local72 = arg1.anInt86;
					}
					if (local72 == -2147483639) {
						local72 = arg1.anInt81;
					}
					Static105.anIntArray216[local47++] = local72;
				} else if (local4[local59] instanceof Class6) {
					@Pc(175) Class6 local175 = (Class6) local4[local59];
					if (local175.method131(Static167.aClass6_1170)) {
						local175 = arg1.aClass6_44;
					}
					Static5.aClass6Array1[local57++] = local175;
				}
			}
			local72 = 0;
			label2181: while (true) {
				local72++;
				if (arg0 < local72) {
					throw new RuntimeException("slow");
				}
				local27++;
				@Pc(217) int local217 = local32[local27];
				@Pc(775) int local775;
				@Pc(629) int local629;
				@Pc(650) int local650;
				@Pc(781) int local781;
				@Pc(587) Class6 local587;
				if (local217 < 100) {
					if (local217 == 0) {
						Static5.anIntArray2[local25++] = local43[local27];
						continue;
					}
					@Pc(243) int local243;
					if (local217 == 1) {
						local243 = local43[local27];
						Static5.anIntArray2[local25++] = Static11.anIntArray9[local243];
						continue;
					}
					if (local217 == 2) {
						local243 = local43[local27];
						local25--;
						Static11.anIntArray9[local243] = Static5.anIntArray2[local25];
						continue;
					}
					if (local217 == 3) {
						Static34.aClass6Array6[local29++] = local18.aClass6Array15[local27];
						continue;
					}
					if (local217 == 6) {
						local27 += local43[local27];
						continue;
					}
					if (local217 == 7) {
						local25 -= 2;
						if (Static5.anIntArray2[local25 + 1] != Static5.anIntArray2[local25]) {
							local27 += local43[local27];
						}
						continue;
					}
					if (local217 == 8) {
						local25 -= 2;
						if (Static5.anIntArray2[local25 + 1] == Static5.anIntArray2[local25]) {
							local27 += local43[local27];
						}
						continue;
					}
					if (local217 == 9) {
						local25 -= 2;
						if (Static5.anIntArray2[local25 + 1] > Static5.anIntArray2[local25]) {
							local27 += local43[local27];
						}
						continue;
					}
					if (local217 == 10) {
						local25 -= 2;
						if (Static5.anIntArray2[local25] > Static5.anIntArray2[local25 + 1]) {
							local27 += local43[local27];
						}
						continue;
					}
					if (local217 == 21) {
						if (Static129.anInt4157 == 0) {
							return;
						}
						@Pc(406) Class79 local406 = Static57.aClass79Array1[--Static129.anInt4157];
						Static105.anIntArray216 = local406.anIntArray361;
						local18 = local406.aClass2_Sub3_Sub12_1;
						local43 = local18.anIntArray234;
						local27 = local406.anInt3647;
						local32 = local18.anIntArray237;
						Static5.aClass6Array1 = local406.aClass6Array19;
						continue;
					}
					if (local217 == 25) {
						local243 = local43[local27];
						Static5.anIntArray2[local25++] = Static182.method2812(local243);
						continue;
					}
					if (local217 == 27) {
						local243 = local43[local27];
						local25--;
						Static19.method374(local243, Static5.anIntArray2[local25]);
						continue;
					}
					if (local217 == 31) {
						local25 -= 2;
						if (Static5.anIntArray2[local25 + 1] >= Static5.anIntArray2[local25]) {
							local27 += local43[local27];
						}
						continue;
					}
					if (local217 == 32) {
						local25 -= 2;
						if (Static5.anIntArray2[local25 + 1] <= Static5.anIntArray2[local25]) {
							local27 += local43[local27];
						}
						continue;
					}
					if (local217 == 33) {
						Static5.anIntArray2[local25++] = Static105.anIntArray216[local43[local27]];
						continue;
					}
					@Pc(533) int local533;
					if (local217 == 34) {
						local533 = local43[local27];
						local25--;
						Static105.anIntArray216[local533] = Static5.anIntArray2[local25];
						continue;
					}
					if (local217 == 35) {
						Static34.aClass6Array6[local29++] = Static5.aClass6Array1[local43[local27]];
						continue;
					}
					if (local217 == 36) {
						local533 = local43[local27];
						local29--;
						Static5.aClass6Array1[local533] = Static34.aClass6Array6[local29];
						continue;
					}
					if (local217 == 37) {
						local243 = local43[local27];
						local29 -= local243;
						local587 = Static171.method2713(local243, Static34.aClass6Array6, local29);
						Static34.aClass6Array6[local29++] = local587;
						continue;
					}
					if (local217 == 38) {
						local25--;
						continue;
					}
					if (local217 == 39) {
						local29--;
						continue;
					}
					if (local217 == 40) {
						local243 = local43[local27];
						@Pc(619) Class2_Sub3_Sub12 local619 = Static21.method379(local243);
						@Pc(623) int[] local623 = new int[local619.anInt2770];
						@Pc(627) Class6[] local627 = new Class6[local619.anInt2774];
						for (local629 = 0; local629 < local619.anInt2772; local629++) {
							local623[local629] = Static5.anIntArray2[local629 + local25 - local619.anInt2772];
						}
						for (local650 = 0; local650 < local619.anInt2776; local650++) {
							local627[local650] = Static34.aClass6Array6[local650 + local29 - local619.anInt2776];
						}
						local25 -= local619.anInt2772;
						local29 -= local619.anInt2776;
						@Pc(687) Class79 local687 = new Class79();
						local687.aClass2_Sub3_Sub12_1 = local18;
						local687.anIntArray361 = Static105.anIntArray216;
						local687.aClass6Array19 = Static5.aClass6Array1;
						local687.anInt3647 = local27;
						if (Static129.anInt4157 >= Static57.aClass79Array1.length) {
							throw new RuntimeException();
						}
						local18 = local619;
						Static57.aClass79Array1[Static129.anInt4157++] = local687;
						Static105.anIntArray216 = local623;
						local27 = -1;
						local32 = local619.anIntArray237;
						Static5.aClass6Array1 = local627;
						local43 = local619.anIntArray234;
						continue;
					}
					if (local217 == 42) {
						Static5.anIntArray2[local25++] = Static137.anIntArray290[local43[local27]];
						continue;
					}
					if (local217 == 43) {
						local533 = local43[local27];
						local25--;
						Static137.anIntArray290[local533] = Static5.anIntArray2[local25];
						continue;
					}
					if (local217 == 44) {
						local25--;
						local775 = Static5.anIntArray2[local25];
						local781 = local43[local27] & 0xFFFF;
						local243 = local43[local27] >> 16;
						if (local775 >= 0 && local775 <= 5000) {
							Static90.anIntArray379[local243] = local775;
							@Pc(802) byte local802 = -1;
							if (local781 == 105) {
								local802 = 0;
							}
							local629 = 0;
							while (true) {
								if (local775 <= local629) {
									continue label2181;
								}
								Static141.anIntArrayArray56[local243][local629] = local802;
								local629++;
							}
						}
						throw new RuntimeException();
					}
					if (local217 == 45) {
						local243 = local43[local27];
						local25--;
						local781 = Static5.anIntArray2[local25];
						if (local781 >= 0 && Static90.anIntArray379[local243] > local781) {
							Static5.anIntArray2[local25++] = Static141.anIntArrayArray56[local243][local781];
							continue;
						}
						throw new RuntimeException();
					}
					if (local217 == 46) {
						local25 -= 2;
						local243 = local43[local27];
						local781 = Static5.anIntArray2[local25];
						if (local781 >= 0 && local781 < Static90.anIntArray379[local243]) {
							Static141.anIntArrayArray56[local243][local781] = Static5.anIntArray2[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local217 == 47) {
						@Pc(912) Class6 local912 = Static172.aClass6Array23[local43[local27]];
						if (local912 == null) {
							local912 = Static107.aClass6_732;
						}
						Static34.aClass6Array6[local29++] = local912;
						continue;
					}
					if (local217 == 48) {
						local533 = local43[local27];
						local29--;
						Static172.aClass6Array23[local533] = Static34.aClass6Array6[local29];
						continue;
					}
				}
				@Pc(946) boolean local946;
				if (local43[local27] == 1) {
					local946 = true;
				} else {
					local946 = false;
				}
				@Pc(978) Class87 local978;
				@Pc(1897) int local1897;
				@Pc(1259) int local1259;
				@Pc(6300) Class87 local6300;
				@Pc(6317) Class87 local6317;
				if (local217 < 1000) {
					if (local217 == 100) {
						local25 -= 3;
						local775 = Static5.anIntArray2[local25 + 1];
						local1897 = Static5.anIntArray2[local25 + 2];
						local781 = Static5.anIntArray2[local25];
						if (local775 == 0) {
							throw new RuntimeException();
						}
						local6300 = Static57.method940(local781);
						if (local6300.aClass87Array2 == null) {
							local6300.aClass87Array2 = new Class87[local1897 + 1];
						}
						if (local6300.aClass87Array2.length <= local1897) {
							@Pc(7562) Class87[] local7562 = new Class87[local1897 + 1];
							for (local1259 = 0; local1259 < local6300.aClass87Array2.length; local1259++) {
								local7562[local1259] = local6300.aClass87Array2[local1259];
							}
							local6300.aClass87Array2 = local7562;
						}
						if (local1897 > 0 && local6300.aClass87Array2[local1897 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1897 - 1));
						}
						@Pc(7611) Class87 local7611 = new Class87();
						local7611.aBoolean174 = true;
						local7611.anInt4105 = local1897;
						local7611.anInt4116 = local775;
						local7611.anInt4074 = local7611.anInt4085 = local6300.anInt4085;
						local6300.aClass87Array2[local1897] = local7611;
						if (local946) {
							Static131.aClass87_10 = local7611;
						} else {
							Static102.aClass87_8 = local7611;
						}
						Static151.method2327(local6300);
						continue;
					}
					@Pc(7675) Class87 local7675;
					if (local217 == 101) {
						local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
						if (local978.anInt4105 == -1) {
							if (local946) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local7675 = Static57.method940(local978.anInt4085);
						local7675.aClass87Array2[local978.anInt4105] = null;
						Static151.method2327(local7675);
						continue;
					}
					if (local217 == 102) {
						local25--;
						local978 = Static57.method940(Static5.anIntArray2[local25]);
						local978.aClass87Array2 = null;
						Static151.method2327(local978);
						continue;
					}
					if (local217 == 200) {
						local25 -= 2;
						local781 = Static5.anIntArray2[local25];
						local775 = Static5.anIntArray2[local25 + 1];
						local6317 = Static72.method1126(local781, local775);
						if (local6317 != null && local775 != -1) {
							Static5.anIntArray2[local25++] = 1;
							if (local946) {
								Static131.aClass87_10 = local6317;
							} else {
								Static102.aClass87_8 = local6317;
							}
							continue;
						}
						Static5.anIntArray2[local25++] = 0;
						continue;
					}
					if (local217 == 201) {
						local25--;
						local781 = Static5.anIntArray2[local25];
						local7675 = Static57.method940(local781);
						if (local7675 == null) {
							Static5.anIntArray2[local25++] = 0;
						} else {
							Static5.anIntArray2[local25++] = 1;
							if (local946) {
								Static131.aClass87_10 = local7675;
							} else {
								Static102.aClass87_8 = local7675;
							}
						}
						continue;
					}
				} else if ((local217 < 1000 || local217 >= 1100) && (local217 < 2000 || local217 >= 2100)) {
					@Pc(1151) Class6 local1151;
					if (local217 >= 1100 && local217 < 1200 || local217 >= 2100 && local217 < 2200) {
						if (local217 < 2000) {
							local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
						} else {
							local25--;
							local978 = Static57.method940(Static5.anIntArray2[local25]);
							local217 -= 1000;
						}
						if (local217 == 1100) {
							local25 -= 2;
							local978.anInt4083 = Static5.anIntArray2[local25];
							if (local978.anInt4083 > local978.anInt4118 - local978.anInt4092) {
								local978.anInt4083 = local978.anInt4118 - local978.anInt4092;
							}
							if (local978.anInt4083 < 0) {
								local978.anInt4083 = 0;
							}
							local978.anInt4124 = Static5.anIntArray2[local25 + 1];
							if (local978.anInt4106 - local978.anInt4133 < local978.anInt4124) {
								local978.anInt4124 = local978.anInt4106 - local978.anInt4133;
							}
							if (local978.anInt4124 < 0) {
								local978.anInt4124 = 0;
							}
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1101) {
							local25--;
							local978.anInt4076 = Static5.anIntArray2[local25];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1102) {
							local25--;
							local978.aBoolean164 = Static5.anIntArray2[local25] == 1;
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1103) {
							local25--;
							local978.anInt4121 = Static5.anIntArray2[local25];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1104) {
							local25--;
							local978.anInt4111 = Static5.anIntArray2[local25];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1105) {
							local25--;
							local978.anInt4129 = Static5.anIntArray2[local25];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1106) {
							local25--;
							local978.anInt4108 = Static5.anIntArray2[local25];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1107) {
							local25--;
							local978.aBoolean171 = Static5.anIntArray2[local25] == 1;
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1108) {
							local978.anInt4090 = 1;
							local25--;
							local978.anInt4071 = Static5.anIntArray2[local25];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1109) {
							local25 -= 6;
							local978.anInt4099 = Static5.anIntArray2[local25];
							local978.anInt4123 = Static5.anIntArray2[local25 + 1];
							local978.anInt4081 = Static5.anIntArray2[local25 + 2];
							local978.anInt4126 = Static5.anIntArray2[local25 + 3];
							local978.anInt4080 = Static5.anIntArray2[local25 + 4];
							local978.anInt4078 = Static5.anIntArray2[local25 + 5];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1110) {
							local25--;
							local775 = Static5.anIntArray2[local25];
							if (local978.anInt4132 != local775) {
								local978.anInt4097 = 0;
								local978.anInt4119 = 0;
								local978.anInt4132 = local775;
								Static151.method2327(local978);
							}
							continue;
						}
						if (local217 == 1111) {
							local25--;
							local978.aBoolean170 = Static5.anIntArray2[local25] == 1;
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1112) {
							local29--;
							local1151 = Static34.aClass6Array6[local29];
							if (!local1151.method131(local978.aClass6_1242)) {
								local978.aClass6_1242 = local1151;
								Static151.method2327(local978);
							}
							continue;
						}
						if (local217 == 1113) {
							local25--;
							local978.anInt4063 = Static5.anIntArray2[local25];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1114) {
							local25 -= 3;
							local978.anInt4103 = Static5.anIntArray2[local25];
							local978.anInt4093 = Static5.anIntArray2[local25 + 1];
							local978.anInt4107 = Static5.anIntArray2[local25 + 2];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1115) {
							local25--;
							local978.aBoolean166 = Static5.anIntArray2[local25] == 1;
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1116) {
							local25--;
							local978.anInt4100 = Static5.anIntArray2[local25];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1117) {
							local25--;
							local978.anInt4086 = Static5.anIntArray2[local25];
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1118) {
							local25--;
							local978.aBoolean167 = Static5.anIntArray2[local25] == 1;
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1119) {
							local25--;
							local978.aBoolean173 = Static5.anIntArray2[local25] == 1;
							Static151.method2327(local978);
							continue;
						}
						if (local217 == 1120) {
							local25 -= 2;
							local978.anInt4118 = Static5.anIntArray2[local25];
							local978.anInt4106 = Static5.anIntArray2[local25 + 1];
							Static151.method2327(local978);
							continue;
						}
					} else if (local217 >= 1200 && local217 < 1300 || !(local217 < 2200 || local217 >= 2300)) {
						if (local217 < 2000) {
							local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
						} else {
							local25--;
							local978 = Static57.method940(Static5.anIntArray2[local25]);
							local217 -= 1000;
						}
						Static151.method2327(local978);
						if (local217 == 1200) {
							local25 -= 2;
							local1897 = Static5.anIntArray2[local25 + 1];
							local775 = Static5.anIntArray2[local25];
							local978.anInt4131 = local1897;
							local978.anInt4060 = local775;
							@Pc(6906) Class2_Sub3_Sub10 local6906 = Static92.method1502(local775);
							local978.anInt4078 = local6906.anInt2010;
							local978.anInt4080 = local6906.anInt2031;
							local978.anInt4081 = local6906.anInt2035;
							if (local978.anInt4092 > 0) {
								local978.anInt4078 = local978.anInt4078 * 32 / local978.anInt4092;
							}
							local978.anInt4123 = local6906.anInt2004;
							local978.anInt4099 = local6906.anInt2007;
							local978.anInt4126 = local6906.anInt2023;
							continue;
						}
						if (local217 == 1201) {
							local978.anInt4090 = 2;
							local25--;
							local978.anInt4071 = Static5.anIntArray2[local25];
							continue;
						}
						if (local217 == 1202) {
							local978.anInt4090 = 3;
							local978.anInt4071 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass55_1.method1711();
							continue;
						}
						if (local217 == 1203) {
							local978.anInt4090 = 6;
							local25--;
							local978.anInt4071 = Static5.anIntArray2[local25];
							continue;
						}
						if (local217 == 1204) {
							local978.anInt4090 = 5;
							local25--;
							local978.anInt4071 = Static5.anIntArray2[local25];
							continue;
						}
					} else if ((local217 < 1300 || local217 >= 1400) && (local217 < 2300 || local217 >= 2400)) {
						if (local217 >= 1400 && local217 < 1500 || local217 >= 2400 && local217 < 2500) {
							if (local217 < 2000) {
								local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
							} else {
								local25--;
								local978 = Static57.method940(Static5.anIntArray2[local25]);
								local217 -= 1000;
							}
							local29--;
							local1151 = Static34.aClass6Array6[local29];
							@Pc(1153) int[] local1153 = null;
							if (local1151.method107() > 0 && local1151.method128(local1151.method107() - 1) == 89) {
								local25--;
								local629 = Static5.anIntArray2[local25];
								if (local629 > 0) {
									local1153 = new int[local629];
									while (local629-- > 0) {
										local25--;
										local1153[local629] = Static5.anIntArray2[local25];
									}
								}
								local1151 = local1151.method111(local1151.method107() - 1, 0);
							}
							@Pc(1214) Object[] local1214 = new Object[local1151.method107() + 1];
							for (local650 = local1214.length - 1; local650 >= 1; local650--) {
								if (local1151.method128(local650 - 1) == 115) {
									local29--;
									local1214[local650] = Static34.aClass6Array6[local29];
								} else {
									local25--;
									local1214[local650] = Integer.valueOf(Static5.anIntArray2[local25]);
								}
							}
							local25--;
							local1259 = Static5.anIntArray2[local25];
							if (local1259 == -1) {
								local1214 = null;
							} else {
								local1214[0] = Integer.valueOf(local1259);
							}
							local978.aBoolean169 = true;
							if (local217 == 1402) {
								local978.anObjectArray17 = local1214;
							}
							if (local217 == 1404) {
								local978.anObjectArray27 = local1214;
							}
							if (local217 == 1401) {
								local978.anObjectArray6 = local1214;
							}
							if (local217 == 1417) {
								local978.anObjectArray28 = local1214;
							}
							if (local217 == 1422) {
								local978.anObjectArray5 = local1214;
							}
							if (local217 == 1416) {
								local978.anObjectArray7 = local1214;
							}
							if (local217 == 1421) {
								local978.anObjectArray16 = local1214;
							}
							if (local217 == 1409) {
								local978.anObjectArray4 = local1214;
							}
							if (local217 == 1414) {
								local978.anIntArray397 = local1153;
								local978.anObjectArray8 = local1214;
							}
							if (local217 == 1425) {
								local978.anObjectArray26 = local1214;
							}
							if (local217 == 1415) {
								local978.anIntArray394 = local1153;
								local978.anObjectArray14 = local1214;
							}
							if (local217 == 1410) {
								local978.anObjectArray25 = local1214;
							}
							if (local217 == 1406) {
								local978.anObjectArray29 = local1214;
							}
							if (local217 == 1419) {
								local978.anObjectArray20 = local1214;
							}
							if (local217 == 1423) {
								local978.anObjectArray9 = local1214;
							}
							if (local217 == 1405) {
								local978.anObjectArray11 = local1214;
							}
							if (local217 == 1418) {
								local978.anObjectArray12 = local1214;
							}
							if (local217 == 1408) {
								local978.anObjectArray21 = local1214;
							}
							if (local217 == 1424) {
								local978.anObjectArray24 = local1214;
							}
							if (local217 == 1420) {
								local978.anObjectArray13 = local1214;
							}
							if (local217 == 1412) {
								local978.anObjectArray10 = local1214;
							}
							if (local217 == 1407) {
								local978.anObjectArray19 = local1214;
								local978.anIntArray395 = local1153;
							}
							if (local217 == 1400) {
								local978.anObjectArray15 = local1214;
							}
							if (local217 == 1403) {
								local978.anObjectArray23 = local1214;
							}
							if (local217 == 1411) {
								local978.anObjectArray18 = local1214;
							}
							continue;
						}
						if (local217 < 1600) {
							local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
							if (local217 == 1500) {
								Static5.anIntArray2[local25++] = local978.anInt4079;
								continue;
							}
							if (local217 == 1501) {
								Static5.anIntArray2[local25++] = local978.anInt4091;
								continue;
							}
							if (local217 == 1502) {
								Static5.anIntArray2[local25++] = local978.anInt4092;
								continue;
							}
							if (local217 == 1503) {
								Static5.anIntArray2[local25++] = local978.anInt4133;
								continue;
							}
							if (local217 == 1504) {
								Static5.anIntArray2[local25++] = local978.aBoolean163 ? 1 : 0;
								continue;
							}
							if (local217 == 1505) {
								Static5.anIntArray2[local25++] = local978.anInt4074;
								continue;
							}
						} else if (local217 < 1700) {
							local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
							if (local217 == 1600) {
								Static5.anIntArray2[local25++] = local978.anInt4083;
								continue;
							}
							if (local217 == 1601) {
								Static5.anIntArray2[local25++] = local978.anInt4124;
								continue;
							}
							if (local217 == 1602) {
								Static34.aClass6Array6[local29++] = local978.aClass6_1242;
								continue;
							}
							if (local217 == 1603) {
								Static5.anIntArray2[local25++] = local978.anInt4118;
								continue;
							}
							if (local217 == 1604) {
								Static5.anIntArray2[local25++] = local978.anInt4106;
								continue;
							}
							if (local217 == 1605) {
								Static5.anIntArray2[local25++] = local978.anInt4078;
								continue;
							}
							if (local217 == 1606) {
								Static5.anIntArray2[local25++] = local978.anInt4081;
								continue;
							}
							if (local217 == 1607) {
								Static5.anIntArray2[local25++] = local978.anInt4080;
								continue;
							}
							if (local217 == 1608) {
								Static5.anIntArray2[local25++] = local978.anInt4126;
								continue;
							}
							if (local217 == 1609) {
								Static5.anIntArray2[local25++] = local978.anInt4121;
								continue;
							}
						} else if (local217 < 1800) {
							local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
							if (local217 == 1700) {
								Static5.anIntArray2[local25++] = local978.anInt4060;
								continue;
							}
							if (local217 == 1701) {
								if (local978.anInt4060 == -1) {
									Static5.anIntArray2[local25++] = 0;
								} else {
									Static5.anIntArray2[local25++] = local978.anInt4131;
								}
								continue;
							}
							if (local217 == 1702) {
								Static5.anIntArray2[local25++] = local978.anInt4105;
								continue;
							}
						} else if (local217 < 1900) {
							local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
							if (local217 == 1800) {
								Static5.anIntArray2[local25++] = Static149.method2286(Static179.method2802(local978));
								continue;
							}
							if (local217 == 1801) {
								local25--;
								local775 = Static5.anIntArray2[local25];
								local775--;
								if (local978.aClass6Array24 != null && local775 < local978.aClass6Array24.length && local978.aClass6Array24[local775] != null) {
									Static34.aClass6Array6[local29++] = local978.aClass6Array24[local775];
									continue;
								}
								Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								continue;
							}
							if (local217 == 1802) {
								if (local978.aClass6_1217 == null) {
									Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								} else {
									Static34.aClass6Array6[local29++] = local978.aClass6_1217;
								}
								continue;
							}
						} else if (local217 < 2600) {
							local25--;
							local978 = Static57.method940(Static5.anIntArray2[local25]);
							if (local217 == 2500) {
								Static5.anIntArray2[local25++] = local978.anInt4079;
								continue;
							}
							if (local217 == 2501) {
								Static5.anIntArray2[local25++] = local978.anInt4091;
								continue;
							}
							if (local217 == 2502) {
								Static5.anIntArray2[local25++] = local978.anInt4092;
								continue;
							}
							if (local217 == 2503) {
								Static5.anIntArray2[local25++] = local978.anInt4133;
								continue;
							}
							if (local217 == 2504) {
								Static5.anIntArray2[local25++] = local978.aBoolean163 ? 1 : 0;
								continue;
							}
							if (local217 == 2505) {
								Static5.anIntArray2[local25++] = local978.anInt4074;
								continue;
							}
						} else if (local217 < 2700) {
							local25--;
							local978 = Static57.method940(Static5.anIntArray2[local25]);
							if (local217 == 2600) {
								Static5.anIntArray2[local25++] = local978.anInt4083;
								continue;
							}
							if (local217 == 2601) {
								Static5.anIntArray2[local25++] = local978.anInt4124;
								continue;
							}
							if (local217 == 2602) {
								Static34.aClass6Array6[local29++] = local978.aClass6_1242;
								continue;
							}
							if (local217 == 2603) {
								Static5.anIntArray2[local25++] = local978.anInt4118;
								continue;
							}
							if (local217 == 2604) {
								Static5.anIntArray2[local25++] = local978.anInt4106;
								continue;
							}
							if (local217 == 2605) {
								Static5.anIntArray2[local25++] = local978.anInt4078;
								continue;
							}
							if (local217 == 2606) {
								Static5.anIntArray2[local25++] = local978.anInt4081;
								continue;
							}
							if (local217 == 2607) {
								Static5.anIntArray2[local25++] = local978.anInt4080;
								continue;
							}
							if (local217 == 2608) {
								Static5.anIntArray2[local25++] = local978.anInt4126;
								continue;
							}
							if (local217 == 2609) {
								Static5.anIntArray2[local25++] = local978.anInt4121;
								continue;
							}
						} else if (local217 < 2800) {
							if (local217 == 2700) {
								local25--;
								local978 = Static57.method940(Static5.anIntArray2[local25]);
								Static5.anIntArray2[local25++] = local978.anInt4060;
								continue;
							}
							if (local217 == 2701) {
								local25--;
								local978 = Static57.method940(Static5.anIntArray2[local25]);
								if (local978.anInt4060 == -1) {
									Static5.anIntArray2[local25++] = 0;
								} else {
									Static5.anIntArray2[local25++] = local978.anInt4131;
								}
								continue;
							}
							if (local217 == 2702) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								@Pc(1855) Class2_Sub16 local1855 = (Class2_Sub16) Static148.aClass16_10.method479((long) local781);
								if (local1855 == null) {
									Static5.anIntArray2[local25++] = 0;
								} else {
									Static5.anIntArray2[local25++] = 1;
								}
								continue;
							}
							if (local217 == 2703) {
								local25--;
								local978 = Static57.method940(Static5.anIntArray2[local25]);
								if (local978.aClass87Array2 == null) {
									Static5.anIntArray2[local25++] = 0;
									continue;
								}
								local775 = local978.aClass87Array2.length;
								for (local1897 = 0; local1897 < local978.aClass87Array2.length; local1897++) {
									if (local978.aClass87Array2[local1897] == null) {
										local775 = local1897;
										break;
									}
								}
								Static5.anIntArray2[local25++] = local775;
								continue;
							}
							if (local217 == 2704 || local217 == 2705) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25];
								@Pc(1945) Class2_Sub16 local1945 = (Class2_Sub16) Static148.aClass16_10.method479((long) local781);
								if (local1945 != null && local775 == local1945.anInt2551) {
									Static5.anIntArray2[local25++] = 1;
									continue;
								}
								Static5.anIntArray2[local25++] = 0;
								continue;
							}
						} else if (local217 < 2900) {
							local25--;
							local978 = Static57.method940(Static5.anIntArray2[local25]);
							if (local217 == 2800) {
								Static5.anIntArray2[local25++] = Static149.method2286(Static179.method2802(local978));
								continue;
							}
							if (local217 == 2801) {
								local25--;
								local775 = Static5.anIntArray2[local25];
								local775--;
								if (local978.aClass6Array24 != null && local978.aClass6Array24.length > local775 && local978.aClass6Array24[local775] != null) {
									Static34.aClass6Array6[local29++] = local978.aClass6Array24[local775];
									continue;
								}
								Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								continue;
							}
							if (local217 == 2802) {
								if (local978.aClass6_1217 == null) {
									Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								} else {
									Static34.aClass6Array6[local29++] = local978.aClass6_1217;
								}
								continue;
							}
						} else if (local217 < 3200) {
							if (local217 == 3100) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static6.method932(0, local587, Static66.aClass6_489);
								continue;
							}
							if (local217 == 3101) {
								local25 -= 2;
								Static56.method1800(Static5.anIntArray2[local25 + 1], Static5.anIntArray2[local25], Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1);
								continue;
							}
							if (local217 == 3103) {
								Static126.method1964();
								continue;
							}
							if (local217 == 3104) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local775 = 0;
								if (local587.method116()) {
									local775 = local587.method122();
								}
								Static66.aClass2_Sub13_Sub1_2.method1455(95);
								Static66.aClass2_Sub13_Sub1_2.method1421(local775);
								continue;
							}
							if (local217 == 3105) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static66.aClass2_Sub13_Sub1_2.method1455(253);
								Static66.aClass2_Sub13_Sub1_2.method1418(local587.method129());
								continue;
							}
							if (local217 == 3106) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static66.aClass2_Sub13_Sub1_2.method1455(128);
								Static66.aClass2_Sub13_Sub1_2.method1416(local587.method107() + 1);
								Static66.aClass2_Sub13_Sub1_2.method1404(local587);
								continue;
							}
							if (local217 == 3107) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local29--;
								local1151 = Static34.aClass6Array6[local29];
								Static140.method2160(local781, local1151);
								continue;
							}
							if (local217 == 3108) {
								local25 -= 3;
								local1897 = Static5.anIntArray2[local25 + 2];
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25];
								local6300 = Static57.method940(local1897);
								Static67.method1070(local781, local6300, local775);
								continue;
							}
							if (local217 == 3109) {
								local25 -= 2;
								local6317 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static67.method1070(local781, local6317, local775);
								continue;
							}
							if (local217 == 3110) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static66.aClass2_Sub13_Sub1_2.method1455(201);
								Static66.aClass2_Sub13_Sub1_2.method1428(local781);
								continue;
							}
						} else if (local217 < 3300) {
							if (local217 == 3200) {
								local25 -= 3;
								Static117.method1874(Static5.anIntArray2[local25 + 2], Static5.anIntArray2[local25 + 1], Static5.anIntArray2[local25]);
								continue;
							}
							if (local217 == 3201) {
								local25--;
								Static94.method1530(Static5.anIntArray2[local25]);
								continue;
							}
							if (local217 == 3202) {
								local25 -= 2;
								Static86.method1465(Static5.anIntArray2[local25], Static5.anIntArray2[local25 + 1]);
								continue;
							}
						} else if (local217 < 3400) {
							if (local217 == 3300) {
								Static5.anIntArray2[local25++] = Static107.anInt2559;
								continue;
							}
							if (local217 == 3301) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = Static72.method1125(local781, local775);
								continue;
							}
							if (local217 == 3302) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = Static76.method1168(local781, local775);
								continue;
							}
							if (local217 == 3303) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static29.method520(local781, local775);
								continue;
							}
							if (local217 == 3304) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static171.method2717(local781).anInt2353;
								continue;
							}
							if (local217 == 3305) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static155.anIntArray385[local781];
								continue;
							}
							if (local217 == 3306) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static95.anIntArray178[local781];
								continue;
							}
							if (local217 == 3307) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static56.anIntArray226[local781];
								continue;
							}
							if (local217 == 3308) {
								local775 = (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 >> 7) + Static2.anInt66;
								local1897 = Static176.anInt4061 + (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 >> 7);
								local781 = Static36.anInt1020;
								Static5.anIntArray2[local25++] = (local775 << 14) + (local781 << 28) + local1897;
								continue;
							}
							if (local217 == 3309) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = local781 >> 14 & 0x3FFF;
								continue;
							}
							if (local217 == 3310) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = local781 >> 28;
								continue;
							}
							if (local217 == 3311) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = local781 & 0x3FFF;
								continue;
							}
							if (local217 == 3312) {
								Static5.anIntArray2[local25++] = Static19.aBoolean17 ? 1 : 0;
								continue;
							}
							if (local217 == 3313) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25] + 32768;
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = Static72.method1125(local781, local775);
								continue;
							}
							if (local217 == 3314) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25] + 32768;
								Static5.anIntArray2[local25++] = Static76.method1168(local781, local775);
								continue;
							}
							if (local217 == 3315) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25] + 32768;
								Static5.anIntArray2[local25++] = Static29.method520(local781, local775);
								continue;
							}
							if (local217 == 3316) {
								if (Static98.anInt2447 >= 2) {
									Static5.anIntArray2[local25++] = Static98.anInt2447;
								} else {
									Static5.anIntArray2[local25++] = 0;
								}
								continue;
							}
							if (local217 == 3317) {
								Static5.anIntArray2[local25++] = Static31.anInt772;
								continue;
							}
							if (local217 == 3318) {
								Static5.anIntArray2[local25++] = Static169.anInt3981;
								continue;
							}
							if (local217 == 3321) {
								Static5.anIntArray2[local25++] = Static135.anInt3141;
								continue;
							}
							if (local217 == 3322) {
								Static5.anIntArray2[local25++] = Static139.anInt3260;
								continue;
							}
							if (local217 == 3323) {
								if (Static98.anInt2447 == 1) {
									Static5.anIntArray2[local25++] = 1;
								} else {
									Static5.anIntArray2[local25++] = 0;
								}
								continue;
							}
							if (local217 == 3324) {
								if (Static97.anInt2400 >= 5 && Static97.anInt2400 <= 9) {
									Static5.anIntArray2[local25++] = Static97.anInt2400;
									continue;
								}
								Static5.anIntArray2[local25++] = 0;
								continue;
							}
							if (local217 == 3325) {
								if (Static97.anInt2398 > 0) {
									Static5.anIntArray2[local25++] = 1;
								} else {
									Static5.anIntArray2[local25++] = 0;
								}
								continue;
							}
						} else if (local217 < 3500) {
							if (local217 == 3400) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								@Pc(5477) Class2_Sub3_Sub9 local5477 = Static12.method206(local781);
								for (local629 = 0; local629 < local5477.anInt1975; local629++) {
									if (local5477.anIntArray143[local629] == local775) {
										Static34.aClass6Array6[local29++] = local5477.aClass6Array9[local629];
										local5477 = null;
										break;
									}
								}
								if (local5477 != null) {
									Static34.aClass6Array6[local29++] = local5477.aClass6_605;
								}
								continue;
							}
							if (local217 == 3408) {
								local25 -= 4;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								local629 = Static5.anIntArray2[local25 + 3];
								local1897 = Static5.anIntArray2[local25 + 2];
								@Pc(5545) Class2_Sub3_Sub9 local5545 = Static12.method206(local1897);
								if (local781 == local5545.anInt1976 && local5545.anInt1984 == local775) {
									for (local1259 = 0; local1259 < local5545.anInt1975; local1259++) {
										if (local629 == local5545.anIntArray143[local1259]) {
											if (local775 == 115) {
												Static34.aClass6Array6[local29++] = local5545.aClass6Array9[local1259];
											} else {
												Static5.anIntArray2[local25++] = local5545.anIntArray144[local1259];
											}
											local5545 = null;
											break;
										}
									}
									if (local5545 != null) {
										if (local775 == 115) {
											Static34.aClass6Array6[local29++] = local5545.aClass6_605;
										} else {
											Static5.anIntArray2[local25++] = local5545.anInt1977;
										}
									}
									continue;
								}
								if (local775 == 115) {
									Static34.aClass6Array6[local29++] = Static107.aClass6_732;
								} else {
									Static5.anIntArray2[local25++] = 0;
								}
								continue;
							}
						} else if (local217 < 3700) {
							if (local217 == 3600) {
								if (Static116.anInt2786 == 0) {
									Static5.anIntArray2[local25++] = -2;
								} else if (Static116.anInt2786 == 1) {
									Static5.anIntArray2[local25++] = -1;
								} else {
									Static5.anIntArray2[local25++] = Static111.anInt2637;
								}
								continue;
							}
							if (local217 == 3601) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								if (Static116.anInt2786 == 2 && Static111.anInt2637 > local781) {
									Static34.aClass6Array6[local29++] = Static118.aClass6Array16[local781];
									continue;
								}
								Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								continue;
							}
							if (local217 == 3602) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								if (Static116.anInt2786 == 2 && local781 < Static111.anInt2637) {
									Static5.anIntArray2[local25++] = Static41.anIntArray62[local781];
									continue;
								}
								Static5.anIntArray2[local25++] = 0;
								continue;
							}
							if (local217 == 3603) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								if (Static116.anInt2786 == 2 && local781 < Static111.anInt2637) {
									Static5.anIntArray2[local25++] = Static67.anIntArray110[local781];
									continue;
								}
								Static5.anIntArray2[local25++] = 0;
								continue;
							}
							if (local217 == 3604) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local25--;
								local775 = Static5.anIntArray2[local25];
								Static156.method2412(local775, local587);
								continue;
							}
							if (local217 == 3605) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static169.method2687(local587.method129());
								continue;
							}
							if (local217 == 3606) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static65.method1037(local587.method129());
								continue;
							}
							if (local217 == 3607) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static14.method299(local587.method129());
								continue;
							}
							if (local217 == 3608) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static81.method1301(local587.method129());
								continue;
							}
							if (local217 == 3609) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								if (local587.method103(Static159.aClass6_1117) || local587.method103(Static61.aClass6_436)) {
									local587 = local587.method119(7);
								}
								Static5.anIntArray2[local25++] = Static95.method1543(local587) ? 1 : 0;
								continue;
							}
							if (local217 == 3611) {
								if (Static55.aClass6_409 == null) {
									Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								} else {
									Static34.aClass6Array6[local29++] = Static55.aClass6_409.method106();
								}
								continue;
							}
							if (local217 == 3612) {
								if (Static55.aClass6_409 == null) {
									Static5.anIntArray2[local25++] = 0;
								} else {
									Static5.anIntArray2[local25++] = Static171.anInt4014;
								}
								continue;
							}
							if (local217 == 3613) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								if (Static55.aClass6_409 != null && local781 < Static171.anInt4014) {
									Static34.aClass6Array6[local29++] = Static65.aClass2_Sub5Array1[local781].aClass6_70.method106();
									continue;
								}
								Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								continue;
							}
							if (local217 == 3614) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								if (Static55.aClass6_409 != null && Static171.anInt4014 > local781) {
									Static5.anIntArray2[local25++] = Static65.aClass2_Sub5Array1[local781].anInt159;
									continue;
								}
								Static5.anIntArray2[local25++] = 0;
								continue;
							}
							if (local217 == 3615) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								if (Static55.aClass6_409 != null && Static171.anInt4014 > local781) {
									Static5.anIntArray2[local25++] = Static65.aClass2_Sub5Array1[local781].aByte1;
									continue;
								}
								Static5.anIntArray2[local25++] = 0;
								continue;
							}
							if (local217 == 3616) {
								Static5.anIntArray2[local25++] = Static130.aByte6;
								continue;
							}
							if (local217 == 3617) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static50.method890(local587);
								continue;
							}
							if (local217 == 3618) {
								Static5.anIntArray2[local25++] = Static38.aByte2;
								continue;
							}
							if (local217 == 3619) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static108.method1740(local587.method129());
								continue;
							}
							if (local217 == 3620) {
								Static17.method1591();
								continue;
							}
							if (local217 == 3621) {
								if (Static116.anInt2786 == 0) {
									Static5.anIntArray2[local25++] = -1;
								} else {
									Static5.anIntArray2[local25++] = Static68.anInt1729;
								}
								continue;
							}
							if (local217 == 3622) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								if (Static116.anInt2786 != 0 && local781 < Static68.anInt1729) {
									Static34.aClass6Array6[local29++] = Static49.method884(Static138.aLongArray6[local781]).method106();
									continue;
								}
								Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								continue;
							}
							if (local217 == 3623) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								if (local587.method103(Static159.aClass6_1117) || local587.method103(Static61.aClass6_436)) {
									local587 = local587.method119(7);
								}
								Static5.anIntArray2[local25++] = Static167.method2653(local587) ? 1 : 0;
								continue;
							}
							if (local217 == 3624) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								if (Static65.aClass2_Sub5Array1 != null && local781 < Static171.anInt4014 && Static65.aClass2_Sub5Array1[local781].aClass6_70.method137(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass6_244)) {
									Static5.anIntArray2[local25++] = 1;
									continue;
								}
								Static5.anIntArray2[local25++] = 0;
								continue;
							}
							if (local217 == 3625) {
								if (Static41.aClass6_327 == null) {
									Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								} else {
									Static34.aClass6Array6[local29++] = Static41.aClass6_327.method106();
								}
								continue;
							}
						} else if (local217 < 4000) {
							if (local217 == 3903) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static41.aClass54Array1[local781].method1698();
								continue;
							}
							if (local217 == 3904) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static41.aClass54Array1[local781].anInt2509;
								continue;
							}
							if (local217 == 3905) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static41.aClass54Array1[local781].anInt2506;
								continue;
							}
							if (local217 == 3906) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static41.aClass54Array1[local781].anInt2508;
								continue;
							}
							if (local217 == 3907) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static41.aClass54Array1[local781].anInt2503;
								continue;
							}
							if (local217 == 3908) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static41.aClass54Array1[local781].anInt2505;
								continue;
							}
							if (local217 == 3910) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local775 = Static41.aClass54Array1[local781].method1697();
								Static5.anIntArray2[local25++] = local775 == 0 ? 1 : 0;
								continue;
							}
							if (local217 == 3911) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local775 = Static41.aClass54Array1[local781].method1697();
								Static5.anIntArray2[local25++] = local775 == 2 ? 1 : 0;
								continue;
							}
							if (local217 == 3912) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local775 = Static41.aClass54Array1[local781].method1697();
								Static5.anIntArray2[local25++] = local775 == 5 ? 1 : 0;
								continue;
							}
							if (local217 == 3913) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local775 = Static41.aClass54Array1[local781].method1697();
								Static5.anIntArray2[local25++] = local775 == 1 ? 1 : 0;
								continue;
							}
						} else if (local217 < 4100) {
							if (local217 == 4000) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = local775 + local781;
								continue;
							}
							if (local217 == 4001) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = local781 - local775;
								continue;
							}
							if (local217 == 4002) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = local781 * local775;
								continue;
							}
							if (local217 == 4003) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = local781 / local775;
								continue;
							}
							if (local217 == 4004) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = (int) ((double) local781 * Math.random());
								continue;
							}
							if (local217 == 4005) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = (int) (Math.random() * (double) (local781 + 1));
								continue;
							}
							if (local217 == 4006) {
								local25 -= 5;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								local1897 = Static5.anIntArray2[local25 + 2];
								local650 = Static5.anIntArray2[local25 + 4];
								local629 = Static5.anIntArray2[local25 + 3];
								Static5.anIntArray2[local25++] = local781 + (local650 - local1897) * (local775 - local781) / (local629 - local1897);
								continue;
							}
							if (local217 == 4007) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = local781 + local775 * local781 / 100;
								continue;
							}
							if (local217 == 4008) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = local781 | 0x1 << local775;
								continue;
							}
							if (local217 == 4009) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = local781 & -(0x1 << local775) - 1;
								continue;
							}
							if (local217 == 4010) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = (0x1 << local775 & local781) == 0 ? 0 : 1;
								continue;
							}
							if (local217 == 4011) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = local781 % local775;
								continue;
							}
							if (local217 == 4012) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25];
								if (local781 == 0) {
									Static5.anIntArray2[local25++] = 0;
								} else {
									Static5.anIntArray2[local25++] = (int) Math.pow((double) local781, (double) local775);
								}
								continue;
							}
							if (local217 == 4013) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								if (local781 == 0) {
									Static5.anIntArray2[local25++] = 0;
								} else if (local775 == 0) {
									Static5.anIntArray2[local25++] = Integer.MAX_VALUE;
								} else {
									Static5.anIntArray2[local25++] = (int) Math.pow((double) local781, 1.0D / (double) local775);
								}
								continue;
							}
							if (local217 == 4014) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = local781 & local775;
								continue;
							}
							if (local217 == 4015) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = local775 | local781;
								continue;
							}
							if (local217 == 4016) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = local781 >= local775 ? local775 : local781;
								continue;
							}
							if (local217 == 4017) {
								local25 -= 2;
								local775 = Static5.anIntArray2[local25 + 1];
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = local781 > local775 ? local781 : local775;
								continue;
							}
							if (local217 == 4018) {
								local25 -= 3;
								@Pc(2828) long local2828 = (long) Static5.anIntArray2[local25 + 1];
								@Pc(2833) long local2833 = (long) Static5.anIntArray2[local25];
								@Pc(2840) long local2840 = (long) Static5.anIntArray2[local25 + 2];
								Static5.anIntArray2[local25++] = (int) (local2840 * local2833 / local2828);
								continue;
							}
						} else if (local217 < 4200) {
							if (local217 == 4100) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local25--;
								local775 = Static5.anIntArray2[local25];
								Static34.aClass6Array6[local29++] = Static58.method956(new Class6[] { local587, Static106.method2806(local775) });
								continue;
							}
							if (local217 == 4101) {
								local29 -= 2;
								local587 = Static34.aClass6Array6[local29];
								local1151 = Static34.aClass6Array6[local29 + 1];
								Static34.aClass6Array6[local29++] = Static58.method956(new Class6[] { local587, local1151 });
								continue;
							}
							if (local217 == 4102) {
								local25--;
								local775 = Static5.anIntArray2[local25];
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static34.aClass6Array6[local29++] = Static58.method956(new Class6[] { local587, method2246(local775) });
								continue;
							}
							if (local217 == 4103) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static34.aClass6Array6[local29++] = local587.method115();
								continue;
							}
							if (local217 == 4104) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								@Pc(4292) long local4292 = ((long) local781 + 11745L) * 86400000L;
								Static61.aCalendar1.setTime(new Date(local4292));
								local629 = Static61.aCalendar1.get(5);
								local650 = Static61.aCalendar1.get(2);
								local1259 = Static61.aCalendar1.get(1);
								Static34.aClass6Array6[local29++] = Static58.method956(new Class6[] { Static106.method2806(local629), Static82.aClass6_613, Static176.aClass6Array25[local650], Static82.aClass6_613, Static106.method2806(local1259) });
								continue;
							}
							if (local217 == 4105) {
								local29 -= 2;
								local587 = Static34.aClass6Array6[local29];
								local1151 = Static34.aClass6Array6[local29 + 1];
								if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass55_1 != null && Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass55_1.aBoolean102) {
									Static34.aClass6Array6[local29++] = local1151;
									continue;
								}
								Static34.aClass6Array6[local29++] = local587;
								continue;
							}
							if (local217 == 4106) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static34.aClass6Array6[local29++] = Static106.method2806(local781);
								continue;
							}
							if (local217 == 4107) {
								local29 -= 2;
								Static5.anIntArray2[local25++] = Static34.aClass6Array6[local29].method108(Static34.aClass6Array6[local29 + 1]);
								continue;
							}
							@Pc(4452) Class2_Sub3_Sub2_Sub4_Sub1 local4452;
							@Pc(4447) byte[] local4447;
							if (local217 == 4108) {
								local25 -= 2;
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local775 = Static5.anIntArray2[local25];
								local1897 = Static5.anIntArray2[local25 + 1];
								local4447 = Static127.aClass10_Sub1_12.method1605(0, local1897);
								local4452 = new Class2_Sub3_Sub2_Sub4_Sub1(local4447);
								Static5.anIntArray2[local25++] = local4452.method2504(local587, local775);
								continue;
							}
							if (local217 == 4109) {
								local25 -= 2;
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local1897 = Static5.anIntArray2[local25 + 1];
								local775 = Static5.anIntArray2[local25];
								local4447 = Static127.aClass10_Sub1_12.method1605(0, local1897);
								local4452 = new Class2_Sub3_Sub2_Sub4_Sub1(local4447);
								Static5.anIntArray2[local25++] = local4452.method2523(local587, local775);
								continue;
							}
							if (local217 == 4110) {
								local29 -= 2;
								local587 = Static34.aClass6Array6[local29];
								local1151 = Static34.aClass6Array6[local29 + 1];
								local25--;
								if (Static5.anIntArray2[local25] == 1) {
									Static34.aClass6Array6[local29++] = local587;
								} else {
									Static34.aClass6Array6[local29++] = local1151;
								}
								continue;
							}
							if (local217 == 4111) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								Static34.aClass6Array6[local29++] = Static175.method2510(local587);
								continue;
							}
							if (local217 == 4112) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local25--;
								local775 = Static5.anIntArray2[local25];
								Static34.aClass6Array6[local29++] = local587.method105(local775);
								continue;
							}
							if (local217 == 4113) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static25.method462(local781) ? 1 : 0;
								continue;
							}
							if (local217 == 4114) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static35.method622(local781) ? 1 : 0;
								continue;
							}
							if (local217 == 4115) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static151.method2330(local781) ? 1 : 0;
								continue;
							}
							if (local217 == 4116) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static171.method2712(local781) ? 1 : 0;
								continue;
							}
							if (local217 == 4117) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								if (local587 == null) {
									Static5.anIntArray2[local25++] = 0;
								} else {
									Static5.anIntArray2[local25++] = local587.method107();
								}
								continue;
							}
							if (local217 == 4118) {
								local25 -= 2;
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local775 = Static5.anIntArray2[local25];
								local1897 = Static5.anIntArray2[local25 + 1];
								Static34.aClass6Array6[local29++] = local587.method111(local1897, local775);
								continue;
							}
							if (local217 == 4119) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								@Pc(4739) boolean local4739 = false;
								local1151 = Static7.method83(local587.method107());
								for (local629 = 0; local587.method107() > local629; local629++) {
									local650 = local587.method128(local629);
									if (local650 == 60) {
										local4739 = true;
									} else if (local650 == 62) {
										local4739 = false;
									} else if (!local4739) {
										local1151.method123(local650);
									}
								}
								local1151.method127();
								Static34.aClass6Array6[local29++] = local1151;
								continue;
							}
							if (local217 == 4120) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local25 -= 2;
								local775 = Static5.anIntArray2[local25];
								local1897 = Static5.anIntArray2[local25 + 1];
								Static5.anIntArray2[local25++] = local587.method118(local775, local1897);
								continue;
							}
							if (local217 == 4121) {
								local25--;
								local1897 = Static5.anIntArray2[local25];
								local29 -= 2;
								local587 = Static34.aClass6Array6[local29];
								local1151 = Static34.aClass6Array6[local29 + 1];
								Static5.anIntArray2[local25++] = local587.method134(local1897, local1151);
								continue;
							}
						} else if (local217 < 4300) {
							if (local217 == 4200) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static34.aClass6Array6[local29++] = Static92.method1502(local781).aClass6_612;
								continue;
							}
							@Pc(3845) Class2_Sub3_Sub10 local3845;
							if (local217 == 4201) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								local3845 = Static92.method1502(local781);
								if (local775 >= 1 && local775 <= 5 && local3845.aClass6Array11[local775 - 1] != null) {
									Static34.aClass6Array6[local29++] = local3845.aClass6Array11[local775 - 1];
									continue;
								}
								Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								continue;
							}
							if (local217 == 4202) {
								local25 -= 2;
								local781 = Static5.anIntArray2[local25];
								local775 = Static5.anIntArray2[local25 + 1];
								local3845 = Static92.method1502(local781);
								if (local775 >= 1 && local775 <= 5 && local3845.aClass6Array10[local775 - 1] != null) {
									Static34.aClass6Array6[local29++] = local3845.aClass6Array10[local775 - 1];
									continue;
								}
								Static34.aClass6Array6[local29++] = Static66.aClass6_489;
								continue;
							}
							if (local217 == 4203) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static92.method1502(local781).anInt2016;
								continue;
							}
							if (local217 == 4204) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static92.method1502(local781).anInt2000 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3992) Class2_Sub3_Sub10 local3992;
							if (local217 == 4205) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local3992 = Static92.method1502(local781);
								if (local3992.anInt2040 == -1 && local3992.anInt2033 >= 0) {
									Static5.anIntArray2[local25++] = local3992.anInt2033;
									continue;
								}
								Static5.anIntArray2[local25++] = local781;
								continue;
							}
							if (local217 == 4206) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local3992 = Static92.method1502(local781);
								if (local3992.anInt2040 >= 0 && local3992.anInt2033 >= 0) {
									Static5.anIntArray2[local25++] = local3992.anInt2033;
									continue;
								}
								Static5.anIntArray2[local25++] = local781;
								continue;
							}
							if (local217 == 4207) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								Static5.anIntArray2[local25++] = Static92.method1502(local781).aBoolean79 ? 1 : 0;
								continue;
							}
							if (local217 == 4210) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local25--;
								local775 = Static5.anIntArray2[local25];
								Static48.method883(local587, local775 == 1);
								Static5.anIntArray2[local25++] = Static102.anInt2504;
								continue;
							}
							if (local217 == 4211) {
								if (Static108.aShortArray24 != null && Static118.anInt2808 < Static102.anInt2504) {
									Static5.anIntArray2[local25++] = Static108.aShortArray24[Static118.anInt2808++] & 0xFFFF;
									continue;
								}
								Static5.anIntArray2[local25++] = -1;
								continue;
							}
							if (local217 == 4212) {
								Static118.anInt2808 = 0;
								continue;
							}
						} else if (local217 < 5100) {
							if (local217 == 5000) {
								Static5.anIntArray2[local25++] = Static28.anInt726;
								continue;
							}
							if (local217 == 5001) {
								local25 -= 3;
								Static28.anInt726 = Static5.anIntArray2[local25];
								Static24.anInt633 = Static5.anIntArray2[local25 + 1];
								Static92.anInt2281 = Static5.anIntArray2[local25 + 2];
								Static66.aClass2_Sub13_Sub1_2.method1455(119);
								Static66.aClass2_Sub13_Sub1_2.method1416(Static28.anInt726);
								Static66.aClass2_Sub13_Sub1_2.method1416(Static24.anInt633);
								Static66.aClass2_Sub13_Sub1_2.method1416(Static92.anInt2281);
								continue;
							}
							if (local217 == 5002) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								local25 -= 2;
								local775 = Static5.anIntArray2[local25];
								local1897 = Static5.anIntArray2[local25 + 1];
								Static66.aClass2_Sub13_Sub1_2.method1455(134);
								Static66.aClass2_Sub13_Sub1_2.method1418(local587.method129());
								Static66.aClass2_Sub13_Sub1_2.method1416(local775 - 1);
								Static66.aClass2_Sub13_Sub1_2.method1416(local1897);
								continue;
							}
							if (local217 == 5003) {
								local1151 = null;
								local25--;
								local781 = Static5.anIntArray2[local25];
								if (local781 < 100) {
									local1151 = Static24.aClass6Array3[local781];
								}
								if (local1151 == null) {
									local1151 = Static66.aClass6_489;
								}
								Static34.aClass6Array6[local29++] = local1151;
								continue;
							}
							if (local217 == 5004) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local775 = -1;
								if (local781 < 100 && Static24.aClass6Array3[local781] != null) {
									local775 = Static21.anIntArray28[local781];
								}
								Static5.anIntArray2[local25++] = local775;
								continue;
							}
							if (local217 == 5005) {
								Static5.anIntArray2[local25++] = Static24.anInt633;
								continue;
							}
							if (local217 == 5008) {
								local29--;
								local587 = Static34.aClass6Array6[local29];
								if (local587.method103(Static124.aClass6_835)) {
									Static129.method2797(local587);
								} else {
									local1151 = local587.method115();
									@Pc(3066) byte local3066 = 0;
									if (local1151.method103(Static180.aClass6_1269)) {
										local587 = local587.method119(Static180.aClass6_1269.method107());
										local3066 = 0;
									} else if (local1151.method103(Static51.aClass6_388)) {
										local587 = local587.method119(Static51.aClass6_388.method107());
										local3066 = 1;
									} else if (local1151.method103(Static141.aClass6_962)) {
										local3066 = 2;
										local587 = local587.method119(Static141.aClass6_962.method107());
									} else if (local1151.method103(Static24.aClass6_172)) {
										local3066 = 3;
										local587 = local587.method119(Static24.aClass6_172.method107());
									} else if (local1151.method103(Static101.aClass6_634)) {
										local3066 = 4;
										local587 = local587.method119(Static101.aClass6_634.method107());
									} else if (local1151.method103(Static104.aClass6_716)) {
										local3066 = 5;
										local587 = local587.method119(Static104.aClass6_716.method107());
									} else if (local1151.method103(Static182.aClass6_1276)) {
										local3066 = 6;
										local587 = local587.method119(Static182.aClass6_1276.method107());
									} else if (local1151.method103(Static46.aClass6_353)) {
										local587 = local587.method119(Static46.aClass6_353.method107());
										local3066 = 7;
									} else if (local1151.method103(Static86.aClass6_646)) {
										local3066 = 8;
										local587 = local587.method119(Static86.aClass6_646.method107());
									} else if (local1151.method103(Static28.aClass6_197)) {
										local3066 = 9;
										local587 = local587.method119(Static28.aClass6_197.method107());
									} else if (local1151.method103(Static35.aClass6_262)) {
										local3066 = 10;
										local587 = local587.method119(Static35.aClass6_262.method107());
									} else if (local1151.method103(Static96.aClass6_691)) {
										local587 = local587.method119(Static96.aClass6_691.method107());
										local3066 = 11;
									} else if (Static54.anInt1438 != 0) {
										if (local1151.method103(Static180.aClass6_1272)) {
											local587 = local587.method119(Static180.aClass6_1272.method107());
											local3066 = 0;
										} else if (local1151.method103(Static51.aClass6_384)) {
											local587 = local587.method119(Static51.aClass6_384.method107());
											local3066 = 1;
										} else if (local1151.method103(Static141.aClass6_968)) {
											local3066 = 2;
											local587 = local587.method119(Static141.aClass6_968.method107());
										} else if (local1151.method103(Static24.aClass6_170)) {
											local3066 = 3;
											local587 = local587.method119(Static24.aClass6_170.method107());
										} else if (local1151.method103(Static101.aClass6_632)) {
											local587 = local587.method119(Static101.aClass6_632.method107());
											local3066 = 4;
										} else if (local1151.method103(Static104.aClass6_717)) {
											local587 = local587.method119(Static104.aClass6_717.method107());
											local3066 = 5;
										} else if (local1151.method103(Static182.aClass6_1278)) {
											local3066 = 6;
											local587 = local587.method119(Static182.aClass6_1278.method107());
										} else if (local1151.method103(Static46.aClass6_354)) {
											local587 = local587.method119(Static46.aClass6_354.method107());
											local3066 = 7;
										} else if (local1151.method103(Static86.aClass6_647)) {
											local3066 = 8;
											local587 = local587.method119(Static86.aClass6_647.method107());
										} else if (local1151.method103(Static28.aClass6_200)) {
											local587 = local587.method119(Static28.aClass6_200.method107());
											local3066 = 9;
										} else if (local1151.method103(Static35.aClass6_264)) {
											local3066 = 10;
											local587 = local587.method119(Static35.aClass6_264.method107());
										} else if (local1151.method103(Static96.aClass6_688)) {
											local587 = local587.method119(Static96.aClass6_688.method107());
											local3066 = 11;
										}
									}
									@Pc(3455) byte local3455 = 0;
									local1151 = local587.method115();
									if (local1151.method103(Static149.aClass6_1018)) {
										local587 = local587.method119(Static149.aClass6_1018.method107());
										local3455 = 1;
									} else if (local1151.method103(Static86.aClass6_645)) {
										local587 = local587.method119(Static86.aClass6_645.method107());
										local3455 = 2;
									} else if (local1151.method103(Static122.aClass6_823)) {
										local587 = local587.method119(Static122.aClass6_823.method107());
										local3455 = 3;
									} else if (local1151.method103(Static177.aClass6_1248)) {
										local3455 = 4;
										local587 = local587.method119(Static177.aClass6_1248.method107());
									} else if (local1151.method103(Static121.aClass6_817)) {
										local3455 = 5;
										local587 = local587.method119(Static121.aClass6_817.method107());
									} else if (Static54.anInt1438 != 0) {
										if (local1151.method103(Static149.aClass6_1017)) {
											local3455 = 1;
											local587 = local587.method119(Static149.aClass6_1017.method107());
										} else if (local1151.method103(Static86.aClass6_651)) {
											local587 = local587.method119(Static86.aClass6_651.method107());
											local3455 = 2;
										} else if (local1151.method103(Static122.aClass6_822)) {
											local3455 = 3;
											local587 = local587.method119(Static122.aClass6_822.method107());
										} else if (local1151.method103(Static177.aClass6_1247)) {
											local3455 = 4;
											local587 = local587.method119(Static177.aClass6_1247.method107());
										} else if (local1151.method103(Static121.aClass6_815)) {
											local3455 = 5;
											local587 = local587.method119(Static121.aClass6_815.method107());
										}
									}
									Static66.aClass2_Sub13_Sub1_2.method1455(160);
									Static66.aClass2_Sub13_Sub1_2.method1416(0);
									local650 = Static66.aClass2_Sub13_Sub1_2.anInt2154;
									Static66.aClass2_Sub13_Sub1_2.method1416(local3066);
									Static66.aClass2_Sub13_Sub1_2.method1416(local3455);
									Static182.method2813(Static66.aClass2_Sub13_Sub1_2, local587);
									Static66.aClass2_Sub13_Sub1_2.method1424(Static66.aClass2_Sub13_Sub1_2.anInt2154 - local650);
								}
								continue;
							}
							if (local217 == 5009) {
								local29 -= 2;
								local1151 = Static34.aClass6Array6[local29 + 1];
								local587 = Static34.aClass6Array6[local29];
								Static66.aClass2_Sub13_Sub1_2.method1455(141);
								Static66.aClass2_Sub13_Sub1_2.method1416(0);
								local1897 = Static66.aClass2_Sub13_Sub1_2.anInt2154;
								Static66.aClass2_Sub13_Sub1_2.method1418(local587.method129());
								Static182.method2813(Static66.aClass2_Sub13_Sub1_2, local1151);
								Static66.aClass2_Sub13_Sub1_2.method1424(Static66.aClass2_Sub13_Sub1_2.anInt2154 - local1897);
								continue;
							}
							if (local217 == 5010) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local1151 = null;
								if (local781 < 100) {
									local1151 = Static56.aClass6Array14[local781];
								}
								if (local1151 == null) {
									local1151 = Static66.aClass6_489;
								}
								Static34.aClass6Array6[local29++] = local1151;
								continue;
							}
							if (local217 == 5011) {
								local25--;
								local781 = Static5.anIntArray2[local25];
								local1151 = null;
								if (local781 < 100) {
									local1151 = Static156.aClass6Array18[local781];
								}
								if (local1151 == null) {
									local1151 = Static66.aClass6_489;
								}
								Static34.aClass6Array6[local29++] = local1151;
								continue;
							}
							if (local217 == 5015) {
								if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1 == null || Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass6_244 == null) {
									local587 = Static9.aClass6_72;
								} else {
									local587 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass6_244;
								}
								Static34.aClass6Array6[local29++] = local587;
								continue;
							}
							if (local217 == 5016) {
								Static5.anIntArray2[local25++] = Static92.anInt2281;
								continue;
							}
							if (local217 == 5017) {
								Static5.anIntArray2[local25++] = Static152.anInt3507;
								continue;
							}
						}
					} else {
						if (local217 < 2000) {
							local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
						} else {
							local217 -= 1000;
							local25--;
							local978 = Static57.method940(Static5.anIntArray2[local25]);
						}
						if (local217 == 1300) {
							local25--;
							local775 = Static5.anIntArray2[local25] - 1;
							if (local775 >= 0 && local775 <= 9) {
								local29--;
								local978.method2765(Static34.aClass6Array6[local29], local775);
								continue;
							}
							local29--;
							continue;
						}
						if (local217 == 1301) {
							local25 -= 2;
							local775 = Static5.anIntArray2[local25];
							local1897 = Static5.anIntArray2[local25 + 1];
							local978.aClass87_13 = Static72.method1126(local775, local1897);
							continue;
						}
						if (local217 == 1302) {
							local25--;
							local978.aBoolean172 = Static5.anIntArray2[local25] == 1;
							continue;
						}
						if (local217 == 1303) {
							local25--;
							local978.anInt4109 = Static5.anIntArray2[local25];
							continue;
						}
						if (local217 == 1304) {
							local25--;
							local978.anInt4117 = Static5.anIntArray2[local25];
							continue;
						}
						if (local217 == 1305) {
							local29--;
							local978.aClass6_1217 = Static34.aClass6Array6[local29];
							continue;
						}
						if (local217 == 1306) {
							local29--;
							local978.aClass6_1220 = Static34.aClass6Array6[local29];
							continue;
						}
						if (local217 == 1307) {
							local978.aClass6Array24 = null;
							continue;
						}
					}
				} else {
					if (local217 < 2000) {
						local978 = local946 ? Static131.aClass87_10 : Static102.aClass87_8;
					} else {
						local25--;
						local978 = Static57.method940(Static5.anIntArray2[local25]);
						local217 -= 1000;
					}
					if (local217 == 1000) {
						local25 -= 2;
						local978.anInt4079 = Static5.anIntArray2[local25];
						local978.anInt4091 = Static5.anIntArray2[local25 + 1];
						Static151.method2327(local978);
						continue;
					}
					if (local217 == 1001) {
						local25 -= 2;
						local978.anInt4092 = Static5.anIntArray2[local25];
						local978.anInt4133 = Static5.anIntArray2[local25 + 1];
						Static151.method2327(local978);
						continue;
					}
					if (local217 == 1003) {
						local25--;
						@Pc(1047) boolean local1047 = Static5.anIntArray2[local25] == 1;
						if (local1047 != local978.aBoolean163) {
							local978.aBoolean163 = local1047;
							Static151.method2327(local978);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7796) Exception local7796) {
			if (local18.aClass6_792 == null) {
				if (Static115.anInt2775 != 0) {
					Static6.method932(0, Static70.aClass6_520, Static66.aClass6_489);
				}
				Static97.method1572(local7796, "CS2 - scr:" + local18.aLong241 + " op:" + local45);
			} else {
				@Pc(7826) Class6 local7826 = Static7.method83(30);
				local7826.method117(Static21.aClass6_147).method117(local18.aClass6_792);
				for (local59 = Static129.anInt4157 - 1; local59 >= 0; local59--) {
					local7826.method117(Static73.aClass6_534).method117(Static57.aClass79Array1[local59].aClass2_Sub3_Sub12_1.aClass6_792);
				}
				if (local45 == 40) {
					local72 = local43[local27];
					local7826.method117(Static179.aClass6_1261).method117(Static106.method2806(local72));
				}
				if (Static115.anInt2775 != 0) {
					Static6.method932(0, Static58.method956(new Class6[] { Static142.aClass6_976, local18.aClass6_792 }), Static66.aClass6_489);
				}
				Static97.method1572(local7796, "CS2 - scr:" + local18.aLong241 + " op:" + local45 + new String(local7826.method112()));
			}
		}
	}
}
