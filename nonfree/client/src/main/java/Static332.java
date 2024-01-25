import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
	public static int anInt6360;

	@OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
	public static int anInt6363;

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
	public static int anInt6365;

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
	public static int anInt6357 = 0;

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
	public static int anInt6364 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!jj;B)I")
	public static int method5565(@OriginalArg(0) Class5_Sub3_Sub3 arg0) {
		if (arg0.anInt4935 == 0) {
			return 0;
		}
		@Pc(33) int local33;
		@Pc(40) int local40;
		if (arg0.anInt4964 != -1 && arg0.anInt4964 < 32768) {
			@Pc(24) Class5_Sub3_Sub3_Sub2 local24 = Static169.aClass5_Sub3_Sub3_Sub2Array2[arg0.anInt4964];
			if (local24 != null) {
				local33 = arg0.anInt5050 - local24.anInt5050;
				local40 = arg0.anInt5047 - local24.anInt5047;
				if (local33 != 0 || local40 != 0) {
					arg0.method4527((int) (Math.atan2((double) local33, (double) local40) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(68) int local68;
		if (arg0.anInt4964 >= 32768) {
			local68 = arg0.anInt4964 - 32768;
			if (Static69.anInt1424 == local68) {
				local68 = 2047;
			}
			@Pc(77) Class5_Sub3_Sub3_Sub1 local77 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local68];
			if (local77 != null) {
				local40 = arg0.anInt5050 - local77.anInt5050;
				@Pc(93) int local93 = arg0.anInt5047 - local77.anInt5047;
				if (local40 != 0 || local93 != 0) {
					arg0.method4527((int) (Math.atan2((double) local40, (double) local93) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt4968 != 0 || arg0.anInt4914 != 0) && (arg0.anInt4985 == 0 || arg0.anInt4981 > 0)) {
			local68 = arg0.anInt5050 - (arg0.anInt4968 - Static182.anInt3775 - Static182.anInt3775) * 64;
			local33 = arg0.anInt5047 - (arg0.anInt4914 - Static161.anInt3315 - Static161.anInt3315) * 64;
			if (local68 != 0 || local33 != 0) {
				arg0.method4527((int) (Math.atan2((double) local68, (double) local33) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt4914 = 0;
			arg0.anInt4968 = 0;
		}
		return arg0.method4545();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)V")
	public static void method5566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static211.anInt4208 * arg1 >> 8;
		if (arg0 == -1 && !Static275.aBoolean463) {
			Static217.method3974();
		} else if (arg0 != -1 && (Static43.anInt2906 != arg0 || !Static268.method4682()) && local9 != 0 && !Static275.aBoolean463) {
			Static181.method3546(Static242.aClass165_74, local9, arg0);
		}
		Static43.anInt2906 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)V")
	public static void method5567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= Static106.anInt2157 && Static251.anInt6512 >= arg3 && Static49.anInt1124 <= arg4 && Static291.anInt5657 >= arg1) {
			if (arg0 == 1) {
				Static125.method2400(arg5, arg2, arg3, arg4, arg1);
			} else {
				Static348.method3537(arg3, arg1, arg4, arg5, arg2, arg0);
			}
		} else if (arg0 == 1) {
			Static351.method5673(arg5, arg1, arg3, arg4, arg2);
		} else {
			Static131.method2489(arg0, arg3, arg2, arg4, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	public static void method5568() {
		Static324.aClass165_98.anInt4890 = 1;
		Static242.aClient1.method1068();
		Static262.anInt5079 = 0;
		Static119.aLong83 = 0L;
		Static29.aClass189_1.anInt5570 = 0;
		Static323.aBoolean547 = true;
		Static20.aBoolean41 = true;
		Static235.method4219();
		Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
		Static351.anInt6505 = -1;
		Static187.anInt3893 = -1;
		Static232.aClass1_Sub7_Sub1_4.anInt3368 = 0;
		Static235.anInt4612 = 0;
		Static28.anInt732 = -1;
		Static176.anInt3652 = 0;
		Static322.anInt6152 = -1;
		Static210.anInt4174 = 0;
		for (@Pc(4273) int local4273 = 0; local4273 < Static135.aClass136Array1.length; local4273++) {
			Static135.aClass136Array1[local4273] = null;
		}
		Static270.method4725(0);
		for (@Pc(4295) int local4295 = 0; local4295 < 100; local4295++) {
			Static297.aStringArray41[local4295] = null;
		}
		Static233.anInt4571 = (int) (Math.random() * 110.0D) - 55;
		Static89.aBoolean156 = false;
		Static46.anInt1004 = 0;
		Static252.anInt4857 = (int) (Math.random() * 80.0D) - 40;
		Static352.anInt6534 = (int) (Math.random() * 100.0D) - 50;
		Static243.anInt4739 = 0;
		Static160.anInt3190 = 0;
		Static304.aFloat110 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static311.anInt5996 = (int) (Math.random() * 30.0D) - 20;
		Static277.anInt6206 = (int) (Math.random() * 120.0D) - 60;
		Static234.method4212();
		Static338.anInt6419 = 0;
		Static334.anInt6370 = 0;
		for (@Pc(4366) int local4366 = 0; local4366 < 2048; local4366++) {
			Static254.aClass5_Sub3_Sub3_Sub1Array1[local4366] = null;
			Static30.aClass1_Sub7Array1[local4366] = null;
		}
		for (@Pc(4382) int local4382 = 0; local4382 < 32768; local4382++) {
			Static169.aClass5_Sub3_Sub3_Sub2Array2[local4382] = null;
		}
		Static130.aClass5_Sub3_Sub3_Sub1_1 = Static254.aClass5_Sub3_Sub3_Sub1Array1[2047] = new Class5_Sub3_Sub3_Sub1();
		Static130.aClass5_Sub3_Sub3_Sub1_1.anInt4920 = 2047;
		Static49.aClass195_6.method5032();
		Static294.aClass195_46.method5032();
		Static350.aClass175_8.method4667();
		Static52.aClass26_4.method876();
		Static51.aClass195_44 = new Class195();
		Static30.anInt780 = 0;
		Static290.anInt5612 = 0;
		Static290.method4939();
		Static229.method1640();
		Static132.anInt2569 = 0;
		Static147.anInt2898 = 0;
		Static8.anInt208 = 0;
		Static105.anInt2155 = 0;
		Static231.anInt4532 = 0;
		Static17.anInt380 = 0;
		Static93.anInt1786 = 0;
		Static337.anInt6414 = 0;
		Static164.anInt3419 = 0;
		Static273.anInt5338 = 0;
		for (@Pc(4449) int local4449 = 0; local4449 < Static302.anIntArray607.length; local4449++) {
			if (!Static162.aBooleanArray13[local4449]) {
				Static302.anIntArray607[local4449] = -1;
			}
		}
		if (Static100.anInt2086 != -1) {
			Static300.method5114(Static100.anInt2086);
		}
		for (@Pc(4476) Class1_Sub9 local4476 = (Class1_Sub9) Static348.aClass26_20.method871(); local4476 != null; local4476 = (Class1_Sub9) Static348.aClass26_20.method878()) {
			if (!local4476.method5711()) {
				local4476 = (Class1_Sub9) Static348.aClass26_20.method871();
				if (local4476 == null) {
					break;
				}
			}
			Static125.method2404(local4476, false, true);
		}
		Static100.anInt2086 = -1;
		Static348.aClass26_20 = new Class26(8);
		Static158.method2982();
		Static297.aClass177_20 = null;
		Static253.aClass31_2.method1009(-1, new int[5], null, -1, false);
		for (@Pc(4525) int local4525 = 0; local4525 < 8; local4525++) {
			Static235.aStringArray32[local4525] = null;
			Static306.aBooleanArray29[local4525] = false;
			Static192.anIntArray811[local4525] = -1;
		}
		Static196.method3691();
		Static103.aBoolean181 = true;
		for (@Pc(4551) int local4551 = 0; local4551 < 100; local4551++) {
			Static313.aBooleanArray30[local4551] = true;
		}
		Static23.aClass123Array1 = null;
		Static50.aString40 = null;
		Static229.anInt1684 = 0;
		for (@Pc(4571) int local4571 = 0; local4571 < 6; local4571++) {
			Static24.aClass169Array1[local4571] = new Class169();
		}
		for (@Pc(4585) int local4585 = 0; local4585 < 25; local4585++) {
			Static333.anIntArray595[local4585] = 0;
			Static343.anIntArray624[local4585] = 0;
			Static291.anIntArray712[local4585] = 0;
		}
		Static190.method3667();
		Static272.aBoolean453 = false;
		Static305.aShortArray94 = Static226.aShortArray68 = Static111.aShortArray42 = Static297.aShortArray93 = new short[256];
		Static1.aBoolean13 = true;
		Static331.aString252 = Static219.aString177;
		Static169.anInt4508 = 0;
		Static10.method292();
		Static154.method2925();
		Static324.aClass165_98.anInt4890 = 2;
	}
}
