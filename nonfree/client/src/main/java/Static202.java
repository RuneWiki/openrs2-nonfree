import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Lclient!ua;")
	public static Class176 aClass176_1;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	public static int anInt3967 = 0;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "[C")
	public static char[] aCharArray30 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZ)V")
	public static void method3344(@OriginalArg(1) boolean arg0) {
		for (@Pc(6) Class3_Sub20 local6 = (Class3_Sub20) Static150.aClass56_9.method1281(); local6 != null; local6 = (Class3_Sub20) Static150.aClass56_9.method1278()) {
			if (local6.aClass3_Sub15_Sub1_3 != null) {
				Static86.aClass3_Sub15_Sub2_1.method2432(local6.aClass3_Sub15_Sub1_3);
				local6.aClass3_Sub15_Sub1_3 = null;
			}
			if (local6.aClass3_Sub15_Sub1_2 != null) {
				Static86.aClass3_Sub15_Sub2_1.method2432(local6.aClass3_Sub15_Sub1_2);
				local6.aClass3_Sub15_Sub1_2 = null;
			}
			local6.method5013();
		}
		if (!arg0) {
			return;
		}
		@Pc(56) Class3_Sub20 local56;
		for (local56 = (Class3_Sub20) Static39.aClass56_4.method1281(); local56 != null; local56 = (Class3_Sub20) Static39.aClass56_4.method1278()) {
			if (local56.aClass3_Sub15_Sub1_3 != null) {
				Static86.aClass3_Sub15_Sub2_1.method2432(local56.aClass3_Sub15_Sub1_3);
				local56.aClass3_Sub15_Sub1_3 = null;
			}
			local56.method5013();
		}
		for (local56 = (Class3_Sub20) Static245.aClass30_32.method664(); local56 != null; local56 = (Class3_Sub20) Static245.aClass30_32.method671()) {
			if (local56.aClass3_Sub15_Sub1_3 != null) {
				Static86.aClass3_Sub15_Sub2_1.method2432(local56.aClass3_Sub15_Sub1_3);
				local56.aClass3_Sub15_Sub1_3 = null;
			}
			local56.method5013();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)V")
	public static void method3346() {
		Static308.aClass98_47.method2565(5);
		Static79.aClass98_13.method2565(5);
		Static248.aClass98_39.method2565(5);
		Static64.aClass98_10.method2565(5);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	public static void method3347() {
		if (Static158.anInt2949 < 0) {
			Static9.anInt187 = -1;
			Static158.anInt2949 = 0;
			Static79.anInt1913 = -1;
		}
		if (Static228.anInt1434 < Static158.anInt2949) {
			Static79.anInt1913 = -1;
			Static158.anInt2949 = Static228.anInt1434;
			Static9.anInt187 = -1;
		}
		if (Static168.anInt3167 < 0) {
			Static168.anInt3167 = 0;
			Static79.anInt1913 = -1;
			Static9.anInt187 = -1;
		}
		if (Static228.anInt1432 < Static168.anInt3167) {
			Static168.anInt3167 = Static228.anInt1432;
			Static9.anInt187 = -1;
			Static79.anInt1913 = -1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
	public static void method3348() {
		Static215.aClass3_Sub26_Sub1_2.method3958(61);
		Static215.aClass3_Sub26_Sub1_2.method3938(Static263.anInt5410);
	}
}
