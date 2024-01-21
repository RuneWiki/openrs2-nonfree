import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public static int anInt369 = -1;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Lclient!s;")
	public static final Class86 aClass86_6 = new Class86(64);

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "[I")
	public static final int[] anIntArray21 = new int[5];

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_73 = Static181.method2795("Existing User");

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!qe;")
	public static Class83 aClass83_72 = aClass83_73;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	public static int anInt374 = -1;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public static int anInt375 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method288(@OriginalArg(1) Component arg0) {
		@Pc(1) Method local1 = Static1.aMethod2;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(15) Throwable local15) {
			}
		}
		arg0.addKeyListener(Static85.aClass27_1);
		arg0.addFocusListener(Static85.aClass27_1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!bh;II)V")
	public static void method290(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray27;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub2_Sub21 local18 = Static85.method1504(local14);
		if (local18 == null) {
			return;
		}
		Static153.anInt3312 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local18.anIntArray273;
		@Pc(34) byte local34 = -1;
		@Pc(37) int[] local37 = local18.anIntArray272;
		@Pc(63) int local63;
		@Pc(76) int local76;
		try {
			Static25.aClass83Array57 = new Class83[local18.anInt2737];
			Static52.anIntArray102 = new int[local18.anInt2730];
			@Pc(59) int local59 = 0;
			@Pc(61) int local61 = 0;
			for (local63 = 1; local63 < local8.length; local63++) {
				if (local8[local63] instanceof Integer) {
					local76 = (Integer) local8[local63];
					if (local76 == -2147483647) {
						local76 = arg0.anInt542;
					}
					if (local76 == -2147483646) {
						local76 = arg0.anInt538;
					}
					if (local76 == -2147483645) {
						local76 = arg0.aClass5_3 == null ? -1 : arg0.aClass5_3.anInt159;
					}
					if (local76 == -2147483644) {
						local76 = arg0.anInt539;
					}
					if (local76 == -2147483643) {
						local76 = arg0.aClass5_3 == null ? -1 : arg0.aClass5_3.anInt131;
					}
					if (local76 == -2147483642) {
						local76 = arg0.aClass5_2 == null ? -1 : arg0.aClass5_2.anInt159;
					}
					if (local76 == -2147483641) {
						local76 = arg0.aClass5_2 == null ? -1 : arg0.aClass5_2.anInt131;
					}
					if (local76 == -2147483640) {
						local76 = arg0.anInt543;
					}
					if (local76 == -2147483639) {
						local76 = arg0.anInt541;
					}
					Static52.anIntArray102[local59++] = local76;
				} else if (local8[local63] instanceof Class83) {
					@Pc(177) Class83 local177 = (Class83) local8[local63];
					if (local177.method2402(Static186.aClass83_1085)) {
						local177 = arg0.aClass83_120;
					}
					Static25.aClass83Array57[local61++] = local177;
				}
			}
			local76 = 0;
			label2414: while (true) {
				local76++;
				if (local76 > arg1) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(211) int local211 = local32[local29];
				@Pc(775) int local775;
				@Pc(769) int local769;
				@Pc(628) int local628;
				@Pc(650) int local650;
				@Pc(584) Class83 local584;
				if (local211 < 100) {
					if (local211 == 0) {
						Static85.anIntArray180[local27++] = local37[local29];
						continue;
					}
					@Pc(237) int local237;
					if (local211 == 1) {
						local237 = local37[local29];
						Static85.anIntArray180[local27++] = Static14.anIntArray235[local237];
						continue;
					}
					if (local211 == 2) {
						local237 = local37[local29];
						local27--;
						Static14.anIntArray235[local237] = Static85.anIntArray180[local27];
						continue;
					}
					if (local211 == 3) {
						Static67.aClass83Array31[local25++] = local18.aClass83Array47[local29];
						continue;
					}
					if (local211 == 6) {
						local29 += local37[local29];
						continue;
					}
					if (local211 == 7) {
						local27 -= 2;
						if (Static85.anIntArray180[local27 + 1] != Static85.anIntArray180[local27]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local211 == 8) {
						local27 -= 2;
						if (Static85.anIntArray180[local27] == Static85.anIntArray180[local27 + 1]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local211 == 9) {
						local27 -= 2;
						if (Static85.anIntArray180[local27 + 1] > Static85.anIntArray180[local27]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local211 == 10) {
						local27 -= 2;
						if (Static85.anIntArray180[local27 + 1] < Static85.anIntArray180[local27]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local211 == 21) {
						if (Static153.anInt3312 == 0) {
							return;
						}
						@Pc(405) Class14 local405 = Static118.aClass14Array1[--Static153.anInt3312];
						local18 = local405.aClass2_Sub2_Sub21_1;
						Static25.aClass83Array57 = local405.aClass83Array10;
						local32 = local18.anIntArray273;
						local29 = local405.anInt569;
						local37 = local18.anIntArray272;
						Static52.anIntArray102 = local405.anIntArray36;
						continue;
					}
					if (local211 == 25) {
						local237 = local37[local29];
						Static85.anIntArray180[local27++] = Static199.method3012(local237);
						continue;
					}
					if (local211 == 27) {
						local237 = local37[local29];
						local27--;
						Static129.method2175(local237, Static85.anIntArray180[local27]);
						continue;
					}
					if (local211 == 31) {
						local27 -= 2;
						if (Static85.anIntArray180[local27 + 1] >= Static85.anIntArray180[local27]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local211 == 32) {
						local27 -= 2;
						if (Static85.anIntArray180[local27 + 1] <= Static85.anIntArray180[local27]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local211 == 33) {
						Static85.anIntArray180[local27++] = Static52.anIntArray102[local37[local29]];
						continue;
					}
					@Pc(528) int local528;
					if (local211 == 34) {
						local528 = local37[local29];
						local27--;
						Static52.anIntArray102[local528] = Static85.anIntArray180[local27];
						continue;
					}
					if (local211 == 35) {
						Static67.aClass83Array31[local25++] = Static25.aClass83Array57[local37[local29]];
						continue;
					}
					if (local211 == 36) {
						local528 = local37[local29];
						local25--;
						Static25.aClass83Array57[local528] = Static67.aClass83Array31[local25];
						continue;
					}
					if (local211 == 37) {
						local237 = local37[local29];
						local25 -= local237;
						local584 = Static197.method2970(local237, local25, Static67.aClass83Array31);
						Static67.aClass83Array31[local25++] = local584;
						continue;
					}
					if (local211 == 38) {
						local27--;
						continue;
					}
					if (local211 == 39) {
						local25--;
						continue;
					}
					if (local211 == 40) {
						local237 = local37[local29];
						@Pc(618) Class2_Sub2_Sub21 local618 = Static85.method1504(local237);
						@Pc(622) int[] local622 = new int[local618.anInt2730];
						@Pc(626) Class83[] local626 = new Class83[local618.anInt2737];
						for (local628 = 0; local628 < local618.anInt2729; local628++) {
							local622[local628] = Static85.anIntArray180[local27 + local628 - local618.anInt2729];
						}
						for (local650 = 0; local650 < local618.anInt2734; local650++) {
							local626[local650] = Static67.aClass83Array31[local25 + local650 - local618.anInt2734];
						}
						local27 -= local618.anInt2729;
						local25 -= local618.anInt2734;
						@Pc(683) Class14 local683 = new Class14();
						local683.anInt569 = local29;
						local683.aClass2_Sub2_Sub21_1 = local18;
						local683.anIntArray36 = Static52.anIntArray102;
						local683.aClass83Array10 = Static25.aClass83Array57;
						if (Static118.aClass14Array1.length <= Static153.anInt3312) {
							throw new RuntimeException();
						}
						Static118.aClass14Array1[Static153.anInt3312++] = local683;
						local18 = local618;
						Static52.anIntArray102 = local622;
						local29 = -1;
						local37 = local618.anIntArray272;
						local32 = local618.anIntArray273;
						Static25.aClass83Array57 = local626;
						continue;
					}
					if (local211 == 42) {
						Static85.anIntArray180[local27++] = Static207.anIntArray403[local37[local29]];
						continue;
					}
					if (local211 == 43) {
						local528 = local37[local29];
						local27--;
						Static207.anIntArray403[local528] = Static85.anIntArray180[local27];
						continue;
					}
					if (local211 == 44) {
						local237 = local37[local29] >> 16;
						local27--;
						local769 = Static85.anIntArray180[local27];
						local775 = local37[local29] & 0xFFFF;
						if (local769 >= 0 && local769 <= 5000) {
							@Pc(788) byte local788 = -1;
							Static74.anIntArray168[local237] = local769;
							if (local775 == 105) {
								local788 = 0;
							}
							local628 = 0;
							while (true) {
								if (local628 >= local769) {
									continue label2414;
								}
								Static154.anIntArrayArray23[local237][local628] = local788;
								local628++;
							}
						}
						throw new RuntimeException();
					}
					if (local211 == 45) {
						local237 = local37[local29];
						local27--;
						local775 = Static85.anIntArray180[local27];
						if (local775 >= 0 && local775 < Static74.anIntArray168[local237]) {
							Static85.anIntArray180[local27++] = Static154.anIntArrayArray23[local237][local775];
							continue;
						}
						throw new RuntimeException();
					}
					if (local211 == 46) {
						local27 -= 2;
						local775 = Static85.anIntArray180[local27];
						local237 = local37[local29];
						if (local775 >= 0 && Static74.anIntArray168[local237] > local775) {
							Static154.anIntArrayArray23[local237][local775] = Static85.anIntArray180[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local211 == 47) {
						@Pc(898) Class83 local898 = Static152.aClass83Array52[local37[local29]];
						if (local898 == null) {
							local898 = Static38.aClass83_314;
						}
						Static67.aClass83Array31[local25++] = local898;
						continue;
					}
					if (local211 == 48) {
						local528 = local37[local29];
						local25--;
						Static152.aClass83Array52[local528] = Static67.aClass83Array31[local25];
						continue;
					}
					if (local211 == 51) {
						@Pc(935) Class63 local935 = local18.aClass63Array1[local37[local29]];
						local27--;
						@Pc(945) Class2_Sub10 local945 = (Class2_Sub10) local935.method2110((long) Static85.anIntArray180[local27]);
						if (local945 != null) {
							local29 += local945.anInt974;
						}
						continue;
					}
				}
				@Pc(961) boolean local961;
				if (local37[local29] == 1) {
					local961 = true;
				} else {
					local961 = false;
				}
				@Pc(2334) Class5 local2334;
				@Pc(2307) Class5 local2307;
				@Pc(1472) int local1472;
				@Pc(1003) Class5 local1003;
				@Pc(1244) int local1244;
				if (local211 < 300) {
					if (local211 == 100) {
						local27 -= 3;
						local775 = Static85.anIntArray180[local27];
						local769 = Static85.anIntArray180[local27 + 1];
						local1244 = Static85.anIntArray180[local27 + 2];
						if (local769 == 0) {
							throw new RuntimeException();
						}
						local2307 = Static74.method1401(local775);
						if (local2307.aClass5Array1 == null) {
							local2307.aClass5Array1 = new Class5[local1244 + 1];
						}
						if (local1244 >= local2307.aClass5Array1.length) {
							@Pc(8762) Class5[] local8762 = new Class5[local1244 + 1];
							for (local1472 = 0; local1472 < local2307.aClass5Array1.length; local1472++) {
								local8762[local1472] = local2307.aClass5Array1[local1472];
							}
							local2307.aClass5Array1 = local8762;
						}
						if (local1244 > 0 && local2307.aClass5Array1[local1244 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1244 - 1));
						}
						@Pc(8812) Class5 local8812 = new Class5();
						local8812.aBoolean7 = true;
						local8812.anInt132 = local8812.anInt159 = local2307.anInt159;
						local8812.anInt130 = local769;
						local8812.anInt131 = local1244;
						local2307.aClass5Array1[local1244] = local8812;
						if (local961) {
							Static31.aClass5_7 = local8812;
						} else {
							Static182.aClass5_17 = local8812;
						}
						Static121.method2085(local2307);
						continue;
					}
					@Pc(8876) Class5 local8876;
					if (local211 == 101) {
						local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
						if (local1003.anInt131 == -1) {
							if (local961) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local8876 = Static74.method1401(local1003.anInt159);
						local8876.aClass5Array1[local1003.anInt131] = null;
						Static121.method2085(local8876);
						continue;
					}
					if (local211 == 102) {
						local27--;
						local1003 = Static74.method1401(Static85.anIntArray180[local27]);
						local1003.aClass5Array1 = null;
						Static121.method2085(local1003);
						continue;
					}
					if (local211 == 200) {
						local27 -= 2;
						local775 = Static85.anIntArray180[local27];
						local769 = Static85.anIntArray180[local27 + 1];
						local2334 = Static201.method3053(local769, local775);
						if (local2334 != null && local769 != -1) {
							Static85.anIntArray180[local27++] = 1;
							if (local961) {
								Static31.aClass5_7 = local2334;
							} else {
								Static182.aClass5_17 = local2334;
							}
							continue;
						}
						Static85.anIntArray180[local27++] = 0;
						continue;
					}
					if (local211 == 201) {
						local27--;
						local775 = Static85.anIntArray180[local27];
						local8876 = Static74.method1401(local775);
						if (local8876 == null) {
							Static85.anIntArray180[local27++] = 0;
						} else {
							Static85.anIntArray180[local27++] = 1;
							if (local961) {
								Static31.aClass5_7 = local8876;
							} else {
								Static182.aClass5_17 = local8876;
							}
						}
						continue;
					}
				} else if (local211 < 500) {
					if (local211 == 403) {
						local27 -= 2;
						local775 = Static85.anIntArray180[local27];
						if (local775 >= 7) {
							local775 -= 7;
						}
						local769 = Static85.anIntArray180[local27 + 1];
						Static54.aClass24_Sub4_Sub1_1.aClass49_2.method1520(local769, local775);
						continue;
					}
					if (local211 == 404) {
						local27 -= 2;
						local769 = Static85.anIntArray180[local27 + 1];
						local775 = Static85.anIntArray180[local27];
						Static54.aClass24_Sub4_Sub1_1.aClass49_2.method1513(local769, local775);
						continue;
					}
					if (local211 == 410) {
						local27--;
						@Pc(8700) boolean local8700 = Static85.anIntArray180[local27] != 0;
						Static54.aClass24_Sub4_Sub1_1.aClass49_2.method1516(local8700);
						continue;
					}
				} else if ((local211 < 1000 || local211 >= 1100) && (local211 < 2000 || local211 >= 2100)) {
					@Pc(1364) Class83 local1364;
					if (local211 >= 1100 && local211 < 1200 || local211 >= 2100 && local211 < 2200) {
						if (local211 >= 2000) {
							local211 -= 1000;
							local27--;
							local1003 = Static74.method1401(Static85.anIntArray180[local27]);
						} else {
							local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
						}
						if (local211 == 1100) {
							local27 -= 2;
							local1003.anInt99 = Static85.anIntArray180[local27];
							if (local1003.anInt99 > local1003.anInt147 - local1003.anInt157) {
								local1003.anInt99 = local1003.anInt147 - local1003.anInt157;
							}
							if (local1003.anInt99 < 0) {
								local1003.anInt99 = 0;
							}
							local1003.anInt125 = Static85.anIntArray180[local27 + 1];
							if (local1003.anInt125 > local1003.anInt114 - local1003.anInt100) {
								local1003.anInt125 = local1003.anInt114 - local1003.anInt100;
							}
							if (local1003.anInt125 < 0) {
								local1003.anInt125 = 0;
							}
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1101) {
							local27--;
							local1003.anInt167 = Static85.anIntArray180[local27];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1102) {
							local27--;
							local1003.aBoolean6 = Static85.anIntArray180[local27] == 1;
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1103) {
							local27--;
							local1003.anInt145 = Static85.anIntArray180[local27];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1104) {
							local27--;
							local1003.anInt126 = Static85.anIntArray180[local27];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1105) {
							local27--;
							local1003.anInt173 = Static85.anIntArray180[local27];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1106) {
							local27--;
							local1003.anInt176 = Static85.anIntArray180[local27];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1107) {
							local27--;
							local1003.aBoolean18 = Static85.anIntArray180[local27] == 1;
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1108) {
							local1003.anInt178 = 1;
							local27--;
							local1003.anInt144 = Static85.anIntArray180[local27];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1109) {
							local27 -= 6;
							local1003.anInt146 = Static85.anIntArray180[local27];
							local1003.anInt179 = Static85.anIntArray180[local27 + 1];
							local1003.anInt152 = Static85.anIntArray180[local27 + 2];
							local1003.anInt171 = Static85.anIntArray180[local27 + 3];
							local1003.anInt148 = Static85.anIntArray180[local27 + 4];
							local1003.anInt142 = Static85.anIntArray180[local27 + 5];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1110) {
							local27--;
							local769 = Static85.anIntArray180[local27];
							if (local1003.anInt164 != local769) {
								local1003.anInt139 = 0;
								local1003.anInt169 = 0;
								local1003.anInt164 = local769;
								Static121.method2085(local1003);
							}
							continue;
						}
						if (local211 == 1111) {
							local27--;
							local1003.aBoolean11 = Static85.anIntArray180[local27] == 1;
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1112) {
							local25--;
							local1364 = Static67.aClass83Array31[local25];
							if (!local1364.method2402(local1003.aClass83_29)) {
								local1003.aClass83_29 = local1364;
								Static121.method2085(local1003);
							}
							continue;
						}
						if (local211 == 1113) {
							local27--;
							local1003.anInt102 = Static85.anIntArray180[local27];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1114) {
							local27 -= 3;
							local1003.anInt137 = Static85.anIntArray180[local27];
							local1003.anInt168 = Static85.anIntArray180[local27 + 1];
							local1003.anInt136 = Static85.anIntArray180[local27 + 2];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1115) {
							local27--;
							local1003.aBoolean10 = Static85.anIntArray180[local27] == 1;
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1116) {
							local27--;
							local1003.anInt174 = Static85.anIntArray180[local27];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1117) {
							local27--;
							local1003.anInt170 = Static85.anIntArray180[local27];
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1118) {
							local27--;
							local1003.aBoolean12 = Static85.anIntArray180[local27] == 1;
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1119) {
							local27--;
							local1003.aBoolean15 = Static85.anIntArray180[local27] == 1;
							Static121.method2085(local1003);
							continue;
						}
						if (local211 == 1120) {
							local27 -= 2;
							local1003.anInt147 = Static85.anIntArray180[local27];
							local1003.anInt114 = Static85.anIntArray180[local27 + 1];
							Static121.method2085(local1003);
							if (local1003.anInt130 == 0) {
								Static48.method960(local1003);
							}
							continue;
						}
					} else if (local211 >= 1200 && local211 < 1300 || !(local211 < 2200 || local211 >= 2300)) {
						if (local211 < 2000) {
							local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
						} else {
							local211 -= 1000;
							local27--;
							local1003 = Static74.method1401(Static85.anIntArray180[local27]);
						}
						Static121.method2085(local1003);
						if (local211 == 1200 || local211 == 1205) {
							local27 -= 2;
							local769 = Static85.anIntArray180[local27];
							local1244 = Static85.anIntArray180[local27 + 1];
							if (local769 == -1) {
								local1003.anInt178 = 1;
								local1003.anInt158 = -1;
								local1003.anInt144 = -1;
							} else {
								local1003.anInt165 = local1244;
								local1003.anInt158 = local769;
								@Pc(7996) Class2_Sub2_Sub3 local7996 = Static113.method1987(local769);
								local1003.anInt179 = local7996.anInt433;
								local1003.anInt146 = local7996.anInt431;
								local1003.anInt171 = local7996.anInt460;
								local1003.anInt148 = local7996.anInt434;
								local1003.anInt142 = local7996.anInt421;
								if (local1003.anInt177 > 0) {
									local1003.anInt142 = local1003.anInt142 * 32 / local1003.anInt177;
								} else if (local1003.anInt111 > 0) {
									local1003.anInt142 = local1003.anInt142 * 32 / local1003.anInt111;
								}
								if (local211 == 1205) {
									local1003.aBoolean13 = false;
								} else {
									local1003.aBoolean13 = true;
								}
								local1003.anInt152 = local7996.anInt445;
							}
							continue;
						}
						if (local211 == 1201) {
							local1003.anInt178 = 2;
							local27--;
							local1003.anInt144 = Static85.anIntArray180[local27];
							continue;
						}
						if (local211 == 1202) {
							local1003.anInt178 = 3;
							local1003.anInt144 = Static54.aClass24_Sub4_Sub1_1.aClass49_2.method1510();
							continue;
						}
						if (local211 == 1203) {
							local1003.anInt178 = 6;
							local27--;
							local1003.anInt144 = Static85.anIntArray180[local27];
							continue;
						}
						if (local211 == 1204) {
							local1003.anInt178 = 5;
							local27--;
							local1003.anInt144 = Static85.anIntArray180[local27];
							continue;
						}
					} else if (local211 >= 1300 && local211 < 1400 || local211 >= 2300 && local211 < 2400) {
						if (local211 >= 2000) {
							local27--;
							local1003 = Static74.method1401(Static85.anIntArray180[local27]);
							local211 -= 1000;
						} else {
							local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
						}
						if (local211 == 1300) {
							local27--;
							local769 = Static85.anIntArray180[local27] - 1;
							if (local769 >= 0 && local769 <= 9) {
								local25--;
								local1003.method97(Static67.aClass83Array31[local25], local769);
								continue;
							}
							local25--;
							continue;
						}
						if (local211 == 1301) {
							local27 -= 2;
							local769 = Static85.anIntArray180[local27];
							local1244 = Static85.anIntArray180[local27 + 1];
							local1003.aClass5_1 = Static201.method3053(local1244, local769);
							continue;
						}
						if (local211 == 1302) {
							local27--;
							local1003.aBoolean17 = Static85.anIntArray180[local27] == 1;
							continue;
						}
						if (local211 == 1303) {
							local27--;
							local1003.anInt117 = Static85.anIntArray180[local27];
							continue;
						}
						if (local211 == 1304) {
							local27--;
							local1003.anInt149 = Static85.anIntArray180[local27];
							continue;
						}
						if (local211 == 1305) {
							local25--;
							local1003.aClass83_35 = Static67.aClass83Array31[local25];
							continue;
						}
						if (local211 == 1306) {
							local25--;
							local1003.aClass83_37 = Static67.aClass83Array31[local25];
							continue;
						}
						if (local211 == 1307) {
							local1003.aClass83Array4 = null;
							continue;
						}
					} else {
						if (local211 >= 1400 && local211 < 1500 || local211 >= 2400 && local211 < 2500) {
							if (local211 < 2000) {
								local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
							} else {
								local211 -= 1000;
								local27--;
								local1003 = Static74.method1401(Static85.anIntArray180[local27]);
							}
							local25--;
							local1364 = Static67.aClass83Array31[local25];
							@Pc(1366) int[] local1366 = null;
							if (local1364.method2428() > 0 && local1364.method2421(local1364.method2428() - 1) == 89) {
								local27--;
								local628 = Static85.anIntArray180[local27];
								if (local628 > 0) {
									local1366 = new int[local628];
									while (local628-- > 0) {
										local27--;
										local1366[local628] = Static85.anIntArray180[local27];
									}
								}
								local1364 = local1364.method2416(local1364.method2428() - 1, 0);
							}
							@Pc(1427) Object[] local1427 = new Object[local1364.method2428() + 1];
							for (local650 = local1427.length - 1; local650 >= 1; local650--) {
								if (local1364.method2421(local650 - 1) == 115) {
									local25--;
									local1427[local650] = Static67.aClass83Array31[local25];
								} else {
									local27--;
									local1427[local650] = Integer.valueOf(Static85.anIntArray180[local27]);
								}
							}
							local27--;
							local1472 = Static85.anIntArray180[local27];
							if (local1472 == -1) {
								local1427 = null;
							} else {
								local1427[0] = Integer.valueOf(local1472);
							}
							if (local211 == 1407) {
								local1003.anObjectArray8 = local1427;
								local1003.anIntArray11 = local1366;
							}
							if (local211 == 1424) {
								local1003.anObjectArray10 = local1427;
							}
							if (local211 == 1406) {
								local1003.anObjectArray26 = local1427;
							}
							if (local211 == 1417) {
								local1003.anObjectArray13 = local1427;
							}
							if (local211 == 1408) {
								local1003.anObjectArray6 = local1427;
							}
							local1003.aBoolean14 = true;
							if (local211 == 1410) {
								local1003.anObjectArray23 = local1427;
							}
							if (local211 == 1409) {
								local1003.anObjectArray11 = local1427;
							}
							if (local211 == 1425) {
								local1003.anObjectArray15 = local1427;
							}
							if (local211 == 1419) {
								local1003.anObjectArray20 = local1427;
							}
							if (local211 == 1401) {
								local1003.anObjectArray14 = local1427;
							}
							if (local211 == 1422) {
								local1003.anObjectArray22 = local1427;
							}
							if (local211 == 1418) {
								local1003.anObjectArray3 = local1427;
							}
							if (local211 == 1404) {
								local1003.anObjectArray19 = local1427;
							}
							if (local211 == 1423) {
								local1003.anObjectArray12 = local1427;
							}
							if (local211 == 1402) {
								local1003.anObjectArray1 = local1427;
							}
							if (local211 == 1403) {
								local1003.anObjectArray7 = local1427;
							}
							if (local211 == 1405) {
								local1003.anObjectArray18 = local1427;
							}
							if (local211 == 1412) {
								local1003.anObjectArray2 = local1427;
							}
							if (local211 == 1420) {
								local1003.anObjectArray17 = local1427;
							}
							if (local211 == 1421) {
								local1003.anObjectArray5 = local1427;
							}
							if (local211 == 1400) {
								local1003.anObjectArray24 = local1427;
							}
							if (local211 == 1411) {
								local1003.anObjectArray25 = local1427;
							}
							if (local211 == 1414) {
								local1003.anObjectArray9 = local1427;
								local1003.anIntArray12 = local1366;
							}
							if (local211 == 1416) {
								local1003.anObjectArray4 = local1427;
							}
							if (local211 == 1415) {
								local1003.anObjectArray21 = local1427;
								local1003.anIntArray13 = local1366;
							}
							continue;
						}
						if (local211 < 1600) {
							local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
							if (local211 == 1500) {
								Static85.anIntArray180[local27++] = local1003.anInt154;
								continue;
							}
							if (local211 == 1501) {
								Static85.anIntArray180[local27++] = local1003.anInt105;
								continue;
							}
							if (local211 == 1502) {
								Static85.anIntArray180[local27++] = local1003.anInt157;
								continue;
							}
							if (local211 == 1503) {
								Static85.anIntArray180[local27++] = local1003.anInt100;
								continue;
							}
							if (local211 == 1504) {
								Static85.anIntArray180[local27++] = local1003.aBoolean19 ? 1 : 0;
								continue;
							}
							if (local211 == 1505) {
								Static85.anIntArray180[local27++] = local1003.anInt132;
								continue;
							}
						} else if (local211 < 1700) {
							local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
							if (local211 == 1600) {
								Static85.anIntArray180[local27++] = local1003.anInt99;
								continue;
							}
							if (local211 == 1601) {
								Static85.anIntArray180[local27++] = local1003.anInt125;
								continue;
							}
							if (local211 == 1602) {
								Static67.aClass83Array31[local25++] = local1003.aClass83_29;
								continue;
							}
							if (local211 == 1603) {
								Static85.anIntArray180[local27++] = local1003.anInt147;
								continue;
							}
							if (local211 == 1604) {
								Static85.anIntArray180[local27++] = local1003.anInt114;
								continue;
							}
							if (local211 == 1605) {
								Static85.anIntArray180[local27++] = local1003.anInt142;
								continue;
							}
							if (local211 == 1606) {
								Static85.anIntArray180[local27++] = local1003.anInt152;
								continue;
							}
							if (local211 == 1607) {
								Static85.anIntArray180[local27++] = local1003.anInt148;
								continue;
							}
							if (local211 == 1608) {
								Static85.anIntArray180[local27++] = local1003.anInt171;
								continue;
							}
							if (local211 == 1609) {
								Static85.anIntArray180[local27++] = local1003.anInt145;
								continue;
							}
						} else if (local211 < 1800) {
							local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
							if (local211 == 1700) {
								Static85.anIntArray180[local27++] = local1003.anInt158;
								continue;
							}
							if (local211 == 1701) {
								if (local1003.anInt158 == -1) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = local1003.anInt165;
								}
								continue;
							}
							if (local211 == 1702) {
								Static85.anIntArray180[local27++] = local1003.anInt131;
								continue;
							}
						} else if (local211 < 1900) {
							local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
							if (local211 == 1800) {
								Static85.anIntArray180[local27++] = Static200.method3027(Static138.method2242(local1003));
								continue;
							}
							if (local211 == 1801) {
								local27--;
								local769 = Static85.anIntArray180[local27];
								local769--;
								if (local1003.aClass83Array4 != null && local1003.aClass83Array4.length > local769 && local1003.aClass83Array4[local769] != null) {
									Static67.aClass83Array31[local25++] = local1003.aClass83Array4[local769];
									continue;
								}
								Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								continue;
							}
							if (local211 == 1802) {
								if (local1003.aClass83_35 == null) {
									Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								} else {
									Static67.aClass83Array31[local25++] = local1003.aClass83_35;
								}
								continue;
							}
						} else if (local211 < 2600) {
							local27--;
							local1003 = Static74.method1401(Static85.anIntArray180[local27]);
							if (local211 == 2500) {
								Static85.anIntArray180[local27++] = local1003.anInt154;
								continue;
							}
							if (local211 == 2501) {
								Static85.anIntArray180[local27++] = local1003.anInt105;
								continue;
							}
							if (local211 == 2502) {
								Static85.anIntArray180[local27++] = local1003.anInt157;
								continue;
							}
							if (local211 == 2503) {
								Static85.anIntArray180[local27++] = local1003.anInt100;
								continue;
							}
							if (local211 == 2504) {
								Static85.anIntArray180[local27++] = local1003.aBoolean19 ? 1 : 0;
								continue;
							}
							if (local211 == 2505) {
								Static85.anIntArray180[local27++] = local1003.anInt132;
								continue;
							}
						} else if (local211 < 2700) {
							local27--;
							local1003 = Static74.method1401(Static85.anIntArray180[local27]);
							if (local211 == 2600) {
								Static85.anIntArray180[local27++] = local1003.anInt99;
								continue;
							}
							if (local211 == 2601) {
								Static85.anIntArray180[local27++] = local1003.anInt125;
								continue;
							}
							if (local211 == 2602) {
								Static67.aClass83Array31[local25++] = local1003.aClass83_29;
								continue;
							}
							if (local211 == 2603) {
								Static85.anIntArray180[local27++] = local1003.anInt147;
								continue;
							}
							if (local211 == 2604) {
								Static85.anIntArray180[local27++] = local1003.anInt114;
								continue;
							}
							if (local211 == 2605) {
								Static85.anIntArray180[local27++] = local1003.anInt142;
								continue;
							}
							if (local211 == 2606) {
								Static85.anIntArray180[local27++] = local1003.anInt152;
								continue;
							}
							if (local211 == 2607) {
								Static85.anIntArray180[local27++] = local1003.anInt148;
								continue;
							}
							if (local211 == 2608) {
								Static85.anIntArray180[local27++] = local1003.anInt171;
								continue;
							}
							if (local211 == 2609) {
								Static85.anIntArray180[local27++] = local1003.anInt145;
								continue;
							}
						} else if (local211 < 2800) {
							if (local211 == 2700) {
								local27--;
								local1003 = Static74.method1401(Static85.anIntArray180[local27]);
								Static85.anIntArray180[local27++] = local1003.anInt158;
								continue;
							}
							if (local211 == 2701) {
								local27--;
								local1003 = Static74.method1401(Static85.anIntArray180[local27]);
								if (local1003.anInt158 == -1) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = local1003.anInt165;
								}
								continue;
							}
							if (local211 == 2702) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								@Pc(7592) Class2_Sub13 local7592 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local775);
								if (local7592 == null) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = 1;
								}
								continue;
							}
							if (local211 == 2703) {
								local27--;
								local1003 = Static74.method1401(Static85.anIntArray180[local27]);
								if (local1003.aClass5Array1 == null) {
									Static85.anIntArray180[local27++] = 0;
									continue;
								}
								local769 = local1003.aClass5Array1.length;
								for (local1244 = 0; local1244 < local1003.aClass5Array1.length; local1244++) {
									if (local1003.aClass5Array1[local1244] == null) {
										local769 = local1244;
										break;
									}
								}
								Static85.anIntArray180[local27++] = local769;
								continue;
							}
							if (local211 == 2704 || local211 == 2705) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								@Pc(7692) Class2_Sub13 local7692 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local775);
								if (local7692 != null && local769 == local7692.anInt1869) {
									Static85.anIntArray180[local27++] = 1;
								} else {
									Static85.anIntArray180[local27++] = 0;
								}
								continue;
							}
						} else if (local211 < 2900) {
							local27--;
							local1003 = Static74.method1401(Static85.anIntArray180[local27]);
							if (local211 == 2800) {
								Static85.anIntArray180[local27++] = Static200.method3027(Static138.method2242(local1003));
								continue;
							}
							if (local211 == 2801) {
								local27--;
								local769 = Static85.anIntArray180[local27];
								local769--;
								if (local1003.aClass83Array4 != null && local769 < local1003.aClass83Array4.length && local1003.aClass83Array4[local769] != null) {
									Static67.aClass83Array31[local25++] = local1003.aClass83Array4[local769];
									continue;
								}
								Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								continue;
							}
							if (local211 == 2802) {
								if (local1003.aClass83_35 == null) {
									Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								} else {
									Static67.aClass83Array31[local25++] = local1003.aClass83_35;
								}
								continue;
							}
						} else if (local211 < 3200) {
							if (local211 == 3100) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static165.method2554(0, local584, Static78.aClass83_559);
								continue;
							}
							if (local211 == 3101) {
								local27 -= 2;
								Static67.method1269(Static85.anIntArray180[local27 + 1], Static85.anIntArray180[local27], Static54.aClass24_Sub4_Sub1_1);
								continue;
							}
							if (local211 == 3103) {
								Static186.method2833();
								continue;
							}
							if (local211 == 3104) {
								local769 = 0;
								local25--;
								local584 = Static67.aClass83Array31[local25];
								if (local584.method2407()) {
									local769 = local584.method2399();
								}
								Static69.aClass2_Sub3_Sub1_2.method284(132);
								Static69.aClass2_Sub3_Sub1_2.method246(local769);
								continue;
							}
							if (local211 == 3105) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static69.aClass2_Sub3_Sub1_2.method284(65);
								Static69.aClass2_Sub3_Sub1_2.method249(local584.method2397());
								continue;
							}
							if (local211 == 3106) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static69.aClass2_Sub3_Sub1_2.method284(173);
								Static69.aClass2_Sub3_Sub1_2.method247(local584.method2428() + 1);
								Static69.aClass2_Sub3_Sub1_2.method229(local584);
								continue;
							}
							if (local211 == 3107) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local25--;
								local1364 = Static67.aClass83Array31[local25];
								Static35.method720(local775, local1364);
								continue;
							}
							if (local211 == 3108) {
								local27 -= 3;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								local1244 = Static85.anIntArray180[local27 + 2];
								local2307 = Static74.method1401(local1244);
								Static40.method797(local2307, local769, local775);
								continue;
							}
							if (local211 == 3109) {
								local27 -= 2;
								local769 = Static85.anIntArray180[local27 + 1];
								local775 = Static85.anIntArray180[local27];
								local2334 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
								Static40.method797(local2334, local769, local775);
								continue;
							}
							if (local211 == 3110) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static69.aClass2_Sub3_Sub1_2.method284(20);
								Static69.aClass2_Sub3_Sub1_2.method239(local775);
								continue;
							}
						} else if (local211 < 3300) {
							if (local211 == 3200) {
								local27 -= 3;
								Static105.method1825(Static85.anIntArray180[local27], Static85.anIntArray180[local27 + 1], Static85.anIntArray180[local27 + 2]);
								continue;
							}
							if (local211 == 3201) {
								local27--;
								Static163.method2507(Static85.anIntArray180[local27]);
								continue;
							}
							if (local211 == 3202) {
								local27 -= 2;
								Static37.method755(Static85.anIntArray180[local27], Static85.anIntArray180[local27 + 1]);
								continue;
							}
						} else if (local211 < 3400) {
							if (local211 == 3300) {
								Static85.anIntArray180[local27++] = Static13.anInt386;
								continue;
							}
							if (local211 == 3301) {
								local27 -= 2;
								local769 = Static85.anIntArray180[local27 + 1];
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static163.method2504(local769, local775);
								continue;
							}
							if (local211 == 3302) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = Static182.method2817(local769, local775);
								continue;
							}
							if (local211 == 3303) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = Static158.method2441(local775, local769);
								continue;
							}
							if (local211 == 3304) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static73.method1399(local775).anInt3950;
								continue;
							}
							if (local211 == 3305) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static60.anIntArray208[local775];
								continue;
							}
							if (local211 == 3306) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static156.anIntArray404[local775];
								continue;
							}
							if (local211 == 3307) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static118.anIntArray268[local775];
								continue;
							}
							if (local211 == 3308) {
								local1244 = (Static54.aClass24_Sub4_Sub1_1.anInt3349 >> 7) + Static123.anInt2755;
								local769 = (Static54.aClass24_Sub4_Sub1_1.anInt3316 >> 7) + Static2.anInt57;
								local775 = Static43.anInt1126;
								Static85.anIntArray180[local27++] = (local769 << 14) + (local775 << 28) + local1244;
								continue;
							}
							if (local211 == 3309) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = local775 >> 14 & 0x3FFF;
								continue;
							}
							if (local211 == 3310) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = local775 >> 28;
								continue;
							}
							if (local211 == 3311) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = local775 & 0x3FFF;
								continue;
							}
							if (local211 == 3312) {
								Static85.anIntArray180[local27++] = Static116.aBoolean127 ? 1 : 0;
								continue;
							}
							if (local211 == 3313) {
								local27 -= 2;
								local769 = Static85.anIntArray180[local27 + 1];
								local775 = Static85.anIntArray180[local27] + 32768;
								Static85.anIntArray180[local27++] = Static163.method2504(local769, local775);
								continue;
							}
							if (local211 == 3314) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27] + 32768;
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = Static182.method2817(local769, local775);
								continue;
							}
							if (local211 == 3315) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27] + 32768;
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = Static158.method2441(local775, local769);
								continue;
							}
							if (local211 == 3316) {
								if (Static156.anInt4250 >= 2) {
									Static85.anIntArray180[local27++] = Static156.anInt4250;
								} else {
									Static85.anIntArray180[local27++] = 0;
								}
								continue;
							}
							if (local211 == 3317) {
								Static85.anIntArray180[local27++] = Static130.anInt2830;
								continue;
							}
							if (local211 == 3318) {
								Static85.anIntArray180[local27++] = Static118.anInt2710;
								continue;
							}
							if (local211 == 3321) {
								Static85.anIntArray180[local27++] = Static114.anInt2624;
								continue;
							}
							if (local211 == 3322) {
								Static85.anIntArray180[local27++] = Static33.anInt872;
								continue;
							}
							if (local211 == 3323) {
								if (Static150.anInt3076 >= 5 && Static150.anInt3076 <= 9) {
									Static85.anIntArray180[local27++] = 1;
									continue;
								}
								Static85.anIntArray180[local27++] = 0;
								continue;
							}
							if (local211 == 3324) {
								if (Static150.anInt3076 >= 5 && Static150.anInt3076 <= 9) {
									Static85.anIntArray180[local27++] = Static150.anInt3076;
									continue;
								}
								Static85.anIntArray180[local27++] = 0;
								continue;
							}
							if (local211 == 3325) {
								if (Static114.anInt2626 <= 0) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = 1;
								}
								continue;
							}
							if (local211 == 3326) {
								Static85.anIntArray180[local27++] = Static54.aClass24_Sub4_Sub1_1.anInt2299;
								continue;
							}
							if (local211 == 3327) {
								Static85.anIntArray180[local27++] = Static54.aClass24_Sub4_Sub1_1.aClass49_2.aBoolean100 ? 1 : 0;
								continue;
							}
						} else if (local211 < 3500) {
							if (local211 == 3400) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								@Pc(6926) Class2_Sub2_Sub2 local6926 = Static91.method1590(local775);
								Static67.aClass83Array31[local25++] = local6926.method125(local769);
								continue;
							}
							if (local211 == 3408) {
								local27 -= 4;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								local1244 = Static85.anIntArray180[local27 + 2];
								local628 = Static85.anIntArray180[local27 + 3];
								@Pc(6966) Class2_Sub2_Sub2 local6966 = Static91.method1590(local1244);
								if (local6966.anInt199 == local775 && local6966.anInt198 == local769) {
									if (local769 == 115) {
										Static67.aClass83Array31[local25++] = local6966.method125(local628);
									} else {
										Static85.anIntArray180[local27++] = local6966.method120(local628);
									}
									continue;
								}
								if (local769 == 115) {
									Static67.aClass83Array31[local25++] = Static38.aClass83_314;
								} else {
									Static85.anIntArray180[local27++] = 0;
								}
								continue;
							}
						} else if (local211 < 3700) {
							if (local211 == 3600) {
								if (Static215.anInt4272 == 0) {
									Static85.anIntArray180[local27++] = -2;
								} else if (Static215.anInt4272 == 1) {
									Static85.anIntArray180[local27++] = -1;
								} else {
									Static85.anIntArray180[local27++] = Static177.anInt3618;
								}
								continue;
							}
							if (local211 == 3601) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static215.anInt4272 == 2 && local775 < Static177.anInt3618) {
									Static67.aClass83Array31[local25++] = Static133.aClass83Array49[local775];
									continue;
								}
								Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								continue;
							}
							if (local211 == 3602) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static215.anInt4272 == 2 && local775 < Static177.anInt3618) {
									Static85.anIntArray180[local27++] = Static10.anIntArray19[local775];
									continue;
								}
								Static85.anIntArray180[local27++] = 0;
								continue;
							}
							if (local211 == 3603) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static215.anInt4272 == 2 && local775 < Static177.anInt3618) {
									Static85.anIntArray180[local27++] = Static121.anIntArray274[local775];
									continue;
								}
								Static85.anIntArray180[local27++] = 0;
								continue;
							}
							if (local211 == 3604) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								local27--;
								local769 = Static85.anIntArray180[local27];
								Static82.method1476(local769, local584);
								continue;
							}
							if (local211 == 3605) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static40.method806(local584.method2397());
								continue;
							}
							if (local211 == 3606) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static211.method3198(local584.method2397());
								continue;
							}
							if (local211 == 3607) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static56.method1065(local584.method2397());
								continue;
							}
							if (local211 == 3608) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static98.method1679(local584.method2397());
								continue;
							}
							if (local211 == 3609) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								if (local584.method2415(Static39.aClass83_331) || local584.method2415(Static6.aClass83_27)) {
									local584 = local584.method2422(7);
								}
								Static85.anIntArray180[local27++] = Static135.method2226(local584) ? 1 : 0;
								continue;
							}
							if (local211 == 3610) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static215.anInt4272 == 2 && local775 < Static177.anInt3618) {
									Static67.aClass83Array31[local25++] = Static211.aClass83Array58[local775];
									continue;
								}
								Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								continue;
							}
							if (local211 == 3611) {
								if (Static102.aClass83_679 == null) {
									Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								} else {
									Static67.aClass83Array31[local25++] = Static102.aClass83_679.method2400();
								}
								continue;
							}
							if (local211 == 3612) {
								if (Static102.aClass83_679 == null) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = Static141.anInt2978;
								}
								continue;
							}
							if (local211 == 3613) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static102.aClass83_679 != null && Static141.anInt2978 > local775) {
									Static67.aClass83Array31[local25++] = Static135.aClass2_Sub27Array1[local775].aClass83_1225.method2400();
									continue;
								}
								Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								continue;
							}
							if (local211 == 3614) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static102.aClass83_679 != null && Static141.anInt2978 > local775) {
									Static85.anIntArray180[local27++] = Static135.aClass2_Sub27Array1[local775].anInt4274;
									continue;
								}
								Static85.anIntArray180[local27++] = 0;
								continue;
							}
							if (local211 == 3615) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static102.aClass83_679 != null && Static141.anInt2978 > local775) {
									Static85.anIntArray180[local27++] = Static135.aClass2_Sub27Array1[local775].aByte13;
									continue;
								}
								Static85.anIntArray180[local27++] = 0;
								continue;
							}
							if (local211 == 3616) {
								Static85.anIntArray180[local27++] = Static175.aByte10;
								continue;
							}
							if (local211 == 3617) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static40.method805(local584);
								continue;
							}
							if (local211 == 3618) {
								Static85.anIntArray180[local27++] = Static174.aByte9;
								continue;
							}
							if (local211 == 3619) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static39.method788(local584.method2397());
								continue;
							}
							if (local211 == 3620) {
								Static53.method1035();
								continue;
							}
							if (local211 == 3621) {
								if (Static215.anInt4272 == 0) {
									Static85.anIntArray180[local27++] = -1;
								} else {
									Static85.anIntArray180[local27++] = Static85.anInt1875;
								}
								continue;
							}
							if (local211 == 3622) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static215.anInt4272 != 0 && Static85.anInt1875 > local775) {
									Static67.aClass83Array31[local25++] = Static12.method296(Static211.aLongArray8[local775]).method2400();
									continue;
								}
								Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								continue;
							}
							if (local211 == 3623) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								if (local584.method2415(Static39.aClass83_331) || local584.method2415(Static6.aClass83_27)) {
									local584 = local584.method2422(7);
								}
								Static85.anIntArray180[local27++] = Static7.method110(local584) ? 1 : 0;
								continue;
							}
							if (local211 == 3624) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static135.aClass2_Sub27Array1 != null && local775 < Static141.anInt2978 && Static135.aClass2_Sub27Array1[local775].aClass83_1225.method2398(Static54.aClass24_Sub4_Sub1_1.aClass83_664)) {
									Static85.anIntArray180[local27++] = 1;
									continue;
								}
								Static85.anIntArray180[local27++] = 0;
								continue;
							}
							if (local211 == 3625) {
								if (Static40.aClass83_338 == null) {
									Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								} else {
									Static67.aClass83Array31[local25++] = Static40.aClass83_338.method2400();
								}
								continue;
							}
							if (local211 == 3626) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								if (Static102.aClass83_679 != null && Static141.anInt2978 > local775) {
									Static67.aClass83Array31[local25++] = Static135.aClass2_Sub27Array1[local775].aClass83_1220;
									continue;
								}
								Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								continue;
							}
						} else if (local211 < 4000) {
							if (local211 == 3903) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static72.aClass59Array2[local775].method2087();
								continue;
							}
							if (local211 == 3904) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static72.aClass59Array2[local775].anInt2749;
								continue;
							}
							if (local211 == 3905) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static72.aClass59Array2[local775].anInt2739;
								continue;
							}
							if (local211 == 3906) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static72.aClass59Array2[local775].anInt2743;
								continue;
							}
							if (local211 == 3907) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static72.aClass59Array2[local775].anInt2741;
								continue;
							}
							if (local211 == 3908) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static72.aClass59Array2[local775].anInt2745;
								continue;
							}
							if (local211 == 3910) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local769 = Static72.aClass59Array2[local775].method2086();
								Static85.anIntArray180[local27++] = local769 == 0 ? 1 : 0;
								continue;
							}
							if (local211 == 3911) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local769 = Static72.aClass59Array2[local775].method2086();
								Static85.anIntArray180[local27++] = local769 == 2 ? 1 : 0;
								continue;
							}
							if (local211 == 3912) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local769 = Static72.aClass59Array2[local775].method2086();
								Static85.anIntArray180[local27++] = local769 == 5 ? 1 : 0;
								continue;
							}
							if (local211 == 3913) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local769 = Static72.aClass59Array2[local775].method2086();
								Static85.anIntArray180[local27++] = local769 == 1 ? 1 : 0;
								continue;
							}
						} else if (local211 < 4100) {
							if (local211 == 4000) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = local775 + local769;
								continue;
							}
							if (local211 == 4001) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = local775 - local769;
								continue;
							}
							if (local211 == 4002) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = local775 * local769;
								continue;
							}
							if (local211 == 4003) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = local775 / local769;
								continue;
							}
							if (local211 == 4004) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = (int) ((double) local775 * Math.random());
								continue;
							}
							if (local211 == 4005) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = (int) ((double) (local775 + 1) * Math.random());
								continue;
							}
							if (local211 == 4006) {
								local27 -= 5;
								local1244 = Static85.anIntArray180[local27 + 2];
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								local628 = Static85.anIntArray180[local27 + 3];
								local650 = Static85.anIntArray180[local27 + 4];
								Static85.anIntArray180[local27++] = (local650 - local1244) * (-local775 + local769) / (local628 - local1244) + local775;
								continue;
							}
							@Pc(3342) long local3342;
							@Pc(3347) long local3347;
							if (local211 == 4007) {
								local27 -= 2;
								local3342 = Static85.anIntArray180[local27 + 1];
								local3347 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = (int) (local3347 * local3342 / 100L + local3347);
								continue;
							}
							if (local211 == 4008) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = local775 | 0x1 << local769;
								continue;
							}
							if (local211 == 4009) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = local775 & -(0x1 << local769) - 1;
								continue;
							}
							if (local211 == 4010) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = (local775 & 0x1 << local769) == 0 ? 0 : 1;
								continue;
							}
							if (local211 == 4011) {
								local27 -= 2;
								local769 = Static85.anIntArray180[local27 + 1];
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = local775 % local769;
								continue;
							}
							if (local211 == 4012) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								if (local775 == 0) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = (int) Math.pow((double) local775, (double) local769);
								}
								continue;
							}
							if (local211 == 4013) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								if (local775 == 0) {
									Static85.anIntArray180[local27++] = 0;
								} else if (local769 == 0) {
									Static85.anIntArray180[local27++] = Integer.MAX_VALUE;
								} else {
									Static85.anIntArray180[local27++] = (int) Math.pow((double) local775, 1.0D / (double) local769);
								}
								continue;
							}
							if (local211 == 4014) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = local769 & local775;
								continue;
							}
							if (local211 == 4015) {
								local27 -= 2;
								local769 = Static85.anIntArray180[local27 + 1];
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = local769 | local775;
								continue;
							}
							if (local211 == 4016) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = local775 >= local769 ? local769 : local775;
								continue;
							}
							if (local211 == 4017) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = local775 <= local769 ? local769 : local775;
								continue;
							}
							if (local211 == 4018) {
								local27 -= 3;
								local3347 = Static85.anIntArray180[local27];
								local3342 = Static85.anIntArray180[local27 + 1];
								@Pc(3697) long local3697 = (long) Static85.anIntArray180[local27 + 2];
								Static85.anIntArray180[local27++] = (int) (local3347 * local3697 / local3342);
								continue;
							}
						} else if (local211 < 4200) {
							if (local211 == 4100) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								local27--;
								local769 = Static85.anIntArray180[local27];
								Static67.aClass83Array31[local25++] = Static67.method1268(new Class83[] { local584, Static129.method2179(local769) });
								continue;
							}
							if (local211 == 4101) {
								local25 -= 2;
								local584 = Static67.aClass83Array31[local25];
								local1364 = Static67.aClass83Array31[local25 + 1];
								Static67.aClass83Array31[local25++] = Static67.method1268(new Class83[] { local584, local1364 });
								continue;
							}
							if (local211 == 4102) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								local27--;
								local769 = Static85.anIntArray180[local27];
								Static67.aClass83Array31[local25++] = Static67.method1268(new Class83[] { local584, Static39.method785(local769) });
								continue;
							}
							if (local211 == 4103) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static67.aClass83Array31[local25++] = local584.method2430();
								continue;
							}
							if (local211 == 4104) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								@Pc(3845) long local3845 = (long) local775 * 86400000L + 1014768000000L;
								Static46.aCalendar2.setTime(new Date(local3845));
								local628 = Static46.aCalendar2.get(5);
								local650 = Static46.aCalendar2.get(2);
								local1472 = Static46.aCalendar2.get(1);
								Static67.aClass83Array31[local25++] = Static67.method1268(new Class83[] { Static129.method2179(local628), Static189.aClass83_1093, Static77.aClass83Array32[local650], Static189.aClass83_1093, Static129.method2179(local1472) });
								continue;
							}
							if (local211 == 4105) {
								local25 -= 2;
								local584 = Static67.aClass83Array31[local25];
								local1364 = Static67.aClass83Array31[local25 + 1];
								if (Static54.aClass24_Sub4_Sub1_1.aClass49_2 != null && Static54.aClass24_Sub4_Sub1_1.aClass49_2.aBoolean100) {
									Static67.aClass83Array31[local25++] = local1364;
									continue;
								}
								Static67.aClass83Array31[local25++] = local584;
								continue;
							}
							if (local211 == 4106) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static67.aClass83Array31[local25++] = Static129.method2179(local775);
								continue;
							}
							if (local211 == 4107) {
								local25 -= 2;
								Static85.anIntArray180[local27++] = Static67.aClass83Array31[local25].method2384(Static67.aClass83Array31[local25 + 1]);
								continue;
							}
							@Pc(3998) byte[] local3998;
							@Pc(4003) Class2_Sub2_Sub5_Sub1_Sub1 local4003;
							if (local211 == 4108) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								local27 -= 2;
								local1244 = Static85.anIntArray180[local27 + 1];
								local769 = Static85.anIntArray180[local27];
								local3998 = Static73.aClass28_Sub1_11.method852(0, local1244);
								local4003 = new Class2_Sub2_Sub5_Sub1_Sub1(local3998);
								local4003.method1085(Static177.aClass29Array8, null);
								Static85.anIntArray180[local27++] = local4003.method1078(local584, local769);
								continue;
							}
							if (local211 == 4109) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								local27 -= 2;
								local769 = Static85.anIntArray180[local27];
								local1244 = Static85.anIntArray180[local27 + 1];
								local3998 = Static73.aClass28_Sub1_11.method852(0, local1244);
								local4003 = new Class2_Sub2_Sub5_Sub1_Sub1(local3998);
								local4003.method1085(Static177.aClass29Array8, null);
								Static85.anIntArray180[local27++] = local4003.method1094(local584, local769);
								continue;
							}
							if (local211 == 4110) {
								local25 -= 2;
								local1364 = Static67.aClass83Array31[local25 + 1];
								local584 = Static67.aClass83Array31[local25];
								local27--;
								if (Static85.anIntArray180[local27] == 1) {
									Static67.aClass83Array31[local25++] = local584;
								} else {
									Static67.aClass83Array31[local25++] = local1364;
								}
								continue;
							}
							if (local211 == 4111) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static67.aClass83Array31[local25++] = Static136.method1098(local584);
								continue;
							}
							if (local211 == 4112) {
								local27--;
								local769 = Static85.anIntArray180[local27];
								local25--;
								local584 = Static67.aClass83Array31[local25];
								if (local769 == -1) {
									throw new RuntimeException("null char");
								}
								Static67.aClass83Array31[local25++] = local584.method2401(local769);
								continue;
							}
							if (local211 == 4113) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static72.method416(local775) ? 1 : 0;
								continue;
							}
							if (local211 == 4114) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static107.method2363(local775) ? 1 : 0;
								continue;
							}
							if (local211 == 4115) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static87.method1515(local775) ? 1 : 0;
								continue;
							}
							if (local211 == 4116) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static189.method2863(local775) ? 1 : 0;
								continue;
							}
							if (local211 == 4117) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								if (local584 == null) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = local584.method2428();
								}
								continue;
							}
							if (local211 == 4118) {
								local27 -= 2;
								local25--;
								local584 = Static67.aClass83Array31[local25];
								local769 = Static85.anIntArray180[local27];
								local1244 = Static85.anIntArray180[local27 + 1];
								Static67.aClass83Array31[local25++] = local584.method2416(local1244, local769);
								continue;
							}
							if (local211 == 4119) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								@Pc(4307) boolean local4307 = false;
								local1364 = Static102.method1759(local584.method2428());
								for (local628 = 0; local628 < local584.method2428(); local628++) {
									local650 = local584.method2421(local628);
									if (local650 == 60) {
										local4307 = true;
									} else if (local650 == 62) {
										local4307 = false;
									} else if (!local4307) {
										local1364.method2409(local650);
									}
								}
								local1364.method2410();
								Static67.aClass83Array31[local25++] = local1364;
								continue;
							}
							if (local211 == 4120) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								local27 -= 2;
								local1244 = Static85.anIntArray180[local27 + 1];
								local769 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = local584.method2382(local1244, local769);
								continue;
							}
							if (local211 == 4121) {
								local25 -= 2;
								local1364 = Static67.aClass83Array31[local25 + 1];
								local584 = Static67.aClass83Array31[local25];
								local27--;
								local1244 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = local584.method2385(local1364, local1244);
								continue;
							}
							if (local211 == 4122) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static149.method2326(local775);
								continue;
							}
							if (local211 == 4123) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static113.method1991(local775);
								continue;
							}
						} else if (local211 < 4300) {
							if (local211 == 4200) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static67.aClass83Array31[local25++] = Static113.method1987(local775).aClass83_87;
								continue;
							}
							@Pc(4497) Class2_Sub2_Sub3 local4497;
							if (local211 == 4201) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								local4497 = Static113.method1987(local775);
								if (local769 >= 1 && local769 <= 5 && local4497.aClass83Array9[local769 - 1] != null) {
									Static67.aClass83Array31[local25++] = local4497.aClass83Array9[local769 - 1];
									continue;
								}
								Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								continue;
							}
							if (local211 == 4202) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								local4497 = Static113.method1987(local775);
								if (local769 >= 1 && local769 <= 5 && local4497.aClass83Array8[local769 - 1] != null) {
									Static67.aClass83Array31[local25++] = local4497.aClass83Array8[local769 - 1];
									continue;
								}
								Static67.aClass83Array31[local25++] = Static78.aClass83_559;
								continue;
							}
							if (local211 == 4203) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static113.method1987(local775).anInt448;
								continue;
							}
							if (local211 == 4204) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static113.method1987(local775).anInt465 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4642) Class2_Sub2_Sub3 local4642;
							if (local211 == 4205) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local4642 = Static113.method1987(local775);
								if (local4642.anInt466 == -1 && local4642.anInt423 >= 0) {
									Static85.anIntArray180[local27++] = local4642.anInt423;
									continue;
								}
								Static85.anIntArray180[local27++] = local775;
								continue;
							}
							if (local211 == 4206) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local4642 = Static113.method1987(local775);
								if (local4642.anInt466 >= 0 && local4642.anInt423 >= 0) {
									Static85.anIntArray180[local27++] = local4642.anInt423;
									continue;
								}
								Static85.anIntArray180[local27++] = local775;
								continue;
							}
							if (local211 == 4207) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static113.method1987(local775).aBoolean25 ? 1 : 0;
								continue;
							}
							if (local211 == 4210) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								local27--;
								local769 = Static85.anIntArray180[local27];
								Static132.method2197(local769 == 1, local584);
								Static85.anIntArray180[local27++] = Static95.anInt2021;
								continue;
							}
							if (local211 == 4211) {
								if (Static141.aShortArray29 != null && Static210.anInt4185 < Static95.anInt2021) {
									Static85.anIntArray180[local27++] = Static141.aShortArray29[Static210.anInt4185++] & 0xFFFF;
									continue;
								}
								Static85.anIntArray180[local27++] = -1;
								continue;
							}
							if (local211 == 4212) {
								Static210.anInt4185 = 0;
								continue;
							}
						} else if (local211 < 5100) {
							if (local211 == 5000) {
								Static85.anIntArray180[local27++] = Static93.anInt1979;
								continue;
							}
							if (local211 == 5001) {
								local27 -= 3;
								Static93.anInt1979 = Static85.anIntArray180[local27];
								Static82.anInt1827 = Static85.anIntArray180[local27 + 1];
								Static37.anInt948 = Static85.anIntArray180[local27 + 2];
								Static69.aClass2_Sub3_Sub1_2.method284(38);
								Static69.aClass2_Sub3_Sub1_2.method247(Static93.anInt1979);
								Static69.aClass2_Sub3_Sub1_2.method247(Static82.anInt1827);
								Static69.aClass2_Sub3_Sub1_2.method247(Static37.anInt948);
								continue;
							}
							if (local211 == 5002) {
								local27 -= 2;
								local25--;
								local584 = Static67.aClass83Array31[local25];
								local769 = Static85.anIntArray180[local27];
								local1244 = Static85.anIntArray180[local27 + 1];
								Static69.aClass2_Sub3_Sub1_2.method284(27);
								Static69.aClass2_Sub3_Sub1_2.method249(local584.method2397());
								Static69.aClass2_Sub3_Sub1_2.method247(local769 - 1);
								Static69.aClass2_Sub3_Sub1_2.method247(local1244);
								continue;
							}
							if (local211 == 5003) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local1364 = null;
								if (local775 < 100) {
									local1364 = Static33.aClass83Array19[local775];
								}
								if (local1364 == null) {
									local1364 = Static78.aClass83_559;
								}
								Static67.aClass83Array31[local25++] = local1364;
								continue;
							}
							if (local211 == 5004) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local769 = -1;
								if (local775 < 100 && Static33.aClass83Array19[local775] != null) {
									local769 = Static83.anIntArray177[local775];
								}
								Static85.anIntArray180[local27++] = local769;
								continue;
							}
							if (local211 == 5005) {
								Static85.anIntArray180[local27++] = Static82.anInt1827;
								continue;
							}
							if (local211 == 5008) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								if (local584.method2415(Static10.aClass83_70)) {
									Static193.method2905(local584);
								} else {
									@Pc(5248) byte local5248 = 0;
									@Pc(5250) byte local5250 = 0;
									local1364 = local584.method2430();
									if (local1364.method2415(Static158.aClass83_941)) {
										local584 = local584.method2422(Static158.aClass83_941.method2428());
										local5250 = 0;
									} else if (local1364.method2415(Static173.aClass83_1029)) {
										local5250 = 1;
										local584 = local584.method2422(Static173.aClass83_1029.method2428());
									} else if (local1364.method2415(Static6.aClass83_28)) {
										local5250 = 2;
										local584 = local584.method2422(Static6.aClass83_28.method2428());
									} else if (local1364.method2415(Static135.aClass83_856)) {
										local584 = local584.method2422(Static135.aClass83_856.method2428());
										local5250 = 3;
									} else if (local1364.method2415(Static31.aClass83_232)) {
										local584 = local584.method2422(Static31.aClass83_232.method2428());
										local5250 = 4;
									} else if (local1364.method2415(Static128.aClass83_830)) {
										local584 = local584.method2422(Static128.aClass83_830.method2428());
										local5250 = 5;
									} else if (local1364.method2415(Static168.aClass83_1000)) {
										local584 = local584.method2422(Static168.aClass83_1000.method2428());
										local5250 = 6;
									} else if (local1364.method2415(Static210.aClass83_1198)) {
										local5250 = 7;
										local584 = local584.method2422(Static210.aClass83_1198.method2428());
									} else if (local1364.method2415(Static101.aClass83_672)) {
										local5250 = 8;
										local584 = local584.method2422(Static101.aClass83_672.method2428());
									} else if (local1364.method2415(Static95.aClass83_618)) {
										local584 = local584.method2422(Static95.aClass83_618.method2428());
										local5250 = 9;
									} else if (local1364.method2415(Static215.aClass83_1227)) {
										local584 = local584.method2422(Static215.aClass83_1227.method2428());
										local5250 = 10;
									} else if (local1364.method2415(Static185.aClass83_1078)) {
										local5250 = 11;
										local584 = local584.method2422(Static185.aClass83_1078.method2428());
									} else if (Static98.anInt2134 != 0) {
										if (local1364.method2415(Static158.aClass83_940)) {
											local584 = local584.method2422(Static158.aClass83_940.method2428());
											local5250 = 0;
										} else if (local1364.method2415(Static173.aClass83_1024)) {
											local584 = local584.method2422(Static173.aClass83_1024.method2428());
											local5250 = 1;
										} else if (local1364.method2415(Static6.aClass83_33)) {
											local584 = local584.method2422(Static6.aClass83_33.method2428());
											local5250 = 2;
										} else if (local1364.method2415(Static135.aClass83_858)) {
											local584 = local584.method2422(Static135.aClass83_858.method2428());
											local5250 = 3;
										} else if (local1364.method2415(Static31.aClass83_230)) {
											local5250 = 4;
											local584 = local584.method2422(Static31.aClass83_230.method2428());
										} else if (local1364.method2415(Static128.aClass83_829)) {
											local5250 = 5;
											local584 = local584.method2422(Static128.aClass83_829.method2428());
										} else if (local1364.method2415(Static168.aClass83_1001)) {
											local5250 = 6;
											local584 = local584.method2422(Static168.aClass83_1001.method2428());
										} else if (local1364.method2415(Static210.aClass83_1197)) {
											local5250 = 7;
											local584 = local584.method2422(Static210.aClass83_1197.method2428());
										} else if (local1364.method2415(Static101.aClass83_673)) {
											local5250 = 8;
											local584 = local584.method2422(Static101.aClass83_673.method2428());
										} else if (local1364.method2415(Static95.aClass83_622)) {
											local584 = local584.method2422(Static95.aClass83_622.method2428());
											local5250 = 9;
										} else if (local1364.method2415(Static215.aClass83_1222)) {
											local584 = local584.method2422(Static215.aClass83_1222.method2428());
											local5250 = 10;
										} else if (local1364.method2415(Static185.aClass83_1082)) {
											local5250 = 11;
											local584 = local584.method2422(Static185.aClass83_1082.method2428());
										}
									}
									local1364 = local584.method2430();
									if (local1364.method2415(Static7.aClass83_39)) {
										local584 = local584.method2422(Static7.aClass83_39.method2428());
										local5248 = 1;
									} else if (local1364.method2415(Static87.aClass83_594)) {
										local5248 = 2;
										local584 = local584.method2422(Static87.aClass83_594.method2428());
									} else if (local1364.method2415(Static138.aClass83_866)) {
										local5248 = 3;
										local584 = local584.method2422(Static138.aClass83_866.method2428());
									} else if (local1364.method2415(Static167.aClass83_991)) {
										local584 = local584.method2422(Static167.aClass83_991.method2428());
										local5248 = 4;
									} else if (local1364.method2415(Static8.aClass83_46)) {
										local5248 = 5;
										local584 = local584.method2422(Static8.aClass83_46.method2428());
									} else if (Static98.anInt2134 != 0) {
										if (local1364.method2415(Static7.aClass83_38)) {
											local584 = local584.method2422(Static7.aClass83_38.method2428());
											local5248 = 1;
										} else if (local1364.method2415(Static87.aClass83_599)) {
											local584 = local584.method2422(Static87.aClass83_599.method2428());
											local5248 = 2;
										} else if (local1364.method2415(Static138.aClass83_865)) {
											local5248 = 3;
											local584 = local584.method2422(Static138.aClass83_865.method2428());
										} else if (local1364.method2415(Static167.aClass83_993)) {
											local584 = local584.method2422(Static167.aClass83_993.method2428());
											local5248 = 4;
										} else if (local1364.method2415(Static8.aClass83_51)) {
											local5248 = 5;
											local584 = local584.method2422(Static8.aClass83_51.method2428());
										}
									}
									Static69.aClass2_Sub3_Sub1_2.method284(51);
									Static69.aClass2_Sub3_Sub1_2.method247(0);
									local650 = Static69.aClass2_Sub3_Sub1_2.anInt340;
									Static69.aClass2_Sub3_Sub1_2.method247(local5250);
									Static69.aClass2_Sub3_Sub1_2.method247(local5248);
									Static131.method2187(Static69.aClass2_Sub3_Sub1_2, local584);
									Static69.aClass2_Sub3_Sub1_2.method255(Static69.aClass2_Sub3_Sub1_2.anInt340 - local650);
								}
								continue;
							}
							if (local211 == 5009) {
								local25 -= 2;
								local1364 = Static67.aClass83Array31[local25 + 1];
								local584 = Static67.aClass83Array31[local25];
								Static69.aClass2_Sub3_Sub1_2.method284(31);
								Static69.aClass2_Sub3_Sub1_2.method247(0);
								local1244 = Static69.aClass2_Sub3_Sub1_2.anInt340;
								Static69.aClass2_Sub3_Sub1_2.method249(local584.method2397());
								Static131.method2187(Static69.aClass2_Sub3_Sub1_2, local1364);
								Static69.aClass2_Sub3_Sub1_2.method255(Static69.aClass2_Sub3_Sub1_2.anInt340 - local1244);
								continue;
							}
							if (local211 == 5010) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local1364 = null;
								if (local775 < 100) {
									local1364 = Static98.aClass83Array36[local775];
								}
								if (local1364 == null) {
									local1364 = Static78.aClass83_559;
								}
								Static67.aClass83Array31[local25++] = local1364;
								continue;
							}
							if (local211 == 5011) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local1364 = null;
								if (local775 < 100) {
									local1364 = Static13.aClass83Array6[local775];
								}
								if (local1364 == null) {
									local1364 = Static78.aClass83_559;
								}
								Static67.aClass83Array31[local25++] = local1364;
								continue;
							}
							if (local211 == 5012) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local769 = -1;
								if (local775 < 100) {
									local769 = Static10.anIntArray20[local775];
								}
								Static85.anIntArray180[local27++] = local769;
								continue;
							}
							if (local211 == 5015) {
								if (Static54.aClass24_Sub4_Sub1_1 == null || Static54.aClass24_Sub4_Sub1_1.aClass83_664 == null) {
									local584 = Static206.aClass83_1172;
								} else {
									local584 = Static54.aClass24_Sub4_Sub1_1.aClass83_664;
								}
								Static67.aClass83Array31[local25++] = local584;
								continue;
							}
							if (local211 == 5016) {
								Static85.anIntArray180[local27++] = Static37.anInt948;
								continue;
							}
							if (local211 == 5017) {
								Static85.anIntArray180[local27++] = Static215.anInt4271;
								continue;
							}
							if (local211 == 5050) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static67.aClass83Array31[local25++] = Static102.method1758(local775).aClass83_401;
								continue;
							}
							@Pc(6054) Class2_Sub2_Sub9 local6054;
							if (local211 == 5051) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local6054 = Static102.method1758(local775);
								if (local6054.anIntArray101 == null) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = local6054.anIntArray101.length;
								}
								continue;
							}
							if (local211 == 5052) {
								local27 -= 2;
								local769 = Static85.anIntArray180[local27 + 1];
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static102.method1758(local775).anIntArray101[local769];
								continue;
							}
							if (local211 == 5053) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								local6054 = Static102.method1758(local775);
								if (local6054.anIntArray103 == null) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = local6054.anIntArray103.length;
								}
								continue;
							}
							if (local211 == 5054) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = Static102.method1758(local775).anIntArray103[local769];
								continue;
							}
							if (local211 == 5055) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static67.aClass83Array31[local25++] = Static212.method3222(local775).method1990();
								continue;
							}
							if (local211 == 5056) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								@Pc(6193) Class2_Sub2_Sub18 local6193 = Static212.method3222(local775);
								if (local6193.anIntArray256 == null) {
									Static85.anIntArray180[local27++] = 0;
								} else {
									Static85.anIntArray180[local27++] = local6193.anIntArray256.length;
								}
								continue;
							}
							if (local211 == 5057) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = Static212.method3222(local775).anIntArray256[local769];
								continue;
							}
							if (local211 == 5058) {
								Static94.aClass85_1 = new Class85();
								local27--;
								Static94.aClass85_1.anInt3228 = Static85.anIntArray180[local27];
								Static94.aClass85_1.aClass2_Sub2_Sub18_1 = Static212.method3222(Static94.aClass85_1.anInt3228);
								Static94.aClass85_1.anIntArray313 = new int[Static94.aClass85_1.aClass2_Sub2_Sub18_1.method1986()];
								continue;
							}
							if (local211 == 5059) {
								Static69.aClass2_Sub3_Sub1_2.method284(119);
								Static69.aClass2_Sub3_Sub1_2.method247(0);
								local775 = Static69.aClass2_Sub3_Sub1_2.anInt340;
								Static69.aClass2_Sub3_Sub1_2.method247(0);
								Static69.aClass2_Sub3_Sub1_2.method239(Static94.aClass85_1.anInt3228);
								Static94.aClass85_1.aClass2_Sub2_Sub18_1.method1994(Static69.aClass2_Sub3_Sub1_2, Static94.aClass85_1.anIntArray313);
								Static69.aClass2_Sub3_Sub1_2.method255(Static69.aClass2_Sub3_Sub1_2.anInt340 - local775);
								continue;
							}
							if (local211 == 5060) {
								local25--;
								local584 = Static67.aClass83Array31[local25];
								Static69.aClass2_Sub3_Sub1_2.method284(208);
								Static69.aClass2_Sub3_Sub1_2.method247(0);
								local769 = Static69.aClass2_Sub3_Sub1_2.anInt340;
								Static69.aClass2_Sub3_Sub1_2.method249(local584.method2397());
								Static69.aClass2_Sub3_Sub1_2.method239(Static94.aClass85_1.anInt3228);
								Static94.aClass85_1.aClass2_Sub2_Sub18_1.method1994(Static69.aClass2_Sub3_Sub1_2, Static94.aClass85_1.anIntArray313);
								Static69.aClass2_Sub3_Sub1_2.method255(Static69.aClass2_Sub3_Sub1_2.anInt340 - local769);
								continue;
							}
							if (local211 == 5061) {
								Static69.aClass2_Sub3_Sub1_2.method284(119);
								Static69.aClass2_Sub3_Sub1_2.method247(0);
								local775 = Static69.aClass2_Sub3_Sub1_2.anInt340;
								Static69.aClass2_Sub3_Sub1_2.method247(1);
								Static69.aClass2_Sub3_Sub1_2.method239(Static94.aClass85_1.anInt3228);
								Static94.aClass85_1.aClass2_Sub2_Sub18_1.method1994(Static69.aClass2_Sub3_Sub1_2, Static94.aClass85_1.anIntArray313);
								Static69.aClass2_Sub3_Sub1_2.method255(Static69.aClass2_Sub3_Sub1_2.anInt340 - local775);
								continue;
							}
							if (local211 == 5062) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static85.anIntArray180[local27++] = Static102.method1758(local775).anIntArray100[local769];
								continue;
							}
							if (local211 == 5063) {
								local27 -= 2;
								local769 = Static85.anIntArray180[local27 + 1];
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static102.method1758(local775).anIntArray99[local769];
								continue;
							}
							if (local211 == 5064) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								if (local769 == -1) {
									Static85.anIntArray180[local27++] = -1;
								} else {
									Static85.anIntArray180[local27++] = Static102.method1758(local775).method1022(local769);
								}
								continue;
							}
							if (local211 == 5065) {
								local27 -= 2;
								local769 = Static85.anIntArray180[local27 + 1];
								local775 = Static85.anIntArray180[local27];
								if (local769 == -1) {
									Static85.anIntArray180[local27++] = -1;
								} else {
									Static85.anIntArray180[local27++] = Static102.method1758(local775).method1025(local769);
								}
								continue;
							}
							if (local211 == 5066) {
								local27--;
								local775 = Static85.anIntArray180[local27];
								Static85.anIntArray180[local27++] = Static212.method3222(local775).method1986();
								continue;
							}
							if (local211 == 5067) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								local1244 = Static212.method3222(local775).method1995(local769);
								System.out.println("chatphrase_getdynamiccommand=" + local1244);
								Static85.anIntArray180[local27++] = local1244;
								continue;
							}
							if (local211 == 5068) {
								local27 -= 2;
								local769 = Static85.anIntArray180[local27 + 1];
								local775 = Static85.anIntArray180[local27];
								Static94.aClass85_1.anIntArray313[local775] = local769;
								continue;
							}
							if (local211 == 5069) {
								local27 -= 2;
								local775 = Static85.anIntArray180[local27];
								local769 = Static85.anIntArray180[local27 + 1];
								Static94.aClass85_1.anIntArray313[local775] = local769;
								continue;
							}
							if (local211 == 5070) {
								local27 -= 3;
								local769 = Static85.anIntArray180[local27 + 1];
								local1244 = Static85.anIntArray180[local27 + 2];
								local775 = Static85.anIntArray180[local27];
								@Pc(6667) Class2_Sub2_Sub18 local6667 = Static212.method3222(local775);
								if (local6667.method1995(local769) != 0) {
									throw new RuntimeException("bad command");
								}
								Static85.anIntArray180[local27++] = local6667.method1988(local1244, local769);
								continue;
							}
						} else if (local211 < 5200) {
							if (local211 == 5100) {
								if (Static71.aBooleanArray10[86]) {
									Static85.anIntArray180[local27++] = 1;
								} else {
									Static85.anIntArray180[local27++] = 0;
								}
								continue;
							}
							if (local211 == 5101) {
								if (Static71.aBooleanArray10[82]) {
									Static85.anIntArray180[local27++] = 1;
								} else {
									Static85.anIntArray180[local27++] = 0;
								}
								continue;
							}
							if (local211 == 5102) {
								if (Static71.aBooleanArray10[81]) {
									Static85.anIntArray180[local27++] = 1;
								} else {
									Static85.anIntArray180[local27++] = 0;
								}
								continue;
							}
						} else if (local211 < 5300) {
							if (local211 == 5200) {
								local27--;
								Static196.method2942(Static85.anIntArray180[local27]);
								continue;
							}
							if (local211 == 5201) {
								Static85.anIntArray180[local27++] = Static214.method3239();
								continue;
							}
							if (local211 == 5202) {
								local27--;
								Static207.method3120(Static85.anIntArray180[local27]);
								continue;
							}
							if (local211 == 5203) {
								local25--;
								Static105.method1824(Static67.aClass83Array31[local25]);
								continue;
							}
							if (local211 == 5204) {
								Static67.aClass83Array31[local25 - 1] = Static175.method2696(Static67.aClass83Array31[local25 - 1]);
								continue;
							}
							if (local211 == 5205) {
								local25--;
								Static210.method3191(Static67.aClass83Array31[local25]);
								continue;
							}
						} else if (local211 >= 5400) {
							if (local211 < 5500) {
								if (local211 == 5400) {
									local25 -= 2;
									local584 = Static67.aClass83Array31[local25];
									local1364 = Static67.aClass83Array31[local25 + 1];
									local27--;
									local1244 = Static85.anIntArray180[local27];
									Static69.aClass2_Sub3_Sub1_2.method284(195);
									Static69.aClass2_Sub3_Sub1_2.method247(Static168.method2614(local584) + Static168.method2614(local1364) + 1);
									Static69.aClass2_Sub3_Sub1_2.method229(local584);
									Static69.aClass2_Sub3_Sub1_2.method229(local1364);
									Static69.aClass2_Sub3_Sub1_2.method247(local1244);
									continue;
								}
								if (local211 == 5401) {
									local27 -= 2;
									Static116.aShortArray26[Static85.anIntArray180[local27]] = (short) Static142.method2280(Static85.anIntArray180[local27 + 1]);
									continue;
								}
							}
						} else if (local211 == 5304) {
							Static85.anIntArray180[local27++] = 0;
							continue;
						}
					}
				} else {
					if (local211 >= 2000) {
						local27--;
						local1003 = Static74.method1401(Static85.anIntArray180[local27]);
						local211 -= 1000;
					} else {
						local1003 = local961 ? Static31.aClass5_7 : Static182.aClass5_17;
					}
					if (local211 == 1000) {
						local27 -= 2;
						local1003.aByte1 = 0;
						local1003.anInt154 = local1003.anInt101 = Static85.anIntArray180[local27];
						local1003.aByte4 = 0;
						local1003.anInt105 = local1003.anInt121 = Static85.anIntArray180[local27 + 1];
						Static121.method2085(local1003);
						continue;
					}
					if (local211 == 1001) {
						local1003.aByte3 = 0;
						local27 -= 2;
						local1003.anInt157 = local1003.anInt111 = Static85.anIntArray180[local27];
						local1003.anInt177 = 0;
						local1003.aByte2 = 0;
						local1003.anInt100 = local1003.anInt108 = Static85.anIntArray180[local27 + 1];
						local1003.anInt151 = 0;
						Static121.method2085(local1003);
						if (local1003.anInt130 == 0) {
							Static48.method960(local1003);
						}
						continue;
					}
					if (local211 == 1003) {
						local27--;
						@Pc(1110) boolean local1110 = Static85.anIntArray180[local27] == 1;
						if (local1110 != local1003.aBoolean19) {
							local1003.aBoolean19 = local1110;
							Static121.method2085(local1003);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(8992) Exception local8992) {
			if (local18.aClass83_814 == null) {
				if (Static214.anInt4256 != 0) {
					Static165.method2554(0, Static61.aClass83_474, Static78.aClass83_559);
				}
				Static188.method2856("CS2 - scr:" + local18.aLong149 + " op:" + local34, local8992);
			} else {
				@Pc(8999) Class83 local8999 = Static102.method1759(30);
				local8999.method2417(Static15.aClass83_83).method2417(local18.aClass83_814);
				for (local63 = Static153.anInt3312 - 1; local63 >= 0; local63--) {
					local8999.method2417(Static206.aClass83_1167).method2417(Static118.aClass14Array1[local63].aClass2_Sub2_Sub21_1.aClass83_814);
				}
				if (local34 == 40) {
					local76 = local37[local29];
					local8999.method2417(Static158.aClass83_944).method2417(Static129.method2179(local76));
				}
				if (Static214.anInt4256 != 0) {
					Static165.method2554(0, Static67.method1268(new Class83[] { Static58.aClass83_458, local18.aClass83_814 }), Static78.aClass83_559);
				}
				Static188.method2856("CS2 - scr:" + local18.aLong149 + " op:" + local34 + new String(local8999.method2418()), local8992);
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLclient!eh;ILclient!fj;Lclient!eh;)V")
	public static void method291(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) Class2_Sub2_Sub5_Sub1_Sub1 arg2, @OriginalArg(4) Class28 arg3) {
		Static31.aClass28_39 = arg3;
		Static39.aClass28_46 = arg1;
		Static153.aBoolean155 = arg0;
		@Pc(11) int local11 = Static39.aClass28_46.method849() - 1;
		Static52.anInt1337 = Static39.aClass28_46.method846(local11) + local11 * 256;
		Static56.aClass2_Sub2_Sub5_Sub1_Sub1_1 = arg2;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIII)V")
	public static void method292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 + 1;
		Static22.method438(arg0, arg3, arg2, Static14.anIntArrayArray18[arg4]);
		@Pc(22) int local22 = arg1 - 1;
		Static22.method438(arg0, arg3, arg2, Static14.anIntArrayArray18[arg1]);
		for (@Pc(26) int local26 = local8; local26 <= local22; local26++) {
			@Pc(32) int[] local32 = Static14.anIntArrayArray18[local26];
			local32[arg2] = local32[arg0] = arg3;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
	public static void method293(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub22 local10 = (Class2_Sub22) Static135.aClass63_10.method2110((long) arg0);
		if (local10 != null) {
			local10.method3254();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIILclient!gj;I)Lclient!gj;")
	public static Class24_Sub3 method294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class24_Sub3 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg3;
		@Pc(14) Class24_Sub3 local14 = (Class24_Sub3) Static147.aClass91_15.method2702(local8);
		if (local14 == null) {
			@Pc(21) Class24_Sub7 local21 = Static198.method2988(Static160.aClass28_Sub1_24, arg3);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method2991(64, 768, -50, -10, -50);
			Static147.aClass91_15.method2710(local8, local14);
		}
		@Pc(46) int local46 = arg4.method2730();
		@Pc(49) int local49 = arg4.method2739();
		@Pc(52) int local52 = arg4.method2731();
		@Pc(55) int local55 = arg4.method2732();
		local14 = local14.method2725(true);
		if (arg0 != 0) {
			local14.method2735(arg0);
		}
		@Pc(67) Class24_Sub3_Sub1 local67 = (Class24_Sub3_Sub1) local14;
		if (arg5 != Static177.method2711(arg1 + local46, Static43.anInt1126, arg2 + local52) || Static177.method2711(local49 + arg1, Static43.anInt1126, local55 + arg2) != arg5) {
			for (@Pc(93) int local93 = 0; local93 < local67.anInt3632; local93++) {
				local67.anIntArray340[local93] += Static177.method2711(arg1 + local67.anIntArray329[local93], Static43.anInt1126, arg2 + local67.anIntArray334[local93]) - arg5;
			}
			local67.aBoolean171 = false;
		}
		return local14;
	}
}
