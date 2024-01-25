import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!oc", name = "rb", descriptor = "I")
	public static int anInt6224;

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "[S")
	private static final short[] aShortArray99 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "[S")
	private static final short[] aShortArray100 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "[S")
	private static final short[] aShortArray102 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!oc", name = "Jb", descriptor = "[S")
	private static final short[] aShortArray104 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!oc", name = "mb", descriptor = "[[S")
	public static final short[][] aShortArrayArray8 = new short[][] { aShortArray99, aShortArray102, aShortArray104, aShortArray100 };

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
	public static void method4995(@OriginalArg(1) long arg0) {
		if (Static292.aClass39ArrayArrayArray2 != null) {
			if (Static340.anInt5707 == 1 || Static340.anInt5707 == 5) {
				Static59.method1047(arg0);
			} else if (Static340.anInt5707 == 4) {
				Static332.method5753(arg0);
			}
		}
		Static375.method5037((long) Static301.anInt5197, Static16.aClass134_1);
		if (Static422.anInt7311 != -1) {
			Static508.method7080(Static422.anInt7311);
		}
		for (@Pc(42) int local42 = 0; local42 < Static367.anInt6098; local42++) {
			if (Static166.aBooleanArray5[local42]) {
				Static544.aBooleanArray24[local42] = true;
			}
			Static504.aBooleanArray14[local42] = Static166.aBooleanArray5[local42];
			Static166.aBooleanArray5[local42] = false;
		}
		Static182.anInt3238 = Static301.anInt5197;
		if (Static422.anInt7311 != -1) {
			Static367.anInt6098 = 0;
			Static102.method1687();
		}
		Static16.aClass134_1.JA();
		Static501.method6995(Static16.aClass134_1);
		@Pc(92) int local92 = Static370.method4989();
		if (local92 == -1) {
			local92 = Static447.anInt7729;
		}
		if (local92 == -1) {
			local92 = Static196.anInt3665;
		}
		Static411.method5664(local92);
		Static55.method1013(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370, Static504.anInt5717, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365);
		Static504.anInt5717 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5002(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static442.method6116(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static281.anInt4916; local29++) {
			@Pc(35) String local35 = Static308.aStringArray24[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static442.method6116(local35);
			if (local35 != null && local35.equals(local20)) {
				Static281.anInt4916--;
				for (@Pc(59) int local59 = local29; local59 < Static281.anInt4916; local59++) {
					Static308.aStringArray24[local59] = Static308.aStringArray24[local59 + 1];
					Static98.aStringArray29[local59] = Static98.aStringArray29[local59 + 1];
					Static448.anIntArray598[local59] = Static448.anIntArray598[local59 + 1];
					Static250.aStringArray22[local59] = Static250.aStringArray22[local59 + 1];
					Static590.anIntArray735[local59] = Static590.anIntArray735[local59 + 1];
					Static305.aBooleanArray9[local59] = Static305.aBooleanArray9[local59 + 1];
				}
				Static498.anInt8553 = Static233.anInt8002;
				@Pc(128) Class1_Sub11 local128 = Static276.method3885(Static73.aClass70_11, Static481.aClass276_2);
				local128.aClass1_Sub35_Sub2_1.method5777(Static358.method4886(arg0));
				local128.aClass1_Sub35_Sub2_1.method5761(arg0);
				Static48.method743(local128);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!qaa;B)I")
	public static int method5014(@OriginalArg(0) Class1_Sub35_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method5806(2);
		@Pc(22) int local22;
		if (local15 == 0) {
			local22 = 0;
		} else if (local15 == 1) {
			local22 = arg0.method5806(5);
		} else if (local15 == 2) {
			local22 = arg0.method5806(8);
		} else {
			local22 = arg0.method5806(11);
		}
		return local22;
	}
}
