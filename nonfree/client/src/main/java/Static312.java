import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray136 = new boolean[5];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	public static void method4992() {
		Static155.aClass98_22.method2565(5);
		Static53.aClass98_48.method2565(5);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V")
	public static void method4993() {
		Static175.aClass98_26.method2565(5);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4995(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static149.anInt2817 >= 100) {
			Static199.method3284(Static268.aString199);
			return;
		}
		@Pc(23) String local23 = Static190.method3179(arg0);
		if (local23 == null) {
			return;
		}
		@Pc(28) int local28;
		@Pc(37) String local37;
		@Pc(66) String local66;
		for (local28 = 0; local28 < Static149.anInt2817; local28++) {
			local37 = Static190.method3179(Static13.aStringArray3[local28]);
			if (local37 != null && local37.equals(local23)) {
				Static199.method3284(arg0 + Static137.aString98);
				return;
			}
			if (Static82.aStringArray15[local28] != null) {
				local66 = Static190.method3179(Static82.aStringArray15[local28]);
				if (local66 != null && local66.equals(local23)) {
					Static199.method3284(arg0 + Static137.aString98);
					return;
				}
			}
		}
		for (local28 = 0; local28 < Static285.anInt5735; local28++) {
			local37 = Static190.method3179(Static286.aStringArray37[local28]);
			if (local37 != null && local37.equals(local23)) {
				Static199.method3284(Static85.aString62 + arg0 + Static158.aString108);
				return;
			}
			if (Static136.aStringArray22[local28] != null) {
				local66 = Static190.method3179(Static136.aStringArray22[local28]);
				if (local66 != null && local66.equals(local23)) {
					Static199.method3284(Static85.aString62 + arg0 + Static158.aString108);
					return;
				}
			}
		}
		if (Static190.method3179(Static136.aClass10_Sub5_Sub1_1.aString124).equals(local23)) {
			Static199.method3284(Static267.aString197);
		} else {
			Static215.aClass3_Sub26_Sub1_2.method3958(177);
			Static215.aClass3_Sub26_Sub1_2.method3907(Static147.method2494(arg0) + 1);
			Static215.aClass3_Sub26_Sub1_2.method3914(arg0);
			Static215.aClass3_Sub26_Sub1_2.method3907(arg1 ? 1 : 0);
		}
	}
}
