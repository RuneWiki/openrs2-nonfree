import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
	public static int anInt6161;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_221 = new Class214(55, 10);

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "Lclient!pk;")
	public static final Class1_Sub32 aClass1_Sub32_5 = new Class1_Sub32(0, 0);

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "Z")
	public static boolean aBoolean509 = false;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method4740(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static360.anInt5990 >= 100) {
			Static360.method4660(Static265.aClass151_135.method3122(Static188.anInt3028));
			return;
		}
		@Pc(24) String local24 = Static330.method4213(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static360.anInt5990; local29++) {
			@Pc(37) String local37 = Static330.method4213(Static76.aStringArray10[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static360.method4660(arg1 + Static23.aClass151_18.method3122(Static188.anInt3028));
				return;
			}
			if (Static11.aStringArray1[local29] != null) {
				local67 = Static330.method4213(Static11.aStringArray1[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static360.method4660(arg1 + Static23.aClass151_18.method3122(Static188.anInt3028));
					return;
				}
			}
		}
		for (@Pc(93) int local93 = 0; local93 < Static145.anInt2445; local93++) {
			local67 = Static330.method4213(Static108.aStringArray17[local93]);
			if (local67 != null && local67.equals(local24)) {
				Static360.method4660(Static317.aClass151_165.method3122(Static188.anInt3028) + arg1 + Static107.aClass151_61.method3122(Static188.anInt3028));
				return;
			}
			if (Static244.aStringArray29[local93] != null) {
				@Pc(136) String local136 = Static330.method4213(Static244.aStringArray29[local93]);
				if (local136 != null && local136.equals(local24)) {
					Static360.method4660(Static317.aClass151_165.method3122(Static188.anInt3028) + arg1 + Static107.aClass151_61.method3122(Static188.anInt3028));
					return;
				}
			}
		}
		if (Static330.method4213(Static239.aClass20_Sub3_Sub3_Sub1_1.aString48).equals(local24)) {
			Static360.method4660(Static403.aClass151_204.method3122(Static188.anInt3028));
		} else {
			Static5.method94(Static155.aClass137_110);
			Static75.aClass1_Sub11_Sub1_1.method4445(Static221.method2944(arg1) + 1);
			Static75.aClass1_Sub11_Sub1_1.method4453(arg1);
			Static75.aClass1_Sub11_Sub1_1.method4445(arg0 ? 1 : 0);
		}
	}
}
