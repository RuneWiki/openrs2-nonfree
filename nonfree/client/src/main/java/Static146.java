import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Lclient!hf;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
	public static int anInt2805;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString26 = null;

	@OriginalMember(owner = "client!fq", name = "u", descriptor = "[I")
	public static int[] anIntArray128 = new int[2];

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZI)Z")
	public static boolean method2463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "()V")
	public static void method2464() {
		Static456.method6413(Static119.anInt2474);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2465(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static583.method7816(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static549.anInt9183; local25++) {
			@Pc(31) String local31 = Static149.aStringArray3[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static583.method7816(local31);
			if (local31 != null && local31.equals(local20)) {
				Static549.anInt9183--;
				for (@Pc(55) int local55 = local25; local55 < Static549.anInt9183; local55++) {
					Static149.aStringArray3[local55] = Static149.aStringArray3[local55 + 1];
					Static433.aStringArray15[local55] = Static433.aStringArray15[local55 + 1];
					Static314.aStringArray18[local55] = Static314.aStringArray18[local55 + 1];
					Static593.aStringArray42[local55] = Static593.aStringArray42[local55 + 1];
					Static508.aBooleanArray35[local55] = Static508.aBooleanArray35[local55 + 1];
				}
				Static544.anInt9118 = Static259.anInt4739;
				@Pc(114) Class1_Sub9 local114 = Static123.method2194(Static469.aClass235_2, Static331.aClass208_76);
				local114.aClass1_Sub3_Sub1_1.method7917(Static331.method4899(arg0));
				local114.aClass1_Sub3_Sub1_1.method7920(arg0);
				Static42.method746(local114);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method2467() {
		if (Static188.aBoolean269) {
			return;
		}
		Static539.aBoolean676 = true;
		Static188.aBoolean269 = true;
		if (Static86.aClass1_Sub30_Sub1_1.aBoolean485) {
			Static487.aFloat206 = (int) Static487.aFloat206 + 47 & 0xFFFFFFF0;
		} else {
			Static372.aFloat179 += (12.0F - Static372.aFloat179) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)[Lclient!baa;")
	public static Class19[] method2468() {
		if (Static188.aClass19Array1 == null) {
			@Pc(16) Class19[] local16 = Static226.method3367(Static361.aClass198_3);
			@Pc(20) Class19[] local20 = new Class19[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(27) int local27 = Static86.aClass1_Sub30_Sub1_1.method5026(Static286.anInt5239);
			@Pc(93) int local93;
			@Pc(99) Class19 local99;
			label70: for (@Pc(29) int local29 = 0; local29 < local16.length; local29++) {
				@Pc(35) Class19 local35 = local16[local29];
				if ((local35.anInt639 <= 0 || local35.anInt639 >= 24) && local35.anInt637 >= 800 && local35.anInt642 >= 600 && (local27 != 2 || local35.anInt637 <= 800 && local35.anInt642 <= 600) && (local27 != 1 || local35.anInt637 <= 1024 && local35.anInt642 <= 768)) {
					for (local93 = 0; local93 < local22; local93++) {
						local99 = local20[local93];
						if (local35.anInt637 == local99.anInt637 && local35.anInt642 == local99.anInt642) {
							if (local99.anInt639 < local35.anInt639) {
								local20[local93] = local35;
							}
							continue label70;
						}
					}
					local20[local22] = local35;
					local22++;
				}
			}
			Static188.aClass19Array1 = new Class19[local22];
			Static598.method773(local20, 0, Static188.aClass19Array1, 0, local22);
			@Pc(155) int[] local155 = new int[Static188.aClass19Array1.length];
			for (local93 = 0; local93 < Static188.aClass19Array1.length; local93++) {
				local99 = Static188.aClass19Array1[local93];
				local155[local93] = local99.anInt637 * local99.anInt642;
			}
			Static124.method2216(Static188.aClass19Array1, local155);
		}
		return Static188.aClass19Array1;
	}
}
