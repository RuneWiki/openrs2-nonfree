import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!ha;")
	public static Class12 aClass12_2;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!lp;")
	public static Class182 aClass182_5;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public static int anInt3025 = 0;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method2766(@OriginalArg(0) int arg0) {
		@Pc(6) String local6 = Integer.toString(arg0);
		for (@Pc(11) int local11 = local6.length() - 3; local11 > 0; local11 -= 3) {
			local6 = local6.substring(0, local11) + "," + local6.substring(local11);
		}
		if (local6.length() > 9) {
			return " <col=00ff80>" + local6.substring(0, local6.length() - 8) + Static231.aClass114_143.method3330(Static315.anInt5993) + " (" + local6 + ")</col>";
		} else if (local6.length() > 6) {
			return " <col=ffffff>" + local6.substring(0, local6.length() - 4) + Static182.aClass114_81.method3330(Static315.anInt5993) + " (" + local6 + ")</col>";
		} else {
			return " <col=ffff00>" + local6 + "</col>";
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method2767() {
		Static198.anInt4113 = 0;
		@Pc(14) boolean local14 = Static255.aClass1_Sub13_Sub2_2.method3043() == 1;
		@Pc(18) int local18 = Static255.aClass1_Sub13_Sub2_2.method3056();
		@Pc(22) int local22 = Static255.aClass1_Sub13_Sub2_2.method3053();
		@Pc(26) int local26 = Static255.aClass1_Sub13_Sub2_2.method3072();
		Static376.method5720();
		Static265.method4402(local26);
		@Pc(39) int local39 = (Static45.anInt1403 - Static255.aClass1_Sub13_Sub2_2.anInt3400) / 16;
		Static270.anIntArrayArray37 = new int[local39][4];
		@Pc(48) int local48;
		for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
			for (local48 = 0; local48 < 4; local48++) {
				Static270.anIntArrayArray37[local45][local48] = Static255.aClass1_Sub13_Sub2_2.method3037();
			}
		}
		Static130.aByteArrayArray12 = new byte[local39][];
		Static213.anIntArray329 = null;
		Static161.aByteArrayArray15 = new byte[local39][];
		Static419.aByteArrayArray28 = new byte[local39][];
		Static404.anIntArray782 = new int[local39];
		Static467.anIntArray624 = new int[local39];
		Static128.anIntArray247 = new int[local39];
		Static480.anIntArray638 = new int[local39];
		Static540.aByteArrayArray32 = null;
		Static397.aByteArrayArray25 = new byte[local39][];
		Static85.anIntArray178 = new int[local39];
		local39 = 0;
		for (local48 = (local22 - (Static542.anInt9387 >> 4)) / 8; local48 <= ((Static542.anInt9387 >> 4) + local22) / 8; local48++) {
			for (@Pc(126) int local126 = (local18 - (Static36.anInt1324 >> 4)) / 8; local126 <= (local18 + (Static36.anInt1324 >> 4)) / 8; local126++) {
				Static85.anIntArray178[local39] = (local48 << 8) + local126;
				Static128.anIntArray247[local39] = Static350.aClass160_74.method4199("m" + local48 + "_" + local126);
				Static480.anIntArray638[local39] = Static350.aClass160_74.method4199("l" + local48 + "_" + local126);
				Static467.anIntArray624[local39] = Static350.aClass160_74.method4199("um" + local48 + "_" + local126);
				Static404.anIntArray782[local39] = Static350.aClass160_74.method4199("ul" + local48 + "_" + local126);
				local39++;
			}
		}
		Static292.method4920(local18, 10, local22, local14);
	}
}
