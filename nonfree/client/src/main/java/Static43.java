import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Lclient!km;")
	public static Class91 aClass91_37;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	public static int anInt890;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	private static int anInt914;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "[Lclient!nb;")
	public static Class108[] aClass108Array2 = new Class108[50];

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
	public static int anInt903 = 20;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	public static void method747() {
		try {
			if (Static299.anInt5641 == 1) {
				@Pc(19) int local19 = Static221.aClass1_Sub5_Sub2_2.method1659();
				if (local19 > 0 && Static221.aClass1_Sub5_Sub2_2.method1640()) {
					local19 -= Static200.anInt4074;
					if (local19 < 0) {
						local19 = 0;
					}
					Static221.aClass1_Sub5_Sub2_2.method1672(local19);
					return;
				}
				Static221.aClass1_Sub5_Sub2_2.method1647();
				Static221.aClass1_Sub5_Sub2_2.method1670();
				Static102.aClass1_Sub16_2 = null;
				if (Static14.aClass91_14 == null) {
					Static299.anInt5641 = 0;
				} else {
					Static299.anInt5641 = 2;
				}
				Static289.aClass109_1 = null;
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static221.aClass1_Sub5_Sub2_2.method1647();
			Static14.aClass91_14 = null;
			Static299.anInt5641 = 0;
			Static289.aClass109_1 = null;
			Static102.aClass1_Sub16_2 = null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)I")
	public static int method748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 >>> 31;
		return (local8 + arg1) / arg0 - local8;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public static void method752() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("maxMemory");
			if (local20 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(32) Long local32 = (Long) local20.invoke(local25, (Object[]) null);
					Static177.anInt3741 = (int) (local32 / 1048576L) + 1;
				} catch (@Pc(42) Throwable local42) {
				}
			}
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
	public static void method757() {
		@Pc(4) Class94 local4 = Static57.aClass94_1;
		synchronized (Static57.aClass94_1) {
			Static61.anInt1302 = Static250.anInt4943;
			Static219.anInt4355++;
			@Pc(23) int local23;
			if (Static141.anInt3035 >= 0) {
				while (Static106.anInt2472 != Static141.anInt3035) {
					local23 = Static233.anIntArray407[Static106.anInt2472];
					Static106.anInt2472 = Static106.anInt2472 + 1 & 0x7F;
					if (local23 >= 0) {
						Static175.aBooleanArray34[local23] = true;
					} else {
						Static175.aBooleanArray34[~local23] = false;
					}
				}
			} else {
				for (local23 = 0; local23 < 112; local23++) {
					Static175.aBooleanArray34[local23] = false;
				}
				Static141.anInt3035 = Static106.anInt2472;
			}
			Static250.anInt4943 = Static252.anInt4959;
		}
	}

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V")
	public static void method759() {
		Static160.method2779(Static84.aClass71_11);
		Static254.anInt4980++;
		if (Static68.aBoolean105 && Static62.aBoolean94) {
			@Pc(26) int local26 = Static224.anInt4445;
			@Pc(29) int local29 = Static84.aClass71_11.anInt2730;
			local26 -= Static9.anInt238;
			@Pc(35) int local35 = Static8.anInt226;
			if (local26 < Static52.anInt1186) {
				local26 = Static52.anInt1186;
			}
			if (Static52.anInt1186 + Static100.aClass71_12.anInt2722 < local26 + Static84.aClass71_11.anInt2722) {
				local26 = Static52.anInt1186 + Static100.aClass71_12.anInt2722 - Static84.aClass71_11.anInt2722;
			}
			local35 -= Static10.anInt245;
			@Pc(72) int local72 = local26 - Static265.anInt5181;
			if (Static142.anInt3049 > local35) {
				local35 = Static142.anInt3049;
			}
			if (Static84.aClass71_11.anInt2698 + local35 > Static142.anInt3049 + Static100.aClass71_12.anInt2698) {
				local35 = Static142.anInt3049 + Static100.aClass71_12.anInt2698 - Static84.aClass71_11.anInt2698;
			}
			@Pc(116) int local116 = Static100.aClass71_12.anInt2652 + local26 - Static52.anInt1186;
			@Pc(120) int local120 = local35 - Static62.anInt1330;
			@Pc(127) int local127 = local35 + Static100.aClass71_12.anInt2646 - Static142.anInt3049;
			if (Static254.anInt4980 > Static84.aClass71_11.anInt2681 && (local72 > local29 || -local29 > local72 || local120 > local29 || local120 < -local29)) {
				Static264.aBoolean389 = true;
			}
			@Pc(164) Class1_Sub14 local164;
			if (Static84.aClass71_11.anObjectArray3 != null && Static264.aBoolean389) {
				local164 = new Class1_Sub14();
				local164.anInt1265 = local116;
				local164.aClass71_8 = Static84.aClass71_11;
				local164.anObjectArray1 = Static84.aClass71_11.anObjectArray3;
				local164.anInt1263 = local127;
				Static188.method3144(local164);
			}
			if (Static66.anInt1384 == 0) {
				if (Static264.aBoolean389) {
					if (Static84.aClass71_11.anObjectArray27 != null) {
						local164 = new Class1_Sub14();
						local164.aClass71_8 = Static84.aClass71_11;
						local164.aClass71_7 = Static29.aClass71_2;
						local164.anInt1265 = local116;
						local164.anInt1263 = local127;
						local164.anObjectArray1 = Static84.aClass71_11.anObjectArray27;
						Static188.method3144(local164);
					}
					if (Static29.aClass71_2 != null && Static36.method766(Static84.aClass71_11) != null) {
						Static283.aClass1_Sub11_Sub1_3.method2697(174);
						Static283.aClass1_Sub11_Sub1_3.method2659(Static84.aClass71_11.anInt2655);
						Static283.aClass1_Sub11_Sub1_3.method2658(Static29.aClass71_2.anInt2655);
						Static283.aClass1_Sub11_Sub1_3.method2640(Static84.aClass71_11.anInt2689);
						Static283.aClass1_Sub11_Sub1_3.method2677(Static29.aClass71_2.anInt2689);
					}
				} else if ((Static1.anInt4243 == 1 || Static102.method1910(Static134.anInt2945 - 1)) && Static134.anInt2945 > 2) {
					Static270.method4085();
				} else if (Static134.anInt2945 > 0) {
					Static193.method3192();
				}
				Static84.aClass71_11 = null;
			}
		} else if (Static254.anInt4980 > 1) {
			Static84.aClass71_11 = null;
		}
	}
}
