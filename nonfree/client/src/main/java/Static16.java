import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	public static int anInt2948;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method2748(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(ILjava/lang/String;)V")
	public static void method2749(@OriginalArg(1) String arg0) {
		Static50.method1093("", 0, 0, "", arg0);
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "(II)V")
	public static void method2769() {
		Static21.aClass103_2.method2679(50);
		Static131.aClass103_26.method2679(50);
		Static128.aClass103_25.method2679(50);
		Static187.aClass103_33.method2679(50);
		Static262.aClass103_50.method2679(50);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2771(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			@Pc(20) char local20 = arg0.charAt(local15);
			if (local20 == '<' || local20 == '>') {
				local8 += 3;
			}
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(local8 + local6);
		for (@Pc(44) int local44 = 0; local44 < local6; local44++) {
			@Pc(49) char local49 = arg0.charAt(local44);
			if (local49 == '<') {
				local42.append("<lt>");
			} else if (local49 == '>') {
				local42.append("<gt>");
			} else {
				local42.append(local49);
			}
		}
		return local42.toString();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!mg;IIIBI)V")
	public static void method2778(@OriginalArg(0) Class7_Sub26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt3939 == -1 && arg0.anIntArray547 == null) {
			return;
		}
		@Pc(22) int local22 = 0;
		if (arg2 > arg0.anInt3938) {
			local22 = arg2 - arg0.anInt3938;
		} else if (arg0.anInt3942 > arg2) {
			local22 = arg0.anInt3942 - arg2;
		}
		@Pc(59) int local59 = Static165.anInt3445 * arg0.anInt3936 >> 8;
		if (arg0.anInt3949 < arg4) {
			local22 += arg4 - arg0.anInt3949;
		} else if (arg4 < arg0.anInt3945) {
			local22 += arg0.anInt3945 - arg4;
		}
		if (arg0.anInt3940 == 0 || local22 - 64 > arg0.anInt3940 || Static165.anInt3445 == 0 || arg1 != arg0.anInt3934) {
			if (arg0.aClass7_Sub8_Sub4_1 != null) {
				Static134.aClass7_Sub8_Sub3_2.method3898(arg0.aClass7_Sub8_Sub4_1);
				arg0.aClass7_Sub8_Sub4_1 = null;
			}
			if (arg0.aClass7_Sub8_Sub4_2 != null) {
				Static134.aClass7_Sub8_Sub3_2.method3898(arg0.aClass7_Sub8_Sub4_2);
				arg0.aClass7_Sub8_Sub4_2 = null;
			}
			return;
		}
		local22 -= 64;
		if (local22 < 0) {
			local22 = 0;
		}
		@Pc(148) int local148 = local59 * (arg0.anInt3940 - local22) / arg0.anInt3940;
		if (arg0.aClass7_Sub8_Sub4_1 != null) {
			arg0.aClass7_Sub8_Sub4_1.method4950(local148);
		} else if (arg0.anInt3939 >= 0) {
			@Pc(166) Class68 local166 = Static359.method1607(Static284.aClass180_77, arg0.anInt3939, 0);
			if (local166 != null) {
				@Pc(173) Class7_Sub20_Sub1 local173 = local166.method1606().method3185(Static292.aClass76_1);
				@Pc(178) Class7_Sub8_Sub4 local178 = Static367.method4955(local173, local148);
				local178.method4947(-1);
				Static134.aClass7_Sub8_Sub3_2.method3895(local178);
				arg0.aClass7_Sub8_Sub4_1 = local178;
			}
		}
		if (arg0.aClass7_Sub8_Sub4_2 != null) {
			arg0.aClass7_Sub8_Sub4_2.method4950(local148);
			if (!arg0.aClass7_Sub8_Sub4_2.method5651()) {
				arg0.aClass7_Sub8_Sub4_2 = null;
			}
		} else if (arg0.anIntArray547 != null && (arg0.anInt3941 -= arg3) <= 0) {
			@Pc(224) int local224 = (int) ((double) arg0.anIntArray547.length * Math.random());
			@Pc(232) Class68 local232 = Static359.method1607(Static284.aClass180_77, arg0.anIntArray547[local224], 0);
			if (local232 != null) {
				@Pc(239) Class7_Sub20_Sub1 local239 = local232.method1606().method3185(Static292.aClass76_1);
				@Pc(244) Class7_Sub8_Sub4 local244 = Static367.method4955(local239, local148);
				local244.method4947(0);
				Static134.aClass7_Sub8_Sub3_2.method3895(local244);
				arg0.aClass7_Sub8_Sub4_2 = local244;
				arg0.anInt3941 = arg0.anInt3943 + (int) (Math.random() * (double) (arg0.anInt3948 - arg0.anInt3943));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILclient!pe;ILclient!pg;I)V")
	public static void method2795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class89 arg3, @OriginalArg(5) Interface6 arg4, @OriginalArg(6) int arg5) {
		if (Static339.anInt6444 < 100) {
			Static320.method5179(arg3, arg4);
		}
		arg3.method5431(arg5, arg1, arg5 + arg0, arg2 + arg1);
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (Static339.anInt6444 < 100) {
			local32 = arg0 / 2 + arg5;
			local42 = arg1 + arg2 / 2 - 18 - 20;
			arg3.method5439(arg5, arg1, arg0, arg2, -16777216, 0);
			arg3.method5481(local32 - 152, local42, 304, 34, Static117.aColorArray2[Static149.anInt3234].getRGB(), 0);
			arg3.method5439(local32 - 150, local42 + 2, Static339.anInt6444 * 3, 30, Static290.aColorArray3[Static149.anInt3234].getRGB(), 0);
			Static149.aClass94_19.method5687(-1, Static251.aString414, Static43.aColorArray1[Static149.anInt3234].getRGB(), local42 + 20, local32);
			return;
		}
		@Pc(103) int local103 = Static244.anInt4835 - (int) ((float) arg0 / Static306.aFloat49);
		local32 = (int) ((float) arg2 / Static306.aFloat49) + Static107.anInt1502;
		local42 = (int) ((float) arg0 / Static306.aFloat49) + Static244.anInt4835;
		Static273.anInt5394 = Static107.anInt1502 - (int) ((float) arg2 / Static306.aFloat49);
		Static211.anInt4222 = Static244.anInt4835 - (int) ((float) arg0 / Static306.aFloat49);
		Static159.anInt3301 = (int) ((float) (arg2 * 2) / Static306.aFloat49);
		Static284.anInt5566 = (int) ((float) (arg0 * 2) / Static306.aFloat49);
		@Pc(161) int local161 = Static107.anInt1502 - (int) ((float) arg2 / Static306.aFloat49);
		Static306.method3067(Static306.anInt3327 + local103, Static306.anInt3329 + local32, Static306.anInt3327 + local42, local161 + Static306.anInt3329, arg5, arg1, arg0 + arg5, arg1 + 1 + arg2);
		Static306.method3062(arg3);
		@Pc(194) Class74 local194 = Static306.method3064(arg3);
		Static277.method4666(arg3, local194);
		if (Static242.anInt3402 > 0) {
			Static320.anInt6132--;
			if (Static320.anInt6132 == 0) {
				Static320.anInt6132 = 20;
				Static242.anInt3402--;
			}
		}
		if (!Static198.aBoolean307) {
			return;
		}
		@Pc(226) int local226 = arg5 + arg0 - 5;
		@Pc(232) int local232 = arg2 + arg1 - 8;
		Static341.aClass94_32.method5678(16776960, local232, local226, "Fps:" + Static5.anInt82);
		@Pc(247) int local247 = local232 - 15;
		@Pc(249) Runtime local249 = Runtime.getRuntime();
		@Pc(259) int local259 = (int) ((local249.totalMemory() - local249.freeMemory()) / 1024L);
		@Pc(261) int local261 = 16776960;
		if (local259 > 65536) {
			local261 = 16711680;
		}
		Static341.aClass94_32.method5678(local261, local247, local226, "Mem:" + local259 + "k");
		local232 = local247 - 15;
	}
}
