import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "[I")
	public static int[] anIntArray434;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Lclient!po;")
	public static final Class202 aClass202_9 = new Class202();

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	public static final int anInt4825 = -1;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4278(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static203.anInt3584 >= 100) {
			Static109.method1805(Static134.aClass231_38.method5138(Static382.anInt6289));
			return;
		}
		@Pc(22) String local22 = Static214.method3328(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(27) int local27 = 0; local27 < Static203.anInt3584; local27++) {
			@Pc(35) String local35 = Static214.method3328(Static411.aStringArray46[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static109.method1805(arg0 + Static283.aClass231_85.method5138(Static382.anInt6289));
				return;
			}
			if (Static371.aStringArray43[local27] != null) {
				local67 = Static214.method3328(Static371.aStringArray43[local27]);
				if (local67 != null && local67.equals(local22)) {
					Static109.method1805(arg0 + Static283.aClass231_85.method5138(Static382.anInt6289));
					return;
				}
			}
		}
		for (@Pc(93) int local93 = 0; local93 < Static165.anInt2940; local93++) {
			local67 = Static214.method3328(Static208.aStringArray24[local93]);
			if (local67 != null && local67.equals(local22)) {
				Static109.method1805(Static441.aClass231_112.method5138(Static382.anInt6289) + arg0 + Static55.aClass231_19.method5138(Static382.anInt6289));
				return;
			}
			if (Static76.aStringArray8[local93] != null) {
				@Pc(136) String local136 = Static214.method3328(Static76.aStringArray8[local93]);
				if (local136 != null && local136.equals(local22)) {
					Static109.method1805(Static441.aClass231_112.method5138(Static382.anInt6289) + arg0 + Static55.aClass231_19.method5138(Static382.anInt6289));
					return;
				}
			}
		}
		if (Static214.method3328(Static134.aClass3_Sub3_Sub6_Sub1_1.aString48).equals(local22)) {
			Static109.method1805(Static301.aClass231_43.method5138(Static382.anInt6289));
		} else {
			Static298.method4373(Static344.aClass25_93);
			Static449.aClass6_Sub15_Sub1_2.method3075(Static384.method5308(arg0) + 1);
			Static449.aClass6_Sub15_Sub1_2.method3094(arg0);
			Static449.aClass6_Sub15_Sub1_2.method3075(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	public static void method4279(@OriginalArg(1) int arg0) {
		Static244.method3777();
		@Pc(11) int local11 = Static91.aClass43_1.method973(arg0).anInt4095;
		if (local11 == 0) {
			return;
		}
		@Pc(20) int local20 = Static71.aClass126_1.anIntArray291[arg0];
		if (local11 == 6) {
			Static23.anInt415 = local20;
		}
		if (local11 == 5) {
			Static112.anInt6364 = local20;
		}
	}
}
