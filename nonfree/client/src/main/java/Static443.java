import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "[I")
	public static int[] anIntArray607;

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "Lclient!ao;")
	public static Class17 aClass17_38;

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "[I")
	public static final int[] anIntArray609 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIII)I")
	public static int method6717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static51.aClass215Array6 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || Static37.anInt7512 - 1 < local11 || local15 > Static329.anInt6247 - 1) {
			return 0;
		}
		@Pc(40) int local40 = arg2;
		if (arg2 < 3 && (Static387.aByteArrayArrayArray18[1][local11][local15] & 0x2) != 0) {
			local40 = arg2 + 1;
		}
		return Static51.aClass215Array6[local40].aa(arg0, arg1);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6718(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static167.anInt3850 >= 100 && !Static366.aBoolean638 || Static167.anInt3850 >= 200) {
			Static206.method7966(Static32.aClass88_16.method2391(Static345.anInt6495));
			return;
		}
		@Pc(29) String local29 = Static458.method6893(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(34) int local34 = 0; local34 < Static167.anInt3850; local34++) {
			@Pc(44) String local44 = Static458.method6893(Static205.aStringArray24[local34]);
			if (local44 != null && local44.equals(local29)) {
				Static206.method7966(arg0 + Static543.aClass88_204.method2391(Static345.anInt6495));
				return;
			}
			if (Static251.aStringArray28[local34] != null) {
				local76 = Static458.method6893(Static251.aStringArray28[local34]);
				if (local76 != null && local76.equals(local29)) {
					Static206.method7966(arg0 + Static543.aClass88_204.method2391(Static345.anInt6495));
					return;
				}
			}
		}
		for (@Pc(108) int local108 = 0; local108 < Static358.anInt6694; local108++) {
			local76 = Static458.method6893(Static440.aStringArray54[local108]);
			if (local76 != null && local76.equals(local29)) {
				Static206.method7966(Static271.aClass88_150.method2391(Static345.anInt6495) + arg0 + Static150.aClass88_92.method2391(Static345.anInt6495));
				return;
			}
			if (Static540.aStringArray61[local108] != null) {
				@Pc(151) String local151 = Static458.method6893(Static540.aStringArray61[local108]);
				if (local151 != null && local151.equals(local29)) {
					Static206.method7966(Static271.aClass88_150.method2391(Static345.anInt6495) + arg0 + Static150.aClass88_92.method2391(Static345.anInt6495));
					return;
				}
			}
		}
		if (Static458.method6893(Static440.aClass30_Sub1_Sub1_Sub1_2.aString6).equals(local29)) {
			Static206.method7966(Static195.aClass88_115.method2391(Static345.anInt6495));
		} else {
			Static332.method5312(Static154.aClass77_33);
			Static383.aClass12_Sub8_Sub2_1.method5214(Static201.method3811(arg0));
			Static383.aClass12_Sub8_Sub2_1.method5180(arg0);
		}
	}
}
