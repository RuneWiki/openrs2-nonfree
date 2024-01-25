import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!am", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "Lclient!dj;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public static int anInt197;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!on;Lclient!on;B)V")
	public static void method200(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		if (arg1.aClass6_247 != null) {
			arg1.method5756();
		}
		arg1.aClass6_247 = arg0.aClass6_247;
		arg1.aClass6_248 = arg0;
		arg1.aClass6_247.aClass6_248 = arg1;
		arg1.aClass6_248.aClass6_247 = arg1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method201(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(14) int local14 = 0; local14 < Static200.anInt3712; local14++) {
			@Pc(22) Class44_Sub4_Sub4_Sub1 local22 = Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local14]];
			if (local22 != null && local22.aString207 != null && local22.aString207.equalsIgnoreCase(arg1)) {
				local7 = true;
				if (arg0 == 1) {
					Static131.aClass6_Sub10_Sub1_2.method2886(31);
					Static131.aClass6_Sub10_Sub1_2.method3978(0);
					Static131.aClass6_Sub10_Sub1_2.method3961(Static183.anIntArray400[local14]);
				} else if (arg0 == 4) {
					Static131.aClass6_Sub10_Sub1_2.method2886(99);
					Static131.aClass6_Sub10_Sub1_2.method3968(0);
					Static131.aClass6_Sub10_Sub1_2.method4020(Static183.anIntArray400[local14]);
				} else if (arg0 == 5) {
					Static131.aClass6_Sub10_Sub1_2.method2886(53);
					Static131.aClass6_Sub10_Sub1_2.method4020(Static183.anIntArray400[local14]);
					Static131.aClass6_Sub10_Sub1_2.method3990(0);
				} else if (arg0 == 6) {
					Static131.aClass6_Sub10_Sub1_2.method2886(178);
					Static131.aClass6_Sub10_Sub1_2.method3968(0);
					Static131.aClass6_Sub10_Sub1_2.method4025(Static183.anIntArray400[local14]);
				} else if (arg0 == 7) {
					Static131.aClass6_Sub10_Sub1_2.method2886(115);
					Static131.aClass6_Sub10_Sub1_2.method3961(Static183.anIntArray400[local14]);
					Static131.aClass6_Sub10_Sub1_2.method3978(0);
				}
				break;
			}
		}
		if (!local7) {
			Static23.method356(Static241.aString274 + arg1);
		}
	}
}
