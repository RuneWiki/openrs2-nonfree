import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "Lclient!im;")
	public static final Class140 aClass140_132 = new Class140(80, -1);

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "Lclient!im;")
	public static final Class140 aClass140_133 = new Class140(56, -2);

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "[I")
	public static final int[] anIntArray749 = new int[4];

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIILclient!hda;)V")
	public static void method6632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub24 arg2) {
		if (arg2 == null || Static248.aClass37_30.aClass1_47 == arg2) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt3163;
		@Pc(18) int local18 = arg2.anInt3164;
		@Pc(25) int local25 = arg2.anInt3161;
		@Pc(29) int local29 = (int) arg2.aLong150;
		@Pc(32) long local32 = arg2.aLong150;
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		@Pc(47) Class49_Sub2_Sub2_Sub1 local47;
		if (local25 == 13) {
			local47 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static34.anInt785 = arg1;
				Static267.anInt5095 = 2;
				Static456.anInt7775 = 0;
				Static515.anInt8604 = arg0;
				Static144.method2331(Static149.aClass296_134);
				Static455.aClass1_Sub6_Sub2_2.method3959(local29);
				Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static430.method5446(local47.anIntArray428[0], 0, 0, local47.method3788(), local47.anIntArray427[0], local47.method3788(), -2, true);
			}
		}
		if (local25 == 5) {
			local47 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static267.anInt5095 = 2;
				Static34.anInt785 = arg1;
				Static515.anInt8604 = arg0;
				Static456.anInt7775 = 0;
				Static144.method2331(Static141.aClass296_129);
				Static455.aClass1_Sub6_Sub2_2.method3921(Static379.anInt8819);
				Static455.aClass1_Sub6_Sub2_2.method3959(local29);
				Static455.aClass1_Sub6_Sub2_2.method3931(Static48.anInt942);
				Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static455.aClass1_Sub6_Sub2_2.method3921(Static196.anInt3862);
				Static430.method5446(local47.anIntArray428[0], 0, 0, local47.method3788(), local47.anIntArray427[0], local47.method3788(), -2, true);
			}
		}
		if (local25 == 46) {
			Static456.anInt7775 = 0;
			Static34.anInt785 = arg1;
			Static515.anInt8604 = arg0;
			Static267.anInt5095 = 2;
			Static144.method2331(Static433.aClass296_322);
			Static455.aClass1_Sub6_Sub2_2.method3950(local18 + Static534.anInt9007);
			Static455.aClass1_Sub6_Sub2_2.method3919((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3959(local15 + Static470.anInt7897);
			Static315.method4921(local18, local32, local15);
		}
		if (local25 == 58) {
			Static456.anInt7775 = 0;
			Static34.anInt785 = arg1;
			Static267.anInt5095 = 2;
			Static515.anInt8604 = arg0;
			Static144.method2331(Static117.aClass296_104);
			Static455.aClass1_Sub6_Sub2_2.method3950(local15 + Static470.anInt7897);
			Static455.aClass1_Sub6_Sub2_2.method3919(Static534.anInt9007 + local18);
			Static455.aClass1_Sub6_Sub2_2.method3921(local29);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static425.method6221(local15, local18);
		}
		if (local25 == 18 || local25 == 1009) {
			Static362.method5401(local29, local15, local18, arg2.aString35);
		}
		if (local25 == 1011) {
			Static34.anInt785 = arg1;
			Static456.anInt7775 = 0;
			Static267.anInt5095 = 2;
			Static515.anInt8604 = arg0;
			Static144.method2331(Static302.aClass296_242);
			Static455.aClass1_Sub6_Sub2_2.method3959(local18 + Static534.anInt9007);
			Static455.aClass1_Sub6_Sub2_2.method3950(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static455.aClass1_Sub6_Sub2_2.method3938(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3919(Static470.anInt7897 + local15);
			Static315.method4921(local18, local32, local15);
		}
		@Pc(362) Class156 local362;
		if (local25 == 4) {
			local362 = Static518.method7135(local15, local18);
			if (local362 != null) {
				Static387.method5882();
				@Pc(369) Class1_Sub15 local369 = Static67.method1228(local362);
				Static53.method1033(local369.anInt2504, local369.method2103(), local362);
				Static238.aString58 = Static112.method1909(local362);
				if (Static238.aString58 == null) {
					Static238.aString58 = "Null";
				}
				Static170.aString32 = local362.aString44 + "<col=ffffff>";
			}
			return;
		}
		if (local25 == 59) {
			local47 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static515.anInt8604 = arg0;
				Static456.anInt7775 = 0;
				Static34.anInt785 = arg1;
				Static267.anInt5095 = 2;
				Static144.method2331(Static197.aClass296_364);
				Static455.aClass1_Sub6_Sub2_2.method3959(local29);
				Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static430.method5446(local47.anIntArray428[0], 0, 0, local47.method3788(), local47.anIntArray427[0], local47.method3788(), -2, true);
			}
		}
		@Pc(483) Class49_Sub2_Sub2_Sub2 local483;
		@Pc(478) Class1_Sub17 local478;
		if (local25 == 1006) {
			Static515.anInt8604 = arg0;
			Static34.anInt785 = arg1;
			Static267.anInt5095 = 2;
			Static456.anInt7775 = 0;
			local478 = (Class1_Sub17) Static380.aClass17_29.method738((long) local29);
			if (local478 != null) {
				local483 = local478.aClass49_Sub2_Sub2_Sub2_2;
				@Pc(486) Class196 local486 = local483.aClass196_1;
				if (local486.anIntArray570 != null) {
					local486 = local486.method4855(Static251.aClass119_1);
				}
				if (local486 != null) {
					Static144.method2331(Static169.aClass296_155);
					Static455.aClass1_Sub6_Sub2_2.method3919(local486.anInt5720);
				}
			}
		}
		if (local25 == 49) {
			Static456.anInt7775 = 0;
			Static267.anInt5095 = 2;
			Static515.anInt8604 = arg0;
			Static34.anInt785 = arg1;
			Static144.method2331(Static391.aClass296_299);
			Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3921(local15 + Static470.anInt7897);
			Static455.aClass1_Sub6_Sub2_2.method3950(Static534.anInt9007 + local18);
			Static455.aClass1_Sub6_Sub2_2.method3919(local29);
			Static425.method6221(local15, local18);
		}
		if (local25 == 51) {
			local47 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static34.anInt785 = arg1;
				Static456.anInt7775 = 0;
				Static267.anInt5095 = 2;
				Static515.anInt8604 = arg0;
				Static144.method2331(Static226.aClass296_192);
				Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static455.aClass1_Sub6_Sub2_2.method3921(local29);
				Static430.method5446(local47.anIntArray428[0], 0, 0, local47.method3788(), local47.anIntArray427[0], local47.method3788(), -2, true);
			}
		}
		if (local25 == 3 && Static64.aClass156_3 == null) {
			Static99.method1677(local18, local15);
			Static64.aClass156_3 = Static518.method7135(local15, local18);
			Static473.method6593(Static64.aClass156_3);
		}
		if (local25 == 44) {
			local47 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static34.anInt785 = arg1;
				Static267.anInt5095 = 2;
				Static515.anInt8604 = arg0;
				Static456.anInt7775 = 0;
				Static144.method2331(Static523.aClass296_375);
				Static455.aClass1_Sub6_Sub2_2.method3938(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static455.aClass1_Sub6_Sub2_2.method3921(local29);
				Static430.method5446(local47.anIntArray428[0], 0, 0, local47.method3788(), local47.anIntArray427[0], local47.method3788(), -2, true);
			}
		}
		if (local25 == 1004) {
			Static34.anInt785 = arg1;
			Static267.anInt5095 = 2;
			Static456.anInt7775 = 0;
			Static515.anInt8604 = arg0;
			Static144.method2331(Static512.aClass296_367);
			Static455.aClass1_Sub6_Sub2_2.method3919(local29);
		}
		if (local25 == 8) {
			local478 = (Class1_Sub17) Static380.aClass17_29.method738((long) local29);
			if (local478 != null) {
				local483 = local478.aClass49_Sub2_Sub2_Sub2_2;
				Static515.anInt8604 = arg0;
				Static267.anInt5095 = 2;
				Static456.anInt7775 = 0;
				Static34.anInt785 = arg1;
				Static144.method2331(Static495.aClass296_388);
				Static455.aClass1_Sub6_Sub2_2.method3959(local29);
				Static455.aClass1_Sub6_Sub2_2.method3948(Static48.anInt942);
				Static455.aClass1_Sub6_Sub2_2.method3919(Static196.anInt3862);
				Static455.aClass1_Sub6_Sub2_2.method3919(Static379.anInt8819);
				Static455.aClass1_Sub6_Sub2_2.method3937(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static430.method5446(local483.anIntArray428[0], 0, 0, local483.method3788(), local483.anIntArray427[0], local483.method3788(), -2, true);
			}
		}
		if (local25 == 10) {
			Static515.anInt8604 = arg0;
			Static267.anInt5095 = 2;
			Static34.anInt785 = arg1;
			Static456.anInt7775 = 0;
			Static144.method2331(Static41.aClass296_47);
			Static455.aClass1_Sub6_Sub2_2.method3938(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3921(Static534.anInt9007 + local18);
			Static455.aClass1_Sub6_Sub2_2.method3948(Static48.anInt942);
			Static455.aClass1_Sub6_Sub2_2.method3921(local29);
			Static455.aClass1_Sub6_Sub2_2.method3921(local15 + Static470.anInt7897);
			Static455.aClass1_Sub6_Sub2_2.method3959(Static196.anInt3862);
			Static455.aClass1_Sub6_Sub2_2.method3921(Static379.anInt8819);
			Static425.method6221(local15, local18);
		}
		if (local25 == 19) {
			local47 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static456.anInt7775 = 0;
				Static515.anInt8604 = arg0;
				Static34.anInt785 = arg1;
				Static267.anInt5095 = 2;
				Static144.method2331(Static174.aClass296_157);
				Static455.aClass1_Sub6_Sub2_2.method3959(local29);
				Static455.aClass1_Sub6_Sub2_2.method3937(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static430.method5446(local47.anIntArray428[0], 0, 0, local47.method3788(), local47.anIntArray427[0], local47.method3788(), -2, true);
			}
		}
		if (local25 == 20) {
			local478 = (Class1_Sub17) Static380.aClass17_29.method738((long) local29);
			if (local478 != null) {
				Static456.anInt7775 = 0;
				local483 = local478.aClass49_Sub2_Sub2_Sub2_2;
				Static267.anInt5095 = 2;
				Static34.anInt785 = arg1;
				Static515.anInt8604 = arg0;
				Static144.method2331(Static311.aClass296_83);
				Static455.aClass1_Sub6_Sub2_2.method3959(local29);
				Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static430.method5446(local483.anIntArray428[0], 0, 0, local483.method3788(), local483.anIntArray427[0], local483.method3788(), -2, true);
			}
		}
		if (local25 == 6) {
			local478 = (Class1_Sub17) Static380.aClass17_29.method738((long) local29);
			if (local478 != null) {
				local483 = local478.aClass49_Sub2_Sub2_Sub2_2;
				Static267.anInt5095 = 2;
				Static515.anInt8604 = arg0;
				Static456.anInt7775 = 0;
				Static34.anInt785 = arg1;
				Static144.method2331(Static532.aClass296_379);
				Static455.aClass1_Sub6_Sub2_2.method3950(local29);
				Static455.aClass1_Sub6_Sub2_2.method3938(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static430.method5446(local483.anIntArray428[0], 0, 0, local483.method3788(), local483.anIntArray427[0], local483.method3788(), -2, true);
			}
		}
		if (local25 == 60) {
			Static267.anInt5095 = 2;
			Static456.anInt7775 = 0;
			Static34.anInt785 = arg1;
			Static515.anInt8604 = arg0;
			Static144.method2331(Static141.aClass296_129);
			Static455.aClass1_Sub6_Sub2_2.method3921(Static379.anInt8819);
			Static455.aClass1_Sub6_Sub2_2.method3959(Static63.aClass49_Sub2_Sub2_Sub1_1.anInt4295);
			Static455.aClass1_Sub6_Sub2_2.method3931(Static48.anInt942);
			Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3921(Static196.anInt3862);
		}
		if (local25 == 2) {
			local362 = Static518.method7135(local15, local18);
			if (local362 != null) {
				Static362.method5394(local362);
			}
		}
		if (local25 == 1010 || local25 == 1001 || local25 == 1003 || local25 == 1008 || local25 == 1002) {
			Static485.method6636(local29, local25, local15);
		}
		if (local25 == 48) {
			local47 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static267.anInt5095 = 2;
				Static34.anInt785 = arg1;
				Static515.anInt8604 = arg0;
				Static456.anInt7775 = 0;
				Static144.method2331(Static86.aClass296_81);
				Static455.aClass1_Sub6_Sub2_2.method3959(local29);
				Static455.aClass1_Sub6_Sub2_2.method3938(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static430.method5446(local47.anIntArray428[0], 0, 0, local47.method3788(), local47.anIntArray427[0], local47.method3788(), -2, true);
			}
		}
		if (local25 == 15) {
			Static456.anInt7775 = 0;
			Static515.anInt8604 = arg0;
			Static34.anInt785 = arg1;
			Static267.anInt5095 = 2;
			Static144.method2331(Static45.aClass296_49);
			Static455.aClass1_Sub6_Sub2_2.method3959(Static534.anInt9007 + local18);
			Static455.aClass1_Sub6_Sub2_2.method3919((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static455.aClass1_Sub6_Sub2_2.method3921(Static470.anInt7897 + local15);
			Static455.aClass1_Sub6_Sub2_2.method3938(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static315.method4921(local18, local32, local15);
		}
		if (local25 == 25) {
			local47 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static267.anInt5095 = 2;
				Static515.anInt8604 = arg0;
				Static34.anInt785 = arg1;
				Static456.anInt7775 = 0;
				Static144.method2331(Static259.aClass296_215);
				Static455.aClass1_Sub6_Sub2_2.method3937(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static455.aClass1_Sub6_Sub2_2.method3959(local29);
				Static430.method5446(local47.anIntArray428[0], 0, 0, local47.method3788(), local47.anIntArray427[0], local47.method3788(), -2, true);
			}
		}
		if (local25 == 22) {
			Static515.anInt8604 = arg0;
			Static267.anInt5095 = 2;
			Static456.anInt7775 = 0;
			Static34.anInt785 = arg1;
			Static144.method2331(Static89.aClass296_84);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3921(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static455.aClass1_Sub6_Sub2_2.method3959(Static534.anInt9007 + local18);
			Static455.aClass1_Sub6_Sub2_2.method3959(Static196.anInt3862);
			Static455.aClass1_Sub6_Sub2_2.method3966(Static48.anInt942);
			Static455.aClass1_Sub6_Sub2_2.method3959(Static470.anInt7897 + local15);
			Static455.aClass1_Sub6_Sub2_2.method3950(Static379.anInt8819);
			Static315.method4921(local18, local32, local15);
		}
		if (local25 == 45) {
			local47 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static267.anInt5095 = 2;
				Static515.anInt8604 = arg0;
				Static34.anInt785 = arg1;
				Static456.anInt7775 = 0;
				Static144.method2331(Static62.aClass296_63);
				Static455.aClass1_Sub6_Sub2_2.method3919(local29);
				Static455.aClass1_Sub6_Sub2_2.method3952(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static430.method5446(local47.anIntArray428[0], 0, 0, local47.method3788(), local47.anIntArray427[0], local47.method3788(), -2, true);
			}
		}
		if (local25 == 12) {
			Static267.anInt5095 = 2;
			Static456.anInt7775 = 0;
			Static515.anInt8604 = arg0;
			Static34.anInt785 = arg1;
			Static144.method2331(Static18.aClass296_23);
			Static455.aClass1_Sub6_Sub2_2.method3919(Static470.anInt7897 + local15);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3921(Static534.anInt9007 + local18);
			Static455.aClass1_Sub6_Sub2_2.method3950(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static315.method4921(local18, local32, local15);
		}
		if (local25 == 16) {
			local478 = (Class1_Sub17) Static380.aClass17_29.method738((long) local29);
			if (local478 != null) {
				local483 = local478.aClass49_Sub2_Sub2_Sub2_2;
				Static515.anInt8604 = arg0;
				Static456.anInt7775 = 0;
				Static267.anInt5095 = 2;
				Static34.anInt785 = arg1;
				Static144.method2331(Static346.aClass296_277);
				Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static455.aClass1_Sub6_Sub2_2.method3921(local29);
				Static430.method5446(local483.anIntArray428[0], 0, 0, local483.method3788(), local483.anIntArray427[0], local483.method3788(), -2, true);
			}
		}
		if (local25 == 17) {
			Static456.anInt7775 = 0;
			Static267.anInt5095 = 2;
			Static515.anInt8604 = arg0;
			Static34.anInt785 = arg1;
			Static144.method2331(Static202.aClass296_178);
			Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3959(local29);
			Static455.aClass1_Sub6_Sub2_2.method3959(Static534.anInt9007 + local18);
			Static455.aClass1_Sub6_Sub2_2.method3919(local15 + Static470.anInt7897);
			Static425.method6221(local15, local18);
		}
		if (local25 == 11) {
			Static267.anInt5095 = 2;
			Static34.anInt785 = arg1;
			Static456.anInt7775 = 0;
			Static515.anInt8604 = arg0;
			Static144.method2331(Static522.aClass296_374);
			Static455.aClass1_Sub6_Sub2_2.method3959(local18 + Static534.anInt9007);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3950(local29);
			Static455.aClass1_Sub6_Sub2_2.method3959(local15 + Static470.anInt7897);
			Static425.method6221(local15, local18);
		}
		if (local25 == 21) {
			local478 = (Class1_Sub17) Static380.aClass17_29.method738((long) local29);
			if (local478 != null) {
				Static34.anInt785 = arg1;
				Static267.anInt5095 = 2;
				Static456.anInt7775 = 0;
				local483 = local478.aClass49_Sub2_Sub2_Sub2_2;
				Static515.anInt8604 = arg0;
				Static144.method2331(Static233.aClass296_200);
				Static455.aClass1_Sub6_Sub2_2.method3921(local29);
				Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static430.method5446(local483.anIntArray428[0], 0, 0, local483.method3788(), local483.anIntArray427[0], local483.method3788(), -2, true);
			}
		}
		if (local25 == 9) {
			local478 = (Class1_Sub17) Static380.aClass17_29.method738((long) local29);
			if (local478 != null) {
				Static456.anInt7775 = 0;
				Static267.anInt5095 = 2;
				Static515.anInt8604 = arg0;
				local483 = local478.aClass49_Sub2_Sub2_Sub2_2;
				Static34.anInt785 = arg1;
				Static144.method2331(Static242.aClass296_207);
				Static455.aClass1_Sub6_Sub2_2.method3938(Static149.aClass66_1.method1582(82) ? 1 : 0);
				Static455.aClass1_Sub6_Sub2_2.method3950(local29);
				Static430.method5446(local483.anIntArray428[0], 0, 0, local483.method3788(), local483.anIntArray427[0], local483.method3788(), -2, true);
			}
		}
		if (local25 == 57) {
			Static34.anInt785 = arg1;
			Static515.anInt8604 = arg0;
			Static267.anInt5095 = 2;
			Static456.anInt7775 = 0;
			Static144.method2331(Static263.aClass296_217);
			Static455.aClass1_Sub6_Sub2_2.method3938(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3921(local29);
			Static455.aClass1_Sub6_Sub2_2.method3921(local18 + Static534.anInt9007);
			Static455.aClass1_Sub6_Sub2_2.method3919(local15 + Static470.anInt7897);
			Static425.method6221(local15, local18);
		}
		if (local25 == 1012) {
			Static456.anInt7775 = 0;
			Static515.anInt8604 = arg0;
			Static267.anInt5095 = 2;
			Static34.anInt785 = arg1;
			Static144.method2331(Static326.aClass296_257);
			Static455.aClass1_Sub6_Sub2_2.method3919(local29);
		}
		if (local25 == 30) {
			Static267.anInt5095 = 1;
			Static456.anInt7775 = 0;
			Static34.anInt785 = arg1;
			Static515.anInt8604 = arg0;
			Static144.method2331(Static30.aClass296_40);
			Static455.aClass1_Sub6_Sub2_2.method3921(Static470.anInt7897 + local15);
			Static455.aClass1_Sub6_Sub2_2.method3921(Static379.anInt8819);
			Static455.aClass1_Sub6_Sub2_2.method3919(Static196.anInt3862);
			Static455.aClass1_Sub6_Sub2_2.method3919(local18 + Static534.anInt9007);
			Static455.aClass1_Sub6_Sub2_2.method3969(Static48.anInt942);
			Static430.method5446(local15, 0, 0, 1, local18, 1, -4, true);
		}
		if (local25 == 47) {
			if (Static313.anInt5785 > 0 && Static149.aClass66_1.method1582(82) && Static149.aClass66_1.method1582(81)) {
				Static105.method1783(Static470.anInt7897 + local15, local18 + Static534.anInt9007, Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98);
			} else {
				Static34.anInt785 = arg1;
				Static515.anInt8604 = arg0;
				Static456.anInt7775 = 0;
				Static267.anInt5095 = 1;
				Static144.method2331(Static264.aClass296_219);
				Static455.aClass1_Sub6_Sub2_2.method3959(Static470.anInt7897 + local15);
				Static455.aClass1_Sub6_Sub2_2.method3921(local18 + Static534.anInt9007);
			}
		}
		if (local25 == 50) {
			if (Static313.anInt5785 > 0 && Static149.aClass66_1.method1582(82) && Static149.aClass66_1.method1582(81)) {
				Static105.method1783(local15 + Static470.anInt7897, local18 + Static534.anInt9007, Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98);
			} else {
				Static149.method2369(local29, local18, local15);
				if (local29 == 1) {
					Static455.aClass1_Sub6_Sub2_2.method3937(-1);
					Static455.aClass1_Sub6_Sub2_2.method3937(-1);
					Static455.aClass1_Sub6_Sub2_2.method3919((int) Static404.aFloat156);
					Static455.aClass1_Sub6_Sub2_2.method3937(57);
					Static455.aClass1_Sub6_Sub2_2.method3937(Static265.anInt5084);
					Static455.aClass1_Sub6_Sub2_2.method3937(Static316.anInt5814);
					Static455.aClass1_Sub6_Sub2_2.method3937(89);
					Static455.aClass1_Sub6_Sub2_2.method3919(Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137);
					Static455.aClass1_Sub6_Sub2_2.method3919(Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141);
					Static455.aClass1_Sub6_Sub2_2.method3937(63);
				} else {
					Static267.anInt5095 = 1;
					Static515.anInt8604 = arg0;
					Static34.anInt785 = arg1;
					Static456.anInt7775 = 0;
				}
				Static430.method5446(local15, 0, 0, 1, local18, 1, -4, true);
			}
		}
		if (local25 == 23) {
			Static267.anInt5095 = 2;
			Static456.anInt7775 = 0;
			Static34.anInt785 = arg1;
			Static515.anInt8604 = arg0;
			Static144.method2331(Static171.aClass296_156);
			Static455.aClass1_Sub6_Sub2_2.method3919((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static455.aClass1_Sub6_Sub2_2.method3919(Static534.anInt9007 + local18);
			Static455.aClass1_Sub6_Sub2_2.method3957(Static149.aClass66_1.method1582(82) ? 1 : 0);
			Static455.aClass1_Sub6_Sub2_2.method3919(local15 + Static470.anInt7897);
			Static315.method4921(local18, local32, local15);
		}
		if (Static431.aBoolean542) {
			Static387.method5882();
		}
		if (Static159.aClass156_5 != null && Static76.anInt1378 == 0) {
			Static473.method6593(Static159.aClass156_5);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)I")
	public static int method6633() {
		return 2;
	}
}
