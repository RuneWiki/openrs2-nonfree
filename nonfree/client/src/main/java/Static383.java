import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public static int anInt9871;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method8453(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static140.aClass42Array4 != Static146.aClass42Array3) {
			@Pc(12) int local12 = Static655.aClass42Array5[arg1].method7453(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class42 local19 = Static655.aClass42Array5[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7453(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7461(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
	public static void method8454() {
		Static395.method2780(false);
		Static668.anInt10539 = 0;
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < Static352.aByteArrayArray21.length; local19++) {
			if (Static311.anIntArray368[local19] != -1 && Static352.aByteArrayArray21[local19] == null) {
				Static352.aByteArrayArray21[local19] = Static151.aClass34_38.method1239(Static311.anIntArray368[local19], 0);
				if (Static352.aByteArrayArray21[local19] == null) {
					local17 = false;
					Static668.anInt10539++;
				}
			}
			if (Static211.anIntArray729[local19] != -1 && Static315.aByteArrayArray16[local19] == null) {
				Static315.aByteArrayArray16[local19] = Static151.aClass34_38.method1230(0, Static80.anIntArrayArray8[local19], Static211.anIntArray729[local19]);
				if (Static315.aByteArrayArray16[local19] == null) {
					Static668.anInt10539++;
					local17 = false;
				}
			}
			if (Static572.anIntArray632[local19] != -1 && Static661.aByteArrayArray28[local19] == null) {
				Static661.aByteArrayArray28[local19] = Static151.aClass34_38.method1239(Static572.anIntArray632[local19], 0);
				if (Static661.aByteArrayArray28[local19] == null) {
					Static668.anInt10539++;
					local17 = false;
				}
			}
			if (Static142.anIntArray366[local19] != -1 && Static8.aByteArrayArray1[local19] == null) {
				Static8.aByteArrayArray1[local19] = Static151.aClass34_38.method1239(Static142.anIntArray366[local19], 0);
				if (Static8.aByteArrayArray1[local19] == null) {
					local17 = false;
					Static668.anInt10539++;
				}
			}
			if (Static146.anIntArray195 != null && Static275.aByteArrayArray12[local19] == null && Static146.anIntArray195[local19] != -1) {
				Static275.aByteArrayArray12[local19] = Static151.aClass34_38.method1230(0, Static80.anIntArrayArray8[local19], Static146.anIntArray195[local19]);
				if (Static275.aByteArrayArray12[local19] == null) {
					Static668.anInt10539++;
					local17 = false;
				}
			}
		}
		if (Static545.aClass225_3 == null) {
			if (Static656.aClass4_Sub5_Sub3_3 == null || !Static329.aClass34_71.method1242(Static656.aClass4_Sub5_Sub3_3.aString9 + "_staticelements")) {
				Static545.aClass225_3 = new Class225(0);
			} else if (Static329.aClass34_71.method1246(Static656.aClass4_Sub5_Sub3_3.aString9 + "_staticelements")) {
				Static545.aClass225_3 = Static285.method4106(Static656.aClass4_Sub5_Sub3_3.aString9 + "_staticelements", Static329.aClass34_71, Static307.aBoolean718);
			} else {
				local17 = false;
				Static668.anInt10539++;
			}
		}
		if (!local17) {
			Static162.anInt2719 = 1;
			return;
		}
		Static225.anInt3564 = 0;
		local17 = true;
		@Pc(270) int local270;
		@Pc(281) int local281;
		for (@Pc(251) int local251 = 0; local251 < Static352.aByteArrayArray21.length; local251++) {
			@Pc(257) byte[] local257 = Static315.aByteArrayArray16[local251];
			if (local257 != null) {
				local270 = (Static472.anIntArray505[local251] >> 8) * 64 - Static445.anInt6949;
				local281 = (Static472.anIntArray505[local251] & 0xFF) * 64 - Static321.anInt5000;
				if (Static124.anInt2310 != 0) {
					local270 = 10;
					local281 = 10;
				}
				local17 &= Static514.method6975(local257, local270, local281, Static267.anInt4309, Static224.anInt3557);
			}
			local257 = Static8.aByteArrayArray1[local251];
			if (local257 != null) {
				local270 = (Static472.anIntArray505[local251] >> 8) * 64 - Static445.anInt6949;
				local281 = (Static472.anIntArray505[local251] & 0xFF) * 64 - Static321.anInt5000;
				if (Static124.anInt2310 != 0) {
					local281 = 10;
					local270 = 10;
				}
				local17 &= Static514.method6975(local257, local270, local281, Static267.anInt4309, Static224.anInt3557);
			}
		}
		if (!local17) {
			Static162.anInt2719 = 2;
			return;
		}
		if (Static162.anInt2719 != 0) {
			Static460.method6416(Static279.aClass179_12.method4066(Static164.anInt2984) + "<br>(100%)", Static636.aClass31_14, Static582.aClass33_13, true, Static189.aClass56_5);
		}
		Static253.method3677();
		Static424.method5891();
		Static20.method473();
		@Pc(387) boolean local387 = false;
		if (Static582.aClass33_13.method8127() && Static124.aClass4_Sub20_4.aClass8_Sub12_1.method4650() == 2) {
			for (local270 = 0; local270 < Static352.aByteArrayArray21.length; local270++) {
				if (Static8.aByteArrayArray1[local270] != null || Static661.aByteArrayArray28[local270] != null) {
					local387 = true;
					break;
				}
			}
		}
		if (Static124.aClass4_Sub20_4.aClass8_Sub25_1.method7779() == 1) {
			local270 = Static264.anIntArray308[Static564.anInt8656];
		} else {
			local270 = Static98.anIntArray137[Static564.anInt8656];
		}
		if (Static582.aClass33_13.method8108()) {
			local270++;
		}
		Static329.method4554(Static582.aClass33_13, Static75.anInt1617, Static224.anInt3557, Static267.anInt4309, local270, local387, Static582.aClass33_13.method8086() > 0);
		Static109.method2086(Static294.anInt4648);
		if (Static294.anInt4648 == 0) {
			Static78.method1627((Class56) null);
		} else {
			Static78.method1627(Static302.aClass56_9);
		}
		for (local281 = 0; local281 < 4; local281++) {
			Static263.aClass389Array1[local281].method8817();
		}
		Static486.method6645();
		Static215.method3217(false);
		Static208.method3121();
		Static234.aBoolean164 = false;
		Static596.aClass332_1 = null;
		Static253.method3677();
		System.gc();
		Static395.method2780(true);
		Static442.method6069();
		Static635.anInt9892 = Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3571();
		Static479.aBoolean597 = Static197.anInt5439 >= 96;
		Static138.aBoolean183 = Static124.aClass4_Sub20_4.aClass8_Sub12_1.method4650() == 2;
		Static471.aBoolean586 = Static124.aClass4_Sub20_4.aClass8_Sub1_1.method177() == 1;
		Static479.anInt7567 = Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 1 ? -1 : Static431.anInt6799;
		Static82.aBoolean649 = Static124.aClass4_Sub20_4.aClass8_Sub6_1.method3083() == 1;
		Static638.aBoolean779 = Static124.aClass4_Sub20_4.aClass8_Sub2_1.method1355() == 1;
		Static378.aClass100_Sub1_2 = new Class100_Sub1(4, Static224.anInt3557, Static267.anInt4309, false);
		if (Static124.anInt2310 == 0) {
			Static615.method8047(Static352.aByteArrayArray21, Static378.aClass100_Sub1_2);
		} else {
			Static634.method8463(Static378.aClass100_Sub1_2, Static352.aByteArrayArray21);
		}
		Static123.method2202(Static224.anInt3557 >> 4, Static267.anInt4309 >> 4);
		Static432.method5963();
		if (local387) {
			Static365.method4835(true);
			Static48.aClass100_Sub1_1 = new Class100_Sub1(1, Static224.anInt3557, Static267.anInt4309, true);
			if (Static124.anInt2310 == 0) {
				Static615.method8047(Static661.aByteArrayArray28, Static48.aClass100_Sub1_1);
				Static395.method2780(true);
			} else {
				Static634.method8463(Static48.aClass100_Sub1_1, Static661.aByteArrayArray28);
				Static395.method2780(true);
			}
			Static48.aClass100_Sub1_1.method2461(Static378.aClass100_Sub1_2.anIntArrayArrayArray9[0]);
			Static48.aClass100_Sub1_1.method2460((int[][][]) null, Static582.aClass33_13, (Class389[]) null);
			Static365.method4835(false);
		}
		Static378.aClass100_Sub1_2.method2460(local387 ? Static48.aClass100_Sub1_1.anIntArrayArrayArray9 : null, Static582.aClass33_13, Static263.aClass389Array1);
		if (Static124.anInt2310 == 0) {
			Static395.method2780(true);
			Static33.method7957(Static315.aByteArrayArray16, Static378.aClass100_Sub1_2);
			if (Static275.aByteArrayArray12 != null) {
				Static376.method4928();
			}
		} else {
			Static395.method2780(true);
			Static444.method6101(Static378.aClass100_Sub1_2, Static315.aByteArrayArray16);
		}
		Static424.method5891();
		if (Static197.anInt5439 < 96) {
			Static96.method1971();
		}
		Static395.method2780(true);
		Static378.aClass100_Sub1_2.method2459(Static582.aClass33_13, (Class42) null, local387 ? Static146.aClass42Array3[0] : null);
		Static378.aClass100_Sub1_2.method2466(Static582.aClass33_13, false);
		Static395.method2780(true);
		if (local387) {
			Static365.method4835(true);
			Static395.method2780(true);
			if (Static124.anInt2310 == 0) {
				Static33.method7957(Static8.aByteArrayArray1, Static48.aClass100_Sub1_1);
			} else {
				Static444.method6101(Static48.aClass100_Sub1_1, Static8.aByteArrayArray1);
			}
			Static424.method5891();
			Static395.method2780(true);
			Static48.aClass100_Sub1_1.method2459(Static582.aClass33_13, Static655.aClass42Array5[0], (Class42) null);
			Static48.aClass100_Sub1_1.method2466(Static582.aClass33_13, true);
			Static395.method2780(true);
			Static365.method4835(false);
		}
		Static620.method7579();
		@Pc(759) int local759 = Static378.aClass100_Sub1_2.anInt2557;
		if (Static296.anInt4684 < local759) {
			local759 = Static296.anInt4684;
		}
		if (local759 < Static296.anInt4684 - 1) {
			local759 = Static296.anInt4684 - 1;
		}
		if (Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 0) {
			Static419.method5759(local759);
		} else {
			Static419.method5759(0);
		}
		@Pc(801) int local801;
		@Pc(805) int local805;
		for (@Pc(797) int local797 = 0; local797 < 4; local797++) {
			for (local801 = 0; local801 < Static224.anInt3557; local801++) {
				for (local805 = 0; local805 < Static267.anInt4309; local805++) {
					Static552.method7370(local801, local797, local805);
				}
			}
		}
		Static115.method2144();
		Static253.method3677();
		Static358.method4777();
		Static424.method5891();
		Static210.method3126();
		@Pc(856) Class4_Sub48 local856;
		if (Static280.aFrame10 != null && Static375.aClass192_2 != null && Static656.anInt10356 == 11) {
			local856 = Static335.method4615(Static473.aClass216_120, Static669.aClass196_2);
			local856.aClass4_Sub11_Sub1_2.method8860(1057001181);
			Static410.method5170(local856);
		}
		if (Static124.anInt2310 == 0) {
			local801 = (Static564.anInt8658 - (Static224.anInt3557 >> 4)) / 8;
			local805 = ((Static224.anInt3557 >> 4) + Static564.anInt8658) / 8;
			@Pc(893) int local893 = (Static390.anInt5705 - (Static267.anInt4309 >> 4)) / 8;
			@Pc(901) int local901 = (Static390.anInt5705 + (Static267.anInt4309 >> 4)) / 8;
			for (@Pc(905) int local905 = local801 - 1; local905 <= local805 + 1; local905++) {
				for (@Pc(911) int local911 = local893 - 1; local911 <= local901 + 1; local911++) {
					if (local801 > local905 || local905 > local805 || local911 < local893 || local911 > local901) {
						Static151.aClass34_38.method1226("m" + local905 + "_" + local911);
						Static151.aClass34_38.method1226("l" + local905 + "_" + local911);
					}
				}
			}
		}
		if (Static656.anInt10356 == 4) {
			Static53.method1256(3);
		} else if (Static656.anInt10356 == 8) {
			Static53.method1256(7);
		} else {
			Static53.method1256(10);
			if (Static375.aClass192_2 != null) {
				local856 = Static335.method4615(Static480.aClass216_121, Static669.aClass196_2);
				Static410.method5170(local856);
			}
		}
		Static284.method4097();
		Static253.method3677();
		Static107.method2077();
		Static42.aBoolean73 = true;
		if (Static222.aBoolean598) {
			method8457("Took: " + (Static429.method5935() - Static637.aLong284) + "ms");
			Static222.aBoolean598 = false;
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)I")
	public static int method8455() {
		return Static106.anInt2134 == 1 ? Static658.anInt10391 : 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8457(@OriginalArg(1) String arg0) {
		if (Static489.aStringArray40 == null) {
			Static482.method6606();
		}
		Static109.aCalendar5.setTime(new Date(Static429.method5935()));
		@Pc(22) int local22 = Static109.aCalendar5.get(11);
		@Pc(26) int local26 = Static109.aCalendar5.get(12);
		@Pc(30) int local30 = Static109.aCalendar5.get(13);
		@Pc(64) String local64 = Integer.toString(local22 / 10) + local22 % 10 + ":" + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
		@Pc(69) String[] local69 = Static189.method2958('\n', arg0);
		for (@Pc(71) int local71 = 0; local71 < local69.length; local71++) {
			for (@Pc(75) int local75 = Static249.anInt4093; local75 > 0; local75--) {
				Static489.aStringArray40[local75] = Static489.aStringArray40[local75 - 1];
			}
			Static489.aStringArray40[0] = local64 + ": " + local69[local71];
			if (Static244.aFileOutputStream1 != null) {
				try {
					Static244.aFileOutputStream1.write(Static500.method6804(Static489.aStringArray40[0] + "\n"));
				} catch (@Pc(121) IOException local121) {
				}
			}
			if (Static489.aStringArray40.length - 1 > Static249.anInt4093) {
				if (Static319.anInt4944 > 0) {
					Static319.anInt4944++;
				}
				Static249.anInt4093++;
			}
		}
	}
}
