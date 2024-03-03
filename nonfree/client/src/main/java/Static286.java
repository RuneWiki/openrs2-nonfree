import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I", line = 4)
	public static int method5278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 21)
	public static void method5279() {
		if (Class97.anInt2592 == -1) {
			return;
		}
		@Pc(20) int local20 = Static210.aClass119_1.method3305();
		@Pc(24) int local24 = Static210.aClass119_1.method3314();
		if (Static345.aClass2_Sub24_1 != null) {
			local20 = Static345.aClass2_Sub24_1.method5244();
			local24 = Static345.aClass2_Sub24_1.method5243();
		}
		Static237.method3928(0, Static161.anInt3295, Static231.anInt4656, 0, 0, local20, Class97.anInt2592, local24, 0);
		if (Static211.aClass161_11 != null) {
			Static12.method280(local20, local24);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 53)
	public static void method5280(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Class2_Sub3_Sub30.anInt5688 >= 100) {
			Static193.method3701(Class215.aClass79_125.method2269(Class197.anInt5569));
			return;
		}
		@Pc(22) String local22 = Static126.method2539(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < Class2_Sub3_Sub30.anInt5688; local27++) {
			@Pc(35) String local35 = Static126.method2539(Class2_Sub3_Sub22.aStringArray35[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static193.method3701(arg0 + Class2_Sub6.aClass79_26.method2269(Class197.anInt5569));
				return;
			}
			if (Class173_Sub4.aStringArray66[local27] != null) {
				local65 = Static126.method2539(Class173_Sub4.aStringArray66[local27]);
				if (local65 != null && local65.equals(local22)) {
					Static193.method3701(arg0 + Class2_Sub6.aClass79_26.method2269(Class197.anInt5569));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Class2_Sub43.anInt7165; local95++) {
			local65 = Static126.method2539(Class12_Sub1_Sub1.aStringArray43[local95]);
			if (local65 != null && local65.equals(local22)) {
				Static193.method3701(Class174.aClass79_107.method2269(Class197.anInt5569) + arg0 + Class87.aClass79_50.method2269(Class197.anInt5569));
				return;
			}
			if (Class214.aStringArray54[local95] != null) {
				@Pc(138) String local138 = Static126.method2539(Class214.aStringArray54[local95]);
				if (local138 != null && local138.equals(local22)) {
					Static193.method3701(Class174.aClass79_107.method2269(Class197.anInt5569) + arg0 + Class87.aClass79_50.method2269(Class197.anInt5569));
					return;
				}
			}
		}
		if (Static126.method2539(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41).equals(local22)) {
			Static193.method3701(Class37_Sub1.aClass79_27.method2269(Class197.anInt5569));
		} else {
			Static85.method1962(Class133.aClass145_139);
			Class14.aClass2_Sub4_Sub2_4.method4843(Static26.method872(arg0) + 1);
			Class14.aClass2_Sub4_Sub2_4.method4823(arg0);
			Class14.aClass2_Sub4_Sub2_4.method4843(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V", line = 147)
	public static void method5281() {
		Class103.anInt2700 = 0;
		Class2_Sub3_Sub31.anInt5832 = -1;
		Class130.anInt6538 = -1;
	}
}
