import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
	public static int anInt1524;

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
	public static int anInt1533 = -1;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	public static void method1400() {
		Static542.aClass1_Sub23_3 = new Class1_Sub23(Static103.aClass77_6.method1864(Static562.anInt9127), "", Static325.anInt9473, 1007, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1401(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static344.method5101(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static54.anInt1399; local25++) {
			@Pc(31) String local31 = Static568.aStringArray40[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static344.method5101(local31);
			if (local31 != null && local31.equals(local20)) {
				Static54.anInt1399--;
				for (@Pc(55) int local55 = local25; local55 < Static54.anInt1399; local55++) {
					Static568.aStringArray40[local55] = Static568.aStringArray40[local55 + 1];
					Static316.aStringArray25[local55] = Static316.aStringArray25[local55 + 1];
					Static279.aStringArray22[local55] = Static279.aStringArray22[local55 + 1];
					Static68.aStringArray6[local55] = Static68.aStringArray6[local55 + 1];
					Static363.aBooleanArray24[local55] = Static363.aBooleanArray24[local55 + 1];
				}
				Static18.anInt603 = Static274.anInt5077;
				@Pc(112) Class1_Sub48 local112 = Static320.method4867(Static442.aClass170_2, Static553.aClass319_161);
				local112.aClass1_Sub20_Sub1_2.method4378(Static419.method5867(arg0));
				local112.aClass1_Sub20_Sub1_2.method4399(arg0);
				Static34.method813(local112);
				break;
			}
		}
	}
}
