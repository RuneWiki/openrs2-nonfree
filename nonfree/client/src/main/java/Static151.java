import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "J")
	public static long aLong100;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "[I")
	public static final int[] anIntArray146 = new int[3];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2202(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(11) String local11 = Static531.method7864(arg0);
		if (local11 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static458.anInt7639; local17++) {
			@Pc(22) String local22 = Static292.aStringArray24[local17];
			@Pc(26) String local26 = Static531.method7864(local22);
			if (Static266.method8783(local11, local26, arg0, local22)) {
				Static458.anInt7639--;
				for (@Pc(39) int local39 = local17; local39 < Static458.anInt7639; local39++) {
					Static292.aStringArray24[local39] = Static292.aStringArray24[local39 + 1];
					Static331.aStringArray26[local39] = Static331.aStringArray26[local39 + 1];
					Static466.aStringArray34[local39] = Static466.aStringArray34[local39 + 1];
					Static95.aStringArray12[local39] = Static95.aStringArray12[local39 + 1];
					Static566.aBooleanArray23[local39] = Static566.aBooleanArray23[local39 + 1];
				}
				Static46.anInt767 = Static154.anInt2379;
				@Pc(97) Class347 local97 = Static435.method6495();
				@Pc(103) Class14_Sub54 local103 = Static72.method1195(local97.aClass197_2, Static665.aClass251_273);
				local103.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(arg0));
				local103.aClass14_Sub21_Sub2_2.method7690(arg0);
				local97.method8308(local103);
				return;
			}
		}
	}
}
