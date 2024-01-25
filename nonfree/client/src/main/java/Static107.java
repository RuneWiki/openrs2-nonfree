import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!go", name = "z", descriptor = "Lclient!ir;")
	public static Class100 aClass100_45;

	@OriginalMember(owner = "client!go", name = "u", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!go", name = "x", descriptor = "[I")
	public static final int[] anIntArray133 = new int[25];

	@OriginalMember(owner = "client!go", name = "D", descriptor = "I")
	public static int anInt2276 = 0;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(Z)V")
	public static void method1835() {
		while (true) {
			if (Static20.aClass3_Sub4_Sub2_1.method3677(Static306.anInt6046) >= 27) {
				@Pc(18) int local18 = Static20.aClass3_Sub4_Sub2_1.method3681(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static244.aClass5_Sub4_Sub4_Sub2Array1[local18] == null) {
						Static244.aClass5_Sub4_Sub4_Sub2Array1[local18] = new Class5_Sub4_Sub4_Sub2();
						Static244.aClass5_Sub4_Sub4_Sub2Array1[local18].anInt4946 = local18;
						local23 = true;
					}
					@Pc(44) Class5_Sub4_Sub4_Sub2 local44 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local18];
					Static130.anIntArray180[Static42.anInt897++] = local18;
					local44.anInt4921 = Static51.anInt1101;
					if (local44.aClass119_1 != null && local44.aClass119_1.method2881()) {
						Static323.method5292(local44);
					}
					@Pc(73) int local73 = Static147.anIntArray208[Static20.aClass3_Sub4_Sub2_1.method3681(3)];
					@Pc(78) int local78 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
					@Pc(83) int local83 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
					if (local83 == 1) {
						Static303.anIntArray447[Static283.anInt4489++] = local18;
					}
					local44.method4223(Static339.method4911(Static20.aClass3_Sub4_Sub2_1.method3681(14)));
					@Pc(110) int local110 = Static20.aClass3_Sub4_Sub2_1.method3681(5);
					if (local110 > 15) {
						local110 -= 32;
					}
					@Pc(119) int local119 = Static20.aClass3_Sub4_Sub2_1.method3681(5);
					if (local119 > 15) {
						local119 -= 32;
					}
					local44.method4205(local44.aClass119_1.anInt3645);
					local44.anInt4931 = local44.aClass119_1.anInt3659 << 3;
					if (local44.anInt4931 == 0) {
						local44.method4210(0);
					} else if (local23) {
						local44.method4210(local73);
					}
					local44.method4212(local78 == 1, Static163.anInt3184, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0] + local119, local110 + Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local44.method4208());
					if (local44.aClass119_1.method2881()) {
						Static118.method2064(local44.anIntArray404[0], local44, 0, local44.anIntArray405[0], null, Static163.anInt3184, null);
					}
					continue;
				}
			}
			Static20.aClass3_Sub4_Sub2_1.method3680();
			return;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V")
	public static void method1836(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class3_Sub12 local6 = (Class3_Sub12) Static269.aClass127_28.method3402(); local6 != null; local6 = (Class3_Sub12) Static269.aClass127_28.method3400()) {
			if (local6.aClass3_Sub2_Sub3_2 != null) {
				Static273.aClass3_Sub2_Sub2_2.method1367(local6.aClass3_Sub2_Sub3_2);
				local6.aClass3_Sub2_Sub3_2 = null;
			}
			if (local6.aClass3_Sub2_Sub3_1 != null) {
				Static273.aClass3_Sub2_Sub2_2.method1367(local6.aClass3_Sub2_Sub3_1);
				local6.aClass3_Sub2_Sub3_1 = null;
			}
			local6.method5717();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class3_Sub12 local53 = (Class3_Sub12) Static102.aClass127_7.method3402(); local53 != null; local53 = (Class3_Sub12) Static102.aClass127_7.method3400()) {
			if (local53.aClass3_Sub2_Sub3_2 != null) {
				Static273.aClass3_Sub2_Sub2_2.method1367(local53.aClass3_Sub2_Sub3_2);
				local53.aClass3_Sub2_Sub3_2 = null;
			}
			local53.method5717();
		}
		for (@Pc(80) Class3_Sub12 local80 = (Class3_Sub12) Static41.aClass24_2.method595(); local80 != null; local80 = (Class3_Sub12) Static41.aClass24_2.method602()) {
			if (local80.aClass3_Sub2_Sub3_2 != null) {
				Static273.aClass3_Sub2_Sub2_2.method1367(local80.aClass3_Sub2_Sub3_2);
				local80.aClass3_Sub2_Sub3_2 = null;
			}
			local80.method5717();
		}
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(B)V")
	public static void method1838() {
		@Pc(1) Class198 local1 = Static94.aClass198_18;
		synchronized (Static94.aClass198_18) {
			Static94.aClass198_18.method5230();
		}
		local1 = Static164.aClass198_57;
		synchronized (Static164.aClass198_57) {
			Static164.aClass198_57.method5230();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ie;B)V")
	public static void method1839(@OriginalArg(0) Class3_Sub26 arg0) {
		if (arg0 == null || arg0 == Static116.aClass127_12.aClass3_156) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt2737;
		@Pc(18) int local18 = arg0.anInt2736;
		@Pc(21) int local21 = arg0.anInt2734;
		@Pc(25) int local25 = (int) arg0.aLong100;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg0.aLong100;
		if (local21 == 47) {
			Static291.aClass3_Sub4_Sub2_3.method3682(224);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3663(local15);
			Static291.aClass3_Sub4_Sub2_3.method3660(local25);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 19) {
			Static297.anInt5931 = 0;
			Static227.anInt4638 = Static170.anInt6277;
			Static245.anInt4839 = 2;
			Static67.anInt1358 = Static99.anInt2129;
			Static291.aClass3_Sub4_Sub2_3.method3682(103);
			Static291.aClass3_Sub4_Sub2_3.method3634(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3663(local25);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static296.anInt5889 + local18);
			Static200.method3494(local15, local18);
		}
		if (local21 == 15) {
			Static291.aClass3_Sub4_Sub2_3.method3682(175);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3660(local15);
			Static291.aClass3_Sub4_Sub2_3.method3660(local25);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 9) {
			Static67.anInt1358 = Static99.anInt2129;
			Static227.anInt4638 = Static170.anInt6277;
			Static245.anInt4839 = 1;
			Static297.anInt5931 = 0;
			Static291.aClass3_Sub4_Sub2_3.method3682(61);
			Static291.aClass3_Sub4_Sub2_3.method3615(Static203.anInt4169);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3660(local18 + Static296.anInt5889);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static147.anInt2908);
			Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local15, 0, true, local18, -4, 1, 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], 1);
		}
		@Pc(229) Class181 local229;
		if (local21 == 3) {
			Static345.method5626();
			local229 = Static20.method415(local18);
			Static331.anInt6460 = local18;
			Static198.anInt4058 = local25;
			Static235.anInt4719 = 1;
			Static67.anInt1361 = local15;
			Static316.method5250(local229);
			Static200.aString156 = "<col=ff9040>" + Static230.method5537(local25).aString36 + "<col=ffffff>";
			if (Static200.aString156 == null) {
				Static200.aString156 = "null";
			}
			return;
		}
		@Pc(265) Class5_Sub4_Sub4_Sub2 local265;
		if (local21 == 37) {
			local265 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local25];
			if (local265 != null) {
				Static67.anInt1358 = Static99.anInt2129;
				Static227.anInt4638 = Static170.anInt6277;
				Static297.anInt5931 = 0;
				Static245.anInt4839 = 2;
				Static291.aClass3_Sub4_Sub2_3.method3682(68);
				Static291.aClass3_Sub4_Sub2_3.method3635(Static198.anInt4058);
				Static291.aClass3_Sub4_Sub2_3.method3664(Static67.anInt1361);
				Static291.aClass3_Sub4_Sub2_3.method3635(local25);
				Static291.aClass3_Sub4_Sub2_3.method3650(Static331.anInt6460);
				Static291.aClass3_Sub4_Sub2_3.method3634(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local265.anIntArray405[0], 0, true, local265.anIntArray404[0], -2, local265.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local265.method4208());
			}
		}
		@Pc(351) Class5_Sub4_Sub4_Sub1 local351;
		if (local21 == 58) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static67.anInt1358 = Static99.anInt2129;
				Static245.anInt4839 = 2;
				Static297.anInt5931 = 0;
				Static227.anInt4638 = Static170.anInt6277;
				Static291.aClass3_Sub4_Sub2_3.method3682(213);
				Static291.aClass3_Sub4_Sub2_3.method3663(local25);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 1011) {
			Static245.anInt4839 = 2;
			Static67.anInt1358 = Static99.anInt2129;
			Static227.anInt4638 = Static170.anInt6277;
			Static297.anInt5931 = 0;
			Static291.aClass3_Sub4_Sub2_3.method3682(227);
			Static291.aClass3_Sub4_Sub2_3.method3664(local25);
		}
		if (local21 == 38) {
			Static67.anInt1358 = Static99.anInt2129;
			Static245.anInt4839 = 2;
			Static227.anInt4638 = Static170.anInt6277;
			Static297.anInt5931 = 0;
			Static291.aClass3_Sub4_Sub2_3.method3682(177);
			Static291.aClass3_Sub4_Sub2_3.method3660(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static291.aClass3_Sub4_Sub2_3.method3630(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3660(Static296.anInt5889 + local18);
			Static169.method2833(local18, local15, local32);
		}
		if (local21 == 7) {
			Static245.anInt4839 = 2;
			Static67.anInt1358 = Static99.anInt2129;
			Static297.anInt5931 = 0;
			Static227.anInt4638 = Static170.anInt6277;
			Static291.aClass3_Sub4_Sub2_3.method3682(185);
			Static291.aClass3_Sub4_Sub2_3.method3663(local25);
			Static291.aClass3_Sub4_Sub2_3.method3635(local15 + Static186.anInt3094);
			Static291.aClass3_Sub4_Sub2_3.method3664(local18 + Static296.anInt5889);
			Static291.aClass3_Sub4_Sub2_3.method3614(Static192.aBooleanArray19[82] ? 1 : 0);
			Static200.method3494(local15, local18);
		}
		if (local21 == 34) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static67.anInt1358 = Static99.anInt2129;
				Static245.anInt4839 = 2;
				Static227.anInt4638 = Static170.anInt6277;
				Static297.anInt5931 = 0;
				Static291.aClass3_Sub4_Sub2_3.method3682(83);
				Static291.aClass3_Sub4_Sub2_3.method3664(local25);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static291.aClass3_Sub4_Sub2_3.method3664(Static147.anInt2908);
				Static291.aClass3_Sub4_Sub2_3.method3627(Static203.anInt4169);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 12) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static245.anInt4839 = 2;
				Static67.anInt1358 = Static99.anInt2129;
				Static297.anInt5931 = 0;
				Static227.anInt4638 = Static170.anInt6277;
				Static291.aClass3_Sub4_Sub2_3.method3682(138);
				Static291.aClass3_Sub4_Sub2_3.method3663(local25);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 21) {
			Static291.aClass3_Sub4_Sub2_3.method3682(240);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3664(local25);
			Static291.aClass3_Sub4_Sub2_3.method3660(Static198.anInt4058);
			Static291.aClass3_Sub4_Sub2_3.method3664(Static67.anInt1361);
			Static291.aClass3_Sub4_Sub2_3.method3663(local15);
			Static291.aClass3_Sub4_Sub2_3.method3673(Static331.anInt6460);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 48) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static227.anInt4638 = Static170.anInt6277;
				Static245.anInt4839 = 2;
				Static67.anInt1358 = Static99.anInt2129;
				Static297.anInt5931 = 0;
				Static291.aClass3_Sub4_Sub2_3.method3682(93);
				Static291.aClass3_Sub4_Sub2_3.method3635(Static67.anInt1361);
				Static291.aClass3_Sub4_Sub2_3.method3673(Static331.anInt6460);
				Static291.aClass3_Sub4_Sub2_3.method3663(Static198.anInt4058);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static291.aClass3_Sub4_Sub2_3.method3635(local25);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 32) {
			Static67.anInt1358 = Static99.anInt2129;
			Static227.anInt4638 = Static170.anInt6277;
			Static245.anInt4839 = 2;
			Static297.anInt5931 = 0;
			Static291.aClass3_Sub4_Sub2_3.method3682(104);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3634(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3664((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static291.aClass3_Sub4_Sub2_3.method3615(Static331.anInt6460);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static67.anInt1361);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static198.anInt4058);
			Static291.aClass3_Sub4_Sub2_3.method3664(local18 + Static296.anInt5889);
			Static169.method2833(local18, local15, local32);
		}
		if (local21 == 1009) {
			Static245.anInt4839 = 2;
			Static67.anInt1358 = Static99.anInt2129;
			Static227.anInt4638 = Static170.anInt6277;
			Static297.anInt5931 = 0;
			local265 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local25];
			if (local265 != null) {
				@Pc(933) Class119 local933 = local265.aClass119_1;
				if (local933.anIntArray248 != null) {
					local933 = local933.method2882();
				}
				if (local933 != null) {
					Static291.aClass3_Sub4_Sub2_3.method3682(209);
					Static291.aClass3_Sub4_Sub2_3.method3663(local933.anInt3669);
				}
			}
		}
		if (local21 == 49) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static245.anInt4839 = 2;
				Static227.anInt4638 = Static170.anInt6277;
				Static297.anInt5931 = 0;
				Static67.anInt1358 = Static99.anInt2129;
				Static291.aClass3_Sub4_Sub2_3.method3682(76);
				Static291.aClass3_Sub4_Sub2_3.method3635(local25);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 42) {
			local265 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local25];
			if (local265 != null) {
				Static245.anInt4839 = 2;
				Static227.anInt4638 = Static170.anInt6277;
				Static297.anInt5931 = 0;
				Static67.anInt1358 = Static99.anInt2129;
				Static291.aClass3_Sub4_Sub2_3.method3682(205);
				Static291.aClass3_Sub4_Sub2_3.method3664(local25);
				Static291.aClass3_Sub4_Sub2_3.method3630(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local265.anIntArray405[0], 0, true, local265.anIntArray404[0], -2, local265.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local265.method4208());
			}
		}
		if (local21 == 20) {
			local265 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local25];
			if (local265 != null) {
				Static245.anInt4839 = 2;
				Static67.anInt1358 = Static99.anInt2129;
				Static297.anInt5931 = 0;
				Static227.anInt4638 = Static170.anInt6277;
				Static291.aClass3_Sub4_Sub2_3.method3682(171);
				Static291.aClass3_Sub4_Sub2_3.method3635(local25);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local265.anIntArray405[0], 0, true, local265.anIntArray404[0], -2, local265.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local265.method4208());
			}
		}
		if (local21 == 35) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static67.anInt1358 = Static99.anInt2129;
				Static297.anInt5931 = 0;
				Static227.anInt4638 = Static170.anInt6277;
				Static245.anInt4839 = 2;
				Static291.aClass3_Sub4_Sub2_3.method3682(111);
				Static291.aClass3_Sub4_Sub2_3.method3635(local25);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 18) {
			Static297.anInt5931 = 0;
			Static245.anInt4839 = 2;
			Static227.anInt4638 = Static170.anInt6277;
			Static67.anInt1358 = Static99.anInt2129;
			Static291.aClass3_Sub4_Sub2_3.method3682(58);
			Static291.aClass3_Sub4_Sub2_3.method3664(local25);
			Static291.aClass3_Sub4_Sub2_3.method3664(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3614(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static296.anInt5889 + local18);
			Static200.method3494(local15, local18);
		}
		if (local21 == 1) {
			Static291.aClass3_Sub4_Sub2_3.method3682(51);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3663(local15);
			Static291.aClass3_Sub4_Sub2_3.method3664(local25);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 17) {
			Static245.anInt4839 = 2;
			Static297.anInt5931 = 0;
			Static227.anInt4638 = Static170.anInt6277;
			Static67.anInt1358 = Static99.anInt2129;
			Static291.aClass3_Sub4_Sub2_3.method3682(164);
			Static291.aClass3_Sub4_Sub2_3.method3635(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static147.anInt2908);
			Static291.aClass3_Sub4_Sub2_3.method3663(local18 + Static296.anInt5889);
			Static291.aClass3_Sub4_Sub2_3.method3614(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3660(local25);
			Static291.aClass3_Sub4_Sub2_3.method3650(Static203.anInt4169);
			Static200.method3494(local15, local18);
		}
		if (local21 == 10) {
			Static245.anInt4839 = 2;
			Static227.anInt4638 = Static170.anInt6277;
			Static297.anInt5931 = 0;
			Static67.anInt1358 = Static99.anInt2129;
			Static291.aClass3_Sub4_Sub2_3.method3682(63);
			Static291.aClass3_Sub4_Sub2_3.method3664(Static296.anInt5889 + local18);
			Static291.aClass3_Sub4_Sub2_3.method3663(local25);
			Static291.aClass3_Sub4_Sub2_3.method3664(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3630(Static192.aBooleanArray19[82] ? 1 : 0);
			Static200.method3494(local15, local18);
		}
		if (local21 == 33) {
			Static291.aClass3_Sub4_Sub2_3.method3682(44);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3615(Static203.anInt4169);
			Static291.aClass3_Sub4_Sub2_3.method3664(Static147.anInt2908);
			Static291.aClass3_Sub4_Sub2_3.method3664(local15);
			Static291.aClass3_Sub4_Sub2_3.method3660(local25);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 1005) {
			Static67.anInt1358 = Static99.anInt2129;
			Static245.anInt4839 = 2;
			Static227.anInt4638 = Static170.anInt6277;
			Static297.anInt5931 = 0;
			Static291.aClass3_Sub4_Sub2_3.method3682(49);
			Static291.aClass3_Sub4_Sub2_3.method3664(local25);
		}
		@Pc(1551) int local1551;
		if (local21 == 2) {
			Static291.aClass3_Sub4_Sub2_3.method3682(136);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			local229 = Static20.method415(local18);
			if (local229.anIntArrayArray54 != null && local229.anIntArrayArray54[0][0] == 5) {
				local1551 = local229.anIntArrayArray54[0][1];
				Static38.anIntArray55[local1551] = 1 - Static38.anIntArray55[local1551];
				Static231.method3988(local1551);
			}
		}
		if (local21 == 57) {
			local265 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local25];
			if (local265 != null) {
				Static227.anInt4638 = Static170.anInt6277;
				Static67.anInt1358 = Static99.anInt2129;
				Static245.anInt4839 = 2;
				Static297.anInt5931 = 0;
				Static291.aClass3_Sub4_Sub2_3.method3682(114);
				Static291.aClass3_Sub4_Sub2_3.method3663(local25);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local265.anIntArray405[0], 0, true, local265.anIntArray404[0], -2, local265.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local265.method4208());
			}
		}
		if (local21 == 5) {
			Static291.aClass3_Sub4_Sub2_3.method3682(239);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3663(local25);
			Static291.aClass3_Sub4_Sub2_3.method3660(local15);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 44) {
			Static67.anInt1358 = Static99.anInt2129;
			Static297.anInt5931 = 0;
			Static227.anInt4638 = Static170.anInt6277;
			Static245.anInt4839 = 2;
			Static291.aClass3_Sub4_Sub2_3.method3682(48);
			Static291.aClass3_Sub4_Sub2_3.method3664(Static296.anInt5889 + local18);
			Static291.aClass3_Sub4_Sub2_3.method3634(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3663(local15 + Static186.anInt3094);
			Static291.aClass3_Sub4_Sub2_3.method3660(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static169.method2833(local18, local15, local32);
		}
		if (local21 == 16) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static245.anInt4839 = 2;
				Static297.anInt5931 = 0;
				Static67.anInt1358 = Static99.anInt2129;
				Static227.anInt4638 = Static170.anInt6277;
				Static291.aClass3_Sub4_Sub2_3.method3682(128);
				Static291.aClass3_Sub4_Sub2_3.method3635(local25);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 22) {
			local229 = Static20.method415(local18);
			@Pc(1806) boolean local1806 = true;
			if (local229.anInt5755 > 0) {
				local1806 = Static355.method5740(local229);
			}
			if (local1806) {
				Static291.aClass3_Sub4_Sub2_3.method3682(136);
				Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			}
		}
		if (local21 == 8) {
			Static291.aClass3_Sub4_Sub2_3.method3682(89);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3664(local15);
			Static291.aClass3_Sub4_Sub2_3.method3635(local25);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 45) {
			local265 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local25];
			if (local265 != null) {
				Static245.anInt4839 = 2;
				Static227.anInt4638 = Static170.anInt6277;
				Static67.anInt1358 = Static99.anInt2129;
				Static297.anInt5931 = 0;
				Static291.aClass3_Sub4_Sub2_3.method3682(108);
				Static291.aClass3_Sub4_Sub2_3.method3635(local25);
				Static291.aClass3_Sub4_Sub2_3.method3634(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local265.anIntArray405[0], 0, true, local265.anIntArray404[0], -2, local265.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local265.method4208());
			}
		}
		if (local21 == 36) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static245.anInt4839 = 2;
				Static297.anInt5931 = 0;
				Static227.anInt4638 = Static170.anInt6277;
				Static67.anInt1358 = Static99.anInt2129;
				Static291.aClass3_Sub4_Sub2_3.method3682(132);
				Static291.aClass3_Sub4_Sub2_3.method3614(Static192.aBooleanArray19[82] ? 1 : 0);
				Static291.aClass3_Sub4_Sub2_3.method3660(local25);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 39) {
			Static297.anInt5931 = 0;
			Static67.anInt1358 = Static99.anInt2129;
			Static227.anInt4638 = Static170.anInt6277;
			Static245.anInt4839 = 2;
			Static291.aClass3_Sub4_Sub2_3.method3682(118);
			Static291.aClass3_Sub4_Sub2_3.method3664(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3660(local25);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static296.anInt5889 + local18);
			Static200.method3494(local15, local18);
		}
		if (local21 == 4) {
			Static291.aClass3_Sub4_Sub2_3.method3682(200);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3660(local25);
			Static291.aClass3_Sub4_Sub2_3.method3635(local15);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 29) {
			Static297.anInt5931 = 0;
			Static227.anInt4638 = Static170.anInt6277;
			Static67.anInt1358 = Static99.anInt2129;
			Static245.anInt4839 = 2;
			Static291.aClass3_Sub4_Sub2_3.method3682(29);
			Static291.aClass3_Sub4_Sub2_3.method3635(local15 + Static186.anInt3094);
			Static291.aClass3_Sub4_Sub2_3.method3630(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3664(Static296.anInt5889 + local18);
			Static291.aClass3_Sub4_Sub2_3.method3663((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static169.method2833(local18, local15, local32);
		}
		if (local21 == 1003) {
			Static297.anInt5931 = 0;
			Static67.anInt1358 = Static99.anInt2129;
			Static245.anInt4839 = 2;
			Static227.anInt4638 = Static170.anInt6277;
			Static291.aClass3_Sub4_Sub2_3.method3682(243);
			Static291.aClass3_Sub4_Sub2_3.method3660(local15 + Static186.anInt3094);
			Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static296.anInt5889 + local18);
			Static291.aClass3_Sub4_Sub2_3.method3660((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static169.method2833(local18, local15, local32);
		}
		if (local21 == 1002) {
			local229 = Static20.method415(local18);
			if (local229 == null || local229.anIntArray456[local15] < 100000) {
				Static291.aClass3_Sub4_Sub2_3.method3682(49);
				Static291.aClass3_Sub4_Sub2_3.method3664(local25);
			} else {
				Static164.method5307(local229.anIntArray456[local15] + " x " + Static230.method5537(local25).aString36);
			}
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 24) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static297.anInt5931 = 0;
				Static245.anInt4839 = 2;
				Static67.anInt1358 = Static99.anInt2129;
				Static227.anInt4638 = Static170.anInt6277;
				Static291.aClass3_Sub4_Sub2_3.method3682(77);
				Static291.aClass3_Sub4_Sub2_3.method3664(local25);
				Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 28) {
			Static245.anInt4839 = 2;
			Static227.anInt4638 = Static170.anInt6277;
			Static297.anInt5931 = 0;
			Static67.anInt1358 = Static99.anInt2129;
			Static291.aClass3_Sub4_Sub2_3.method3682(79);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3614(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3635((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static291.aClass3_Sub4_Sub2_3.method3635(Static147.anInt2908);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static296.anInt5889 + local18);
			Static291.aClass3_Sub4_Sub2_3.method3673(Static203.anInt4169);
			Static169.method2833(local18, local15, local32);
		}
		if (local21 == 60) {
			Static291.aClass3_Sub4_Sub2_3.method3682(233);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3660(local25);
			Static291.aClass3_Sub4_Sub2_3.method3660(local15);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 1001 || local21 == 1007 || local21 == 1012 || local21 == 1004 || local21 == 1006) {
			Static234.method4370(local15, local21, local25);
		}
		if (local21 == 11) {
			Static333.method5473(false);
		}
		if (local21 == 59 && Static346.aClass181_57 == null) {
			Static27.method577(local15, local18);
			Static346.aClass181_57 = Static214.method3735(local18, local15);
			Static316.method5250(Static346.aClass181_57);
		}
		if (local21 == 31) {
			local265 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local25];
			if (local265 != null) {
				Static245.anInt4839 = 2;
				Static297.anInt5931 = 0;
				Static227.anInt4638 = Static170.anInt6277;
				Static67.anInt1358 = Static99.anInt2129;
				Static291.aClass3_Sub4_Sub2_3.method3682(154);
				Static291.aClass3_Sub4_Sub2_3.method3614(Static192.aBooleanArray19[82] ? 1 : 0);
				Static291.aClass3_Sub4_Sub2_3.method3660(local25);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local265.anIntArray405[0], 0, true, local265.anIntArray404[0], -2, local265.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local265.method4208());
			}
		}
		if (local21 == 41) {
			Static291.aClass3_Sub4_Sub2_3.method3682(167);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3664(local25);
			Static291.aClass3_Sub4_Sub2_3.method3664(local15);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 51) {
			Static291.aClass3_Sub4_Sub2_3.method3682(219);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3615(Static203.anInt4169);
			Static291.aClass3_Sub4_Sub2_3.method3635(local15);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static147.anInt2908);
		}
		if (local21 == 14) {
			if (Static350.anInt6800 > 0 && Static192.aBooleanArray19[82] && Static192.aBooleanArray19[81]) {
				Static12.method220(local18 + Static296.anInt5889, Static163.anInt3184, Static186.anInt3094 + local15);
			} else {
				Static227.anInt4638 = Static170.anInt6277;
				Static245.anInt4839 = 1;
				Static297.anInt5931 = 0;
				Static67.anInt1358 = Static99.anInt2129;
				Static291.aClass3_Sub4_Sub2_3.method3682(245);
				Static291.aClass3_Sub4_Sub2_3.method3663(Static296.anInt5889 + local18);
				Static291.aClass3_Sub4_Sub2_3.method3664(local15 + Static186.anInt3094);
			}
		}
		if (local21 == 30) {
			Static291.aClass3_Sub4_Sub2_3.method3682(41);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3660(local25);
			Static291.aClass3_Sub4_Sub2_3.method3663(local15);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 25) {
			if (Static350.anInt6800 > 0 && Static192.aBooleanArray19[82] && Static192.aBooleanArray19[81]) {
				Static12.method220(local18 + Static296.anInt5889, Static163.anInt3184, Static186.anInt3094 + local15);
			} else {
				Static163.method2598(local15, local18, local25);
				if (local25 == 1) {
					Static291.aClass3_Sub4_Sub2_3.method3614(-1);
					Static291.aClass3_Sub4_Sub2_3.method3614(-1);
					Static291.aClass3_Sub4_Sub2_3.method3660((int) Static57.aFloat3);
					Static291.aClass3_Sub4_Sub2_3.method3614(57);
					Static291.aClass3_Sub4_Sub2_3.method3614(Static42.anInt892);
					Static291.aClass3_Sub4_Sub2_3.method3614(Static12.anInt309);
					Static291.aClass3_Sub4_Sub2_3.method3614(89);
					Static291.aClass3_Sub4_Sub2_3.method3660(Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901);
					Static291.aClass3_Sub4_Sub2_3.method3660(Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905);
					Static291.aClass3_Sub4_Sub2_3.method3614(63);
				} else {
					Static67.anInt1358 = Static99.anInt2129;
					Static227.anInt4638 = Static170.anInt6277;
					Static245.anInt4839 = 1;
					Static297.anInt5931 = 0;
				}
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local15, 0, true, local18, -4, 1, 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], 1);
			}
		}
		if (local21 == 13) {
			Static291.aClass3_Sub4_Sub2_3.method3682(13);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			Static291.aClass3_Sub4_Sub2_3.method3663(local25);
			Static291.aClass3_Sub4_Sub2_3.method3635(local15);
			Static131.anInt2749 = 0;
			Static201.aClass181_37 = Static20.method415(local18);
			Static190.anInt3978 = local15;
		}
		if (local21 == 43) {
			local351 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local25];
			if (local351 != null) {
				Static245.anInt4839 = 2;
				Static67.anInt1358 = Static99.anInt2129;
				Static297.anInt5931 = 0;
				Static227.anInt4638 = Static170.anInt6277;
				Static291.aClass3_Sub4_Sub2_3.method3682(98);
				Static291.aClass3_Sub4_Sub2_3.method3660(local25);
				Static291.aClass3_Sub4_Sub2_3.method3634(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local351.anIntArray405[0], 0, true, local351.anIntArray404[0], -2, local351.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local351.method4208());
			}
		}
		if (local21 == 23) {
			local265 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local25];
			if (local265 != null) {
				Static227.anInt4638 = Static170.anInt6277;
				Static67.anInt1358 = Static99.anInt2129;
				Static297.anInt5931 = 0;
				Static245.anInt4839 = 2;
				Static291.aClass3_Sub4_Sub2_3.method3682(8);
				Static291.aClass3_Sub4_Sub2_3.method3660(local25);
				Static291.aClass3_Sub4_Sub2_3.method3663(Static147.anInt2908);
				Static291.aClass3_Sub4_Sub2_3.method3627(Static203.anInt4169);
				Static291.aClass3_Sub4_Sub2_3.method3630(Static192.aBooleanArray19[82] ? 1 : 0);
				Static240.method4143(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], local265.anIntArray405[0], 0, true, local265.anIntArray404[0], -2, local265.method4208(), 0, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local265.method4208());
			}
		}
		if (local21 == 40) {
			Static297.anInt5931 = 0;
			Static245.anInt4839 = 2;
			Static227.anInt4638 = Static170.anInt6277;
			Static67.anInt1358 = Static99.anInt2129;
			Static291.aClass3_Sub4_Sub2_3.method3682(32);
			Static291.aClass3_Sub4_Sub2_3.method3663(local15 + Static186.anInt3094);
			Static291.aClass3_Sub4_Sub2_3.method3635(local18 + Static296.anInt5889);
			Static291.aClass3_Sub4_Sub2_3.method3663((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static291.aClass3_Sub4_Sub2_3.method3637(Static192.aBooleanArray19[82] ? 1 : 0);
			Static169.method2833(local18, local15, local32);
		}
		if (local21 == 50) {
			local229 = Static214.method3735(local18, local15);
			if (local229 != null) {
				Static345.method5626();
				@Pc(3115) Class3_Sub15 local3115 = Static47.method819(local229);
				Static213.method3733(local15, local3115.method1144(), local229.anInt5726, local18, local3115.anInt1465, local229.anInt5767);
				Static235.anInt4719 = 0;
				Static303.aString199 = Static68.method1085(local229);
				if (Static303.aString199 == null) {
					Static303.aString199 = "Null";
				}
				if (local229.aBoolean381) {
					Static309.aString229 = local229.aString206 + "<col=ffffff>";
					return;
				}
				Static309.aString229 = "<col=00ff00>" + local229.aString204 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 6 || local21 == 1008) {
			Static10.method167(local15, local18, arg0.aString103, local25);
		}
		if (local21 == 46) {
			Static67.anInt1358 = Static99.anInt2129;
			Static245.anInt4839 = 2;
			Static297.anInt5931 = 0;
			Static227.anInt4638 = Static170.anInt6277;
			Static291.aClass3_Sub4_Sub2_3.method3682(19);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static296.anInt5889 + local18);
			Static291.aClass3_Sub4_Sub2_3.method3664(Static67.anInt1361);
			Static291.aClass3_Sub4_Sub2_3.method3634(Static192.aBooleanArray19[82] ? 1 : 0);
			Static291.aClass3_Sub4_Sub2_3.method3615(Static331.anInt6460);
			Static291.aClass3_Sub4_Sub2_3.method3635(Static186.anInt3094 + local15);
			Static291.aClass3_Sub4_Sub2_3.method3663(Static198.anInt4058);
			Static291.aClass3_Sub4_Sub2_3.method3664(local25);
			Static200.method3494(local15, local18);
		}
		if (local21 == 26) {
			Static291.aClass3_Sub4_Sub2_3.method3682(136);
			Static291.aClass3_Sub4_Sub2_3.method3650(local18);
			local229 = Static20.method415(local18);
			if (local229.anIntArrayArray54 != null && local229.anIntArrayArray54[0][0] == 5) {
				local1551 = local229.anIntArrayArray54[0][1];
				if (local229.anIntArray459[0] != Static38.anIntArray55[local1551]) {
					Static38.anIntArray55[local1551] = local229.anIntArray459[0];
					Static231.method3988(local1551);
				}
			}
		}
		if (Static235.anInt4719 != 0) {
			Static235.anInt4719 = 0;
			Static316.method5250(Static20.method415(Static331.anInt6460));
		}
		if (Static155.aBoolean96) {
			Static345.method5626();
		}
		if (Static201.aClass181_37 != null && Static131.anInt2749 == 0) {
			Static316.method5250(Static201.aClass181_37);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIZIIII)V")
	public static void method1840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0 - arg1;
		@Pc(20) int local20 = arg4 - arg1;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg4 * arg4;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(48) int local48 = local24 << 1;
		@Pc(52) int local52 = local36 << 1;
		@Pc(56) int local56 = local32 << 1;
		@Pc(60) int local60 = arg4 << 1;
		@Pc(64) int local64 = local20 << 1;
		@Pc(73) int local73 = local40 + (1 - local60) * local24;
		@Pc(82) int local82 = local28 - (local60 - 1) * local48;
		@Pc(91) int local91 = local52 + local32 * (1 - local64);
		@Pc(100) int local100 = local36 - local56 * (local64 - 1);
		@Pc(104) int local104 = local24 << 2;
		@Pc(108) int local108 = local28 << 2;
		@Pc(112) int local112 = local32 << 2;
		@Pc(116) int local116 = local36 << 2;
		@Pc(120) int local120 = local40 * 3;
		@Pc(126) int local126 = (local60 - 3) * local48;
		@Pc(130) int local130 = local52 * 3;
		@Pc(136) int local136 = local56 * (local64 - 3);
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = local104 * (arg4 - 1);
		@Pc(146) int local146 = local116;
		@Pc(172) int local172;
		@Pc(181) int local181;
		@Pc(190) int local190;
		@Pc(199) int local199;
		if (Static236.anInt4721 <= arg5 && Static73.anInt1425 >= arg5) {
			@Pc(164) int[] local164 = Static196.anIntArrayArray37[arg5];
			local172 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3 - arg0);
			local181 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3 + arg0);
			local190 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3 - local15);
			local199 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3 + local15);
			Static162.method1731(local190, local164, local172, arg6);
			Static162.method1731(local199, local164, local190, arg2);
			Static162.method1731(local181, local164, local199, arg6);
		}
		@Pc(223) int local223 = (local20 - 1) * local112;
		while (local9 > 0) {
			@Pc(236) boolean local236 = local20 >= local9;
			if (local73 < 0) {
				while (local73 < 0) {
					local73 += local120;
					local82 += local138;
					local138 += local108;
					local120 += local108;
					local7++;
				}
			}
			if (local236) {
				if (local91 < 0) {
					while (local91 < 0) {
						local100 += local146;
						local91 += local130;
						local130 += local116;
						local146 += local116;
						local11++;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local91 += local130;
					local146 += local116;
					local130 += local116;
					local11++;
				}
				local100 += -local136;
				local91 += -local223;
				local136 -= local112;
				local223 -= local112;
			}
			if (local82 < 0) {
				local82 += local138;
				local73 += local120;
				local120 += local108;
				local7++;
				local138 += local108;
			}
			local82 += -local126;
			local73 += -local144;
			local126 -= local104;
			local9--;
			local144 -= local104;
			local172 = arg5 - local9;
			local181 = local9 + arg5;
			if (Static236.anInt4721 <= local181 && local172 <= Static73.anInt1425) {
				local190 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3 + local7);
				local199 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3 - local7);
				if (local236) {
					@Pc(419) int local419 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3 + local11);
					@Pc(428) int local428 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3 - local11);
					@Pc(439) int[] local439;
					if (Static236.anInt4721 <= local172) {
						local439 = Static196.anIntArrayArray37[local172];
						Static162.method1731(local428, local439, local199, arg6);
						Static162.method1731(local419, local439, local428, arg2);
						Static162.method1731(local190, local439, local419, arg6);
					}
					if (local181 <= Static73.anInt1425) {
						local439 = Static196.anIntArrayArray37[local181];
						Static162.method1731(local428, local439, local199, arg6);
						Static162.method1731(local419, local439, local428, arg2);
						Static162.method1731(local190, local439, local419, arg6);
					}
				} else {
					if (Static236.anInt4721 <= local172) {
						Static162.method1731(local190, Static196.anIntArrayArray37[local172], local199, arg6);
					}
					if (Static73.anInt1425 >= local181) {
						Static162.method1731(local190, Static196.anIntArrayArray37[local181], local199, arg6);
					}
				}
			}
		}
	}
}
